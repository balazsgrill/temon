/**
 */
package hu.textualmodeler.ast;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visible Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.textualmodeler.ast.VisibleNode#getStart <em>Start</em>}</li>
 *   <li>{@link hu.textualmodeler.ast.VisibleNode#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.textualmodeler.ast.AstPackage#getVisibleNode()
 * @model abstract="true"
 * @generated
 */
public interface VisibleNode extends Node {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(int)
	 * @see hu.textualmodeler.ast.AstPackage#getVisibleNode_Start()
	 * @model required="true"
	 * @generated
	 */
	int getStart();

	/**
	 * Sets the value of the '{@link hu.textualmodeler.ast.VisibleNode#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(int value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see hu.textualmodeler.ast.AstPackage#getVisibleNode_Length()
	 * @model required="true"
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link hu.textualmodeler.ast.VisibleNode#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

} // VisibleNode
