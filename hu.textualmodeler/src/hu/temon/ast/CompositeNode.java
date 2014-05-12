/**
 */
package hu.temon.ast;

import hu.temon.grammar.Rule;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.temon.ast.CompositeNode#getNonterminal <em>Nonterminal</em>}</li>
 *   <li>{@link hu.temon.ast.CompositeNode#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.temon.ast.AstPackage#getCompositeNode()
 * @model
 * @generated
 */
public interface CompositeNode extends Node {
	/**
	 * Returns the value of the '<em><b>Nonterminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nonterminal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nonterminal</em>' reference.
	 * @see #setNonterminal(Rule)
	 * @see hu.temon.ast.AstPackage#getCompositeNode_Nonterminal()
	 * @model
	 * @generated
	 */
	Rule getNonterminal();

	/**
	 * Sets the value of the '{@link hu.temon.ast.CompositeNode#getNonterminal <em>Nonterminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nonterminal</em>' reference.
	 * @see #getNonterminal()
	 * @generated
	 */
	void setNonterminal(Rule value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link hu.temon.ast.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see hu.temon.ast.AstPackage#getCompositeNode_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getChildren();

} // CompositeNode
