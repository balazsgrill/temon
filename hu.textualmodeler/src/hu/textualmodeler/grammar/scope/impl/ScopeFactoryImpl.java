/**
 */
package hu.textualmodeler.grammar.scope.impl;

import hu.textualmodeler.grammar.scope.*;

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
public class ScopeFactoryImpl extends EFactoryImpl implements ScopeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ScopeFactory init() {
		try {
			ScopeFactory theScopeFactory = (ScopeFactory)EPackage.Registry.INSTANCE.getEFactory(ScopePackage.eNS_URI);
			if (theScopeFactory != null) {
				return theScopeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ScopeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeFactoryImpl() {
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
			case ScopePackage.FEATURE_SCOPE: return createFeatureScope();
			case ScopePackage.CONTAINER_SCOPE: return createContainerScope();
			case ScopePackage.TRANSITIVE_SCOPE: return createTransitiveScope();
			case ScopePackage.CHAINED_SCOPE: return createChainedScope();
			case ScopePackage.CONDITIONAL_SCOPE: return createConditionalScope();
			case ScopePackage.GLOBAL_SCOPE: return createGlobalScope();
			case ScopePackage.UNION_SCOPE: return createUnionScope();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureScope createFeatureScope() {
		FeatureScopeImpl featureScope = new FeatureScopeImpl();
		return featureScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerScope createContainerScope() {
		ContainerScopeImpl containerScope = new ContainerScopeImpl();
		return containerScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitiveScope createTransitiveScope() {
		TransitiveScopeImpl transitiveScope = new TransitiveScopeImpl();
		return transitiveScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainedScope createChainedScope() {
		ChainedScopeImpl chainedScope = new ChainedScopeImpl();
		return chainedScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalScope createConditionalScope() {
		ConditionalScopeImpl conditionalScope = new ConditionalScopeImpl();
		return conditionalScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalScope createGlobalScope() {
		GlobalScopeImpl globalScope = new GlobalScopeImpl();
		return globalScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnionScope createUnionScope() {
		UnionScopeImpl unionScope = new UnionScopeImpl();
		return unionScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopePackage getScopePackage() {
		return (ScopePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ScopePackage getPackage() {
		return ScopePackage.eINSTANCE;
	}

} //ScopeFactoryImpl
