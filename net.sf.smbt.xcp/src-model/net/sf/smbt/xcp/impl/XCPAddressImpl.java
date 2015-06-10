/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.xcp.impl;

import java.util.Collection;

import net.sf.smbt.xcp.XCPAddress;
import net.sf.smbt.xcp.XcpPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XCP Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.xcp.impl.XCPAddressImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.smbt.xcp.impl.XCPAddressImpl#getAddr <em>Addr</em>}</li>
 *   <li>{@link net.sf.smbt.xcp.impl.XCPAddressImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link net.sf.smbt.xcp.impl.XCPAddressImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link net.sf.smbt.xcp.impl.XCPAddressImpl#getTransportID <em>Transport ID</em>}</li>
 *   <li>{@link net.sf.smbt.xcp.impl.XCPAddressImpl#getProtocolID <em>Protocol ID</em>}</li>
 *   <li>{@link net.sf.smbt.xcp.impl.XCPAddressImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link net.sf.smbt.xcp.impl.XCPAddressImpl#getPort <em>Port</em>}</li>
 *   <li>{@link net.sf.smbt.xcp.impl.XCPAddressImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XCPAddressImpl extends MinimalEObjectImpl.Container implements XCPAddress {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;
	/**
	 * The default value of the '{@link #getAddr() <em>Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddr()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDR_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAddr() <em>Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddr()
	 * @generated
	 * @ordered
	 */
	protected String addr = ADDR_EDEFAULT;
	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> ports;
	/**
	 * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected String alias = ALIAS_EDEFAULT;
	/**
	 * The default value of the '{@link #getTransportID() <em>Transport ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportID()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSPORT_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getTransportID() <em>Transport ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportID()
	 * @generated
	 * @ordered
	 */
	protected String transportID = TRANSPORT_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getProtocolID() <em>Protocol ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolID()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTOCOL_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getProtocolID() <em>Protocol ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocolID()
	 * @generated
	 * @ordered
	 */
	protected String protocolID = PROTOCOL_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final int SPEED_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected int speed = SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XCPAddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XcpPackage.Literals.XCP_ADDRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcpPackage.XCP_ADDRESS__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddr() {
		return addr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddr(String newAddr) {
		String oldAddr = addr;
		addr = newAddr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcpPackage.XCP_ADDRESS__ADDR, oldAddr, addr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getPorts() {
		if (ports == null) {
			ports = new EDataTypeUniqueEList<Integer>(Integer.class, this, XcpPackage.XCP_ADDRESS__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlias(String newAlias) {
		String oldAlias = alias;
		alias = newAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcpPackage.XCP_ADDRESS__ALIAS, oldAlias, alias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransportID() {
		return transportID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportID(String newTransportID) {
		String oldTransportID = transportID;
		transportID = newTransportID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcpPackage.XCP_ADDRESS__TRANSPORT_ID, oldTransportID, transportID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProtocolID() {
		return protocolID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocolID(String newProtocolID) {
		String oldProtocolID = protocolID;
		protocolID = newProtocolID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcpPackage.XCP_ADDRESS__PROTOCOL_ID, oldProtocolID, protocolID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeed(int newSpeed) {
		int oldSpeed = speed;
		speed = newSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcpPackage.XCP_ADDRESS__SPEED, oldSpeed, speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XcpPackage.XCP_ADDRESS__PORT, oldPort, port));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XcpPackage.XCP_ADDRESS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XcpPackage.XCP_ADDRESS__TYPE:
				return getType();
			case XcpPackage.XCP_ADDRESS__ADDR:
				return getAddr();
			case XcpPackage.XCP_ADDRESS__PORTS:
				return getPorts();
			case XcpPackage.XCP_ADDRESS__ALIAS:
				return getAlias();
			case XcpPackage.XCP_ADDRESS__TRANSPORT_ID:
				return getTransportID();
			case XcpPackage.XCP_ADDRESS__PROTOCOL_ID:
				return getProtocolID();
			case XcpPackage.XCP_ADDRESS__SPEED:
				return getSpeed();
			case XcpPackage.XCP_ADDRESS__PORT:
				return getPort();
			case XcpPackage.XCP_ADDRESS__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XcpPackage.XCP_ADDRESS__TYPE:
				setType((String)newValue);
				return;
			case XcpPackage.XCP_ADDRESS__ADDR:
				setAddr((String)newValue);
				return;
			case XcpPackage.XCP_ADDRESS__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends Integer>)newValue);
				return;
			case XcpPackage.XCP_ADDRESS__ALIAS:
				setAlias((String)newValue);
				return;
			case XcpPackage.XCP_ADDRESS__TRANSPORT_ID:
				setTransportID((String)newValue);
				return;
			case XcpPackage.XCP_ADDRESS__PROTOCOL_ID:
				setProtocolID((String)newValue);
				return;
			case XcpPackage.XCP_ADDRESS__SPEED:
				setSpeed((Integer)newValue);
				return;
			case XcpPackage.XCP_ADDRESS__PORT:
				setPort((Integer)newValue);
				return;
			case XcpPackage.XCP_ADDRESS__NAME:
				setName((String)newValue);
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
			case XcpPackage.XCP_ADDRESS__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case XcpPackage.XCP_ADDRESS__ADDR:
				setAddr(ADDR_EDEFAULT);
				return;
			case XcpPackage.XCP_ADDRESS__PORTS:
				getPorts().clear();
				return;
			case XcpPackage.XCP_ADDRESS__ALIAS:
				setAlias(ALIAS_EDEFAULT);
				return;
			case XcpPackage.XCP_ADDRESS__TRANSPORT_ID:
				setTransportID(TRANSPORT_ID_EDEFAULT);
				return;
			case XcpPackage.XCP_ADDRESS__PROTOCOL_ID:
				setProtocolID(PROTOCOL_ID_EDEFAULT);
				return;
			case XcpPackage.XCP_ADDRESS__SPEED:
				setSpeed(SPEED_EDEFAULT);
				return;
			case XcpPackage.XCP_ADDRESS__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case XcpPackage.XCP_ADDRESS__NAME:
				setName(NAME_EDEFAULT);
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
			case XcpPackage.XCP_ADDRESS__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case XcpPackage.XCP_ADDRESS__ADDR:
				return ADDR_EDEFAULT == null ? addr != null : !ADDR_EDEFAULT.equals(addr);
			case XcpPackage.XCP_ADDRESS__PORTS:
				return ports != null && !ports.isEmpty();
			case XcpPackage.XCP_ADDRESS__ALIAS:
				return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
			case XcpPackage.XCP_ADDRESS__TRANSPORT_ID:
				return TRANSPORT_ID_EDEFAULT == null ? transportID != null : !TRANSPORT_ID_EDEFAULT.equals(transportID);
			case XcpPackage.XCP_ADDRESS__PROTOCOL_ID:
				return PROTOCOL_ID_EDEFAULT == null ? protocolID != null : !PROTOCOL_ID_EDEFAULT.equals(protocolID);
			case XcpPackage.XCP_ADDRESS__SPEED:
				return speed != SPEED_EDEFAULT;
			case XcpPackage.XCP_ADDRESS__PORT:
				return port != PORT_EDEFAULT;
			case XcpPackage.XCP_ADDRESS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		String  transport = getTransportID() == null ? "???://" : getTransportID();
		String  addr = getAddr() == null ? "???" : getAddr();
		String ports = "";
		if (getPorts() != null & getPorts().isEmpty()) {
			for (Integer i : getPorts()) {
				ports += i + ",";
			}
			ports = ports.contains(",") ? "$"+ports.substring(0, ports.lastIndexOf(",")) : "";
		}
		String alias = getProtocolID();
		alias = alias == null ? "???" : alias;
		String protocol = "<" + alias + ">";
		String speed = (getSpeed() <= 0) ? "" : "@" + getSpeed();
		
		return transport + addr + ports + protocol + speed;
	}

} //XCPAddressImpl
