/**
 * 
 */
package hu.textualmodeler.parser.test;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import hu.textualmodeler.grammar.GrammarModel;
import hu.textualmodeler.parser.AbstractTextualResource;
import hu.textualmodeler.parser.IGlobalScope;
import hu.textualmodeler.parser.impl.GrammarRegistry;

/**
 * @author balazs.grill
 *
 */
public class PeopleResource extends AbstractTextualResource {

	/**
	 * @param uri
	 */
	public PeopleResource(URI uri) {
		super(uri);
	}

	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.AbstractTextualResource#loadGrammar()
	 */
	@Override
	protected GrammarModel loadGrammar() {
		return GrammarRegistry.getInstance().getGrammar("people");
	}

	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.AbstractTextualResource#createGlobalScope()
	 */
	@Override
	protected IGlobalScope createGlobalScope() {
		return new IGlobalScope() {
			
			@Override
			public Collection<EObject> getGlobalInstances(EObject context, EClass eclass) {
				return Collections.emptyList();
			}
		};
	}

}
