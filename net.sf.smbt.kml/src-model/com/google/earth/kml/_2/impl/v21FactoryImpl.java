/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2.impl;

import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import com.google.earth.kml._2.AltitudeModeEnum;
import com.google.earth.kml._2.BalloonStyleType;
import com.google.earth.kml._2.BoundaryType;
import com.google.earth.kml._2.ChangeType;
import com.google.earth.kml._2.ColorModeEnum;
import com.google.earth.kml._2.CreateType;
import com.google.earth.kml._2.DeleteType;
import com.google.earth.kml._2.DocumentRoot;
import com.google.earth.kml._2.DocumentType;
import com.google.earth.kml._2.FolderType;
import com.google.earth.kml._2.GroundOverlayType;
import com.google.earth.kml._2.IconStyleIconType;
import com.google.earth.kml._2.IconStyleType;
import com.google.earth.kml._2.IconType;
import com.google.earth.kml._2.ItemIconStateEnum;
import com.google.earth.kml._2.ItemIconType;
import com.google.earth.kml._2.KmlType;
import com.google.earth.kml._2.LabelStyleType;
import com.google.earth.kml._2.LatLonAltBoxType;
import com.google.earth.kml._2.LatLonBoxType;
import com.google.earth.kml._2.LineStringType;
import com.google.earth.kml._2.LineStyleType;
import com.google.earth.kml._2.LinearRingType;
import com.google.earth.kml._2.LinkType;
import com.google.earth.kml._2.ListItemTypeEnum;
import com.google.earth.kml._2.ListStyleType;
import com.google.earth.kml._2.LocationType;
import com.google.earth.kml._2.LodType;
import com.google.earth.kml._2.LookAtType;
import com.google.earth.kml._2.MetadataType;
import com.google.earth.kml._2.ModelType;
import com.google.earth.kml._2.MultiGeometryType;
import com.google.earth.kml._2.NetworkLinkControlType;
import com.google.earth.kml._2.NetworkLinkType;
import com.google.earth.kml._2.OrientationType;
import com.google.earth.kml._2.PlacemarkType;
import com.google.earth.kml._2.PointType;
import com.google.earth.kml._2.PolyStyleType;
import com.google.earth.kml._2.PolygonType;
import com.google.earth.kml._2.RefreshModeEnum;
import com.google.earth.kml._2.RegionType;
import com.google.earth.kml._2.ReplaceType;
import com.google.earth.kml._2.ScaleType;
import com.google.earth.kml._2.ScreenOverlayType;
import com.google.earth.kml._2.SnippetType;
import com.google.earth.kml._2.StyleMapPairType;
import com.google.earth.kml._2.StyleMapType;
import com.google.earth.kml._2.StyleStateEnum;
import com.google.earth.kml._2.StyleType;
import com.google.earth.kml._2.TimeSpanType;
import com.google.earth.kml._2.TimeStampType;
import com.google.earth.kml._2.UnitsEnum;
import com.google.earth.kml._2.UpdateType;
import com.google.earth.kml._2.Vec2Type;
import com.google.earth.kml._2.ViewRefreshModeEnum;
import com.google.earth.kml._2.v21Factory;
import com.google.earth.kml._2.v21Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class v21FactoryImpl extends EFactoryImpl implements v21Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static v21Factory init() {
		try {
			v21Factory thev21Factory = (v21Factory)EPackage.Registry.INSTANCE.getEFactory("http://earth.google.com/kml/2.1"); 
			if (thev21Factory != null) {
				return thev21Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new v21FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public v21FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case v21Package.BALLOON_STYLE_TYPE: return createBalloonStyleType();
			case v21Package.BOUNDARY_TYPE: return createBoundaryType();
			case v21Package.CHANGE_TYPE: return createChangeType();
			case v21Package.CREATE_TYPE: return createCreateType();
			case v21Package.DELETE_TYPE: return createDeleteType();
			case v21Package.DOCUMENT_ROOT: return createDocumentRoot();
			case v21Package.DOCUMENT_TYPE: return createDocumentType();
			case v21Package.FOLDER_TYPE: return createFolderType();
			case v21Package.GROUND_OVERLAY_TYPE: return createGroundOverlayType();
			case v21Package.ICON_STYLE_ICON_TYPE: return createIconStyleIconType();
			case v21Package.ICON_STYLE_TYPE: return createIconStyleType();
			case v21Package.ICON_TYPE: return createIconType();
			case v21Package.ITEM_ICON_TYPE: return createItemIconType();
			case v21Package.KML_TYPE: return createKmlType();
			case v21Package.LABEL_STYLE_TYPE: return createLabelStyleType();
			case v21Package.LAT_LON_ALT_BOX_TYPE: return createLatLonAltBoxType();
			case v21Package.LAT_LON_BOX_TYPE: return createLatLonBoxType();
			case v21Package.LINEAR_RING_TYPE: return createLinearRingType();
			case v21Package.LINE_STRING_TYPE: return createLineStringType();
			case v21Package.LINE_STYLE_TYPE: return createLineStyleType();
			case v21Package.LINK_TYPE: return createLinkType();
			case v21Package.LIST_STYLE_TYPE: return createListStyleType();
			case v21Package.LOCATION_TYPE: return createLocationType();
			case v21Package.LOD_TYPE: return createLodType();
			case v21Package.LOOK_AT_TYPE: return createLookAtType();
			case v21Package.METADATA_TYPE: return createMetadataType();
			case v21Package.MODEL_TYPE: return createModelType();
			case v21Package.MULTI_GEOMETRY_TYPE: return createMultiGeometryType();
			case v21Package.NETWORK_LINK_CONTROL_TYPE: return createNetworkLinkControlType();
			case v21Package.NETWORK_LINK_TYPE: return createNetworkLinkType();
			case v21Package.ORIENTATION_TYPE: return createOrientationType();
			case v21Package.PLACEMARK_TYPE: return createPlacemarkType();
			case v21Package.POINT_TYPE: return createPointType();
			case v21Package.POLYGON_TYPE: return createPolygonType();
			case v21Package.POLY_STYLE_TYPE: return createPolyStyleType();
			case v21Package.REGION_TYPE: return createRegionType();
			case v21Package.REPLACE_TYPE: return createReplaceType();
			case v21Package.SCALE_TYPE: return createScaleType();
			case v21Package.SCREEN_OVERLAY_TYPE: return createScreenOverlayType();
			case v21Package.SNIPPET_TYPE: return createSnippetType();
			case v21Package.STYLE_MAP_PAIR_TYPE: return createStyleMapPairType();
			case v21Package.STYLE_MAP_TYPE: return createStyleMapType();
			case v21Package.STYLE_TYPE: return createStyleType();
			case v21Package.TIME_SPAN_TYPE: return createTimeSpanType();
			case v21Package.TIME_STAMP_TYPE: return createTimeStampType();
			case v21Package.UPDATE_TYPE: return createUpdateType();
			case v21Package.VEC2_TYPE: return createVec2Type();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case v21Package.ALTITUDE_MODE_ENUM:
				return createAltitudeModeEnumFromString(eDataType, initialValue);
			case v21Package.COLOR_MODE_ENUM:
				return createColorModeEnumFromString(eDataType, initialValue);
			case v21Package.ITEM_ICON_STATE_ENUM:
				return createItemIconStateEnumFromString(eDataType, initialValue);
			case v21Package.LIST_ITEM_TYPE_ENUM:
				return createListItemTypeEnumFromString(eDataType, initialValue);
			case v21Package.REFRESH_MODE_ENUM:
				return createRefreshModeEnumFromString(eDataType, initialValue);
			case v21Package.STYLE_STATE_ENUM:
				return createStyleStateEnumFromString(eDataType, initialValue);
			case v21Package.UNITS_ENUM:
				return createUnitsEnumFromString(eDataType, initialValue);
			case v21Package.VIEW_REFRESH_MODE_ENUM:
				return createViewRefreshModeEnumFromString(eDataType, initialValue);
			case v21Package.ALTITUDE_MODE_ENUM_OBJECT:
				return createAltitudeModeEnumObjectFromString(eDataType, initialValue);
			case v21Package.ANGLE180:
				return createAngle180FromString(eDataType, initialValue);
			case v21Package.ANGLE180_OBJECT:
				return createAngle180ObjectFromString(eDataType, initialValue);
			case v21Package.ANGLE360:
				return createAngle360FromString(eDataType, initialValue);
			case v21Package.ANGLE360_OBJECT:
				return createAngle360ObjectFromString(eDataType, initialValue);
			case v21Package.ANGLE90:
				return createAngle90FromString(eDataType, initialValue);
			case v21Package.ANGLE90_OBJECT:
				return createAngle90ObjectFromString(eDataType, initialValue);
			case v21Package.ANGLEPOS90:
				return createAnglepos90FromString(eDataType, initialValue);
			case v21Package.ANGLEPOS90_OBJECT:
				return createAnglepos90ObjectFromString(eDataType, initialValue);
			case v21Package.COLOR:
				return createColorFromString(eDataType, initialValue);
			case v21Package.COLOR_MODE_ENUM_OBJECT:
				return createColorModeEnumObjectFromString(eDataType, initialValue);
			case v21Package.COORDINATES_TYPE:
				return createCoordinatesTypeFromString(eDataType, initialValue);
			case v21Package.DATE_TIME_TYPE:
				return createDateTimeTypeFromString(eDataType, initialValue);
			case v21Package.ITEM_ICON_STATE_ENUM_OBJECT:
				return createItemIconStateEnumObjectFromString(eDataType, initialValue);
			case v21Package.ITEM_ICON_STATE_TYPE:
				return createItemIconStateTypeFromString(eDataType, initialValue);
			case v21Package.LIST_ITEM_TYPE_ENUM_OBJECT:
				return createListItemTypeEnumObjectFromString(eDataType, initialValue);
			case v21Package.REFRESH_MODE_ENUM_OBJECT:
				return createRefreshModeEnumObjectFromString(eDataType, initialValue);
			case v21Package.STYLE_STATE_ENUM_OBJECT:
				return createStyleStateEnumObjectFromString(eDataType, initialValue);
			case v21Package.UNITS_ENUM_OBJECT:
				return createUnitsEnumObjectFromString(eDataType, initialValue);
			case v21Package.VIEW_REFRESH_MODE_ENUM_OBJECT:
				return createViewRefreshModeEnumObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case v21Package.ALTITUDE_MODE_ENUM:
				return convertAltitudeModeEnumToString(eDataType, instanceValue);
			case v21Package.COLOR_MODE_ENUM:
				return convertColorModeEnumToString(eDataType, instanceValue);
			case v21Package.ITEM_ICON_STATE_ENUM:
				return convertItemIconStateEnumToString(eDataType, instanceValue);
			case v21Package.LIST_ITEM_TYPE_ENUM:
				return convertListItemTypeEnumToString(eDataType, instanceValue);
			case v21Package.REFRESH_MODE_ENUM:
				return convertRefreshModeEnumToString(eDataType, instanceValue);
			case v21Package.STYLE_STATE_ENUM:
				return convertStyleStateEnumToString(eDataType, instanceValue);
			case v21Package.UNITS_ENUM:
				return convertUnitsEnumToString(eDataType, instanceValue);
			case v21Package.VIEW_REFRESH_MODE_ENUM:
				return convertViewRefreshModeEnumToString(eDataType, instanceValue);
			case v21Package.ALTITUDE_MODE_ENUM_OBJECT:
				return convertAltitudeModeEnumObjectToString(eDataType, instanceValue);
			case v21Package.ANGLE180:
				return convertAngle180ToString(eDataType, instanceValue);
			case v21Package.ANGLE180_OBJECT:
				return convertAngle180ObjectToString(eDataType, instanceValue);
			case v21Package.ANGLE360:
				return convertAngle360ToString(eDataType, instanceValue);
			case v21Package.ANGLE360_OBJECT:
				return convertAngle360ObjectToString(eDataType, instanceValue);
			case v21Package.ANGLE90:
				return convertAngle90ToString(eDataType, instanceValue);
			case v21Package.ANGLE90_OBJECT:
				return convertAngle90ObjectToString(eDataType, instanceValue);
			case v21Package.ANGLEPOS90:
				return convertAnglepos90ToString(eDataType, instanceValue);
			case v21Package.ANGLEPOS90_OBJECT:
				return convertAnglepos90ObjectToString(eDataType, instanceValue);
			case v21Package.COLOR:
				return convertColorToString(eDataType, instanceValue);
			case v21Package.COLOR_MODE_ENUM_OBJECT:
				return convertColorModeEnumObjectToString(eDataType, instanceValue);
			case v21Package.COORDINATES_TYPE:
				return convertCoordinatesTypeToString(eDataType, instanceValue);
			case v21Package.DATE_TIME_TYPE:
				return convertDateTimeTypeToString(eDataType, instanceValue);
			case v21Package.ITEM_ICON_STATE_ENUM_OBJECT:
				return convertItemIconStateEnumObjectToString(eDataType, instanceValue);
			case v21Package.ITEM_ICON_STATE_TYPE:
				return convertItemIconStateTypeToString(eDataType, instanceValue);
			case v21Package.LIST_ITEM_TYPE_ENUM_OBJECT:
				return convertListItemTypeEnumObjectToString(eDataType, instanceValue);
			case v21Package.REFRESH_MODE_ENUM_OBJECT:
				return convertRefreshModeEnumObjectToString(eDataType, instanceValue);
			case v21Package.STYLE_STATE_ENUM_OBJECT:
				return convertStyleStateEnumObjectToString(eDataType, instanceValue);
			case v21Package.UNITS_ENUM_OBJECT:
				return convertUnitsEnumObjectToString(eDataType, instanceValue);
			case v21Package.VIEW_REFRESH_MODE_ENUM_OBJECT:
				return convertViewRefreshModeEnumObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BalloonStyleType createBalloonStyleType() {
		BalloonStyleTypeImpl balloonStyleType = new BalloonStyleTypeImpl();
		return balloonStyleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundaryType createBoundaryType() {
		BoundaryTypeImpl boundaryType = new BoundaryTypeImpl();
		return boundaryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeType createChangeType() {
		ChangeTypeImpl changeType = new ChangeTypeImpl();
		return changeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateType createCreateType() {
		CreateTypeImpl createType = new CreateTypeImpl();
		return createType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteType createDeleteType() {
		DeleteTypeImpl deleteType = new DeleteTypeImpl();
		return deleteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentType createDocumentType() {
		DocumentTypeImpl documentType = new DocumentTypeImpl();
		return documentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FolderType createFolderType() {
		FolderTypeImpl folderType = new FolderTypeImpl();
		return folderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroundOverlayType createGroundOverlayType() {
		GroundOverlayTypeImpl groundOverlayType = new GroundOverlayTypeImpl();
		return groundOverlayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IconStyleIconType createIconStyleIconType() {
		IconStyleIconTypeImpl iconStyleIconType = new IconStyleIconTypeImpl();
		return iconStyleIconType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IconStyleType createIconStyleType() {
		IconStyleTypeImpl iconStyleType = new IconStyleTypeImpl();
		return iconStyleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IconType createIconType() {
		IconTypeImpl iconType = new IconTypeImpl();
		return iconType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemIconType createItemIconType() {
		ItemIconTypeImpl itemIconType = new ItemIconTypeImpl();
		return itemIconType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KmlType createKmlType() {
		KmlTypeImpl kmlType = new KmlTypeImpl();
		return kmlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelStyleType createLabelStyleType() {
		LabelStyleTypeImpl labelStyleType = new LabelStyleTypeImpl();
		return labelStyleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatLonAltBoxType createLatLonAltBoxType() {
		LatLonAltBoxTypeImpl latLonAltBoxType = new LatLonAltBoxTypeImpl();
		return latLonAltBoxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatLonBoxType createLatLonBoxType() {
		LatLonBoxTypeImpl latLonBoxType = new LatLonBoxTypeImpl();
		return latLonBoxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinearRingType createLinearRingType() {
		LinearRingTypeImpl linearRingType = new LinearRingTypeImpl();
		return linearRingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineStringType createLineStringType() {
		LineStringTypeImpl lineStringType = new LineStringTypeImpl();
		return lineStringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineStyleType createLineStyleType() {
		LineStyleTypeImpl lineStyleType = new LineStyleTypeImpl();
		return lineStyleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkType createLinkType() {
		LinkTypeImpl linkType = new LinkTypeImpl();
		return linkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListStyleType createListStyleType() {
		ListStyleTypeImpl listStyleType = new ListStyleTypeImpl();
		return listStyleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationType createLocationType() {
		LocationTypeImpl locationType = new LocationTypeImpl();
		return locationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LodType createLodType() {
		LodTypeImpl lodType = new LodTypeImpl();
		return lodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LookAtType createLookAtType() {
		LookAtTypeImpl lookAtType = new LookAtTypeImpl();
		return lookAtType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataType createMetadataType() {
		MetadataTypeImpl metadataType = new MetadataTypeImpl();
		return metadataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelType createModelType() {
		ModelTypeImpl modelType = new ModelTypeImpl();
		return modelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiGeometryType createMultiGeometryType() {
		MultiGeometryTypeImpl multiGeometryType = new MultiGeometryTypeImpl();
		return multiGeometryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkLinkControlType createNetworkLinkControlType() {
		NetworkLinkControlTypeImpl networkLinkControlType = new NetworkLinkControlTypeImpl();
		return networkLinkControlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkLinkType createNetworkLinkType() {
		NetworkLinkTypeImpl networkLinkType = new NetworkLinkTypeImpl();
		return networkLinkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType createOrientationType() {
		OrientationTypeImpl orientationType = new OrientationTypeImpl();
		return orientationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlacemarkType createPlacemarkType() {
		PlacemarkTypeImpl placemarkType = new PlacemarkTypeImpl();
		return placemarkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointType createPointType() {
		PointTypeImpl pointType = new PointTypeImpl();
		return pointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolygonType createPolygonType() {
		PolygonTypeImpl polygonType = new PolygonTypeImpl();
		return polygonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolyStyleType createPolyStyleType() {
		PolyStyleTypeImpl polyStyleType = new PolyStyleTypeImpl();
		return polyStyleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionType createRegionType() {
		RegionTypeImpl regionType = new RegionTypeImpl();
		return regionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplaceType createReplaceType() {
		ReplaceTypeImpl replaceType = new ReplaceTypeImpl();
		return replaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScaleType createScaleType() {
		ScaleTypeImpl scaleType = new ScaleTypeImpl();
		return scaleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScreenOverlayType createScreenOverlayType() {
		ScreenOverlayTypeImpl screenOverlayType = new ScreenOverlayTypeImpl();
		return screenOverlayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnippetType createSnippetType() {
		SnippetTypeImpl snippetType = new SnippetTypeImpl();
		return snippetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleMapPairType createStyleMapPairType() {
		StyleMapPairTypeImpl styleMapPairType = new StyleMapPairTypeImpl();
		return styleMapPairType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleMapType createStyleMapType() {
		StyleMapTypeImpl styleMapType = new StyleMapTypeImpl();
		return styleMapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleType createStyleType() {
		StyleTypeImpl styleType = new StyleTypeImpl();
		return styleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSpanType createTimeSpanType() {
		TimeSpanTypeImpl timeSpanType = new TimeSpanTypeImpl();
		return timeSpanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeStampType createTimeStampType() {
		TimeStampTypeImpl timeStampType = new TimeStampTypeImpl();
		return timeStampType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateType createUpdateType() {
		UpdateTypeImpl updateType = new UpdateTypeImpl();
		return updateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vec2Type createVec2Type() {
		Vec2TypeImpl vec2Type = new Vec2TypeImpl();
		return vec2Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AltitudeModeEnum createAltitudeModeEnumFromString(EDataType eDataType, String initialValue) {
		AltitudeModeEnum result = AltitudeModeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAltitudeModeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorModeEnum createColorModeEnumFromString(EDataType eDataType, String initialValue) {
		ColorModeEnum result = ColorModeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorModeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemIconStateEnum createItemIconStateEnumFromString(EDataType eDataType, String initialValue) {
		ItemIconStateEnum result = ItemIconStateEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertItemIconStateEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListItemTypeEnum createListItemTypeEnumFromString(EDataType eDataType, String initialValue) {
		ListItemTypeEnum result = ListItemTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListItemTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefreshModeEnum createRefreshModeEnumFromString(EDataType eDataType, String initialValue) {
		RefreshModeEnum result = RefreshModeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRefreshModeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleStateEnum createStyleStateEnumFromString(EDataType eDataType, String initialValue) {
		StyleStateEnum result = StyleStateEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleStateEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsEnum createUnitsEnumFromString(EDataType eDataType, String initialValue) {
		UnitsEnum result = UnitsEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewRefreshModeEnum createViewRefreshModeEnumFromString(EDataType eDataType, String initialValue) {
		ViewRefreshModeEnum result = ViewRefreshModeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertViewRefreshModeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AltitudeModeEnum createAltitudeModeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createAltitudeModeEnumFromString(v21Package.Literals.ALTITUDE_MODE_ENUM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAltitudeModeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAltitudeModeEnumToString(v21Package.Literals.ALTITUDE_MODE_ENUM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createAngle180FromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAngle180ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createAngle180ObjectFromString(EDataType eDataType, String initialValue) {
		return createAngle180FromString(v21Package.Literals.ANGLE180, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAngle180ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAngle180ToString(v21Package.Literals.ANGLE180, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createAngle360FromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAngle360ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createAngle360ObjectFromString(EDataType eDataType, String initialValue) {
		return createAngle360FromString(v21Package.Literals.ANGLE360, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAngle360ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAngle360ToString(v21Package.Literals.ANGLE360, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createAngle90FromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAngle90ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createAngle90ObjectFromString(EDataType eDataType, String initialValue) {
		return createAngle90FromString(v21Package.Literals.ANGLE90, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAngle90ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAngle90ToString(v21Package.Literals.ANGLE90, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createAnglepos90FromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnglepos90ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createAnglepos90ObjectFromString(EDataType eDataType, String initialValue) {
		return createAnglepos90FromString(v21Package.Literals.ANGLEPOS90, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnglepos90ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAnglepos90ToString(v21Package.Literals.ANGLEPOS90, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] createColorFromString(EDataType eDataType, String initialValue) {
		return (byte[])XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.HEX_BINARY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.HEX_BINARY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorModeEnum createColorModeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createColorModeEnumFromString(v21Package.Literals.COLOR_MODE_ENUM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorModeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertColorModeEnumToString(v21Package.Literals.COLOR_MODE_ENUM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createCoordinatesTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (String item : split(initialValue)) {
			result.add((String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoordinatesTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDateTimeTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		XMLGregorianCalendar result = null;
		RuntimeException exception = null;
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE_TIME, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GYEAR_MONTH, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GYEAR, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTimeTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.DATE_TIME.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE_TIME, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.DATE.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GYEAR_MONTH, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.GYEAR.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GYEAR, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemIconStateEnum createItemIconStateEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createItemIconStateEnumFromString(v21Package.Literals.ITEM_ICON_STATE_ENUM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertItemIconStateEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertItemIconStateEnumToString(v21Package.Literals.ITEM_ICON_STATE_ENUM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<ItemIconStateEnum> createItemIconStateTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<ItemIconStateEnum> result = new ArrayList<ItemIconStateEnum>();
		for (String item : split(initialValue)) {
			result.add(createItemIconStateEnumFromString(v21Package.Literals.ITEM_ICON_STATE_ENUM, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertItemIconStateTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertItemIconStateEnumToString(v21Package.Literals.ITEM_ICON_STATE_ENUM, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListItemTypeEnum createListItemTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createListItemTypeEnumFromString(v21Package.Literals.LIST_ITEM_TYPE_ENUM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListItemTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertListItemTypeEnumToString(v21Package.Literals.LIST_ITEM_TYPE_ENUM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefreshModeEnum createRefreshModeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createRefreshModeEnumFromString(v21Package.Literals.REFRESH_MODE_ENUM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRefreshModeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRefreshModeEnumToString(v21Package.Literals.REFRESH_MODE_ENUM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleStateEnum createStyleStateEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createStyleStateEnumFromString(v21Package.Literals.STYLE_STATE_ENUM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleStateEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStyleStateEnumToString(v21Package.Literals.STYLE_STATE_ENUM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitsEnum createUnitsEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createUnitsEnumFromString(v21Package.Literals.UNITS_ENUM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitsEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUnitsEnumToString(v21Package.Literals.UNITS_ENUM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewRefreshModeEnum createViewRefreshModeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createViewRefreshModeEnumFromString(v21Package.Literals.VIEW_REFRESH_MODE_ENUM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertViewRefreshModeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertViewRefreshModeEnumToString(v21Package.Literals.VIEW_REFRESH_MODE_ENUM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public v21Package getv21Package() {
		return (v21Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static v21Package getPackage() {
		return v21Package.eINSTANCE;
	}

} //v21FactoryImpl
