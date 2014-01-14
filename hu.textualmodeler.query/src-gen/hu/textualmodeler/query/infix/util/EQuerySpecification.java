package hu.textualmodeler.query.infix.util;

import hu.textualmodeler.query.infix.EMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;

/**
 * A pattern-specific query specification that can instantiate EMatcher in a type-safe way.
 * 
 * @see EMatcher
 * @see EMatch
 * 
 */
@SuppressWarnings("all")
public final class EQuerySpecification extends BaseGeneratedQuerySpecification<EMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static EQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected EMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return EMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.textualmodeler.query";
    
  }
  
  @Override
  protected String patternName() {
    return "hu.textualmodeler.query.infix.E";
    
  }
  
  private EQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<EQuerySpecification> {
    @Override
    public EQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static EQuerySpecification INSTANCE = make();
    
    public static EQuerySpecification make() {
      try {
      	return new EQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
