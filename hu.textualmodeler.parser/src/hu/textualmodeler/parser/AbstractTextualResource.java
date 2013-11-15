/**
 * 
 */
package hu.textualmodeler.parser;

import hu.textualmodeler.ast.CompositeNode;
import hu.textualmodeler.ast.Node;
import hu.textualmodeler.ast.VisibleNode;
import hu.textualmodeler.grammar.GrammarModel;
import hu.textualmodeler.parser.errors.ParsingError;
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
		
		final IParserInput[] input = new IParserInput[1];
		IParserContext context = new IParserContext() {
			
			@Override
			public void logError(Diagnostic diagnostic) {
				getErrors().add(diagnostic);
			}
			
			@Override
			public void logError(Exception e) {
				getErrors().add(new ParsingError(e.getMessage(), input[0], null));
			}
			
			@Override
			public IProgressMonitor getMonitor() {
				return new NullProgressMonitor();
			}

			@Override
			public void logError(String message, VisibleNode node) {
				getErrors().add(new ParsingError(message, input[0], node));
			}
		};
		
		IParser parser = new EarleyParser(loadGrammar());
		input[0] = new StringInput(data, parser.getGrammar().terminals(), context);
		
		this.ast = parser.parse(input[0], context, 0);
		
		IFeatureResolver featureResolver = new ScopedFeatureResolver(createGlobalScope());
		ModelBuilder builder = new ModelBuilder(featureResolver, context);
		
		this.getContents().clear();
		if (this.ast instanceof CompositeNode){
			EObject element = builder.build((CompositeNode)this.ast);
			if (element != null){
				this.getContents().add(element);
			}
		}
		
	}
	
}
