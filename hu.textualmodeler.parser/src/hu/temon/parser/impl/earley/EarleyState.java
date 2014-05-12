/**
 * 
 */
package hu.temon.parser.impl.earley;

import hu.temon.ast.AstFactory;
import hu.temon.ast.CompositeNode;
import hu.temon.ast.WhitespaceNode;
import hu.temon.grammar.NonTerminalItem;
import hu.temon.grammar.Pop;
import hu.temon.grammar.Push;
import hu.temon.grammar.Rule;
import hu.temon.grammar.RuleItem;
import hu.temon.grammar.SetValue;
import hu.temon.grammar.SyntaxItem;
import hu.temon.grammar.Terminal;
import hu.temon.grammar.TerminalItem;
import hu.temon.parser.IGrammar;
import hu.temon.parser.IParserInput;
import hu.temon.parser.impl.AppendedList;
import hu.temon.parser.impl.earley.map.NonTerminalMapping;
import hu.temon.parser.impl.earley.map.ParseMapping;
import hu.temon.parser.impl.earley.map.TokenMapping;
import hu.temon.tokens.Token;
import hu.temon.tokens.TokenList;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * @author balazs.grill
 *
 */
public class EarleyState {
	
	private final Rule currentRule;
	/* Current position in rule*/
	private final int index;
	
	/* Current position in input */
	private final int position;
	private final List<ParseMapping<?>> mappings;
	private final int origin;
	
	public static EarleyState create(Rule startRule, int startPosition){
		return new EarleyState(startRule, 0, startPosition, Collections.<ParseMapping<?>>emptyList(), -1);
	}
	
	@Override
	public int hashCode() {
		return currentRule.hashCode() + index + position;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof EarleyState){
			EarleyState other = (EarleyState)obj;
			if (other.position != position) return false;
			if (other.index != index) return false;
			if (!currentRule.equals(other.currentRule)) return false;
			return other.origin == origin;
		}
		return super.equals(obj);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		sb.append(position);
		sb.append(":");
		sb.append(origin);
		sb.append("] ");
		int index = 0;
		for(RuleItem item : currentRule.getBody()){
			if (index == this.index){
				sb.append("@ ");
			}
			if (item instanceof NonTerminalItem){
				sb.append("<");sb.append(((NonTerminalItem) item).getNonTerminal());sb.append("> ");
			}
			if (item instanceof TerminalItem){
				Terminal term = ((TerminalItem) item).getTerminal();
				if (term == null){
					sb.append("[UNKNOWN TERMINAL]");
				}else{
					sb.append(term.getName());
				}
				sb.append(" ");
			}
			if (item instanceof Push){
				sb.append("{ ");
			}
			if (item instanceof Pop){
				sb.append("} ");
			}
			if (item instanceof SetValue){
				sb.append("#SETVALUE# ");
			}
			index++;
		}
		if (this.index == currentRule.getBody().size()){
			sb.append("@");
		}
		return sb.toString();
	}
	
	/**
	 * 
	 */
	private EarleyState(Rule currentRule, int index, int position, List<ParseMapping<?>> mappings, int origin) {
		this.currentRule = currentRule;
		
		this.index = index;
		this.position = position;
		this.mappings = mappings;
		this.origin = origin;
	}
	
	public boolean silent(){
		return isSilent(nextItem(currentRule, index));
	}
	
	public EarleyState consumeSilent(){
		if (silent()){
			
			RuleItem item = getNextItem();
			ParseMapping<?> mapping = ParseMapping.create(item);
			return new EarleyState(currentRule, index+1, position, new AppendedList<ParseMapping<?>>(this.mappings, mapping), origin);
		}
		return null;
	}
	
	private static boolean isSilent(RuleItem item){
		return (item != null) && !(item instanceof SyntaxItem);
	}
	
	public Rule getCurrentRule() {
		return currentRule;
	}
	
	public int getIndex() {
		return index;
	}
	
	public int getPosition() {
		return position;
	}
	
	public void fillNode(CompositeNode node){
		node.setNonterminal(currentRule);
		
		for(ParseMapping<?> m : mappings){
			node.getChildren().add(m.toAST());
		}
	}
	
	public CompositeNode getSteps() {
		CompositeNode node = AstFactory.eINSTANCE.createCompositeNode();
		fillNode(node);
		return node;
	}
	
	public int getOrigin() {
		return origin;
	}

	private static RuleItem nextItem(Rule rule, int index){
		final EList<RuleItem> body = rule.getBody();
		if (body.size() > index){
			return body.get(index);
		}
		return null;
	}
	
	public RuleItem getNextItem(){
		return nextItem(currentRule, index);
	}
	
	public boolean prediction(){
		return getNextItem() instanceof NonTerminalItem;
	}
	
	public boolean completion(){
		return getNextItem() == null;
	}
	
	public boolean scanning(){
		return getNextItem() instanceof TerminalItem;
	}
	
	public List<EarleyState> predict(int level, IGrammar grammar){
		RuleItem next = getNextItem();
		if (next instanceof NonTerminalItem){
			NonTerminalItem nonterm = (NonTerminalItem)next;
			
			List<EarleyState> predicted = new LinkedList<EarleyState>();
			
			if (nonterm.isOptional()){
				/* Skip prediction */
				predicted.add(new EarleyState(currentRule, index+1, position, mappings, origin));
			}
			
			Collection<Rule> rules = grammar.getRule(((NonTerminalItem) next).getNonTerminal());
			
			for(Rule rule : rules){
				predicted.add(new EarleyState(rule, 0, position, Collections.<ParseMapping<?>>emptyList(), level));
			}
			return predicted;
		}
		return Collections.emptyList();
	}
	
	public List<EarleyState> complete(ParserTable table){
		if (completion() && origin != -1){
			List<EarleyState> completions = new LinkedList<EarleyState>();
			ParserLevel originLevel = table.get(origin);
			
			for(EarleyState p : originLevel.getPredictionStates(currentRule.getNonTerminal())){
				NonTerminalItem nonterm = (NonTerminalItem) p.getNextItem();
				NonTerminalMapping mapping = ParseMapping.create(nonterm, this);
				List<ParseMapping<?>> mappings = new AppendedList<ParseMapping<?>>(p.mappings, mapping);

				completions.add(new EarleyState(p.getCurrentRule(), p.index+1, position, mappings, p.origin));
				if (nonterm.isMany()){
					completions.add(new EarleyState(p.getCurrentRule(), p.index, position, mappings, p.origin));
				}

			}
			
			return completions;
		}
		return Collections.emptyList();
	}
	
	public boolean isCompleted(){
		return completion() && origin == -1;
	}
	
	public boolean hasHidden(IParserInput input){
		return !input.bypassHidden(position).isEmpty();
	}
	
	public EarleyState scanHidden(TokenList input){
		List<WhitespaceNode> hiddenNodes = new LinkedList<>();
		int i = position;
		while(input.getTokens().size() > i && input.getTokens().get(i).getTerminal().isHide()){
			Token t = input.getTokens().get(i);
			WhitespaceNode wsn = AstFactory.eINSTANCE.createWhitespaceNode();
			wsn.setStart(t.getStart());
			wsn.setLength(t.getLength());
			wsn.setTerminal(t.getTerminal());
			hiddenNodes.add(wsn);
			i++;
		}
		if (!hiddenNodes.isEmpty()){
			int position = this.position + hiddenNodes.size();
			return new EarleyState(currentRule, index, position, mappings, origin);
		}
		
		return this;
	}
	
	private static boolean isMatch(Terminal match, Terminal next){
		if (match.equals(next)) return true;
		Terminal sup = match.getSuperTerminal();
		if (sup != null){
			return isMatch(sup, next);
		}
		return false;
	}
	
	public List<EarleyState> scan(TokenList input, IGrammar grammar){
		if (scanning()){
			RuleItem item = getNextItem();
			
			if (item instanceof TerminalItem){
				TerminalItem terminal = (TerminalItem)item;
				
				int position = this.position;
						
				List<EarleyState> states = new LinkedList<EarleyState>();

				Token match = input.getTokens().size() > position ? input.getTokens().get(position) : null;
				if (match != null){
					if (isMatch(match.getTerminal(), terminal.getTerminal())){

						TokenMapping mapping = ParseMapping.create(terminal, match);
						List<ParseMapping<?>> mappings = new AppendedList<ParseMapping<?>>(this.mappings, mapping);

						states.add(new EarleyState(currentRule, index+1, position+1, mappings, origin));
						if (terminal.isMany()){
							states.add(new EarleyState(currentRule, index, position+1, mappings, origin));
						}

					}else{
						if (terminal.isOptional()){
							states.add(new EarleyState(currentRule, index+1, position, mappings, origin));
						}else{

							// Correction attempt: Remove unexpected terminal
							Token wrongMatch = match;
							if (wrongMatch != null){
								ParseMapping<?> mapping = ParseMapping.removedToken(wrongMatch); 
								List<ParseMapping<?>> mappings = new AppendedList<ParseMapping<?>>(this.mappings, mapping);

								states.add(new EarleyState(currentRule, index, position+1, mappings, origin));
							}

							// Correction attempt: Insert expected terminal
							ParseMapping<?> mapping = ParseMapping.missingTerminal(terminal); 
							List<ParseMapping<?>> mappings = new AppendedList<ParseMapping<?>>(this.mappings, mapping);

							states.add(new EarleyState(currentRule, index+1, position, mappings, origin));
						}
					}
				}
				return states;
			}
		}
		return Collections.emptyList();
	}
	
	public List<EarleyState> scanAfterFinish(TokenList input, IGrammar grammar){
		// Correction attempt: Remove unexpected terminal
		List<EarleyState> states = new LinkedList<>();
		
		Token wrongMatch = input.getTokens().get(position);
		if (wrongMatch != null){
			ParseMapping<?> mapping = ParseMapping.removedToken(wrongMatch);
			List<ParseMapping<?>> mappings = new AppendedList<ParseMapping<?>>(this.mappings, mapping);
			
			states.add(new EarleyState(currentRule, index, position+1, mappings, origin));
		}
		
		return states;
	}
	
	public boolean lastScanFailed(){
		if (!mappings.isEmpty()){
			ParseMapping<?> lastNode = mappings.get(mappings.size()-1); 
			return lastNode.isTokenListModification();
		}
		return false;
	}
	
}
