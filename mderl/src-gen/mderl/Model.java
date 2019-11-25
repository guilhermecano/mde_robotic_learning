/**
 */
package mderl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mderl.Model#getConfig <em>Config</em>}</li>
 * </ul>
 *
 * @see mderl.MderlPackage#getModel()
 * @model abstract="true"
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' containment reference.
	 * @see #setConfig(Config)
	 * @see mderl.MderlPackage#getModel_Config()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Config getConfig();

	/**
	 * Sets the value of the '{@link mderl.Model#getConfig <em>Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' containment reference.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(Config value);

} // Model
