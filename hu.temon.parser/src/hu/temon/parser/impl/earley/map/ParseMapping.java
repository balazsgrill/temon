/**
 * 
 */
package hu.temon.parser.impl.earley.map;

import hu.temon.ast.AstFactory;
import hu.temon.ast.FeatureSetPushElement;
import hu.temon.ast.FeatureSetValue;
import hu.temon.ast.InsertedTerminalNode;
import hu.temon.ast.Node;
import hu.temon.ast.PushElement;
import hu.temon.ast.RemovedTerminalNode;
import hu.temon.grammar.NonTerminalItem;
import hu.temon.grammar.Pop;
import hu.temon.grammar.Push;
import hu.temon.grammar.RuleItem;
import hu.temon.grammar.SetValue;
import hu.temon.grammar.TerminalItem;
import hu.temon.parser.impl.earley.EarleyState;
import hu.temon.tokens.Token;

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
					
					p.setEclass(((Push) item).getEclass());
					
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
