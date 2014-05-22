/**
 * 
 */
package hu.temon.parser.grammar;

import hu.temon.grammar.GrammarModel;
import hu.temon.parser.scope.AbstractScope;
import hu.temon.parser.scope.IFeatureScope;
import hu.temon.parser.scope.IScopeElement;
import hu.temon.parser.scope.SimpleScopeElement;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * @author balazs.grill
 *
 */
public class ImportGrammarScope extends AbstractScope {

	private final String filter;
	
	/**
	 * 
	 */
	public ImportGrammarScope(String filter) {
		this.filter = filter;
	}

	/* (non-Javadoc)
	 * @see hu.temon.parser.scope.IFeatureScope#getLocalElements()
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
	 * @see hu.temon.parser.scope.IFeatureScope#parentScope()
	 */
	@Override
	public IFeatureScope parentScope() {
		return null;
	}

}
