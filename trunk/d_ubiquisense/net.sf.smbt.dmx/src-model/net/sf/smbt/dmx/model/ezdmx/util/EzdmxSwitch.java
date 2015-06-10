/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.model.ezdmx.util;

import net.sf.smbt.dmx.model.ezdmx.EzdmxPackage;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXChangeOfStatePacketCmd;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXCmd;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXFade;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeFull;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeWithStrobe;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXGetWidgetParamRequestCmd;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXGetWidgetParamsReplyCmd;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXGetWidgetSerialNumberReplyCmd;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXGetWidgetSerialNumberRequestCmd;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXOutputOnlySendDMXPacketsRequestCmd;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXProgramFlashPageReply;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXProgramFlashPageRequestCmd;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXReceiveDMXCmd;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXReceivedPacketsCmd;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXReprogramFirmwareRequestCmd;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXSendRDMDiscoveryRequestCmd;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXSendRDMPacketCmd;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXSetWidgetParamsRequestCmd;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXWidget;
import net.sf.xqz.model.cmd.Cmd;

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
 * @see net.sf.smbt.dmx.model.ezdmx.EzdmxPackage
 * @generated
 */
public class EzdmxSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EzdmxPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzdmxSwitch() {
		if (modelPackage == null) {
			modelPackage = EzdmxPackage.eINSTANCE;
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
			case EzdmxPackage.OPEN_DMX_CMD: {
				OpenDMXCmd openDMXCmd = (OpenDMXCmd)theEObject;
				T result = caseOpenDMXCmd(openDMXCmd);
				if (result == null) result = caseCmd(openDMXCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdmxPackage.OPEN_DMX_REPROGRAM_FIRMWARE_REQUEST_CMD: {
				OpenDMXReprogramFirmwareRequestCmd openDMXReprogramFirmwareRequestCmd = (OpenDMXReprogramFirmwareRequestCmd)theEObject;
				T result = caseOpenDMXReprogramFirmwareRequestCmd(openDMXReprogramFirmwareRequestCmd);
				if (result == null) result = caseOpenDMXCmd(openDMXReprogramFirmwareRequestCmd);
				if (result == null) result = caseCmd(openDMXReprogramFirmwareRequestCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdmxPackage.OPEN_DMX_PROGRAM_FLASH_PAGE_REQUEST_CMD: {
				OpenDMXProgramFlashPageRequestCmd openDMXProgramFlashPageRequestCmd = (OpenDMXProgramFlashPageRequestCmd)theEObject;
				T result = caseOpenDMXProgramFlashPageRequestCmd(openDMXProgramFlashPageRequestCmd);
				if (result == null) result = caseOpenDMXCmd(openDMXProgramFlashPageRequestCmd);
				if (result == null) result = caseCmd(openDMXProgramFlashPageRequestCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdmxPackage.OPEN_DMX_PROGRAM_FLASH_PAGE_REPLY: {
				OpenDMXProgramFlashPageReply openDMXProgramFlashPageReply = (OpenDMXProgramFlashPageReply)theEObject;
				T result = caseOpenDMXProgramFlashPageReply(openDMXProgramFlashPageReply);
				if (result == null) result = caseOpenDMXCmd(openDMXProgramFlashPageReply);
				if (result == null) result = caseCmd(openDMXProgramFlashPageReply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdmxPackage.OPEN_DMX_GET_WIDGET_PARAM_REQUEST_CMD: {
				OpenDMXGetWidgetParamRequestCmd openDMXGetWidgetParamRequestCmd = (OpenDMXGetWidgetParamRequestCmd)theEObject;
				T result = caseOpenDMXGetWidgetParamRequestCmd(openDMXGetWidgetParamRequestCmd);
				if (result == null) result = caseOpenDMXCmd(openDMXGetWidgetParamRequestCmd);
				if (result == null) result = caseCmd(openDMXGetWidgetParamRequestCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdmxPackage.OPEN_DMX_GET_WIDGET_PARAMS_REPLY_CMD: {
				OpenDMXGetWidgetParamsReplyCmd openDMXGetWidgetParamsReplyCmd = (OpenDMXGetWidgetParamsReplyCmd)theEObject;
				T result = caseOpenDMXGetWidgetParamsReplyCmd(openDMXGetWidgetParamsReplyCmd);
				if (result == null) result = caseOpenDMXCmd(openDMXGetWidgetParamsReplyCmd);
				if (result == null) result = caseCmd(openDMXGetWidgetParamsReplyCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdmxPackage.OPEN_DMX_SET_WIDGET_PARAMS_REQUEST_CMD: {
				OpenDMXSetWidgetParamsRequestCmd openDMXSetWidgetParamsRequestCmd = (OpenDMXSetWidgetParamsRequestCmd)theEObject;
				T result = caseOpenDMXSetWidgetParamsRequestCmd(openDMXSetWidgetParamsRequestCmd);
				if (result == null) result = caseOpenDMXCmd(openDMXSetWidgetParamsRequestCmd);
				if (result == null) result = caseCmd(openDMXSetWidgetParamsRequestCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdmxPackage.OPEN_DMX_RECEIVED_PACKETS_CMD: {
				OpenDMXReceivedPacketsCmd openDMXReceivedPacketsCmd = (OpenDMXReceivedPacketsCmd)theEObject;
				T result = caseOpenDMXReceivedPacketsCmd(openDMXReceivedPacketsCmd);
				if (result == null) result = caseOpenDMXCmd(openDMXReceivedPacketsCmd);
				if (result == null) result = caseCmd(openDMXReceivedPacketsCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdmxPackage.OPEN_DMX_OUTPUT_ONLY_SEND_DMX_PACKETS_REQUEST_CMD: {
				OpenDMXOutputOnlySendDMXPacketsRequestCmd openDMXOutputOnlySendDMXPacketsRequestCmd = (OpenDMXOutputOnlySendDMXPacketsRequestCmd)theEObject;
				T result = caseOpenDMXOutputOnlySendDMXPacketsRequestCmd(openDMXOutputOnlySendDMXPacketsRequestCmd);
				if (result == null) result = caseOpenDMXCmd(openDMXOutputOnlySendDMXPacketsRequestCmd);
				if (result == null) result = caseCmd(openDMXOutputOnlySendDMXPacketsRequestCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdmxPackage.OPEN_DMX_SEND_RDM_PACKET_CMD: {
				OpenDMXSendRDMPacketCmd openDMXSendRDMPacketCmd = (OpenDMXSendRDMPacketCmd)theEObject;
				T result = caseOpenDMXSendRDMPacketCmd(openDMXSendRDMPacketCmd);
				if (result == null) result = caseOpenDMXCmd(openDMXSendRDMPacketCmd);
				if (result == null) result = caseCmd(openDMXSendRDMPacketCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdmxPackage.OPEN_DMX_RECEIVE_DMX_CMD: {
				OpenDMXReceiveDMXCmd openDMXReceiveDMXCmd = (OpenDMXReceiveDMXCmd)theEObject;
				T result = caseOpenDMXReceiveDMXCmd(openDMXReceiveDMXCmd);
				if (result == null) result = caseOpenDMXCmd(openDMXReceiveDMXCmd);
				if (result == null) result = caseCmd(openDMXReceiveDMXCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdmxPackage.OPEN_DMX_CHANGE_OF_STATE_PACKET_CMD: {
				OpenDMXChangeOfStatePacketCmd openDMXChangeOfStatePacketCmd = (OpenDMXChangeOfStatePacketCmd)theEObject;
				T result = caseOpenDMXChangeOfStatePacketCmd(openDMXChangeOfStatePacketCmd);
				if (result == null) result = caseOpenDMXCmd(openDMXChangeOfStatePacketCmd);
				if (result == null) result = caseCmd(openDMXChangeOfStatePacketCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdmxPackage.OPEN_DMX_GET_WIDGET_SERIAL_NUMBER_REQUEST_CMD: {
				OpenDMXGetWidgetSerialNumberRequestCmd openDMXGetWidgetSerialNumberRequestCmd = (OpenDMXGetWidgetSerialNumberRequestCmd)theEObject;
				T result = caseOpenDMXGetWidgetSerialNumberRequestCmd(openDMXGetWidgetSerialNumberRequestCmd);
				if (result == null) result = caseOpenDMXCmd(openDMXGetWidgetSerialNumberRequestCmd);
				if (result == null) result = caseCmd(openDMXGetWidgetSerialNumberRequestCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdmxPackage.OPEN_DMX_GET_WIDGET_SERIAL_NUMBER_REPLY_CMD: {
				OpenDMXGetWidgetSerialNumberReplyCmd openDMXGetWidgetSerialNumberReplyCmd = (OpenDMXGetWidgetSerialNumberReplyCmd)theEObject;
				T result = caseOpenDMXGetWidgetSerialNumberReplyCmd(openDMXGetWidgetSerialNumberReplyCmd);
				if (result == null) result = caseOpenDMXCmd(openDMXGetWidgetSerialNumberReplyCmd);
				if (result == null) result = caseCmd(openDMXGetWidgetSerialNumberReplyCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdmxPackage.OPEN_DMX_SEND_RDM_DISCOVERY_REQUEST_CMD: {
				OpenDMXSendRDMDiscoveryRequestCmd openDMXSendRDMDiscoveryRequestCmd = (OpenDMXSendRDMDiscoveryRequestCmd)theEObject;
				T result = caseOpenDMXSendRDMDiscoveryRequestCmd(openDMXSendRDMDiscoveryRequestCmd);
				if (result == null) result = caseOpenDMXCmd(openDMXSendRDMDiscoveryRequestCmd);
				if (result == null) result = caseCmd(openDMXSendRDMDiscoveryRequestCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdmxPackage.OPEN_DMX_WIDGET: {
				OpenDMXWidget openDMXWidget = (OpenDMXWidget)theEObject;
				T result = caseOpenDMXWidget(openDMXWidget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdmxPackage.OPEN_DMX_FADE: {
				OpenDMXFade openDMXFade = (OpenDMXFade)theEObject;
				T result = caseOpenDMXFade(openDMXFade);
				if (result == null) result = caseOpenDMXCmd(openDMXFade);
				if (result == null) result = caseCmd(openDMXFade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdmxPackage.OPEN_DMX_FADE_WITH_STROBE: {
				OpenDMXFadeWithStrobe openDMXFadeWithStrobe = (OpenDMXFadeWithStrobe)theEObject;
				T result = caseOpenDMXFadeWithStrobe(openDMXFadeWithStrobe);
				if (result == null) result = caseOpenDMXCmd(openDMXFadeWithStrobe);
				if (result == null) result = caseCmd(openDMXFadeWithStrobe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdmxPackage.OPEN_DMX_FADE_FULL: {
				OpenDMXFadeFull openDMXFadeFull = (OpenDMXFadeFull)theEObject;
				T result = caseOpenDMXFadeFull(openDMXFadeFull);
				if (result == null) result = caseOpenDMXCmd(openDMXFadeFull);
				if (result == null) result = caseCmd(openDMXFadeFull);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open DMX Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open DMX Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenDMXCmd(OpenDMXCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open DMX Reprogram Firmware Request Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open DMX Reprogram Firmware Request Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenDMXReprogramFirmwareRequestCmd(OpenDMXReprogramFirmwareRequestCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open DMX Program Flash Page Request Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open DMX Program Flash Page Request Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenDMXProgramFlashPageRequestCmd(OpenDMXProgramFlashPageRequestCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open DMX Program Flash Page Reply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open DMX Program Flash Page Reply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenDMXProgramFlashPageReply(OpenDMXProgramFlashPageReply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open DMX Get Widget Param Request Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open DMX Get Widget Param Request Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenDMXGetWidgetParamRequestCmd(OpenDMXGetWidgetParamRequestCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open DMX Get Widget Params Reply Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open DMX Get Widget Params Reply Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenDMXGetWidgetParamsReplyCmd(OpenDMXGetWidgetParamsReplyCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open DMX Set Widget Params Request Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open DMX Set Widget Params Request Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenDMXSetWidgetParamsRequestCmd(OpenDMXSetWidgetParamsRequestCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open DMX Received Packets Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open DMX Received Packets Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenDMXReceivedPacketsCmd(OpenDMXReceivedPacketsCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open DMX Output Only Send DMX Packets Request Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open DMX Output Only Send DMX Packets Request Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenDMXOutputOnlySendDMXPacketsRequestCmd(OpenDMXOutputOnlySendDMXPacketsRequestCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open DMX Send RDM Packet Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open DMX Send RDM Packet Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenDMXSendRDMPacketCmd(OpenDMXSendRDMPacketCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open DMX Receive DMX Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open DMX Receive DMX Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenDMXReceiveDMXCmd(OpenDMXReceiveDMXCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open DMX Change Of State Packet Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open DMX Change Of State Packet Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenDMXChangeOfStatePacketCmd(OpenDMXChangeOfStatePacketCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open DMX Get Widget Serial Number Request Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open DMX Get Widget Serial Number Request Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenDMXGetWidgetSerialNumberRequestCmd(OpenDMXGetWidgetSerialNumberRequestCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open DMX Get Widget Serial Number Reply Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open DMX Get Widget Serial Number Reply Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenDMXGetWidgetSerialNumberReplyCmd(OpenDMXGetWidgetSerialNumberReplyCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open DMX Send RDM Discovery Request Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open DMX Send RDM Discovery Request Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenDMXSendRDMDiscoveryRequestCmd(OpenDMXSendRDMDiscoveryRequestCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open DMX Widget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open DMX Widget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenDMXWidget(OpenDMXWidget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open DMX Fade</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open DMX Fade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenDMXFade(OpenDMXFade object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open DMX Fade With Strobe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open DMX Fade With Strobe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenDMXFadeWithStrobe(OpenDMXFadeWithStrobe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open DMX Fade Full</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open DMX Fade Full</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenDMXFadeFull(OpenDMXFadeFull object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCmd(Cmd object) {
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

} //EzdmxSwitch
