/**
 */
package hu.textualmodeler.tokens.impl;

import hu.textualmodeler.tokens.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TokensFactoryImpl extends EFactoryImpl implements TokensFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TokensFactory init() {
		try {
			TokensFactory theTokensFactory = (TokensFactory)EPackage.Registry.INSTANCE.getEFactory(TokensPackage.eNS_URI);
			if (theTokensFactory != null) {
				return theTokensFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TokensFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokensFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TokensPackage.TOKEN_VALUE: return createTokenValue();
			case TokensPackage.TOKEN_LIST: return createTokenList();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenValue createTokenValue() {
		TokenValueImpl tokenValue = new TokenValueImpl();
		return tokenValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenList createTokenList() {
		TokenListImpl tokenList = new TokenListImpl();
		return tokenList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokensPackage getTokensPackage() {
		return (TokensPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TokensPackage getPackage() {
		return TokensPackage.eINSTANCE;
	}

} //TokensFactoryImpl
