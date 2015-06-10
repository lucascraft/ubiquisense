/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osccmd;

import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see net.sf.smbt.osccmd.OsccmdFactory
 * @model kind="package"
 * @generated
 */
public interface OsccmdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "osccmd";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://osccmd/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "osccmd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OsccmdPackage eINSTANCE = net.sf.smbt.osccmd.impl.OsccmdPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.osccmd.impl.OscCmdImpl <em>Osc Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osccmd.impl.OscCmdImpl
	 * @see net.sf.smbt.osccmd.impl.OsccmdPackageImpl#getOscCmd()
	 * @generated
	 */
	int OSC_CMD = 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_CMD__PRIORITY = CmdPackage.CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_CMD__STAMP = CmdPackage.CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_CMD__MSG = CmdPackage.CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Osc Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_CMD_FEATURE_COUNT = CmdPackage.CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osccmd.impl.OscSndCmdImpl <em>Osc Snd Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osccmd.impl.OscSndCmdImpl
	 * @see net.sf.smbt.osccmd.impl.OsccmdPackageImpl#getOscSndCmd()
	 * @generated
	 */
	int OSC_SND_CMD = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_SND_CMD__PRIORITY = OSC_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_SND_CMD__STAMP = OSC_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_SND_CMD__MSG = OSC_CMD__MSG;

	/**
	 * The number of structural features of the '<em>Osc Snd Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_SND_CMD_FEATURE_COUNT = OSC_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.osccmd.impl.OscRcvCmdImpl <em>Osc Rcv Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.osccmd.impl.OscRcvCmdImpl
	 * @see net.sf.smbt.osccmd.impl.OsccmdPackageImpl#getOscRcvCmd()
	 * @generated
	 */
	int OSC_RCV_CMD = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_RCV_CMD__PRIORITY = OSC_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_RCV_CMD__STAMP = OSC_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_RCV_CMD__MSG = OSC_CMD__MSG;

	/**
	 * The number of structural features of the '<em>Osc Rcv Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_RCV_CMD_FEATURE_COUNT = OSC_CMD_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '<em>OSC Message</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.illposed.osc.OSCMessage
	 * @see net.sf.smbt.osccmd.impl.OsccmdPackageImpl#getOSCMessage()
	 * @generated
	 */
	int OSC_MESSAGE = 3;


	/**
	 * The meta object id for the '<em>OSC Packet</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.illposed.osc.OSCPacket
	 * @see net.sf.smbt.osccmd.impl.OsccmdPackageImpl#getOSCPacket()
	 * @generated
	 */
	int OSC_PACKET = 4;

	/**
	 * The meta object id for the '<em>OSC Bundle</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.illposed.osc.OSCBundle
	 * @see net.sf.smbt.osccmd.impl.OsccmdPackageImpl#getOSCBundle()
	 * @generated
	 */
	int OSC_BUNDLE = 5;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osccmd.OscSndCmd <em>Osc Snd Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Osc Snd Cmd</em>'.
	 * @see net.sf.smbt.osccmd.OscSndCmd
	 * @generated
	 */
	EClass getOscSndCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osccmd.OscRcvCmd <em>Osc Rcv Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Osc Rcv Cmd</em>'.
	 * @see net.sf.smbt.osccmd.OscRcvCmd
	 * @generated
	 */
	EClass getOscRcvCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.osccmd.OscCmd <em>Osc Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Osc Cmd</em>'.
	 * @see net.sf.smbt.osccmd.OscCmd
	 * @generated
	 */
	EClass getOscCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.osccmd.OscCmd#getMsg <em>Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Msg</em>'.
	 * @see net.sf.smbt.osccmd.OscCmd#getMsg()
	 * @see #getOscCmd()
	 * @generated
	 */
	EAttribute getOscCmd_Msg();

	/**
	 * Returns the meta object for data type '{@link com.illposed.osc.OSCMessage <em>OSC Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>OSC Message</em>'.
	 * @see com.illposed.osc.OSCMessage
	 * @model instanceClass="com.illposed.osc.OSCMessage"
	 * @generated
	 */
	EDataType getOSCMessage();

	/**
	 * Returns the meta object for data type '{@link com.illposed.osc.OSCPacket <em>OSC Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>OSC Packet</em>'.
	 * @see com.illposed.osc.OSCPacket
	 * @model instanceClass="com.illposed.osc.OSCPacket"
	 * @generated
	 */
	EDataType getOSCPacket();

	/**
	 * Returns the meta object for data type '{@link com.illposed.osc.OSCBundle <em>OSC Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>OSC Bundle</em>'.
	 * @see com.illposed.osc.OSCBundle
	 * @model instanceClass="com.illposed.osc.OSCBundle"
	 * @generated
	 */
	EDataType getOSCBundle();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OsccmdFactory getOsccmdFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.osccmd.impl.OscSndCmdImpl <em>Osc Snd Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osccmd.impl.OscSndCmdImpl
		 * @see net.sf.smbt.osccmd.impl.OsccmdPackageImpl#getOscSndCmd()
		 * @generated
		 */
		EClass OSC_SND_CMD = eINSTANCE.getOscSndCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osccmd.impl.OscRcvCmdImpl <em>Osc Rcv Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osccmd.impl.OscRcvCmdImpl
		 * @see net.sf.smbt.osccmd.impl.OsccmdPackageImpl#getOscRcvCmd()
		 * @generated
		 */
		EClass OSC_RCV_CMD = eINSTANCE.getOscRcvCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.osccmd.impl.OscCmdImpl <em>Osc Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.osccmd.impl.OscCmdImpl
		 * @see net.sf.smbt.osccmd.impl.OsccmdPackageImpl#getOscCmd()
		 * @generated
		 */
		EClass OSC_CMD = eINSTANCE.getOscCmd();

		/**
		 * The meta object literal for the '<em><b>Msg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSC_CMD__MSG = eINSTANCE.getOscCmd_Msg();

		/**
		 * The meta object literal for the '<em>OSC Message</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.illposed.osc.OSCMessage
		 * @see net.sf.smbt.osccmd.impl.OsccmdPackageImpl#getOSCMessage()
		 * @generated
		 */
		EDataType OSC_MESSAGE = eINSTANCE.getOSCMessage();

		/**
		 * The meta object literal for the '<em>OSC Packet</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.illposed.osc.OSCPacket
		 * @see net.sf.smbt.osccmd.impl.OsccmdPackageImpl#getOSCPacket()
		 * @generated
		 */
		EDataType OSC_PACKET = eINSTANCE.getOSCPacket();

		/**
		 * The meta object literal for the '<em>OSC Bundle</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.illposed.osc.OSCBundle
		 * @see net.sf.smbt.osccmd.impl.OsccmdPackageImpl#getOSCBundle()
		 * @generated
		 */
		EDataType OSC_BUNDLE = eINSTANCE.getOSCBundle();

	}

} //OsccmdPackage
