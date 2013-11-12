/**
 */
package hu.textualmodeler.ast.util;

import hu.textualmodeler.ast.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.textualmodeler.ast.AstPackage
 * @generated
 */
public class AstAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AstPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AstAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AstPackage.eINSTANCE;
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
	protected AstSwitch<Adapter> modelSwitch =
		new AstSwitch<Adapter>() {
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseVisibleNode(VisibleNode object) {
				return createVisibleNodeAdapter();
			}
			@Override
			public Adapter caseWhitespaceNode(WhitespaceNode object) {
				return createWhitespaceNodeAdapter();
			}
			@Override
			public Adapter caseTerminalNode(TerminalNode object) {
				return createTerminalNodeAdapter();
			}
			@Override
			public Adapter caseFeatureSet(FeatureSet object) {
				return createFeatureSetAdapter();
			}
			@Override
			public Adapter caseFeatureSetValue(FeatureSetValue object) {
				return createFeatureSetValueAdapter();
			}
			@Override
			public Adapter caseFeatureSetTerminalNode(FeatureSetTerminalNode object) {
				return createFeatureSetTerminalNodeAdapter();
			}
			@Override
			public Adapter caseCompositeNode(CompositeNode object) {
				return createCompositeNodeAdapter();
			}
			@Override
			public Adapter caseSetContainmentFeature(SetContainmentFeature object) {
				return createSetContainmentFeatureAdapter();
			}
			@Override
			public Adapter casePushElement(PushElement object) {
				return createPushElementAdapter();
			}
			@Override
			public Adapter casePopElement(PopElement object) {
				return createPopElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link hu.textualmodeler.ast.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.textualmodeler.ast.Node
	 * @generated
	 */
	public Adapter createNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.textualmodeler.ast.VisibleNode <em>Visible Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.textualmodeler.ast.VisibleNode
	 * @generated
	 */
	public Adapter createVisibleNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.textualmodeler.ast.WhitespaceNode <em>Whitespace Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.textualmodeler.ast.WhitespaceNode
	 * @generated
	 */
	public Adapter createWhitespaceNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.textualmodeler.ast.TerminalNode <em>Terminal Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.textualmodeler.ast.TerminalNode
	 * @generated
	 */
	public Adapter createTerminalNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.textualmodeler.ast.FeatureSet <em>Feature Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.textualmodeler.ast.FeatureSet
	 * @generated
	 */
	public Adapter createFeatureSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.textualmodeler.ast.FeatureSetValue <em>Feature Set Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.textualmodeler.ast.FeatureSetValue
	 * @generated
	 */
	public Adapter createFeatureSetValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.textualmodeler.ast.FeatureSetTerminalNode <em>Feature Set Terminal Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.textualmodeler.ast.FeatureSetTerminalNode
	 * @generated
	 */
	public Adapter createFeatureSetTerminalNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.textualmodeler.ast.CompositeNode <em>Composite Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.textualmodeler.ast.CompositeNode
	 * @generated
	 */
	public Adapter createCompositeNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.textualmodeler.ast.SetContainmentFeature <em>Set Containment Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.textualmodeler.ast.SetContainmentFeature
	 * @generated
	 */
	public Adapter createSetContainmentFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.textualmodeler.ast.PushElement <em>Push Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.textualmodeler.ast.PushElement
	 * @generated
	 */
	public Adapter createPushElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.textualmodeler.ast.PopElement <em>Pop Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.textualmodeler.ast.PopElement
	 * @generated
	 */
	public Adapter createPopElementAdapter() {
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

} //AstAdapterFactory
