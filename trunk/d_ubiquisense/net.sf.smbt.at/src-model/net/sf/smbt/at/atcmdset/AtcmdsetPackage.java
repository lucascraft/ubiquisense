/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.at.atcmdset;

import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see net.sf.smbt.at.atcmdset.AtcmdsetFactory
 * @model kind="package"
 * @generated
 */
public interface AtcmdsetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "atcmdset";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://atcmdset/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "atcmdset";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AtcmdsetPackage eINSTANCE = net.sf.smbt.at.atcmdset.impl.AtcmdsetPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.at.atcmdset.impl.ATCmdImpl <em>AT Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.at.atcmdset.impl.ATCmdImpl
	 * @see net.sf.smbt.at.atcmdset.impl.AtcmdsetPackageImpl#getATCmd()
	 * @generated
	 */
	int AT_CMD = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_CMD__PRIORITY = CmdPackage.CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_CMD__STAMP = CmdPackage.CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_CMD__KIND = CmdPackage.CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_CMD__TOKEN = CmdPackage.CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_CMD__DATA = CmdPackage.CMD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>AT Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_CMD_FEATURE_COUNT = CmdPackage.CMD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.at.atcmdset.impl.ATRetCmdImpl <em>AT Ret Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.at.atcmdset.impl.ATRetCmdImpl
	 * @see net.sf.smbt.at.atcmdset.impl.AtcmdsetPackageImpl#getATRetCmd()
	 * @generated
	 */
	int AT_RET_CMD = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_RET_CMD__PRIORITY = CmdPackage.CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_RET_CMD__STAMP = CmdPackage.CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_RET_CMD__CODE = CmdPackage.CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_RET_CMD__DATA = CmdPackage.CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_RET_CMD__MESSAGE = CmdPackage.CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_RET_CMD__STATUS = CmdPackage.CMD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>AT Ret Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_RET_CMD_FEATURE_COUNT = CmdPackage.CMD_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.at.atcmdset.impl.ATPlusPlusPlusImpl <em>AT Plus Plus Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.at.atcmdset.impl.ATPlusPlusPlusImpl
	 * @see net.sf.smbt.at.atcmdset.impl.AtcmdsetPackageImpl#getATPlusPlusPlus()
	 * @generated
	 */
	int AT_PLUS_PLUS_PLUS = 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_PLUS_PLUS_PLUS__PRIORITY = AT_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_PLUS_PLUS_PLUS__STAMP = AT_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_PLUS_PLUS_PLUS__KIND = AT_CMD__KIND;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_PLUS_PLUS_PLUS__TOKEN = AT_CMD__TOKEN;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_PLUS_PLUS_PLUS__DATA = AT_CMD__DATA;

	/**
	 * The number of structural features of the '<em>AT Plus Plus Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_PLUS_PLUS_PLUS_FEATURE_COUNT = AT_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.at.atcmdset.impl.ATBDImpl <em>ATBD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.at.atcmdset.impl.ATBDImpl
	 * @see net.sf.smbt.at.atcmdset.impl.AtcmdsetPackageImpl#getATBD()
	 * @generated
	 */
	int ATBD = 3;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATBD__PRIORITY = AT_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATBD__STAMP = AT_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATBD__KIND = AT_CMD__KIND;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATBD__TOKEN = AT_CMD__TOKEN;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATBD__DATA = AT_CMD__DATA;

	/**
	 * The number of structural features of the '<em>ATBD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATBD_FEATURE_COUNT = AT_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.at.atcmdset.impl.ATWRImpl <em>ATWR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.at.atcmdset.impl.ATWRImpl
	 * @see net.sf.smbt.at.atcmdset.impl.AtcmdsetPackageImpl#getATWR()
	 * @generated
	 */
	int ATWR = 4;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATWR__PRIORITY = AT_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATWR__STAMP = AT_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATWR__KIND = AT_CMD__KIND;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATWR__TOKEN = AT_CMD__TOKEN;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATWR__DATA = AT_CMD__DATA;

	/**
	 * The number of structural features of the '<em>ATWR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATWR_FEATURE_COUNT = AT_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.at.atcmdset.impl.ATCNImpl <em>ATCN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.at.atcmdset.impl.ATCNImpl
	 * @see net.sf.smbt.at.atcmdset.impl.AtcmdsetPackageImpl#getATCN()
	 * @generated
	 */
	int ATCN = 5;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCN__PRIORITY = AT_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCN__STAMP = AT_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCN__KIND = AT_CMD__KIND;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCN__TOKEN = AT_CMD__TOKEN;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCN__DATA = AT_CMD__DATA;

	/**
	 * The number of structural features of the '<em>ATCN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATCN_FEATURE_COUNT = AT_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.at.atcmdset.impl.ATIDImpl <em>ATID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.at.atcmdset.impl.ATIDImpl
	 * @see net.sf.smbt.at.atcmdset.impl.AtcmdsetPackageImpl#getATID()
	 * @generated
	 */
	int ATID = 6;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATID__PRIORITY = AT_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATID__STAMP = AT_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATID__KIND = AT_CMD__KIND;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATID__TOKEN = AT_CMD__TOKEN;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATID__DATA = AT_CMD__DATA;

	/**
	 * The number of structural features of the '<em>ATID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATID_FEATURE_COUNT = AT_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.at.atcmdset.impl.ATMYImpl <em>ATMY</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.at.atcmdset.impl.ATMYImpl
	 * @see net.sf.smbt.at.atcmdset.impl.AtcmdsetPackageImpl#getATMY()
	 * @generated
	 */
	int ATMY = 7;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATMY__PRIORITY = AT_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATMY__STAMP = AT_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATMY__KIND = AT_CMD__KIND;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATMY__TOKEN = AT_CMD__TOKEN;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATMY__DATA = AT_CMD__DATA;

	/**
	 * The number of structural features of the '<em>ATMY</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATMY_FEATURE_COUNT = AT_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.at.atcmdset.impl.ATDLImpl <em>ATDL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.at.atcmdset.impl.ATDLImpl
	 * @see net.sf.smbt.at.atcmdset.impl.AtcmdsetPackageImpl#getATDL()
	 * @generated
	 */
	int ATDL = 8;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATDL__PRIORITY = AT_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATDL__STAMP = AT_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATDL__KIND = AT_CMD__KIND;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATDL__TOKEN = AT_CMD__TOKEN;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATDL__DATA = AT_CMD__DATA;

	/**
	 * The number of structural features of the '<em>ATDL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATDL_FEATURE_COUNT = AT_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES <em>AT COMMAND TYPES</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES
	 * @see net.sf.smbt.at.atcmdset.impl.AtcmdsetPackageImpl#getAT_COMMAND_TYPES()
	 * @generated
	 */
	int AT_COMMAND_TYPES = 9;

	/**
	 * The meta object id for the '{@link net.sf.smbt.at.atcmdset.V34_COMMAND_TYPES <em>V34 COMMAND TYPES</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.at.atcmdset.V34_COMMAND_TYPES
	 * @see net.sf.smbt.at.atcmdset.impl.AtcmdsetPackageImpl#getV34_COMMAND_TYPES()
	 * @generated
	 */
	int V34_COMMAND_TYPES = 10;

	/**
	 * The meta object id for the '{@link net.sf.smbt.at.atcmdset.AT_RET_CODES <em>AT RET CODES</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.at.atcmdset.AT_RET_CODES
	 * @see net.sf.smbt.at.atcmdset.impl.AtcmdsetPackageImpl#getAT_RET_CODES()
	 * @generated
	 */
	int AT_RET_CODES = 11;

	/**
	 * The meta object id for the '{@link net.sf.smbt.at.atcmdset.AT_COUNTRY_CODES <em>AT COUNTRY CODES</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.at.atcmdset.AT_COUNTRY_CODES
	 * @see net.sf.smbt.at.atcmdset.impl.AtcmdsetPackageImpl#getAT_COUNTRY_CODES()
	 * @generated
	 */
	int AT_COUNTRY_CODES = 12;


	/**
	 * The meta object id for the '{@link net.sf.smbt.at.atcmdset.AT_BAUD_RATE <em>AT BAUD RATE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.at.atcmdset.AT_BAUD_RATE
	 * @see net.sf.smbt.at.atcmdset.impl.AtcmdsetPackageImpl#getAT_BAUD_RATE()
	 * @generated
	 */
	int AT_BAUD_RATE = 13;


	/**
	 * The meta object id for the '{@link net.sf.smbt.at.atcmdset.AT_STATUS <em>AT STATUS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.at.atcmdset.AT_STATUS
	 * @see net.sf.smbt.at.atcmdset.impl.AtcmdsetPackageImpl#getAT_STATUS()
	 * @generated
	 */
	int AT_STATUS = 14;


	/**
	 * The meta object id for the '{@link net.sf.smbt.at.atcmdset.CMD_KIND <em>CMD KIND</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.at.atcmdset.CMD_KIND
	 * @see net.sf.smbt.at.atcmdset.impl.AtcmdsetPackageImpl#getCMD_KIND()
	 * @generated
	 */
	int CMD_KIND = 15;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.at.atcmdset.ATCmd <em>AT Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AT Cmd</em>'.
	 * @see net.sf.smbt.at.atcmdset.ATCmd
	 * @generated
	 */
	EClass getATCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.at.atcmdset.ATCmd#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see net.sf.smbt.at.atcmdset.ATCmd#getKind()
	 * @see #getATCmd()
	 * @generated
	 */
	EAttribute getATCmd_Kind();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.at.atcmdset.ATCmd#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see net.sf.smbt.at.atcmdset.ATCmd#getToken()
	 * @see #getATCmd()
	 * @generated
	 */
	EAttribute getATCmd_Token();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.at.atcmdset.ATCmd#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see net.sf.smbt.at.atcmdset.ATCmd#getData()
	 * @see #getATCmd()
	 * @generated
	 */
	EAttribute getATCmd_Data();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.at.atcmdset.ATRetCmd <em>AT Ret Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AT Ret Cmd</em>'.
	 * @see net.sf.smbt.at.atcmdset.ATRetCmd
	 * @generated
	 */
	EClass getATRetCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.at.atcmdset.ATRetCmd#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see net.sf.smbt.at.atcmdset.ATRetCmd#getCode()
	 * @see #getATRetCmd()
	 * @generated
	 */
	EAttribute getATRetCmd_Code();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.at.atcmdset.ATRetCmd#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see net.sf.smbt.at.atcmdset.ATRetCmd#getData()
	 * @see #getATRetCmd()
	 * @generated
	 */
	EAttribute getATRetCmd_Data();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.at.atcmdset.ATRetCmd#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see net.sf.smbt.at.atcmdset.ATRetCmd#getMessage()
	 * @see #getATRetCmd()
	 * @generated
	 */
	EAttribute getATRetCmd_Message();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.at.atcmdset.ATRetCmd#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see net.sf.smbt.at.atcmdset.ATRetCmd#getStatus()
	 * @see #getATRetCmd()
	 * @generated
	 */
	EAttribute getATRetCmd_Status();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.at.atcmdset.ATPlusPlusPlus <em>AT Plus Plus Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AT Plus Plus Plus</em>'.
	 * @see net.sf.smbt.at.atcmdset.ATPlusPlusPlus
	 * @generated
	 */
	EClass getATPlusPlusPlus();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.at.atcmdset.ATBD <em>ATBD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATBD</em>'.
	 * @see net.sf.smbt.at.atcmdset.ATBD
	 * @generated
	 */
	EClass getATBD();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.at.atcmdset.ATWR <em>ATWR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATWR</em>'.
	 * @see net.sf.smbt.at.atcmdset.ATWR
	 * @generated
	 */
	EClass getATWR();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.at.atcmdset.ATCN <em>ATCN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATCN</em>'.
	 * @see net.sf.smbt.at.atcmdset.ATCN
	 * @generated
	 */
	EClass getATCN();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.at.atcmdset.ATID <em>ATID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATID</em>'.
	 * @see net.sf.smbt.at.atcmdset.ATID
	 * @generated
	 */
	EClass getATID();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.at.atcmdset.ATMY <em>ATMY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATMY</em>'.
	 * @see net.sf.smbt.at.atcmdset.ATMY
	 * @generated
	 */
	EClass getATMY();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.at.atcmdset.ATDL <em>ATDL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATDL</em>'.
	 * @see net.sf.smbt.at.atcmdset.ATDL
	 * @generated
	 */
	EClass getATDL();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES <em>AT COMMAND TYPES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>AT COMMAND TYPES</em>'.
	 * @see net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES
	 * @generated
	 */
	EEnum getAT_COMMAND_TYPES();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.at.atcmdset.V34_COMMAND_TYPES <em>V34 COMMAND TYPES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>V34 COMMAND TYPES</em>'.
	 * @see net.sf.smbt.at.atcmdset.V34_COMMAND_TYPES
	 * @generated
	 */
	EEnum getV34_COMMAND_TYPES();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.at.atcmdset.AT_RET_CODES <em>AT RET CODES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>AT RET CODES</em>'.
	 * @see net.sf.smbt.at.atcmdset.AT_RET_CODES
	 * @generated
	 */
	EEnum getAT_RET_CODES();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.at.atcmdset.AT_COUNTRY_CODES <em>AT COUNTRY CODES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>AT COUNTRY CODES</em>'.
	 * @see net.sf.smbt.at.atcmdset.AT_COUNTRY_CODES
	 * @generated
	 */
	EEnum getAT_COUNTRY_CODES();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.at.atcmdset.AT_BAUD_RATE <em>AT BAUD RATE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>AT BAUD RATE</em>'.
	 * @see net.sf.smbt.at.atcmdset.AT_BAUD_RATE
	 * @generated
	 */
	EEnum getAT_BAUD_RATE();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.at.atcmdset.AT_STATUS <em>AT STATUS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>AT STATUS</em>'.
	 * @see net.sf.smbt.at.atcmdset.AT_STATUS
	 * @generated
	 */
	EEnum getAT_STATUS();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.at.atcmdset.CMD_KIND <em>CMD KIND</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CMD KIND</em>'.
	 * @see net.sf.smbt.at.atcmdset.CMD_KIND
	 * @generated
	 */
	EEnum getCMD_KIND();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AtcmdsetFactory getAtcmdsetFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.at.atcmdset.impl.ATCmdImpl <em>AT Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.at.atcmdset.impl.ATCmdImpl
		 * @see net.sf.smbt.at.atcmdset.impl.AtcmdsetPackageImpl#getATCmd()
		 * @generated
		 */
		EClass AT_CMD = eINSTANCE.getATCmd();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AT_CMD__KIND = eINSTANCE.getATCmd_Kind();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AT_CMD__TOKEN = eINSTANCE.getATCmd_Token();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AT_CMD__DATA = eINSTANCE.getATCmd_Data();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.at.atcmdset.impl.ATRetCmdImpl <em>AT Ret Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.at.atcmdset.impl.ATRetCmdImpl
		 * @see net.sf.smbt.at.atcmdset.impl.AtcmdsetPackageImpl#getATRetCmd()
		 * @generated
		 */
		EClass AT_RET_CMD = eINSTANCE.getATRetCmd();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AT_RET_CMD__CODE = eINSTANCE.getATRetCmd_Code();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AT_RET_CMD__DATA = eINSTANCE.getATRetCmd_Data();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AT_RET_CMD__MESSAGE = eINSTANCE.getATRetCmd_Message();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AT_RET_CMD__STATUS = eINSTANCE.getATRetCmd_Status();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.at.atcmdset.impl.ATPlusPlusPlusImpl <em>AT Plus Plus Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.at.atcmdset.impl.ATPlusPlusPlusImpl
		 * @see net.sf.smbt.at.atcmdset.impl.AtcmdsetPackageImpl#getATPlusPlusPlus()
		 * @generated
		 */
		EClass AT_PLUS_PLUS_PLUS = eINSTANCE.getATPlusPlusPlus();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.at.atcmdset.impl.ATBDImpl <em>ATBD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.at.atcmdset.impl.ATBDImpl
		 * @see net.sf.smbt.at.atcmdset.impl.AtcmdsetPackageImpl#getATBD()
		 * @generated
		 */
		EClass ATBD = eINSTANCE.getATBD();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.at.atcmdset.impl.ATWRImpl <em>ATWR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.at.atcmdset.impl.ATWRImpl
		 * @see net.sf.smbt.at.atcmdset.impl.AtcmdsetPackageImpl#getATWR()
		 * @generated
		 */
		EClass ATWR = eINSTANCE.getATWR();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.at.atcmdset.impl.ATCNImpl <em>ATCN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.at.atcmdset.impl.ATCNImpl
		 * @see net.sf.smbt.at.atcmdset.impl.AtcmdsetPackageImpl#getATCN()
		 * @generated
		 */
		EClass ATCN = eINSTANCE.getATCN();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.at.atcmdset.impl.ATIDImpl <em>ATID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.at.atcmdset.impl.ATIDImpl
		 * @see net.sf.smbt.at.atcmdset.impl.AtcmdsetPackageImpl#getATID()
		 * @generated
		 */
		EClass ATID = eINSTANCE.getATID();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.at.atcmdset.impl.ATMYImpl <em>ATMY</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.at.atcmdset.impl.ATMYImpl
		 * @see net.sf.smbt.at.atcmdset.impl.AtcmdsetPackageImpl#getATMY()
		 * @generated
		 */
		EClass ATMY = eINSTANCE.getATMY();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.at.atcmdset.impl.ATDLImpl <em>ATDL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.at.atcmdset.impl.ATDLImpl
		 * @see net.sf.smbt.at.atcmdset.impl.AtcmdsetPackageImpl#getATDL()
		 * @generated
		 */
		EClass ATDL = eINSTANCE.getATDL();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES <em>AT COMMAND TYPES</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES
		 * @see net.sf.smbt.at.atcmdset.impl.AtcmdsetPackageImpl#getAT_COMMAND_TYPES()
		 * @generated
		 */
		EEnum AT_COMMAND_TYPES = eINSTANCE.getAT_COMMAND_TYPES();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.at.atcmdset.V34_COMMAND_TYPES <em>V34 COMMAND TYPES</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.at.atcmdset.V34_COMMAND_TYPES
		 * @see net.sf.smbt.at.atcmdset.impl.AtcmdsetPackageImpl#getV34_COMMAND_TYPES()
		 * @generated
		 */
		EEnum V34_COMMAND_TYPES = eINSTANCE.getV34_COMMAND_TYPES();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.at.atcmdset.AT_RET_CODES <em>AT RET CODES</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.at.atcmdset.AT_RET_CODES
		 * @see net.sf.smbt.at.atcmdset.impl.AtcmdsetPackageImpl#getAT_RET_CODES()
		 * @generated
		 */
		EEnum AT_RET_CODES = eINSTANCE.getAT_RET_CODES();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.at.atcmdset.AT_COUNTRY_CODES <em>AT COUNTRY CODES</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.at.atcmdset.AT_COUNTRY_CODES
		 * @see net.sf.smbt.at.atcmdset.impl.AtcmdsetPackageImpl#getAT_COUNTRY_CODES()
		 * @generated
		 */
		EEnum AT_COUNTRY_CODES = eINSTANCE.getAT_COUNTRY_CODES();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.at.atcmdset.AT_BAUD_RATE <em>AT BAUD RATE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.at.atcmdset.AT_BAUD_RATE
		 * @see net.sf.smbt.at.atcmdset.impl.AtcmdsetPackageImpl#getAT_BAUD_RATE()
		 * @generated
		 */
		EEnum AT_BAUD_RATE = eINSTANCE.getAT_BAUD_RATE();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.at.atcmdset.AT_STATUS <em>AT STATUS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.at.atcmdset.AT_STATUS
		 * @see net.sf.smbt.at.atcmdset.impl.AtcmdsetPackageImpl#getAT_STATUS()
		 * @generated
		 */
		EEnum AT_STATUS = eINSTANCE.getAT_STATUS();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.at.atcmdset.CMD_KIND <em>CMD KIND</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.at.atcmdset.CMD_KIND
		 * @see net.sf.smbt.at.atcmdset.impl.AtcmdsetPackageImpl#getCMD_KIND()
		 * @generated
		 */
		EEnum CMD_KIND = eINSTANCE.getCMD_KIND();

	}

} //AtcmdsetPackage
