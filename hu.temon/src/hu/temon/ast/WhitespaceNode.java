/**
 */
package hu.temon.ast;

import hu.temon.grammar.Terminal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Whitespace Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.temon.ast.WhitespaceNode#getTerminal <em>Terminal</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.temon.ast.AstPackage#getWhitespaceNode()
 * @model
 * @generated
 */
public interface WhitespaceNode extends VisibleNode {
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
	 * @see hu.temon.ast.AstPackage#getWhitespaceNode_Terminal()
	 * @model
	 * @generated
	 */
	Terminal getTerminal();

	/**
	 * Sets the value of the '{@link hu.temon.ast.WhitespaceNode#getTerminal <em>Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal</em>' reference.
	 * @see #getTerminal()
	 * @generated
	 */
	void setTerminal(Terminal value);

} // WhitespaceNode
