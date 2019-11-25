/**
 */
package mderl.impl;

import mderl.Agent;
import mderl.MderlPackage;
import mderl.Model;
import mderl.RobotComponent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mderl.impl.AgentImpl#getRobotcomponent <em>Robotcomponent</em>}</li>
 *   <li>{@link mderl.impl.AgentImpl#getModel <em>Model</em>}</li>
 *   <li>{@link mderl.impl.AgentImpl#getDim_obs <em>Dim obs</em>}</li>
 *   <li>{@link mderl.impl.AgentImpl#getDim_act <em>Dim act</em>}</li>
 *   <li>{@link mderl.impl.AgentImpl#getMin_act_value <em>Min act value</em>}</li>
 *   <li>{@link mderl.impl.AgentImpl#getMax_act_value <em>Max act value</em>}</li>
 *   <li>{@link mderl.impl.AgentImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgentImpl extends MinimalEObjectImpl.Container implements Agent {
	/**
	 * The cached value of the '{@link #getRobotcomponent() <em>Robotcomponent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRobotcomponent()
	 * @generated
	 * @ordered
	 */
	protected RobotComponent robotcomponent;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected Model model;

	/**
	 * The default value of the '{@link #getDim_obs() <em>Dim obs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDim_obs()
	 * @generated
	 * @ordered
	 */
	protected static final int DIM_OBS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDim_obs() <em>Dim obs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDim_obs()
	 * @generated
	 * @ordered
	 */
	protected int dim_obs = DIM_OBS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDim_act() <em>Dim act</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDim_act()
	 * @generated
	 * @ordered
	 */
	protected static final int DIM_ACT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDim_act() <em>Dim act</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDim_act()
	 * @generated
	 * @ordered
	 */
	protected int dim_act = DIM_ACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMin_act_value() <em>Min act value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_act_value()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_ACT_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMin_act_value() <em>Min act value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin_act_value()
	 * @generated
	 * @ordered
	 */
	protected float min_act_value = MIN_ACT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax_act_value() <em>Max act value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_act_value()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_ACT_VALUE_EDEFAULT = 100.0F;

	/**
	 * The cached value of the '{@link #getMax_act_value() <em>Max act value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_act_value()
	 * @generated
	 * @ordered
	 */
	protected float max_act_value = MAX_ACT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MderlPackage.Literals.AGENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RobotComponent getRobotcomponent() {
		return robotcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRobotcomponent(RobotComponent newRobotcomponent, NotificationChain msgs) {
		RobotComponent oldRobotcomponent = robotcomponent;
		robotcomponent = newRobotcomponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MderlPackage.AGENT__ROBOTCOMPONENT, oldRobotcomponent, newRobotcomponent);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRobotcomponent(RobotComponent newRobotcomponent) {
		if (newRobotcomponent != robotcomponent) {
			NotificationChain msgs = null;
			if (robotcomponent != null)
				msgs = ((InternalEObject) robotcomponent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MderlPackage.AGENT__ROBOTCOMPONENT, null, msgs);
			if (newRobotcomponent != null)
				msgs = ((InternalEObject) newRobotcomponent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MderlPackage.AGENT__ROBOTCOMPONENT, null, msgs);
			msgs = basicSetRobotcomponent(newRobotcomponent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MderlPackage.AGENT__ROBOTCOMPONENT, newRobotcomponent,
					newRobotcomponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(Model newModel, NotificationChain msgs) {
		Model oldModel = model;
		model = newModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MderlPackage.AGENT__MODEL,
					oldModel, newModel);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModel(Model newModel) {
		if (newModel != model) {
			NotificationChain msgs = null;
			if (model != null)
				msgs = ((InternalEObject) model).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - MderlPackage.AGENT__MODEL, null, msgs);
			if (newModel != null)
				msgs = ((InternalEObject) newModel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - MderlPackage.AGENT__MODEL, null, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MderlPackage.AGENT__MODEL, newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDim_obs() {
		return dim_obs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDim_obs(int newDim_obs) {
		int oldDim_obs = dim_obs;
		dim_obs = newDim_obs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MderlPackage.AGENT__DIM_OBS, oldDim_obs, dim_obs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDim_act() {
		return dim_act;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDim_act(int newDim_act) {
		int oldDim_act = dim_act;
		dim_act = newDim_act;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MderlPackage.AGENT__DIM_ACT, oldDim_act, dim_act));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getMin_act_value() {
		return min_act_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMin_act_value(float newMin_act_value) {
		float oldMin_act_value = min_act_value;
		min_act_value = newMin_act_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MderlPackage.AGENT__MIN_ACT_VALUE, oldMin_act_value,
					min_act_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getMax_act_value() {
		return max_act_value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMax_act_value(float newMax_act_value) {
		float oldMax_act_value = max_act_value;
		max_act_value = newMax_act_value;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MderlPackage.AGENT__MAX_ACT_VALUE, oldMax_act_value,
					max_act_value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MderlPackage.AGENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MderlPackage.AGENT__ROBOTCOMPONENT:
			return basicSetRobotcomponent(null, msgs);
		case MderlPackage.AGENT__MODEL:
			return basicSetModel(null, msgs);
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
		case MderlPackage.AGENT__ROBOTCOMPONENT:
			return getRobotcomponent();
		case MderlPackage.AGENT__MODEL:
			return getModel();
		case MderlPackage.AGENT__DIM_OBS:
			return getDim_obs();
		case MderlPackage.AGENT__DIM_ACT:
			return getDim_act();
		case MderlPackage.AGENT__MIN_ACT_VALUE:
			return getMin_act_value();
		case MderlPackage.AGENT__MAX_ACT_VALUE:
			return getMax_act_value();
		case MderlPackage.AGENT__ID:
			return getId();
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
		case MderlPackage.AGENT__ROBOTCOMPONENT:
			setRobotcomponent((RobotComponent) newValue);
			return;
		case MderlPackage.AGENT__MODEL:
			setModel((Model) newValue);
			return;
		case MderlPackage.AGENT__DIM_OBS:
			setDim_obs((Integer) newValue);
			return;
		case MderlPackage.AGENT__DIM_ACT:
			setDim_act((Integer) newValue);
			return;
		case MderlPackage.AGENT__MIN_ACT_VALUE:
			setMin_act_value((Float) newValue);
			return;
		case MderlPackage.AGENT__MAX_ACT_VALUE:
			setMax_act_value((Float) newValue);
			return;
		case MderlPackage.AGENT__ID:
			setId((Integer) newValue);
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
		case MderlPackage.AGENT__ROBOTCOMPONENT:
			setRobotcomponent((RobotComponent) null);
			return;
		case MderlPackage.AGENT__MODEL:
			setModel((Model) null);
			return;
		case MderlPackage.AGENT__DIM_OBS:
			setDim_obs(DIM_OBS_EDEFAULT);
			return;
		case MderlPackage.AGENT__DIM_ACT:
			setDim_act(DIM_ACT_EDEFAULT);
			return;
		case MderlPackage.AGENT__MIN_ACT_VALUE:
			setMin_act_value(MIN_ACT_VALUE_EDEFAULT);
			return;
		case MderlPackage.AGENT__MAX_ACT_VALUE:
			setMax_act_value(MAX_ACT_VALUE_EDEFAULT);
			return;
		case MderlPackage.AGENT__ID:
			setId(ID_EDEFAULT);
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
		case MderlPackage.AGENT__ROBOTCOMPONENT:
			return robotcomponent != null;
		case MderlPackage.AGENT__MODEL:
			return model != null;
		case MderlPackage.AGENT__DIM_OBS:
			return dim_obs != DIM_OBS_EDEFAULT;
		case MderlPackage.AGENT__DIM_ACT:
			return dim_act != DIM_ACT_EDEFAULT;
		case MderlPackage.AGENT__MIN_ACT_VALUE:
			return min_act_value != MIN_ACT_VALUE_EDEFAULT;
		case MderlPackage.AGENT__MAX_ACT_VALUE:
			return max_act_value != MAX_ACT_VALUE_EDEFAULT;
		case MderlPackage.AGENT__ID:
			return id != ID_EDEFAULT;
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
		result.append(" (dim_obs: ");
		result.append(dim_obs);
		result.append(", dim_act: ");
		result.append(dim_act);
		result.append(", min_act_value: ");
		result.append(min_act_value);
		result.append(", max_act_value: ");
		result.append(max_act_value);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //AgentImpl
