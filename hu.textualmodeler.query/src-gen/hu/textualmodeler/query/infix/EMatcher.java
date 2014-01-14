package hu.textualmodeler.query.infix;

import hu.textualmodeler.query.infix.EMatch;
import hu.textualmodeler.query.infix.util.EQuerySpecification;
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
 * Generated pattern matcher API of the hu.textualmodeler.query.infix.E pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)}, 
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link EMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern E(first : Token, next : Token){
 * 	find E1(first, next);
 * }
 * </pre></code>
 * 
 * @see EMatch
 * @see EProcessor
 * @see EQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class EMatcher extends BaseMatcher<EMatch> {
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<EMatcher> querySpecification() throws IncQueryException {
    return EQuerySpecification.instance();
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine. 
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static EMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    EMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new EMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    } 	
    return matcher;
  }
  
  private final static int POSITION_FIRST = 0;
  
  private final static int POSITION_NEXT = 1;
  
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
  public EMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public EMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pFirst the fixed value of pattern parameter first, or null if not bound.
   * @param pNext the fixed value of pattern parameter next, or null if not bound.
   * @return matches represented as a EMatch object.
   * 
   */
  public Collection<EMatch> getAllMatches(final Token pFirst, final Token pNext) {
    return rawGetAllMatches(new Object[]{pFirst, pNext});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pFirst the fixed value of pattern parameter first, or null if not bound.
   * @param pNext the fixed value of pattern parameter next, or null if not bound.
   * @return a match represented as a EMatch object, or null if no match is found.
   * 
   */
  public EMatch getOneArbitraryMatch(final Token pFirst, final Token pNext) {
    return rawGetOneArbitraryMatch(new Object[]{pFirst, pNext});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pFirst the fixed value of pattern parameter first, or null if not bound.
   * @param pNext the fixed value of pattern parameter next, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Token pFirst, final Token pNext) {
    return rawHasMatch(new Object[]{pFirst, pNext});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pFirst the fixed value of pattern parameter first, or null if not bound.
   * @param pNext the fixed value of pattern parameter next, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Token pFirst, final Token pNext) {
    return rawCountMatches(new Object[]{pFirst, pNext});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pFirst the fixed value of pattern parameter first, or null if not bound.
   * @param pNext the fixed value of pattern parameter next, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Token pFirst, final Token pNext, final IMatchProcessor<? super EMatch> processor) {
    rawForEachMatch(new Object[]{pFirst, pNext}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pFirst the fixed value of pattern parameter first, or null if not bound.
   * @param pNext the fixed value of pattern parameter next, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Token pFirst, final Token pNext, final IMatchProcessor<? super EMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pFirst, pNext}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pFirst the fixed value of pattern parameter first, or null if not bound.
   * @param pNext the fixed value of pattern parameter next, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<EMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Token pFirst, final Token pNext) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pFirst, pNext});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pFirst the fixed value of pattern parameter first, or null if not bound.
   * @param pNext the fixed value of pattern parameter next, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public EMatch newMatch(final Token pFirst, final Token pNext) {
    return new EMatch.Immutable(pFirst, pNext);
    
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
  public Set<Token> getAllValuesOffirst(final EMatch partialMatch) {
    return rawAccumulateAllValuesOffirst(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for first.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Token> getAllValuesOffirst(final Token pNext) {
    return rawAccumulateAllValuesOffirst(new Object[]{null, pNext});
  }
  
  /**
   * Retrieve the set of values that occur in matches for next.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Token> rawAccumulateAllValuesOfnext(final Object[] parameters) {
    Set<Token> results = new HashSet<Token>();
    rawAccumulateAllValues(POSITION_NEXT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for next.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Token> getAllValuesOfnext() {
    return rawAccumulateAllValuesOfnext(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for next.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Token> getAllValuesOfnext(final EMatch partialMatch) {
    return rawAccumulateAllValuesOfnext(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for next.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Token> getAllValuesOfnext(final Token pFirst) {
    return rawAccumulateAllValuesOfnext(new Object[]{pFirst, null});
  }
  
  @Override
  protected EMatch tupleToMatch(final Tuple t) {
    try {
    	return new EMatch.Immutable((hu.textualmodeler.tokens.Token) t.get(POSITION_FIRST), (hu.textualmodeler.tokens.Token) t.get(POSITION_NEXT));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected EMatch arrayToMatch(final Object[] match) {
    try {
    	return new EMatch.Immutable((hu.textualmodeler.tokens.Token) match[POSITION_FIRST], (hu.textualmodeler.tokens.Token) match[POSITION_NEXT]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected EMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return new EMatch.Mutable((hu.textualmodeler.tokens.Token) match[POSITION_FIRST], (hu.textualmodeler.tokens.Token) match[POSITION_NEXT]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
}
