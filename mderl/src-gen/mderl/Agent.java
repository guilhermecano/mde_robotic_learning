/**
 */
package mderl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mderl.Agent#getRobotcomponent <em>Robotcomponent</em>}</li>
 *   <li>{@link mderl.Agent#getModel <em>Model</em>}</li>
 *   <li>{@link mderl.Agent#getDim_obs <em>Dim obs</em>}</li>
 *   <li>{@link mderl.Agent#getDim_act <em>Dim act</em>}</li>
 *   <li>{@link mderl.Agent#getMin_act_value <em>Min act value</em>}</li>
 *   <li>{@link mderl.Agent#getMax_act_value <em>Max act value</em>}</li>
 *   <li>{@link mderl.Agent#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see mderl.MderlPackage#getAgent()
 * @model
 * @generated
 */
public interface Agent extends EObject {
	/**
	 * Returns the value of the '<em><b>Robotcomponent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Robotcomponent</em>' containment reference.
	 * @see #setRobotcomponent(RobotComponent)
	 * @see mderl.MderlPackage#getAgent_Robotcomponent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RobotComponent getRobotcomponent();

	/**
	 * Sets the value of the '{@link mderl.Agent#getRobotcomponent <em>Robotcomponent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Robotcomponent</em>' containment reference.
	 * @see #getRobotcomponent()
	 * @generated
	 */
	void setRobotcomponent(RobotComponent value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' containment reference.
	 * @see #setModel(Model)
	 * @see mderl.MderlPackage#getAgent_Model()
	 * @model containment="true"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link mderl.Agent#getModel <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' containment reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

	/**
	 * Returns the value of the '<em><b>Dim obs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dim obs</em>' attribute.
	 * @see #setDim_obs(int)
	 * @see mderl.MderlPackage#getAgent_Dim_obs()
	 * @model
	 * @generated
	 */
	int getDim_obs();

	/**
	 * Sets the value of the '{@link mderl.Agent#getDim_obs <em>Dim obs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dim obs</em>' attribute.
	 * @see #getDim_obs()
	 * @generated
	 */
	void setDim_obs(int value);

	/**
	 * Returns the value of the '<em><b>Dim act</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dim act</em>' attribute.
	 * @see #setDim_act(int)
	 * @see mderl.MderlPackage#getAgent_Dim_act()
	 * @model
	 * @generated
	 */
	int getDim_act();

	/**
	 * Sets the value of the '{@link mderl.Agent#getDim_act <em>Dim act</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dim act</em>' attribute.
	 * @see #getDim_act()
	 * @generated
	 */
	void setDim_act(int value);

	/**
	 * Returns the value of the '<em><b>Min act value</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min act value</em>' attribute.
	 * @see #setMin_act_value(float)
	 * @see mderl.MderlPackage#getAgent_Min_act_value()
	 * @model default="0.0"
	 * @generated
	 */
	float getMin_act_value();

	/**
	 * Sets the value of the '{@link mderl.Agent#getMin_act_value <em>Min act value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min act value</em>' attribute.
	 * @see #getMin_act_value()
	 * @generated
	 */
	void setMin_act_value(float value);

	/**
	 * Returns the value of the '<em><b>Max act value</b></em>' attribute.
	 * The default value is <code>"100.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max act value</em>' attribute.
	 * @see #setMax_act_value(float)
	 * @see mderl.MderlPackage#getAgent_Max_act_value()
	 * @model default="100.0"
	 * @generated
	 */
	float getMax_act_value();

	/**
	 * Sets the value of the '{@link mderl.Agent#getMax_act_value <em>Max act value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max act value</em>' attribute.
	 * @see #getMax_act_value()
	 * @generated
	 */
	void setMax_act_value(float value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see mderl.MderlPackage#getAgent_Id()
	 * @model default="0" id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link mderl.Agent#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // Agent
