/**
 * 
 */
package hu.temon.sdk;

import hu.temon.editor.TextualModelEditor;
import hu.temon.parser.grammar.GrammarResource;

import java.util.Arrays;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;

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
	protected void doSetInput(IEditorInput input) throws CoreException {
		super.doSetInput(input);
		
		if (input instanceof IFileEditorInput){
			IProject project = ((IFileEditorInput) input).getFile().getProject();
			try {
				if (isPluginProject(project)){
					
					IPluginModelBase modelBase = PluginRegistry.findModel(project.getName());
					if (modelBase != null){
						ResourceSet resourceSet = getEditingDomain().getResourceSet();
						resourceSet.getLoadOptions().put(GrammarResource.OPTION_ADDITIONAL_FEATURE_RESOLVER, 
								new PluginBasedGrammarFeatureResolver(getResource(), modelBase));
					}
				}
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
