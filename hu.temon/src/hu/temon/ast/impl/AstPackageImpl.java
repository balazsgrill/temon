/**
 */
package hu.temon.ast.impl;

import hu.temon.ast.AstFactory;
import hu.temon.ast.AstPackage;
import hu.temon.ast.CompositeNode;
import hu.temon.ast.FeatureSet;
import hu.temon.ast.FeatureSetCompositeNode;
import hu.temon.ast.FeatureSetPushElement;
import hu.temon.ast.FeatureSetTerminalNode;
import hu.temon.ast.FeatureSetValue;
import hu.temon.ast.InsertedFeatureSetTerminalNode;
import hu.temon.ast.InsertedTerminalNode;
import hu.temon.ast.Node;
import hu.temon.ast.PopElement;
import hu.temon.ast.PushElement;
import hu.temon.ast.RemovedTerminalNode;
import hu.temon.ast.TerminalNode;
import hu.temon.ast.VisibleNode;
import hu.temon.ast.WhitespaceNode;
import hu.temon.grammar.GrammarPackage;
import hu.temon.grammar.impl.GrammarPackageImpl;
import hu.temon.tokens.TokensPackage;
import hu.temon.tokens.impl.TokensPackageImpl;

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
public class AstPackageImpl extends EPackageImpl implements AstPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visibleNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whitespaceNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removedTerminalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insertedTerminalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insertedFeatureSetTerminalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureSetValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureSetTerminalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureSetCompositeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pushElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureSetPushElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass popElementEClass = null;

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
	 * @see hu.temon.ast.AstPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AstPackageImpl() {
		super(eNS_URI, AstFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AstPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AstPackage init() {
		if (isInited) return (AstPackage)EPackage.Registry.INSTANCE.getEPackage(AstPackage.eNS_URI);

		// Obtain or create and register package
		AstPackageImpl theAstPackage = (AstPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AstPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AstPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		GrammarPackageImpl theGrammarPackage = (GrammarPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GrammarPackage.eNS_URI) instanceof GrammarPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GrammarPackage.eNS_URI) : GrammarPackage.eINSTANCE);
		TokensPackageImpl theTokensPackage = (TokensPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TokensPackage.eNS_URI) instanceof TokensPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TokensPackage.eNS_URI) : TokensPackage.eINSTANCE);

		// Create package meta-data objects
		theAstPackage.createPackageContents();
		theGrammarPackage.createPackageContents();
		theTokensPackage.createPackageContents();

		// Initialize created meta-data
		theAstPackage.initializePackageContents();
		theGrammarPackage.initializePackageContents();
		theTokensPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAstPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AstPackage.eNS_URI, theAstPackage);
		return theAstPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisibleNode() {
		return visibleNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisibleNode_Start() {
		return (EAttribute)visibleNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisibleNode_Length() {
		return (EAttribute)visibleNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhitespaceNode() {
		return whitespaceNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhitespaceNode_Terminal() {
		return (EReference)whitespaceNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminalNode() {
		return terminalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminalNode_Terminal() {
		return (EReference)terminalNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTerminalNode_Content() {
		return (EAttribute)terminalNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemovedTerminalNode() {
		return removedTerminalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInsertedTerminalNode() {
		return insertedTerminalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInsertedFeatureSetTerminalNode() {
		return insertedFeatureSetTerminalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureSet() {
		return featureSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureSet_FeatureName() {
		return (EAttribute)featureSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureSetValue() {
		return featureSetValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureSetValue_Value() {
		return (EAttribute)featureSetValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureSetTerminalNode() {
		return featureSetTerminalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeNode() {
		return compositeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeNode_Nonterminal() {
		return (EReference)compositeNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeNode_Children() {
		return (EReference)compositeNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureSetCompositeNode() {
		return featureSetCompositeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPushElement() {
		return pushElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPushElement_Eclass() {
		return (EReference)pushElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureSetPushElement() {
		return featureSetPushElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPopElement() {
		return popElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AstFactory getAstFactory() {
		return (AstFactory)getEFactoryInstance();
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
		nodeEClass = createEClass(NODE);

		visibleNodeEClass = createEClass(VISIBLE_NODE);
		createEAttribute(visibleNodeEClass, VISIBLE_NODE__START);
		createEAttribute(visibleNodeEClass, VISIBLE_NODE__LENGTH);

		whitespaceNodeEClass = createEClass(WHITESPACE_NODE);
		createEReference(whitespaceNodeEClass, WHITESPACE_NODE__TERMINAL);

		terminalNodeEClass = createEClass(TERMINAL_NODE);
		createEReference(terminalNodeEClass, TERMINAL_NODE__TERMINAL);
		createEAttribute(terminalNodeEClass, TERMINAL_NODE__CONTENT);

		removedTerminalNodeEClass = createEClass(REMOVED_TERMINAL_NODE);

		insertedTerminalNodeEClass = createEClass(INSERTED_TERMINAL_NODE);

		insertedFeatureSetTerminalNodeEClass = createEClass(INSERTED_FEATURE_SET_TERMINAL_NODE);

		featureSetEClass = createEClass(FEATURE_SET);
		createEAttribute(featureSetEClass, FEATURE_SET__FEATURE_NAME);

		featureSetValueEClass = createEClass(FEATURE_SET_VALUE);
		createEAttribute(featureSetValueEClass, FEATURE_SET_VALUE__VALUE);

		featureSetTerminalNodeEClass = createEClass(FEATURE_SET_TERMINAL_NODE);

		compositeNodeEClass = createEClass(COMPOSITE_NODE);
		createEReference(compositeNodeEClass, COMPOSITE_NODE__NONTERMINAL);
		createEReference(compositeNodeEClass, COMPOSITE_NODE__CHILDREN);

		featureSetCompositeNodeEClass = createEClass(FEATURE_SET_COMPOSITE_NODE);

		pushElementEClass = createEClass(PUSH_ELEMENT);
		createEReference(pushElementEClass, PUSH_ELEMENT__ECLASS);

		featureSetPushElementEClass = createEClass(FEATURE_SET_PUSH_ELEMENT);

		popElementEClass = createEClass(POP_ELEMENT);
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
		visibleNodeEClass.getESuperTypes().add(this.getNode());
		whitespaceNodeEClass.getESuperTypes().add(this.getVisibleNode());
		terminalNodeEClass.getESuperTypes().add(this.getVisibleNode());
		removedTerminalNodeEClass.getESuperTypes().add(this.getTerminalNode());
		insertedTerminalNodeEClass.getESuperTypes().add(this.getTerminalNode());
		insertedFeatureSetTerminalNodeEClass.getESuperTypes().add(this.getInsertedTerminalNode());
		insertedFeatureSetTerminalNodeEClass.getESuperTypes().add(this.getFeatureSetTerminalNode());
		featureSetValueEClass.getESuperTypes().add(this.getNode());
		featureSetValueEClass.getESuperTypes().add(this.getFeatureSet());
		featureSetTerminalNodeEClass.getESuperTypes().add(this.getTerminalNode());
		featureSetTerminalNodeEClass.getESuperTypes().add(this.getFeatureSet());
		compositeNodeEClass.getESuperTypes().add(this.getNode());
		featureSetCompositeNodeEClass.getESuperTypes().add(this.getCompositeNode());
		featureSetCompositeNodeEClass.getESuperTypes().add(this.getFeatureSet());
		pushElementEClass.getESuperTypes().add(this.getNode());
		featureSetPushElementEClass.getESuperTypes().add(this.getPushElement());
		featureSetPushElementEClass.getESuperTypes().add(this.getFeatureSet());
		popElementEClass.getESuperTypes().add(this.getNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(visibleNodeEClass, VisibleNode.class, "VisibleNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVisibleNode_Start(), ecorePackage.getEInt(), "start", null, 1, 1, VisibleNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVisibleNode_Length(), ecorePackage.getEInt(), "length", null, 1, 1, VisibleNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whitespaceNodeEClass, WhitespaceNode.class, "WhitespaceNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhitespaceNode_Terminal(), theGrammarPackage.getTerminal(), null, "terminal", null, 0, 1, WhitespaceNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(terminalNodeEClass, TerminalNode.class, "TerminalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTerminalNode_Terminal(), theGrammarPackage.getTerminal(), null, "terminal", null, 0, 1, TerminalNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTerminalNode_Content(), ecorePackage.getEString(), "content", null, 0, 1, TerminalNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removedTerminalNodeEClass, RemovedTerminalNode.class, "RemovedTerminalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(insertedTerminalNodeEClass, InsertedTerminalNode.class, "InsertedTerminalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(insertedFeatureSetTerminalNodeEClass, InsertedFeatureSetTerminalNode.class, "InsertedFeatureSetTerminalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureSetEClass, FeatureSet.class, "FeatureSet", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureSet_FeatureName(), ecorePackage.getEString(), "featureName", null, 0, 1, FeatureSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureSetValueEClass, FeatureSetValue.class, "FeatureSetValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureSetValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, FeatureSetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureSetTerminalNodeEClass, FeatureSetTerminalNode.class, "FeatureSetTerminalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeNodeEClass, CompositeNode.class, "CompositeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeNode_Nonterminal(), theGrammarPackage.getRule(), null, "nonterminal", null, 0, 1, CompositeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeNode_Children(), this.getNode(), null, "children", null, 0, -1, CompositeNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureSetCompositeNodeEClass, FeatureSetCompositeNode.class, "FeatureSetCompositeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pushElementEClass, PushElement.class, "PushElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPushElement_Eclass(), ecorePackage.getEClass(), null, "eclass", null, 1, 1, PushElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureSetPushElementEClass, FeatureSetPushElement.class, "FeatureSetPushElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(popElementEClass, PopElement.class, "PopElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //AstPackageImpl
