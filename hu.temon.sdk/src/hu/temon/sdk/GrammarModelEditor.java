/**
 * 
 */
package hu.temon.sdk;

import hu.temon.editor.TextualModelEditor;
import hu.temon.parser.grammar.GrammarResource;

import java.util.Arrays;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.PluginRegistry;

/**
 * @author balazs.grill
 *
 */
public class GrammarModelEditor extends TextualModelEditor {

	public static final String PDENatureID = "org.eclipse.pde.PluginNature";
	
	public static boolean isPluginProject(IProject project) throws CoreException{
		String[] natures = project.getDescription().getNatureIds();	
		return Arrays.asList(natures).contains(PDENatureID);
	}
	
	@Override
	protected EditingDomain createEditingDomain(IFile resource) {
		EditingDomain edomain = super.createEditingDomain(resource);
		IProject project = resource.getProject();
		try {
			if (isPluginProject(project)){
				
				IPluginModelBase modelBase = PluginRegistry.findModel(project.getName());
				if (modelBase != null){
					edomain.getResourceSet().getLoadOptions().put(GrammarResource.OPTION_ADDITIONAL_FEATURE_RESOLVER, 
							new PluginBasedGrammarFeatureResolver(edomain.getResourceSet(), modelBase));
				}
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return edomain; 
	}
	
	
}
