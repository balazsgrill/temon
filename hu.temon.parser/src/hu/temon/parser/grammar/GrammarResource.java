/**
 * 
 */
package hu.temon.parser.grammar;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import hu.temon.grammar.GrammarModel;
import hu.temon.grammar.Terminal;
import hu.temon.parser.AbstractTextualResource;
import hu.temon.parser.IFeatureResolver;
import hu.temon.parser.MergedFeatureResolver;

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
	
	public static final String OPTION_ADDITIONAL_FEATURE_RESOLVER = GrammarResource.class.getCanonicalName()+".additional.feature.resolver";
	
	private IFeatureResolver additionalResolver = null;
	
	public GrammarResource(URI uri){
		super(uri);
	}
	
	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options)
			throws IOException {
		
		if (options != null){
			Object afr = options.get(OPTION_ADDITIONAL_FEATURE_RESOLVER);
			if (afr instanceof IFeatureResolver){
				additionalResolver = (IFeatureResolver)afr;
			}
		}
		
		super.doLoad(inputStream, options);
	}
	
	/* (non-Javadoc)
	 * @see hu.temon.parser.AbstractTextualResource#loadGrammar()
	 */
	@Override
	protected GrammarModel loadGrammar() {
		URI grammarURI = URI.createPlatformPluginURI("hu.temon.parser/grammars/grammar.grammar.xmi", true);
		Resource r = getResourceSet().getResource(grammarURI, true);
		
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
		IFeatureResolver grammarResolver = new GrammarFeatureResolver(getResourceSet());
		if (additionalResolver != null){
			grammarResolver = new MergedFeatureResolver(additionalResolver, grammarResolver);
		}
		return grammarResolver;
	}

	static EClass findEClass(String EClassURI){
		int i = EClassURI.indexOf('#');
		String nsURI = EClassURI.substring(0, i);
		String name = EClassURI.substring(i+1);
		ExtendedMetaData metaData = new BasicExtendedMetaData(Registry.INSTANCE);
		return (EClass)metaData.getType(nsURI, name);
	}
	
}
