/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.json.ecore.ezjson;

import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see net.sf.smbt.json.ecore.ezjson.EzjsonFactory
 * @model kind="package"
 * @generated
 */
public interface EzjsonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ezjson";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ubiquisense.com/ezjson/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ezjson";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzjsonPackage eINSTANCE = net.sf.smbt.json.ecore.ezjson.impl.EzjsonPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.json.ecore.ezjson.impl.JsonCmdImpl <em>Json Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.json.ecore.ezjson.impl.JsonCmdImpl
	 * @see net.sf.smbt.json.ecore.ezjson.impl.EzjsonPackageImpl#getJsonCmd()
	 * @generated
	 */
	int JSON_CMD = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_CMD__PRIORITY = CmdPackage.CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_CMD__STAMP = CmdPackage.CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Json</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_CMD__JSON = CmdPackage.CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Json Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_CMD_FEATURE_COUNT = CmdPackage.CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.json.ecore.ezjson.impl.InJSonCmdImpl <em>In JSon Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.json.ecore.ezjson.impl.InJSonCmdImpl
	 * @see net.sf.smbt.json.ecore.ezjson.impl.EzjsonPackageImpl#getInJSonCmd()
	 * @generated
	 */
	int IN_JSON_CMD = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_JSON_CMD__PRIORITY = JSON_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_JSON_CMD__STAMP = JSON_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Json</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_JSON_CMD__JSON = JSON_CMD__JSON;

	/**
	 * The number of structural features of the '<em>In JSon Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_JSON_CMD_FEATURE_COUNT = JSON_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.json.ecore.ezjson.impl.OutJsonCmdImpl <em>Out Json Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.json.ecore.ezjson.impl.OutJsonCmdImpl
	 * @see net.sf.smbt.json.ecore.ezjson.impl.EzjsonPackageImpl#getOutJsonCmd()
	 * @generated
	 */
	int OUT_JSON_CMD = 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_JSON_CMD__PRIORITY = JSON_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_JSON_CMD__STAMP = JSON_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Json</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_JSON_CMD__JSON = JSON_CMD__JSON;

	/**
	 * The number of structural features of the '<em>Out Json Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_JSON_CMD_FEATURE_COUNT = JSON_CMD_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.json.ecore.ezjson.JsonCmd <em>Json Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Json Cmd</em>'.
	 * @see net.sf.smbt.json.ecore.ezjson.JsonCmd
	 * @generated
	 */
	EClass getJsonCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.json.ecore.ezjson.JsonCmd#getJson <em>Json</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Json</em>'.
	 * @see net.sf.smbt.json.ecore.ezjson.JsonCmd#getJson()
	 * @see #getJsonCmd()
	 * @generated
	 */
	EAttribute getJsonCmd_Json();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.json.ecore.ezjson.InJSonCmd <em>In JSon Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In JSon Cmd</em>'.
	 * @see net.sf.smbt.json.ecore.ezjson.InJSonCmd
	 * @generated
	 */
	EClass getInJSonCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.json.ecore.ezjson.OutJsonCmd <em>Out Json Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Json Cmd</em>'.
	 * @see net.sf.smbt.json.ecore.ezjson.OutJsonCmd
	 * @generated
	 */
	EClass getOutJsonCmd();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EzjsonFactory getEzjsonFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.json.ecore.ezjson.impl.JsonCmdImpl <em>Json Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.json.ecore.ezjson.impl.JsonCmdImpl
		 * @see net.sf.smbt.json.ecore.ezjson.impl.EzjsonPackageImpl#getJsonCmd()
		 * @generated
		 */
		EClass JSON_CMD = eINSTANCE.getJsonCmd();

		/**
		 * The meta object literal for the '<em><b>Json</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_CMD__JSON = eINSTANCE.getJsonCmd_Json();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.json.ecore.ezjson.impl.InJSonCmdImpl <em>In JSon Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.json.ecore.ezjson.impl.InJSonCmdImpl
		 * @see net.sf.smbt.json.ecore.ezjson.impl.EzjsonPackageImpl#getInJSonCmd()
		 * @generated
		 */
		EClass IN_JSON_CMD = eINSTANCE.getInJSonCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.json.ecore.ezjson.impl.OutJsonCmdImpl <em>Out Json Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.json.ecore.ezjson.impl.OutJsonCmdImpl
		 * @see net.sf.smbt.json.ecore.ezjson.impl.EzjsonPackageImpl#getOutJsonCmd()
		 * @generated
		 */
		EClass OUT_JSON_CMD = eINSTANCE.getOutJsonCmd();

	}

} //EzjsonPackage
