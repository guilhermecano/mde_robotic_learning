/**
 */
package mderl.impl;

import java.util.Collection;

import mderl.Element;
import mderl.MderlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mderl.impl.ElementImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link mderl.impl.ElementImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link mderl.impl.ElementImpl#getLinear_velocity <em>Linear velocity</em>}</li>
 *   <li>{@link mderl.impl.ElementImpl#getAngular_velocity <em>Angular velocity</em>}</li>
 *   <li>{@link mderl.impl.ElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link mderl.impl.ElementImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElementImpl extends MinimalEObjectImpl.Container implements Element {
	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected EList<Float> position;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected EList<Float> orientation;

	/**
	 * The cached value of the '{@link #getLinear_velocity() <em>Linear velocity</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinear_velocity()
	 * @generated
	 * @ordered
	 */
	protected EList<Float> linear_velocity;

	/**
	 * The cached value of the '{@link #getAngular_velocity() <em>Angular velocity</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngular_velocity()
	 * @generated
	 * @ordered
	 */
	protected EList<Float> angular_velocity;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MderlPackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Float> getPosition() {
		if (position == null) {
			position = new EDataTypeEList<Float>(Float.class, this, MderlPackage.ELEMENT__POSITION);
		}
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Float> getOrientation() {
		if (orientation == null) {
			orientation = new EDataTypeEList<Float>(Float.class, this, MderlPackage.ELEMENT__ORIENTATION);
		}
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Float> getLinear_velocity() {
		if (linear_velocity == null) {
			linear_velocity = new EDataTypeEList<Float>(Float.class, this, MderlPackage.ELEMENT__LINEAR_VELOCITY);
		}
		return linear_velocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Float> getAngular_velocity() {
		if (angular_velocity == null) {
			angular_velocity = new EDataTypeEList<Float>(Float.class, this, MderlPackage.ELEMENT__ANGULAR_VELOCITY);
		}
		return angular_velocity;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MderlPackage.ELEMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MderlPackage.ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MderlPackage.ELEMENT__POSITION:
			return getPosition();
		case MderlPackage.ELEMENT__ORIENTATION:
			return getOrientation();
		case MderlPackage.ELEMENT__LINEAR_VELOCITY:
			return getLinear_velocity();
		case MderlPackage.ELEMENT__ANGULAR_VELOCITY:
			return getAngular_velocity();
		case MderlPackage.ELEMENT__ID:
			return getId();
		case MderlPackage.ELEMENT__NAME:
			return getName();
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
		case MderlPackage.ELEMENT__POSITION:
			getPosition().clear();
			getPosition().addAll((Collection<? extends Float>) newValue);
			return;
		case MderlPackage.ELEMENT__ORIENTATION:
			getOrientation().clear();
			getOrientation().addAll((Collection<? extends Float>) newValue);
			return;
		case MderlPackage.ELEMENT__LINEAR_VELOCITY:
			getLinear_velocity().clear();
			getLinear_velocity().addAll((Collection<? extends Float>) newValue);
			return;
		case MderlPackage.ELEMENT__ANGULAR_VELOCITY:
			getAngular_velocity().clear();
			getAngular_velocity().addAll((Collection<? extends Float>) newValue);
			return;
		case MderlPackage.ELEMENT__ID:
			setId((Integer) newValue);
			return;
		case MderlPackage.ELEMENT__NAME:
			setName((String) newValue);
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
		case MderlPackage.ELEMENT__POSITION:
			getPosition().clear();
			return;
		case MderlPackage.ELEMENT__ORIENTATION:
			getOrientation().clear();
			return;
		case MderlPackage.ELEMENT__LINEAR_VELOCITY:
			getLinear_velocity().clear();
			return;
		case MderlPackage.ELEMENT__ANGULAR_VELOCITY:
			getAngular_velocity().clear();
			return;
		case MderlPackage.ELEMENT__ID:
			setId(ID_EDEFAULT);
			return;
		case MderlPackage.ELEMENT__NAME:
			setName(NAME_EDEFAULT);
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
		case MderlPackage.ELEMENT__POSITION:
			return position != null && !position.isEmpty();
		case MderlPackage.ELEMENT__ORIENTATION:
			return orientation != null && !orientation.isEmpty();
		case MderlPackage.ELEMENT__LINEAR_VELOCITY:
			return linear_velocity != null && !linear_velocity.isEmpty();
		case MderlPackage.ELEMENT__ANGULAR_VELOCITY:
			return angular_velocity != null && !angular_velocity.isEmpty();
		case MderlPackage.ELEMENT__ID:
			return id != ID_EDEFAULT;
		case MderlPackage.ELEMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (position: ");
		result.append(position);
		result.append(", orientation: ");
		result.append(orientation);
		result.append(", linear_velocity: ");
		result.append(linear_velocity);
		result.append(", angular_velocity: ");
		result.append(angular_velocity);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ElementImpl
