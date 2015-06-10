/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2.util;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import com.google.earth.kml._2.AltitudeModeEnum;
import com.google.earth.kml._2.BalloonStyleType;
import com.google.earth.kml._2.BoundaryType;
import com.google.earth.kml._2.ChangeType;
import com.google.earth.kml._2.ColorModeEnum;
import com.google.earth.kml._2.ColorStyleType;
import com.google.earth.kml._2.ContainerType;
import com.google.earth.kml._2.CreateType;
import com.google.earth.kml._2.DeleteType;
import com.google.earth.kml._2.DocumentRoot;
import com.google.earth.kml._2.DocumentType;
import com.google.earth.kml._2.FeatureType;
import com.google.earth.kml._2.FolderType;
import com.google.earth.kml._2.GeometryType;
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
import com.google.earth.kml._2.ObjectType;
import com.google.earth.kml._2.OrientationType;
import com.google.earth.kml._2.OverlayType;
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
import com.google.earth.kml._2.StyleSelectorType;
import com.google.earth.kml._2.StyleStateEnum;
import com.google.earth.kml._2.StyleType;
import com.google.earth.kml._2.TimePrimitiveType;
import com.google.earth.kml._2.TimeSpanType;
import com.google.earth.kml._2.TimeStampType;
import com.google.earth.kml._2.UnitsEnum;
import com.google.earth.kml._2.UpdateType;
import com.google.earth.kml._2.Vec2Type;
import com.google.earth.kml._2.ViewRefreshModeEnum;
import com.google.earth.kml._2.v21Package;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see com.google.earth.kml._2.v21Package
 * @generated
 */
public class v21Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final v21Validator INSTANCE = new v21Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "com.google.earth.kml._2";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public v21Validator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return v21Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case v21Package.BALLOON_STYLE_TYPE:
				return validateBalloonStyleType((BalloonStyleType)value, diagnostics, context);
			case v21Package.BOUNDARY_TYPE:
				return validateBoundaryType((BoundaryType)value, diagnostics, context);
			case v21Package.CHANGE_TYPE:
				return validateChangeType((ChangeType)value, diagnostics, context);
			case v21Package.COLOR_STYLE_TYPE:
				return validateColorStyleType((ColorStyleType)value, diagnostics, context);
			case v21Package.CONTAINER_TYPE:
				return validateContainerType((ContainerType)value, diagnostics, context);
			case v21Package.CREATE_TYPE:
				return validateCreateType((CreateType)value, diagnostics, context);
			case v21Package.DELETE_TYPE:
				return validateDeleteType((DeleteType)value, diagnostics, context);
			case v21Package.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case v21Package.DOCUMENT_TYPE:
				return validateDocumentType((DocumentType)value, diagnostics, context);
			case v21Package.FEATURE_TYPE:
				return validateFeatureType((FeatureType)value, diagnostics, context);
			case v21Package.FOLDER_TYPE:
				return validateFolderType((FolderType)value, diagnostics, context);
			case v21Package.GEOMETRY_TYPE:
				return validateGeometryType((GeometryType)value, diagnostics, context);
			case v21Package.GROUND_OVERLAY_TYPE:
				return validateGroundOverlayType((GroundOverlayType)value, diagnostics, context);
			case v21Package.ICON_STYLE_ICON_TYPE:
				return validateIconStyleIconType((IconStyleIconType)value, diagnostics, context);
			case v21Package.ICON_STYLE_TYPE:
				return validateIconStyleType((IconStyleType)value, diagnostics, context);
			case v21Package.ICON_TYPE:
				return validateIconType((IconType)value, diagnostics, context);
			case v21Package.ITEM_ICON_TYPE:
				return validateItemIconType((ItemIconType)value, diagnostics, context);
			case v21Package.KML_TYPE:
				return validateKmlType((KmlType)value, diagnostics, context);
			case v21Package.LABEL_STYLE_TYPE:
				return validateLabelStyleType((LabelStyleType)value, diagnostics, context);
			case v21Package.LAT_LON_ALT_BOX_TYPE:
				return validateLatLonAltBoxType((LatLonAltBoxType)value, diagnostics, context);
			case v21Package.LAT_LON_BOX_TYPE:
				return validateLatLonBoxType((LatLonBoxType)value, diagnostics, context);
			case v21Package.LINEAR_RING_TYPE:
				return validateLinearRingType((LinearRingType)value, diagnostics, context);
			case v21Package.LINE_STRING_TYPE:
				return validateLineStringType((LineStringType)value, diagnostics, context);
			case v21Package.LINE_STYLE_TYPE:
				return validateLineStyleType((LineStyleType)value, diagnostics, context);
			case v21Package.LINK_TYPE:
				return validateLinkType((LinkType)value, diagnostics, context);
			case v21Package.LIST_STYLE_TYPE:
				return validateListStyleType((ListStyleType)value, diagnostics, context);
			case v21Package.LOCATION_TYPE:
				return validateLocationType((LocationType)value, diagnostics, context);
			case v21Package.LOD_TYPE:
				return validateLodType((LodType)value, diagnostics, context);
			case v21Package.LOOK_AT_TYPE:
				return validateLookAtType((LookAtType)value, diagnostics, context);
			case v21Package.METADATA_TYPE:
				return validateMetadataType((MetadataType)value, diagnostics, context);
			case v21Package.MODEL_TYPE:
				return validateModelType((ModelType)value, diagnostics, context);
			case v21Package.MULTI_GEOMETRY_TYPE:
				return validateMultiGeometryType((MultiGeometryType)value, diagnostics, context);
			case v21Package.NETWORK_LINK_CONTROL_TYPE:
				return validateNetworkLinkControlType((NetworkLinkControlType)value, diagnostics, context);
			case v21Package.NETWORK_LINK_TYPE:
				return validateNetworkLinkType((NetworkLinkType)value, diagnostics, context);
			case v21Package.OBJECT_TYPE:
				return validateObjectType((ObjectType)value, diagnostics, context);
			case v21Package.ORIENTATION_TYPE:
				return validateOrientationType((OrientationType)value, diagnostics, context);
			case v21Package.OVERLAY_TYPE:
				return validateOverlayType((OverlayType)value, diagnostics, context);
			case v21Package.PLACEMARK_TYPE:
				return validatePlacemarkType((PlacemarkType)value, diagnostics, context);
			case v21Package.POINT_TYPE:
				return validatePointType((PointType)value, diagnostics, context);
			case v21Package.POLYGON_TYPE:
				return validatePolygonType((PolygonType)value, diagnostics, context);
			case v21Package.POLY_STYLE_TYPE:
				return validatePolyStyleType((PolyStyleType)value, diagnostics, context);
			case v21Package.REGION_TYPE:
				return validateRegionType((RegionType)value, diagnostics, context);
			case v21Package.REPLACE_TYPE:
				return validateReplaceType((ReplaceType)value, diagnostics, context);
			case v21Package.SCALE_TYPE:
				return validateScaleType((ScaleType)value, diagnostics, context);
			case v21Package.SCREEN_OVERLAY_TYPE:
				return validateScreenOverlayType((ScreenOverlayType)value, diagnostics, context);
			case v21Package.SNIPPET_TYPE:
				return validateSnippetType((SnippetType)value, diagnostics, context);
			case v21Package.STYLE_MAP_PAIR_TYPE:
				return validateStyleMapPairType((StyleMapPairType)value, diagnostics, context);
			case v21Package.STYLE_MAP_TYPE:
				return validateStyleMapType((StyleMapType)value, diagnostics, context);
			case v21Package.STYLE_SELECTOR_TYPE:
				return validateStyleSelectorType((StyleSelectorType)value, diagnostics, context);
			case v21Package.STYLE_TYPE:
				return validateStyleType((StyleType)value, diagnostics, context);
			case v21Package.TIME_PRIMITIVE_TYPE:
				return validateTimePrimitiveType((TimePrimitiveType)value, diagnostics, context);
			case v21Package.TIME_SPAN_TYPE:
				return validateTimeSpanType((TimeSpanType)value, diagnostics, context);
			case v21Package.TIME_STAMP_TYPE:
				return validateTimeStampType((TimeStampType)value, diagnostics, context);
			case v21Package.UPDATE_TYPE:
				return validateUpdateType((UpdateType)value, diagnostics, context);
			case v21Package.VEC2_TYPE:
				return validateVec2Type((Vec2Type)value, diagnostics, context);
			case v21Package.ALTITUDE_MODE_ENUM:
				return validateAltitudeModeEnum((AltitudeModeEnum)value, diagnostics, context);
			case v21Package.COLOR_MODE_ENUM:
				return validateColorModeEnum((ColorModeEnum)value, diagnostics, context);
			case v21Package.ITEM_ICON_STATE_ENUM:
				return validateItemIconStateEnum((ItemIconStateEnum)value, diagnostics, context);
			case v21Package.LIST_ITEM_TYPE_ENUM:
				return validateListItemTypeEnum((ListItemTypeEnum)value, diagnostics, context);
			case v21Package.REFRESH_MODE_ENUM:
				return validateRefreshModeEnum((RefreshModeEnum)value, diagnostics, context);
			case v21Package.STYLE_STATE_ENUM:
				return validateStyleStateEnum((StyleStateEnum)value, diagnostics, context);
			case v21Package.UNITS_ENUM:
				return validateUnitsEnum((UnitsEnum)value, diagnostics, context);
			case v21Package.VIEW_REFRESH_MODE_ENUM:
				return validateViewRefreshModeEnum((ViewRefreshModeEnum)value, diagnostics, context);
			case v21Package.ALTITUDE_MODE_ENUM_OBJECT:
				return validateAltitudeModeEnumObject((AltitudeModeEnum)value, diagnostics, context);
			case v21Package.ANGLE180:
				return validateAngle180((Double)value, diagnostics, context);
			case v21Package.ANGLE180_OBJECT:
				return validateAngle180Object((Double)value, diagnostics, context);
			case v21Package.ANGLE360:
				return validateAngle360((Double)value, diagnostics, context);
			case v21Package.ANGLE360_OBJECT:
				return validateAngle360Object((Double)value, diagnostics, context);
			case v21Package.ANGLE90:
				return validateAngle90((Double)value, diagnostics, context);
			case v21Package.ANGLE90_OBJECT:
				return validateAngle90Object((Double)value, diagnostics, context);
			case v21Package.ANGLEPOS90:
				return validateAnglepos90((Double)value, diagnostics, context);
			case v21Package.ANGLEPOS90_OBJECT:
				return validateAnglepos90Object((Double)value, diagnostics, context);
			case v21Package.COLOR:
				return validateColor((byte[])value, diagnostics, context);
			case v21Package.COLOR_MODE_ENUM_OBJECT:
				return validateColorModeEnumObject((ColorModeEnum)value, diagnostics, context);
			case v21Package.COORDINATES_TYPE:
				return validateCoordinatesType((List<?>)value, diagnostics, context);
			case v21Package.DATE_TIME_TYPE:
				return validateDateTimeType((XMLGregorianCalendar)value, diagnostics, context);
			case v21Package.ITEM_ICON_STATE_ENUM_OBJECT:
				return validateItemIconStateEnumObject((ItemIconStateEnum)value, diagnostics, context);
			case v21Package.ITEM_ICON_STATE_TYPE:
				return validateItemIconStateType((List<?>)value, diagnostics, context);
			case v21Package.LIST_ITEM_TYPE_ENUM_OBJECT:
				return validateListItemTypeEnumObject((ListItemTypeEnum)value, diagnostics, context);
			case v21Package.REFRESH_MODE_ENUM_OBJECT:
				return validateRefreshModeEnumObject((RefreshModeEnum)value, diagnostics, context);
			case v21Package.STYLE_STATE_ENUM_OBJECT:
				return validateStyleStateEnumObject((StyleStateEnum)value, diagnostics, context);
			case v21Package.UNITS_ENUM_OBJECT:
				return validateUnitsEnumObject((UnitsEnum)value, diagnostics, context);
			case v21Package.VIEW_REFRESH_MODE_ENUM_OBJECT:
				return validateViewRefreshModeEnumObject((ViewRefreshModeEnum)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBalloonStyleType(BalloonStyleType balloonStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(balloonStyleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoundaryType(BoundaryType boundaryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boundaryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeType(ChangeType changeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(changeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorStyleType(ColorStyleType colorStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(colorStyleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContainerType(ContainerType containerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(containerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreateType(CreateType createType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(createType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeleteType(DeleteType deleteType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deleteType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentType(DocumentType documentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureType(FeatureType featureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(featureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFolderType(FolderType folderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(folderType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeometryType(GeometryType geometryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(geometryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroundOverlayType(GroundOverlayType groundOverlayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(groundOverlayType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIconStyleIconType(IconStyleIconType iconStyleIconType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iconStyleIconType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIconStyleType(IconStyleType iconStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iconStyleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIconType(IconType iconType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iconType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemIconType(ItemIconType itemIconType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(itemIconType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKmlType(KmlType kmlType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kmlType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabelStyleType(LabelStyleType labelStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(labelStyleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatLonAltBoxType(LatLonAltBoxType latLonAltBoxType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(latLonAltBoxType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatLonBoxType(LatLonBoxType latLonBoxType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(latLonBoxType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinearRingType(LinearRingType linearRingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linearRingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineStringType(LineStringType lineStringType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lineStringType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLineStyleType(LineStyleType lineStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lineStyleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkType(LinkType linkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListStyleType(ListStyleType listStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listStyleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationType(LocationType locationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLodType(LodType lodType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lodType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLookAtType(LookAtType lookAtType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lookAtType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetadataType(MetadataType metadataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metadataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelType(ModelType modelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiGeometryType(MultiGeometryType multiGeometryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(multiGeometryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkLinkControlType(NetworkLinkControlType networkLinkControlType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(networkLinkControlType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNetworkLinkType(NetworkLinkType networkLinkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(networkLinkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectType(ObjectType objectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrientationType(OrientationType orientationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orientationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOverlayType(OverlayType overlayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(overlayType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlacemarkType(PlacemarkType placemarkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(placemarkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointType(PointType pointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolygonType(PolygonType polygonType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(polygonType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolyStyleType(PolyStyleType polyStyleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(polyStyleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegionType(RegionType regionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(regionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReplaceType(ReplaceType replaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(replaceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScaleType(ScaleType scaleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scaleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScreenOverlayType(ScreenOverlayType screenOverlayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(screenOverlayType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSnippetType(SnippetType snippetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(snippetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleMapPairType(StyleMapPairType styleMapPairType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styleMapPairType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleMapType(StyleMapType styleMapType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styleMapType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleSelectorType(StyleSelectorType styleSelectorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styleSelectorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleType(StyleType styleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimePrimitiveType(TimePrimitiveType timePrimitiveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timePrimitiveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeSpanType(TimeSpanType timeSpanType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeSpanType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeStampType(TimeStampType timeStampType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeStampType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdateType(UpdateType updateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(updateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVec2Type(Vec2Type vec2Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vec2Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAltitudeModeEnum(AltitudeModeEnum altitudeModeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorModeEnum(ColorModeEnum colorModeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemIconStateEnum(ItemIconStateEnum itemIconStateEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListItemTypeEnum(ListItemTypeEnum listItemTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefreshModeEnum(RefreshModeEnum refreshModeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleStateEnum(StyleStateEnum styleStateEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitsEnum(UnitsEnum unitsEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewRefreshModeEnum(ViewRefreshModeEnum viewRefreshModeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAltitudeModeEnumObject(AltitudeModeEnum altitudeModeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngle180(double angle180, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAngle180_Min(angle180, diagnostics, context);
		if (result || diagnostics != null) result &= validateAngle180_Max(angle180, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAngle180_Min
	 */
	public static final double ANGLE180__MIN__VALUE = -180.0;

	/**
	 * Validates the Min constraint of '<em>Angle180</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngle180_Min(double angle180, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = angle180 >= ANGLE180__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(v21Package.Literals.ANGLE180, angle180, ANGLE180__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAngle180_Max
	 */
	public static final double ANGLE180__MAX__VALUE = 180.0;

	/**
	 * Validates the Max constraint of '<em>Angle180</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngle180_Max(double angle180, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = angle180 <= ANGLE180__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(v21Package.Literals.ANGLE180, angle180, ANGLE180__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngle180Object(Double angle180Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAngle180_Min(angle180Object, diagnostics, context);
		if (result || diagnostics != null) result &= validateAngle180_Max(angle180Object, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngle360(double angle360, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAngle360_Min(angle360, diagnostics, context);
		if (result || diagnostics != null) result &= validateAngle360_Max(angle360, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAngle360_Min
	 */
	public static final double ANGLE360__MIN__VALUE = -360.0;

	/**
	 * Validates the Min constraint of '<em>Angle360</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngle360_Min(double angle360, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = angle360 >= ANGLE360__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(v21Package.Literals.ANGLE360, angle360, ANGLE360__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAngle360_Max
	 */
	public static final double ANGLE360__MAX__VALUE = 360.0;

	/**
	 * Validates the Max constraint of '<em>Angle360</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngle360_Max(double angle360, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = angle360 <= ANGLE360__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(v21Package.Literals.ANGLE360, angle360, ANGLE360__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngle360Object(Double angle360Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAngle360_Min(angle360Object, diagnostics, context);
		if (result || diagnostics != null) result &= validateAngle360_Max(angle360Object, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngle90(double angle90, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAngle90_Min(angle90, diagnostics, context);
		if (result || diagnostics != null) result &= validateAngle90_Max(angle90, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAngle90_Min
	 */
	public static final double ANGLE90__MIN__VALUE = -90.0;

	/**
	 * Validates the Min constraint of '<em>Angle90</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngle90_Min(double angle90, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = angle90 >= ANGLE90__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(v21Package.Literals.ANGLE90, angle90, ANGLE90__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAngle90_Max
	 */
	public static final double ANGLE90__MAX__VALUE = 90.0;

	/**
	 * Validates the Max constraint of '<em>Angle90</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngle90_Max(double angle90, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = angle90 <= ANGLE90__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(v21Package.Literals.ANGLE90, angle90, ANGLE90__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAngle90Object(Double angle90Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAngle90_Min(angle90Object, diagnostics, context);
		if (result || diagnostics != null) result &= validateAngle90_Max(angle90Object, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnglepos90(double anglepos90, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAnglepos90_Min(anglepos90, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnglepos90_Max(anglepos90, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAnglepos90_Min
	 */
	public static final double ANGLEPOS90__MIN__VALUE = 0.0;

	/**
	 * Validates the Min constraint of '<em>Anglepos90</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnglepos90_Min(double anglepos90, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = anglepos90 >= ANGLEPOS90__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(v21Package.Literals.ANGLEPOS90, anglepos90, ANGLEPOS90__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateAnglepos90_Max
	 */
	public static final double ANGLEPOS90__MAX__VALUE = 90.0;

	/**
	 * Validates the Max constraint of '<em>Anglepos90</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnglepos90_Max(double anglepos90, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = anglepos90 <= ANGLEPOS90__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(v21Package.Literals.ANGLEPOS90, anglepos90, ANGLEPOS90__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnglepos90Object(Double anglepos90Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateAnglepos90_Min(anglepos90Object, diagnostics, context);
		if (result || diagnostics != null) result &= validateAnglepos90_Max(anglepos90Object, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColor(byte[] color, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateColor_MinLength(color, diagnostics, context);
		if (result || diagnostics != null) result &= validateColor_MaxLength(color, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColor_MinLength(byte[] color, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = color.length;
		boolean result = length >= 4;
		if (!result && diagnostics != null)
			reportMinLengthViolation(v21Package.Literals.COLOR, color, length, 4, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColor_MaxLength(byte[] color, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = color.length;
		boolean result = length <= 4;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(v21Package.Literals.COLOR, color, length, 4, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorModeEnumObject(ColorModeEnum colorModeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordinatesType(List<?> coordinatesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCoordinatesType_ItemType(coordinatesType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Coordinates Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordinatesType_ItemType(List<?> coordinatesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = coordinatesType.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.STRING.isInstance(item)) {
				result &= xmlTypeValidator.validateString((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.STRING, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimeType(XMLGregorianCalendar dateTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDateTimeType_MemberTypes(dateTimeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Date Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimeType_MemberTypes(XMLGregorianCalendar dateTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.DATE_TIME.isInstance(dateTimeType)) {
				if (xmlTypeValidator.validateDateTime(dateTimeType, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE.isInstance(dateTimeType)) {
				if (xmlTypeValidator.validateDate(dateTimeType, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(dateTimeType)) {
				if (xmlTypeValidator.validateGYearMonth(dateTimeType, tempDiagnostics, context)) return true;
			}
			if (XMLTypePackage.Literals.GYEAR.isInstance(dateTimeType)) {
				if (xmlTypeValidator.validateGYear(dateTimeType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.DATE_TIME.isInstance(dateTimeType)) {
				if (xmlTypeValidator.validateDateTime(dateTimeType, null, context)) return true;
			}
			if (XMLTypePackage.Literals.DATE.isInstance(dateTimeType)) {
				if (xmlTypeValidator.validateDate(dateTimeType, null, context)) return true;
			}
			if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(dateTimeType)) {
				if (xmlTypeValidator.validateGYearMonth(dateTimeType, null, context)) return true;
			}
			if (XMLTypePackage.Literals.GYEAR.isInstance(dateTimeType)) {
				if (xmlTypeValidator.validateGYear(dateTimeType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemIconStateEnumObject(ItemIconStateEnum itemIconStateEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemIconStateType(List<?> itemIconStateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateItemIconStateType_ItemType(itemIconStateType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Item Icon State Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemIconStateType_ItemType(List<?> itemIconStateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = itemIconStateType.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (v21Package.Literals.ITEM_ICON_STATE_ENUM.isInstance(item)) {
				result &= validateItemIconStateEnum((ItemIconStateEnum)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(v21Package.Literals.ITEM_ICON_STATE_ENUM, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListItemTypeEnumObject(ListItemTypeEnum listItemTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefreshModeEnumObject(RefreshModeEnum refreshModeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleStateEnumObject(StyleStateEnum styleStateEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitsEnumObject(UnitsEnum unitsEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewRefreshModeEnumObject(ViewRefreshModeEnum viewRefreshModeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //v21Validator
