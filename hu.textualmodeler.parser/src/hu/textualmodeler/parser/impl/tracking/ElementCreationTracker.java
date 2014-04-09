/**
 * 
 */
package hu.textualmodeler.parser.impl.tracking;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import hu.textualmodeler.ast.PopElement;
import hu.textualmodeler.ast.PushElement;
import hu.textualmodeler.ast.VisibleNode;
import hu.textualmodeler.parser.impl.IModelBuilderAdapter;
import hu.textualmodeler.parser.impl.ModelBuilder;

/**
 * @author balazs.grill
 *
 */
public class ElementCreationTracker implements IModelBuilderAdapter{

	private Map<EObject, ElementCreationPoint> tracks = new HashMap<EObject, ElementCreationPoint>();
	
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
}
