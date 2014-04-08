/**
 */
package hu.textualmodeler.grammar.impl;

import hu.textualmodeler.ast.AstPackage;
import hu.textualmodeler.ast.impl.AstPackageImpl;
import hu.textualmodeler.grammar.GrammarFactory;
import hu.textualmodeler.grammar.GrammarModel;
import hu.textualmodeler.grammar.GrammarPackage;
import hu.textualmodeler.grammar.NonTerminalItem;
import hu.textualmodeler.grammar.Pop;
import hu.textualmodeler.grammar.Push;
import hu.textualmodeler.grammar.Replace;
import hu.textualmodeler.grammar.Rule;
import hu.textualmodeler.grammar.RuleItem;
import hu.textualmodeler.grammar.SetValue;
import hu.textualmodeler.grammar.SyntaxItem;
import hu.textualmodeler.grammar.Terminal;
import hu.textualmodeler.grammar.TerminalItem;
import hu.textualmodeler.tokens.TokensPackage;
import hu.textualmodeler.tokens.impl.TokensPackageImpl;
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
public class GrammarPackageImpl extends EPackageImpl implements GrammarPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grammarModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass syntaxItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminalItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonTerminalItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pushEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass popEClass = null;

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
	 * @see hu.textualmodeler.grammar.GrammarPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GrammarPackageImpl() {
		super(eNS_URI, GrammarFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GrammarPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GrammarPackage init() {
		if (isInited) return (GrammarPackage)EPackage.Registry.INSTANCE.getEPackage(GrammarPackage.eNS_URI);

		// Obtain or create and register package
		GrammarPackageImpl theGrammarPackage = (GrammarPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GrammarPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GrammarPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		AstPackageImpl theAstPackage = (AstPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AstPackage.eNS_URI) instanceof AstPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AstPackage.eNS_URI) : AstPackage.eINSTANCE);
		TokensPackageImpl theTokensPackage = (TokensPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TokensPackage.eNS_URI) instanceof TokensPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TokensPackage.eNS_URI) : TokensPackage.eINSTANCE);

		// Create package meta-data objects
		theGrammarPackage.createPackageContents();
		theAstPackage.createPackageContents();
		theTokensPackage.createPackageContents();

		// Initialize created meta-data
		theGrammarPackage.initializePackageContents();
		theAstPackage.initializePackageContents();
		theTokensPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGrammarPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GrammarPackage.eNS_URI, theGrammarPackage);
		return theGrammarPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrammarModel() {
		return grammarModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrammarModel_Terminals() {
		return (EReference)grammarModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrammarModel_Rules() {
		return (EReference)grammarModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrammarModel_StartItem() {
		return (EAttribute)grammarModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrammarModel_Import() {
		return (EReference)grammarModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrammarModel_Name() {
		return (EAttribute)grammarModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrammarModel_Eimport() {
		return (EReference)grammarModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminal() {
		return terminalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTerminal_Name() {
		return (EAttribute)terminalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTerminal_Regex() {
		return (EAttribute)terminalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTerminal_Hide() {
		return (EAttribute)terminalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminal_Replace() {
		return (EReference)terminalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTerminal_Priority() {
		return (EAttribute)terminalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminal_SuperTerminal() {
		return (EReference)terminalEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplace() {
		return replaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplace_Search() {
		return (EAttribute)replaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplace_Replace() {
		return (EAttribute)replaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_NonTerminal() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Body() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleItem() {
		return ruleItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSyntaxItem() {
		return syntaxItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSyntaxItem_Optional() {
		return (EAttribute)syntaxItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSyntaxItem_Many() {
		return (EAttribute)syntaxItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminalItem() {
		return terminalItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTerminalItem_FeatureName() {
		return (EAttribute)terminalItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminalItem_Terminal() {
		return (EReference)terminalItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonTerminalItem() {
		return nonTerminalItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonTerminalItem_FeatureName() {
		return (EAttribute)nonTerminalItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonTerminalItem_NonTerminal() {
		return (EAttribute)nonTerminalItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetValue() {
		return setValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetValue_FeatureName() {
		return (EAttribute)setValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetValue_Value() {
		return (EAttribute)setValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPush() {
		return pushEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPush_Eclass() {
		return (EReference)pushEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPush_FeatureName() {
		return (EAttribute)pushEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPop() {
		return popEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrammarFactory getGrammarFactory() {
		return (GrammarFactory)getEFactoryInstance();
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
		grammarModelEClass = createEClass(GRAMMAR_MODEL);
		createEReference(grammarModelEClass, GRAMMAR_MODEL__TERMINALS);
		createEReference(grammarModelEClass, GRAMMAR_MODEL__RULES);
		createEAttribute(grammarModelEClass, GRAMMAR_MODEL__START_ITEM);
		createEReference(grammarModelEClass, GRAMMAR_MODEL__IMPORT);
		createEAttribute(grammarModelEClass, GRAMMAR_MODEL__NAME);
		createEReference(grammarModelEClass, GRAMMAR_MODEL__EIMPORT);

		terminalEClass = createEClass(TERMINAL);
		createEAttribute(terminalEClass, TERMINAL__NAME);
		createEAttribute(terminalEClass, TERMINAL__REGEX);
		createEAttribute(terminalEClass, TERMINAL__HIDE);
		createEReference(terminalEClass, TERMINAL__REPLACE);
		createEAttribute(terminalEClass, TERMINAL__PRIORITY);
		createEReference(terminalEClass, TERMINAL__SUPER_TERMINAL);

		replaceEClass = createEClass(REPLACE);
		createEAttribute(replaceEClass, REPLACE__SEARCH);
		createEAttribute(replaceEClass, REPLACE__REPLACE);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__NON_TERMINAL);
		createEReference(ruleEClass, RULE__BODY);

		ruleItemEClass = createEClass(RULE_ITEM);

		syntaxItemEClass = createEClass(SYNTAX_ITEM);
		createEAttribute(syntaxItemEClass, SYNTAX_ITEM__OPTIONAL);
		createEAttribute(syntaxItemEClass, SYNTAX_ITEM__MANY);

		terminalItemEClass = createEClass(TERMINAL_ITEM);
		createEAttribute(terminalItemEClass, TERMINAL_ITEM__FEATURE_NAME);
		createEReference(terminalItemEClass, TERMINAL_ITEM__TERMINAL);

		nonTerminalItemEClass = createEClass(NON_TERMINAL_ITEM);
		createEAttribute(nonTerminalItemEClass, NON_TERMINAL_ITEM__FEATURE_NAME);
		createEAttribute(nonTerminalItemEClass, NON_TERMINAL_ITEM__NON_TERMINAL);

		setValueEClass = createEClass(SET_VALUE);
		createEAttribute(setValueEClass, SET_VALUE__FEATURE_NAME);
		createEAttribute(setValueEClass, SET_VALUE__VALUE);

		pushEClass = createEClass(PUSH);
		createEReference(pushEClass, PUSH__ECLASS);
		createEAttribute(pushEClass, PUSH__FEATURE_NAME);

		popEClass = createEClass(POP);
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
		syntaxItemEClass.getESuperTypes().add(this.getRuleItem());
		terminalItemEClass.getESuperTypes().add(this.getSyntaxItem());
		nonTerminalItemEClass.getESuperTypes().add(this.getSyntaxItem());
		setValueEClass.getESuperTypes().add(this.getRuleItem());
		pushEClass.getESuperTypes().add(this.getRuleItem());
		popEClass.getESuperTypes().add(this.getRuleItem());

		// Initialize classes, features, and operations; add parameters
		initEClass(grammarModelEClass, GrammarModel.class, "GrammarModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGrammarModel_Terminals(), this.getTerminal(), null, "terminals", null, 0, -1, GrammarModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrammarModel_Rules(), this.getRule(), null, "rules", null, 0, -1, GrammarModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrammarModel_StartItem(), ecorePackage.getEString(), "startItem", null, 1, 1, GrammarModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrammarModel_Import(), this.getGrammarModel(), null, "import", null, 0, -1, GrammarModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrammarModel_Name(), ecorePackage.getEString(), "name", null, 1, 1, GrammarModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrammarModel_Eimport(), ecorePackage.getEPackage(), null, "eimport", null, 0, -1, GrammarModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(terminalEClass, Terminal.class, "Terminal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTerminal_Name(), ecorePackage.getEString(), "name", null, 1, 1, Terminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTerminal_Regex(), ecorePackage.getEString(), "regex", null, 1, 1, Terminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTerminal_Hide(), ecorePackage.getEBoolean(), "hide", null, 0, 1, Terminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTerminal_Replace(), this.getReplace(), null, "replace", null, 0, -1, Terminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTerminal_Priority(), ecorePackage.getEInt(), "priority", "1", 0, 1, Terminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTerminal_SuperTerminal(), this.getTerminal(), null, "superTerminal", null, 0, 1, Terminal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(replaceEClass, Replace.class, "Replace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReplace_Search(), ecorePackage.getEString(), "search", null, 1, 1, Replace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReplace_Replace(), ecorePackage.getEString(), "replace", null, 1, 1, Replace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_NonTerminal(), ecorePackage.getEString(), "nonTerminal", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Body(), this.getRuleItem(), null, "body", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleItemEClass, RuleItem.class, "RuleItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(syntaxItemEClass, SyntaxItem.class, "SyntaxItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSyntaxItem_Optional(), ecorePackage.getEBoolean(), "optional", null, 0, 1, SyntaxItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSyntaxItem_Many(), ecorePackage.getEBoolean(), "many", null, 0, 1, SyntaxItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(terminalItemEClass, TerminalItem.class, "TerminalItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTerminalItem_FeatureName(), ecorePackage.getEString(), "featureName", null, 0, 1, TerminalItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTerminalItem_Terminal(), this.getTerminal(), null, "terminal", null, 1, 1, TerminalItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonTerminalItemEClass, NonTerminalItem.class, "NonTerminalItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNonTerminalItem_FeatureName(), ecorePackage.getEString(), "featureName", null, 0, 1, NonTerminalItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNonTerminalItem_NonTerminal(), ecorePackage.getEString(), "nonTerminal", null, 1, 1, NonTerminalItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setValueEClass, SetValue.class, "SetValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetValue_FeatureName(), ecorePackage.getEString(), "featureName", null, 1, 1, SetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetValue_Value(), ecorePackage.getEString(), "value", null, 1, 1, SetValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pushEClass, Push.class, "Push", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPush_Eclass(), ecorePackage.getEClass(), null, "eclass", null, 1, 1, Push.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPush_FeatureName(), ecorePackage.getEString(), "featureName", null, 0, 1, Push.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(popEClass, Pop.class, "Pop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //GrammarPackageImpl
