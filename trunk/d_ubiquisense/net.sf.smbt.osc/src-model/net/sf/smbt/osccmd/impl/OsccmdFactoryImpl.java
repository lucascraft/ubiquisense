/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osccmd.impl;

import net.sf.smbt.osccmd.OscCmd;
import net.sf.smbt.osccmd.OscRcvCmd;
import net.sf.smbt.osccmd.OscSndCmd;
import net.sf.smbt.osccmd.OsccmdFactory;
import net.sf.smbt.osccmd.OsccmdPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.illposed.osc.OSCBundle;
import com.illposed.osc.OSCMessage;
import com.illposed.osc.OSCPacket;
import net.sf.smbt.osccmd.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OsccmdFactoryImpl extends EFactoryImpl implements OsccmdFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OsccmdFactory init() {
		try {
			OsccmdFactory theOsccmdFactory = (OsccmdFactory)EPackage.Registry.INSTANCE.getEFactory("http://osccmd/1.0"); 
			if (theOsccmdFactory != null) {
				return theOsccmdFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OsccmdFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsccmdFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OsccmdPackage.OSC_SND_CMD: return createOscSndCmd();
			case OsccmdPackage.OSC_RCV_CMD: return createOscRcvCmd();
			case OsccmdPackage.OSC_CMD: return createOscCmd();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OsccmdPackage.OSC_MESSAGE:
				return createOSCMessageFromString(eDataType, initialValue);
			case OsccmdPackage.OSC_PACKET:
				return createOSCPacketFromString(eDataType, initialValue);
			case OsccmdPackage.OSC_BUNDLE:
				return createOSCBundleFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OsccmdPackage.OSC_MESSAGE:
				return convertOSCMessageToString(eDataType, instanceValue);
			case OsccmdPackage.OSC_PACKET:
				return convertOSCPacketToString(eDataType, instanceValue);
			case OsccmdPackage.OSC_BUNDLE:
				return convertOSCBundleToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscSndCmd createOscSndCmd() {
		OscSndCmdImpl oscSndCmd = new OscSndCmdImpl();
		return oscSndCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscRcvCmd createOscRcvCmd() {
		OscRcvCmdImpl oscRcvCmd = new OscRcvCmdImpl();
		return oscRcvCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscCmd createOscCmd() {
		OscCmdImpl oscCmd = new OscCmdImpl();
		return oscCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSCMessage createOSCMessageFromString(EDataType eDataType, String initialValue) {
		return (OSCMessage)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOSCMessageToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSCPacket createOSCPacketFromString(EDataType eDataType, String initialValue) {
		return (OSCPacket)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOSCPacketToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSCBundle createOSCBundleFromString(EDataType eDataType, String initialValue) {
		return (OSCBundle)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOSCBundleToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OsccmdPackage getOsccmdPackage() {
		return (OsccmdPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OsccmdPackage getPackage() {
		return OsccmdPackage.eINSTANCE;
	}

} //OsccmdFactoryImpl
