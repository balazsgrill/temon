/**
 * 
 */
package hu.temon.parser;

import hu.temon.ast.VisibleNode;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
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
	
	public Resource getResourceContext();
}
