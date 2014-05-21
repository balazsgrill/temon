/**
 * 
 */
package hu.temon.sdk;

import hu.temon.parser.scope.IScopeElement;

import java.net.URI;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.pde.core.plugin.IPluginAttribute;
import org.eclipse.pde.core.plugin.IPluginElement;
import org.eclipse.pde.core.plugin.IPluginExtension;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.IPluginObject;

/**
 * @author balazs.grill
 *
 */
public class PluginBasedEClassScope extends
		AbstractPluginBasedScope<PluginBasedEClassScope> {

	private static final String EP_GENPACKAGE = "org.eclipse.emf.ecore.generated_package";
	private static final String PACKAGE = "package";
	private static final String ATTR_URI = "uri";
	private static final String ATTR_GENMODEL = "genModel";
	
	/**
	 * @param plugins
	 */
	public PluginBasedEClassScope(IPluginModelBase... plugins) {
		super(plugins);
	}

	/* (non-Javadoc)
	 * @see hu.temon.sdk.AbstractPluginBasedScope#createParentScope(org.eclipse.pde.core.plugin.IPluginModelBase[])
	 */
	@Override
	protected PluginBasedEClassScope createParentScope(
			IPluginModelBase... plugins) {
		return new PluginBasedEClassScope(plugins);
	}

	/* (non-Javadoc)
	 * @see hu.temon.sdk.AbstractPluginBasedScope#getElements(org.eclipse.pde.core.plugin.IPluginModelBase)
	 */
	@Override
	protected Collection<IScopeElement> getElements(IPluginModelBase plugin) {
		
		List<IScopeElement> elements = new LinkedList<>();
		
		for(IPluginExtension extension : plugin.getExtensions().getExtensions()){
			if (EP_GENPACKAGE.equals(extension.getPoint())){
				for(IPluginObject po : extension.getChildren()){
                    if (po instanceof IPluginElement && PACKAGE.equals(po.getName())) {
                        IPluginAttribute uriAttrib = ((IPluginElement) po).getAttribute(ATTR_URI);
                        IPluginAttribute genAttrib = ((IPluginElement) po).getAttribute(ATTR_GENMODEL);

                        if (uriAttrib != null && genAttrib != null){
                        	String nsuri = uriAttrib.getValue();
                        	URI uri = getResouceURI(plugin, genAttrib.getValue());
                        	if (uri != null){

                        		try{

                        			ResourceSet resourceSet = new ResourceSetImpl();
                        			Resource genModelR = resourceSet.getResource(org.eclipse.emf.common.util.URI.createURI(uri.toString()), true);

                        			for(EObject eo : genModelR.getContents()) if (eo instanceof GenModel){
                        				GenModel gm = (GenModel)eo;
                        				for(GenPackage gp : gm.getAllGenPackagesWithClassifiers()){
                        					if (nsuri.equals(gp.getNSURI())){
                        						EPackage ep = gp.getEcorePackage();
                        						for(EClassifier eclass : ep.getEClassifiers()){
                        							if (eclass instanceof EClass){
                        								elements.add(new PluginEClassScopeElement(nsuri, (EClass) eclass));
                        							}
                        						}
                        					}
                        				}
                        			}

                        			for(Resource r : resourceSet.getResources()){
                        				r.unload();
                        			}

                        		}catch(Exception e){
                        			/* Errors are expected, silently catch to protect overall operation */
                        		}
                        	}
                        }
                        
                    }
				}
			}
		}
		
		return elements;
	}

}
