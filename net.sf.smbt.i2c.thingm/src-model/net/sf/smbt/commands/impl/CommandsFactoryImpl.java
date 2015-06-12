/**
 * <copyright>
 * </copyright>
 *
 * $Id: CommandsFactoryImpl.java,v 1.2 2009/01/20 07:06:03 lucascraft Exp $
 */
package net.sf.smbt.commands.impl;

import net.sf.smbt.blinkm.cmd.injection.BlinkMUtil;
import net.sf.smbt.commands.BlinkMCmd;
import net.sf.smbt.commands.CommandsFactory;
import net.sf.smbt.commands.CommandsPackage;
import net.sf.smbt.commands.FLAG;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class CommandsFactoryImpl extends EFactoryImpl implements CommandsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommandsFactory init() {
		try {
			CommandsFactory theCommandsFactory = (CommandsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.sf.net/smbt/thingm/commands/1.0"); 
			if (theCommandsFactory != null) {
				return theCommandsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CommandsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandsFactoryImpl() {
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
			case CommandsPackage.BLINK_MCMD: return createBlinkMCmd();
			case CommandsPackage.GO_TO_RGB_COLOR_CMD: return createGoToRGBColorCmd();
			case CommandsPackage.FADE_TO_RGB_COLOR_CMD: return createFadeToRGBColorCmd();
			case CommandsPackage.FADE_TO_HSB_COLOR_CMD: return createFadeToHSBColorCmd();
			case CommandsPackage.FADE_TO_RANDOM_RGB_COLOR_CMD: return createFadeToRandomRGBColorCmd();
			case CommandsPackage.FADE_TO_RANDOM_HSB_COLOR_CMD: return createFadeToRandomHSBColorCmd();
			case CommandsPackage.PLAY_LIGHT_SCRIPT_CMD: return createPlayLightScriptCmd();
			case CommandsPackage.SET_FADE_SPEED_CMD: return createSetFadeSpeedCmd();
			case CommandsPackage.STOP_SCRIPT_CMD: return createStopScriptCmd();
			case CommandsPackage.SET_TIME_ADJUST_CMD: return createSetTimeAdjustCmd();
			case CommandsPackage.GET_CURRENT_RGB_COLOR_CMD: return createGetCurrentRGBColorCmd();
			case CommandsPackage.WRITE_SCRIPT_LINE_CMD: return createWriteScriptLineCmd();
			case CommandsPackage.READ_SCRIPT_LINE_CMD: return createReadScriptLineCmd();
			case CommandsPackage.SET_SCRIPT_LENGTH_AND_REPEAT_CMD: return createSetScriptLengthAndRepeatCmd();
			case CommandsPackage.SET_BLINK_MADDR_CMD: return createSetBlinkMAddrCmd();
			case CommandsPackage.GET_BLINK_MADDR_CMD: return createGetBlinkMAddrCmd();
			case CommandsPackage.GET_BLINK_MFIRMWARE_VERSION_CMD: return createGetBlinkMFirmwareVersionCmd();
			case CommandsPackage.SET_STARTUP_PARAMETERS_CMD: return createSetStartupParametersCmd();
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
			case CommandsPackage.FLAG:
				return createFLAGFromString(eDataType, initialValue);
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
			case CommandsPackage.FLAG:
				return convertFLAGToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlinkMCmd createBlinkMCmd() {
		BlinkMCmdImpl blinkMCmd = new BlinkMCmdImpl();
		return blinkMCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public GoToRGBColorCmd createGoToRGBColorCmd() {
		return BlinkMUtil.INSTANCE.setupBlinkMCommand(new GoToRGBColorCmdImpl(), FLAG.WRITE,  (byte) 0x6e, (byte) 'n', new byte[3], new byte[0]);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public FadeToRGBColorCmd createFadeToRGBColorCmd() {
		return BlinkMUtil.INSTANCE.setupBlinkMCommand(new FadeToRGBColorCmdImpl(), FLAG.WRITE,  (byte) 0x63, (byte) 'c', new byte[3], new byte[0]);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public FadeToHSBColorCmd createFadeToHSBColorCmd() {
		return BlinkMUtil.INSTANCE.setupBlinkMCommand(new FadeToHSBColorCmdImpl(), FLAG.WRITE,  (byte) 0x68, (byte) 'h', new byte[3], new byte[0]);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public FadeToRandomRGBColorCmd createFadeToRandomRGBColorCmd() {
		return BlinkMUtil.INSTANCE.setupBlinkMCommand(new FadeToRandomRGBColorCmdImpl(), FLAG.WRITE,  (byte) 0x43, (byte) 'C', new byte[3], new byte[0]);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public FadeToRandomHSBColorCmd createFadeToRandomHSBColorCmd() {
		return BlinkMUtil.INSTANCE.setupBlinkMCommand(new FadeToRandomHSBColorCmdImpl(), FLAG.WRITE, (byte) 0x48, (byte) 'H', new byte[3], new byte[0]);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayLightScriptCmd createPlayLightScriptCmd() {
		PlayLightScriptCmdImpl playLightScriptCmd = new PlayLightScriptCmdImpl();
		return playLightScriptCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PlayLightScriptCmd createPlayLightScript() {
		return BlinkMUtil.INSTANCE.setupBlinkMCommand(new PlayLightScriptCmdImpl(), FLAG.WRITE,  (byte) 0x70, (byte) 'p', new byte[3], new byte[0]);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SetFadeSpeedCmd createSetFadeSpeedCmd() {
		return BlinkMUtil.INSTANCE.setupBlinkMCommand(new SetFadeSpeedCmdImpl(), FLAG.WRITE,  (byte) 0x66, (byte) 'f', new byte[1], new byte[0]);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public StopScriptCmd createStopScriptCmd() {
		return BlinkMUtil.INSTANCE.setupBlinkMCommand(new StopScriptCmdImpl(), FLAG.WRITE,  (byte) 0x6f, (byte) 'o', new byte[0], new byte[0]);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SetTimeAdjustCmd createSetTimeAdjustCmd() {
		return BlinkMUtil.INSTANCE.setupBlinkMCommand(new SetTimeAdjustCmdImpl(), FLAG.WRITE,  (byte) 0x74, (byte) 't', new byte[1], new byte[0]);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public GetCurrentRGBColorCmd createGetCurrentRGBColorCmd() {
		return BlinkMUtil.INSTANCE.setupBlinkMCommand(new GetCurrentRGBColorCmdImpl(), FLAG.READ,  (byte) 0x67, (byte) 'g', new byte[0], new byte[3]);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public WriteScriptLineCmd createWriteScriptLineCmd() {
		return BlinkMUtil.INSTANCE.setupBlinkMCommand(new WriteScriptLineCmdImpl(), FLAG.WRITE,  (byte) 0x57, (byte) 'W', new byte[7], new byte[0]);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ReadScriptLineCmd createReadScriptLineCmd() {
		return BlinkMUtil.INSTANCE.setupBlinkMCommand(new ReadScriptLineCmdImpl(), FLAG.READ,  (byte) 0x52, (byte) 'R', new byte[2], new byte[5]);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SetScriptLengthAndRepeatCmd createSetScriptLengthAndRepeatCmd() {
		return BlinkMUtil.INSTANCE.setupBlinkMCommand(new SetScriptLengthAndRepeatCmdImpl(), FLAG.WRITE,  (byte) 0x4c, (byte) 'L', new byte[3], new byte[0]);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SetBlinkMAddrCmd createSetBlinkMAddrCmd() {
		return BlinkMUtil.INSTANCE.setupBlinkMCommand(new SetBlinkMAddrCmdImpl(), FLAG.WRITE,  (byte) 0x41, (byte) 'A', new byte[4], new byte[0]);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public GetBlinkMAddrCmd createGetBlinkMAddrCmd() {
		return BlinkMUtil.INSTANCE.setupBlinkMCommand(new GetBlinkMAddrCmdImpl(), FLAG.READ,  (byte) 0x61, (byte) 'a', new byte[0], new byte[1]);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public GetBlinkMFirmwareVersionCmd createGetBlinkMFirmwareVersionCmd() {
		return BlinkMUtil.INSTANCE.setupBlinkMCommand(new GetBlinkMFirmwareVersionCmdImpl(), FLAG.READ,  (byte) 0x5a, (byte) 'Z', new byte[0], new byte[1]);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SetStartupParametersCmd createSetStartupParametersCmd() {
		return BlinkMUtil.INSTANCE.setupBlinkMCommand(new SetStartupParametersCmdImpl(), FLAG.WRITE,  (byte) 0x5a, (byte) 'B', new byte[5], new byte[1]);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FLAG createFLAGFromString(EDataType eDataType, String initialValue) {
		FLAG result = FLAG.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFLAGToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandsPackage getCommandsPackage() {
		return (CommandsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CommandsPackage getPackage() {
		return CommandsPackage.eINSTANCE;
	}

} //CommandsFactoryImpl
