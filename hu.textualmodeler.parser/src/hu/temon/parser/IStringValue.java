/**
 * 
 */
package hu.temon.parser;

/**
 * @author balazs.grill
 *
 */
public interface IStringValue {

	public String getOriginalValue();
	
	public String getProcessedValue();
	
	public int[] getLineAndColumn();
	
}
