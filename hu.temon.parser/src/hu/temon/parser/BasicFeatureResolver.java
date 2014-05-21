/**
 * 
 */
package hu.temon.parser;

import hu.temon.grammar.Terminal;
import hu.temon.parser.scope.IFeatureScope;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * @author balazs.grill
 *
 */
public class BasicFeatureResolver extends AbstractFeatureResolver {
	
	public BasicFeatureResolver(ResourceSet resourceSet) {
		super(resourceSet);
	}

	/* (non-Javadoc)
	 * @see hu.temon.parser.IFeatureResolver#resolve(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, hu.temon.grammar.Terminal, java.lang.String)
	 */
	@Override
	public Object resolve(EObject context, EStructuralFeature feature,
			Terminal terminal, String value) {
		
		if (feature instanceof EAttribute){
			EAttribute attrib = (EAttribute)feature;
			EDataType datatype = attrib.getEAttributeType();
			return resolvePrimitive(datatype, terminal, value);
		}
		
		return super.resolve(context, feature, terminal, value);
	}

	@Override
	public Object resolvePrimitive(EDataType datatype, Terminal terminal,
			String value) {
		return datatype.getEPackage().getEFactoryInstance().createFromString(datatype, value);
	}

	@Override
	public IFeatureScope getScope(EObject context, EReference feature,
			Terminal terminal, String value) {
		return null;
	}

}
