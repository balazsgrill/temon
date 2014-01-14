/**
 * 
 */
package hu.textualmodeler.parser.tokenizer;

import hu.textualmodeler.ast.WhitespaceNode;
import hu.textualmodeler.grammar.Terminal;
import hu.textualmodeler.parser.IGrammar;
import hu.textualmodeler.parser.IParserContext;
import hu.textualmodeler.parser.TerminalMatch;
import hu.textualmodeler.parser.impl.StringInput;
import hu.textualmodeler.tokens.Token;
import hu.textualmodeler.tokens.TokensFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.databinding.observable.Diffs;
import org.eclipse.core.databinding.observable.list.ListDiff;
import org.eclipse.core.databinding.observable.list.ListDiffEntry;

/**
 * @author balazs.grill
 *
 */
public class SimpleTokenizer {
	
	private Token token;
	private List<Terminal> terminalList = null;
	
	private final Collection<Terminal> terminals;
	
	private final IParserContext context;
	
	/**
	 * 
	 */
	public SimpleTokenizer(IParserContext context, IGrammar grammar) {
		terminals = grammar.terminals();
		this.context = context;
		this.token = null;
	}
	
	public Token getToken() {
		return token;
	}
	
	public Token update(String input){
		List<TerminalMatch> matches = internalScan(input);
		
		List<Terminal> newList = produceList(matches);
		if (terminalList == null){
			token = produceToken(matches);
		}else{
			ListDiff diff = Diffs.computeListDiff(terminalList, newList);
			for(ListDiffEntry entry : diff.getDifferences()){
				applyChange(entry);
			}
			applyValues(matches);
		}
		
		terminalList = newList;
		
		return getToken();
	}
	
	private void applyValues(List<TerminalMatch> matches){
		Token current = token;
		
		for(TerminalMatch tm : matches){
			if(!current.getTerminal().equals(tm.terminal)){
				context.logError(new IllegalArgumentException("Tokenizer error! This should never happen"));
			}else{
				current.setValue(tm.getProcessedValue());
			}
			
			current = current.getTail();
		}
	}
	
	private Token getToken(int index){
		Token current = token;
		
		for(int i=0;i<index;i++){
			if (current == null) return null;
			current = current.getTail();	
		}
		
		return current;
	}
	
	private void applyChange(ListDiffEntry entry){
		int index = entry.getPosition();
		Token parent = index == 0 ? null : getToken(index-1);
		Token next = parent == null ? token : parent.getTail();
		if (entry.isAddition()){
			
			Token n = TokensFactory.eINSTANCE.createToken();
			n.setTerminal((Terminal)entry.getElement());
			if (parent == null){
				token = n;
			}else{
				parent.setTail(n);
			}
			n.setTail(next);
			
		}else{
			
			if (parent == null){
				token = next.getTail();
			}else{
				parent.setTail(next.getTail());
			}
			
		}
		
		
	}
	
	private List<Terminal> produceList(List<TerminalMatch> matches){
		List<Terminal> list = new ArrayList<>(matches.size());
		
		for(TerminalMatch tm : matches){
			list.add(tm.terminal);
		}
		
		return list;
	}

	private List<TerminalMatch> internalScan(String s){
		StringInput input = new StringInput(s, terminals, context);
		List<TerminalMatch> matches = new LinkedList<>();
		int index = 0;
		while(index < input.length()){
			
			for(WhitespaceNode wsn : input.bypassHidden(index)){
				index += wsn.getLength();
			}
			
			TerminalMatch longest = null;
			for(Terminal t : terminals) if (!t.isHide()){
				TerminalMatch tm = input.match(t, index);
				if (tm != null){
					if (longest == null){
						longest = tm;
					}else{
						longest = (longest.terminal.getPriority() < tm.terminal.getPriority()) ? tm : longest;
					}
				}
			}
			
			if (longest != null){
				matches.add(longest);
				index += longest.size;
			}else{
				int[] lc = input.getLineAndColumn(index);
				context.logError(new IllegalArgumentException("Invalid token at "+lc[0]+":"+lc[1]));
				index++;
			}
		}
		
		return matches;
	}
	
	private Token produceToken(List<TerminalMatch> matches){
		Token first = null;
		Token current = null;
		
		for(TerminalMatch tm : matches) {
			Token next = TokensFactory.eINSTANCE.createToken();
			next.setTerminal(tm.terminal);
			next.setValue(tm.getProcessedValue());
			
			if (current == null){
				first = next;
			}else{
				current.setTail(next);
			}
			current = next;
		}
		
		//Add EOF
		Token eof = TokensFactory.eINSTANCE.createToken();
		current.setTail(eof);
		
		return first;
	}
	
}
