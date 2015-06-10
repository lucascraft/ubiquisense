/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.xcp.impl;

import javax.jmdns.ServiceInfo;

import net.sf.smbt.xcp.Services;
import net.sf.smbt.xcp.XCPAddress;
import net.sf.smbt.xcp.XCPDevice;
import net.sf.smbt.xcp.XCPServiceStatus;
import net.sf.smbt.xcp.XcpPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XCP Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.xcp.impl.XCPDeviceImpl#getAddr <em>Addr</em>}</li>
 *   <li>{@link net.sf.smbt.xcp.impl.XCPDeviceImpl#getServices <em>Services</em>}</li>
 *   <li>{@link net.sf.smbt.xcp.impl.XCPDeviceImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link net.sf.smbt.xcp.impl.XCPDeviceImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link net.sf.smbt.xcp.impl.XCPDeviceImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.xcp.impl.XCPDeviceImpl#getDnsSd <em>Dns Sd</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XCPDeviceImpl extends MinimalEObjectImpl.Container implements XCPDevice {
	/**
	 * The cached value of the '{@link #getAddr() <em>Addr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddr()
	 * @generated
	 * @ordered
	 */
	protected XCPAddress addr;
	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected Services services;
	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final XCPServiceStatus STATUS_EDEFAULT = XCPServiceStatus.PROBING;
	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected XCPServiceStatus status = STATUS_EDEFAULT;
	/**
	 * The default value of the '{@link #getDevice() <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected static final Object DEVICE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected Object device = DEVICE_EDEFAULT;
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getDnsSd() <em>Dns Sd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDnsSd()
	 * @generated
	 * @ordered
	 */
	protected static final ServiceInfo DNS_SD_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDnsSd() <em>Dns Sd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDnsSd()
	 * @generated
	 * @ordered
	 */
	protected ServiceInfo dnsSd = DNS_SD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XCPDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XcpPackage.Literals.XCP_DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Services getServices() {
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServices(Services newServices, NotificationChain msgs) {
		Services oldServices = services;
		services = newServices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XcpPackage.XCP_DEVICE__SERVICES, oldServices, newServices);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServices(Services newServices) {
		if (newServices != services) {
			NotificationChain msgs = null;
			if (services != null)
				msgs = ((InternalEObject)services).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XcpPackage.XCP_DEVICE__SERVICES, null, msgs);
			if (newServices != null)
				msgs = ((InternalEObject)newServices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XcpPackage.XCP_DEVICE__SERVICES, null, msgs);
			msgs = basicSetServices(newServices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcpPackage.XCP_DEVICE__SERVICES, newServices, newServices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XCPServiceStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(XCPServiceStatus newStatus) {
		XCPServiceStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcpPackage.XCP_DEVICE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevice(Object newDevice) {
		Object oldDevice = device;
		device = newDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcpPackage.XCP_DEVICE__DEVICE, oldDevice, device));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcpPackage.XCP_DEVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInfo getDnsSd() {
		return dnsSd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDnsSd(ServiceInfo newDnsSd) {
		ServiceInfo oldDnsSd = dnsSd;
		dnsSd = newDnsSd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcpPackage.XCP_DEVICE__DNS_SD, oldDnsSd, dnsSd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XcpPackage.XCP_DEVICE__ADDR:
				return basicSetAddr(null, msgs);
			case XcpPackage.XCP_DEVICE__SERVICES:
				return basicSetServices(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XcpPackage.XCP_DEVICE__ADDR:
				return getAddr();
			case XcpPackage.XCP_DEVICE__SERVICES:
				return getServices();
			case XcpPackage.XCP_DEVICE__STATUS:
				return getStatus();
			case XcpPackage.XCP_DEVICE__DEVICE:
				return getDevice();
			case XcpPackage.XCP_DEVICE__NAME:
				return getName();
			case XcpPackage.XCP_DEVICE__DNS_SD:
				return getDnsSd();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XcpPackage.XCP_DEVICE__ADDR:
				setAddr((XCPAddress)newValue);
				return;
			case XcpPackage.XCP_DEVICE__SERVICES:
				setServices((Services)newValue);
				return;
			case XcpPackage.XCP_DEVICE__STATUS:
				setStatus((XCPServiceStatus)newValue);
				return;
			case XcpPackage.XCP_DEVICE__DEVICE:
				setDevice(newValue);
				return;
			case XcpPackage.XCP_DEVICE__NAME:
				setName((String)newValue);
				return;
			case XcpPackage.XCP_DEVICE__DNS_SD:
				setDnsSd((ServiceInfo)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XcpPackage.XCP_DEVICE__ADDR:
				setAddr((XCPAddress)null);
				return;
			case XcpPackage.XCP_DEVICE__SERVICES:
				setServices((Services)null);
				return;
			case XcpPackage.XCP_DEVICE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case XcpPackage.XCP_DEVICE__DEVICE:
				setDevice(DEVICE_EDEFAULT);
				return;
			case XcpPackage.XCP_DEVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XcpPackage.XCP_DEVICE__DNS_SD:
				setDnsSd(DNS_SD_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XcpPackage.XCP_DEVICE__ADDR:
				return addr != null;
			case XcpPackage.XCP_DEVICE__SERVICES:
				return services != null;
			case XcpPackage.XCP_DEVICE__STATUS:
				return status != STATUS_EDEFAULT;
			case XcpPackage.XCP_DEVICE__DEVICE:
				return DEVICE_EDEFAULT == null ? device != null : !DEVICE_EDEFAULT.equals(device);
			case XcpPackage.XCP_DEVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XcpPackage.XCP_DEVICE__DNS_SD:
				return DNS_SD_EDEFAULT == null ? dnsSd != null : !DNS_SD_EDEFAULT.equals(dnsSd);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (status: ");
		result.append(status);
		result.append(", device: ");
		result.append(device);
		result.append(", name: ");
		result.append(name);
		result.append(", dnsSd: ");
		result.append(dnsSd);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XCPAddress getAddr() {
		return addr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddr(XCPAddress newAddr, NotificationChain msgs) {
		XCPAddress oldAddr = addr;
		addr = newAddr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XcpPackage.XCP_DEVICE__ADDR, oldAddr, newAddr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddr(XCPAddress newAddr) {
		if (newAddr != addr) {
			NotificationChain msgs = null;
			if (addr != null)
				msgs = ((InternalEObject)addr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XcpPackage.XCP_DEVICE__ADDR, null, msgs);
			if (newAddr != null)
				msgs = ((InternalEObject)newAddr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XcpPackage.XCP_DEVICE__ADDR, null, msgs);
			msgs = basicSetAddr(newAddr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcpPackage.XCP_DEVICE__ADDR, newAddr, newAddr));
	}

} //XCPDeviceImpl
