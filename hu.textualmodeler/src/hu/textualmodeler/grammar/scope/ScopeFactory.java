/**
 */
package hu.textualmodeler.grammar.scope;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.textualmodeler.grammar.scope.ScopePackage
 * @generated
 */
public interface ScopeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScopeFactory eINSTANCE = hu.textualmodeler.grammar.scope.impl.ScopeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Feature Scope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Scope</em>'.
	 * @generated
	 */
	FeatureScope createFeatureScope();

	/**
	 * Returns a new object of class '<em>Container Scope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Scope</em>'.
	 * @generated
	 */
	ContainerScope createContainerScope();

	/**
	 * Returns a new object of class '<em>Transitive Scope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transitive Scope</em>'.
	 * @generated
	 */
	TransitiveScope createTransitiveScope();

	/**
	 * Returns a new object of class '<em>Chained Scope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chained Scope</em>'.
	 * @generated
	 */
	ChainedScope createChainedScope();

	/**
	 * Returns a new object of class '<em>Conditional Scope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Scope</em>'.
	 * @generated
	 */
	ConditionalScope createConditionalScope();

	/**
	 * Returns a new object of class '<em>Global Scope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Scope</em>'.
	 * @generated
	 */
	GlobalScope createGlobalScope();

	/**
	 * Returns a new object of class '<em>Union Scope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Union Scope</em>'.
	 * @generated
	 */
	UnionScope createUnionScope();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ScopePackage getScopePackage();

} //ScopeFactory
