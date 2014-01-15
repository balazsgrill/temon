/**
 */
package hu.textualmodeler.grammar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.textualmodeler.grammar.Rule#getNonTerminal <em>Non Terminal</em>}</li>
 *   <li>{@link hu.textualmodeler.grammar.Rule#getCondition <em>Condition</em>}</li>
 *   <li>{@link hu.textualmodeler.grammar.Rule#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.textualmodeler.grammar.GrammarPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Non Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Non Terminal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Terminal</em>' attribute.
	 * @see #setNonTerminal(String)
	 * @see hu.textualmodeler.grammar.GrammarPackage#getRule_NonTerminal()
	 * @model required="true"
	 * @generated
	 */
	String getNonTerminal();

	/**
	 * Sets the value of the '{@link hu.textualmodeler.grammar.Rule#getNonTerminal <em>Non Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Terminal</em>' attribute.
	 * @see #getNonTerminal()
	 * @generated
	 */
	void setNonTerminal(String value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute list.
	 * @see hu.textualmodeler.grammar.GrammarPackage#getRule_Condition()
	 * @model
	 * @generated
	 */
	EList<String> getCondition();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference list.
	 * The list contents are of type {@link hu.textualmodeler.grammar.RuleItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference list.
	 * @see hu.textualmodeler.grammar.GrammarPackage#getRule_Body()
	 * @model containment="true"
	 * @generated
	 */
	EList<RuleItem> getBody();

} // Rule
