/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.topografix.gpx.v1._1;

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
 *   GPX schema version 1.1 - For more information on GPX and this schema, visit http://www.topografix.com/gpx.asp
 * 
 *   GPX uses the following conventions: all coordinates are relative to the WGS84 datum.  All measurements are in metric units.
 *  
 * <!-- end-model-doc -->
 * @see com.topografix.gpx.v1._1.v1Factory
 * @model kind="package"
 * @generated
 */
public interface v1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "_1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.topografix.com/GPX/1/1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "_1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	v1Package eINSTANCE = com.topografix.gpx.v1._1.impl.v1PackageImpl.init();

	/**
	 * The meta object id for the '{@link com.topografix.gpx.v1._1.impl.BoundsTypeImpl <em>Bounds Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.topografix.gpx.v1._1.impl.BoundsTypeImpl
	 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getBoundsType()
	 * @generated
	 */
	int BOUNDS_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Maxlat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS_TYPE__MAXLAT = 0;

	/**
	 * The feature id for the '<em><b>Maxlon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS_TYPE__MAXLON = 1;

	/**
	 * The feature id for the '<em><b>Minlat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS_TYPE__MINLAT = 2;

	/**
	 * The feature id for the '<em><b>Minlon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS_TYPE__MINLON = 3;

	/**
	 * The number of structural features of the '<em>Bounds Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.topografix.gpx.v1._1.impl.CopyrightTypeImpl <em>Copyright Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.topografix.gpx.v1._1.impl.CopyrightTypeImpl
	 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getCopyrightType()
	 * @generated
	 */
	int COPYRIGHT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPYRIGHT_TYPE__YEAR = 0;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPYRIGHT_TYPE__LICENSE = 1;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPYRIGHT_TYPE__AUTHOR = 2;

	/**
	 * The number of structural features of the '<em>Copyright Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPYRIGHT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.topografix.gpx.v1._1.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.topografix.gpx.v1._1.impl.DocumentRootImpl
	 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 2;

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
	 * The feature id for the '<em><b>Gpx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GPX = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.topografix.gpx.v1._1.impl.EmailTypeImpl <em>Email Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.topografix.gpx.v1._1.impl.EmailTypeImpl
	 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getEmailType()
	 * @generated
	 */
	int EMAIL_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_TYPE__DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Email Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMAIL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.topografix.gpx.v1._1.impl.ExtensionsTypeImpl <em>Extensions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.topografix.gpx.v1._1.impl.ExtensionsTypeImpl
	 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getExtensionsType()
	 * @generated
	 */
	int EXTENSIONS_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS_TYPE__ANY = 0;

	/**
	 * The number of structural features of the '<em>Extensions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.topografix.gpx.v1._1.impl.GpxTypeImpl <em>Gpx Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.topografix.gpx.v1._1.impl.GpxTypeImpl
	 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getGpxType()
	 * @generated
	 */
	int GPX_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPX_TYPE__METADATA = 0;

	/**
	 * The feature id for the '<em><b>Wpt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPX_TYPE__WPT = 1;

	/**
	 * The feature id for the '<em><b>Rte</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPX_TYPE__RTE = 2;

	/**
	 * The feature id for the '<em><b>Trk</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPX_TYPE__TRK = 3;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPX_TYPE__TIME = 4;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPX_TYPE__BOUNDS = 5;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPX_TYPE__EXTENSIONS = 6;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPX_TYPE__CREATOR = 7;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPX_TYPE__VERSION = 8;

	/**
	 * The number of structural features of the '<em>Gpx Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPX_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link com.topografix.gpx.v1._1.impl.LinkTypeImpl <em>Link Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.topografix.gpx.v1._1.impl.LinkTypeImpl
	 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getLinkType()
	 * @generated
	 */
	int LINK_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__HREF = 2;

	/**
	 * The number of structural features of the '<em>Link Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.topografix.gpx.v1._1.impl.MetadataTypeImpl <em>Metadata Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.topografix.gpx.v1._1.impl.MetadataTypeImpl
	 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getMetadataType()
	 * @generated
	 */
	int METADATA_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE__DESC = 1;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE__AUTHOR = 2;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE__COPYRIGHT = 3;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE__LINK = 4;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE__TIME = 5;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE__KEYWORDS = 6;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE__BOUNDS = 7;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE__EXTENSIONS = 8;

	/**
	 * The number of structural features of the '<em>Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link com.topografix.gpx.v1._1.impl.PersonTypeImpl <em>Person Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.topografix.gpx.v1._1.impl.PersonTypeImpl
	 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getPersonType()
	 * @generated
	 */
	int PERSON_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__EMAIL = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE__LINK = 2;

	/**
	 * The number of structural features of the '<em>Person Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.topografix.gpx.v1._1.impl.PtsegTypeImpl <em>Ptseg Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.topografix.gpx.v1._1.impl.PtsegTypeImpl
	 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getPtsegType()
	 * @generated
	 */
	int PTSEG_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Pt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTSEG_TYPE__PT = 0;

	/**
	 * The number of structural features of the '<em>Ptseg Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTSEG_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.topografix.gpx.v1._1.impl.PtTypeImpl <em>Pt Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.topografix.gpx.v1._1.impl.PtTypeImpl
	 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getPtType()
	 * @generated
	 */
	int PT_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Ele</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_TYPE__ELE = 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_TYPE__TIME = 1;

	/**
	 * The feature id for the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_TYPE__LAT = 2;

	/**
	 * The feature id for the '<em><b>Lon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_TYPE__LON = 3;

	/**
	 * The number of structural features of the '<em>Pt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.topografix.gpx.v1._1.impl.RteTypeImpl <em>Rte Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.topografix.gpx.v1._1.impl.RteTypeImpl
	 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getRteType()
	 * @generated
	 */
	int RTE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Cmt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TYPE__CMT = 1;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TYPE__DESC = 2;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TYPE__SRC = 3;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TYPE__LINK = 4;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TYPE__NUMBER = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TYPE__TYPE = 6;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TYPE__EXTENSIONS = 7;

	/**
	 * The feature id for the '<em><b>Rtept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TYPE__RTEPT = 8;

	/**
	 * The number of structural features of the '<em>Rte Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link com.topografix.gpx.v1._1.impl.TrksegTypeImpl <em>Trkseg Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.topografix.gpx.v1._1.impl.TrksegTypeImpl
	 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getTrksegType()
	 * @generated
	 */
	int TRKSEG_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Trkpt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRKSEG_TYPE__TRKPT = 0;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRKSEG_TYPE__EXTENSIONS = 1;

	/**
	 * The number of structural features of the '<em>Trkseg Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRKSEG_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.topografix.gpx.v1._1.impl.TrkTypeImpl <em>Trk Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.topografix.gpx.v1._1.impl.TrkTypeImpl
	 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getTrkType()
	 * @generated
	 */
	int TRK_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRK_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Cmt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRK_TYPE__CMT = 1;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRK_TYPE__DESC = 2;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRK_TYPE__SRC = 3;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRK_TYPE__LINK = 4;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRK_TYPE__NUMBER = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRK_TYPE__TYPE = 6;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRK_TYPE__EXTENSIONS = 7;

	/**
	 * The feature id for the '<em><b>Trkseg</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRK_TYPE__TRKSEG = 8;

	/**
	 * The number of structural features of the '<em>Trk Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRK_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link com.topografix.gpx.v1._1.impl.WptTypeImpl <em>Wpt Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.topografix.gpx.v1._1.impl.WptTypeImpl
	 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getWptType()
	 * @generated
	 */
	int WPT_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Ele</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__ELE = 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__TIME = 1;

	/**
	 * The feature id for the '<em><b>Magvar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__MAGVAR = 2;

	/**
	 * The feature id for the '<em><b>Geoidheight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__GEOIDHEIGHT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Cmt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__CMT = 5;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__DESC = 6;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__SRC = 7;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__LINK = 8;

	/**
	 * The feature id for the '<em><b>Sym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__SYM = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__TYPE = 10;

	/**
	 * The feature id for the '<em><b>Fix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__FIX = 11;

	/**
	 * The feature id for the '<em><b>Sat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__SAT = 12;

	/**
	 * The feature id for the '<em><b>Hdop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__HDOP = 13;

	/**
	 * The feature id for the '<em><b>Vdop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__VDOP = 14;

	/**
	 * The feature id for the '<em><b>Pdop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__PDOP = 15;

	/**
	 * The feature id for the '<em><b>Ageofdgpsdata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__AGEOFDGPSDATA = 16;

	/**
	 * The feature id for the '<em><b>Dgpsid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__DGPSID = 17;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__EXTENSIONS = 18;

	/**
	 * The feature id for the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__LAT = 19;

	/**
	 * The feature id for the '<em><b>Lon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE__LON = 20;

	/**
	 * The number of structural features of the '<em>Wpt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPT_TYPE_FEATURE_COUNT = 21;

	/**
	 * The meta object id for the '{@link com.topografix.gpx.v1._1.FixType <em>Fix Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.topografix.gpx.v1._1.FixType
	 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getFixType()
	 * @generated
	 */
	int FIX_TYPE = 15;

	/**
	 * The meta object id for the '<em>Degrees Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getDegreesType()
	 * @generated
	 */
	int DEGREES_TYPE = 16;

	/**
	 * The meta object id for the '<em>Dgps Station Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getDgpsStationType()
	 * @generated
	 */
	int DGPS_STATION_TYPE = 17;

	/**
	 * The meta object id for the '<em>Fix Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.topografix.gpx.v1._1.FixType
	 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getFixTypeObject()
	 * @generated
	 */
	int FIX_TYPE_OBJECT = 18;

	/**
	 * The meta object id for the '<em>Latitude Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getLatitudeType()
	 * @generated
	 */
	int LATITUDE_TYPE = 19;

	/**
	 * The meta object id for the '<em>Longitude Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getLongitudeType()
	 * @generated
	 */
	int LONGITUDE_TYPE = 20;


	/**
	 * Returns the meta object for class '{@link com.topografix.gpx.v1._1.BoundsType <em>Bounds Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounds Type</em>'.
	 * @see com.topografix.gpx.v1._1.BoundsType
	 * @generated
	 */
	EClass getBoundsType();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.BoundsType#getMaxlat <em>Maxlat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maxlat</em>'.
	 * @see com.topografix.gpx.v1._1.BoundsType#getMaxlat()
	 * @see #getBoundsType()
	 * @generated
	 */
	EAttribute getBoundsType_Maxlat();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.BoundsType#getMaxlon <em>Maxlon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maxlon</em>'.
	 * @see com.topografix.gpx.v1._1.BoundsType#getMaxlon()
	 * @see #getBoundsType()
	 * @generated
	 */
	EAttribute getBoundsType_Maxlon();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.BoundsType#getMinlat <em>Minlat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minlat</em>'.
	 * @see com.topografix.gpx.v1._1.BoundsType#getMinlat()
	 * @see #getBoundsType()
	 * @generated
	 */
	EAttribute getBoundsType_Minlat();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.BoundsType#getMinlon <em>Minlon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minlon</em>'.
	 * @see com.topografix.gpx.v1._1.BoundsType#getMinlon()
	 * @see #getBoundsType()
	 * @generated
	 */
	EAttribute getBoundsType_Minlon();

	/**
	 * Returns the meta object for class '{@link com.topografix.gpx.v1._1.CopyrightType <em>Copyright Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copyright Type</em>'.
	 * @see com.topografix.gpx.v1._1.CopyrightType
	 * @generated
	 */
	EClass getCopyrightType();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.CopyrightType#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see com.topografix.gpx.v1._1.CopyrightType#getYear()
	 * @see #getCopyrightType()
	 * @generated
	 */
	EAttribute getCopyrightType_Year();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.CopyrightType#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License</em>'.
	 * @see com.topografix.gpx.v1._1.CopyrightType#getLicense()
	 * @see #getCopyrightType()
	 * @generated
	 */
	EAttribute getCopyrightType_License();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.CopyrightType#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see com.topografix.gpx.v1._1.CopyrightType#getAuthor()
	 * @see #getCopyrightType()
	 * @generated
	 */
	EAttribute getCopyrightType_Author();

	/**
	 * Returns the meta object for class '{@link com.topografix.gpx.v1._1.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see com.topografix.gpx.v1._1.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link com.topografix.gpx.v1._1.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see com.topografix.gpx.v1._1.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link com.topografix.gpx.v1._1.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see com.topografix.gpx.v1._1.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link com.topografix.gpx.v1._1.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see com.topografix.gpx.v1._1.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link com.topografix.gpx.v1._1.DocumentRoot#getGpx <em>Gpx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gpx</em>'.
	 * @see com.topografix.gpx.v1._1.DocumentRoot#getGpx()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Gpx();

	/**
	 * Returns the meta object for class '{@link com.topografix.gpx.v1._1.EmailType <em>Email Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Email Type</em>'.
	 * @see com.topografix.gpx.v1._1.EmailType
	 * @generated
	 */
	EClass getEmailType();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.EmailType#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain</em>'.
	 * @see com.topografix.gpx.v1._1.EmailType#getDomain()
	 * @see #getEmailType()
	 * @generated
	 */
	EAttribute getEmailType_Domain();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.EmailType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.topografix.gpx.v1._1.EmailType#getId()
	 * @see #getEmailType()
	 * @generated
	 */
	EAttribute getEmailType_Id();

	/**
	 * Returns the meta object for class '{@link com.topografix.gpx.v1._1.ExtensionsType <em>Extensions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extensions Type</em>'.
	 * @see com.topografix.gpx.v1._1.ExtensionsType
	 * @generated
	 */
	EClass getExtensionsType();

	/**
	 * Returns the meta object for the attribute list '{@link com.topografix.gpx.v1._1.ExtensionsType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see com.topografix.gpx.v1._1.ExtensionsType#getAny()
	 * @see #getExtensionsType()
	 * @generated
	 */
	EAttribute getExtensionsType_Any();

	/**
	 * Returns the meta object for class '{@link com.topografix.gpx.v1._1.GpxType <em>Gpx Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gpx Type</em>'.
	 * @see com.topografix.gpx.v1._1.GpxType
	 * @generated
	 */
	EClass getGpxType();

	/**
	 * Returns the meta object for the containment reference '{@link com.topografix.gpx.v1._1.GpxType#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see com.topografix.gpx.v1._1.GpxType#getMetadata()
	 * @see #getGpxType()
	 * @generated
	 */
	EReference getGpxType_Metadata();

	/**
	 * Returns the meta object for the containment reference list '{@link com.topografix.gpx.v1._1.GpxType#getWpt <em>Wpt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wpt</em>'.
	 * @see com.topografix.gpx.v1._1.GpxType#getWpt()
	 * @see #getGpxType()
	 * @generated
	 */
	EReference getGpxType_Wpt();

	/**
	 * Returns the meta object for the containment reference list '{@link com.topografix.gpx.v1._1.GpxType#getRte <em>Rte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rte</em>'.
	 * @see com.topografix.gpx.v1._1.GpxType#getRte()
	 * @see #getGpxType()
	 * @generated
	 */
	EReference getGpxType_Rte();

	/**
	 * Returns the meta object for the containment reference list '{@link com.topografix.gpx.v1._1.GpxType#getTrk <em>Trk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trk</em>'.
	 * @see com.topografix.gpx.v1._1.GpxType#getTrk()
	 * @see #getGpxType()
	 * @generated
	 */
	EReference getGpxType_Trk();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.GpxType#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see com.topografix.gpx.v1._1.GpxType#getTime()
	 * @see #getGpxType()
	 * @generated
	 */
	EAttribute getGpxType_Time();

	/**
	 * Returns the meta object for the containment reference '{@link com.topografix.gpx.v1._1.GpxType#getBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bounds</em>'.
	 * @see com.topografix.gpx.v1._1.GpxType#getBounds()
	 * @see #getGpxType()
	 * @generated
	 */
	EReference getGpxType_Bounds();

	/**
	 * Returns the meta object for the containment reference '{@link com.topografix.gpx.v1._1.GpxType#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extensions</em>'.
	 * @see com.topografix.gpx.v1._1.GpxType#getExtensions()
	 * @see #getGpxType()
	 * @generated
	 */
	EReference getGpxType_Extensions();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.GpxType#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creator</em>'.
	 * @see com.topografix.gpx.v1._1.GpxType#getCreator()
	 * @see #getGpxType()
	 * @generated
	 */
	EAttribute getGpxType_Creator();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.GpxType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.topografix.gpx.v1._1.GpxType#getVersion()
	 * @see #getGpxType()
	 * @generated
	 */
	EAttribute getGpxType_Version();

	/**
	 * Returns the meta object for class '{@link com.topografix.gpx.v1._1.LinkType <em>Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Type</em>'.
	 * @see com.topografix.gpx.v1._1.LinkType
	 * @generated
	 */
	EClass getLinkType();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.LinkType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see com.topografix.gpx.v1._1.LinkType#getText()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_Text();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.LinkType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.topografix.gpx.v1._1.LinkType#getType()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.LinkType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see com.topografix.gpx.v1._1.LinkType#getHref()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_Href();

	/**
	 * Returns the meta object for class '{@link com.topografix.gpx.v1._1.MetadataType <em>Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata Type</em>'.
	 * @see com.topografix.gpx.v1._1.MetadataType
	 * @generated
	 */
	EClass getMetadataType();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.MetadataType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.topografix.gpx.v1._1.MetadataType#getName()
	 * @see #getMetadataType()
	 * @generated
	 */
	EAttribute getMetadataType_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.MetadataType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see com.topografix.gpx.v1._1.MetadataType#getDesc()
	 * @see #getMetadataType()
	 * @generated
	 */
	EAttribute getMetadataType_Desc();

	/**
	 * Returns the meta object for the containment reference '{@link com.topografix.gpx.v1._1.MetadataType#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Author</em>'.
	 * @see com.topografix.gpx.v1._1.MetadataType#getAuthor()
	 * @see #getMetadataType()
	 * @generated
	 */
	EReference getMetadataType_Author();

	/**
	 * Returns the meta object for the containment reference '{@link com.topografix.gpx.v1._1.MetadataType#getCopyright <em>Copyright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Copyright</em>'.
	 * @see com.topografix.gpx.v1._1.MetadataType#getCopyright()
	 * @see #getMetadataType()
	 * @generated
	 */
	EReference getMetadataType_Copyright();

	/**
	 * Returns the meta object for the containment reference list '{@link com.topografix.gpx.v1._1.MetadataType#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see com.topografix.gpx.v1._1.MetadataType#getLink()
	 * @see #getMetadataType()
	 * @generated
	 */
	EReference getMetadataType_Link();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.MetadataType#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see com.topografix.gpx.v1._1.MetadataType#getTime()
	 * @see #getMetadataType()
	 * @generated
	 */
	EAttribute getMetadataType_Time();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.MetadataType#getKeywords <em>Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keywords</em>'.
	 * @see com.topografix.gpx.v1._1.MetadataType#getKeywords()
	 * @see #getMetadataType()
	 * @generated
	 */
	EAttribute getMetadataType_Keywords();

	/**
	 * Returns the meta object for the containment reference '{@link com.topografix.gpx.v1._1.MetadataType#getBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bounds</em>'.
	 * @see com.topografix.gpx.v1._1.MetadataType#getBounds()
	 * @see #getMetadataType()
	 * @generated
	 */
	EReference getMetadataType_Bounds();

	/**
	 * Returns the meta object for the containment reference '{@link com.topografix.gpx.v1._1.MetadataType#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extensions</em>'.
	 * @see com.topografix.gpx.v1._1.MetadataType#getExtensions()
	 * @see #getMetadataType()
	 * @generated
	 */
	EReference getMetadataType_Extensions();

	/**
	 * Returns the meta object for class '{@link com.topografix.gpx.v1._1.PersonType <em>Person Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Type</em>'.
	 * @see com.topografix.gpx.v1._1.PersonType
	 * @generated
	 */
	EClass getPersonType();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.PersonType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.topografix.gpx.v1._1.PersonType#getName()
	 * @see #getPersonType()
	 * @generated
	 */
	EAttribute getPersonType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link com.topografix.gpx.v1._1.PersonType#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Email</em>'.
	 * @see com.topografix.gpx.v1._1.PersonType#getEmail()
	 * @see #getPersonType()
	 * @generated
	 */
	EReference getPersonType_Email();

	/**
	 * Returns the meta object for the containment reference '{@link com.topografix.gpx.v1._1.PersonType#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Link</em>'.
	 * @see com.topografix.gpx.v1._1.PersonType#getLink()
	 * @see #getPersonType()
	 * @generated
	 */
	EReference getPersonType_Link();

	/**
	 * Returns the meta object for class '{@link com.topografix.gpx.v1._1.PtsegType <em>Ptseg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ptseg Type</em>'.
	 * @see com.topografix.gpx.v1._1.PtsegType
	 * @generated
	 */
	EClass getPtsegType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.topografix.gpx.v1._1.PtsegType#getPt <em>Pt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pt</em>'.
	 * @see com.topografix.gpx.v1._1.PtsegType#getPt()
	 * @see #getPtsegType()
	 * @generated
	 */
	EReference getPtsegType_Pt();

	/**
	 * Returns the meta object for class '{@link com.topografix.gpx.v1._1.PtType <em>Pt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pt Type</em>'.
	 * @see com.topografix.gpx.v1._1.PtType
	 * @generated
	 */
	EClass getPtType();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.PtType#getEle <em>Ele</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ele</em>'.
	 * @see com.topografix.gpx.v1._1.PtType#getEle()
	 * @see #getPtType()
	 * @generated
	 */
	EAttribute getPtType_Ele();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.PtType#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see com.topografix.gpx.v1._1.PtType#getTime()
	 * @see #getPtType()
	 * @generated
	 */
	EAttribute getPtType_Time();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.PtType#getLat <em>Lat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat</em>'.
	 * @see com.topografix.gpx.v1._1.PtType#getLat()
	 * @see #getPtType()
	 * @generated
	 */
	EAttribute getPtType_Lat();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.PtType#getLon <em>Lon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lon</em>'.
	 * @see com.topografix.gpx.v1._1.PtType#getLon()
	 * @see #getPtType()
	 * @generated
	 */
	EAttribute getPtType_Lon();

	/**
	 * Returns the meta object for class '{@link com.topografix.gpx.v1._1.RteType <em>Rte Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rte Type</em>'.
	 * @see com.topografix.gpx.v1._1.RteType
	 * @generated
	 */
	EClass getRteType();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.RteType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.topografix.gpx.v1._1.RteType#getName()
	 * @see #getRteType()
	 * @generated
	 */
	EAttribute getRteType_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.RteType#getCmt <em>Cmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cmt</em>'.
	 * @see com.topografix.gpx.v1._1.RteType#getCmt()
	 * @see #getRteType()
	 * @generated
	 */
	EAttribute getRteType_Cmt();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.RteType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see com.topografix.gpx.v1._1.RteType#getDesc()
	 * @see #getRteType()
	 * @generated
	 */
	EAttribute getRteType_Desc();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.RteType#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see com.topografix.gpx.v1._1.RteType#getSrc()
	 * @see #getRteType()
	 * @generated
	 */
	EAttribute getRteType_Src();

	/**
	 * Returns the meta object for the containment reference list '{@link com.topografix.gpx.v1._1.RteType#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see com.topografix.gpx.v1._1.RteType#getLink()
	 * @see #getRteType()
	 * @generated
	 */
	EReference getRteType_Link();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.RteType#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see com.topografix.gpx.v1._1.RteType#getNumber()
	 * @see #getRteType()
	 * @generated
	 */
	EAttribute getRteType_Number();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.RteType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.topografix.gpx.v1._1.RteType#getType()
	 * @see #getRteType()
	 * @generated
	 */
	EAttribute getRteType_Type();

	/**
	 * Returns the meta object for the containment reference '{@link com.topografix.gpx.v1._1.RteType#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extensions</em>'.
	 * @see com.topografix.gpx.v1._1.RteType#getExtensions()
	 * @see #getRteType()
	 * @generated
	 */
	EReference getRteType_Extensions();

	/**
	 * Returns the meta object for the containment reference list '{@link com.topografix.gpx.v1._1.RteType#getRtept <em>Rtept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rtept</em>'.
	 * @see com.topografix.gpx.v1._1.RteType#getRtept()
	 * @see #getRteType()
	 * @generated
	 */
	EReference getRteType_Rtept();

	/**
	 * Returns the meta object for class '{@link com.topografix.gpx.v1._1.TrksegType <em>Trkseg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trkseg Type</em>'.
	 * @see com.topografix.gpx.v1._1.TrksegType
	 * @generated
	 */
	EClass getTrksegType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.topografix.gpx.v1._1.TrksegType#getTrkpt <em>Trkpt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trkpt</em>'.
	 * @see com.topografix.gpx.v1._1.TrksegType#getTrkpt()
	 * @see #getTrksegType()
	 * @generated
	 */
	EReference getTrksegType_Trkpt();

	/**
	 * Returns the meta object for the containment reference '{@link com.topografix.gpx.v1._1.TrksegType#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extensions</em>'.
	 * @see com.topografix.gpx.v1._1.TrksegType#getExtensions()
	 * @see #getTrksegType()
	 * @generated
	 */
	EReference getTrksegType_Extensions();

	/**
	 * Returns the meta object for class '{@link com.topografix.gpx.v1._1.TrkType <em>Trk Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trk Type</em>'.
	 * @see com.topografix.gpx.v1._1.TrkType
	 * @generated
	 */
	EClass getTrkType();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.TrkType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.topografix.gpx.v1._1.TrkType#getName()
	 * @see #getTrkType()
	 * @generated
	 */
	EAttribute getTrkType_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.TrkType#getCmt <em>Cmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cmt</em>'.
	 * @see com.topografix.gpx.v1._1.TrkType#getCmt()
	 * @see #getTrkType()
	 * @generated
	 */
	EAttribute getTrkType_Cmt();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.TrkType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see com.topografix.gpx.v1._1.TrkType#getDesc()
	 * @see #getTrkType()
	 * @generated
	 */
	EAttribute getTrkType_Desc();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.TrkType#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see com.topografix.gpx.v1._1.TrkType#getSrc()
	 * @see #getTrkType()
	 * @generated
	 */
	EAttribute getTrkType_Src();

	/**
	 * Returns the meta object for the containment reference list '{@link com.topografix.gpx.v1._1.TrkType#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see com.topografix.gpx.v1._1.TrkType#getLink()
	 * @see #getTrkType()
	 * @generated
	 */
	EReference getTrkType_Link();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.TrkType#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see com.topografix.gpx.v1._1.TrkType#getNumber()
	 * @see #getTrkType()
	 * @generated
	 */
	EAttribute getTrkType_Number();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.TrkType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.topografix.gpx.v1._1.TrkType#getType()
	 * @see #getTrkType()
	 * @generated
	 */
	EAttribute getTrkType_Type();

	/**
	 * Returns the meta object for the containment reference '{@link com.topografix.gpx.v1._1.TrkType#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extensions</em>'.
	 * @see com.topografix.gpx.v1._1.TrkType#getExtensions()
	 * @see #getTrkType()
	 * @generated
	 */
	EReference getTrkType_Extensions();

	/**
	 * Returns the meta object for the containment reference list '{@link com.topografix.gpx.v1._1.TrkType#getTrkseg <em>Trkseg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trkseg</em>'.
	 * @see com.topografix.gpx.v1._1.TrkType#getTrkseg()
	 * @see #getTrkType()
	 * @generated
	 */
	EReference getTrkType_Trkseg();

	/**
	 * Returns the meta object for class '{@link com.topografix.gpx.v1._1.WptType <em>Wpt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wpt Type</em>'.
	 * @see com.topografix.gpx.v1._1.WptType
	 * @generated
	 */
	EClass getWptType();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.WptType#getEle <em>Ele</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ele</em>'.
	 * @see com.topografix.gpx.v1._1.WptType#getEle()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Ele();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.WptType#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see com.topografix.gpx.v1._1.WptType#getTime()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Time();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.WptType#getMagvar <em>Magvar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Magvar</em>'.
	 * @see com.topografix.gpx.v1._1.WptType#getMagvar()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Magvar();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.WptType#getGeoidheight <em>Geoidheight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geoidheight</em>'.
	 * @see com.topografix.gpx.v1._1.WptType#getGeoidheight()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Geoidheight();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.WptType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.topografix.gpx.v1._1.WptType#getName()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.WptType#getCmt <em>Cmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cmt</em>'.
	 * @see com.topografix.gpx.v1._1.WptType#getCmt()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Cmt();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.WptType#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see com.topografix.gpx.v1._1.WptType#getDesc()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Desc();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.WptType#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see com.topografix.gpx.v1._1.WptType#getSrc()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Src();

	/**
	 * Returns the meta object for the containment reference list '{@link com.topografix.gpx.v1._1.WptType#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see com.topografix.gpx.v1._1.WptType#getLink()
	 * @see #getWptType()
	 * @generated
	 */
	EReference getWptType_Link();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.WptType#getSym <em>Sym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sym</em>'.
	 * @see com.topografix.gpx.v1._1.WptType#getSym()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Sym();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.WptType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.topografix.gpx.v1._1.WptType#getType()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.WptType#getFix <em>Fix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fix</em>'.
	 * @see com.topografix.gpx.v1._1.WptType#getFix()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Fix();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.WptType#getSat <em>Sat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sat</em>'.
	 * @see com.topografix.gpx.v1._1.WptType#getSat()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Sat();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.WptType#getHdop <em>Hdop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hdop</em>'.
	 * @see com.topografix.gpx.v1._1.WptType#getHdop()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Hdop();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.WptType#getVdop <em>Vdop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vdop</em>'.
	 * @see com.topografix.gpx.v1._1.WptType#getVdop()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Vdop();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.WptType#getPdop <em>Pdop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pdop</em>'.
	 * @see com.topografix.gpx.v1._1.WptType#getPdop()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Pdop();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.WptType#getAgeofdgpsdata <em>Ageofdgpsdata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ageofdgpsdata</em>'.
	 * @see com.topografix.gpx.v1._1.WptType#getAgeofdgpsdata()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Ageofdgpsdata();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.WptType#getDgpsid <em>Dgpsid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dgpsid</em>'.
	 * @see com.topografix.gpx.v1._1.WptType#getDgpsid()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Dgpsid();

	/**
	 * Returns the meta object for the containment reference '{@link com.topografix.gpx.v1._1.WptType#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extensions</em>'.
	 * @see com.topografix.gpx.v1._1.WptType#getExtensions()
	 * @see #getWptType()
	 * @generated
	 */
	EReference getWptType_Extensions();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.WptType#getLat <em>Lat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat</em>'.
	 * @see com.topografix.gpx.v1._1.WptType#getLat()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Lat();

	/**
	 * Returns the meta object for the attribute '{@link com.topografix.gpx.v1._1.WptType#getLon <em>Lon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lon</em>'.
	 * @see com.topografix.gpx.v1._1.WptType#getLon()
	 * @see #getWptType()
	 * @generated
	 */
	EAttribute getWptType_Lon();

	/**
	 * Returns the meta object for enum '{@link com.topografix.gpx.v1._1.FixType <em>Fix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fix Type</em>'.
	 * @see com.topografix.gpx.v1._1.FixType
	 * @generated
	 */
	EEnum getFixType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Degrees Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Degrees Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='degreesType' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minInclusive='0.0' maxExclusive='360.0'"
	 * @generated
	 */
	EDataType getDegreesType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Dgps Station Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Dgps Station Type</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='dgpsStationType' baseType='http://www.eclipse.org/emf/2003/XMLType#integer' minInclusive='0' maxInclusive='1023'"
	 * @generated
	 */
	EDataType getDgpsStationType();

	/**
	 * Returns the meta object for data type '{@link com.topografix.gpx.v1._1.FixType <em>Fix Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Fix Type Object</em>'.
	 * @see com.topografix.gpx.v1._1.FixType
	 * @model instanceClass="com.topografix.gpx.v1._1.FixType"
	 *        extendedMetaData="name='fixType:Object' baseType='fixType'"
	 * @generated
	 */
	EDataType getFixTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Latitude Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Latitude Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='latitudeType' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minInclusive='-90.0' maxInclusive='90.0'"
	 * @generated
	 */
	EDataType getLatitudeType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Longitude Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Longitude Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='longitudeType' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minInclusive='-180.0' maxExclusive='180.0'"
	 * @generated
	 */
	EDataType getLongitudeType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	v1Factory getv1Factory();

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
		 * The meta object literal for the '{@link com.topografix.gpx.v1._1.impl.BoundsTypeImpl <em>Bounds Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.topografix.gpx.v1._1.impl.BoundsTypeImpl
		 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getBoundsType()
		 * @generated
		 */
		EClass BOUNDS_TYPE = eINSTANCE.getBoundsType();

		/**
		 * The meta object literal for the '<em><b>Maxlat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDS_TYPE__MAXLAT = eINSTANCE.getBoundsType_Maxlat();

		/**
		 * The meta object literal for the '<em><b>Maxlon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDS_TYPE__MAXLON = eINSTANCE.getBoundsType_Maxlon();

		/**
		 * The meta object literal for the '<em><b>Minlat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDS_TYPE__MINLAT = eINSTANCE.getBoundsType_Minlat();

		/**
		 * The meta object literal for the '<em><b>Minlon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDS_TYPE__MINLON = eINSTANCE.getBoundsType_Minlon();

		/**
		 * The meta object literal for the '{@link com.topografix.gpx.v1._1.impl.CopyrightTypeImpl <em>Copyright Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.topografix.gpx.v1._1.impl.CopyrightTypeImpl
		 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getCopyrightType()
		 * @generated
		 */
		EClass COPYRIGHT_TYPE = eINSTANCE.getCopyrightType();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPYRIGHT_TYPE__YEAR = eINSTANCE.getCopyrightType_Year();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPYRIGHT_TYPE__LICENSE = eINSTANCE.getCopyrightType_License();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPYRIGHT_TYPE__AUTHOR = eINSTANCE.getCopyrightType_Author();

		/**
		 * The meta object literal for the '{@link com.topografix.gpx.v1._1.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.topografix.gpx.v1._1.impl.DocumentRootImpl
		 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Gpx</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GPX = eINSTANCE.getDocumentRoot_Gpx();

		/**
		 * The meta object literal for the '{@link com.topografix.gpx.v1._1.impl.EmailTypeImpl <em>Email Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.topografix.gpx.v1._1.impl.EmailTypeImpl
		 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getEmailType()
		 * @generated
		 */
		EClass EMAIL_TYPE = eINSTANCE.getEmailType();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_TYPE__DOMAIN = eINSTANCE.getEmailType_Domain();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMAIL_TYPE__ID = eINSTANCE.getEmailType_Id();

		/**
		 * The meta object literal for the '{@link com.topografix.gpx.v1._1.impl.ExtensionsTypeImpl <em>Extensions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.topografix.gpx.v1._1.impl.ExtensionsTypeImpl
		 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getExtensionsType()
		 * @generated
		 */
		EClass EXTENSIONS_TYPE = eINSTANCE.getExtensionsType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSIONS_TYPE__ANY = eINSTANCE.getExtensionsType_Any();

		/**
		 * The meta object literal for the '{@link com.topografix.gpx.v1._1.impl.GpxTypeImpl <em>Gpx Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.topografix.gpx.v1._1.impl.GpxTypeImpl
		 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getGpxType()
		 * @generated
		 */
		EClass GPX_TYPE = eINSTANCE.getGpxType();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GPX_TYPE__METADATA = eINSTANCE.getGpxType_Metadata();

		/**
		 * The meta object literal for the '<em><b>Wpt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GPX_TYPE__WPT = eINSTANCE.getGpxType_Wpt();

		/**
		 * The meta object literal for the '<em><b>Rte</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GPX_TYPE__RTE = eINSTANCE.getGpxType_Rte();

		/**
		 * The meta object literal for the '<em><b>Trk</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GPX_TYPE__TRK = eINSTANCE.getGpxType_Trk();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPX_TYPE__TIME = eINSTANCE.getGpxType_Time();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GPX_TYPE__BOUNDS = eINSTANCE.getGpxType_Bounds();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GPX_TYPE__EXTENSIONS = eINSTANCE.getGpxType_Extensions();

		/**
		 * The meta object literal for the '<em><b>Creator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPX_TYPE__CREATOR = eINSTANCE.getGpxType_Creator();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPX_TYPE__VERSION = eINSTANCE.getGpxType_Version();

		/**
		 * The meta object literal for the '{@link com.topografix.gpx.v1._1.impl.LinkTypeImpl <em>Link Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.topografix.gpx.v1._1.impl.LinkTypeImpl
		 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getLinkType()
		 * @generated
		 */
		EClass LINK_TYPE = eINSTANCE.getLinkType();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TYPE__TEXT = eINSTANCE.getLinkType_Text();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TYPE__TYPE = eINSTANCE.getLinkType_Type();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TYPE__HREF = eINSTANCE.getLinkType_Href();

		/**
		 * The meta object literal for the '{@link com.topografix.gpx.v1._1.impl.MetadataTypeImpl <em>Metadata Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.topografix.gpx.v1._1.impl.MetadataTypeImpl
		 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getMetadataType()
		 * @generated
		 */
		EClass METADATA_TYPE = eINSTANCE.getMetadataType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_TYPE__NAME = eINSTANCE.getMetadataType_Name();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_TYPE__DESC = eINSTANCE.getMetadataType_Desc();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA_TYPE__AUTHOR = eINSTANCE.getMetadataType_Author();

		/**
		 * The meta object literal for the '<em><b>Copyright</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA_TYPE__COPYRIGHT = eINSTANCE.getMetadataType_Copyright();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA_TYPE__LINK = eINSTANCE.getMetadataType_Link();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_TYPE__TIME = eINSTANCE.getMetadataType_Time();

		/**
		 * The meta object literal for the '<em><b>Keywords</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_TYPE__KEYWORDS = eINSTANCE.getMetadataType_Keywords();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA_TYPE__BOUNDS = eINSTANCE.getMetadataType_Bounds();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA_TYPE__EXTENSIONS = eINSTANCE.getMetadataType_Extensions();

		/**
		 * The meta object literal for the '{@link com.topografix.gpx.v1._1.impl.PersonTypeImpl <em>Person Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.topografix.gpx.v1._1.impl.PersonTypeImpl
		 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getPersonType()
		 * @generated
		 */
		EClass PERSON_TYPE = eINSTANCE.getPersonType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_TYPE__NAME = eINSTANCE.getPersonType_Name();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_TYPE__EMAIL = eINSTANCE.getPersonType_Email();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON_TYPE__LINK = eINSTANCE.getPersonType_Link();

		/**
		 * The meta object literal for the '{@link com.topografix.gpx.v1._1.impl.PtsegTypeImpl <em>Ptseg Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.topografix.gpx.v1._1.impl.PtsegTypeImpl
		 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getPtsegType()
		 * @generated
		 */
		EClass PTSEG_TYPE = eINSTANCE.getPtsegType();

		/**
		 * The meta object literal for the '<em><b>Pt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTSEG_TYPE__PT = eINSTANCE.getPtsegType_Pt();

		/**
		 * The meta object literal for the '{@link com.topografix.gpx.v1._1.impl.PtTypeImpl <em>Pt Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.topografix.gpx.v1._1.impl.PtTypeImpl
		 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getPtType()
		 * @generated
		 */
		EClass PT_TYPE = eINSTANCE.getPtType();

		/**
		 * The meta object literal for the '<em><b>Ele</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PT_TYPE__ELE = eINSTANCE.getPtType_Ele();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PT_TYPE__TIME = eINSTANCE.getPtType_Time();

		/**
		 * The meta object literal for the '<em><b>Lat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PT_TYPE__LAT = eINSTANCE.getPtType_Lat();

		/**
		 * The meta object literal for the '<em><b>Lon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PT_TYPE__LON = eINSTANCE.getPtType_Lon();

		/**
		 * The meta object literal for the '{@link com.topografix.gpx.v1._1.impl.RteTypeImpl <em>Rte Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.topografix.gpx.v1._1.impl.RteTypeImpl
		 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getRteType()
		 * @generated
		 */
		EClass RTE_TYPE = eINSTANCE.getRteType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTE_TYPE__NAME = eINSTANCE.getRteType_Name();

		/**
		 * The meta object literal for the '<em><b>Cmt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTE_TYPE__CMT = eINSTANCE.getRteType_Cmt();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTE_TYPE__DESC = eINSTANCE.getRteType_Desc();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTE_TYPE__SRC = eINSTANCE.getRteType_Src();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_TYPE__LINK = eINSTANCE.getRteType_Link();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTE_TYPE__NUMBER = eINSTANCE.getRteType_Number();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTE_TYPE__TYPE = eINSTANCE.getRteType_Type();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_TYPE__EXTENSIONS = eINSTANCE.getRteType_Extensions();

		/**
		 * The meta object literal for the '<em><b>Rtept</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RTE_TYPE__RTEPT = eINSTANCE.getRteType_Rtept();

		/**
		 * The meta object literal for the '{@link com.topografix.gpx.v1._1.impl.TrksegTypeImpl <em>Trkseg Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.topografix.gpx.v1._1.impl.TrksegTypeImpl
		 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getTrksegType()
		 * @generated
		 */
		EClass TRKSEG_TYPE = eINSTANCE.getTrksegType();

		/**
		 * The meta object literal for the '<em><b>Trkpt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRKSEG_TYPE__TRKPT = eINSTANCE.getTrksegType_Trkpt();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRKSEG_TYPE__EXTENSIONS = eINSTANCE.getTrksegType_Extensions();

		/**
		 * The meta object literal for the '{@link com.topografix.gpx.v1._1.impl.TrkTypeImpl <em>Trk Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.topografix.gpx.v1._1.impl.TrkTypeImpl
		 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getTrkType()
		 * @generated
		 */
		EClass TRK_TYPE = eINSTANCE.getTrkType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRK_TYPE__NAME = eINSTANCE.getTrkType_Name();

		/**
		 * The meta object literal for the '<em><b>Cmt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRK_TYPE__CMT = eINSTANCE.getTrkType_Cmt();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRK_TYPE__DESC = eINSTANCE.getTrkType_Desc();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRK_TYPE__SRC = eINSTANCE.getTrkType_Src();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRK_TYPE__LINK = eINSTANCE.getTrkType_Link();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRK_TYPE__NUMBER = eINSTANCE.getTrkType_Number();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRK_TYPE__TYPE = eINSTANCE.getTrkType_Type();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRK_TYPE__EXTENSIONS = eINSTANCE.getTrkType_Extensions();

		/**
		 * The meta object literal for the '<em><b>Trkseg</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRK_TYPE__TRKSEG = eINSTANCE.getTrkType_Trkseg();

		/**
		 * The meta object literal for the '{@link com.topografix.gpx.v1._1.impl.WptTypeImpl <em>Wpt Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.topografix.gpx.v1._1.impl.WptTypeImpl
		 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getWptType()
		 * @generated
		 */
		EClass WPT_TYPE = eINSTANCE.getWptType();

		/**
		 * The meta object literal for the '<em><b>Ele</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__ELE = eINSTANCE.getWptType_Ele();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__TIME = eINSTANCE.getWptType_Time();

		/**
		 * The meta object literal for the '<em><b>Magvar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__MAGVAR = eINSTANCE.getWptType_Magvar();

		/**
		 * The meta object literal for the '<em><b>Geoidheight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__GEOIDHEIGHT = eINSTANCE.getWptType_Geoidheight();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__NAME = eINSTANCE.getWptType_Name();

		/**
		 * The meta object literal for the '<em><b>Cmt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__CMT = eINSTANCE.getWptType_Cmt();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__DESC = eINSTANCE.getWptType_Desc();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__SRC = eINSTANCE.getWptType_Src();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WPT_TYPE__LINK = eINSTANCE.getWptType_Link();

		/**
		 * The meta object literal for the '<em><b>Sym</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__SYM = eINSTANCE.getWptType_Sym();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__TYPE = eINSTANCE.getWptType_Type();

		/**
		 * The meta object literal for the '<em><b>Fix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__FIX = eINSTANCE.getWptType_Fix();

		/**
		 * The meta object literal for the '<em><b>Sat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__SAT = eINSTANCE.getWptType_Sat();

		/**
		 * The meta object literal for the '<em><b>Hdop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__HDOP = eINSTANCE.getWptType_Hdop();

		/**
		 * The meta object literal for the '<em><b>Vdop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__VDOP = eINSTANCE.getWptType_Vdop();

		/**
		 * The meta object literal for the '<em><b>Pdop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__PDOP = eINSTANCE.getWptType_Pdop();

		/**
		 * The meta object literal for the '<em><b>Ageofdgpsdata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__AGEOFDGPSDATA = eINSTANCE.getWptType_Ageofdgpsdata();

		/**
		 * The meta object literal for the '<em><b>Dgpsid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__DGPSID = eINSTANCE.getWptType_Dgpsid();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WPT_TYPE__EXTENSIONS = eINSTANCE.getWptType_Extensions();

		/**
		 * The meta object literal for the '<em><b>Lat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__LAT = eINSTANCE.getWptType_Lat();

		/**
		 * The meta object literal for the '<em><b>Lon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WPT_TYPE__LON = eINSTANCE.getWptType_Lon();

		/**
		 * The meta object literal for the '{@link com.topografix.gpx.v1._1.FixType <em>Fix Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.topografix.gpx.v1._1.FixType
		 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getFixType()
		 * @generated
		 */
		EEnum FIX_TYPE = eINSTANCE.getFixType();

		/**
		 * The meta object literal for the '<em>Degrees Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getDegreesType()
		 * @generated
		 */
		EDataType DEGREES_TYPE = eINSTANCE.getDegreesType();

		/**
		 * The meta object literal for the '<em>Dgps Station Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getDgpsStationType()
		 * @generated
		 */
		EDataType DGPS_STATION_TYPE = eINSTANCE.getDgpsStationType();

		/**
		 * The meta object literal for the '<em>Fix Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.topografix.gpx.v1._1.FixType
		 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getFixTypeObject()
		 * @generated
		 */
		EDataType FIX_TYPE_OBJECT = eINSTANCE.getFixTypeObject();

		/**
		 * The meta object literal for the '<em>Latitude Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getLatitudeType()
		 * @generated
		 */
		EDataType LATITUDE_TYPE = eINSTANCE.getLatitudeType();

		/**
		 * The meta object literal for the '<em>Longitude Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see com.topografix.gpx.v1._1.impl.v1PackageImpl#getLongitudeType()
		 * @generated
		 */
		EDataType LONGITUDE_TYPE = eINSTANCE.getLongitudeType();

	}

} //v1Package
