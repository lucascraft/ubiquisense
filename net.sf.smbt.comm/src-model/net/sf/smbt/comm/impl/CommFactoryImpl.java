/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.comm.impl;

import net.sf.smbt.comm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommFactoryImpl extends EFactoryImpl implements CommFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommFactory init() {
		try {
			CommFactory theCommFactory = (CommFactory)EPackage.Registry.INSTANCE.getEFactory("http://comm/1.0"); 
			if (theCommFactory != null) {
				return theCommFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CommFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommFactoryImpl() {
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
			case CommPackage.UDP_PORT: return createUdpPort();
			case CommPackage.TCP_PORT: return createTcpPort();
			case CommPackage.USB_PORT: return createUsbPort();
			case CommPackage.BT_PORT: return createBTPort();
			case CommPackage.HTTP_PORT: return createHttpPort();
			case CommPackage.XBEE_PORT: return createXBeePort();
			case CommPackage.UBI_PORT: return createUbiPort();
			case CommPackage.UDP_IN_JOB: return createUdpInJob();
			case CommPackage.TCP_IN_JOB: return createTcpInJob();
			case CommPackage.UDP_OUT_JOB: return createUdpOutJob();
			case CommPackage.TCP_OUT_JOB: return createTcpOutJob();
			case CommPackage.PROCESS_PORT: return createProcessPort();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UdpPort createUdpPort() {
		UdpPortImpl udpPort = new UdpPortImpl();
		return udpPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TcpPort createTcpPort() {
		TcpPortImpl tcpPort = new TcpPortImpl();
		return tcpPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsbPort createUsbPort() {
		UsbPortImpl usbPort = new UsbPortImpl();
		return usbPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTPort createBTPort() {
		BTPortImpl btPort = new BTPortImpl();
		return btPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpPort createHttpPort() {
		HttpPortImpl httpPort = new HttpPortImpl();
		return httpPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XBeePort createXBeePort() {
		XBeePortImpl xBeePort = new XBeePortImpl();
		return xBeePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbiPort createUbiPort() {
		UbiPortImpl ubiPort = new UbiPortImpl();
		return ubiPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UdpInJob createUdpInJob() {
		UdpInJobImpl udpInJob = new UdpInJobImpl();
		return udpInJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TcpInJob createTcpInJob() {
		TcpInJobImpl tcpInJob = new TcpInJobImpl();
		return tcpInJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UdpOutJob createUdpOutJob() {
		UdpOutJobImpl udpOutJob = new UdpOutJobImpl();
		return udpOutJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TcpOutJob createTcpOutJob() {
		TcpOutJobImpl tcpOutJob = new TcpOutJobImpl();
		return tcpOutJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessPort createProcessPort() {
		ProcessPortImpl processPort = new ProcessPortImpl();
		return processPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommPackage getCommPackage() {
		return (CommPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CommPackage getPackage() {
		return CommPackage.eINSTANCE;
	}

} //CommFactoryImpl
