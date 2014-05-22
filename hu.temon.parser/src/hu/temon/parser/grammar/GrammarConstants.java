/**
 * 
 */
package hu.temon.parser.grammar;

import hu.temon.grammar.GrammarModel;
import hu.temon.grammar.Terminal;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * @author balazs.grill
 *
 */
public class GrammarConstants {

	public final Terminal STRING;
	public final Terminal BINARY_NUMBER;
	public final Terminal HEXADECIMAL_NUMBER;
	
	/**
	 * 
	 */
	GrammarConstants(ResourceSet resourceSet) {
		URI basicsURI = URI.createPlatformPluginURI("hu.temon.parser/grammars/basics.grammar.xmi", true);
		Resource basics = resourceSet.getResource(basicsURI, true);

		Terminal STRING = null;
		Terminal BINARY_NUMBER = null;
		Terminal HEXADECIMAL_NUMBER = null;
		EObject basicGrammar = basics.getContents().get(0);
		if (basicGrammar instanceof GrammarModel){
			for (Terminal terminal : ((GrammarModel) basicGrammar).getTerminals()){
				if ("STRING".equals(terminal.getName())){
					STRING = terminal;
				}
				if ("BINARY_NUMBER".equals(terminal.getName())){
					BINARY_NUMBER = terminal;
				}
				if ("HEXADECIMAL_NUMBER".equals(terminal.getName())){
					HEXADECIMAL_NUMBER = terminal;
				}
			}
		}
		this.STRING = STRING;
		this.BINARY_NUMBER = BINARY_NUMBER;
		this.HEXADECIMAL_NUMBER = HEXADECIMAL_NUMBER;
	}

}
