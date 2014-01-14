package hu.textualmodeler.query.infix;

import hu.textualmodeler.tokens.Token;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.textualmodeler.query.infix.START pattern, 
 * to be used in conjunction with {@link STARTMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see STARTMatcher
 * @see STARTProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class STARTMatch extends BasePatternMatch {
  private Token fFirst;
  
  private Token fEof;
  
  private static List<String> parameterNames = makeImmutableList("first", "eof");
  
  private STARTMatch(final Token pFirst, final Token pEof) {
    this.fFirst = pFirst;
    this.fEof = pEof;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("first".equals(parameterName)) return this.fFirst;
    if ("eof".equals(parameterName)) return this.fEof;
    return null;
    
  }
  
  public Token getFirst() {
    return this.fFirst;
    
  }
  
  public Token getEof() {
    return this.fEof;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("first".equals(parameterName) ) {
    	this.fFirst = (hu.textualmodeler.tokens.Token) newValue;
    	return true;
    }
    if ("eof".equals(parameterName) ) {
    	this.fEof = (hu.textualmodeler.tokens.Token) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setFirst(final Token pFirst) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fFirst = pFirst;
    
  }
  
  public void setEof(final Token pEof) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fEof = pEof;
    
  }
  
  @Override
  public String patternName() {
    return "hu.textualmodeler.query.infix.START";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return STARTMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fFirst, fEof};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"first\"=" + prettyPrintValue(fFirst) + ", ");
    result.append("\"eof\"=" + prettyPrintValue(fEof));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fFirst == null) ? 0 : fFirst.hashCode()); 
    result = prime * result + ((fEof == null) ? 0 : fEof.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof STARTMatch)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    STARTMatch other = (STARTMatch) obj;
    if (fFirst == null) {if (other.fFirst != null) return false;}
    else if (!fFirst.equals(other.fFirst)) return false;
    if (fEof == null) {if (other.fEof != null) return false;}
    else if (!fEof.equals(other.fEof)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return STARTMatcher.querySpecification().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  @SuppressWarnings("all")
  static final class Mutable extends STARTMatch {
    Mutable(final Token pFirst, final Token pEof) {
      super(pFirst, pEof);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
  static final class Immutable extends STARTMatch {
    Immutable(final Token pFirst, final Token pEof) {
      super(pFirst, pEof);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
