/**
 * 
 */
package hu.temon.expressions;


/**
 * @author balazs.grill
 *
 */
public class UnknownExpressionException extends ExpressionResolveException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7173418651748040745L;

	/**
	 * @param arg0
	 */
	public UnknownExpressionException(Expression expression) {
		super("Unknown expression: "+expression);
	}

}
