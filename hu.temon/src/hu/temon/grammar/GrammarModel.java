/**
 */
package hu.temon.grammar;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.temon.grammar.GrammarModel#getTerminals <em>Terminals</em>}</li>
 *   <li>{@link hu.temon.grammar.GrammarModel#getRules <em>Rules</em>}</li>
 *   <li>{@link hu.temon.grammar.GrammarModel#getStartItem <em>Start Item</em>}</li>
 *   <li>{@link hu.temon.grammar.GrammarModel#getImport <em>Import</em>}</li>
 *   <li>{@link hu.temon.grammar.GrammarModel#getName <em>Name</em>}</li>
 *   <li>{@link hu.temon.grammar.GrammarModel#getEimport <em>Eimport</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.temon.grammar.GrammarPackage#getGrammarModel()
 * @model
 * @generated
 */
public interface GrammarModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Terminals</b></em>' containment reference list.
	 * The list contents are of type {@link hu.temon.grammar.Terminal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminals</em>' containment reference list.
	 * @see hu.temon.grammar.GrammarPackage#getGrammarModel_Terminals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Terminal> getTerminals();

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link hu.temon.grammar.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see hu.temon.grammar.GrammarPackage#getGrammarModel_Rules()
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
	 * @see hu.temon.grammar.GrammarPackage#getGrammarModel_StartItem()
	 * @model required="true"
	 * @generated
	 */
	String getStartItem();

	/**
	 * Sets the value of the '{@link hu.temon.grammar.GrammarModel#getStartItem <em>Start Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Item</em>' attribute.
	 * @see #getStartItem()
	 * @generated
	 */
	void setStartItem(String value);

	/**
	 * Returns the value of the '<em><b>Import</b></em>' reference list.
	 * The list contents are of type {@link hu.temon.grammar.GrammarModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import</em>' reference list.
	 * @see hu.temon.grammar.GrammarPackage#getGrammarModel_Import()
	 * @model
	 * @generated
	 */
	EList<GrammarModel> getImport();

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
	 * @see hu.temon.grammar.GrammarPackage#getGrammarModel_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link hu.temon.grammar.GrammarModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Eimport</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eimport</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eimport</em>' reference list.
	 * @see hu.temon.grammar.GrammarPackage#getGrammarModel_Eimport()
	 * @model
	 * @generated
	 */
	EList<EPackage> getEimport();

} // GrammarModel
