/**
 */
package hu.temon.grammar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.temon.grammar.Terminal#getName <em>Name</em>}</li>
 *   <li>{@link hu.temon.grammar.Terminal#getRegex <em>Regex</em>}</li>
 *   <li>{@link hu.temon.grammar.Terminal#isHide <em>Hide</em>}</li>
 *   <li>{@link hu.temon.grammar.Terminal#getConvertFrom <em>Convert From</em>}</li>
 *   <li>{@link hu.temon.grammar.Terminal#getConvertTo <em>Convert To</em>}</li>
 *   <li>{@link hu.temon.grammar.Terminal#getPriority <em>Priority</em>}</li>
 *   <li>{@link hu.temon.grammar.Terminal#getSuperTerminal <em>Super Terminal</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.temon.grammar.GrammarPackage#getTerminal()
 * @model
 * @generated
 */
public interface Terminal extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see hu.temon.grammar.GrammarPackage#getTerminal_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.temon.grammar.Terminal#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regex</em>' attribute.
	 * @see #setRegex(String)
	 * @see hu.temon.grammar.GrammarPackage#getTerminal_Regex()
	 * @model required="true"
	 * @generated
	 */
	String getRegex();

	/**
	 * Sets the value of the '{@link hu.temon.grammar.Terminal#getRegex <em>Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regex</em>' attribute.
	 * @see #getRegex()
	 * @generated
	 */
	void setRegex(String value);

	/**
	 * Returns the value of the '<em><b>Hide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hide</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hide</em>' attribute.
	 * @see #setHide(boolean)
	 * @see hu.temon.grammar.GrammarPackage#getTerminal_Hide()
	 * @model
	 * @generated
	 */
	boolean isHide();

	/**
	 * Sets the value of the '{@link hu.temon.grammar.Terminal#isHide <em>Hide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hide</em>' attribute.
	 * @see #isHide()
	 * @generated
	 */
	void setHide(boolean value);

	/**
	 * Returns the value of the '<em><b>Convert From</b></em>' containment reference list.
	 * The list contents are of type {@link hu.temon.grammar.Replace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Convert From</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Convert From</em>' containment reference list.
	 * @see hu.temon.grammar.GrammarPackage#getTerminal_ConvertFrom()
	 * @model containment="true"
	 * @generated
	 */
	EList<Replace> getConvertFrom();

	/**
	 * Returns the value of the '<em><b>Convert To</b></em>' containment reference list.
	 * The list contents are of type {@link hu.temon.grammar.Replace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Convert To</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Convert To</em>' containment reference list.
	 * @see hu.temon.grammar.GrammarPackage#getTerminal_ConvertTo()
	 * @model containment="true"
	 * @generated
	 */
	EList<Replace> getConvertTo();

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see hu.temon.grammar.GrammarPackage#getTerminal_Priority()
	 * @model default="1"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link hu.temon.grammar.Terminal#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Super Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Terminal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Terminal</em>' reference.
	 * @see #setSuperTerminal(Terminal)
	 * @see hu.temon.grammar.GrammarPackage#getTerminal_SuperTerminal()
	 * @model
	 * @generated
	 */
	Terminal getSuperTerminal();

	/**
	 * Sets the value of the '{@link hu.temon.grammar.Terminal#getSuperTerminal <em>Super Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Terminal</em>' reference.
	 * @see #getSuperTerminal()
	 * @generated
	 */
	void setSuperTerminal(Terminal value);

} // Terminal
