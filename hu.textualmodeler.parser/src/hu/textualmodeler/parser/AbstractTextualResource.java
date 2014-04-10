/**
 * 
 */
package hu.textualmodeler.parser;

import hu.textualmodeler.ast.CompositeNode;
import hu.textualmodeler.ast.Node;
import hu.textualmodeler.ast.VisibleNode;
import hu.textualmodeler.grammar.GrammarModel;
import hu.textualmodeler.parser.errors.ParsingError;
import hu.textualmodeler.parser.impl.ModelBuilder;
import hu.textualmodeler.parser.impl.Tokenizer;
import hu.textualmodeler.parser.impl.earley.EarleyParser;
import hu.textualmodeler.parser.impl.tracking.ElementCreationTracker;
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

	/**
	 * Load option to enable tracking element creation. This is required if client wants to find 
	 * elements by position in text resource or find element defined by position.
	 */
	public static final String OPTION_TRACK_ELEMENT_CREATION = AbstractTextualResource.class.getCanonicalName()+".load_option.track_element_creation";
	
	private TokenList input = null;
	private IParser parser = null;
	private Tokenizer tokenizer = null;
	private String data = null;
	private ElementCreationTracker elementCreationTracker = null;
	
	private IFeatureResolver featureResolver;
	
	public IFeatureResolver getFeatureResolver() {
		if (featureResolver == null){
			featureResolver = createFeatureResolver();
		}
		return featureResolver;
	}
	
	/**
	 * Get tracker interface. Only available if resource is loaded with option 
	 * {@link OPTION_TRACK_ELEMENT_CREATION} set to {@link Boolean}.TRUE. Otherwise
	 * this method returns null.
	 * @return
	 */
	public ElementCreationTracker getElementCreationTracker() {
		return elementCreationTracker;
	}
	
	public IParser getParser(){
		if (parser == null){
			parser = new EarleyParser(loadGrammar());
		}
		return parser;
	}
	
	public Tokenizer getTokenizer(){
		if (tokenizer == null){
			tokenizer = new Tokenizer(getGrammar().terminals(), this);
		}
		return tokenizer;
	}
	
	public AbstractTextualResource(URI uri) {
		super(uri);
	}
	
	public IGrammar getGrammar(){
		return getParser().getGrammar();
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
		
		/* Process options */
		boolean option_elementCreationTrackingEnabled = false;
		if (options != null){
			option_elementCreationTrackingEnabled = Boolean.TRUE.equals(options.get(OPTION_TRACK_ELEMENT_CREATION));
		}
		
		data = inputStreamToString(inputStream);
		input = getTokenizer().tokenize(data);
		
		this.ast = getParser().parse(input, this, 0);
		
		IFeatureResolver featureResolver = getFeatureResolver();
		ModelBuilder builder = new ModelBuilder(featureResolver, this);
		elementCreationTracker = option_elementCreationTrackingEnabled ? new ElementCreationTracker(builder) : null;
		
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
