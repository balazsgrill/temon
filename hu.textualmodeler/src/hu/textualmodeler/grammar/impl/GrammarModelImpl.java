/**
 */
package hu.textualmodeler.grammar.impl;

import hu.textualmodeler.grammar.GrammarModel;
import hu.textualmodeler.grammar.GrammarPackage;
import hu.textualmodeler.grammar.Rule;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.textualmodeler.grammar.impl.GrammarModelImpl#getTerminals <em>Terminals</em>}</li>
 *   <li>{@link hu.textualmodeler.grammar.impl.GrammarModelImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link hu.textualmodeler.grammar.impl.GrammarModelImpl#getStartItem <em>Start Item</em>}</li>
 *   <li>{@link hu.textualmodeler.grammar.impl.GrammarModelImpl#getImport <em>Import</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GrammarModelImpl extends MinimalEObjectImpl.Container implements GrammarModel {
	/**
	 * The cached value of the '{@link #getTerminals() <em>Terminals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminals()
	 * @generated
	 * @ordered
	 */
	protected EList<Terminal> terminals;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> rules;

	/**
	 * The default value of the '{@link #getStartItem() <em>Start Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartItem()
	 * @generated
	 * @ordered
	 */
	protected static final String START_ITEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartItem() <em>Start Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartItem()
	 * @generated
	 * @ordered
	 */
	protected String startItem = START_ITEM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImport() <em>Import</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImport()
	 * @generated
	 * @ordered
	 */
	protected EList<GrammarModel> import_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GrammarModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrammarPackage.Literals.GRAMMAR_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Terminal> getTerminals() {
		if (terminals == null) {
			terminals = new EObjectContainmentEList<Terminal>(Terminal.class, this, GrammarPackage.GRAMMAR_MODEL__TERMINALS);
		}
		return terminals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<Rule>(Rule.class, this, GrammarPackage.GRAMMAR_MODEL__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartItem() {
		return startItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartItem(String newStartItem) {
		String oldStartItem = startItem;
		startItem = newStartItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarPackage.GRAMMAR_MODEL__START_ITEM, oldStartItem, startItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GrammarModel> getImport() {
		if (import_ == null) {
			import_ = new EObjectResolvingEList<GrammarModel>(GrammarModel.class, this, GrammarPackage.GRAMMAR_MODEL__IMPORT);
		}
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrammarPackage.GRAMMAR_MODEL__TERMINALS:
				return ((InternalEList<?>)getTerminals()).basicRemove(otherEnd, msgs);
			case GrammarPackage.GRAMMAR_MODEL__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
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
			case GrammarPackage.GRAMMAR_MODEL__TERMINALS:
				return getTerminals();
			case GrammarPackage.GRAMMAR_MODEL__RULES:
				return getRules();
			case GrammarPackage.GRAMMAR_MODEL__START_ITEM:
				return getStartItem();
			case GrammarPackage.GRAMMAR_MODEL__IMPORT:
				return getImport();
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
			case GrammarPackage.GRAMMAR_MODEL__TERMINALS:
				getTerminals().clear();
				getTerminals().addAll((Collection<? extends Terminal>)newValue);
				return;
			case GrammarPackage.GRAMMAR_MODEL__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends Rule>)newValue);
				return;
			case GrammarPackage.GRAMMAR_MODEL__START_ITEM:
				setStartItem((String)newValue);
				return;
			case GrammarPackage.GRAMMAR_MODEL__IMPORT:
				getImport().clear();
				getImport().addAll((Collection<? extends GrammarModel>)newValue);
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
			case GrammarPackage.GRAMMAR_MODEL__TERMINALS:
				getTerminals().clear();
				return;
			case GrammarPackage.GRAMMAR_MODEL__RULES:
				getRules().clear();
				return;
			case GrammarPackage.GRAMMAR_MODEL__START_ITEM:
				setStartItem(START_ITEM_EDEFAULT);
				return;
			case GrammarPackage.GRAMMAR_MODEL__IMPORT:
				getImport().clear();
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
			case GrammarPackage.GRAMMAR_MODEL__TERMINALS:
				return terminals != null && !terminals.isEmpty();
			case GrammarPackage.GRAMMAR_MODEL__RULES:
				return rules != null && !rules.isEmpty();
			case GrammarPackage.GRAMMAR_MODEL__START_ITEM:
				return START_ITEM_EDEFAULT == null ? startItem != null : !START_ITEM_EDEFAULT.equals(startItem);
			case GrammarPackage.GRAMMAR_MODEL__IMPORT:
				return import_ != null && !import_.isEmpty();
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
		result.append(" (startItem: ");
		result.append(startItem);
		result.append(')');
		return result.toString();
	}

} //GrammarModelImpl
