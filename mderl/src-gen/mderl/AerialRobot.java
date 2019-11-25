/**
 */
package mderl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aerial Robot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mderl.AerialRobot#getPropeller_name <em>Propeller name</em>}</li>
 * </ul>
 *
 * @see mderl.MderlPackage#getAerialRobot()
 * @model abstract="true"
 * @generated
 */
public interface AerialRobot extends Mobile {
	/**
	 * Returns the value of the '<em><b>Propeller name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propeller name</em>' attribute.
	 * @see #setPropeller_name(String)
	 * @see mderl.MderlPackage#getAerialRobot_Propeller_name()
	 * @model
	 * @generated
	 */
	String getPropeller_name();

	/**
	 * Sets the value of the '{@link mderl.AerialRobot#getPropeller_name <em>Propeller name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Propeller name</em>' attribute.
	 * @see #getPropeller_name()
	 * @generated
	 */
	void setPropeller_name(String value);

} // AerialRobot
