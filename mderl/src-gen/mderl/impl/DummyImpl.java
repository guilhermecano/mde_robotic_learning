/**
 */
package mderl.impl;

import mderl.Dummy;
import mderl.MderlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dummy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mderl.impl.DummyImpl#getElement_type <em>Element type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DummyImpl extends general_elementsImpl implements Dummy {
	/**
	 * The default value of the '{@link #getElement_type() <em>Element type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement_type()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEMENT_TYPE_EDEFAULT = "Dummy";
	/**
	 * The cached value of the '{@link #getElement_type() <em>Element type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElement_type()
	 * @generated
	 * @ordered
	 */
	protected String element_type = ELEMENT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DummyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MderlPackage.Literals.DUMMY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getElement_type() {
		return element_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElement_type(String newElement_type) {
		String oldElement_type = element_type;
		element_type = newElement_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MderlPackage.DUMMY__ELEMENT_TYPE, oldElement_type,
					element_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MderlPackage.DUMMY__ELEMENT_TYPE:
			return getElement_type();
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
		case MderlPackage.DUMMY__ELEMENT_TYPE:
			setElement_type((String) newValue);
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
		case MderlPackage.DUMMY__ELEMENT_TYPE:
			setElement_type(ELEMENT_TYPE_EDEFAULT);
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
		case MderlPackage.DUMMY__ELEMENT_TYPE:
			return ELEMENT_TYPE_EDEFAULT == null ? element_type != null : !ELEMENT_TYPE_EDEFAULT.equals(element_type);
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
		result.append(" (element_type: ");
		result.append(element_type);
		result.append(')');
		return result.toString();
	}

} //DummyImpl
