package hu.textualmodeler.query.infix;

import hu.textualmodeler.tokens.Token;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.textualmodeler.query.infix.E pattern, 
 * to be used in conjunction with {@link EMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see EMatcher
 * @see EProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class EMatch extends BasePatternMatch {
  private Token fFirst;
  
  private Token fNext;
  
  private static List<String> parameterNames = makeImmutableList("first", "next");
  
  private EMatch(final Token pFirst, final Token pNext) {
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
    return "hu.textualmodeler.query.infix.E";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return EMatch.parameterNames;
    
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
    if (!(obj instanceof EMatch)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    EMatch other = (EMatch) obj;
    if (fFirst == null) {if (other.fFirst != null) return false;}
    else if (!fFirst.equals(other.fFirst)) return false;
    if (fNext == null) {if (other.fNext != null) return false;}
    else if (!fNext.equals(other.fNext)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return EMatcher.querySpecification().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  @SuppressWarnings("all")
  static final class Mutable extends EMatch {
    Mutable(final Token pFirst, final Token pNext) {
      super(pFirst, pNext);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
  static final class Immutable extends EMatch {
    Immutable(final Token pFirst, final Token pNext) {
      super(pFirst, pNext);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
