/**
 * 
 */
package hu.textualmodeler.parser;

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * @author balazs.grill
 *
 */
public interface IGlobalScope {

	public Collection<EObject> getGlobalInstances(EObject context, EClass eclass);
	
}
