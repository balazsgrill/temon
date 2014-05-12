/**
 * 
 */
package hu.temon.parser;

import hu.temon.ast.Node;
import hu.temon.tokens.TokenList;

/**
 * @author balazs.grill
 *
 */
public interface IParser {

	public IGrammar getGrammar();
	
	public Node parse(TokenList tokens, IParserContext context, int start);
	
}
