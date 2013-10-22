/**
 * 
 */
package hu.textualmodeler.parser.impl;

import hu.textualmodeler.grammar.Terminal;
import hu.textualmodeler.grammar.scope.ChainedScope;
import hu.textualmodeler.grammar.scope.ConditionalScope;
import hu.textualmodeler.grammar.scope.ContainerScope;
import hu.textualmodeler.grammar.scope.FeatureScope;
import hu.textualmodeler.grammar.scope.GlobalScope;
import hu.textualmodeler.grammar.scope.Scope;
import hu.textualmodeler.grammar.scope.TransitiveScope;
import hu.textualmodeler.grammar.scope.UnionScope;
import hu.textualmodeler.parser.IFeatureResolver;
import hu.textualmodeler.parser.IGlobalScope;
import hu.textualmodeler.parser.ModelBuilder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * @author balazs.grill
 *
 */
public class ScopedFeatureResolver implements IFeatureResolver {

	private final IGlobalScope globalScope;
	
	public ScopedFeatureResolver(IGlobalScope globalScope) {
		this.globalScope = globalScope;
	}
	
	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.IFeatureResolver#resolve(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, hu.textualmodeler.grammar.Terminal, java.lang.String, hu.textualmodeler.grammar.scope.Scope)
	 */
	@Override
	public Object resolve(EObject context, EStructuralFeature feature,
			Terminal terminal, String value, Scope scope) {
		
		if (feature instanceof EAttribute){
			EAttribute attrib = (EAttribute)feature;
			EDataType datatype = attrib.getEAttributeType();
			return datatype.getEPackage().getEFactoryInstance().createFromString(datatype, value);
		}
		
		if (feature instanceof EReference){
			
			EObject target = context;
			
			if (scope != null){
				List<EObject> cs = Collections.singletonList(target);
				cs = resolveScope(cs, scope, value);
				
				if (cs.isEmpty()) return null;
				
				target = cs.get(0);
			}
			
			return target;
		}
		
		return null;
	}

	private List<EObject> resolveScope(List<EObject> context, final Scope scope, String value){
		if (scope instanceof ChainedScope){
			for(Scope ch : ((ChainedScope) scope).getSubScopes()){
				context = resolveScope(context, ch, value);
			}
		}else if (scope instanceof ConditionalScope){
			List<EObject> result = new ArrayList<>(context.size());
			for(EObject eo : context){
				if (select(eo, ((ConditionalScope) scope).getFeatureName(), value)){
					result.add(eo);
				}
			}
			context = result;
		}else if (scope instanceof ContainerScope){
			Set<EObject> eos = new LinkedHashSet<EObject>();
			for(EObject c : context){
				eos.add(c.eContainer());
			}
			context = new ArrayList<>(eos);
		}else if (scope instanceof FeatureScope){
			List<EObject> result = new LinkedList<>();
			
			String featureName = ((FeatureScope) scope).getFeatureName();
			for(EObject eo : context){
				for(EReference ref : eo.eClass().getEAllReferences()){
					if (ref.getName().equals(featureName)){
						Object o = eo.eGet(ref);
						if (o instanceof EObject){
							result.add((EObject)o);
						}
						if (o instanceof List<?>){
							for(Object u : (List<?>)o){
								if (u instanceof EObject){
									result.add((EObject)u);
								}
							}
						}
					}
				}
			}
			
			context = result;
		}else if (scope instanceof TransitiveScope){
			Set<EObject> result = new LinkedHashSet<>();
			List<EObject> queue = context;
			
			if (((TransitiveScope) scope).isOptional()){
				result.addAll(context);
			}
			
			Scope inner = ((TransitiveScope) scope).getSubScope();
			while(!queue.isEmpty()){
				List<EObject> next = new ArrayList<>(resolveScope(context, inner, value));
				next.removeAll(result);
				result.addAll(next);
				queue = next;
			}
			
			context = new ArrayList<>(result);
		}else if (scope instanceof GlobalScope){
			context = new ArrayList<>(
					globalScope.getGlobalInstances(
							context.get(0), 
							ModelBuilder.findEClass(((GlobalScope) scope).getEclassURI())));
		}else if (scope instanceof UnionScope){
			List<EObject> result = new ArrayList<>();
			for(Scope ch : ((ChainedScope) scope).getSubScopes()){
				result.addAll(resolveScope(context, ch, value));
			}
			context = result;
		}
		
		
		return context;
	}
	
	private static boolean select(EObject eo, String feature, String value){
		for(EAttribute a : eo.eClass().getEAllAttributes()){
			if (a.getName().equals(feature)){
				EDataType edt = a.getEAttributeType();
				String s = edt.getEPackage().getEFactoryInstance().convertToString(edt, eo.eGet(a));
				return value.equals(s);
			}
		}
		return false;
	}
	
}
