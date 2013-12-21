/**
 */
package hu.textualmodeler.tokens;

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
 * @see hu.textualmodeler.tokens.TokensFactory
 * @model kind="package"
 * @generated
 */
public interface TokensPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tokens";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://textualmodeler.hu/tokens";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tokens";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TokensPackage eINSTANCE = hu.textualmodeler.tokens.impl.TokensPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.textualmodeler.tokens.impl.TokenValueImpl <em>Token Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.textualmodeler.tokens.impl.TokenValueImpl
	 * @see hu.textualmodeler.tokens.impl.TokensPackageImpl#getTokenValue()
	 * @generated
	 */
	int TOKEN_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_VALUE__TERMINAL = 1;

	/**
	 * The number of structural features of the '<em>Token Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Token Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.textualmodeler.tokens.impl.TokenListImpl <em>Token List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.textualmodeler.tokens.impl.TokenListImpl
	 * @see hu.textualmodeler.tokens.impl.TokensPackageImpl#getTokenList()
	 * @generated
	 */
	int TOKEN_LIST = 1;

	/**
	 * The feature id for the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_LIST__HEAD = 0;

	/**
	 * The feature id for the '<em><b>Tail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_LIST__TAIL = 1;

	/**
	 * The number of structural features of the '<em>Token List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_LIST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Token List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_LIST_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link hu.textualmodeler.tokens.TokenValue <em>Token Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Value</em>'.
	 * @see hu.textualmodeler.tokens.TokenValue
	 * @generated
	 */
	EClass getTokenValue();

	/**
	 * Returns the meta object for the attribute '{@link hu.textualmodeler.tokens.TokenValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.textualmodeler.tokens.TokenValue#getValue()
	 * @see #getTokenValue()
	 * @generated
	 */
	EAttribute getTokenValue_Value();

	/**
	 * Returns the meta object for the reference '{@link hu.textualmodeler.tokens.TokenValue#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal</em>'.
	 * @see hu.textualmodeler.tokens.TokenValue#getTerminal()
	 * @see #getTokenValue()
	 * @generated
	 */
	EReference getTokenValue_Terminal();

	/**
	 * Returns the meta object for class '{@link hu.textualmodeler.tokens.TokenList <em>Token List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token List</em>'.
	 * @see hu.textualmodeler.tokens.TokenList
	 * @generated
	 */
	EClass getTokenList();

	/**
	 * Returns the meta object for the containment reference '{@link hu.textualmodeler.tokens.TokenList#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Head</em>'.
	 * @see hu.textualmodeler.tokens.TokenList#getHead()
	 * @see #getTokenList()
	 * @generated
	 */
	EReference getTokenList_Head();

	/**
	 * Returns the meta object for the containment reference '{@link hu.textualmodeler.tokens.TokenList#getTail <em>Tail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tail</em>'.
	 * @see hu.textualmodeler.tokens.TokenList#getTail()
	 * @see #getTokenList()
	 * @generated
	 */
	EReference getTokenList_Tail();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TokensFactory getTokensFactory();

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
		 * The meta object literal for the '{@link hu.textualmodeler.tokens.impl.TokenValueImpl <em>Token Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.textualmodeler.tokens.impl.TokenValueImpl
		 * @see hu.textualmodeler.tokens.impl.TokensPackageImpl#getTokenValue()
		 * @generated
		 */
		EClass TOKEN_VALUE = eINSTANCE.getTokenValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_VALUE__VALUE = eINSTANCE.getTokenValue_Value();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_VALUE__TERMINAL = eINSTANCE.getTokenValue_Terminal();

		/**
		 * The meta object literal for the '{@link hu.textualmodeler.tokens.impl.TokenListImpl <em>Token List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.textualmodeler.tokens.impl.TokenListImpl
		 * @see hu.textualmodeler.tokens.impl.TokensPackageImpl#getTokenList()
		 * @generated
		 */
		EClass TOKEN_LIST = eINSTANCE.getTokenList();

		/**
		 * The meta object literal for the '<em><b>Head</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_LIST__HEAD = eINSTANCE.getTokenList_Head();

		/**
		 * The meta object literal for the '<em><b>Tail</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_LIST__TAIL = eINSTANCE.getTokenList_Tail();

	}

} //TokensPackage
