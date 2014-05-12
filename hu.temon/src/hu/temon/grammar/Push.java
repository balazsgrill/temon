/**
 */
package hu.temon.grammar;

import org.eclipse.emf.ecore.EClass;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Push</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.temon.grammar.Push#getEclass <em>Eclass</em>}</li>
 *   <li>{@link hu.temon.grammar.Push#getFeatureName <em>Feature Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.temon.grammar.GrammarPackage#getPush()
 * @model
 * @generated
 */
public interface Push extends RuleItem {
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
	 * @see hu.temon.grammar.GrammarPackage#getPush_Eclass()
	 * @model required="true"
	 * @generated
	 */
	EClass getEclass();

	/**
	 * Sets the value of the '{@link hu.temon.grammar.Push#getEclass <em>Eclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eclass</em>' reference.
	 * @see #getEclass()
	 * @generated
	 */
	void setEclass(EClass value);

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
	 * @see hu.temon.grammar.GrammarPackage#getPush_FeatureName()
	 * @model
	 * @generated
	 */
	String getFeatureName();

	/**
	 * Sets the value of the '{@link hu.temon.grammar.Push#getFeatureName <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Name</em>' attribute.
	 * @see #getFeatureName()
	 * @generated
	 */
	void setFeatureName(String value);

} // Push
