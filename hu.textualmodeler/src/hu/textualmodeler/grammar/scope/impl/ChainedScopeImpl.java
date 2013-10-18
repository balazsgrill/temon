/**
 */
package hu.textualmodeler.grammar.scope.impl;

import hu.textualmodeler.grammar.scope.ChainedScope;
import hu.textualmodeler.grammar.scope.Scope;
import hu.textualmodeler.grammar.scope.ScopePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chained Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.textualmodeler.grammar.scope.impl.ChainedScopeImpl#getSubScopes <em>Sub Scopes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChainedScopeImpl extends ScopeImpl implements ChainedScope {
	/**
	 * The cached value of the '{@link #getSubScopes() <em>Sub Scopes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubScopes()
	 * @generated
	 * @ordered
	 */
	protected EList<Scope> subScopes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChainedScopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScopePackage.Literals.CHAINED_SCOPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scope> getSubScopes() {
		if (subScopes == null) {
			subScopes = new EObjectContainmentEList<Scope>(Scope.class, this, ScopePackage.CHAINED_SCOPE__SUB_SCOPES);
		}
		return subScopes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ScopePackage.CHAINED_SCOPE__SUB_SCOPES:
				return ((InternalEList<?>)getSubScopes()).basicRemove(otherEnd, msgs);
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
			case ScopePackage.CHAINED_SCOPE__SUB_SCOPES:
				return getSubScopes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ScopePackage.CHAINED_SCOPE__SUB_SCOPES:
				getSubScopes().clear();
				getSubScopes().addAll((Collection<? extends Scope>)newValue);
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
			case ScopePackage.CHAINED_SCOPE__SUB_SCOPES:
				getSubScopes().clear();
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
			case ScopePackage.CHAINED_SCOPE__SUB_SCOPES:
				return subScopes != null && !subScopes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ChainedScopeImpl
