/**
 */
package hu.textualmodeler.grammar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.textualmodeler.grammar.GrammarModel#getTerminals <em>Terminals</em>}</li>
 *   <li>{@link hu.textualmodeler.grammar.GrammarModel#getRules <em>Rules</em>}</li>
 *   <li>{@link hu.textualmodeler.grammar.GrammarModel#getStartItem <em>Start Item</em>}</li>
 *   <li>{@link hu.textualmodeler.grammar.GrammarModel#getImport <em>Import</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.textualmodeler.grammar.GrammarPackage#getGrammarModel()
 * @model
 * @generated
 */
public interface GrammarModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Terminals</b></em>' containment reference list.
	 * The list contents are of type {@link hu.textualmodeler.grammar.Terminal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminals</em>' containment reference list.
	 * @see hu.textualmodeler.grammar.GrammarPackage#getGrammarModel_Terminals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Terminal> getTerminals();

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link hu.textualmodeler.grammar.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see hu.textualmodeler.grammar.GrammarPackage#getGrammarModel_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getRules();

	/**
	 * Returns the value of the '<em><b>Start Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Item</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Item</em>' attribute.
	 * @see #setStartItem(String)
	 * @see hu.textualmodeler.grammar.GrammarPackage#getGrammarModel_StartItem()
	 * @model required="true"
	 * @generated
	 */
	String getStartItem();

	/**
	 * Sets the value of the '{@link hu.textualmodeler.grammar.GrammarModel#getStartItem <em>Start Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Item</em>' attribute.
	 * @see #getStartItem()
	 * @generated
	 */
	void setStartItem(String value);

	/**
	 * Returns the value of the '<em><b>Import</b></em>' reference list.
	 * The list contents are of type {@link hu.textualmodeler.grammar.GrammarModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import</em>' reference list.
	 * @see hu.textualmodeler.grammar.GrammarPackage#getGrammarModel_Import()
	 * @model
	 * @generated
	 */
	EList<GrammarModel> getImport();

} // GrammarModel
