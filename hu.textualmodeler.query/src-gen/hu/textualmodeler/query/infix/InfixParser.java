package hu.textualmodeler.query.infix;

import hu.textualmodeler.query.infix.E1Matcher;
import hu.textualmodeler.query.infix.E2Matcher;
import hu.textualmodeler.query.infix.E3Matcher;
import hu.textualmodeler.query.infix.EMatcher;
import hu.textualmodeler.query.infix.STARTMatcher;
import hu.textualmodeler.query.infix.TerminalMatcher;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * A pattern group formed of all patterns defined in InfixParser.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare 
 * an EMF-IncQuery engine for matching all patterns originally defined in file InfixParser.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.textualmodeler.query.infix, the group contains the definition of the following patterns: <ul>
 * <li>terminal</li>
 * <li>notEOF</li>
 * <li>EOF</li>
 * <li>START</li>
 * <li>E</li>
 * <li>E1</li>
 * <li>E2</li>
 * <li>E3</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class InfixParser extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static InfixParser instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new InfixParser();
    }
    return INSTANCE;
    
  }
  
  private static InfixParser INSTANCE;
  
  private InfixParser() throws IncQueryException {
    querySpecifications.add(E2Matcher.querySpecification());
    querySpecifications.add(STARTMatcher.querySpecification());
    querySpecifications.add(E1Matcher.querySpecification());
    querySpecifications.add(E3Matcher.querySpecification());
    querySpecifications.add(EMatcher.querySpecification());
    querySpecifications.add(TerminalMatcher.querySpecification());
    
  }
}
