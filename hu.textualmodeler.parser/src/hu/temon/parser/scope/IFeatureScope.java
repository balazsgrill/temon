package hu.temon.parser.scope;

import java.util.Collection;

public interface IFeatureScope {

	public Collection<IScopeElement> getLocalElements();
	
	public IFeatureScope parentScope();
	
	public IScopeElement find(String identifier);
	
}
