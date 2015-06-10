/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *       
 *       
 *       KML 2.1 Reference:
 *       http://code.google.com/apis/kml/documentation/kml_tags_21.html
 *       
 *       KML 2.1 Reference "abstract element" is a
 *       W3C XML Schema substitutionGroup:
 * 
 *         Object
 *           Feature
 *             Overlay
 *             Container
 *           Geoemtry
 *           ColorStyle
 *           StyleSelector
 *           TimePrimitive
 *       
 *       Child elements are generally minOccurs="0" due to Update's Change.
 *       However, it is considered good practice to explicitly set the
 *       "obvious" children of a given element.  For example, north, south,
 *       east and west of LatLonBox should always be set.
 * 
 *       The <schema> version attribute will change for minor bug fixes
 *       to the schema itself.
 * 
 *       
 *     
 * 
 *       
 *       
 *       Declare head of Object substitutionGroup.
 *       
 *       
 *     
 * 
 *       
 *       
 *       Declare head of Feature substituionGroup.
 *       
 *       
 *     
 * 
 *       
 *       
 *       Declare head of "Geometry" substitutionGroup.
 *       
 *       
 *     
 * 
 *       
 *       
 *       Declare head of StyleSelector substitution group.
 *     
 *       
 *     
 * 
 *       
 *       
 *       Declare head of TimePrimitive substitution group.
 *     
 *       
 *     
 * 
 *       
 *       
 *       Concrete elements.
 *       
 *       <kml> is the root element.
 *       
 *       
 *     
 * 
 *       
 *       
 *       In KML 2.0 Icon is of type IconType which extends
 *       LinkType with palette indexing.
 * 
 *       Icon simply a LinkType in KML 2.1.
 *       
 *       
 *     
 * 
 *       
 *       
 *       IconType unused in KML 2.1.
 *       
 *       Presented for reference as used in KML 2.0.
 *       
 *       
 *     
 * <!-- end-model-doc -->
 * @see com.google.earth.kml._2.v21Factory
 * @model kind="package"
 * @generated
 */
public interface v21Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "_2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://earth.google.com/kml/2.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "_2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	v21Package eINSTANCE = com.google.earth.kml._2.impl.v21PackageImpl.init();

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.ObjectTypeImpl <em>Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.ObjectTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getObjectType()
	 * @generated
	 */
	int OBJECT_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__TARGET_ID = 1;

	/**
	 * The number of structural features of the '<em>Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.BalloonStyleTypeImpl <em>Balloon Style Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.BalloonStyleTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getBalloonStyleType()
	 * @generated
	 */
	int BALLOON_STYLE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOON_STYLE_TYPE__ID = OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOON_STYLE_TYPE__TARGET_ID = OBJECT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOON_STYLE_TYPE__COLOR = OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bg Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOON_STYLE_TYPE__BG_COLOR = OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOON_STYLE_TYPE__TEXT_COLOR = OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOON_STYLE_TYPE__TEXT = OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Balloon Style Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOON_STYLE_TYPE_FEATURE_COUNT = OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.BoundaryTypeImpl <em>Boundary Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.BoundaryTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getBoundaryType()
	 * @generated
	 */
	int BOUNDARY_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Linear Ring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_TYPE__LINEAR_RING = 0;

	/**
	 * The number of structural features of the '<em>Boundary Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.ChangeTypeImpl <em>Change Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.ChangeTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getChangeType()
	 * @generated
	 */
	int CHANGE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Object Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TYPE__OBJECT_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TYPE__OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Feature Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TYPE__FEATURE_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TYPE__FEATURE = 4;

	/**
	 * The feature id for the '<em><b>Geometry Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TYPE__GEOMETRY_GROUP = 5;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TYPE__GEOMETRY = 6;

	/**
	 * The feature id for the '<em><b>Style Selector Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TYPE__STYLE_SELECTOR_GROUP = 7;

	/**
	 * The feature id for the '<em><b>Style Selector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TYPE__STYLE_SELECTOR = 8;

	/**
	 * The feature id for the '<em><b>Time Primitive Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TYPE__TIME_PRIMITIVE_GROUP = 9;

	/**
	 * The feature id for the '<em><b>Time Primitive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TYPE__TIME_PRIMITIVE = 10;

	/**
	 * The number of structural features of the '<em>Change Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.ColorStyleTypeImpl <em>Color Style Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.ColorStyleTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getColorStyleType()
	 * @generated
	 */
	int COLOR_STYLE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_STYLE_TYPE__ID = OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_STYLE_TYPE__TARGET_ID = OBJECT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_STYLE_TYPE__COLOR = OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_STYLE_TYPE__COLOR_MODE = OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Color Style Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_STYLE_TYPE_FEATURE_COUNT = OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.FeatureTypeImpl <em>Feature Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.FeatureTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getFeatureType()
	 * @generated
	 */
	int FEATURE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE__ID = OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE__TARGET_ID = OBJECT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE__NAME = OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE__VISIBILITY = OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE__OPEN = OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE__ADDRESS = OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE__PHONE_NUMBER = OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Snippet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE__SNIPPET = OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE__DESCRIPTION = OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Look At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE__LOOK_AT = OBJECT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Time Primitive Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE__TIME_PRIMITIVE_GROUP = OBJECT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Time Primitive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE__TIME_PRIMITIVE = OBJECT_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE__STYLE_URL = OBJECT_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Style Selector Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE__STYLE_SELECTOR_GROUP = OBJECT_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Style Selector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE__STYLE_SELECTOR = OBJECT_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE__REGION = OBJECT_TYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE__METADATA = OBJECT_TYPE_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Feature Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE_FEATURE_COUNT = OBJECT_TYPE_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.ContainerTypeImpl <em>Container Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.ContainerTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getContainerType()
	 * @generated
	 */
	int CONTAINER_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE__ID = FEATURE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE__TARGET_ID = FEATURE_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE__NAME = FEATURE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE__VISIBILITY = FEATURE_TYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE__OPEN = FEATURE_TYPE__OPEN;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE__ADDRESS = FEATURE_TYPE__ADDRESS;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE__PHONE_NUMBER = FEATURE_TYPE__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Snippet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE__SNIPPET = FEATURE_TYPE__SNIPPET;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE__DESCRIPTION = FEATURE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Look At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE__LOOK_AT = FEATURE_TYPE__LOOK_AT;

	/**
	 * The feature id for the '<em><b>Time Primitive Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE__TIME_PRIMITIVE_GROUP = FEATURE_TYPE__TIME_PRIMITIVE_GROUP;

	/**
	 * The feature id for the '<em><b>Time Primitive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE__TIME_PRIMITIVE = FEATURE_TYPE__TIME_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE__STYLE_URL = FEATURE_TYPE__STYLE_URL;

	/**
	 * The feature id for the '<em><b>Style Selector Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE__STYLE_SELECTOR_GROUP = FEATURE_TYPE__STYLE_SELECTOR_GROUP;

	/**
	 * The feature id for the '<em><b>Style Selector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE__STYLE_SELECTOR = FEATURE_TYPE__STYLE_SELECTOR;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE__REGION = FEATURE_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE__METADATA = FEATURE_TYPE__METADATA;

	/**
	 * The number of structural features of the '<em>Container Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_TYPE_FEATURE_COUNT = FEATURE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.CreateTypeImpl <em>Create Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.CreateTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getCreateType()
	 * @generated
	 */
	int CREATE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Folder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TYPE__FOLDER = 0;

	/**
	 * The number of structural features of the '<em>Create Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.DeleteTypeImpl <em>Delete Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.DeleteTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getDeleteType()
	 * @generated
	 */
	int DELETE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Feature Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TYPE__FEATURE_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TYPE__FEATURE = 1;

	/**
	 * The number of structural features of the '<em>Delete Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.DocumentRootImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 7;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Balloon Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BALLOON_STYLE = 3;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OBJECT = 4;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COORDINATES = 5;

	/**
	 * The feature id for the '<em><b>Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOCUMENT = 6;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FEATURE = 7;

	/**
	 * The feature id for the '<em><b>Folder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FOLDER = 8;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GEOMETRY = 9;

	/**
	 * The feature id for the '<em><b>Ground Overlay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GROUND_OVERLAY = 10;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ICON = 11;

	/**
	 * The feature id for the '<em><b>Icon Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ICON_STYLE = 12;

	/**
	 * The feature id for the '<em><b>Kml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KML = 13;

	/**
	 * The feature id for the '<em><b>Label Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LABEL_STYLE = 14;

	/**
	 * The feature id for the '<em><b>Lat Lon Alt Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LAT_LON_ALT_BOX = 15;

	/**
	 * The feature id for the '<em><b>Lat Lon Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LAT_LON_BOX = 16;

	/**
	 * The feature id for the '<em><b>Linear Ring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINEAR_RING = 17;

	/**
	 * The feature id for the '<em><b>Line String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINE_STRING = 18;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINE_STYLE = 19;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINK = 20;

	/**
	 * The feature id for the '<em><b>List Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIST_STYLE = 21;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOCATION = 22;

	/**
	 * The feature id for the '<em><b>Lod</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOD = 23;

	/**
	 * The feature id for the '<em><b>Look At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOOK_AT = 24;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MODEL = 25;

	/**
	 * The feature id for the '<em><b>Multi Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MULTI_GEOMETRY = 26;

	/**
	 * The feature id for the '<em><b>Network Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NETWORK_LINK = 27;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORIENTATION = 28;

	/**
	 * The feature id for the '<em><b>Placemark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PLACEMARK = 29;

	/**
	 * The feature id for the '<em><b>Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POINT = 30;

	/**
	 * The feature id for the '<em><b>Polygon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POLYGON = 31;

	/**
	 * The feature id for the '<em><b>Poly Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POLY_STYLE = 32;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGION = 33;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCALE = 34;

	/**
	 * The feature id for the '<em><b>Screen Overlay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCREEN_OVERLAY = 35;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STYLE = 36;

	/**
	 * The feature id for the '<em><b>Style Selector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STYLE_SELECTOR = 37;

	/**
	 * The feature id for the '<em><b>Style Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STYLE_MAP = 38;

	/**
	 * The feature id for the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STYLE_URL = 39;

	/**
	 * The feature id for the '<em><b>Time Primitive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TIME_PRIMITIVE = 40;

	/**
	 * The feature id for the '<em><b>Time Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TIME_SPAN = 41;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TIME_STAMP = 42;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 43;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.DocumentTypeImpl <em>Document Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.DocumentTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getDocumentType()
	 * @generated
	 */
	int DOCUMENT_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__ID = CONTAINER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__TARGET_ID = CONTAINER_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__NAME = CONTAINER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__VISIBILITY = CONTAINER_TYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__OPEN = CONTAINER_TYPE__OPEN;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__ADDRESS = CONTAINER_TYPE__ADDRESS;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__PHONE_NUMBER = CONTAINER_TYPE__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Snippet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__SNIPPET = CONTAINER_TYPE__SNIPPET;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__DESCRIPTION = CONTAINER_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Look At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__LOOK_AT = CONTAINER_TYPE__LOOK_AT;

	/**
	 * The feature id for the '<em><b>Time Primitive Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__TIME_PRIMITIVE_GROUP = CONTAINER_TYPE__TIME_PRIMITIVE_GROUP;

	/**
	 * The feature id for the '<em><b>Time Primitive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__TIME_PRIMITIVE = CONTAINER_TYPE__TIME_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__STYLE_URL = CONTAINER_TYPE__STYLE_URL;

	/**
	 * The feature id for the '<em><b>Style Selector Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__STYLE_SELECTOR_GROUP = CONTAINER_TYPE__STYLE_SELECTOR_GROUP;

	/**
	 * The feature id for the '<em><b>Style Selector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__STYLE_SELECTOR = CONTAINER_TYPE__STYLE_SELECTOR;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__REGION = CONTAINER_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__METADATA = CONTAINER_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Feature Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__FEATURE_GROUP = CONTAINER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__FEATURE = CONTAINER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Document Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE_FEATURE_COUNT = CONTAINER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.FolderTypeImpl <em>Folder Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.FolderTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getFolderType()
	 * @generated
	 */
	int FOLDER_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__ID = CONTAINER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__TARGET_ID = CONTAINER_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__NAME = CONTAINER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__VISIBILITY = CONTAINER_TYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__OPEN = CONTAINER_TYPE__OPEN;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__ADDRESS = CONTAINER_TYPE__ADDRESS;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__PHONE_NUMBER = CONTAINER_TYPE__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Snippet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__SNIPPET = CONTAINER_TYPE__SNIPPET;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__DESCRIPTION = CONTAINER_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Look At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__LOOK_AT = CONTAINER_TYPE__LOOK_AT;

	/**
	 * The feature id for the '<em><b>Time Primitive Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__TIME_PRIMITIVE_GROUP = CONTAINER_TYPE__TIME_PRIMITIVE_GROUP;

	/**
	 * The feature id for the '<em><b>Time Primitive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__TIME_PRIMITIVE = CONTAINER_TYPE__TIME_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__STYLE_URL = CONTAINER_TYPE__STYLE_URL;

	/**
	 * The feature id for the '<em><b>Style Selector Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__STYLE_SELECTOR_GROUP = CONTAINER_TYPE__STYLE_SELECTOR_GROUP;

	/**
	 * The feature id for the '<em><b>Style Selector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__STYLE_SELECTOR = CONTAINER_TYPE__STYLE_SELECTOR;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__REGION = CONTAINER_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__METADATA = CONTAINER_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Feature Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__FEATURE_GROUP = CONTAINER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__FEATURE = CONTAINER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Folder Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE_FEATURE_COUNT = CONTAINER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.GeometryTypeImpl <em>Geometry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.GeometryTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getGeometryType()
	 * @generated
	 */
	int GEOMETRY_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_TYPE__ID = OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_TYPE__TARGET_ID = OBJECT_TYPE__TARGET_ID;

	/**
	 * The number of structural features of the '<em>Geometry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_TYPE_FEATURE_COUNT = OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.OverlayTypeImpl <em>Overlay Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.OverlayTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getOverlayType()
	 * @generated
	 */
	int OVERLAY_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_TYPE__ID = FEATURE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_TYPE__TARGET_ID = FEATURE_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_TYPE__NAME = FEATURE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_TYPE__VISIBILITY = FEATURE_TYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_TYPE__OPEN = FEATURE_TYPE__OPEN;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_TYPE__ADDRESS = FEATURE_TYPE__ADDRESS;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_TYPE__PHONE_NUMBER = FEATURE_TYPE__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Snippet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_TYPE__SNIPPET = FEATURE_TYPE__SNIPPET;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_TYPE__DESCRIPTION = FEATURE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Look At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_TYPE__LOOK_AT = FEATURE_TYPE__LOOK_AT;

	/**
	 * The feature id for the '<em><b>Time Primitive Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_TYPE__TIME_PRIMITIVE_GROUP = FEATURE_TYPE__TIME_PRIMITIVE_GROUP;

	/**
	 * The feature id for the '<em><b>Time Primitive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_TYPE__TIME_PRIMITIVE = FEATURE_TYPE__TIME_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_TYPE__STYLE_URL = FEATURE_TYPE__STYLE_URL;

	/**
	 * The feature id for the '<em><b>Style Selector Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_TYPE__STYLE_SELECTOR_GROUP = FEATURE_TYPE__STYLE_SELECTOR_GROUP;

	/**
	 * The feature id for the '<em><b>Style Selector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_TYPE__STYLE_SELECTOR = FEATURE_TYPE__STYLE_SELECTOR;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_TYPE__REGION = FEATURE_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_TYPE__METADATA = FEATURE_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_TYPE__COLOR = FEATURE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Draw Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_TYPE__DRAW_ORDER = FEATURE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_TYPE__ICON = FEATURE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Overlay Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERLAY_TYPE_FEATURE_COUNT = FEATURE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.GroundOverlayTypeImpl <em>Ground Overlay Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.GroundOverlayTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getGroundOverlayType()
	 * @generated
	 */
	int GROUND_OVERLAY_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__ID = OVERLAY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__TARGET_ID = OVERLAY_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__NAME = OVERLAY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__VISIBILITY = OVERLAY_TYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__OPEN = OVERLAY_TYPE__OPEN;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__ADDRESS = OVERLAY_TYPE__ADDRESS;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__PHONE_NUMBER = OVERLAY_TYPE__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Snippet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__SNIPPET = OVERLAY_TYPE__SNIPPET;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__DESCRIPTION = OVERLAY_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Look At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__LOOK_AT = OVERLAY_TYPE__LOOK_AT;

	/**
	 * The feature id for the '<em><b>Time Primitive Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__TIME_PRIMITIVE_GROUP = OVERLAY_TYPE__TIME_PRIMITIVE_GROUP;

	/**
	 * The feature id for the '<em><b>Time Primitive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__TIME_PRIMITIVE = OVERLAY_TYPE__TIME_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__STYLE_URL = OVERLAY_TYPE__STYLE_URL;

	/**
	 * The feature id for the '<em><b>Style Selector Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__STYLE_SELECTOR_GROUP = OVERLAY_TYPE__STYLE_SELECTOR_GROUP;

	/**
	 * The feature id for the '<em><b>Style Selector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__STYLE_SELECTOR = OVERLAY_TYPE__STYLE_SELECTOR;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__REGION = OVERLAY_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__METADATA = OVERLAY_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__COLOR = OVERLAY_TYPE__COLOR;

	/**
	 * The feature id for the '<em><b>Draw Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__DRAW_ORDER = OVERLAY_TYPE__DRAW_ORDER;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__ICON = OVERLAY_TYPE__ICON;

	/**
	 * The feature id for the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__ALTITUDE = OVERLAY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Altitude Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__ALTITUDE_MODE = OVERLAY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lat Lon Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__LAT_LON_BOX = OVERLAY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ground Overlay Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE_FEATURE_COUNT = OVERLAY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.IconStyleIconTypeImpl <em>Icon Style Icon Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.IconStyleIconTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getIconStyleIconType()
	 * @generated
	 */
	int ICON_STYLE_ICON_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_ICON_TYPE__ID = OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_ICON_TYPE__TARGET_ID = OBJECT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_ICON_TYPE__HREF = OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Icon Style Icon Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_ICON_TYPE_FEATURE_COUNT = OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.IconStyleTypeImpl <em>Icon Style Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.IconStyleTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getIconStyleType()
	 * @generated
	 */
	int ICON_STYLE_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_TYPE__ID = COLOR_STYLE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_TYPE__TARGET_ID = COLOR_STYLE_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_TYPE__COLOR = COLOR_STYLE_TYPE__COLOR;

	/**
	 * The feature id for the '<em><b>Color Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_TYPE__COLOR_MODE = COLOR_STYLE_TYPE__COLOR_MODE;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_TYPE__SCALE = COLOR_STYLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_TYPE__HEADING = COLOR_STYLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_TYPE__ICON = COLOR_STYLE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hot Spot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_TYPE__HOT_SPOT = COLOR_STYLE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Icon Style Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_TYPE_FEATURE_COUNT = COLOR_STYLE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.LinkTypeImpl <em>Link Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.LinkTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getLinkType()
	 * @generated
	 */
	int LINK_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__ID = OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__TARGET_ID = OBJECT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__HREF = OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refresh Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__REFRESH_MODE = OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Refresh Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__REFRESH_INTERVAL = OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>View Refresh Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__VIEW_REFRESH_MODE = OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>View Refresh Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__VIEW_REFRESH_TIME = OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>View Bound Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__VIEW_BOUND_SCALE = OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>View Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__VIEW_FORMAT = OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Http Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__HTTP_QUERY = OBJECT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Link Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE_FEATURE_COUNT = OBJECT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.IconTypeImpl <em>Icon Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.IconTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getIconType()
	 * @generated
	 */
	int ICON_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_TYPE__ID = LINK_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_TYPE__TARGET_ID = LINK_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_TYPE__HREF = LINK_TYPE__HREF;

	/**
	 * The feature id for the '<em><b>Refresh Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_TYPE__REFRESH_MODE = LINK_TYPE__REFRESH_MODE;

	/**
	 * The feature id for the '<em><b>Refresh Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_TYPE__REFRESH_INTERVAL = LINK_TYPE__REFRESH_INTERVAL;

	/**
	 * The feature id for the '<em><b>View Refresh Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_TYPE__VIEW_REFRESH_MODE = LINK_TYPE__VIEW_REFRESH_MODE;

	/**
	 * The feature id for the '<em><b>View Refresh Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_TYPE__VIEW_REFRESH_TIME = LINK_TYPE__VIEW_REFRESH_TIME;

	/**
	 * The feature id for the '<em><b>View Bound Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_TYPE__VIEW_BOUND_SCALE = LINK_TYPE__VIEW_BOUND_SCALE;

	/**
	 * The feature id for the '<em><b>View Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_TYPE__VIEW_FORMAT = LINK_TYPE__VIEW_FORMAT;

	/**
	 * The feature id for the '<em><b>Http Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_TYPE__HTTP_QUERY = LINK_TYPE__HTTP_QUERY;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_TYPE__X = LINK_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_TYPE__Y = LINK_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_TYPE__W = LINK_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_TYPE__H = LINK_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Icon Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_TYPE_FEATURE_COUNT = LINK_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.ItemIconTypeImpl <em>Item Icon Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.ItemIconTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getItemIconType()
	 * @generated
	 */
	int ITEM_ICON_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ICON_TYPE__ID = OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ICON_TYPE__TARGET_ID = OBJECT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ICON_TYPE__STATE = OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ICON_TYPE__HREF = OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Item Icon Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ICON_TYPE_FEATURE_COUNT = OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.KmlTypeImpl <em>Kml Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.KmlTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getKmlType()
	 * @generated
	 */
	int KML_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Network Link Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KML_TYPE__NETWORK_LINK_CONTROL = 0;

	/**
	 * The feature id for the '<em><b>Feature Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KML_TYPE__FEATURE_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KML_TYPE__FEATURE = 2;

	/**
	 * The number of structural features of the '<em>Kml Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KML_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.LabelStyleTypeImpl <em>Label Style Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.LabelStyleTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getLabelStyleType()
	 * @generated
	 */
	int LABEL_STYLE_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE_TYPE__ID = COLOR_STYLE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE_TYPE__TARGET_ID = COLOR_STYLE_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE_TYPE__COLOR = COLOR_STYLE_TYPE__COLOR;

	/**
	 * The feature id for the '<em><b>Color Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE_TYPE__COLOR_MODE = COLOR_STYLE_TYPE__COLOR_MODE;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE_TYPE__SCALE = COLOR_STYLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Label Style Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE_TYPE_FEATURE_COUNT = COLOR_STYLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.LatLonBoxTypeImpl <em>Lat Lon Box Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.LatLonBoxTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getLatLonBoxType()
	 * @generated
	 */
	int LAT_LON_BOX_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_BOX_TYPE__ID = OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_BOX_TYPE__TARGET_ID = OBJECT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>North</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_BOX_TYPE__NORTH = OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>South</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_BOX_TYPE__SOUTH = OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>East</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_BOX_TYPE__EAST = OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>West</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_BOX_TYPE__WEST = OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_BOX_TYPE__ROTATION = OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Lat Lon Box Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_BOX_TYPE_FEATURE_COUNT = OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.LatLonAltBoxTypeImpl <em>Lat Lon Alt Box Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.LatLonAltBoxTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getLatLonAltBoxType()
	 * @generated
	 */
	int LAT_LON_ALT_BOX_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX_TYPE__ID = LAT_LON_BOX_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX_TYPE__TARGET_ID = LAT_LON_BOX_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>North</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX_TYPE__NORTH = LAT_LON_BOX_TYPE__NORTH;

	/**
	 * The feature id for the '<em><b>South</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX_TYPE__SOUTH = LAT_LON_BOX_TYPE__SOUTH;

	/**
	 * The feature id for the '<em><b>East</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX_TYPE__EAST = LAT_LON_BOX_TYPE__EAST;

	/**
	 * The feature id for the '<em><b>West</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX_TYPE__WEST = LAT_LON_BOX_TYPE__WEST;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX_TYPE__ROTATION = LAT_LON_BOX_TYPE__ROTATION;

	/**
	 * The feature id for the '<em><b>Min Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX_TYPE__MIN_ALTITUDE = LAT_LON_BOX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX_TYPE__MAX_ALTITUDE = LAT_LON_BOX_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Altitude Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX_TYPE__ALTITUDE_MODE = LAT_LON_BOX_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Lat Lon Alt Box Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX_TYPE_FEATURE_COUNT = LAT_LON_BOX_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.LinearRingTypeImpl <em>Linear Ring Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.LinearRingTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getLinearRingType()
	 * @generated
	 */
	int LINEAR_RING_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_RING_TYPE__ID = GEOMETRY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_RING_TYPE__TARGET_ID = GEOMETRY_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Extrude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_RING_TYPE__EXTRUDE = GEOMETRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tessellate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_RING_TYPE__TESSELLATE = GEOMETRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Altitude Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_RING_TYPE__ALTITUDE_MODE = GEOMETRY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_RING_TYPE__COORDINATES = GEOMETRY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Linear Ring Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_RING_TYPE_FEATURE_COUNT = GEOMETRY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.LineStringTypeImpl <em>Line String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.LineStringTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getLineStringType()
	 * @generated
	 */
	int LINE_STRING_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_TYPE__ID = GEOMETRY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_TYPE__TARGET_ID = GEOMETRY_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Extrude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_TYPE__EXTRUDE = GEOMETRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tessellate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_TYPE__TESSELLATE = GEOMETRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Altitude Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_TYPE__ALTITUDE_MODE = GEOMETRY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_TYPE__COORDINATES = GEOMETRY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Line String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_TYPE_FEATURE_COUNT = GEOMETRY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.LineStyleTypeImpl <em>Line Style Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.LineStyleTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getLineStyleType()
	 * @generated
	 */
	int LINE_STYLE_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_TYPE__ID = COLOR_STYLE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_TYPE__TARGET_ID = COLOR_STYLE_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_TYPE__COLOR = COLOR_STYLE_TYPE__COLOR;

	/**
	 * The feature id for the '<em><b>Color Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_TYPE__COLOR_MODE = COLOR_STYLE_TYPE__COLOR_MODE;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_TYPE__WIDTH = COLOR_STYLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Line Style Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_TYPE_FEATURE_COUNT = COLOR_STYLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.ListStyleTypeImpl <em>List Style Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.ListStyleTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getListStyleType()
	 * @generated
	 */
	int LIST_STYLE_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE_TYPE__ID = OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE_TYPE__TARGET_ID = OBJECT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>List Item Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE_TYPE__LIST_ITEM_TYPE = OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bg Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE_TYPE__BG_COLOR = OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Item Icon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE_TYPE__ITEM_ICON = OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>List Style Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE_TYPE_FEATURE_COUNT = OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.LocationTypeImpl <em>Location Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.LocationTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getLocationType()
	 * @generated
	 */
	int LOCATION_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__ID = OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__TARGET_ID = OBJECT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__LONGITUDE = OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__LATITUDE = OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__ALTITUDE = OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Location Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE_FEATURE_COUNT = OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.LodTypeImpl <em>Lod Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.LodTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getLodType()
	 * @generated
	 */
	int LOD_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOD_TYPE__ID = OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOD_TYPE__TARGET_ID = OBJECT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Min Lod Pixels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOD_TYPE__MIN_LOD_PIXELS = OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Lod Pixels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOD_TYPE__MAX_LOD_PIXELS = OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Fade Extent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOD_TYPE__MIN_FADE_EXTENT = OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Fade Extent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOD_TYPE__MAX_FADE_EXTENT = OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Lod Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOD_TYPE_FEATURE_COUNT = OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.LookAtTypeImpl <em>Look At Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.LookAtTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getLookAtType()
	 * @generated
	 */
	int LOOK_AT_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT_TYPE__ID = OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT_TYPE__TARGET_ID = OBJECT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT_TYPE__LONGITUDE = OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT_TYPE__LATITUDE = OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT_TYPE__ALTITUDE = OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT_TYPE__RANGE = OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tilt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT_TYPE__TILT = OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT_TYPE__HEADING = OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Altitude Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT_TYPE__ALTITUDE_MODE = OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Look At Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT_TYPE_FEATURE_COUNT = OBJECT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.MetadataTypeImpl <em>Metadata Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.MetadataTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getMetadataType()
	 * @generated
	 */
	int METADATA_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE__ANY = 0;

	/**
	 * The number of structural features of the '<em>Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.ModelTypeImpl <em>Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.ModelTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getModelType()
	 * @generated
	 */
	int MODEL_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__ID = GEOMETRY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__TARGET_ID = GEOMETRY_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Altitude Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__ALTITUDE_MODE = GEOMETRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__LOCATION = GEOMETRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__ORIENTATION = GEOMETRY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__SCALE = GEOMETRY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__LINK = GEOMETRY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_FEATURE_COUNT = GEOMETRY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.MultiGeometryTypeImpl <em>Multi Geometry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.MultiGeometryTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getMultiGeometryType()
	 * @generated
	 */
	int MULTI_GEOMETRY_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_GEOMETRY_TYPE__ID = GEOMETRY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_GEOMETRY_TYPE__TARGET_ID = GEOMETRY_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Geometry Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_GEOMETRY_TYPE__GEOMETRY_GROUP = GEOMETRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_GEOMETRY_TYPE__GEOMETRY = GEOMETRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multi Geometry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_GEOMETRY_TYPE_FEATURE_COUNT = GEOMETRY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.NetworkLinkControlTypeImpl <em>Network Link Control Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.NetworkLinkControlTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getNetworkLinkControlType()
	 * @generated
	 */
	int NETWORK_LINK_CONTROL_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Min Refresh Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_CONTROL_TYPE__MIN_REFRESH_PERIOD = 0;

	/**
	 * The feature id for the '<em><b>Cookie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_CONTROL_TYPE__COOKIE = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_CONTROL_TYPE__MESSAGE = 2;

	/**
	 * The feature id for the '<em><b>Link Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_CONTROL_TYPE__LINK_NAME = 3;

	/**
	 * The feature id for the '<em><b>Link Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_CONTROL_TYPE__LINK_DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Link Snippet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_CONTROL_TYPE__LINK_SNIPPET = 5;

	/**
	 * The feature id for the '<em><b>Expires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_CONTROL_TYPE__EXPIRES = 6;

	/**
	 * The feature id for the '<em><b>Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_CONTROL_TYPE__UPDATE = 7;

	/**
	 * The feature id for the '<em><b>Look At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_CONTROL_TYPE__LOOK_AT = 8;

	/**
	 * The number of structural features of the '<em>Network Link Control Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_CONTROL_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.NetworkLinkTypeImpl <em>Network Link Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.NetworkLinkTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getNetworkLinkType()
	 * @generated
	 */
	int NETWORK_LINK_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__ID = FEATURE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__TARGET_ID = FEATURE_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__NAME = FEATURE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__VISIBILITY = FEATURE_TYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__OPEN = FEATURE_TYPE__OPEN;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__ADDRESS = FEATURE_TYPE__ADDRESS;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__PHONE_NUMBER = FEATURE_TYPE__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Snippet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__SNIPPET = FEATURE_TYPE__SNIPPET;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__DESCRIPTION = FEATURE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Look At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__LOOK_AT = FEATURE_TYPE__LOOK_AT;

	/**
	 * The feature id for the '<em><b>Time Primitive Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__TIME_PRIMITIVE_GROUP = FEATURE_TYPE__TIME_PRIMITIVE_GROUP;

	/**
	 * The feature id for the '<em><b>Time Primitive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__TIME_PRIMITIVE = FEATURE_TYPE__TIME_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__STYLE_URL = FEATURE_TYPE__STYLE_URL;

	/**
	 * The feature id for the '<em><b>Style Selector Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__STYLE_SELECTOR_GROUP = FEATURE_TYPE__STYLE_SELECTOR_GROUP;

	/**
	 * The feature id for the '<em><b>Style Selector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__STYLE_SELECTOR = FEATURE_TYPE__STYLE_SELECTOR;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__REGION = FEATURE_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__METADATA = FEATURE_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Refresh Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__REFRESH_VISIBILITY = FEATURE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fly To View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__FLY_TO_VIEW = FEATURE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__LINK = FEATURE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__URL = FEATURE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Network Link Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE_FEATURE_COUNT = FEATURE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.OrientationTypeImpl <em>Orientation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.OrientationTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getOrientationType()
	 * @generated
	 */
	int ORIENTATION_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_TYPE__ID = OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_TYPE__TARGET_ID = OBJECT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_TYPE__HEADING = OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tilt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_TYPE__TILT = OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Roll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_TYPE__ROLL = OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Orientation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_TYPE_FEATURE_COUNT = OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.PlacemarkTypeImpl <em>Placemark Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.PlacemarkTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getPlacemarkType()
	 * @generated
	 */
	int PLACEMARK_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__ID = FEATURE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__TARGET_ID = FEATURE_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__NAME = FEATURE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__VISIBILITY = FEATURE_TYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__OPEN = FEATURE_TYPE__OPEN;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__ADDRESS = FEATURE_TYPE__ADDRESS;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__PHONE_NUMBER = FEATURE_TYPE__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Snippet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__SNIPPET = FEATURE_TYPE__SNIPPET;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__DESCRIPTION = FEATURE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Look At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__LOOK_AT = FEATURE_TYPE__LOOK_AT;

	/**
	 * The feature id for the '<em><b>Time Primitive Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__TIME_PRIMITIVE_GROUP = FEATURE_TYPE__TIME_PRIMITIVE_GROUP;

	/**
	 * The feature id for the '<em><b>Time Primitive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__TIME_PRIMITIVE = FEATURE_TYPE__TIME_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__STYLE_URL = FEATURE_TYPE__STYLE_URL;

	/**
	 * The feature id for the '<em><b>Style Selector Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__STYLE_SELECTOR_GROUP = FEATURE_TYPE__STYLE_SELECTOR_GROUP;

	/**
	 * The feature id for the '<em><b>Style Selector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__STYLE_SELECTOR = FEATURE_TYPE__STYLE_SELECTOR;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__REGION = FEATURE_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__METADATA = FEATURE_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Geometry Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__GEOMETRY_GROUP = FEATURE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__GEOMETRY = FEATURE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Placemark Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE_FEATURE_COUNT = FEATURE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.PointTypeImpl <em>Point Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.PointTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getPointType()
	 * @generated
	 */
	int POINT_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__ID = GEOMETRY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__TARGET_ID = GEOMETRY_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Extrude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__EXTRUDE = GEOMETRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tessellate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__TESSELLATE = GEOMETRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Altitude Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__ALTITUDE_MODE = GEOMETRY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__COORDINATES = GEOMETRY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE_FEATURE_COUNT = GEOMETRY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.PolygonTypeImpl <em>Polygon Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.PolygonTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getPolygonType()
	 * @generated
	 */
	int POLYGON_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__ID = GEOMETRY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__TARGET_ID = GEOMETRY_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Extrude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__EXTRUDE = GEOMETRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tessellate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__TESSELLATE = GEOMETRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Altitude Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__ALTITUDE_MODE = GEOMETRY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Outer Boundary Is</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__OUTER_BOUNDARY_IS = GEOMETRY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inner Boundary Is</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__INNER_BOUNDARY_IS = GEOMETRY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Polygon Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE_FEATURE_COUNT = GEOMETRY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.PolyStyleTypeImpl <em>Poly Style Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.PolyStyleTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getPolyStyleType()
	 * @generated
	 */
	int POLY_STYLE_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_STYLE_TYPE__ID = COLOR_STYLE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_STYLE_TYPE__TARGET_ID = COLOR_STYLE_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_STYLE_TYPE__COLOR = COLOR_STYLE_TYPE__COLOR;

	/**
	 * The feature id for the '<em><b>Color Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_STYLE_TYPE__COLOR_MODE = COLOR_STYLE_TYPE__COLOR_MODE;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_STYLE_TYPE__FILL = COLOR_STYLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_STYLE_TYPE__OUTLINE = COLOR_STYLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Poly Style Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_STYLE_TYPE_FEATURE_COUNT = COLOR_STYLE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.RegionTypeImpl <em>Region Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.RegionTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getRegionType()
	 * @generated
	 */
	int REGION_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_TYPE__ID = OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_TYPE__TARGET_ID = OBJECT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Lat Lon Alt Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_TYPE__LAT_LON_ALT_BOX = OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lod</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_TYPE__LOD = OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Region Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_TYPE_FEATURE_COUNT = OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.ReplaceTypeImpl <em>Replace Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.ReplaceTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getReplaceType()
	 * @generated
	 */
	int REPLACE_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Feature Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_TYPE__FEATURE_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_TYPE__FEATURE = 1;

	/**
	 * The number of structural features of the '<em>Replace Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.ScaleTypeImpl <em>Scale Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.ScaleTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getScaleType()
	 * @generated
	 */
	int SCALE_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_TYPE__ID = OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_TYPE__TARGET_ID = OBJECT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_TYPE__X = OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_TYPE__Y = OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_TYPE__Z = OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Scale Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_TYPE_FEATURE_COUNT = OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.ScreenOverlayTypeImpl <em>Screen Overlay Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.ScreenOverlayTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getScreenOverlayType()
	 * @generated
	 */
	int SCREEN_OVERLAY_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__ID = OVERLAY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__TARGET_ID = OVERLAY_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__NAME = OVERLAY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__VISIBILITY = OVERLAY_TYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__OPEN = OVERLAY_TYPE__OPEN;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__ADDRESS = OVERLAY_TYPE__ADDRESS;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__PHONE_NUMBER = OVERLAY_TYPE__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Snippet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__SNIPPET = OVERLAY_TYPE__SNIPPET;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__DESCRIPTION = OVERLAY_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Look At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__LOOK_AT = OVERLAY_TYPE__LOOK_AT;

	/**
	 * The feature id for the '<em><b>Time Primitive Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__TIME_PRIMITIVE_GROUP = OVERLAY_TYPE__TIME_PRIMITIVE_GROUP;

	/**
	 * The feature id for the '<em><b>Time Primitive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__TIME_PRIMITIVE = OVERLAY_TYPE__TIME_PRIMITIVE;

	/**
	 * The feature id for the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__STYLE_URL = OVERLAY_TYPE__STYLE_URL;

	/**
	 * The feature id for the '<em><b>Style Selector Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__STYLE_SELECTOR_GROUP = OVERLAY_TYPE__STYLE_SELECTOR_GROUP;

	/**
	 * The feature id for the '<em><b>Style Selector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__STYLE_SELECTOR = OVERLAY_TYPE__STYLE_SELECTOR;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__REGION = OVERLAY_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__METADATA = OVERLAY_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__COLOR = OVERLAY_TYPE__COLOR;

	/**
	 * The feature id for the '<em><b>Draw Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__DRAW_ORDER = OVERLAY_TYPE__DRAW_ORDER;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__ICON = OVERLAY_TYPE__ICON;

	/**
	 * The feature id for the '<em><b>Overlay XY</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__OVERLAY_XY = OVERLAY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Screen XY</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__SCREEN_XY = OVERLAY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rotation XY</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__ROTATION_XY = OVERLAY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__SIZE = OVERLAY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__ROTATION = OVERLAY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Screen Overlay Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE_FEATURE_COUNT = OVERLAY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.SnippetTypeImpl <em>Snippet Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.SnippetTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getSnippetType()
	 * @generated
	 */
	int SNIPPET_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Max Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET_TYPE__MAX_LINES = 1;

	/**
	 * The number of structural features of the '<em>Snippet Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.StyleMapPairTypeImpl <em>Style Map Pair Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.StyleMapPairTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getStyleMapPairType()
	 * @generated
	 */
	int STYLE_MAP_PAIR_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_MAP_PAIR_TYPE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_MAP_PAIR_TYPE__STYLE_URL = 1;

	/**
	 * The number of structural features of the '<em>Style Map Pair Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_MAP_PAIR_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.StyleSelectorTypeImpl <em>Style Selector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.StyleSelectorTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getStyleSelectorType()
	 * @generated
	 */
	int STYLE_SELECTOR_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SELECTOR_TYPE__ID = OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SELECTOR_TYPE__TARGET_ID = OBJECT_TYPE__TARGET_ID;

	/**
	 * The number of structural features of the '<em>Style Selector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_SELECTOR_TYPE_FEATURE_COUNT = OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.StyleMapTypeImpl <em>Style Map Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.StyleMapTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getStyleMapType()
	 * @generated
	 */
	int STYLE_MAP_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_MAP_TYPE__ID = STYLE_SELECTOR_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_MAP_TYPE__TARGET_ID = STYLE_SELECTOR_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Pair</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_MAP_TYPE__PAIR = STYLE_SELECTOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Style Map Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_MAP_TYPE_FEATURE_COUNT = STYLE_SELECTOR_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.StyleTypeImpl <em>Style Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.StyleTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getStyleType()
	 * @generated
	 */
	int STYLE_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE__ID = STYLE_SELECTOR_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE__TARGET_ID = STYLE_SELECTOR_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Icon Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE__ICON_STYLE = STYLE_SELECTOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE__LABEL_STYLE = STYLE_SELECTOR_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE__LINE_STYLE = STYLE_SELECTOR_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Poly Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE__POLY_STYLE = STYLE_SELECTOR_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Balloon Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE__BALLOON_STYLE = STYLE_SELECTOR_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>List Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE__LIST_STYLE = STYLE_SELECTOR_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Style Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE_FEATURE_COUNT = STYLE_SELECTOR_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.TimePrimitiveTypeImpl <em>Time Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.TimePrimitiveTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getTimePrimitiveType()
	 * @generated
	 */
	int TIME_PRIMITIVE_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PRIMITIVE_TYPE__ID = OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PRIMITIVE_TYPE__TARGET_ID = OBJECT_TYPE__TARGET_ID;

	/**
	 * The number of structural features of the '<em>Time Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PRIMITIVE_TYPE_FEATURE_COUNT = OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.TimeSpanTypeImpl <em>Time Span Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.TimeSpanTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getTimeSpanType()
	 * @generated
	 */
	int TIME_SPAN_TYPE = 51;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPAN_TYPE__ID = TIME_PRIMITIVE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPAN_TYPE__TARGET_ID = TIME_PRIMITIVE_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPAN_TYPE__BEGIN = TIME_PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPAN_TYPE__END = TIME_PRIMITIVE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Time Span Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPAN_TYPE_FEATURE_COUNT = TIME_PRIMITIVE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.TimeStampTypeImpl <em>Time Stamp Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.TimeStampTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getTimeStampType()
	 * @generated
	 */
	int TIME_STAMP_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_TYPE__ID = TIME_PRIMITIVE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_TYPE__TARGET_ID = TIME_PRIMITIVE_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_TYPE__WHEN = TIME_PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time Stamp Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_TYPE_FEATURE_COUNT = TIME_PRIMITIVE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.UpdateTypeImpl <em>Update Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.UpdateTypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getUpdateType()
	 * @generated
	 */
	int UPDATE_TYPE = 53;

	/**
	 * The feature id for the '<em><b>Target Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE__TARGET_HREF = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Create</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE__CREATE = 2;

	/**
	 * The feature id for the '<em><b>Delete</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE__DELETE = 3;

	/**
	 * The feature id for the '<em><b>Change</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE__CHANGE = 4;

	/**
	 * The feature id for the '<em><b>Replace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE__REPLACE = 5;

	/**
	 * The number of structural features of the '<em>Update Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.impl.Vec2TypeImpl <em>Vec2 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.Vec2TypeImpl
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getVec2Type()
	 * @generated
	 */
	int VEC2_TYPE = 54;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEC2_TYPE__X = 0;

	/**
	 * The feature id for the '<em><b>Xunits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEC2_TYPE__XUNITS = 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEC2_TYPE__Y = 2;

	/**
	 * The feature id for the '<em><b>Yunits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEC2_TYPE__YUNITS = 3;

	/**
	 * The number of structural features of the '<em>Vec2 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEC2_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.AltitudeModeEnum <em>Altitude Mode Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.AltitudeModeEnum
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getAltitudeModeEnum()
	 * @generated
	 */
	int ALTITUDE_MODE_ENUM = 55;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.ColorModeEnum <em>Color Mode Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.ColorModeEnum
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getColorModeEnum()
	 * @generated
	 */
	int COLOR_MODE_ENUM = 56;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.ItemIconStateEnum <em>Item Icon State Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.ItemIconStateEnum
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getItemIconStateEnum()
	 * @generated
	 */
	int ITEM_ICON_STATE_ENUM = 57;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.ListItemTypeEnum <em>List Item Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.ListItemTypeEnum
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getListItemTypeEnum()
	 * @generated
	 */
	int LIST_ITEM_TYPE_ENUM = 58;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.RefreshModeEnum <em>Refresh Mode Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.RefreshModeEnum
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getRefreshModeEnum()
	 * @generated
	 */
	int REFRESH_MODE_ENUM = 59;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.StyleStateEnum <em>Style State Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.StyleStateEnum
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getStyleStateEnum()
	 * @generated
	 */
	int STYLE_STATE_ENUM = 60;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.UnitsEnum <em>Units Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.UnitsEnum
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getUnitsEnum()
	 * @generated
	 */
	int UNITS_ENUM = 61;

	/**
	 * The meta object id for the '{@link com.google.earth.kml._2.ViewRefreshModeEnum <em>View Refresh Mode Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.ViewRefreshModeEnum
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getViewRefreshModeEnum()
	 * @generated
	 */
	int VIEW_REFRESH_MODE_ENUM = 62;

	/**
	 * The meta object id for the '<em>Altitude Mode Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.AltitudeModeEnum
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getAltitudeModeEnumObject()
	 * @generated
	 */
	int ALTITUDE_MODE_ENUM_OBJECT = 63;

	/**
	 * The meta object id for the '<em>Angle180</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getAngle180()
	 * @generated
	 */
	int ANGLE180 = 64;

	/**
	 * The meta object id for the '<em>Angle180 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getAngle180Object()
	 * @generated
	 */
	int ANGLE180_OBJECT = 65;

	/**
	 * The meta object id for the '<em>Angle360</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getAngle360()
	 * @generated
	 */
	int ANGLE360 = 66;

	/**
	 * The meta object id for the '<em>Angle360 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getAngle360Object()
	 * @generated
	 */
	int ANGLE360_OBJECT = 67;

	/**
	 * The meta object id for the '<em>Angle90</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getAngle90()
	 * @generated
	 */
	int ANGLE90 = 68;

	/**
	 * The meta object id for the '<em>Angle90 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getAngle90Object()
	 * @generated
	 */
	int ANGLE90_OBJECT = 69;

	/**
	 * The meta object id for the '<em>Anglepos90</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getAnglepos90()
	 * @generated
	 */
	int ANGLEPOS90 = 70;

	/**
	 * The meta object id for the '<em>Anglepos90 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getAnglepos90Object()
	 * @generated
	 */
	int ANGLEPOS90_OBJECT = 71;

	/**
	 * The meta object id for the '<em>Color</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 72;

	/**
	 * The meta object id for the '<em>Color Mode Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.ColorModeEnum
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getColorModeEnumObject()
	 * @generated
	 */
	int COLOR_MODE_ENUM_OBJECT = 73;

	/**
	 * The meta object id for the '<em>Coordinates Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getCoordinatesType()
	 * @generated
	 */
	int COORDINATES_TYPE = 74;

	/**
	 * The meta object id for the '<em>Date Time Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getDateTimeType()
	 * @generated
	 */
	int DATE_TIME_TYPE = 75;

	/**
	 * The meta object id for the '<em>Item Icon State Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.ItemIconStateEnum
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getItemIconStateEnumObject()
	 * @generated
	 */
	int ITEM_ICON_STATE_ENUM_OBJECT = 76;

	/**
	 * The meta object id for the '<em>Item Icon State Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getItemIconStateType()
	 * @generated
	 */
	int ITEM_ICON_STATE_TYPE = 77;

	/**
	 * The meta object id for the '<em>List Item Type Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.ListItemTypeEnum
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getListItemTypeEnumObject()
	 * @generated
	 */
	int LIST_ITEM_TYPE_ENUM_OBJECT = 78;

	/**
	 * The meta object id for the '<em>Refresh Mode Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.RefreshModeEnum
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getRefreshModeEnumObject()
	 * @generated
	 */
	int REFRESH_MODE_ENUM_OBJECT = 79;

	/**
	 * The meta object id for the '<em>Style State Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.StyleStateEnum
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getStyleStateEnumObject()
	 * @generated
	 */
	int STYLE_STATE_ENUM_OBJECT = 80;

	/**
	 * The meta object id for the '<em>Units Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.UnitsEnum
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getUnitsEnumObject()
	 * @generated
	 */
	int UNITS_ENUM_OBJECT = 81;

	/**
	 * The meta object id for the '<em>View Refresh Mode Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.google.earth.kml._2.ViewRefreshModeEnum
	 * @see com.google.earth.kml._2.impl.v21PackageImpl#getViewRefreshModeEnumObject()
	 * @generated
	 */
	int VIEW_REFRESH_MODE_ENUM_OBJECT = 82;


	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.BalloonStyleType <em>Balloon Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Balloon Style Type</em>'.
	 * @see com.google.earth.kml._2.BalloonStyleType
	 * @generated
	 */
	EClass getBalloonStyleType();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.BalloonStyleType#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see com.google.earth.kml._2.BalloonStyleType#getColor()
	 * @see #getBalloonStyleType()
	 * @generated
	 */
	EAttribute getBalloonStyleType_Color();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.BalloonStyleType#getBgColor <em>Bg Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bg Color</em>'.
	 * @see com.google.earth.kml._2.BalloonStyleType#getBgColor()
	 * @see #getBalloonStyleType()
	 * @generated
	 */
	EAttribute getBalloonStyleType_BgColor();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.BalloonStyleType#getTextColor <em>Text Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Color</em>'.
	 * @see com.google.earth.kml._2.BalloonStyleType#getTextColor()
	 * @see #getBalloonStyleType()
	 * @generated
	 */
	EAttribute getBalloonStyleType_TextColor();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.BalloonStyleType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see com.google.earth.kml._2.BalloonStyleType#getText()
	 * @see #getBalloonStyleType()
	 * @generated
	 */
	EAttribute getBalloonStyleType_Text();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.BoundaryType <em>Boundary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boundary Type</em>'.
	 * @see com.google.earth.kml._2.BoundaryType
	 * @generated
	 */
	EClass getBoundaryType();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.BoundaryType#getLinearRing <em>Linear Ring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Linear Ring</em>'.
	 * @see com.google.earth.kml._2.BoundaryType#getLinearRing()
	 * @see #getBoundaryType()
	 * @generated
	 */
	EReference getBoundaryType_LinearRing();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.ChangeType <em>Change Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Type</em>'.
	 * @see com.google.earth.kml._2.ChangeType
	 * @generated
	 */
	EClass getChangeType();

	/**
	 * Returns the meta object for the attribute list '{@link com.google.earth.kml._2.ChangeType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.google.earth.kml._2.ChangeType#getGroup()
	 * @see #getChangeType()
	 * @generated
	 */
	EAttribute getChangeType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link com.google.earth.kml._2.ChangeType#getObjectGroup <em>Object Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Object Group</em>'.
	 * @see com.google.earth.kml._2.ChangeType#getObjectGroup()
	 * @see #getChangeType()
	 * @generated
	 */
	EAttribute getChangeType_ObjectGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link com.google.earth.kml._2.ChangeType#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see com.google.earth.kml._2.ChangeType#getObject()
	 * @see #getChangeType()
	 * @generated
	 */
	EReference getChangeType_Object();

	/**
	 * Returns the meta object for the attribute list '{@link com.google.earth.kml._2.ChangeType#getFeatureGroup <em>Feature Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Feature Group</em>'.
	 * @see com.google.earth.kml._2.ChangeType#getFeatureGroup()
	 * @see #getChangeType()
	 * @generated
	 */
	EAttribute getChangeType_FeatureGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link com.google.earth.kml._2.ChangeType#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature</em>'.
	 * @see com.google.earth.kml._2.ChangeType#getFeature()
	 * @see #getChangeType()
	 * @generated
	 */
	EReference getChangeType_Feature();

	/**
	 * Returns the meta object for the attribute list '{@link com.google.earth.kml._2.ChangeType#getGeometryGroup <em>Geometry Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Geometry Group</em>'.
	 * @see com.google.earth.kml._2.ChangeType#getGeometryGroup()
	 * @see #getChangeType()
	 * @generated
	 */
	EAttribute getChangeType_GeometryGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link com.google.earth.kml._2.ChangeType#getGeometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Geometry</em>'.
	 * @see com.google.earth.kml._2.ChangeType#getGeometry()
	 * @see #getChangeType()
	 * @generated
	 */
	EReference getChangeType_Geometry();

	/**
	 * Returns the meta object for the attribute list '{@link com.google.earth.kml._2.ChangeType#getStyleSelectorGroup <em>Style Selector Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Style Selector Group</em>'.
	 * @see com.google.earth.kml._2.ChangeType#getStyleSelectorGroup()
	 * @see #getChangeType()
	 * @generated
	 */
	EAttribute getChangeType_StyleSelectorGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link com.google.earth.kml._2.ChangeType#getStyleSelector <em>Style Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Style Selector</em>'.
	 * @see com.google.earth.kml._2.ChangeType#getStyleSelector()
	 * @see #getChangeType()
	 * @generated
	 */
	EReference getChangeType_StyleSelector();

	/**
	 * Returns the meta object for the attribute list '{@link com.google.earth.kml._2.ChangeType#getTimePrimitiveGroup <em>Time Primitive Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Time Primitive Group</em>'.
	 * @see com.google.earth.kml._2.ChangeType#getTimePrimitiveGroup()
	 * @see #getChangeType()
	 * @generated
	 */
	EAttribute getChangeType_TimePrimitiveGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link com.google.earth.kml._2.ChangeType#getTimePrimitive <em>Time Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Primitive</em>'.
	 * @see com.google.earth.kml._2.ChangeType#getTimePrimitive()
	 * @see #getChangeType()
	 * @generated
	 */
	EReference getChangeType_TimePrimitive();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.ColorStyleType <em>Color Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Style Type</em>'.
	 * @see com.google.earth.kml._2.ColorStyleType
	 * @generated
	 */
	EClass getColorStyleType();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.ColorStyleType#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see com.google.earth.kml._2.ColorStyleType#getColor()
	 * @see #getColorStyleType()
	 * @generated
	 */
	EAttribute getColorStyleType_Color();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.ColorStyleType#getColorMode <em>Color Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color Mode</em>'.
	 * @see com.google.earth.kml._2.ColorStyleType#getColorMode()
	 * @see #getColorStyleType()
	 * @generated
	 */
	EAttribute getColorStyleType_ColorMode();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.ContainerType <em>Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Type</em>'.
	 * @see com.google.earth.kml._2.ContainerType
	 * @generated
	 */
	EClass getContainerType();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.CreateType <em>Create Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Type</em>'.
	 * @see com.google.earth.kml._2.CreateType
	 * @generated
	 */
	EClass getCreateType();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.CreateType#getFolder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Folder</em>'.
	 * @see com.google.earth.kml._2.CreateType#getFolder()
	 * @see #getCreateType()
	 * @generated
	 */
	EReference getCreateType_Folder();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.DeleteType <em>Delete Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Type</em>'.
	 * @see com.google.earth.kml._2.DeleteType
	 * @generated
	 */
	EClass getDeleteType();

	/**
	 * Returns the meta object for the attribute list '{@link com.google.earth.kml._2.DeleteType#getFeatureGroup <em>Feature Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Feature Group</em>'.
	 * @see com.google.earth.kml._2.DeleteType#getFeatureGroup()
	 * @see #getDeleteType()
	 * @generated
	 */
	EAttribute getDeleteType_FeatureGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link com.google.earth.kml._2.DeleteType#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature</em>'.
	 * @see com.google.earth.kml._2.DeleteType#getFeature()
	 * @see #getDeleteType()
	 * @generated
	 */
	EReference getDeleteType_Feature();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link com.google.earth.kml._2.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link com.google.earth.kml._2.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link com.google.earth.kml._2.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.DocumentRoot#getBalloonStyle <em>Balloon Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Balloon Style</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getBalloonStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BalloonStyle();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.DocumentRoot#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getObject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Object();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.DocumentRoot#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordinates</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getCoordinates()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Coordinates();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.DocumentRoot#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Document</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getDocument()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Document();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.DocumentRoot#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getFeature()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Feature();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.DocumentRoot#getFolder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Folder</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getFolder()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Folder();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.DocumentRoot#getGeometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geometry</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getGeometry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Geometry();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.DocumentRoot#getGroundOverlay <em>Ground Overlay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ground Overlay</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getGroundOverlay()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GroundOverlay();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.DocumentRoot#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Icon</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getIcon()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.DocumentRoot#getIconStyle <em>Icon Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Icon Style</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getIconStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IconStyle();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.DocumentRoot#getKml <em>Kml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kml</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getKml()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Kml();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.DocumentRoot#getLabelStyle <em>Label Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label Style</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getLabelStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LabelStyle();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.DocumentRoot#getLatLonAltBox <em>Lat Lon Alt Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lat Lon Alt Box</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getLatLonAltBox()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LatLonAltBox();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.DocumentRoot#getLatLonBox <em>Lat Lon Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lat Lon Box</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getLatLonBox()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LatLonBox();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.DocumentRoot#getLinearRing <em>Linear Ring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Linear Ring</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getLinearRing()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LinearRing();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.DocumentRoot#getLineString <em>Line String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line String</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getLineString()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LineString();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.DocumentRoot#getLineStyle <em>Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line Style</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getLineStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LineStyle();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.DocumentRoot#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Link</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getLink()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Link();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.DocumentRoot#getListStyle <em>List Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List Style</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getListStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ListStyle();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.DocumentRoot#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Location();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.DocumentRoot#getLod <em>Lod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getLod()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Lod();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.DocumentRoot#getLookAt <em>Look At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Look At</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getLookAt()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LookAt();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.DocumentRoot#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getModel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Model();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.DocumentRoot#getMultiGeometry <em>Multi Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multi Geometry</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getMultiGeometry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MultiGeometry();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.DocumentRoot#getNetworkLink <em>Network Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Network Link</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getNetworkLink()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NetworkLink();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.DocumentRoot#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Orientation</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getOrientation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Orientation();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.DocumentRoot#getPlacemark <em>Placemark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Placemark</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getPlacemark()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Placemark();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.DocumentRoot#getPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Point</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getPoint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Point();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.DocumentRoot#getPolygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Polygon</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getPolygon()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Polygon();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.DocumentRoot#getPolyStyle <em>Poly Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Poly Style</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getPolyStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PolyStyle();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.DocumentRoot#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Region</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getRegion()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Region();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.DocumentRoot#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scale</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getScale()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Scale();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.DocumentRoot#getScreenOverlay <em>Screen Overlay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Screen Overlay</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getScreenOverlay()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ScreenOverlay();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.DocumentRoot#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Style();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.DocumentRoot#getStyleSelector <em>Style Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style Selector</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getStyleSelector()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StyleSelector();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.DocumentRoot#getStyleMap <em>Style Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style Map</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getStyleMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StyleMap();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.DocumentRoot#getStyleUrl <em>Style Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Url</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getStyleUrl()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StyleUrl();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.DocumentRoot#getTimePrimitive <em>Time Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Primitive</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getTimePrimitive()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TimePrimitive();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.DocumentRoot#getTimeSpan <em>Time Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Span</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getTimeSpan()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TimeSpan();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.DocumentRoot#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see com.google.earth.kml._2.DocumentRoot#getTimeStamp()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TimeStamp();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.DocumentType <em>Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Type</em>'.
	 * @see com.google.earth.kml._2.DocumentType
	 * @generated
	 */
	EClass getDocumentType();

	/**
	 * Returns the meta object for the attribute list '{@link com.google.earth.kml._2.DocumentType#getFeatureGroup <em>Feature Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Feature Group</em>'.
	 * @see com.google.earth.kml._2.DocumentType#getFeatureGroup()
	 * @see #getDocumentType()
	 * @generated
	 */
	EAttribute getDocumentType_FeatureGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link com.google.earth.kml._2.DocumentType#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature</em>'.
	 * @see com.google.earth.kml._2.DocumentType#getFeature()
	 * @see #getDocumentType()
	 * @generated
	 */
	EReference getDocumentType_Feature();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.FeatureType <em>Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Type</em>'.
	 * @see com.google.earth.kml._2.FeatureType
	 * @generated
	 */
	EClass getFeatureType();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.FeatureType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.google.earth.kml._2.FeatureType#getName()
	 * @see #getFeatureType()
	 * @generated
	 */
	EAttribute getFeatureType_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.FeatureType#isVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see com.google.earth.kml._2.FeatureType#isVisibility()
	 * @see #getFeatureType()
	 * @generated
	 */
	EAttribute getFeatureType_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.FeatureType#isOpen <em>Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Open</em>'.
	 * @see com.google.earth.kml._2.FeatureType#isOpen()
	 * @see #getFeatureType()
	 * @generated
	 */
	EAttribute getFeatureType_Open();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.FeatureType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see com.google.earth.kml._2.FeatureType#getAddress()
	 * @see #getFeatureType()
	 * @generated
	 */
	EAttribute getFeatureType_Address();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.FeatureType#getPhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Number</em>'.
	 * @see com.google.earth.kml._2.FeatureType#getPhoneNumber()
	 * @see #getFeatureType()
	 * @generated
	 */
	EAttribute getFeatureType_PhoneNumber();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.FeatureType#getSnippet <em>Snippet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Snippet</em>'.
	 * @see com.google.earth.kml._2.FeatureType#getSnippet()
	 * @see #getFeatureType()
	 * @generated
	 */
	EReference getFeatureType_Snippet();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.FeatureType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.google.earth.kml._2.FeatureType#getDescription()
	 * @see #getFeatureType()
	 * @generated
	 */
	EAttribute getFeatureType_Description();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.FeatureType#getLookAt <em>Look At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Look At</em>'.
	 * @see com.google.earth.kml._2.FeatureType#getLookAt()
	 * @see #getFeatureType()
	 * @generated
	 */
	EReference getFeatureType_LookAt();

	/**
	 * Returns the meta object for the attribute list '{@link com.google.earth.kml._2.FeatureType#getTimePrimitiveGroup <em>Time Primitive Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Time Primitive Group</em>'.
	 * @see com.google.earth.kml._2.FeatureType#getTimePrimitiveGroup()
	 * @see #getFeatureType()
	 * @generated
	 */
	EAttribute getFeatureType_TimePrimitiveGroup();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.FeatureType#getTimePrimitive <em>Time Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Primitive</em>'.
	 * @see com.google.earth.kml._2.FeatureType#getTimePrimitive()
	 * @see #getFeatureType()
	 * @generated
	 */
	EReference getFeatureType_TimePrimitive();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.FeatureType#getStyleUrl <em>Style Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Url</em>'.
	 * @see com.google.earth.kml._2.FeatureType#getStyleUrl()
	 * @see #getFeatureType()
	 * @generated
	 */
	EAttribute getFeatureType_StyleUrl();

	/**
	 * Returns the meta object for the attribute list '{@link com.google.earth.kml._2.FeatureType#getStyleSelectorGroup <em>Style Selector Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Style Selector Group</em>'.
	 * @see com.google.earth.kml._2.FeatureType#getStyleSelectorGroup()
	 * @see #getFeatureType()
	 * @generated
	 */
	EAttribute getFeatureType_StyleSelectorGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link com.google.earth.kml._2.FeatureType#getStyleSelector <em>Style Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Style Selector</em>'.
	 * @see com.google.earth.kml._2.FeatureType#getStyleSelector()
	 * @see #getFeatureType()
	 * @generated
	 */
	EReference getFeatureType_StyleSelector();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.FeatureType#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Region</em>'.
	 * @see com.google.earth.kml._2.FeatureType#getRegion()
	 * @see #getFeatureType()
	 * @generated
	 */
	EReference getFeatureType_Region();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.FeatureType#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see com.google.earth.kml._2.FeatureType#getMetadata()
	 * @see #getFeatureType()
	 * @generated
	 */
	EReference getFeatureType_Metadata();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.FolderType <em>Folder Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder Type</em>'.
	 * @see com.google.earth.kml._2.FolderType
	 * @generated
	 */
	EClass getFolderType();

	/**
	 * Returns the meta object for the attribute list '{@link com.google.earth.kml._2.FolderType#getFeatureGroup <em>Feature Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Feature Group</em>'.
	 * @see com.google.earth.kml._2.FolderType#getFeatureGroup()
	 * @see #getFolderType()
	 * @generated
	 */
	EAttribute getFolderType_FeatureGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link com.google.earth.kml._2.FolderType#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature</em>'.
	 * @see com.google.earth.kml._2.FolderType#getFeature()
	 * @see #getFolderType()
	 * @generated
	 */
	EReference getFolderType_Feature();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.GeometryType <em>Geometry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geometry Type</em>'.
	 * @see com.google.earth.kml._2.GeometryType
	 * @generated
	 */
	EClass getGeometryType();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.GroundOverlayType <em>Ground Overlay Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ground Overlay Type</em>'.
	 * @see com.google.earth.kml._2.GroundOverlayType
	 * @generated
	 */
	EClass getGroundOverlayType();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.GroundOverlayType#getAltitude <em>Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitude</em>'.
	 * @see com.google.earth.kml._2.GroundOverlayType#getAltitude()
	 * @see #getGroundOverlayType()
	 * @generated
	 */
	EAttribute getGroundOverlayType_Altitude();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.GroundOverlayType#getAltitudeMode <em>Altitude Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitude Mode</em>'.
	 * @see com.google.earth.kml._2.GroundOverlayType#getAltitudeMode()
	 * @see #getGroundOverlayType()
	 * @generated
	 */
	EAttribute getGroundOverlayType_AltitudeMode();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.GroundOverlayType#getLatLonBox <em>Lat Lon Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lat Lon Box</em>'.
	 * @see com.google.earth.kml._2.GroundOverlayType#getLatLonBox()
	 * @see #getGroundOverlayType()
	 * @generated
	 */
	EReference getGroundOverlayType_LatLonBox();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.IconStyleIconType <em>Icon Style Icon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icon Style Icon Type</em>'.
	 * @see com.google.earth.kml._2.IconStyleIconType
	 * @generated
	 */
	EClass getIconStyleIconType();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.IconStyleIconType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see com.google.earth.kml._2.IconStyleIconType#getHref()
	 * @see #getIconStyleIconType()
	 * @generated
	 */
	EAttribute getIconStyleIconType_Href();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.IconStyleType <em>Icon Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icon Style Type</em>'.
	 * @see com.google.earth.kml._2.IconStyleType
	 * @generated
	 */
	EClass getIconStyleType();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.IconStyleType#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see com.google.earth.kml._2.IconStyleType#getScale()
	 * @see #getIconStyleType()
	 * @generated
	 */
	EAttribute getIconStyleType_Scale();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.IconStyleType#getHeading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heading</em>'.
	 * @see com.google.earth.kml._2.IconStyleType#getHeading()
	 * @see #getIconStyleType()
	 * @generated
	 */
	EAttribute getIconStyleType_Heading();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.IconStyleType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Icon</em>'.
	 * @see com.google.earth.kml._2.IconStyleType#getIcon()
	 * @see #getIconStyleType()
	 * @generated
	 */
	EReference getIconStyleType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.IconStyleType#getHotSpot <em>Hot Spot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hot Spot</em>'.
	 * @see com.google.earth.kml._2.IconStyleType#getHotSpot()
	 * @see #getIconStyleType()
	 * @generated
	 */
	EReference getIconStyleType_HotSpot();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.IconType <em>Icon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icon Type</em>'.
	 * @see com.google.earth.kml._2.IconType
	 * @generated
	 */
	EClass getIconType();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.IconType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see com.google.earth.kml._2.IconType#getX()
	 * @see #getIconType()
	 * @generated
	 */
	EAttribute getIconType_X();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.IconType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see com.google.earth.kml._2.IconType#getY()
	 * @see #getIconType()
	 * @generated
	 */
	EAttribute getIconType_Y();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.IconType#getW <em>W</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>W</em>'.
	 * @see com.google.earth.kml._2.IconType#getW()
	 * @see #getIconType()
	 * @generated
	 */
	EAttribute getIconType_W();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.IconType#getH <em>H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>H</em>'.
	 * @see com.google.earth.kml._2.IconType#getH()
	 * @see #getIconType()
	 * @generated
	 */
	EAttribute getIconType_H();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.ItemIconType <em>Item Icon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Icon Type</em>'.
	 * @see com.google.earth.kml._2.ItemIconType
	 * @generated
	 */
	EClass getItemIconType();

	/**
	 * Returns the meta object for the attribute list '{@link com.google.earth.kml._2.ItemIconType#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>State</em>'.
	 * @see com.google.earth.kml._2.ItemIconType#getState()
	 * @see #getItemIconType()
	 * @generated
	 */
	EAttribute getItemIconType_State();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.ItemIconType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see com.google.earth.kml._2.ItemIconType#getHref()
	 * @see #getItemIconType()
	 * @generated
	 */
	EAttribute getItemIconType_Href();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.KmlType <em>Kml Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kml Type</em>'.
	 * @see com.google.earth.kml._2.KmlType
	 * @generated
	 */
	EClass getKmlType();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.KmlType#getNetworkLinkControl <em>Network Link Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Network Link Control</em>'.
	 * @see com.google.earth.kml._2.KmlType#getNetworkLinkControl()
	 * @see #getKmlType()
	 * @generated
	 */
	EReference getKmlType_NetworkLinkControl();

	/**
	 * Returns the meta object for the attribute list '{@link com.google.earth.kml._2.KmlType#getFeatureGroup <em>Feature Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Feature Group</em>'.
	 * @see com.google.earth.kml._2.KmlType#getFeatureGroup()
	 * @see #getKmlType()
	 * @generated
	 */
	EAttribute getKmlType_FeatureGroup();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.KmlType#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature</em>'.
	 * @see com.google.earth.kml._2.KmlType#getFeature()
	 * @see #getKmlType()
	 * @generated
	 */
	EReference getKmlType_Feature();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.LabelStyleType <em>Label Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Style Type</em>'.
	 * @see com.google.earth.kml._2.LabelStyleType
	 * @generated
	 */
	EClass getLabelStyleType();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LabelStyleType#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see com.google.earth.kml._2.LabelStyleType#getScale()
	 * @see #getLabelStyleType()
	 * @generated
	 */
	EAttribute getLabelStyleType_Scale();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.LatLonAltBoxType <em>Lat Lon Alt Box Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lat Lon Alt Box Type</em>'.
	 * @see com.google.earth.kml._2.LatLonAltBoxType
	 * @generated
	 */
	EClass getLatLonAltBoxType();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LatLonAltBoxType#getMinAltitude <em>Min Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Altitude</em>'.
	 * @see com.google.earth.kml._2.LatLonAltBoxType#getMinAltitude()
	 * @see #getLatLonAltBoxType()
	 * @generated
	 */
	EAttribute getLatLonAltBoxType_MinAltitude();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LatLonAltBoxType#getMaxAltitude <em>Max Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Altitude</em>'.
	 * @see com.google.earth.kml._2.LatLonAltBoxType#getMaxAltitude()
	 * @see #getLatLonAltBoxType()
	 * @generated
	 */
	EAttribute getLatLonAltBoxType_MaxAltitude();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LatLonAltBoxType#getAltitudeMode <em>Altitude Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitude Mode</em>'.
	 * @see com.google.earth.kml._2.LatLonAltBoxType#getAltitudeMode()
	 * @see #getLatLonAltBoxType()
	 * @generated
	 */
	EAttribute getLatLonAltBoxType_AltitudeMode();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.LatLonBoxType <em>Lat Lon Box Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lat Lon Box Type</em>'.
	 * @see com.google.earth.kml._2.LatLonBoxType
	 * @generated
	 */
	EClass getLatLonBoxType();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LatLonBoxType#getNorth <em>North</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>North</em>'.
	 * @see com.google.earth.kml._2.LatLonBoxType#getNorth()
	 * @see #getLatLonBoxType()
	 * @generated
	 */
	EAttribute getLatLonBoxType_North();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LatLonBoxType#getSouth <em>South</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>South</em>'.
	 * @see com.google.earth.kml._2.LatLonBoxType#getSouth()
	 * @see #getLatLonBoxType()
	 * @generated
	 */
	EAttribute getLatLonBoxType_South();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LatLonBoxType#getEast <em>East</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>East</em>'.
	 * @see com.google.earth.kml._2.LatLonBoxType#getEast()
	 * @see #getLatLonBoxType()
	 * @generated
	 */
	EAttribute getLatLonBoxType_East();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LatLonBoxType#getWest <em>West</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>West</em>'.
	 * @see com.google.earth.kml._2.LatLonBoxType#getWest()
	 * @see #getLatLonBoxType()
	 * @generated
	 */
	EAttribute getLatLonBoxType_West();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LatLonBoxType#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see com.google.earth.kml._2.LatLonBoxType#getRotation()
	 * @see #getLatLonBoxType()
	 * @generated
	 */
	EAttribute getLatLonBoxType_Rotation();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.LinearRingType <em>Linear Ring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear Ring Type</em>'.
	 * @see com.google.earth.kml._2.LinearRingType
	 * @generated
	 */
	EClass getLinearRingType();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LinearRingType#isExtrude <em>Extrude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrude</em>'.
	 * @see com.google.earth.kml._2.LinearRingType#isExtrude()
	 * @see #getLinearRingType()
	 * @generated
	 */
	EAttribute getLinearRingType_Extrude();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LinearRingType#isTessellate <em>Tessellate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tessellate</em>'.
	 * @see com.google.earth.kml._2.LinearRingType#isTessellate()
	 * @see #getLinearRingType()
	 * @generated
	 */
	EAttribute getLinearRingType_Tessellate();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LinearRingType#getAltitudeMode <em>Altitude Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitude Mode</em>'.
	 * @see com.google.earth.kml._2.LinearRingType#getAltitudeMode()
	 * @see #getLinearRingType()
	 * @generated
	 */
	EAttribute getLinearRingType_AltitudeMode();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LinearRingType#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordinates</em>'.
	 * @see com.google.earth.kml._2.LinearRingType#getCoordinates()
	 * @see #getLinearRingType()
	 * @generated
	 */
	EAttribute getLinearRingType_Coordinates();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.LineStringType <em>Line String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line String Type</em>'.
	 * @see com.google.earth.kml._2.LineStringType
	 * @generated
	 */
	EClass getLineStringType();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LineStringType#isExtrude <em>Extrude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrude</em>'.
	 * @see com.google.earth.kml._2.LineStringType#isExtrude()
	 * @see #getLineStringType()
	 * @generated
	 */
	EAttribute getLineStringType_Extrude();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LineStringType#isTessellate <em>Tessellate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tessellate</em>'.
	 * @see com.google.earth.kml._2.LineStringType#isTessellate()
	 * @see #getLineStringType()
	 * @generated
	 */
	EAttribute getLineStringType_Tessellate();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LineStringType#getAltitudeMode <em>Altitude Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitude Mode</em>'.
	 * @see com.google.earth.kml._2.LineStringType#getAltitudeMode()
	 * @see #getLineStringType()
	 * @generated
	 */
	EAttribute getLineStringType_AltitudeMode();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LineStringType#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordinates</em>'.
	 * @see com.google.earth.kml._2.LineStringType#getCoordinates()
	 * @see #getLineStringType()
	 * @generated
	 */
	EAttribute getLineStringType_Coordinates();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.LineStyleType <em>Line Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Style Type</em>'.
	 * @see com.google.earth.kml._2.LineStyleType
	 * @generated
	 */
	EClass getLineStyleType();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LineStyleType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see com.google.earth.kml._2.LineStyleType#getWidth()
	 * @see #getLineStyleType()
	 * @generated
	 */
	EAttribute getLineStyleType_Width();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.LinkType <em>Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Type</em>'.
	 * @see com.google.earth.kml._2.LinkType
	 * @generated
	 */
	EClass getLinkType();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LinkType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see com.google.earth.kml._2.LinkType#getHref()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_Href();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LinkType#getRefreshMode <em>Refresh Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refresh Mode</em>'.
	 * @see com.google.earth.kml._2.LinkType#getRefreshMode()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_RefreshMode();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LinkType#getRefreshInterval <em>Refresh Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refresh Interval</em>'.
	 * @see com.google.earth.kml._2.LinkType#getRefreshInterval()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_RefreshInterval();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LinkType#getViewRefreshMode <em>View Refresh Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Refresh Mode</em>'.
	 * @see com.google.earth.kml._2.LinkType#getViewRefreshMode()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_ViewRefreshMode();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LinkType#getViewRefreshTime <em>View Refresh Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Refresh Time</em>'.
	 * @see com.google.earth.kml._2.LinkType#getViewRefreshTime()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_ViewRefreshTime();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LinkType#getViewBoundScale <em>View Bound Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Bound Scale</em>'.
	 * @see com.google.earth.kml._2.LinkType#getViewBoundScale()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_ViewBoundScale();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LinkType#getViewFormat <em>View Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Format</em>'.
	 * @see com.google.earth.kml._2.LinkType#getViewFormat()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_ViewFormat();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LinkType#getHttpQuery <em>Http Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Query</em>'.
	 * @see com.google.earth.kml._2.LinkType#getHttpQuery()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_HttpQuery();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.ListStyleType <em>List Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Style Type</em>'.
	 * @see com.google.earth.kml._2.ListStyleType
	 * @generated
	 */
	EClass getListStyleType();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.ListStyleType#getListItemType <em>List Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Item Type</em>'.
	 * @see com.google.earth.kml._2.ListStyleType#getListItemType()
	 * @see #getListStyleType()
	 * @generated
	 */
	EAttribute getListStyleType_ListItemType();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.ListStyleType#getBgColor <em>Bg Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bg Color</em>'.
	 * @see com.google.earth.kml._2.ListStyleType#getBgColor()
	 * @see #getListStyleType()
	 * @generated
	 */
	EAttribute getListStyleType_BgColor();

	/**
	 * Returns the meta object for the containment reference list '{@link com.google.earth.kml._2.ListStyleType#getItemIcon <em>Item Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item Icon</em>'.
	 * @see com.google.earth.kml._2.ListStyleType#getItemIcon()
	 * @see #getListStyleType()
	 * @generated
	 */
	EReference getListStyleType_ItemIcon();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.LocationType <em>Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Type</em>'.
	 * @see com.google.earth.kml._2.LocationType
	 * @generated
	 */
	EClass getLocationType();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LocationType#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see com.google.earth.kml._2.LocationType#getLongitude()
	 * @see #getLocationType()
	 * @generated
	 */
	EAttribute getLocationType_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LocationType#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see com.google.earth.kml._2.LocationType#getLatitude()
	 * @see #getLocationType()
	 * @generated
	 */
	EAttribute getLocationType_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LocationType#getAltitude <em>Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitude</em>'.
	 * @see com.google.earth.kml._2.LocationType#getAltitude()
	 * @see #getLocationType()
	 * @generated
	 */
	EAttribute getLocationType_Altitude();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.LodType <em>Lod Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lod Type</em>'.
	 * @see com.google.earth.kml._2.LodType
	 * @generated
	 */
	EClass getLodType();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LodType#getMinLodPixels <em>Min Lod Pixels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Lod Pixels</em>'.
	 * @see com.google.earth.kml._2.LodType#getMinLodPixels()
	 * @see #getLodType()
	 * @generated
	 */
	EAttribute getLodType_MinLodPixels();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LodType#getMaxLodPixels <em>Max Lod Pixels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Lod Pixels</em>'.
	 * @see com.google.earth.kml._2.LodType#getMaxLodPixels()
	 * @see #getLodType()
	 * @generated
	 */
	EAttribute getLodType_MaxLodPixels();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LodType#getMinFadeExtent <em>Min Fade Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Fade Extent</em>'.
	 * @see com.google.earth.kml._2.LodType#getMinFadeExtent()
	 * @see #getLodType()
	 * @generated
	 */
	EAttribute getLodType_MinFadeExtent();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LodType#getMaxFadeExtent <em>Max Fade Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Fade Extent</em>'.
	 * @see com.google.earth.kml._2.LodType#getMaxFadeExtent()
	 * @see #getLodType()
	 * @generated
	 */
	EAttribute getLodType_MaxFadeExtent();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.LookAtType <em>Look At Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Look At Type</em>'.
	 * @see com.google.earth.kml._2.LookAtType
	 * @generated
	 */
	EClass getLookAtType();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LookAtType#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see com.google.earth.kml._2.LookAtType#getLongitude()
	 * @see #getLookAtType()
	 * @generated
	 */
	EAttribute getLookAtType_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LookAtType#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see com.google.earth.kml._2.LookAtType#getLatitude()
	 * @see #getLookAtType()
	 * @generated
	 */
	EAttribute getLookAtType_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LookAtType#getAltitude <em>Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitude</em>'.
	 * @see com.google.earth.kml._2.LookAtType#getAltitude()
	 * @see #getLookAtType()
	 * @generated
	 */
	EAttribute getLookAtType_Altitude();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LookAtType#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see com.google.earth.kml._2.LookAtType#getRange()
	 * @see #getLookAtType()
	 * @generated
	 */
	EAttribute getLookAtType_Range();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LookAtType#getTilt <em>Tilt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tilt</em>'.
	 * @see com.google.earth.kml._2.LookAtType#getTilt()
	 * @see #getLookAtType()
	 * @generated
	 */
	EAttribute getLookAtType_Tilt();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LookAtType#getHeading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heading</em>'.
	 * @see com.google.earth.kml._2.LookAtType#getHeading()
	 * @see #getLookAtType()
	 * @generated
	 */
	EAttribute getLookAtType_Heading();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.LookAtType#getAltitudeMode <em>Altitude Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitude Mode</em>'.
	 * @see com.google.earth.kml._2.LookAtType#getAltitudeMode()
	 * @see #getLookAtType()
	 * @generated
	 */
	EAttribute getLookAtType_AltitudeMode();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.MetadataType <em>Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata Type</em>'.
	 * @see com.google.earth.kml._2.MetadataType
	 * @generated
	 */
	EClass getMetadataType();

	/**
	 * Returns the meta object for the attribute list '{@link com.google.earth.kml._2.MetadataType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see com.google.earth.kml._2.MetadataType#getAny()
	 * @see #getMetadataType()
	 * @generated
	 */
	EAttribute getMetadataType_Any();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.ModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Type</em>'.
	 * @see com.google.earth.kml._2.ModelType
	 * @generated
	 */
	EClass getModelType();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.ModelType#getAltitudeMode <em>Altitude Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitude Mode</em>'.
	 * @see com.google.earth.kml._2.ModelType#getAltitudeMode()
	 * @see #getModelType()
	 * @generated
	 */
	EAttribute getModelType_AltitudeMode();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.ModelType#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see com.google.earth.kml._2.ModelType#getLocation()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Location();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.ModelType#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Orientation</em>'.
	 * @see com.google.earth.kml._2.ModelType#getOrientation()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Orientation();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.ModelType#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scale</em>'.
	 * @see com.google.earth.kml._2.ModelType#getScale()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Scale();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.ModelType#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Link</em>'.
	 * @see com.google.earth.kml._2.ModelType#getLink()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Link();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.MultiGeometryType <em>Multi Geometry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Geometry Type</em>'.
	 * @see com.google.earth.kml._2.MultiGeometryType
	 * @generated
	 */
	EClass getMultiGeometryType();

	/**
	 * Returns the meta object for the attribute list '{@link com.google.earth.kml._2.MultiGeometryType#getGeometryGroup <em>Geometry Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Geometry Group</em>'.
	 * @see com.google.earth.kml._2.MultiGeometryType#getGeometryGroup()
	 * @see #getMultiGeometryType()
	 * @generated
	 */
	EAttribute getMultiGeometryType_GeometryGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link com.google.earth.kml._2.MultiGeometryType#getGeometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Geometry</em>'.
	 * @see com.google.earth.kml._2.MultiGeometryType#getGeometry()
	 * @see #getMultiGeometryType()
	 * @generated
	 */
	EReference getMultiGeometryType_Geometry();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.NetworkLinkControlType <em>Network Link Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Link Control Type</em>'.
	 * @see com.google.earth.kml._2.NetworkLinkControlType
	 * @generated
	 */
	EClass getNetworkLinkControlType();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.NetworkLinkControlType#getMinRefreshPeriod <em>Min Refresh Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Refresh Period</em>'.
	 * @see com.google.earth.kml._2.NetworkLinkControlType#getMinRefreshPeriod()
	 * @see #getNetworkLinkControlType()
	 * @generated
	 */
	EAttribute getNetworkLinkControlType_MinRefreshPeriod();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.NetworkLinkControlType#getCookie <em>Cookie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cookie</em>'.
	 * @see com.google.earth.kml._2.NetworkLinkControlType#getCookie()
	 * @see #getNetworkLinkControlType()
	 * @generated
	 */
	EAttribute getNetworkLinkControlType_Cookie();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.NetworkLinkControlType#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see com.google.earth.kml._2.NetworkLinkControlType#getMessage()
	 * @see #getNetworkLinkControlType()
	 * @generated
	 */
	EAttribute getNetworkLinkControlType_Message();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.NetworkLinkControlType#getLinkName <em>Link Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Name</em>'.
	 * @see com.google.earth.kml._2.NetworkLinkControlType#getLinkName()
	 * @see #getNetworkLinkControlType()
	 * @generated
	 */
	EAttribute getNetworkLinkControlType_LinkName();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.NetworkLinkControlType#getLinkDescription <em>Link Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Description</em>'.
	 * @see com.google.earth.kml._2.NetworkLinkControlType#getLinkDescription()
	 * @see #getNetworkLinkControlType()
	 * @generated
	 */
	EAttribute getNetworkLinkControlType_LinkDescription();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.NetworkLinkControlType#getLinkSnippet <em>Link Snippet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Link Snippet</em>'.
	 * @see com.google.earth.kml._2.NetworkLinkControlType#getLinkSnippet()
	 * @see #getNetworkLinkControlType()
	 * @generated
	 */
	EReference getNetworkLinkControlType_LinkSnippet();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.NetworkLinkControlType#getExpires <em>Expires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expires</em>'.
	 * @see com.google.earth.kml._2.NetworkLinkControlType#getExpires()
	 * @see #getNetworkLinkControlType()
	 * @generated
	 */
	EAttribute getNetworkLinkControlType_Expires();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.NetworkLinkControlType#getUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update</em>'.
	 * @see com.google.earth.kml._2.NetworkLinkControlType#getUpdate()
	 * @see #getNetworkLinkControlType()
	 * @generated
	 */
	EReference getNetworkLinkControlType_Update();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.NetworkLinkControlType#getLookAt <em>Look At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Look At</em>'.
	 * @see com.google.earth.kml._2.NetworkLinkControlType#getLookAt()
	 * @see #getNetworkLinkControlType()
	 * @generated
	 */
	EReference getNetworkLinkControlType_LookAt();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.NetworkLinkType <em>Network Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Link Type</em>'.
	 * @see com.google.earth.kml._2.NetworkLinkType
	 * @generated
	 */
	EClass getNetworkLinkType();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.NetworkLinkType#isRefreshVisibility <em>Refresh Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refresh Visibility</em>'.
	 * @see com.google.earth.kml._2.NetworkLinkType#isRefreshVisibility()
	 * @see #getNetworkLinkType()
	 * @generated
	 */
	EAttribute getNetworkLinkType_RefreshVisibility();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.NetworkLinkType#isFlyToView <em>Fly To View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fly To View</em>'.
	 * @see com.google.earth.kml._2.NetworkLinkType#isFlyToView()
	 * @see #getNetworkLinkType()
	 * @generated
	 */
	EAttribute getNetworkLinkType_FlyToView();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.NetworkLinkType#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Link</em>'.
	 * @see com.google.earth.kml._2.NetworkLinkType#getLink()
	 * @see #getNetworkLinkType()
	 * @generated
	 */
	EReference getNetworkLinkType_Link();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.NetworkLinkType#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Url</em>'.
	 * @see com.google.earth.kml._2.NetworkLinkType#getUrl()
	 * @see #getNetworkLinkType()
	 * @generated
	 */
	EReference getNetworkLinkType_Url();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.ObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Type</em>'.
	 * @see com.google.earth.kml._2.ObjectType
	 * @generated
	 */
	EClass getObjectType();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.ObjectType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.google.earth.kml._2.ObjectType#getId()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.ObjectType#getTargetId <em>Target Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Id</em>'.
	 * @see com.google.earth.kml._2.ObjectType#getTargetId()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_TargetId();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.OrientationType <em>Orientation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orientation Type</em>'.
	 * @see com.google.earth.kml._2.OrientationType
	 * @generated
	 */
	EClass getOrientationType();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.OrientationType#getHeading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heading</em>'.
	 * @see com.google.earth.kml._2.OrientationType#getHeading()
	 * @see #getOrientationType()
	 * @generated
	 */
	EAttribute getOrientationType_Heading();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.OrientationType#getTilt <em>Tilt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tilt</em>'.
	 * @see com.google.earth.kml._2.OrientationType#getTilt()
	 * @see #getOrientationType()
	 * @generated
	 */
	EAttribute getOrientationType_Tilt();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.OrientationType#getRoll <em>Roll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roll</em>'.
	 * @see com.google.earth.kml._2.OrientationType#getRoll()
	 * @see #getOrientationType()
	 * @generated
	 */
	EAttribute getOrientationType_Roll();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.OverlayType <em>Overlay Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Overlay Type</em>'.
	 * @see com.google.earth.kml._2.OverlayType
	 * @generated
	 */
	EClass getOverlayType();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.OverlayType#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see com.google.earth.kml._2.OverlayType#getColor()
	 * @see #getOverlayType()
	 * @generated
	 */
	EAttribute getOverlayType_Color();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.OverlayType#getDrawOrder <em>Draw Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Draw Order</em>'.
	 * @see com.google.earth.kml._2.OverlayType#getDrawOrder()
	 * @see #getOverlayType()
	 * @generated
	 */
	EAttribute getOverlayType_DrawOrder();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.OverlayType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Icon</em>'.
	 * @see com.google.earth.kml._2.OverlayType#getIcon()
	 * @see #getOverlayType()
	 * @generated
	 */
	EReference getOverlayType_Icon();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.PlacemarkType <em>Placemark Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Placemark Type</em>'.
	 * @see com.google.earth.kml._2.PlacemarkType
	 * @generated
	 */
	EClass getPlacemarkType();

	/**
	 * Returns the meta object for the attribute list '{@link com.google.earth.kml._2.PlacemarkType#getGeometryGroup <em>Geometry Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Geometry Group</em>'.
	 * @see com.google.earth.kml._2.PlacemarkType#getGeometryGroup()
	 * @see #getPlacemarkType()
	 * @generated
	 */
	EAttribute getPlacemarkType_GeometryGroup();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.PlacemarkType#getGeometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geometry</em>'.
	 * @see com.google.earth.kml._2.PlacemarkType#getGeometry()
	 * @see #getPlacemarkType()
	 * @generated
	 */
	EReference getPlacemarkType_Geometry();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.PointType <em>Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Type</em>'.
	 * @see com.google.earth.kml._2.PointType
	 * @generated
	 */
	EClass getPointType();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.PointType#isExtrude <em>Extrude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrude</em>'.
	 * @see com.google.earth.kml._2.PointType#isExtrude()
	 * @see #getPointType()
	 * @generated
	 */
	EAttribute getPointType_Extrude();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.PointType#isTessellate <em>Tessellate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tessellate</em>'.
	 * @see com.google.earth.kml._2.PointType#isTessellate()
	 * @see #getPointType()
	 * @generated
	 */
	EAttribute getPointType_Tessellate();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.PointType#getAltitudeMode <em>Altitude Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitude Mode</em>'.
	 * @see com.google.earth.kml._2.PointType#getAltitudeMode()
	 * @see #getPointType()
	 * @generated
	 */
	EAttribute getPointType_AltitudeMode();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.PointType#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordinates</em>'.
	 * @see com.google.earth.kml._2.PointType#getCoordinates()
	 * @see #getPointType()
	 * @generated
	 */
	EAttribute getPointType_Coordinates();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.PolygonType <em>Polygon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polygon Type</em>'.
	 * @see com.google.earth.kml._2.PolygonType
	 * @generated
	 */
	EClass getPolygonType();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.PolygonType#isExtrude <em>Extrude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrude</em>'.
	 * @see com.google.earth.kml._2.PolygonType#isExtrude()
	 * @see #getPolygonType()
	 * @generated
	 */
	EAttribute getPolygonType_Extrude();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.PolygonType#isTessellate <em>Tessellate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tessellate</em>'.
	 * @see com.google.earth.kml._2.PolygonType#isTessellate()
	 * @see #getPolygonType()
	 * @generated
	 */
	EAttribute getPolygonType_Tessellate();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.PolygonType#getAltitudeMode <em>Altitude Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitude Mode</em>'.
	 * @see com.google.earth.kml._2.PolygonType#getAltitudeMode()
	 * @see #getPolygonType()
	 * @generated
	 */
	EAttribute getPolygonType_AltitudeMode();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.PolygonType#getOuterBoundaryIs <em>Outer Boundary Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outer Boundary Is</em>'.
	 * @see com.google.earth.kml._2.PolygonType#getOuterBoundaryIs()
	 * @see #getPolygonType()
	 * @generated
	 */
	EReference getPolygonType_OuterBoundaryIs();

	/**
	 * Returns the meta object for the containment reference list '{@link com.google.earth.kml._2.PolygonType#getInnerBoundaryIs <em>Inner Boundary Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inner Boundary Is</em>'.
	 * @see com.google.earth.kml._2.PolygonType#getInnerBoundaryIs()
	 * @see #getPolygonType()
	 * @generated
	 */
	EReference getPolygonType_InnerBoundaryIs();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.PolyStyleType <em>Poly Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Poly Style Type</em>'.
	 * @see com.google.earth.kml._2.PolyStyleType
	 * @generated
	 */
	EClass getPolyStyleType();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.PolyStyleType#isFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see com.google.earth.kml._2.PolyStyleType#isFill()
	 * @see #getPolyStyleType()
	 * @generated
	 */
	EAttribute getPolyStyleType_Fill();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.PolyStyleType#isOutline <em>Outline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outline</em>'.
	 * @see com.google.earth.kml._2.PolyStyleType#isOutline()
	 * @see #getPolyStyleType()
	 * @generated
	 */
	EAttribute getPolyStyleType_Outline();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.RegionType <em>Region Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region Type</em>'.
	 * @see com.google.earth.kml._2.RegionType
	 * @generated
	 */
	EClass getRegionType();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.RegionType#getLatLonAltBox <em>Lat Lon Alt Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lat Lon Alt Box</em>'.
	 * @see com.google.earth.kml._2.RegionType#getLatLonAltBox()
	 * @see #getRegionType()
	 * @generated
	 */
	EReference getRegionType_LatLonAltBox();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.RegionType#getLod <em>Lod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod</em>'.
	 * @see com.google.earth.kml._2.RegionType#getLod()
	 * @see #getRegionType()
	 * @generated
	 */
	EReference getRegionType_Lod();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.ReplaceType <em>Replace Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replace Type</em>'.
	 * @see com.google.earth.kml._2.ReplaceType
	 * @generated
	 */
	EClass getReplaceType();

	/**
	 * Returns the meta object for the attribute list '{@link com.google.earth.kml._2.ReplaceType#getFeatureGroup <em>Feature Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Feature Group</em>'.
	 * @see com.google.earth.kml._2.ReplaceType#getFeatureGroup()
	 * @see #getReplaceType()
	 * @generated
	 */
	EAttribute getReplaceType_FeatureGroup();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.ReplaceType#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature</em>'.
	 * @see com.google.earth.kml._2.ReplaceType#getFeature()
	 * @see #getReplaceType()
	 * @generated
	 */
	EReference getReplaceType_Feature();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.ScaleType <em>Scale Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scale Type</em>'.
	 * @see com.google.earth.kml._2.ScaleType
	 * @generated
	 */
	EClass getScaleType();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.ScaleType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see com.google.earth.kml._2.ScaleType#getX()
	 * @see #getScaleType()
	 * @generated
	 */
	EAttribute getScaleType_X();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.ScaleType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see com.google.earth.kml._2.ScaleType#getY()
	 * @see #getScaleType()
	 * @generated
	 */
	EAttribute getScaleType_Y();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.ScaleType#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see com.google.earth.kml._2.ScaleType#getZ()
	 * @see #getScaleType()
	 * @generated
	 */
	EAttribute getScaleType_Z();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.ScreenOverlayType <em>Screen Overlay Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screen Overlay Type</em>'.
	 * @see com.google.earth.kml._2.ScreenOverlayType
	 * @generated
	 */
	EClass getScreenOverlayType();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.ScreenOverlayType#getOverlayXY <em>Overlay XY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Overlay XY</em>'.
	 * @see com.google.earth.kml._2.ScreenOverlayType#getOverlayXY()
	 * @see #getScreenOverlayType()
	 * @generated
	 */
	EReference getScreenOverlayType_OverlayXY();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.ScreenOverlayType#getScreenXY <em>Screen XY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Screen XY</em>'.
	 * @see com.google.earth.kml._2.ScreenOverlayType#getScreenXY()
	 * @see #getScreenOverlayType()
	 * @generated
	 */
	EReference getScreenOverlayType_ScreenXY();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.ScreenOverlayType#getRotationXY <em>Rotation XY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rotation XY</em>'.
	 * @see com.google.earth.kml._2.ScreenOverlayType#getRotationXY()
	 * @see #getScreenOverlayType()
	 * @generated
	 */
	EReference getScreenOverlayType_RotationXY();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.ScreenOverlayType#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see com.google.earth.kml._2.ScreenOverlayType#getSize()
	 * @see #getScreenOverlayType()
	 * @generated
	 */
	EReference getScreenOverlayType_Size();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.ScreenOverlayType#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see com.google.earth.kml._2.ScreenOverlayType#getRotation()
	 * @see #getScreenOverlayType()
	 * @generated
	 */
	EAttribute getScreenOverlayType_Rotation();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.SnippetType <em>Snippet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Snippet Type</em>'.
	 * @see com.google.earth.kml._2.SnippetType
	 * @generated
	 */
	EClass getSnippetType();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.SnippetType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.google.earth.kml._2.SnippetType#getValue()
	 * @see #getSnippetType()
	 * @generated
	 */
	EAttribute getSnippetType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.SnippetType#getMaxLines <em>Max Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Lines</em>'.
	 * @see com.google.earth.kml._2.SnippetType#getMaxLines()
	 * @see #getSnippetType()
	 * @generated
	 */
	EAttribute getSnippetType_MaxLines();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.StyleMapPairType <em>Style Map Pair Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style Map Pair Type</em>'.
	 * @see com.google.earth.kml._2.StyleMapPairType
	 * @generated
	 */
	EClass getStyleMapPairType();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.StyleMapPairType#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see com.google.earth.kml._2.StyleMapPairType#getKey()
	 * @see #getStyleMapPairType()
	 * @generated
	 */
	EAttribute getStyleMapPairType_Key();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.StyleMapPairType#getStyleUrl <em>Style Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Url</em>'.
	 * @see com.google.earth.kml._2.StyleMapPairType#getStyleUrl()
	 * @see #getStyleMapPairType()
	 * @generated
	 */
	EAttribute getStyleMapPairType_StyleUrl();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.StyleMapType <em>Style Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style Map Type</em>'.
	 * @see com.google.earth.kml._2.StyleMapType
	 * @generated
	 */
	EClass getStyleMapType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.google.earth.kml._2.StyleMapType#getPair <em>Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pair</em>'.
	 * @see com.google.earth.kml._2.StyleMapType#getPair()
	 * @see #getStyleMapType()
	 * @generated
	 */
	EReference getStyleMapType_Pair();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.StyleSelectorType <em>Style Selector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style Selector Type</em>'.
	 * @see com.google.earth.kml._2.StyleSelectorType
	 * @generated
	 */
	EClass getStyleSelectorType();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.StyleType <em>Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style Type</em>'.
	 * @see com.google.earth.kml._2.StyleType
	 * @generated
	 */
	EClass getStyleType();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.StyleType#getIconStyle <em>Icon Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Icon Style</em>'.
	 * @see com.google.earth.kml._2.StyleType#getIconStyle()
	 * @see #getStyleType()
	 * @generated
	 */
	EReference getStyleType_IconStyle();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.StyleType#getLabelStyle <em>Label Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label Style</em>'.
	 * @see com.google.earth.kml._2.StyleType#getLabelStyle()
	 * @see #getStyleType()
	 * @generated
	 */
	EReference getStyleType_LabelStyle();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.StyleType#getLineStyle <em>Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line Style</em>'.
	 * @see com.google.earth.kml._2.StyleType#getLineStyle()
	 * @see #getStyleType()
	 * @generated
	 */
	EReference getStyleType_LineStyle();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.StyleType#getPolyStyle <em>Poly Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Poly Style</em>'.
	 * @see com.google.earth.kml._2.StyleType#getPolyStyle()
	 * @see #getStyleType()
	 * @generated
	 */
	EReference getStyleType_PolyStyle();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.StyleType#getBalloonStyle <em>Balloon Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Balloon Style</em>'.
	 * @see com.google.earth.kml._2.StyleType#getBalloonStyle()
	 * @see #getStyleType()
	 * @generated
	 */
	EReference getStyleType_BalloonStyle();

	/**
	 * Returns the meta object for the containment reference '{@link com.google.earth.kml._2.StyleType#getListStyle <em>List Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List Style</em>'.
	 * @see com.google.earth.kml._2.StyleType#getListStyle()
	 * @see #getStyleType()
	 * @generated
	 */
	EReference getStyleType_ListStyle();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.TimePrimitiveType <em>Time Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Primitive Type</em>'.
	 * @see com.google.earth.kml._2.TimePrimitiveType
	 * @generated
	 */
	EClass getTimePrimitiveType();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.TimeSpanType <em>Time Span Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Span Type</em>'.
	 * @see com.google.earth.kml._2.TimeSpanType
	 * @generated
	 */
	EClass getTimeSpanType();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.TimeSpanType#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin</em>'.
	 * @see com.google.earth.kml._2.TimeSpanType#getBegin()
	 * @see #getTimeSpanType()
	 * @generated
	 */
	EAttribute getTimeSpanType_Begin();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.TimeSpanType#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see com.google.earth.kml._2.TimeSpanType#getEnd()
	 * @see #getTimeSpanType()
	 * @generated
	 */
	EAttribute getTimeSpanType_End();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.TimeStampType <em>Time Stamp Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Stamp Type</em>'.
	 * @see com.google.earth.kml._2.TimeStampType
	 * @generated
	 */
	EClass getTimeStampType();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.TimeStampType#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When</em>'.
	 * @see com.google.earth.kml._2.TimeStampType#getWhen()
	 * @see #getTimeStampType()
	 * @generated
	 */
	EAttribute getTimeStampType_When();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.UpdateType <em>Update Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Type</em>'.
	 * @see com.google.earth.kml._2.UpdateType
	 * @generated
	 */
	EClass getUpdateType();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.UpdateType#getTargetHref <em>Target Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Href</em>'.
	 * @see com.google.earth.kml._2.UpdateType#getTargetHref()
	 * @see #getUpdateType()
	 * @generated
	 */
	EAttribute getUpdateType_TargetHref();

	/**
	 * Returns the meta object for the attribute list '{@link com.google.earth.kml._2.UpdateType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see com.google.earth.kml._2.UpdateType#getGroup()
	 * @see #getUpdateType()
	 * @generated
	 */
	EAttribute getUpdateType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link com.google.earth.kml._2.UpdateType#getCreate <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Create</em>'.
	 * @see com.google.earth.kml._2.UpdateType#getCreate()
	 * @see #getUpdateType()
	 * @generated
	 */
	EReference getUpdateType_Create();

	/**
	 * Returns the meta object for the containment reference list '{@link com.google.earth.kml._2.UpdateType#getDelete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delete</em>'.
	 * @see com.google.earth.kml._2.UpdateType#getDelete()
	 * @see #getUpdateType()
	 * @generated
	 */
	EReference getUpdateType_Delete();

	/**
	 * Returns the meta object for the containment reference list '{@link com.google.earth.kml._2.UpdateType#getChange <em>Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Change</em>'.
	 * @see com.google.earth.kml._2.UpdateType#getChange()
	 * @see #getUpdateType()
	 * @generated
	 */
	EReference getUpdateType_Change();

	/**
	 * Returns the meta object for the containment reference list '{@link com.google.earth.kml._2.UpdateType#getReplace <em>Replace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Replace</em>'.
	 * @see com.google.earth.kml._2.UpdateType#getReplace()
	 * @see #getUpdateType()
	 * @generated
	 */
	EReference getUpdateType_Replace();

	/**
	 * Returns the meta object for class '{@link com.google.earth.kml._2.Vec2Type <em>Vec2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vec2 Type</em>'.
	 * @see com.google.earth.kml._2.Vec2Type
	 * @generated
	 */
	EClass getVec2Type();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.Vec2Type#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see com.google.earth.kml._2.Vec2Type#getX()
	 * @see #getVec2Type()
	 * @generated
	 */
	EAttribute getVec2Type_X();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.Vec2Type#getXunits <em>Xunits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xunits</em>'.
	 * @see com.google.earth.kml._2.Vec2Type#getXunits()
	 * @see #getVec2Type()
	 * @generated
	 */
	EAttribute getVec2Type_Xunits();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.Vec2Type#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see com.google.earth.kml._2.Vec2Type#getY()
	 * @see #getVec2Type()
	 * @generated
	 */
	EAttribute getVec2Type_Y();

	/**
	 * Returns the meta object for the attribute '{@link com.google.earth.kml._2.Vec2Type#getYunits <em>Yunits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yunits</em>'.
	 * @see com.google.earth.kml._2.Vec2Type#getYunits()
	 * @see #getVec2Type()
	 * @generated
	 */
	EAttribute getVec2Type_Yunits();

	/**
	 * Returns the meta object for enum '{@link com.google.earth.kml._2.AltitudeModeEnum <em>Altitude Mode Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Altitude Mode Enum</em>'.
	 * @see com.google.earth.kml._2.AltitudeModeEnum
	 * @generated
	 */
	EEnum getAltitudeModeEnum();

	/**
	 * Returns the meta object for enum '{@link com.google.earth.kml._2.ColorModeEnum <em>Color Mode Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color Mode Enum</em>'.
	 * @see com.google.earth.kml._2.ColorModeEnum
	 * @generated
	 */
	EEnum getColorModeEnum();

	/**
	 * Returns the meta object for enum '{@link com.google.earth.kml._2.ItemIconStateEnum <em>Item Icon State Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Item Icon State Enum</em>'.
	 * @see com.google.earth.kml._2.ItemIconStateEnum
	 * @generated
	 */
	EEnum getItemIconStateEnum();

	/**
	 * Returns the meta object for enum '{@link com.google.earth.kml._2.ListItemTypeEnum <em>List Item Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>List Item Type Enum</em>'.
	 * @see com.google.earth.kml._2.ListItemTypeEnum
	 * @generated
	 */
	EEnum getListItemTypeEnum();

	/**
	 * Returns the meta object for enum '{@link com.google.earth.kml._2.RefreshModeEnum <em>Refresh Mode Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Refresh Mode Enum</em>'.
	 * @see com.google.earth.kml._2.RefreshModeEnum
	 * @generated
	 */
	EEnum getRefreshModeEnum();

	/**
	 * Returns the meta object for enum '{@link com.google.earth.kml._2.StyleStateEnum <em>Style State Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Style State Enum</em>'.
	 * @see com.google.earth.kml._2.StyleStateEnum
	 * @generated
	 */
	EEnum getStyleStateEnum();

	/**
	 * Returns the meta object for enum '{@link com.google.earth.kml._2.UnitsEnum <em>Units Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Units Enum</em>'.
	 * @see com.google.earth.kml._2.UnitsEnum
	 * @generated
	 */
	EEnum getUnitsEnum();

	/**
	 * Returns the meta object for enum '{@link com.google.earth.kml._2.ViewRefreshModeEnum <em>View Refresh Mode Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>View Refresh Mode Enum</em>'.
	 * @see com.google.earth.kml._2.ViewRefreshModeEnum
	 * @generated
	 */
	EEnum getViewRefreshModeEnum();

	/**
	 * Returns the meta object for data type '{@link com.google.earth.kml._2.AltitudeModeEnum <em>Altitude Mode Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Altitude Mode Enum Object</em>'.
	 * @see com.google.earth.kml._2.AltitudeModeEnum
	 * @model instanceClass="com.google.earth.kml._2.AltitudeModeEnum"
	 *        extendedMetaData="name='altitudeModeEnum:Object' baseType='altitudeModeEnum'"
	 * @generated
	 */
	EDataType getAltitudeModeEnumObject();

	/**
	 * Returns the meta object for data type '<em>Angle180</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Angle180</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='angle180' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='-180' maxInclusive='180'"
	 * @generated
	 */
	EDataType getAngle180();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Angle180 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Angle180 Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='angle180:Object' baseType='angle180'"
	 * @generated
	 */
	EDataType getAngle180Object();

	/**
	 * Returns the meta object for data type '<em>Angle360</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Angle360</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='angle360' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='-360' maxInclusive='360'"
	 * @generated
	 */
	EDataType getAngle360();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Angle360 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Angle360 Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='angle360:Object' baseType='angle360'"
	 * @generated
	 */
	EDataType getAngle360Object();

	/**
	 * Returns the meta object for data type '<em>Angle90</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Angle90</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='angle90' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='-90' maxInclusive='90.0'"
	 * @generated
	 */
	EDataType getAngle90();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Angle90 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Angle90 Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='angle90:Object' baseType='angle90'"
	 * @generated
	 */
	EDataType getAngle90Object();

	/**
	 * Returns the meta object for data type '<em>Anglepos90</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Anglepos90</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='anglepos90' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='0.0' maxInclusive='90.0'"
	 * @generated
	 */
	EDataType getAnglepos90();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Anglepos90 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Anglepos90 Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='anglepos90:Object' baseType='anglepos90'"
	 * @generated
	 */
	EDataType getAnglepos90Object();

	/**
	 * Returns the meta object for data type '<em>Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color</em>'.
	 * @model instanceClass="byte[]"
	 *        extendedMetaData="name='color' baseType='http://www.eclipse.org/emf/2003/XMLType#hexBinary' length='4'"
	 * @generated
	 */
	EDataType getColor();

	/**
	 * Returns the meta object for data type '{@link com.google.earth.kml._2.ColorModeEnum <em>Color Mode Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color Mode Enum Object</em>'.
	 * @see com.google.earth.kml._2.ColorModeEnum
	 * @model instanceClass="com.google.earth.kml._2.ColorModeEnum"
	 *        extendedMetaData="name='colorModeEnum:Object' baseType='colorModeEnum'"
	 * @generated
	 */
	EDataType getColorModeEnumObject();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Coordinates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Coordinates Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='CoordinatesType' itemType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getCoordinatesType();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Date Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date Time Type</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='dateTimeType' memberTypes='http://www.eclipse.org/emf/2003/XMLType#dateTime http://www.eclipse.org/emf/2003/XMLType#date http://www.eclipse.org/emf/2003/XMLType#gYearMonth http://www.eclipse.org/emf/2003/XMLType#gYear'"
	 * @generated
	 */
	EDataType getDateTimeType();

	/**
	 * Returns the meta object for data type '{@link com.google.earth.kml._2.ItemIconStateEnum <em>Item Icon State Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Item Icon State Enum Object</em>'.
	 * @see com.google.earth.kml._2.ItemIconStateEnum
	 * @model instanceClass="com.google.earth.kml._2.ItemIconStateEnum"
	 *        extendedMetaData="name='itemIconStateEnum:Object' baseType='itemIconStateEnum'"
	 * @generated
	 */
	EDataType getItemIconStateEnumObject();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Item Icon State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Item Icon State Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='itemIconStateType' itemType='itemIconStateEnum'"
	 * @generated
	 */
	EDataType getItemIconStateType();

	/**
	 * Returns the meta object for data type '{@link com.google.earth.kml._2.ListItemTypeEnum <em>List Item Type Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>List Item Type Enum Object</em>'.
	 * @see com.google.earth.kml._2.ListItemTypeEnum
	 * @model instanceClass="com.google.earth.kml._2.ListItemTypeEnum"
	 *        extendedMetaData="name='listItemTypeEnum:Object' baseType='listItemTypeEnum'"
	 * @generated
	 */
	EDataType getListItemTypeEnumObject();

	/**
	 * Returns the meta object for data type '{@link com.google.earth.kml._2.RefreshModeEnum <em>Refresh Mode Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Refresh Mode Enum Object</em>'.
	 * @see com.google.earth.kml._2.RefreshModeEnum
	 * @model instanceClass="com.google.earth.kml._2.RefreshModeEnum"
	 *        extendedMetaData="name='refreshModeEnum:Object' baseType='refreshModeEnum'"
	 * @generated
	 */
	EDataType getRefreshModeEnumObject();

	/**
	 * Returns the meta object for data type '{@link com.google.earth.kml._2.StyleStateEnum <em>Style State Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Style State Enum Object</em>'.
	 * @see com.google.earth.kml._2.StyleStateEnum
	 * @model instanceClass="com.google.earth.kml._2.StyleStateEnum"
	 *        extendedMetaData="name='styleStateEnum:Object' baseType='styleStateEnum'"
	 * @generated
	 */
	EDataType getStyleStateEnumObject();

	/**
	 * Returns the meta object for data type '{@link com.google.earth.kml._2.UnitsEnum <em>Units Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Units Enum Object</em>'.
	 * @see com.google.earth.kml._2.UnitsEnum
	 * @model instanceClass="com.google.earth.kml._2.UnitsEnum"
	 *        extendedMetaData="name='unitsEnum:Object' baseType='unitsEnum'"
	 * @generated
	 */
	EDataType getUnitsEnumObject();

	/**
	 * Returns the meta object for data type '{@link com.google.earth.kml._2.ViewRefreshModeEnum <em>View Refresh Mode Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>View Refresh Mode Enum Object</em>'.
	 * @see com.google.earth.kml._2.ViewRefreshModeEnum
	 * @model instanceClass="com.google.earth.kml._2.ViewRefreshModeEnum"
	 *        extendedMetaData="name='viewRefreshModeEnum:Object' baseType='viewRefreshModeEnum'"
	 * @generated
	 */
	EDataType getViewRefreshModeEnumObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	v21Factory getv21Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.BalloonStyleTypeImpl <em>Balloon Style Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.BalloonStyleTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getBalloonStyleType()
		 * @generated
		 */
		EClass BALLOON_STYLE_TYPE = eINSTANCE.getBalloonStyleType();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BALLOON_STYLE_TYPE__COLOR = eINSTANCE.getBalloonStyleType_Color();

		/**
		 * The meta object literal for the '<em><b>Bg Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BALLOON_STYLE_TYPE__BG_COLOR = eINSTANCE.getBalloonStyleType_BgColor();

		/**
		 * The meta object literal for the '<em><b>Text Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BALLOON_STYLE_TYPE__TEXT_COLOR = eINSTANCE.getBalloonStyleType_TextColor();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BALLOON_STYLE_TYPE__TEXT = eINSTANCE.getBalloonStyleType_Text();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.BoundaryTypeImpl <em>Boundary Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.BoundaryTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getBoundaryType()
		 * @generated
		 */
		EClass BOUNDARY_TYPE = eINSTANCE.getBoundaryType();

		/**
		 * The meta object literal for the '<em><b>Linear Ring</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUNDARY_TYPE__LINEAR_RING = eINSTANCE.getBoundaryType_LinearRing();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.ChangeTypeImpl <em>Change Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.ChangeTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getChangeType()
		 * @generated
		 */
		EClass CHANGE_TYPE = eINSTANCE.getChangeType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_TYPE__GROUP = eINSTANCE.getChangeType_Group();

		/**
		 * The meta object literal for the '<em><b>Object Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_TYPE__OBJECT_GROUP = eINSTANCE.getChangeType_ObjectGroup();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_TYPE__OBJECT = eINSTANCE.getChangeType_Object();

		/**
		 * The meta object literal for the '<em><b>Feature Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_TYPE__FEATURE_GROUP = eINSTANCE.getChangeType_FeatureGroup();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_TYPE__FEATURE = eINSTANCE.getChangeType_Feature();

		/**
		 * The meta object literal for the '<em><b>Geometry Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_TYPE__GEOMETRY_GROUP = eINSTANCE.getChangeType_GeometryGroup();

		/**
		 * The meta object literal for the '<em><b>Geometry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_TYPE__GEOMETRY = eINSTANCE.getChangeType_Geometry();

		/**
		 * The meta object literal for the '<em><b>Style Selector Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_TYPE__STYLE_SELECTOR_GROUP = eINSTANCE.getChangeType_StyleSelectorGroup();

		/**
		 * The meta object literal for the '<em><b>Style Selector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_TYPE__STYLE_SELECTOR = eINSTANCE.getChangeType_StyleSelector();

		/**
		 * The meta object literal for the '<em><b>Time Primitive Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_TYPE__TIME_PRIMITIVE_GROUP = eINSTANCE.getChangeType_TimePrimitiveGroup();

		/**
		 * The meta object literal for the '<em><b>Time Primitive</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_TYPE__TIME_PRIMITIVE = eINSTANCE.getChangeType_TimePrimitive();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.ColorStyleTypeImpl <em>Color Style Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.ColorStyleTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getColorStyleType()
		 * @generated
		 */
		EClass COLOR_STYLE_TYPE = eINSTANCE.getColorStyleType();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_STYLE_TYPE__COLOR = eINSTANCE.getColorStyleType_Color();

		/**
		 * The meta object literal for the '<em><b>Color Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_STYLE_TYPE__COLOR_MODE = eINSTANCE.getColorStyleType_ColorMode();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.ContainerTypeImpl <em>Container Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.ContainerTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getContainerType()
		 * @generated
		 */
		EClass CONTAINER_TYPE = eINSTANCE.getContainerType();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.CreateTypeImpl <em>Create Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.CreateTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getCreateType()
		 * @generated
		 */
		EClass CREATE_TYPE = eINSTANCE.getCreateType();

		/**
		 * The meta object literal for the '<em><b>Folder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_TYPE__FOLDER = eINSTANCE.getCreateType_Folder();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.DeleteTypeImpl <em>Delete Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.DeleteTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getDeleteType()
		 * @generated
		 */
		EClass DELETE_TYPE = eINSTANCE.getDeleteType();

		/**
		 * The meta object literal for the '<em><b>Feature Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_TYPE__FEATURE_GROUP = eINSTANCE.getDeleteType_FeatureGroup();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETE_TYPE__FEATURE = eINSTANCE.getDeleteType_Feature();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.DocumentRootImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Balloon Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BALLOON_STYLE = eINSTANCE.getDocumentRoot_BalloonStyle();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__OBJECT = eINSTANCE.getDocumentRoot_Object();

		/**
		 * The meta object literal for the '<em><b>Coordinates</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__COORDINATES = eINSTANCE.getDocumentRoot_Coordinates();

		/**
		 * The meta object literal for the '<em><b>Document</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DOCUMENT = eINSTANCE.getDocumentRoot_Document();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FEATURE = eINSTANCE.getDocumentRoot_Feature();

		/**
		 * The meta object literal for the '<em><b>Folder</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FOLDER = eINSTANCE.getDocumentRoot_Folder();

		/**
		 * The meta object literal for the '<em><b>Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GEOMETRY = eINSTANCE.getDocumentRoot_Geometry();

		/**
		 * The meta object literal for the '<em><b>Ground Overlay</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GROUND_OVERLAY = eINSTANCE.getDocumentRoot_GroundOverlay();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ICON = eINSTANCE.getDocumentRoot_Icon();

		/**
		 * The meta object literal for the '<em><b>Icon Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ICON_STYLE = eINSTANCE.getDocumentRoot_IconStyle();

		/**
		 * The meta object literal for the '<em><b>Kml</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__KML = eINSTANCE.getDocumentRoot_Kml();

		/**
		 * The meta object literal for the '<em><b>Label Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LABEL_STYLE = eINSTANCE.getDocumentRoot_LabelStyle();

		/**
		 * The meta object literal for the '<em><b>Lat Lon Alt Box</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LAT_LON_ALT_BOX = eINSTANCE.getDocumentRoot_LatLonAltBox();

		/**
		 * The meta object literal for the '<em><b>Lat Lon Box</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LAT_LON_BOX = eINSTANCE.getDocumentRoot_LatLonBox();

		/**
		 * The meta object literal for the '<em><b>Linear Ring</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LINEAR_RING = eINSTANCE.getDocumentRoot_LinearRing();

		/**
		 * The meta object literal for the '<em><b>Line String</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LINE_STRING = eINSTANCE.getDocumentRoot_LineString();

		/**
		 * The meta object literal for the '<em><b>Line Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LINE_STYLE = eINSTANCE.getDocumentRoot_LineStyle();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LINK = eINSTANCE.getDocumentRoot_Link();

		/**
		 * The meta object literal for the '<em><b>List Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LIST_STYLE = eINSTANCE.getDocumentRoot_ListStyle();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LOCATION = eINSTANCE.getDocumentRoot_Location();

		/**
		 * The meta object literal for the '<em><b>Lod</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LOD = eINSTANCE.getDocumentRoot_Lod();

		/**
		 * The meta object literal for the '<em><b>Look At</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LOOK_AT = eINSTANCE.getDocumentRoot_LookAt();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MODEL = eINSTANCE.getDocumentRoot_Model();

		/**
		 * The meta object literal for the '<em><b>Multi Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MULTI_GEOMETRY = eINSTANCE.getDocumentRoot_MultiGeometry();

		/**
		 * The meta object literal for the '<em><b>Network Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NETWORK_LINK = eINSTANCE.getDocumentRoot_NetworkLink();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ORIENTATION = eINSTANCE.getDocumentRoot_Orientation();

		/**
		 * The meta object literal for the '<em><b>Placemark</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PLACEMARK = eINSTANCE.getDocumentRoot_Placemark();

		/**
		 * The meta object literal for the '<em><b>Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__POINT = eINSTANCE.getDocumentRoot_Point();

		/**
		 * The meta object literal for the '<em><b>Polygon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__POLYGON = eINSTANCE.getDocumentRoot_Polygon();

		/**
		 * The meta object literal for the '<em><b>Poly Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__POLY_STYLE = eINSTANCE.getDocumentRoot_PolyStyle();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REGION = eINSTANCE.getDocumentRoot_Region();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SCALE = eINSTANCE.getDocumentRoot_Scale();

		/**
		 * The meta object literal for the '<em><b>Screen Overlay</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SCREEN_OVERLAY = eINSTANCE.getDocumentRoot_ScreenOverlay();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STYLE = eINSTANCE.getDocumentRoot_Style();

		/**
		 * The meta object literal for the '<em><b>Style Selector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STYLE_SELECTOR = eINSTANCE.getDocumentRoot_StyleSelector();

		/**
		 * The meta object literal for the '<em><b>Style Map</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STYLE_MAP = eINSTANCE.getDocumentRoot_StyleMap();

		/**
		 * The meta object literal for the '<em><b>Style Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__STYLE_URL = eINSTANCE.getDocumentRoot_StyleUrl();

		/**
		 * The meta object literal for the '<em><b>Time Primitive</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TIME_PRIMITIVE = eINSTANCE.getDocumentRoot_TimePrimitive();

		/**
		 * The meta object literal for the '<em><b>Time Span</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TIME_SPAN = eINSTANCE.getDocumentRoot_TimeSpan();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TIME_STAMP = eINSTANCE.getDocumentRoot_TimeStamp();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.DocumentTypeImpl <em>Document Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.DocumentTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getDocumentType()
		 * @generated
		 */
		EClass DOCUMENT_TYPE = eINSTANCE.getDocumentType();

		/**
		 * The meta object literal for the '<em><b>Feature Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_TYPE__FEATURE_GROUP = eINSTANCE.getDocumentType_FeatureGroup();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_TYPE__FEATURE = eINSTANCE.getDocumentType_Feature();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.FeatureTypeImpl <em>Feature Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.FeatureTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getFeatureType()
		 * @generated
		 */
		EClass FEATURE_TYPE = eINSTANCE.getFeatureType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_TYPE__NAME = eINSTANCE.getFeatureType_Name();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_TYPE__VISIBILITY = eINSTANCE.getFeatureType_Visibility();

		/**
		 * The meta object literal for the '<em><b>Open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_TYPE__OPEN = eINSTANCE.getFeatureType_Open();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_TYPE__ADDRESS = eINSTANCE.getFeatureType_Address();

		/**
		 * The meta object literal for the '<em><b>Phone Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_TYPE__PHONE_NUMBER = eINSTANCE.getFeatureType_PhoneNumber();

		/**
		 * The meta object literal for the '<em><b>Snippet</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_TYPE__SNIPPET = eINSTANCE.getFeatureType_Snippet();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_TYPE__DESCRIPTION = eINSTANCE.getFeatureType_Description();

		/**
		 * The meta object literal for the '<em><b>Look At</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_TYPE__LOOK_AT = eINSTANCE.getFeatureType_LookAt();

		/**
		 * The meta object literal for the '<em><b>Time Primitive Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_TYPE__TIME_PRIMITIVE_GROUP = eINSTANCE.getFeatureType_TimePrimitiveGroup();

		/**
		 * The meta object literal for the '<em><b>Time Primitive</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_TYPE__TIME_PRIMITIVE = eINSTANCE.getFeatureType_TimePrimitive();

		/**
		 * The meta object literal for the '<em><b>Style Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_TYPE__STYLE_URL = eINSTANCE.getFeatureType_StyleUrl();

		/**
		 * The meta object literal for the '<em><b>Style Selector Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_TYPE__STYLE_SELECTOR_GROUP = eINSTANCE.getFeatureType_StyleSelectorGroup();

		/**
		 * The meta object literal for the '<em><b>Style Selector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_TYPE__STYLE_SELECTOR = eINSTANCE.getFeatureType_StyleSelector();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_TYPE__REGION = eINSTANCE.getFeatureType_Region();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_TYPE__METADATA = eINSTANCE.getFeatureType_Metadata();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.FolderTypeImpl <em>Folder Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.FolderTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getFolderType()
		 * @generated
		 */
		EClass FOLDER_TYPE = eINSTANCE.getFolderType();

		/**
		 * The meta object literal for the '<em><b>Feature Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOLDER_TYPE__FEATURE_GROUP = eINSTANCE.getFolderType_FeatureGroup();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER_TYPE__FEATURE = eINSTANCE.getFolderType_Feature();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.GeometryTypeImpl <em>Geometry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.GeometryTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getGeometryType()
		 * @generated
		 */
		EClass GEOMETRY_TYPE = eINSTANCE.getGeometryType();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.GroundOverlayTypeImpl <em>Ground Overlay Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.GroundOverlayTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getGroundOverlayType()
		 * @generated
		 */
		EClass GROUND_OVERLAY_TYPE = eINSTANCE.getGroundOverlayType();

		/**
		 * The meta object literal for the '<em><b>Altitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUND_OVERLAY_TYPE__ALTITUDE = eINSTANCE.getGroundOverlayType_Altitude();

		/**
		 * The meta object literal for the '<em><b>Altitude Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUND_OVERLAY_TYPE__ALTITUDE_MODE = eINSTANCE.getGroundOverlayType_AltitudeMode();

		/**
		 * The meta object literal for the '<em><b>Lat Lon Box</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUND_OVERLAY_TYPE__LAT_LON_BOX = eINSTANCE.getGroundOverlayType_LatLonBox();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.IconStyleIconTypeImpl <em>Icon Style Icon Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.IconStyleIconTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getIconStyleIconType()
		 * @generated
		 */
		EClass ICON_STYLE_ICON_TYPE = eINSTANCE.getIconStyleIconType();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON_STYLE_ICON_TYPE__HREF = eINSTANCE.getIconStyleIconType_Href();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.IconStyleTypeImpl <em>Icon Style Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.IconStyleTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getIconStyleType()
		 * @generated
		 */
		EClass ICON_STYLE_TYPE = eINSTANCE.getIconStyleType();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON_STYLE_TYPE__SCALE = eINSTANCE.getIconStyleType_Scale();

		/**
		 * The meta object literal for the '<em><b>Heading</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON_STYLE_TYPE__HEADING = eINSTANCE.getIconStyleType_Heading();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICON_STYLE_TYPE__ICON = eINSTANCE.getIconStyleType_Icon();

		/**
		 * The meta object literal for the '<em><b>Hot Spot</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICON_STYLE_TYPE__HOT_SPOT = eINSTANCE.getIconStyleType_HotSpot();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.IconTypeImpl <em>Icon Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.IconTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getIconType()
		 * @generated
		 */
		EClass ICON_TYPE = eINSTANCE.getIconType();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON_TYPE__X = eINSTANCE.getIconType_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON_TYPE__Y = eINSTANCE.getIconType_Y();

		/**
		 * The meta object literal for the '<em><b>W</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON_TYPE__W = eINSTANCE.getIconType_W();

		/**
		 * The meta object literal for the '<em><b>H</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON_TYPE__H = eINSTANCE.getIconType_H();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.ItemIconTypeImpl <em>Item Icon Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.ItemIconTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getItemIconType()
		 * @generated
		 */
		EClass ITEM_ICON_TYPE = eINSTANCE.getItemIconType();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_ICON_TYPE__STATE = eINSTANCE.getItemIconType_State();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_ICON_TYPE__HREF = eINSTANCE.getItemIconType_Href();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.KmlTypeImpl <em>Kml Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.KmlTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getKmlType()
		 * @generated
		 */
		EClass KML_TYPE = eINSTANCE.getKmlType();

		/**
		 * The meta object literal for the '<em><b>Network Link Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KML_TYPE__NETWORK_LINK_CONTROL = eINSTANCE.getKmlType_NetworkLinkControl();

		/**
		 * The meta object literal for the '<em><b>Feature Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KML_TYPE__FEATURE_GROUP = eINSTANCE.getKmlType_FeatureGroup();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KML_TYPE__FEATURE = eINSTANCE.getKmlType_Feature();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.LabelStyleTypeImpl <em>Label Style Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.LabelStyleTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getLabelStyleType()
		 * @generated
		 */
		EClass LABEL_STYLE_TYPE = eINSTANCE.getLabelStyleType();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_STYLE_TYPE__SCALE = eINSTANCE.getLabelStyleType_Scale();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.LatLonAltBoxTypeImpl <em>Lat Lon Alt Box Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.LatLonAltBoxTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getLatLonAltBoxType()
		 * @generated
		 */
		EClass LAT_LON_ALT_BOX_TYPE = eINSTANCE.getLatLonAltBoxType();

		/**
		 * The meta object literal for the '<em><b>Min Altitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAT_LON_ALT_BOX_TYPE__MIN_ALTITUDE = eINSTANCE.getLatLonAltBoxType_MinAltitude();

		/**
		 * The meta object literal for the '<em><b>Max Altitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAT_LON_ALT_BOX_TYPE__MAX_ALTITUDE = eINSTANCE.getLatLonAltBoxType_MaxAltitude();

		/**
		 * The meta object literal for the '<em><b>Altitude Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAT_LON_ALT_BOX_TYPE__ALTITUDE_MODE = eINSTANCE.getLatLonAltBoxType_AltitudeMode();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.LatLonBoxTypeImpl <em>Lat Lon Box Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.LatLonBoxTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getLatLonBoxType()
		 * @generated
		 */
		EClass LAT_LON_BOX_TYPE = eINSTANCE.getLatLonBoxType();

		/**
		 * The meta object literal for the '<em><b>North</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAT_LON_BOX_TYPE__NORTH = eINSTANCE.getLatLonBoxType_North();

		/**
		 * The meta object literal for the '<em><b>South</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAT_LON_BOX_TYPE__SOUTH = eINSTANCE.getLatLonBoxType_South();

		/**
		 * The meta object literal for the '<em><b>East</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAT_LON_BOX_TYPE__EAST = eINSTANCE.getLatLonBoxType_East();

		/**
		 * The meta object literal for the '<em><b>West</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAT_LON_BOX_TYPE__WEST = eINSTANCE.getLatLonBoxType_West();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAT_LON_BOX_TYPE__ROTATION = eINSTANCE.getLatLonBoxType_Rotation();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.LinearRingTypeImpl <em>Linear Ring Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.LinearRingTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getLinearRingType()
		 * @generated
		 */
		EClass LINEAR_RING_TYPE = eINSTANCE.getLinearRingType();

		/**
		 * The meta object literal for the '<em><b>Extrude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_RING_TYPE__EXTRUDE = eINSTANCE.getLinearRingType_Extrude();

		/**
		 * The meta object literal for the '<em><b>Tessellate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_RING_TYPE__TESSELLATE = eINSTANCE.getLinearRingType_Tessellate();

		/**
		 * The meta object literal for the '<em><b>Altitude Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_RING_TYPE__ALTITUDE_MODE = eINSTANCE.getLinearRingType_AltitudeMode();

		/**
		 * The meta object literal for the '<em><b>Coordinates</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINEAR_RING_TYPE__COORDINATES = eINSTANCE.getLinearRingType_Coordinates();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.LineStringTypeImpl <em>Line String Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.LineStringTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getLineStringType()
		 * @generated
		 */
		EClass LINE_STRING_TYPE = eINSTANCE.getLineStringType();

		/**
		 * The meta object literal for the '<em><b>Extrude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_STRING_TYPE__EXTRUDE = eINSTANCE.getLineStringType_Extrude();

		/**
		 * The meta object literal for the '<em><b>Tessellate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_STRING_TYPE__TESSELLATE = eINSTANCE.getLineStringType_Tessellate();

		/**
		 * The meta object literal for the '<em><b>Altitude Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_STRING_TYPE__ALTITUDE_MODE = eINSTANCE.getLineStringType_AltitudeMode();

		/**
		 * The meta object literal for the '<em><b>Coordinates</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_STRING_TYPE__COORDINATES = eINSTANCE.getLineStringType_Coordinates();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.LineStyleTypeImpl <em>Line Style Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.LineStyleTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getLineStyleType()
		 * @generated
		 */
		EClass LINE_STYLE_TYPE = eINSTANCE.getLineStyleType();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_STYLE_TYPE__WIDTH = eINSTANCE.getLineStyleType_Width();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.LinkTypeImpl <em>Link Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.LinkTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getLinkType()
		 * @generated
		 */
		EClass LINK_TYPE = eINSTANCE.getLinkType();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TYPE__HREF = eINSTANCE.getLinkType_Href();

		/**
		 * The meta object literal for the '<em><b>Refresh Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TYPE__REFRESH_MODE = eINSTANCE.getLinkType_RefreshMode();

		/**
		 * The meta object literal for the '<em><b>Refresh Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TYPE__REFRESH_INTERVAL = eINSTANCE.getLinkType_RefreshInterval();

		/**
		 * The meta object literal for the '<em><b>View Refresh Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TYPE__VIEW_REFRESH_MODE = eINSTANCE.getLinkType_ViewRefreshMode();

		/**
		 * The meta object literal for the '<em><b>View Refresh Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TYPE__VIEW_REFRESH_TIME = eINSTANCE.getLinkType_ViewRefreshTime();

		/**
		 * The meta object literal for the '<em><b>View Bound Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TYPE__VIEW_BOUND_SCALE = eINSTANCE.getLinkType_ViewBoundScale();

		/**
		 * The meta object literal for the '<em><b>View Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TYPE__VIEW_FORMAT = eINSTANCE.getLinkType_ViewFormat();

		/**
		 * The meta object literal for the '<em><b>Http Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TYPE__HTTP_QUERY = eINSTANCE.getLinkType_HttpQuery();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.ListStyleTypeImpl <em>List Style Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.ListStyleTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getListStyleType()
		 * @generated
		 */
		EClass LIST_STYLE_TYPE = eINSTANCE.getListStyleType();

		/**
		 * The meta object literal for the '<em><b>List Item Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_STYLE_TYPE__LIST_ITEM_TYPE = eINSTANCE.getListStyleType_ListItemType();

		/**
		 * The meta object literal for the '<em><b>Bg Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_STYLE_TYPE__BG_COLOR = eINSTANCE.getListStyleType_BgColor();

		/**
		 * The meta object literal for the '<em><b>Item Icon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_STYLE_TYPE__ITEM_ICON = eINSTANCE.getListStyleType_ItemIcon();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.LocationTypeImpl <em>Location Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.LocationTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getLocationType()
		 * @generated
		 */
		EClass LOCATION_TYPE = eINSTANCE.getLocationType();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_TYPE__LONGITUDE = eINSTANCE.getLocationType_Longitude();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_TYPE__LATITUDE = eINSTANCE.getLocationType_Latitude();

		/**
		 * The meta object literal for the '<em><b>Altitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_TYPE__ALTITUDE = eINSTANCE.getLocationType_Altitude();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.LodTypeImpl <em>Lod Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.LodTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getLodType()
		 * @generated
		 */
		EClass LOD_TYPE = eINSTANCE.getLodType();

		/**
		 * The meta object literal for the '<em><b>Min Lod Pixels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOD_TYPE__MIN_LOD_PIXELS = eINSTANCE.getLodType_MinLodPixels();

		/**
		 * The meta object literal for the '<em><b>Max Lod Pixels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOD_TYPE__MAX_LOD_PIXELS = eINSTANCE.getLodType_MaxLodPixels();

		/**
		 * The meta object literal for the '<em><b>Min Fade Extent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOD_TYPE__MIN_FADE_EXTENT = eINSTANCE.getLodType_MinFadeExtent();

		/**
		 * The meta object literal for the '<em><b>Max Fade Extent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOD_TYPE__MAX_FADE_EXTENT = eINSTANCE.getLodType_MaxFadeExtent();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.LookAtTypeImpl <em>Look At Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.LookAtTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getLookAtType()
		 * @generated
		 */
		EClass LOOK_AT_TYPE = eINSTANCE.getLookAtType();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOK_AT_TYPE__LONGITUDE = eINSTANCE.getLookAtType_Longitude();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOK_AT_TYPE__LATITUDE = eINSTANCE.getLookAtType_Latitude();

		/**
		 * The meta object literal for the '<em><b>Altitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOK_AT_TYPE__ALTITUDE = eINSTANCE.getLookAtType_Altitude();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOK_AT_TYPE__RANGE = eINSTANCE.getLookAtType_Range();

		/**
		 * The meta object literal for the '<em><b>Tilt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOK_AT_TYPE__TILT = eINSTANCE.getLookAtType_Tilt();

		/**
		 * The meta object literal for the '<em><b>Heading</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOK_AT_TYPE__HEADING = eINSTANCE.getLookAtType_Heading();

		/**
		 * The meta object literal for the '<em><b>Altitude Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOK_AT_TYPE__ALTITUDE_MODE = eINSTANCE.getLookAtType_AltitudeMode();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.MetadataTypeImpl <em>Metadata Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.MetadataTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getMetadataType()
		 * @generated
		 */
		EClass METADATA_TYPE = eINSTANCE.getMetadataType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_TYPE__ANY = eINSTANCE.getMetadataType_Any();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.ModelTypeImpl <em>Model Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.ModelTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getModelType()
		 * @generated
		 */
		EClass MODEL_TYPE = eINSTANCE.getModelType();

		/**
		 * The meta object literal for the '<em><b>Altitude Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_TYPE__ALTITUDE_MODE = eINSTANCE.getModelType_AltitudeMode();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__LOCATION = eINSTANCE.getModelType_Location();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__ORIENTATION = eINSTANCE.getModelType_Orientation();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__SCALE = eINSTANCE.getModelType_Scale();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TYPE__LINK = eINSTANCE.getModelType_Link();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.MultiGeometryTypeImpl <em>Multi Geometry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.MultiGeometryTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getMultiGeometryType()
		 * @generated
		 */
		EClass MULTI_GEOMETRY_TYPE = eINSTANCE.getMultiGeometryType();

		/**
		 * The meta object literal for the '<em><b>Geometry Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_GEOMETRY_TYPE__GEOMETRY_GROUP = eINSTANCE.getMultiGeometryType_GeometryGroup();

		/**
		 * The meta object literal for the '<em><b>Geometry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_GEOMETRY_TYPE__GEOMETRY = eINSTANCE.getMultiGeometryType_Geometry();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.NetworkLinkControlTypeImpl <em>Network Link Control Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.NetworkLinkControlTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getNetworkLinkControlType()
		 * @generated
		 */
		EClass NETWORK_LINK_CONTROL_TYPE = eINSTANCE.getNetworkLinkControlType();

		/**
		 * The meta object literal for the '<em><b>Min Refresh Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_LINK_CONTROL_TYPE__MIN_REFRESH_PERIOD = eINSTANCE.getNetworkLinkControlType_MinRefreshPeriod();

		/**
		 * The meta object literal for the '<em><b>Cookie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_LINK_CONTROL_TYPE__COOKIE = eINSTANCE.getNetworkLinkControlType_Cookie();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_LINK_CONTROL_TYPE__MESSAGE = eINSTANCE.getNetworkLinkControlType_Message();

		/**
		 * The meta object literal for the '<em><b>Link Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_LINK_CONTROL_TYPE__LINK_NAME = eINSTANCE.getNetworkLinkControlType_LinkName();

		/**
		 * The meta object literal for the '<em><b>Link Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_LINK_CONTROL_TYPE__LINK_DESCRIPTION = eINSTANCE.getNetworkLinkControlType_LinkDescription();

		/**
		 * The meta object literal for the '<em><b>Link Snippet</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_LINK_CONTROL_TYPE__LINK_SNIPPET = eINSTANCE.getNetworkLinkControlType_LinkSnippet();

		/**
		 * The meta object literal for the '<em><b>Expires</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_LINK_CONTROL_TYPE__EXPIRES = eINSTANCE.getNetworkLinkControlType_Expires();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_LINK_CONTROL_TYPE__UPDATE = eINSTANCE.getNetworkLinkControlType_Update();

		/**
		 * The meta object literal for the '<em><b>Look At</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_LINK_CONTROL_TYPE__LOOK_AT = eINSTANCE.getNetworkLinkControlType_LookAt();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.NetworkLinkTypeImpl <em>Network Link Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.NetworkLinkTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getNetworkLinkType()
		 * @generated
		 */
		EClass NETWORK_LINK_TYPE = eINSTANCE.getNetworkLinkType();

		/**
		 * The meta object literal for the '<em><b>Refresh Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_LINK_TYPE__REFRESH_VISIBILITY = eINSTANCE.getNetworkLinkType_RefreshVisibility();

		/**
		 * The meta object literal for the '<em><b>Fly To View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_LINK_TYPE__FLY_TO_VIEW = eINSTANCE.getNetworkLinkType_FlyToView();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_LINK_TYPE__LINK = eINSTANCE.getNetworkLinkType_Link();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_LINK_TYPE__URL = eINSTANCE.getNetworkLinkType_Url();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.ObjectTypeImpl <em>Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.ObjectTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getObjectType()
		 * @generated
		 */
		EClass OBJECT_TYPE = eINSTANCE.getObjectType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE__ID = eINSTANCE.getObjectType_Id();

		/**
		 * The meta object literal for the '<em><b>Target Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE__TARGET_ID = eINSTANCE.getObjectType_TargetId();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.OrientationTypeImpl <em>Orientation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.OrientationTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getOrientationType()
		 * @generated
		 */
		EClass ORIENTATION_TYPE = eINSTANCE.getOrientationType();

		/**
		 * The meta object literal for the '<em><b>Heading</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORIENTATION_TYPE__HEADING = eINSTANCE.getOrientationType_Heading();

		/**
		 * The meta object literal for the '<em><b>Tilt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORIENTATION_TYPE__TILT = eINSTANCE.getOrientationType_Tilt();

		/**
		 * The meta object literal for the '<em><b>Roll</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORIENTATION_TYPE__ROLL = eINSTANCE.getOrientationType_Roll();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.OverlayTypeImpl <em>Overlay Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.OverlayTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getOverlayType()
		 * @generated
		 */
		EClass OVERLAY_TYPE = eINSTANCE.getOverlayType();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERLAY_TYPE__COLOR = eINSTANCE.getOverlayType_Color();

		/**
		 * The meta object literal for the '<em><b>Draw Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OVERLAY_TYPE__DRAW_ORDER = eINSTANCE.getOverlayType_DrawOrder();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OVERLAY_TYPE__ICON = eINSTANCE.getOverlayType_Icon();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.PlacemarkTypeImpl <em>Placemark Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.PlacemarkTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getPlacemarkType()
		 * @generated
		 */
		EClass PLACEMARK_TYPE = eINSTANCE.getPlacemarkType();

		/**
		 * The meta object literal for the '<em><b>Geometry Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACEMARK_TYPE__GEOMETRY_GROUP = eINSTANCE.getPlacemarkType_GeometryGroup();

		/**
		 * The meta object literal for the '<em><b>Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACEMARK_TYPE__GEOMETRY = eINSTANCE.getPlacemarkType_Geometry();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.PointTypeImpl <em>Point Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.PointTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getPointType()
		 * @generated
		 */
		EClass POINT_TYPE = eINSTANCE.getPointType();

		/**
		 * The meta object literal for the '<em><b>Extrude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT_TYPE__EXTRUDE = eINSTANCE.getPointType_Extrude();

		/**
		 * The meta object literal for the '<em><b>Tessellate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT_TYPE__TESSELLATE = eINSTANCE.getPointType_Tessellate();

		/**
		 * The meta object literal for the '<em><b>Altitude Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT_TYPE__ALTITUDE_MODE = eINSTANCE.getPointType_AltitudeMode();

		/**
		 * The meta object literal for the '<em><b>Coordinates</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT_TYPE__COORDINATES = eINSTANCE.getPointType_Coordinates();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.PolygonTypeImpl <em>Polygon Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.PolygonTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getPolygonType()
		 * @generated
		 */
		EClass POLYGON_TYPE = eINSTANCE.getPolygonType();

		/**
		 * The meta object literal for the '<em><b>Extrude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLYGON_TYPE__EXTRUDE = eINSTANCE.getPolygonType_Extrude();

		/**
		 * The meta object literal for the '<em><b>Tessellate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLYGON_TYPE__TESSELLATE = eINSTANCE.getPolygonType_Tessellate();

		/**
		 * The meta object literal for the '<em><b>Altitude Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLYGON_TYPE__ALTITUDE_MODE = eINSTANCE.getPolygonType_AltitudeMode();

		/**
		 * The meta object literal for the '<em><b>Outer Boundary Is</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLYGON_TYPE__OUTER_BOUNDARY_IS = eINSTANCE.getPolygonType_OuterBoundaryIs();

		/**
		 * The meta object literal for the '<em><b>Inner Boundary Is</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLYGON_TYPE__INNER_BOUNDARY_IS = eINSTANCE.getPolygonType_InnerBoundaryIs();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.PolyStyleTypeImpl <em>Poly Style Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.PolyStyleTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getPolyStyleType()
		 * @generated
		 */
		EClass POLY_STYLE_TYPE = eINSTANCE.getPolyStyleType();

		/**
		 * The meta object literal for the '<em><b>Fill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLY_STYLE_TYPE__FILL = eINSTANCE.getPolyStyleType_Fill();

		/**
		 * The meta object literal for the '<em><b>Outline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLY_STYLE_TYPE__OUTLINE = eINSTANCE.getPolyStyleType_Outline();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.RegionTypeImpl <em>Region Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.RegionTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getRegionType()
		 * @generated
		 */
		EClass REGION_TYPE = eINSTANCE.getRegionType();

		/**
		 * The meta object literal for the '<em><b>Lat Lon Alt Box</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION_TYPE__LAT_LON_ALT_BOX = eINSTANCE.getRegionType_LatLonAltBox();

		/**
		 * The meta object literal for the '<em><b>Lod</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION_TYPE__LOD = eINSTANCE.getRegionType_Lod();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.ReplaceTypeImpl <em>Replace Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.ReplaceTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getReplaceType()
		 * @generated
		 */
		EClass REPLACE_TYPE = eINSTANCE.getReplaceType();

		/**
		 * The meta object literal for the '<em><b>Feature Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLACE_TYPE__FEATURE_GROUP = eINSTANCE.getReplaceType_FeatureGroup();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLACE_TYPE__FEATURE = eINSTANCE.getReplaceType_Feature();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.ScaleTypeImpl <em>Scale Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.ScaleTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getScaleType()
		 * @generated
		 */
		EClass SCALE_TYPE = eINSTANCE.getScaleType();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALE_TYPE__X = eINSTANCE.getScaleType_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALE_TYPE__Y = eINSTANCE.getScaleType_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALE_TYPE__Z = eINSTANCE.getScaleType_Z();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.ScreenOverlayTypeImpl <em>Screen Overlay Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.ScreenOverlayTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getScreenOverlayType()
		 * @generated
		 */
		EClass SCREEN_OVERLAY_TYPE = eINSTANCE.getScreenOverlayType();

		/**
		 * The meta object literal for the '<em><b>Overlay XY</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCREEN_OVERLAY_TYPE__OVERLAY_XY = eINSTANCE.getScreenOverlayType_OverlayXY();

		/**
		 * The meta object literal for the '<em><b>Screen XY</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCREEN_OVERLAY_TYPE__SCREEN_XY = eINSTANCE.getScreenOverlayType_ScreenXY();

		/**
		 * The meta object literal for the '<em><b>Rotation XY</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCREEN_OVERLAY_TYPE__ROTATION_XY = eINSTANCE.getScreenOverlayType_RotationXY();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCREEN_OVERLAY_TYPE__SIZE = eINSTANCE.getScreenOverlayType_Size();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCREEN_OVERLAY_TYPE__ROTATION = eINSTANCE.getScreenOverlayType_Rotation();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.SnippetTypeImpl <em>Snippet Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.SnippetTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getSnippetType()
		 * @generated
		 */
		EClass SNIPPET_TYPE = eINSTANCE.getSnippetType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SNIPPET_TYPE__VALUE = eINSTANCE.getSnippetType_Value();

		/**
		 * The meta object literal for the '<em><b>Max Lines</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SNIPPET_TYPE__MAX_LINES = eINSTANCE.getSnippetType_MaxLines();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.StyleMapPairTypeImpl <em>Style Map Pair Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.StyleMapPairTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getStyleMapPairType()
		 * @generated
		 */
		EClass STYLE_MAP_PAIR_TYPE = eINSTANCE.getStyleMapPairType();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_MAP_PAIR_TYPE__KEY = eINSTANCE.getStyleMapPairType_Key();

		/**
		 * The meta object literal for the '<em><b>Style Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_MAP_PAIR_TYPE__STYLE_URL = eINSTANCE.getStyleMapPairType_StyleUrl();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.StyleMapTypeImpl <em>Style Map Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.StyleMapTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getStyleMapType()
		 * @generated
		 */
		EClass STYLE_MAP_TYPE = eINSTANCE.getStyleMapType();

		/**
		 * The meta object literal for the '<em><b>Pair</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_MAP_TYPE__PAIR = eINSTANCE.getStyleMapType_Pair();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.StyleSelectorTypeImpl <em>Style Selector Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.StyleSelectorTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getStyleSelectorType()
		 * @generated
		 */
		EClass STYLE_SELECTOR_TYPE = eINSTANCE.getStyleSelectorType();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.StyleTypeImpl <em>Style Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.StyleTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getStyleType()
		 * @generated
		 */
		EClass STYLE_TYPE = eINSTANCE.getStyleType();

		/**
		 * The meta object literal for the '<em><b>Icon Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_TYPE__ICON_STYLE = eINSTANCE.getStyleType_IconStyle();

		/**
		 * The meta object literal for the '<em><b>Label Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_TYPE__LABEL_STYLE = eINSTANCE.getStyleType_LabelStyle();

		/**
		 * The meta object literal for the '<em><b>Line Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_TYPE__LINE_STYLE = eINSTANCE.getStyleType_LineStyle();

		/**
		 * The meta object literal for the '<em><b>Poly Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_TYPE__POLY_STYLE = eINSTANCE.getStyleType_PolyStyle();

		/**
		 * The meta object literal for the '<em><b>Balloon Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_TYPE__BALLOON_STYLE = eINSTANCE.getStyleType_BalloonStyle();

		/**
		 * The meta object literal for the '<em><b>List Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_TYPE__LIST_STYLE = eINSTANCE.getStyleType_ListStyle();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.TimePrimitiveTypeImpl <em>Time Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.TimePrimitiveTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getTimePrimitiveType()
		 * @generated
		 */
		EClass TIME_PRIMITIVE_TYPE = eINSTANCE.getTimePrimitiveType();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.TimeSpanTypeImpl <em>Time Span Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.TimeSpanTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getTimeSpanType()
		 * @generated
		 */
		EClass TIME_SPAN_TYPE = eINSTANCE.getTimeSpanType();

		/**
		 * The meta object literal for the '<em><b>Begin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SPAN_TYPE__BEGIN = eINSTANCE.getTimeSpanType_Begin();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SPAN_TYPE__END = eINSTANCE.getTimeSpanType_End();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.TimeStampTypeImpl <em>Time Stamp Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.TimeStampTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getTimeStampType()
		 * @generated
		 */
		EClass TIME_STAMP_TYPE = eINSTANCE.getTimeStampType();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_STAMP_TYPE__WHEN = eINSTANCE.getTimeStampType_When();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.UpdateTypeImpl <em>Update Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.UpdateTypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getUpdateType()
		 * @generated
		 */
		EClass UPDATE_TYPE = eINSTANCE.getUpdateType();

		/**
		 * The meta object literal for the '<em><b>Target Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_TYPE__TARGET_HREF = eINSTANCE.getUpdateType_TargetHref();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_TYPE__GROUP = eINSTANCE.getUpdateType_Group();

		/**
		 * The meta object literal for the '<em><b>Create</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_TYPE__CREATE = eINSTANCE.getUpdateType_Create();

		/**
		 * The meta object literal for the '<em><b>Delete</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_TYPE__DELETE = eINSTANCE.getUpdateType_Delete();

		/**
		 * The meta object literal for the '<em><b>Change</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_TYPE__CHANGE = eINSTANCE.getUpdateType_Change();

		/**
		 * The meta object literal for the '<em><b>Replace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_TYPE__REPLACE = eINSTANCE.getUpdateType_Replace();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.impl.Vec2TypeImpl <em>Vec2 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.Vec2TypeImpl
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getVec2Type()
		 * @generated
		 */
		EClass VEC2_TYPE = eINSTANCE.getVec2Type();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEC2_TYPE__X = eINSTANCE.getVec2Type_X();

		/**
		 * The meta object literal for the '<em><b>Xunits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEC2_TYPE__XUNITS = eINSTANCE.getVec2Type_Xunits();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEC2_TYPE__Y = eINSTANCE.getVec2Type_Y();

		/**
		 * The meta object literal for the '<em><b>Yunits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEC2_TYPE__YUNITS = eINSTANCE.getVec2Type_Yunits();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.AltitudeModeEnum <em>Altitude Mode Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.AltitudeModeEnum
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getAltitudeModeEnum()
		 * @generated
		 */
		EEnum ALTITUDE_MODE_ENUM = eINSTANCE.getAltitudeModeEnum();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.ColorModeEnum <em>Color Mode Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.ColorModeEnum
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getColorModeEnum()
		 * @generated
		 */
		EEnum COLOR_MODE_ENUM = eINSTANCE.getColorModeEnum();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.ItemIconStateEnum <em>Item Icon State Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.ItemIconStateEnum
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getItemIconStateEnum()
		 * @generated
		 */
		EEnum ITEM_ICON_STATE_ENUM = eINSTANCE.getItemIconStateEnum();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.ListItemTypeEnum <em>List Item Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.ListItemTypeEnum
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getListItemTypeEnum()
		 * @generated
		 */
		EEnum LIST_ITEM_TYPE_ENUM = eINSTANCE.getListItemTypeEnum();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.RefreshModeEnum <em>Refresh Mode Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.RefreshModeEnum
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getRefreshModeEnum()
		 * @generated
		 */
		EEnum REFRESH_MODE_ENUM = eINSTANCE.getRefreshModeEnum();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.StyleStateEnum <em>Style State Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.StyleStateEnum
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getStyleStateEnum()
		 * @generated
		 */
		EEnum STYLE_STATE_ENUM = eINSTANCE.getStyleStateEnum();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.UnitsEnum <em>Units Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.UnitsEnum
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getUnitsEnum()
		 * @generated
		 */
		EEnum UNITS_ENUM = eINSTANCE.getUnitsEnum();

		/**
		 * The meta object literal for the '{@link com.google.earth.kml._2.ViewRefreshModeEnum <em>View Refresh Mode Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.ViewRefreshModeEnum
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getViewRefreshModeEnum()
		 * @generated
		 */
		EEnum VIEW_REFRESH_MODE_ENUM = eINSTANCE.getViewRefreshModeEnum();

		/**
		 * The meta object literal for the '<em>Altitude Mode Enum Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.AltitudeModeEnum
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getAltitudeModeEnumObject()
		 * @generated
		 */
		EDataType ALTITUDE_MODE_ENUM_OBJECT = eINSTANCE.getAltitudeModeEnumObject();

		/**
		 * The meta object literal for the '<em>Angle180</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getAngle180()
		 * @generated
		 */
		EDataType ANGLE180 = eINSTANCE.getAngle180();

		/**
		 * The meta object literal for the '<em>Angle180 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getAngle180Object()
		 * @generated
		 */
		EDataType ANGLE180_OBJECT = eINSTANCE.getAngle180Object();

		/**
		 * The meta object literal for the '<em>Angle360</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getAngle360()
		 * @generated
		 */
		EDataType ANGLE360 = eINSTANCE.getAngle360();

		/**
		 * The meta object literal for the '<em>Angle360 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getAngle360Object()
		 * @generated
		 */
		EDataType ANGLE360_OBJECT = eINSTANCE.getAngle360Object();

		/**
		 * The meta object literal for the '<em>Angle90</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getAngle90()
		 * @generated
		 */
		EDataType ANGLE90 = eINSTANCE.getAngle90();

		/**
		 * The meta object literal for the '<em>Angle90 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getAngle90Object()
		 * @generated
		 */
		EDataType ANGLE90_OBJECT = eINSTANCE.getAngle90Object();

		/**
		 * The meta object literal for the '<em>Anglepos90</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getAnglepos90()
		 * @generated
		 */
		EDataType ANGLEPOS90 = eINSTANCE.getAnglepos90();

		/**
		 * The meta object literal for the '<em>Anglepos90 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getAnglepos90Object()
		 * @generated
		 */
		EDataType ANGLEPOS90_OBJECT = eINSTANCE.getAnglepos90Object();

		/**
		 * The meta object literal for the '<em>Color</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getColor()
		 * @generated
		 */
		EDataType COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '<em>Color Mode Enum Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.ColorModeEnum
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getColorModeEnumObject()
		 * @generated
		 */
		EDataType COLOR_MODE_ENUM_OBJECT = eINSTANCE.getColorModeEnumObject();

		/**
		 * The meta object literal for the '<em>Coordinates Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getCoordinatesType()
		 * @generated
		 */
		EDataType COORDINATES_TYPE = eINSTANCE.getCoordinatesType();

		/**
		 * The meta object literal for the '<em>Date Time Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getDateTimeType()
		 * @generated
		 */
		EDataType DATE_TIME_TYPE = eINSTANCE.getDateTimeType();

		/**
		 * The meta object literal for the '<em>Item Icon State Enum Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.ItemIconStateEnum
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getItemIconStateEnumObject()
		 * @generated
		 */
		EDataType ITEM_ICON_STATE_ENUM_OBJECT = eINSTANCE.getItemIconStateEnumObject();

		/**
		 * The meta object literal for the '<em>Item Icon State Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getItemIconStateType()
		 * @generated
		 */
		EDataType ITEM_ICON_STATE_TYPE = eINSTANCE.getItemIconStateType();

		/**
		 * The meta object literal for the '<em>List Item Type Enum Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.ListItemTypeEnum
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getListItemTypeEnumObject()
		 * @generated
		 */
		EDataType LIST_ITEM_TYPE_ENUM_OBJECT = eINSTANCE.getListItemTypeEnumObject();

		/**
		 * The meta object literal for the '<em>Refresh Mode Enum Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.RefreshModeEnum
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getRefreshModeEnumObject()
		 * @generated
		 */
		EDataType REFRESH_MODE_ENUM_OBJECT = eINSTANCE.getRefreshModeEnumObject();

		/**
		 * The meta object literal for the '<em>Style State Enum Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.StyleStateEnum
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getStyleStateEnumObject()
		 * @generated
		 */
		EDataType STYLE_STATE_ENUM_OBJECT = eINSTANCE.getStyleStateEnumObject();

		/**
		 * The meta object literal for the '<em>Units Enum Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.UnitsEnum
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getUnitsEnumObject()
		 * @generated
		 */
		EDataType UNITS_ENUM_OBJECT = eINSTANCE.getUnitsEnumObject();

		/**
		 * The meta object literal for the '<em>View Refresh Mode Enum Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.google.earth.kml._2.ViewRefreshModeEnum
		 * @see com.google.earth.kml._2.impl.v21PackageImpl#getViewRefreshModeEnumObject()
		 * @generated
		 */
		EDataType VIEW_REFRESH_MODE_ENUM_OBJECT = eINSTANCE.getViewRefreshModeEnumObject();

	}

} //v21Package
