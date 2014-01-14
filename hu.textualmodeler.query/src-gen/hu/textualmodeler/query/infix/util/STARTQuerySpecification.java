package hu.textualmodeler.query.infix.util;

import hu.textualmodeler.query.infix.STARTMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;

/**
 * A pattern-specific query specification that can instantiate STARTMatcher in a type-safe way.
 * 
 * @see STARTMatcher
 * @see STARTMatch
 * 
 */
@SuppressWarnings("all")
public final class STARTQuerySpecification extends BaseGeneratedQuerySpecification<STARTMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static STARTQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected STARTMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return STARTMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.textualmodeler.query";
    
  }
  
  @Override
  protected String patternName() {
    return "hu.textualmodeler.query.infix.START";
    
  }
  
  private STARTQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<STARTQuerySpecification> {
    @Override
    public STARTQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static STARTQuerySpecification INSTANCE = make();
    
    public static STARTQuerySpecification make() {
      try {
      	return new STARTQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
