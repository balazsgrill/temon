/**
 */
package hu.textualmodeler.ast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Push Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.textualmodeler.ast.PushElement#getEclassURI <em>Eclass URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.textualmodeler.ast.AstPackage#getPushElement()
 * @model
 * @generated
 */
public interface PushElement extends Node {
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
	 * @see hu.textualmodeler.ast.AstPackage#getPushElement_EclassURI()
	 * @model required="true"
	 * @generated
	 */
	String getEclassURI();

	/**
	 * Sets the value of the '{@link hu.textualmodeler.ast.PushElement#getEclassURI <em>Eclass URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eclass URI</em>' attribute.
	 * @see #getEclassURI()
	 * @generated
	 */
	void setEclassURI(String value);

} // PushElement
