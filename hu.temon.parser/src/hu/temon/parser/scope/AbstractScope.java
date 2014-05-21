/**
 * 
 */
package hu.temon.parser.scope;


/**
 * @author balazs.grill
 *
 */
public abstract class AbstractScope implements IFeatureScope {

	/* (non-Javadoc)
	 * @see hu.temon.parser.scope.IFeatureScope#find(java.lang.String)
	 */
	@Override
	public IScopeElement find(String identifier) {
		for(IScopeElement element : getLocalElements()){
			if (identifier.equals(element.getIdentifier())) return element;
		}
		return null;
	}

}
