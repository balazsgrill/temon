/**
 */
package hu.textualmodeler.tokens.impl;

import hu.textualmodeler.ast.AstPackage;

import hu.textualmodeler.ast.impl.AstPackageImpl;

import hu.textualmodeler.grammar.GrammarPackage;

import hu.textualmodeler.grammar.impl.GrammarPackageImpl;

import hu.textualmodeler.tokens.Token;
import hu.textualmodeler.tokens.TokenList;
import hu.textualmodeler.tokens.TokensFactory;
import hu.textualmodeler.tokens.TokensPackage;

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
public class TokensPackageImpl extends EPackageImpl implements TokensPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenListEClass = null;

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
	 * @see hu.textualmodeler.tokens.TokensPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TokensPackageImpl() {
		super(eNS_URI, TokensFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TokensPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TokensPackage init() {
		if (isInited) return (TokensPackage)EPackage.Registry.INSTANCE.getEPackage(TokensPackage.eNS_URI);

		// Obtain or create and register package
		TokensPackageImpl theTokensPackage = (TokensPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TokensPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TokensPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		AstPackageImpl theAstPackage = (AstPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AstPackage.eNS_URI) instanceof AstPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AstPackage.eNS_URI) : AstPackage.eINSTANCE);
		GrammarPackageImpl theGrammarPackage = (GrammarPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GrammarPackage.eNS_URI) instanceof GrammarPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GrammarPackage.eNS_URI) : GrammarPackage.eINSTANCE);

		// Create package meta-data objects
		theTokensPackage.createPackageContents();
		theAstPackage.createPackageContents();
		theGrammarPackage.createPackageContents();

		// Initialize created meta-data
		theTokensPackage.initializePackageContents();
		theAstPackage.initializePackageContents();
		theGrammarPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTokensPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TokensPackage.eNS_URI, theTokensPackage);
		return theTokensPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToken() {
		return tokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToken_Terminal() {
		return (EReference)tokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToken_Value() {
		return (EAttribute)tokenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToken_Start() {
		return (EAttribute)tokenEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToken_Length() {
		return (EAttribute)tokenEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokenList() {
		return tokenListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenList_Tokens() {
		return (EReference)tokenListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokensFactory getTokensFactory() {
		return (TokensFactory)getEFactoryInstance();
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
		tokenEClass = createEClass(TOKEN);
		createEReference(tokenEClass, TOKEN__TERMINAL);
		createEAttribute(tokenEClass, TOKEN__VALUE);
		createEAttribute(tokenEClass, TOKEN__START);
		createEAttribute(tokenEClass, TOKEN__LENGTH);

		tokenListEClass = createEClass(TOKEN_LIST);
		createEReference(tokenListEClass, TOKEN_LIST__TOKENS);
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

		// Obtain other dependent packages
		GrammarPackage theGrammarPackage = (GrammarPackage)EPackage.Registry.INSTANCE.getEPackage(GrammarPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(tokenEClass, Token.class, "Token", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToken_Terminal(), theGrammarPackage.getTerminal(), null, "terminal", null, 0, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToken_Value(), ecorePackage.getEString(), "value", null, 0, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToken_Start(), ecorePackage.getEInt(), "start", null, 0, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToken_Length(), ecorePackage.getEInt(), "length", null, 0, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenListEClass, TokenList.class, "TokenList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTokenList_Tokens(), this.getToken(), null, "tokens", null, 0, -1, TokenList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TokensPackageImpl
