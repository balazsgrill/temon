/**
 * 
 */
package hu.temon.parser.scope;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * @author balazs.grill
 *
 */
public class SimpleScopeElement implements IScopeElement {

	private final String id;
	private final EObject element;
	
	/**
	 * 
	 */
	public SimpleScopeElement(String id, EObject element) {
		this.id = id;
		this.element = element;
	}

	/* (non-Javadoc)
	 * @see hu.temon.parser.scope.IScopeElement#getIdentifier()
	 */
	@Override
	public String getIdentifier() {
		return id;
	}

	/* (non-Javadoc)
	 * @see hu.temon.parser.scope.IScopeElement#getValue(org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	@Override
	public EObject getValue(ResourceSet resourceSet) {
		return element;
	}

}
