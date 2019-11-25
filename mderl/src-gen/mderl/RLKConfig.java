/**
 */
package mderl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RLK Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mderl.RLKConfig#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link mderl.RLKConfig#getVersion <em>Version</em>}</li>
 *   <li>{@link mderl.RLKConfig#getLayer_size <em>Layer size</em>}</li>
 *   <li>{@link mderl.RLKConfig#getReplay_buffer_size <em>Replay buffer size</em>}</li>
 *   <li>{@link mderl.RLKConfig#getNum_epochs <em>Num epochs</em>}</li>
 *   <li>{@link mderl.RLKConfig#getNum_eval_steps <em>Num eval steps</em>}</li>
 *   <li>{@link mderl.RLKConfig#getNum_trains <em>Num trains</em>}</li>
 *   <li>{@link mderl.RLKConfig#getNum_expl_steps <em>Num expl steps</em>}</li>
 *   <li>{@link mderl.RLKConfig#getMin_num_steps <em>Min num steps</em>}</li>
 *   <li>{@link mderl.RLKConfig#getMax_path_length <em>Max path length</em>}</li>
 *   <li>{@link mderl.RLKConfig#getDiscount <em>Discount</em>}</li>
 *   <li>{@link mderl.RLKConfig#getSoft_target_tau <em>Soft target tau</em>}</li>
 *   <li>{@link mderl.RLKConfig#getTarget_update_period <em>Target update period</em>}</li>
 *   <li>{@link mderl.RLKConfig#getPolicy_lr <em>Policy lr</em>}</li>
 *   <li>{@link mderl.RLKConfig#getQf_lr <em>Qf lr</em>}</li>
 *   <li>{@link mderl.RLKConfig#getReward_scale <em>Reward scale</em>}</li>
 *   <li>{@link mderl.RLKConfig#isAuto_entropy_tuning <em>Auto entropy tuning</em>}</li>
 *   <li>{@link mderl.RLKConfig#getBatch_size <em>Batch size</em>}</li>
 * </ul>
 *
 * @see mderl.MderlPackage#getRLKConfig()
 * @model
 * @generated
 */
public interface RLKConfig extends Config {
	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' attribute.
	 * The default value is <code>"SAC"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' attribute.
	 * @see #setAlgorithm(String)
	 * @see mderl.MderlPackage#getRLKConfig_Algorithm()
	 * @model default="SAC" required="true"
	 * @generated
	 */
	String getAlgorithm();

	/**
	 * Sets the value of the '{@link mderl.RLKConfig#getAlgorithm <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' attribute.
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"normal"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see mderl.MderlPackage#getRLKConfig_Version()
	 * @model default="normal" required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link mderl.RLKConfig#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Layer size</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer size</em>' attribute list.
	 * @see mderl.MderlPackage#getRLKConfig_Layer_size()
	 * @model default="64"
	 * @generated
	 */
	EList<Integer> getLayer_size();

	/**
	 * Returns the value of the '<em><b>Replay buffer size</b></em>' attribute.
	 * The default value is <code>"1000000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replay buffer size</em>' attribute.
	 * @see #setReplay_buffer_size(int)
	 * @see mderl.MderlPackage#getRLKConfig_Replay_buffer_size()
	 * @model default="1000000"
	 * @generated
	 */
	int getReplay_buffer_size();

	/**
	 * Sets the value of the '{@link mderl.RLKConfig#getReplay_buffer_size <em>Replay buffer size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replay buffer size</em>' attribute.
	 * @see #getReplay_buffer_size()
	 * @generated
	 */
	void setReplay_buffer_size(int value);

	/**
	 * Returns the value of the '<em><b>Num epochs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num epochs</em>' attribute.
	 * @see #setNum_epochs(int)
	 * @see mderl.MderlPackage#getRLKConfig_Num_epochs()
	 * @model
	 * @generated
	 */
	int getNum_epochs();

	/**
	 * Sets the value of the '{@link mderl.RLKConfig#getNum_epochs <em>Num epochs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num epochs</em>' attribute.
	 * @see #getNum_epochs()
	 * @generated
	 */
	void setNum_epochs(int value);

	/**
	 * Returns the value of the '<em><b>Num eval steps</b></em>' attribute.
	 * The default value is <code>"1000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num eval steps</em>' attribute.
	 * @see #setNum_eval_steps(int)
	 * @see mderl.MderlPackage#getRLKConfig_Num_eval_steps()
	 * @model default="1000"
	 * @generated
	 */
	int getNum_eval_steps();

	/**
	 * Sets the value of the '{@link mderl.RLKConfig#getNum_eval_steps <em>Num eval steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num eval steps</em>' attribute.
	 * @see #getNum_eval_steps()
	 * @generated
	 */
	void setNum_eval_steps(int value);

	/**
	 * Returns the value of the '<em><b>Num trains</b></em>' attribute.
	 * The default value is <code>"1000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num trains</em>' attribute.
	 * @see #setNum_trains(int)
	 * @see mderl.MderlPackage#getRLKConfig_Num_trains()
	 * @model default="1000"
	 * @generated
	 */
	int getNum_trains();

	/**
	 * Sets the value of the '{@link mderl.RLKConfig#getNum_trains <em>Num trains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num trains</em>' attribute.
	 * @see #getNum_trains()
	 * @generated
	 */
	void setNum_trains(int value);

	/**
	 * Returns the value of the '<em><b>Num expl steps</b></em>' attribute.
	 * The default value is <code>"1000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num expl steps</em>' attribute.
	 * @see #setNum_expl_steps(int)
	 * @see mderl.MderlPackage#getRLKConfig_Num_expl_steps()
	 * @model default="1000"
	 * @generated
	 */
	int getNum_expl_steps();

	/**
	 * Sets the value of the '{@link mderl.RLKConfig#getNum_expl_steps <em>Num expl steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num expl steps</em>' attribute.
	 * @see #getNum_expl_steps()
	 * @generated
	 */
	void setNum_expl_steps(int value);

	/**
	 * Returns the value of the '<em><b>Min num steps</b></em>' attribute.
	 * The default value is <code>"1000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min num steps</em>' attribute.
	 * @see #setMin_num_steps(int)
	 * @see mderl.MderlPackage#getRLKConfig_Min_num_steps()
	 * @model default="1000"
	 * @generated
	 */
	int getMin_num_steps();

	/**
	 * Sets the value of the '{@link mderl.RLKConfig#getMin_num_steps <em>Min num steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min num steps</em>' attribute.
	 * @see #getMin_num_steps()
	 * @generated
	 */
	void setMin_num_steps(int value);

	/**
	 * Returns the value of the '<em><b>Max path length</b></em>' attribute.
	 * The default value is <code>"1000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max path length</em>' attribute.
	 * @see #setMax_path_length(int)
	 * @see mderl.MderlPackage#getRLKConfig_Max_path_length()
	 * @model default="1000"
	 * @generated
	 */
	int getMax_path_length();

	/**
	 * Sets the value of the '{@link mderl.RLKConfig#getMax_path_length <em>Max path length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max path length</em>' attribute.
	 * @see #getMax_path_length()
	 * @generated
	 */
	void setMax_path_length(int value);

	/**
	 * Returns the value of the '<em><b>Discount</b></em>' attribute.
	 * The default value is <code>"0.99"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discount</em>' attribute.
	 * @see #setDiscount(float)
	 * @see mderl.MderlPackage#getRLKConfig_Discount()
	 * @model default="0.99"
	 * @generated
	 */
	float getDiscount();

	/**
	 * Sets the value of the '{@link mderl.RLKConfig#getDiscount <em>Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discount</em>' attribute.
	 * @see #getDiscount()
	 * @generated
	 */
	void setDiscount(float value);

	/**
	 * Returns the value of the '<em><b>Soft target tau</b></em>' attribute.
	 * The default value is <code>"0.005"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soft target tau</em>' attribute.
	 * @see #setSoft_target_tau(float)
	 * @see mderl.MderlPackage#getRLKConfig_Soft_target_tau()
	 * @model default="0.005"
	 * @generated
	 */
	float getSoft_target_tau();

	/**
	 * Sets the value of the '{@link mderl.RLKConfig#getSoft_target_tau <em>Soft target tau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soft target tau</em>' attribute.
	 * @see #getSoft_target_tau()
	 * @generated
	 */
	void setSoft_target_tau(float value);

	/**
	 * Returns the value of the '<em><b>Target update period</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target update period</em>' attribute.
	 * @see #setTarget_update_period(int)
	 * @see mderl.MderlPackage#getRLKConfig_Target_update_period()
	 * @model default="1"
	 * @generated
	 */
	int getTarget_update_period();

	/**
	 * Sets the value of the '{@link mderl.RLKConfig#getTarget_update_period <em>Target update period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target update period</em>' attribute.
	 * @see #getTarget_update_period()
	 * @generated
	 */
	void setTarget_update_period(int value);

	/**
	 * Returns the value of the '<em><b>Policy lr</b></em>' attribute.
	 * The default value is <code>"0.0003"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy lr</em>' attribute.
	 * @see #setPolicy_lr(float)
	 * @see mderl.MderlPackage#getRLKConfig_Policy_lr()
	 * @model default="0.0003"
	 * @generated
	 */
	float getPolicy_lr();

	/**
	 * Sets the value of the '{@link mderl.RLKConfig#getPolicy_lr <em>Policy lr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy lr</em>' attribute.
	 * @see #getPolicy_lr()
	 * @generated
	 */
	void setPolicy_lr(float value);

	/**
	 * Returns the value of the '<em><b>Qf lr</b></em>' attribute.
	 * The default value is <code>"0.0003"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qf lr</em>' attribute.
	 * @see #setQf_lr(float)
	 * @see mderl.MderlPackage#getRLKConfig_Qf_lr()
	 * @model default="0.0003"
	 * @generated
	 */
	float getQf_lr();

	/**
	 * Sets the value of the '{@link mderl.RLKConfig#getQf_lr <em>Qf lr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qf lr</em>' attribute.
	 * @see #getQf_lr()
	 * @generated
	 */
	void setQf_lr(float value);

	/**
	 * Returns the value of the '<em><b>Reward scale</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reward scale</em>' attribute.
	 * @see #setReward_scale(int)
	 * @see mderl.MderlPackage#getRLKConfig_Reward_scale()
	 * @model default="1"
	 * @generated
	 */
	int getReward_scale();

	/**
	 * Sets the value of the '{@link mderl.RLKConfig#getReward_scale <em>Reward scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reward scale</em>' attribute.
	 * @see #getReward_scale()
	 * @generated
	 */
	void setReward_scale(int value);

	/**
	 * Returns the value of the '<em><b>Auto entropy tuning</b></em>' attribute.
	 * The default value is <code>"True"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto entropy tuning</em>' attribute.
	 * @see #setAuto_entropy_tuning(boolean)
	 * @see mderl.MderlPackage#getRLKConfig_Auto_entropy_tuning()
	 * @model default="True"
	 * @generated
	 */
	boolean isAuto_entropy_tuning();

	/**
	 * Sets the value of the '{@link mderl.RLKConfig#isAuto_entropy_tuning <em>Auto entropy tuning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto entropy tuning</em>' attribute.
	 * @see #isAuto_entropy_tuning()
	 * @generated
	 */
	void setAuto_entropy_tuning(boolean value);

	/**
	 * Returns the value of the '<em><b>Batch size</b></em>' attribute.
	 * The default value is <code>"256"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Batch size</em>' attribute.
	 * @see #setBatch_size(int)
	 * @see mderl.MderlPackage#getRLKConfig_Batch_size()
	 * @model default="256" required="true"
	 * @generated
	 */
	int getBatch_size();

	/**
	 * Sets the value of the '{@link mderl.RLKConfig#getBatch_size <em>Batch size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Batch size</em>' attribute.
	 * @see #getBatch_size()
	 * @generated
	 */
	void setBatch_size(int value);

} // RLKConfig
