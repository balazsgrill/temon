/**
 * 
 */
package hu.textualmodeler.parser.grammar;

import hu.textualmodeler.grammar.GrammarModel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * @author balazs.grill
 *
 */
public class GrammarRegistry{

	private ResourceSet resourceSet = null; 
	
	private static final String EPID = "hu.textualmodeler.grammars";
	
	private static GrammarRegistry instance;
	
	public static GrammarRegistry getInstance() {
		if (instance == null){
			instance = new GrammarRegistry();
		}
		return instance;
	}
	
	private void lazyinit(){
		if (resourceSet == null){
			resourceSet = new ResourceSetImpl();

			for(IConfigurationElement ce : Platform.getExtensionRegistry().getConfigurationElementsFor(EPID)){
				String loc = ce.getAttribute("model");

				String contributor = ce.getContributor().getName();

				URI uri = URI.createPlatformPluginURI(contributor+"/"+loc, true);

				try{
					resourceSet.getResource(uri, true);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
	}
	
	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.IGlobalScope#getGlobalInstances(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EClass)
	 */
	public Collection<GrammarModel> getGlobalInstances() {
		lazyinit();

		List<GrammarModel> result = new ArrayList<>();
		for(Resource r : resourceSet.getResources()){
			for (EObject eo : r.getContents()){
				if (eo instanceof GrammarModel){
					result.add((GrammarModel) eo);
				}
			}
		}
		return result;

	}

	
	public GrammarModel getGrammar(String ID){
		lazyinit();
		for(Resource r : resourceSet.getResources()){
			for(EObject e : r.getContents()){
				if (e instanceof GrammarModel){
					if (ID.equals(((GrammarModel) e).getName())){
						return (GrammarModel)e;
					}
				}
			}
		}
		return null;
	}
	
}
