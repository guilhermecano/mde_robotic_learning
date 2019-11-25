/**
 */
package mderl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robot Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mderl.RobotComponent#getJoint_names <em>Joint names</em>}</li>
 * </ul>
 *
 * @see mderl.MderlPackage#getRobotComponent()
 * @model abstract="true"
 * @generated
 */
public interface RobotComponent extends Element {
	/**
	 * Returns the value of the '<em><b>Joint names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joint names</em>' attribute.
	 * @see #setJoint_names(String)
	 * @see mderl.MderlPackage#getRobotComponent_Joint_names()
	 * @model
	 * @generated
	 */
	String getJoint_names();

	/**
	 * Sets the value of the '{@link mderl.RobotComponent#getJoint_names <em>Joint names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Joint names</em>' attribute.
	 * @see #getJoint_names()
	 * @generated
	 */
	void setJoint_names(String value);

} // RobotComponent
