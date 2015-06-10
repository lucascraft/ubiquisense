/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eeml.xsd._0._5;

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
 * @see org.eeml.xsd._0._5._5Factory
 * @model kind="package"
 * @generated
 */
public interface _5Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "_5";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eeml.org/xsd/0.5.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "_5";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	_5Package eINSTANCE = org.eeml.xsd._0._5.impl._5PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eeml.xsd._0._5.impl.CurrentValueTypeImpl <em>Current Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeml.xsd._0._5.impl.CurrentValueTypeImpl
	 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getCurrentValueType()
	 * @generated
	 */
	int CURRENT_VALUE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_VALUE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_VALUE_TYPE__AT = 1;

	/**
	 * The number of structural features of the '<em>Current Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_VALUE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eeml.xsd._0._5.impl.DatapointsTypeImpl <em>Datapoints Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeml.xsd._0._5.impl.DatapointsTypeImpl
	 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getDatapointsType()
	 * @generated
	 */
	int DATAPOINTS_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAPOINTS_TYPE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Datapoints Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAPOINTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eeml.xsd._0._5.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeml.xsd._0._5.impl.DataTypeImpl
	 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__TAG = 0;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__CURRENT_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__MAX_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__MIN_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Datapoints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__DATAPOINTS = 4;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__UNIT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ID = 6;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eeml.xsd._0._5.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeml.xsd._0._5.impl.DocumentRootImpl
	 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 3;

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
	 * The feature id for the '<em><b>Eeml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EEML = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eeml.xsd._0._5.impl.EemlTypeImpl <em>Eeml Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeml.xsd._0._5.impl.EemlTypeImpl
	 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getEemlType()
	 * @generated
	 */
	int EEML_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEML_TYPE__ENVIRONMENT = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEML_TYPE__VERSION = 1;

	/**
	 * The number of structural features of the '<em>Eeml Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEML_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eeml.xsd._0._5.impl.EnvironmentTypeImpl <em>Environment Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeml.xsd._0._5.impl.EnvironmentTypeImpl
	 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getEnvironmentType()
	 * @generated
	 */
	int ENVIRONMENT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Feed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_TYPE__FEED = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_TYPE__STATUS = 2;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_TYPE__PRIVATE = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_TYPE__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_TYPE__ICON = 5;

	/**
	 * The feature id for the '<em><b>Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_TYPE__WEBSITE = 6;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_TYPE__EMAIL = 7;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_TYPE__TAG = 8;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_TYPE__LOCATION = 9;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_TYPE__DATA = 10;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_TYPE__CREATOR = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_TYPE__ID = 12;

	/**
	 * The feature id for the '<em><b>Updated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_TYPE__UPDATED = 13;

	/**
	 * The number of structural features of the '<em>Environment Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_TYPE_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link org.eeml.xsd._0._5.impl.LocationTypeImpl <em>Location Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeml.xsd._0._5.impl.LocationTypeImpl
	 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getLocationType()
	 * @generated
	 */
	int LOCATION_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__LAT = 1;

	/**
	 * The feature id for the '<em><b>Lon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__LON = 2;

	/**
	 * The feature id for the '<em><b>Ele</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__ELE = 3;

	/**
	 * The feature id for the '<em><b>Disposition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__DISPOSITION = 4;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__DOMAIN = 5;

	/**
	 * The feature id for the '<em><b>Exposure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__EXPOSURE = 6;

	/**
	 * The number of structural features of the '<em>Location Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eeml.xsd._0._5.impl.UnitTypeImpl <em>Unit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeml.xsd._0._5.impl.UnitTypeImpl
	 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getUnitType()
	 * @generated
	 */
	int UNIT_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPE__SYMBOL = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Unit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eeml.xsd._0._5.impl.ValueTypeImpl <em>Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeml.xsd._0._5.impl.ValueTypeImpl
	 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getValueType()
	 * @generated
	 */
	int VALUE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__AT = 1;

	/**
	 * The number of structural features of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eeml.xsd._0._5.DispositionType <em>Disposition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeml.xsd._0._5.DispositionType
	 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getDispositionType()
	 * @generated
	 */
	int DISPOSITION_TYPE = 9;

	/**
	 * The meta object id for the '{@link org.eeml.xsd._0._5.DomainType <em>Domain Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeml.xsd._0._5.DomainType
	 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getDomainType()
	 * @generated
	 */
	int DOMAIN_TYPE = 10;

	/**
	 * The meta object id for the '{@link org.eeml.xsd._0._5.ExposureType <em>Exposure Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeml.xsd._0._5.ExposureType
	 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getExposureType()
	 * @generated
	 */
	int EXPOSURE_TYPE = 11;

	/**
	 * The meta object id for the '{@link org.eeml.xsd._0._5.PrivateType <em>Private Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeml.xsd._0._5.PrivateType
	 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getPrivateType()
	 * @generated
	 */
	int PRIVATE_TYPE = 12;

	/**
	 * The meta object id for the '{@link org.eeml.xsd._0._5.StatusType <em>Status Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeml.xsd._0._5.StatusType
	 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getStatusType()
	 * @generated
	 */
	int STATUS_TYPE = 13;

	/**
	 * The meta object id for the '{@link org.eeml.xsd._0._5.TypeType <em>Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeml.xsd._0._5.TypeType
	 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getTypeType()
	 * @generated
	 */
	int TYPE_TYPE = 14;

	/**
	 * The meta object id for the '{@link org.eeml.xsd._0._5.VersionType <em>Version Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeml.xsd._0._5.VersionType
	 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getVersionType()
	 * @generated
	 */
	int VERSION_TYPE = 15;

	/**
	 * The meta object id for the '<em>Creator Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getCreatorType()
	 * @generated
	 */
	int CREATOR_TYPE = 16;

	/**
	 * The meta object id for the '<em>Disposition Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeml.xsd._0._5.DispositionType
	 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getDispositionTypeObject()
	 * @generated
	 */
	int DISPOSITION_TYPE_OBJECT = 17;

	/**
	 * The meta object id for the '<em>Domain Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeml.xsd._0._5.DomainType
	 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getDomainTypeObject()
	 * @generated
	 */
	int DOMAIN_TYPE_OBJECT = 18;

	/**
	 * The meta object id for the '<em>Exposure Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeml.xsd._0._5.ExposureType
	 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getExposureTypeObject()
	 * @generated
	 */
	int EXPOSURE_TYPE_OBJECT = 19;

	/**
	 * The meta object id for the '<em>Lat Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getLatType()
	 * @generated
	 */
	int LAT_TYPE = 20;

	/**
	 * The meta object id for the '<em>Lat Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getLatTypeObject()
	 * @generated
	 */
	int LAT_TYPE_OBJECT = 21;

	/**
	 * The meta object id for the '<em>Lon Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getLonType()
	 * @generated
	 */
	int LON_TYPE = 22;

	/**
	 * The meta object id for the '<em>Lon Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getLonTypeObject()
	 * @generated
	 */
	int LON_TYPE_OBJECT = 23;

	/**
	 * The meta object id for the '<em>Private Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeml.xsd._0._5.PrivateType
	 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getPrivateTypeObject()
	 * @generated
	 */
	int PRIVATE_TYPE_OBJECT = 24;

	/**
	 * The meta object id for the '<em>Status Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeml.xsd._0._5.StatusType
	 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getStatusTypeObject()
	 * @generated
	 */
	int STATUS_TYPE_OBJECT = 25;

	/**
	 * The meta object id for the '<em>Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeml.xsd._0._5.TypeType
	 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getTypeTypeObject()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT = 26;

	/**
	 * The meta object id for the '<em>Updated Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getUpdatedType()
	 * @generated
	 */
	int UPDATED_TYPE = 27;

	/**
	 * The meta object id for the '<em>Version Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eeml.xsd._0._5.VersionType
	 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getVersionTypeObject()
	 * @generated
	 */
	int VERSION_TYPE_OBJECT = 28;


	/**
	 * Returns the meta object for class '{@link org.eeml.xsd._0._5.CurrentValueType <em>Current Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current Value Type</em>'.
	 * @see org.eeml.xsd._0._5.CurrentValueType
	 * @generated
	 */
	EClass getCurrentValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.eeml.xsd._0._5.CurrentValueType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eeml.xsd._0._5.CurrentValueType#getValue()
	 * @see #getCurrentValueType()
	 * @generated
	 */
	EAttribute getCurrentValueType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eeml.xsd._0._5.CurrentValueType#getAt <em>At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>At</em>'.
	 * @see org.eeml.xsd._0._5.CurrentValueType#getAt()
	 * @see #getCurrentValueType()
	 * @generated
	 */
	EAttribute getCurrentValueType_At();

	/**
	 * Returns the meta object for class '{@link org.eeml.xsd._0._5.DatapointsType <em>Datapoints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datapoints Type</em>'.
	 * @see org.eeml.xsd._0._5.DatapointsType
	 * @generated
	 */
	EClass getDatapointsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eeml.xsd._0._5.DatapointsType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see org.eeml.xsd._0._5.DatapointsType#getValue()
	 * @see #getDatapointsType()
	 * @generated
	 */
	EReference getDatapointsType_Value();

	/**
	 * Returns the meta object for class '{@link org.eeml.xsd._0._5.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see org.eeml.xsd._0._5.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eeml.xsd._0._5.DataType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tag</em>'.
	 * @see org.eeml.xsd._0._5.DataType#getTag()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Tag();

	/**
	 * Returns the meta object for the containment reference '{@link org.eeml.xsd._0._5.DataType#getCurrentValue <em>Current Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current Value</em>'.
	 * @see org.eeml.xsd._0._5.DataType#getCurrentValue()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_CurrentValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eeml.xsd._0._5.DataType#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see org.eeml.xsd._0._5.DataType#getMaxValue()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eeml.xsd._0._5.DataType#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see org.eeml.xsd._0._5.DataType#getMinValue()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_MinValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.eeml.xsd._0._5.DataType#getDatapoints <em>Datapoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datapoints</em>'.
	 * @see org.eeml.xsd._0._5.DataType#getDatapoints()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_Datapoints();

	/**
	 * Returns the meta object for the containment reference '{@link org.eeml.xsd._0._5.DataType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see org.eeml.xsd._0._5.DataType#getUnit()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_Unit();

	/**
	 * Returns the meta object for the attribute '{@link org.eeml.xsd._0._5.DataType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eeml.xsd._0._5.DataType#getId()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Id();

	/**
	 * Returns the meta object for class '{@link org.eeml.xsd._0._5.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eeml.xsd._0._5.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eeml.xsd._0._5.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eeml.xsd._0._5.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eeml.xsd._0._5.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eeml.xsd._0._5.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eeml.xsd._0._5.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eeml.xsd._0._5.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eeml.xsd._0._5.DocumentRoot#getEeml <em>Eeml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eeml</em>'.
	 * @see org.eeml.xsd._0._5.DocumentRoot#getEeml()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Eeml();

	/**
	 * Returns the meta object for class '{@link org.eeml.xsd._0._5.EemlType <em>Eeml Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eeml Type</em>'.
	 * @see org.eeml.xsd._0._5.EemlType
	 * @generated
	 */
	EClass getEemlType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eeml.xsd._0._5.EemlType#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environment</em>'.
	 * @see org.eeml.xsd._0._5.EemlType#getEnvironment()
	 * @see #getEemlType()
	 * @generated
	 */
	EReference getEemlType_Environment();

	/**
	 * Returns the meta object for the attribute '{@link org.eeml.xsd._0._5.EemlType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eeml.xsd._0._5.EemlType#getVersion()
	 * @see #getEemlType()
	 * @generated
	 */
	EAttribute getEemlType_Version();

	/**
	 * Returns the meta object for class '{@link org.eeml.xsd._0._5.EnvironmentType <em>Environment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Type</em>'.
	 * @see org.eeml.xsd._0._5.EnvironmentType
	 * @generated
	 */
	EClass getEnvironmentType();

	/**
	 * Returns the meta object for the attribute '{@link org.eeml.xsd._0._5.EnvironmentType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eeml.xsd._0._5.EnvironmentType#getTitle()
	 * @see #getEnvironmentType()
	 * @generated
	 */
	EAttribute getEnvironmentType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eeml.xsd._0._5.EnvironmentType#getFeed <em>Feed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feed</em>'.
	 * @see org.eeml.xsd._0._5.EnvironmentType#getFeed()
	 * @see #getEnvironmentType()
	 * @generated
	 */
	EAttribute getEnvironmentType_Feed();

	/**
	 * Returns the meta object for the attribute '{@link org.eeml.xsd._0._5.EnvironmentType#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.eeml.xsd._0._5.EnvironmentType#getStatus()
	 * @see #getEnvironmentType()
	 * @generated
	 */
	EAttribute getEnvironmentType_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.eeml.xsd._0._5.EnvironmentType#getPrivate <em>Private</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private</em>'.
	 * @see org.eeml.xsd._0._5.EnvironmentType#getPrivate()
	 * @see #getEnvironmentType()
	 * @generated
	 */
	EAttribute getEnvironmentType_Private();

	/**
	 * Returns the meta object for the attribute '{@link org.eeml.xsd._0._5.EnvironmentType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eeml.xsd._0._5.EnvironmentType#getDescription()
	 * @see #getEnvironmentType()
	 * @generated
	 */
	EAttribute getEnvironmentType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eeml.xsd._0._5.EnvironmentType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.eeml.xsd._0._5.EnvironmentType#getIcon()
	 * @see #getEnvironmentType()
	 * @generated
	 */
	EAttribute getEnvironmentType_Icon();

	/**
	 * Returns the meta object for the attribute '{@link org.eeml.xsd._0._5.EnvironmentType#getWebsite <em>Website</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Website</em>'.
	 * @see org.eeml.xsd._0._5.EnvironmentType#getWebsite()
	 * @see #getEnvironmentType()
	 * @generated
	 */
	EAttribute getEnvironmentType_Website();

	/**
	 * Returns the meta object for the attribute '{@link org.eeml.xsd._0._5.EnvironmentType#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see org.eeml.xsd._0._5.EnvironmentType#getEmail()
	 * @see #getEnvironmentType()
	 * @generated
	 */
	EAttribute getEnvironmentType_Email();

	/**
	 * Returns the meta object for the attribute list '{@link org.eeml.xsd._0._5.EnvironmentType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tag</em>'.
	 * @see org.eeml.xsd._0._5.EnvironmentType#getTag()
	 * @see #getEnvironmentType()
	 * @generated
	 */
	EAttribute getEnvironmentType_Tag();

	/**
	 * Returns the meta object for the containment reference '{@link org.eeml.xsd._0._5.EnvironmentType#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see org.eeml.xsd._0._5.EnvironmentType#getLocation()
	 * @see #getEnvironmentType()
	 * @generated
	 */
	EReference getEnvironmentType_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eeml.xsd._0._5.EnvironmentType#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see org.eeml.xsd._0._5.EnvironmentType#getData()
	 * @see #getEnvironmentType()
	 * @generated
	 */
	EReference getEnvironmentType_Data();

	/**
	 * Returns the meta object for the attribute '{@link org.eeml.xsd._0._5.EnvironmentType#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creator</em>'.
	 * @see org.eeml.xsd._0._5.EnvironmentType#getCreator()
	 * @see #getEnvironmentType()
	 * @generated
	 */
	EAttribute getEnvironmentType_Creator();

	/**
	 * Returns the meta object for the attribute '{@link org.eeml.xsd._0._5.EnvironmentType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eeml.xsd._0._5.EnvironmentType#getId()
	 * @see #getEnvironmentType()
	 * @generated
	 */
	EAttribute getEnvironmentType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eeml.xsd._0._5.EnvironmentType#getUpdated <em>Updated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updated</em>'.
	 * @see org.eeml.xsd._0._5.EnvironmentType#getUpdated()
	 * @see #getEnvironmentType()
	 * @generated
	 */
	EAttribute getEnvironmentType_Updated();

	/**
	 * Returns the meta object for class '{@link org.eeml.xsd._0._5.LocationType <em>Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Type</em>'.
	 * @see org.eeml.xsd._0._5.LocationType
	 * @generated
	 */
	EClass getLocationType();

	/**
	 * Returns the meta object for the attribute '{@link org.eeml.xsd._0._5.LocationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eeml.xsd._0._5.LocationType#getName()
	 * @see #getLocationType()
	 * @generated
	 */
	EAttribute getLocationType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eeml.xsd._0._5.LocationType#getLat <em>Lat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat</em>'.
	 * @see org.eeml.xsd._0._5.LocationType#getLat()
	 * @see #getLocationType()
	 * @generated
	 */
	EAttribute getLocationType_Lat();

	/**
	 * Returns the meta object for the attribute '{@link org.eeml.xsd._0._5.LocationType#getLon <em>Lon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lon</em>'.
	 * @see org.eeml.xsd._0._5.LocationType#getLon()
	 * @see #getLocationType()
	 * @generated
	 */
	EAttribute getLocationType_Lon();

	/**
	 * Returns the meta object for the attribute '{@link org.eeml.xsd._0._5.LocationType#getEle <em>Ele</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ele</em>'.
	 * @see org.eeml.xsd._0._5.LocationType#getEle()
	 * @see #getLocationType()
	 * @generated
	 */
	EAttribute getLocationType_Ele();

	/**
	 * Returns the meta object for the attribute '{@link org.eeml.xsd._0._5.LocationType#getDisposition <em>Disposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disposition</em>'.
	 * @see org.eeml.xsd._0._5.LocationType#getDisposition()
	 * @see #getLocationType()
	 * @generated
	 */
	EAttribute getLocationType_Disposition();

	/**
	 * Returns the meta object for the attribute '{@link org.eeml.xsd._0._5.LocationType#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain</em>'.
	 * @see org.eeml.xsd._0._5.LocationType#getDomain()
	 * @see #getLocationType()
	 * @generated
	 */
	EAttribute getLocationType_Domain();

	/**
	 * Returns the meta object for the attribute '{@link org.eeml.xsd._0._5.LocationType#getExposure <em>Exposure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exposure</em>'.
	 * @see org.eeml.xsd._0._5.LocationType#getExposure()
	 * @see #getLocationType()
	 * @generated
	 */
	EAttribute getLocationType_Exposure();

	/**
	 * Returns the meta object for class '{@link org.eeml.xsd._0._5.UnitType <em>Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Type</em>'.
	 * @see org.eeml.xsd._0._5.UnitType
	 * @generated
	 */
	EClass getUnitType();

	/**
	 * Returns the meta object for the attribute '{@link org.eeml.xsd._0._5.UnitType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eeml.xsd._0._5.UnitType#getValue()
	 * @see #getUnitType()
	 * @generated
	 */
	EAttribute getUnitType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eeml.xsd._0._5.UnitType#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see org.eeml.xsd._0._5.UnitType#getSymbol()
	 * @see #getUnitType()
	 * @generated
	 */
	EAttribute getUnitType_Symbol();

	/**
	 * Returns the meta object for the attribute '{@link org.eeml.xsd._0._5.UnitType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eeml.xsd._0._5.UnitType#getType()
	 * @see #getUnitType()
	 * @generated
	 */
	EAttribute getUnitType_Type();

	/**
	 * Returns the meta object for class '{@link org.eeml.xsd._0._5.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Type</em>'.
	 * @see org.eeml.xsd._0._5.ValueType
	 * @generated
	 */
	EClass getValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.eeml.xsd._0._5.ValueType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eeml.xsd._0._5.ValueType#getValue()
	 * @see #getValueType()
	 * @generated
	 */
	EAttribute getValueType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eeml.xsd._0._5.ValueType#getAt <em>At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>At</em>'.
	 * @see org.eeml.xsd._0._5.ValueType#getAt()
	 * @see #getValueType()
	 * @generated
	 */
	EAttribute getValueType_At();

	/**
	 * Returns the meta object for enum '{@link org.eeml.xsd._0._5.DispositionType <em>Disposition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Disposition Type</em>'.
	 * @see org.eeml.xsd._0._5.DispositionType
	 * @generated
	 */
	EEnum getDispositionType();

	/**
	 * Returns the meta object for enum '{@link org.eeml.xsd._0._5.DomainType <em>Domain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Domain Type</em>'.
	 * @see org.eeml.xsd._0._5.DomainType
	 * @generated
	 */
	EEnum getDomainType();

	/**
	 * Returns the meta object for enum '{@link org.eeml.xsd._0._5.ExposureType <em>Exposure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Exposure Type</em>'.
	 * @see org.eeml.xsd._0._5.ExposureType
	 * @generated
	 */
	EEnum getExposureType();

	/**
	 * Returns the meta object for enum '{@link org.eeml.xsd._0._5.PrivateType <em>Private Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Private Type</em>'.
	 * @see org.eeml.xsd._0._5.PrivateType
	 * @generated
	 */
	EEnum getPrivateType();

	/**
	 * Returns the meta object for enum '{@link org.eeml.xsd._0._5.StatusType <em>Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status Type</em>'.
	 * @see org.eeml.xsd._0._5.StatusType
	 * @generated
	 */
	EEnum getStatusType();

	/**
	 * Returns the meta object for enum '{@link org.eeml.xsd._0._5.TypeType <em>Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type</em>'.
	 * @see org.eeml.xsd._0._5.TypeType
	 * @generated
	 */
	EEnum getTypeType();

	/**
	 * Returns the meta object for enum '{@link org.eeml.xsd._0._5.VersionType <em>Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Version Type</em>'.
	 * @see org.eeml.xsd._0._5.VersionType
	 * @generated
	 */
	EEnum getVersionType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Creator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Creator Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='creator_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getCreatorType();

	/**
	 * Returns the meta object for data type '{@link org.eeml.xsd._0._5.DispositionType <em>Disposition Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Disposition Type Object</em>'.
	 * @see org.eeml.xsd._0._5.DispositionType
	 * @model instanceClass="org.eeml.xsd._0._5.DispositionType"
	 *        extendedMetaData="name='disposition_._type:Object' baseType='disposition_._type'"
	 * @generated
	 */
	EDataType getDispositionTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eeml.xsd._0._5.DomainType <em>Domain Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Domain Type Object</em>'.
	 * @see org.eeml.xsd._0._5.DomainType
	 * @model instanceClass="org.eeml.xsd._0._5.DomainType"
	 *        extendedMetaData="name='domain_._type:Object' baseType='domain_._type'"
	 * @generated
	 */
	EDataType getDomainTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eeml.xsd._0._5.ExposureType <em>Exposure Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exposure Type Object</em>'.
	 * @see org.eeml.xsd._0._5.ExposureType
	 * @model instanceClass="org.eeml.xsd._0._5.ExposureType"
	 *        extendedMetaData="name='exposure_._type:Object' baseType='exposure_._type'"
	 * @generated
	 */
	EDataType getExposureTypeObject();

	/**
	 * Returns the meta object for data type '<em>Lat Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Lat Type</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='lat_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='-90' maxInclusive='90'"
	 * @generated
	 */
	EDataType getLatType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Lat Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Lat Type Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='lat_._type:Object' baseType='lat_._type'"
	 * @generated
	 */
	EDataType getLatTypeObject();

	/**
	 * Returns the meta object for data type '<em>Lon Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Lon Type</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='lon_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='-180' maxInclusive='180'"
	 * @generated
	 */
	EDataType getLonType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Lon Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Lon Type Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='lon_._type:Object' baseType='lon_._type'"
	 * @generated
	 */
	EDataType getLonTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eeml.xsd._0._5.PrivateType <em>Private Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Private Type Object</em>'.
	 * @see org.eeml.xsd._0._5.PrivateType
	 * @model instanceClass="org.eeml.xsd._0._5.PrivateType"
	 *        extendedMetaData="name='private_._type:Object' baseType='private_._type'"
	 * @generated
	 */
	EDataType getPrivateTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eeml.xsd._0._5.StatusType <em>Status Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Status Type Object</em>'.
	 * @see org.eeml.xsd._0._5.StatusType
	 * @model instanceClass="org.eeml.xsd._0._5.StatusType"
	 *        extendedMetaData="name='status_._type:Object' baseType='status_._type'"
	 * @generated
	 */
	EDataType getStatusTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eeml.xsd._0._5.TypeType <em>Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object</em>'.
	 * @see org.eeml.xsd._0._5.TypeType
	 * @model instanceClass="org.eeml.xsd._0._5.TypeType"
	 *        extendedMetaData="name='type_._type:Object' baseType='type_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Updated Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Updated Type</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='updated_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#dateTime'"
	 * @generated
	 */
	EDataType getUpdatedType();

	/**
	 * Returns the meta object for data type '{@link org.eeml.xsd._0._5.VersionType <em>Version Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Version Type Object</em>'.
	 * @see org.eeml.xsd._0._5.VersionType
	 * @model instanceClass="org.eeml.xsd._0._5.VersionType"
	 *        extendedMetaData="name='version_._type:Object' baseType='version_._type'"
	 * @generated
	 */
	EDataType getVersionTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	_5Factory get_5Factory();

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
		 * The meta object literal for the '{@link org.eeml.xsd._0._5.impl.CurrentValueTypeImpl <em>Current Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eeml.xsd._0._5.impl.CurrentValueTypeImpl
		 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getCurrentValueType()
		 * @generated
		 */
		EClass CURRENT_VALUE_TYPE = eINSTANCE.getCurrentValueType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENT_VALUE_TYPE__VALUE = eINSTANCE.getCurrentValueType_Value();

		/**
		 * The meta object literal for the '<em><b>At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENT_VALUE_TYPE__AT = eINSTANCE.getCurrentValueType_At();

		/**
		 * The meta object literal for the '{@link org.eeml.xsd._0._5.impl.DatapointsTypeImpl <em>Datapoints Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eeml.xsd._0._5.impl.DatapointsTypeImpl
		 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getDatapointsType()
		 * @generated
		 */
		EClass DATAPOINTS_TYPE = eINSTANCE.getDatapointsType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATAPOINTS_TYPE__VALUE = eINSTANCE.getDatapointsType_Value();

		/**
		 * The meta object literal for the '{@link org.eeml.xsd._0._5.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eeml.xsd._0._5.impl.DataTypeImpl
		 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__TAG = eINSTANCE.getDataType_Tag();

		/**
		 * The meta object literal for the '<em><b>Current Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE__CURRENT_VALUE = eINSTANCE.getDataType_CurrentValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__MAX_VALUE = eINSTANCE.getDataType_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__MIN_VALUE = eINSTANCE.getDataType_MinValue();

		/**
		 * The meta object literal for the '<em><b>Datapoints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE__DATAPOINTS = eINSTANCE.getDataType_Datapoints();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE__UNIT = eINSTANCE.getDataType_Unit();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE__ID = eINSTANCE.getDataType_Id();

		/**
		 * The meta object literal for the '{@link org.eeml.xsd._0._5.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eeml.xsd._0._5.impl.DocumentRootImpl
		 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Eeml</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EEML = eINSTANCE.getDocumentRoot_Eeml();

		/**
		 * The meta object literal for the '{@link org.eeml.xsd._0._5.impl.EemlTypeImpl <em>Eeml Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eeml.xsd._0._5.impl.EemlTypeImpl
		 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getEemlType()
		 * @generated
		 */
		EClass EEML_TYPE = eINSTANCE.getEemlType();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEML_TYPE__ENVIRONMENT = eINSTANCE.getEemlType_Environment();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEML_TYPE__VERSION = eINSTANCE.getEemlType_Version();

		/**
		 * The meta object literal for the '{@link org.eeml.xsd._0._5.impl.EnvironmentTypeImpl <em>Environment Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eeml.xsd._0._5.impl.EnvironmentTypeImpl
		 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getEnvironmentType()
		 * @generated
		 */
		EClass ENVIRONMENT_TYPE = eINSTANCE.getEnvironmentType();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_TYPE__TITLE = eINSTANCE.getEnvironmentType_Title();

		/**
		 * The meta object literal for the '<em><b>Feed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_TYPE__FEED = eINSTANCE.getEnvironmentType_Feed();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_TYPE__STATUS = eINSTANCE.getEnvironmentType_Status();

		/**
		 * The meta object literal for the '<em><b>Private</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_TYPE__PRIVATE = eINSTANCE.getEnvironmentType_Private();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_TYPE__DESCRIPTION = eINSTANCE.getEnvironmentType_Description();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_TYPE__ICON = eINSTANCE.getEnvironmentType_Icon();

		/**
		 * The meta object literal for the '<em><b>Website</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_TYPE__WEBSITE = eINSTANCE.getEnvironmentType_Website();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_TYPE__EMAIL = eINSTANCE.getEnvironmentType_Email();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_TYPE__TAG = eINSTANCE.getEnvironmentType_Tag();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT_TYPE__LOCATION = eINSTANCE.getEnvironmentType_Location();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT_TYPE__DATA = eINSTANCE.getEnvironmentType_Data();

		/**
		 * The meta object literal for the '<em><b>Creator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_TYPE__CREATOR = eINSTANCE.getEnvironmentType_Creator();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_TYPE__ID = eINSTANCE.getEnvironmentType_Id();

		/**
		 * The meta object literal for the '<em><b>Updated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_TYPE__UPDATED = eINSTANCE.getEnvironmentType_Updated();

		/**
		 * The meta object literal for the '{@link org.eeml.xsd._0._5.impl.LocationTypeImpl <em>Location Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eeml.xsd._0._5.impl.LocationTypeImpl
		 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getLocationType()
		 * @generated
		 */
		EClass LOCATION_TYPE = eINSTANCE.getLocationType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_TYPE__NAME = eINSTANCE.getLocationType_Name();

		/**
		 * The meta object literal for the '<em><b>Lat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_TYPE__LAT = eINSTANCE.getLocationType_Lat();

		/**
		 * The meta object literal for the '<em><b>Lon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_TYPE__LON = eINSTANCE.getLocationType_Lon();

		/**
		 * The meta object literal for the '<em><b>Ele</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_TYPE__ELE = eINSTANCE.getLocationType_Ele();

		/**
		 * The meta object literal for the '<em><b>Disposition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_TYPE__DISPOSITION = eINSTANCE.getLocationType_Disposition();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_TYPE__DOMAIN = eINSTANCE.getLocationType_Domain();

		/**
		 * The meta object literal for the '<em><b>Exposure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_TYPE__EXPOSURE = eINSTANCE.getLocationType_Exposure();

		/**
		 * The meta object literal for the '{@link org.eeml.xsd._0._5.impl.UnitTypeImpl <em>Unit Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eeml.xsd._0._5.impl.UnitTypeImpl
		 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getUnitType()
		 * @generated
		 */
		EClass UNIT_TYPE = eINSTANCE.getUnitType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_TYPE__VALUE = eINSTANCE.getUnitType_Value();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_TYPE__SYMBOL = eINSTANCE.getUnitType_Symbol();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_TYPE__TYPE = eINSTANCE.getUnitType_Type();

		/**
		 * The meta object literal for the '{@link org.eeml.xsd._0._5.impl.ValueTypeImpl <em>Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eeml.xsd._0._5.impl.ValueTypeImpl
		 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getValueType()
		 * @generated
		 */
		EClass VALUE_TYPE = eINSTANCE.getValueType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_TYPE__VALUE = eINSTANCE.getValueType_Value();

		/**
		 * The meta object literal for the '<em><b>At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_TYPE__AT = eINSTANCE.getValueType_At();

		/**
		 * The meta object literal for the '{@link org.eeml.xsd._0._5.DispositionType <em>Disposition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eeml.xsd._0._5.DispositionType
		 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getDispositionType()
		 * @generated
		 */
		EEnum DISPOSITION_TYPE = eINSTANCE.getDispositionType();

		/**
		 * The meta object literal for the '{@link org.eeml.xsd._0._5.DomainType <em>Domain Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eeml.xsd._0._5.DomainType
		 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getDomainType()
		 * @generated
		 */
		EEnum DOMAIN_TYPE = eINSTANCE.getDomainType();

		/**
		 * The meta object literal for the '{@link org.eeml.xsd._0._5.ExposureType <em>Exposure Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eeml.xsd._0._5.ExposureType
		 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getExposureType()
		 * @generated
		 */
		EEnum EXPOSURE_TYPE = eINSTANCE.getExposureType();

		/**
		 * The meta object literal for the '{@link org.eeml.xsd._0._5.PrivateType <em>Private Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eeml.xsd._0._5.PrivateType
		 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getPrivateType()
		 * @generated
		 */
		EEnum PRIVATE_TYPE = eINSTANCE.getPrivateType();

		/**
		 * The meta object literal for the '{@link org.eeml.xsd._0._5.StatusType <em>Status Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eeml.xsd._0._5.StatusType
		 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getStatusType()
		 * @generated
		 */
		EEnum STATUS_TYPE = eINSTANCE.getStatusType();

		/**
		 * The meta object literal for the '{@link org.eeml.xsd._0._5.TypeType <em>Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eeml.xsd._0._5.TypeType
		 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getTypeType()
		 * @generated
		 */
		EEnum TYPE_TYPE = eINSTANCE.getTypeType();

		/**
		 * The meta object literal for the '{@link org.eeml.xsd._0._5.VersionType <em>Version Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eeml.xsd._0._5.VersionType
		 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getVersionType()
		 * @generated
		 */
		EEnum VERSION_TYPE = eINSTANCE.getVersionType();

		/**
		 * The meta object literal for the '<em>Creator Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getCreatorType()
		 * @generated
		 */
		EDataType CREATOR_TYPE = eINSTANCE.getCreatorType();

		/**
		 * The meta object literal for the '<em>Disposition Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eeml.xsd._0._5.DispositionType
		 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getDispositionTypeObject()
		 * @generated
		 */
		EDataType DISPOSITION_TYPE_OBJECT = eINSTANCE.getDispositionTypeObject();

		/**
		 * The meta object literal for the '<em>Domain Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eeml.xsd._0._5.DomainType
		 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getDomainTypeObject()
		 * @generated
		 */
		EDataType DOMAIN_TYPE_OBJECT = eINSTANCE.getDomainTypeObject();

		/**
		 * The meta object literal for the '<em>Exposure Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eeml.xsd._0._5.ExposureType
		 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getExposureTypeObject()
		 * @generated
		 */
		EDataType EXPOSURE_TYPE_OBJECT = eINSTANCE.getExposureTypeObject();

		/**
		 * The meta object literal for the '<em>Lat Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getLatType()
		 * @generated
		 */
		EDataType LAT_TYPE = eINSTANCE.getLatType();

		/**
		 * The meta object literal for the '<em>Lat Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getLatTypeObject()
		 * @generated
		 */
		EDataType LAT_TYPE_OBJECT = eINSTANCE.getLatTypeObject();

		/**
		 * The meta object literal for the '<em>Lon Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getLonType()
		 * @generated
		 */
		EDataType LON_TYPE = eINSTANCE.getLonType();

		/**
		 * The meta object literal for the '<em>Lon Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getLonTypeObject()
		 * @generated
		 */
		EDataType LON_TYPE_OBJECT = eINSTANCE.getLonTypeObject();

		/**
		 * The meta object literal for the '<em>Private Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eeml.xsd._0._5.PrivateType
		 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getPrivateTypeObject()
		 * @generated
		 */
		EDataType PRIVATE_TYPE_OBJECT = eINSTANCE.getPrivateTypeObject();

		/**
		 * The meta object literal for the '<em>Status Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eeml.xsd._0._5.StatusType
		 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getStatusTypeObject()
		 * @generated
		 */
		EDataType STATUS_TYPE_OBJECT = eINSTANCE.getStatusTypeObject();

		/**
		 * The meta object literal for the '<em>Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eeml.xsd._0._5.TypeType
		 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getTypeTypeObject()
		 * @generated
		 */
		EDataType TYPE_TYPE_OBJECT = eINSTANCE.getTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Updated Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getUpdatedType()
		 * @generated
		 */
		EDataType UPDATED_TYPE = eINSTANCE.getUpdatedType();

		/**
		 * The meta object literal for the '<em>Version Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eeml.xsd._0._5.VersionType
		 * @see org.eeml.xsd._0._5.impl._5PackageImpl#getVersionTypeObject()
		 * @generated
		 */
		EDataType VERSION_TYPE_OBJECT = eINSTANCE.getVersionTypeObject();

	}

} //_5Package
