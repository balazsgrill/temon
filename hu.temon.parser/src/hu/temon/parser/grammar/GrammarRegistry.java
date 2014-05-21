/**
 * 
 */
package hu.temon.parser.grammar;

import hu.temon.grammar.GrammarModel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	private final Map<String, URI> grammarURIs = new HashMap<String, URI>();
	
	public static final String EPID = "hu.temon.grammars";
	
	public static final String ELEMENT_GRAMMAR = "grammar";
	public static final String ATTR_ID = "id";
	public static final String ATTR_PATH = "model";
	
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
				String id = ce.getAttribute(ATTR_ID);
				
				String loc = ce.getAttribute(ATTR_PATH);
				String contributor = ce.getContributor().getName();
				URI uri = URI.createPlatformPluginURI(contributor+"/"+loc, true);

				grammarURIs.put(id, uri);
			}
		}
	}
	
	/* (non-Javadoc)
	 * @see hu.temon.parser.IGlobalScope#getGlobalInstances(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EClass)
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
		URI uri = grammarURIs.get(ID);
		if (uri != null){
			try{
				Resource r = resourceSet.getResource(uri, true);
				for(EObject e : r.getContents()){
					if (e instanceof GrammarModel){
						if (ID.equals(((GrammarModel) e).getName())){
							return (GrammarModel)e;
						}
					}
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
//		for(Resource r : resourceSet.getResources()){
//			for(EObject e : r.getContents()){
//				if (e instanceof GrammarModel){
//					if (ID.equals(((GrammarModel) e).getName())){
//						return (GrammarModel)e;
//					}
//				}
//			}
//		}
		return null;
	}
	
}
