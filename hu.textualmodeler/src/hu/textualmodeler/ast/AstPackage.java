/**
 */
package hu.textualmodeler.ast;

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
 * @see hu.textualmodeler.ast.AstFactory
 * @model kind="package"
 * @generated
 */
public interface AstPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ast";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://textualmodeler.hu/ast";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ast";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AstPackage eINSTANCE = hu.textualmodeler.ast.impl.AstPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.textualmodeler.ast.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.textualmodeler.ast.impl.NodeImpl
	 * @see hu.textualmodeler.ast.impl.AstPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.textualmodeler.ast.impl.VisibleNodeImpl <em>Visible Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.textualmodeler.ast.impl.VisibleNodeImpl
	 * @see hu.textualmodeler.ast.impl.AstPackageImpl#getVisibleNode()
	 * @generated
	 */
	int VISIBLE_NODE = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBLE_NODE__START = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBLE_NODE__LENGTH = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Visible Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBLE_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Visible Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIBLE_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.textualmodeler.ast.impl.WhitespaceNodeImpl <em>Whitespace Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.textualmodeler.ast.impl.WhitespaceNodeImpl
	 * @see hu.textualmodeler.ast.impl.AstPackageImpl#getWhitespaceNode()
	 * @generated
	 */
	int WHITESPACE_NODE = 2;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITESPACE_NODE__START = VISIBLE_NODE__START;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITESPACE_NODE__LENGTH = VISIBLE_NODE__LENGTH;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITESPACE_NODE__TERMINAL = VISIBLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Whitespace Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITESPACE_NODE_FEATURE_COUNT = VISIBLE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Whitespace Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITESPACE_NODE_OPERATION_COUNT = VISIBLE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.textualmodeler.ast.impl.TerminalNodeImpl <em>Terminal Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.textualmodeler.ast.impl.TerminalNodeImpl
	 * @see hu.textualmodeler.ast.impl.AstPackageImpl#getTerminalNode()
	 * @generated
	 */
	int TERMINAL_NODE = 3;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_NODE__START = VISIBLE_NODE__START;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_NODE__LENGTH = VISIBLE_NODE__LENGTH;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_NODE__TERMINAL = VISIBLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_NODE__CONTENT = VISIBLE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Terminal Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_NODE_FEATURE_COUNT = VISIBLE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Terminal Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_NODE_OPERATION_COUNT = VISIBLE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.textualmodeler.ast.FeatureSet <em>Feature Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.textualmodeler.ast.FeatureSet
	 * @see hu.textualmodeler.ast.impl.AstPackageImpl#getFeatureSet()
	 * @generated
	 */
	int FEATURE_SET = 4;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SET__FEATURE_NAME = 0;

	/**
	 * The number of structural features of the '<em>Feature Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Feature Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.textualmodeler.ast.impl.FeatureSetValueImpl <em>Feature Set Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.textualmodeler.ast.impl.FeatureSetValueImpl
	 * @see hu.textualmodeler.ast.impl.AstPackageImpl#getFeatureSetValue()
	 * @generated
	 */
	int FEATURE_SET_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SET_VALUE__FEATURE_NAME = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SET_VALUE__VALUE = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Set Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SET_VALUE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Feature Set Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SET_VALUE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.textualmodeler.ast.impl.FeatureSetTerminalNodeImpl <em>Feature Set Terminal Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.textualmodeler.ast.impl.FeatureSetTerminalNodeImpl
	 * @see hu.textualmodeler.ast.impl.AstPackageImpl#getFeatureSetTerminalNode()
	 * @generated
	 */
	int FEATURE_SET_TERMINAL_NODE = 6;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SET_TERMINAL_NODE__START = TERMINAL_NODE__START;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SET_TERMINAL_NODE__LENGTH = TERMINAL_NODE__LENGTH;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SET_TERMINAL_NODE__TERMINAL = TERMINAL_NODE__TERMINAL;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SET_TERMINAL_NODE__CONTENT = TERMINAL_NODE__CONTENT;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SET_TERMINAL_NODE__FEATURE_NAME = TERMINAL_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Set Terminal Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SET_TERMINAL_NODE_FEATURE_COUNT = TERMINAL_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Feature Set Terminal Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SET_TERMINAL_NODE_OPERATION_COUNT = TERMINAL_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.textualmodeler.ast.impl.CompositeNodeImpl <em>Composite Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.textualmodeler.ast.impl.CompositeNodeImpl
	 * @see hu.textualmodeler.ast.impl.AstPackageImpl#getCompositeNode()
	 * @generated
	 */
	int COMPOSITE_NODE = 7;

	/**
	 * The feature id for the '<em><b>Nonterminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_NODE__NONTERMINAL = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_NODE__CHILDREN = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composite Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.textualmodeler.ast.impl.SetContainmentFeatureImpl <em>Set Containment Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.textualmodeler.ast.impl.SetContainmentFeatureImpl
	 * @see hu.textualmodeler.ast.impl.AstPackageImpl#getSetContainmentFeature()
	 * @generated
	 */
	int SET_CONTAINMENT_FEATURE = 8;

	/**
	 * The feature id for the '<em><b>Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTAINMENT_FEATURE__FEATURE_NAME = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Containment Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTAINMENT_FEATURE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Set Containment Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_CONTAINMENT_FEATURE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.textualmodeler.ast.impl.PushElementImpl <em>Push Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.textualmodeler.ast.impl.PushElementImpl
	 * @see hu.textualmodeler.ast.impl.AstPackageImpl#getPushElement()
	 * @generated
	 */
	int PUSH_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Eclass URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_ELEMENT__ECLASS_URI = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Push Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_ELEMENT_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Push Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_ELEMENT_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.textualmodeler.ast.impl.PopElementImpl <em>Pop Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.textualmodeler.ast.impl.PopElementImpl
	 * @see hu.textualmodeler.ast.impl.AstPackageImpl#getPopElement()
	 * @generated
	 */
	int POP_ELEMENT = 10;

	/**
	 * The number of structural features of the '<em>Pop Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_ELEMENT_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pop Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POP_ELEMENT_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.textualmodeler.ast.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see hu.textualmodeler.ast.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for class '{@link hu.textualmodeler.ast.VisibleNode <em>Visible Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visible Node</em>'.
	 * @see hu.textualmodeler.ast.VisibleNode
	 * @generated
	 */
	EClass getVisibleNode();

	/**
	 * Returns the meta object for the attribute '{@link hu.textualmodeler.ast.VisibleNode#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see hu.textualmodeler.ast.VisibleNode#getStart()
	 * @see #getVisibleNode()
	 * @generated
	 */
	EAttribute getVisibleNode_Start();

	/**
	 * Returns the meta object for the attribute '{@link hu.textualmodeler.ast.VisibleNode#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see hu.textualmodeler.ast.VisibleNode#getLength()
	 * @see #getVisibleNode()
	 * @generated
	 */
	EAttribute getVisibleNode_Length();

	/**
	 * Returns the meta object for class '{@link hu.textualmodeler.ast.WhitespaceNode <em>Whitespace Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Whitespace Node</em>'.
	 * @see hu.textualmodeler.ast.WhitespaceNode
	 * @generated
	 */
	EClass getWhitespaceNode();

	/**
	 * Returns the meta object for the reference '{@link hu.textualmodeler.ast.WhitespaceNode#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal</em>'.
	 * @see hu.textualmodeler.ast.WhitespaceNode#getTerminal()
	 * @see #getWhitespaceNode()
	 * @generated
	 */
	EReference getWhitespaceNode_Terminal();

	/**
	 * Returns the meta object for class '{@link hu.textualmodeler.ast.TerminalNode <em>Terminal Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal Node</em>'.
	 * @see hu.textualmodeler.ast.TerminalNode
	 * @generated
	 */
	EClass getTerminalNode();

	/**
	 * Returns the meta object for the reference '{@link hu.textualmodeler.ast.TerminalNode#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal</em>'.
	 * @see hu.textualmodeler.ast.TerminalNode#getTerminal()
	 * @see #getTerminalNode()
	 * @generated
	 */
	EReference getTerminalNode_Terminal();

	/**
	 * Returns the meta object for the attribute '{@link hu.textualmodeler.ast.TerminalNode#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see hu.textualmodeler.ast.TerminalNode#getContent()
	 * @see #getTerminalNode()
	 * @generated
	 */
	EAttribute getTerminalNode_Content();

	/**
	 * Returns the meta object for class '{@link hu.textualmodeler.ast.FeatureSet <em>Feature Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Set</em>'.
	 * @see hu.textualmodeler.ast.FeatureSet
	 * @generated
	 */
	EClass getFeatureSet();

	/**
	 * Returns the meta object for the attribute '{@link hu.textualmodeler.ast.FeatureSet#getFeatureName <em>Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Name</em>'.
	 * @see hu.textualmodeler.ast.FeatureSet#getFeatureName()
	 * @see #getFeatureSet()
	 * @generated
	 */
	EAttribute getFeatureSet_FeatureName();

	/**
	 * Returns the meta object for class '{@link hu.textualmodeler.ast.FeatureSetValue <em>Feature Set Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Set Value</em>'.
	 * @see hu.textualmodeler.ast.FeatureSetValue
	 * @generated
	 */
	EClass getFeatureSetValue();

	/**
	 * Returns the meta object for the attribute '{@link hu.textualmodeler.ast.FeatureSetValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.textualmodeler.ast.FeatureSetValue#getValue()
	 * @see #getFeatureSetValue()
	 * @generated
	 */
	EAttribute getFeatureSetValue_Value();

	/**
	 * Returns the meta object for class '{@link hu.textualmodeler.ast.FeatureSetTerminalNode <em>Feature Set Terminal Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Set Terminal Node</em>'.
	 * @see hu.textualmodeler.ast.FeatureSetTerminalNode
	 * @generated
	 */
	EClass getFeatureSetTerminalNode();

	/**
	 * Returns the meta object for class '{@link hu.textualmodeler.ast.CompositeNode <em>Composite Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Node</em>'.
	 * @see hu.textualmodeler.ast.CompositeNode
	 * @generated
	 */
	EClass getCompositeNode();

	/**
	 * Returns the meta object for the reference '{@link hu.textualmodeler.ast.CompositeNode#getNonterminal <em>Nonterminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nonterminal</em>'.
	 * @see hu.textualmodeler.ast.CompositeNode#getNonterminal()
	 * @see #getCompositeNode()
	 * @generated
	 */
	EReference getCompositeNode_Nonterminal();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.textualmodeler.ast.CompositeNode#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see hu.textualmodeler.ast.CompositeNode#getChildren()
	 * @see #getCompositeNode()
	 * @generated
	 */
	EReference getCompositeNode_Children();

	/**
	 * Returns the meta object for class '{@link hu.textualmodeler.ast.SetContainmentFeature <em>Set Containment Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Containment Feature</em>'.
	 * @see hu.textualmodeler.ast.SetContainmentFeature
	 * @generated
	 */
	EClass getSetContainmentFeature();

	/**
	 * Returns the meta object for class '{@link hu.textualmodeler.ast.PushElement <em>Push Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Push Element</em>'.
	 * @see hu.textualmodeler.ast.PushElement
	 * @generated
	 */
	EClass getPushElement();

	/**
	 * Returns the meta object for the attribute '{@link hu.textualmodeler.ast.PushElement#getEclassURI <em>Eclass URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eclass URI</em>'.
	 * @see hu.textualmodeler.ast.PushElement#getEclassURI()
	 * @see #getPushElement()
	 * @generated
	 */
	EAttribute getPushElement_EclassURI();

	/**
	 * Returns the meta object for class '{@link hu.textualmodeler.ast.PopElement <em>Pop Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pop Element</em>'.
	 * @see hu.textualmodeler.ast.PopElement
	 * @generated
	 */
	EClass getPopElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AstFactory getAstFactory();

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
		 * The meta object literal for the '{@link hu.textualmodeler.ast.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.textualmodeler.ast.impl.NodeImpl
		 * @see hu.textualmodeler.ast.impl.AstPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '{@link hu.textualmodeler.ast.impl.VisibleNodeImpl <em>Visible Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.textualmodeler.ast.impl.VisibleNodeImpl
		 * @see hu.textualmodeler.ast.impl.AstPackageImpl#getVisibleNode()
		 * @generated
		 */
		EClass VISIBLE_NODE = eINSTANCE.getVisibleNode();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIBLE_NODE__START = eINSTANCE.getVisibleNode_Start();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISIBLE_NODE__LENGTH = eINSTANCE.getVisibleNode_Length();

		/**
		 * The meta object literal for the '{@link hu.textualmodeler.ast.impl.WhitespaceNodeImpl <em>Whitespace Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.textualmodeler.ast.impl.WhitespaceNodeImpl
		 * @see hu.textualmodeler.ast.impl.AstPackageImpl#getWhitespaceNode()
		 * @generated
		 */
		EClass WHITESPACE_NODE = eINSTANCE.getWhitespaceNode();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHITESPACE_NODE__TERMINAL = eINSTANCE.getWhitespaceNode_Terminal();

		/**
		 * The meta object literal for the '{@link hu.textualmodeler.ast.impl.TerminalNodeImpl <em>Terminal Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.textualmodeler.ast.impl.TerminalNodeImpl
		 * @see hu.textualmodeler.ast.impl.AstPackageImpl#getTerminalNode()
		 * @generated
		 */
		EClass TERMINAL_NODE = eINSTANCE.getTerminalNode();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL_NODE__TERMINAL = eINSTANCE.getTerminalNode_Terminal();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMINAL_NODE__CONTENT = eINSTANCE.getTerminalNode_Content();

		/**
		 * The meta object literal for the '{@link hu.textualmodeler.ast.FeatureSet <em>Feature Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.textualmodeler.ast.FeatureSet
		 * @see hu.textualmodeler.ast.impl.AstPackageImpl#getFeatureSet()
		 * @generated
		 */
		EClass FEATURE_SET = eINSTANCE.getFeatureSet();

		/**
		 * The meta object literal for the '<em><b>Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_SET__FEATURE_NAME = eINSTANCE.getFeatureSet_FeatureName();

		/**
		 * The meta object literal for the '{@link hu.textualmodeler.ast.impl.FeatureSetValueImpl <em>Feature Set Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.textualmodeler.ast.impl.FeatureSetValueImpl
		 * @see hu.textualmodeler.ast.impl.AstPackageImpl#getFeatureSetValue()
		 * @generated
		 */
		EClass FEATURE_SET_VALUE = eINSTANCE.getFeatureSetValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_SET_VALUE__VALUE = eINSTANCE.getFeatureSetValue_Value();

		/**
		 * The meta object literal for the '{@link hu.textualmodeler.ast.impl.FeatureSetTerminalNodeImpl <em>Feature Set Terminal Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.textualmodeler.ast.impl.FeatureSetTerminalNodeImpl
		 * @see hu.textualmodeler.ast.impl.AstPackageImpl#getFeatureSetTerminalNode()
		 * @generated
		 */
		EClass FEATURE_SET_TERMINAL_NODE = eINSTANCE.getFeatureSetTerminalNode();

		/**
		 * The meta object literal for the '{@link hu.textualmodeler.ast.impl.CompositeNodeImpl <em>Composite Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.textualmodeler.ast.impl.CompositeNodeImpl
		 * @see hu.textualmodeler.ast.impl.AstPackageImpl#getCompositeNode()
		 * @generated
		 */
		EClass COMPOSITE_NODE = eINSTANCE.getCompositeNode();

		/**
		 * The meta object literal for the '<em><b>Nonterminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_NODE__NONTERMINAL = eINSTANCE.getCompositeNode_Nonterminal();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_NODE__CHILDREN = eINSTANCE.getCompositeNode_Children();

		/**
		 * The meta object literal for the '{@link hu.textualmodeler.ast.impl.SetContainmentFeatureImpl <em>Set Containment Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.textualmodeler.ast.impl.SetContainmentFeatureImpl
		 * @see hu.textualmodeler.ast.impl.AstPackageImpl#getSetContainmentFeature()
		 * @generated
		 */
		EClass SET_CONTAINMENT_FEATURE = eINSTANCE.getSetContainmentFeature();

		/**
		 * The meta object literal for the '{@link hu.textualmodeler.ast.impl.PushElementImpl <em>Push Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.textualmodeler.ast.impl.PushElementImpl
		 * @see hu.textualmodeler.ast.impl.AstPackageImpl#getPushElement()
		 * @generated
		 */
		EClass PUSH_ELEMENT = eINSTANCE.getPushElement();

		/**
		 * The meta object literal for the '<em><b>Eclass URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUSH_ELEMENT__ECLASS_URI = eINSTANCE.getPushElement_EclassURI();

		/**
		 * The meta object literal for the '{@link hu.textualmodeler.ast.impl.PopElementImpl <em>Pop Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.textualmodeler.ast.impl.PopElementImpl
		 * @see hu.textualmodeler.ast.impl.AstPackageImpl#getPopElement()
		 * @generated
		 */
		EClass POP_ELEMENT = eINSTANCE.getPopElement();

	}

} //AstPackage
