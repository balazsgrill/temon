package hu.textualmodeler.query.infix.util;

import hu.textualmodeler.query.infix.EMatch;
import hu.textualmodeler.tokens.Token;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.textualmodeler.query.infix.E pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class EProcessor implements IMatchProcessor<EMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pFirst the value of pattern parameter first in the currently processed match 
   * @param pNext the value of pattern parameter next in the currently processed match 
   * 
   */
  public abstract void process(final Token pFirst, final Token pNext);
  
  @Override
  public void process(final EMatch match) {
    process(match.getFirst(), match.getNext());
    
  }
}
