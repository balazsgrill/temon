/**
 * 
 */
package hu.textualmodeler.parser.impl.earley;

import hu.textualmodeler.ast.AstFactory;
import hu.textualmodeler.ast.CompositeNode;
import hu.textualmodeler.ast.FeatureSetCompositeNode;
import hu.textualmodeler.ast.FeatureSetPushElement;
import hu.textualmodeler.ast.FeatureSetTerminalNode;
import hu.textualmodeler.ast.FeatureSetValue;
import hu.textualmodeler.ast.InsertedFeatureSetTerminalNode;
import hu.textualmodeler.ast.InsertedTerminalNode;
import hu.textualmodeler.ast.Node;
import hu.textualmodeler.ast.PopElement;
import hu.textualmodeler.ast.PushElement;
import hu.textualmodeler.ast.RemovedTerminalNode;
import hu.textualmodeler.ast.TerminalNode;
import hu.textualmodeler.ast.WhitespaceNode;
import hu.textualmodeler.grammar.NonTerminalItem;
import hu.textualmodeler.grammar.Pop;
import hu.textualmodeler.grammar.Push;
import hu.textualmodeler.grammar.Rule;
import hu.textualmodeler.grammar.RuleItem;
import hu.textualmodeler.grammar.SetValue;
import hu.textualmodeler.grammar.SyntaxItem;
import hu.textualmodeler.grammar.Terminal;
import hu.textualmodeler.grammar.TerminalItem;
import hu.textualmodeler.parser.IGrammar;
import hu.textualmodeler.parser.IParserInput;
import hu.textualmodeler.tokens.Token;
import hu.textualmodeler.tokens.TokenList;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * @author balazs.grill
 *
 */
public class EarleyState {

	private final Rule currentRule;
	/* Current position in rule*/
	private final int index;
	
	/* Current position in input */
	private final int position;
	private final CompositeNode steps;
	private final int origin;
	
	public static EarleyState create(Rule startRule, int startPosition){
		CompositeNode root = AstFactory.eINSTANCE.createCompositeNode();
		root.setNonterminal(startRule);
		return new EarleyState(startRule, 0, startPosition, root, -1);
	}
	
	@Override
	public int hashCode() {
		return currentRule.hashCode() + index + position;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof EarleyState){
			EarleyState other = (EarleyState)obj;
			if (other.position != position) return false;
			if (other.index != index) return false;
			if (!currentRule.equals(other.currentRule)) return false;
			return other.origin == origin;
		}
		return super.equals(obj);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		sb.append(position);
		sb.append(":");
		sb.append(origin);
		sb.append("] ");
		int index = 0;
		for(RuleItem item : currentRule.getBody()){
			if (index == this.index){
				sb.append("@ ");
			}
			if (item instanceof NonTerminalItem){
				sb.append("<");sb.append(((NonTerminalItem) item).getNonTerminal());sb.append("> ");
			}
			if (item instanceof TerminalItem){
				Terminal term = ((TerminalItem) item).getTerminal();
				if (term == null){
					sb.append("[UNKNOWN TERMINAL]");
				}else{
					sb.append(term.getName());
				}
				sb.append(" ");
			}
			if (item instanceof Push){
				sb.append("{ ");
			}
			if (item instanceof Pop){
				sb.append("} ");
			}
			if (item instanceof SetValue){
				sb.append("#SETVALUE# ");
			}
			index++;
		}
		if (this.index == currentRule.getBody().size()){
			sb.append("@");
		}
		return sb.toString();
	}
	
	/**
	 * 
	 */
	private EarleyState(Rule currentRule, int index, int position, CompositeNode steps, int origin) {
		Assert.isNotNull(steps);
		this.currentRule = currentRule;
		
		this.index = index;
		this.position = position;
		this.steps = steps;
		this.origin = origin;
	}
	
	public boolean silent(){
		return isSilent(nextItem(currentRule, index));
	}
	
	public EarleyState consumeSilent(){
		if (silent()){
			RuleItem item = getNextItem();
			CompositeNode steps = EcoreUtil.copy(this.steps);
			if (item instanceof Pop){
				PopElement n = AstFactory.eINSTANCE.createPopElement();
				steps.getChildren().add(n);
			}else
			if (item instanceof Push){
				Push push = (Push)item;
				PushElement n = null;
				if (push.getFeatureName() != null && !push.getFeatureName().trim().isEmpty()){
					n = AstFactory.eINSTANCE.createFeatureSetPushElement();
					((FeatureSetPushElement)n).setFeatureName(push.getFeatureName());
				}else{
					n = AstFactory.eINSTANCE.createPushElement();
				}
				n.setEclassURI(push.getEclassURI());
				steps.getChildren().add(n);
			}else
			if (item instanceof SetValue){
				SetValue setValue = (SetValue)item;
				FeatureSetValue n = AstFactory.eINSTANCE.createFeatureSetValue();
				n.setFeatureName(setValue.getFeatureName());
				n.setValue(setValue.getValue());
				steps.getChildren().add(n);
			}else{
				throw new RuntimeException("Unexpected silent element: "+item);
			}
			return new EarleyState(currentRule, index+1, position, steps, origin);
		}
		return null;
	}
	
	private static boolean isSilent(RuleItem item){
		return (item != null) && !(item instanceof SyntaxItem);
	}
	
	public Rule getCurrentRule() {
		return currentRule;
	}
	
	public int getIndex() {
		return index;
	}
	
	public int getPosition() {
		return position;
	}
	
	public CompositeNode getSteps() {
		return steps;
	}
	
	public int getOrigin() {
		return origin;
	}

	private static RuleItem nextItem(Rule rule, int index){
		final EList<RuleItem> body = rule.getBody();
		if (body.size() > index){
			return body.get(index);
		}
		return null;
	}
	
	public RuleItem getNextItem(){
		return nextItem(currentRule, index);
	}
	
	public boolean prediction(){
		return getNextItem() instanceof NonTerminalItem;
	}
	
	public boolean completion(){
		return getNextItem() == null;
	}
	
	public boolean scanning(){
		return getNextItem() instanceof TerminalItem;
	}
	
	public List<EarleyState> predict(int level, IGrammar grammar){
		RuleItem next = getNextItem();
		if (next instanceof NonTerminalItem){
			NonTerminalItem nonterm = (NonTerminalItem)next;
			
			List<EarleyState> predicted = new LinkedList<EarleyState>();
			
			if (nonterm.isOptional()){
				/* Skip prediction */
				predicted.add(new EarleyState(currentRule, index+1, position, steps, origin));
			}
			
			Collection<Rule> rules = grammar.getRule(((NonTerminalItem) next).getNonTerminal());
			
			for(Rule rule : rules){
				CompositeNode steps = null;
				if (nonterm.getFeatureName() != null){
					steps = AstFactory.eINSTANCE.createFeatureSetCompositeNode();
					((FeatureSetCompositeNode)steps).setFeatureName(nonterm.getFeatureName());
				}else{
					steps = AstFactory.eINSTANCE.createCompositeNode();
				}
				
				steps.setNonterminal(rule);
				predicted.add(new EarleyState(rule, 0, position, steps, level));
			}
			return predicted;
		}
		return Collections.emptyList();
	}
	
	public List<EarleyState> complete(ParserTable table){
		if (completion() && origin != -1){
			List<EarleyState> completions = new LinkedList<EarleyState>();
			ParserLevel originLevel = table.get(origin);
			
			for(EarleyState p : originLevel.getStates()){
				if (p.prediction()){
					NonTerminalItem nonterm = ((NonTerminalItem)p.getNextItem());
					if ((nonterm.getNonTerminal().equals(currentRule.getNonTerminal()))){
						CompositeNode parentSteps = EcoreUtil.copy(p.steps);
						CompositeNode childSteps = null;
						if (nonterm.getFeatureName() != null && !(steps instanceof FeatureSetCompositeNode)){
							FeatureSetCompositeNode nchild = AstFactory.eINSTANCE.createFeatureSetCompositeNode();
							nchild.setFeatureName(nonterm.getFeatureName());
							childSteps = nchild;
							childSteps.setNonterminal(steps.getNonterminal());
							childSteps.getChildren().addAll(EcoreUtil.copyAll(steps.getChildren()));
						}else{
							childSteps = EcoreUtil.copy(steps);
						}
						
//						if (nonterm.getFeatureName() != null && !nonterm.getFeatureName().trim().isEmpty()){
//							SetContainmentFeature scf = AstFactory.eINSTANCE.createSetContainmentFeature();
//							scf.setFeatureName(nonterm.getFeatureName());
//							 
//							parentSteps.getChildren().add(scf);
//						}
						
						parentSteps.getChildren().add(childSteps);
						
						completions.add(new EarleyState(p.getCurrentRule(), p.index+1, position, parentSteps, p.origin));
						if (nonterm.isMany()){
							completions.add(new EarleyState(p.getCurrentRule(), p.index, position, parentSteps, p.origin));
						}
					}
				}
				
			}
			
			return completions;
		}
		return Collections.emptyList();
	}
	
	public boolean isCompleted(){
		return completion() && origin == -1;
	}
	
	public boolean hasHidden(IParserInput input){
		return !input.bypassHidden(position).isEmpty();
	}
	
	public EarleyState scanHidden(TokenList input){
		List<WhitespaceNode> hiddenNodes = new LinkedList<>();
		int i = position;
		while(input.getTokens().size() > i && input.getTokens().get(i).getTerminal().isHide()){
			Token t = input.getTokens().get(i);
			WhitespaceNode wsn = AstFactory.eINSTANCE.createWhitespaceNode();
			wsn.setStart(t.getStart());
			wsn.setLength(t.getLength());
			wsn.setTerminal(t.getTerminal());
			hiddenNodes.add(wsn);
			i++;
		}
		if (!hiddenNodes.isEmpty()){
			CompositeNode steps = EcoreUtil.copy(this.steps);
			
			steps.getChildren().addAll(hiddenNodes);
			
			int position = this.position + hiddenNodes.size();
			return new EarleyState(currentRule, index, position, steps, origin);
		}
		
		return this;
	}
	
	private static boolean isMatch(Terminal match, Terminal next){
		if (match.equals(next)) return true;
		Terminal sup = match.getSuperTerminal();
		if (sup != null){
			return isMatch(sup, next);
		}
		return false;
	}
	
	public List<EarleyState> scan(TokenList input, IGrammar grammar){
		if (scanning()){
			RuleItem item = getNextItem();
			
			if (item instanceof TerminalItem){
				TerminalItem terminal = (TerminalItem)item;
				
				int position = this.position;
				
						
				List<EarleyState> states = new LinkedList<EarleyState>();

				Token match = input.getTokens().size() > position ? input.getTokens().get(position) : null;
				if (match != null){
					if (isMatch(match.getTerminal(), terminal.getTerminal())){

						CompositeNode steps = EcoreUtil.copy(this.steps);
						String feature = terminal.getFeatureName();
						TerminalNode node = null;
						if (feature != null){
							node = AstFactory.eINSTANCE.createFeatureSetTerminalNode();
							((FeatureSetTerminalNode)node).setFeatureName(feature);
						}else{
							node = AstFactory.eINSTANCE.createTerminalNode();
						}
						node.setContent(match.getValue());
						node.setTerminal(match.getTerminal());
						node.setStart(match.getStart());
						node.setLength(match.getLength());

						//steps.getChildren().addAll(EcoreUtil.copyAll(hiddenNodes));

						steps.getChildren().add(node);

						states.add(new EarleyState(currentRule, index+1, position+1, steps, origin));
						if (terminal.isMany()){
							states.add(new EarleyState(currentRule, index, position+1, steps, origin));
						}

					}else{
						if (terminal.isOptional()){
							states.add(new EarleyState(currentRule, index+1, position, steps, origin));
						}else{
							String feature = terminal.getFeatureName();

							// Correction attempt: Remove unexpected terminal
							Token wrongMatch = match;
							if (wrongMatch != null){
								CompositeNode steps = EcoreUtil.copy(this.steps);
								RemovedTerminalNode node = AstFactory.eINSTANCE.createRemovedTerminalNode();
								node.setContent(wrongMatch.getValue());
								node.setTerminal(wrongMatch.getTerminal());
								node.setStart(wrongMatch.getStart());
								node.setLength(wrongMatch.getLength());
								steps.getChildren().add(node);

								states.add(new EarleyState(currentRule, index, position+1, steps, origin));
							}

							// Correction attempt: Insert expected terminal
							InsertedTerminalNode node = null;
							if (feature != null){
								node = AstFactory.eINSTANCE.createInsertedFeatureSetTerminalNode();
								((InsertedFeatureSetTerminalNode)node).setFeatureName(feature);
							}else{
								node = AstFactory.eINSTANCE.createInsertedTerminalNode();
							}

							node.setTerminal(terminal.getTerminal());
							node.setStart(position);
							node.setLength(0);

							CompositeNode steps = EcoreUtil.copy(this.steps);
							steps.getChildren().add(node);
							states.add(new EarleyState(currentRule, index+1, position, steps, origin));
						}
					}
				}
				return states;
			}
		}
		return Collections.emptyList();
	}
	
	public List<EarleyState> scanAfterFinish(TokenList input, IGrammar grammar){
		// Correction attempt: Remove unexpected terminal
		List<EarleyState> states = new LinkedList<>();
		
		Token wrongMatch = input.getTokens().get(position);
		if (wrongMatch != null){
			CompositeNode steps = EcoreUtil.copy(this.steps);
			RemovedTerminalNode node = AstFactory.eINSTANCE.createRemovedTerminalNode();
			node.setContent(wrongMatch.getValue());
			node.setTerminal(wrongMatch.getTerminal());
			node.setStart(wrongMatch.getStart());
			node.setLength(wrongMatch.getLength());
			steps.getChildren().add(node);
			
			states.add(new EarleyState(currentRule, index, position+1, steps, origin));
		}
		
		return states;
	}
	
	public boolean lastScanFailed(){
		if (!steps.getChildren().isEmpty()){
			Node lastNode = steps.getChildren().get(steps.getChildren().size()-1); 
			return (lastNode instanceof InsertedTerminalNode) || (lastNode instanceof RemovedTerminalNode);
		}
		return false;
	}
	
}
