/**
 * 
 */
package hu.temon.parser;

import hu.temon.ast.WhitespaceNode;
import hu.temon.grammar.Terminal;
import hu.temon.parser.impl.TerminalMatch;

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
