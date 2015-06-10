/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.xcp;

import javax.jmdns.ServiceInfo;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XCP Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.xcp.XCPDevice#getAddr <em>Addr</em>}</li>
 *   <li>{@link net.sf.smbt.xcp.XCPDevice#getServices <em>Services</em>}</li>
 *   <li>{@link net.sf.smbt.xcp.XCPDevice#getStatus <em>Status</em>}</li>
 *   <li>{@link net.sf.smbt.xcp.XCPDevice#getDevice <em>Device</em>}</li>
 *   <li>{@link net.sf.smbt.xcp.XCPDevice#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.xcp.XCPDevice#getDnsSd <em>Dns Sd</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.xcp.XcpPackage#getXCPDevice()
 * @model
 * @generated
 */
public interface XCPDevice extends EObject {
	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference.
	 * @see #setServices(Services)
	 * @see net.sf.smbt.xcp.XcpPackage#getXCPDevice_Services()
	 * @model containment="true"
	 * @generated
	 */
	Services getServices();

	/**
	 * Sets the value of the '{@link net.sf.smbt.xcp.XCPDevice#getServices <em>Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Services</em>' containment reference.
	 * @see #getServices()
	 * @generated
	 */
	void setServices(Services value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.xcp.XCPServiceStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see net.sf.smbt.xcp.XCPServiceStatus
	 * @see #setStatus(XCPServiceStatus)
	 * @see net.sf.smbt.xcp.XcpPackage#getXCPDevice_Status()
	 * @model
	 * @generated
	 */
	XCPServiceStatus getStatus();

	/**
	 * Sets the value of the '{@link net.sf.smbt.xcp.XCPDevice#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see net.sf.smbt.xcp.XCPServiceStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(XCPServiceStatus value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' attribute.
	 * @see #setDevice(Object)
	 * @see net.sf.smbt.xcp.XcpPackage#getXCPDevice_Device()
	 * @model
	 * @generated
	 */
	Object getDevice();

	/**
	 * Sets the value of the '{@link net.sf.smbt.xcp.XCPDevice#getDevice <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' attribute.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(Object value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.sf.smbt.xcp.XcpPackage#getXCPDevice_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.smbt.xcp.XCPDevice#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Dns Sd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dns Sd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dns Sd</em>' attribute.
	 * @see #setDnsSd(ServiceInfo)
	 * @see net.sf.smbt.xcp.XcpPackage#getXCPDevice_DnsSd()
	 * @model dataType="net.sf.smbt.xcp.ServiceInfo"
	 * @generated
	 */
	ServiceInfo getDnsSd();

	/**
	 * Sets the value of the '{@link net.sf.smbt.xcp.XCPDevice#getDnsSd <em>Dns Sd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dns Sd</em>' attribute.
	 * @see #getDnsSd()
	 * @generated
	 */
	void setDnsSd(ServiceInfo value);

	/**
	 * Returns the value of the '<em><b>Addr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addr</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addr</em>' containment reference.
	 * @see #setAddr(XCPAddress)
	 * @see net.sf.smbt.xcp.XcpPackage#getXCPDevice_Addr()
	 * @model containment="true"
	 * @generated
	 */
	XCPAddress getAddr();

	/**
	 * Sets the value of the '{@link net.sf.smbt.xcp.XCPDevice#getAddr <em>Addr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addr</em>' containment reference.
	 * @see #getAddr()
	 * @generated
	 */
	void setAddr(XCPAddress value);

} // XCPDevice
