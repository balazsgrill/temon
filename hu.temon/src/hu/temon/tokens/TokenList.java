/**
 */
package hu.temon.tokens;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.temon.tokens.TokenList#getTokens <em>Tokens</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.temon.tokens.TokensPackage#getTokenList()
 * @model
 * @generated
 */
public interface TokenList extends EObject {
	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link hu.temon.tokens.Token}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tokens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' containment reference list.
	 * @see hu.temon.tokens.TokensPackage#getTokenList_Tokens()
	 * @model containment="true"
	 * @generated
	 */
	EList<Token> getTokens();

} // TokenList
