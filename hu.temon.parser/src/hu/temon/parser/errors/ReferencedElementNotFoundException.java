/**
 * 
 */
package hu.temon.parser.errors;

/**
 * @author balazs.grill
 *
 */
public class ReferencedElementNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3852752314322272292L;

	private final String value;
	
	public ReferencedElementNotFoundException(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	@Override
	public String getMessage() {
		return "Could not resolve '"+value+"'";
	}
	
}
