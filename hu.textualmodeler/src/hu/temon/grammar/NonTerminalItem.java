/**
 */
package hu.temon.grammar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Terminal Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.temon.grammar.NonTerminalItem#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link hu.temon.grammar.NonTerminalItem#getNonTerminal <em>Non Terminal</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.temon.grammar.GrammarPackage#getNonTerminalItem()
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
	 * @see hu.temon.grammar.GrammarPackage#getNonTerminalItem_FeatureName()
	 * @model
	 * @generated
	 */
	String getFeatureName();

	/**
	 * Sets the value of the '{@link hu.temon.grammar.NonTerminalItem#getFeatureName <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Name</em>' attribute.
	 * @see #getFeatureName()
	 * @generated
	 */
	void setFeatureName(String value);

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
	 * @see hu.temon.grammar.GrammarPackage#getNonTerminalItem_NonTerminal()
	 * @model required="true"
	 * @generated
	 */
	String getNonTerminal();

	/**
	 * Sets the value of the '{@link hu.temon.grammar.NonTerminalItem#getNonTerminal <em>Non Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Terminal</em>' attribute.
	 * @see #getNonTerminal()
	 * @generated
	 */
	void setNonTerminal(String value);

} // NonTerminalItem
