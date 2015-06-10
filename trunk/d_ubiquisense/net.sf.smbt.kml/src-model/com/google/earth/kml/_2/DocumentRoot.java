/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2;

import java.util.List;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getBalloonStyle <em>Balloon Style</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getObject <em>Object</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getDocument <em>Document</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getFeature <em>Feature</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getFolder <em>Folder</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getGroundOverlay <em>Ground Overlay</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getIcon <em>Icon</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getIconStyle <em>Icon Style</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getKml <em>Kml</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getLabelStyle <em>Label Style</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getLatLonAltBox <em>Lat Lon Alt Box</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getLatLonBox <em>Lat Lon Box</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getLinearRing <em>Linear Ring</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getLineString <em>Line String</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getLink <em>Link</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getListStyle <em>List Style</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getLocation <em>Location</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getLod <em>Lod</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getLookAt <em>Look At</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getModel <em>Model</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getMultiGeometry <em>Multi Geometry</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getNetworkLink <em>Network Link</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getPlacemark <em>Placemark</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getPoint <em>Point</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getPolyStyle <em>Poly Style</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getRegion <em>Region</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getScale <em>Scale</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getScreenOverlay <em>Screen Overlay</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getStyle <em>Style</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getStyleSelector <em>Style Selector</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getStyleMap <em>Style Map</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getStyleUrl <em>Style Url</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getTimePrimitive <em>Time Primitive</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getTimeSpan <em>Time Span</em>}</li>
 *   <li>{@link com.google.earth.kml._2.DocumentRoot#getTimeStamp <em>Time Stamp</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.google.earth.kml._2.v21Package#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Balloon Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Balloon Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balloon Style</em>' containment reference.
	 * @see #setBalloonStyle(BalloonStyleType)
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_BalloonStyle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BalloonStyle' namespace='##targetNamespace' affiliation='Object'"
	 * @generated
	 */
	BalloonStyleType getBalloonStyle();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.DocumentRoot#getBalloonStyle <em>Balloon Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balloon Style</em>' containment reference.
	 * @see #getBalloonStyle()
	 * @generated
	 */
	void setBalloonStyle(BalloonStyleType value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_Object()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Object' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectType getObject();

	/**
	 * Returns the value of the '<em><b>Coordinates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinates</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinates</em>' attribute.
	 * @see #setCoordinates(List)
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_Coordinates()
	 * @model unique="false" dataType="com.google.earth.kml._2.CoordinatesType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='coordinates' namespace='##targetNamespace'"
	 * @generated
	 */
	List<String> getCoordinates();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.DocumentRoot#getCoordinates <em>Coordinates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinates</em>' attribute.
	 * @see #getCoordinates()
	 * @generated
	 */
	void setCoordinates(List<String> value);

	/**
	 * Returns the value of the '<em><b>Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' containment reference.
	 * @see #setDocument(DocumentType)
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_Document()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Document' namespace='##targetNamespace' affiliation='Feature'"
	 * @generated
	 */
	DocumentType getDocument();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.DocumentRoot#getDocument <em>Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' containment reference.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(DocumentType value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference.
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_Feature()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Feature' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureType getFeature();

	/**
	 * Returns the value of the '<em><b>Folder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Folder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folder</em>' containment reference.
	 * @see #setFolder(FolderType)
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_Folder()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Folder' namespace='##targetNamespace' affiliation='Feature'"
	 * @generated
	 */
	FolderType getFolder();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.DocumentRoot#getFolder <em>Folder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Folder</em>' containment reference.
	 * @see #getFolder()
	 * @generated
	 */
	void setFolder(FolderType value);

	/**
	 * Returns the value of the '<em><b>Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geometry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometry</em>' containment reference.
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_Geometry()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Geometry' namespace='##targetNamespace'"
	 * @generated
	 */
	GeometryType getGeometry();

	/**
	 * Returns the value of the '<em><b>Ground Overlay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ground Overlay</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground Overlay</em>' containment reference.
	 * @see #setGroundOverlay(GroundOverlayType)
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_GroundOverlay()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GroundOverlay' namespace='##targetNamespace' affiliation='Feature'"
	 * @generated
	 */
	GroundOverlayType getGroundOverlay();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.DocumentRoot#getGroundOverlay <em>Ground Overlay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ground Overlay</em>' containment reference.
	 * @see #getGroundOverlay()
	 * @generated
	 */
	void setGroundOverlay(GroundOverlayType value);

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' containment reference.
	 * @see #setIcon(LinkType)
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_Icon()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Icon' namespace='##targetNamespace' affiliation='Object'"
	 * @generated
	 */
	LinkType getIcon();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.DocumentRoot#getIcon <em>Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' containment reference.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(LinkType value);

	/**
	 * Returns the value of the '<em><b>Icon Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon Style</em>' containment reference.
	 * @see #setIconStyle(IconStyleType)
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_IconStyle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IconStyle' namespace='##targetNamespace' affiliation='Object'"
	 * @generated
	 */
	IconStyleType getIconStyle();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.DocumentRoot#getIconStyle <em>Icon Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon Style</em>' containment reference.
	 * @see #getIconStyle()
	 * @generated
	 */
	void setIconStyle(IconStyleType value);

	/**
	 * Returns the value of the '<em><b>Kml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kml</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kml</em>' containment reference.
	 * @see #setKml(KmlType)
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_Kml()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='kml' namespace='##targetNamespace'"
	 * @generated
	 */
	KmlType getKml();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.DocumentRoot#getKml <em>Kml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kml</em>' containment reference.
	 * @see #getKml()
	 * @generated
	 */
	void setKml(KmlType value);

	/**
	 * Returns the value of the '<em><b>Label Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Style</em>' containment reference.
	 * @see #setLabelStyle(LabelStyleType)
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_LabelStyle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LabelStyle' namespace='##targetNamespace' affiliation='Object'"
	 * @generated
	 */
	LabelStyleType getLabelStyle();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.DocumentRoot#getLabelStyle <em>Label Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Style</em>' containment reference.
	 * @see #getLabelStyle()
	 * @generated
	 */
	void setLabelStyle(LabelStyleType value);

	/**
	 * Returns the value of the '<em><b>Lat Lon Alt Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lat Lon Alt Box</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat Lon Alt Box</em>' containment reference.
	 * @see #setLatLonAltBox(LatLonAltBoxType)
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_LatLonAltBox()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LatLonAltBox' namespace='##targetNamespace'"
	 * @generated
	 */
	LatLonAltBoxType getLatLonAltBox();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.DocumentRoot#getLatLonAltBox <em>Lat Lon Alt Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lat Lon Alt Box</em>' containment reference.
	 * @see #getLatLonAltBox()
	 * @generated
	 */
	void setLatLonAltBox(LatLonAltBoxType value);

	/**
	 * Returns the value of the '<em><b>Lat Lon Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lat Lon Box</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat Lon Box</em>' containment reference.
	 * @see #setLatLonBox(LatLonBoxType)
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_LatLonBox()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LatLonBox' namespace='##targetNamespace' affiliation='Object'"
	 * @generated
	 */
	LatLonBoxType getLatLonBox();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.DocumentRoot#getLatLonBox <em>Lat Lon Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lat Lon Box</em>' containment reference.
	 * @see #getLatLonBox()
	 * @generated
	 */
	void setLatLonBox(LatLonBoxType value);

	/**
	 * Returns the value of the '<em><b>Linear Ring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Ring</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Ring</em>' containment reference.
	 * @see #setLinearRing(LinearRingType)
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_LinearRing()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LinearRing' namespace='##targetNamespace' affiliation='Geometry'"
	 * @generated
	 */
	LinearRingType getLinearRing();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.DocumentRoot#getLinearRing <em>Linear Ring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Ring</em>' containment reference.
	 * @see #getLinearRing()
	 * @generated
	 */
	void setLinearRing(LinearRingType value);

	/**
	 * Returns the value of the '<em><b>Line String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line String</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line String</em>' containment reference.
	 * @see #setLineString(LineStringType)
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_LineString()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LineString' namespace='##targetNamespace' affiliation='Geometry'"
	 * @generated
	 */
	LineStringType getLineString();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.DocumentRoot#getLineString <em>Line String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line String</em>' containment reference.
	 * @see #getLineString()
	 * @generated
	 */
	void setLineString(LineStringType value);

	/**
	 * Returns the value of the '<em><b>Line Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Style</em>' containment reference.
	 * @see #setLineStyle(LineStyleType)
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_LineStyle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LineStyle' namespace='##targetNamespace' affiliation='Object'"
	 * @generated
	 */
	LineStyleType getLineStyle();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.DocumentRoot#getLineStyle <em>Line Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Style</em>' containment reference.
	 * @see #getLineStyle()
	 * @generated
	 */
	void setLineStyle(LineStyleType value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference.
	 * @see #setLink(LinkType)
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_Link()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Link' namespace='##targetNamespace' affiliation='Object'"
	 * @generated
	 */
	LinkType getLink();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.DocumentRoot#getLink <em>Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' containment reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(LinkType value);

	/**
	 * Returns the value of the '<em><b>List Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Style</em>' containment reference.
	 * @see #setListStyle(ListStyleType)
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_ListStyle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ListStyle' namespace='##targetNamespace' affiliation='Object'"
	 * @generated
	 */
	ListStyleType getListStyle();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.DocumentRoot#getListStyle <em>List Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Style</em>' containment reference.
	 * @see #getListStyle()
	 * @generated
	 */
	void setListStyle(ListStyleType value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(LocationType)
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_Location()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Location' namespace='##targetNamespace' affiliation='Object'"
	 * @generated
	 */
	LocationType getLocation();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.DocumentRoot#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(LocationType value);

	/**
	 * Returns the value of the '<em><b>Lod</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod</em>' containment reference.
	 * @see #setLod(LodType)
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_Lod()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Lod' namespace='##targetNamespace' affiliation='Object'"
	 * @generated
	 */
	LodType getLod();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.DocumentRoot#getLod <em>Lod</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod</em>' containment reference.
	 * @see #getLod()
	 * @generated
	 */
	void setLod(LodType value);

	/**
	 * Returns the value of the '<em><b>Look At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Look At</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Look At</em>' containment reference.
	 * @see #setLookAt(LookAtType)
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_LookAt()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LookAt' namespace='##targetNamespace' affiliation='Object'"
	 * @generated
	 */
	LookAtType getLookAt();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.DocumentRoot#getLookAt <em>Look At</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Look At</em>' containment reference.
	 * @see #getLookAt()
	 * @generated
	 */
	void setLookAt(LookAtType value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' containment reference.
	 * @see #setModel(ModelType)
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_Model()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Model' namespace='##targetNamespace' affiliation='Geometry'"
	 * @generated
	 */
	ModelType getModel();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.DocumentRoot#getModel <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' containment reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(ModelType value);

	/**
	 * Returns the value of the '<em><b>Multi Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Geometry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Geometry</em>' containment reference.
	 * @see #setMultiGeometry(MultiGeometryType)
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_MultiGeometry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MultiGeometry' namespace='##targetNamespace' affiliation='Geometry'"
	 * @generated
	 */
	MultiGeometryType getMultiGeometry();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.DocumentRoot#getMultiGeometry <em>Multi Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Geometry</em>' containment reference.
	 * @see #getMultiGeometry()
	 * @generated
	 */
	void setMultiGeometry(MultiGeometryType value);

	/**
	 * Returns the value of the '<em><b>Network Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Link</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Link</em>' containment reference.
	 * @see #setNetworkLink(NetworkLinkType)
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_NetworkLink()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NetworkLink' namespace='##targetNamespace' affiliation='Feature'"
	 * @generated
	 */
	NetworkLinkType getNetworkLink();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.DocumentRoot#getNetworkLink <em>Network Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Link</em>' containment reference.
	 * @see #getNetworkLink()
	 * @generated
	 */
	void setNetworkLink(NetworkLinkType value);

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' containment reference.
	 * @see #setOrientation(OrientationType)
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_Orientation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Orientation' namespace='##targetNamespace' affiliation='Object'"
	 * @generated
	 */
	OrientationType getOrientation();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.DocumentRoot#getOrientation <em>Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' containment reference.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(OrientationType value);

	/**
	 * Returns the value of the '<em><b>Placemark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placemark</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placemark</em>' containment reference.
	 * @see #setPlacemark(PlacemarkType)
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_Placemark()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Placemark' namespace='##targetNamespace' affiliation='Feature'"
	 * @generated
	 */
	PlacemarkType getPlacemark();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.DocumentRoot#getPlacemark <em>Placemark</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placemark</em>' containment reference.
	 * @see #getPlacemark()
	 * @generated
	 */
	void setPlacemark(PlacemarkType value);

	/**
	 * Returns the value of the '<em><b>Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point</em>' containment reference.
	 * @see #setPoint(PointType)
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_Point()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Point' namespace='##targetNamespace' affiliation='Geometry'"
	 * @generated
	 */
	PointType getPoint();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.DocumentRoot#getPoint <em>Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point</em>' containment reference.
	 * @see #getPoint()
	 * @generated
	 */
	void setPoint(PointType value);

	/**
	 * Returns the value of the '<em><b>Polygon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polygon</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygon</em>' containment reference.
	 * @see #setPolygon(PolygonType)
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_Polygon()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Polygon' namespace='##targetNamespace' affiliation='Geometry'"
	 * @generated
	 */
	PolygonType getPolygon();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.DocumentRoot#getPolygon <em>Polygon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polygon</em>' containment reference.
	 * @see #getPolygon()
	 * @generated
	 */
	void setPolygon(PolygonType value);

	/**
	 * Returns the value of the '<em><b>Poly Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Poly Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poly Style</em>' containment reference.
	 * @see #setPolyStyle(PolyStyleType)
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_PolyStyle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PolyStyle' namespace='##targetNamespace' affiliation='Object'"
	 * @generated
	 */
	PolyStyleType getPolyStyle();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.DocumentRoot#getPolyStyle <em>Poly Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poly Style</em>' containment reference.
	 * @see #getPolyStyle()
	 * @generated
	 */
	void setPolyStyle(PolyStyleType value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' containment reference.
	 * @see #setRegion(RegionType)
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_Region()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Region' namespace='##targetNamespace' affiliation='Object'"
	 * @generated
	 */
	RegionType getRegion();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.DocumentRoot#getRegion <em>Region</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' containment reference.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(RegionType value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' containment reference.
	 * @see #setScale(ScaleType)
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_Scale()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Scale' namespace='##targetNamespace' affiliation='Object'"
	 * @generated
	 */
	ScaleType getScale();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.DocumentRoot#getScale <em>Scale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' containment reference.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(ScaleType value);

	/**
	 * Returns the value of the '<em><b>Screen Overlay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Screen Overlay</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screen Overlay</em>' containment reference.
	 * @see #setScreenOverlay(ScreenOverlayType)
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_ScreenOverlay()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ScreenOverlay' namespace='##targetNamespace' affiliation='Feature'"
	 * @generated
	 */
	ScreenOverlayType getScreenOverlay();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.DocumentRoot#getScreenOverlay <em>Screen Overlay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screen Overlay</em>' containment reference.
	 * @see #getScreenOverlay()
	 * @generated
	 */
	void setScreenOverlay(ScreenOverlayType value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(StyleType)
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_Style()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Style' namespace='##targetNamespace' affiliation='StyleSelector'"
	 * @generated
	 */
	StyleType getStyle();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.DocumentRoot#getStyle <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(StyleType value);

	/**
	 * Returns the value of the '<em><b>Style Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Selector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Selector</em>' containment reference.
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_StyleSelector()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StyleSelector' namespace='##targetNamespace'"
	 * @generated
	 */
	StyleSelectorType getStyleSelector();

	/**
	 * Returns the value of the '<em><b>Style Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Map</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Map</em>' containment reference.
	 * @see #setStyleMap(StyleMapType)
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_StyleMap()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StyleMap' namespace='##targetNamespace' affiliation='StyleSelector'"
	 * @generated
	 */
	StyleMapType getStyleMap();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.DocumentRoot#getStyleMap <em>Style Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Map</em>' containment reference.
	 * @see #getStyleMap()
	 * @generated
	 */
	void setStyleMap(StyleMapType value);

	/**
	 * Returns the value of the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Url</em>' attribute.
	 * @see #setStyleUrl(String)
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_StyleUrl()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='styleUrl' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStyleUrl();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.DocumentRoot#getStyleUrl <em>Style Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Url</em>' attribute.
	 * @see #getStyleUrl()
	 * @generated
	 */
	void setStyleUrl(String value);

	/**
	 * Returns the value of the '<em><b>Time Primitive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Primitive</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Primitive</em>' containment reference.
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_TimePrimitive()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimePrimitive' namespace='##targetNamespace'"
	 * @generated
	 */
	TimePrimitiveType getTimePrimitive();

	/**
	 * Returns the value of the '<em><b>Time Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Span</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Span</em>' containment reference.
	 * @see #setTimeSpan(TimeSpanType)
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_TimeSpan()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimeSpan' namespace='##targetNamespace' affiliation='TimePrimitive'"
	 * @generated
	 */
	TimeSpanType getTimeSpan();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.DocumentRoot#getTimeSpan <em>Time Span</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Span</em>' containment reference.
	 * @see #getTimeSpan()
	 * @generated
	 */
	void setTimeSpan(TimeSpanType value);

	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Stamp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' containment reference.
	 * @see #setTimeStamp(TimeStampType)
	 * @see com.google.earth.kml._2.v21Package#getDocumentRoot_TimeStamp()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimeStamp' namespace='##targetNamespace' affiliation='TimePrimitive'"
	 * @generated
	 */
	TimeStampType getTimeStamp();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.DocumentRoot#getTimeStamp <em>Time Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' containment reference.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(TimeStampType value);

} // DocumentRoot
