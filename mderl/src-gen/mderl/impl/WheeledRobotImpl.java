/**
 */
package mderl.impl;

import mderl.MderlPackage;
import mderl.WheeledRobot;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wheeled Robot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mderl.impl.WheeledRobotImpl#getWheel_name <em>Wheel name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class WheeledRobotImpl extends MobileImpl implements WheeledRobot {
	/**
	 * The default value of the '{@link #getWheel_name() <em>Wheel name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWheel_name()
	 * @generated
	 * @ordered
	 */
	protected static final String WHEEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWheel_name() <em>Wheel name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWheel_name()
	 * @generated
	 * @ordered
	 */
	protected String wheel_name = WHEEL_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WheeledRobotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MderlPackage.Literals.WHEELED_ROBOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWheel_name() {
		return wheel_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWheel_name(String newWheel_name) {
		String oldWheel_name = wheel_name;
		wheel_name = newWheel_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MderlPackage.WHEELED_ROBOT__WHEEL_NAME, oldWheel_name,
					wheel_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MderlPackage.WHEELED_ROBOT__WHEEL_NAME:
			return getWheel_name();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MderlPackage.WHEELED_ROBOT__WHEEL_NAME:
			setWheel_name((String) newValue);
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
		case MderlPackage.WHEELED_ROBOT__WHEEL_NAME:
			setWheel_name(WHEEL_NAME_EDEFAULT);
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
		case MderlPackage.WHEELED_ROBOT__WHEEL_NAME:
			return WHEEL_NAME_EDEFAULT == null ? wheel_name != null : !WHEEL_NAME_EDEFAULT.equals(wheel_name);
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
		result.append(" (wheel_name: ");
		result.append(wheel_name);
		result.append(')');
		return result.toString();
	}

} //WheeledRobotImpl
