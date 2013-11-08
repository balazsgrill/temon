package hu.textualmodeler.parser.test;

import hu.textualmodeler.grammar.GrammarModel;
import hu.textualmodeler.parser.impl.GrammarRegistry;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GrammarLoadingTests {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void loadGrammarRegistry() {
		Assert.assertNotNull(GrammarRegistry.getInstance().getGrammar("basics"));
	}

	@Test
	public void loadPeopleGrammar(){
		GrammarModel peopleGrammar = GrammarRegistry.getInstance().getGrammar("people"); 
		Assert.assertNotNull(peopleGrammar);
		Assert.assertEquals("people", peopleGrammar.getName());
		
		Assert.assertTrue(peopleGrammar.getImport().size() == 1);
		Assert.assertEquals("basics", peopleGrammar.getImport().get(0).getName());
	}
	
}
