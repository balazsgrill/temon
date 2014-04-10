/**
 * 
 */
package hu.textualmodeler.editor;

import hu.textualmodeler.editor.impl.DelayedExecutor;
import hu.textualmodeler.editor.impl.MarkerManager;
import hu.textualmodeler.editor.impl.TextualModelContentOutlinePage;
import hu.textualmodeler.editor.impl.configuration.TextualModelSourceViewerConfiguration;
import hu.textualmodeler.parser.AbstractTextualResource;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;
import org.eclipse.jface.text.ITextListener;
import org.eclipse.jface.text.TextEvent;
import org.eclipse.jface.viewers.ILabelProvider;
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
	private AbstractTextualResource resource = null;
	private AdapterFactory adapterFactory = createDomainAdapterFactory();
	private ILabelProvider labelProvider = new AdapterFactoryLabelProvider(adapterFactory);
	
	public TextualModelEditor() {
		super();
	}
	
	public AbstractTextualResource getResource() {
		return resource;
	}
	
	private AdapterFactory createDomainAdapterFactory(){
		final List<AdapterFactory> factories = new ArrayList<AdapterFactory>(2);
		factories.add(new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE));
		factories.add(new ReflectiveItemProviderAdapterFactory());
		return new ComposedAdapterFactory(factories);
	}
	
	public ILabelProvider getLabelProvider() {
		return labelProvider;
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
		
		if (text[0] == null) return;
		if (oldText.equals(text[0])) return;
		oldText = text[0];
		
		final InputStream is = new ByteArrayInputStream(text[0].getBytes());
		
		try {
			resource.unload();
			resource.load(is, edomain.getResourceSet().getLoadOptions());
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
		labelProvider.dispose();
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
	
	private static EditingDomain createEditingDomain(){
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getLoadOptions().put(AbstractTextualResource.OPTION_TRACK_ELEMENT_CREATION, Boolean.TRUE);
		EditingDomain editingDomain = TransactionalEditingDomainImpl.FactoryImpl.INSTANCE.createEditingDomain(resourceSet);
		return editingDomain;
	}
	
	@Override
	protected void doSetInput(IEditorInput input) throws CoreException {
		if (input instanceof IFileEditorInput){
			IFile file = ((IFileEditorInput) input).getFile();
			URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), false);
			if (edomain == null){
				edomain = createEditingDomain();
			}
			if (this.resource == null){
				Resource resource = edomain.getResourceSet().createResource(uri);
				if (resource instanceof AbstractTextualResource){
					this.resource = (AbstractTextualResource)resource;

					setSourceViewerConfiguration(new TextualModelSourceViewerConfiguration(this, getSharedColors()));
				}
			}
			
		}
		super.doSetInput(input);
	}
	
	@Override
	public void updatePartControl(IEditorInput input) {
		if (resource != null){
			this.resource = (AbstractTextualResource)resource;

			reloader.trigger();
			getSourceViewer().addTextListener(new ITextListener() {

				@Override
				public void textChanged(TextEvent event) {
					reloader.trigger();
				}
			});

		}

		super.updatePartControl(input);
	}
	
	
	private TextualModelContentOutlinePage contentOutlinePage = null;
	
	private IContentOutlinePage getContentOutlinePage(){
		if (contentOutlinePage == null){
			contentOutlinePage = new TextualModelContentOutlinePage(resource, this);
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
