/**
 * 
 */
package hu.textualmodeler.parser;

import hu.textualmodeler.grammar.Terminal;
import hu.textualmodeler.parser.scope.IFeatureScope;
import hu.textualmodeler.parser.scope.IScopeElement;

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
public class BasicFeatureResolver implements IFeatureResolver {

	private final ResourceSet resourceSet;
	
	public BasicFeatureResolver(ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
	}
	
	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.IFeatureResolver#resolve(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, hu.textualmodeler.grammar.Terminal, java.lang.String)
	 */
	@Override
	public Object resolve(EObject context, EStructuralFeature feature,
			Terminal terminal, String value) {
		
		if (feature instanceof EAttribute){
			EAttribute attrib = (EAttribute)feature;
			EDataType datatype = attrib.getEAttributeType();
			return resolvePrimitive(datatype, terminal, value);
		}else{
			
			IFeatureScope scope = getScope(context, (EReference)feature, terminal, value);
			while(scope != null){
				
				IScopeElement element = scope.find(value);
				if (element != null){
					return element.getValue(resourceSet);
				}
				
				scope = scope.parentScope();
				
			}
			
		}
		
		return null;
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
