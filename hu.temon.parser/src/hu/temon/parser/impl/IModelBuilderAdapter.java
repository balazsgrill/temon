/**
 * 
 */
package hu.temon.parser.impl;

import hu.temon.ast.FeatureSet;
import hu.temon.ast.PopElement;
import hu.temon.ast.PushElement;
import hu.temon.ast.VisibleNode;

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
