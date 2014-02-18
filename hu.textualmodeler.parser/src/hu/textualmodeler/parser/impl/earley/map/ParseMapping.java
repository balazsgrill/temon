/**
 * 
 */
package hu.textualmodeler.parser.impl.earley.map;

import hu.textualmodeler.ast.AstFactory;
import hu.textualmodeler.ast.FeatureSetPushElement;
import hu.textualmodeler.ast.FeatureSetValue;
import hu.textualmodeler.ast.InsertedTerminalNode;
import hu.textualmodeler.ast.Node;
import hu.textualmodeler.ast.PushElement;
import hu.textualmodeler.ast.RemovedTerminalNode;
import hu.textualmodeler.grammar.NonTerminalItem;
import hu.textualmodeler.grammar.Pop;
import hu.textualmodeler.grammar.Push;
import hu.textualmodeler.grammar.RuleItem;
import hu.textualmodeler.grammar.SetValue;
import hu.textualmodeler.grammar.TerminalItem;
import hu.textualmodeler.parser.impl.earley.EarleyState;
import hu.textualmodeler.tokens.Token;

/**
 * @author balazs.grill
 *
 */
public abstract class ParseMapping<T extends RuleItem> {

	public static <E extends RuleItem> ParseMapping<E> create(E item){
		return new ParseMapping<E>(item) {
			
			@Override
			public Node toAST() {
				E item = getItem();
				if (item instanceof Pop){
					return AstFactory.eINSTANCE.createPopElement();
				}
				if (item instanceof Push){
					String feature = ((Push) item).getFeatureName();
					
					PushElement p = null;
					if (feature != null){
						FeatureSetPushElement fp = AstFactory.eINSTANCE.createFeatureSetPushElement();
						p = fp;
						fp.setFeatureName(feature);;
					}else{
						p = AstFactory.eINSTANCE.createPushElement();
					}
					
					p.setEclassURI(((Push) item).getEclassURI());
					
					return p;
				}
				if (item instanceof SetValue){
					FeatureSetValue node = AstFactory.eINSTANCE.createFeatureSetValue();
					node.setFeatureName(((SetValue) item).getFeatureName());
					node.setValue(((SetValue) item).getValue());
					return node;
				}
				throw new IllegalArgumentException("Unsupported item: "+item);
			}
			
		};
	}
	
	public static NonTerminalMapping create(NonTerminalItem item, EarleyState state){
		return new NonTerminalMapping(item, state);
	}
	
	public static TokenMapping create(TerminalItem item, Token token){
		return new TokenMapping(item, token);
	}
	
	public static ParseMapping<TerminalItem> missingTerminal(TerminalItem item){
		return new ParseMapping<TerminalItem>(item) {
			@Override
			public boolean isTokenListModification() {
				return true;
			}
			
			@Override
			public Node toAST() {
				InsertedTerminalNode node = AstFactory.eINSTANCE.createInsertedTerminalNode();
				node.setTerminal(getItem().getTerminal());
				
				return node;
			}
		};
	}
	
	public static TokenMapping removedToken(Token token){
		return new TokenMapping(null, token){
			@Override
			public boolean isTokenListModification() {
				return true;
			}
			
			@Override
			public Node toAST() {
				Token token = getToken();
				RemovedTerminalNode node = AstFactory.eINSTANCE.createRemovedTerminalNode();
				node.setStart(token.getStart());
				node.setLength(token.getLength());
				node.setContent(token.getValue());
				node.setTerminal(token.getTerminal());
				
				return node;
			}
		};
	}
	
	private final T item;
	
	public ParseMapping(T item) {
		this.item = item;
	}
	
	public T getItem(){
		return item;
	}
	
	public boolean isTokenListModification(){
		return false;
	}
	
	public abstract Node toAST();
	
}
