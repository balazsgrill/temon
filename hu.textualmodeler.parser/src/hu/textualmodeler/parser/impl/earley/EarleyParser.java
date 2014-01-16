/**
 * 
 */
package hu.textualmodeler.parser.impl.earley;

import hu.textualmodeler.ast.Node;
import hu.textualmodeler.grammar.GrammarFactory;
import hu.textualmodeler.grammar.GrammarModel;
import hu.textualmodeler.grammar.NonTerminalItem;
import hu.textualmodeler.grammar.Rule;
import hu.textualmodeler.grammar.TerminalItem;
import hu.textualmodeler.parser.IGrammar;
import hu.textualmodeler.parser.IParser;
import hu.textualmodeler.parser.IParserContext;
import hu.textualmodeler.parser.IParserInput;
import hu.textualmodeler.parser.errors.ParsingError;
import hu.textualmodeler.parser.impl.Grammar;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author balazs.grill
 *
 */
public class EarleyParser implements IParser {
	
	private final IGrammar grammar;
	private final Rule startRule;
	
	/**
	 * 
	 */
	public EarleyParser(GrammarModel syntax) {
		//this.grammar = new FlattenedGrammar(syntax);
		this.grammar = new Grammar(syntax);
		startRule = GrammarFactory.eINSTANCE.createRule();
		NonTerminalItem nonterm = GrammarFactory.eINSTANCE.createNonTerminalItem();
		nonterm.setNonTerminal(syntax.getStartItem());
		startRule.getBody().add(nonterm);
	}

	/* (non-Javadoc)
	 * @see hu.modembed.syntax.persistence.IParser#getGrammar()
	 */
	@Override
	public IGrammar getGrammar() {
		return grammar;
	}

	/* (non-Javadoc)
	 * @see hu.modembed.syntax.persistence.IParser#parse(hu.modembed.syntax.persistence.IParserInput, hu.modembed.syntax.persistence.IParserContext, int)
	 */
	@Override
	public Node parse(IParserInput input,
			IParserContext context, int start) {

		ParserTable table = new ParserTable();
		int currentLevel = 0;
		table.get(currentLevel).add(EarleyState.create(startRule, start));
		
		boolean done = false;
		List<EarleyState> finished = new LinkedList<EarleyState>();
		EarleyState best = null;
		
		List<EarleyState> failed = new LinkedList<>();
		
		while(!done){
			
			Queue<EarleyState> queue = table.get(currentLevel).getQueue();
			
			if (queue.isEmpty() && finished.isEmpty()){
				queue.addAll(failed);
				failed.clear();
			}
			
			done = queue.isEmpty();
//			System.out.println("---StartLevel "+currentLevel +" ("+input.length()+")");
			
			while(!queue.isEmpty()){
				
				EarleyState state = queue.poll();
//				System.out.println("Considering: "+ state);
				
//				if (state.hasHidden(input)){
//					table.get(currentLevel).add(state.scanHidden(input));
//				}else
				if (state.isCompleted()){
					int consumed = state.getPosition();
					
					//consumed = input.bypassHidden(consumed);
					if (consumed == input.length()){
						finished.add(state);
					}else{
//						System.out.println("Early finish, dropped: "+consumed);
					}
				}else
				if (state.prediction()){
					for(EarleyState s : state.predict(currentLevel, grammar)){
						table.get(currentLevel).add(s);
					}
				}else
				if (state.scanning()){
					if (best == null){
						best = state;
					}else{
						if (best.getPosition() < state.getPosition()){
							best = state;
						}
					}
					
					EarleyState prescannedState = state.scanHidden(input);
					for(EarleyState s : prescannedState.scan(input, grammar)){
						if (s.lastScanFailed()){
							failed.add(s);
						}else{
							s = s.scanHidden(input);
							int level = (s.getPosition() > state.getPosition()) ? 1 : 0;
							table.get(currentLevel+level).add(s);
						}
					}
				}else
				if (state.completion()){
					for(EarleyState s : state.complete(table)){
						if (!table.get(currentLevel).add(s)){
							// TODO how to handle ambiguousity?
//							int[] lc = input.getLineAndColumn(state.getPosition());
//							context.logError(new ParsingError("Ambiguous syntax path detected: "+state+" -> "+s, "", lc[0], lc[1]));
						}
					}
				}else
				if (state.silent()){
					EarleyState s = state.consumeSilent();
					if (s != null) {
						table.get(currentLevel).add(s);
					}
				}
				
			}
			table.get(currentLevel).queueFinished();
			currentLevel++;
			
		}
		
		if (finished.isEmpty()){
			if (best != null){
				int[] lc = input.getLineAndColumn(best.getPosition());
				TerminalItem ti = (TerminalItem)best.getNextItem();
				context.logError(new ParsingError(ti.getTerminal().getName()+" is expected at "+lc[0]+":"+lc[1], "", lc[0], lc[1]));
				return best.getSteps();
			}
			return null;
		}else{
			return finished.get(0).getSteps();
		}
	}

}
