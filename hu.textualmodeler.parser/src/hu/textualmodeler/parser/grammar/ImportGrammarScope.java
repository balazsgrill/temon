/**
 * 
 */
package hu.textualmodeler.parser.grammar;

import hu.textualmodeler.grammar.GrammarModel;
import hu.textualmodeler.parser.scope.IFeatureScope;
import hu.textualmodeler.parser.scope.IScopeElement;
import hu.textualmodeler.parser.scope.SimpleScopeElement;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * @author balazs.grill
 *
 */
public class ImportGrammarScope implements IFeatureScope {

	private final String filter;
	
	/**
	 * 
	 */
	public ImportGrammarScope(String filter) {
		this.filter = filter;
	}

	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.scope.IFeatureScope#getLocalElements()
	 */
	@Override
	public Collection<IScopeElement> getLocalElements() {
		List<IScopeElement> elements = new LinkedList<>();
		for(GrammarModel grammar : GrammarRegistry.getInstance().getGlobalInstances()){
			if (grammar.getName().startsWith(filter)){
				elements.add(new SimpleScopeElement(grammar.getName(), grammar));
			}
		}
		return elements;
	}

	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.scope.IFeatureScope#parentScope()
	 */
	@Override
	public IFeatureScope parentScope() {
		return null;
	}

	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.scope.IFeatureScope#find(java.lang.String)
	 */
	@Override
	public IScopeElement find(String identifier) {
		return null;
	}

}
