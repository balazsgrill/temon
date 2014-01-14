package hu.textualmodeler.query.infix.util;

import hu.textualmodeler.query.infix.E3Matcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;

/**
 * A pattern-specific query specification that can instantiate E3Matcher in a type-safe way.
 * 
 * @see E3Matcher
 * @see E3Match
 * 
 */
@SuppressWarnings("all")
public final class E3QuerySpecification extends BaseGeneratedQuerySpecification<E3Matcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static E3QuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected E3Matcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return E3Matcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.textualmodeler.query";
    
  }
  
  @Override
  protected String patternName() {
    return "hu.textualmodeler.query.infix.E3";
    
  }
  
  private E3QuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<E3QuerySpecification> {
    @Override
    public E3QuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static E3QuerySpecification INSTANCE = make();
    
    public static E3QuerySpecification make() {
      try {
      	return new E3QuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
