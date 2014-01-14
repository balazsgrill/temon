package hu.textualmodeler.query.infix.util;

import hu.textualmodeler.query.infix.STARTMatch;
import hu.textualmodeler.tokens.Token;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.textualmodeler.query.infix.START pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class STARTProcessor implements IMatchProcessor<STARTMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pFirst the value of pattern parameter first in the currently processed match 
   * @param pEof the value of pattern parameter eof in the currently processed match 
   * 
   */
  public abstract void process(final Token pFirst, final Token pEof);
  
  @Override
  public void process(final STARTMatch match) {
    process(match.getFirst(), match.getEof());
    
  }
}
