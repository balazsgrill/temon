/**
 * 
 */
package hu.textualmodeler.editor.impl;

import hu.textualmodeler.ast.VisibleNode;
import hu.textualmodeler.editor.EditorPlugin;
import hu.textualmodeler.parser.errors.ParsingError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;

/**
 * @author balazs.grill
 *
 */
public class MarkerManager {

	private static final String markerId = "hu.textualmodeler.editor.syntaxerrormarker";
	
	private final IFile resource;
	
	private Map<String, IMarker> existingMarkers = new HashMap<String, IMarker>();
	
	public IFile getResource() {
		return resource;
	}
	
	/**
	 * 
	 */
	public MarkerManager(IFile resource) {
		this.resource = resource;
	}

	private IMarker create(ParsingError problem) throws CoreException{
		IMarker marker = resource.createMarker(markerId);
		marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
		marker.setAttribute(IMarker.MESSAGE, problem.getMessage());
		marker.setAttribute(IMarker.LINE_NUMBER, problem.getLine());
		VisibleNode node = problem.getNode();
		if (node != null) {
			marker.setAttribute(IMarker.CHAR_START,node.getStart());
			marker.setAttribute(IMarker.CHAR_END,node.getStart()+node.getLength());
		}
		return marker;
	}
	
	public void update(List<Diagnostic> errors){
		
		Set<String> toDelete = new HashSet<>(existingMarkers.keySet());
		
		for (Diagnostic problem : new ArrayList<>(errors)){
			if (problem instanceof ParsingError){
				String id = ((ParsingError) problem).getID();
				if (toDelete.contains(id)){
					toDelete.remove(id);
				}else{
					try{
						IMarker marker = create((ParsingError) problem);
						existingMarkers.put(id, marker);
					}catch(CoreException e){
						EditorPlugin.getDefault().getLog().log(e.getStatus());
					}
				}
			}
		}
		for(String id : toDelete){
			IMarker marker = existingMarkers.get(id);
			try {
				marker.delete();
			} catch (CoreException e) {
				EditorPlugin.getDefault().getLog().log(e.getStatus());
			}
			existingMarkers.remove(id);
		}
	}
	
	public void dispose(){
		
	}
	
}
