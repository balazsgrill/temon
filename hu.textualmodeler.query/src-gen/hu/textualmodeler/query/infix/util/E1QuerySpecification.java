package hu.textualmodeler.query.infix.util;

import hu.textualmodeler.query.infix.E1Matcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;

/**
 * A pattern-specific query specification that can instantiate E1Matcher in a type-safe way.
 * 
 * @see E1Matcher
 * @see E1Match
 * 
 */
@SuppressWarnings("all")
public final class E1QuerySpecification extends BaseGeneratedQuerySpecification<E1Matcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static E1QuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected E1Matcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return E1Matcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.textualmodeler.query";
    
  }
  
  @Override
  protected String patternName() {
    return "hu.textualmodeler.query.infix.E1";
    
  }
  
  private E1QuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<E1QuerySpecification> {
    @Override
    public E1QuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static E1QuerySpecification INSTANCE = make();
    
    public static E1QuerySpecification make() {
      try {
      	return new E1QuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
