/**
 * 
 */
package hu.textualmodeler.parser.grammar;

import hu.textualmodeler.grammar.GrammarModel;
import hu.textualmodeler.grammar.Terminal;
import hu.textualmodeler.parser.scope.IFeatureScope;
import hu.textualmodeler.parser.scope.IScopeElement;
import hu.textualmodeler.parser.scope.SimpleScopeElement;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @author balazs.grill
 *
 */
public class TerminalScope implements IFeatureScope {

	private final String filter;
	private final GrammarModel[] grammarModels;
	
	private final Set<GrammarModel> visited;
	
	/**
	 * 
	 */
	private TerminalScope(String filter, Set<GrammarModel> visited, GrammarModel...grammarModels) {
		this.filter = filter;
		this.grammarModels = grammarModels;
		this.visited = visited;
		for(GrammarModel gm : grammarModels){
			visited.add(gm);
		}
	}
	
	public TerminalScope(String filter, GrammarModel...grammarModels) {
		this(filter, new HashSet<GrammarModel>(), grammarModels);
	}

	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.scope.IFeatureScope#getLocalElements()
	 */
	@Override
	public Collection<IScopeElement> getLocalElements() {
		List<IScopeElement> elements = new LinkedList<>();
		for(GrammarModel grammar : grammarModels){
			for(Terminal t : grammar.getTerminals()){
				if (t.getName().startsWith(filter)){
					elements.add(new SimpleScopeElement(t.getName(), t));
				}
			}
		}
		return elements;
	}

	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.scope.IFeatureScope#parentScope()
	 */
	@Override
	public IFeatureScope parentScope() {
		Set<GrammarModel> imported = new LinkedHashSet<>();
		for(GrammarModel grammar : grammarModels){
			imported.addAll(grammar.getImport());
		}
		imported.removeAll(visited);
		return imported.isEmpty() ? null : new TerminalScope(filter, visited, imported.toArray(new GrammarModel[imported.size()]));
	}

	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.scope.IFeatureScope#find(java.lang.String)
	 */
	@Override
	public IScopeElement find(String identifier) {
		// TODO Auto-generated method stub
		return null;
	}

}
