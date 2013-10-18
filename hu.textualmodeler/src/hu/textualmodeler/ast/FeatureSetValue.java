/**
 */
package hu.textualmodeler.ast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Set Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.textualmodeler.ast.FeatureSetValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.textualmodeler.ast.AstPackage#getFeatureSetValue()
 * @model
 * @generated
 */
public interface FeatureSetValue extends Node, FeatureSet {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see hu.textualmodeler.ast.AstPackage#getFeatureSetValue_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link hu.textualmodeler.ast.FeatureSetValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // FeatureSetValue
