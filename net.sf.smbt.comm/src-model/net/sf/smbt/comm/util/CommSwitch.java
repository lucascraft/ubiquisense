/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.comm.util;

import java.util.List;

import net.sf.smbt.comm.*;

import net.sf.xqz.model.engine.IOJob;
import net.sf.xqz.model.engine.InputJob;
import net.sf.xqz.model.engine.OutputJob;
import net.sf.xqz.model.engine.Port;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.comm.CommPackage
 * @generated
 */
public class CommSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CommPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommSwitch() {
		if (modelPackage == null) {
			modelPackage = CommPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CommPackage.UDP_PORT: {
				UdpPort udpPort = (UdpPort)theEObject;
				T result = caseUdpPort(udpPort);
				if (result == null) result = casePort(udpPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommPackage.TCP_PORT: {
				TcpPort tcpPort = (TcpPort)theEObject;
				T result = caseTcpPort(tcpPort);
				if (result == null) result = casePort(tcpPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommPackage.USB_PORT: {
				UsbPort usbPort = (UsbPort)theEObject;
				T result = caseUsbPort(usbPort);
				if (result == null) result = casePort(usbPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommPackage.BT_PORT: {
				BTPort btPort = (BTPort)theEObject;
				T result = caseBTPort(btPort);
				if (result == null) result = casePort(btPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommPackage.HTTP_PORT: {
				HttpPort httpPort = (HttpPort)theEObject;
				T result = caseHttpPort(httpPort);
				if (result == null) result = casePort(httpPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommPackage.XBEE_PORT: {
				XBeePort xBeePort = (XBeePort)theEObject;
				T result = caseXBeePort(xBeePort);
				if (result == null) result = casePort(xBeePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommPackage.UBI_PORT: {
				UbiPort ubiPort = (UbiPort)theEObject;
				T result = caseUbiPort(ubiPort);
				if (result == null) result = casePort(ubiPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommPackage.UDP_IN_JOB: {
				UdpInJob udpInJob = (UdpInJob)theEObject;
				T result = caseUdpInJob(udpInJob);
				if (result == null) result = caseInputJob(udpInJob);
				if (result == null) result = caseIOJob(udpInJob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommPackage.TCP_IN_JOB: {
				TcpInJob tcpInJob = (TcpInJob)theEObject;
				T result = caseTcpInJob(tcpInJob);
				if (result == null) result = caseInputJob(tcpInJob);
				if (result == null) result = caseIOJob(tcpInJob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommPackage.UDP_OUT_JOB: {
				UdpOutJob udpOutJob = (UdpOutJob)theEObject;
				T result = caseUdpOutJob(udpOutJob);
				if (result == null) result = caseOutputJob(udpOutJob);
				if (result == null) result = caseIOJob(udpOutJob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommPackage.TCP_OUT_JOB: {
				TcpOutJob tcpOutJob = (TcpOutJob)theEObject;
				T result = caseTcpOutJob(tcpOutJob);
				if (result == null) result = caseOutputJob(tcpOutJob);
				if (result == null) result = caseIOJob(tcpOutJob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommPackage.PROCESS_PORT: {
				ProcessPort processPort = (ProcessPort)theEObject;
				T result = caseProcessPort(processPort);
				if (result == null) result = casePort(processPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Udp Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Udp Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUdpPort(UdpPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tcp Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tcp Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTcpPort(TcpPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usb Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usb Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsbPort(UsbPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BT Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BT Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBTPort(BTPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Http Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Http Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHttpPort(HttpPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XBee Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XBee Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXBeePort(XBeePort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ubi Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ubi Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUbiPort(UbiPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Udp In Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Udp In Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUdpInJob(UdpInJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tcp In Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tcp In Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTcpInJob(TcpInJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Udp Out Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Udp Out Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUdpOutJob(UdpOutJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tcp Out Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tcp Out Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTcpOutJob(TcpOutJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessPort(ProcessPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IO Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IO Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIOJob(IOJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputJob(InputJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputJob(OutputJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CommSwitch
