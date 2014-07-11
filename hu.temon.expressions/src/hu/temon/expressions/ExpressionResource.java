/**
 * 
 */
package hu.temon.expressions;

import org.eclipse.emf.common.util.URI;

import hu.temon.grammar.GrammarModel;
import hu.temon.parser.AbstractTextualResource;
import hu.temon.parser.BasicFeatureResolver;
import hu.temon.parser.IFeatureResolver;
import hu.temon.parser.grammar.GrammarRegistry;

/**
 * @author balazs.grill
 *
 */
public class ExpressionResource extends AbstractTextualResource {

	public ExpressionResource(URI uri) {
		super(uri);
	}

	/* (non-Javadoc)
	 * @see hu.temon.parser.AbstractTextualResource#loadGrammar()
	 */
	@Override
	protected GrammarModel loadGrammar() {
		return GrammarRegistry.getInstance().getGrammar("expressions");
	}

	/* (non-Javadoc)
	 * @see hu.temon.parser.AbstractTextualResource#createFeatureResolver()
	 */
	@Override
	protected IFeatureResolver createFeatureResolver() {
		return new BasicFeatureResolver(this);
	}

}
