/**
 */
package mderl.impl;

import mderl.MderlPackage;
import mderl.RobotComponent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robot Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mderl.impl.RobotComponentImpl#getJoint_names <em>Joint names</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RobotComponentImpl extends ElementImpl implements RobotComponent {
	/**
	 * The default value of the '{@link #getJoint_names() <em>Joint names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoint_names()
	 * @generated
	 * @ordered
	 */
	protected static final String JOINT_NAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJoint_names() <em>Joint names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoint_names()
	 * @generated
	 * @ordered
	 */
	protected String joint_names = JOINT_NAMES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RobotComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MderlPackage.Literals.ROBOT_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJoint_names() {
		return joint_names;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJoint_names(String newJoint_names) {
		String oldJoint_names = joint_names;
		joint_names = newJoint_names;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MderlPackage.ROBOT_COMPONENT__JOINT_NAMES,
					oldJoint_names, joint_names));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MderlPackage.ROBOT_COMPONENT__JOINT_NAMES:
			return getJoint_names();
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
		case MderlPackage.ROBOT_COMPONENT__JOINT_NAMES:
			setJoint_names((String) newValue);
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
		case MderlPackage.ROBOT_COMPONENT__JOINT_NAMES:
			setJoint_names(JOINT_NAMES_EDEFAULT);
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
		case MderlPackage.ROBOT_COMPONENT__JOINT_NAMES:
			return JOINT_NAMES_EDEFAULT == null ? joint_names != null : !JOINT_NAMES_EDEFAULT.equals(joint_names);
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
		result.append(" (joint_names: ");
		result.append(joint_names);
		result.append(')');
		return result.toString();
	}

} //RobotComponentImpl
