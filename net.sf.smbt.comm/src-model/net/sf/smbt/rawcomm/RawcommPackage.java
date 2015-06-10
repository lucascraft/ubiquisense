/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.rawcomm;

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
 * @see net.sf.smbt.rawcomm.RawcommFactory
 * @model kind="package"
 * @generated
 */
public interface RawcommPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rawcomm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://rawcomm/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rawcomm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RawcommPackage eINSTANCE = net.sf.smbt.rawcomm.impl.RawcommPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.rawcomm.impl.RawCmdImpl <em>Raw Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.rawcomm.impl.RawCmdImpl
	 * @see net.sf.smbt.rawcomm.impl.RawcommPackageImpl#getRawCmd()
	 * @generated
	 */
	int RAW_CMD = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_CMD__PRIORITY = CmdPackage.CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_CMD__STAMP = CmdPackage.CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_CMD__BYTES = CmdPackage.CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Raw Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_CMD_FEATURE_COUNT = CmdPackage.CMD_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.rawcomm.RawCmd <em>Raw Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raw Cmd</em>'.
	 * @see net.sf.smbt.rawcomm.RawCmd
	 * @generated
	 */
	EClass getRawCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.rawcomm.RawCmd#getBytes <em>Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bytes</em>'.
	 * @see net.sf.smbt.rawcomm.RawCmd#getBytes()
	 * @see #getRawCmd()
	 * @generated
	 */
	EAttribute getRawCmd_Bytes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RawcommFactory getRawcommFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.rawcomm.impl.RawCmdImpl <em>Raw Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.rawcomm.impl.RawCmdImpl
		 * @see net.sf.smbt.rawcomm.impl.RawcommPackageImpl#getRawCmd()
		 * @generated
		 */
		EClass RAW_CMD = eINSTANCE.getRawCmd();

		/**
		 * The meta object literal for the '<em><b>Bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RAW_CMD__BYTES = eINSTANCE.getRawCmd_Bytes();

	}

} //RawcommPackage
