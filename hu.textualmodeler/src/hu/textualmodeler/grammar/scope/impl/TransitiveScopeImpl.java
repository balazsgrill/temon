/**
 */
package hu.textualmodeler.grammar.scope.impl;

import hu.textualmodeler.grammar.scope.Scope;
import hu.textualmodeler.grammar.scope.ScopePackage;
import hu.textualmodeler.grammar.scope.TransitiveScope;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transitive Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.textualmodeler.grammar.scope.impl.TransitiveScopeImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link hu.textualmodeler.grammar.scope.impl.TransitiveScopeImpl#getSubScope <em>Sub Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitiveScopeImpl extends ScopeImpl implements TransitiveScope {
	/**
	 * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean optional = OPTIONAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubScope() <em>Sub Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubScope()
	 * @generated
	 * @ordered
	 */
	protected Scope subScope;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitiveScopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScopePackage.Literals.TRANSITIVE_SCOPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptional() {
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptional(boolean newOptional) {
		boolean oldOptional = optional;
		optional = newOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScopePackage.TRANSITIVE_SCOPE__OPTIONAL, oldOptional, optional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope getSubScope() {
		return subScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubScope(Scope newSubScope, NotificationChain msgs) {
		Scope oldSubScope = subScope;
		subScope = newSubScope;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ScopePackage.TRANSITIVE_SCOPE__SUB_SCOPE, oldSubScope, newSubScope);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubScope(Scope newSubScope) {
		if (newSubScope != subScope) {
			NotificationChain msgs = null;
			if (subScope != null)
				msgs = ((InternalEObject)subScope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ScopePackage.TRANSITIVE_SCOPE__SUB_SCOPE, null, msgs);
			if (newSubScope != null)
				msgs = ((InternalEObject)newSubScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ScopePackage.TRANSITIVE_SCOPE__SUB_SCOPE, null, msgs);
			msgs = basicSetSubScope(newSubScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScopePackage.TRANSITIVE_SCOPE__SUB_SCOPE, newSubScope, newSubScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScopePackage.TRANSITIVE_SCOPE__SUB_SCOPE:
				return basicSetSubScope(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScopePackage.TRANSITIVE_SCOPE__OPTIONAL:
				return isOptional();
			case ScopePackage.TRANSITIVE_SCOPE__SUB_SCOPE:
				return getSubScope();
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
			case ScopePackage.TRANSITIVE_SCOPE__OPTIONAL:
				setOptional((Boolean)newValue);
				return;
			case ScopePackage.TRANSITIVE_SCOPE__SUB_SCOPE:
				setSubScope((Scope)newValue);
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
			case ScopePackage.TRANSITIVE_SCOPE__OPTIONAL:
				setOptional(OPTIONAL_EDEFAULT);
				return;
			case ScopePackage.TRANSITIVE_SCOPE__SUB_SCOPE:
				setSubScope((Scope)null);
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
			case ScopePackage.TRANSITIVE_SCOPE__OPTIONAL:
				return optional != OPTIONAL_EDEFAULT;
			case ScopePackage.TRANSITIVE_SCOPE__SUB_SCOPE:
				return subScope != null;
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
		result.append(" (optional: ");
		result.append(optional);
		result.append(')');
		return result.toString();
	}

} //TransitiveScopeImpl
