/**
 */
package hu.temon.grammar.impl;

import hu.temon.grammar.GrammarPackage;
import hu.temon.grammar.Replace;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Replace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.temon.grammar.impl.ReplaceImpl#getSearch <em>Search</em>}</li>
 *   <li>{@link hu.temon.grammar.impl.ReplaceImpl#getReplace <em>Replace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReplaceImpl extends MinimalEObjectImpl.Container implements Replace {
	/**
	 * The default value of the '{@link #getSearch() <em>Search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearch()
	 * @generated
	 * @ordered
	 */
	protected static final String SEARCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSearch() <em>Search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearch()
	 * @generated
	 * @ordered
	 */
	protected String search = SEARCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplace() <em>Replace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplace()
	 * @generated
	 * @ordered
	 */
	protected static final String REPLACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReplace() <em>Replace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplace()
	 * @generated
	 * @ordered
	 */
	protected String replace = REPLACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReplaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrammarPackage.Literals.REPLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSearch() {
		return search;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSearch(String newSearch) {
		String oldSearch = search;
		search = newSearch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.REPLACE__SEARCH, oldSearch, search));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReplace() {
		return replace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplace(String newReplace) {
		String oldReplace = replace;
		replace = newReplace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.REPLACE__REPLACE, oldReplace, replace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrammarPackage.REPLACE__SEARCH:
				return getSearch();
			case GrammarPackage.REPLACE__REPLACE:
				return getReplace();
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
			case GrammarPackage.REPLACE__SEARCH:
				setSearch((String)newValue);
				return;
			case GrammarPackage.REPLACE__REPLACE:
				setReplace((String)newValue);
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
			case GrammarPackage.REPLACE__SEARCH:
				setSearch(SEARCH_EDEFAULT);
				return;
			case GrammarPackage.REPLACE__REPLACE:
				setReplace(REPLACE_EDEFAULT);
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
			case GrammarPackage.REPLACE__SEARCH:
				return SEARCH_EDEFAULT == null ? search != null : !SEARCH_EDEFAULT.equals(search);
			case GrammarPackage.REPLACE__REPLACE:
				return REPLACE_EDEFAULT == null ? replace != null : !REPLACE_EDEFAULT.equals(replace);
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
		result.append(" (search: ");
		result.append(search);
		result.append(", replace: ");
		result.append(replace);
		result.append(')');
		return result.toString();
	}

} //ReplaceImpl
