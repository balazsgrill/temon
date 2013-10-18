/**
 */
package hu.textualmodeler.ast;

import hu.textualmodeler.grammar.Terminal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminal Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.textualmodeler.ast.TerminalNode#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link hu.textualmodeler.ast.TerminalNode#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.textualmodeler.ast.AstPackage#getTerminalNode()
 * @model
 * @generated
 */
public interface TerminalNode extends VisibleNode {
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
	 * @see hu.textualmodeler.ast.AstPackage#getTerminalNode_Terminal()
	 * @model
	 * @generated
	 */
	Terminal getTerminal();

	/**
	 * Sets the value of the '{@link hu.textualmodeler.ast.TerminalNode#getTerminal <em>Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal</em>' reference.
	 * @see #getTerminal()
	 * @generated
	 */
	void setTerminal(Terminal value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see hu.textualmodeler.ast.AstPackage#getTerminalNode_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link hu.textualmodeler.ast.TerminalNode#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

} // TerminalNode
