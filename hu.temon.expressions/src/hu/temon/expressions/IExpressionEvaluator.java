/**
 * 
 */
package hu.temon.expressions;

/**
 * @author balazs.grill
 *
 */
public interface IExpressionEvaluator {

	public Object evaluate(Expression expression) throws ExpressionResolveException;
	
}
