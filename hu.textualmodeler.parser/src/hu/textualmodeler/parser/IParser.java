/**
 * 
 */
package hu.textualmodeler.parser;

import hu.textualmodeler.ast.Node;
import hu.textualmodeler.tokens.TokenList;

/**
 * @author balazs.grill
 *
 */
public interface IParser {

	public IGrammar getGrammar();
	
	public Node parse(TokenList tokens, IParserContext context, int start);
	
}
