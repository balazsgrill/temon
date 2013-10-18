/**
 * 
 */
package hu.textualmodeler.parser.impl;

import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import hu.textualmodeler.grammar.Terminal;
import hu.textualmodeler.grammar.scope.Scope;
import hu.textualmodeler.parser.IFeatureResolver;

/**
 * @author balazs.grill
 *
 */
public class ScopedFeatureResolver implements IFeatureResolver {

	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.IFeatureResolver#resolve(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, hu.textualmodeler.grammar.Terminal, java.lang.String, hu.textualmodeler.grammar.scope.Scope)
	 */
	@Override
	public Object resolve(EObject context, EStructuralFeature feature,
			Terminal terminal, String value, Scope scope) {
		
		if (feature instanceof EAttribute){
			EAttribute attrib = (EAttribute)feature;
			EDataType datatype = attrib.getEAttributeType();
			return datatype.getEPackage().getEFactoryInstance().createFromString(datatype, value);
		}
		
		if (feature instanceof EReference){
			
			
			
		}
		
		return null;
	}

	private List<EObject> resolveScope(List<EObject> context, Scope scope, String value){
		//TODO
		return context;
	}
	
}
