/**
 * 
 */
package hu.temon.sdk;

import hu.temon.grammar.GrammarPackage;
import hu.temon.grammar.Terminal;
import hu.temon.parser.AbstractFeatureResolver;
import hu.temon.parser.scope.IFeatureScope;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.pde.core.plugin.IPluginModelBase;

/**
 * @author balazs.grill
 *
 */
public class PluginBasedGrammarFeatureResolver extends AbstractFeatureResolver {

	private final IPluginModelBase modelBase;
	
	/**
	 * @param modelBase 
	 * 
	 */
	public PluginBasedGrammarFeatureResolver(ResourceSet resourceSet, IPluginModelBase modelBase) {
		super(resourceSet);
		this.modelBase = modelBase;
	}

	/* (non-Javadoc)
	 * @see hu.temon.parser.IFeatureResolver#resolvePrimitive(org.eclipse.emf.ecore.EDataType, hu.temon.grammar.Terminal, java.lang.String)
	 */
	@Override
	public Object resolvePrimitive(EDataType datatype, Terminal terminal,
			String value) {
		return null;
	}

	/* (non-Javadoc)
	 * @see hu.temon.parser.IFeatureResolver#getScope(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, hu.temon.grammar.Terminal, java.lang.String)
	 */
	@Override
	public IFeatureScope getScope(EObject context, EReference feature,
			Terminal terminal, String value) {
		if (GrammarPackage.eINSTANCE.getGrammarModel_Import().equals(feature)){
			return new PluginGrammarScope(modelBase);
		}
		
		if (GrammarPackage.eINSTANCE.getPush_Eclass().equals(feature)){
			return new PluginBasedEClassScope(modelBase);
		}
		
		return null;
	}

}
