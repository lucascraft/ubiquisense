/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.topografix.gpx.v1._1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Email Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 	 An email address.  Broken into two parts (id and domain) to help prevent email harvesting.
 *     
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.topografix.gpx.v1._1.EmailType#getDomain <em>Domain</em>}</li>
 *   <li>{@link com.topografix.gpx.v1._1.EmailType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.topografix.gpx.v1._1.v1Package#getEmailType()
 * @model extendedMetaData="name='emailType' kind='empty'"
 * @generated
 */
public interface EmailType extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		domain half of email address (hotmail.com)
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain</em>' attribute.
	 * @see #setDomain(String)
	 * @see com.topografix.gpx.v1._1.v1Package#getEmailType_Domain()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='domain'"
	 * @generated
	 */
	String getDomain();

	/**
	 * Sets the value of the '{@link com.topografix.gpx.v1._1.EmailType#getDomain <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' attribute.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 		id half of email address (billgates2004)
	 * 	  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see com.topografix.gpx.v1._1.v1Package#getEmailType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link com.topografix.gpx.v1._1.EmailType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // EmailType
