/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2.impl;

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

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
import com.google.earth.kml._2.v21Factory;
import com.google.earth.kml._2.v21Package;
import com.google.earth.kml._2.util.v21Validator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class v21PackageImpl extends EPackageImpl implements v21Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass balloonStyleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundaryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorStyleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass folderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geometryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groundOverlayTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iconStyleIconTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iconStyleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iconTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemIconTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kmlTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelStyleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass latLonAltBoxTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass latLonBoxTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linearRingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineStringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineStyleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listStyleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lodTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lookAtTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiGeometryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkLinkControlTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkLinkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orientationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overlayTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placemarkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygonTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polyStyleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scaleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass screenOverlayTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass snippetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleMapPairTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleMapTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleSelectorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timePrimitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeSpanTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeStampTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vec2TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum altitudeModeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorModeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum itemIconStateEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum listItemTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum refreshModeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum styleStateEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitsEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum viewRefreshModeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType altitudeModeEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType angle180EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType angle180ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType angle360EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType angle360ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType angle90EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType angle90ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType anglepos90EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType anglepos90ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorModeEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType coordinatesTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateTimeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType itemIconStateEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType itemIconStateTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listItemTypeEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType refreshModeEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleStateEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unitsEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType viewRefreshModeEnumObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.google.earth.kml._2.v21Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private v21PackageImpl() {
		super(eNS_URI, v21Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link v21Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static v21Package init() {
		if (isInited) return (v21Package)EPackage.Registry.INSTANCE.getEPackage(v21Package.eNS_URI);

		// Obtain or create and register package
		v21PackageImpl thev21Package = (v21PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof v21PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new v21PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thev21Package.createPackageContents();

		// Initialize created meta-data
		thev21Package.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thev21Package, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return v21Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thev21Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(v21Package.eNS_URI, thev21Package);
		return thev21Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBalloonStyleType() {
		return balloonStyleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBalloonStyleType_Color() {
		return (EAttribute)balloonStyleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBalloonStyleType_BgColor() {
		return (EAttribute)balloonStyleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBalloonStyleType_TextColor() {
		return (EAttribute)balloonStyleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBalloonStyleType_Text() {
		return (EAttribute)balloonStyleTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundaryType() {
		return boundaryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoundaryType_LinearRing() {
		return (EReference)boundaryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeType() {
		return changeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeType_Group() {
		return (EAttribute)changeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeType_ObjectGroup() {
		return (EAttribute)changeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeType_Object() {
		return (EReference)changeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeType_FeatureGroup() {
		return (EAttribute)changeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeType_Feature() {
		return (EReference)changeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeType_GeometryGroup() {
		return (EAttribute)changeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeType_Geometry() {
		return (EReference)changeTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeType_StyleSelectorGroup() {
		return (EAttribute)changeTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeType_StyleSelector() {
		return (EReference)changeTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeType_TimePrimitiveGroup() {
		return (EAttribute)changeTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeType_TimePrimitive() {
		return (EReference)changeTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorStyleType() {
		return colorStyleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorStyleType_Color() {
		return (EAttribute)colorStyleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorStyleType_ColorMode() {
		return (EAttribute)colorStyleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerType() {
		return containerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateType() {
		return createTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateType_Folder() {
		return (EReference)createTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteType() {
		return deleteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeleteType_FeatureGroup() {
		return (EAttribute)deleteTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeleteType_Feature() {
		return (EReference)deleteTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BalloonStyle() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Object() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Coordinates() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Document() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Feature() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Folder() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Geometry() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GroundOverlay() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Icon() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IconStyle() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Kml() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LabelStyle() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LatLonAltBox() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LatLonBox() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LinearRing() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LineString() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LineStyle() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Link() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListStyle() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Location() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Lod() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LookAt() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Model() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MultiGeometry() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NetworkLink() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Orientation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Placemark() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Point() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Polygon() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PolyStyle() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Region() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Scale() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ScreenOverlay() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Style() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StyleSelector() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StyleMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_StyleUrl() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TimePrimitive() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TimeSpan() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TimeStamp() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentType() {
		return documentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentType_FeatureGroup() {
		return (EAttribute)documentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentType_Feature() {
		return (EReference)documentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureType() {
		return featureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureType_Name() {
		return (EAttribute)featureTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureType_Visibility() {
		return (EAttribute)featureTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureType_Open() {
		return (EAttribute)featureTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureType_Address() {
		return (EAttribute)featureTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureType_PhoneNumber() {
		return (EAttribute)featureTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureType_Snippet() {
		return (EReference)featureTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureType_Description() {
		return (EAttribute)featureTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureType_LookAt() {
		return (EReference)featureTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureType_TimePrimitiveGroup() {
		return (EAttribute)featureTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureType_TimePrimitive() {
		return (EReference)featureTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureType_StyleUrl() {
		return (EAttribute)featureTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureType_StyleSelectorGroup() {
		return (EAttribute)featureTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureType_StyleSelector() {
		return (EReference)featureTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureType_Region() {
		return (EReference)featureTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureType_Metadata() {
		return (EReference)featureTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFolderType() {
		return folderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFolderType_FeatureGroup() {
		return (EAttribute)folderTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFolderType_Feature() {
		return (EReference)folderTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeometryType() {
		return geometryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroundOverlayType() {
		return groundOverlayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroundOverlayType_Altitude() {
		return (EAttribute)groundOverlayTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroundOverlayType_AltitudeMode() {
		return (EAttribute)groundOverlayTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroundOverlayType_LatLonBox() {
		return (EReference)groundOverlayTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIconStyleIconType() {
		return iconStyleIconTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIconStyleIconType_Href() {
		return (EAttribute)iconStyleIconTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIconStyleType() {
		return iconStyleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIconStyleType_Scale() {
		return (EAttribute)iconStyleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIconStyleType_Heading() {
		return (EAttribute)iconStyleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIconStyleType_Icon() {
		return (EReference)iconStyleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIconStyleType_HotSpot() {
		return (EReference)iconStyleTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIconType() {
		return iconTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIconType_X() {
		return (EAttribute)iconTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIconType_Y() {
		return (EAttribute)iconTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIconType_W() {
		return (EAttribute)iconTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIconType_H() {
		return (EAttribute)iconTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemIconType() {
		return itemIconTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemIconType_State() {
		return (EAttribute)itemIconTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemIconType_Href() {
		return (EAttribute)itemIconTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKmlType() {
		return kmlTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKmlType_NetworkLinkControl() {
		return (EReference)kmlTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKmlType_FeatureGroup() {
		return (EAttribute)kmlTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKmlType_Feature() {
		return (EReference)kmlTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelStyleType() {
		return labelStyleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelStyleType_Scale() {
		return (EAttribute)labelStyleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLatLonAltBoxType() {
		return latLonAltBoxTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatLonAltBoxType_MinAltitude() {
		return (EAttribute)latLonAltBoxTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatLonAltBoxType_MaxAltitude() {
		return (EAttribute)latLonAltBoxTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatLonAltBoxType_AltitudeMode() {
		return (EAttribute)latLonAltBoxTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLatLonBoxType() {
		return latLonBoxTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatLonBoxType_North() {
		return (EAttribute)latLonBoxTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatLonBoxType_South() {
		return (EAttribute)latLonBoxTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatLonBoxType_East() {
		return (EAttribute)latLonBoxTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatLonBoxType_West() {
		return (EAttribute)latLonBoxTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLatLonBoxType_Rotation() {
		return (EAttribute)latLonBoxTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinearRingType() {
		return linearRingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearRingType_Extrude() {
		return (EAttribute)linearRingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearRingType_Tessellate() {
		return (EAttribute)linearRingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearRingType_AltitudeMode() {
		return (EAttribute)linearRingTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearRingType_Coordinates() {
		return (EAttribute)linearRingTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineStringType() {
		return lineStringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineStringType_Extrude() {
		return (EAttribute)lineStringTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineStringType_Tessellate() {
		return (EAttribute)lineStringTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineStringType_AltitudeMode() {
		return (EAttribute)lineStringTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineStringType_Coordinates() {
		return (EAttribute)lineStringTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineStyleType() {
		return lineStyleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineStyleType_Width() {
		return (EAttribute)lineStyleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkType() {
		return linkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkType_Href() {
		return (EAttribute)linkTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkType_RefreshMode() {
		return (EAttribute)linkTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkType_RefreshInterval() {
		return (EAttribute)linkTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkType_ViewRefreshMode() {
		return (EAttribute)linkTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkType_ViewRefreshTime() {
		return (EAttribute)linkTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkType_ViewBoundScale() {
		return (EAttribute)linkTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkType_ViewFormat() {
		return (EAttribute)linkTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkType_HttpQuery() {
		return (EAttribute)linkTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListStyleType() {
		return listStyleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListStyleType_ListItemType() {
		return (EAttribute)listStyleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListStyleType_BgColor() {
		return (EAttribute)listStyleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListStyleType_ItemIcon() {
		return (EReference)listStyleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationType() {
		return locationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationType_Longitude() {
		return (EAttribute)locationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationType_Latitude() {
		return (EAttribute)locationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationType_Altitude() {
		return (EAttribute)locationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLodType() {
		return lodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLodType_MinLodPixels() {
		return (EAttribute)lodTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLodType_MaxLodPixels() {
		return (EAttribute)lodTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLodType_MinFadeExtent() {
		return (EAttribute)lodTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLodType_MaxFadeExtent() {
		return (EAttribute)lodTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLookAtType() {
		return lookAtTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLookAtType_Longitude() {
		return (EAttribute)lookAtTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLookAtType_Latitude() {
		return (EAttribute)lookAtTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLookAtType_Altitude() {
		return (EAttribute)lookAtTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLookAtType_Range() {
		return (EAttribute)lookAtTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLookAtType_Tilt() {
		return (EAttribute)lookAtTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLookAtType_Heading() {
		return (EAttribute)lookAtTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLookAtType_AltitudeMode() {
		return (EAttribute)lookAtTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetadataType() {
		return metadataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetadataType_Any() {
		return (EAttribute)metadataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelType() {
		return modelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelType_AltitudeMode() {
		return (EAttribute)modelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelType_Location() {
		return (EReference)modelTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelType_Orientation() {
		return (EReference)modelTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelType_Scale() {
		return (EReference)modelTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelType_Link() {
		return (EReference)modelTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiGeometryType() {
		return multiGeometryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiGeometryType_GeometryGroup() {
		return (EAttribute)multiGeometryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiGeometryType_Geometry() {
		return (EReference)multiGeometryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkLinkControlType() {
		return networkLinkControlTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkLinkControlType_MinRefreshPeriod() {
		return (EAttribute)networkLinkControlTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkLinkControlType_Cookie() {
		return (EAttribute)networkLinkControlTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkLinkControlType_Message() {
		return (EAttribute)networkLinkControlTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkLinkControlType_LinkName() {
		return (EAttribute)networkLinkControlTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkLinkControlType_LinkDescription() {
		return (EAttribute)networkLinkControlTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkLinkControlType_LinkSnippet() {
		return (EReference)networkLinkControlTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkLinkControlType_Expires() {
		return (EAttribute)networkLinkControlTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkLinkControlType_Update() {
		return (EReference)networkLinkControlTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkLinkControlType_LookAt() {
		return (EReference)networkLinkControlTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkLinkType() {
		return networkLinkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkLinkType_RefreshVisibility() {
		return (EAttribute)networkLinkTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkLinkType_FlyToView() {
		return (EAttribute)networkLinkTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkLinkType_Link() {
		return (EReference)networkLinkTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNetworkLinkType_Url() {
		return (EReference)networkLinkTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectType() {
		return objectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_Id() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_TargetId() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrientationType() {
		return orientationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrientationType_Heading() {
		return (EAttribute)orientationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrientationType_Tilt() {
		return (EAttribute)orientationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrientationType_Roll() {
		return (EAttribute)orientationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOverlayType() {
		return overlayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOverlayType_Color() {
		return (EAttribute)overlayTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOverlayType_DrawOrder() {
		return (EAttribute)overlayTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOverlayType_Icon() {
		return (EReference)overlayTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlacemarkType() {
		return placemarkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlacemarkType_GeometryGroup() {
		return (EAttribute)placemarkTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlacemarkType_Geometry() {
		return (EReference)placemarkTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointType() {
		return pointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointType_Extrude() {
		return (EAttribute)pointTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointType_Tessellate() {
		return (EAttribute)pointTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointType_AltitudeMode() {
		return (EAttribute)pointTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointType_Coordinates() {
		return (EAttribute)pointTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolygonType() {
		return polygonTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonType_Extrude() {
		return (EAttribute)polygonTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonType_Tessellate() {
		return (EAttribute)polygonTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolygonType_AltitudeMode() {
		return (EAttribute)polygonTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolygonType_OuterBoundaryIs() {
		return (EReference)polygonTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPolygonType_InnerBoundaryIs() {
		return (EReference)polygonTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolyStyleType() {
		return polyStyleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolyStyleType_Fill() {
		return (EAttribute)polyStyleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolyStyleType_Outline() {
		return (EAttribute)polyStyleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegionType() {
		return regionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegionType_LatLonAltBox() {
		return (EReference)regionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegionType_Lod() {
		return (EReference)regionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplaceType() {
		return replaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplaceType_FeatureGroup() {
		return (EAttribute)replaceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplaceType_Feature() {
		return (EReference)replaceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScaleType() {
		return scaleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScaleType_X() {
		return (EAttribute)scaleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScaleType_Y() {
		return (EAttribute)scaleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScaleType_Z() {
		return (EAttribute)scaleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScreenOverlayType() {
		return screenOverlayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScreenOverlayType_OverlayXY() {
		return (EReference)screenOverlayTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScreenOverlayType_ScreenXY() {
		return (EReference)screenOverlayTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScreenOverlayType_RotationXY() {
		return (EReference)screenOverlayTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScreenOverlayType_Size() {
		return (EReference)screenOverlayTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScreenOverlayType_Rotation() {
		return (EAttribute)screenOverlayTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSnippetType() {
		return snippetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSnippetType_Value() {
		return (EAttribute)snippetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSnippetType_MaxLines() {
		return (EAttribute)snippetTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleMapPairType() {
		return styleMapPairTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleMapPairType_Key() {
		return (EAttribute)styleMapPairTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyleMapPairType_StyleUrl() {
		return (EAttribute)styleMapPairTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleMapType() {
		return styleMapTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleMapType_Pair() {
		return (EReference)styleMapTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleSelectorType() {
		return styleSelectorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyleType() {
		return styleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleType_IconStyle() {
		return (EReference)styleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleType_LabelStyle() {
		return (EReference)styleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleType_LineStyle() {
		return (EReference)styleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleType_PolyStyle() {
		return (EReference)styleTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleType_BalloonStyle() {
		return (EReference)styleTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyleType_ListStyle() {
		return (EReference)styleTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimePrimitiveType() {
		return timePrimitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeSpanType() {
		return timeSpanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeSpanType_Begin() {
		return (EAttribute)timeSpanTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeSpanType_End() {
		return (EAttribute)timeSpanTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeStampType() {
		return timeStampTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeStampType_When() {
		return (EAttribute)timeStampTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateType() {
		return updateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateType_TargetHref() {
		return (EAttribute)updateTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateType_Group() {
		return (EAttribute)updateTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateType_Create() {
		return (EReference)updateTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateType_Delete() {
		return (EReference)updateTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateType_Change() {
		return (EReference)updateTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateType_Replace() {
		return (EReference)updateTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVec2Type() {
		return vec2TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVec2Type_X() {
		return (EAttribute)vec2TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVec2Type_Xunits() {
		return (EAttribute)vec2TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVec2Type_Y() {
		return (EAttribute)vec2TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVec2Type_Yunits() {
		return (EAttribute)vec2TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAltitudeModeEnum() {
		return altitudeModeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColorModeEnum() {
		return colorModeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getItemIconStateEnum() {
		return itemIconStateEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getListItemTypeEnum() {
		return listItemTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRefreshModeEnum() {
		return refreshModeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStyleStateEnum() {
		return styleStateEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnitsEnum() {
		return unitsEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getViewRefreshModeEnum() {
		return viewRefreshModeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAltitudeModeEnumObject() {
		return altitudeModeEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAngle180() {
		return angle180EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAngle180Object() {
		return angle180ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAngle360() {
		return angle360EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAngle360Object() {
		return angle360ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAngle90() {
		return angle90EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAngle90Object() {
		return angle90ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAnglepos90() {
		return anglepos90EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAnglepos90Object() {
		return anglepos90ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColor() {
		return colorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColorModeEnumObject() {
		return colorModeEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCoordinatesType() {
		return coordinatesTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDateTimeType() {
		return dateTimeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getItemIconStateEnumObject() {
		return itemIconStateEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getItemIconStateType() {
		return itemIconStateTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getListItemTypeEnumObject() {
		return listItemTypeEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRefreshModeEnumObject() {
		return refreshModeEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleStateEnumObject() {
		return styleStateEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUnitsEnumObject() {
		return unitsEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getViewRefreshModeEnumObject() {
		return viewRefreshModeEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public v21Factory getv21Factory() {
		return (v21Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		balloonStyleTypeEClass = createEClass(BALLOON_STYLE_TYPE);
		createEAttribute(balloonStyleTypeEClass, BALLOON_STYLE_TYPE__COLOR);
		createEAttribute(balloonStyleTypeEClass, BALLOON_STYLE_TYPE__BG_COLOR);
		createEAttribute(balloonStyleTypeEClass, BALLOON_STYLE_TYPE__TEXT_COLOR);
		createEAttribute(balloonStyleTypeEClass, BALLOON_STYLE_TYPE__TEXT);

		boundaryTypeEClass = createEClass(BOUNDARY_TYPE);
		createEReference(boundaryTypeEClass, BOUNDARY_TYPE__LINEAR_RING);

		changeTypeEClass = createEClass(CHANGE_TYPE);
		createEAttribute(changeTypeEClass, CHANGE_TYPE__GROUP);
		createEAttribute(changeTypeEClass, CHANGE_TYPE__OBJECT_GROUP);
		createEReference(changeTypeEClass, CHANGE_TYPE__OBJECT);
		createEAttribute(changeTypeEClass, CHANGE_TYPE__FEATURE_GROUP);
		createEReference(changeTypeEClass, CHANGE_TYPE__FEATURE);
		createEAttribute(changeTypeEClass, CHANGE_TYPE__GEOMETRY_GROUP);
		createEReference(changeTypeEClass, CHANGE_TYPE__GEOMETRY);
		createEAttribute(changeTypeEClass, CHANGE_TYPE__STYLE_SELECTOR_GROUP);
		createEReference(changeTypeEClass, CHANGE_TYPE__STYLE_SELECTOR);
		createEAttribute(changeTypeEClass, CHANGE_TYPE__TIME_PRIMITIVE_GROUP);
		createEReference(changeTypeEClass, CHANGE_TYPE__TIME_PRIMITIVE);

		colorStyleTypeEClass = createEClass(COLOR_STYLE_TYPE);
		createEAttribute(colorStyleTypeEClass, COLOR_STYLE_TYPE__COLOR);
		createEAttribute(colorStyleTypeEClass, COLOR_STYLE_TYPE__COLOR_MODE);

		containerTypeEClass = createEClass(CONTAINER_TYPE);

		createTypeEClass = createEClass(CREATE_TYPE);
		createEReference(createTypeEClass, CREATE_TYPE__FOLDER);

		deleteTypeEClass = createEClass(DELETE_TYPE);
		createEAttribute(deleteTypeEClass, DELETE_TYPE__FEATURE_GROUP);
		createEReference(deleteTypeEClass, DELETE_TYPE__FEATURE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BALLOON_STYLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__OBJECT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__COORDINATES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DOCUMENT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FEATURE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FOLDER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GEOMETRY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GROUND_OVERLAY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ICON);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ICON_STYLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__KML);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LABEL_STYLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LAT_LON_ALT_BOX);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LAT_LON_BOX);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LINEAR_RING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LINE_STRING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LINE_STYLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LINK);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LIST_STYLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LOD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LOOK_AT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MODEL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MULTI_GEOMETRY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NETWORK_LINK);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ORIENTATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PLACEMARK);
		createEReference(documentRootEClass, DOCUMENT_ROOT__POINT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__POLYGON);
		createEReference(documentRootEClass, DOCUMENT_ROOT__POLY_STYLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REGION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SCALE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SCREEN_OVERLAY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__STYLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__STYLE_SELECTOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__STYLE_MAP);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__STYLE_URL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TIME_PRIMITIVE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TIME_SPAN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TIME_STAMP);

		documentTypeEClass = createEClass(DOCUMENT_TYPE);
		createEAttribute(documentTypeEClass, DOCUMENT_TYPE__FEATURE_GROUP);
		createEReference(documentTypeEClass, DOCUMENT_TYPE__FEATURE);

		featureTypeEClass = createEClass(FEATURE_TYPE);
		createEAttribute(featureTypeEClass, FEATURE_TYPE__NAME);
		createEAttribute(featureTypeEClass, FEATURE_TYPE__VISIBILITY);
		createEAttribute(featureTypeEClass, FEATURE_TYPE__OPEN);
		createEAttribute(featureTypeEClass, FEATURE_TYPE__ADDRESS);
		createEAttribute(featureTypeEClass, FEATURE_TYPE__PHONE_NUMBER);
		createEReference(featureTypeEClass, FEATURE_TYPE__SNIPPET);
		createEAttribute(featureTypeEClass, FEATURE_TYPE__DESCRIPTION);
		createEReference(featureTypeEClass, FEATURE_TYPE__LOOK_AT);
		createEAttribute(featureTypeEClass, FEATURE_TYPE__TIME_PRIMITIVE_GROUP);
		createEReference(featureTypeEClass, FEATURE_TYPE__TIME_PRIMITIVE);
		createEAttribute(featureTypeEClass, FEATURE_TYPE__STYLE_URL);
		createEAttribute(featureTypeEClass, FEATURE_TYPE__STYLE_SELECTOR_GROUP);
		createEReference(featureTypeEClass, FEATURE_TYPE__STYLE_SELECTOR);
		createEReference(featureTypeEClass, FEATURE_TYPE__REGION);
		createEReference(featureTypeEClass, FEATURE_TYPE__METADATA);

		folderTypeEClass = createEClass(FOLDER_TYPE);
		createEAttribute(folderTypeEClass, FOLDER_TYPE__FEATURE_GROUP);
		createEReference(folderTypeEClass, FOLDER_TYPE__FEATURE);

		geometryTypeEClass = createEClass(GEOMETRY_TYPE);

		groundOverlayTypeEClass = createEClass(GROUND_OVERLAY_TYPE);
		createEAttribute(groundOverlayTypeEClass, GROUND_OVERLAY_TYPE__ALTITUDE);
		createEAttribute(groundOverlayTypeEClass, GROUND_OVERLAY_TYPE__ALTITUDE_MODE);
		createEReference(groundOverlayTypeEClass, GROUND_OVERLAY_TYPE__LAT_LON_BOX);

		iconStyleIconTypeEClass = createEClass(ICON_STYLE_ICON_TYPE);
		createEAttribute(iconStyleIconTypeEClass, ICON_STYLE_ICON_TYPE__HREF);

		iconStyleTypeEClass = createEClass(ICON_STYLE_TYPE);
		createEAttribute(iconStyleTypeEClass, ICON_STYLE_TYPE__SCALE);
		createEAttribute(iconStyleTypeEClass, ICON_STYLE_TYPE__HEADING);
		createEReference(iconStyleTypeEClass, ICON_STYLE_TYPE__ICON);
		createEReference(iconStyleTypeEClass, ICON_STYLE_TYPE__HOT_SPOT);

		iconTypeEClass = createEClass(ICON_TYPE);
		createEAttribute(iconTypeEClass, ICON_TYPE__X);
		createEAttribute(iconTypeEClass, ICON_TYPE__Y);
		createEAttribute(iconTypeEClass, ICON_TYPE__W);
		createEAttribute(iconTypeEClass, ICON_TYPE__H);

		itemIconTypeEClass = createEClass(ITEM_ICON_TYPE);
		createEAttribute(itemIconTypeEClass, ITEM_ICON_TYPE__STATE);
		createEAttribute(itemIconTypeEClass, ITEM_ICON_TYPE__HREF);

		kmlTypeEClass = createEClass(KML_TYPE);
		createEReference(kmlTypeEClass, KML_TYPE__NETWORK_LINK_CONTROL);
		createEAttribute(kmlTypeEClass, KML_TYPE__FEATURE_GROUP);
		createEReference(kmlTypeEClass, KML_TYPE__FEATURE);

		labelStyleTypeEClass = createEClass(LABEL_STYLE_TYPE);
		createEAttribute(labelStyleTypeEClass, LABEL_STYLE_TYPE__SCALE);

		latLonAltBoxTypeEClass = createEClass(LAT_LON_ALT_BOX_TYPE);
		createEAttribute(latLonAltBoxTypeEClass, LAT_LON_ALT_BOX_TYPE__MIN_ALTITUDE);
		createEAttribute(latLonAltBoxTypeEClass, LAT_LON_ALT_BOX_TYPE__MAX_ALTITUDE);
		createEAttribute(latLonAltBoxTypeEClass, LAT_LON_ALT_BOX_TYPE__ALTITUDE_MODE);

		latLonBoxTypeEClass = createEClass(LAT_LON_BOX_TYPE);
		createEAttribute(latLonBoxTypeEClass, LAT_LON_BOX_TYPE__NORTH);
		createEAttribute(latLonBoxTypeEClass, LAT_LON_BOX_TYPE__SOUTH);
		createEAttribute(latLonBoxTypeEClass, LAT_LON_BOX_TYPE__EAST);
		createEAttribute(latLonBoxTypeEClass, LAT_LON_BOX_TYPE__WEST);
		createEAttribute(latLonBoxTypeEClass, LAT_LON_BOX_TYPE__ROTATION);

		linearRingTypeEClass = createEClass(LINEAR_RING_TYPE);
		createEAttribute(linearRingTypeEClass, LINEAR_RING_TYPE__EXTRUDE);
		createEAttribute(linearRingTypeEClass, LINEAR_RING_TYPE__TESSELLATE);
		createEAttribute(linearRingTypeEClass, LINEAR_RING_TYPE__ALTITUDE_MODE);
		createEAttribute(linearRingTypeEClass, LINEAR_RING_TYPE__COORDINATES);

		lineStringTypeEClass = createEClass(LINE_STRING_TYPE);
		createEAttribute(lineStringTypeEClass, LINE_STRING_TYPE__EXTRUDE);
		createEAttribute(lineStringTypeEClass, LINE_STRING_TYPE__TESSELLATE);
		createEAttribute(lineStringTypeEClass, LINE_STRING_TYPE__ALTITUDE_MODE);
		createEAttribute(lineStringTypeEClass, LINE_STRING_TYPE__COORDINATES);

		lineStyleTypeEClass = createEClass(LINE_STYLE_TYPE);
		createEAttribute(lineStyleTypeEClass, LINE_STYLE_TYPE__WIDTH);

		linkTypeEClass = createEClass(LINK_TYPE);
		createEAttribute(linkTypeEClass, LINK_TYPE__HREF);
		createEAttribute(linkTypeEClass, LINK_TYPE__REFRESH_MODE);
		createEAttribute(linkTypeEClass, LINK_TYPE__REFRESH_INTERVAL);
		createEAttribute(linkTypeEClass, LINK_TYPE__VIEW_REFRESH_MODE);
		createEAttribute(linkTypeEClass, LINK_TYPE__VIEW_REFRESH_TIME);
		createEAttribute(linkTypeEClass, LINK_TYPE__VIEW_BOUND_SCALE);
		createEAttribute(linkTypeEClass, LINK_TYPE__VIEW_FORMAT);
		createEAttribute(linkTypeEClass, LINK_TYPE__HTTP_QUERY);

		listStyleTypeEClass = createEClass(LIST_STYLE_TYPE);
		createEAttribute(listStyleTypeEClass, LIST_STYLE_TYPE__LIST_ITEM_TYPE);
		createEAttribute(listStyleTypeEClass, LIST_STYLE_TYPE__BG_COLOR);
		createEReference(listStyleTypeEClass, LIST_STYLE_TYPE__ITEM_ICON);

		locationTypeEClass = createEClass(LOCATION_TYPE);
		createEAttribute(locationTypeEClass, LOCATION_TYPE__LONGITUDE);
		createEAttribute(locationTypeEClass, LOCATION_TYPE__LATITUDE);
		createEAttribute(locationTypeEClass, LOCATION_TYPE__ALTITUDE);

		lodTypeEClass = createEClass(LOD_TYPE);
		createEAttribute(lodTypeEClass, LOD_TYPE__MIN_LOD_PIXELS);
		createEAttribute(lodTypeEClass, LOD_TYPE__MAX_LOD_PIXELS);
		createEAttribute(lodTypeEClass, LOD_TYPE__MIN_FADE_EXTENT);
		createEAttribute(lodTypeEClass, LOD_TYPE__MAX_FADE_EXTENT);

		lookAtTypeEClass = createEClass(LOOK_AT_TYPE);
		createEAttribute(lookAtTypeEClass, LOOK_AT_TYPE__LONGITUDE);
		createEAttribute(lookAtTypeEClass, LOOK_AT_TYPE__LATITUDE);
		createEAttribute(lookAtTypeEClass, LOOK_AT_TYPE__ALTITUDE);
		createEAttribute(lookAtTypeEClass, LOOK_AT_TYPE__RANGE);
		createEAttribute(lookAtTypeEClass, LOOK_AT_TYPE__TILT);
		createEAttribute(lookAtTypeEClass, LOOK_AT_TYPE__HEADING);
		createEAttribute(lookAtTypeEClass, LOOK_AT_TYPE__ALTITUDE_MODE);

		metadataTypeEClass = createEClass(METADATA_TYPE);
		createEAttribute(metadataTypeEClass, METADATA_TYPE__ANY);

		modelTypeEClass = createEClass(MODEL_TYPE);
		createEAttribute(modelTypeEClass, MODEL_TYPE__ALTITUDE_MODE);
		createEReference(modelTypeEClass, MODEL_TYPE__LOCATION);
		createEReference(modelTypeEClass, MODEL_TYPE__ORIENTATION);
		createEReference(modelTypeEClass, MODEL_TYPE__SCALE);
		createEReference(modelTypeEClass, MODEL_TYPE__LINK);

		multiGeometryTypeEClass = createEClass(MULTI_GEOMETRY_TYPE);
		createEAttribute(multiGeometryTypeEClass, MULTI_GEOMETRY_TYPE__GEOMETRY_GROUP);
		createEReference(multiGeometryTypeEClass, MULTI_GEOMETRY_TYPE__GEOMETRY);

		networkLinkControlTypeEClass = createEClass(NETWORK_LINK_CONTROL_TYPE);
		createEAttribute(networkLinkControlTypeEClass, NETWORK_LINK_CONTROL_TYPE__MIN_REFRESH_PERIOD);
		createEAttribute(networkLinkControlTypeEClass, NETWORK_LINK_CONTROL_TYPE__COOKIE);
		createEAttribute(networkLinkControlTypeEClass, NETWORK_LINK_CONTROL_TYPE__MESSAGE);
		createEAttribute(networkLinkControlTypeEClass, NETWORK_LINK_CONTROL_TYPE__LINK_NAME);
		createEAttribute(networkLinkControlTypeEClass, NETWORK_LINK_CONTROL_TYPE__LINK_DESCRIPTION);
		createEReference(networkLinkControlTypeEClass, NETWORK_LINK_CONTROL_TYPE__LINK_SNIPPET);
		createEAttribute(networkLinkControlTypeEClass, NETWORK_LINK_CONTROL_TYPE__EXPIRES);
		createEReference(networkLinkControlTypeEClass, NETWORK_LINK_CONTROL_TYPE__UPDATE);
		createEReference(networkLinkControlTypeEClass, NETWORK_LINK_CONTROL_TYPE__LOOK_AT);

		networkLinkTypeEClass = createEClass(NETWORK_LINK_TYPE);
		createEAttribute(networkLinkTypeEClass, NETWORK_LINK_TYPE__REFRESH_VISIBILITY);
		createEAttribute(networkLinkTypeEClass, NETWORK_LINK_TYPE__FLY_TO_VIEW);
		createEReference(networkLinkTypeEClass, NETWORK_LINK_TYPE__LINK);
		createEReference(networkLinkTypeEClass, NETWORK_LINK_TYPE__URL);

		objectTypeEClass = createEClass(OBJECT_TYPE);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__ID);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__TARGET_ID);

		orientationTypeEClass = createEClass(ORIENTATION_TYPE);
		createEAttribute(orientationTypeEClass, ORIENTATION_TYPE__HEADING);
		createEAttribute(orientationTypeEClass, ORIENTATION_TYPE__TILT);
		createEAttribute(orientationTypeEClass, ORIENTATION_TYPE__ROLL);

		overlayTypeEClass = createEClass(OVERLAY_TYPE);
		createEAttribute(overlayTypeEClass, OVERLAY_TYPE__COLOR);
		createEAttribute(overlayTypeEClass, OVERLAY_TYPE__DRAW_ORDER);
		createEReference(overlayTypeEClass, OVERLAY_TYPE__ICON);

		placemarkTypeEClass = createEClass(PLACEMARK_TYPE);
		createEAttribute(placemarkTypeEClass, PLACEMARK_TYPE__GEOMETRY_GROUP);
		createEReference(placemarkTypeEClass, PLACEMARK_TYPE__GEOMETRY);

		pointTypeEClass = createEClass(POINT_TYPE);
		createEAttribute(pointTypeEClass, POINT_TYPE__EXTRUDE);
		createEAttribute(pointTypeEClass, POINT_TYPE__TESSELLATE);
		createEAttribute(pointTypeEClass, POINT_TYPE__ALTITUDE_MODE);
		createEAttribute(pointTypeEClass, POINT_TYPE__COORDINATES);

		polygonTypeEClass = createEClass(POLYGON_TYPE);
		createEAttribute(polygonTypeEClass, POLYGON_TYPE__EXTRUDE);
		createEAttribute(polygonTypeEClass, POLYGON_TYPE__TESSELLATE);
		createEAttribute(polygonTypeEClass, POLYGON_TYPE__ALTITUDE_MODE);
		createEReference(polygonTypeEClass, POLYGON_TYPE__OUTER_BOUNDARY_IS);
		createEReference(polygonTypeEClass, POLYGON_TYPE__INNER_BOUNDARY_IS);

		polyStyleTypeEClass = createEClass(POLY_STYLE_TYPE);
		createEAttribute(polyStyleTypeEClass, POLY_STYLE_TYPE__FILL);
		createEAttribute(polyStyleTypeEClass, POLY_STYLE_TYPE__OUTLINE);

		regionTypeEClass = createEClass(REGION_TYPE);
		createEReference(regionTypeEClass, REGION_TYPE__LAT_LON_ALT_BOX);
		createEReference(regionTypeEClass, REGION_TYPE__LOD);

		replaceTypeEClass = createEClass(REPLACE_TYPE);
		createEAttribute(replaceTypeEClass, REPLACE_TYPE__FEATURE_GROUP);
		createEReference(replaceTypeEClass, REPLACE_TYPE__FEATURE);

		scaleTypeEClass = createEClass(SCALE_TYPE);
		createEAttribute(scaleTypeEClass, SCALE_TYPE__X);
		createEAttribute(scaleTypeEClass, SCALE_TYPE__Y);
		createEAttribute(scaleTypeEClass, SCALE_TYPE__Z);

		screenOverlayTypeEClass = createEClass(SCREEN_OVERLAY_TYPE);
		createEReference(screenOverlayTypeEClass, SCREEN_OVERLAY_TYPE__OVERLAY_XY);
		createEReference(screenOverlayTypeEClass, SCREEN_OVERLAY_TYPE__SCREEN_XY);
		createEReference(screenOverlayTypeEClass, SCREEN_OVERLAY_TYPE__ROTATION_XY);
		createEReference(screenOverlayTypeEClass, SCREEN_OVERLAY_TYPE__SIZE);
		createEAttribute(screenOverlayTypeEClass, SCREEN_OVERLAY_TYPE__ROTATION);

		snippetTypeEClass = createEClass(SNIPPET_TYPE);
		createEAttribute(snippetTypeEClass, SNIPPET_TYPE__VALUE);
		createEAttribute(snippetTypeEClass, SNIPPET_TYPE__MAX_LINES);

		styleMapPairTypeEClass = createEClass(STYLE_MAP_PAIR_TYPE);
		createEAttribute(styleMapPairTypeEClass, STYLE_MAP_PAIR_TYPE__KEY);
		createEAttribute(styleMapPairTypeEClass, STYLE_MAP_PAIR_TYPE__STYLE_URL);

		styleMapTypeEClass = createEClass(STYLE_MAP_TYPE);
		createEReference(styleMapTypeEClass, STYLE_MAP_TYPE__PAIR);

		styleSelectorTypeEClass = createEClass(STYLE_SELECTOR_TYPE);

		styleTypeEClass = createEClass(STYLE_TYPE);
		createEReference(styleTypeEClass, STYLE_TYPE__ICON_STYLE);
		createEReference(styleTypeEClass, STYLE_TYPE__LABEL_STYLE);
		createEReference(styleTypeEClass, STYLE_TYPE__LINE_STYLE);
		createEReference(styleTypeEClass, STYLE_TYPE__POLY_STYLE);
		createEReference(styleTypeEClass, STYLE_TYPE__BALLOON_STYLE);
		createEReference(styleTypeEClass, STYLE_TYPE__LIST_STYLE);

		timePrimitiveTypeEClass = createEClass(TIME_PRIMITIVE_TYPE);

		timeSpanTypeEClass = createEClass(TIME_SPAN_TYPE);
		createEAttribute(timeSpanTypeEClass, TIME_SPAN_TYPE__BEGIN);
		createEAttribute(timeSpanTypeEClass, TIME_SPAN_TYPE__END);

		timeStampTypeEClass = createEClass(TIME_STAMP_TYPE);
		createEAttribute(timeStampTypeEClass, TIME_STAMP_TYPE__WHEN);

		updateTypeEClass = createEClass(UPDATE_TYPE);
		createEAttribute(updateTypeEClass, UPDATE_TYPE__TARGET_HREF);
		createEAttribute(updateTypeEClass, UPDATE_TYPE__GROUP);
		createEReference(updateTypeEClass, UPDATE_TYPE__CREATE);
		createEReference(updateTypeEClass, UPDATE_TYPE__DELETE);
		createEReference(updateTypeEClass, UPDATE_TYPE__CHANGE);
		createEReference(updateTypeEClass, UPDATE_TYPE__REPLACE);

		vec2TypeEClass = createEClass(VEC2_TYPE);
		createEAttribute(vec2TypeEClass, VEC2_TYPE__X);
		createEAttribute(vec2TypeEClass, VEC2_TYPE__XUNITS);
		createEAttribute(vec2TypeEClass, VEC2_TYPE__Y);
		createEAttribute(vec2TypeEClass, VEC2_TYPE__YUNITS);

		// Create enums
		altitudeModeEnumEEnum = createEEnum(ALTITUDE_MODE_ENUM);
		colorModeEnumEEnum = createEEnum(COLOR_MODE_ENUM);
		itemIconStateEnumEEnum = createEEnum(ITEM_ICON_STATE_ENUM);
		listItemTypeEnumEEnum = createEEnum(LIST_ITEM_TYPE_ENUM);
		refreshModeEnumEEnum = createEEnum(REFRESH_MODE_ENUM);
		styleStateEnumEEnum = createEEnum(STYLE_STATE_ENUM);
		unitsEnumEEnum = createEEnum(UNITS_ENUM);
		viewRefreshModeEnumEEnum = createEEnum(VIEW_REFRESH_MODE_ENUM);

		// Create data types
		altitudeModeEnumObjectEDataType = createEDataType(ALTITUDE_MODE_ENUM_OBJECT);
		angle180EDataType = createEDataType(ANGLE180);
		angle180ObjectEDataType = createEDataType(ANGLE180_OBJECT);
		angle360EDataType = createEDataType(ANGLE360);
		angle360ObjectEDataType = createEDataType(ANGLE360_OBJECT);
		angle90EDataType = createEDataType(ANGLE90);
		angle90ObjectEDataType = createEDataType(ANGLE90_OBJECT);
		anglepos90EDataType = createEDataType(ANGLEPOS90);
		anglepos90ObjectEDataType = createEDataType(ANGLEPOS90_OBJECT);
		colorEDataType = createEDataType(COLOR);
		colorModeEnumObjectEDataType = createEDataType(COLOR_MODE_ENUM_OBJECT);
		coordinatesTypeEDataType = createEDataType(COORDINATES_TYPE);
		dateTimeTypeEDataType = createEDataType(DATE_TIME_TYPE);
		itemIconStateEnumObjectEDataType = createEDataType(ITEM_ICON_STATE_ENUM_OBJECT);
		itemIconStateTypeEDataType = createEDataType(ITEM_ICON_STATE_TYPE);
		listItemTypeEnumObjectEDataType = createEDataType(LIST_ITEM_TYPE_ENUM_OBJECT);
		refreshModeEnumObjectEDataType = createEDataType(REFRESH_MODE_ENUM_OBJECT);
		styleStateEnumObjectEDataType = createEDataType(STYLE_STATE_ENUM_OBJECT);
		unitsEnumObjectEDataType = createEDataType(UNITS_ENUM_OBJECT);
		viewRefreshModeEnumObjectEDataType = createEDataType(VIEW_REFRESH_MODE_ENUM_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		balloonStyleTypeEClass.getESuperTypes().add(this.getObjectType());
		colorStyleTypeEClass.getESuperTypes().add(this.getObjectType());
		containerTypeEClass.getESuperTypes().add(this.getFeatureType());
		documentTypeEClass.getESuperTypes().add(this.getContainerType());
		featureTypeEClass.getESuperTypes().add(this.getObjectType());
		folderTypeEClass.getESuperTypes().add(this.getContainerType());
		geometryTypeEClass.getESuperTypes().add(this.getObjectType());
		groundOverlayTypeEClass.getESuperTypes().add(this.getOverlayType());
		iconStyleIconTypeEClass.getESuperTypes().add(this.getObjectType());
		iconStyleTypeEClass.getESuperTypes().add(this.getColorStyleType());
		iconTypeEClass.getESuperTypes().add(this.getLinkType());
		itemIconTypeEClass.getESuperTypes().add(this.getObjectType());
		labelStyleTypeEClass.getESuperTypes().add(this.getColorStyleType());
		latLonAltBoxTypeEClass.getESuperTypes().add(this.getLatLonBoxType());
		latLonBoxTypeEClass.getESuperTypes().add(this.getObjectType());
		linearRingTypeEClass.getESuperTypes().add(this.getGeometryType());
		lineStringTypeEClass.getESuperTypes().add(this.getGeometryType());
		lineStyleTypeEClass.getESuperTypes().add(this.getColorStyleType());
		linkTypeEClass.getESuperTypes().add(this.getObjectType());
		listStyleTypeEClass.getESuperTypes().add(this.getObjectType());
		locationTypeEClass.getESuperTypes().add(this.getObjectType());
		lodTypeEClass.getESuperTypes().add(this.getObjectType());
		lookAtTypeEClass.getESuperTypes().add(this.getObjectType());
		modelTypeEClass.getESuperTypes().add(this.getGeometryType());
		multiGeometryTypeEClass.getESuperTypes().add(this.getGeometryType());
		networkLinkTypeEClass.getESuperTypes().add(this.getFeatureType());
		orientationTypeEClass.getESuperTypes().add(this.getObjectType());
		overlayTypeEClass.getESuperTypes().add(this.getFeatureType());
		placemarkTypeEClass.getESuperTypes().add(this.getFeatureType());
		pointTypeEClass.getESuperTypes().add(this.getGeometryType());
		polygonTypeEClass.getESuperTypes().add(this.getGeometryType());
		polyStyleTypeEClass.getESuperTypes().add(this.getColorStyleType());
		regionTypeEClass.getESuperTypes().add(this.getObjectType());
		scaleTypeEClass.getESuperTypes().add(this.getObjectType());
		screenOverlayTypeEClass.getESuperTypes().add(this.getOverlayType());
		styleMapTypeEClass.getESuperTypes().add(this.getStyleSelectorType());
		styleSelectorTypeEClass.getESuperTypes().add(this.getObjectType());
		styleTypeEClass.getESuperTypes().add(this.getStyleSelectorType());
		timePrimitiveTypeEClass.getESuperTypes().add(this.getObjectType());
		timeSpanTypeEClass.getESuperTypes().add(this.getTimePrimitiveType());
		timeStampTypeEClass.getESuperTypes().add(this.getTimePrimitiveType());

		// Initialize classes and features; add operations and parameters
		initEClass(balloonStyleTypeEClass, BalloonStyleType.class, "BalloonStyleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBalloonStyleType_Color(), this.getColor(), "color", "ffffffff", 0, 1, BalloonStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBalloonStyleType_BgColor(), this.getColor(), "bgColor", "ffffffff", 0, 1, BalloonStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBalloonStyleType_TextColor(), this.getColor(), "textColor", "ff000000", 0, 1, BalloonStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBalloonStyleType_Text(), theXMLTypePackage.getString(), "text", null, 0, 1, BalloonStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundaryTypeEClass, BoundaryType.class, "BoundaryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoundaryType_LinearRing(), this.getLinearRingType(), null, "linearRing", null, 1, 1, BoundaryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeTypeEClass, ChangeType.class, "ChangeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ChangeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeType_ObjectGroup(), ecorePackage.getEFeatureMapEntry(), "objectGroup", null, 0, -1, ChangeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getChangeType_Object(), this.getObjectType(), null, "object", null, 0, -1, ChangeType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeType_FeatureGroup(), ecorePackage.getEFeatureMapEntry(), "featureGroup", null, 0, -1, ChangeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getChangeType_Feature(), this.getFeatureType(), null, "feature", null, 0, -1, ChangeType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeType_GeometryGroup(), ecorePackage.getEFeatureMapEntry(), "geometryGroup", null, 0, -1, ChangeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getChangeType_Geometry(), this.getGeometryType(), null, "geometry", null, 0, -1, ChangeType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeType_StyleSelectorGroup(), ecorePackage.getEFeatureMapEntry(), "styleSelectorGroup", null, 0, -1, ChangeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getChangeType_StyleSelector(), this.getStyleSelectorType(), null, "styleSelector", null, 0, -1, ChangeType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeType_TimePrimitiveGroup(), ecorePackage.getEFeatureMapEntry(), "timePrimitiveGroup", null, 0, -1, ChangeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getChangeType_TimePrimitive(), this.getTimePrimitiveType(), null, "timePrimitive", null, 0, -1, ChangeType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(colorStyleTypeEClass, ColorStyleType.class, "ColorStyleType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColorStyleType_Color(), this.getColor(), "color", "ffffffff", 0, 1, ColorStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColorStyleType_ColorMode(), this.getColorModeEnum(), "colorMode", "normal", 0, 1, ColorStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerTypeEClass, ContainerType.class, "ContainerType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createTypeEClass, CreateType.class, "CreateType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreateType_Folder(), this.getFolderType(), null, "folder", null, 1, 1, CreateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deleteTypeEClass, DeleteType.class, "DeleteType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeleteType_FeatureGroup(), ecorePackage.getEFeatureMapEntry(), "featureGroup", null, 0, -1, DeleteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeleteType_Feature(), this.getFeatureType(), null, "feature", null, 0, -1, DeleteType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_BalloonStyle(), this.getBalloonStyleType(), null, "balloonStyle", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Object(), this.getObjectType(), null, "object", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Coordinates(), this.getCoordinatesType(), "coordinates", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Document(), this.getDocumentType(), null, "document", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Feature(), this.getFeatureType(), null, "feature", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Folder(), this.getFolderType(), null, "folder", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Geometry(), this.getGeometryType(), null, "geometry", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GroundOverlay(), this.getGroundOverlayType(), null, "groundOverlay", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Icon(), this.getLinkType(), null, "icon", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_IconStyle(), this.getIconStyleType(), null, "iconStyle", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Kml(), this.getKmlType(), null, "kml", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LabelStyle(), this.getLabelStyleType(), null, "labelStyle", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LatLonAltBox(), this.getLatLonAltBoxType(), null, "latLonAltBox", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LatLonBox(), this.getLatLonBoxType(), null, "latLonBox", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LinearRing(), this.getLinearRingType(), null, "linearRing", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LineString(), this.getLineStringType(), null, "lineString", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LineStyle(), this.getLineStyleType(), null, "lineStyle", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Link(), this.getLinkType(), null, "link", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ListStyle(), this.getListStyleType(), null, "listStyle", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Location(), this.getLocationType(), null, "location", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Lod(), this.getLodType(), null, "lod", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LookAt(), this.getLookAtType(), null, "lookAt", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Model(), this.getModelType(), null, "model", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_MultiGeometry(), this.getMultiGeometryType(), null, "multiGeometry", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_NetworkLink(), this.getNetworkLinkType(), null, "networkLink", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Orientation(), this.getOrientationType(), null, "orientation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Placemark(), this.getPlacemarkType(), null, "placemark", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Point(), this.getPointType(), null, "point", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Polygon(), this.getPolygonType(), null, "polygon", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PolyStyle(), this.getPolyStyleType(), null, "polyStyle", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Region(), this.getRegionType(), null, "region", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Scale(), this.getScaleType(), null, "scale", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ScreenOverlay(), this.getScreenOverlayType(), null, "screenOverlay", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Style(), this.getStyleType(), null, "style", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_StyleSelector(), this.getStyleSelectorType(), null, "styleSelector", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_StyleMap(), this.getStyleMapType(), null, "styleMap", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_StyleUrl(), theXMLTypePackage.getAnyURI(), "styleUrl", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TimePrimitive(), this.getTimePrimitiveType(), null, "timePrimitive", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TimeSpan(), this.getTimeSpanType(), null, "timeSpan", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TimeStamp(), this.getTimeStampType(), null, "timeStamp", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(documentTypeEClass, DocumentType.class, "DocumentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentType_FeatureGroup(), ecorePackage.getEFeatureMapEntry(), "featureGroup", null, 0, -1, DocumentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentType_Feature(), this.getFeatureType(), null, "feature", null, 0, -1, DocumentType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(featureTypeEClass, FeatureType.class, "FeatureType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, FeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureType_Visibility(), theXMLTypePackage.getBoolean(), "visibility", "1", 0, 1, FeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureType_Open(), theXMLTypePackage.getBoolean(), "open", "1", 0, 1, FeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureType_Address(), theXMLTypePackage.getString(), "address", null, 0, 1, FeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureType_PhoneNumber(), theXMLTypePackage.getString(), "phoneNumber", null, 0, 1, FeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureType_Snippet(), this.getSnippetType(), null, "snippet", null, 0, 1, FeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, FeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureType_LookAt(), this.getLookAtType(), null, "lookAt", null, 0, 1, FeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureType_TimePrimitiveGroup(), ecorePackage.getEFeatureMapEntry(), "timePrimitiveGroup", null, 0, 1, FeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureType_TimePrimitive(), this.getTimePrimitiveType(), null, "timePrimitive", null, 0, 1, FeatureType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureType_StyleUrl(), theXMLTypePackage.getAnyURI(), "styleUrl", null, 0, 1, FeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureType_StyleSelectorGroup(), ecorePackage.getEFeatureMapEntry(), "styleSelectorGroup", null, 0, -1, FeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureType_StyleSelector(), this.getStyleSelectorType(), null, "styleSelector", null, 0, -1, FeatureType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureType_Region(), this.getRegionType(), null, "region", null, 0, 1, FeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureType_Metadata(), this.getMetadataType(), null, "metadata", null, 0, 1, FeatureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(folderTypeEClass, FolderType.class, "FolderType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFolderType_FeatureGroup(), ecorePackage.getEFeatureMapEntry(), "featureGroup", null, 0, -1, FolderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFolderType_Feature(), this.getFeatureType(), null, "feature", null, 0, -1, FolderType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(geometryTypeEClass, GeometryType.class, "GeometryType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(groundOverlayTypeEClass, GroundOverlayType.class, "GroundOverlayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroundOverlayType_Altitude(), theXMLTypePackage.getDouble(), "altitude", "0", 0, 1, GroundOverlayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroundOverlayType_AltitudeMode(), this.getAltitudeModeEnum(), "altitudeMode", "clampToGround", 0, 1, GroundOverlayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroundOverlayType_LatLonBox(), this.getLatLonBoxType(), null, "latLonBox", null, 0, 1, GroundOverlayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iconStyleIconTypeEClass, IconStyleIconType.class, "IconStyleIconType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIconStyleIconType_Href(), theXMLTypePackage.getAnyURI(), "href", null, 1, 1, IconStyleIconType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iconStyleTypeEClass, IconStyleType.class, "IconStyleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIconStyleType_Scale(), theXMLTypePackage.getFloat(), "scale", "1", 0, 1, IconStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIconStyleType_Heading(), theXMLTypePackage.getFloat(), "heading", "0", 0, 1, IconStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIconStyleType_Icon(), this.getIconStyleIconType(), null, "icon", null, 0, 1, IconStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIconStyleType_HotSpot(), this.getVec2Type(), null, "hotSpot", null, 0, 1, IconStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iconTypeEClass, IconType.class, "IconType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIconType_X(), theXMLTypePackage.getInt(), "x", null, 1, 1, IconType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIconType_Y(), theXMLTypePackage.getInt(), "y", null, 1, 1, IconType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIconType_W(), theXMLTypePackage.getInt(), "w", null, 1, 1, IconType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIconType_H(), theXMLTypePackage.getInt(), "h", null, 1, 1, IconType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemIconTypeEClass, ItemIconType.class, "ItemIconType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItemIconType_State(), this.getItemIconStateType(), "state", null, 0, -1, ItemIconType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemIconType_Href(), theXMLTypePackage.getAnyURI(), "href", null, 1, 1, ItemIconType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kmlTypeEClass, KmlType.class, "KmlType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKmlType_NetworkLinkControl(), this.getNetworkLinkControlType(), null, "networkLinkControl", null, 0, 1, KmlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKmlType_FeatureGroup(), ecorePackage.getEFeatureMapEntry(), "featureGroup", null, 0, 1, KmlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKmlType_Feature(), this.getFeatureType(), null, "feature", null, 0, 1, KmlType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(labelStyleTypeEClass, LabelStyleType.class, "LabelStyleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabelStyleType_Scale(), theXMLTypePackage.getFloat(), "scale", "1", 0, 1, LabelStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(latLonAltBoxTypeEClass, LatLonAltBoxType.class, "LatLonAltBoxType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLatLonAltBoxType_MinAltitude(), theXMLTypePackage.getDouble(), "minAltitude", "0", 0, 1, LatLonAltBoxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLatLonAltBoxType_MaxAltitude(), theXMLTypePackage.getDouble(), "maxAltitude", "0", 0, 1, LatLonAltBoxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLatLonAltBoxType_AltitudeMode(), this.getAltitudeModeEnum(), "altitudeMode", "clampToGround", 0, 1, LatLonAltBoxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(latLonBoxTypeEClass, LatLonBoxType.class, "LatLonBoxType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLatLonBoxType_North(), this.getAngle180(), "north", "180.0", 0, 1, LatLonBoxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLatLonBoxType_South(), this.getAngle180(), "south", "-180.0", 0, 1, LatLonBoxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLatLonBoxType_East(), this.getAngle180(), "east", "180.0", 0, 1, LatLonBoxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLatLonBoxType_West(), this.getAngle180(), "west", "-180.0", 0, 1, LatLonBoxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLatLonBoxType_Rotation(), this.getAngle180(), "rotation", "0", 0, 1, LatLonBoxType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linearRingTypeEClass, LinearRingType.class, "LinearRingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinearRingType_Extrude(), theXMLTypePackage.getBoolean(), "extrude", "0", 0, 1, LinearRingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearRingType_Tessellate(), theXMLTypePackage.getBoolean(), "tessellate", "0", 0, 1, LinearRingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearRingType_AltitudeMode(), this.getAltitudeModeEnum(), "altitudeMode", "clampToGround", 0, 1, LinearRingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearRingType_Coordinates(), this.getCoordinatesType(), "coordinates", null, 1, 1, LinearRingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineStringTypeEClass, LineStringType.class, "LineStringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLineStringType_Extrude(), theXMLTypePackage.getBoolean(), "extrude", "0", 0, 1, LineStringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineStringType_Tessellate(), theXMLTypePackage.getBoolean(), "tessellate", "0", 0, 1, LineStringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineStringType_AltitudeMode(), this.getAltitudeModeEnum(), "altitudeMode", "clampToGround", 0, 1, LineStringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineStringType_Coordinates(), this.getCoordinatesType(), "coordinates", null, 1, 1, LineStringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineStyleTypeEClass, LineStyleType.class, "LineStyleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLineStyleType_Width(), theXMLTypePackage.getFloat(), "width", "1", 0, 1, LineStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkTypeEClass, LinkType.class, "LinkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkType_Href(), theXMLTypePackage.getAnyURI(), "href", null, 0, 1, LinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkType_RefreshMode(), this.getRefreshModeEnum(), "refreshMode", "onChange", 0, 1, LinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkType_RefreshInterval(), theXMLTypePackage.getFloat(), "refreshInterval", "4", 0, 1, LinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkType_ViewRefreshMode(), this.getViewRefreshModeEnum(), "viewRefreshMode", "never", 0, 1, LinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkType_ViewRefreshTime(), theXMLTypePackage.getFloat(), "viewRefreshTime", "4", 0, 1, LinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkType_ViewBoundScale(), theXMLTypePackage.getFloat(), "viewBoundScale", "1", 0, 1, LinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkType_ViewFormat(), theXMLTypePackage.getString(), "viewFormat", null, 0, 1, LinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkType_HttpQuery(), theXMLTypePackage.getString(), "httpQuery", null, 0, 1, LinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listStyleTypeEClass, ListStyleType.class, "ListStyleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getListStyleType_ListItemType(), this.getListItemTypeEnum(), "listItemType", "check", 0, 1, ListStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getListStyleType_BgColor(), this.getColor(), "bgColor", "ffffffff", 0, 1, ListStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListStyleType_ItemIcon(), this.getItemIconType(), null, "itemIcon", null, 0, -1, ListStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationTypeEClass, LocationType.class, "LocationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocationType_Longitude(), this.getAngle180(), "longitude", "0", 0, 1, LocationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationType_Latitude(), this.getAngle90(), "latitude", "0", 0, 1, LocationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationType_Altitude(), theXMLTypePackage.getDouble(), "altitude", "0", 0, 1, LocationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lodTypeEClass, LodType.class, "LodType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLodType_MinLodPixels(), theXMLTypePackage.getFloat(), "minLodPixels", "0", 0, 1, LodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLodType_MaxLodPixels(), theXMLTypePackage.getFloat(), "maxLodPixels", "-1", 0, 1, LodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLodType_MinFadeExtent(), theXMLTypePackage.getFloat(), "minFadeExtent", "0", 0, 1, LodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLodType_MaxFadeExtent(), theXMLTypePackage.getFloat(), "maxFadeExtent", "0", 0, 1, LodType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lookAtTypeEClass, LookAtType.class, "LookAtType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLookAtType_Longitude(), this.getAngle180(), "longitude", "0", 0, 1, LookAtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLookAtType_Latitude(), this.getAngle90(), "latitude", "0", 0, 1, LookAtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLookAtType_Altitude(), theXMLTypePackage.getDouble(), "altitude", "0", 0, 1, LookAtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLookAtType_Range(), theXMLTypePackage.getDouble(), "range", null, 0, 1, LookAtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLookAtType_Tilt(), this.getAnglepos90(), "tilt", "0", 0, 1, LookAtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLookAtType_Heading(), this.getAngle360(), "heading", "0", 0, 1, LookAtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLookAtType_AltitudeMode(), this.getAltitudeModeEnum(), "altitudeMode", "clampToGround", 0, 1, LookAtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metadataTypeEClass, MetadataType.class, "MetadataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetadataType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 1, 1, MetadataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelTypeEClass, ModelType.class, "ModelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelType_AltitudeMode(), this.getAltitudeModeEnum(), "altitudeMode", "clampToGround", 0, 1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelType_Location(), this.getLocationType(), null, "location", null, 0, 1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelType_Orientation(), this.getOrientationType(), null, "orientation", null, 0, 1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelType_Scale(), this.getScaleType(), null, "scale", null, 0, 1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelType_Link(), this.getLinkType(), null, "link", null, 0, 1, ModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiGeometryTypeEClass, MultiGeometryType.class, "MultiGeometryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiGeometryType_GeometryGroup(), ecorePackage.getEFeatureMapEntry(), "geometryGroup", null, 1, -1, MultiGeometryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiGeometryType_Geometry(), this.getGeometryType(), null, "geometry", null, 1, -1, MultiGeometryType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(networkLinkControlTypeEClass, NetworkLinkControlType.class, "NetworkLinkControlType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetworkLinkControlType_MinRefreshPeriod(), theXMLTypePackage.getFloat(), "minRefreshPeriod", "0", 0, 1, NetworkLinkControlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkLinkControlType_Cookie(), theXMLTypePackage.getString(), "cookie", null, 0, 1, NetworkLinkControlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkLinkControlType_Message(), theXMLTypePackage.getString(), "message", null, 0, 1, NetworkLinkControlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkLinkControlType_LinkName(), theXMLTypePackage.getString(), "linkName", null, 0, 1, NetworkLinkControlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkLinkControlType_LinkDescription(), theXMLTypePackage.getString(), "linkDescription", null, 0, 1, NetworkLinkControlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkLinkControlType_LinkSnippet(), this.getSnippetType(), null, "linkSnippet", null, 0, 1, NetworkLinkControlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkLinkControlType_Expires(), this.getDateTimeType(), "expires", null, 0, 1, NetworkLinkControlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkLinkControlType_Update(), this.getUpdateType(), null, "update", null, 0, 1, NetworkLinkControlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkLinkControlType_LookAt(), this.getLookAtType(), null, "lookAt", null, 0, 1, NetworkLinkControlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkLinkTypeEClass, NetworkLinkType.class, "NetworkLinkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetworkLinkType_RefreshVisibility(), theXMLTypePackage.getBoolean(), "refreshVisibility", "0", 0, 1, NetworkLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkLinkType_FlyToView(), theXMLTypePackage.getBoolean(), "flyToView", "0", 0, 1, NetworkLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkLinkType_Link(), this.getLinkType(), null, "link", null, 0, 1, NetworkLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkLinkType_Url(), this.getLinkType(), null, "url", null, 0, 1, NetworkLinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectTypeEClass, ObjectType.class, "ObjectType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectType_TargetId(), theXMLTypePackage.getNCName(), "targetId", null, 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orientationTypeEClass, OrientationType.class, "OrientationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrientationType_Heading(), this.getAngle360(), "heading", "0.0", 0, 1, OrientationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrientationType_Tilt(), this.getAngle360(), "tilt", "0.0", 0, 1, OrientationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrientationType_Roll(), this.getAngle360(), "roll", "0.0", 0, 1, OrientationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(overlayTypeEClass, OverlayType.class, "OverlayType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOverlayType_Color(), this.getColor(), "color", "ffffffff", 0, 1, OverlayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOverlayType_DrawOrder(), theXMLTypePackage.getInt(), "drawOrder", "0", 0, 1, OverlayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOverlayType_Icon(), this.getLinkType(), null, "icon", null, 0, 1, OverlayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placemarkTypeEClass, PlacemarkType.class, "PlacemarkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlacemarkType_GeometryGroup(), ecorePackage.getEFeatureMapEntry(), "geometryGroup", null, 0, 1, PlacemarkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlacemarkType_Geometry(), this.getGeometryType(), null, "geometry", null, 0, 1, PlacemarkType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(pointTypeEClass, PointType.class, "PointType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPointType_Extrude(), theXMLTypePackage.getBoolean(), "extrude", "0", 0, 1, PointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPointType_Tessellate(), theXMLTypePackage.getBoolean(), "tessellate", "0", 0, 1, PointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPointType_AltitudeMode(), this.getAltitudeModeEnum(), "altitudeMode", "clampToGround", 0, 1, PointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPointType_Coordinates(), this.getCoordinatesType(), "coordinates", null, 1, 1, PointType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(polygonTypeEClass, PolygonType.class, "PolygonType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolygonType_Extrude(), theXMLTypePackage.getBoolean(), "extrude", "0", 0, 1, PolygonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolygonType_Tessellate(), theXMLTypePackage.getBoolean(), "tessellate", "0", 0, 1, PolygonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolygonType_AltitudeMode(), this.getAltitudeModeEnum(), "altitudeMode", "clampToGround", 0, 1, PolygonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolygonType_OuterBoundaryIs(), this.getBoundaryType(), null, "outerBoundaryIs", null, 0, 1, PolygonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPolygonType_InnerBoundaryIs(), this.getBoundaryType(), null, "innerBoundaryIs", null, 0, -1, PolygonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(polyStyleTypeEClass, PolyStyleType.class, "PolyStyleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolyStyleType_Fill(), theXMLTypePackage.getBoolean(), "fill", "1", 0, 1, PolyStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolyStyleType_Outline(), theXMLTypePackage.getBoolean(), "outline", "1", 0, 1, PolyStyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regionTypeEClass, RegionType.class, "RegionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegionType_LatLonAltBox(), this.getLatLonAltBoxType(), null, "latLonAltBox", null, 1, 1, RegionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegionType_Lod(), this.getLodType(), null, "lod", null, 0, 1, RegionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(replaceTypeEClass, ReplaceType.class, "ReplaceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReplaceType_FeatureGroup(), ecorePackage.getEFeatureMapEntry(), "featureGroup", null, 0, 1, ReplaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReplaceType_Feature(), this.getFeatureType(), null, "feature", null, 0, 1, ReplaceType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(scaleTypeEClass, ScaleType.class, "ScaleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScaleType_X(), theXMLTypePackage.getDouble(), "x", "1.0", 0, 1, ScaleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScaleType_Y(), theXMLTypePackage.getDouble(), "y", "1.0", 0, 1, ScaleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScaleType_Z(), theXMLTypePackage.getDouble(), "z", "1.0", 0, 1, ScaleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(screenOverlayTypeEClass, ScreenOverlayType.class, "ScreenOverlayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScreenOverlayType_OverlayXY(), this.getVec2Type(), null, "overlayXY", null, 0, 1, ScreenOverlayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScreenOverlayType_ScreenXY(), this.getVec2Type(), null, "screenXY", null, 0, 1, ScreenOverlayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScreenOverlayType_RotationXY(), this.getVec2Type(), null, "rotationXY", null, 0, 1, ScreenOverlayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScreenOverlayType_Size(), this.getVec2Type(), null, "size", null, 0, 1, ScreenOverlayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScreenOverlayType_Rotation(), theXMLTypePackage.getFloat(), "rotation", "0", 0, 1, ScreenOverlayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(snippetTypeEClass, SnippetType.class, "SnippetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSnippetType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, SnippetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSnippetType_MaxLines(), theXMLTypePackage.getInt(), "maxLines", "2", 0, 1, SnippetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(styleMapPairTypeEClass, StyleMapPairType.class, "StyleMapPairType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStyleMapPairType_Key(), this.getStyleStateEnum(), "key", null, 1, 1, StyleMapPairType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyleMapPairType_StyleUrl(), theXMLTypePackage.getAnyURI(), "styleUrl", null, 1, 1, StyleMapPairType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(styleMapTypeEClass, StyleMapType.class, "StyleMapType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStyleMapType_Pair(), this.getStyleMapPairType(), null, "pair", null, 1, -1, StyleMapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(styleSelectorTypeEClass, StyleSelectorType.class, "StyleSelectorType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(styleTypeEClass, StyleType.class, "StyleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStyleType_IconStyle(), this.getIconStyleType(), null, "iconStyle", null, 0, 1, StyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyleType_LabelStyle(), this.getLabelStyleType(), null, "labelStyle", null, 0, 1, StyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyleType_LineStyle(), this.getLineStyleType(), null, "lineStyle", null, 0, 1, StyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyleType_PolyStyle(), this.getPolyStyleType(), null, "polyStyle", null, 0, 1, StyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyleType_BalloonStyle(), this.getBalloonStyleType(), null, "balloonStyle", null, 0, 1, StyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyleType_ListStyle(), this.getListStyleType(), null, "listStyle", null, 0, 1, StyleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timePrimitiveTypeEClass, TimePrimitiveType.class, "TimePrimitiveType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeSpanTypeEClass, TimeSpanType.class, "TimeSpanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeSpanType_Begin(), this.getDateTimeType(), "begin", null, 0, 1, TimeSpanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeSpanType_End(), this.getDateTimeType(), "end", null, 0, 1, TimeSpanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeStampTypeEClass, TimeStampType.class, "TimeStampType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeStampType_When(), this.getDateTimeType(), "when", null, 1, 1, TimeStampType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateTypeEClass, UpdateType.class, "UpdateType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdateType_TargetHref(), theXMLTypePackage.getAnyURI(), "targetHref", null, 1, 1, UpdateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdateType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, UpdateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUpdateType_Create(), this.getCreateType(), null, "create", null, 0, -1, UpdateType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUpdateType_Delete(), this.getDeleteType(), null, "delete", null, 0, -1, UpdateType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUpdateType_Change(), this.getChangeType(), null, "change", null, 0, -1, UpdateType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getUpdateType_Replace(), this.getReplaceType(), null, "replace", null, 0, -1, UpdateType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(vec2TypeEClass, Vec2Type.class, "Vec2Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVec2Type_X(), theXMLTypePackage.getDouble(), "x", "1.0", 0, 1, Vec2Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVec2Type_Xunits(), this.getUnitsEnum(), "xunits", "fraction", 0, 1, Vec2Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVec2Type_Y(), theXMLTypePackage.getDouble(), "y", "1.0", 0, 1, Vec2Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVec2Type_Yunits(), this.getUnitsEnum(), "yunits", "fraction", 0, 1, Vec2Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(altitudeModeEnumEEnum, AltitudeModeEnum.class, "AltitudeModeEnum");
		addEEnumLiteral(altitudeModeEnumEEnum, AltitudeModeEnum.CLAMP_TO_GROUND);
		addEEnumLiteral(altitudeModeEnumEEnum, AltitudeModeEnum.RELATIVE_TO_GROUND);
		addEEnumLiteral(altitudeModeEnumEEnum, AltitudeModeEnum.ABSOLUTE);

		initEEnum(colorModeEnumEEnum, ColorModeEnum.class, "ColorModeEnum");
		addEEnumLiteral(colorModeEnumEEnum, ColorModeEnum.NORMAL);
		addEEnumLiteral(colorModeEnumEEnum, ColorModeEnum.RANDOM);

		initEEnum(itemIconStateEnumEEnum, ItemIconStateEnum.class, "ItemIconStateEnum");
		addEEnumLiteral(itemIconStateEnumEEnum, ItemIconStateEnum.OPEN);
		addEEnumLiteral(itemIconStateEnumEEnum, ItemIconStateEnum.CLOSED);
		addEEnumLiteral(itemIconStateEnumEEnum, ItemIconStateEnum.ERROR);
		addEEnumLiteral(itemIconStateEnumEEnum, ItemIconStateEnum.FETCHING0);
		addEEnumLiteral(itemIconStateEnumEEnum, ItemIconStateEnum.FETCHING1);
		addEEnumLiteral(itemIconStateEnumEEnum, ItemIconStateEnum.FETCHING2);

		initEEnum(listItemTypeEnumEEnum, ListItemTypeEnum.class, "ListItemTypeEnum");
		addEEnumLiteral(listItemTypeEnumEEnum, ListItemTypeEnum.RADIO_FOLDER);
		addEEnumLiteral(listItemTypeEnumEEnum, ListItemTypeEnum.CHECK);
		addEEnumLiteral(listItemTypeEnumEEnum, ListItemTypeEnum.CHECK_HIDE_CHILDREN);
		addEEnumLiteral(listItemTypeEnumEEnum, ListItemTypeEnum.CHECK_OFF_ONLY);

		initEEnum(refreshModeEnumEEnum, RefreshModeEnum.class, "RefreshModeEnum");
		addEEnumLiteral(refreshModeEnumEEnum, RefreshModeEnum.ON_CHANGE);
		addEEnumLiteral(refreshModeEnumEEnum, RefreshModeEnum.ON_INTERVAL);
		addEEnumLiteral(refreshModeEnumEEnum, RefreshModeEnum.ON_EXPIRE);

		initEEnum(styleStateEnumEEnum, StyleStateEnum.class, "StyleStateEnum");
		addEEnumLiteral(styleStateEnumEEnum, StyleStateEnum.NORMAL);
		addEEnumLiteral(styleStateEnumEEnum, StyleStateEnum.HIGHLIGHT);

		initEEnum(unitsEnumEEnum, UnitsEnum.class, "UnitsEnum");
		addEEnumLiteral(unitsEnumEEnum, UnitsEnum.FRACTION);
		addEEnumLiteral(unitsEnumEEnum, UnitsEnum.PIXELS);
		addEEnumLiteral(unitsEnumEEnum, UnitsEnum.INSET_PIXELS);

		initEEnum(viewRefreshModeEnumEEnum, ViewRefreshModeEnum.class, "ViewRefreshModeEnum");
		addEEnumLiteral(viewRefreshModeEnumEEnum, ViewRefreshModeEnum.NEVER);
		addEEnumLiteral(viewRefreshModeEnumEEnum, ViewRefreshModeEnum.ON_REQUEST);
		addEEnumLiteral(viewRefreshModeEnumEEnum, ViewRefreshModeEnum.ON_STOP);
		addEEnumLiteral(viewRefreshModeEnumEEnum, ViewRefreshModeEnum.ON_REGION);

		// Initialize data types
		initEDataType(altitudeModeEnumObjectEDataType, AltitudeModeEnum.class, "AltitudeModeEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(angle180EDataType, double.class, "Angle180", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(angle180ObjectEDataType, Double.class, "Angle180Object", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(angle360EDataType, double.class, "Angle360", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(angle360ObjectEDataType, Double.class, "Angle360Object", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(angle90EDataType, double.class, "Angle90", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(angle90ObjectEDataType, Double.class, "Angle90Object", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(anglepos90EDataType, double.class, "Anglepos90", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(anglepos90ObjectEDataType, Double.class, "Anglepos90Object", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(colorEDataType, byte[].class, "Color", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(colorModeEnumObjectEDataType, ColorModeEnum.class, "ColorModeEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(coordinatesTypeEDataType, List.class, "CoordinatesType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dateTimeTypeEDataType, XMLGregorianCalendar.class, "DateTimeType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(itemIconStateEnumObjectEDataType, ItemIconStateEnum.class, "ItemIconStateEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(itemIconStateTypeEDataType, List.class, "ItemIconStateType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(listItemTypeEnumObjectEDataType, ListItemTypeEnum.class, "ListItemTypeEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(refreshModeEnumObjectEDataType, RefreshModeEnum.class, "RefreshModeEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(styleStateEnumObjectEDataType, StyleStateEnum.class, "StyleStateEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unitsEnumObjectEDataType, UnitsEnum.class, "UnitsEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(viewRefreshModeEnumObjectEDataType, ViewRefreshModeEnum.class, "ViewRefreshModeEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";			
		addAnnotation
		  (altitudeModeEnumEEnum, 
		   source, 
		   new String[] {
			 "name", "altitudeModeEnum"
		   });		
		addAnnotation
		  (altitudeModeEnumObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "altitudeModeEnum:Object",
			 "baseType", "altitudeModeEnum"
		   });		
		addAnnotation
		  (angle180EDataType, 
		   source, 
		   new String[] {
			 "name", "angle180",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#double",
			 "minInclusive", "-180",
			 "maxInclusive", "180"
		   });		
		addAnnotation
		  (angle180ObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "angle180:Object",
			 "baseType", "angle180"
		   });		
		addAnnotation
		  (angle360EDataType, 
		   source, 
		   new String[] {
			 "name", "angle360",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#double",
			 "minInclusive", "-360",
			 "maxInclusive", "360"
		   });		
		addAnnotation
		  (angle360ObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "angle360:Object",
			 "baseType", "angle360"
		   });		
		addAnnotation
		  (angle90EDataType, 
		   source, 
		   new String[] {
			 "name", "angle90",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#double",
			 "minInclusive", "-90",
			 "maxInclusive", "90.0"
		   });		
		addAnnotation
		  (angle90ObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "angle90:Object",
			 "baseType", "angle90"
		   });		
		addAnnotation
		  (anglepos90EDataType, 
		   source, 
		   new String[] {
			 "name", "anglepos90",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#double",
			 "minInclusive", "0.0",
			 "maxInclusive", "90.0"
		   });		
		addAnnotation
		  (anglepos90ObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "anglepos90:Object",
			 "baseType", "anglepos90"
		   });		
		addAnnotation
		  (balloonStyleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "BalloonStyleType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBalloonStyleType_Color(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "color",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBalloonStyleType_BgColor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bgColor",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBalloonStyleType_TextColor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "textColor",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBalloonStyleType_Text(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "text",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (boundaryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "boundaryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBoundaryType_LinearRing(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LinearRing",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (changeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ChangeType",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getChangeType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getChangeType_ObjectGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "Object:group",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getChangeType_Object(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Object",
			 "namespace", "##targetNamespace",
			 "group", "Object:group"
		   });		
		addAnnotation
		  (getChangeType_FeatureGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "Feature:group",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getChangeType_Feature(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Feature",
			 "namespace", "##targetNamespace",
			 "group", "Feature:group"
		   });		
		addAnnotation
		  (getChangeType_GeometryGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "Geometry:group",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getChangeType_Geometry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Geometry",
			 "namespace", "##targetNamespace",
			 "group", "Geometry:group"
		   });		
		addAnnotation
		  (getChangeType_StyleSelectorGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "StyleSelector:group",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getChangeType_StyleSelector(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "StyleSelector",
			 "namespace", "##targetNamespace",
			 "group", "StyleSelector:group"
		   });		
		addAnnotation
		  (getChangeType_TimePrimitiveGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "TimePrimitive:group",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getChangeType_TimePrimitive(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TimePrimitive",
			 "namespace", "##targetNamespace",
			 "group", "TimePrimitive:group"
		   });			
		addAnnotation
		  (colorEDataType, 
		   source, 
		   new String[] {
			 "name", "color",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#hexBinary",
			 "length", "4"
		   });		
		addAnnotation
		  (colorModeEnumEEnum, 
		   source, 
		   new String[] {
			 "name", "colorModeEnum"
		   });		
		addAnnotation
		  (colorModeEnumObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "colorModeEnum:Object",
			 "baseType", "colorModeEnum"
		   });		
		addAnnotation
		  (colorStyleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ColorStyleType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getColorStyleType_Color(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "color",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getColorStyleType_ColorMode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "colorMode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (containerTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ContainerType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (coordinatesTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "CoordinatesType",
			 "itemType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });		
		addAnnotation
		  (createTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CreateType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCreateType_Folder(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Folder",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (dateTimeTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "dateTimeType",
			 "memberTypes", "http://www.eclipse.org/emf/2003/XMLType#dateTime http://www.eclipse.org/emf/2003/XMLType#date http://www.eclipse.org/emf/2003/XMLType#gYearMonth http://www.eclipse.org/emf/2003/XMLType#gYear"
		   });		
		addAnnotation
		  (deleteTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DeleteType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDeleteType_FeatureGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "Feature:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDeleteType_Feature(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Feature",
			 "namespace", "##targetNamespace",
			 "group", "Feature:group"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_BalloonStyle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BalloonStyle",
			 "namespace", "##targetNamespace",
			 "affiliation", "Object"
		   });		
		addAnnotation
		  (getDocumentRoot_Object(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Object",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Coordinates(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "coordinates",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Document(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Document",
			 "namespace", "##targetNamespace",
			 "affiliation", "Feature"
		   });		
		addAnnotation
		  (getDocumentRoot_Feature(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Feature",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Folder(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Folder",
			 "namespace", "##targetNamespace",
			 "affiliation", "Feature"
		   });		
		addAnnotation
		  (getDocumentRoot_Geometry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Geometry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_GroundOverlay(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "GroundOverlay",
			 "namespace", "##targetNamespace",
			 "affiliation", "Feature"
		   });		
		addAnnotation
		  (getDocumentRoot_Icon(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Icon",
			 "namespace", "##targetNamespace",
			 "affiliation", "Object"
		   });		
		addAnnotation
		  (getDocumentRoot_IconStyle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IconStyle",
			 "namespace", "##targetNamespace",
			 "affiliation", "Object"
		   });		
		addAnnotation
		  (getDocumentRoot_Kml(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "kml",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_LabelStyle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LabelStyle",
			 "namespace", "##targetNamespace",
			 "affiliation", "Object"
		   });		
		addAnnotation
		  (getDocumentRoot_LatLonAltBox(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LatLonAltBox",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_LatLonBox(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LatLonBox",
			 "namespace", "##targetNamespace",
			 "affiliation", "Object"
		   });		
		addAnnotation
		  (getDocumentRoot_LinearRing(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LinearRing",
			 "namespace", "##targetNamespace",
			 "affiliation", "Geometry"
		   });		
		addAnnotation
		  (getDocumentRoot_LineString(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LineString",
			 "namespace", "##targetNamespace",
			 "affiliation", "Geometry"
		   });		
		addAnnotation
		  (getDocumentRoot_LineStyle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LineStyle",
			 "namespace", "##targetNamespace",
			 "affiliation", "Object"
		   });		
		addAnnotation
		  (getDocumentRoot_Link(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Link",
			 "namespace", "##targetNamespace",
			 "affiliation", "Object"
		   });		
		addAnnotation
		  (getDocumentRoot_ListStyle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ListStyle",
			 "namespace", "##targetNamespace",
			 "affiliation", "Object"
		   });		
		addAnnotation
		  (getDocumentRoot_Location(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Location",
			 "namespace", "##targetNamespace",
			 "affiliation", "Object"
		   });		
		addAnnotation
		  (getDocumentRoot_Lod(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Lod",
			 "namespace", "##targetNamespace",
			 "affiliation", "Object"
		   });		
		addAnnotation
		  (getDocumentRoot_LookAt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LookAt",
			 "namespace", "##targetNamespace",
			 "affiliation", "Object"
		   });		
		addAnnotation
		  (getDocumentRoot_Model(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Model",
			 "namespace", "##targetNamespace",
			 "affiliation", "Geometry"
		   });		
		addAnnotation
		  (getDocumentRoot_MultiGeometry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MultiGeometry",
			 "namespace", "##targetNamespace",
			 "affiliation", "Geometry"
		   });		
		addAnnotation
		  (getDocumentRoot_NetworkLink(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NetworkLink",
			 "namespace", "##targetNamespace",
			 "affiliation", "Feature"
		   });		
		addAnnotation
		  (getDocumentRoot_Orientation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Orientation",
			 "namespace", "##targetNamespace",
			 "affiliation", "Object"
		   });		
		addAnnotation
		  (getDocumentRoot_Placemark(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Placemark",
			 "namespace", "##targetNamespace",
			 "affiliation", "Feature"
		   });		
		addAnnotation
		  (getDocumentRoot_Point(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Point",
			 "namespace", "##targetNamespace",
			 "affiliation", "Geometry"
		   });		
		addAnnotation
		  (getDocumentRoot_Polygon(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Polygon",
			 "namespace", "##targetNamespace",
			 "affiliation", "Geometry"
		   });		
		addAnnotation
		  (getDocumentRoot_PolyStyle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PolyStyle",
			 "namespace", "##targetNamespace",
			 "affiliation", "Object"
		   });		
		addAnnotation
		  (getDocumentRoot_Region(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Region",
			 "namespace", "##targetNamespace",
			 "affiliation", "Object"
		   });		
		addAnnotation
		  (getDocumentRoot_Scale(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Scale",
			 "namespace", "##targetNamespace",
			 "affiliation", "Object"
		   });		
		addAnnotation
		  (getDocumentRoot_ScreenOverlay(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ScreenOverlay",
			 "namespace", "##targetNamespace",
			 "affiliation", "Feature"
		   });		
		addAnnotation
		  (getDocumentRoot_Style(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Style",
			 "namespace", "##targetNamespace",
			 "affiliation", "StyleSelector"
		   });		
		addAnnotation
		  (getDocumentRoot_StyleSelector(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "StyleSelector",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_StyleMap(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "StyleMap",
			 "namespace", "##targetNamespace",
			 "affiliation", "StyleSelector"
		   });		
		addAnnotation
		  (getDocumentRoot_StyleUrl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "styleUrl",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TimePrimitive(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TimePrimitive",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TimeSpan(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TimeSpan",
			 "namespace", "##targetNamespace",
			 "affiliation", "TimePrimitive"
		   });		
		addAnnotation
		  (getDocumentRoot_TimeStamp(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TimeStamp",
			 "namespace", "##targetNamespace",
			 "affiliation", "TimePrimitive"
		   });		
		addAnnotation
		  (documentTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DocumentType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDocumentType_FeatureGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "Feature:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentType_Feature(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Feature",
			 "namespace", "##targetNamespace",
			 "group", "Feature:group"
		   });		
		addAnnotation
		  (featureTypeEClass, 
		   source, 
		   new String[] {
			 "name", "FeatureType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFeatureType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFeatureType_Visibility(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "visibility",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFeatureType_Open(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "open",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFeatureType_Address(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "address",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFeatureType_PhoneNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "phoneNumber",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFeatureType_Snippet(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Snippet",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFeatureType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFeatureType_LookAt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LookAt",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFeatureType_TimePrimitiveGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "TimePrimitive:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFeatureType_TimePrimitive(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TimePrimitive",
			 "namespace", "##targetNamespace",
			 "group", "TimePrimitive:group"
		   });		
		addAnnotation
		  (getFeatureType_StyleUrl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "styleUrl",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFeatureType_StyleSelectorGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "StyleSelector:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFeatureType_StyleSelector(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "StyleSelector",
			 "namespace", "##targetNamespace",
			 "group", "StyleSelector:group"
		   });		
		addAnnotation
		  (getFeatureType_Region(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Region",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFeatureType_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Metadata",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (folderTypeEClass, 
		   source, 
		   new String[] {
			 "name", "FolderType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFolderType_FeatureGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "Feature:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFolderType_Feature(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Feature",
			 "namespace", "##targetNamespace",
			 "group", "Feature:group"
		   });		
		addAnnotation
		  (geometryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "GeometryType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (groundOverlayTypeEClass, 
		   source, 
		   new String[] {
			 "name", "GroundOverlayType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getGroundOverlayType_Altitude(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "altitude",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGroundOverlayType_AltitudeMode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "altitudeMode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGroundOverlayType_LatLonBox(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LatLonBox",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (iconStyleIconTypeEClass, 
		   source, 
		   new String[] {
			 "name", "IconStyleIconType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getIconStyleIconType_Href(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "href",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (iconStyleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "IconStyleType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getIconStyleType_Scale(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "scale",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIconStyleType_Heading(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "heading",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIconStyleType_Icon(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Icon",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIconStyleType_HotSpot(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hotSpot",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (iconTypeEClass, 
		   source, 
		   new String[] {
			 "name", "IconType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getIconType_X(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "x",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIconType_Y(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "y",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIconType_W(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "w",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getIconType_H(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "h",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (itemIconStateEnumEEnum, 
		   source, 
		   new String[] {
			 "name", "itemIconStateEnum"
		   });		
		addAnnotation
		  (itemIconStateEnumObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "itemIconStateEnum:Object",
			 "baseType", "itemIconStateEnum"
		   });		
		addAnnotation
		  (itemIconStateTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "itemIconStateType",
			 "itemType", "itemIconStateEnum"
		   });		
		addAnnotation
		  (itemIconTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ItemIconType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getItemIconType_State(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "state",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getItemIconType_Href(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "href",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (kmlTypeEClass, 
		   source, 
		   new String[] {
			 "name", "KmlType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getKmlType_NetworkLinkControl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NetworkLinkControl",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getKmlType_FeatureGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "Feature:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getKmlType_Feature(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Feature",
			 "namespace", "##targetNamespace",
			 "group", "Feature:group"
		   });		
		addAnnotation
		  (labelStyleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "LabelStyleType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getLabelStyleType_Scale(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "scale",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (latLonAltBoxTypeEClass, 
		   source, 
		   new String[] {
			 "name", "LatLonAltBoxType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getLatLonAltBoxType_MinAltitude(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "minAltitude",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLatLonAltBoxType_MaxAltitude(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "maxAltitude",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLatLonAltBoxType_AltitudeMode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "altitudeMode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (latLonBoxTypeEClass, 
		   source, 
		   new String[] {
			 "name", "LatLonBoxType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getLatLonBoxType_North(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "north",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLatLonBoxType_South(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "south",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLatLonBoxType_East(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "east",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLatLonBoxType_West(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "west",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLatLonBoxType_Rotation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rotation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (linearRingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "LinearRingType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getLinearRingType_Extrude(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "extrude",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLinearRingType_Tessellate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tessellate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLinearRingType_AltitudeMode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "altitudeMode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLinearRingType_Coordinates(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "coordinates",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (lineStringTypeEClass, 
		   source, 
		   new String[] {
			 "name", "LineStringType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getLineStringType_Extrude(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "extrude",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLineStringType_Tessellate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tessellate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLineStringType_AltitudeMode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "altitudeMode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLineStringType_Coordinates(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "coordinates",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (lineStyleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "LineStyleType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getLineStyleType_Width(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "width",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (linkTypeEClass, 
		   source, 
		   new String[] {
			 "name", "LinkType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getLinkType_Href(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "href",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLinkType_RefreshMode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "refreshMode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLinkType_RefreshInterval(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "refreshInterval",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLinkType_ViewRefreshMode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "viewRefreshMode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLinkType_ViewRefreshTime(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "viewRefreshTime",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLinkType_ViewBoundScale(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "viewBoundScale",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLinkType_ViewFormat(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "viewFormat",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLinkType_HttpQuery(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "httpQuery",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (listItemTypeEnumEEnum, 
		   source, 
		   new String[] {
			 "name", "listItemTypeEnum"
		   });		
		addAnnotation
		  (listItemTypeEnumObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "listItemTypeEnum:Object",
			 "baseType", "listItemTypeEnum"
		   });		
		addAnnotation
		  (listStyleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ListStyleType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getListStyleType_ListItemType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "listItemType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getListStyleType_BgColor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bgColor",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getListStyleType_ItemIcon(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ItemIcon",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (locationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "LocationType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getLocationType_Longitude(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "longitude",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLocationType_Latitude(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "latitude",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLocationType_Altitude(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "altitude",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (lodTypeEClass, 
		   source, 
		   new String[] {
			 "name", "LodType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getLodType_MinLodPixels(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "minLodPixels",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLodType_MaxLodPixels(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "maxLodPixels",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLodType_MinFadeExtent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "minFadeExtent",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLodType_MaxFadeExtent(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "maxFadeExtent",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (lookAtTypeEClass, 
		   source, 
		   new String[] {
			 "name", "LookAtType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getLookAtType_Longitude(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "longitude",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLookAtType_Latitude(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "latitude",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLookAtType_Altitude(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "altitude",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLookAtType_Range(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "range",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLookAtType_Tilt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tilt",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLookAtType_Heading(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "heading",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLookAtType_AltitudeMode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "altitudeMode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (metadataTypeEClass, 
		   source, 
		   new String[] {
			 "name", "MetadataType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMetadataType_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##any",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (modelTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ModelType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getModelType_AltitudeMode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "altitudeMode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModelType_Location(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Location",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModelType_Orientation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Orientation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModelType_Scale(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Scale",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModelType_Link(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Link",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (multiGeometryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "MultiGeometryType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMultiGeometryType_GeometryGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "Geometry:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMultiGeometryType_Geometry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Geometry",
			 "namespace", "##targetNamespace",
			 "group", "Geometry:group"
		   });		
		addAnnotation
		  (networkLinkControlTypeEClass, 
		   source, 
		   new String[] {
			 "name", "NetworkLinkControlType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNetworkLinkControlType_MinRefreshPeriod(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "minRefreshPeriod",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNetworkLinkControlType_Cookie(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cookie",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNetworkLinkControlType_Message(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "message",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNetworkLinkControlType_LinkName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "linkName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNetworkLinkControlType_LinkDescription(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "linkDescription",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNetworkLinkControlType_LinkSnippet(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "linkSnippet",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNetworkLinkControlType_Expires(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "expires",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNetworkLinkControlType_Update(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Update",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNetworkLinkControlType_LookAt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LookAt",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (networkLinkTypeEClass, 
		   source, 
		   new String[] {
			 "name", "NetworkLinkType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getNetworkLinkType_RefreshVisibility(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "refreshVisibility",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNetworkLinkType_FlyToView(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "flyToView",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNetworkLinkType_Link(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Link",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getNetworkLinkType_Url(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Url",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (objectTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ObjectType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getObjectType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getObjectType_TargetId(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "targetId"
		   });		
		addAnnotation
		  (orientationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OrientationType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOrientationType_Heading(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "heading",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOrientationType_Tilt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tilt",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOrientationType_Roll(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "roll",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (overlayTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OverlayType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOverlayType_Color(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "color",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOverlayType_DrawOrder(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "drawOrder",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOverlayType_Icon(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Icon",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (placemarkTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PlacemarkType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPlacemarkType_GeometryGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "Geometry:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPlacemarkType_Geometry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Geometry",
			 "namespace", "##targetNamespace",
			 "group", "Geometry:group"
		   });		
		addAnnotation
		  (pointTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PointType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPointType_Extrude(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "extrude",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPointType_Tessellate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tessellate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPointType_AltitudeMode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "altitudeMode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPointType_Coordinates(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "coordinates",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (polygonTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PolygonType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPolygonType_Extrude(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "extrude",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPolygonType_Tessellate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tessellate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPolygonType_AltitudeMode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "altitudeMode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPolygonType_OuterBoundaryIs(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "outerBoundaryIs",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPolygonType_InnerBoundaryIs(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "innerBoundaryIs",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (polyStyleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PolyStyleType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPolyStyleType_Fill(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "fill",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPolyStyleType_Outline(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "outline",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (refreshModeEnumEEnum, 
		   source, 
		   new String[] {
			 "name", "refreshModeEnum"
		   });		
		addAnnotation
		  (refreshModeEnumObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "refreshModeEnum:Object",
			 "baseType", "refreshModeEnum"
		   });		
		addAnnotation
		  (regionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RegionType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRegionType_LatLonAltBox(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LatLonAltBox",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRegionType_Lod(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Lod",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (replaceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ReplaceType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getReplaceType_FeatureGroup(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "Feature:group",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getReplaceType_Feature(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Feature",
			 "namespace", "##targetNamespace",
			 "group", "Feature:group"
		   });		
		addAnnotation
		  (scaleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ScaleType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getScaleType_X(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "x",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getScaleType_Y(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "y",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getScaleType_Z(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "z",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (screenOverlayTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ScreenOverlayType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getScreenOverlayType_OverlayXY(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "overlayXY",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getScreenOverlayType_ScreenXY(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "screenXY",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getScreenOverlayType_RotationXY(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rotationXY",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getScreenOverlayType_Size(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "size",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getScreenOverlayType_Rotation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rotation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (snippetTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SnippetType",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getSnippetType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getSnippetType_MaxLines(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "maxLines"
		   });		
		addAnnotation
		  (styleMapPairTypeEClass, 
		   source, 
		   new String[] {
			 "name", "StyleMapPairType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getStyleMapPairType_Key(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "key",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getStyleMapPairType_StyleUrl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "styleUrl",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (styleMapTypeEClass, 
		   source, 
		   new String[] {
			 "name", "StyleMapType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getStyleMapType_Pair(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Pair",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (styleSelectorTypeEClass, 
		   source, 
		   new String[] {
			 "name", "StyleSelectorType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (styleStateEnumEEnum, 
		   source, 
		   new String[] {
			 "name", "styleStateEnum"
		   });		
		addAnnotation
		  (styleStateEnumObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "styleStateEnum:Object",
			 "baseType", "styleStateEnum"
		   });		
		addAnnotation
		  (styleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "StyleType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getStyleType_IconStyle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IconStyle",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getStyleType_LabelStyle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LabelStyle",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getStyleType_LineStyle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LineStyle",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getStyleType_PolyStyle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PolyStyle",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getStyleType_BalloonStyle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BalloonStyle",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getStyleType_ListStyle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ListStyle",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (timePrimitiveTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TimePrimitiveType",
			 "kind", "empty"
		   });		
		addAnnotation
		  (timeSpanTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TimeSpanType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTimeSpanType_Begin(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "begin",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTimeSpanType_End(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "end",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (timeStampTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TimeStampType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTimeStampType_When(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "when",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (unitsEnumEEnum, 
		   source, 
		   new String[] {
			 "name", "unitsEnum"
		   });		
		addAnnotation
		  (unitsEnumObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "unitsEnum:Object",
			 "baseType", "unitsEnum"
		   });		
		addAnnotation
		  (updateTypeEClass, 
		   source, 
		   new String[] {
			 "name", "UpdateType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getUpdateType_TargetHref(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "targetHref",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUpdateType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });		
		addAnnotation
		  (getUpdateType_Create(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Create",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getUpdateType_Delete(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Delete",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getUpdateType_Change(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Change",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getUpdateType_Replace(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Replace",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (vec2TypeEClass, 
		   source, 
		   new String[] {
			 "name", "vec2Type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getVec2Type_X(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "x"
		   });		
		addAnnotation
		  (getVec2Type_Xunits(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xunits"
		   });		
		addAnnotation
		  (getVec2Type_Y(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "y"
		   });		
		addAnnotation
		  (getVec2Type_Yunits(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "yunits"
		   });		
		addAnnotation
		  (viewRefreshModeEnumEEnum, 
		   source, 
		   new String[] {
			 "name", "viewRefreshModeEnum"
		   });		
		addAnnotation
		  (viewRefreshModeEnumObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "viewRefreshModeEnum:Object",
			 "baseType", "viewRefreshModeEnum"
		   });
	}

} //v21PackageImpl
