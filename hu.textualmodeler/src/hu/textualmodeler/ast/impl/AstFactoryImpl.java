/**
 */
package hu.textualmodeler.ast.impl;

import hu.textualmodeler.ast.*;

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
public class AstFactoryImpl extends EFactoryImpl implements AstFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AstFactory init() {
		try {
			AstFactory theAstFactory = (AstFactory)EPackage.Registry.INSTANCE.getEFactory(AstPackage.eNS_URI);
			if (theAstFactory != null) {
				return theAstFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AstFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AstFactoryImpl() {
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
			case AstPackage.WHITESPACE_NODE: return createWhitespaceNode();
			case AstPackage.TERMINAL_NODE: return createTerminalNode();
			case AstPackage.REMOVED_TERMINAL_NODE: return createRemovedTerminalNode();
			case AstPackage.INSERTED_TERMINAL_NODE: return createInsertedTerminalNode();
			case AstPackage.INSERTED_FEATURE_SET_TERMINAL_NODE: return createInsertedFeatureSetTerminalNode();
			case AstPackage.FEATURE_SET_VALUE: return createFeatureSetValue();
			case AstPackage.FEATURE_SET_TERMINAL_NODE: return createFeatureSetTerminalNode();
			case AstPackage.COMPOSITE_NODE: return createCompositeNode();
			case AstPackage.SET_CONTAINMENT_FEATURE: return createSetContainmentFeature();
			case AstPackage.PUSH_ELEMENT: return createPushElement();
			case AstPackage.POP_ELEMENT: return createPopElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhitespaceNode createWhitespaceNode() {
		WhitespaceNodeImpl whitespaceNode = new WhitespaceNodeImpl();
		return whitespaceNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminalNode createTerminalNode() {
		TerminalNodeImpl terminalNode = new TerminalNodeImpl();
		return terminalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemovedTerminalNode createRemovedTerminalNode() {
		RemovedTerminalNodeImpl removedTerminalNode = new RemovedTerminalNodeImpl();
		return removedTerminalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsertedTerminalNode createInsertedTerminalNode() {
		InsertedTerminalNodeImpl insertedTerminalNode = new InsertedTerminalNodeImpl();
		return insertedTerminalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsertedFeatureSetTerminalNode createInsertedFeatureSetTerminalNode() {
		InsertedFeatureSetTerminalNodeImpl insertedFeatureSetTerminalNode = new InsertedFeatureSetTerminalNodeImpl();
		return insertedFeatureSetTerminalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureSetValue createFeatureSetValue() {
		FeatureSetValueImpl featureSetValue = new FeatureSetValueImpl();
		return featureSetValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureSetTerminalNode createFeatureSetTerminalNode() {
		FeatureSetTerminalNodeImpl featureSetTerminalNode = new FeatureSetTerminalNodeImpl();
		return featureSetTerminalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeNode createCompositeNode() {
		CompositeNodeImpl compositeNode = new CompositeNodeImpl();
		return compositeNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetContainmentFeature createSetContainmentFeature() {
		SetContainmentFeatureImpl setContainmentFeature = new SetContainmentFeatureImpl();
		return setContainmentFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PushElement createPushElement() {
		PushElementImpl pushElement = new PushElementImpl();
		return pushElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PopElement createPopElement() {
		PopElementImpl popElement = new PopElementImpl();
		return popElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AstPackage getAstPackage() {
		return (AstPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AstPackage getPackage() {
		return AstPackage.eINSTANCE;
	}

} //AstFactoryImpl
