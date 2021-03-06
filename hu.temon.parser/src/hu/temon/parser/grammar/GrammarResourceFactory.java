/**
 * 
 */
package hu.temon.parser.grammar;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;

/**
 * @author balazs.grill
 *
 */
public class GrammarResourceFactory implements Factory {

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.resource.Resource.Factory#createResource(org.eclipse.emf.common.util.URI)
	 */
	@Override
	public Resource createResource(URI uri) {
		return new GrammarResource(uri);
	}

}
