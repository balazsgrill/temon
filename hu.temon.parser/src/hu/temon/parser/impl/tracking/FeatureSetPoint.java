/**
 * 
 */
package hu.temon.parser.impl.tracking;

import hu.temon.ast.Node;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * @author balazs.grill
 *
 */
public class FeatureSetPoint {

	private final EObject context;
	private final EStructuralFeature feature;
	
	private final String value;
	private final int[] range;
	
	private final Node node;
	
	public FeatureSetPoint(Node node, EObject context, EStructuralFeature feature,
			String value, int[] range) {
		super();
		this.context = context;
		this.feature = feature;
		this.value = value;
		this.range = range;
		this.node = node;
	}
	
	public Node getNode() {
		return node;
	}
	
	public EObject getContext() {
		return context;
	}
	
	public EStructuralFeature getFeature() {
		return feature;
	}
	
	public String getValue() {
		return value;
	}
	
	public int[] getRange() {
		return range;
	}
	
	public boolean isAt(int position){
		return range[0] <= position && range[1] >= position;
	}

}
