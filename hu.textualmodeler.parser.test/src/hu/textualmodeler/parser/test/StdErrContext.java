/**
 * 
 */
package hu.textualmodeler.parser.test;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;

import hu.textualmodeler.ast.VisibleNode;
import hu.textualmodeler.parser.IParserContext;

/**
 * @author balazs.grill
 *
 */
public class StdErrContext implements IParserContext {


	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.IParserContext#logError(java.lang.Exception)
	 */
	@Override
	public void logError(Exception e) {
		e.printStackTrace();
	}

	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.IParserContext#logError(org.eclipse.emf.ecore.resource.Resource.Diagnostic)
	 */
	@Override
	public void logError(Diagnostic diagnostic) {
		System.err.println(diagnostic.getMessage());
	}

	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.IParserContext#getMonitor()
	 */
	@Override
	public IProgressMonitor getMonitor() {
		return new NullProgressMonitor();
	}

	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.IParserContext#logError(java.lang.String, hu.textualmodeler.ast.VisibleNode)
	 */
	@Override
	public void logError(String message, VisibleNode node) {
		System.err.println(message);
	}

}
