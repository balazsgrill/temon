/**
 */
package hu.textualmodeler.grammar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Syntax Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.textualmodeler.grammar.SyntaxItem#isOptional <em>Optional</em>}</li>
 *   <li>{@link hu.textualmodeler.grammar.SyntaxItem#isMany <em>Many</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.textualmodeler.grammar.GrammarPackage#getSyntaxItem()
 * @model abstract="true"
 * @generated
 */
public interface SyntaxItem extends RuleItem {
	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(boolean)
	 * @see hu.textualmodeler.grammar.GrammarPackage#getSyntaxItem_Optional()
	 * @model
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link hu.textualmodeler.grammar.SyntaxItem#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

	/**
	 * Returns the value of the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Many</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Many</em>' attribute.
	 * @see #setMany(boolean)
	 * @see hu.textualmodeler.grammar.GrammarPackage#getSyntaxItem_Many()
	 * @model
	 * @generated
	 */
	boolean isMany();

	/**
	 * Sets the value of the '{@link hu.textualmodeler.grammar.SyntaxItem#isMany <em>Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Many</em>' attribute.
	 * @see #isMany()
	 * @generated
	 */
	void setMany(boolean value);

} // SyntaxItem
