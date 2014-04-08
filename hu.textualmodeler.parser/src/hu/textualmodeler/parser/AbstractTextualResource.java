/**
 * 
 */
package hu.textualmodeler.parser;

import hu.textualmodeler.ast.CompositeNode;
import hu.textualmodeler.ast.Node;
import hu.textualmodeler.ast.VisibleNode;
import hu.textualmodeler.grammar.GrammarModel;
import hu.textualmodeler.parser.errors.ParsingError;
import hu.textualmodeler.parser.impl.Tokenizer;
import hu.textualmodeler.parser.impl.earley.EarleyParser;
import hu.textualmodeler.tokens.TokenList;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

/**
 * @author balazs.grill
 *
 */
public abstract class AbstractTextualResource extends ResourceImpl implements IParserContext{

	private TokenList input;
	private IParser parser;
	private Tokenizer tokenizer;
	private String data;
	
	public AbstractTextualResource(URI uri) {
		super(uri);
	}
	
	public IGrammar getGrammar(){
		return parser.getGrammar();
	}
	
	protected static String inputStreamToString(InputStream inputStream) throws IOException{
		byte[] data = new byte[inputStream.available()];
		inputStream.read(data);
		
		return new String(data);
	}
	
	protected abstract GrammarModel loadGrammar();
	
	protected abstract IFeatureResolver createFeatureResolver();
	
	private Node ast;
	
	public TokenList getTokenList() {
		return input;
	}
	
	public Node getAST() {
		return ast;
	}
	
	@Override
	public Resource getResourceContext() {
		return this;
	}
	
	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options)
			throws IOException {
		
		data = inputStreamToString(inputStream);
		
		parser = new EarleyParser(loadGrammar());
		tokenizer = new Tokenizer(parser.getGrammar().terminals(), this);
		
		input = tokenizer.tokenize(data);
//		for(Token t : input.getTokens()){
//			System.out.println(t.getTerminal().getName() +" = "+t.getValue());
//		}
		
		this.ast = parser.parse(input, this, 0);
		
		IFeatureResolver featureResolver = createFeatureResolver();
		ModelBuilder builder = new ModelBuilder(featureResolver, this);
		
		this.getContents().clear();
		if (this.ast instanceof CompositeNode){
			EObject element = builder.build((CompositeNode)this.ast);
			if (element != null){
				this.getContents().add(element);
			}
		}else{
			logError("Failed to create AST", null);
		}
		
	}
	
	@Override
	public void logError(Diagnostic diagnostic) {
		getErrors().add(diagnostic);
	}
	
	@Override
	public void logError(Exception e) {
		getErrors().add(new ParsingError(e.getClass().getCanonicalName()+": "+e.getMessage(), data, null));
	}
	
	@Override
	public IProgressMonitor getMonitor() {
		return new NullProgressMonitor();
	}

	@Override
	public void logError(String message, VisibleNode node) {
		getErrors().add(new ParsingError(message, data, node));
	}
	
}
