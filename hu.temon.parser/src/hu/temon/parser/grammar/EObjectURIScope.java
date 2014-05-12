/**
 * 
 */
package hu.temon.parser.grammar;

import hu.temon.parser.scope.IFeatureScope;
import hu.temon.parser.scope.IScopeElement;
import hu.temon.parser.scope.SimpleScopeElement;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;

/**
 * @author balazs.grill
 *
 */
public class EObjectURIScope implements IFeatureScope {

	private final String filter;
	
	/**
	 * 
	 */
	public EObjectURIScope(String filter) {
		if (filter.startsWith("\"")){
			filter = filter.substring(1);
		}
		if (filter.endsWith("\"")){
			filter = filter.substring(0, filter.length()-1);
		}
		this.filter = filter;
	}

	/* (non-Javadoc)
	 * @see hu.temon.parser.scope.IFeatureScope#getLocalElements()
	 */
	@Override
	public Collection<IScopeElement> getLocalElements() {
		int i = filter.indexOf('#');
		String nsURI = i == -1 ? filter : filter.substring(0, i);
		String name = i == -1 ? "" : filter.substring(i+1);
		List<IScopeElement> elements = new LinkedList<>();
		for(Entry<String, Object> regEntry : Registry.INSTANCE.entrySet()){
			String epackNsUri = regEntry.getKey();
			if (epackNsUri.startsWith(nsURI)){
				Object regElement = regEntry.getValue();
				if (regElement instanceof EPackage){
					EPackage epack = (EPackage)regElement;
					for(EClassifier eclass : epack.getEClassifiers()){
						if (eclass instanceof EClass && eclass.getName().startsWith(name)){
							elements.add(new SimpleScopeElement("\""+epackNsUri+"#"+eclass.getName()+"\"", eclass));
						}
					}
				}
			}
		}
		return elements;
	}

	/* (non-Javadoc)
	 * @see hu.temon.parser.scope.IFeatureScope#parentScope()
	 */
	@Override
	public IFeatureScope parentScope() {
		return null;
	}

	/* (non-Javadoc)
	 * @see hu.temon.parser.scope.IFeatureScope#find(java.lang.String)
	 */
	@Override
	public IScopeElement find(String identifier) {
		// TODO Auto-generated method stub
		return null;
	}

}
