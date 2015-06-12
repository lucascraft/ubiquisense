/**
 * <copyright>
 * </copyright>
 *
 * $Id: CommandsFactory.java,v 1.1 2008/12/28 12:32:54 lucascraft Exp $
 */
package net.sf.smbt.commands;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.commands.CommandsPackage
 * @generated
 */
public interface CommandsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommandsFactory eINSTANCE = net.sf.smbt.commands.impl.CommandsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Blink MCmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blink MCmd</em>'.
	 * @generated
	 */
	BlinkMCmd createBlinkMCmd();

	/**
	 * Returns a new object of class '<em>Go To RGB Color Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Go To RGB Color Cmd</em>'.
	 * @generated
	 */
	GoToRGBColorCmd createGoToRGBColorCmd();

	/**
	 * Returns a new object of class '<em>Fade To RGB Color Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fade To RGB Color Cmd</em>'.
	 * @generated
	 */
	FadeToRGBColorCmd createFadeToRGBColorCmd();

	/**
	 * Returns a new object of class '<em>Fade To HSB Color Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fade To HSB Color Cmd</em>'.
	 * @generated
	 */
	FadeToHSBColorCmd createFadeToHSBColorCmd();

	/**
	 * Returns a new object of class '<em>Fade To Random RGB Color Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fade To Random RGB Color Cmd</em>'.
	 * @generated
	 */
	FadeToRandomRGBColorCmd createFadeToRandomRGBColorCmd();

	/**
	 * Returns a new object of class '<em>Fade To Random HSB Color Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fade To Random HSB Color Cmd</em>'.
	 * @generated
	 */
	FadeToRandomHSBColorCmd createFadeToRandomHSBColorCmd();

	/**
	 * Returns a new object of class '<em>Play Light Script Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Play Light Script Cmd</em>'.
	 * @generated
	 */
	PlayLightScriptCmd createPlayLightScriptCmd();

	/**
	 * Returns a new object of class '<em>Set Fade Speed Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Fade Speed Cmd</em>'.
	 * @generated
	 */
	SetFadeSpeedCmd createSetFadeSpeedCmd();

	/**
	 * Returns a new object of class '<em>Stop Script Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop Script Cmd</em>'.
	 * @generated
	 */
	StopScriptCmd createStopScriptCmd();

	/**
	 * Returns a new object of class '<em>Set Time Adjust Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Time Adjust Cmd</em>'.
	 * @generated
	 */
	SetTimeAdjustCmd createSetTimeAdjustCmd();

	/**
	 * Returns a new object of class '<em>Get Current RGB Color Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Current RGB Color Cmd</em>'.
	 * @generated
	 */
	GetCurrentRGBColorCmd createGetCurrentRGBColorCmd();

	/**
	 * Returns a new object of class '<em>Write Script Line Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Write Script Line Cmd</em>'.
	 * @generated
	 */
	WriteScriptLineCmd createWriteScriptLineCmd();

	/**
	 * Returns a new object of class '<em>Read Script Line Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Script Line Cmd</em>'.
	 * @generated
	 */
	ReadScriptLineCmd createReadScriptLineCmd();

	/**
	 * Returns a new object of class '<em>Set Script Length And Repeat Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Script Length And Repeat Cmd</em>'.
	 * @generated
	 */
	SetScriptLengthAndRepeatCmd createSetScriptLengthAndRepeatCmd();

	/**
	 * Returns a new object of class '<em>Set Blink MAddr Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Blink MAddr Cmd</em>'.
	 * @generated
	 */
	SetBlinkMAddrCmd createSetBlinkMAddrCmd();

	/**
	 * Returns a new object of class '<em>Get Blink MAddr Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Blink MAddr Cmd</em>'.
	 * @generated
	 */
	GetBlinkMAddrCmd createGetBlinkMAddrCmd();

	/**
	 * Returns a new object of class '<em>Get Blink MFirmware Version Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Blink MFirmware Version Cmd</em>'.
	 * @generated
	 */
	GetBlinkMFirmwareVersionCmd createGetBlinkMFirmwareVersionCmd();

	/**
	 * Returns a new object of class '<em>Set Startup Parameters Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Startup Parameters Cmd</em>'.
	 * @generated
	 */
	SetStartupParametersCmd createSetStartupParametersCmd();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CommandsPackage getCommandsPackage();

} //CommandsFactory
