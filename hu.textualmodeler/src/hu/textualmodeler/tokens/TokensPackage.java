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
	 * The meta object id for the '{@link hu.textualmodeler.tokens.impl.TokenImpl <em>Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.textualmodeler.tokens.impl.TokenImpl
	 * @see hu.textualmodeler.tokens.impl.TokensPackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 0;

	/**
	 * The feature id for the '<em><b>Tail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__TAIL = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__TERMINAL = 2;

	/**
	 * The number of structural features of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link hu.textualmodeler.tokens.impl.TerminalListImpl <em>Terminal List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.textualmodeler.tokens.impl.TerminalListImpl
	 * @see hu.textualmodeler.tokens.impl.TokensPackageImpl#getTerminalList()
	 * @generated
	 */
	int TERMINAL_LIST = 1;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_LIST__TERMINALS = 0;

	/**
	 * The number of structural features of the '<em>Terminal List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Terminal List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_LIST_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link hu.textualmodeler.tokens.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token</em>'.
	 * @see hu.textualmodeler.tokens.Token
	 * @generated
	 */
	EClass getToken();

	/**
	 * Returns the meta object for the containment reference '{@link hu.textualmodeler.tokens.Token#getTail <em>Tail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tail</em>'.
	 * @see hu.textualmodeler.tokens.Token#getTail()
	 * @see #getToken()
	 * @generated
	 */
	EReference getToken_Tail();

	/**
	 * Returns the meta object for the attribute '{@link hu.textualmodeler.tokens.Token#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.textualmodeler.tokens.Token#getValue()
	 * @see #getToken()
	 * @generated
	 */
	EAttribute getToken_Value();

	/**
	 * Returns the meta object for the reference '{@link hu.textualmodeler.tokens.Token#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal</em>'.
	 * @see hu.textualmodeler.tokens.Token#getTerminal()
	 * @see #getToken()
	 * @generated
	 */
	EReference getToken_Terminal();

	/**
	 * Returns the meta object for class '{@link hu.textualmodeler.tokens.TerminalList <em>Terminal List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal List</em>'.
	 * @see hu.textualmodeler.tokens.TerminalList
	 * @generated
	 */
	EClass getTerminalList();

	/**
	 * Returns the meta object for the reference list '{@link hu.textualmodeler.tokens.TerminalList#getTerminals <em>Terminals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Terminals</em>'.
	 * @see hu.textualmodeler.tokens.TerminalList#getTerminals()
	 * @see #getTerminalList()
	 * @generated
	 */
	EReference getTerminalList_Terminals();

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
		 * The meta object literal for the '{@link hu.textualmodeler.tokens.impl.TokenImpl <em>Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.textualmodeler.tokens.impl.TokenImpl
		 * @see hu.textualmodeler.tokens.impl.TokensPackageImpl#getToken()
		 * @generated
		 */
		EClass TOKEN = eINSTANCE.getToken();

		/**
		 * The meta object literal for the '<em><b>Tail</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN__TAIL = eINSTANCE.getToken_Tail();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN__VALUE = eINSTANCE.getToken_Value();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN__TERMINAL = eINSTANCE.getToken_Terminal();

		/**
		 * The meta object literal for the '{@link hu.textualmodeler.tokens.impl.TerminalListImpl <em>Terminal List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.textualmodeler.tokens.impl.TerminalListImpl
		 * @see hu.textualmodeler.tokens.impl.TokensPackageImpl#getTerminalList()
		 * @generated
		 */
		EClass TERMINAL_LIST = eINSTANCE.getTerminalList();

		/**
		 * The meta object literal for the '<em><b>Terminals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINAL_LIST__TERMINALS = eINSTANCE.getTerminalList_Terminals();

	}

} //TokensPackage
