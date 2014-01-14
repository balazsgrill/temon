package hu.textualmodeler.query.infix;

import hu.textualmodeler.query.infix.STARTMatch;
import hu.textualmodeler.query.infix.util.STARTQuerySpecification;
import hu.textualmodeler.tokens.Token;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.rete.misc.DeltaMonitor;
import org.eclipse.incquery.runtime.rete.tuple.Tuple;

/**
 * Generated pattern matcher API of the hu.textualmodeler.query.infix.START pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)}, 
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link STARTMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern START(first : Token, eof : Token){
 * 	find E(first, eof);
 * 	find EOF(eof);
 * }
 * </pre></code>
 * 
 * @see STARTMatch
 * @see STARTProcessor
 * @see STARTQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class STARTMatcher extends BaseMatcher<STARTMatch> {
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<STARTMatcher> querySpecification() throws IncQueryException {
    return STARTQuerySpecification.instance();
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine. 
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static STARTMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    STARTMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new STARTMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    } 	
    return matcher;
  }
  
  private final static int POSITION_FIRST = 0;
  
  private final static int POSITION_EOF = 1;
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet). 
   * If a pattern matcher is already constructed with the same root, only a light-weight reference is returned.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so 
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead, e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}
   * 
   */
  @Deprecated
  public STARTMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngine.on(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine. 
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public STARTMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pFirst the fixed value of pattern parameter first, or null if not bound.
   * @param pEof the fixed value of pattern parameter eof, or null if not bound.
   * @return matches represented as a STARTMatch object.
   * 
   */
  public Collection<STARTMatch> getAllMatches(final Token pFirst, final Token pEof) {
    return rawGetAllMatches(new Object[]{pFirst, pEof});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pFirst the fixed value of pattern parameter first, or null if not bound.
   * @param pEof the fixed value of pattern parameter eof, or null if not bound.
   * @return a match represented as a STARTMatch object, or null if no match is found.
   * 
   */
  public STARTMatch getOneArbitraryMatch(final Token pFirst, final Token pEof) {
    return rawGetOneArbitraryMatch(new Object[]{pFirst, pEof});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pFirst the fixed value of pattern parameter first, or null if not bound.
   * @param pEof the fixed value of pattern parameter eof, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Token pFirst, final Token pEof) {
    return rawHasMatch(new Object[]{pFirst, pEof});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pFirst the fixed value of pattern parameter first, or null if not bound.
   * @param pEof the fixed value of pattern parameter eof, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Token pFirst, final Token pEof) {
    return rawCountMatches(new Object[]{pFirst, pEof});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pFirst the fixed value of pattern parameter first, or null if not bound.
   * @param pEof the fixed value of pattern parameter eof, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Token pFirst, final Token pEof, final IMatchProcessor<? super STARTMatch> processor) {
    rawForEachMatch(new Object[]{pFirst, pEof}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pFirst the fixed value of pattern parameter first, or null if not bound.
   * @param pEof the fixed value of pattern parameter eof, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Token pFirst, final Token pEof, final IMatchProcessor<? super STARTMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pFirst, pEof}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pFirst the fixed value of pattern parameter first, or null if not bound.
   * @param pEof the fixed value of pattern parameter eof, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<STARTMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Token pFirst, final Token pEof) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pFirst, pEof});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pFirst the fixed value of pattern parameter first, or null if not bound.
   * @param pEof the fixed value of pattern parameter eof, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public STARTMatch newMatch(final Token pFirst, final Token pEof) {
    return new STARTMatch.Immutable(pFirst, pEof);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for first.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Token> rawAccumulateAllValuesOffirst(final Object[] parameters) {
    Set<Token> results = new HashSet<Token>();
    rawAccumulateAllValues(POSITION_FIRST, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for first.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Token> getAllValuesOffirst() {
    return rawAccumulateAllValuesOffirst(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for first.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Token> getAllValuesOffirst(final STARTMatch partialMatch) {
    return rawAccumulateAllValuesOffirst(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for first.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Token> getAllValuesOffirst(final Token pEof) {
    return rawAccumulateAllValuesOffirst(new Object[]{null, pEof});
  }
  
  /**
   * Retrieve the set of values that occur in matches for eof.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Token> rawAccumulateAllValuesOfeof(final Object[] parameters) {
    Set<Token> results = new HashSet<Token>();
    rawAccumulateAllValues(POSITION_EOF, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for eof.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Token> getAllValuesOfeof() {
    return rawAccumulateAllValuesOfeof(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for eof.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Token> getAllValuesOfeof(final STARTMatch partialMatch) {
    return rawAccumulateAllValuesOfeof(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for eof.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Token> getAllValuesOfeof(final Token pFirst) {
    return rawAccumulateAllValuesOfeof(new Object[]{pFirst, null});
  }
  
  @Override
  protected STARTMatch tupleToMatch(final Tuple t) {
    try {
    	return new STARTMatch.Immutable((hu.textualmodeler.tokens.Token) t.get(POSITION_FIRST), (hu.textualmodeler.tokens.Token) t.get(POSITION_EOF));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected STARTMatch arrayToMatch(final Object[] match) {
    try {
    	return new STARTMatch.Immutable((hu.textualmodeler.tokens.Token) match[POSITION_FIRST], (hu.textualmodeler.tokens.Token) match[POSITION_EOF]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected STARTMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return new STARTMatch.Mutable((hu.textualmodeler.tokens.Token) match[POSITION_FIRST], (hu.textualmodeler.tokens.Token) match[POSITION_EOF]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
}
