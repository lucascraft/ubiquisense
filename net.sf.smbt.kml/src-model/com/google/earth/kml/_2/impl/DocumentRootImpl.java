/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2.impl;

import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import com.google.earth.kml._2.BalloonStyleType;
import com.google.earth.kml._2.DocumentRoot;
import com.google.earth.kml._2.DocumentType;
import com.google.earth.kml._2.FeatureType;
import com.google.earth.kml._2.FolderType;
import com.google.earth.kml._2.GeometryType;
import com.google.earth.kml._2.GroundOverlayType;
import com.google.earth.kml._2.IconStyleType;
import com.google.earth.kml._2.KmlType;
import com.google.earth.kml._2.LabelStyleType;
import com.google.earth.kml._2.LatLonAltBoxType;
import com.google.earth.kml._2.LatLonBoxType;
import com.google.earth.kml._2.LineStringType;
import com.google.earth.kml._2.LineStyleType;
import com.google.earth.kml._2.LinearRingType;
import com.google.earth.kml._2.LinkType;
import com.google.earth.kml._2.ListStyleType;
import com.google.earth.kml._2.LocationType;
import com.google.earth.kml._2.LodType;
import com.google.earth.kml._2.LookAtType;
import com.google.earth.kml._2.ModelType;
import com.google.earth.kml._2.MultiGeometryType;
import com.google.earth.kml._2.NetworkLinkType;
import com.google.earth.kml._2.ObjectType;
import com.google.earth.kml._2.OrientationType;
import com.google.earth.kml._2.PlacemarkType;
import com.google.earth.kml._2.PointType;
import com.google.earth.kml._2.PolyStyleType;
import com.google.earth.kml._2.PolygonType;
import com.google.earth.kml._2.RegionType;
import com.google.earth.kml._2.ScaleType;
import com.google.earth.kml._2.ScreenOverlayType;
import com.google.earth.kml._2.StyleMapType;
import com.google.earth.kml._2.StyleSelectorType;
import com.google.earth.kml._2.StyleType;
import com.google.earth.kml._2.TimePrimitiveType;
import com.google.earth.kml._2.TimeSpanType;
import com.google.earth.kml._2.TimeStampType;
import com.google.earth.kml._2.v21Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getBalloonStyle <em>Balloon Style</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getObject <em>Object</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getDocument <em>Document</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getFolder <em>Folder</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getGroundOverlay <em>Ground Overlay</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getIconStyle <em>Icon Style</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getKml <em>Kml</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getLabelStyle <em>Label Style</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getLatLonAltBox <em>Lat Lon Alt Box</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getLatLonBox <em>Lat Lon Box</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getLinearRing <em>Linear Ring</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getLineString <em>Line String</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getLink <em>Link</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getListStyle <em>List Style</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getLod <em>Lod</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getLookAt <em>Look At</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getModel <em>Model</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getMultiGeometry <em>Multi Geometry</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getNetworkLink <em>Network Link</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getPlacemark <em>Placemark</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getPoint <em>Point</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getPolygon <em>Polygon</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getPolyStyle <em>Poly Style</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getScreenOverlay <em>Screen Overlay</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getStyleSelector <em>Style Selector</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getStyleMap <em>Style Map</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getStyleUrl <em>Style Url</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getTimePrimitive <em>Time Primitive</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getTimeSpan <em>Time Span</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.DocumentRootImpl#getTimeStamp <em>Time Stamp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getCoordinates() <em>Coordinates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinates()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> COORDINATES_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStyleUrl() <em>Style Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_URL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return v21Package.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, v21Package.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, v21Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, v21Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BalloonStyleType getBalloonStyle() {
		return (BalloonStyleType)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__BALLOON_STYLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBalloonStyle(BalloonStyleType newBalloonStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(v21Package.Literals.DOCUMENT_ROOT__BALLOON_STYLE, newBalloonStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBalloonStyle(BalloonStyleType newBalloonStyle) {
		((FeatureMap.Internal)getMixed()).set(v21Package.Literals.DOCUMENT_ROOT__BALLOON_STYLE, newBalloonStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectType getObject() {
		return (ObjectType)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObject(ObjectType newObject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(v21Package.Literals.DOCUMENT_ROOT__OBJECT, newObject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<String> getCoordinates() {
		return (List<String>)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__COORDINATES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinates(List<String> newCoordinates) {
		((FeatureMap.Internal)getMixed()).set(v21Package.Literals.DOCUMENT_ROOT__COORDINATES, newCoordinates);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentType getDocument() {
		return (DocumentType)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__DOCUMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocument(DocumentType newDocument, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(v21Package.Literals.DOCUMENT_ROOT__DOCUMENT, newDocument, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocument(DocumentType newDocument) {
		((FeatureMap.Internal)getMixed()).set(v21Package.Literals.DOCUMENT_ROOT__DOCUMENT, newDocument);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureType getFeature() {
		return (FeatureType)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeature(FeatureType newFeature, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(v21Package.Literals.DOCUMENT_ROOT__FEATURE, newFeature, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FolderType getFolder() {
		return (FolderType)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__FOLDER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFolder(FolderType newFolder, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(v21Package.Literals.DOCUMENT_ROOT__FOLDER, newFolder, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFolder(FolderType newFolder) {
		((FeatureMap.Internal)getMixed()).set(v21Package.Literals.DOCUMENT_ROOT__FOLDER, newFolder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometryType getGeometry() {
		return (GeometryType)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__GEOMETRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeometry(GeometryType newGeometry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(v21Package.Literals.DOCUMENT_ROOT__GEOMETRY, newGeometry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroundOverlayType getGroundOverlay() {
		return (GroundOverlayType)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__GROUND_OVERLAY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroundOverlay(GroundOverlayType newGroundOverlay, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(v21Package.Literals.DOCUMENT_ROOT__GROUND_OVERLAY, newGroundOverlay, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroundOverlay(GroundOverlayType newGroundOverlay) {
		((FeatureMap.Internal)getMixed()).set(v21Package.Literals.DOCUMENT_ROOT__GROUND_OVERLAY, newGroundOverlay);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkType getIcon() {
		return (LinkType)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__ICON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIcon(LinkType newIcon, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(v21Package.Literals.DOCUMENT_ROOT__ICON, newIcon, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcon(LinkType newIcon) {
		((FeatureMap.Internal)getMixed()).set(v21Package.Literals.DOCUMENT_ROOT__ICON, newIcon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IconStyleType getIconStyle() {
		return (IconStyleType)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__ICON_STYLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIconStyle(IconStyleType newIconStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(v21Package.Literals.DOCUMENT_ROOT__ICON_STYLE, newIconStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIconStyle(IconStyleType newIconStyle) {
		((FeatureMap.Internal)getMixed()).set(v21Package.Literals.DOCUMENT_ROOT__ICON_STYLE, newIconStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KmlType getKml() {
		return (KmlType)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__KML, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKml(KmlType newKml, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(v21Package.Literals.DOCUMENT_ROOT__KML, newKml, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKml(KmlType newKml) {
		((FeatureMap.Internal)getMixed()).set(v21Package.Literals.DOCUMENT_ROOT__KML, newKml);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelStyleType getLabelStyle() {
		return (LabelStyleType)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__LABEL_STYLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabelStyle(LabelStyleType newLabelStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(v21Package.Literals.DOCUMENT_ROOT__LABEL_STYLE, newLabelStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelStyle(LabelStyleType newLabelStyle) {
		((FeatureMap.Internal)getMixed()).set(v21Package.Literals.DOCUMENT_ROOT__LABEL_STYLE, newLabelStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatLonAltBoxType getLatLonAltBox() {
		return (LatLonAltBoxType)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__LAT_LON_ALT_BOX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLatLonAltBox(LatLonAltBoxType newLatLonAltBox, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(v21Package.Literals.DOCUMENT_ROOT__LAT_LON_ALT_BOX, newLatLonAltBox, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatLonAltBox(LatLonAltBoxType newLatLonAltBox) {
		((FeatureMap.Internal)getMixed()).set(v21Package.Literals.DOCUMENT_ROOT__LAT_LON_ALT_BOX, newLatLonAltBox);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatLonBoxType getLatLonBox() {
		return (LatLonBoxType)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__LAT_LON_BOX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLatLonBox(LatLonBoxType newLatLonBox, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(v21Package.Literals.DOCUMENT_ROOT__LAT_LON_BOX, newLatLonBox, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatLonBox(LatLonBoxType newLatLonBox) {
		((FeatureMap.Internal)getMixed()).set(v21Package.Literals.DOCUMENT_ROOT__LAT_LON_BOX, newLatLonBox);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinearRingType getLinearRing() {
		return (LinearRingType)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__LINEAR_RING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinearRing(LinearRingType newLinearRing, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(v21Package.Literals.DOCUMENT_ROOT__LINEAR_RING, newLinearRing, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearRing(LinearRingType newLinearRing) {
		((FeatureMap.Internal)getMixed()).set(v21Package.Literals.DOCUMENT_ROOT__LINEAR_RING, newLinearRing);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineStringType getLineString() {
		return (LineStringType)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__LINE_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineString(LineStringType newLineString, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(v21Package.Literals.DOCUMENT_ROOT__LINE_STRING, newLineString, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineString(LineStringType newLineString) {
		((FeatureMap.Internal)getMixed()).set(v21Package.Literals.DOCUMENT_ROOT__LINE_STRING, newLineString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineStyleType getLineStyle() {
		return (LineStyleType)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__LINE_STYLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineStyle(LineStyleType newLineStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(v21Package.Literals.DOCUMENT_ROOT__LINE_STYLE, newLineStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineStyle(LineStyleType newLineStyle) {
		((FeatureMap.Internal)getMixed()).set(v21Package.Literals.DOCUMENT_ROOT__LINE_STYLE, newLineStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkType getLink() {
		return (LinkType)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__LINK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLink(LinkType newLink, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(v21Package.Literals.DOCUMENT_ROOT__LINK, newLink, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink(LinkType newLink) {
		((FeatureMap.Internal)getMixed()).set(v21Package.Literals.DOCUMENT_ROOT__LINK, newLink);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListStyleType getListStyle() {
		return (ListStyleType)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__LIST_STYLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListStyle(ListStyleType newListStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(v21Package.Literals.DOCUMENT_ROOT__LIST_STYLE, newListStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListStyle(ListStyleType newListStyle) {
		((FeatureMap.Internal)getMixed()).set(v21Package.Literals.DOCUMENT_ROOT__LIST_STYLE, newListStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationType getLocation() {
		return (LocationType)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__LOCATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(LocationType newLocation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(v21Package.Literals.DOCUMENT_ROOT__LOCATION, newLocation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(LocationType newLocation) {
		((FeatureMap.Internal)getMixed()).set(v21Package.Literals.DOCUMENT_ROOT__LOCATION, newLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LodType getLod() {
		return (LodType)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__LOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod(LodType newLod, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(v21Package.Literals.DOCUMENT_ROOT__LOD, newLod, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod(LodType newLod) {
		((FeatureMap.Internal)getMixed()).set(v21Package.Literals.DOCUMENT_ROOT__LOD, newLod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LookAtType getLookAt() {
		return (LookAtType)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__LOOK_AT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLookAt(LookAtType newLookAt, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(v21Package.Literals.DOCUMENT_ROOT__LOOK_AT, newLookAt, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLookAt(LookAtType newLookAt) {
		((FeatureMap.Internal)getMixed()).set(v21Package.Literals.DOCUMENT_ROOT__LOOK_AT, newLookAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelType getModel() {
		return (ModelType)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__MODEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(ModelType newModel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(v21Package.Literals.DOCUMENT_ROOT__MODEL, newModel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(ModelType newModel) {
		((FeatureMap.Internal)getMixed()).set(v21Package.Literals.DOCUMENT_ROOT__MODEL, newModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiGeometryType getMultiGeometry() {
		return (MultiGeometryType)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__MULTI_GEOMETRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiGeometry(MultiGeometryType newMultiGeometry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(v21Package.Literals.DOCUMENT_ROOT__MULTI_GEOMETRY, newMultiGeometry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiGeometry(MultiGeometryType newMultiGeometry) {
		((FeatureMap.Internal)getMixed()).set(v21Package.Literals.DOCUMENT_ROOT__MULTI_GEOMETRY, newMultiGeometry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkLinkType getNetworkLink() {
		return (NetworkLinkType)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__NETWORK_LINK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetworkLink(NetworkLinkType newNetworkLink, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(v21Package.Literals.DOCUMENT_ROOT__NETWORK_LINK, newNetworkLink, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkLink(NetworkLinkType newNetworkLink) {
		((FeatureMap.Internal)getMixed()).set(v21Package.Literals.DOCUMENT_ROOT__NETWORK_LINK, newNetworkLink);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType getOrientation() {
		return (OrientationType)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__ORIENTATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientation(OrientationType newOrientation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(v21Package.Literals.DOCUMENT_ROOT__ORIENTATION, newOrientation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(OrientationType newOrientation) {
		((FeatureMap.Internal)getMixed()).set(v21Package.Literals.DOCUMENT_ROOT__ORIENTATION, newOrientation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlacemarkType getPlacemark() {
		return (PlacemarkType)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__PLACEMARK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlacemark(PlacemarkType newPlacemark, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(v21Package.Literals.DOCUMENT_ROOT__PLACEMARK, newPlacemark, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlacemark(PlacemarkType newPlacemark) {
		((FeatureMap.Internal)getMixed()).set(v21Package.Literals.DOCUMENT_ROOT__PLACEMARK, newPlacemark);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointType getPoint() {
		return (PointType)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__POINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPoint(PointType newPoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(v21Package.Literals.DOCUMENT_ROOT__POINT, newPoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoint(PointType newPoint) {
		((FeatureMap.Internal)getMixed()).set(v21Package.Literals.DOCUMENT_ROOT__POINT, newPoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolygonType getPolygon() {
		return (PolygonType)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__POLYGON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolygon(PolygonType newPolygon, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(v21Package.Literals.DOCUMENT_ROOT__POLYGON, newPolygon, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolygon(PolygonType newPolygon) {
		((FeatureMap.Internal)getMixed()).set(v21Package.Literals.DOCUMENT_ROOT__POLYGON, newPolygon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolyStyleType getPolyStyle() {
		return (PolyStyleType)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__POLY_STYLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolyStyle(PolyStyleType newPolyStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(v21Package.Literals.DOCUMENT_ROOT__POLY_STYLE, newPolyStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolyStyle(PolyStyleType newPolyStyle) {
		((FeatureMap.Internal)getMixed()).set(v21Package.Literals.DOCUMENT_ROOT__POLY_STYLE, newPolyStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionType getRegion() {
		return (RegionType)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__REGION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegion(RegionType newRegion, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(v21Package.Literals.DOCUMENT_ROOT__REGION, newRegion, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegion(RegionType newRegion) {
		((FeatureMap.Internal)getMixed()).set(v21Package.Literals.DOCUMENT_ROOT__REGION, newRegion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScaleType getScale() {
		return (ScaleType)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__SCALE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScale(ScaleType newScale, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(v21Package.Literals.DOCUMENT_ROOT__SCALE, newScale, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(ScaleType newScale) {
		((FeatureMap.Internal)getMixed()).set(v21Package.Literals.DOCUMENT_ROOT__SCALE, newScale);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScreenOverlayType getScreenOverlay() {
		return (ScreenOverlayType)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__SCREEN_OVERLAY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScreenOverlay(ScreenOverlayType newScreenOverlay, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(v21Package.Literals.DOCUMENT_ROOT__SCREEN_OVERLAY, newScreenOverlay, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScreenOverlay(ScreenOverlayType newScreenOverlay) {
		((FeatureMap.Internal)getMixed()).set(v21Package.Literals.DOCUMENT_ROOT__SCREEN_OVERLAY, newScreenOverlay);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleType getStyle() {
		return (StyleType)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__STYLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStyle(StyleType newStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(v21Package.Literals.DOCUMENT_ROOT__STYLE, newStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(StyleType newStyle) {
		((FeatureMap.Internal)getMixed()).set(v21Package.Literals.DOCUMENT_ROOT__STYLE, newStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleSelectorType getStyleSelector() {
		return (StyleSelectorType)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__STYLE_SELECTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStyleSelector(StyleSelectorType newStyleSelector, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(v21Package.Literals.DOCUMENT_ROOT__STYLE_SELECTOR, newStyleSelector, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleMapType getStyleMap() {
		return (StyleMapType)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__STYLE_MAP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStyleMap(StyleMapType newStyleMap, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(v21Package.Literals.DOCUMENT_ROOT__STYLE_MAP, newStyleMap, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleMap(StyleMapType newStyleMap) {
		((FeatureMap.Internal)getMixed()).set(v21Package.Literals.DOCUMENT_ROOT__STYLE_MAP, newStyleMap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleUrl() {
		return (String)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__STYLE_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleUrl(String newStyleUrl) {
		((FeatureMap.Internal)getMixed()).set(v21Package.Literals.DOCUMENT_ROOT__STYLE_URL, newStyleUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePrimitiveType getTimePrimitive() {
		return (TimePrimitiveType)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__TIME_PRIMITIVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimePrimitive(TimePrimitiveType newTimePrimitive, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(v21Package.Literals.DOCUMENT_ROOT__TIME_PRIMITIVE, newTimePrimitive, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSpanType getTimeSpan() {
		return (TimeSpanType)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__TIME_SPAN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeSpan(TimeSpanType newTimeSpan, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(v21Package.Literals.DOCUMENT_ROOT__TIME_SPAN, newTimeSpan, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeSpan(TimeSpanType newTimeSpan) {
		((FeatureMap.Internal)getMixed()).set(v21Package.Literals.DOCUMENT_ROOT__TIME_SPAN, newTimeSpan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeStampType getTimeStamp() {
		return (TimeStampType)getMixed().get(v21Package.Literals.DOCUMENT_ROOT__TIME_STAMP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeStamp(TimeStampType newTimeStamp, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(v21Package.Literals.DOCUMENT_ROOT__TIME_STAMP, newTimeStamp, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeStamp(TimeStampType newTimeStamp) {
		((FeatureMap.Internal)getMixed()).set(v21Package.Literals.DOCUMENT_ROOT__TIME_STAMP, newTimeStamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case v21Package.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case v21Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case v21Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case v21Package.DOCUMENT_ROOT__BALLOON_STYLE:
				return basicSetBalloonStyle(null, msgs);
			case v21Package.DOCUMENT_ROOT__OBJECT:
				return basicSetObject(null, msgs);
			case v21Package.DOCUMENT_ROOT__DOCUMENT:
				return basicSetDocument(null, msgs);
			case v21Package.DOCUMENT_ROOT__FEATURE:
				return basicSetFeature(null, msgs);
			case v21Package.DOCUMENT_ROOT__FOLDER:
				return basicSetFolder(null, msgs);
			case v21Package.DOCUMENT_ROOT__GEOMETRY:
				return basicSetGeometry(null, msgs);
			case v21Package.DOCUMENT_ROOT__GROUND_OVERLAY:
				return basicSetGroundOverlay(null, msgs);
			case v21Package.DOCUMENT_ROOT__ICON:
				return basicSetIcon(null, msgs);
			case v21Package.DOCUMENT_ROOT__ICON_STYLE:
				return basicSetIconStyle(null, msgs);
			case v21Package.DOCUMENT_ROOT__KML:
				return basicSetKml(null, msgs);
			case v21Package.DOCUMENT_ROOT__LABEL_STYLE:
				return basicSetLabelStyle(null, msgs);
			case v21Package.DOCUMENT_ROOT__LAT_LON_ALT_BOX:
				return basicSetLatLonAltBox(null, msgs);
			case v21Package.DOCUMENT_ROOT__LAT_LON_BOX:
				return basicSetLatLonBox(null, msgs);
			case v21Package.DOCUMENT_ROOT__LINEAR_RING:
				return basicSetLinearRing(null, msgs);
			case v21Package.DOCUMENT_ROOT__LINE_STRING:
				return basicSetLineString(null, msgs);
			case v21Package.DOCUMENT_ROOT__LINE_STYLE:
				return basicSetLineStyle(null, msgs);
			case v21Package.DOCUMENT_ROOT__LINK:
				return basicSetLink(null, msgs);
			case v21Package.DOCUMENT_ROOT__LIST_STYLE:
				return basicSetListStyle(null, msgs);
			case v21Package.DOCUMENT_ROOT__LOCATION:
				return basicSetLocation(null, msgs);
			case v21Package.DOCUMENT_ROOT__LOD:
				return basicSetLod(null, msgs);
			case v21Package.DOCUMENT_ROOT__LOOK_AT:
				return basicSetLookAt(null, msgs);
			case v21Package.DOCUMENT_ROOT__MODEL:
				return basicSetModel(null, msgs);
			case v21Package.DOCUMENT_ROOT__MULTI_GEOMETRY:
				return basicSetMultiGeometry(null, msgs);
			case v21Package.DOCUMENT_ROOT__NETWORK_LINK:
				return basicSetNetworkLink(null, msgs);
			case v21Package.DOCUMENT_ROOT__ORIENTATION:
				return basicSetOrientation(null, msgs);
			case v21Package.DOCUMENT_ROOT__PLACEMARK:
				return basicSetPlacemark(null, msgs);
			case v21Package.DOCUMENT_ROOT__POINT:
				return basicSetPoint(null, msgs);
			case v21Package.DOCUMENT_ROOT__POLYGON:
				return basicSetPolygon(null, msgs);
			case v21Package.DOCUMENT_ROOT__POLY_STYLE:
				return basicSetPolyStyle(null, msgs);
			case v21Package.DOCUMENT_ROOT__REGION:
				return basicSetRegion(null, msgs);
			case v21Package.DOCUMENT_ROOT__SCALE:
				return basicSetScale(null, msgs);
			case v21Package.DOCUMENT_ROOT__SCREEN_OVERLAY:
				return basicSetScreenOverlay(null, msgs);
			case v21Package.DOCUMENT_ROOT__STYLE:
				return basicSetStyle(null, msgs);
			case v21Package.DOCUMENT_ROOT__STYLE_SELECTOR:
				return basicSetStyleSelector(null, msgs);
			case v21Package.DOCUMENT_ROOT__STYLE_MAP:
				return basicSetStyleMap(null, msgs);
			case v21Package.DOCUMENT_ROOT__TIME_PRIMITIVE:
				return basicSetTimePrimitive(null, msgs);
			case v21Package.DOCUMENT_ROOT__TIME_SPAN:
				return basicSetTimeSpan(null, msgs);
			case v21Package.DOCUMENT_ROOT__TIME_STAMP:
				return basicSetTimeStamp(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case v21Package.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case v21Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case v21Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case v21Package.DOCUMENT_ROOT__BALLOON_STYLE:
				return getBalloonStyle();
			case v21Package.DOCUMENT_ROOT__OBJECT:
				return getObject();
			case v21Package.DOCUMENT_ROOT__COORDINATES:
				return getCoordinates();
			case v21Package.DOCUMENT_ROOT__DOCUMENT:
				return getDocument();
			case v21Package.DOCUMENT_ROOT__FEATURE:
				return getFeature();
			case v21Package.DOCUMENT_ROOT__FOLDER:
				return getFolder();
			case v21Package.DOCUMENT_ROOT__GEOMETRY:
				return getGeometry();
			case v21Package.DOCUMENT_ROOT__GROUND_OVERLAY:
				return getGroundOverlay();
			case v21Package.DOCUMENT_ROOT__ICON:
				return getIcon();
			case v21Package.DOCUMENT_ROOT__ICON_STYLE:
				return getIconStyle();
			case v21Package.DOCUMENT_ROOT__KML:
				return getKml();
			case v21Package.DOCUMENT_ROOT__LABEL_STYLE:
				return getLabelStyle();
			case v21Package.DOCUMENT_ROOT__LAT_LON_ALT_BOX:
				return getLatLonAltBox();
			case v21Package.DOCUMENT_ROOT__LAT_LON_BOX:
				return getLatLonBox();
			case v21Package.DOCUMENT_ROOT__LINEAR_RING:
				return getLinearRing();
			case v21Package.DOCUMENT_ROOT__LINE_STRING:
				return getLineString();
			case v21Package.DOCUMENT_ROOT__LINE_STYLE:
				return getLineStyle();
			case v21Package.DOCUMENT_ROOT__LINK:
				return getLink();
			case v21Package.DOCUMENT_ROOT__LIST_STYLE:
				return getListStyle();
			case v21Package.DOCUMENT_ROOT__LOCATION:
				return getLocation();
			case v21Package.DOCUMENT_ROOT__LOD:
				return getLod();
			case v21Package.DOCUMENT_ROOT__LOOK_AT:
				return getLookAt();
			case v21Package.DOCUMENT_ROOT__MODEL:
				return getModel();
			case v21Package.DOCUMENT_ROOT__MULTI_GEOMETRY:
				return getMultiGeometry();
			case v21Package.DOCUMENT_ROOT__NETWORK_LINK:
				return getNetworkLink();
			case v21Package.DOCUMENT_ROOT__ORIENTATION:
				return getOrientation();
			case v21Package.DOCUMENT_ROOT__PLACEMARK:
				return getPlacemark();
			case v21Package.DOCUMENT_ROOT__POINT:
				return getPoint();
			case v21Package.DOCUMENT_ROOT__POLYGON:
				return getPolygon();
			case v21Package.DOCUMENT_ROOT__POLY_STYLE:
				return getPolyStyle();
			case v21Package.DOCUMENT_ROOT__REGION:
				return getRegion();
			case v21Package.DOCUMENT_ROOT__SCALE:
				return getScale();
			case v21Package.DOCUMENT_ROOT__SCREEN_OVERLAY:
				return getScreenOverlay();
			case v21Package.DOCUMENT_ROOT__STYLE:
				return getStyle();
			case v21Package.DOCUMENT_ROOT__STYLE_SELECTOR:
				return getStyleSelector();
			case v21Package.DOCUMENT_ROOT__STYLE_MAP:
				return getStyleMap();
			case v21Package.DOCUMENT_ROOT__STYLE_URL:
				return getStyleUrl();
			case v21Package.DOCUMENT_ROOT__TIME_PRIMITIVE:
				return getTimePrimitive();
			case v21Package.DOCUMENT_ROOT__TIME_SPAN:
				return getTimeSpan();
			case v21Package.DOCUMENT_ROOT__TIME_STAMP:
				return getTimeStamp();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case v21Package.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case v21Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case v21Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case v21Package.DOCUMENT_ROOT__BALLOON_STYLE:
				setBalloonStyle((BalloonStyleType)newValue);
				return;
			case v21Package.DOCUMENT_ROOT__COORDINATES:
				setCoordinates((List<String>)newValue);
				return;
			case v21Package.DOCUMENT_ROOT__DOCUMENT:
				setDocument((DocumentType)newValue);
				return;
			case v21Package.DOCUMENT_ROOT__FOLDER:
				setFolder((FolderType)newValue);
				return;
			case v21Package.DOCUMENT_ROOT__GROUND_OVERLAY:
				setGroundOverlay((GroundOverlayType)newValue);
				return;
			case v21Package.DOCUMENT_ROOT__ICON:
				setIcon((LinkType)newValue);
				return;
			case v21Package.DOCUMENT_ROOT__ICON_STYLE:
				setIconStyle((IconStyleType)newValue);
				return;
			case v21Package.DOCUMENT_ROOT__KML:
				setKml((KmlType)newValue);
				return;
			case v21Package.DOCUMENT_ROOT__LABEL_STYLE:
				setLabelStyle((LabelStyleType)newValue);
				return;
			case v21Package.DOCUMENT_ROOT__LAT_LON_ALT_BOX:
				setLatLonAltBox((LatLonAltBoxType)newValue);
				return;
			case v21Package.DOCUMENT_ROOT__LAT_LON_BOX:
				setLatLonBox((LatLonBoxType)newValue);
				return;
			case v21Package.DOCUMENT_ROOT__LINEAR_RING:
				setLinearRing((LinearRingType)newValue);
				return;
			case v21Package.DOCUMENT_ROOT__LINE_STRING:
				setLineString((LineStringType)newValue);
				return;
			case v21Package.DOCUMENT_ROOT__LINE_STYLE:
				setLineStyle((LineStyleType)newValue);
				return;
			case v21Package.DOCUMENT_ROOT__LINK:
				setLink((LinkType)newValue);
				return;
			case v21Package.DOCUMENT_ROOT__LIST_STYLE:
				setListStyle((ListStyleType)newValue);
				return;
			case v21Package.DOCUMENT_ROOT__LOCATION:
				setLocation((LocationType)newValue);
				return;
			case v21Package.DOCUMENT_ROOT__LOD:
				setLod((LodType)newValue);
				return;
			case v21Package.DOCUMENT_ROOT__LOOK_AT:
				setLookAt((LookAtType)newValue);
				return;
			case v21Package.DOCUMENT_ROOT__MODEL:
				setModel((ModelType)newValue);
				return;
			case v21Package.DOCUMENT_ROOT__MULTI_GEOMETRY:
				setMultiGeometry((MultiGeometryType)newValue);
				return;
			case v21Package.DOCUMENT_ROOT__NETWORK_LINK:
				setNetworkLink((NetworkLinkType)newValue);
				return;
			case v21Package.DOCUMENT_ROOT__ORIENTATION:
				setOrientation((OrientationType)newValue);
				return;
			case v21Package.DOCUMENT_ROOT__PLACEMARK:
				setPlacemark((PlacemarkType)newValue);
				return;
			case v21Package.DOCUMENT_ROOT__POINT:
				setPoint((PointType)newValue);
				return;
			case v21Package.DOCUMENT_ROOT__POLYGON:
				setPolygon((PolygonType)newValue);
				return;
			case v21Package.DOCUMENT_ROOT__POLY_STYLE:
				setPolyStyle((PolyStyleType)newValue);
				return;
			case v21Package.DOCUMENT_ROOT__REGION:
				setRegion((RegionType)newValue);
				return;
			case v21Package.DOCUMENT_ROOT__SCALE:
				setScale((ScaleType)newValue);
				return;
			case v21Package.DOCUMENT_ROOT__SCREEN_OVERLAY:
				setScreenOverlay((ScreenOverlayType)newValue);
				return;
			case v21Package.DOCUMENT_ROOT__STYLE:
				setStyle((StyleType)newValue);
				return;
			case v21Package.DOCUMENT_ROOT__STYLE_MAP:
				setStyleMap((StyleMapType)newValue);
				return;
			case v21Package.DOCUMENT_ROOT__STYLE_URL:
				setStyleUrl((String)newValue);
				return;
			case v21Package.DOCUMENT_ROOT__TIME_SPAN:
				setTimeSpan((TimeSpanType)newValue);
				return;
			case v21Package.DOCUMENT_ROOT__TIME_STAMP:
				setTimeStamp((TimeStampType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case v21Package.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case v21Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case v21Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case v21Package.DOCUMENT_ROOT__BALLOON_STYLE:
				setBalloonStyle((BalloonStyleType)null);
				return;
			case v21Package.DOCUMENT_ROOT__COORDINATES:
				setCoordinates(COORDINATES_EDEFAULT);
				return;
			case v21Package.DOCUMENT_ROOT__DOCUMENT:
				setDocument((DocumentType)null);
				return;
			case v21Package.DOCUMENT_ROOT__FOLDER:
				setFolder((FolderType)null);
				return;
			case v21Package.DOCUMENT_ROOT__GROUND_OVERLAY:
				setGroundOverlay((GroundOverlayType)null);
				return;
			case v21Package.DOCUMENT_ROOT__ICON:
				setIcon((LinkType)null);
				return;
			case v21Package.DOCUMENT_ROOT__ICON_STYLE:
				setIconStyle((IconStyleType)null);
				return;
			case v21Package.DOCUMENT_ROOT__KML:
				setKml((KmlType)null);
				return;
			case v21Package.DOCUMENT_ROOT__LABEL_STYLE:
				setLabelStyle((LabelStyleType)null);
				return;
			case v21Package.DOCUMENT_ROOT__LAT_LON_ALT_BOX:
				setLatLonAltBox((LatLonAltBoxType)null);
				return;
			case v21Package.DOCUMENT_ROOT__LAT_LON_BOX:
				setLatLonBox((LatLonBoxType)null);
				return;
			case v21Package.DOCUMENT_ROOT__LINEAR_RING:
				setLinearRing((LinearRingType)null);
				return;
			case v21Package.DOCUMENT_ROOT__LINE_STRING:
				setLineString((LineStringType)null);
				return;
			case v21Package.DOCUMENT_ROOT__LINE_STYLE:
				setLineStyle((LineStyleType)null);
				return;
			case v21Package.DOCUMENT_ROOT__LINK:
				setLink((LinkType)null);
				return;
			case v21Package.DOCUMENT_ROOT__LIST_STYLE:
				setListStyle((ListStyleType)null);
				return;
			case v21Package.DOCUMENT_ROOT__LOCATION:
				setLocation((LocationType)null);
				return;
			case v21Package.DOCUMENT_ROOT__LOD:
				setLod((LodType)null);
				return;
			case v21Package.DOCUMENT_ROOT__LOOK_AT:
				setLookAt((LookAtType)null);
				return;
			case v21Package.DOCUMENT_ROOT__MODEL:
				setModel((ModelType)null);
				return;
			case v21Package.DOCUMENT_ROOT__MULTI_GEOMETRY:
				setMultiGeometry((MultiGeometryType)null);
				return;
			case v21Package.DOCUMENT_ROOT__NETWORK_LINK:
				setNetworkLink((NetworkLinkType)null);
				return;
			case v21Package.DOCUMENT_ROOT__ORIENTATION:
				setOrientation((OrientationType)null);
				return;
			case v21Package.DOCUMENT_ROOT__PLACEMARK:
				setPlacemark((PlacemarkType)null);
				return;
			case v21Package.DOCUMENT_ROOT__POINT:
				setPoint((PointType)null);
				return;
			case v21Package.DOCUMENT_ROOT__POLYGON:
				setPolygon((PolygonType)null);
				return;
			case v21Package.DOCUMENT_ROOT__POLY_STYLE:
				setPolyStyle((PolyStyleType)null);
				return;
			case v21Package.DOCUMENT_ROOT__REGION:
				setRegion((RegionType)null);
				return;
			case v21Package.DOCUMENT_ROOT__SCALE:
				setScale((ScaleType)null);
				return;
			case v21Package.DOCUMENT_ROOT__SCREEN_OVERLAY:
				setScreenOverlay((ScreenOverlayType)null);
				return;
			case v21Package.DOCUMENT_ROOT__STYLE:
				setStyle((StyleType)null);
				return;
			case v21Package.DOCUMENT_ROOT__STYLE_MAP:
				setStyleMap((StyleMapType)null);
				return;
			case v21Package.DOCUMENT_ROOT__STYLE_URL:
				setStyleUrl(STYLE_URL_EDEFAULT);
				return;
			case v21Package.DOCUMENT_ROOT__TIME_SPAN:
				setTimeSpan((TimeSpanType)null);
				return;
			case v21Package.DOCUMENT_ROOT__TIME_STAMP:
				setTimeStamp((TimeStampType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case v21Package.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case v21Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case v21Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case v21Package.DOCUMENT_ROOT__BALLOON_STYLE:
				return getBalloonStyle() != null;
			case v21Package.DOCUMENT_ROOT__OBJECT:
				return getObject() != null;
			case v21Package.DOCUMENT_ROOT__COORDINATES:
				return COORDINATES_EDEFAULT == null ? getCoordinates() != null : !COORDINATES_EDEFAULT.equals(getCoordinates());
			case v21Package.DOCUMENT_ROOT__DOCUMENT:
				return getDocument() != null;
			case v21Package.DOCUMENT_ROOT__FEATURE:
				return getFeature() != null;
			case v21Package.DOCUMENT_ROOT__FOLDER:
				return getFolder() != null;
			case v21Package.DOCUMENT_ROOT__GEOMETRY:
				return getGeometry() != null;
			case v21Package.DOCUMENT_ROOT__GROUND_OVERLAY:
				return getGroundOverlay() != null;
			case v21Package.DOCUMENT_ROOT__ICON:
				return getIcon() != null;
			case v21Package.DOCUMENT_ROOT__ICON_STYLE:
				return getIconStyle() != null;
			case v21Package.DOCUMENT_ROOT__KML:
				return getKml() != null;
			case v21Package.DOCUMENT_ROOT__LABEL_STYLE:
				return getLabelStyle() != null;
			case v21Package.DOCUMENT_ROOT__LAT_LON_ALT_BOX:
				return getLatLonAltBox() != null;
			case v21Package.DOCUMENT_ROOT__LAT_LON_BOX:
				return getLatLonBox() != null;
			case v21Package.DOCUMENT_ROOT__LINEAR_RING:
				return getLinearRing() != null;
			case v21Package.DOCUMENT_ROOT__LINE_STRING:
				return getLineString() != null;
			case v21Package.DOCUMENT_ROOT__LINE_STYLE:
				return getLineStyle() != null;
			case v21Package.DOCUMENT_ROOT__LINK:
				return getLink() != null;
			case v21Package.DOCUMENT_ROOT__LIST_STYLE:
				return getListStyle() != null;
			case v21Package.DOCUMENT_ROOT__LOCATION:
				return getLocation() != null;
			case v21Package.DOCUMENT_ROOT__LOD:
				return getLod() != null;
			case v21Package.DOCUMENT_ROOT__LOOK_AT:
				return getLookAt() != null;
			case v21Package.DOCUMENT_ROOT__MODEL:
				return getModel() != null;
			case v21Package.DOCUMENT_ROOT__MULTI_GEOMETRY:
				return getMultiGeometry() != null;
			case v21Package.DOCUMENT_ROOT__NETWORK_LINK:
				return getNetworkLink() != null;
			case v21Package.DOCUMENT_ROOT__ORIENTATION:
				return getOrientation() != null;
			case v21Package.DOCUMENT_ROOT__PLACEMARK:
				return getPlacemark() != null;
			case v21Package.DOCUMENT_ROOT__POINT:
				return getPoint() != null;
			case v21Package.DOCUMENT_ROOT__POLYGON:
				return getPolygon() != null;
			case v21Package.DOCUMENT_ROOT__POLY_STYLE:
				return getPolyStyle() != null;
			case v21Package.DOCUMENT_ROOT__REGION:
				return getRegion() != null;
			case v21Package.DOCUMENT_ROOT__SCALE:
				return getScale() != null;
			case v21Package.DOCUMENT_ROOT__SCREEN_OVERLAY:
				return getScreenOverlay() != null;
			case v21Package.DOCUMENT_ROOT__STYLE:
				return getStyle() != null;
			case v21Package.DOCUMENT_ROOT__STYLE_SELECTOR:
				return getStyleSelector() != null;
			case v21Package.DOCUMENT_ROOT__STYLE_MAP:
				return getStyleMap() != null;
			case v21Package.DOCUMENT_ROOT__STYLE_URL:
				return STYLE_URL_EDEFAULT == null ? getStyleUrl() != null : !STYLE_URL_EDEFAULT.equals(getStyleUrl());
			case v21Package.DOCUMENT_ROOT__TIME_PRIMITIVE:
				return getTimePrimitive() != null;
			case v21Package.DOCUMENT_ROOT__TIME_SPAN:
				return getTimeSpan() != null;
			case v21Package.DOCUMENT_ROOT__TIME_STAMP:
				return getTimeStamp() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
