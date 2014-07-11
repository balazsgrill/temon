/**
 * 
 */
package hu.temon.expressions;

/**
 * @author balazs.grill
 *
 */
public class UnsupportedOperationException extends ExpressionResolveException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3900159626636995963L;

	
	public UnsupportedOperationException(String operation) {
		super("Unsupported operation: "+operation);
	}
}
