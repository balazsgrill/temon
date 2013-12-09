/**
 */
package hu.textualmodeler.grammar;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminal Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.textualmodeler.grammar.TerminalItem#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link hu.textualmodeler.grammar.TerminalItem#getTerminal <em>Terminal</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.textualmodeler.grammar.GrammarPackage#getTerminalItem()
 * @model
 * @generated
 */
public interface TerminalItem extends SyntaxItem {
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
	 * @see hu.textualmodeler.grammar.GrammarPackage#getTerminalItem_FeatureName()
	 * @model
	 * @generated
	 */
	String getFeatureName();

	/**
	 * Sets the value of the '{@link hu.textualmodeler.grammar.TerminalItem#getFeatureName <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Name</em>' attribute.
	 * @see #getFeatureName()
	 * @generated
	 */
	void setFeatureName(String value);

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
	 * @see hu.textualmodeler.grammar.GrammarPackage#getTerminalItem_Terminal()
	 * @model required="true"
	 * @generated
	 */
	Terminal getTerminal();

	/**
	 * Sets the value of the '{@link hu.textualmodeler.grammar.TerminalItem#getTerminal <em>Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal</em>' reference.
	 * @see #getTerminal()
	 * @generated
	 */
	void setTerminal(Terminal value);

} // TerminalItem
