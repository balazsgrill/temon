/**
 * 
 */
package hu.textualmodeler.parser.impl;

import hu.textualmodeler.ast.CompositeNode;
import hu.textualmodeler.ast.FeatureSet;
import hu.textualmodeler.ast.FeatureSetTerminalNode;
import hu.textualmodeler.ast.FeatureSetValue;
import hu.textualmodeler.ast.InsertedTerminalNode;
import hu.textualmodeler.ast.Node;
import hu.textualmodeler.ast.PopElement;
import hu.textualmodeler.ast.PushElement;
import hu.textualmodeler.ast.RemovedTerminalNode;
import hu.textualmodeler.ast.TerminalNode;
import hu.textualmodeler.ast.VisibleNode;
import hu.textualmodeler.grammar.Terminal;
import hu.textualmodeler.parser.IFeatureResolver;
import hu.textualmodeler.parser.IParserContext;
import hu.textualmodeler.parser.errors.ReferencedElementNotFoundException;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * @author balazs.grill
 *
 */
public class ModelBuilder {

	private class FeatureValue{
		public final EObject context;
		public final EStructuralFeature feature;
		public final TerminalNode terminal;
		public final String value;
		
		public FeatureValue(EObject context, EStructuralFeature feature,
				TerminalNode terminal, String value) {
			super();
			Assert.isNotNull(feature);
			this.context = context;
			this.feature = feature;
			this.terminal = terminal;
			this.value = value;
		}
		
		public void resolve() throws ReferencedElementNotFoundException{
			Terminal term = null;
			if (terminal != null){
				term = terminal.getTerminal();
			}
			Object o = featureResolver.resolve(context, feature, term, value);
			if (o != null){
				eSetOrAdd(context, feature, o);
			}else{
				throw new ReferencedElementNotFoundException(value);
			}
		}
		
		public boolean unconditional(){
			return feature instanceof EAttribute;
		}
		
	}
	
	private static String contentOf(Node node){
		if (node instanceof CompositeNode){
			StringBuilder sb = new StringBuilder();
			for(Node n : ((CompositeNode) node).getChildren()){
				sb.append(contentOf(n));
			}
			return sb.toString();
		}
		if (node instanceof TerminalNode && !(node instanceof InsertedTerminalNode) && !(node instanceof RemovedTerminalNode)){
			TerminalNode tn = (TerminalNode)node;
			return tn.getContent();
		}
		
		return "";
	}
	
	private class Context{
		
		EObject result = null;
		
		public Context(Context parent) {
			modelStack = (parent == null) ? new Stack<EObject>() : parent.modelStack;
			featureValues = (parent == null) ? new LinkedList<FeatureValue>() : parent.featureValues;
		}
		
		private final Stack<EObject> modelStack;
		
		private List<FeatureValue> featureValues;
		
		public EObject process(Node node){
			try{
				
				if (node instanceof VisibleNode){
					fireAdapters.visibleNodeEncountered((VisibleNode)node);
				}
				
				EStructuralFeature feature = null;
				String featurename = null;
				if (node instanceof FeatureSet){
					featurename = ((FeatureSet) node).getFeatureName();
					if (modelStack.isEmpty()){
						pcontext.logError("Model stack is empty feature is ignored: "+featurename, (node instanceof VisibleNode ? (VisibleNode)node : null));
					}else{
						feature = findFeature(modelStack.peek().eClass(), featurename);
					}
				}
				
				
				if (node instanceof CompositeNode){
					Context subContext = new Context(this);
					for(Node n : ((CompositeNode) node).getChildren()){
						EObject subresult = subContext.process(n);
						if (result == null){
							result = subresult;
						}
					}
					
					if (feature != null){
						EObject context = modelStack.peek();
						if (feature instanceof EReference){

							if (((EReference) feature).isContainment()){
								EObject element = subContext.result;
								eSetOrAdd(context, feature, element);
							}else{
								String value = contentOf(node);
								FeatureValue fv = new FeatureValue(context, feature, null, value);
								featureValues.add(fv);
							}

						}
						if (feature instanceof EAttribute){
							String value = contentOf(node);
							FeatureValue fv = new FeatureValue(context, feature, null, value);
							fv.resolve();
						}
					}
					
				}else if (node instanceof RemovedTerminalNode){
					pcontext.logError("Unexpected terminal: "+((RemovedTerminalNode) node).getTerminal().getName(), (RemovedTerminalNode)node);
				}else if (node instanceof InsertedTerminalNode){
					pcontext.logError("Missing terminal: "+((InsertedTerminalNode) node).getTerminal().getName(), (InsertedTerminalNode)node);
				}else if (node instanceof FeatureSetValue){
					FeatureValue fv = new FeatureValue(modelStack.peek(), 
							feature, null, 
							((FeatureSetValue) node).getValue());
					if (fv.unconditional()) {
						fv.resolve();
					}else{
						featureValues.add(fv);
					}
				}else if (node instanceof PopElement){
					if (modelStack.isEmpty()){
						pcontext.logError("Could not finish rule", null);
					}else{
						EObject element = modelStack.pop();
						fireAdapters.elementCreationEnded(element, (PopElement)node);
					}
				}else if (node instanceof PushElement){
					EClass eclass = ((PushElement) node).getEclass();
					if (eclass == null){
						throw new IllegalArgumentException("Could not find EClass!");
					}
					if (eclass.eIsProxy()){
						EcoreUtil.resolve(eclass, pcontext.getResourceContext());
					}
					EObject element = eclass.getEPackage().getEFactoryInstance().create(eclass);
					if (feature != null){
						EObject parent = modelStack.peek();
						eSetOrAdd(parent, feature, element);
					}
					fireAdapters.elementCreationStarted(element, (PushElement)node);
					modelStack.push(element);
					if (result == null){
						result = element;
					}
				}else if (node instanceof FeatureSetTerminalNode){
					if (!modelStack.isEmpty()){
						
						if (feature != null){
							FeatureValue fv = new FeatureValue(modelStack.peek(), feature,
									((FeatureSetTerminalNode) node), ((FeatureSetTerminalNode) node).getContent());
							if (fv.unconditional()){
								fv.resolve();
							}else{
								featureValues.add(fv);
							}
						}else{
							pcontext.logError("GRAMMAR ERROR: Could not find "+modelStack.peek().eClass().getName()+"."+featurename, (FeatureSetTerminalNode)node);
						}
					}
				}
			}catch(Exception e){
				e.printStackTrace();
				pcontext.logError(e.getMessage(), 
						(node instanceof VisibleNode) ? (VisibleNode)node : null);
					
			}
			
			return result;
		}
		
		public void resolve(){
			for(FeatureValue fv : featureValues){
				try {
					fv.resolve();
				} catch (ReferencedElementNotFoundException e) {
					pcontext.logError(e.getMessage(), fv.terminal);
				}
			}
			featureValues.clear();
		}
		
	}
	
	private final IFeatureResolver featureResolver;
	
	private final IParserContext pcontext;
	
	private List<IModelBuilderAdapter> adapters = null;
	
	public void addAdapter(IModelBuilderAdapter adapter){
		if (adapters == null){
			adapters = new LinkedList<>();
		}
		adapters.add(adapter);
	}
	
	private final IModelBuilderAdapter fireAdapters = new IModelBuilderAdapter() {
		
		@Override
		public void elementCreationStarted(EObject element, PushElement node) {
			if (adapters != null) for (IModelBuilderAdapter adapter : adapters){
				adapter.elementCreationStarted(element, node);
			}
		}
		
		@Override
		public void elementCreationEnded(EObject element, PopElement node) {
			if (adapters != null) for (IModelBuilderAdapter adapter : adapters){
				adapter.elementCreationEnded(element, node);
			}
		}
		
		@Override
		public void visibleNodeEncountered(VisibleNode visibleNode) {
			if (adapters != null) for (IModelBuilderAdapter adapter : adapters){
				adapter.visibleNodeEncountered(visibleNode);
			}
		}
	}; 
	
	public IFeatureResolver getFeatureResolver() {
		return featureResolver;
	}
	
	public ModelBuilder(IFeatureResolver featureResolver, IParserContext pcontext) {
		this.featureResolver = featureResolver;
		this.pcontext = pcontext;
	}
	
	public EObject build(CompositeNode root){
		Context context = new Context(null);
		try{
			Object o = context.process(root);
			context.resolve();
			return o instanceof EObject ? (EObject)o : null;
		}catch(Exception e){
			e.printStackTrace();
			pcontext.logError(e);
			return null;
		}
	}
	
	public static EStructuralFeature findFeature(EClass eclass, String name){
		for(EStructuralFeature sf : eclass.getEAllStructuralFeatures()){
			if (name.equals(sf.getName())){
				return sf;
			}
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public static void eSetOrAdd(EObject element, EStructuralFeature feature, Object value){
		if (feature.isMany()){
			((List<Object>)element.eGet(feature)).add(value);
		}else{
			element.eSet(feature, value);
		}
	}
	
}
