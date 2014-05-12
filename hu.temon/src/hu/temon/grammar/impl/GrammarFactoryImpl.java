/**
 */
package hu.temon.grammar.impl;

import hu.temon.grammar.*;

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
public class GrammarFactoryImpl extends EFactoryImpl implements GrammarFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GrammarFactory init() {
		try {
			GrammarFactory theGrammarFactory = (GrammarFactory)EPackage.Registry.INSTANCE.getEFactory(GrammarPackage.eNS_URI);
			if (theGrammarFactory != null) {
				return theGrammarFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GrammarFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrammarFactoryImpl() {
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
			case GrammarPackage.GRAMMAR_MODEL: return createGrammarModel();
			case GrammarPackage.TERMINAL: return createTerminal();
			case GrammarPackage.REPLACE: return createReplace();
			case GrammarPackage.RULE: return createRule();
			case GrammarPackage.TERMINAL_ITEM: return createTerminalItem();
			case GrammarPackage.NON_TERMINAL_ITEM: return createNonTerminalItem();
			case GrammarPackage.SET_VALUE: return createSetValue();
			case GrammarPackage.PUSH: return createPush();
			case GrammarPackage.POP: return createPop();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrammarModel createGrammarModel() {
		GrammarModelImpl grammarModel = new GrammarModelImpl();
		return grammarModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal createTerminal() {
		TerminalImpl terminal = new TerminalImpl();
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Replace createReplace() {
		ReplaceImpl replace = new ReplaceImpl();
		return replace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminalItem createTerminalItem() {
		TerminalItemImpl terminalItem = new TerminalItemImpl();
		return terminalItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonTerminalItem createNonTerminalItem() {
		NonTerminalItemImpl nonTerminalItem = new NonTerminalItemImpl();
		return nonTerminalItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetValue createSetValue() {
		SetValueImpl setValue = new SetValueImpl();
		return setValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Push createPush() {
		PushImpl push = new PushImpl();
		return push;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pop createPop() {
		PopImpl pop = new PopImpl();
		return pop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrammarPackage getGrammarPackage() {
		return (GrammarPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GrammarPackage getPackage() {
		return GrammarPackage.eINSTANCE;
	}

} //GrammarFactoryImpl
