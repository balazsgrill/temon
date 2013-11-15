/**
 * 
 */
package hu.textualmodeler.parser.errors;

import hu.textualmodeler.ast.VisibleNode;
import hu.textualmodeler.parser.IParserInput;

import org.eclipse.emf.ecore.resource.Resource.Diagnostic;

/**
 * @author balazs.grill
 *
 */
public class ParsingError implements Diagnostic {

	private final String message;
	private final String location;
	private final int line;
	private final int column;
	
	private final VisibleNode node;
	
	public ParsingError(String message, IParserInput input, VisibleNode node) {
		this.message = message;
		this.node = node;
		location = input.toString();
		if (node != null){
			int[] lc = input.getLineAndColumn(node.getStart());
			line = lc[0];
			column = lc[1];
		}else{
			line = 0;
			column = 0;
		}
	}
	
	public ParsingError(String message, String location, int line, int column) {
		this.message = message;
		this.location = location;
		this.line = line;
		this.column = column;
		node = null;
	}

	public VisibleNode getNode() {
		return node;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.Resource.Diagnostic#getMessage()
	 */
	@Override
	public String getMessage() {
		return message;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.Resource.Diagnostic#getLocation()
	 */
	@Override
	public String getLocation() {
		return location;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.Resource.Diagnostic#getLine()
	 */
	@Override
	public int getLine() {
		return line;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.Resource.Diagnostic#getColumn()
	 */
	@Override
	public int getColumn() {
		return column;
	}

	@Override
	public String toString() {
		return message;
	}
	
}
