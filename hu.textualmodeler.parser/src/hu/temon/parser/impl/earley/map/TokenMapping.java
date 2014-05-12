/**
 * 
 */
package hu.temon.parser.impl.earley.map;

import hu.temon.ast.AstFactory;
import hu.temon.ast.FeatureSetTerminalNode;
import hu.temon.ast.Node;
import hu.temon.ast.TerminalNode;
import hu.temon.grammar.TerminalItem;
import hu.temon.tokens.Token;

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
		
		node.setTerminal(token.getTerminal());
		node.setContent(token.getValue());
		node.setStart(token.getStart());
		node.setLength(token.getLength());
		
		return node;
	}
	
}
