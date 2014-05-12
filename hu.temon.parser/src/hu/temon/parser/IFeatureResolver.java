/**
 * 
 */
package hu.temon.parser;

import hu.temon.grammar.Terminal;
import hu.temon.parser.scope.IFeatureScope;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * @author balazs.grill
 *
 */
public interface IFeatureResolver {

	public Object resolvePrimitive(EDataType datatype, Terminal terminal, String value);
	
	public IFeatureScope getScope(EObject context, EReference feature, Terminal terminal, String value);
	
	public Object resolve(EObject context, EStructuralFeature feature, Terminal terminal, String value);
	
}
