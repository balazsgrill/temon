package hu.textualmodeler.query.util;

import hu.textualmodeler.query.TerminalMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IQuerySpecificationProvider;

/**
 * A pattern-specific query specification that can instantiate TerminalMatcher in a type-safe way.
 * 
 * @see TerminalMatcher
 * @see TerminalMatch
 * 
 */
@SuppressWarnings("all")
public final class TerminalQuerySpecification extends BaseGeneratedQuerySpecification<TerminalMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TerminalQuerySpecification instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected TerminalMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return TerminalMatcher.on(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.textualmodeler.query";
    
  }
  
  @Override
  protected String patternName() {
    return "hu.textualmodeler.query.terminal";
    
  }
  
  private TerminalQuerySpecification() throws IncQueryException {
    super();
  }
  
  @SuppressWarnings("all")
  public static class Provider implements IQuerySpecificationProvider<TerminalQuerySpecification> {
    @Override
    public TerminalQuerySpecification get() throws IncQueryException {
      return instance();
    }
  }
  
  
  @SuppressWarnings("all")
  private static class LazyHolder {
    private final static TerminalQuerySpecification INSTANCE = make();
    
    public static TerminalQuerySpecification make() {
      try {
      	return new TerminalQuerySpecification();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
