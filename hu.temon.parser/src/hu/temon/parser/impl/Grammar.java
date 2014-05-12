/**
 * 
 */
package hu.temon.parser.impl;

import hu.temon.grammar.GrammarModel;
import hu.temon.grammar.Push;
import hu.temon.grammar.Rule;
import hu.temon.grammar.RuleItem;
import hu.temon.grammar.Terminal;
import hu.temon.parser.IGrammar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * @author balazs.grill
 *
 */
public class Grammar implements IGrammar {

	private final List<Terminal> terminals = new ArrayList<Terminal>();
	private final Map<String, List<Rule>> rules = new LinkedHashMap<String, List<Rule>>();
	
	private void process(GrammarModel syntaxModel){
		for(Terminal terminal : syntaxModel.getTerminals()){
			terminals.add(terminal);
		}
		for(Rule rule : syntaxModel.getRules()){
			String nonterm = rule.getNonTerminal();
			List<Rule> ruleList = rules.get(nonterm);
			if (ruleList == null){
				ruleList = new ArrayList<Rule>();
				rules.put(nonterm, ruleList);
			}
			ruleList.add(rule);
		}
	}

	public Grammar(GrammarModel syntaxModel) {
		Set<GrammarModel> visited = new HashSet<GrammarModel>();
		
		Queue<GrammarModel> queue = new LinkedList<GrammarModel>();
		queue.add(syntaxModel);
		while(!queue.isEmpty()){
			
			GrammarModel sm = queue.poll();
			if (!visited.contains(sm)){
				visited.add(sm);
				process(sm);
				
				queue.addAll(sm.getImport());
			}
			
		}
		
		
	}

	@Override
	public Collection<Terminal> terminals() {
		return terminals;
	}

	@Override
	public Collection<Rule> getRule(String nonTerminal) {
		List<Rule> r = rules.get(nonTerminal);
		return r == null ? Collections.<Rule>emptyList() : r;
	}

	@Override
	public Collection<String> getUsedEClassURIs() {
		List<String> result = new LinkedList<>();
		for(List<Rule> ruleList : rules.values()){
			for(Rule rule : ruleList){
				for(RuleItem ri : rule.getBody()){
					if (ri instanceof Push){
						result.add(((Push) ri).getEclass().getInstanceClass().getCanonicalName());
					}
				}
			}
		}
		return result;
	}

}
