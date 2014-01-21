/**
 * 
 */
package hu.textualmodeler.editor;

import hu.textualmodeler.ast.FeatureSetTerminalNode;
import hu.textualmodeler.ast.Node;
import hu.textualmodeler.ast.VisibleNode;
import hu.textualmodeler.ast.WhitespaceNode;
import hu.textualmodeler.editor.impl.DelayedExecutor;
import hu.textualmodeler.editor.impl.MarkerManager;
import hu.textualmodeler.editor.impl.TextualModelContentOutlinePage;
import hu.textualmodeler.parser.AbstractTextualResource;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;
import org.eclipse.jface.text.ITextListener;
import org.eclipse.jface.text.TextEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

/**
 * @author balazs.grill
 *
 */
public class TextualModelEditor extends TextEditor {
	
	private EditingDomain edomain;
	private Resource resource = null;
	
	private final StyleRange[] styles;
	
	public TextualModelEditor() {
		super();
		
		Color black = getSharedColors().getColor(new RGB(0,0,0));
		Color grey = getSharedColors().getColor(new RGB(50,50,50));
		Color comment = getSharedColors().getColor(new RGB(50,150,50));
		Color reference = getSharedColors().getColor(new RGB(50,50,200));
		
		styles = new StyleRange[]{
				new StyleRange(0, 0, black, null, SWT.NONE),
				new StyleRange(0, 0, black, null, SWT.BOLD),
				new StyleRange(0, 0, grey, null, SWT.NONE),
				new StyleRange(0, 0, comment, null, SWT.NONE),
				new StyleRange(0, 0, reference, null, SWT.NONE),
		};
	}
	
	volatile boolean dirty = false;
	
	private final DelayedExecutor reloader = new DelayedExecutor() {
		
		public String toString() {
			return "Checking file..";
		};
		
		@Override
		protected IStatus doExecute(IProgressMonitor monitor) {
			reload();
			return Status.OK_STATUS;
		}
	};
	
	private String oldText = "";
	
	private void reload(){
		final String[] text = new String[1];
		Display.getDefault().syncExec(new Runnable() {
			
			@Override
			public void run() {
				text[0] = getSourceViewer().getTextWidget().getText();
			}
		});
		
		if (oldText.equals(text[0])) return;
		oldText = text[0];
		
		final InputStream is = new ByteArrayInputStream(text[0].getBytes());
		
		try {
			resource.unload();
			resource.load(is, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if (resource instanceof AbstractTextualResource){			
			final Node node = ((AbstractTextualResource) resource).getAST();
			if (node != null){
				getSourceViewer().getTextWidget().getDisplay().syncExec(new Runnable(){
					public void run() {
						setStyles(node);
					};
				});
			}
		}
		
		setErrors();
		
		if (contentOutlinePage != null){
			contentOutlinePage.update();
		}
	}
	
	private MarkerManager markerManager = null;
	
	private void setErrors(){
		IFile file = getFile();
		if (file != null){
			
			if (markerManager!= null){
				if (!markerManager.getResource().equals(file)){
					markerManager.dispose();
					markerManager = new MarkerManager(file);
				}
			}else{
				markerManager = new MarkerManager(file);
			}
			
			markerManager.update(resource.getErrors());
		}else{
			if (markerManager != null){
				markerManager.dispose();
				markerManager = null;
			}
		}
	}
	
	@Override
	public void dispose() {
		if (markerManager != null){
			markerManager.dispose();
			markerManager = null;
		}
		super.dispose();
	}
	
	private IFile getFile(){
		IEditorInput input = getEditorInput();
		if (input instanceof IFileEditorInput){
			return ((IFileEditorInput) input).getFile();
		}
		return null;
	}
	
	private void setStyles(Node root){
		LinkedList<VisibleNode> tokens = new LinkedList<>();
		
		TreeIterator<EObject> iterator = root.eAllContents();
		while(iterator.hasNext()){
			EObject eobject = iterator.next();
			
			if (eobject instanceof VisibleNode){
				tokens.add((VisibleNode)eobject);
			}
		}
		
		int[] ranges = new int[tokens.size()*2];
		StyleRange[] styles = new StyleRange[tokens.size()];
		
		for(int i=0;i<tokens.size();i++){
			VisibleNode node = tokens.get(i);
			
			ranges[i*2] = node.getStart();
			ranges[i*2+1] = node.getLength();
			
			styles[i] = this.styles[1];
			if (node instanceof FeatureSetTerminalNode){
//				if (((FeatureSetTerminalNode) node).getTerminal().getScope() != null){
//					styles[i] = this.styles[4];
//				}else{
					styles[i] = this.styles[2];
//				}
			}else{
				if (node instanceof WhitespaceNode){
					styles[i] = this.styles[3];
				}
			}
			 
		}
		
		getSourceViewer().getTextWidget().setStyleRanges(ranges, styles);
	}
	
	private static EditingDomain createEditingDomain(){
		ResourceSet resourceSet = new ResourceSetImpl();
		EditingDomain editingDomain = TransactionalEditingDomainImpl.FactoryImpl.INSTANCE.createEditingDomain(resourceSet);
		return editingDomain;
	}
	
	@Override
	public void updatePartControl(IEditorInput input) {
		if (input instanceof IFileEditorInput){
			IFile file = ((IFileEditorInput) input).getFile();
			URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), false);
			if (edomain == null){
				edomain = createEditingDomain();
			}
			if (resource == null){
				resource = edomain.getResourceSet().createResource(uri);
				reloader.trigger();
				getSourceViewer().addTextListener(new ITextListener() {
					
					@Override
					public void textChanged(TextEvent event) {
						reloader.trigger();
					}
				});
			}
			
		}
		super.updatePartControl(input);
	}
	
	
	private TextualModelContentOutlinePage contentOutlinePage = null;
	
	private IContentOutlinePage getContentOutlinePage(){
		if (contentOutlinePage == null){
			contentOutlinePage = new TextualModelContentOutlinePage(resource);
			reloader.trigger();
		}
		return contentOutlinePage;
	}
	
	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
		if (adapter.equals(IContentOutlinePage.class)){
			return getContentOutlinePage();
		}
		return super.getAdapter(adapter);
	}
	
}
