/**
 */
package hu.textualmodeler.grammar.scope;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.textualmodeler.grammar.scope.ScopeFactory
 * @model kind="package"
 * @generated
 */
public interface ScopePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "scope";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://textualmodeler.hu/grammar/scope";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "scope";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScopePackage eINSTANCE = hu.textualmodeler.grammar.scope.impl.ScopePackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.textualmodeler.grammar.scope.impl.ScopeImpl <em>Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.textualmodeler.grammar.scope.impl.ScopeImpl
	 * @see hu.textualmodeler.grammar.scope.impl.ScopePackageImpl#getScope()
	 * @generated
	 */
	int SCOPE = 0;

	/**
	 * The number of structural features of the '<em>Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.textualmodeler.grammar.scope.impl.FeatureScopeImpl <em>Feature Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.textualmodeler.grammar.scope.impl.FeatureScopeImpl
	 * @see hu.textualmodeler.grammar.scope.impl.ScopePackageImpl#getFeatureScope()
	 * @generated
	 */
	int FEATURE_SCOPE = 1;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SCOPE__FEATURE_NAME = SCOPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SCOPE_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Feature Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SCOPE_OPERATION_COUNT = SCOPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.textualmodeler.grammar.scope.impl.ContainerScopeImpl <em>Container Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.textualmodeler.grammar.scope.impl.ContainerScopeImpl
	 * @see hu.textualmodeler.grammar.scope.impl.ScopePackageImpl#getContainerScope()
	 * @generated
	 */
	int CONTAINER_SCOPE = 2;

	/**
	 * The number of structural features of the '<em>Container Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SCOPE_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Container Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_SCOPE_OPERATION_COUNT = SCOPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.textualmodeler.grammar.scope.impl.TransitiveScopeImpl <em>Transitive Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.textualmodeler.grammar.scope.impl.TransitiveScopeImpl
	 * @see hu.textualmodeler.grammar.scope.impl.ScopePackageImpl#getTransitiveScope()
	 * @generated
	 */
	int TRANSITIVE_SCOPE = 3;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIVE_SCOPE__OPTIONAL = SCOPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIVE_SCOPE__SUB_SCOPE = SCOPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transitive Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIVE_SCOPE_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Transitive Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIVE_SCOPE_OPERATION_COUNT = SCOPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.textualmodeler.grammar.scope.impl.ChainedScopeImpl <em>Chained Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.textualmodeler.grammar.scope.impl.ChainedScopeImpl
	 * @see hu.textualmodeler.grammar.scope.impl.ScopePackageImpl#getChainedScope()
	 * @generated
	 */
	int CHAINED_SCOPE = 4;

	/**
	 * The feature id for the '<em><b>Sub Scopes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAINED_SCOPE__SUB_SCOPES = SCOPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Chained Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAINED_SCOPE_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Chained Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAINED_SCOPE_OPERATION_COUNT = SCOPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.textualmodeler.grammar.scope.impl.ConditionalScopeImpl <em>Conditional Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.textualmodeler.grammar.scope.impl.ConditionalScopeImpl
	 * @see hu.textualmodeler.grammar.scope.impl.ScopePackageImpl#getConditionalScope()
	 * @generated
	 */
	int CONDITIONAL_SCOPE = 5;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_SCOPE__FEATURE_NAME = SCOPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conditional Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_SCOPE_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Conditional Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_SCOPE_OPERATION_COUNT = SCOPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.textualmodeler.grammar.scope.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope</em>'.
	 * @see hu.textualmodeler.grammar.scope.Scope
	 * @generated
	 */
	EClass getScope();

	/**
	 * Returns the meta object for class '{@link hu.textualmodeler.grammar.scope.FeatureScope <em>Feature Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Scope</em>'.
	 * @see hu.textualmodeler.grammar.scope.FeatureScope
	 * @generated
	 */
	EClass getFeatureScope();

	/**
	 * Returns the meta object for the attribute '{@link hu.textualmodeler.grammar.scope.FeatureScope#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see hu.textualmodeler.grammar.scope.FeatureScope#getFeatureName()
	 * @see #getFeatureScope()
	 * @generated
	 */
	EAttribute getFeatureScope_FeatureName();

	/**
	 * Returns the meta object for class '{@link hu.textualmodeler.grammar.scope.ContainerScope <em>Container Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Scope</em>'.
	 * @see hu.textualmodeler.grammar.scope.ContainerScope
	 * @generated
	 */
	EClass getContainerScope();

	/**
	 * Returns the meta object for class '{@link hu.textualmodeler.grammar.scope.TransitiveScope <em>Transitive Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transitive Scope</em>'.
	 * @see hu.textualmodeler.grammar.scope.TransitiveScope
	 * @generated
	 */
	EClass getTransitiveScope();

	/**
	 * Returns the meta object for the attribute '{@link hu.textualmodeler.grammar.scope.TransitiveScope#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see hu.textualmodeler.grammar.scope.TransitiveScope#isOptional()
	 * @see #getTransitiveScope()
	 * @generated
	 */
	EAttribute getTransitiveScope_Optional();

	/**
	 * Returns the meta object for the containment reference '{@link hu.textualmodeler.grammar.scope.TransitiveScope#getSubScope <em>Sub Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Scope</em>'.
	 * @see hu.textualmodeler.grammar.scope.TransitiveScope#getSubScope()
	 * @see #getTransitiveScope()
	 * @generated
	 */
	EReference getTransitiveScope_SubScope();

	/**
	 * Returns the meta object for class '{@link hu.textualmodeler.grammar.scope.ChainedScope <em>Chained Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chained Scope</em>'.
	 * @see hu.textualmodeler.grammar.scope.ChainedScope
	 * @generated
	 */
	EClass getChainedScope();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.textualmodeler.grammar.scope.ChainedScope#getSubScopes <em>Sub Scopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Scopes</em>'.
	 * @see hu.textualmodeler.grammar.scope.ChainedScope#getSubScopes()
	 * @see #getChainedScope()
	 * @generated
	 */
	EReference getChainedScope_SubScopes();

	/**
	 * Returns the meta object for class '{@link hu.textualmodeler.grammar.scope.ConditionalScope <em>Conditional Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Scope</em>'.
	 * @see hu.textualmodeler.grammar.scope.ConditionalScope
	 * @generated
	 */
	EClass getConditionalScope();

	/**
	 * Returns the meta object for the attribute '{@link hu.textualmodeler.grammar.scope.ConditionalScope#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see hu.textualmodeler.grammar.scope.ConditionalScope#getFeatureName()
	 * @see #getConditionalScope()
	 * @generated
	 */
	EAttribute getConditionalScope_FeatureName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScopeFactory getScopeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.textualmodeler.grammar.scope.impl.ScopeImpl <em>Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.textualmodeler.grammar.scope.impl.ScopeImpl
		 * @see hu.textualmodeler.grammar.scope.impl.ScopePackageImpl#getScope()
		 * @generated
		 */
		EClass SCOPE = eINSTANCE.getScope();

		/**
		 * The meta object literal for the '{@link hu.textualmodeler.grammar.scope.impl.FeatureScopeImpl <em>Feature Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.textualmodeler.grammar.scope.impl.FeatureScopeImpl
		 * @see hu.textualmodeler.grammar.scope.impl.ScopePackageImpl#getFeatureScope()
		 * @generated
		 */
		EClass FEATURE_SCOPE = eINSTANCE.getFeatureScope();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_SCOPE__FEATURE_NAME = eINSTANCE.getFeatureScope_FeatureName();

		/**
		 * The meta object literal for the '{@link hu.textualmodeler.grammar.scope.impl.ContainerScopeImpl <em>Container Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.textualmodeler.grammar.scope.impl.ContainerScopeImpl
		 * @see hu.textualmodeler.grammar.scope.impl.ScopePackageImpl#getContainerScope()
		 * @generated
		 */
		EClass CONTAINER_SCOPE = eINSTANCE.getContainerScope();

		/**
		 * The meta object literal for the '{@link hu.textualmodeler.grammar.scope.impl.TransitiveScopeImpl <em>Transitive Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.textualmodeler.grammar.scope.impl.TransitiveScopeImpl
		 * @see hu.textualmodeler.grammar.scope.impl.ScopePackageImpl#getTransitiveScope()
		 * @generated
		 */
		EClass TRANSITIVE_SCOPE = eINSTANCE.getTransitiveScope();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITIVE_SCOPE__OPTIONAL = eINSTANCE.getTransitiveScope_Optional();

		/**
		 * The meta object literal for the '<em><b>Sub Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITIVE_SCOPE__SUB_SCOPE = eINSTANCE.getTransitiveScope_SubScope();

		/**
		 * The meta object literal for the '{@link hu.textualmodeler.grammar.scope.impl.ChainedScopeImpl <em>Chained Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.textualmodeler.grammar.scope.impl.ChainedScopeImpl
		 * @see hu.textualmodeler.grammar.scope.impl.ScopePackageImpl#getChainedScope()
		 * @generated
		 */
		EClass CHAINED_SCOPE = eINSTANCE.getChainedScope();

		/**
		 * The meta object literal for the '<em><b>Sub Scopes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAINED_SCOPE__SUB_SCOPES = eINSTANCE.getChainedScope_SubScopes();

		/**
		 * The meta object literal for the '{@link hu.textualmodeler.grammar.scope.impl.ConditionalScopeImpl <em>Conditional Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.textualmodeler.grammar.scope.impl.ConditionalScopeImpl
		 * @see hu.textualmodeler.grammar.scope.impl.ScopePackageImpl#getConditionalScope()
		 * @generated
		 */
		EClass CONDITIONAL_SCOPE = eINSTANCE.getConditionalScope();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL_SCOPE__FEATURE_NAME = eINSTANCE.getConditionalScope_FeatureName();

	}

} //ScopePackage
