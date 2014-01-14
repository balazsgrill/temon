package hu.textualmodeler.query;

import hu.textualmodeler.tokens.Token;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.patternlanguage.patternLanguage.Pattern;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.textualmodeler.query.terminal pattern, 
 * to be used in conjunction with {@link TerminalMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters, 
 * usable to represent a match of the pattern in the result of a query, 
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see TerminalMatcher
 * @see TerminalProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class TerminalMatch extends BasePatternMatch {
  private Token fT;
  
  private String fS;
  
  private static List<String> parameterNames = makeImmutableList("t", "s");
  
  private TerminalMatch(final Token pT, final String pS) {
    this.fT = pT;
    this.fS = pS;
    
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("t".equals(parameterName)) return this.fT;
    if ("s".equals(parameterName)) return this.fS;
    return null;
    
  }
  
  public Token getT() {
    return this.fT;
    
  }
  
  public String getS() {
    return this.fS;
    
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("t".equals(parameterName) ) {
    	this.fT = (hu.textualmodeler.tokens.Token) newValue;
    	return true;
    }
    if ("s".equals(parameterName) ) {
    	this.fS = (java.lang.String) newValue;
    	return true;
    }
    return false;
    
  }
  
  public void setT(final Token pT) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fT = pT;
    
  }
  
  public void setS(final String pS) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fS = pS;
    
  }
  
  @Override
  public String patternName() {
    return "hu.textualmodeler.query.terminal";
    
  }
  
  @Override
  public List<String> parameterNames() {
    return TerminalMatch.parameterNames;
    
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fT, fS};
    
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"t\"=" + prettyPrintValue(fT) + ", ");
    result.append("\"s\"=" + prettyPrintValue(fS));
    return result.toString();
    
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fT == null) ? 0 : fT.hashCode()); 
    result = prime * result + ((fS == null) ? 0 : fS.hashCode()); 
    return result; 
    
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof TerminalMatch)) { // this should be infrequent				
    	if (obj == null)
    		return false;
    	if (!(obj instanceof IPatternMatch))
    		return false;
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!pattern().equals(otherSig.pattern()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    TerminalMatch other = (TerminalMatch) obj;
    if (fT == null) {if (other.fT != null) return false;}
    else if (!fT.equals(other.fT)) return false;
    if (fS == null) {if (other.fS != null) return false;}
    else if (!fS.equals(other.fS)) return false;
    return true;
  }
  
  @Override
  public Pattern pattern() {
    try {
    	return TerminalMatcher.querySpecification().getPattern();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException	(ex);
    }
    
  }
  
  @SuppressWarnings("all")
  static final class Mutable extends TerminalMatch {
    Mutable(final Token pT, final String pS) {
      super(pT, pS);
      
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  
  @SuppressWarnings("all")
  static final class Immutable extends TerminalMatch {
    Immutable(final Token pT, final String pS) {
      super(pT, pS);
      
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
  
}
