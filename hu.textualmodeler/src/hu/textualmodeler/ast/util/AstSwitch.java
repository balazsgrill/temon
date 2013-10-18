/**
 */
package hu.textualmodeler.ast.util;

import hu.textualmodeler.ast.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see hu.textualmodeler.ast.AstPackage
 * @generated
 */
public class AstSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AstPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AstSwitch() {
		if (modelPackage == null) {
			modelPackage = AstPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AstPackage.NODE: {
				Node node = (Node)theEObject;
				T result = caseNode(node);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.VISIBLE_NODE: {
				VisibleNode visibleNode = (VisibleNode)theEObject;
				T result = caseVisibleNode(visibleNode);
				if (result == null) result = caseNode(visibleNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.TERMINAL_NODE: {
				TerminalNode terminalNode = (TerminalNode)theEObject;
				T result = caseTerminalNode(terminalNode);
				if (result == null) result = caseVisibleNode(terminalNode);
				if (result == null) result = caseNode(terminalNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.FEATURE_SET: {
				FeatureSet featureSet = (FeatureSet)theEObject;
				T result = caseFeatureSet(featureSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.FEATURE_SET_VALUE: {
				FeatureSetValue featureSetValue = (FeatureSetValue)theEObject;
				T result = caseFeatureSetValue(featureSetValue);
				if (result == null) result = caseNode(featureSetValue);
				if (result == null) result = caseFeatureSet(featureSetValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.FEATURE_SET_TERMINAL_NODE: {
				FeatureSetTerminalNode featureSetTerminalNode = (FeatureSetTerminalNode)theEObject;
				T result = caseFeatureSetTerminalNode(featureSetTerminalNode);
				if (result == null) result = caseTerminalNode(featureSetTerminalNode);
				if (result == null) result = caseFeatureSet(featureSetTerminalNode);
				if (result == null) result = caseVisibleNode(featureSetTerminalNode);
				if (result == null) result = caseNode(featureSetTerminalNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.COMPOSITE_NODE: {
				CompositeNode compositeNode = (CompositeNode)theEObject;
				T result = caseCompositeNode(compositeNode);
				if (result == null) result = caseNode(compositeNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.SET_CONTAINMENT_FEATURE: {
				SetContainmentFeature setContainmentFeature = (SetContainmentFeature)theEObject;
				T result = caseSetContainmentFeature(setContainmentFeature);
				if (result == null) result = caseNode(setContainmentFeature);
				if (result == null) result = caseFeatureSet(setContainmentFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.PUSH_ELEMENT: {
				PushElement pushElement = (PushElement)theEObject;
				T result = casePushElement(pushElement);
				if (result == null) result = caseNode(pushElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AstPackage.POP_ELEMENT: {
				PopElement popElement = (PopElement)theEObject;
				T result = casePopElement(popElement);
				if (result == null) result = caseNode(popElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNode(Node object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visible Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visible Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisibleNode(VisibleNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminal Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminal Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminalNode(TerminalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureSet(FeatureSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Set Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Set Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureSetValue(FeatureSetValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Set Terminal Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Set Terminal Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureSetTerminalNode(FeatureSetTerminalNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeNode(CompositeNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Containment Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Containment Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetContainmentFeature(SetContainmentFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Push Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Push Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePushElement(PushElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pop Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pop Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePopElement(PopElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AstSwitch
