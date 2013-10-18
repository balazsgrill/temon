/**
 */
package hu.textualmodeler.grammar.scope;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.textualmodeler.grammar.scope.ConditionalScope#getFeatureName <em>Feature Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.textualmodeler.grammar.scope.ScopePackage#getConditionalScope()
 * @model
 * @generated
 */
public interface ConditionalScope extends Scope {
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
	 * @see hu.textualmodeler.grammar.scope.ScopePackage#getConditionalScope_FeatureName()
	 * @model
	 * @generated
	 */
	String getFeatureName();

	/**
	 * Sets the value of the '{@link hu.textualmodeler.grammar.scope.ConditionalScope#getFeatureName <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Name</em>' attribute.
	 * @see #getFeatureName()
	 * @generated
	 */
	void setFeatureName(String value);

} // ConditionalScope
