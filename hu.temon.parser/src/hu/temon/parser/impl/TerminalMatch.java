/**
 * 
 */
package hu.temon.parser.impl;

import hu.temon.grammar.Replace;
import hu.temon.grammar.Terminal;
import hu.temon.parser.IParserInput;
import hu.temon.parser.IStringValue;

/**
 * @author balazs.grill
 *
 */
public class TerminalMatch implements IStringValue{

	public final Terminal terminal;
	private final String match;
	public final int position;
	public final int size;
	public final IParserInput input;
	
	public TerminalMatch(Terminal terminal, IParserInput input, int position, int size) {
		this.terminal = terminal;
		this.match = input.substring(position, position+size);
		this.position = position;
		this.size = size;
		this.input = input;
	}
	
	@Override
	public String getProcessedValue(){
		String value = match;
		for(Replace r : terminal.getConvertFrom()){
			String regex = r.getSearch();
			String replacement = r.getReplace();
			if (replacement == null) replacement= "";
			value = value.replaceAll(regex, replacement);
		}
		return value;
	}

	public String getMatch() {
		return match;
	}
	
	@Override
	public String getOriginalValue() {
		return match;
	}

	@Override
	public int[] getLineAndColumn() {
		return input.getLineAndColumn(position);
	}
	
}
