/**
 */
package mderl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wheeled Robot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mderl.WheeledRobot#getWheel_name <em>Wheel name</em>}</li>
 * </ul>
 *
 * @see mderl.MderlPackage#getWheeledRobot()
 * @model abstract="true"
 * @generated
 */
public interface WheeledRobot extends Mobile {
	/**
	 * Returns the value of the '<em><b>Wheel name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wheel name</em>' attribute.
	 * @see #setWheel_name(String)
	 * @see mderl.MderlPackage#getWheeledRobot_Wheel_name()
	 * @model
	 * @generated
	 */
	String getWheel_name();

	/**
	 * Sets the value of the '{@link mderl.WheeledRobot#getWheel_name <em>Wheel name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wheel name</em>' attribute.
	 * @see #getWheel_name()
	 * @generated
	 */
	void setWheel_name(String value);

} // WheeledRobot
