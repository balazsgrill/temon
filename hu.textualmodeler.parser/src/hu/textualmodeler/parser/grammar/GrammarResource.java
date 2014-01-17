/**
 * 
 */
package hu.textualmodeler.parser.grammar;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import hu.textualmodeler.grammar.GrammarModel;
import hu.textualmodeler.grammar.GrammarPackage;
import hu.textualmodeler.grammar.Terminal;
import hu.textualmodeler.grammar.TerminalItem;
import hu.textualmodeler.parser.AbstractTextualResource;
import hu.textualmodeler.parser.BasicFeatureResolver;
import hu.textualmodeler.parser.IFeatureResolver;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author balazs.grill
 *
 */
public class GrammarResource extends AbstractTextualResource {
	
	public GrammarResource(URI uri){
		super(uri);
	}
	
	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.AbstractTextualResource#loadGrammar()
	 */
	@Override
	protected GrammarModel loadGrammar() {
		URI grammarURI = URI.createPlatformPluginURI("hu.textualmodeler.parser/grammars/grammar.grammar.xmi", true);
		
		Resource r = getResourceSet().getResource(grammarURI, true);
		return (GrammarModel)r.getContents().get(0);
	}

	private static EObject getTerminal(GrammarModel g, String name){
		Set<GrammarModel> visited = new HashSet<>();
		Queue<GrammarModel> queue = new LinkedList<>();
		queue.add(g);
		visited.add(g);
		
		while(!queue.isEmpty()){
			
			GrammarModel grammar = queue.poll();
			
			for(Terminal t : grammar.getTerminals()){
				if (name.equals(t.getName())) return t;
			}
			
			for(GrammarModel gm : grammar.getImport()){
				if (!visited.contains(gm)){
					visited.add(gm);
					queue.add(gm);
				}
			}
			
		}
		
		return null;
	}
	
	@Override
	protected IFeatureResolver createFeatureResolver() {
		return new BasicFeatureResolver(getResourceSet()){
			@Override
			public Object resolve(EObject context, EStructuralFeature feature,
					Terminal terminal, String value) {
				
				if (GrammarPackage.eINSTANCE.getGrammarModel_Import().equals(feature)){
					return GrammarRegistry.getInstance().getGrammar(value);
				}
				
				if (GrammarPackage.eINSTANCE.getTerminalItem_Terminal().equals(feature)){
					if (context instanceof TerminalItem){
						EObject rule = context.eContainer();
						if (rule != null){
							GrammarModel g = (GrammarModel) rule.eContainer();
							return getTerminal(g, value);
						}
					}
				}
				
				return super.resolve(context, feature, terminal, value);
			}
		};
	}

}
