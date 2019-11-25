/**
 */
package mderl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dummy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mderl.Dummy#getElement_type <em>Element type</em>}</li>
 * </ul>
 *
 * @see mderl.MderlPackage#getDummy()
 * @model
 * @generated
 */
public interface Dummy extends general_elements {

	/**
	 * Returns the value of the '<em><b>Element type</b></em>' attribute.
	 * The default value is <code>"Dummy"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element type</em>' attribute.
	 * @see #setElement_type(String)
	 * @see mderl.MderlPackage#getDummy_Element_type()
	 * @model default="Dummy" required="true"
	 * @generated
	 */
	String getElement_type();

	/**
	 * Sets the value of the '{@link mderl.Dummy#getElement_type <em>Element type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element type</em>' attribute.
	 * @see #getElement_type()
	 * @generated
	 */
	void setElement_type(String value);
} // Dummy
