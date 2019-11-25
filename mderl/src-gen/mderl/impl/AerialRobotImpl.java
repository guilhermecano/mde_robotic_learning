/**
 */
package mderl.impl;

import mderl.AerialRobot;
import mderl.MderlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aerial Robot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mderl.impl.AerialRobotImpl#getPropeller_name <em>Propeller name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AerialRobotImpl extends MobileImpl implements AerialRobot {
	/**
	 * The default value of the '{@link #getPropeller_name() <em>Propeller name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropeller_name()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPELLER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropeller_name() <em>Propeller name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropeller_name()
	 * @generated
	 * @ordered
	 */
	protected String propeller_name = PROPELLER_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AerialRobotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MderlPackage.Literals.AERIAL_ROBOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPropeller_name() {
		return propeller_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropeller_name(String newPropeller_name) {
		String oldPropeller_name = propeller_name;
		propeller_name = newPropeller_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MderlPackage.AERIAL_ROBOT__PROPELLER_NAME,
					oldPropeller_name, propeller_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MderlPackage.AERIAL_ROBOT__PROPELLER_NAME:
			return getPropeller_name();
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
		case MderlPackage.AERIAL_ROBOT__PROPELLER_NAME:
			setPropeller_name((String) newValue);
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
		case MderlPackage.AERIAL_ROBOT__PROPELLER_NAME:
			setPropeller_name(PROPELLER_NAME_EDEFAULT);
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
		case MderlPackage.AERIAL_ROBOT__PROPELLER_NAME:
			return PROPELLER_NAME_EDEFAULT == null ? propeller_name != null
					: !PROPELLER_NAME_EDEFAULT.equals(propeller_name);
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
		result.append(" (propeller_name: ");
		result.append(propeller_name);
		result.append(')');
		return result.toString();
	}

} //AerialRobotImpl
