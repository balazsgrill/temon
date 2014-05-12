/**
 */
package hu.temon.ast;

import org.eclipse.emf.ecore.EClass;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Push Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.temon.ast.PushElement#getEclass <em>Eclass</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.temon.ast.AstPackage#getPushElement()
 * @model
 * @generated
 */
public interface PushElement extends Node {
	/**
	 * Returns the value of the '<em><b>Eclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eclass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eclass</em>' reference.
	 * @see #setEclass(EClass)
	 * @see hu.temon.ast.AstPackage#getPushElement_Eclass()
	 * @model required="true"
	 * @generated
	 */
	EClass getEclass();

	/**
	 * Sets the value of the '{@link hu.temon.ast.PushElement#getEclass <em>Eclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eclass</em>' reference.
	 * @see #getEclass()
	 * @generated
	 */
	void setEclass(EClass value);

} // PushElement
