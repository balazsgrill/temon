/**
 * 
 */
package hu.textualmodeler.editor.impl;

import hu.textualmodeler.ast.Node;
import hu.textualmodeler.editor.TextualModelEditor;
import hu.textualmodeler.parser.AbstractTextualResource;
import hu.textualmodeler.tokens.TokenList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;

/**
 * @author balazs.grill
 *
 */
public class TextualModelContentOutlinePage extends ContentOutlinePage implements ITreeContentProvider{

	private final AbstractTextualResource resource;
	private final TextualModelEditor editor;
	private AdapterFactory adapterFactory;
	
	private ITreeContentProvider contentProvider;
	private ILabelProvider labelProvider;
	
	private AdapterFactory createDomainAdapterFactory(){
		final List<AdapterFactory> factories = new ArrayList<AdapterFactory>(2);
		factories.add(new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE));
		factories.add(new ReflectiveItemProviderAdapterFactory());
		return new ComposedAdapterFactory(factories);

	}
	
	public TextualModelContentOutlinePage(Resource resource, TextualModelEditor editor) {
		this.editor = editor;
		if (resource instanceof AbstractTextualResource){
			this.resource = (AbstractTextualResource)resource;
			
		}else{
			throw new IllegalArgumentException("Not a textual resource");
		}
	}
	
	public void update(){
		Display.getDefault().asyncExec(new Runnable(){
			@Override
			public void run() {
				if (adapterFactory == null){
					adapterFactory = createDomainAdapterFactory();
					
					contentProvider = new AdapterFactoryContentProvider(adapterFactory);
					labelProvider = new AdapterFactoryLabelProvider(adapterFactory);	
					
					getTreeViewer().setContentProvider(TextualModelContentOutlinePage.this);
					getTreeViewer().setLabelProvider(labelProvider);
					getTreeViewer().setInput(resource);
				}
				
				TextualModelContentOutlinePage.this.getTreeViewer().refresh();
			}
		});
	}
	
	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		getTreeViewer().addDoubleClickListener(new IDoubleClickListener() {
			
			@Override
			public void doubleClick(DoubleClickEvent event) {
				ISelection s = event.getSelection();
				if (s instanceof IStructuredSelection){
					Object o = ((IStructuredSelection) s).getFirstElement();
					if (o instanceof EObject){
						EObject element = (EObject)o;
						int start = resource.getElementCreationTracker().getStartPosition(element);
						int end = resource.getElementCreationTracker().getEndPosition(element);
						if (start != -1 && end != -1){
							editor.getSelectionProvider().setSelection(new TextSelection(start, end-start));
						}
					}
				}
				
			}
		});
	}

	@Override
	public void dispose() {
		if (labelProvider != null){
			labelProvider.dispose();
		}
		super.dispose();
	}
	
	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof AbstractTextualResource){
			List<Object> result = new LinkedList<Object>();
			result.addAll(((Resource) inputElement).getErrors());
			result.addAll(((AbstractTextualResource) inputElement).getContents());
			Node ast = ((AbstractTextualResource) inputElement).getAST();
			if (ast != null){
				result.add(ast);
			}
			TokenList tl = ((AbstractTextualResource) inputElement).getTokenList();
			if (tl != null){
				result.add(tl);
			}
			return result.toArray();
		}
		return new Object[0];
	}
	
	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof Resource){
			return contentProvider.getElements(parentElement);
		}
		if (parentElement instanceof EObject){
			return contentProvider.getChildren(parentElement);
		}
		return new Object[0];
	}

	@Override
	public Object getParent(Object element) {
		return contentProvider.getParent(element);
	}

	@Override
	public boolean hasChildren(Object element) {
		return getChildren(element).length > 0;
	}
	
}
