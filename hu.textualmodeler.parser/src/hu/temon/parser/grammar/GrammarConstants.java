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
class GrammarConstants {

	public final Terminal STRING;
	
	/**
	 * 
	 */
	public GrammarConstants(ResourceSet resourceSet) {
		URI basicsURI = URI.createPlatformPluginURI("hu.temon.parser/grammars/basics.grammar.xmi", true);
		Resource basics = resourceSet.getResource(basicsURI, true);

		Terminal STRING = null;
		EObject basicGrammar = basics.getContents().get(0);
		if (basicGrammar instanceof GrammarModel){
			for (Terminal terminal : ((GrammarModel) basicGrammar).getTerminals()){
				if ("STRING".equals(terminal.getName())){
					STRING = terminal;
				}
			}
		}
		this.STRING = STRING;
		
	}

}
