/**
 * 
 */
package hu.textualmodeler.parser.incremental;

import java.util.HashMap;
import java.util.Map;

import hu.textualmodeler.grammar.NonTerminalItem;
import hu.textualmodeler.grammar.Rule;
import hu.textualmodeler.grammar.RuleItem;
import hu.textualmodeler.grammar.SyntaxItem;
import hu.textualmodeler.grammar.TerminalItem;
import hu.textualmodeler.parser.IGrammar;
import hu.textualmodeler.tokens.TokensPackage;

import org.eclipse.incquery.patternlanguage.emf.eMFPatternLanguage.ClassType;
import org.eclipse.incquery.patternlanguage.emf.eMFPatternLanguage.EMFPatternLanguageFactory;
import org.eclipse.incquery.patternlanguage.patternLanguage.CompareConstraint;
import org.eclipse.incquery.patternlanguage.patternLanguage.CompareFeature;
import org.eclipse.incquery.patternlanguage.patternLanguage.LocalVariable;
import org.eclipse.incquery.patternlanguage.patternLanguage.PathExpressionConstraint;
import org.eclipse.incquery.patternlanguage.patternLanguage.PathExpressionHead;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.patternlanguage.patternLanguage.PatternBody;
import org.eclipse.incquery.patternlanguage.patternLanguage.PatternLanguageFactory;
import org.eclipse.incquery.patternlanguage.patternLanguage.PatternModel;
import org.eclipse.incquery.patternlanguage.patternLanguage.ValueReference;
import org.eclipse.incquery.patternlanguage.patternLanguage.Variable;
import org.eclipse.incquery.patternlanguage.patternLanguage.VariableReference;
import org.eclipse.incquery.patternlanguage.patternLanguage.VariableValue;

/**
 * @author balazs.grill
 *
 */
public class RuleToPatternCompiler {

	private static Variable createParam(String name){
		Variable var = PatternLanguageFactory.eINSTANCE.createVariable();
		var.setName(name);
		ClassType ct = EMFPatternLanguageFactory.eINSTANCE.createClassType();
		ct.setClassname(TokensPackage.eINSTANCE.getTokenValue());
		var.setType(ct);
		
		return var;
	}
	
	public static PatternModel compile(IGrammar grammar){
		PatternModel result = PatternLanguageFactory.eINSTANCE.createPatternModel();
		
		Map<String, Pattern> patterns = new HashMap<>();
		
		for(Rule rule : grammar.rules()){
			
			Pattern pattern = patterns.get(rule.getNonTerminal());
			Variable first = null;
			Variable last = null; 
			if (pattern == null){
				pattern = PatternLanguageFactory.eINSTANCE.createPattern();
				pattern.setName(rule.getNonTerminal());
				
				first = createParam("first");
				last = createParam("last");
				pattern.getParameters().add(first);
				pattern.getParameters().add(last);
				
				patterns.put(rule.getNonTerminal(), pattern);
			}else{
				first = pattern.getParameters().get(0);
				last = pattern.getParameters().get(1);
			}
			
			PatternBody body = PatternLanguageFactory.eINSTANCE.createPatternBody();
			pattern.getBodies().add(body);
			
			Variable current = first;
			int i = 0;
			
			for(RuleItem item : rule.getBody()){
				
				if (item instanceof SyntaxItem){

					LocalVariable next = PatternLanguageFactory.eINSTANCE.createLocalVariable();
					next.setName("token"+i);
					
					if (item instanceof TerminalItem){

						PathExpressionConstraint constr = PatternLanguageFactory.eINSTANCE.createPathExpressionConstraint();
						PathExpressionHead head = PatternLanguageFactory.eINSTANCE.createPathExpressionHead();
						constr.setHead(head);
						
						//head.s
						
						body.getConstraints().add(constr);
						
					}else
					if (item instanceof NonTerminalItem){

					}
					
					i++;
					current = next;
				}
				
			}
			
			CompareConstraint constr = PatternLanguageFactory.eINSTANCE.createCompareConstraint();
			constr.setFeature(CompareFeature.EQUALITY);
			constr.setLeftOperand(ref(current));
			constr.setRightOperand(ref(last));
		}
		
		return result;
	}
	
	private static ValueReference ref(Variable v){
		VariableValue vv = PatternLanguageFactory.eINSTANCE.createVariableValue();
		VariableReference vr = PatternLanguageFactory.eINSTANCE.createVariableReference();
		vr.setVariable(v);
		vv.setValue(vr);
		return vv;
	}
	
}
