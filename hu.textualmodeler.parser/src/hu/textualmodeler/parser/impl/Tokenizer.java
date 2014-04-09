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
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
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
	
	public Collection<Terminal> getTerminals() {
		return terminals.keySet();
	}
	
	private class TokenIterator implements Iterator<Token>{

		private final String input;
		private int position;
		
		public TokenIterator(String input) {
			this.input = input;
			position = 0;
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
		
		@Override
		public boolean hasNext() {
			return position < input.length();
		}

		@Override
		public Token next() {
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
				position += bestToken.getLength();
				return bestToken;
			}else{
				String err = ""+input.charAt(position);
				position++;
				Token errtoken = TokensFactory.eINSTANCE.createToken();
				errtoken.setStart(position);
				errtoken.setLength(1);
				errtoken.setValue(err);
				return errtoken;
			}
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
		
	}
	
	public Iterator<Token> createTokenIterator(String input){
		return new TokenIterator(input);
	}
	
	public Iterable<Token> createTokenIterable(final String input){
		return new Iterable<Token>() {
			
			@Override
			public Iterator<Token> iterator() {
				return createTokenIterator(input);
			}
		};
	}
	
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
	
	private static Token mergeErrorTokens(List<Token> tokens){
		Token result = TokensFactory.eINSTANCE.createToken();
		result.setStart(tokens.get(0).getStart());
		String value = "";
		for(Token t : tokens){
			value += t.getValue();
		}
		result.setValue(value);
		result.setLength(value.length());
		return result;
	}
	
	public TokenList tokenize(final String input){
		TokenList result = TokensFactory.eINSTANCE.createTokenList();
		
		List<Token> errTokens = new LinkedList<>();
		
		for(Token t : createTokenIterable(input)){
			
			if (t.getTerminal() != null){
				if (!errTokens.isEmpty()){
					Token err = mergeErrorTokens(errTokens);
					errTokens.clear();
					int[] lc = ParsingError.getLineAndColumn(input, err.getStart());
					context.logError(new ParsingError("Invalid characters found: '"+err.getValue()+"'", "", lc[0], lc[1]));
				}
				result.getTokens().add(t);
			}else{
				errTokens.add(t);
			}
			
		}
		
		if (!errTokens.isEmpty()){
			Token err = mergeErrorTokens(errTokens);
			errTokens.clear();
			int[] lc = ParsingError.getLineAndColumn(input, err.getStart());
			context.logError(new ParsingError("Invalid characters found: '"+err.getValue()+"'", "", lc[0], lc[1]));
		}
		
		return result;
	}

}
