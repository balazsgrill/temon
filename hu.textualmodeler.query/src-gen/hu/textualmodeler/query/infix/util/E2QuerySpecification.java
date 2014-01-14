package hu.textualmodeler.query.infix.util;

import hu.textualmodeler.query.infix.E2Matcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;

/**
 * A pattern-specific query specification that can instantiate E2Matcher in a type-safe way.
 * 
 * @see E2Matcher
 * @see E2Match
 * 
 */
@SuppressWarnings("all")
public final class E2QuerySpecification extends BaseGeneratedQuerySpecification<E2Matcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static E2QuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected E2Matcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return E2Matcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.textualmodeler.query";
    
  }
  
  @Override
  protected String patternName() {
    return "hu.textualmodeler.query.infix.E2";
    
  }
  
  private E2QuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<E2QuerySpecification> {
    @Override
    public E2QuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static E2QuerySpecification INSTANCE = make();
    
    public static E2QuerySpecification make() {
      try {
      	return new E2QuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
