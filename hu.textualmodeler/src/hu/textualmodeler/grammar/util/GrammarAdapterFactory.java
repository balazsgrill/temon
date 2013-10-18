/**
 */
package hu.textualmodeler.grammar.util;

import hu.textualmodeler.grammar.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.textualmodeler.grammar.GrammarPackage
 * @generated
 */
public class GrammarAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GrammarPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrammarAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GrammarPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GrammarSwitch<Adapter> modelSwitch =
		new GrammarSwitch<Adapter>() {
			@Override
			public Adapter caseGrammarModel(GrammarModel object) {
				return createGrammarModelAdapter();
			}
			@Override
			public Adapter caseTerminal(Terminal object) {
				return createTerminalAdapter();
			}
			@Override
			public Adapter caseReplace(Replace object) {
				return createReplaceAdapter();
			}
			@Override
			public Adapter caseRule(Rule object) {
				return createRuleAdapter();
			}
			@Override
			public Adapter caseRuleItem(RuleItem object) {
				return createRuleItemAdapter();
			}
			@Override
			public Adapter caseSyntaxItem(SyntaxItem object) {
				return createSyntaxItemAdapter();
			}
			@Override
			public Adapter caseTerminalItem(TerminalItem object) {
				return createTerminalItemAdapter();
			}
			@Override
			public Adapter caseNonTerminalItem(NonTerminalItem object) {
				return createNonTerminalItemAdapter();
			}
			@Override
			public Adapter caseSetValue(SetValue object) {
				return createSetValueAdapter();
			}
			@Override
			public Adapter casePush(Push object) {
				return createPushAdapter();
			}
			@Override
			public Adapter casePop(Pop object) {
				return createPopAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link hu.textualmodeler.grammar.GrammarModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.textualmodeler.grammar.GrammarModel
	 * @generated
	 */
	public Adapter createGrammarModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.textualmodeler.grammar.Terminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.textualmodeler.grammar.Terminal
	 * @generated
	 */
	public Adapter createTerminalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.textualmodeler.grammar.Replace <em>Replace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.textualmodeler.grammar.Replace
	 * @generated
	 */
	public Adapter createReplaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.textualmodeler.grammar.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.textualmodeler.grammar.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.textualmodeler.grammar.RuleItem <em>Rule Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.textualmodeler.grammar.RuleItem
	 * @generated
	 */
	public Adapter createRuleItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.textualmodeler.grammar.SyntaxItem <em>Syntax Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.textualmodeler.grammar.SyntaxItem
	 * @generated
	 */
	public Adapter createSyntaxItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.textualmodeler.grammar.TerminalItem <em>Terminal Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.textualmodeler.grammar.TerminalItem
	 * @generated
	 */
	public Adapter createTerminalItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.textualmodeler.grammar.NonTerminalItem <em>Non Terminal Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.textualmodeler.grammar.NonTerminalItem
	 * @generated
	 */
	public Adapter createNonTerminalItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.textualmodeler.grammar.SetValue <em>Set Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.textualmodeler.grammar.SetValue
	 * @generated
	 */
	public Adapter createSetValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.textualmodeler.grammar.Push <em>Push</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.textualmodeler.grammar.Push
	 * @generated
	 */
	public Adapter createPushAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.textualmodeler.grammar.Pop <em>Pop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.textualmodeler.grammar.Pop
	 * @generated
	 */
	public Adapter createPopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GrammarAdapterFactory
