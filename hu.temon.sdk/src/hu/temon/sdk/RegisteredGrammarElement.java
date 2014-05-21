/**
 * 
 */
package hu.temon.sdk;

import hu.temon.grammar.GrammarModel;
import hu.temon.parser.scope.IScopeElement;

import java.net.URI;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.pde.core.plugin.IPluginModelBase;

/**
 * @author balazs.grill
 *
 */
public class RegisteredGrammarElement implements IScopeElement {

	private final IPluginModelBase modelBase;
	private final String id;
	private final String path;
	
	/**
	 * 
	 */
	public RegisteredGrammarElement(IPluginModelBase modelBase, String id, String path) {
		this.modelBase = modelBase;
		this.id = id;
		this.path = path;
	}

	/* (non-Javadoc)
	 * @see hu.temon.parser.scope.IScopeElement#getIdentifier()
	 */
	@Override
	public String getIdentifier() {
		return id;
	}
	
	/* (non-Javadoc)
	 * @see hu.temon.parser.scope.IScopeElement#getValue(org.eclipse.emf.ecore.resource.ResourceSet)
	 */
	@Override
	public EObject getValue(ResourceSet resourceSet) {
		URI uri2 = AbstractPluginBasedScope.getResouceURI(modelBase, path);
		if (uri2 != null){ 
			org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(uri2.toString());
			Resource resource = resourceSet.getResource(uri, true);
			if (!resource.getContents().isEmpty()){
				EObject root = resource.getContents().get(0);
				if (root instanceof GrammarModel){
					return root;
				}
			}
		}
		return null;
	}

}
