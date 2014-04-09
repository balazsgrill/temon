/**
 * 
 */
package hu.textualmodeler.editor.impl.configuration;

import hu.textualmodeler.editor.impl.configuration.TerminalTextAttributeProvider.TerminalClasses;
import hu.textualmodeler.grammar.Terminal;
import hu.textualmodeler.parser.impl.Tokenizer;
import hu.textualmodeler.tokens.Token;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.ITokenScanner;
import org.eclipse.jface.text.source.ISharedTextColors;

/**
 * @author balazs.grill
 *
 */
public class GrammarBasedTokenScanner implements ITokenScanner {
	
	private final Tokenizer tokenizer;
	private Iterator<Token> iterator = null;
	private Token lastToken = null;
	private int lastChar = 0;
	private int offset = 0;
	
	private final Map<Terminal, IToken> tokenTypes = new HashMap<Terminal, IToken>();
	
	/**
	 * 
	 */
	public GrammarBasedTokenScanner(Tokenizer tokenizer, ISharedTextColors sharedColors) {
		this.tokenizer = tokenizer;
		for(Terminal term : tokenizer.getTerminals()){

			TerminalClasses tclass = TerminalTextAttributeProvider.getClass(term);
			TextAttribute data = TerminalTextAttributeProvider.createAttribute(tclass, sharedColors);
			tokenTypes.put(term, new org.eclipse.jface.text.rules.Token(data));

		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.text.rules.ITokenScanner#setRange(org.eclipse.jface.text.IDocument, int, int)
	 */
	@Override
	public void setRange(IDocument document, int offset, int length) {
		this.offset = offset;
		lastChar = offset+length;
		lastToken = null;
		try {
			iterator = tokenizer.createTokenIterator(document.get(offset, length));
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.text.rules.ITokenScanner#nextToken()
	 */
	@Override
	public IToken nextToken() {
		lastToken = null;
		if (iterator.hasNext()){
			lastToken = iterator.next();
		}
		
		if (lastToken == null) return org.eclipse.jface.text.rules.Token.EOF;
		if (lastToken.getTerminal() == null) return org.eclipse.jface.text.rules.Token.UNDEFINED;
		if (lastToken.getTerminal().isHide()){
			if (TerminalTextAttributeProvider.isWhitespace(lastToken.getValue()))
				return org.eclipse.jface.text.rules.Token.WHITESPACE;
		}
		return tokenTypes.get(lastToken.getTerminal());
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.text.rules.ITokenScanner#getTokenOffset()
	 */
	@Override
	public int getTokenOffset() {
		return lastToken != null ? lastToken.getStart()+offset : lastChar;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.text.rules.ITokenScanner#getTokenLength()
	 */
	@Override
	public int getTokenLength() {
		return lastToken != null ? lastToken.getLength() : 0;
	}

}
