/**
 */
package hu.textualmodeler.grammar.impl;

import hu.textualmodeler.grammar.GrammarPackage;
import hu.textualmodeler.grammar.Rule;
import hu.textualmodeler.grammar.RuleItem;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.textualmodeler.grammar.impl.RuleImpl#getNonTerminal <em>Non Terminal</em>}</li>
 *   <li>{@link hu.textualmodeler.grammar.impl.RuleImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link hu.textualmodeler.grammar.impl.RuleImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleImpl extends MinimalEObjectImpl.Container implements Rule {
	/**
	 * The default value of the '{@link #getNonTerminal() <em>Non Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonTerminal()
	 * @generated
	 * @ordered
	 */
	protected static final String NON_TERMINAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNonTerminal() <em>Non Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonTerminal()
	 * @generated
	 * @ordered
	 */
	protected String nonTerminal = NON_TERMINAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<String> condition;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EList<RuleItem> body;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrammarPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNonTerminal() {
		return nonTerminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNonTerminal(String newNonTerminal) {
		String oldNonTerminal = nonTerminal;
		nonTerminal = newNonTerminal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.RULE__NON_TERMINAL, oldNonTerminal, nonTerminal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCondition() {
		if (condition == null) {
			condition = new EDataTypeUniqueEList<String>(String.class, this, GrammarPackage.RULE__CONDITION);
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuleItem> getBody() {
		if (body == null) {
			body = new EObjectContainmentEList<RuleItem>(RuleItem.class, this, GrammarPackage.RULE__BODY);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrammarPackage.RULE__BODY:
				return ((InternalEList<?>)getBody()).basicRemove(otherEnd, msgs);
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
			case GrammarPackage.RULE__NON_TERMINAL:
				return getNonTerminal();
			case GrammarPackage.RULE__CONDITION:
				return getCondition();
			case GrammarPackage.RULE__BODY:
				return getBody();
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
			case GrammarPackage.RULE__NON_TERMINAL:
				setNonTerminal((String)newValue);
				return;
			case GrammarPackage.RULE__CONDITION:
				getCondition().clear();
				getCondition().addAll((Collection<? extends String>)newValue);
				return;
			case GrammarPackage.RULE__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends RuleItem>)newValue);
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
			case GrammarPackage.RULE__NON_TERMINAL:
				setNonTerminal(NON_TERMINAL_EDEFAULT);
				return;
			case GrammarPackage.RULE__CONDITION:
				getCondition().clear();
				return;
			case GrammarPackage.RULE__BODY:
				getBody().clear();
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
			case GrammarPackage.RULE__NON_TERMINAL:
				return NON_TERMINAL_EDEFAULT == null ? nonTerminal != null : !NON_TERMINAL_EDEFAULT.equals(nonTerminal);
			case GrammarPackage.RULE__CONDITION:
				return condition != null && !condition.isEmpty();
			case GrammarPackage.RULE__BODY:
				return body != null && !body.isEmpty();
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
		result.append(" (nonTerminal: ");
		result.append(nonTerminal);
		result.append(", condition: ");
		result.append(condition);
		result.append(')');
		return result.toString();
	}

} //RuleImpl
