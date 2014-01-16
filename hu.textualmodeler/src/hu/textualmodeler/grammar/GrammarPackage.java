/**
 */
package hu.textualmodeler.grammar;

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
 * @see hu.textualmodeler.grammar.GrammarFactory
 * @model kind="package"
 * @generated
 */
public interface GrammarPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "grammar";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://textualmodeler.hu/grammar";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "grammar";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GrammarPackage eINSTANCE = hu.textualmodeler.grammar.impl.GrammarPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.textualmodeler.grammar.impl.GrammarModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.textualmodeler.grammar.impl.GrammarModelImpl
	 * @see hu.textualmodeler.grammar.impl.GrammarPackageImpl#getGrammarModel()
	 * @generated
	 */
	int GRAMMAR_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR_MODEL__TERMINALS = 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR_MODEL__RULES = 1;

	/**
	 * The feature id for the '<em><b>Start Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR_MODEL__START_ITEM = 2;

	/**
	 * The feature id for the '<em><b>Import</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR_MODEL__IMPORT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR_MODEL__NAME = 4;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR_MODEL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.textualmodeler.grammar.impl.TerminalImpl <em>Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.textualmodeler.grammar.impl.TerminalImpl
	 * @see hu.textualmodeler.grammar.impl.GrammarPackageImpl#getTerminal()
	 * @generated
	 */
	int TERMINAL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__REGEX = 1;

	/**
	 * The feature id for the '<em><b>Hide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__HIDE = 2;

	/**
	 * The feature id for the '<em><b>Replace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__REPLACE = 3;

	/**
	 * The number of structural features of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.textualmodeler.grammar.impl.ReplaceImpl <em>Replace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.textualmodeler.grammar.impl.ReplaceImpl
	 * @see hu.textualmodeler.grammar.impl.GrammarPackageImpl#getReplace()
	 * @generated
	 */
	int REPLACE = 2;

	/**
	 * The feature id for the '<em><b>Search</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE__SEARCH = 0;

	/**
	 * The feature id for the '<em><b>Replace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE__REPLACE = 1;

	/**
	 * The number of structural features of the '<em>Replace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Replace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.textualmodeler.grammar.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.textualmodeler.grammar.impl.RuleImpl
	 * @see hu.textualmodeler.grammar.impl.GrammarPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 3;

	/**
	 * The feature id for the '<em><b>Non Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NON_TERMINAL = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__BODY = 1;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.textualmodeler.grammar.impl.RuleItemImpl <em>Rule Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.textualmodeler.grammar.impl.RuleItemImpl
	 * @see hu.textualmodeler.grammar.impl.GrammarPackageImpl#getRuleItem()
	 * @generated
	 */
	int RULE_ITEM = 4;

	/**
	 * The number of structural features of the '<em>Rule Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ITEM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Rule Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.textualmodeler.grammar.impl.SyntaxItemImpl <em>Syntax Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.textualmodeler.grammar.impl.SyntaxItemImpl
	 * @see hu.textualmodeler.grammar.impl.GrammarPackageImpl#getSyntaxItem()
	 * @generated
	 */
	int SYNTAX_ITEM = 5;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_ITEM__OPTIONAL = RULE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_ITEM__MANY = RULE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Syntax Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_ITEM_FEATURE_COUNT = RULE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Syntax Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTAX_ITEM_OPERATION_COUNT = RULE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.textualmodeler.grammar.impl.TerminalItemImpl <em>Terminal Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.textualmodeler.grammar.impl.TerminalItemImpl
	 * @see hu.textualmodeler.grammar.impl.GrammarPackageImpl#getTerminalItem()
	 * @generated
	 */
	int TERMINAL_ITEM = 6;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_ITEM__OPTIONAL = SYNTAX_ITEM__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_ITEM__MANY = SYNTAX_ITEM__MANY;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_ITEM__FEATURE_NAME = SYNTAX_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_ITEM__TERMINAL = SYNTAX_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Terminal Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_ITEM_FEATURE_COUNT = SYNTAX_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Terminal Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_ITEM_OPERATION_COUNT = SYNTAX_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.textualmodeler.grammar.impl.NonTerminalItemImpl <em>Non Terminal Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.textualmodeler.grammar.impl.NonTerminalItemImpl
	 * @see hu.textualmodeler.grammar.impl.GrammarPackageImpl#getNonTerminalItem()
	 * @generated
	 */
	int NON_TERMINAL_ITEM = 7;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_TERMINAL_ITEM__OPTIONAL = SYNTAX_ITEM__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_TERMINAL_ITEM__MANY = SYNTAX_ITEM__MANY;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_TERMINAL_ITEM__FEATURE_NAME = SYNTAX_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Non Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_TERMINAL_ITEM__NON_TERMINAL = SYNTAX_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Non Terminal Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_TERMINAL_ITEM_FEATURE_COUNT = SYNTAX_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Non Terminal Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_TERMINAL_ITEM_OPERATION_COUNT = SYNTAX_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.textualmodeler.grammar.impl.SetValueImpl <em>Set Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.textualmodeler.grammar.impl.SetValueImpl
	 * @see hu.textualmodeler.grammar.impl.GrammarPackageImpl#getSetValue()
	 * @generated
	 */
	int SET_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE__FEATURE_NAME = RULE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE__VALUE = RULE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_FEATURE_COUNT = RULE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Set Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_VALUE_OPERATION_COUNT = RULE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.textualmodeler.grammar.impl.PushImpl <em>Push</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.textualmodeler.grammar.impl.PushImpl
	 * @see hu.textualmodeler.grammar.impl.GrammarPackageImpl#getPush()
	 * @generated
	 */
	int PUSH = 9;

	/**
	 * The feature id for the '<em><b>Eclass URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH__ECLASS_URI = RULE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH__FEATURE_NAME = RULE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Push</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_FEATURE_COUNT = RULE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Push</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_OPERATION_COUNT = RULE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.textualmodeler.grammar.impl.PopImpl <em>Pop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.textualmodeler.grammar.impl.PopImpl
	 * @see hu.textualmodeler.grammar.impl.GrammarPackageImpl#getPop()
	 * @generated
	 */
	int POP = 10;

	/**
	 * The number of structural features of the '<em>Pop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_FEATURE_COUNT = RULE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_OPERATION_COUNT = RULE_ITEM_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.textualmodeler.grammar.GrammarModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see hu.textualmodeler.grammar.GrammarModel
	 * @generated
	 */
	EClass getGrammarModel();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.textualmodeler.grammar.GrammarModel#getTerminals <em>Terminals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terminals</em>'.
	 * @see hu.textualmodeler.grammar.GrammarModel#getTerminals()
	 * @see #getGrammarModel()
	 * @generated
	 */
	EReference getGrammarModel_Terminals();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.textualmodeler.grammar.GrammarModel#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see hu.textualmodeler.grammar.GrammarModel#getRules()
	 * @see #getGrammarModel()
	 * @generated
	 */
	EReference getGrammarModel_Rules();

	/**
	 * Returns the meta object for the attribute '{@link hu.textualmodeler.grammar.GrammarModel#getStartItem <em>Start Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Item</em>'.
	 * @see hu.textualmodeler.grammar.GrammarModel#getStartItem()
	 * @see #getGrammarModel()
	 * @generated
	 */
	EAttribute getGrammarModel_StartItem();

	/**
	 * Returns the meta object for the reference list '{@link hu.textualmodeler.grammar.GrammarModel#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Import</em>'.
	 * @see hu.textualmodeler.grammar.GrammarModel#getImport()
	 * @see #getGrammarModel()
	 * @generated
	 */
	EReference getGrammarModel_Import();

	/**
	 * Returns the meta object for the attribute '{@link hu.textualmodeler.grammar.GrammarModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.textualmodeler.grammar.GrammarModel#getName()
	 * @see #getGrammarModel()
	 * @generated
	 */
	EAttribute getGrammarModel_Name();

	/**
	 * Returns the meta object for class '{@link hu.textualmodeler.grammar.Terminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal</em>'.
	 * @see hu.textualmodeler.grammar.Terminal
	 * @generated
	 */
	EClass getTerminal();

	/**
	 * Returns the meta object for the attribute '{@link hu.textualmodeler.grammar.Terminal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.textualmodeler.grammar.Terminal#getName()
	 * @see #getTerminal()
	 * @generated
	 */
	EAttribute getTerminal_Name();

	/**
	 * Returns the meta object for the attribute '{@link hu.textualmodeler.grammar.Terminal#getRegex <em>Regex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regex</em>'.
	 * @see hu.textualmodeler.grammar.Terminal#getRegex()
	 * @see #getTerminal()
	 * @generated
	 */
	EAttribute getTerminal_Regex();

	/**
	 * Returns the meta object for the attribute '{@link hu.textualmodeler.grammar.Terminal#isHide <em>Hide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hide</em>'.
	 * @see hu.textualmodeler.grammar.Terminal#isHide()
	 * @see #getTerminal()
	 * @generated
	 */
	EAttribute getTerminal_Hide();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.textualmodeler.grammar.Terminal#getReplace <em>Replace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Replace</em>'.
	 * @see hu.textualmodeler.grammar.Terminal#getReplace()
	 * @see #getTerminal()
	 * @generated
	 */
	EReference getTerminal_Replace();

	/**
	 * Returns the meta object for class '{@link hu.textualmodeler.grammar.Replace <em>Replace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replace</em>'.
	 * @see hu.textualmodeler.grammar.Replace
	 * @generated
	 */
	EClass getReplace();

	/**
	 * Returns the meta object for the attribute '{@link hu.textualmodeler.grammar.Replace#getSearch <em>Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Search</em>'.
	 * @see hu.textualmodeler.grammar.Replace#getSearch()
	 * @see #getReplace()
	 * @generated
	 */
	EAttribute getReplace_Search();

	/**
	 * Returns the meta object for the attribute '{@link hu.textualmodeler.grammar.Replace#getReplace <em>Replace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replace</em>'.
	 * @see hu.textualmodeler.grammar.Replace#getReplace()
	 * @see #getReplace()
	 * @generated
	 */
	EAttribute getReplace_Replace();

	/**
	 * Returns the meta object for class '{@link hu.textualmodeler.grammar.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see hu.textualmodeler.grammar.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link hu.textualmodeler.grammar.Rule#getNonTerminal <em>Non Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Non Terminal</em>'.
	 * @see hu.textualmodeler.grammar.Rule#getNonTerminal()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_NonTerminal();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.textualmodeler.grammar.Rule#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Body</em>'.
	 * @see hu.textualmodeler.grammar.Rule#getBody()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Body();

	/**
	 * Returns the meta object for class '{@link hu.textualmodeler.grammar.RuleItem <em>Rule Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Item</em>'.
	 * @see hu.textualmodeler.grammar.RuleItem
	 * @generated
	 */
	EClass getRuleItem();

	/**
	 * Returns the meta object for class '{@link hu.textualmodeler.grammar.SyntaxItem <em>Syntax Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Syntax Item</em>'.
	 * @see hu.textualmodeler.grammar.SyntaxItem
	 * @generated
	 */
	EClass getSyntaxItem();

	/**
	 * Returns the meta object for the attribute '{@link hu.textualmodeler.grammar.SyntaxItem#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see hu.textualmodeler.grammar.SyntaxItem#isOptional()
	 * @see #getSyntaxItem()
	 * @generated
	 */
	EAttribute getSyntaxItem_Optional();

	/**
	 * Returns the meta object for the attribute '{@link hu.textualmodeler.grammar.SyntaxItem#isMany <em>Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Many</em>'.
	 * @see hu.textualmodeler.grammar.SyntaxItem#isMany()
	 * @see #getSyntaxItem()
	 * @generated
	 */
	EAttribute getSyntaxItem_Many();

	/**
	 * Returns the meta object for class '{@link hu.textualmodeler.grammar.TerminalItem <em>Terminal Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal Item</em>'.
	 * @see hu.textualmodeler.grammar.TerminalItem
	 * @generated
	 */
	EClass getTerminalItem();

	/**
	 * Returns the meta object for the attribute '{@link hu.textualmodeler.grammar.TerminalItem#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see hu.textualmodeler.grammar.TerminalItem#getFeatureName()
	 * @see #getTerminalItem()
	 * @generated
	 */
	EAttribute getTerminalItem_FeatureName();

	/**
	 * Returns the meta object for the reference '{@link hu.textualmodeler.grammar.TerminalItem#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal</em>'.
	 * @see hu.textualmodeler.grammar.TerminalItem#getTerminal()
	 * @see #getTerminalItem()
	 * @generated
	 */
	EReference getTerminalItem_Terminal();

	/**
	 * Returns the meta object for class '{@link hu.textualmodeler.grammar.NonTerminalItem <em>Non Terminal Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Terminal Item</em>'.
	 * @see hu.textualmodeler.grammar.NonTerminalItem
	 * @generated
	 */
	EClass getNonTerminalItem();

	/**
	 * Returns the meta object for the attribute '{@link hu.textualmodeler.grammar.NonTerminalItem#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see hu.textualmodeler.grammar.NonTerminalItem#getFeatureName()
	 * @see #getNonTerminalItem()
	 * @generated
	 */
	EAttribute getNonTerminalItem_FeatureName();

	/**
	 * Returns the meta object for the attribute '{@link hu.textualmodeler.grammar.NonTerminalItem#getNonTerminal <em>Non Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Non Terminal</em>'.
	 * @see hu.textualmodeler.grammar.NonTerminalItem#getNonTerminal()
	 * @see #getNonTerminalItem()
	 * @generated
	 */
	EAttribute getNonTerminalItem_NonTerminal();

	/**
	 * Returns the meta object for class '{@link hu.textualmodeler.grammar.SetValue <em>Set Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Value</em>'.
	 * @see hu.textualmodeler.grammar.SetValue
	 * @generated
	 */
	EClass getSetValue();

	/**
	 * Returns the meta object for the attribute '{@link hu.textualmodeler.grammar.SetValue#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see hu.textualmodeler.grammar.SetValue#getFeatureName()
	 * @see #getSetValue()
	 * @generated
	 */
	EAttribute getSetValue_FeatureName();

	/**
	 * Returns the meta object for the attribute '{@link hu.textualmodeler.grammar.SetValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.textualmodeler.grammar.SetValue#getValue()
	 * @see #getSetValue()
	 * @generated
	 */
	EAttribute getSetValue_Value();

	/**
	 * Returns the meta object for class '{@link hu.textualmodeler.grammar.Push <em>Push</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Push</em>'.
	 * @see hu.textualmodeler.grammar.Push
	 * @generated
	 */
	EClass getPush();

	/**
	 * Returns the meta object for the attribute '{@link hu.textualmodeler.grammar.Push#getEclassURI <em>Eclass URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eclass URI</em>'.
	 * @see hu.textualmodeler.grammar.Push#getEclassURI()
	 * @see #getPush()
	 * @generated
	 */
	EAttribute getPush_EclassURI();

	/**
	 * Returns the meta object for the attribute '{@link hu.textualmodeler.grammar.Push#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see hu.textualmodeler.grammar.Push#getFeatureName()
	 * @see #getPush()
	 * @generated
	 */
	EAttribute getPush_FeatureName();

	/**
	 * Returns the meta object for class '{@link hu.textualmodeler.grammar.Pop <em>Pop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pop</em>'.
	 * @see hu.textualmodeler.grammar.Pop
	 * @generated
	 */
	EClass getPop();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GrammarFactory getGrammarFactory();

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
		 * The meta object literal for the '{@link hu.textualmodeler.grammar.impl.GrammarModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.textualmodeler.grammar.impl.GrammarModelImpl
		 * @see hu.textualmodeler.grammar.impl.GrammarPackageImpl#getGrammarModel()
		 * @generated
		 */
		EClass GRAMMAR_MODEL = eINSTANCE.getGrammarModel();

		/**
		 * The meta object literal for the '<em><b>Terminals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAMMAR_MODEL__TERMINALS = eINSTANCE.getGrammarModel_Terminals();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAMMAR_MODEL__RULES = eINSTANCE.getGrammarModel_Rules();

		/**
		 * The meta object literal for the '<em><b>Start Item</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAMMAR_MODEL__START_ITEM = eINSTANCE.getGrammarModel_StartItem();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAMMAR_MODEL__IMPORT = eINSTANCE.getGrammarModel_Import();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAMMAR_MODEL__NAME = eINSTANCE.getGrammarModel_Name();

		/**
		 * The meta object literal for the '{@link hu.textualmodeler.grammar.impl.TerminalImpl <em>Terminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.textualmodeler.grammar.impl.TerminalImpl
		 * @see hu.textualmodeler.grammar.impl.GrammarPackageImpl#getTerminal()
		 * @generated
		 */
		EClass TERMINAL = eINSTANCE.getTerminal();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMINAL__NAME = eINSTANCE.getTerminal_Name();

		/**
		 * The meta object literal for the '<em><b>Regex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMINAL__REGEX = eINSTANCE.getTerminal_Regex();

		/**
		 * The meta object literal for the '<em><b>Hide</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMINAL__HIDE = eINSTANCE.getTerminal_Hide();

		/**
		 * The meta object literal for the '<em><b>Replace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL__REPLACE = eINSTANCE.getTerminal_Replace();

		/**
		 * The meta object literal for the '{@link hu.textualmodeler.grammar.impl.ReplaceImpl <em>Replace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.textualmodeler.grammar.impl.ReplaceImpl
		 * @see hu.textualmodeler.grammar.impl.GrammarPackageImpl#getReplace()
		 * @generated
		 */
		EClass REPLACE = eINSTANCE.getReplace();

		/**
		 * The meta object literal for the '<em><b>Search</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLACE__SEARCH = eINSTANCE.getReplace_Search();

		/**
		 * The meta object literal for the '<em><b>Replace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLACE__REPLACE = eINSTANCE.getReplace_Replace();

		/**
		 * The meta object literal for the '{@link hu.textualmodeler.grammar.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.textualmodeler.grammar.impl.RuleImpl
		 * @see hu.textualmodeler.grammar.impl.GrammarPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Non Terminal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__NON_TERMINAL = eINSTANCE.getRule_NonTerminal();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__BODY = eINSTANCE.getRule_Body();

		/**
		 * The meta object literal for the '{@link hu.textualmodeler.grammar.impl.RuleItemImpl <em>Rule Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.textualmodeler.grammar.impl.RuleItemImpl
		 * @see hu.textualmodeler.grammar.impl.GrammarPackageImpl#getRuleItem()
		 * @generated
		 */
		EClass RULE_ITEM = eINSTANCE.getRuleItem();

		/**
		 * The meta object literal for the '{@link hu.textualmodeler.grammar.impl.SyntaxItemImpl <em>Syntax Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.textualmodeler.grammar.impl.SyntaxItemImpl
		 * @see hu.textualmodeler.grammar.impl.GrammarPackageImpl#getSyntaxItem()
		 * @generated
		 */
		EClass SYNTAX_ITEM = eINSTANCE.getSyntaxItem();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNTAX_ITEM__OPTIONAL = eINSTANCE.getSyntaxItem_Optional();

		/**
		 * The meta object literal for the '<em><b>Many</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNTAX_ITEM__MANY = eINSTANCE.getSyntaxItem_Many();

		/**
		 * The meta object literal for the '{@link hu.textualmodeler.grammar.impl.TerminalItemImpl <em>Terminal Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.textualmodeler.grammar.impl.TerminalItemImpl
		 * @see hu.textualmodeler.grammar.impl.GrammarPackageImpl#getTerminalItem()
		 * @generated
		 */
		EClass TERMINAL_ITEM = eINSTANCE.getTerminalItem();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMINAL_ITEM__FEATURE_NAME = eINSTANCE.getTerminalItem_FeatureName();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL_ITEM__TERMINAL = eINSTANCE.getTerminalItem_Terminal();

		/**
		 * The meta object literal for the '{@link hu.textualmodeler.grammar.impl.NonTerminalItemImpl <em>Non Terminal Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.textualmodeler.grammar.impl.NonTerminalItemImpl
		 * @see hu.textualmodeler.grammar.impl.GrammarPackageImpl#getNonTerminalItem()
		 * @generated
		 */
		EClass NON_TERMINAL_ITEM = eINSTANCE.getNonTerminalItem();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NON_TERMINAL_ITEM__FEATURE_NAME = eINSTANCE.getNonTerminalItem_FeatureName();

		/**
		 * The meta object literal for the '<em><b>Non Terminal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NON_TERMINAL_ITEM__NON_TERMINAL = eINSTANCE.getNonTerminalItem_NonTerminal();

		/**
		 * The meta object literal for the '{@link hu.textualmodeler.grammar.impl.SetValueImpl <em>Set Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.textualmodeler.grammar.impl.SetValueImpl
		 * @see hu.textualmodeler.grammar.impl.GrammarPackageImpl#getSetValue()
		 * @generated
		 */
		EClass SET_VALUE = eINSTANCE.getSetValue();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_VALUE__FEATURE_NAME = eINSTANCE.getSetValue_FeatureName();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_VALUE__VALUE = eINSTANCE.getSetValue_Value();

		/**
		 * The meta object literal for the '{@link hu.textualmodeler.grammar.impl.PushImpl <em>Push</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.textualmodeler.grammar.impl.PushImpl
		 * @see hu.textualmodeler.grammar.impl.GrammarPackageImpl#getPush()
		 * @generated
		 */
		EClass PUSH = eINSTANCE.getPush();

		/**
		 * The meta object literal for the '<em><b>Eclass URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUSH__ECLASS_URI = eINSTANCE.getPush_EclassURI();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUSH__FEATURE_NAME = eINSTANCE.getPush_FeatureName();

		/**
		 * The meta object literal for the '{@link hu.textualmodeler.grammar.impl.PopImpl <em>Pop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.textualmodeler.grammar.impl.PopImpl
		 * @see hu.textualmodeler.grammar.impl.GrammarPackageImpl#getPop()
		 * @generated
		 */
		EClass POP = eINSTANCE.getPop();

	}

} //GrammarPackage
