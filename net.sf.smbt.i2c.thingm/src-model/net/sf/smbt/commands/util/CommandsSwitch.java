/**
 * <copyright>
 * </copyright>
 *
 * $Id: CommandsSwitch.java,v 1.2 2009/01/20 07:06:03 lucascraft Exp $
 */
package net.sf.smbt.commands.util;

import java.util.List;

import net.sf.smbt.commands.*;
import net.sf.smbt.commands.BlinkMCmd;
import net.sf.smbt.commands.CommandsPackage;
import net.sf.smbt.commands.FadeToHSBColorCmd;
import net.sf.smbt.commands.FadeToRGBColorCmd;
import net.sf.smbt.commands.FadeToRandomHSBColorCmd;
import net.sf.smbt.commands.FadeToRandomRGBColorCmd;
import net.sf.smbt.commands.GetBlinkMAddrCmd;
import net.sf.smbt.commands.GetBlinkMFirmwareVersionCmd;
import net.sf.smbt.commands.GetCurrentRGBColorCmd;
import net.sf.smbt.commands.GoToRGBColorCmd;
import net.sf.smbt.commands.PlayLightScriptCmd;
import net.sf.smbt.commands.ReadScriptLineCmd;
import net.sf.smbt.commands.SetBlinkMAddrCmd;
import net.sf.smbt.commands.SetFadeSpeedCmd;
import net.sf.smbt.commands.SetScriptLengthAndRepeatCmd;
import net.sf.smbt.commands.SetStartupParametersCmd;
import net.sf.smbt.commands.SetTimeAdjustCmd;
import net.sf.smbt.commands.StopScriptCmd;
import net.sf.smbt.commands.WriteScriptLineCmd;
import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

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
 * @see net.sf.smbt.commands.CommandsPackage
 * @generated
 */
public class CommandsSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CommandsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandsSwitch() {
		if (modelPackage == null) {
			modelPackage = CommandsPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CommandsPackage.BLINK_MCMD: {
				BlinkMCmd blinkMCmd = (BlinkMCmd)theEObject;
				T result = caseBlinkMCmd(blinkMCmd);
				if (result == null) result = caseCmd(blinkMCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommandsPackage.GO_TO_RGB_COLOR_CMD: {
				GoToRGBColorCmd goToRGBColorCmd = (GoToRGBColorCmd)theEObject;
				T result = caseGoToRGBColorCmd(goToRGBColorCmd);
				if (result == null) result = caseBlinkMCmd(goToRGBColorCmd);
				if (result == null) result = caseCmd(goToRGBColorCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommandsPackage.FADE_TO_RGB_COLOR_CMD: {
				FadeToRGBColorCmd fadeToRGBColorCmd = (FadeToRGBColorCmd)theEObject;
				T result = caseFadeToRGBColorCmd(fadeToRGBColorCmd);
				if (result == null) result = caseBlinkMCmd(fadeToRGBColorCmd);
				if (result == null) result = caseCmd(fadeToRGBColorCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommandsPackage.FADE_TO_HSB_COLOR_CMD: {
				FadeToHSBColorCmd fadeToHSBColorCmd = (FadeToHSBColorCmd)theEObject;
				T result = caseFadeToHSBColorCmd(fadeToHSBColorCmd);
				if (result == null) result = caseBlinkMCmd(fadeToHSBColorCmd);
				if (result == null) result = caseCmd(fadeToHSBColorCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommandsPackage.FADE_TO_RANDOM_RGB_COLOR_CMD: {
				FadeToRandomRGBColorCmd fadeToRandomRGBColorCmd = (FadeToRandomRGBColorCmd)theEObject;
				T result = caseFadeToRandomRGBColorCmd(fadeToRandomRGBColorCmd);
				if (result == null) result = caseBlinkMCmd(fadeToRandomRGBColorCmd);
				if (result == null) result = caseCmd(fadeToRandomRGBColorCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommandsPackage.FADE_TO_RANDOM_HSB_COLOR_CMD: {
				FadeToRandomHSBColorCmd fadeToRandomHSBColorCmd = (FadeToRandomHSBColorCmd)theEObject;
				T result = caseFadeToRandomHSBColorCmd(fadeToRandomHSBColorCmd);
				if (result == null) result = caseBlinkMCmd(fadeToRandomHSBColorCmd);
				if (result == null) result = caseCmd(fadeToRandomHSBColorCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommandsPackage.PLAY_LIGHT_SCRIPT_CMD: {
				PlayLightScriptCmd playLightScriptCmd = (PlayLightScriptCmd)theEObject;
				T result = casePlayLightScriptCmd(playLightScriptCmd);
				if (result == null) result = caseBlinkMCmd(playLightScriptCmd);
				if (result == null) result = caseCmd(playLightScriptCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommandsPackage.SET_FADE_SPEED_CMD: {
				SetFadeSpeedCmd setFadeSpeedCmd = (SetFadeSpeedCmd)theEObject;
				T result = caseSetFadeSpeedCmd(setFadeSpeedCmd);
				if (result == null) result = caseBlinkMCmd(setFadeSpeedCmd);
				if (result == null) result = caseCmd(setFadeSpeedCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommandsPackage.STOP_SCRIPT_CMD: {
				StopScriptCmd stopScriptCmd = (StopScriptCmd)theEObject;
				T result = caseStopScriptCmd(stopScriptCmd);
				if (result == null) result = caseBlinkMCmd(stopScriptCmd);
				if (result == null) result = caseCmd(stopScriptCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommandsPackage.SET_TIME_ADJUST_CMD: {
				SetTimeAdjustCmd setTimeAdjustCmd = (SetTimeAdjustCmd)theEObject;
				T result = caseSetTimeAdjustCmd(setTimeAdjustCmd);
				if (result == null) result = caseBlinkMCmd(setTimeAdjustCmd);
				if (result == null) result = caseCmd(setTimeAdjustCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommandsPackage.GET_CURRENT_RGB_COLOR_CMD: {
				GetCurrentRGBColorCmd getCurrentRGBColorCmd = (GetCurrentRGBColorCmd)theEObject;
				T result = caseGetCurrentRGBColorCmd(getCurrentRGBColorCmd);
				if (result == null) result = caseBlinkMCmd(getCurrentRGBColorCmd);
				if (result == null) result = caseCmd(getCurrentRGBColorCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommandsPackage.WRITE_SCRIPT_LINE_CMD: {
				WriteScriptLineCmd writeScriptLineCmd = (WriteScriptLineCmd)theEObject;
				T result = caseWriteScriptLineCmd(writeScriptLineCmd);
				if (result == null) result = caseBlinkMCmd(writeScriptLineCmd);
				if (result == null) result = caseCmd(writeScriptLineCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommandsPackage.READ_SCRIPT_LINE_CMD: {
				ReadScriptLineCmd readScriptLineCmd = (ReadScriptLineCmd)theEObject;
				T result = caseReadScriptLineCmd(readScriptLineCmd);
				if (result == null) result = caseBlinkMCmd(readScriptLineCmd);
				if (result == null) result = caseCmd(readScriptLineCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommandsPackage.SET_SCRIPT_LENGTH_AND_REPEAT_CMD: {
				SetScriptLengthAndRepeatCmd setScriptLengthAndRepeatCmd = (SetScriptLengthAndRepeatCmd)theEObject;
				T result = caseSetScriptLengthAndRepeatCmd(setScriptLengthAndRepeatCmd);
				if (result == null) result = caseBlinkMCmd(setScriptLengthAndRepeatCmd);
				if (result == null) result = caseCmd(setScriptLengthAndRepeatCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommandsPackage.SET_BLINK_MADDR_CMD: {
				SetBlinkMAddrCmd setBlinkMAddrCmd = (SetBlinkMAddrCmd)theEObject;
				T result = caseSetBlinkMAddrCmd(setBlinkMAddrCmd);
				if (result == null) result = caseBlinkMCmd(setBlinkMAddrCmd);
				if (result == null) result = caseCmd(setBlinkMAddrCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommandsPackage.GET_BLINK_MADDR_CMD: {
				GetBlinkMAddrCmd getBlinkMAddrCmd = (GetBlinkMAddrCmd)theEObject;
				T result = caseGetBlinkMAddrCmd(getBlinkMAddrCmd);
				if (result == null) result = caseBlinkMCmd(getBlinkMAddrCmd);
				if (result == null) result = caseCmd(getBlinkMAddrCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommandsPackage.GET_BLINK_MFIRMWARE_VERSION_CMD: {
				GetBlinkMFirmwareVersionCmd getBlinkMFirmwareVersionCmd = (GetBlinkMFirmwareVersionCmd)theEObject;
				T result = caseGetBlinkMFirmwareVersionCmd(getBlinkMFirmwareVersionCmd);
				if (result == null) result = caseBlinkMCmd(getBlinkMFirmwareVersionCmd);
				if (result == null) result = caseCmd(getBlinkMFirmwareVersionCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommandsPackage.SET_STARTUP_PARAMETERS_CMD: {
				SetStartupParametersCmd setStartupParametersCmd = (SetStartupParametersCmd)theEObject;
				T result = caseSetStartupParametersCmd(setStartupParametersCmd);
				if (result == null) result = caseBlinkMCmd(setStartupParametersCmd);
				if (result == null) result = caseCmd(setStartupParametersCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blink MCmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blink MCmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlinkMCmd(BlinkMCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Go To RGB Color Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Go To RGB Color Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoToRGBColorCmd(GoToRGBColorCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fade To RGB Color Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fade To RGB Color Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFadeToRGBColorCmd(FadeToRGBColorCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fade To HSB Color Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fade To HSB Color Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFadeToHSBColorCmd(FadeToHSBColorCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fade To Random RGB Color Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fade To Random RGB Color Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFadeToRandomRGBColorCmd(FadeToRandomRGBColorCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fade To Random HSB Color Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fade To Random HSB Color Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFadeToRandomHSBColorCmd(FadeToRandomHSBColorCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Play Light Script Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Play Light Script Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlayLightScriptCmd(PlayLightScriptCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Fade Speed Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Fade Speed Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetFadeSpeedCmd(SetFadeSpeedCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Script Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Script Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopScriptCmd(StopScriptCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Time Adjust Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Time Adjust Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetTimeAdjustCmd(SetTimeAdjustCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Current RGB Color Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Current RGB Color Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetCurrentRGBColorCmd(GetCurrentRGBColorCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Write Script Line Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Write Script Line Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWriteScriptLineCmd(WriteScriptLineCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Script Line Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Script Line Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadScriptLineCmd(ReadScriptLineCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Script Length And Repeat Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Script Length And Repeat Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetScriptLengthAndRepeatCmd(SetScriptLengthAndRepeatCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Blink MAddr Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Blink MAddr Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetBlinkMAddrCmd(SetBlinkMAddrCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Blink MAddr Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Blink MAddr Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetBlinkMAddrCmd(GetBlinkMAddrCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Blink MFirmware Version Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Blink MFirmware Version Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetBlinkMFirmwareVersionCmd(GetBlinkMFirmwareVersionCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Startup Parameters Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Startup Parameters Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetStartupParametersCmd(SetStartupParametersCmd object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //CommandsSwitch
