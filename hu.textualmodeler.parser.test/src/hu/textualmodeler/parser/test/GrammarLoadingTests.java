package hu.textualmodeler.parser.test;

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
		Assert.assertNotNull(GrammarRegistry.getInstance().getGrammar("grammar"));
	}

}
