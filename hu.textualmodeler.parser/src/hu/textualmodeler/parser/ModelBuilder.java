/**
 * 
 */
package hu.textualmodeler.parser;

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
import hu.textualmodeler.parser.errors.ReferencedElementNotFoundException;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;

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
			if (terminal != null && terminal.getTerminal() != null){
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
		
		private final Stack<EObject> modelStack = new Stack<>();
		
		//private String currentContainerFeature = null;
		
		private List<FeatureValue> featureValues = new LinkedList<>();
		
		public EObject process(Node node){
			try{
				
				EStructuralFeature feature = null;
				String featurename = null;
				if (node instanceof FeatureSet){
					featurename = ((FeatureSet) node).getFeatureName();
					feature = findFeature(modelStack.peek().eClass(), featurename);
				}
				
				
				if (node instanceof CompositeNode){
					for(Node n : ((CompositeNode) node).getChildren()){
						process(n);
					}
					
					if (feature != null){
						EObject context = modelStack.peek();
						if (feature instanceof EReference){

							if (((EReference) feature).isContainer()){
								EObject element = modelStack.peek();
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
						modelStack.pop();
					}
				}else if (node instanceof PushElement){
					String eclassURI = ((PushElement) node).getEclassURI();
					EClass eclass = findEClass(eclassURI);
					if (eclass == null){
						throw new IllegalArgumentException("Could not find EClass "+eclassURI);
					}
					EObject element = eclass.getEPackage().getEFactoryInstance().create(eclass);
					if (feature != null){
						EObject parent = modelStack.peek();
						eSetOrAdd(parent, feature, element);
					}
					modelStack.push(element);
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
			
			return modelStack.isEmpty() ? null : modelStack.peek(); 
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
		
		public EStructuralFeature getFeature(String name){
			if (modelStack.isEmpty()) return null;
			EObject current = modelStack.peek();
			return findFeature(current.eClass(), name);
		}
		
	}
	
	private final IFeatureResolver featureResolver;
	
	private final IParserContext pcontext;
	
	public IFeatureResolver getFeatureResolver() {
		return featureResolver;
	}
	
	public ModelBuilder(IFeatureResolver featureResolver, IParserContext pcontext) {
		this.featureResolver = featureResolver;
		this.pcontext = pcontext;
	}
	
	public EObject build(CompositeNode root){
		Context context = new Context();
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
	
	public static EClass findEClass(String EClassURI){
		int i = EClassURI.indexOf('#');
		String nsURI = EClassURI.substring(0, i);
		String name = EClassURI.substring(i+1);
		ExtendedMetaData metaData = new BasicExtendedMetaData(Registry.INSTANCE);
		return (EClass)metaData.getType(nsURI, name);
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
