/**
 * 
 */
package hu.textualmodeler.parser.impl.earley;

import hu.textualmodeler.grammar.NonTerminalItem;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * @author balazs.grill
 *
 */
public class ParserLevel {

	private final Set<EarleyState> states = new HashSet<EarleyState>();
	private Queue<EarleyState> queue = null;
	
	private final Map<String, List<EarleyState>> predictions = new HashMap<>();
	
	public Set<EarleyState> getStates() {
		return states;
	}
	
	public boolean add(EarleyState state){
		if (!states.contains(state)){
			states.add(state);
			if (state.prediction()){
				String nonterm = ((NonTerminalItem)state.getNextItem()).getNonTerminal();
				List<EarleyState> list = predictions.get(nonterm);
				if (list == null){
					list = new LinkedList<>();
					predictions.put(nonterm, list);
				}
				list.add(state);
			}
			if (queue != null){
				queue.add(state);
			}
			return true;
		}
		return false;
	}

	public Queue<EarleyState> getQueue(){
		if (queue == null) {
			queue = new LinkedList<EarleyState>(states);
		}
		return queue;
	}
	
	public void queueFinished(){
		queue = null;
	}
	
	public Collection<EarleyState> getPredictionStates(String nonterminal){
		List<EarleyState> list = predictions.get(nonterminal);
		return (list == null) ? Collections.<EarleyState>emptyList() : list;
	}
	
}
