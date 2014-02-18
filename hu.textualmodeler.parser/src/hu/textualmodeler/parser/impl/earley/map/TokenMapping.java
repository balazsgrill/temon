/**
 * 
 */
package hu.textualmodeler.parser.impl.earley.map;

import hu.textualmodeler.ast.AstFactory;
import hu.textualmodeler.ast.FeatureSetTerminalNode;
import hu.textualmodeler.ast.Node;
import hu.textualmodeler.ast.TerminalNode;
import hu.textualmodeler.grammar.TerminalItem;
import hu.textualmodeler.tokens.Token;

/**
 * @author balazs.grill
 *
 */
public class TokenMapping extends ParseMapping<TerminalItem> {

	private final Token token;
	
	/**
	 * @param item
	 */
	public TokenMapping(TerminalItem item, Token token) {
		super(item);
		this.token = token;
	}

	public Token getToken() {
		return token;
	}
	
	@Override
	public Node toAST() {
		String featureName = getItem().getFeatureName();
		
		TerminalNode node = null;
		
		if (featureName != null){
			FeatureSetTerminalNode fnode = AstFactory.eINSTANCE.createFeatureSetTerminalNode();
			node = fnode;
			fnode.setFeatureName(featureName);
		}else{
			node = AstFactory.eINSTANCE.createTerminalNode();
		}
		
		node.setContent(token.getValue());
		node.setStart(token.getStart());
		node.setLength(token.getLength());
		
		return node;
	}
	
}
