/**
 */
package hu.textualmodeler.tokens;

import hu.textualmodeler.grammar.Terminal;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminal List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.textualmodeler.tokens.TerminalList#getTerminals <em>Terminals</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.textualmodeler.tokens.TokensPackage#getTerminalList()
 * @model
 * @generated
 */
public interface TerminalList extends EObject {
	/**
	 * Returns the value of the '<em><b>Terminals</b></em>' reference list.
	 * The list contents are of type {@link hu.textualmodeler.grammar.Terminal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminals</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminals</em>' reference list.
	 * @see hu.textualmodeler.tokens.TokensPackage#getTerminalList_Terminals()
	 * @model
	 * @generated
	 */
	EList<Terminal> getTerminals();

} // TerminalList
