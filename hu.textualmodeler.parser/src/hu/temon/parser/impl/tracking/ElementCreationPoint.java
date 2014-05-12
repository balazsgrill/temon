/**
 * 
 */
package hu.temon.parser.impl.tracking;

import hu.temon.ast.PopElement;
import hu.temon.ast.PushElement;

import org.eclipse.emf.ecore.EObject;

/**
 * @author balazs.grill
 *
 */
public class ElementCreationPoint {

	private final EObject element;
	private PushElement start = null;
	private PopElement end = null;
	
	private int startPosition = -1;
	private int endPosition = -1;
	
	public int getStartPosition() {
		return startPosition;
	}
	
	public int getEndPosition() {
		return endPosition;
	}
	
	/**
	 * 
	 */
	public ElementCreationPoint(EObject element) {
		this.element = element;
	}

	public void setStart(PushElement start, int position) {
		this.start = start;
		this.startPosition = position;
	}
	
	public void setEnd(PopElement end, int position) {
		this.end = end;
		this.endPosition = position;
	}
	
	public EObject getElement() {
		return element;
	}
	
	public PushElement getStart() {
		return start;
	}
	
	public PopElement getEnd() {
		return end;
	}
	
}
