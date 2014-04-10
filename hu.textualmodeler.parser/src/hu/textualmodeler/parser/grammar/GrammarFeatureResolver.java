package hu.textualmodeler.parser.grammar;

import hu.textualmodeler.grammar.GrammarModel;
import hu.textualmodeler.grammar.GrammarPackage;
import hu.textualmodeler.grammar.Terminal;
import hu.textualmodeler.grammar.TerminalItem;
import hu.textualmodeler.parser.BasicFeatureResolver;
import hu.textualmodeler.parser.scope.IFeatureScope;

import java.util.Objects;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;

class GrammarFeatureResolver extends BasicFeatureResolver {
	private final GrammarConstants constants;
	
	GrammarFeatureResolver(ResourceSet resourceSet, GrammarConstants constants) {
		super(resourceSet);
		this.constants = constants;
	}

	@Override
	public Object resolve(EObject context, EStructuralFeature feature,
			Terminal terminal, String value) {
		
		if (GrammarPackage.eINSTANCE.getGrammarModel_Import().equals(feature)){
			return GrammarRegistry.getInstance().getGrammar(value);
		}
		
		if (GrammarPackage.eINSTANCE.getTerminal_SuperTerminal().equals(feature)){
			if (context instanceof Terminal){
				GrammarModel g = (GrammarModel) context.eContainer();
				return GrammarResource.getTerminal(g, value);
			}
		}
		
		if (GrammarPackage.eINSTANCE.getTerminalItem_Terminal().equals(feature)){
			if (context instanceof TerminalItem){
				EObject rule = context.eContainer();
				if (rule != null){
					GrammarModel g = (GrammarModel) rule.eContainer();
					return GrammarResource.getTerminal(g, value);
				}
			}
		}
		
		if (GrammarPackage.eINSTANCE.getPush_Eclass().equals(feature)){
			if (Objects.equals(constants.STRING, terminal)){
				return GrammarResource.findEClass(value);
			}
		}
		
		return super.resolve(context, feature, terminal, value);
	}

	@Override
	public IFeatureScope getScope(EObject context, EReference feature,
			Terminal terminal, String value) {
		if (GrammarPackage.eINSTANCE.getPush_Eclass().equals(feature)){
			return new EObjectURIScope(value);
		}
		
		if (GrammarPackage.eINSTANCE.getGrammarModel_Import().equals(feature)){
			return new ImportGrammarScope(value);
		}
		
		if (GrammarPackage.eINSTANCE.getTerminal_SuperTerminal().equals(feature)){
			if (context instanceof Terminal){
				GrammarModel g = (GrammarModel) context.eContainer();
				return new TerminalScope(value, g);
			}
		}
		
		if (GrammarPackage.eINSTANCE.getTerminalItem_Terminal().equals(feature)){
			if (context instanceof TerminalItem){
				EObject rule = context.eContainer();
				if (rule != null){
					GrammarModel g = (GrammarModel) rule.eContainer();
					return new TerminalScope(value, g);
				}
			}
		}
		
		return super.getScope(context, feature, terminal, value);
	}
}