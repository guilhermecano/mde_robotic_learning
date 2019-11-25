/**
 */
package mderl.impl;

import java.util.Collection;
import mderl.Environment;
import mderl.MderlPackage;

import mderl.general_elements;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mderl.impl.EnvironmentImpl#getScene <em>Scene</em>}</li>
 *   <li>{@link mderl.impl.EnvironmentImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link mderl.impl.EnvironmentImpl#isDynamic_reset <em>Dynamic reset</em>}</li>
 *   <li>{@link mderl.impl.EnvironmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link mderl.impl.EnvironmentImpl#isHeadless <em>Headless</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvironmentImpl extends MinimalEObjectImpl.Container implements Environment {
	/**
	 * The default value of the '{@link #getScene() <em>Scene</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScene()
	 * @generated
	 * @ordered
	 */
	protected static final String SCENE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScene() <em>Scene</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScene()
	 * @generated
	 * @ordered
	 */
	protected String scene = SCENE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<general_elements> elements;

	/**
	 * The default value of the '{@link #isDynamic_reset() <em>Dynamic reset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDynamic_reset()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DYNAMIC_RESET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDynamic_reset() <em>Dynamic reset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDynamic_reset()
	 * @generated
	 * @ordered
	 */
	protected boolean dynamic_reset = DYNAMIC_RESET_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "env";

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
	 * The default value of the '{@link #isHeadless() <em>Headless</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHeadless()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HEADLESS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHeadless() <em>Headless</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHeadless()
	 * @generated
	 * @ordered
	 */
	protected boolean headless = HEADLESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MderlPackage.Literals.ENVIRONMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScene() {
		return scene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScene(String newScene) {
		String oldScene = scene;
		scene = newScene;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MderlPackage.ENVIRONMENT__SCENE, oldScene, scene));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<general_elements> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<general_elements>(general_elements.class, this,
					MderlPackage.ENVIRONMENT__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDynamic_reset() {
		return dynamic_reset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDynamic_reset(boolean newDynamic_reset) {
		boolean oldDynamic_reset = dynamic_reset;
		dynamic_reset = newDynamic_reset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MderlPackage.ENVIRONMENT__DYNAMIC_RESET,
					oldDynamic_reset, dynamic_reset));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MderlPackage.ENVIRONMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHeadless() {
		return headless;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeadless(boolean newHeadless) {
		boolean oldHeadless = headless;
		headless = newHeadless;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MderlPackage.ENVIRONMENT__HEADLESS, oldHeadless,
					headless));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MderlPackage.ENVIRONMENT__ELEMENTS:
			return ((InternalEList<?>) getElements()).basicRemove(otherEnd, msgs);
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
		case MderlPackage.ENVIRONMENT__SCENE:
			return getScene();
		case MderlPackage.ENVIRONMENT__ELEMENTS:
			return getElements();
		case MderlPackage.ENVIRONMENT__DYNAMIC_RESET:
			return isDynamic_reset();
		case MderlPackage.ENVIRONMENT__NAME:
			return getName();
		case MderlPackage.ENVIRONMENT__HEADLESS:
			return isHeadless();
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
		case MderlPackage.ENVIRONMENT__SCENE:
			setScene((String) newValue);
			return;
		case MderlPackage.ENVIRONMENT__ELEMENTS:
			getElements().clear();
			getElements().addAll((Collection<? extends general_elements>) newValue);
			return;
		case MderlPackage.ENVIRONMENT__DYNAMIC_RESET:
			setDynamic_reset((Boolean) newValue);
			return;
		case MderlPackage.ENVIRONMENT__NAME:
			setName((String) newValue);
			return;
		case MderlPackage.ENVIRONMENT__HEADLESS:
			setHeadless((Boolean) newValue);
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
		case MderlPackage.ENVIRONMENT__SCENE:
			setScene(SCENE_EDEFAULT);
			return;
		case MderlPackage.ENVIRONMENT__ELEMENTS:
			getElements().clear();
			return;
		case MderlPackage.ENVIRONMENT__DYNAMIC_RESET:
			setDynamic_reset(DYNAMIC_RESET_EDEFAULT);
			return;
		case MderlPackage.ENVIRONMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MderlPackage.ENVIRONMENT__HEADLESS:
			setHeadless(HEADLESS_EDEFAULT);
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
		case MderlPackage.ENVIRONMENT__SCENE:
			return SCENE_EDEFAULT == null ? scene != null : !SCENE_EDEFAULT.equals(scene);
		case MderlPackage.ENVIRONMENT__ELEMENTS:
			return elements != null && !elements.isEmpty();
		case MderlPackage.ENVIRONMENT__DYNAMIC_RESET:
			return dynamic_reset != DYNAMIC_RESET_EDEFAULT;
		case MderlPackage.ENVIRONMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MderlPackage.ENVIRONMENT__HEADLESS:
			return headless != HEADLESS_EDEFAULT;
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
		result.append(" (scene: ");
		result.append(scene);
		result.append(", dynamic_reset: ");
		result.append(dynamic_reset);
		result.append(", name: ");
		result.append(name);
		result.append(", headless: ");
		result.append(headless);
		result.append(')');
		return result.toString();
	}

} //EnvironmentImpl
