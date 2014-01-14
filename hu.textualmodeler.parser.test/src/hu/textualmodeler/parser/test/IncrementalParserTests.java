/**
 * 
 */
package hu.textualmodeler.parser.test;

import hu.textualmodeler.grammar.GrammarModel;
import hu.textualmodeler.parser.IGrammar;
import hu.textualmodeler.parser.IParserContext;
import hu.textualmodeler.parser.grammar.GrammarRegistry;
import hu.textualmodeler.parser.impl.Grammar;
import hu.textualmodeler.parser.tokenizer.SimpleTokenizer;
import hu.textualmodeler.query.STARTMatch;
import hu.textualmodeler.query.STARTMatcher;
import hu.textualmodeler.tokens.Token;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.incquery.databinding.runtime.api.IncQueryObservables;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.junit.Test;

/**
 * @author balazs.grill
 *
 */
public class IncrementalParserTests {

	private final String testInput1 = 
			"man Adam;\n"
			+ "woman Eve;\n"
			+ "man Abel Adam Eve;\n"
			+ "man Cain Adam Eve;";
	
	private final String testInput2 = 
			"man Adam;\n"
			+ "woman Eve;\n"
			+ "man Abel Adam Eve;\n"
			+ "man Cain Adam Eve;;";
	
	private final String infixInput1 = "3+4*a+6*b";
	private final String infixInput2 = "3+4*a+6*+b";
	
	@Test
	public void validInput() throws IncQueryException{
		GrammarModel peopleGrammar = GrammarRegistry.getInstance().getGrammar("people");
		IGrammar grammar = new Grammar(peopleGrammar);
		
		IParserContext context = new StdErrContext();
		
		SimpleTokenizer tokenizer = new SimpleTokenizer(context, grammar);
		
		Token token = tokenizer.update(testInput1);
		
		ResourceSet rs = peopleGrammar.eResource().getResourceSet();
		Resource r = rs.createResource(URI.createURI("http://inmemory.test.xmi"));
		
		r.getContents().add(token);
		
		IObservableList list = IncQueryObservables.observeMatchesAsList(STARTMatcher.on(IncQueryEngine.on(rs)));
		
		boolean ok = false;
		for(Object match : list){
			if (checkMatch(match, token)){
				ok = true;
			}
		}
		
		org.junit.Assert.assertTrue(ok);
		
	}

	@Test
	public void invalidInput() throws IncQueryException{
		GrammarModel peopleGrammar = GrammarRegistry.getInstance().getGrammar("people");
		IGrammar grammar = new Grammar(peopleGrammar);
		
		IParserContext context = new StdErrContext();
		
		SimpleTokenizer tokenizer = new SimpleTokenizer(context, grammar);
		
		Token token = tokenizer.update(testInput2);
		
		ResourceSet rs = peopleGrammar.eResource().getResourceSet();
		Resource r = rs.createResource(URI.createURI("http://inmemory.test.xmi"));
		
		r.getContents().add(token);
		
		IObservableList list = IncQueryObservables.observeMatchesAsList(STARTMatcher.on(IncQueryEngine.on(rs)));
		
		boolean ok = false;
		for(Object match : list){
			if (checkMatch(match, token)){
				ok = true;
			}
		}
		
		org.junit.Assert.assertFalse(ok);
		
	}
	
	@Test
	public void repairingInput() throws IncQueryException{
		GrammarModel peopleGrammar = GrammarRegistry.getInstance().getGrammar("people");
		IGrammar grammar = new Grammar(peopleGrammar);
		
		IParserContext context = new StdErrContext();
		
		SimpleTokenizer tokenizer = new SimpleTokenizer(context, grammar);
		
		Token token = tokenizer.update(testInput2);
		
		ResourceSet rs = peopleGrammar.eResource().getResourceSet();
		Resource r = rs.createResource(URI.createURI("http://inmemory.test.xmi"));
		
		r.getContents().add(token);
		
		IObservableList list = IncQueryObservables.observeMatchesAsList(STARTMatcher.on(IncQueryEngine.on(rs)));
		
		boolean ok = false;
		for(Object match : list){
			if (checkMatch(match, token)){
				ok = true;
			}
		}
		
		org.junit.Assert.assertFalse(ok);
		
		token = tokenizer.update(testInput1);
		if (!r.getContents().get(0).equals(token)){
			r.getContents().clear();
			r.getContents().add(token);
		}
		
		ok = false;
		for(Object match : list){
			if (checkMatch(match, token)){
				ok = true;
			}
		}
		
		org.junit.Assert.assertTrue(ok);
	}
	
	@Test
	public void testInfix() throws IncQueryException{
		GrammarModel peopleGrammar = GrammarRegistry.getInstance().getGrammar("infix");
		IGrammar grammar = new Grammar(peopleGrammar);
		
		IParserContext context = new StdErrContext();
		
		SimpleTokenizer tokenizer = new SimpleTokenizer(context, grammar);
		
		Token token = tokenizer.update(infixInput2);
		
		ResourceSet rs = peopleGrammar.eResource().getResourceSet();
		Resource r = rs.createResource(URI.createURI("http://inmemory.test.xmi"));
		
		r.getContents().add(token);
		
		IObservableList list = IncQueryObservables.observeMatchesAsList(hu.textualmodeler.query.infix.STARTMatcher.on(IncQueryEngine.on(rs)));
		
		boolean ok = false;
		for(Object match : list){
			if (checkMatch(match, token)){
				ok = true;
			}
		}
		
		org.junit.Assert.assertFalse(ok);
		
		token = tokenizer.update(infixInput1);
		if (!r.getContents().get(0).equals(token)){
			r.getContents().clear();
			r.getContents().add(token);
		}
		
		ok = false;
		for(Object match : list){
			if (checkMatch(match, token)){
				ok = true;
			}
		}
		
		org.junit.Assert.assertTrue(ok);
	}
	
	private boolean checkMatch(Object match, Token first){
		if (match instanceof hu.textualmodeler.query.infix.STARTMatch){
			return (first.equals(((hu.textualmodeler.query.infix.STARTMatch) match).getFirst()));
		}
		if (match instanceof STARTMatch){
			return (first.equals(((STARTMatch) match).getFirst()));
		}
		return false;
	}
	
}
