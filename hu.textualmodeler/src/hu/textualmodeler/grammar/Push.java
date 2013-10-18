/**
 */
package hu.textualmodeler.grammar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Push</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.textualmodeler.grammar.Push#getEclassURI <em>Eclass URI</em>}</li>
 *   <li>{@link hu.textualmodeler.grammar.Push#getFeatureName <em>Feature Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.textualmodeler.grammar.GrammarPackage#getPush()
 * @model
 * @generated
 */
public interface Push extends RuleItem {
	/**
	 * Returns the value of the '<em><b>Eclass URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eclass URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eclass URI</em>' attribute.
	 * @see #setEclassURI(String)
	 * @see hu.textualmodeler.grammar.GrammarPackage#getPush_EclassURI()
	 * @model required="true"
	 * @generated
	 */
	String getEclassURI();

	/**
	 * Sets the value of the '{@link hu.textualmodeler.grammar.Push#getEclassURI <em>Eclass URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eclass URI</em>' attribute.
	 * @see #getEclassURI()
	 * @generated
	 */
	void setEclassURI(String value);

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
	 * @see hu.textualmodeler.grammar.GrammarPackage#getPush_FeatureName()
	 * @model
	 * @generated
	 */
	String getFeatureName();

	/**
	 * Sets the value of the '{@link hu.textualmodeler.grammar.Push#getFeatureName <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Name</em>' attribute.
	 * @see #getFeatureName()
	 * @generated
	 */
	void setFeatureName(String value);

} // Push
