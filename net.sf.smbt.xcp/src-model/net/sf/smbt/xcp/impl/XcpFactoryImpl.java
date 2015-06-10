/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.xcp.impl;

import javax.jmdns.ServiceInfo;

import net.sf.smbt.xcp.Services;
import net.sf.smbt.xcp.XCPAddrType;
import net.sf.smbt.xcp.XCPAddress;
import net.sf.smbt.xcp.XCPDevice;
import net.sf.smbt.xcp.XCPDevicesRegistery;
import net.sf.smbt.xcp.XCPServiceStatus;
import net.sf.smbt.xcp.XcpFactory;
import net.sf.smbt.xcp.XcpPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.illposed.osc.OSCPacket;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XcpFactoryImpl extends EFactoryImpl implements XcpFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XcpFactory init() {
		try {
			XcpFactory theXcpFactory = (XcpFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.sf.net/smbt/xcp/core/1.0"); 
			if (theXcpFactory != null) {
				return theXcpFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XcpFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XcpFactoryImpl() {
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
			case XcpPackage.XCP_DEVICE: return createXCPDevice();
			case XcpPackage.XCP_ADDRESS: return createXCPAddress();
			case XcpPackage.XCP_DEVICES_REGISTERY: return createXCPDevicesRegistery();
			case XcpPackage.SERVICES: return createServices();
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
			case XcpPackage.XCP_SERVICE_STATUS:
				return createXCPServiceStatusFromString(eDataType, initialValue);
			case XcpPackage.XCP_ADDR_TYPE:
				return createXCPAddrTypeFromString(eDataType, initialValue);
			case XcpPackage.OSC_PACKET:
				return createOSCPacketFromString(eDataType, initialValue);
			case XcpPackage.SERVICE_INFO:
				return createServiceInfoFromString(eDataType, initialValue);
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
			case XcpPackage.XCP_SERVICE_STATUS:
				return convertXCPServiceStatusToString(eDataType, instanceValue);
			case XcpPackage.XCP_ADDR_TYPE:
				return convertXCPAddrTypeToString(eDataType, instanceValue);
			case XcpPackage.OSC_PACKET:
				return convertOSCPacketToString(eDataType, instanceValue);
			case XcpPackage.SERVICE_INFO:
				return convertServiceInfoToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XCPDevice createXCPDevice() {
		XCPDeviceImpl xcpDevice = new XCPDeviceImpl();
		return xcpDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XCPAddress createXCPAddress() {
		XCPAddressImpl xcpAddress = new XCPAddressImpl();
		return xcpAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XCPDevicesRegistery createXCPDevicesRegistery() {
		XCPDevicesRegisteryImpl xcpDevicesRegistery = new XCPDevicesRegisteryImpl();
		return xcpDevicesRegistery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Services createServices() {
		ServicesImpl services = new ServicesImpl();
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XCPServiceStatus createXCPServiceStatusFromString(EDataType eDataType, String initialValue) {
		XCPServiceStatus result = XCPServiceStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXCPServiceStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XCPAddrType createXCPAddrTypeFromString(EDataType eDataType, String initialValue) {
		XCPAddrType result = XCPAddrType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXCPAddrTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
	public ServiceInfo createServiceInfoFromString(EDataType eDataType, String initialValue) {
		return (ServiceInfo)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceInfoToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XcpPackage getXcpPackage() {
		return (XcpPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XcpPackage getPackage() {
		return XcpPackage.eINSTANCE;
	}

} //XcpFactoryImpl
