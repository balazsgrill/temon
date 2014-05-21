/**
 * 
 */
package hu.temon.sdk;

import hu.temon.parser.scope.IScopeElement;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * @author balazs.grill
 *
 */
public class PluginEClassScopeElement implements IScopeElement {

	private final String id;
	private final URI resourceURI;
	private final String fragment;
	
	/**
	 * 
	 */
	public PluginEClassScopeElement(String nsuri, EClass eclass) {
		id = nsuri + "#" + eclass.getName();
		Resource resource = eclass.eResource();
		resourceURI = resource.getURI();
		fragment = resource.getURIFragment(eclass);
	}



	@Override
	public String getIdentifier() {
		return id;
	}

	@Override
	public EObject getValue(ResourceSet resourceSet) {
		Resource resource = resourceSet.getResource(resourceURI, true);
		return resource.getEObject(fragment);
	}}
