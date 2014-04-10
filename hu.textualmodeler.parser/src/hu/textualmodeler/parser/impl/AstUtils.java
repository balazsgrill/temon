/**
 * 
 */
package hu.textualmodeler.parser.impl;

import hu.textualmodeler.ast.CompositeNode;
import hu.textualmodeler.ast.InsertedTerminalNode;
import hu.textualmodeler.ast.Node;
import hu.textualmodeler.ast.RemovedTerminalNode;
import hu.textualmodeler.ast.TerminalNode;
import hu.textualmodeler.ast.VisibleNode;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

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
	
	public static int[] getRange(Node node){
		int[] range = new int[]{-1,-1};
		if (node instanceof VisibleNode){
			range[0] = ((VisibleNode) node).getStart();
			range[1] = range[0]+((VisibleNode) node).getLength();
		}
		TreeIterator<EObject> iterator = node.eAllContents();
		while(iterator.hasNext()){
			EObject child = iterator.next();
			if (child instanceof VisibleNode){
				int start = ((VisibleNode) child).getStart();
				int end = start+((VisibleNode) child).getLength();
				range[0] = (range[0] == -1) ? start : Math.min(start, range[0]);
				range[1] = (range[1] == -1) ? end : Math.max(end, range[1]);
			}
		}
		return range;
	}
	
	public static String contentOf(Node node){
		if (node instanceof CompositeNode){
			StringBuilder sb = new StringBuilder();
			for(Node n : ((CompositeNode) node).getChildren()){
				sb.append(contentOf(n));
			}
			return sb.toString();
		}
		if (node instanceof TerminalNode && !(node instanceof InsertedTerminalNode) && !(node instanceof RemovedTerminalNode)){
			TerminalNode tn = (TerminalNode)node;
			return tn.getContent();
		}
		
		return "";
	}
	
}
