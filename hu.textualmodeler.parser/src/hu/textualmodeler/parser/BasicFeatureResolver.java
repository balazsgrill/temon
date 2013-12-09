/**
 * 
 */
package hu.textualmodeler.parser;

import hu.textualmodeler.grammar.Terminal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * @author balazs.grill
 *
 */
public class BasicFeatureResolver implements IFeatureResolver {

	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.IFeatureResolver#resolve(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, hu.textualmodeler.grammar.Terminal, java.lang.String)
	 */
	@Override
	public Object resolve(EObject context, EStructuralFeature feature,
			Terminal terminal, String value) {
		
		if (feature instanceof EAttribute){
			EAttribute attrib = (EAttribute)feature;
			EDataType datatype = attrib.getEAttributeType();
			return datatype.getEPackage().getEFactoryInstance().createFromString(datatype, value);
		}
		
		return null;
	}

}
