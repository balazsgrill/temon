/**
 * 
 */
package hu.temon.parser.grammar;

import hu.temon.grammar.GrammarModel;
import hu.temon.grammar.Terminal;
import hu.temon.parser.scope.IFeatureScope;
import hu.temon.parser.scope.IScopeElement;
import hu.temon.parser.scope.SimpleScopeElement;

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
	
	private final Set<String> visited;
	
	/**
	 * 
	 */
	private TerminalScope(String filter, Set<String> visited, GrammarModel...grammarModels) {
		this.filter = filter;
		this.grammarModels = grammarModels;
		this.visited = visited;
		for(GrammarModel gm : grammarModels){
			this.visited.add(gm.getName());
		}
	}
	
	public TerminalScope(String filter, GrammarModel...grammarModels) {
		this(filter, new HashSet<String>(), grammarModels);
	}

	/* (non-Javadoc)
	 * @see hu.temon.parser.scope.IFeatureScope#getLocalElements()
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
	 * @see hu.temon.parser.scope.IFeatureScope#parentScope()
	 */
	@Override
	public IFeatureScope parentScope() {
		Set<GrammarModel> imported = new LinkedHashSet<>();
		for(GrammarModel grammar : grammarModels){
			for(GrammarModel im : grammar.getImport()){
				if (!visited.contains(im.getName())){
					visited.add(im.getName());
					imported.add(im);
				}
			}
		}
		return imported.isEmpty() ? null : new TerminalScope(filter, visited, imported.toArray(new GrammarModel[imported.size()]));
	}

	/* (non-Javadoc)
	 * @see hu.temon.parser.scope.IFeatureScope#find(java.lang.String)
	 */
	@Override
	public IScopeElement find(String identifier) {
		// TODO Auto-generated method stub
		return null;
	}

}
