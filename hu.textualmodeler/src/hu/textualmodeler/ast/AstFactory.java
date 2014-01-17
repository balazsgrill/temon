/**
 */
package hu.textualmodeler.ast;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.textualmodeler.ast.AstPackage
 * @generated
 */
public interface AstFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AstFactory eINSTANCE = hu.textualmodeler.ast.impl.AstFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Whitespace Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Whitespace Node</em>'.
	 * @generated
	 */
	WhitespaceNode createWhitespaceNode();

	/**
	 * Returns a new object of class '<em>Terminal Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Terminal Node</em>'.
	 * @generated
	 */
	TerminalNode createTerminalNode();

	/**
	 * Returns a new object of class '<em>Removed Terminal Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Removed Terminal Node</em>'.
	 * @generated
	 */
	RemovedTerminalNode createRemovedTerminalNode();

	/**
	 * Returns a new object of class '<em>Inserted Terminal Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inserted Terminal Node</em>'.
	 * @generated
	 */
	InsertedTerminalNode createInsertedTerminalNode();

	/**
	 * Returns a new object of class '<em>Inserted Feature Set Terminal Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inserted Feature Set Terminal Node</em>'.
	 * @generated
	 */
	InsertedFeatureSetTerminalNode createInsertedFeatureSetTerminalNode();

	/**
	 * Returns a new object of class '<em>Feature Set Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Set Value</em>'.
	 * @generated
	 */
	FeatureSetValue createFeatureSetValue();

	/**
	 * Returns a new object of class '<em>Feature Set Terminal Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Set Terminal Node</em>'.
	 * @generated
	 */
	FeatureSetTerminalNode createFeatureSetTerminalNode();

	/**
	 * Returns a new object of class '<em>Composite Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Node</em>'.
	 * @generated
	 */
	CompositeNode createCompositeNode();

	/**
	 * Returns a new object of class '<em>Feature Set Composite Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Set Composite Node</em>'.
	 * @generated
	 */
	FeatureSetCompositeNode createFeatureSetCompositeNode();

	/**
	 * Returns a new object of class '<em>Push Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Push Element</em>'.
	 * @generated
	 */
	PushElement createPushElement();

	/**
	 * Returns a new object of class '<em>Feature Set Push Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Set Push Element</em>'.
	 * @generated
	 */
	FeatureSetPushElement createFeatureSetPushElement();

	/**
	 * Returns a new object of class '<em>Pop Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pop Element</em>'.
	 * @generated
	 */
	PopElement createPopElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AstPackage getAstPackage();

} //AstFactory
