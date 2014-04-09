/**
 * 
 */
package hu.textualmodeler.parser.impl;

import org.eclipse.emf.ecore.EObject;

import hu.textualmodeler.ast.CompositeNode;
import hu.textualmodeler.ast.Node;
import hu.textualmodeler.ast.VisibleNode;

/**
 * @author balazs.grill
 *
 */
public class AstUtils {

	/**
	 * 
	 */
	private AstUtils() {
	}
	
	public static Node getNextNode(Node node){
		if (node instanceof CompositeNode){
			CompositeNode cn = (CompositeNode)node;
			if (!cn.getChildren().isEmpty()){
				return cn.getChildren().get(0);
			}
		}
		EObject parent = node.eContainer();
		if (parent instanceof CompositeNode){
			CompositeNode composite = (CompositeNode)parent;
			int index = composite.getChildren().indexOf(node);
			while(index+1 >= composite.getChildren().size()){
				parent = composite.eContainer();
				if (parent instanceof CompositeNode){
					Node current = composite;
					composite = (CompositeNode)parent;
					index = composite.getChildren().indexOf(current);
				}else{
					return null;
				}
			}
			return composite.getChildren().get(index+1);
		}
		return null;
	}
	
	public static Node getLastNode(Node node){
		if (node instanceof CompositeNode){
			CompositeNode cn = (CompositeNode)node;
			if (!cn.getChildren().isEmpty()){
				return cn.getChildren().get(cn.getChildren().size()-1);
			}
		}
		return node;
	}
	
	public static Node getPreviousNode(Node node){
		EObject parent = node.eContainer();
		if (parent instanceof CompositeNode){
			CompositeNode composite = (CompositeNode)parent;
			int index = composite.getChildren().indexOf(node);
			while(index == 0){
				parent = composite.eContainer();
				if (parent instanceof CompositeNode){
					Node current = composite;
					composite = (CompositeNode)parent;
					index = composite.getChildren().indexOf(current);
				}else{
					return null;
				}
			}
			
			return getLastNode(composite.getChildren().get(index-1));
			
		}
		return null;
	}
	
	public static VisibleNode findVisibleNodeAfter(Node node){
		Node current = node;
		while(current != null){
			
			if (current instanceof VisibleNode){
				return (VisibleNode)current;
			}
			
			current = getNextNode(node);
		}
		return null;
	}
	
	public static VisibleNode findVisibleNodeBefore(Node node){
		Node current = node;
		while(current != null){
			
			if (current instanceof VisibleNode){
				return (VisibleNode)current;
			}
			
			current = getPreviousNode(node);
		}
		return null;
	}
	
}
