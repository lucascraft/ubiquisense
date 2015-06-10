/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         
 *         
 *         Not final="#all" to show how IconType extended LinkType in KML 2.0.
 *         
 *         
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.LinkType#getHref <em>Href</em>}</li>
 *   <li>{@link com.google.earth.kml._2.LinkType#getRefreshMode <em>Refresh Mode</em>}</li>
 *   <li>{@link com.google.earth.kml._2.LinkType#getRefreshInterval <em>Refresh Interval</em>}</li>
 *   <li>{@link com.google.earth.kml._2.LinkType#getViewRefreshMode <em>View Refresh Mode</em>}</li>
 *   <li>{@link com.google.earth.kml._2.LinkType#getViewRefreshTime <em>View Refresh Time</em>}</li>
 *   <li>{@link com.google.earth.kml._2.LinkType#getViewBoundScale <em>View Bound Scale</em>}</li>
 *   <li>{@link com.google.earth.kml._2.LinkType#getViewFormat <em>View Format</em>}</li>
 *   <li>{@link com.google.earth.kml._2.LinkType#getHttpQuery <em>Http Query</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.google.earth.kml._2.v21Package#getLinkType()
 * @model extendedMetaData="name='LinkType' kind='elementOnly'"
 * @generated
 */
public interface LinkType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Href</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see com.google.earth.kml._2.v21Package#getLinkType_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='href' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.LinkType#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Refresh Mode</b></em>' attribute.
	 * The default value is <code>"onChange"</code>.
	 * The literals are from the enumeration {@link com.google.earth.kml._2.RefreshModeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refresh Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refresh Mode</em>' attribute.
	 * @see com.google.earth.kml._2.RefreshModeEnum
	 * @see #isSetRefreshMode()
	 * @see #unsetRefreshMode()
	 * @see #setRefreshMode(RefreshModeEnum)
	 * @see com.google.earth.kml._2.v21Package#getLinkType_RefreshMode()
	 * @model default="onChange" unsettable="true"
	 *        extendedMetaData="kind='element' name='refreshMode' namespace='##targetNamespace'"
	 * @generated
	 */
	RefreshModeEnum getRefreshMode();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.LinkType#getRefreshMode <em>Refresh Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Mode</em>' attribute.
	 * @see com.google.earth.kml._2.RefreshModeEnum
	 * @see #isSetRefreshMode()
	 * @see #unsetRefreshMode()
	 * @see #getRefreshMode()
	 * @generated
	 */
	void setRefreshMode(RefreshModeEnum value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.LinkType#getRefreshMode <em>Refresh Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRefreshMode()
	 * @see #getRefreshMode()
	 * @see #setRefreshMode(RefreshModeEnum)
	 * @generated
	 */
	void unsetRefreshMode();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.LinkType#getRefreshMode <em>Refresh Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Refresh Mode</em>' attribute is set.
	 * @see #unsetRefreshMode()
	 * @see #getRefreshMode()
	 * @see #setRefreshMode(RefreshModeEnum)
	 * @generated
	 */
	boolean isSetRefreshMode();

	/**
	 * Returns the value of the '<em><b>Refresh Interval</b></em>' attribute.
	 * The default value is <code>"4"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refresh Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refresh Interval</em>' attribute.
	 * @see #isSetRefreshInterval()
	 * @see #unsetRefreshInterval()
	 * @see #setRefreshInterval(float)
	 * @see com.google.earth.kml._2.v21Package#getLinkType_RefreshInterval()
	 * @model default="4" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='refreshInterval' namespace='##targetNamespace'"
	 * @generated
	 */
	float getRefreshInterval();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.LinkType#getRefreshInterval <em>Refresh Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Interval</em>' attribute.
	 * @see #isSetRefreshInterval()
	 * @see #unsetRefreshInterval()
	 * @see #getRefreshInterval()
	 * @generated
	 */
	void setRefreshInterval(float value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.LinkType#getRefreshInterval <em>Refresh Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRefreshInterval()
	 * @see #getRefreshInterval()
	 * @see #setRefreshInterval(float)
	 * @generated
	 */
	void unsetRefreshInterval();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.LinkType#getRefreshInterval <em>Refresh Interval</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Refresh Interval</em>' attribute is set.
	 * @see #unsetRefreshInterval()
	 * @see #getRefreshInterval()
	 * @see #setRefreshInterval(float)
	 * @generated
	 */
	boolean isSetRefreshInterval();

	/**
	 * Returns the value of the '<em><b>View Refresh Mode</b></em>' attribute.
	 * The default value is <code>"never"</code>.
	 * The literals are from the enumeration {@link com.google.earth.kml._2.ViewRefreshModeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Refresh Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Refresh Mode</em>' attribute.
	 * @see com.google.earth.kml._2.ViewRefreshModeEnum
	 * @see #isSetViewRefreshMode()
	 * @see #unsetViewRefreshMode()
	 * @see #setViewRefreshMode(ViewRefreshModeEnum)
	 * @see com.google.earth.kml._2.v21Package#getLinkType_ViewRefreshMode()
	 * @model default="never" unsettable="true"
	 *        extendedMetaData="kind='element' name='viewRefreshMode' namespace='##targetNamespace'"
	 * @generated
	 */
	ViewRefreshModeEnum getViewRefreshMode();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.LinkType#getViewRefreshMode <em>View Refresh Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Refresh Mode</em>' attribute.
	 * @see com.google.earth.kml._2.ViewRefreshModeEnum
	 * @see #isSetViewRefreshMode()
	 * @see #unsetViewRefreshMode()
	 * @see #getViewRefreshMode()
	 * @generated
	 */
	void setViewRefreshMode(ViewRefreshModeEnum value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.LinkType#getViewRefreshMode <em>View Refresh Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetViewRefreshMode()
	 * @see #getViewRefreshMode()
	 * @see #setViewRefreshMode(ViewRefreshModeEnum)
	 * @generated
	 */
	void unsetViewRefreshMode();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.LinkType#getViewRefreshMode <em>View Refresh Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>View Refresh Mode</em>' attribute is set.
	 * @see #unsetViewRefreshMode()
	 * @see #getViewRefreshMode()
	 * @see #setViewRefreshMode(ViewRefreshModeEnum)
	 * @generated
	 */
	boolean isSetViewRefreshMode();

	/**
	 * Returns the value of the '<em><b>View Refresh Time</b></em>' attribute.
	 * The default value is <code>"4"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Refresh Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Refresh Time</em>' attribute.
	 * @see #isSetViewRefreshTime()
	 * @see #unsetViewRefreshTime()
	 * @see #setViewRefreshTime(float)
	 * @see com.google.earth.kml._2.v21Package#getLinkType_ViewRefreshTime()
	 * @model default="4" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='viewRefreshTime' namespace='##targetNamespace'"
	 * @generated
	 */
	float getViewRefreshTime();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.LinkType#getViewRefreshTime <em>View Refresh Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Refresh Time</em>' attribute.
	 * @see #isSetViewRefreshTime()
	 * @see #unsetViewRefreshTime()
	 * @see #getViewRefreshTime()
	 * @generated
	 */
	void setViewRefreshTime(float value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.LinkType#getViewRefreshTime <em>View Refresh Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetViewRefreshTime()
	 * @see #getViewRefreshTime()
	 * @see #setViewRefreshTime(float)
	 * @generated
	 */
	void unsetViewRefreshTime();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.LinkType#getViewRefreshTime <em>View Refresh Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>View Refresh Time</em>' attribute is set.
	 * @see #unsetViewRefreshTime()
	 * @see #getViewRefreshTime()
	 * @see #setViewRefreshTime(float)
	 * @generated
	 */
	boolean isSetViewRefreshTime();

	/**
	 * Returns the value of the '<em><b>View Bound Scale</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Bound Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Bound Scale</em>' attribute.
	 * @see #isSetViewBoundScale()
	 * @see #unsetViewBoundScale()
	 * @see #setViewBoundScale(float)
	 * @see com.google.earth.kml._2.v21Package#getLinkType_ViewBoundScale()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='viewBoundScale' namespace='##targetNamespace'"
	 * @generated
	 */
	float getViewBoundScale();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.LinkType#getViewBoundScale <em>View Bound Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Bound Scale</em>' attribute.
	 * @see #isSetViewBoundScale()
	 * @see #unsetViewBoundScale()
	 * @see #getViewBoundScale()
	 * @generated
	 */
	void setViewBoundScale(float value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.LinkType#getViewBoundScale <em>View Bound Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetViewBoundScale()
	 * @see #getViewBoundScale()
	 * @see #setViewBoundScale(float)
	 * @generated
	 */
	void unsetViewBoundScale();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.LinkType#getViewBoundScale <em>View Bound Scale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>View Bound Scale</em>' attribute is set.
	 * @see #unsetViewBoundScale()
	 * @see #getViewBoundScale()
	 * @see #setViewBoundScale(float)
	 * @generated
	 */
	boolean isSetViewBoundScale();

	/**
	 * Returns the value of the '<em><b>View Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Format</em>' attribute.
	 * @see #setViewFormat(String)
	 * @see com.google.earth.kml._2.v21Package#getLinkType_ViewFormat()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='viewFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	String getViewFormat();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.LinkType#getViewFormat <em>View Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Format</em>' attribute.
	 * @see #getViewFormat()
	 * @generated
	 */
	void setViewFormat(String value);

	/**
	 * Returns the value of the '<em><b>Http Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Http Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Query</em>' attribute.
	 * @see #setHttpQuery(String)
	 * @see com.google.earth.kml._2.v21Package#getLinkType_HttpQuery()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='httpQuery' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHttpQuery();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.LinkType#getHttpQuery <em>Http Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Query</em>' attribute.
	 * @see #getHttpQuery()
	 * @generated
	 */
	void setHttpQuery(String value);

} // LinkType
