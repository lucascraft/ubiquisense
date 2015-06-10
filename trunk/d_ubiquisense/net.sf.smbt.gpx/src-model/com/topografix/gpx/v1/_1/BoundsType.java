/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.topografix.gpx.v1._1;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bounds Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 	 Two lat/lon pairs defining the extent of an element.
 *     
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.topografix.gpx.v1._1.BoundsType#getMaxlat <em>Maxlat</em>}</li>
 *   <li>{@link com.topografix.gpx.v1._1.BoundsType#getMaxlon <em>Maxlon</em>}</li>
 *   <li>{@link com.topografix.gpx.v1._1.BoundsType#getMinlat <em>Minlat</em>}</li>
 *   <li>{@link com.topografix.gpx.v1._1.BoundsType#getMinlon <em>Minlon</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.topografix.gpx.v1._1.v1Package#getBoundsType()
 * @model extendedMetaData="name='boundsType' kind='empty'"
 * @generated
 */
public interface BoundsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Maxlat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		The maximum latitude.
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maxlat</em>' attribute.
	 * @see #setMaxlat(BigDecimal)
	 * @see com.topografix.gpx.v1._1.v1Package#getBoundsType_Maxlat()
	 * @model dataType="com.topografix.gpx.v1._1.LatitudeType" required="true"
	 *        extendedMetaData="kind='attribute' name='maxlat'"
	 * @generated
	 */
	BigDecimal getMaxlat();

	/**
	 * Sets the value of the '{@link com.topografix.gpx.v1._1.BoundsType#getMaxlat <em>Maxlat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maxlat</em>' attribute.
	 * @see #getMaxlat()
	 * @generated
	 */
	void setMaxlat(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Maxlon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		The maximum longitude.
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maxlon</em>' attribute.
	 * @see #setMaxlon(BigDecimal)
	 * @see com.topografix.gpx.v1._1.v1Package#getBoundsType_Maxlon()
	 * @model dataType="com.topografix.gpx.v1._1.LongitudeType" required="true"
	 *        extendedMetaData="kind='attribute' name='maxlon'"
	 * @generated
	 */
	BigDecimal getMaxlon();

	/**
	 * Sets the value of the '{@link com.topografix.gpx.v1._1.BoundsType#getMaxlon <em>Maxlon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maxlon</em>' attribute.
	 * @see #getMaxlon()
	 * @generated
	 */
	void setMaxlon(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Minlat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		The minimum latitude.
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minlat</em>' attribute.
	 * @see #setMinlat(BigDecimal)
	 * @see com.topografix.gpx.v1._1.v1Package#getBoundsType_Minlat()
	 * @model dataType="com.topografix.gpx.v1._1.LatitudeType" required="true"
	 *        extendedMetaData="kind='attribute' name='minlat'"
	 * @generated
	 */
	BigDecimal getMinlat();

	/**
	 * Sets the value of the '{@link com.topografix.gpx.v1._1.BoundsType#getMinlat <em>Minlat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minlat</em>' attribute.
	 * @see #getMinlat()
	 * @generated
	 */
	void setMinlat(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Minlon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		The minimum longitude.
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minlon</em>' attribute.
	 * @see #setMinlon(BigDecimal)
	 * @see com.topografix.gpx.v1._1.v1Package#getBoundsType_Minlon()
	 * @model dataType="com.topografix.gpx.v1._1.LongitudeType" required="true"
	 *        extendedMetaData="kind='attribute' name='minlon'"
	 * @generated
	 */
	BigDecimal getMinlon();

	/**
	 * Sets the value of the '{@link com.topografix.gpx.v1._1.BoundsType#getMinlon <em>Minlon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minlon</em>' attribute.
	 * @see #getMinlon()
	 * @generated
	 */
	void setMinlon(BigDecimal value);

} // BoundsType
