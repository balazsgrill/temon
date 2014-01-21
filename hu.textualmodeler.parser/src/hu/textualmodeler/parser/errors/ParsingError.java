/**
 * 
 */
package hu.textualmodeler.parser.errors;

import hu.textualmodeler.ast.VisibleNode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	
	public static int[] getLineAndColumn(String data, int index) {
		int line = 1;
		int last = 0;
		Pattern p = Pattern.compile("\n");
		Matcher m = p.matcher(data);
		while(m.find()){
			int pos = m.end();
			if (pos <= index){
				line++;
				last = pos;
			}
		}
		int column = index-last;
		return new int[]{line, column};
	}
	
	public ParsingError(String message, String input, VisibleNode node) {
		this.message = message;
		this.node = node;
		location = input.toString();
		if (node != null){
			int[] lc = getLineAndColumn(input, node.getStart());
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

	public String getID(){
		return message+"||"+line+"||"+column;
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
