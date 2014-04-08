/**
 */
package hu.textualmodeler.ast.impl;

import hu.textualmodeler.ast.AstPackage;
import hu.textualmodeler.ast.PushElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Push Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.textualmodeler.ast.impl.PushElementImpl#getEclass <em>Eclass</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PushElementImpl extends NodeImpl implements PushElement {
	/**
	 * The cached value of the '{@link #getEclass() <em>Eclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEclass()
	 * @generated
	 * @ordered
	 */
	protected EClass eclass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PushElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.PUSH_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEclass() {
		if (eclass != null && eclass.eIsProxy()) {
			InternalEObject oldEclass = (InternalEObject)eclass;
			eclass = (EClass)eResolveProxy(oldEclass);
			if (eclass != oldEclass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AstPackage.PUSH_ELEMENT__ECLASS, oldEclass, eclass));
			}
		}
		return eclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetEclass() {
		return eclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEclass(EClass newEclass) {
		EClass oldEclass = eclass;
		eclass = newEclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.PUSH_ELEMENT__ECLASS, oldEclass, eclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AstPackage.PUSH_ELEMENT__ECLASS:
				if (resolve) return getEclass();
				return basicGetEclass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AstPackage.PUSH_ELEMENT__ECLASS:
				setEclass((EClass)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AstPackage.PUSH_ELEMENT__ECLASS:
				setEclass((EClass)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AstPackage.PUSH_ELEMENT__ECLASS:
				return eclass != null;
		}
		return super.eIsSet(featureID);
	}

} //PushElementImpl
