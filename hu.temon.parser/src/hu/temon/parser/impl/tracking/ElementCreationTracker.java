/**
 * 
 */
package hu.temon.parser.impl.tracking;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import hu.temon.ast.FeatureSet;
import hu.temon.ast.Node;
import hu.temon.ast.PopElement;
import hu.temon.ast.PushElement;
import hu.temon.ast.VisibleNode;
import hu.temon.parser.impl.AstUtils;
import hu.temon.parser.impl.IModelBuilderAdapter;
import hu.temon.parser.impl.ModelBuilder;

/**
 * @author balazs.grill
 *
 */
public class ElementCreationTracker implements IModelBuilderAdapter{

	private final Map<EObject, ElementCreationPoint> tracks = new HashMap<EObject, ElementCreationPoint>();
	
	private final List<FeatureSetPoint> featureSets = new LinkedList<>();
	
	int position = 0;
	
	/**
	 * 
	 */
	public ElementCreationTracker(ModelBuilder modelBuilder) {
		modelBuilder.addAdapter(this);
	}

	@Override
	public void elementCreationStarted(EObject element, PushElement node) {
		ElementCreationPoint elementCreationPoint = new ElementCreationPoint(element);
		elementCreationPoint.setStart(node, position);
		tracks.put(element, elementCreationPoint);
	}

	@Override
	public void elementCreationEnded(EObject element, PopElement node) {
		ElementCreationPoint point = tracks.get(element);
		point.setEnd(node, position);
	}

	@Override
	public void visibleNodeEncountered(VisibleNode visibleNode) {
		position = visibleNode.getStart()+visibleNode.getLength();
	}
	
	public int getStartPosition(EObject element){
		if (!tracks.containsKey(element)) return -1;
		return tracks.get(element).getStartPosition();
	}
	
	public int getEndPosition(EObject element){
		if (!tracks.containsKey(element)) return -1;
		return tracks.get(element).getEndPosition();
	}
	
	public PushElement getStartNode(EObject element){
		if (!tracks.containsKey(element)) return null;
		return tracks.get(element).getStart();
	}
	
	public PopElement getEndNode(EObject element){
		if (!tracks.containsKey(element)) return null;
		return tracks.get(element).getEnd();
	}
	
	public EObject findElementAtPosition(int position){
		int bestPoint = -1;
		ElementCreationPoint best = null;
		for(ElementCreationPoint ecp : tracks.values()){
			if (position >= ecp.getStartPosition() && position < ecp.getEndPosition()){
				int points = ecp.getEndPosition()-ecp.getStartPosition();
				if (bestPoint < 0 || points < bestPoint){
					best = ecp;
				}
			}
		}
		return best == null ? null : best.getElement();
	}
	
	public FeatureSetPoint findFeatureSetPoint(int position){
		for(FeatureSetPoint p : featureSets){
			if (p.isAt(position)) return p;
		}
		return null;
	}

	@Override
	public void featureSetNodeEncountered(EObject context,
			EStructuralFeature feature, FeatureSet node) {
		if (node instanceof Node){
			Node n = (Node)node;
			int[] range = AstUtils.getRange(n);
			if (range[0] != -1 && range[1] != -1){
				String content = AstUtils.contentOf(n);
				featureSets.add(new FeatureSetPoint(n, context, feature, content, range));
			}
		}
	}
}
