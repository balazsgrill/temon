/**
 * 
 */
package hu.temon.parser;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import hu.temon.grammar.Terminal;
import hu.temon.parser.scope.IFeatureScope;
import hu.temon.parser.scope.IScopeElement;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * A feature resolver implementation which allows to properly merge one or more feature resolvers.
 * 
 * @author balazs.grill
 *
 */
public class MergedFeatureResolver implements IFeatureResolver {

	private final IFeatureResolver[] featureResolvers;
	
	private static class MergedScope implements IFeatureScope{

		private final IFeatureScope[] scopes;
		
		public MergedScope(Collection<? extends IFeatureScope> scopes){
			this(scopes.toArray(new IFeatureScope[scopes.size()]));
		}
		
		public MergedScope(IFeatureScope... scopes) {
			this.scopes = scopes;
		}
		
		@Override
		public Collection<IScopeElement> getLocalElements() {
			List<Collection<IScopeElement>> lists = new LinkedList<>();
			int size = 0;
			for(IFeatureScope scope : scopes){
				Collection<IScopeElement> localElements = scope.getLocalElements();
				lists.add(localElements);
				size += localElements.size();
			}
			
			List<IScopeElement> elements = new ArrayList<>(size);
			for(Collection<IScopeElement> list : lists){
				elements.addAll(list);
			}
			
			return elements;
		}

		@Override
		public IFeatureScope parentScope() {
			List<IFeatureScope> parents = new ArrayList<>(scopes.length);
			
			for(IFeatureScope scope : scopes){
				IFeatureScope parent = scope.parentScope();
				if (parent != null){
					parents.add(parent);
				}
			}
			
			return parents.isEmpty() ? null : 
				(parents.size() == 1 ? parents.get(0) : new MergedScope(parents));
		}

		@Override
		public IScopeElement find(String identifier) {
			for(IFeatureScope scope : scopes){
				IScopeElement element = scope.find(identifier);
				if (element != null) return element;
			}
			return null;
		}
		
	}
	
	/**
	 * 
	 */
	public MergedFeatureResolver(IFeatureResolver...featureResolvers) {
		this.featureResolvers = featureResolvers;
	}

	/* (non-Javadoc)
	 * @see hu.temon.parser.IFeatureResolver#resolvePrimitive(org.eclipse.emf.ecore.EDataType, hu.temon.grammar.Terminal, java.lang.String)
	 */
	@Override
	public Object resolvePrimitive(EDataType datatype, Terminal terminal,
			String value) {
		for(IFeatureResolver fr : featureResolvers){
			Object r = fr.resolvePrimitive(datatype, terminal, value);
			if (r != null) return r;
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see hu.temon.parser.IFeatureResolver#getScope(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, hu.temon.grammar.Terminal, java.lang.String)
	 */
	@Override
	public IFeatureScope getScope(EObject context, EReference feature,
			Terminal terminal, String value) {
		List<IFeatureScope> scopes = new ArrayList<>(featureResolvers.length);
		for(IFeatureResolver fr : featureResolvers){
			IFeatureScope scope = fr.getScope(context, feature, terminal, value);
			if (scope != null){
				scopes.add(scope);
			}
		}
		return scopes.isEmpty() ? null : new MergedScope(scopes);
	}

	/* (non-Javadoc)
	 * @see hu.temon.parser.IFeatureResolver#resolve(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EStructuralFeature, hu.temon.grammar.Terminal, java.lang.String)
	 */
	@Override
	public Object resolve(EObject context, EStructuralFeature feature,
			Terminal terminal, String value) {
		for(IFeatureResolver fr : featureResolvers){
			Object r = fr.resolve(context, feature, terminal, value);
			if (r != null) return r;
		}
		return null;
	}

}
