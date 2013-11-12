/**
 * 
 */
package hu.textualmodeler.parser;

import hu.textualmodeler.ast.WhitespaceNode;
import hu.textualmodeler.grammar.Terminal;

import java.util.List;

/**
 * @author balazs.grill
 *
 */
public interface IParserInput {

	public int length();
	
	public TerminalMatch match(Terminal terminal, int position);
	
	public String substring(int begin, int end);
	
	public List<WhitespaceNode> bypassHidden(int position);
	
	public int[] getLineAndColumn(int position);
	
}
