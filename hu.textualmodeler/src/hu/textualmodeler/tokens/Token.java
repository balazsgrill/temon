/**
 */
package hu.textualmodeler.tokens;

import hu.textualmodeler.grammar.Terminal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.textualmodeler.tokens.Token#getTail <em>Tail</em>}</li>
 *   <li>{@link hu.textualmodeler.tokens.Token#getValue <em>Value</em>}</li>
 *   <li>{@link hu.textualmodeler.tokens.Token#getTerminal <em>Terminal</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.textualmodeler.tokens.TokensPackage#getToken()
 * @model
 * @generated
 */
public interface Token extends EObject {
	/**
	 * Returns the value of the '<em><b>Tail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tail</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tail</em>' containment reference.
	 * @see #setTail(Token)
	 * @see hu.textualmodeler.tokens.TokensPackage#getToken_Tail()
	 * @model containment="true"
	 * @generated
	 */
	Token getTail();

	/**
	 * Sets the value of the '{@link hu.textualmodeler.tokens.Token#getTail <em>Tail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tail</em>' containment reference.
	 * @see #getTail()
	 * @generated
	 */
	void setTail(Token value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see hu.textualmodeler.tokens.TokensPackage#getToken_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link hu.textualmodeler.tokens.Token#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal</em>' reference.
	 * @see #setTerminal(Terminal)
	 * @see hu.textualmodeler.tokens.TokensPackage#getToken_Terminal()
	 * @model
	 * @generated
	 */
	Terminal getTerminal();

	/**
	 * Sets the value of the '{@link hu.textualmodeler.tokens.Token#getTerminal <em>Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal</em>' reference.
	 * @see #getTerminal()
	 * @generated
	 */
	void setTerminal(Terminal value);

} // Token
