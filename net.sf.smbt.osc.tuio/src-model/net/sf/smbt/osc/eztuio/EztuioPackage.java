/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.eztuio;

import net.sf.smbt.osccmd.OsccmdPackage;
import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see net.sf.smbt.osc.eztuio.EztuioFactory
 * @model kind="package"
 * @generated
 */
public interface EztuioPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eztuio";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eztuio/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eztuio";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EztuioPackage eINSTANCE = net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio.impl.Tuio2DObjImpl <em>Tuio2 DObj</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio.impl.Tuio2DObjImpl
	 * @see net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl#getTuio2DObj()
	 * @generated
	 */
	int TUIO2_DOBJ = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ__PRIORITY = OsccmdPackage.OSC_RCV_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ__STAMP = OsccmdPackage.OSC_RCV_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ__MSG = OsccmdPackage.OSC_RCV_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ__SID = OsccmdPackage.OSC_RCV_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ__FID = OsccmdPackage.OSC_RCV_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Xpos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ__XPOS = OsccmdPackage.OSC_RCV_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ypos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ__YPOS = OsccmdPackage.OSC_RCV_CMD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ__ANGLE = OsccmdPackage.OSC_RCV_CMD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Xspeed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ__XSPEED = OsccmdPackage.OSC_RCV_CMD_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Yspeed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ__YSPEED = OsccmdPackage.OSC_RCV_CMD_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Rspeed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ__RSPEED = OsccmdPackage.OSC_RCV_CMD_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Maccel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ__MACCEL = OsccmdPackage.OSC_RCV_CMD_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Raccel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ__RACCEL = OsccmdPackage.OSC_RCV_CMD_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Tuio Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ__TUIO_OBJECT = OsccmdPackage.OSC_RCV_CMD_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Update Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ__UPDATE_TIME = OsccmdPackage.OSC_RCV_CMD_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ__STATE = OsccmdPackage.OSC_RCV_CMD_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Tuio2 DObj</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_FEATURE_COUNT = OsccmdPackage.OSC_RCV_CMD_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio.impl.Tuio2DCurImpl <em>Tuio2 DCur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio.impl.Tuio2DCurImpl
	 * @see net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl#getTuio2DCur()
	 * @generated
	 */
	int TUIO2_DCUR = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR__PRIORITY = OsccmdPackage.OSC_RCV_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR__STAMP = OsccmdPackage.OSC_RCV_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR__MSG = OsccmdPackage.OSC_RCV_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR__SID = OsccmdPackage.OSC_RCV_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Xpos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR__XPOS = OsccmdPackage.OSC_RCV_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ypos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR__YPOS = OsccmdPackage.OSC_RCV_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Xspeed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR__XSPEED = OsccmdPackage.OSC_RCV_CMD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Yspeed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR__YSPEED = OsccmdPackage.OSC_RCV_CMD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Maccel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR__MACCEL = OsccmdPackage.OSC_RCV_CMD_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Tuio Cursor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR__TUIO_CURSOR = OsccmdPackage.OSC_RCV_CMD_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Update Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR__UPDATE_TIME = OsccmdPackage.OSC_RCV_CMD_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR__STATE = OsccmdPackage.OSC_RCV_CMD_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Tuio2 DCur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_FEATURE_COUNT = OsccmdPackage.OSC_RCV_CMD_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio.impl.Tuio3DObjImpl <em>Tuio3 DObj</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio.impl.Tuio3DObjImpl
	 * @see net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl#getTuio3DObj()
	 * @generated
	 */
	int TUIO3_DOBJ = 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO3_DOBJ__PRIORITY = OsccmdPackage.OSC_RCV_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO3_DOBJ__STAMP = OsccmdPackage.OSC_RCV_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO3_DOBJ__MSG = OsccmdPackage.OSC_RCV_CMD__MSG;

	/**
	 * The number of structural features of the '<em>Tuio3 DObj</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO3_DOBJ_FEATURE_COUNT = OsccmdPackage.OSC_RCV_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio.impl.Tuio3DCurImpl <em>Tuio3 DCur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio.impl.Tuio3DCurImpl
	 * @see net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl#getTuio3DCur()
	 * @generated
	 */
	int TUIO3_DCUR = 3;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO3_DCUR__PRIORITY = OsccmdPackage.OSC_RCV_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO3_DCUR__STAMP = OsccmdPackage.OSC_RCV_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO3_DCUR__MSG = OsccmdPackage.OSC_RCV_CMD__MSG;

	/**
	 * The number of structural features of the '<em>Tuio3 DCur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO3_DCUR_FEATURE_COUNT = OsccmdPackage.OSC_RCV_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio.impl.Tuio25ObjImpl <em>Tuio25 Obj</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio.impl.Tuio25ObjImpl
	 * @see net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl#getTuio25Obj()
	 * @generated
	 */
	int TUIO25_OBJ = 4;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO25_OBJ__PRIORITY = OsccmdPackage.OSC_RCV_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO25_OBJ__STAMP = OsccmdPackage.OSC_RCV_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO25_OBJ__MSG = OsccmdPackage.OSC_RCV_CMD__MSG;

	/**
	 * The number of structural features of the '<em>Tuio25 Obj</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO25_OBJ_FEATURE_COUNT = OsccmdPackage.OSC_RCV_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio.impl.Tuio25CurImpl <em>Tuio25 Cur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio.impl.Tuio25CurImpl
	 * @see net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl#getTuio25Cur()
	 * @generated
	 */
	int TUIO25_CUR = 5;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO25_CUR__PRIORITY = OsccmdPackage.OSC_RCV_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO25_CUR__STAMP = OsccmdPackage.OSC_RCV_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO25_CUR__MSG = OsccmdPackage.OSC_RCV_CMD__MSG;

	/**
	 * The number of structural features of the '<em>Tuio25 Cur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO25_CUR_FEATURE_COUNT = OsccmdPackage.OSC_RCV_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio.impl.Tuio2DBlobImpl <em>Tuio2 DBlob</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio.impl.Tuio2DBlobImpl
	 * @see net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl#getTuio2DBlob()
	 * @generated
	 */
	int TUIO2_DBLOB = 6;

	/**
	 * The number of structural features of the '<em>Tuio2 DBlob</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DBLOB_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio.impl.Tuio3DBlobImpl <em>Tuio3 DBlob</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio.impl.Tuio3DBlobImpl
	 * @see net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl#getTuio3DBlob()
	 * @generated
	 */
	int TUIO3_DBLOB = 7;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO3_DBLOB__PRIORITY = OsccmdPackage.OSC_RCV_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO3_DBLOB__STAMP = OsccmdPackage.OSC_RCV_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO3_DBLOB__MSG = OsccmdPackage.OSC_RCV_CMD__MSG;

	/**
	 * The number of structural features of the '<em>Tuio3 DBlob</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO3_DBLOB_FEATURE_COUNT = OsccmdPackage.OSC_RCV_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio.impl.Tuio25BlobImpl <em>Tuio25 Blob</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio.impl.Tuio25BlobImpl
	 * @see net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl#getTuio25Blob()
	 * @generated
	 */
	int TUIO25_BLOB = 8;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO25_BLOB__PRIORITY = OsccmdPackage.OSC_RCV_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO25_BLOB__STAMP = OsccmdPackage.OSC_RCV_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO25_BLOB__MSG = OsccmdPackage.OSC_RCV_CMD__MSG;

	/**
	 * The number of structural features of the '<em>Tuio25 Blob</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO25_BLOB_FEATURE_COUNT = OsccmdPackage.OSC_RCV_CMD_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio.impl.Tuio2DObjAddImpl <em>Tuio2 DObj Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio.impl.Tuio2DObjAddImpl
	 * @see net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl#getTuio2DObjAdd()
	 * @generated
	 */
	int TUIO2_DOBJ_ADD = 9;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_ADD__PRIORITY = TUIO2_DOBJ__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_ADD__STAMP = TUIO2_DOBJ__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_ADD__MSG = TUIO2_DOBJ__MSG;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_ADD__SID = TUIO2_DOBJ__SID;

	/**
	 * The feature id for the '<em><b>Fid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_ADD__FID = TUIO2_DOBJ__FID;

	/**
	 * The feature id for the '<em><b>Xpos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_ADD__XPOS = TUIO2_DOBJ__XPOS;

	/**
	 * The feature id for the '<em><b>Ypos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_ADD__YPOS = TUIO2_DOBJ__YPOS;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_ADD__ANGLE = TUIO2_DOBJ__ANGLE;

	/**
	 * The feature id for the '<em><b>Xspeed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_ADD__XSPEED = TUIO2_DOBJ__XSPEED;

	/**
	 * The feature id for the '<em><b>Yspeed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_ADD__YSPEED = TUIO2_DOBJ__YSPEED;

	/**
	 * The feature id for the '<em><b>Rspeed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_ADD__RSPEED = TUIO2_DOBJ__RSPEED;

	/**
	 * The feature id for the '<em><b>Maccel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_ADD__MACCEL = TUIO2_DOBJ__MACCEL;

	/**
	 * The feature id for the '<em><b>Raccel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_ADD__RACCEL = TUIO2_DOBJ__RACCEL;

	/**
	 * The feature id for the '<em><b>Tuio Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_ADD__TUIO_OBJECT = TUIO2_DOBJ__TUIO_OBJECT;

	/**
	 * The feature id for the '<em><b>Update Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_ADD__UPDATE_TIME = TUIO2_DOBJ__UPDATE_TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_ADD__STATE = TUIO2_DOBJ__STATE;

	/**
	 * The number of structural features of the '<em>Tuio2 DObj Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_ADD_FEATURE_COUNT = TUIO2_DOBJ_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio.impl.Tuio2DObjUpdateImpl <em>Tuio2 DObj Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio.impl.Tuio2DObjUpdateImpl
	 * @see net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl#getTuio2DObjUpdate()
	 * @generated
	 */
	int TUIO2_DOBJ_UPDATE = 10;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_UPDATE__PRIORITY = TUIO2_DOBJ__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_UPDATE__STAMP = TUIO2_DOBJ__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_UPDATE__MSG = TUIO2_DOBJ__MSG;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_UPDATE__SID = TUIO2_DOBJ__SID;

	/**
	 * The feature id for the '<em><b>Fid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_UPDATE__FID = TUIO2_DOBJ__FID;

	/**
	 * The feature id for the '<em><b>Xpos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_UPDATE__XPOS = TUIO2_DOBJ__XPOS;

	/**
	 * The feature id for the '<em><b>Ypos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_UPDATE__YPOS = TUIO2_DOBJ__YPOS;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_UPDATE__ANGLE = TUIO2_DOBJ__ANGLE;

	/**
	 * The feature id for the '<em><b>Xspeed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_UPDATE__XSPEED = TUIO2_DOBJ__XSPEED;

	/**
	 * The feature id for the '<em><b>Yspeed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_UPDATE__YSPEED = TUIO2_DOBJ__YSPEED;

	/**
	 * The feature id for the '<em><b>Rspeed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_UPDATE__RSPEED = TUIO2_DOBJ__RSPEED;

	/**
	 * The feature id for the '<em><b>Maccel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_UPDATE__MACCEL = TUIO2_DOBJ__MACCEL;

	/**
	 * The feature id for the '<em><b>Raccel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_UPDATE__RACCEL = TUIO2_DOBJ__RACCEL;

	/**
	 * The feature id for the '<em><b>Tuio Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_UPDATE__TUIO_OBJECT = TUIO2_DOBJ__TUIO_OBJECT;

	/**
	 * The feature id for the '<em><b>Update Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_UPDATE__UPDATE_TIME = TUIO2_DOBJ__UPDATE_TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_UPDATE__STATE = TUIO2_DOBJ__STATE;

	/**
	 * The number of structural features of the '<em>Tuio2 DObj Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_UPDATE_FEATURE_COUNT = TUIO2_DOBJ_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio.impl.Tuio2DObjRemoveImpl <em>Tuio2 DObj Remove</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio.impl.Tuio2DObjRemoveImpl
	 * @see net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl#getTuio2DObjRemove()
	 * @generated
	 */
	int TUIO2_DOBJ_REMOVE = 11;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_REMOVE__PRIORITY = TUIO2_DOBJ__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_REMOVE__STAMP = TUIO2_DOBJ__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_REMOVE__MSG = TUIO2_DOBJ__MSG;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_REMOVE__SID = TUIO2_DOBJ__SID;

	/**
	 * The feature id for the '<em><b>Fid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_REMOVE__FID = TUIO2_DOBJ__FID;

	/**
	 * The feature id for the '<em><b>Xpos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_REMOVE__XPOS = TUIO2_DOBJ__XPOS;

	/**
	 * The feature id for the '<em><b>Ypos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_REMOVE__YPOS = TUIO2_DOBJ__YPOS;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_REMOVE__ANGLE = TUIO2_DOBJ__ANGLE;

	/**
	 * The feature id for the '<em><b>Xspeed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_REMOVE__XSPEED = TUIO2_DOBJ__XSPEED;

	/**
	 * The feature id for the '<em><b>Yspeed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_REMOVE__YSPEED = TUIO2_DOBJ__YSPEED;

	/**
	 * The feature id for the '<em><b>Rspeed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_REMOVE__RSPEED = TUIO2_DOBJ__RSPEED;

	/**
	 * The feature id for the '<em><b>Maccel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_REMOVE__MACCEL = TUIO2_DOBJ__MACCEL;

	/**
	 * The feature id for the '<em><b>Raccel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_REMOVE__RACCEL = TUIO2_DOBJ__RACCEL;

	/**
	 * The feature id for the '<em><b>Tuio Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_REMOVE__TUIO_OBJECT = TUIO2_DOBJ__TUIO_OBJECT;

	/**
	 * The feature id for the '<em><b>Update Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_REMOVE__UPDATE_TIME = TUIO2_DOBJ__UPDATE_TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_REMOVE__STATE = TUIO2_DOBJ__STATE;

	/**
	 * The number of structural features of the '<em>Tuio2 DObj Remove</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DOBJ_REMOVE_FEATURE_COUNT = TUIO2_DOBJ_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio.impl.Tuio2DCurAddImpl <em>Tuio2 DCur Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio.impl.Tuio2DCurAddImpl
	 * @see net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl#getTuio2DCurAdd()
	 * @generated
	 */
	int TUIO2_DCUR_ADD = 12;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_ADD__PRIORITY = TUIO2_DCUR__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_ADD__STAMP = TUIO2_DCUR__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_ADD__MSG = TUIO2_DCUR__MSG;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_ADD__SID = TUIO2_DCUR__SID;

	/**
	 * The feature id for the '<em><b>Xpos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_ADD__XPOS = TUIO2_DCUR__XPOS;

	/**
	 * The feature id for the '<em><b>Ypos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_ADD__YPOS = TUIO2_DCUR__YPOS;

	/**
	 * The feature id for the '<em><b>Xspeed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_ADD__XSPEED = TUIO2_DCUR__XSPEED;

	/**
	 * The feature id for the '<em><b>Yspeed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_ADD__YSPEED = TUIO2_DCUR__YSPEED;

	/**
	 * The feature id for the '<em><b>Maccel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_ADD__MACCEL = TUIO2_DCUR__MACCEL;

	/**
	 * The feature id for the '<em><b>Tuio Cursor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_ADD__TUIO_CURSOR = TUIO2_DCUR__TUIO_CURSOR;

	/**
	 * The feature id for the '<em><b>Update Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_ADD__UPDATE_TIME = TUIO2_DCUR__UPDATE_TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_ADD__STATE = TUIO2_DCUR__STATE;

	/**
	 * The number of structural features of the '<em>Tuio2 DCur Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_ADD_FEATURE_COUNT = TUIO2_DCUR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio.impl.Tuio2DCurUpdateImpl <em>Tuio2 DCur Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio.impl.Tuio2DCurUpdateImpl
	 * @see net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl#getTuio2DCurUpdate()
	 * @generated
	 */
	int TUIO2_DCUR_UPDATE = 13;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_UPDATE__PRIORITY = TUIO2_DCUR__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_UPDATE__STAMP = TUIO2_DCUR__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_UPDATE__MSG = TUIO2_DCUR__MSG;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_UPDATE__SID = TUIO2_DCUR__SID;

	/**
	 * The feature id for the '<em><b>Xpos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_UPDATE__XPOS = TUIO2_DCUR__XPOS;

	/**
	 * The feature id for the '<em><b>Ypos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_UPDATE__YPOS = TUIO2_DCUR__YPOS;

	/**
	 * The feature id for the '<em><b>Xspeed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_UPDATE__XSPEED = TUIO2_DCUR__XSPEED;

	/**
	 * The feature id for the '<em><b>Yspeed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_UPDATE__YSPEED = TUIO2_DCUR__YSPEED;

	/**
	 * The feature id for the '<em><b>Maccel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_UPDATE__MACCEL = TUIO2_DCUR__MACCEL;

	/**
	 * The feature id for the '<em><b>Tuio Cursor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_UPDATE__TUIO_CURSOR = TUIO2_DCUR__TUIO_CURSOR;

	/**
	 * The feature id for the '<em><b>Update Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_UPDATE__UPDATE_TIME = TUIO2_DCUR__UPDATE_TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_UPDATE__STATE = TUIO2_DCUR__STATE;

	/**
	 * The number of structural features of the '<em>Tuio2 DCur Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_UPDATE_FEATURE_COUNT = TUIO2_DCUR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio.impl.Tuio2DCurRemoveImpl <em>Tuio2 DCur Remove</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio.impl.Tuio2DCurRemoveImpl
	 * @see net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl#getTuio2DCurRemove()
	 * @generated
	 */
	int TUIO2_DCUR_REMOVE = 14;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_REMOVE__PRIORITY = TUIO2_DCUR__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_REMOVE__STAMP = TUIO2_DCUR__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_REMOVE__MSG = TUIO2_DCUR__MSG;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_REMOVE__SID = TUIO2_DCUR__SID;

	/**
	 * The feature id for the '<em><b>Xpos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_REMOVE__XPOS = TUIO2_DCUR__XPOS;

	/**
	 * The feature id for the '<em><b>Ypos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_REMOVE__YPOS = TUIO2_DCUR__YPOS;

	/**
	 * The feature id for the '<em><b>Xspeed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_REMOVE__XSPEED = TUIO2_DCUR__XSPEED;

	/**
	 * The feature id for the '<em><b>Yspeed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_REMOVE__YSPEED = TUIO2_DCUR__YSPEED;

	/**
	 * The feature id for the '<em><b>Maccel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_REMOVE__MACCEL = TUIO2_DCUR__MACCEL;

	/**
	 * The feature id for the '<em><b>Tuio Cursor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_REMOVE__TUIO_CURSOR = TUIO2_DCUR__TUIO_CURSOR;

	/**
	 * The feature id for the '<em><b>Update Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_REMOVE__UPDATE_TIME = TUIO2_DCUR__UPDATE_TIME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_REMOVE__STATE = TUIO2_DCUR__STATE;

	/**
	 * The number of structural features of the '<em>Tuio2 DCur Remove</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DCUR_REMOVE_FEATURE_COUNT = TUIO2_DCUR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio.impl.TuioBundleImpl <em>Tuio Bundle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio.impl.TuioBundleImpl
	 * @see net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl#getTuioBundle()
	 * @generated
	 */
	int TUIO_BUNDLE = 15;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO_BUNDLE__PRIORITY = CmdPackage.COMPOUND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO_BUNDLE__STAMP = CmdPackage.COMPOUND_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO_BUNDLE__CHILDREN = CmdPackage.COMPOUND_CMD__CHILDREN;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO_BUNDLE__TIME = CmdPackage.COMPOUND_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tuio Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO_BUNDLE_FEATURE_COUNT = CmdPackage.COMPOUND_CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio.STATE <em>STATE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio.STATE
	 * @see net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl#getSTATE()
	 * @generated
	 */
	int STATE = 16;

	/**
	 * The meta object id for the '<em>Tuio Cursor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.reactivision.tuio.TuioCursor
	 * @see net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl#getTuioCursor()
	 * @generated
	 */
	int TUIO_CURSOR = 17;

	/**
	 * The meta object id for the '<em>Tuio Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.reactivision.tuio.TuioObject
	 * @see net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl#getTuioObject()
	 * @generated
	 */
	int TUIO_OBJECT = 18;

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio.Tuio2DObj <em>Tuio2 DObj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio2 DObj</em>'.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DObj
	 * @generated
	 */
	EClass getTuio2DObj();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio.Tuio2DObj#getS_id <em>Sid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sid</em>'.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DObj#getS_id()
	 * @see #getTuio2DObj()
	 * @generated
	 */
	EAttribute getTuio2DObj_S_id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio.Tuio2DObj#getF_id <em>Fid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fid</em>'.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DObj#getF_id()
	 * @see #getTuio2DObj()
	 * @generated
	 */
	EAttribute getTuio2DObj_F_id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio.Tuio2DObj#getXpos <em>Xpos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xpos</em>'.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DObj#getXpos()
	 * @see #getTuio2DObj()
	 * @generated
	 */
	EAttribute getTuio2DObj_Xpos();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio.Tuio2DObj#getYpos <em>Ypos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ypos</em>'.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DObj#getYpos()
	 * @see #getTuio2DObj()
	 * @generated
	 */
	EAttribute getTuio2DObj_Ypos();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio.Tuio2DObj#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DObj#getAngle()
	 * @see #getTuio2DObj()
	 * @generated
	 */
	EAttribute getTuio2DObj_Angle();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio.Tuio2DObj#getXspeed <em>Xspeed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xspeed</em>'.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DObj#getXspeed()
	 * @see #getTuio2DObj()
	 * @generated
	 */
	EAttribute getTuio2DObj_Xspeed();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio.Tuio2DObj#getYspeed <em>Yspeed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yspeed</em>'.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DObj#getYspeed()
	 * @see #getTuio2DObj()
	 * @generated
	 */
	EAttribute getTuio2DObj_Yspeed();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio.Tuio2DObj#getRspeed <em>Rspeed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rspeed</em>'.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DObj#getRspeed()
	 * @see #getTuio2DObj()
	 * @generated
	 */
	EAttribute getTuio2DObj_Rspeed();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio.Tuio2DObj#getMaccel <em>Maccel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maccel</em>'.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DObj#getMaccel()
	 * @see #getTuio2DObj()
	 * @generated
	 */
	EAttribute getTuio2DObj_Maccel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio.Tuio2DObj#getRaccel <em>Raccel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raccel</em>'.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DObj#getRaccel()
	 * @see #getTuio2DObj()
	 * @generated
	 */
	EAttribute getTuio2DObj_Raccel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio.Tuio2DObj#getTuioObject <em>Tuio Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tuio Object</em>'.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DObj#getTuioObject()
	 * @see #getTuio2DObj()
	 * @generated
	 */
	EAttribute getTuio2DObj_TuioObject();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio.Tuio2DObj#getUpdateTime <em>Update Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Time</em>'.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DObj#getUpdateTime()
	 * @see #getTuio2DObj()
	 * @generated
	 */
	EAttribute getTuio2DObj_UpdateTime();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio.Tuio2DObj#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DObj#getState()
	 * @see #getTuio2DObj()
	 * @generated
	 */
	EAttribute getTuio2DObj_State();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio.Tuio2DCur <em>Tuio2 DCur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio2 DCur</em>'.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DCur
	 * @generated
	 */
	EClass getTuio2DCur();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio.Tuio2DCur#getS_id <em>Sid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sid</em>'.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DCur#getS_id()
	 * @see #getTuio2DCur()
	 * @generated
	 */
	EAttribute getTuio2DCur_S_id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio.Tuio2DCur#getXpos <em>Xpos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xpos</em>'.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DCur#getXpos()
	 * @see #getTuio2DCur()
	 * @generated
	 */
	EAttribute getTuio2DCur_Xpos();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio.Tuio2DCur#getYpos <em>Ypos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ypos</em>'.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DCur#getYpos()
	 * @see #getTuio2DCur()
	 * @generated
	 */
	EAttribute getTuio2DCur_Ypos();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio.Tuio2DCur#getXspeed <em>Xspeed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xspeed</em>'.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DCur#getXspeed()
	 * @see #getTuio2DCur()
	 * @generated
	 */
	EAttribute getTuio2DCur_Xspeed();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio.Tuio2DCur#getYspeed <em>Yspeed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yspeed</em>'.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DCur#getYspeed()
	 * @see #getTuio2DCur()
	 * @generated
	 */
	EAttribute getTuio2DCur_Yspeed();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio.Tuio2DCur#getMaccel <em>Maccel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maccel</em>'.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DCur#getMaccel()
	 * @see #getTuio2DCur()
	 * @generated
	 */
	EAttribute getTuio2DCur_Maccel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio.Tuio2DCur#getTuioCursor <em>Tuio Cursor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tuio Cursor</em>'.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DCur#getTuioCursor()
	 * @see #getTuio2DCur()
	 * @generated
	 */
	EAttribute getTuio2DCur_TuioCursor();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio.Tuio2DCur#getUpdateTime <em>Update Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Time</em>'.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DCur#getUpdateTime()
	 * @see #getTuio2DCur()
	 * @generated
	 */
	EAttribute getTuio2DCur_UpdateTime();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio.Tuio2DCur#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DCur#getState()
	 * @see #getTuio2DCur()
	 * @generated
	 */
	EAttribute getTuio2DCur_State();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio.Tuio3DObj <em>Tuio3 DObj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio3 DObj</em>'.
	 * @see net.sf.smbt.osc.eztuio.Tuio3DObj
	 * @generated
	 */
	EClass getTuio3DObj();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio.Tuio3DCur <em>Tuio3 DCur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio3 DCur</em>'.
	 * @see net.sf.smbt.osc.eztuio.Tuio3DCur
	 * @generated
	 */
	EClass getTuio3DCur();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio.Tuio25Obj <em>Tuio25 Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio25 Obj</em>'.
	 * @see net.sf.smbt.osc.eztuio.Tuio25Obj
	 * @generated
	 */
	EClass getTuio25Obj();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio.Tuio25Cur <em>Tuio25 Cur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio25 Cur</em>'.
	 * @see net.sf.smbt.osc.eztuio.Tuio25Cur
	 * @generated
	 */
	EClass getTuio25Cur();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio.Tuio2DBlob <em>Tuio2 DBlob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio2 DBlob</em>'.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DBlob
	 * @generated
	 */
	EClass getTuio2DBlob();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio.Tuio3DBlob <em>Tuio3 DBlob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio3 DBlob</em>'.
	 * @see net.sf.smbt.osc.eztuio.Tuio3DBlob
	 * @generated
	 */
	EClass getTuio3DBlob();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio.Tuio25Blob <em>Tuio25 Blob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio25 Blob</em>'.
	 * @see net.sf.smbt.osc.eztuio.Tuio25Blob
	 * @generated
	 */
	EClass getTuio25Blob();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio.Tuio2DObjAdd <em>Tuio2 DObj Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio2 DObj Add</em>'.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DObjAdd
	 * @generated
	 */
	EClass getTuio2DObjAdd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio.Tuio2DObjUpdate <em>Tuio2 DObj Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio2 DObj Update</em>'.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DObjUpdate
	 * @generated
	 */
	EClass getTuio2DObjUpdate();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio.Tuio2DObjRemove <em>Tuio2 DObj Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio2 DObj Remove</em>'.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DObjRemove
	 * @generated
	 */
	EClass getTuio2DObjRemove();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio.Tuio2DCurAdd <em>Tuio2 DCur Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio2 DCur Add</em>'.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DCurAdd
	 * @generated
	 */
	EClass getTuio2DCurAdd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio.Tuio2DCurUpdate <em>Tuio2 DCur Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio2 DCur Update</em>'.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DCurUpdate
	 * @generated
	 */
	EClass getTuio2DCurUpdate();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio.Tuio2DCurRemove <em>Tuio2 DCur Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio2 DCur Remove</em>'.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DCurRemove
	 * @generated
	 */
	EClass getTuio2DCurRemove();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio.TuioBundle <em>Tuio Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio Bundle</em>'.
	 * @see net.sf.smbt.osc.eztuio.TuioBundle
	 * @generated
	 */
	EClass getTuioBundle();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio.TuioBundle#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see net.sf.smbt.osc.eztuio.TuioBundle#getTime()
	 * @see #getTuioBundle()
	 * @generated
	 */
	EAttribute getTuioBundle_Time();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.osc.eztuio.STATE <em>STATE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>STATE</em>'.
	 * @see net.sf.smbt.osc.eztuio.STATE
	 * @generated
	 */
	EEnum getSTATE();

	/**
	 * Returns the meta object for data type '{@link net.sf.reactivision.tuio.TuioCursor <em>Tuio Cursor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Tuio Cursor</em>'.
	 * @see net.sf.reactivision.tuio.TuioCursor
	 * @model instanceClass="net.sf.reactivision.tuio.TuioCursor"
	 * @generated
	 */
	EDataType getTuioCursor();

	/**
	 * Returns the meta object for data type '{@link net.sf.reactivision.tuio.TuioObject <em>Tuio Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Tuio Object</em>'.
	 * @see net.sf.reactivision.tuio.TuioObject
	 * @model instanceClass="net.sf.reactivision.tuio.TuioObject"
	 * @generated
	 */
	EDataType getTuioObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EztuioFactory getEztuioFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio.impl.Tuio2DObjImpl <em>Tuio2 DObj</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio.impl.Tuio2DObjImpl
		 * @see net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl#getTuio2DObj()
		 * @generated
		 */
		EClass TUIO2_DOBJ = eINSTANCE.getTuio2DObj();

		/**
		 * The meta object literal for the '<em><b>Sid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_DOBJ__SID = eINSTANCE.getTuio2DObj_S_id();

		/**
		 * The meta object literal for the '<em><b>Fid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_DOBJ__FID = eINSTANCE.getTuio2DObj_F_id();

		/**
		 * The meta object literal for the '<em><b>Xpos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_DOBJ__XPOS = eINSTANCE.getTuio2DObj_Xpos();

		/**
		 * The meta object literal for the '<em><b>Ypos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_DOBJ__YPOS = eINSTANCE.getTuio2DObj_Ypos();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_DOBJ__ANGLE = eINSTANCE.getTuio2DObj_Angle();

		/**
		 * The meta object literal for the '<em><b>Xspeed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_DOBJ__XSPEED = eINSTANCE.getTuio2DObj_Xspeed();

		/**
		 * The meta object literal for the '<em><b>Yspeed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_DOBJ__YSPEED = eINSTANCE.getTuio2DObj_Yspeed();

		/**
		 * The meta object literal for the '<em><b>Rspeed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_DOBJ__RSPEED = eINSTANCE.getTuio2DObj_Rspeed();

		/**
		 * The meta object literal for the '<em><b>Maccel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_DOBJ__MACCEL = eINSTANCE.getTuio2DObj_Maccel();

		/**
		 * The meta object literal for the '<em><b>Raccel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_DOBJ__RACCEL = eINSTANCE.getTuio2DObj_Raccel();

		/**
		 * The meta object literal for the '<em><b>Tuio Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_DOBJ__TUIO_OBJECT = eINSTANCE.getTuio2DObj_TuioObject();

		/**
		 * The meta object literal for the '<em><b>Update Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_DOBJ__UPDATE_TIME = eINSTANCE.getTuio2DObj_UpdateTime();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_DOBJ__STATE = eINSTANCE.getTuio2DObj_State();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio.impl.Tuio2DCurImpl <em>Tuio2 DCur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio.impl.Tuio2DCurImpl
		 * @see net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl#getTuio2DCur()
		 * @generated
		 */
		EClass TUIO2_DCUR = eINSTANCE.getTuio2DCur();

		/**
		 * The meta object literal for the '<em><b>Sid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_DCUR__SID = eINSTANCE.getTuio2DCur_S_id();

		/**
		 * The meta object literal for the '<em><b>Xpos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_DCUR__XPOS = eINSTANCE.getTuio2DCur_Xpos();

		/**
		 * The meta object literal for the '<em><b>Ypos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_DCUR__YPOS = eINSTANCE.getTuio2DCur_Ypos();

		/**
		 * The meta object literal for the '<em><b>Xspeed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_DCUR__XSPEED = eINSTANCE.getTuio2DCur_Xspeed();

		/**
		 * The meta object literal for the '<em><b>Yspeed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_DCUR__YSPEED = eINSTANCE.getTuio2DCur_Yspeed();

		/**
		 * The meta object literal for the '<em><b>Maccel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_DCUR__MACCEL = eINSTANCE.getTuio2DCur_Maccel();

		/**
		 * The meta object literal for the '<em><b>Tuio Cursor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_DCUR__TUIO_CURSOR = eINSTANCE.getTuio2DCur_TuioCursor();

		/**
		 * The meta object literal for the '<em><b>Update Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_DCUR__UPDATE_TIME = eINSTANCE.getTuio2DCur_UpdateTime();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_DCUR__STATE = eINSTANCE.getTuio2DCur_State();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio.impl.Tuio3DObjImpl <em>Tuio3 DObj</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio.impl.Tuio3DObjImpl
		 * @see net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl#getTuio3DObj()
		 * @generated
		 */
		EClass TUIO3_DOBJ = eINSTANCE.getTuio3DObj();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio.impl.Tuio3DCurImpl <em>Tuio3 DCur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio.impl.Tuio3DCurImpl
		 * @see net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl#getTuio3DCur()
		 * @generated
		 */
		EClass TUIO3_DCUR = eINSTANCE.getTuio3DCur();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio.impl.Tuio25ObjImpl <em>Tuio25 Obj</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio.impl.Tuio25ObjImpl
		 * @see net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl#getTuio25Obj()
		 * @generated
		 */
		EClass TUIO25_OBJ = eINSTANCE.getTuio25Obj();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio.impl.Tuio25CurImpl <em>Tuio25 Cur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio.impl.Tuio25CurImpl
		 * @see net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl#getTuio25Cur()
		 * @generated
		 */
		EClass TUIO25_CUR = eINSTANCE.getTuio25Cur();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio.impl.Tuio2DBlobImpl <em>Tuio2 DBlob</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio.impl.Tuio2DBlobImpl
		 * @see net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl#getTuio2DBlob()
		 * @generated
		 */
		EClass TUIO2_DBLOB = eINSTANCE.getTuio2DBlob();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio.impl.Tuio3DBlobImpl <em>Tuio3 DBlob</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio.impl.Tuio3DBlobImpl
		 * @see net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl#getTuio3DBlob()
		 * @generated
		 */
		EClass TUIO3_DBLOB = eINSTANCE.getTuio3DBlob();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio.impl.Tuio25BlobImpl <em>Tuio25 Blob</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio.impl.Tuio25BlobImpl
		 * @see net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl#getTuio25Blob()
		 * @generated
		 */
		EClass TUIO25_BLOB = eINSTANCE.getTuio25Blob();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio.impl.Tuio2DObjAddImpl <em>Tuio2 DObj Add</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio.impl.Tuio2DObjAddImpl
		 * @see net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl#getTuio2DObjAdd()
		 * @generated
		 */
		EClass TUIO2_DOBJ_ADD = eINSTANCE.getTuio2DObjAdd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio.impl.Tuio2DObjUpdateImpl <em>Tuio2 DObj Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio.impl.Tuio2DObjUpdateImpl
		 * @see net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl#getTuio2DObjUpdate()
		 * @generated
		 */
		EClass TUIO2_DOBJ_UPDATE = eINSTANCE.getTuio2DObjUpdate();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio.impl.Tuio2DObjRemoveImpl <em>Tuio2 DObj Remove</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio.impl.Tuio2DObjRemoveImpl
		 * @see net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl#getTuio2DObjRemove()
		 * @generated
		 */
		EClass TUIO2_DOBJ_REMOVE = eINSTANCE.getTuio2DObjRemove();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio.impl.Tuio2DCurAddImpl <em>Tuio2 DCur Add</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio.impl.Tuio2DCurAddImpl
		 * @see net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl#getTuio2DCurAdd()
		 * @generated
		 */
		EClass TUIO2_DCUR_ADD = eINSTANCE.getTuio2DCurAdd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio.impl.Tuio2DCurUpdateImpl <em>Tuio2 DCur Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio.impl.Tuio2DCurUpdateImpl
		 * @see net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl#getTuio2DCurUpdate()
		 * @generated
		 */
		EClass TUIO2_DCUR_UPDATE = eINSTANCE.getTuio2DCurUpdate();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio.impl.Tuio2DCurRemoveImpl <em>Tuio2 DCur Remove</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio.impl.Tuio2DCurRemoveImpl
		 * @see net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl#getTuio2DCurRemove()
		 * @generated
		 */
		EClass TUIO2_DCUR_REMOVE = eINSTANCE.getTuio2DCurRemove();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio.impl.TuioBundleImpl <em>Tuio Bundle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio.impl.TuioBundleImpl
		 * @see net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl#getTuioBundle()
		 * @generated
		 */
		EClass TUIO_BUNDLE = eINSTANCE.getTuioBundle();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO_BUNDLE__TIME = eINSTANCE.getTuioBundle_Time();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio.STATE <em>STATE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio.STATE
		 * @see net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl#getSTATE()
		 * @generated
		 */
		EEnum STATE = eINSTANCE.getSTATE();

		/**
		 * The meta object literal for the '<em>Tuio Cursor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.reactivision.tuio.TuioCursor
		 * @see net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl#getTuioCursor()
		 * @generated
		 */
		EDataType TUIO_CURSOR = eINSTANCE.getTuioCursor();

		/**
		 * The meta object literal for the '<em>Tuio Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.reactivision.tuio.TuioObject
		 * @see net.sf.smbt.osc.eztuio.impl.EztuioPackageImpl#getTuioObject()
		 * @generated
		 */
		EDataType TUIO_OBJECT = eINSTANCE.getTuioObject();

	}

} //EztuioPackage
