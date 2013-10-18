/**
 */
package hu.textualmodeler.ast.impl;

import hu.textualmodeler.ast.AstPackage;
import hu.textualmodeler.ast.PushElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Push Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.textualmodeler.ast.impl.PushElementImpl#getEclassURI <em>Eclass URI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PushElementImpl extends NodeImpl implements PushElement {
	/**
	 * The default value of the '{@link #getEclassURI() <em>Eclass URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEclassURI()
	 * @generated
	 * @ordered
	 */
	protected static final String ECLASS_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEclassURI() <em>Eclass URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEclassURI()
	 * @generated
	 * @ordered
	 */
	protected String eclassURI = ECLASS_URI_EDEFAULT;

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
	public String getEclassURI() {
		return eclassURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEclassURI(String newEclassURI) {
		String oldEclassURI = eclassURI;
		eclassURI = newEclassURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.PUSH_ELEMENT__ECLASS_URI, oldEclassURI, eclassURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AstPackage.PUSH_ELEMENT__ECLASS_URI:
				return getEclassURI();
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
			case AstPackage.PUSH_ELEMENT__ECLASS_URI:
				setEclassURI((String)newValue);
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
			case AstPackage.PUSH_ELEMENT__ECLASS_URI:
				setEclassURI(ECLASS_URI_EDEFAULT);
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
			case AstPackage.PUSH_ELEMENT__ECLASS_URI:
				return ECLASS_URI_EDEFAULT == null ? eclassURI != null : !ECLASS_URI_EDEFAULT.equals(eclassURI);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (eclassURI: ");
		result.append(eclassURI);
		result.append(')');
		return result.toString();
	}

} //PushElementImpl
