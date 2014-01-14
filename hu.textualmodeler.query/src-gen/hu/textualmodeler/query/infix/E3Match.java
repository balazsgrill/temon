package hu.textualmodeler.query.infix;

import hu.textualmodeler.tokens.Token;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.textualmodeler.query.infix.E3 pattern, 
 * to be used in conjunction with {@link E3Matcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see E3Matcher
 * @see E3Processor
 * 
 */
@SuppressWarnings("all")
public abstract class E3Match extends BasePatternMatch {
  private Token fFirst;
  
  private Token fNext;
  
  private static List<String> parameterNames = makeImmutableList("first", "next");
  
  private E3Match(final Token pFirst, final Token pNext) {
    this.fFirst = pFirst;
    this.fNext = pNext;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("first".equals(parameterName)) return this.fFirst;
    if ("next".equals(parameterName)) return this.fNext;
    return null;
    
  }
  
  public Token getFirst() {
    return this.fFirst;
    
  }
  
  public Token getNext() {
    return this.fNext;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("first".equals(parameterName) ) {
    	this.fFirst = (hu.textualmodeler.tokens.Token) newValue;
    	return true;
    }
    if ("next".equals(parameterName) ) {
    	this.fNext = (hu.textualmodeler.tokens.Token) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setFirst(final Token pFirst) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fFirst = pFirst;
    
  }
  
  public void setNext(final Token pNext) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fNext = pNext;
    
  }
  
  @Override
  public String patternName() {
    return "hu.textualmodeler.query.infix.E3";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return E3Match.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fFirst, fNext};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"first\"=" + prettyPrintValue(fFirst) + ", ");
    result.append("\"next\"=" + prettyPrintValue(fNext));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fFirst == null) ? 0 : fFirst.hashCode()); 
    result = prime * result + ((fNext == null) ? 0 : fNext.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof E3Match)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    E3Match other = (E3Match) obj;
    if (fFirst == null) {if (other.fFirst != null) return false;}
    else if (!fFirst.equals(other.fFirst)) return false;
    if (fNext == null) {if (other.fNext != null) return false;}
    else if (!fNext.equals(other.fNext)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return E3Matcher.querySpecification().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  @SuppressWarnings("all")
  static final class Mutable extends E3Match {
    Mutable(final Token pFirst, final Token pNext) {
      super(pFirst, pNext);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
  static final class Immutable extends E3Match {
    Immutable(final Token pFirst, final Token pNext) {
      super(pFirst, pNext);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
