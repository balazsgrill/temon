/**
 * 
 */
package hu.temon.parser;

import hu.temon.grammar.Rule;
import hu.temon.grammar.Terminal;

import java.util.Collection;

/**
 * @author balazs.grill
 *
 */
public interface IGrammar {

	public Collection<Terminal> terminals();
	
	public Collection<Rule> getRule(String nonTerminal);
	
	public Collection<String> getUsedEClassURIs();
	
}
