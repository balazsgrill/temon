package hu.textualmodeler.parser.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({GrammarLoadingTests.class, TokenizerTests.class, IncrementalParserTests.class})
public class ParserTests {

	public static final String PLUGIN_ID = "hu.textualmodeler.parser.test";
	
}
