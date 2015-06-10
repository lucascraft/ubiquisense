/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.topografix.gpx.v1._1;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ptseg Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 	 An ordered sequence of points.  (for polygons or polylines, e.g.)
 *     
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.topografix.gpx.v1._1.PtsegType#getPt <em>Pt</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.topografix.gpx.v1._1.v1Package#getPtsegType()
 * @model extendedMetaData="name='ptsegType' kind='elementOnly'"
 * @generated
 */
public interface PtsegType extends EObject {
	/**
	 * Returns the value of the '<em><b>Pt</b></em>' containment reference list.
	 * The list contents are of type {@link com.topografix.gpx.v1._1.PtType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		 Ordered list of geographic points.
	 * 		
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pt</em>' containment reference list.
	 * @see com.topografix.gpx.v1._1.v1Package#getPtsegType_Pt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pt' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PtType> getPt();

} // PtsegType
