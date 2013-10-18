/**
 * 
 */
package hu.textualmodeler.parser;

import hu.textualmodeler.grammar.Rule;
import hu.textualmodeler.grammar.Terminal;

import java.util.Collection;

/**
 * @author balazs.grill
 *
 */
public interface IGrammar {

	public Collection<Terminal> terminals();
	
	public Collection<Rule> getRule(String nonTerminal);
	
}
