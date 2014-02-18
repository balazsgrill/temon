/**
 * 
 */
package hu.textualmodeler.parser.impl.earley;

import java.util.Collection;


/**
 * @author balazs.grill
 *
 */
public class ParserTable {

	private ParserLevel[] table = new ParserLevel[]{new ParserLevel()};
	
	public ParserLevel get(int level){
		if (table.length > level){
			if (table[level] == null){
				table[level] = new ParserLevel();
			}
		}else{
			ParserLevel[] newTable = new ParserLevel[level+1];
			System.arraycopy(table, 0, newTable, 0, table.length);
			table = newTable;
			table[level] = new ParserLevel();
		}
		return table[level];
	}

	public void removeVisitedStates(Collection<EarleyState> from){
		for(ParserLevel pl : table){
			from.removeAll(pl.getStates());
		}
	}
	
}
