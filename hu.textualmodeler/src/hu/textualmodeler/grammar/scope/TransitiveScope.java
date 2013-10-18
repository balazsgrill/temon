/**
 */
package hu.textualmodeler.grammar.scope;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transitive Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.textualmodeler.grammar.scope.TransitiveScope#isOptional <em>Optional</em>}</li>
 *   <li>{@link hu.textualmodeler.grammar.scope.TransitiveScope#getSubScope <em>Sub Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.textualmodeler.grammar.scope.ScopePackage#getTransitiveScope()
 * @model
 * @generated
 */
public interface TransitiveScope extends Scope {
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
	 * @see hu.textualmodeler.grammar.scope.ScopePackage#getTransitiveScope_Optional()
	 * @model
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link hu.textualmodeler.grammar.scope.TransitiveScope#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

	/**
	 * Returns the value of the '<em><b>Sub Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Scope</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Scope</em>' containment reference.
	 * @see #setSubScope(Scope)
	 * @see hu.textualmodeler.grammar.scope.ScopePackage#getTransitiveScope_SubScope()
	 * @model containment="true"
	 * @generated
	 */
	Scope getSubScope();

	/**
	 * Sets the value of the '{@link hu.textualmodeler.grammar.scope.TransitiveScope#getSubScope <em>Sub Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Scope</em>' containment reference.
	 * @see #getSubScope()
	 * @generated
	 */
	void setSubScope(Scope value);

} // TransitiveScope
