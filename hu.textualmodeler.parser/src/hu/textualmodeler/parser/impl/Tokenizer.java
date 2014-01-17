/**
 * 
 */
package hu.textualmodeler.parser.impl;

import hu.textualmodeler.grammar.Replace;
import hu.textualmodeler.grammar.Terminal;
import hu.textualmodeler.parser.IParserContext;
import hu.textualmodeler.parser.errors.ParsingError;
import hu.textualmodeler.tokens.Token;
import hu.textualmodeler.tokens.TokenList;
import hu.textualmodeler.tokens.TokensFactory;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author balazs.grill
 *
 */
public class Tokenizer {

	private final IParserContext context;
	private final Map<Terminal, Pattern> terminals = new LinkedHashMap<Terminal, Pattern>();
	private final Map<Terminal, Set<Terminal>> overrides = new HashMap<Terminal, Set<Terminal>>();
	
	/**
	 * 
	 */
	public Tokenizer(Collection<Terminal> terminals, IParserContext context) {
		this.context = context;
		for(Terminal terminal : terminals){
			try{
				this.terminals.put(terminal, Pattern.compile(terminal.getRegex()));
			}catch(Exception e){
				context.logError(new ParsingError(e.getMessage(),"", 0,0));
			}
		}
		for(Terminal terminal : terminals){
			Pattern p = this.terminals.get(terminal);
			Set<Terminal> list = new HashSet<Terminal>();
			if (p != null){
				for(Terminal t : terminals) if (!t.equals(terminal)){
					Matcher m = p.matcher(t.getRegex());
					if (m.lookingAt() && (m.end()-m.start()) == t.getRegex().length()){
						//t is a constant instance of terminal
						list.add(t);
					}
				}
			}
			if (!list.isEmpty()){
				overrides.put(terminal, list);
			}
		}
	}
	
	private static String getProcessedValue(String match, Terminal terminal){
		String value = match;
		for(Replace r : terminal.getReplace()){
			String regex = r.getSearch();
			String replacement = r.getReplace();
			if (replacement == null) replacement= "";
			value = value.replaceAll(regex, replacement);
		}
		return value;
	}
	
	private Token doMatchToken(String input, Terminal terminal, int position){
		Pattern pattern = terminals.get(terminal);
		if (pattern == null){
			throw new IllegalArgumentException("Terminal is unknown: "+terminal);
		}
		Matcher matcher = pattern.matcher(input);
		matcher.region(position, input.length());
		if (matcher.lookingAt()){
			int start = matcher.start();
			int end = matcher.end();
			if (start == position){
				Token t = TokensFactory.eINSTANCE.createToken();
				t.setLength(end-start);
				t.setStart(start);
				t.setTerminal(terminal);
				t.setValue(getProcessedValue(input.substring(start, end), terminal));
				return t;
			}
		}
		return null;
	}
	
	public TokenList tokenize(final String input){
		TokenList result = TokensFactory.eINSTANCE.createTokenList();
		
		int position = 0;
		String err = "";
		while(position < input.length()){
			
			Token bestToken = null;
			
			for(Terminal terminal : terminals.keySet()){
				Token t = doMatchToken(input, terminal, position);
				if (t != null){
					if (bestToken == null){
						bestToken = t;
					}else{
						if (bestToken.getLength() < t.getLength()){
							bestToken = t;
						}
						if (bestToken.getLength() == t.getLength() && t.getTerminal().getPriority() > bestToken.getTerminal().getPriority()){
							bestToken = t;
						}
					}
				}
			}
			
			if (bestToken != null){
				if (!err.isEmpty()){
					int[] lc = ParsingError.getLineAndColumn(input, position);
					context.logError(new ParsingError("Invalid characters found: '"+err+"'", "", lc[0], lc[1]));
					err = "";
				}
				result.getTokens().add(bestToken);
				position += bestToken.getLength();
			}else{
				err = err + input.charAt(position);
				position++;
			}
			
		}
		
		return result;
	}

}
