/**
 * 
 */
package hu.textualmodeler.parser.impl.earley.map;

import hu.textualmodeler.ast.AstFactory;
import hu.textualmodeler.ast.FeatureSetCompositeNode;
import hu.textualmodeler.ast.Node;
import hu.textualmodeler.grammar.NonTerminalItem;
import hu.textualmodeler.parser.impl.earley.EarleyState;

/**
 * @author balazs.grill
 *
 */
public class NonTerminalMapping extends ParseMapping<NonTerminalItem> {

	private final EarleyState state;
	
	/**
	 * 
	 */
	public NonTerminalMapping(NonTerminalItem item, EarleyState state) {
		super(item);
		this.state = state;
	}

	public EarleyState getState() {
		return state;
	}

	@Override
	public Node toAST() {
		NonTerminalItem item = getItem();
		String featureName = item.getFeatureName();
		
		if (featureName != null){
			FeatureSetCompositeNode node = AstFactory.eINSTANCE.createFeatureSetCompositeNode();
			node.setFeatureName(featureName);
			state.fillNode(node);
			return node;
		}
		
		return state.getSteps(); 
	}
	
}
