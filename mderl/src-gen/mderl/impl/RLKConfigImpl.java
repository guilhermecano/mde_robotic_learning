/**
 */
package mderl.impl;

import java.util.Collection;

import mderl.MderlPackage;
import mderl.RLKConfig;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RLK Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mderl.impl.RLKConfigImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link mderl.impl.RLKConfigImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link mderl.impl.RLKConfigImpl#getLayer_size <em>Layer size</em>}</li>
 *   <li>{@link mderl.impl.RLKConfigImpl#getReplay_buffer_size <em>Replay buffer size</em>}</li>
 *   <li>{@link mderl.impl.RLKConfigImpl#getNum_epochs <em>Num epochs</em>}</li>
 *   <li>{@link mderl.impl.RLKConfigImpl#getNum_eval_steps <em>Num eval steps</em>}</li>
 *   <li>{@link mderl.impl.RLKConfigImpl#getNum_trains <em>Num trains</em>}</li>
 *   <li>{@link mderl.impl.RLKConfigImpl#getNum_expl_steps <em>Num expl steps</em>}</li>
 *   <li>{@link mderl.impl.RLKConfigImpl#getMin_num_steps <em>Min num steps</em>}</li>
 *   <li>{@link mderl.impl.RLKConfigImpl#getMax_path_length <em>Max path length</em>}</li>
 *   <li>{@link mderl.impl.RLKConfigImpl#getDiscount <em>Discount</em>}</li>
 *   <li>{@link mderl.impl.RLKConfigImpl#getSoft_target_tau <em>Soft target tau</em>}</li>
 *   <li>{@link mderl.impl.RLKConfigImpl#getTarget_update_period <em>Target update period</em>}</li>
 *   <li>{@link mderl.impl.RLKConfigImpl#getPolicy_lr <em>Policy lr</em>}</li>
 *   <li>{@link mderl.impl.RLKConfigImpl#getQf_lr <em>Qf lr</em>}</li>
 *   <li>{@link mderl.impl.RLKConfigImpl#getReward_scale <em>Reward scale</em>}</li>
 *   <li>{@link mderl.impl.RLKConfigImpl#isAuto_entropy_tuning <em>Auto entropy tuning</em>}</li>
 *   <li>{@link mderl.impl.RLKConfigImpl#getBatch_size <em>Batch size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RLKConfigImpl extends ConfigImpl implements RLKConfig {
	/**
	 * The default value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGORITHM_EDEFAULT = "SAC";

	/**
	 * The cached value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String algorithm = ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = "normal";

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLayer_size() <em>Layer size</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayer_size()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> layer_size;

	/**
	 * The default value of the '{@link #getReplay_buffer_size() <em>Replay buffer size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplay_buffer_size()
	 * @generated
	 * @ordered
	 */
	protected static final int REPLAY_BUFFER_SIZE_EDEFAULT = 1000000;

	/**
	 * The cached value of the '{@link #getReplay_buffer_size() <em>Replay buffer size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplay_buffer_size()
	 * @generated
	 * @ordered
	 */
	protected int replay_buffer_size = REPLAY_BUFFER_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNum_epochs() <em>Num epochs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_epochs()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_EPOCHS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNum_epochs() <em>Num epochs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_epochs()
	 * @generated
	 * @ordered
	 */
	protected int num_epochs = NUM_EPOCHS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNum_eval_steps() <em>Num eval steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_eval_steps()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_EVAL_STEPS_EDEFAULT = 1000;

	/**
	 * The cached value of the '{@link #getNum_eval_steps() <em>Num eval steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_eval_steps()
	 * @generated
	 * @ordered
	 */
	protected int num_eval_steps = NUM_EVAL_STEPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNum_trains() <em>Num trains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_trains()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_TRAINS_EDEFAULT = 1000;

	/**
	 * The cached value of the '{@link #getNum_trains() <em>Num trains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_trains()
	 * @generated
	 * @ordered
	 */
	protected int num_trains = NUM_TRAINS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNum_expl_steps() <em>Num expl steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_expl_steps()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_EXPL_STEPS_EDEFAULT = 1000;

	/**
	 * The cached value of the '{@link #getNum_expl_steps() <em>Num expl steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_expl_steps()
	 * @generated
	 * @ordered
	 */
	protected int num_expl_steps = NUM_EXPL_STEPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin_num_steps() <em>Min num steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_num_steps()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_NUM_STEPS_EDEFAULT = 1000;

	/**
	 * The cached value of the '{@link #getMin_num_steps() <em>Min num steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_num_steps()
	 * @generated
	 * @ordered
	 */
	protected int min_num_steps = MIN_NUM_STEPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax_path_length() <em>Max path length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_path_length()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_PATH_LENGTH_EDEFAULT = 1000;

	/**
	 * The cached value of the '{@link #getMax_path_length() <em>Max path length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_path_length()
	 * @generated
	 * @ordered
	 */
	protected int max_path_length = MAX_PATH_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiscount() <em>Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscount()
	 * @generated
	 * @ordered
	 */
	protected static final float DISCOUNT_EDEFAULT = 0.99F;

	/**
	 * The cached value of the '{@link #getDiscount() <em>Discount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscount()
	 * @generated
	 * @ordered
	 */
	protected float discount = DISCOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSoft_target_tau() <em>Soft target tau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoft_target_tau()
	 * @generated
	 * @ordered
	 */
	protected static final float SOFT_TARGET_TAU_EDEFAULT = 0.005F;

	/**
	 * The cached value of the '{@link #getSoft_target_tau() <em>Soft target tau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoft_target_tau()
	 * @generated
	 * @ordered
	 */
	protected float soft_target_tau = SOFT_TARGET_TAU_EDEFAULT;

	/**
	 * The default value of the '{@link #getTarget_update_period() <em>Target update period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget_update_period()
	 * @generated
	 * @ordered
	 */
	protected static final int TARGET_UPDATE_PERIOD_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTarget_update_period() <em>Target update period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget_update_period()
	 * @generated
	 * @ordered
	 */
	protected int target_update_period = TARGET_UPDATE_PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPolicy_lr() <em>Policy lr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicy_lr()
	 * @generated
	 * @ordered
	 */
	protected static final float POLICY_LR_EDEFAULT = 3.0E-4F;

	/**
	 * The cached value of the '{@link #getPolicy_lr() <em>Policy lr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicy_lr()
	 * @generated
	 * @ordered
	 */
	protected float policy_lr = POLICY_LR_EDEFAULT;

	/**
	 * The default value of the '{@link #getQf_lr() <em>Qf lr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQf_lr()
	 * @generated
	 * @ordered
	 */
	protected static final float QF_LR_EDEFAULT = 3.0E-4F;

	/**
	 * The cached value of the '{@link #getQf_lr() <em>Qf lr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQf_lr()
	 * @generated
	 * @ordered
	 */
	protected float qf_lr = QF_LR_EDEFAULT;

	/**
	 * The default value of the '{@link #getReward_scale() <em>Reward scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReward_scale()
	 * @generated
	 * @ordered
	 */
	protected static final int REWARD_SCALE_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getReward_scale() <em>Reward scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReward_scale()
	 * @generated
	 * @ordered
	 */
	protected int reward_scale = REWARD_SCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #isAuto_entropy_tuning() <em>Auto entropy tuning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuto_entropy_tuning()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_ENTROPY_TUNING_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAuto_entropy_tuning() <em>Auto entropy tuning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuto_entropy_tuning()
	 * @generated
	 * @ordered
	 */
	protected boolean auto_entropy_tuning = AUTO_ENTROPY_TUNING_EDEFAULT;

	/**
	 * The default value of the '{@link #getBatch_size() <em>Batch size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatch_size()
	 * @generated
	 * @ordered
	 */
	protected static final int BATCH_SIZE_EDEFAULT = 256;

	/**
	 * The cached value of the '{@link #getBatch_size() <em>Batch size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatch_size()
	 * @generated
	 * @ordered
	 */
	protected int batch_size = BATCH_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RLKConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MderlPackage.Literals.RLK_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlgorithm() {
		return algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlgorithm(String newAlgorithm) {
		String oldAlgorithm = algorithm;
		algorithm = newAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MderlPackage.RLK_CONFIG__ALGORITHM, oldAlgorithm,
					algorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MderlPackage.RLK_CONFIG__VERSION, oldVersion,
					version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getLayer_size() {
		if (layer_size == null) {
			layer_size = new EDataTypeUniqueEList<Integer>(Integer.class, this, MderlPackage.RLK_CONFIG__LAYER_SIZE);
		}
		return layer_size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getReplay_buffer_size() {
		return replay_buffer_size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplay_buffer_size(int newReplay_buffer_size) {
		int oldReplay_buffer_size = replay_buffer_size;
		replay_buffer_size = newReplay_buffer_size;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MderlPackage.RLK_CONFIG__REPLAY_BUFFER_SIZE,
					oldReplay_buffer_size, replay_buffer_size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNum_epochs() {
		return num_epochs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNum_epochs(int newNum_epochs) {
		int oldNum_epochs = num_epochs;
		num_epochs = newNum_epochs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MderlPackage.RLK_CONFIG__NUM_EPOCHS, oldNum_epochs,
					num_epochs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNum_eval_steps() {
		return num_eval_steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNum_eval_steps(int newNum_eval_steps) {
		int oldNum_eval_steps = num_eval_steps;
		num_eval_steps = newNum_eval_steps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MderlPackage.RLK_CONFIG__NUM_EVAL_STEPS,
					oldNum_eval_steps, num_eval_steps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNum_trains() {
		return num_trains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNum_trains(int newNum_trains) {
		int oldNum_trains = num_trains;
		num_trains = newNum_trains;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MderlPackage.RLK_CONFIG__NUM_TRAINS, oldNum_trains,
					num_trains));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNum_expl_steps() {
		return num_expl_steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNum_expl_steps(int newNum_expl_steps) {
		int oldNum_expl_steps = num_expl_steps;
		num_expl_steps = newNum_expl_steps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MderlPackage.RLK_CONFIG__NUM_EXPL_STEPS,
					oldNum_expl_steps, num_expl_steps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMin_num_steps() {
		return min_num_steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMin_num_steps(int newMin_num_steps) {
		int oldMin_num_steps = min_num_steps;
		min_num_steps = newMin_num_steps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MderlPackage.RLK_CONFIG__MIN_NUM_STEPS,
					oldMin_num_steps, min_num_steps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMax_path_length() {
		return max_path_length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMax_path_length(int newMax_path_length) {
		int oldMax_path_length = max_path_length;
		max_path_length = newMax_path_length;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MderlPackage.RLK_CONFIG__MAX_PATH_LENGTH,
					oldMax_path_length, max_path_length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getDiscount() {
		return discount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiscount(float newDiscount) {
		float oldDiscount = discount;
		discount = newDiscount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MderlPackage.RLK_CONFIG__DISCOUNT, oldDiscount,
					discount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getSoft_target_tau() {
		return soft_target_tau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoft_target_tau(float newSoft_target_tau) {
		float oldSoft_target_tau = soft_target_tau;
		soft_target_tau = newSoft_target_tau;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MderlPackage.RLK_CONFIG__SOFT_TARGET_TAU,
					oldSoft_target_tau, soft_target_tau));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTarget_update_period() {
		return target_update_period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget_update_period(int newTarget_update_period) {
		int oldTarget_update_period = target_update_period;
		target_update_period = newTarget_update_period;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MderlPackage.RLK_CONFIG__TARGET_UPDATE_PERIOD,
					oldTarget_update_period, target_update_period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getPolicy_lr() {
		return policy_lr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPolicy_lr(float newPolicy_lr) {
		float oldPolicy_lr = policy_lr;
		policy_lr = newPolicy_lr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MderlPackage.RLK_CONFIG__POLICY_LR, oldPolicy_lr,
					policy_lr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getQf_lr() {
		return qf_lr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQf_lr(float newQf_lr) {
		float oldQf_lr = qf_lr;
		qf_lr = newQf_lr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MderlPackage.RLK_CONFIG__QF_LR, oldQf_lr, qf_lr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getReward_scale() {
		return reward_scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReward_scale(int newReward_scale) {
		int oldReward_scale = reward_scale;
		reward_scale = newReward_scale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MderlPackage.RLK_CONFIG__REWARD_SCALE,
					oldReward_scale, reward_scale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAuto_entropy_tuning() {
		return auto_entropy_tuning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuto_entropy_tuning(boolean newAuto_entropy_tuning) {
		boolean oldAuto_entropy_tuning = auto_entropy_tuning;
		auto_entropy_tuning = newAuto_entropy_tuning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MderlPackage.RLK_CONFIG__AUTO_ENTROPY_TUNING,
					oldAuto_entropy_tuning, auto_entropy_tuning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getBatch_size() {
		return batch_size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBatch_size(int newBatch_size) {
		int oldBatch_size = batch_size;
		batch_size = newBatch_size;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MderlPackage.RLK_CONFIG__BATCH_SIZE, oldBatch_size,
					batch_size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MderlPackage.RLK_CONFIG__ALGORITHM:
			return getAlgorithm();
		case MderlPackage.RLK_CONFIG__VERSION:
			return getVersion();
		case MderlPackage.RLK_CONFIG__LAYER_SIZE:
			return getLayer_size();
		case MderlPackage.RLK_CONFIG__REPLAY_BUFFER_SIZE:
			return getReplay_buffer_size();
		case MderlPackage.RLK_CONFIG__NUM_EPOCHS:
			return getNum_epochs();
		case MderlPackage.RLK_CONFIG__NUM_EVAL_STEPS:
			return getNum_eval_steps();
		case MderlPackage.RLK_CONFIG__NUM_TRAINS:
			return getNum_trains();
		case MderlPackage.RLK_CONFIG__NUM_EXPL_STEPS:
			return getNum_expl_steps();
		case MderlPackage.RLK_CONFIG__MIN_NUM_STEPS:
			return getMin_num_steps();
		case MderlPackage.RLK_CONFIG__MAX_PATH_LENGTH:
			return getMax_path_length();
		case MderlPackage.RLK_CONFIG__DISCOUNT:
			return getDiscount();
		case MderlPackage.RLK_CONFIG__SOFT_TARGET_TAU:
			return getSoft_target_tau();
		case MderlPackage.RLK_CONFIG__TARGET_UPDATE_PERIOD:
			return getTarget_update_period();
		case MderlPackage.RLK_CONFIG__POLICY_LR:
			return getPolicy_lr();
		case MderlPackage.RLK_CONFIG__QF_LR:
			return getQf_lr();
		case MderlPackage.RLK_CONFIG__REWARD_SCALE:
			return getReward_scale();
		case MderlPackage.RLK_CONFIG__AUTO_ENTROPY_TUNING:
			return isAuto_entropy_tuning();
		case MderlPackage.RLK_CONFIG__BATCH_SIZE:
			return getBatch_size();
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
		case MderlPackage.RLK_CONFIG__ALGORITHM:
			setAlgorithm((String) newValue);
			return;
		case MderlPackage.RLK_CONFIG__VERSION:
			setVersion((String) newValue);
			return;
		case MderlPackage.RLK_CONFIG__LAYER_SIZE:
			getLayer_size().clear();
			getLayer_size().addAll((Collection<? extends Integer>) newValue);
			return;
		case MderlPackage.RLK_CONFIG__REPLAY_BUFFER_SIZE:
			setReplay_buffer_size((Integer) newValue);
			return;
		case MderlPackage.RLK_CONFIG__NUM_EPOCHS:
			setNum_epochs((Integer) newValue);
			return;
		case MderlPackage.RLK_CONFIG__NUM_EVAL_STEPS:
			setNum_eval_steps((Integer) newValue);
			return;
		case MderlPackage.RLK_CONFIG__NUM_TRAINS:
			setNum_trains((Integer) newValue);
			return;
		case MderlPackage.RLK_CONFIG__NUM_EXPL_STEPS:
			setNum_expl_steps((Integer) newValue);
			return;
		case MderlPackage.RLK_CONFIG__MIN_NUM_STEPS:
			setMin_num_steps((Integer) newValue);
			return;
		case MderlPackage.RLK_CONFIG__MAX_PATH_LENGTH:
			setMax_path_length((Integer) newValue);
			return;
		case MderlPackage.RLK_CONFIG__DISCOUNT:
			setDiscount((Float) newValue);
			return;
		case MderlPackage.RLK_CONFIG__SOFT_TARGET_TAU:
			setSoft_target_tau((Float) newValue);
			return;
		case MderlPackage.RLK_CONFIG__TARGET_UPDATE_PERIOD:
			setTarget_update_period((Integer) newValue);
			return;
		case MderlPackage.RLK_CONFIG__POLICY_LR:
			setPolicy_lr((Float) newValue);
			return;
		case MderlPackage.RLK_CONFIG__QF_LR:
			setQf_lr((Float) newValue);
			return;
		case MderlPackage.RLK_CONFIG__REWARD_SCALE:
			setReward_scale((Integer) newValue);
			return;
		case MderlPackage.RLK_CONFIG__AUTO_ENTROPY_TUNING:
			setAuto_entropy_tuning((Boolean) newValue);
			return;
		case MderlPackage.RLK_CONFIG__BATCH_SIZE:
			setBatch_size((Integer) newValue);
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
		case MderlPackage.RLK_CONFIG__ALGORITHM:
			setAlgorithm(ALGORITHM_EDEFAULT);
			return;
		case MderlPackage.RLK_CONFIG__VERSION:
			setVersion(VERSION_EDEFAULT);
			return;
		case MderlPackage.RLK_CONFIG__LAYER_SIZE:
			getLayer_size().clear();
			return;
		case MderlPackage.RLK_CONFIG__REPLAY_BUFFER_SIZE:
			setReplay_buffer_size(REPLAY_BUFFER_SIZE_EDEFAULT);
			return;
		case MderlPackage.RLK_CONFIG__NUM_EPOCHS:
			setNum_epochs(NUM_EPOCHS_EDEFAULT);
			return;
		case MderlPackage.RLK_CONFIG__NUM_EVAL_STEPS:
			setNum_eval_steps(NUM_EVAL_STEPS_EDEFAULT);
			return;
		case MderlPackage.RLK_CONFIG__NUM_TRAINS:
			setNum_trains(NUM_TRAINS_EDEFAULT);
			return;
		case MderlPackage.RLK_CONFIG__NUM_EXPL_STEPS:
			setNum_expl_steps(NUM_EXPL_STEPS_EDEFAULT);
			return;
		case MderlPackage.RLK_CONFIG__MIN_NUM_STEPS:
			setMin_num_steps(MIN_NUM_STEPS_EDEFAULT);
			return;
		case MderlPackage.RLK_CONFIG__MAX_PATH_LENGTH:
			setMax_path_length(MAX_PATH_LENGTH_EDEFAULT);
			return;
		case MderlPackage.RLK_CONFIG__DISCOUNT:
			setDiscount(DISCOUNT_EDEFAULT);
			return;
		case MderlPackage.RLK_CONFIG__SOFT_TARGET_TAU:
			setSoft_target_tau(SOFT_TARGET_TAU_EDEFAULT);
			return;
		case MderlPackage.RLK_CONFIG__TARGET_UPDATE_PERIOD:
			setTarget_update_period(TARGET_UPDATE_PERIOD_EDEFAULT);
			return;
		case MderlPackage.RLK_CONFIG__POLICY_LR:
			setPolicy_lr(POLICY_LR_EDEFAULT);
			return;
		case MderlPackage.RLK_CONFIG__QF_LR:
			setQf_lr(QF_LR_EDEFAULT);
			return;
		case MderlPackage.RLK_CONFIG__REWARD_SCALE:
			setReward_scale(REWARD_SCALE_EDEFAULT);
			return;
		case MderlPackage.RLK_CONFIG__AUTO_ENTROPY_TUNING:
			setAuto_entropy_tuning(AUTO_ENTROPY_TUNING_EDEFAULT);
			return;
		case MderlPackage.RLK_CONFIG__BATCH_SIZE:
			setBatch_size(BATCH_SIZE_EDEFAULT);
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
		case MderlPackage.RLK_CONFIG__ALGORITHM:
			return ALGORITHM_EDEFAULT == null ? algorithm != null : !ALGORITHM_EDEFAULT.equals(algorithm);
		case MderlPackage.RLK_CONFIG__VERSION:
			return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
		case MderlPackage.RLK_CONFIG__LAYER_SIZE:
			return layer_size != null && !layer_size.isEmpty();
		case MderlPackage.RLK_CONFIG__REPLAY_BUFFER_SIZE:
			return replay_buffer_size != REPLAY_BUFFER_SIZE_EDEFAULT;
		case MderlPackage.RLK_CONFIG__NUM_EPOCHS:
			return num_epochs != NUM_EPOCHS_EDEFAULT;
		case MderlPackage.RLK_CONFIG__NUM_EVAL_STEPS:
			return num_eval_steps != NUM_EVAL_STEPS_EDEFAULT;
		case MderlPackage.RLK_CONFIG__NUM_TRAINS:
			return num_trains != NUM_TRAINS_EDEFAULT;
		case MderlPackage.RLK_CONFIG__NUM_EXPL_STEPS:
			return num_expl_steps != NUM_EXPL_STEPS_EDEFAULT;
		case MderlPackage.RLK_CONFIG__MIN_NUM_STEPS:
			return min_num_steps != MIN_NUM_STEPS_EDEFAULT;
		case MderlPackage.RLK_CONFIG__MAX_PATH_LENGTH:
			return max_path_length != MAX_PATH_LENGTH_EDEFAULT;
		case MderlPackage.RLK_CONFIG__DISCOUNT:
			return discount != DISCOUNT_EDEFAULT;
		case MderlPackage.RLK_CONFIG__SOFT_TARGET_TAU:
			return soft_target_tau != SOFT_TARGET_TAU_EDEFAULT;
		case MderlPackage.RLK_CONFIG__TARGET_UPDATE_PERIOD:
			return target_update_period != TARGET_UPDATE_PERIOD_EDEFAULT;
		case MderlPackage.RLK_CONFIG__POLICY_LR:
			return policy_lr != POLICY_LR_EDEFAULT;
		case MderlPackage.RLK_CONFIG__QF_LR:
			return qf_lr != QF_LR_EDEFAULT;
		case MderlPackage.RLK_CONFIG__REWARD_SCALE:
			return reward_scale != REWARD_SCALE_EDEFAULT;
		case MderlPackage.RLK_CONFIG__AUTO_ENTROPY_TUNING:
			return auto_entropy_tuning != AUTO_ENTROPY_TUNING_EDEFAULT;
		case MderlPackage.RLK_CONFIG__BATCH_SIZE:
			return batch_size != BATCH_SIZE_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (algorithm: ");
		result.append(algorithm);
		result.append(", version: ");
		result.append(version);
		result.append(", layer_size: ");
		result.append(layer_size);
		result.append(", replay_buffer_size: ");
		result.append(replay_buffer_size);
		result.append(", num_epochs: ");
		result.append(num_epochs);
		result.append(", num_eval_steps: ");
		result.append(num_eval_steps);
		result.append(", num_trains: ");
		result.append(num_trains);
		result.append(", num_expl_steps: ");
		result.append(num_expl_steps);
		result.append(", min_num_steps: ");
		result.append(min_num_steps);
		result.append(", max_path_length: ");
		result.append(max_path_length);
		result.append(", discount: ");
		result.append(discount);
		result.append(", soft_target_tau: ");
		result.append(soft_target_tau);
		result.append(", target_update_period: ");
		result.append(target_update_period);
		result.append(", policy_lr: ");
		result.append(policy_lr);
		result.append(", qf_lr: ");
		result.append(qf_lr);
		result.append(", reward_scale: ");
		result.append(reward_scale);
		result.append(", auto_entropy_tuning: ");
		result.append(auto_entropy_tuning);
		result.append(", batch_size: ");
		result.append(batch_size);
		result.append(')');
		return result.toString();
	}

} //RLKConfigImpl
