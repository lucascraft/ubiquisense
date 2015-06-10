/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.protocol.ezfirmata.util;

import java.util.List;

import net.sf.smbt.midi.ezmidi.AbstractMidiCmd;
import net.sf.smbt.midi.ezmidi.DSLMidiMessage;
import net.sf.smbt.midi.ezmidi.SysexMessage;
import net.sf.smbt.protocol.ezfirmata.*;
import net.sf.smbt.protocol.ezfirmata.EzfirmataPackage;
import net.sf.smbt.protocol.ezfirmata.FirmataAnalogIOMsgCmd;
import net.sf.smbt.protocol.ezfirmata.FirmataCmd;
import net.sf.smbt.protocol.ezfirmata.FirmataDigitalIOMsgCmd;
import net.sf.smbt.protocol.ezfirmata.FirmataProtocolVersionCmd;
import net.sf.smbt.protocol.ezfirmata.FirmataReportAnalogPinCmd;
import net.sf.smbt.protocol.ezfirmata.FirmataReportDigitalPinCmd;
import net.sf.smbt.protocol.ezfirmata.FirmataSetPinModeCmd;
import net.sf.smbt.protocol.ezfirmata.FirmataSysexMessage;
import net.sf.smbt.protocol.ezfirmata.FirmataSystemResetCmd;
import net.sf.smbt.protocol.ezfirmata.SysexStart;
import net.sf.smbt.protocol.ezfirmata.SysexStop;
import net.sf.xqz.model.cmd.Cmd;

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
 * @see net.sf.smbt.protocol.ezfirmata.EzfirmataPackage
 * @generated
 */
public class EzfirmataSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EzfirmataPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzfirmataSwitch() {
		if (modelPackage == null) {
			modelPackage = EzfirmataPackage.eINSTANCE;
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
			case EzfirmataPackage.FIRMATA_CMD: {
				FirmataCmd firmataCmd = (FirmataCmd)theEObject;
				T result = caseFirmataCmd(firmataCmd);
				if (result == null) result = caseDSLMidiMessage(firmataCmd);
				if (result == null) result = caseAbstractMidiCmd(firmataCmd);
				if (result == null) result = caseCmd(firmataCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzfirmataPackage.FIRMATA_REPORT_DIGITAL_PIN_CMD: {
				FirmataReportDigitalPinCmd firmataReportDigitalPinCmd = (FirmataReportDigitalPinCmd)theEObject;
				T result = caseFirmataReportDigitalPinCmd(firmataReportDigitalPinCmd);
				if (result == null) result = caseFirmataCmd(firmataReportDigitalPinCmd);
				if (result == null) result = caseDSLMidiMessage(firmataReportDigitalPinCmd);
				if (result == null) result = caseAbstractMidiCmd(firmataReportDigitalPinCmd);
				if (result == null) result = caseCmd(firmataReportDigitalPinCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzfirmataPackage.FIRMATA_REPORT_ANALOG_PIN_CMD: {
				FirmataReportAnalogPinCmd firmataReportAnalogPinCmd = (FirmataReportAnalogPinCmd)theEObject;
				T result = caseFirmataReportAnalogPinCmd(firmataReportAnalogPinCmd);
				if (result == null) result = caseAbstractMidiCmd(firmataReportAnalogPinCmd);
				if (result == null) result = caseCmd(firmataReportAnalogPinCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzfirmataPackage.FIRMATA_SET_PIN_MODE_CMD: {
				FirmataSetPinModeCmd firmataSetPinModeCmd = (FirmataSetPinModeCmd)theEObject;
				T result = caseFirmataSetPinModeCmd(firmataSetPinModeCmd);
				if (result == null) result = caseFirmataCmd(firmataSetPinModeCmd);
				if (result == null) result = caseDSLMidiMessage(firmataSetPinModeCmd);
				if (result == null) result = caseAbstractMidiCmd(firmataSetPinModeCmd);
				if (result == null) result = caseCmd(firmataSetPinModeCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzfirmataPackage.FIRMATA_PROTOCOL_VERSION_CMD: {
				FirmataProtocolVersionCmd firmataProtocolVersionCmd = (FirmataProtocolVersionCmd)theEObject;
				T result = caseFirmataProtocolVersionCmd(firmataProtocolVersionCmd);
				if (result == null) result = caseFirmataCmd(firmataProtocolVersionCmd);
				if (result == null) result = caseDSLMidiMessage(firmataProtocolVersionCmd);
				if (result == null) result = caseAbstractMidiCmd(firmataProtocolVersionCmd);
				if (result == null) result = caseCmd(firmataProtocolVersionCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzfirmataPackage.FIRMATA_SYSTEM_RESET_CMD: {
				FirmataSystemResetCmd firmataSystemResetCmd = (FirmataSystemResetCmd)theEObject;
				T result = caseFirmataSystemResetCmd(firmataSystemResetCmd);
				if (result == null) result = caseFirmataCmd(firmataSystemResetCmd);
				if (result == null) result = caseDSLMidiMessage(firmataSystemResetCmd);
				if (result == null) result = caseAbstractMidiCmd(firmataSystemResetCmd);
				if (result == null) result = caseCmd(firmataSystemResetCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzfirmataPackage.FIRMATA_ANALOG_IO_MSG_CMD: {
				FirmataAnalogIOMsgCmd firmataAnalogIOMsgCmd = (FirmataAnalogIOMsgCmd)theEObject;
				T result = caseFirmataAnalogIOMsgCmd(firmataAnalogIOMsgCmd);
				if (result == null) result = caseFirmataCmd(firmataAnalogIOMsgCmd);
				if (result == null) result = caseDSLMidiMessage(firmataAnalogIOMsgCmd);
				if (result == null) result = caseAbstractMidiCmd(firmataAnalogIOMsgCmd);
				if (result == null) result = caseCmd(firmataAnalogIOMsgCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzfirmataPackage.FIRMATA_DIGITAL_IO_MSG_CMD: {
				FirmataDigitalIOMsgCmd firmataDigitalIOMsgCmd = (FirmataDigitalIOMsgCmd)theEObject;
				T result = caseFirmataDigitalIOMsgCmd(firmataDigitalIOMsgCmd);
				if (result == null) result = caseFirmataCmd(firmataDigitalIOMsgCmd);
				if (result == null) result = caseDSLMidiMessage(firmataDigitalIOMsgCmd);
				if (result == null) result = caseAbstractMidiCmd(firmataDigitalIOMsgCmd);
				if (result == null) result = caseCmd(firmataDigitalIOMsgCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzfirmataPackage.SYSEX_START: {
				SysexStart sysexStart = (SysexStart)theEObject;
				T result = caseSysexStart(sysexStart);
				if (result == null) result = caseSysexMessage(sysexStart);
				if (result == null) result = caseDSLMidiMessage(sysexStart);
				if (result == null) result = caseAbstractMidiCmd(sysexStart);
				if (result == null) result = caseCmd(sysexStart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzfirmataPackage.SYSEX_STOP: {
				SysexStop sysexStop = (SysexStop)theEObject;
				T result = caseSysexStop(sysexStop);
				if (result == null) result = caseSysexMessage(sysexStop);
				if (result == null) result = caseDSLMidiMessage(sysexStop);
				if (result == null) result = caseAbstractMidiCmd(sysexStop);
				if (result == null) result = caseCmd(sysexStop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzfirmataPackage.FIRMATA_SYSEX_MESSAGE: {
				FirmataSysexMessage firmataSysexMessage = (FirmataSysexMessage)theEObject;
				T result = caseFirmataSysexMessage(firmataSysexMessage);
				if (result == null) result = caseSysexMessage(firmataSysexMessage);
				if (result == null) result = caseDSLMidiMessage(firmataSysexMessage);
				if (result == null) result = caseAbstractMidiCmd(firmataSysexMessage);
				if (result == null) result = caseCmd(firmataSysexMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzfirmataPackage.FIRMATA_CAPABILITIES_CMD: {
				FirmataCapabilitiesCmd firmataCapabilitiesCmd = (FirmataCapabilitiesCmd)theEObject;
				T result = caseFirmataCapabilitiesCmd(firmataCapabilitiesCmd);
				if (result == null) result = caseFirmataCmd(firmataCapabilitiesCmd);
				if (result == null) result = caseDSLMidiMessage(firmataCapabilitiesCmd);
				if (result == null) result = caseAbstractMidiCmd(firmataCapabilitiesCmd);
				if (result == null) result = caseCmd(firmataCapabilitiesCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzfirmataPackage.FIRMATA_PIN_STATE_RESPONSE: {
				FirmataPinStateResponse firmataPinStateResponse = (FirmataPinStateResponse)theEObject;
				T result = caseFirmataPinStateResponse(firmataPinStateResponse);
				if (result == null) result = caseFirmataCmd(firmataPinStateResponse);
				if (result == null) result = caseDSLMidiMessage(firmataPinStateResponse);
				if (result == null) result = caseAbstractMidiCmd(firmataPinStateResponse);
				if (result == null) result = caseCmd(firmataPinStateResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Firmata Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Firmata Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirmataCmd(FirmataCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Firmata Report Digital Pin Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Firmata Report Digital Pin Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirmataReportDigitalPinCmd(FirmataReportDigitalPinCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Firmata Report Analog Pin Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Firmata Report Analog Pin Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirmataReportAnalogPinCmd(FirmataReportAnalogPinCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Firmata Set Pin Mode Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Firmata Set Pin Mode Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirmataSetPinModeCmd(FirmataSetPinModeCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Firmata Protocol Version Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Firmata Protocol Version Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirmataProtocolVersionCmd(FirmataProtocolVersionCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Firmata System Reset Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Firmata System Reset Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirmataSystemResetCmd(FirmataSystemResetCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Firmata Analog IO Msg Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Firmata Analog IO Msg Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirmataAnalogIOMsgCmd(FirmataAnalogIOMsgCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Firmata Digital IO Msg Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Firmata Digital IO Msg Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirmataDigitalIOMsgCmd(FirmataDigitalIOMsgCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sysex Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sysex Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSysexStart(SysexStart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sysex Stop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sysex Stop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSysexStop(SysexStop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Firmata Sysex Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Firmata Sysex Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirmataSysexMessage(FirmataSysexMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Firmata Capabilities Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Firmata Capabilities Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirmataCapabilitiesCmd(FirmataCapabilitiesCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Firmata Pin State Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Firmata Pin State Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirmataPinStateResponse(FirmataPinStateResponse object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Midi Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Midi Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMidiCmd(AbstractMidiCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DSL Midi Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DSL Midi Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSLMidiMessage(DSLMidiMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sysex Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sysex Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSysexMessage(SysexMessage object) {
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

} //EzfirmataSwitch
