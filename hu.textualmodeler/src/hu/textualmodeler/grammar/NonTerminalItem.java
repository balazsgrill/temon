/**
 */
package hu.textualmodeler.grammar;

import hu.textualmodeler.grammar.scope.Scope;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Terminal Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.textualmodeler.grammar.NonTerminalItem#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link hu.textualmodeler.grammar.NonTerminalItem#getScope <em>Scope</em>}</li>
 *   <li>{@link hu.textualmodeler.grammar.NonTerminalItem#getNonTerminal <em>Non Terminal</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.textualmodeler.grammar.GrammarPackage#getNonTerminalItem()
 * @model
 * @generated
 */
public interface NonTerminalItem extends SyntaxItem {
	/**
	 * Returns the value of the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Name</em>' attribute.
	 * @see #setFeatureName(String)
	 * @see hu.textualmodeler.grammar.GrammarPackage#getNonTerminalItem_FeatureName()
	 * @model
	 * @generated
	 */
	String getFeatureName();

	/**
	 * Sets the value of the '{@link hu.textualmodeler.grammar.NonTerminalItem#getFeatureName <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Name</em>' attribute.
	 * @see #getFeatureName()
	 * @generated
	 */
	void setFeatureName(String value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' containment reference.
	 * @see #setScope(Scope)
	 * @see hu.textualmodeler.grammar.GrammarPackage#getNonTerminalItem_Scope()
	 * @model containment="true"
	 * @generated
	 */
	Scope getScope();

	/**
	 * Sets the value of the '{@link hu.textualmodeler.grammar.NonTerminalItem#getScope <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' containment reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Scope value);

	/**
	 * Returns the value of the '<em><b>Non Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Non Terminal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Terminal</em>' attribute.
	 * @see #setNonTerminal(String)
	 * @see hu.textualmodeler.grammar.GrammarPackage#getNonTerminalItem_NonTerminal()
	 * @model required="true"
	 * @generated
	 */
	String getNonTerminal();

	/**
	 * Sets the value of the '{@link hu.textualmodeler.grammar.NonTerminalItem#getNonTerminal <em>Non Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Terminal</em>' attribute.
	 * @see #getNonTerminal()
	 * @generated
	 */
	void setNonTerminal(String value);

} // NonTerminalItem
