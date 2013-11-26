package hu.textualmodeler.parser.test;

import hu.textualmodeler.grammar.GrammarModel;
import hu.textualmodeler.parser.impl.GrammarRegistry;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
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
	
	@Test
	public void loadPeople(){
		ResourceSet rs = new ResourceSetImpl();
		Resource r = rs.getResource(URI.createPlatformPluginURI(ParserTests.PLUGIN_ID+"/some.people", true), true);
		Assert.assertEquals(1, r.getContents().size());
		
		Assert.assertEquals(0, r.getErrors().size());
	}
	
}
