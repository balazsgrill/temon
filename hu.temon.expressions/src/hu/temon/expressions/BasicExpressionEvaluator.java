/**
 * 
 */
package hu.temon.expressions;

import java.util.List;

/**
 * @author balazs.grill
 *
 */
public class BasicExpressionEvaluator implements IExpressionEvaluator {
	
	protected Object add(Object a1, Object a2) throws ExpressionResolveException{
		if (a1 == null) return a2;
		
		if (a1 instanceof Number && a2 instanceof Number){
			
		}
		
		throw new ExpressionResolveException("Invalid arguments");
	}
	
	protected Object evaluateOperation(String operation, Object...arguments) throws ExpressionResolveException{
		switch(operation){
			case "add":{
				Object result = null;
				for(Object a : arguments){
					result = add(result, a);
				}
			}
		}
		
		throw new UnsupportedOperationException(operation);
	}
	
	/* (non-Javadoc)
	 * @see hu.temon.expressions.IExpressionEvaluator#evaluate(hu.temon.expressions.Expression)
	 */
	@Override
	public Object evaluate(Expression expression) throws ExpressionResolveException {
		if (expression instanceof IntegerConstantExpression){
			return ((IntegerConstantExpression) expression).getValue();
		}
		
		if (expression instanceof OperationExpression){
			String op = ((OperationExpression) expression).getOperation();
			
			List<Expression> arguments = ((OperationExpression) expression).getArguments();
			Object[] argumentValues = new Object[arguments.size()];
			
			for(int i=0;i<arguments.size();i++){
				argumentValues[i] = evaluate(arguments.get(i));
			}
			
			return evaluateOperation(op, argumentValues);
		}
		
		throw new UnknownExpressionException(expression);
	}

}
