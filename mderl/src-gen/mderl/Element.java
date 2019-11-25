/**
 */
package mderl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mderl.Element#getPosition <em>Position</em>}</li>
 *   <li>{@link mderl.Element#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link mderl.Element#getLinear_velocity <em>Linear velocity</em>}</li>
 *   <li>{@link mderl.Element#getAngular_velocity <em>Angular velocity</em>}</li>
 *   <li>{@link mderl.Element#getId <em>Id</em>}</li>
 *   <li>{@link mderl.Element#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see mderl.MderlPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Float}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute list.
	 * @see mderl.MderlPackage#getElement_Position()
	 * @model unique="false" required="true" upper="3"
	 * @generated
	 */
	EList<Float> getPosition();

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Float}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute list.
	 * @see mderl.MderlPackage#getElement_Orientation()
	 * @model unique="false" required="true" upper="3"
	 * @generated
	 */
	EList<Float> getOrientation();

	/**
	 * Returns the value of the '<em><b>Linear velocity</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Float}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear velocity</em>' attribute list.
	 * @see mderl.MderlPackage#getElement_Linear_velocity()
	 * @model default="0.0" unique="false" upper="3"
	 * @generated
	 */
	EList<Float> getLinear_velocity();

	/**
	 * Returns the value of the '<em><b>Angular velocity</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Float}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angular velocity</em>' attribute list.
	 * @see mderl.MderlPackage#getElement_Angular_velocity()
	 * @model default="0.0" unique="false" upper="3"
	 * @generated
	 */
	EList<Float> getAngular_velocity();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see mderl.MderlPackage#getElement_Id()
	 * @model default="0" id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link mderl.Element#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mderl.MderlPackage#getElement_Name()
	 * @model default="" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mderl.Element#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Element
