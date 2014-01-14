package hu.textualmodeler.query.util;

import hu.textualmodeler.query.TerminalMatch;
import hu.textualmodeler.tokens.Token;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.textualmodeler.query.terminal pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class TerminalProcessor implements IMatchProcessor<TerminalMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pT the value of pattern parameter t in the currently processed match 
   * @param pS the value of pattern parameter s in the currently processed match 
   * 
   */
  public abstract void process(final Token pT, final String pS);
  
  @Override
  public void process(final TerminalMatch match) {
    process(match.getT(), match.getS());
    
  }
}
