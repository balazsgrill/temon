/**
 */
package hu.textualmodeler.grammar.impl;

import hu.textualmodeler.grammar.GrammarPackage;
import hu.textualmodeler.grammar.Replace;
import hu.textualmodeler.grammar.Terminal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.textualmodeler.grammar.impl.TerminalImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.textualmodeler.grammar.impl.TerminalImpl#getRegex <em>Regex</em>}</li>
 *   <li>{@link hu.textualmodeler.grammar.impl.TerminalImpl#isHide <em>Hide</em>}</li>
 *   <li>{@link hu.textualmodeler.grammar.impl.TerminalImpl#getReplace <em>Replace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TerminalImpl extends MinimalEObjectImpl.Container implements Terminal {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegex() <em>Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegex()
	 * @generated
	 * @ordered
	 */
	protected static final String REGEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegex() <em>Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegex()
	 * @generated
	 * @ordered
	 */
	protected String regex = REGEX_EDEFAULT;

	/**
	 * The default value of the '{@link #isHide() <em>Hide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHide()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIDE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHide() <em>Hide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHide()
	 * @generated
	 * @ordered
	 */
	protected boolean hide = HIDE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReplace() <em>Replace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplace()
	 * @generated
	 * @ordered
	 */
	protected EList<Replace> replace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrammarPackage.Literals.TERMINAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.TERMINAL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegex() {
		return regex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegex(String newRegex) {
		String oldRegex = regex;
		regex = newRegex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.TERMINAL__REGEX, oldRegex, regex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHide() {
		return hide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHide(boolean newHide) {
		boolean oldHide = hide;
		hide = newHide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.TERMINAL__HIDE, oldHide, hide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Replace> getReplace() {
		if (replace == null) {
			replace = new EObjectContainmentEList<Replace>(Replace.class, this, GrammarPackage.TERMINAL__REPLACE);
		}
		return replace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrammarPackage.TERMINAL__REPLACE:
				return ((InternalEList<?>)getReplace()).basicRemove(otherEnd, msgs);
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
			case GrammarPackage.TERMINAL__NAME:
				return getName();
			case GrammarPackage.TERMINAL__REGEX:
				return getRegex();
			case GrammarPackage.TERMINAL__HIDE:
				return isHide();
			case GrammarPackage.TERMINAL__REPLACE:
				return getReplace();
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
			case GrammarPackage.TERMINAL__NAME:
				setName((String)newValue);
				return;
			case GrammarPackage.TERMINAL__REGEX:
				setRegex((String)newValue);
				return;
			case GrammarPackage.TERMINAL__HIDE:
				setHide((Boolean)newValue);
				return;
			case GrammarPackage.TERMINAL__REPLACE:
				getReplace().clear();
				getReplace().addAll((Collection<? extends Replace>)newValue);
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
			case GrammarPackage.TERMINAL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GrammarPackage.TERMINAL__REGEX:
				setRegex(REGEX_EDEFAULT);
				return;
			case GrammarPackage.TERMINAL__HIDE:
				setHide(HIDE_EDEFAULT);
				return;
			case GrammarPackage.TERMINAL__REPLACE:
				getReplace().clear();
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
			case GrammarPackage.TERMINAL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GrammarPackage.TERMINAL__REGEX:
				return REGEX_EDEFAULT == null ? regex != null : !REGEX_EDEFAULT.equals(regex);
			case GrammarPackage.TERMINAL__HIDE:
				return hide != HIDE_EDEFAULT;
			case GrammarPackage.TERMINAL__REPLACE:
				return replace != null && !replace.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", regex: ");
		result.append(regex);
		result.append(", hide: ");
		result.append(hide);
		result.append(')');
		return result.toString();
	}

} //TerminalImpl
