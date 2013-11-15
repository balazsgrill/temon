/**
 * 
 */
package hu.textualmodeler.parser;

import hu.textualmodeler.ast.VisibleNode;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;

/**
 * @author balazs.grill
 *
 */
public interface IParserContext {

	public void logError(Exception e);
	
	public void logError(Diagnostic diagnostic);
	
	public IProgressMonitor getMonitor();
	
	public void logError(String message, VisibleNode node);
}
