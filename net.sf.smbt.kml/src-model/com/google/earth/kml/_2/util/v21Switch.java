/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import com.google.earth.kml._2.BalloonStyleType;
import com.google.earth.kml._2.BoundaryType;
import com.google.earth.kml._2.ChangeType;
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
import com.google.earth.kml._2.ItemIconType;
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
import com.google.earth.kml._2.RegionType;
import com.google.earth.kml._2.ReplaceType;
import com.google.earth.kml._2.ScaleType;
import com.google.earth.kml._2.ScreenOverlayType;
import com.google.earth.kml._2.SnippetType;
import com.google.earth.kml._2.StyleMapPairType;
import com.google.earth.kml._2.StyleMapType;
import com.google.earth.kml._2.StyleSelectorType;
import com.google.earth.kml._2.StyleType;
import com.google.earth.kml._2.TimePrimitiveType;
import com.google.earth.kml._2.TimeSpanType;
import com.google.earth.kml._2.TimeStampType;
import com.google.earth.kml._2.UpdateType;
import com.google.earth.kml._2.Vec2Type;
import com.google.earth.kml._2.v21Package;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.google.earth.kml._2.v21Package
 * @generated
 */
public class v21Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static v21Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public v21Switch() {
		if (modelPackage == null) {
			modelPackage = v21Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case v21Package.BALLOON_STYLE_TYPE: {
				BalloonStyleType balloonStyleType = (BalloonStyleType)theEObject;
				T result = caseBalloonStyleType(balloonStyleType);
				if (result == null) result = caseObjectType(balloonStyleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.BOUNDARY_TYPE: {
				BoundaryType boundaryType = (BoundaryType)theEObject;
				T result = caseBoundaryType(boundaryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.CHANGE_TYPE: {
				ChangeType changeType = (ChangeType)theEObject;
				T result = caseChangeType(changeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.COLOR_STYLE_TYPE: {
				ColorStyleType colorStyleType = (ColorStyleType)theEObject;
				T result = caseColorStyleType(colorStyleType);
				if (result == null) result = caseObjectType(colorStyleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.CONTAINER_TYPE: {
				ContainerType containerType = (ContainerType)theEObject;
				T result = caseContainerType(containerType);
				if (result == null) result = caseFeatureType(containerType);
				if (result == null) result = caseObjectType(containerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.CREATE_TYPE: {
				CreateType createType = (CreateType)theEObject;
				T result = caseCreateType(createType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.DELETE_TYPE: {
				DeleteType deleteType = (DeleteType)theEObject;
				T result = caseDeleteType(deleteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.DOCUMENT_TYPE: {
				DocumentType documentType = (DocumentType)theEObject;
				T result = caseDocumentType(documentType);
				if (result == null) result = caseContainerType(documentType);
				if (result == null) result = caseFeatureType(documentType);
				if (result == null) result = caseObjectType(documentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.FEATURE_TYPE: {
				FeatureType featureType = (FeatureType)theEObject;
				T result = caseFeatureType(featureType);
				if (result == null) result = caseObjectType(featureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.FOLDER_TYPE: {
				FolderType folderType = (FolderType)theEObject;
				T result = caseFolderType(folderType);
				if (result == null) result = caseContainerType(folderType);
				if (result == null) result = caseFeatureType(folderType);
				if (result == null) result = caseObjectType(folderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.GEOMETRY_TYPE: {
				GeometryType geometryType = (GeometryType)theEObject;
				T result = caseGeometryType(geometryType);
				if (result == null) result = caseObjectType(geometryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.GROUND_OVERLAY_TYPE: {
				GroundOverlayType groundOverlayType = (GroundOverlayType)theEObject;
				T result = caseGroundOverlayType(groundOverlayType);
				if (result == null) result = caseOverlayType(groundOverlayType);
				if (result == null) result = caseFeatureType(groundOverlayType);
				if (result == null) result = caseObjectType(groundOverlayType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.ICON_STYLE_ICON_TYPE: {
				IconStyleIconType iconStyleIconType = (IconStyleIconType)theEObject;
				T result = caseIconStyleIconType(iconStyleIconType);
				if (result == null) result = caseObjectType(iconStyleIconType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.ICON_STYLE_TYPE: {
				IconStyleType iconStyleType = (IconStyleType)theEObject;
				T result = caseIconStyleType(iconStyleType);
				if (result == null) result = caseColorStyleType(iconStyleType);
				if (result == null) result = caseObjectType(iconStyleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.ICON_TYPE: {
				IconType iconType = (IconType)theEObject;
				T result = caseIconType(iconType);
				if (result == null) result = caseLinkType(iconType);
				if (result == null) result = caseObjectType(iconType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.ITEM_ICON_TYPE: {
				ItemIconType itemIconType = (ItemIconType)theEObject;
				T result = caseItemIconType(itemIconType);
				if (result == null) result = caseObjectType(itemIconType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.KML_TYPE: {
				KmlType kmlType = (KmlType)theEObject;
				T result = caseKmlType(kmlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.LABEL_STYLE_TYPE: {
				LabelStyleType labelStyleType = (LabelStyleType)theEObject;
				T result = caseLabelStyleType(labelStyleType);
				if (result == null) result = caseColorStyleType(labelStyleType);
				if (result == null) result = caseObjectType(labelStyleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.LAT_LON_ALT_BOX_TYPE: {
				LatLonAltBoxType latLonAltBoxType = (LatLonAltBoxType)theEObject;
				T result = caseLatLonAltBoxType(latLonAltBoxType);
				if (result == null) result = caseLatLonBoxType(latLonAltBoxType);
				if (result == null) result = caseObjectType(latLonAltBoxType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.LAT_LON_BOX_TYPE: {
				LatLonBoxType latLonBoxType = (LatLonBoxType)theEObject;
				T result = caseLatLonBoxType(latLonBoxType);
				if (result == null) result = caseObjectType(latLonBoxType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.LINEAR_RING_TYPE: {
				LinearRingType linearRingType = (LinearRingType)theEObject;
				T result = caseLinearRingType(linearRingType);
				if (result == null) result = caseGeometryType(linearRingType);
				if (result == null) result = caseObjectType(linearRingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.LINE_STRING_TYPE: {
				LineStringType lineStringType = (LineStringType)theEObject;
				T result = caseLineStringType(lineStringType);
				if (result == null) result = caseGeometryType(lineStringType);
				if (result == null) result = caseObjectType(lineStringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.LINE_STYLE_TYPE: {
				LineStyleType lineStyleType = (LineStyleType)theEObject;
				T result = caseLineStyleType(lineStyleType);
				if (result == null) result = caseColorStyleType(lineStyleType);
				if (result == null) result = caseObjectType(lineStyleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.LINK_TYPE: {
				LinkType linkType = (LinkType)theEObject;
				T result = caseLinkType(linkType);
				if (result == null) result = caseObjectType(linkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.LIST_STYLE_TYPE: {
				ListStyleType listStyleType = (ListStyleType)theEObject;
				T result = caseListStyleType(listStyleType);
				if (result == null) result = caseObjectType(listStyleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.LOCATION_TYPE: {
				LocationType locationType = (LocationType)theEObject;
				T result = caseLocationType(locationType);
				if (result == null) result = caseObjectType(locationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.LOD_TYPE: {
				LodType lodType = (LodType)theEObject;
				T result = caseLodType(lodType);
				if (result == null) result = caseObjectType(lodType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.LOOK_AT_TYPE: {
				LookAtType lookAtType = (LookAtType)theEObject;
				T result = caseLookAtType(lookAtType);
				if (result == null) result = caseObjectType(lookAtType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.METADATA_TYPE: {
				MetadataType metadataType = (MetadataType)theEObject;
				T result = caseMetadataType(metadataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.MODEL_TYPE: {
				ModelType modelType = (ModelType)theEObject;
				T result = caseModelType(modelType);
				if (result == null) result = caseGeometryType(modelType);
				if (result == null) result = caseObjectType(modelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.MULTI_GEOMETRY_TYPE: {
				MultiGeometryType multiGeometryType = (MultiGeometryType)theEObject;
				T result = caseMultiGeometryType(multiGeometryType);
				if (result == null) result = caseGeometryType(multiGeometryType);
				if (result == null) result = caseObjectType(multiGeometryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.NETWORK_LINK_CONTROL_TYPE: {
				NetworkLinkControlType networkLinkControlType = (NetworkLinkControlType)theEObject;
				T result = caseNetworkLinkControlType(networkLinkControlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.NETWORK_LINK_TYPE: {
				NetworkLinkType networkLinkType = (NetworkLinkType)theEObject;
				T result = caseNetworkLinkType(networkLinkType);
				if (result == null) result = caseFeatureType(networkLinkType);
				if (result == null) result = caseObjectType(networkLinkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.OBJECT_TYPE: {
				ObjectType objectType = (ObjectType)theEObject;
				T result = caseObjectType(objectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.ORIENTATION_TYPE: {
				OrientationType orientationType = (OrientationType)theEObject;
				T result = caseOrientationType(orientationType);
				if (result == null) result = caseObjectType(orientationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.OVERLAY_TYPE: {
				OverlayType overlayType = (OverlayType)theEObject;
				T result = caseOverlayType(overlayType);
				if (result == null) result = caseFeatureType(overlayType);
				if (result == null) result = caseObjectType(overlayType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.PLACEMARK_TYPE: {
				PlacemarkType placemarkType = (PlacemarkType)theEObject;
				T result = casePlacemarkType(placemarkType);
				if (result == null) result = caseFeatureType(placemarkType);
				if (result == null) result = caseObjectType(placemarkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.POINT_TYPE: {
				PointType pointType = (PointType)theEObject;
				T result = casePointType(pointType);
				if (result == null) result = caseGeometryType(pointType);
				if (result == null) result = caseObjectType(pointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.POLYGON_TYPE: {
				PolygonType polygonType = (PolygonType)theEObject;
				T result = casePolygonType(polygonType);
				if (result == null) result = caseGeometryType(polygonType);
				if (result == null) result = caseObjectType(polygonType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.POLY_STYLE_TYPE: {
				PolyStyleType polyStyleType = (PolyStyleType)theEObject;
				T result = casePolyStyleType(polyStyleType);
				if (result == null) result = caseColorStyleType(polyStyleType);
				if (result == null) result = caseObjectType(polyStyleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.REGION_TYPE: {
				RegionType regionType = (RegionType)theEObject;
				T result = caseRegionType(regionType);
				if (result == null) result = caseObjectType(regionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.REPLACE_TYPE: {
				ReplaceType replaceType = (ReplaceType)theEObject;
				T result = caseReplaceType(replaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.SCALE_TYPE: {
				ScaleType scaleType = (ScaleType)theEObject;
				T result = caseScaleType(scaleType);
				if (result == null) result = caseObjectType(scaleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.SCREEN_OVERLAY_TYPE: {
				ScreenOverlayType screenOverlayType = (ScreenOverlayType)theEObject;
				T result = caseScreenOverlayType(screenOverlayType);
				if (result == null) result = caseOverlayType(screenOverlayType);
				if (result == null) result = caseFeatureType(screenOverlayType);
				if (result == null) result = caseObjectType(screenOverlayType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.SNIPPET_TYPE: {
				SnippetType snippetType = (SnippetType)theEObject;
				T result = caseSnippetType(snippetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.STYLE_MAP_PAIR_TYPE: {
				StyleMapPairType styleMapPairType = (StyleMapPairType)theEObject;
				T result = caseStyleMapPairType(styleMapPairType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.STYLE_MAP_TYPE: {
				StyleMapType styleMapType = (StyleMapType)theEObject;
				T result = caseStyleMapType(styleMapType);
				if (result == null) result = caseStyleSelectorType(styleMapType);
				if (result == null) result = caseObjectType(styleMapType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.STYLE_SELECTOR_TYPE: {
				StyleSelectorType styleSelectorType = (StyleSelectorType)theEObject;
				T result = caseStyleSelectorType(styleSelectorType);
				if (result == null) result = caseObjectType(styleSelectorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.STYLE_TYPE: {
				StyleType styleType = (StyleType)theEObject;
				T result = caseStyleType(styleType);
				if (result == null) result = caseStyleSelectorType(styleType);
				if (result == null) result = caseObjectType(styleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.TIME_PRIMITIVE_TYPE: {
				TimePrimitiveType timePrimitiveType = (TimePrimitiveType)theEObject;
				T result = caseTimePrimitiveType(timePrimitiveType);
				if (result == null) result = caseObjectType(timePrimitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.TIME_SPAN_TYPE: {
				TimeSpanType timeSpanType = (TimeSpanType)theEObject;
				T result = caseTimeSpanType(timeSpanType);
				if (result == null) result = caseTimePrimitiveType(timeSpanType);
				if (result == null) result = caseObjectType(timeSpanType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.TIME_STAMP_TYPE: {
				TimeStampType timeStampType = (TimeStampType)theEObject;
				T result = caseTimeStampType(timeStampType);
				if (result == null) result = caseTimePrimitiveType(timeStampType);
				if (result == null) result = caseObjectType(timeStampType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.UPDATE_TYPE: {
				UpdateType updateType = (UpdateType)theEObject;
				T result = caseUpdateType(updateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case v21Package.VEC2_TYPE: {
				Vec2Type vec2Type = (Vec2Type)theEObject;
				T result = caseVec2Type(vec2Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Balloon Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Balloon Style Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBalloonStyleType(BalloonStyleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boundary Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boundary Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundaryType(BoundaryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeType(ChangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Style Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorStyleType(ColorStyleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerType(ContainerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateType(CreateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeleteType(DeleteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentType(DocumentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureType(FeatureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Folder Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Folder Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFolderType(FolderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geometry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geometry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeometryType(GeometryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ground Overlay Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ground Overlay Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroundOverlayType(GroundOverlayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Icon Style Icon Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Icon Style Icon Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIconStyleIconType(IconStyleIconType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Icon Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Icon Style Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIconStyleType(IconStyleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Icon Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Icon Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIconType(IconType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Icon Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Icon Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemIconType(ItemIconType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kml Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kml Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKmlType(KmlType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Style Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelStyleType(LabelStyleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lat Lon Alt Box Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lat Lon Alt Box Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLatLonAltBoxType(LatLonAltBoxType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lat Lon Box Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lat Lon Box Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLatLonBoxType(LatLonBoxType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linear Ring Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linear Ring Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinearRingType(LinearRingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line String Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line String Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineStringType(LineStringType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Style Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineStyleType(LineStyleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkType(LinkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Style Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListStyleType(ListStyleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationType(LocationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lod Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lod Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLodType(LodType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Look At Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Look At Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLookAtType(LookAtType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metadata Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metadata Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetadataType(MetadataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelType(ModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Geometry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Geometry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiGeometryType(MultiGeometryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Link Control Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Link Control Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkLinkControlType(NetworkLinkControlType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Link Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkLinkType(NetworkLinkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectType(ObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orientation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orientation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrientationType(OrientationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Overlay Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Overlay Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverlayType(OverlayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Placemark Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Placemark Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlacemarkType(PlacemarkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointType(PointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygon Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygon Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolygonType(PolygonType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Poly Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Poly Style Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolyStyleType(PolyStyleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Region Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Region Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegionType(RegionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replace Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replace Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplaceType(ReplaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scale Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scale Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScaleType(ScaleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Screen Overlay Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Screen Overlay Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScreenOverlayType(ScreenOverlayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Snippet Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Snippet Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSnippetType(SnippetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Map Pair Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Map Pair Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleMapPairType(StyleMapPairType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Map Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleMapType(StyleMapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Selector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Selector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleSelectorType(StyleSelectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleType(StyleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimePrimitiveType(TimePrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Span Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Span Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeSpanType(TimeSpanType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Stamp Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Stamp Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeStampType(TimeStampType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateType(UpdateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vec2 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vec2 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVec2Type(Vec2Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //v21Switch
