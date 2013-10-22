/**
 * 
 */
package hu.textualmodeler.parser;

import hu.textualmodeler.ast.CompositeNode;
import hu.textualmodeler.ast.Node;
import hu.textualmodeler.grammar.GrammarModel;
import hu.textualmodeler.parser.impl.ScopedFeatureResolver;
import hu.textualmodeler.parser.impl.StringInput;
import hu.textualmodeler.parser.impl.earley.EarleyParser;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

/**
 * @author balazs.grill
 *
 */
public abstract class AbstractTextualResource extends ResourceImpl {

	public AbstractTextualResource() {
		super();
	}
	
	public AbstractTextualResource(URI uri) {
		super(uri);
	}
	
	private static String inputStreamToString(InputStream inputStream) throws IOException{
		byte[] data = new byte[inputStream.available()];
		inputStream.read(data);
		
		return new String(data);
	}
	
	protected abstract GrammarModel loadGrammar();
	
	protected abstract IGlobalScope createGlobalScope();
	
	private Node ast;
	
	public Node getAST() {
		return ast;
	}
	
	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options)
			throws IOException {
		
		String data = inputStreamToString(inputStream);
		
		IParserContext context = new IParserContext() {
			
			@Override
			public void logError(Diagnostic diagnostic) {
				System.out.println(diagnostic);
				getErrors().add(diagnostic);
			}
			
			@Override
			public void logError(Exception e) {
				getErrors().add(new ParsingError(e.getMessage(), ""));
			}
			
			@Override
			public IProgressMonitor getMonitor() {
				return new NullProgressMonitor();
			}
		};
		
		IParser parser = new EarleyParser(loadGrammar());
		IParserInput input = new StringInput(data, parser.getGrammar().terminals(), context);
		
		this.ast = parser.parse(input, context, 0);
		
		IFeatureResolver featureResolver = new ScopedFeatureResolver(createGlobalScope());
		ModelBuilder builder = new ModelBuilder(featureResolver);
		
		this.contents.clear();
		if (this.ast instanceof CompositeNode){
			EObject element = builder.build((CompositeNode)this.ast);
			this.contents.add(element);
		}
		
	}
	
}
