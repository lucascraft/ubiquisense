/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.eztuio2;

import net.sf.smbt.osccmd.OsccmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see net.sf.smbt.osc.eztuio2.Eztuio2Factory
 * @model kind="package"
 * @generated
 */
public interface Eztuio2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eztuio2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eztuio2/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eztuio2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Eztuio2Package eINSTANCE = net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2TokImpl <em>Tuio2 Tok</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2TokImpl
	 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2Tok()
	 * @generated
	 */
	int TUIO2_TOK = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_TOK__PRIORITY = OsccmdPackage.OSC_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_TOK__STAMP = OsccmdPackage.OSC_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_TOK__MSG = OsccmdPackage.OSC_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_TOK__SID = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tu id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_TOK__TU_ID = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_TOK__CID = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Xpos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_TOK__XPOS = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ypos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_TOK__YPOS = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Xvel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_TOK__XVEL = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Yvel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_TOK__YVEL = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Macc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_TOK__MACC = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Racc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_TOK__RACC = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Tuio2 Tok</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_TOK_FEATURE_COUNT = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2PtrImpl <em>Tuio2 Ptr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2PtrImpl
	 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2Ptr()
	 * @generated
	 */
	int TUIO2_PTR = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_PTR__PRIORITY = OsccmdPackage.OSC_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_PTR__STAMP = OsccmdPackage.OSC_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_PTR__MSG = OsccmdPackage.OSC_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_PTR__SID = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tu id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_PTR__TU_ID = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_PTR__CID = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Xpos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_PTR__XPOS = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ypos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_PTR__YPOS = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_PTR__WIDTH = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Press</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_PTR__PRESS = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Xvel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_PTR__XVEL = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Yvel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_PTR__YVEL = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Macc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_PTR__MACC = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Tuio2 Ptr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_PTR_FEATURE_COUNT = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2BNDImpl <em>Tuio2 BND</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2BNDImpl
	 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2BND()
	 * @generated
	 */
	int TUIO2_BND = 22;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio2.impl.TuioPointImpl <em>Tuio Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio2.impl.TuioPointImpl
	 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuioPoint()
	 * @generated
	 */
	int TUIO_POINT = 23;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2SymImpl <em>Tuio2 Sym</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2SymImpl
	 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2Sym()
	 * @generated
	 */
	int TUIO2_SYM = 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_SYM__PRIORITY = OsccmdPackage.OSC_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_SYM__STAMP = OsccmdPackage.OSC_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_SYM__MSG = OsccmdPackage.OSC_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_SYM__SID = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tu id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_SYM__TU_ID = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_SYM__CID = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_SYM__GROUP = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_SYM__S = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Tuio2 Sym</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_SYM_FEATURE_COUNT = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2T3DImpl <em>Tuio2 T3D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2T3DImpl
	 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2T3D()
	 * @generated
	 */
	int TUIO2_T3D = 3;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_T3D__PRIORITY = OsccmdPackage.OSC_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_T3D__STAMP = OsccmdPackage.OSC_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_T3D__MSG = OsccmdPackage.OSC_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_T3D__SID = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tu id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_T3D__TU_ID = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_T3D__CID = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Xpos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_T3D__XPOS = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ypos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_T3D__YPOS = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Zpos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_T3D__ZPOS = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Yaw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_T3D__YAW = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Pitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_T3D__PITCH = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Roll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_T3D__ROLL = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Xvel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_T3D__XVEL = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Yvel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_T3D__YVEL = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Zvel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_T3D__ZVEL = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Avel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_T3D__AVEL = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Bvel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_T3D__BVEL = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Cvel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_T3D__CVEL = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Macc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_T3D__MACC = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Racc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_T3D__RACC = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Tuio2 T3D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_T3D_FEATURE_COUNT = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 17;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2P3DImpl <em>Tuio2 P3D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2P3DImpl
	 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2P3D()
	 * @generated
	 */
	int TUIO2_P3D = 4;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_P3D__PRIORITY = OsccmdPackage.OSC_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_P3D__STAMP = OsccmdPackage.OSC_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_P3D__MSG = OsccmdPackage.OSC_CMD__MSG;

	/**
	 * The number of structural features of the '<em>Tuio2 P3D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_P3D_FEATURE_COUNT = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2B3DImpl <em>Tuio2 B3D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2B3DImpl
	 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2B3D()
	 * @generated
	 */
	int TUIO2_B3D = 5;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_B3D__PRIORITY = OsccmdPackage.OSC_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_B3D__STAMP = OsccmdPackage.OSC_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_B3D__MSG = OsccmdPackage.OSC_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_B3D__SID = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Xpos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_B3D__XPOS = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ypos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_B3D__YPOS = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Zpos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_B3D__ZPOS = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Yaw</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_B3D__YAW = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_B3D__PITCH = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Roll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_B3D__ROLL = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_B3D__WIDTH = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_B3D__HEIGHT = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_B3D__DEPTH = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Vol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_B3D__VOL = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Xvel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_B3D__XVEL = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Yvel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_B3D__YVEL = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Zvel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_B3D__ZVEL = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Avel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_B3D__AVEL = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Bvel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_B3D__BVEL = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Cvel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_B3D__CVEL = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Macc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_B3D__MACC = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Racc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_B3D__RACC = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Tuio2 B3D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_B3D_FEATURE_COUNT = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 19;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2CHGImpl <em>Tuio2 CHG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2CHGImpl
	 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2CHG()
	 * @generated
	 */
	int TUIO2_CHG = 6;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_CHG__PRIORITY = OsccmdPackage.OSC_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_CHG__STAMP = OsccmdPackage.OSC_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_CHG__MSG = OsccmdPackage.OSC_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_CHG__SID = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_CHG__PTS = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tuio2 CHG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_CHG_FEATURE_COUNT = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2OCGImpl <em>Tuio2 OCG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2OCGImpl
	 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2OCG()
	 * @generated
	 */
	int TUIO2_OCG = 7;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_OCG__PRIORITY = OsccmdPackage.OSC_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_OCG__STAMP = OsccmdPackage.OSC_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_OCG__MSG = OsccmdPackage.OSC_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_OCG__SID = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_OCG__PTS = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tuio2 OCG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_OCG_FEATURE_COUNT = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2ICGImpl <em>Tuio2 ICG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2ICGImpl
	 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2ICG()
	 * @generated
	 */
	int TUIO2_ICG = 24;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio2.impl.TreeElemImpl <em>Tree Elem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio2.impl.TreeElemImpl
	 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTreeElem()
	 * @generated
	 */
	int TREE_ELEM = 25;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio2.impl.SpansAreaImpl <em>Spans Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio2.impl.SpansAreaImpl
	 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getSpansArea()
	 * @generated
	 */
	int SPANS_AREA = 26;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio2.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio2.impl.LinkImpl
	 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getLink()
	 * @generated
	 */
	int LINK = 27;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio2.impl.LinkTreeElemImpl <em>Link Tree Elem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio2.impl.LinkTreeElemImpl
	 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getLinkTreeElem()
	 * @generated
	 */
	int LINK_TREE_ELEM = 28;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2SKGImpl <em>Tuio2 SKG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2SKGImpl
	 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2SKG()
	 * @generated
	 */
	int TUIO2_SKG = 8;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_SKG__PRIORITY = OsccmdPackage.OSC_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_SKG__STAMP = OsccmdPackage.OSC_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_SKG__MSG = OsccmdPackage.OSC_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_SKG__SID = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_SKG__NODES = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Radiuses</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_SKG__RADIUSES = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tuio2 SKG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_SKG_FEATURE_COUNT = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2SVGImpl <em>Tuio2 SVG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2SVGImpl
	 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2SVG()
	 * @generated
	 */
	int TUIO2_SVG = 9;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_SVG__PRIORITY = OsccmdPackage.OSC_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_SVG__STAMP = OsccmdPackage.OSC_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_SVG__MSG = OsccmdPackage.OSC_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_SVG__SID = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tuio2 SVG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_SVG_FEATURE_COUNT = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2ARGImpl <em>Tuio2 ARG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2ARGImpl
	 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2ARG()
	 * @generated
	 */
	int TUIO2_ARG = 10;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_ARG__PRIORITY = OsccmdPackage.OSC_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_ARG__STAMP = OsccmdPackage.OSC_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_ARG__MSG = OsccmdPackage.OSC_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_ARG__SID = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_ARG__ARGS = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tuio2 ARG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_ARG_FEATURE_COUNT = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2RAWImpl <em>Tuio2 RAW</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2RAWImpl
	 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2RAW()
	 * @generated
	 */
	int TUIO2_RAW = 11;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_RAW__PRIORITY = OsccmdPackage.OSC_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_RAW__STAMP = OsccmdPackage.OSC_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_RAW__MSG = OsccmdPackage.OSC_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_RAW__SID = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_RAW__WIDTH = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_RAW__DATA = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tuio2 RAW</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_RAW_FEATURE_COUNT = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2CTLImpl <em>Tuio2 CTL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2CTLImpl
	 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2CTL()
	 * @generated
	 */
	int TUIO2_CTL = 12;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_CTL__PRIORITY = OsccmdPackage.OSC_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_CTL__STAMP = OsccmdPackage.OSC_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_CTL__MSG = OsccmdPackage.OSC_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_CTL__SID = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ctrl</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_CTL__CTRL = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tuio2 CTL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_CTL_FEATURE_COUNT = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2DATImpl <em>Tuio2 DAT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2DATImpl
	 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2DAT()
	 * @generated
	 */
	int TUIO2_DAT = 13;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DAT__PRIORITY = OsccmdPackage.OSC_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DAT__STAMP = OsccmdPackage.OSC_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DAT__MSG = OsccmdPackage.OSC_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DAT__SID = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DAT__MIME = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DAT__DATA = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tuio2 DAT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_DAT_FEATURE_COUNT = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2SIGImpl <em>Tuio2 SIG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2SIGImpl
	 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2SIG()
	 * @generated
	 */
	int TUIO2_SIG = 14;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_SIG__PRIORITY = OsccmdPackage.OSC_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_SIG__STAMP = OsccmdPackage.OSC_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_SIG__MSG = OsccmdPackage.OSC_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_SIG__SID = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_SIG__CID = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_SIG__IDS = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tuio2 SIG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_SIG_FEATURE_COUNT = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2ALAImpl <em>Tuio2 ALA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2ALAImpl
	 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2ALA()
	 * @generated
	 */
	int TUIO2_ALA = 15;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_ALA__PRIORITY = OsccmdPackage.OSC_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_ALA__STAMP = OsccmdPackage.OSC_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_ALA__MSG = OsccmdPackage.OSC_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_ALA__IDS = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tuio2 ALA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_ALA_FEATURE_COUNT = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2COAImpl <em>Tuio2 COA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2COAImpl
	 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2COA()
	 * @generated
	 */
	int TUIO2_COA = 16;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_COA__PRIORITY = OsccmdPackage.OSC_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_COA__STAMP = OsccmdPackage.OSC_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_COA__MSG = OsccmdPackage.OSC_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_COA__SID = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_COA__SLOT = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_COA__IDS = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tuio2 COA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_COA_FEATURE_COUNT = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2LIAImpl <em>Tuio2 LIA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2LIAImpl
	 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2LIA()
	 * @generated
	 */
	int TUIO2_LIA = 17;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_LIA__PRIORITY = OsccmdPackage.OSC_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_LIA__STAMP = OsccmdPackage.OSC_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_LIA__MSG = OsccmdPackage.OSC_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_LIA__LINKS = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tuio2 LIA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_LIA_FEATURE_COUNT = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2LLAImpl <em>Tuio2 LLA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2LLAImpl
	 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2LLA()
	 * @generated
	 */
	int TUIO2_LLA = 18;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_LLA__PRIORITY = OsccmdPackage.OSC_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_LLA__STAMP = OsccmdPackage.OSC_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_LLA__MSG = OsccmdPackage.OSC_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_LLA__SID = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_LLA__BOOL = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_LLA__LINKS = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tuio2 LLA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_LLA_FEATURE_COUNT = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2LTAImpl <em>Tuio2 LTA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2LTAImpl
	 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2LTA()
	 * @generated
	 */
	int TUIO2_LTA = 19;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_LTA__PRIORITY = OsccmdPackage.OSC_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_LTA__STAMP = OsccmdPackage.OSC_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_LTA__MSG = OsccmdPackage.OSC_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_LTA__SID = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_LTA__BOOL = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_LTA__LINKS = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tuio2 LTA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_LTA_FEATURE_COUNT = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 3;


	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2FRMImpl <em>Tuio2 FRM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2FRMImpl
	 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2FRM()
	 * @generated
	 */
	int TUIO2_FRM = 20;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_FRM__PRIORITY = OsccmdPackage.OSC_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_FRM__STAMP = OsccmdPackage.OSC_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_FRM__MSG = OsccmdPackage.OSC_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Fid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_FRM__FID = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_FRM__TIME = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>App</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_FRM__APP = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_FRM__ADDR = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Dim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_FRM__DIM = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Tuio2 FRM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_FRM_FEATURE_COUNT = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2ALVImpl <em>Tuio2 ALV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2ALVImpl
	 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2ALV()
	 * @generated
	 */
	int TUIO2_ALV = 21;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_ALV__PRIORITY = OsccmdPackage.OSC_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_ALV__STAMP = OsccmdPackage.OSC_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_ALV__MSG = OsccmdPackage.OSC_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Sids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_ALV__SIDS = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tuio2 ALV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_ALV_FEATURE_COUNT = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_BND__PRIORITY = OsccmdPackage.OSC_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_BND__STAMP = OsccmdPackage.OSC_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_BND__MSG = OsccmdPackage.OSC_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_BND__SID = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Xpos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_BND__XPOS = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ypos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_BND__YPOS = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_BND__ANGLE = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_BND__WIDTH = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_BND__HEIGHT = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_BND__AREA = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Xvel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_BND__XVEL = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Yvel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_BND__YVEL = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Avel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_BND__AVEL = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Macc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_BND__MACC = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Racc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_BND__RACC = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Tuio2 BND</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_BND_FEATURE_COUNT = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO_POINT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO_POINT__Y = 1;

	/**
	 * The number of structural features of the '<em>Tuio Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO_POINT_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_ICG__SID = 0;

	/**
	 * The feature id for the '<em><b>Pts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_ICG__PTS = 1;

	/**
	 * The feature id for the '<em><b>Additional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_ICG__ADDITIONAL = 2;

	/**
	 * The feature id for the '<em><b>Shape Needed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_ICG__SHAPE_NEEDED = 3;

	/**
	 * The number of structural features of the '<em>Tuio2 ICG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUIO2_ICG_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Pt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ELEM__PT = 0;

	/**
	 * The feature id for the '<em><b>Last Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ELEM__LAST_NODE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ELEM__ID = 2;

	/**
	 * The number of structural features of the '<em>Tree Elem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ELEM_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPANS_AREA__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPANS_AREA__Y = 1;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPANS_AREA__W = 2;

	/**
	 * The number of structural features of the '<em>Spans Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPANS_AREA_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SID = 0;

	/**
	 * The feature id for the '<em><b>Lnk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LNK = 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TREE_ELEM__ID = 0;

	/**
	 * The feature id for the '<em><b>Last Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TREE_ELEM__LAST_NODE = 1;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TREE_ELEM__LINK = 2;

	/**
	 * The number of structural features of the '<em>Link Tree Elem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TREE_ELEM_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio2.Tuio2Tok <em>Tuio2 Tok</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio2 Tok</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2Tok
	 * @generated
	 */
	EClass getTuio2Tok();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2Tok#getS_id <em>Sid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sid</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2Tok#getS_id()
	 * @see #getTuio2Tok()
	 * @generated
	 */
	EAttribute getTuio2Tok_S_id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2Tok#getTu_id <em>Tu id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tu id</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2Tok#getTu_id()
	 * @see #getTuio2Tok()
	 * @generated
	 */
	EAttribute getTuio2Tok_Tu_id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2Tok#getC_id <em>Cid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cid</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2Tok#getC_id()
	 * @see #getTuio2Tok()
	 * @generated
	 */
	EAttribute getTuio2Tok_C_id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2Tok#getX_pos <em>Xpos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xpos</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2Tok#getX_pos()
	 * @see #getTuio2Tok()
	 * @generated
	 */
	EAttribute getTuio2Tok_X_pos();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2Tok#getY_pos <em>Ypos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ypos</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2Tok#getY_pos()
	 * @see #getTuio2Tok()
	 * @generated
	 */
	EAttribute getTuio2Tok_Y_pos();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2Tok#getX_vel <em>Xvel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xvel</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2Tok#getX_vel()
	 * @see #getTuio2Tok()
	 * @generated
	 */
	EAttribute getTuio2Tok_X_vel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2Tok#getY_vel <em>Yvel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yvel</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2Tok#getY_vel()
	 * @see #getTuio2Tok()
	 * @generated
	 */
	EAttribute getTuio2Tok_Y_vel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2Tok#getM_acc <em>Macc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Macc</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2Tok#getM_acc()
	 * @see #getTuio2Tok()
	 * @generated
	 */
	EAttribute getTuio2Tok_M_acc();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2Tok#getR_acc <em>Racc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Racc</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2Tok#getR_acc()
	 * @see #getTuio2Tok()
	 * @generated
	 */
	EAttribute getTuio2Tok_R_acc();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio2.Tuio2Ptr <em>Tuio2 Ptr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio2 Ptr</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2Ptr
	 * @generated
	 */
	EClass getTuio2Ptr();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2Ptr#getS_id <em>Sid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sid</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2Ptr#getS_id()
	 * @see #getTuio2Ptr()
	 * @generated
	 */
	EAttribute getTuio2Ptr_S_id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2Ptr#getTu_id <em>Tu id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tu id</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2Ptr#getTu_id()
	 * @see #getTuio2Ptr()
	 * @generated
	 */
	EAttribute getTuio2Ptr_Tu_id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2Ptr#getC_id <em>Cid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cid</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2Ptr#getC_id()
	 * @see #getTuio2Ptr()
	 * @generated
	 */
	EAttribute getTuio2Ptr_C_id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2Ptr#getX_pos <em>Xpos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xpos</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2Ptr#getX_pos()
	 * @see #getTuio2Ptr()
	 * @generated
	 */
	EAttribute getTuio2Ptr_X_pos();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2Ptr#getY_pos <em>Ypos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ypos</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2Ptr#getY_pos()
	 * @see #getTuio2Ptr()
	 * @generated
	 */
	EAttribute getTuio2Ptr_Y_pos();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2Ptr#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2Ptr#getWidth()
	 * @see #getTuio2Ptr()
	 * @generated
	 */
	EAttribute getTuio2Ptr_Width();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2Ptr#getPress <em>Press</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Press</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2Ptr#getPress()
	 * @see #getTuio2Ptr()
	 * @generated
	 */
	EAttribute getTuio2Ptr_Press();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2Ptr#getX_vel <em>Xvel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xvel</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2Ptr#getX_vel()
	 * @see #getTuio2Ptr()
	 * @generated
	 */
	EAttribute getTuio2Ptr_X_vel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2Ptr#getY_vel <em>Yvel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yvel</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2Ptr#getY_vel()
	 * @see #getTuio2Ptr()
	 * @generated
	 */
	EAttribute getTuio2Ptr_Y_vel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2Ptr#getM_acc <em>Macc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Macc</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2Ptr#getM_acc()
	 * @see #getTuio2Ptr()
	 * @generated
	 */
	EAttribute getTuio2Ptr_M_acc();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio2.Tuio2Sym <em>Tuio2 Sym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio2 Sym</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2Sym
	 * @generated
	 */
	EClass getTuio2Sym();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2Sym#getS_id <em>Sid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sid</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2Sym#getS_id()
	 * @see #getTuio2Sym()
	 * @generated
	 */
	EAttribute getTuio2Sym_S_id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2Sym#getTu_id <em>Tu id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tu id</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2Sym#getTu_id()
	 * @see #getTuio2Sym()
	 * @generated
	 */
	EAttribute getTuio2Sym_Tu_id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2Sym#getC_id <em>Cid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cid</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2Sym#getC_id()
	 * @see #getTuio2Sym()
	 * @generated
	 */
	EAttribute getTuio2Sym_C_id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2Sym#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2Sym#getGroup()
	 * @see #getTuio2Sym()
	 * @generated
	 */
	EAttribute getTuio2Sym_Group();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2Sym#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>S</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2Sym#getS()
	 * @see #getTuio2Sym()
	 * @generated
	 */
	EAttribute getTuio2Sym_S();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio2.Tuio2T3D <em>Tuio2 T3D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio2 T3D</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2T3D
	 * @generated
	 */
	EClass getTuio2T3D();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2T3D#getS_id <em>Sid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sid</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2T3D#getS_id()
	 * @see #getTuio2T3D()
	 * @generated
	 */
	EAttribute getTuio2T3D_S_id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2T3D#getTu_id <em>Tu id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tu id</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2T3D#getTu_id()
	 * @see #getTuio2T3D()
	 * @generated
	 */
	EAttribute getTuio2T3D_Tu_id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2T3D#getC_id <em>Cid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cid</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2T3D#getC_id()
	 * @see #getTuio2T3D()
	 * @generated
	 */
	EAttribute getTuio2T3D_C_id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2T3D#getX_pos <em>Xpos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xpos</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2T3D#getX_pos()
	 * @see #getTuio2T3D()
	 * @generated
	 */
	EAttribute getTuio2T3D_X_pos();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2T3D#getY_pos <em>Ypos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ypos</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2T3D#getY_pos()
	 * @see #getTuio2T3D()
	 * @generated
	 */
	EAttribute getTuio2T3D_Y_pos();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2T3D#getZ_pos <em>Zpos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zpos</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2T3D#getZ_pos()
	 * @see #getTuio2T3D()
	 * @generated
	 */
	EAttribute getTuio2T3D_Z_pos();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2T3D#getYaw <em>Yaw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yaw</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2T3D#getYaw()
	 * @see #getTuio2T3D()
	 * @generated
	 */
	EAttribute getTuio2T3D_Yaw();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2T3D#getPitch <em>Pitch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pitch</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2T3D#getPitch()
	 * @see #getTuio2T3D()
	 * @generated
	 */
	EAttribute getTuio2T3D_Pitch();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2T3D#getRoll <em>Roll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roll</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2T3D#getRoll()
	 * @see #getTuio2T3D()
	 * @generated
	 */
	EAttribute getTuio2T3D_Roll();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2T3D#getX_vel <em>Xvel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xvel</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2T3D#getX_vel()
	 * @see #getTuio2T3D()
	 * @generated
	 */
	EAttribute getTuio2T3D_X_vel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2T3D#getY_vel <em>Yvel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yvel</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2T3D#getY_vel()
	 * @see #getTuio2T3D()
	 * @generated
	 */
	EAttribute getTuio2T3D_Y_vel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2T3D#getZ_vel <em>Zvel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zvel</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2T3D#getZ_vel()
	 * @see #getTuio2T3D()
	 * @generated
	 */
	EAttribute getTuio2T3D_Z_vel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2T3D#getA_vel <em>Avel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avel</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2T3D#getA_vel()
	 * @see #getTuio2T3D()
	 * @generated
	 */
	EAttribute getTuio2T3D_A_vel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2T3D#getB_vel <em>Bvel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bvel</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2T3D#getB_vel()
	 * @see #getTuio2T3D()
	 * @generated
	 */
	EAttribute getTuio2T3D_B_vel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2T3D#getC_vel <em>Cvel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cvel</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2T3D#getC_vel()
	 * @see #getTuio2T3D()
	 * @generated
	 */
	EAttribute getTuio2T3D_C_vel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2T3D#getM_acc <em>Macc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Macc</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2T3D#getM_acc()
	 * @see #getTuio2T3D()
	 * @generated
	 */
	EAttribute getTuio2T3D_M_acc();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2T3D#getR_acc <em>Racc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Racc</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2T3D#getR_acc()
	 * @see #getTuio2T3D()
	 * @generated
	 */
	EAttribute getTuio2T3D_R_acc();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio2.Tuio2P3D <em>Tuio2 P3D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio2 P3D</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2P3D
	 * @generated
	 */
	EClass getTuio2P3D();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio2.Tuio2B3D <em>Tuio2 B3D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio2 B3D</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2B3D
	 * @generated
	 */
	EClass getTuio2B3D();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2B3D#getS_id <em>Sid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sid</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2B3D#getS_id()
	 * @see #getTuio2B3D()
	 * @generated
	 */
	EAttribute getTuio2B3D_S_id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2B3D#getX_pos <em>Xpos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xpos</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2B3D#getX_pos()
	 * @see #getTuio2B3D()
	 * @generated
	 */
	EAttribute getTuio2B3D_X_pos();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2B3D#getY_pos <em>Ypos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ypos</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2B3D#getY_pos()
	 * @see #getTuio2B3D()
	 * @generated
	 */
	EAttribute getTuio2B3D_Y_pos();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2B3D#getZ_pos <em>Zpos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zpos</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2B3D#getZ_pos()
	 * @see #getTuio2B3D()
	 * @generated
	 */
	EAttribute getTuio2B3D_Z_pos();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2B3D#getYaw <em>Yaw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yaw</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2B3D#getYaw()
	 * @see #getTuio2B3D()
	 * @generated
	 */
	EAttribute getTuio2B3D_Yaw();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2B3D#getPitch <em>Pitch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pitch</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2B3D#getPitch()
	 * @see #getTuio2B3D()
	 * @generated
	 */
	EAttribute getTuio2B3D_Pitch();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2B3D#getRoll <em>Roll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roll</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2B3D#getRoll()
	 * @see #getTuio2B3D()
	 * @generated
	 */
	EAttribute getTuio2B3D_Roll();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2B3D#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2B3D#getWidth()
	 * @see #getTuio2B3D()
	 * @generated
	 */
	EAttribute getTuio2B3D_Width();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2B3D#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2B3D#getHeight()
	 * @see #getTuio2B3D()
	 * @generated
	 */
	EAttribute getTuio2B3D_Height();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2B3D#getDepth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2B3D#getDepth()
	 * @see #getTuio2B3D()
	 * @generated
	 */
	EAttribute getTuio2B3D_Depth();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2B3D#getVol <em>Vol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vol</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2B3D#getVol()
	 * @see #getTuio2B3D()
	 * @generated
	 */
	EAttribute getTuio2B3D_Vol();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2B3D#getX_vel <em>Xvel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xvel</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2B3D#getX_vel()
	 * @see #getTuio2B3D()
	 * @generated
	 */
	EAttribute getTuio2B3D_X_vel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2B3D#getY_vel <em>Yvel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yvel</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2B3D#getY_vel()
	 * @see #getTuio2B3D()
	 * @generated
	 */
	EAttribute getTuio2B3D_Y_vel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2B3D#getZ_vel <em>Zvel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zvel</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2B3D#getZ_vel()
	 * @see #getTuio2B3D()
	 * @generated
	 */
	EAttribute getTuio2B3D_Z_vel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2B3D#getA_vel <em>Avel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avel</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2B3D#getA_vel()
	 * @see #getTuio2B3D()
	 * @generated
	 */
	EAttribute getTuio2B3D_A_vel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2B3D#getB_vel <em>Bvel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bvel</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2B3D#getB_vel()
	 * @see #getTuio2B3D()
	 * @generated
	 */
	EAttribute getTuio2B3D_B_vel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2B3D#getC_vel <em>Cvel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cvel</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2B3D#getC_vel()
	 * @see #getTuio2B3D()
	 * @generated
	 */
	EAttribute getTuio2B3D_C_vel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2B3D#getM_acc <em>Macc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Macc</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2B3D#getM_acc()
	 * @see #getTuio2B3D()
	 * @generated
	 */
	EAttribute getTuio2B3D_M_acc();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2B3D#getR_acc <em>Racc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Racc</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2B3D#getR_acc()
	 * @see #getTuio2B3D()
	 * @generated
	 */
	EAttribute getTuio2B3D_R_acc();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio2.Tuio2CHG <em>Tuio2 CHG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio2 CHG</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2CHG
	 * @generated
	 */
	EClass getTuio2CHG();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2CHG#getS_id <em>Sid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sid</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2CHG#getS_id()
	 * @see #getTuio2CHG()
	 * @generated
	 */
	EAttribute getTuio2CHG_S_id();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.osc.eztuio2.Tuio2CHG#getPts <em>Pts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pts</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2CHG#getPts()
	 * @see #getTuio2CHG()
	 * @generated
	 */
	EReference getTuio2CHG_Pts();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio2.Tuio2OCG <em>Tuio2 OCG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio2 OCG</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2OCG
	 * @generated
	 */
	EClass getTuio2OCG();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2OCG#getS_id <em>Sid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sid</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2OCG#getS_id()
	 * @see #getTuio2OCG()
	 * @generated
	 */
	EAttribute getTuio2OCG_S_id();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.osc.eztuio2.Tuio2OCG#getPts <em>Pts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pts</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2OCG#getPts()
	 * @see #getTuio2OCG()
	 * @generated
	 */
	EReference getTuio2OCG_Pts();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio2.Tuio2ICG <em>Tuio2 ICG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio2 ICG</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2ICG
	 * @generated
	 */
	EClass getTuio2ICG();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2ICG#getS_id <em>Sid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sid</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2ICG#getS_id()
	 * @see #getTuio2ICG()
	 * @generated
	 */
	EAttribute getTuio2ICG_S_id();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.osc.eztuio2.Tuio2ICG#getPts <em>Pts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pts</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2ICG#getPts()
	 * @see #getTuio2ICG()
	 * @generated
	 */
	EReference getTuio2ICG_Pts();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.osc.eztuio2.Tuio2ICG#getAdditional <em>Additional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2ICG#getAdditional()
	 * @see #getTuio2ICG()
	 * @generated
	 */
	EReference getTuio2ICG_Additional();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2ICG#isShapeNeeded <em>Shape Needed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape Needed</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2ICG#isShapeNeeded()
	 * @see #getTuio2ICG()
	 * @generated
	 */
	EAttribute getTuio2ICG_ShapeNeeded();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio2.TreeElem <em>Tree Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree Elem</em>'.
	 * @see net.sf.smbt.osc.eztuio2.TreeElem
	 * @generated
	 */
	EClass getTreeElem();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.eztuio2.TreeElem#getPt <em>Pt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pt</em>'.
	 * @see net.sf.smbt.osc.eztuio2.TreeElem#getPt()
	 * @see #getTreeElem()
	 * @generated
	 */
	EReference getTreeElem_Pt();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.TreeElem#getLastNode <em>Last Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Node</em>'.
	 * @see net.sf.smbt.osc.eztuio2.TreeElem#getLastNode()
	 * @see #getTreeElem()
	 * @generated
	 */
	EAttribute getTreeElem_LastNode();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.TreeElem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.smbt.osc.eztuio2.TreeElem#getId()
	 * @see #getTreeElem()
	 * @generated
	 */
	EAttribute getTreeElem_Id();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio2.SpansArea <em>Spans Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spans Area</em>'.
	 * @see net.sf.smbt.osc.eztuio2.SpansArea
	 * @generated
	 */
	EClass getSpansArea();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.SpansArea#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see net.sf.smbt.osc.eztuio2.SpansArea#getX()
	 * @see #getSpansArea()
	 * @generated
	 */
	EAttribute getSpansArea_X();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.SpansArea#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see net.sf.smbt.osc.eztuio2.SpansArea#getY()
	 * @see #getSpansArea()
	 * @generated
	 */
	EAttribute getSpansArea_Y();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.SpansArea#getW <em>W</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>W</em>'.
	 * @see net.sf.smbt.osc.eztuio2.SpansArea#getW()
	 * @see #getSpansArea()
	 * @generated
	 */
	EAttribute getSpansArea_W();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio2.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Link#getS_id <em>Sid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sid</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Link#getS_id()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_S_id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Link#getLnk <em>Lnk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lnk</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Link#getLnk()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Lnk();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio2.LinkTreeElem <em>Link Tree Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Tree Elem</em>'.
	 * @see net.sf.smbt.osc.eztuio2.LinkTreeElem
	 * @generated
	 */
	EClass getLinkTreeElem();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.LinkTreeElem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.smbt.osc.eztuio2.LinkTreeElem#getId()
	 * @see #getLinkTreeElem()
	 * @generated
	 */
	EAttribute getLinkTreeElem_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.LinkTreeElem#getLastNode <em>Last Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Node</em>'.
	 * @see net.sf.smbt.osc.eztuio2.LinkTreeElem#getLastNode()
	 * @see #getLinkTreeElem()
	 * @generated
	 */
	EAttribute getLinkTreeElem_LastNode();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.eztuio2.LinkTreeElem#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Link</em>'.
	 * @see net.sf.smbt.osc.eztuio2.LinkTreeElem#getLink()
	 * @see #getLinkTreeElem()
	 * @generated
	 */
	EReference getLinkTreeElem_Link();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio2.Tuio2SKG <em>Tuio2 SKG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio2 SKG</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2SKG
	 * @generated
	 */
	EClass getTuio2SKG();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2SKG#getS_id <em>Sid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sid</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2SKG#getS_id()
	 * @see #getTuio2SKG()
	 * @generated
	 */
	EAttribute getTuio2SKG_S_id();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.osc.eztuio2.Tuio2SKG#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2SKG#getNodes()
	 * @see #getTuio2SKG()
	 * @generated
	 */
	EReference getTuio2SKG_Nodes();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.smbt.osc.eztuio2.Tuio2SKG#getRadiuses <em>Radiuses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Radiuses</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2SKG#getRadiuses()
	 * @see #getTuio2SKG()
	 * @generated
	 */
	EAttribute getTuio2SKG_Radiuses();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio2.Tuio2SVG <em>Tuio2 SVG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio2 SVG</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2SVG
	 * @generated
	 */
	EClass getTuio2SVG();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2SVG#getS_id <em>Sid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sid</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2SVG#getS_id()
	 * @see #getTuio2SVG()
	 * @generated
	 */
	EAttribute getTuio2SVG_S_id();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio2.Tuio2ARG <em>Tuio2 ARG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio2 ARG</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2ARG
	 * @generated
	 */
	EClass getTuio2ARG();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2ARG#getS_id <em>Sid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sid</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2ARG#getS_id()
	 * @see #getTuio2ARG()
	 * @generated
	 */
	EAttribute getTuio2ARG_S_id();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.osc.eztuio2.Tuio2ARG#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Args</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2ARG#getArgs()
	 * @see #getTuio2ARG()
	 * @generated
	 */
	EReference getTuio2ARG_Args();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio2.Tuio2RAW <em>Tuio2 RAW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio2 RAW</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2RAW
	 * @generated
	 */
	EClass getTuio2RAW();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2RAW#getS_id <em>Sid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sid</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2RAW#getS_id()
	 * @see #getTuio2RAW()
	 * @generated
	 */
	EAttribute getTuio2RAW_S_id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2RAW#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2RAW#getWidth()
	 * @see #getTuio2RAW()
	 * @generated
	 */
	EAttribute getTuio2RAW_Width();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2RAW#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2RAW#getData()
	 * @see #getTuio2RAW()
	 * @generated
	 */
	EAttribute getTuio2RAW_Data();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio2.Tuio2CTL <em>Tuio2 CTL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio2 CTL</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2CTL
	 * @generated
	 */
	EClass getTuio2CTL();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2CTL#getS_id <em>Sid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sid</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2CTL#getS_id()
	 * @see #getTuio2CTL()
	 * @generated
	 */
	EAttribute getTuio2CTL_S_id();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.smbt.osc.eztuio2.Tuio2CTL#getCtrl <em>Ctrl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ctrl</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2CTL#getCtrl()
	 * @see #getTuio2CTL()
	 * @generated
	 */
	EAttribute getTuio2CTL_Ctrl();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio2.Tuio2DAT <em>Tuio2 DAT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio2 DAT</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2DAT
	 * @generated
	 */
	EClass getTuio2DAT();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2DAT#getS_id <em>Sid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sid</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2DAT#getS_id()
	 * @see #getTuio2DAT()
	 * @generated
	 */
	EAttribute getTuio2DAT_S_id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2DAT#getMime <em>Mime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2DAT#getMime()
	 * @see #getTuio2DAT()
	 * @generated
	 */
	EAttribute getTuio2DAT_Mime();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2DAT#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2DAT#getData()
	 * @see #getTuio2DAT()
	 * @generated
	 */
	EAttribute getTuio2DAT_Data();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio2.Tuio2SIG <em>Tuio2 SIG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio2 SIG</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2SIG
	 * @generated
	 */
	EClass getTuio2SIG();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2SIG#getS_id <em>Sid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sid</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2SIG#getS_id()
	 * @see #getTuio2SIG()
	 * @generated
	 */
	EAttribute getTuio2SIG_S_id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2SIG#getC_id <em>Cid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cid</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2SIG#getC_id()
	 * @see #getTuio2SIG()
	 * @generated
	 */
	EAttribute getTuio2SIG_C_id();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.smbt.osc.eztuio2.Tuio2SIG#getIds <em>Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ids</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2SIG#getIds()
	 * @see #getTuio2SIG()
	 * @generated
	 */
	EAttribute getTuio2SIG_Ids();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio2.Tuio2ALA <em>Tuio2 ALA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio2 ALA</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2ALA
	 * @generated
	 */
	EClass getTuio2ALA();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.smbt.osc.eztuio2.Tuio2ALA#getIds <em>Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ids</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2ALA#getIds()
	 * @see #getTuio2ALA()
	 * @generated
	 */
	EAttribute getTuio2ALA_Ids();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio2.Tuio2COA <em>Tuio2 COA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio2 COA</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2COA
	 * @generated
	 */
	EClass getTuio2COA();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2COA#getS_id <em>Sid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sid</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2COA#getS_id()
	 * @see #getTuio2COA()
	 * @generated
	 */
	EAttribute getTuio2COA_S_id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2COA#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Slot</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2COA#getSlot()
	 * @see #getTuio2COA()
	 * @generated
	 */
	EAttribute getTuio2COA_Slot();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.smbt.osc.eztuio2.Tuio2COA#getIds <em>Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ids</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2COA#getIds()
	 * @see #getTuio2COA()
	 * @generated
	 */
	EAttribute getTuio2COA_Ids();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio2.Tuio2LIA <em>Tuio2 LIA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio2 LIA</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2LIA
	 * @generated
	 */
	EClass getTuio2LIA();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.osc.eztuio2.Tuio2LIA#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2LIA#getLinks()
	 * @see #getTuio2LIA()
	 * @generated
	 */
	EReference getTuio2LIA_Links();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio2.Tuio2LLA <em>Tuio2 LLA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio2 LLA</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2LLA
	 * @generated
	 */
	EClass getTuio2LLA();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2LLA#getS_id <em>Sid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sid</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2LLA#getS_id()
	 * @see #getTuio2LLA()
	 * @generated
	 */
	EAttribute getTuio2LLA_S_id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2LLA#isBool <em>Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bool</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2LLA#isBool()
	 * @see #getTuio2LLA()
	 * @generated
	 */
	EAttribute getTuio2LLA_Bool();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.osc.eztuio2.Tuio2LLA#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2LLA#getLinks()
	 * @see #getTuio2LLA()
	 * @generated
	 */
	EReference getTuio2LLA_Links();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio2.Tuio2LTA <em>Tuio2 LTA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio2 LTA</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2LTA
	 * @generated
	 */
	EClass getTuio2LTA();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2LTA#getS_id <em>Sid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sid</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2LTA#getS_id()
	 * @see #getTuio2LTA()
	 * @generated
	 */
	EAttribute getTuio2LTA_S_id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2LTA#isBool <em>Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bool</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2LTA#isBool()
	 * @see #getTuio2LTA()
	 * @generated
	 */
	EAttribute getTuio2LTA_Bool();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.osc.eztuio2.Tuio2LTA#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2LTA#getLinks()
	 * @see #getTuio2LTA()
	 * @generated
	 */
	EReference getTuio2LTA_Links();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio2.Tuio2FRM <em>Tuio2 FRM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio2 FRM</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2FRM
	 * @generated
	 */
	EClass getTuio2FRM();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2FRM#getF_id <em>Fid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fid</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2FRM#getF_id()
	 * @see #getTuio2FRM()
	 * @generated
	 */
	EAttribute getTuio2FRM_F_id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2FRM#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2FRM#getTime()
	 * @see #getTuio2FRM()
	 * @generated
	 */
	EAttribute getTuio2FRM_Time();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2FRM#getApp <em>App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>App</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2FRM#getApp()
	 * @see #getTuio2FRM()
	 * @generated
	 */
	EAttribute getTuio2FRM_App();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2FRM#getAddr <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addr</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2FRM#getAddr()
	 * @see #getTuio2FRM()
	 * @generated
	 */
	EAttribute getTuio2FRM_Addr();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2FRM#getDim <em>Dim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dim</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2FRM#getDim()
	 * @see #getTuio2FRM()
	 * @generated
	 */
	EAttribute getTuio2FRM_Dim();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio2.Tuio2ALV <em>Tuio2 ALV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio2 ALV</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2ALV
	 * @generated
	 */
	EClass getTuio2ALV();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.smbt.osc.eztuio2.Tuio2ALV#getS_ids <em>Sids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Sids</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2ALV#getS_ids()
	 * @see #getTuio2ALV()
	 * @generated
	 */
	EAttribute getTuio2ALV_S_ids();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio2.Tuio2BND <em>Tuio2 BND</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio2 BND</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2BND
	 * @generated
	 */
	EClass getTuio2BND();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2BND#getS_id <em>Sid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sid</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2BND#getS_id()
	 * @see #getTuio2BND()
	 * @generated
	 */
	EAttribute getTuio2BND_S_id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2BND#getX_pos <em>Xpos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xpos</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2BND#getX_pos()
	 * @see #getTuio2BND()
	 * @generated
	 */
	EAttribute getTuio2BND_X_pos();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2BND#getY_pos <em>Ypos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ypos</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2BND#getY_pos()
	 * @see #getTuio2BND()
	 * @generated
	 */
	EAttribute getTuio2BND_Y_pos();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2BND#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2BND#getAngle()
	 * @see #getTuio2BND()
	 * @generated
	 */
	EAttribute getTuio2BND_Angle();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2BND#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2BND#getWidth()
	 * @see #getTuio2BND()
	 * @generated
	 */
	EAttribute getTuio2BND_Width();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2BND#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2BND#getHeight()
	 * @see #getTuio2BND()
	 * @generated
	 */
	EAttribute getTuio2BND_Height();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2BND#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Area</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2BND#getArea()
	 * @see #getTuio2BND()
	 * @generated
	 */
	EAttribute getTuio2BND_Area();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2BND#getX_vel <em>Xvel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xvel</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2BND#getX_vel()
	 * @see #getTuio2BND()
	 * @generated
	 */
	EAttribute getTuio2BND_X_vel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2BND#getY_vel <em>Yvel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yvel</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2BND#getY_vel()
	 * @see #getTuio2BND()
	 * @generated
	 */
	EAttribute getTuio2BND_Y_vel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2BND#getA_vel <em>Avel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avel</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2BND#getA_vel()
	 * @see #getTuio2BND()
	 * @generated
	 */
	EAttribute getTuio2BND_A_vel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2BND#getM_acc <em>Macc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Macc</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2BND#getM_acc()
	 * @see #getTuio2BND()
	 * @generated
	 */
	EAttribute getTuio2BND_M_acc();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.Tuio2BND#getR_acc <em>Racc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Racc</em>'.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2BND#getR_acc()
	 * @see #getTuio2BND()
	 * @generated
	 */
	EAttribute getTuio2BND_R_acc();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osc.eztuio2.TuioPoint <em>Tuio Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuio Point</em>'.
	 * @see net.sf.smbt.osc.eztuio2.TuioPoint
	 * @generated
	 */
	EClass getTuioPoint();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.TuioPoint#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see net.sf.smbt.osc.eztuio2.TuioPoint#getX()
	 * @see #getTuioPoint()
	 * @generated
	 */
	EAttribute getTuioPoint_X();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osc.eztuio2.TuioPoint#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see net.sf.smbt.osc.eztuio2.TuioPoint#getY()
	 * @see #getTuioPoint()
	 * @generated
	 */
	EAttribute getTuioPoint_Y();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Eztuio2Factory getEztuio2Factory();

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
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2TokImpl <em>Tuio2 Tok</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2TokImpl
		 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2Tok()
		 * @generated
		 */
		EClass TUIO2_TOK = eINSTANCE.getTuio2Tok();

		/**
		 * The meta object literal for the '<em><b>Sid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_TOK__SID = eINSTANCE.getTuio2Tok_S_id();

		/**
		 * The meta object literal for the '<em><b>Tu id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_TOK__TU_ID = eINSTANCE.getTuio2Tok_Tu_id();

		/**
		 * The meta object literal for the '<em><b>Cid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_TOK__CID = eINSTANCE.getTuio2Tok_C_id();

		/**
		 * The meta object literal for the '<em><b>Xpos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_TOK__XPOS = eINSTANCE.getTuio2Tok_X_pos();

		/**
		 * The meta object literal for the '<em><b>Ypos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_TOK__YPOS = eINSTANCE.getTuio2Tok_Y_pos();

		/**
		 * The meta object literal for the '<em><b>Xvel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_TOK__XVEL = eINSTANCE.getTuio2Tok_X_vel();

		/**
		 * The meta object literal for the '<em><b>Yvel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_TOK__YVEL = eINSTANCE.getTuio2Tok_Y_vel();

		/**
		 * The meta object literal for the '<em><b>Macc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_TOK__MACC = eINSTANCE.getTuio2Tok_M_acc();

		/**
		 * The meta object literal for the '<em><b>Racc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_TOK__RACC = eINSTANCE.getTuio2Tok_R_acc();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2PtrImpl <em>Tuio2 Ptr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2PtrImpl
		 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2Ptr()
		 * @generated
		 */
		EClass TUIO2_PTR = eINSTANCE.getTuio2Ptr();

		/**
		 * The meta object literal for the '<em><b>Sid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_PTR__SID = eINSTANCE.getTuio2Ptr_S_id();

		/**
		 * The meta object literal for the '<em><b>Tu id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_PTR__TU_ID = eINSTANCE.getTuio2Ptr_Tu_id();

		/**
		 * The meta object literal for the '<em><b>Cid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_PTR__CID = eINSTANCE.getTuio2Ptr_C_id();

		/**
		 * The meta object literal for the '<em><b>Xpos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_PTR__XPOS = eINSTANCE.getTuio2Ptr_X_pos();

		/**
		 * The meta object literal for the '<em><b>Ypos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_PTR__YPOS = eINSTANCE.getTuio2Ptr_Y_pos();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_PTR__WIDTH = eINSTANCE.getTuio2Ptr_Width();

		/**
		 * The meta object literal for the '<em><b>Press</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_PTR__PRESS = eINSTANCE.getTuio2Ptr_Press();

		/**
		 * The meta object literal for the '<em><b>Xvel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_PTR__XVEL = eINSTANCE.getTuio2Ptr_X_vel();

		/**
		 * The meta object literal for the '<em><b>Yvel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_PTR__YVEL = eINSTANCE.getTuio2Ptr_Y_vel();

		/**
		 * The meta object literal for the '<em><b>Macc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_PTR__MACC = eINSTANCE.getTuio2Ptr_M_acc();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2BNDImpl <em>Tuio2 BND</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2BNDImpl
		 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2BND()
		 * @generated
		 */
		EClass TUIO2_BND = eINSTANCE.getTuio2BND();

		/**
		 * The meta object literal for the '<em><b>Sid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_BND__SID = eINSTANCE.getTuio2BND_S_id();

		/**
		 * The meta object literal for the '<em><b>Xpos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_BND__XPOS = eINSTANCE.getTuio2BND_X_pos();

		/**
		 * The meta object literal for the '<em><b>Ypos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_BND__YPOS = eINSTANCE.getTuio2BND_Y_pos();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_BND__ANGLE = eINSTANCE.getTuio2BND_Angle();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_BND__WIDTH = eINSTANCE.getTuio2BND_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_BND__HEIGHT = eINSTANCE.getTuio2BND_Height();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_BND__AREA = eINSTANCE.getTuio2BND_Area();

		/**
		 * The meta object literal for the '<em><b>Xvel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_BND__XVEL = eINSTANCE.getTuio2BND_X_vel();

		/**
		 * The meta object literal for the '<em><b>Yvel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_BND__YVEL = eINSTANCE.getTuio2BND_Y_vel();

		/**
		 * The meta object literal for the '<em><b>Avel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_BND__AVEL = eINSTANCE.getTuio2BND_A_vel();

		/**
		 * The meta object literal for the '<em><b>Macc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_BND__MACC = eINSTANCE.getTuio2BND_M_acc();

		/**
		 * The meta object literal for the '<em><b>Racc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_BND__RACC = eINSTANCE.getTuio2BND_R_acc();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio2.impl.TuioPointImpl <em>Tuio Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio2.impl.TuioPointImpl
		 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuioPoint()
		 * @generated
		 */
		EClass TUIO_POINT = eINSTANCE.getTuioPoint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO_POINT__X = eINSTANCE.getTuioPoint_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO_POINT__Y = eINSTANCE.getTuioPoint_Y();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2SymImpl <em>Tuio2 Sym</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2SymImpl
		 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2Sym()
		 * @generated
		 */
		EClass TUIO2_SYM = eINSTANCE.getTuio2Sym();

		/**
		 * The meta object literal for the '<em><b>Sid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_SYM__SID = eINSTANCE.getTuio2Sym_S_id();

		/**
		 * The meta object literal for the '<em><b>Tu id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_SYM__TU_ID = eINSTANCE.getTuio2Sym_Tu_id();

		/**
		 * The meta object literal for the '<em><b>Cid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_SYM__CID = eINSTANCE.getTuio2Sym_C_id();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_SYM__GROUP = eINSTANCE.getTuio2Sym_Group();

		/**
		 * The meta object literal for the '<em><b>S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_SYM__S = eINSTANCE.getTuio2Sym_S();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2T3DImpl <em>Tuio2 T3D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2T3DImpl
		 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2T3D()
		 * @generated
		 */
		EClass TUIO2_T3D = eINSTANCE.getTuio2T3D();

		/**
		 * The meta object literal for the '<em><b>Sid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_T3D__SID = eINSTANCE.getTuio2T3D_S_id();

		/**
		 * The meta object literal for the '<em><b>Tu id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_T3D__TU_ID = eINSTANCE.getTuio2T3D_Tu_id();

		/**
		 * The meta object literal for the '<em><b>Cid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_T3D__CID = eINSTANCE.getTuio2T3D_C_id();

		/**
		 * The meta object literal for the '<em><b>Xpos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_T3D__XPOS = eINSTANCE.getTuio2T3D_X_pos();

		/**
		 * The meta object literal for the '<em><b>Ypos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_T3D__YPOS = eINSTANCE.getTuio2T3D_Y_pos();

		/**
		 * The meta object literal for the '<em><b>Zpos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_T3D__ZPOS = eINSTANCE.getTuio2T3D_Z_pos();

		/**
		 * The meta object literal for the '<em><b>Yaw</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_T3D__YAW = eINSTANCE.getTuio2T3D_Yaw();

		/**
		 * The meta object literal for the '<em><b>Pitch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_T3D__PITCH = eINSTANCE.getTuio2T3D_Pitch();

		/**
		 * The meta object literal for the '<em><b>Roll</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_T3D__ROLL = eINSTANCE.getTuio2T3D_Roll();

		/**
		 * The meta object literal for the '<em><b>Xvel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_T3D__XVEL = eINSTANCE.getTuio2T3D_X_vel();

		/**
		 * The meta object literal for the '<em><b>Yvel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_T3D__YVEL = eINSTANCE.getTuio2T3D_Y_vel();

		/**
		 * The meta object literal for the '<em><b>Zvel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_T3D__ZVEL = eINSTANCE.getTuio2T3D_Z_vel();

		/**
		 * The meta object literal for the '<em><b>Avel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_T3D__AVEL = eINSTANCE.getTuio2T3D_A_vel();

		/**
		 * The meta object literal for the '<em><b>Bvel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_T3D__BVEL = eINSTANCE.getTuio2T3D_B_vel();

		/**
		 * The meta object literal for the '<em><b>Cvel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_T3D__CVEL = eINSTANCE.getTuio2T3D_C_vel();

		/**
		 * The meta object literal for the '<em><b>Macc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_T3D__MACC = eINSTANCE.getTuio2T3D_M_acc();

		/**
		 * The meta object literal for the '<em><b>Racc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_T3D__RACC = eINSTANCE.getTuio2T3D_R_acc();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2P3DImpl <em>Tuio2 P3D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2P3DImpl
		 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2P3D()
		 * @generated
		 */
		EClass TUIO2_P3D = eINSTANCE.getTuio2P3D();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2B3DImpl <em>Tuio2 B3D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2B3DImpl
		 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2B3D()
		 * @generated
		 */
		EClass TUIO2_B3D = eINSTANCE.getTuio2B3D();

		/**
		 * The meta object literal for the '<em><b>Sid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_B3D__SID = eINSTANCE.getTuio2B3D_S_id();

		/**
		 * The meta object literal for the '<em><b>Xpos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_B3D__XPOS = eINSTANCE.getTuio2B3D_X_pos();

		/**
		 * The meta object literal for the '<em><b>Ypos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_B3D__YPOS = eINSTANCE.getTuio2B3D_Y_pos();

		/**
		 * The meta object literal for the '<em><b>Zpos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_B3D__ZPOS = eINSTANCE.getTuio2B3D_Z_pos();

		/**
		 * The meta object literal for the '<em><b>Yaw</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_B3D__YAW = eINSTANCE.getTuio2B3D_Yaw();

		/**
		 * The meta object literal for the '<em><b>Pitch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_B3D__PITCH = eINSTANCE.getTuio2B3D_Pitch();

		/**
		 * The meta object literal for the '<em><b>Roll</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_B3D__ROLL = eINSTANCE.getTuio2B3D_Roll();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_B3D__WIDTH = eINSTANCE.getTuio2B3D_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_B3D__HEIGHT = eINSTANCE.getTuio2B3D_Height();

		/**
		 * The meta object literal for the '<em><b>Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_B3D__DEPTH = eINSTANCE.getTuio2B3D_Depth();

		/**
		 * The meta object literal for the '<em><b>Vol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_B3D__VOL = eINSTANCE.getTuio2B3D_Vol();

		/**
		 * The meta object literal for the '<em><b>Xvel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_B3D__XVEL = eINSTANCE.getTuio2B3D_X_vel();

		/**
		 * The meta object literal for the '<em><b>Yvel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_B3D__YVEL = eINSTANCE.getTuio2B3D_Y_vel();

		/**
		 * The meta object literal for the '<em><b>Zvel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_B3D__ZVEL = eINSTANCE.getTuio2B3D_Z_vel();

		/**
		 * The meta object literal for the '<em><b>Avel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_B3D__AVEL = eINSTANCE.getTuio2B3D_A_vel();

		/**
		 * The meta object literal for the '<em><b>Bvel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_B3D__BVEL = eINSTANCE.getTuio2B3D_B_vel();

		/**
		 * The meta object literal for the '<em><b>Cvel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_B3D__CVEL = eINSTANCE.getTuio2B3D_C_vel();

		/**
		 * The meta object literal for the '<em><b>Macc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_B3D__MACC = eINSTANCE.getTuio2B3D_M_acc();

		/**
		 * The meta object literal for the '<em><b>Racc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_B3D__RACC = eINSTANCE.getTuio2B3D_R_acc();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2CHGImpl <em>Tuio2 CHG</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2CHGImpl
		 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2CHG()
		 * @generated
		 */
		EClass TUIO2_CHG = eINSTANCE.getTuio2CHG();

		/**
		 * The meta object literal for the '<em><b>Sid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_CHG__SID = eINSTANCE.getTuio2CHG_S_id();

		/**
		 * The meta object literal for the '<em><b>Pts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUIO2_CHG__PTS = eINSTANCE.getTuio2CHG_Pts();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2OCGImpl <em>Tuio2 OCG</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2OCGImpl
		 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2OCG()
		 * @generated
		 */
		EClass TUIO2_OCG = eINSTANCE.getTuio2OCG();

		/**
		 * The meta object literal for the '<em><b>Sid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_OCG__SID = eINSTANCE.getTuio2OCG_S_id();

		/**
		 * The meta object literal for the '<em><b>Pts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUIO2_OCG__PTS = eINSTANCE.getTuio2OCG_Pts();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2ICGImpl <em>Tuio2 ICG</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2ICGImpl
		 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2ICG()
		 * @generated
		 */
		EClass TUIO2_ICG = eINSTANCE.getTuio2ICG();

		/**
		 * The meta object literal for the '<em><b>Sid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_ICG__SID = eINSTANCE.getTuio2ICG_S_id();

		/**
		 * The meta object literal for the '<em><b>Pts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUIO2_ICG__PTS = eINSTANCE.getTuio2ICG_Pts();

		/**
		 * The meta object literal for the '<em><b>Additional</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUIO2_ICG__ADDITIONAL = eINSTANCE.getTuio2ICG_Additional();

		/**
		 * The meta object literal for the '<em><b>Shape Needed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_ICG__SHAPE_NEEDED = eINSTANCE.getTuio2ICG_ShapeNeeded();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio2.impl.TreeElemImpl <em>Tree Elem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio2.impl.TreeElemImpl
		 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTreeElem()
		 * @generated
		 */
		EClass TREE_ELEM = eINSTANCE.getTreeElem();

		/**
		 * The meta object literal for the '<em><b>Pt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREE_ELEM__PT = eINSTANCE.getTreeElem_Pt();

		/**
		 * The meta object literal for the '<em><b>Last Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREE_ELEM__LAST_NODE = eINSTANCE.getTreeElem_LastNode();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREE_ELEM__ID = eINSTANCE.getTreeElem_Id();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio2.impl.SpansAreaImpl <em>Spans Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio2.impl.SpansAreaImpl
		 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getSpansArea()
		 * @generated
		 */
		EClass SPANS_AREA = eINSTANCE.getSpansArea();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPANS_AREA__X = eINSTANCE.getSpansArea_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPANS_AREA__Y = eINSTANCE.getSpansArea_Y();

		/**
		 * The meta object literal for the '<em><b>W</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPANS_AREA__W = eINSTANCE.getSpansArea_W();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio2.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio2.impl.LinkImpl
		 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Sid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__SID = eINSTANCE.getLink_S_id();

		/**
		 * The meta object literal for the '<em><b>Lnk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__LNK = eINSTANCE.getLink_Lnk();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio2.impl.LinkTreeElemImpl <em>Link Tree Elem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio2.impl.LinkTreeElemImpl
		 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getLinkTreeElem()
		 * @generated
		 */
		EClass LINK_TREE_ELEM = eINSTANCE.getLinkTreeElem();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TREE_ELEM__ID = eINSTANCE.getLinkTreeElem_Id();

		/**
		 * The meta object literal for the '<em><b>Last Node</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TREE_ELEM__LAST_NODE = eINSTANCE.getLinkTreeElem_LastNode();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK_TREE_ELEM__LINK = eINSTANCE.getLinkTreeElem_Link();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2SKGImpl <em>Tuio2 SKG</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2SKGImpl
		 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2SKG()
		 * @generated
		 */
		EClass TUIO2_SKG = eINSTANCE.getTuio2SKG();

		/**
		 * The meta object literal for the '<em><b>Sid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_SKG__SID = eINSTANCE.getTuio2SKG_S_id();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUIO2_SKG__NODES = eINSTANCE.getTuio2SKG_Nodes();

		/**
		 * The meta object literal for the '<em><b>Radiuses</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_SKG__RADIUSES = eINSTANCE.getTuio2SKG_Radiuses();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2SVGImpl <em>Tuio2 SVG</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2SVGImpl
		 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2SVG()
		 * @generated
		 */
		EClass TUIO2_SVG = eINSTANCE.getTuio2SVG();

		/**
		 * The meta object literal for the '<em><b>Sid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_SVG__SID = eINSTANCE.getTuio2SVG_S_id();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2ARGImpl <em>Tuio2 ARG</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2ARGImpl
		 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2ARG()
		 * @generated
		 */
		EClass TUIO2_ARG = eINSTANCE.getTuio2ARG();

		/**
		 * The meta object literal for the '<em><b>Sid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_ARG__SID = eINSTANCE.getTuio2ARG_S_id();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUIO2_ARG__ARGS = eINSTANCE.getTuio2ARG_Args();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2RAWImpl <em>Tuio2 RAW</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2RAWImpl
		 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2RAW()
		 * @generated
		 */
		EClass TUIO2_RAW = eINSTANCE.getTuio2RAW();

		/**
		 * The meta object literal for the '<em><b>Sid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_RAW__SID = eINSTANCE.getTuio2RAW_S_id();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_RAW__WIDTH = eINSTANCE.getTuio2RAW_Width();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_RAW__DATA = eINSTANCE.getTuio2RAW_Data();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2CTLImpl <em>Tuio2 CTL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2CTLImpl
		 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2CTL()
		 * @generated
		 */
		EClass TUIO2_CTL = eINSTANCE.getTuio2CTL();

		/**
		 * The meta object literal for the '<em><b>Sid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_CTL__SID = eINSTANCE.getTuio2CTL_S_id();

		/**
		 * The meta object literal for the '<em><b>Ctrl</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_CTL__CTRL = eINSTANCE.getTuio2CTL_Ctrl();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2DATImpl <em>Tuio2 DAT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2DATImpl
		 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2DAT()
		 * @generated
		 */
		EClass TUIO2_DAT = eINSTANCE.getTuio2DAT();

		/**
		 * The meta object literal for the '<em><b>Sid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_DAT__SID = eINSTANCE.getTuio2DAT_S_id();

		/**
		 * The meta object literal for the '<em><b>Mime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_DAT__MIME = eINSTANCE.getTuio2DAT_Mime();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_DAT__DATA = eINSTANCE.getTuio2DAT_Data();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2SIGImpl <em>Tuio2 SIG</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2SIGImpl
		 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2SIG()
		 * @generated
		 */
		EClass TUIO2_SIG = eINSTANCE.getTuio2SIG();

		/**
		 * The meta object literal for the '<em><b>Sid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_SIG__SID = eINSTANCE.getTuio2SIG_S_id();

		/**
		 * The meta object literal for the '<em><b>Cid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_SIG__CID = eINSTANCE.getTuio2SIG_C_id();

		/**
		 * The meta object literal for the '<em><b>Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_SIG__IDS = eINSTANCE.getTuio2SIG_Ids();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2ALAImpl <em>Tuio2 ALA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2ALAImpl
		 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2ALA()
		 * @generated
		 */
		EClass TUIO2_ALA = eINSTANCE.getTuio2ALA();

		/**
		 * The meta object literal for the '<em><b>Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_ALA__IDS = eINSTANCE.getTuio2ALA_Ids();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2COAImpl <em>Tuio2 COA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2COAImpl
		 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2COA()
		 * @generated
		 */
		EClass TUIO2_COA = eINSTANCE.getTuio2COA();

		/**
		 * The meta object literal for the '<em><b>Sid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_COA__SID = eINSTANCE.getTuio2COA_S_id();

		/**
		 * The meta object literal for the '<em><b>Slot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_COA__SLOT = eINSTANCE.getTuio2COA_Slot();

		/**
		 * The meta object literal for the '<em><b>Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_COA__IDS = eINSTANCE.getTuio2COA_Ids();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2LIAImpl <em>Tuio2 LIA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2LIAImpl
		 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2LIA()
		 * @generated
		 */
		EClass TUIO2_LIA = eINSTANCE.getTuio2LIA();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUIO2_LIA__LINKS = eINSTANCE.getTuio2LIA_Links();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2LLAImpl <em>Tuio2 LLA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2LLAImpl
		 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2LLA()
		 * @generated
		 */
		EClass TUIO2_LLA = eINSTANCE.getTuio2LLA();

		/**
		 * The meta object literal for the '<em><b>Sid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_LLA__SID = eINSTANCE.getTuio2LLA_S_id();

		/**
		 * The meta object literal for the '<em><b>Bool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_LLA__BOOL = eINSTANCE.getTuio2LLA_Bool();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUIO2_LLA__LINKS = eINSTANCE.getTuio2LLA_Links();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2LTAImpl <em>Tuio2 LTA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2LTAImpl
		 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2LTA()
		 * @generated
		 */
		EClass TUIO2_LTA = eINSTANCE.getTuio2LTA();

		/**
		 * The meta object literal for the '<em><b>Sid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_LTA__SID = eINSTANCE.getTuio2LTA_S_id();

		/**
		 * The meta object literal for the '<em><b>Bool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_LTA__BOOL = eINSTANCE.getTuio2LTA_Bool();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUIO2_LTA__LINKS = eINSTANCE.getTuio2LTA_Links();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2FRMImpl <em>Tuio2 FRM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2FRMImpl
		 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2FRM()
		 * @generated
		 */
		EClass TUIO2_FRM = eINSTANCE.getTuio2FRM();

		/**
		 * The meta object literal for the '<em><b>Fid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_FRM__FID = eINSTANCE.getTuio2FRM_F_id();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_FRM__TIME = eINSTANCE.getTuio2FRM_Time();

		/**
		 * The meta object literal for the '<em><b>App</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_FRM__APP = eINSTANCE.getTuio2FRM_App();

		/**
		 * The meta object literal for the '<em><b>Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_FRM__ADDR = eINSTANCE.getTuio2FRM_Addr();

		/**
		 * The meta object literal for the '<em><b>Dim</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_FRM__DIM = eINSTANCE.getTuio2FRM_Dim();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osc.eztuio2.impl.Tuio2ALVImpl <em>Tuio2 ALV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osc.eztuio2.impl.Tuio2ALVImpl
		 * @see net.sf.smbt.osc.eztuio2.impl.Eztuio2PackageImpl#getTuio2ALV()
		 * @generated
		 */
		EClass TUIO2_ALV = eINSTANCE.getTuio2ALV();

		/**
		 * The meta object literal for the '<em><b>Sids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUIO2_ALV__SIDS = eINSTANCE.getTuio2ALV_S_ids();

	}

} //Eztuio2Package
