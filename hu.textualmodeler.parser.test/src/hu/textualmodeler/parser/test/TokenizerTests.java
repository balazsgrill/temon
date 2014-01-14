/**
 * 
 */
package hu.textualmodeler.parser.test;

import hu.textualmodeler.grammar.GrammarModel;
import hu.textualmodeler.parser.IGrammar;
import hu.textualmodeler.parser.IParserContext;
import hu.textualmodeler.parser.grammar.GrammarRegistry;
import hu.textualmodeler.parser.impl.Grammar;
import hu.textualmodeler.parser.tokenizer.SimpleTokenizer;
import hu.textualmodeler.tokens.Token;

import org.junit.Test;

/**
 * @author balazs.grill
 *
 */
public class TokenizerTests {

	private final String testInput1 = 
			"man Adam;\n"
			+ "woman Eve;\n"
			+ "man Abel Adam Eve;\n"
			+ "man Cain Adam Eve;";
	
	private final String testInput2 = 
			"man Adam;\n"
			+ "woman Eve;\n"
			+ "man Abel Adam Eve;\n"
			+ "man Cain Adam;";
	
	@Test
	public void singleTokenize(){
		GrammarModel peopleGrammar = GrammarRegistry.getInstance().getGrammar("people");
		IGrammar grammar = new Grammar(peopleGrammar);
		
		IParserContext context = new StdErrContext();
		
		SimpleTokenizer tokenizer = new SimpleTokenizer(context, grammar);
		
		Token token = tokenizer.update(testInput1);
		
		printToken(token);
	}
	
	@Test
	public void updateTokens1(){
		GrammarModel peopleGrammar = GrammarRegistry.getInstance().getGrammar("people");
		IGrammar grammar = new Grammar(peopleGrammar);
		
		IParserContext context = new StdErrContext();
		
		SimpleTokenizer tokenizer = new SimpleTokenizer(context, grammar);
		
		Token token = tokenizer.update(testInput2);
		System.out.println("=====");
		printToken(token);
		System.out.println("=====");
		
		token = tokenizer.update(testInput1);
		printToken(token);
	}

	private void printToken(Token token){
		Token current = token;
		
		while(current != null){
			if (current.getTerminal() == null){
				System.out.println("EOF");
			}else{
				System.out.println(current.getTerminal().getName()+" \""+current.getValue()+"\"");
			}
			
			current = current.getTail();
		}
	}
	
}
