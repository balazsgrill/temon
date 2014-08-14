/**
 * 
 */
package hu.temon.parser;

import hu.temon.grammar.Terminal;
import hu.temon.parser.scope.IFeatureScope;
import hu.temon.parser.scope.IScopeElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * @author balazs.grill
 *
 */
public abstract class AbstractFeatureResolver implements IFeatureResolver {

	protected final Resource resource;
	
	public AbstractFeatureResolver(Resource resource) {
		this.resource = resource;
	}
	
	protected ResourceSet getResourceSet(){
		return resource.getResourceSet();
	}
	
	public Resource getResource() {
		return resource;
	}
	
	/* (non-Javadoc)
	 * @see hu.temon.parser.IFeatureResolver#resolve(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, hu.temon.grammar.Terminal, java.lang.String)
	 */
	@Override
	public Object resolve(EObject context, EStructuralFeature feature,
			Terminal terminal, String value) {
		
		if (feature instanceof EReference){
			
			IFeatureScope scope = getScope(context, (EReference)feature, terminal, value);
			while(scope != null){
				
				IScopeElement element = scope.find(value);
				if (element != null){
					return element.getValue(getResourceSet());
				}
				
				scope = scope.parentScope();
				
			}
			
		}
		
		return null;
	}

}
