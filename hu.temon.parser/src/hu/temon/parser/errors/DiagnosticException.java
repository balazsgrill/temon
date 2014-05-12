/**
 * 
 */
package hu.temon.parser.errors;

import org.eclipse.emf.ecore.resource.Resource.Diagnostic;

/**
 * @author balazs.grill
 *
 */
public class DiagnosticException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1678780659100006957L;
	
	private final Diagnostic diagnostic;
	
	public DiagnosticException(Diagnostic diagnostic) {
		this.diagnostic = diagnostic;
	}
	
	public Diagnostic getDiagnostic() {
		return diagnostic;
	}
	
	@Override
	public String getMessage() {
		return diagnostic.getMessage();
	}
	
}
