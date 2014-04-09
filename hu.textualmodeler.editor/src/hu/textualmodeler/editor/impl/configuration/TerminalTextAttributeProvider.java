/**
 * 
 */
package hu.textualmodeler.editor.impl.configuration;

import hu.textualmodeler.grammar.Terminal;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.source.ISharedTextColors;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;

/**
 * @author balazs.grill
 *
 */
public class TerminalTextAttributeProvider {

	public static enum TerminalClasses{
		
		KEYWORD, IDENTIFIER,
		VALUE, COMMENT, UNDEFINED
		
	}
	
	/**
	 * 
	 */
	private TerminalTextAttributeProvider() {
	}

	public static TextAttribute createAttribute(TerminalClasses terminalClass, ISharedTextColors colors){
		/* Classes: keyword, identifier, value, comment */
		switch (terminalClass) {
		case KEYWORD:
			return new TextAttribute(colors.getColor(new RGB(0f, 0f, 0.1f)), null, SWT.BOLD);
		case IDENTIFIER:
			return new TextAttribute(colors.getColor(new RGB(0f, 0f, 0.1f)));
		case VALUE:
			return new TextAttribute(colors.getColor(new RGB(230f, 0.8f, 0.5f)));
		case COMMENT:
			return new TextAttribute(colors.getColor(new RGB(100f, 0.8f, 0.5f)));
		case UNDEFINED:
		default:
			return new TextAttribute(colors.getColor(new RGB(0f, 0.8f, 0.5f)));
		}
	}
	
	private static boolean isJavaIdentifier(String s) {
	    if (s.length() == 0 || !Character.isJavaIdentifierStart(s.charAt(0))) {
	        return false;
	    }
	    for (int i=1; i<s.length(); i++) {
	        if (!Character.isJavaIdentifierPart(s.charAt(i))) {
	            return false;
	        }
	    }
	    return true;
	}
	
	public static boolean isWhitespace(String s){
		for(int i=0;i<s.length();i++){
			if (!Character.isWhitespace(s.charAt(i))) {
	            return false;
	        }
		}
		return true;
	}
	
	public static TerminalClasses getClass(Terminal terminal){
		if (terminal.isHide()){
			return TerminalClasses.COMMENT;
		}
		
		if ("IDENTIFIER".equals(terminal.getName())){
			return TerminalClasses.IDENTIFIER;
		}
		
		if (isJavaIdentifier(terminal.getRegex())){
			return TerminalClasses.KEYWORD;
		}
		
		return TerminalClasses.VALUE;
	}
	
}
