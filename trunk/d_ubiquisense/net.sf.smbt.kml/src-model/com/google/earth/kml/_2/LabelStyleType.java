/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Style Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.LabelStyleType#getScale <em>Scale</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.google.earth.kml._2.v21Package#getLabelStyleType()
 * @model extendedMetaData="name='LabelStyleType' kind='elementOnly'"
 * @generated
 */
public interface LabelStyleType extends ColorStyleType {
	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #isSetScale()
	 * @see #unsetScale()
	 * @see #setScale(float)
	 * @see com.google.earth.kml._2.v21Package#getLabelStyleType_Scale()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='scale' namespace='##targetNamespace'"
	 * @generated
	 */
	float getScale();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.LabelStyleType#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #isSetScale()
	 * @see #unsetScale()
	 * @see #getScale()
	 * @generated
	 */
	void setScale(float value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.LabelStyleType#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScale()
	 * @see #getScale()
	 * @see #setScale(float)
	 * @generated
	 */
	void unsetScale();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.LabelStyleType#getScale <em>Scale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scale</em>' attribute is set.
	 * @see #unsetScale()
	 * @see #getScale()
	 * @see #setScale(float)
	 * @generated
	 */
	boolean isSetScale();

} // LabelStyleType
