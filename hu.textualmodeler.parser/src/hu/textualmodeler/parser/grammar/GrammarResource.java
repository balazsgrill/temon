/**
 * 
 */
package hu.textualmodeler.parser.grammar;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import hu.textualmodeler.grammar.GrammarModel;
import hu.textualmodeler.parser.AbstractTextualResource;
import hu.textualmodeler.parser.IGlobalScope;
import hu.textualmodeler.parser.impl.GrammarRegistry;

/**
 * @author balazs.grill
 *
 */
public class GrammarResource extends AbstractTextualResource {
	
	public GrammarResource() {
		super();
	}
	
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

	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.AbstractTextualResource#createGlobalScope()
	 */
	@Override
	protected IGlobalScope createGlobalScope() {
		return GrammarRegistry.getInstance();
	}

}
