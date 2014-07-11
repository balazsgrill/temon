/**
 * 
 */
package hu.temon.expressions.test;

import hu.temon.expressions.BasicExpressionEvaluator;
import hu.temon.expressions.Expression;
import hu.temon.expressions.ExpressionResolveException;
import hu.temon.expressions.ExpressionResource;
import hu.temon.expressions.IExpressionEvaluator;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author balazs.grill
 *
 */
public class ExpressionTests {

	private static Expression parse(String expression) throws IOException, CoreException{
		
		ResourceSet rs = new ResourceSetImpl();
		Resource r = new ExpressionResource(URI.createURI("local:resource.expression"));
		
		rs.getResources().add(r);
		r.load(new ByteArrayInputStream(expression.getBytes()), rs.getLoadOptions());
		
		if (!r.getErrors().isEmpty()){
			MultiStatus status = new MultiStatus("hu.temon.expressions", 0, "Parsing error", null);
			for(Diagnostic diag : r.getErrors()){
				status.add(new Status(IStatus.ERROR, status.getPlugin(), diag.getMessage()+" at "+diag.getLine()+":"+diag.getColumn()));
			}
			throw new CoreException(status);
		}
		if (r.getContents().size() != 1) throw new IllegalArgumentException("Resource is empty!");
		
		EObject eo = r.getContents().get(0);
		if (eo instanceof Expression){
			return (Expression) eo; 
		}
		throw new IllegalArgumentException("Result is not an exception!");
	}
	
	private static long evaluateToLong(String expression) throws IOException, CoreException, ExpressionResolveException{
		Expression e = parse(expression);
		IExpressionEvaluator evaluator = new BasicExpressionEvaluator();
		
		Object value = evaluator.evaluate(e);
		if (value instanceof Number){
			return ((Number) value).longValue();
		}
		throw new IllegalArgumentException("Result is not a number!");
	}
	
	@Test
	public void test() throws Exception {
		Assert.assertEquals(4l, evaluateToLong("4"));
	}

}
