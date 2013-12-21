/**
 */
package hu.textualmodeler.tokens;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.textualmodeler.tokens.TokenList#getHead <em>Head</em>}</li>
 *   <li>{@link hu.textualmodeler.tokens.TokenList#getTail <em>Tail</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.textualmodeler.tokens.TokensPackage#getTokenList()
 * @model
 * @generated
 */
public interface TokenList extends EObject {
	/**
	 * Returns the value of the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Head</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head</em>' containment reference.
	 * @see #setHead(TokenValue)
	 * @see hu.textualmodeler.tokens.TokensPackage#getTokenList_Head()
	 * @model containment="true"
	 * @generated
	 */
	TokenValue getHead();

	/**
	 * Sets the value of the '{@link hu.textualmodeler.tokens.TokenList#getHead <em>Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head</em>' containment reference.
	 * @see #getHead()
	 * @generated
	 */
	void setHead(TokenValue value);

	/**
	 * Returns the value of the '<em><b>Tail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tail</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tail</em>' containment reference.
	 * @see #setTail(TokenList)
	 * @see hu.textualmodeler.tokens.TokensPackage#getTokenList_Tail()
	 * @model containment="true"
	 * @generated
	 */
	TokenList getTail();

	/**
	 * Sets the value of the '{@link hu.textualmodeler.tokens.TokenList#getTail <em>Tail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tail</em>' containment reference.
	 * @see #getTail()
	 * @generated
	 */
	void setTail(TokenList value);

} // TokenList
