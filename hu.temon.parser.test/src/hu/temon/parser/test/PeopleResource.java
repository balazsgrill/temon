/**
 * 
 */
package hu.temon.parser.test;

import hu.temon.grammar.GrammarModel;
import hu.temon.grammar.Terminal;
import hu.temon.parser.AbstractTextualResource;
import hu.temon.parser.BasicFeatureResolver;
import hu.temon.parser.IFeatureResolver;
import hu.temon.parser.grammar.GrammarRegistry;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import people.Human;
import people.People;
import people.PeoplePackage;

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
	 * @see hu.temon.parser.AbstractTextualResource#loadGrammar()
	 */
	@Override
	protected GrammarModel loadGrammar() {
		return GrammarRegistry.getInstance().getGrammar("people");
	}

	private static Human findByName(People people, String name){
		for(Human h : people.getPeople()){
			if (name.equals(h.getName())){
				return h;
			}
		}
		return null;
	}
	
	@Override
	protected IFeatureResolver createFeatureResolver() {
		return new BasicFeatureResolver(getResourceSet()){
			@Override
			public Object resolve(EObject context, EStructuralFeature feature,
					Terminal terminal, String value) {
				
				if (PeoplePackage.eINSTANCE.getHuman_Father().equals(feature) || PeoplePackage.eINSTANCE.getHuman_Mother().equals(feature)){
					People p = (People) context.eContainer();
					return findByName(p, value);
				}
				
				return super.resolve(context, feature, terminal, value);
			}
		};
	}

}
