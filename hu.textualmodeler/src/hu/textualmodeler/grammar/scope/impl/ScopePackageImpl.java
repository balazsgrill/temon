/**
 */
package hu.textualmodeler.grammar.scope.impl;

import hu.textualmodeler.ast.AstPackage;

import hu.textualmodeler.ast.impl.AstPackageImpl;

import hu.textualmodeler.grammar.GrammarPackage;

import hu.textualmodeler.grammar.impl.GrammarPackageImpl;

import hu.textualmodeler.grammar.scope.ChainedScope;
import hu.textualmodeler.grammar.scope.ConditionalScope;
import hu.textualmodeler.grammar.scope.ContainerScope;
import hu.textualmodeler.grammar.scope.FeatureScope;
import hu.textualmodeler.grammar.scope.GlobalScope;
import hu.textualmodeler.grammar.scope.Scope;
import hu.textualmodeler.grammar.scope.ScopeFactory;
import hu.textualmodeler.grammar.scope.ScopePackage;
import hu.textualmodeler.grammar.scope.TransitiveScope;

import hu.textualmodeler.grammar.scope.UnionScope;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScopePackageImpl extends EPackageImpl implements ScopePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitiveScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chainedScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unionScopeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see hu.textualmodeler.grammar.scope.ScopePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ScopePackageImpl() {
		super(eNS_URI, ScopeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ScopePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ScopePackage init() {
		if (isInited) return (ScopePackage)EPackage.Registry.INSTANCE.getEPackage(ScopePackage.eNS_URI);

		// Obtain or create and register package
		ScopePackageImpl theScopePackage = (ScopePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ScopePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ScopePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		AstPackageImpl theAstPackage = (AstPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AstPackage.eNS_URI) instanceof AstPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AstPackage.eNS_URI) : AstPackage.eINSTANCE);
		GrammarPackageImpl theGrammarPackage = (GrammarPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GrammarPackage.eNS_URI) instanceof GrammarPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GrammarPackage.eNS_URI) : GrammarPackage.eINSTANCE);

		// Create package meta-data objects
		theScopePackage.createPackageContents();
		theAstPackage.createPackageContents();
		theGrammarPackage.createPackageContents();

		// Initialize created meta-data
		theScopePackage.initializePackageContents();
		theAstPackage.initializePackageContents();
		theGrammarPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theScopePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ScopePackage.eNS_URI, theScopePackage);
		return theScopePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScope() {
		return scopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureScope() {
		return featureScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureScope_FeatureName() {
		return (EAttribute)featureScopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerScope() {
		return containerScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitiveScope() {
		return transitiveScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitiveScope_Optional() {
		return (EAttribute)transitiveScopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransitiveScope_SubScope() {
		return (EReference)transitiveScopeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChainedScope() {
		return chainedScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChainedScope_SubScopes() {
		return (EReference)chainedScopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalScope() {
		return conditionalScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionalScope_FeatureName() {
		return (EAttribute)conditionalScopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalScope() {
		return globalScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalScope_EclassURI() {
		return (EAttribute)globalScopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnionScope() {
		return unionScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnionScope_SubScopes() {
		return (EReference)unionScopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeFactory getScopeFactory() {
		return (ScopeFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		scopeEClass = createEClass(SCOPE);

		featureScopeEClass = createEClass(FEATURE_SCOPE);
		createEAttribute(featureScopeEClass, FEATURE_SCOPE__FEATURE_NAME);

		containerScopeEClass = createEClass(CONTAINER_SCOPE);

		transitiveScopeEClass = createEClass(TRANSITIVE_SCOPE);
		createEAttribute(transitiveScopeEClass, TRANSITIVE_SCOPE__OPTIONAL);
		createEReference(transitiveScopeEClass, TRANSITIVE_SCOPE__SUB_SCOPE);

		chainedScopeEClass = createEClass(CHAINED_SCOPE);
		createEReference(chainedScopeEClass, CHAINED_SCOPE__SUB_SCOPES);

		conditionalScopeEClass = createEClass(CONDITIONAL_SCOPE);
		createEAttribute(conditionalScopeEClass, CONDITIONAL_SCOPE__FEATURE_NAME);

		globalScopeEClass = createEClass(GLOBAL_SCOPE);
		createEAttribute(globalScopeEClass, GLOBAL_SCOPE__ECLASS_URI);

		unionScopeEClass = createEClass(UNION_SCOPE);
		createEReference(unionScopeEClass, UNION_SCOPE__SUB_SCOPES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		featureScopeEClass.getESuperTypes().add(this.getScope());
		containerScopeEClass.getESuperTypes().add(this.getScope());
		transitiveScopeEClass.getESuperTypes().add(this.getScope());
		chainedScopeEClass.getESuperTypes().add(this.getScope());
		conditionalScopeEClass.getESuperTypes().add(this.getScope());
		globalScopeEClass.getESuperTypes().add(this.getScope());
		unionScopeEClass.getESuperTypes().add(this.getScope());

		// Initialize classes, features, and operations; add parameters
		initEClass(scopeEClass, Scope.class, "Scope", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureScopeEClass, FeatureScope.class, "FeatureScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureScope_FeatureName(), ecorePackage.getEString(), "featureName", null, 1, 1, FeatureScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerScopeEClass, ContainerScope.class, "ContainerScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitiveScopeEClass, TransitiveScope.class, "TransitiveScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransitiveScope_Optional(), ecorePackage.getEBoolean(), "optional", null, 0, 1, TransitiveScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransitiveScope_SubScope(), this.getScope(), null, "subScope", null, 0, 1, TransitiveScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chainedScopeEClass, ChainedScope.class, "ChainedScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChainedScope_SubScopes(), this.getScope(), null, "subScopes", null, 0, -1, ChainedScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalScopeEClass, ConditionalScope.class, "ConditionalScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConditionalScope_FeatureName(), ecorePackage.getEString(), "featureName", null, 0, 1, ConditionalScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(globalScopeEClass, GlobalScope.class, "GlobalScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlobalScope_EclassURI(), ecorePackage.getEString(), "eclassURI", null, 1, 1, GlobalScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unionScopeEClass, UnionScope.class, "UnionScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnionScope_SubScopes(), this.getScope(), null, "subScopes", null, 0, -1, UnionScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ScopePackageImpl
