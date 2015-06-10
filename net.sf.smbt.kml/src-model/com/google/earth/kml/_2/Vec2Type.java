/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vec2 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.Vec2Type#getX <em>X</em>}</li>
 *   <li>{@link com.google.earth.kml._2.Vec2Type#getXunits <em>Xunits</em>}</li>
 *   <li>{@link com.google.earth.kml._2.Vec2Type#getY <em>Y</em>}</li>
 *   <li>{@link com.google.earth.kml._2.Vec2Type#getYunits <em>Yunits</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.google.earth.kml._2.v21Package#getVec2Type()
 * @model extendedMetaData="name='vec2Type' kind='empty'"
 * @generated
 */
public interface Vec2Type extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #setX(double)
	 * @see com.google.earth.kml._2.v21Package#getVec2Type_X()
	 * @model default="1.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='x'"
	 * @generated
	 */
	double getX();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.Vec2Type#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #getX()
	 * @generated
	 */
	void setX(double value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.Vec2Type#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetX()
	 * @see #getX()
	 * @see #setX(double)
	 * @generated
	 */
	void unsetX();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.Vec2Type#getX <em>X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>X</em>' attribute is set.
	 * @see #unsetX()
	 * @see #getX()
	 * @see #setX(double)
	 * @generated
	 */
	boolean isSetX();

	/**
	 * Returns the value of the '<em><b>Xunits</b></em>' attribute.
	 * The default value is <code>"fraction"</code>.
	 * The literals are from the enumeration {@link com.google.earth.kml._2.UnitsEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xunits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xunits</em>' attribute.
	 * @see com.google.earth.kml._2.UnitsEnum
	 * @see #isSetXunits()
	 * @see #unsetXunits()
	 * @see #setXunits(UnitsEnum)
	 * @see com.google.earth.kml._2.v21Package#getVec2Type_Xunits()
	 * @model default="fraction" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='xunits'"
	 * @generated
	 */
	UnitsEnum getXunits();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.Vec2Type#getXunits <em>Xunits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xunits</em>' attribute.
	 * @see com.google.earth.kml._2.UnitsEnum
	 * @see #isSetXunits()
	 * @see #unsetXunits()
	 * @see #getXunits()
	 * @generated
	 */
	void setXunits(UnitsEnum value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.Vec2Type#getXunits <em>Xunits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetXunits()
	 * @see #getXunits()
	 * @see #setXunits(UnitsEnum)
	 * @generated
	 */
	void unsetXunits();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.Vec2Type#getXunits <em>Xunits</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Xunits</em>' attribute is set.
	 * @see #unsetXunits()
	 * @see #getXunits()
	 * @see #setXunits(UnitsEnum)
	 * @generated
	 */
	boolean isSetXunits();

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #isSetY()
	 * @see #unsetY()
	 * @see #setY(double)
	 * @see com.google.earth.kml._2.v21Package#getVec2Type_Y()
	 * @model default="1.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='attribute' name='y'"
	 * @generated
	 */
	double getY();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.Vec2Type#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #isSetY()
	 * @see #unsetY()
	 * @see #getY()
	 * @generated
	 */
	void setY(double value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.Vec2Type#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetY()
	 * @see #getY()
	 * @see #setY(double)
	 * @generated
	 */
	void unsetY();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.Vec2Type#getY <em>Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Y</em>' attribute is set.
	 * @see #unsetY()
	 * @see #getY()
	 * @see #setY(double)
	 * @generated
	 */
	boolean isSetY();

	/**
	 * Returns the value of the '<em><b>Yunits</b></em>' attribute.
	 * The default value is <code>"fraction"</code>.
	 * The literals are from the enumeration {@link com.google.earth.kml._2.UnitsEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Yunits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yunits</em>' attribute.
	 * @see com.google.earth.kml._2.UnitsEnum
	 * @see #isSetYunits()
	 * @see #unsetYunits()
	 * @see #setYunits(UnitsEnum)
	 * @see com.google.earth.kml._2.v21Package#getVec2Type_Yunits()
	 * @model default="fraction" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='yunits'"
	 * @generated
	 */
	UnitsEnum getYunits();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.Vec2Type#getYunits <em>Yunits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yunits</em>' attribute.
	 * @see com.google.earth.kml._2.UnitsEnum
	 * @see #isSetYunits()
	 * @see #unsetYunits()
	 * @see #getYunits()
	 * @generated
	 */
	void setYunits(UnitsEnum value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.Vec2Type#getYunits <em>Yunits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetYunits()
	 * @see #getYunits()
	 * @see #setYunits(UnitsEnum)
	 * @generated
	 */
	void unsetYunits();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.Vec2Type#getYunits <em>Yunits</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Yunits</em>' attribute is set.
	 * @see #unsetYunits()
	 * @see #getYunits()
	 * @see #setYunits(UnitsEnum)
	 * @generated
	 */
	boolean isSetYunits();

} // Vec2Type
