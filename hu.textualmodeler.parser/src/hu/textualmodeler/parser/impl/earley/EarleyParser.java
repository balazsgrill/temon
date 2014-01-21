/**
 * 
 */
package hu.textualmodeler.parser.impl.earley;

import hu.textualmodeler.ast.Node;
import hu.textualmodeler.grammar.GrammarFactory;
import hu.textualmodeler.grammar.GrammarModel;
import hu.textualmodeler.grammar.NonTerminalItem;
import hu.textualmodeler.grammar.Rule;
import hu.textualmodeler.parser.IGrammar;
import hu.textualmodeler.parser.IParser;
import hu.textualmodeler.parser.IParserContext;
import hu.textualmodeler.parser.errors.ParsingError;
import hu.textualmodeler.parser.impl.Grammar;
import hu.textualmodeler.tokens.TokenList;

import java.util.Collections;
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
	public Node parse(TokenList input,
			IParserContext context, int start) {

		ParserTable table = new ParserTable();
		int currentLevel = 0;
		table.get(currentLevel).add(EarleyState.create(startRule, start));
		
		boolean done = false;
		List<EarleyState> finished = new LinkedList<EarleyState>();
		
		List<EarleyState> failed = new LinkedList<>();
		
		while(!done){
			
			Queue<EarleyState> queue = table.get(currentLevel).getQueue();
			
			if (queue.isEmpty() && finished.isEmpty()){
				Collections.reverse(failed);
				//queue.addAll(failed);
				failed.clear();
			}
			
			done = queue.isEmpty();

			while(!queue.isEmpty()){
				
				EarleyState state = queue.poll();

				System.out.println(state);
				
				if (state.isCompleted()){
					int consumed = state.getPosition();
					
					if (consumed == input.getTokens().size()){
						finished.add(state);
					}else{
						/* Try to recover by consuming terminals after finished AST */
						failed.addAll(state.scanAfterFinish(input, grammar));
					}
				}else
				if (state.prediction()){
					for(EarleyState s : state.predict(currentLevel, grammar)){
						table.get(currentLevel).add(s);
					}
				}else
				if (state.scanning()){			
					EarleyState prescannedState = state.scanHidden(input);
					for(EarleyState s : prescannedState.scan(input, grammar)){
						if (s.lastScanFailed()){
							/* Failed scan. Parsing can recover from here when no other options left */
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
						table.get(currentLevel).add(s);
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
			context.logError(new ParsingError("No valid syntax path could be found.", "", 0, 0));
			return null;
		}else{
			if (finished.size() > 1){
				context.logError(new ParsingError("Input has multiple possible syntax trees (possibly the grammar is ambiguous)", "", 0, 0));
			}
			return finished.get(0).getSteps();
		}
	}

}
