/**
 */
package hu.textualmodeler.grammar.scope;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.textualmodeler.grammar.scope.GlobalScope#getEclassURI <em>Eclass URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.textualmodeler.grammar.scope.ScopePackage#getGlobalScope()
 * @model
 * @generated
 */
public interface GlobalScope extends Scope {
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
	 * @see hu.textualmodeler.grammar.scope.ScopePackage#getGlobalScope_EclassURI()
	 * @model required="true"
	 * @generated
	 */
	String getEclassURI();

	/**
	 * Sets the value of the '{@link hu.textualmodeler.grammar.scope.GlobalScope#getEclassURI <em>Eclass URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eclass URI</em>' attribute.
	 * @see #getEclassURI()
	 * @generated
	 */
	void setEclassURI(String value);

} // GlobalScope
