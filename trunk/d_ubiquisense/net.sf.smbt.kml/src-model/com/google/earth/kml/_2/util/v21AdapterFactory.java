/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.google.earth.kml._2.v21Package
 * @generated
 */
public class v21AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static v21Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public v21AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = v21Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected v21Switch<Adapter> modelSwitch =
		new v21Switch<Adapter>() {
			@Override
			public Adapter caseBalloonStyleType(BalloonStyleType object) {
				return createBalloonStyleTypeAdapter();
			}
			@Override
			public Adapter caseBoundaryType(BoundaryType object) {
				return createBoundaryTypeAdapter();
			}
			@Override
			public Adapter caseChangeType(ChangeType object) {
				return createChangeTypeAdapter();
			}
			@Override
			public Adapter caseColorStyleType(ColorStyleType object) {
				return createColorStyleTypeAdapter();
			}
			@Override
			public Adapter caseContainerType(ContainerType object) {
				return createContainerTypeAdapter();
			}
			@Override
			public Adapter caseCreateType(CreateType object) {
				return createCreateTypeAdapter();
			}
			@Override
			public Adapter caseDeleteType(DeleteType object) {
				return createDeleteTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDocumentType(DocumentType object) {
				return createDocumentTypeAdapter();
			}
			@Override
			public Adapter caseFeatureType(FeatureType object) {
				return createFeatureTypeAdapter();
			}
			@Override
			public Adapter caseFolderType(FolderType object) {
				return createFolderTypeAdapter();
			}
			@Override
			public Adapter caseGeometryType(GeometryType object) {
				return createGeometryTypeAdapter();
			}
			@Override
			public Adapter caseGroundOverlayType(GroundOverlayType object) {
				return createGroundOverlayTypeAdapter();
			}
			@Override
			public Adapter caseIconStyleIconType(IconStyleIconType object) {
				return createIconStyleIconTypeAdapter();
			}
			@Override
			public Adapter caseIconStyleType(IconStyleType object) {
				return createIconStyleTypeAdapter();
			}
			@Override
			public Adapter caseIconType(IconType object) {
				return createIconTypeAdapter();
			}
			@Override
			public Adapter caseItemIconType(ItemIconType object) {
				return createItemIconTypeAdapter();
			}
			@Override
			public Adapter caseKmlType(KmlType object) {
				return createKmlTypeAdapter();
			}
			@Override
			public Adapter caseLabelStyleType(LabelStyleType object) {
				return createLabelStyleTypeAdapter();
			}
			@Override
			public Adapter caseLatLonAltBoxType(LatLonAltBoxType object) {
				return createLatLonAltBoxTypeAdapter();
			}
			@Override
			public Adapter caseLatLonBoxType(LatLonBoxType object) {
				return createLatLonBoxTypeAdapter();
			}
			@Override
			public Adapter caseLinearRingType(LinearRingType object) {
				return createLinearRingTypeAdapter();
			}
			@Override
			public Adapter caseLineStringType(LineStringType object) {
				return createLineStringTypeAdapter();
			}
			@Override
			public Adapter caseLineStyleType(LineStyleType object) {
				return createLineStyleTypeAdapter();
			}
			@Override
			public Adapter caseLinkType(LinkType object) {
				return createLinkTypeAdapter();
			}
			@Override
			public Adapter caseListStyleType(ListStyleType object) {
				return createListStyleTypeAdapter();
			}
			@Override
			public Adapter caseLocationType(LocationType object) {
				return createLocationTypeAdapter();
			}
			@Override
			public Adapter caseLodType(LodType object) {
				return createLodTypeAdapter();
			}
			@Override
			public Adapter caseLookAtType(LookAtType object) {
				return createLookAtTypeAdapter();
			}
			@Override
			public Adapter caseMetadataType(MetadataType object) {
				return createMetadataTypeAdapter();
			}
			@Override
			public Adapter caseModelType(ModelType object) {
				return createModelTypeAdapter();
			}
			@Override
			public Adapter caseMultiGeometryType(MultiGeometryType object) {
				return createMultiGeometryTypeAdapter();
			}
			@Override
			public Adapter caseNetworkLinkControlType(NetworkLinkControlType object) {
				return createNetworkLinkControlTypeAdapter();
			}
			@Override
			public Adapter caseNetworkLinkType(NetworkLinkType object) {
				return createNetworkLinkTypeAdapter();
			}
			@Override
			public Adapter caseObjectType(ObjectType object) {
				return createObjectTypeAdapter();
			}
			@Override
			public Adapter caseOrientationType(OrientationType object) {
				return createOrientationTypeAdapter();
			}
			@Override
			public Adapter caseOverlayType(OverlayType object) {
				return createOverlayTypeAdapter();
			}
			@Override
			public Adapter casePlacemarkType(PlacemarkType object) {
				return createPlacemarkTypeAdapter();
			}
			@Override
			public Adapter casePointType(PointType object) {
				return createPointTypeAdapter();
			}
			@Override
			public Adapter casePolygonType(PolygonType object) {
				return createPolygonTypeAdapter();
			}
			@Override
			public Adapter casePolyStyleType(PolyStyleType object) {
				return createPolyStyleTypeAdapter();
			}
			@Override
			public Adapter caseRegionType(RegionType object) {
				return createRegionTypeAdapter();
			}
			@Override
			public Adapter caseReplaceType(ReplaceType object) {
				return createReplaceTypeAdapter();
			}
			@Override
			public Adapter caseScaleType(ScaleType object) {
				return createScaleTypeAdapter();
			}
			@Override
			public Adapter caseScreenOverlayType(ScreenOverlayType object) {
				return createScreenOverlayTypeAdapter();
			}
			@Override
			public Adapter caseSnippetType(SnippetType object) {
				return createSnippetTypeAdapter();
			}
			@Override
			public Adapter caseStyleMapPairType(StyleMapPairType object) {
				return createStyleMapPairTypeAdapter();
			}
			@Override
			public Adapter caseStyleMapType(StyleMapType object) {
				return createStyleMapTypeAdapter();
			}
			@Override
			public Adapter caseStyleSelectorType(StyleSelectorType object) {
				return createStyleSelectorTypeAdapter();
			}
			@Override
			public Adapter caseStyleType(StyleType object) {
				return createStyleTypeAdapter();
			}
			@Override
			public Adapter caseTimePrimitiveType(TimePrimitiveType object) {
				return createTimePrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseTimeSpanType(TimeSpanType object) {
				return createTimeSpanTypeAdapter();
			}
			@Override
			public Adapter caseTimeStampType(TimeStampType object) {
				return createTimeStampTypeAdapter();
			}
			@Override
			public Adapter caseUpdateType(UpdateType object) {
				return createUpdateTypeAdapter();
			}
			@Override
			public Adapter caseVec2Type(Vec2Type object) {
				return createVec2TypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.BalloonStyleType <em>Balloon Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.BalloonStyleType
	 * @generated
	 */
	public Adapter createBalloonStyleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.BoundaryType <em>Boundary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.BoundaryType
	 * @generated
	 */
	public Adapter createBoundaryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.ChangeType <em>Change Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.ChangeType
	 * @generated
	 */
	public Adapter createChangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.ColorStyleType <em>Color Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.ColorStyleType
	 * @generated
	 */
	public Adapter createColorStyleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.ContainerType <em>Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.ContainerType
	 * @generated
	 */
	public Adapter createContainerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.CreateType <em>Create Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.CreateType
	 * @generated
	 */
	public Adapter createCreateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.DeleteType <em>Delete Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.DeleteType
	 * @generated
	 */
	public Adapter createDeleteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.DocumentType <em>Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.DocumentType
	 * @generated
	 */
	public Adapter createDocumentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.FeatureType <em>Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.FeatureType
	 * @generated
	 */
	public Adapter createFeatureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.FolderType <em>Folder Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.FolderType
	 * @generated
	 */
	public Adapter createFolderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.GeometryType <em>Geometry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.GeometryType
	 * @generated
	 */
	public Adapter createGeometryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.GroundOverlayType <em>Ground Overlay Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.GroundOverlayType
	 * @generated
	 */
	public Adapter createGroundOverlayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.IconStyleIconType <em>Icon Style Icon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.IconStyleIconType
	 * @generated
	 */
	public Adapter createIconStyleIconTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.IconStyleType <em>Icon Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.IconStyleType
	 * @generated
	 */
	public Adapter createIconStyleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.IconType <em>Icon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.IconType
	 * @generated
	 */
	public Adapter createIconTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.ItemIconType <em>Item Icon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.ItemIconType
	 * @generated
	 */
	public Adapter createItemIconTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.KmlType <em>Kml Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.KmlType
	 * @generated
	 */
	public Adapter createKmlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.LabelStyleType <em>Label Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.LabelStyleType
	 * @generated
	 */
	public Adapter createLabelStyleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.LatLonAltBoxType <em>Lat Lon Alt Box Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.LatLonAltBoxType
	 * @generated
	 */
	public Adapter createLatLonAltBoxTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.LatLonBoxType <em>Lat Lon Box Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.LatLonBoxType
	 * @generated
	 */
	public Adapter createLatLonBoxTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.LinearRingType <em>Linear Ring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.LinearRingType
	 * @generated
	 */
	public Adapter createLinearRingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.LineStringType <em>Line String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.LineStringType
	 * @generated
	 */
	public Adapter createLineStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.LineStyleType <em>Line Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.LineStyleType
	 * @generated
	 */
	public Adapter createLineStyleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.LinkType <em>Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.LinkType
	 * @generated
	 */
	public Adapter createLinkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.ListStyleType <em>List Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.ListStyleType
	 * @generated
	 */
	public Adapter createListStyleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.LocationType <em>Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.LocationType
	 * @generated
	 */
	public Adapter createLocationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.LodType <em>Lod Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.LodType
	 * @generated
	 */
	public Adapter createLodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.LookAtType <em>Look At Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.LookAtType
	 * @generated
	 */
	public Adapter createLookAtTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.MetadataType <em>Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.MetadataType
	 * @generated
	 */
	public Adapter createMetadataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.ModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.ModelType
	 * @generated
	 */
	public Adapter createModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.MultiGeometryType <em>Multi Geometry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.MultiGeometryType
	 * @generated
	 */
	public Adapter createMultiGeometryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.NetworkLinkControlType <em>Network Link Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.NetworkLinkControlType
	 * @generated
	 */
	public Adapter createNetworkLinkControlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.NetworkLinkType <em>Network Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.NetworkLinkType
	 * @generated
	 */
	public Adapter createNetworkLinkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.ObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.ObjectType
	 * @generated
	 */
	public Adapter createObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.OrientationType <em>Orientation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.OrientationType
	 * @generated
	 */
	public Adapter createOrientationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.OverlayType <em>Overlay Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.OverlayType
	 * @generated
	 */
	public Adapter createOverlayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.PlacemarkType <em>Placemark Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.PlacemarkType
	 * @generated
	 */
	public Adapter createPlacemarkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.PointType <em>Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.PointType
	 * @generated
	 */
	public Adapter createPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.PolygonType <em>Polygon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.PolygonType
	 * @generated
	 */
	public Adapter createPolygonTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.PolyStyleType <em>Poly Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.PolyStyleType
	 * @generated
	 */
	public Adapter createPolyStyleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.RegionType <em>Region Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.RegionType
	 * @generated
	 */
	public Adapter createRegionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.ReplaceType <em>Replace Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.ReplaceType
	 * @generated
	 */
	public Adapter createReplaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.ScaleType <em>Scale Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.ScaleType
	 * @generated
	 */
	public Adapter createScaleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.ScreenOverlayType <em>Screen Overlay Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.ScreenOverlayType
	 * @generated
	 */
	public Adapter createScreenOverlayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.SnippetType <em>Snippet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.SnippetType
	 * @generated
	 */
	public Adapter createSnippetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.StyleMapPairType <em>Style Map Pair Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.StyleMapPairType
	 * @generated
	 */
	public Adapter createStyleMapPairTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.StyleMapType <em>Style Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.StyleMapType
	 * @generated
	 */
	public Adapter createStyleMapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.StyleSelectorType <em>Style Selector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.StyleSelectorType
	 * @generated
	 */
	public Adapter createStyleSelectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.StyleType <em>Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.StyleType
	 * @generated
	 */
	public Adapter createStyleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.TimePrimitiveType <em>Time Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.TimePrimitiveType
	 * @generated
	 */
	public Adapter createTimePrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.TimeSpanType <em>Time Span Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.TimeSpanType
	 * @generated
	 */
	public Adapter createTimeSpanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.TimeStampType <em>Time Stamp Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.TimeStampType
	 * @generated
	 */
	public Adapter createTimeStampTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.UpdateType <em>Update Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.UpdateType
	 * @generated
	 */
	public Adapter createUpdateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.google.earth.kml._2.Vec2Type <em>Vec2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.google.earth.kml._2.Vec2Type
	 * @generated
	 */
	public Adapter createVec2TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //v21AdapterFactory
