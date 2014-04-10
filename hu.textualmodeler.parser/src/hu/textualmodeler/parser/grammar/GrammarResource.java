/**
 * 
 */
package hu.textualmodeler.parser.grammar;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import hu.textualmodeler.grammar.GrammarModel;
import hu.textualmodeler.grammar.Terminal;
import hu.textualmodeler.parser.AbstractTextualResource;
import hu.textualmodeler.parser.IFeatureResolver;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;

/**
 * @author balazs.grill
 *
 */
public class GrammarResource extends AbstractTextualResource {
	
	private GrammarConstants constants = null;
	
	public GrammarResource(URI uri){
		super(uri);
	}
	
	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.AbstractTextualResource#loadGrammar()
	 */
	@Override
	protected GrammarModel loadGrammar() {
		URI grammarURI = URI.createPlatformPluginURI("hu.textualmodeler.parser/grammars/grammar.grammar.xmi", true);
		Resource r = getResourceSet().getResource(grammarURI, true);
		constants = new GrammarConstants(getResourceSet());
		
		return (GrammarModel)r.getContents().get(0);
	}

	static EObject getTerminal(GrammarModel g, String name){
		Set<GrammarModel> visited = new HashSet<>();
		Queue<GrammarModel> queue = new LinkedList<>();
		queue.add(g);
		visited.add(g);
		
		while(!queue.isEmpty()){
			
			GrammarModel grammar = queue.poll();
			
			for(Terminal t : grammar.getTerminals()){
				if (name.equals(t.getName())) return t;
			}
			
			for(GrammarModel gm : grammar.getImport()){
				if (!visited.contains(gm)){
					visited.add(gm);
					queue.add(gm);
				}
			}
			
		}
		
		return null;
	}
	
	@Override
	protected IFeatureResolver createFeatureResolver() {
		return new GrammarFeatureResolver(getResourceSet(), constants);
	}

	static EClass findEClass(String EClassURI){
		int i = EClassURI.indexOf('#');
		String nsURI = EClassURI.substring(0, i);
		String name = EClassURI.substring(i+1);
		ExtendedMetaData metaData = new BasicExtendedMetaData(Registry.INSTANCE);
		return (EClass)metaData.getType(nsURI, name);
	}
	
}
