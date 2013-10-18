/**
 */
package hu.textualmodeler.grammar.scope;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chained Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.textualmodeler.grammar.scope.ChainedScope#getSubScopes <em>Sub Scopes</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.textualmodeler.grammar.scope.ScopePackage#getChainedScope()
 * @model
 * @generated
 */
public interface ChainedScope extends Scope {
	/**
	 * Returns the value of the '<em><b>Sub Scopes</b></em>' containment reference list.
	 * The list contents are of type {@link hu.textualmodeler.grammar.scope.Scope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Scopes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Scopes</em>' containment reference list.
	 * @see hu.textualmodeler.grammar.scope.ScopePackage#getChainedScope_SubScopes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Scope> getSubScopes();

} // ChainedScope
