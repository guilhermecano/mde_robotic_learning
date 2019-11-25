/**
 */
package mderl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mderl.Environment#getScene <em>Scene</em>}</li>
 *   <li>{@link mderl.Environment#getElements <em>Elements</em>}</li>
 *   <li>{@link mderl.Environment#isDynamic_reset <em>Dynamic reset</em>}</li>
 *   <li>{@link mderl.Environment#getName <em>Name</em>}</li>
 *   <li>{@link mderl.Environment#isHeadless <em>Headless</em>}</li>
 * </ul>
 *
 * @see mderl.MderlPackage#getEnvironment()
 * @model
 * @generated
 */
public interface Environment extends EObject {
	/**
	 * Returns the value of the '<em><b>Scene</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scene</em>' attribute.
	 * @see #setScene(String)
	 * @see mderl.MderlPackage#getEnvironment_Scene()
	 * @model required="true"
	 * @generated
	 */
	String getScene();

	/**
	 * Sets the value of the '{@link mderl.Environment#getScene <em>Scene</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scene</em>' attribute.
	 * @see #getScene()
	 * @generated
	 */
	void setScene(String value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link mderl.general_elements}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see mderl.MderlPackage#getEnvironment_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<general_elements> getElements();

	/**
	 * Returns the value of the '<em><b>Dynamic reset</b></em>' attribute.
	 * The default value is <code>"False"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic reset</em>' attribute.
	 * @see #setDynamic_reset(boolean)
	 * @see mderl.MderlPackage#getEnvironment_Dynamic_reset()
	 * @model default="False" required="true"
	 * @generated
	 */
	boolean isDynamic_reset();

	/**
	 * Sets the value of the '{@link mderl.Environment#isDynamic_reset <em>Dynamic reset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic reset</em>' attribute.
	 * @see #isDynamic_reset()
	 * @generated
	 */
	void setDynamic_reset(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"env"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mderl.MderlPackage#getEnvironment_Name()
	 * @model default="env" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mderl.Environment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Headless</b></em>' attribute.
	 * The default value is <code>"False"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Headless</em>' attribute.
	 * @see #setHeadless(boolean)
	 * @see mderl.MderlPackage#getEnvironment_Headless()
	 * @model default="False" required="true"
	 * @generated
	 */
	boolean isHeadless();

	/**
	 * Sets the value of the '{@link mderl.Environment#isHeadless <em>Headless</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Headless</em>' attribute.
	 * @see #isHeadless()
	 * @generated
	 */
	void setHeadless(boolean value);

} // Environment
