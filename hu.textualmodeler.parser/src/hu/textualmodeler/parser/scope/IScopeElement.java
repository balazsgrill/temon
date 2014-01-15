/**
 * 
 */
package hu.textualmodeler.parser.scope;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * @author balazs.grill
 *
 */
public interface IScopeElement {

	public String getIdentifier();
	
	public EObject getValue(ResourceSet resourceSet);
	
}
