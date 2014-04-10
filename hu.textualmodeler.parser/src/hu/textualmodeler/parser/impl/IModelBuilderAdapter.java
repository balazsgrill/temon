/**
 * 
 */
package hu.textualmodeler.parser.impl;

import hu.textualmodeler.ast.FeatureSet;
import hu.textualmodeler.ast.PopElement;
import hu.textualmodeler.ast.PushElement;
import hu.textualmodeler.ast.VisibleNode;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * @author balazs.grill
 *
 */
public interface IModelBuilderAdapter {

	public void elementCreationStarted(EObject element, PushElement node);
	
	public void elementCreationEnded(EObject element, PopElement node);
	
	public void visibleNodeEncountered(VisibleNode visibleNode);
	
	public void featureSetNodeEncountered(EObject context, EStructuralFeature feature, FeatureSet node);
	
}
