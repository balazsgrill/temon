/**
 * 
 */
package hu.textualmodeler.parser;

import hu.textualmodeler.ast.Node;

/**
 * @author balazs.grill
 *
 */
public interface IParser {

	public IGrammar getGrammar();
	
	public Node parse(IParserInput input, IParserContext context, int start);
	
}
