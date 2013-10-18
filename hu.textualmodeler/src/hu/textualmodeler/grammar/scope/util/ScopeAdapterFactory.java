/**
 */
package hu.textualmodeler.grammar.scope.util;

import hu.textualmodeler.grammar.scope.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.textualmodeler.grammar.scope.ScopePackage
 * @generated
 */
public class ScopeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ScopePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ScopePackage.eINSTANCE;
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
	protected ScopeSwitch<Adapter> modelSwitch =
		new ScopeSwitch<Adapter>() {
			@Override
			public Adapter caseScope(Scope object) {
				return createScopeAdapter();
			}
			@Override
			public Adapter caseFeatureScope(FeatureScope object) {
				return createFeatureScopeAdapter();
			}
			@Override
			public Adapter caseContainerScope(ContainerScope object) {
				return createContainerScopeAdapter();
			}
			@Override
			public Adapter caseTransitiveScope(TransitiveScope object) {
				return createTransitiveScopeAdapter();
			}
			@Override
			public Adapter caseChainedScope(ChainedScope object) {
				return createChainedScopeAdapter();
			}
			@Override
			public Adapter caseConditionalScope(ConditionalScope object) {
				return createConditionalScopeAdapter();
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
	 * Creates a new adapter for an object of class '{@link hu.textualmodeler.grammar.scope.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.textualmodeler.grammar.scope.Scope
	 * @generated
	 */
	public Adapter createScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.textualmodeler.grammar.scope.FeatureScope <em>Feature Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.textualmodeler.grammar.scope.FeatureScope
	 * @generated
	 */
	public Adapter createFeatureScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.textualmodeler.grammar.scope.ContainerScope <em>Container Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.textualmodeler.grammar.scope.ContainerScope
	 * @generated
	 */
	public Adapter createContainerScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.textualmodeler.grammar.scope.TransitiveScope <em>Transitive Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.textualmodeler.grammar.scope.TransitiveScope
	 * @generated
	 */
	public Adapter createTransitiveScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.textualmodeler.grammar.scope.ChainedScope <em>Chained Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.textualmodeler.grammar.scope.ChainedScope
	 * @generated
	 */
	public Adapter createChainedScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.textualmodeler.grammar.scope.ConditionalScope <em>Conditional Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.textualmodeler.grammar.scope.ConditionalScope
	 * @generated
	 */
	public Adapter createConditionalScopeAdapter() {
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

} //ScopeAdapterFactory
