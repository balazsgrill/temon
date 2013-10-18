/**
 * 
 */
package hu.textualmodeler.parser;

import hu.textualmodeler.grammar.Terminal;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * @author balazs.grill
 *
 */
public interface IFeatureResolver {

	public Object resolve(EObject context, EStructuralFeature feature, Terminal terminal, String value);
	
}
