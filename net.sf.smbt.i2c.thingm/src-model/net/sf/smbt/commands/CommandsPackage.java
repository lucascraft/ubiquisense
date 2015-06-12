/**
 * <copyright>
 * </copyright>
 *
 * $Id: CommandsPackage.java,v 1.2 2009/01/20 07:06:03 lucascraft Exp $
 */
package net.sf.smbt.commands;

import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.smbt.commands.CommandsFactory
 * @model kind="package"
 * @generated
 */
public interface CommandsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "commands";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.sf.net/smbt/thingm/commands/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "commands";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommandsPackage eINSTANCE = net.sf.smbt.commands.impl.CommandsPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.commands.impl.BlinkMCmdImpl <em>Blink MCmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.commands.impl.BlinkMCmdImpl
	 * @see net.sf.smbt.commands.impl.CommandsPackageImpl#getBlinkMCmd()
	 * @generated
	 */
	int BLINK_MCMD = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLINK_MCMD__PRIORITY = CmdPackage.CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLINK_MCMD__CMD_BYTE = CmdPackage.CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cmd Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLINK_MCMD__CMD_CHAR = CmdPackage.CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLINK_MCMD__ARGUMENTS = CmdPackage.CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ret Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLINK_MCMD__RET_VALUES = CmdPackage.CMD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLINK_MCMD__ADDR = CmdPackage.CMD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLINK_MCMD__FLAG = CmdPackage.CMD_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Blink MCmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLINK_MCMD_FEATURE_COUNT = CmdPackage.CMD_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link net.sf.smbt.commands.impl.GoToRGBColorCmdImpl <em>Go To RGB Color Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.commands.impl.GoToRGBColorCmdImpl
	 * @see net.sf.smbt.commands.impl.CommandsPackageImpl#getGoToRGBColorCmd()
	 * @generated
	 */
	int GO_TO_RGB_COLOR_CMD = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_RGB_COLOR_CMD__PRIORITY = BLINK_MCMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_RGB_COLOR_CMD__CMD_BYTE = BLINK_MCMD__CMD_BYTE;

	/**
	 * The feature id for the '<em><b>Cmd Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_RGB_COLOR_CMD__CMD_CHAR = BLINK_MCMD__CMD_CHAR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_RGB_COLOR_CMD__ARGUMENTS = BLINK_MCMD__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Ret Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_RGB_COLOR_CMD__RET_VALUES = BLINK_MCMD__RET_VALUES;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_RGB_COLOR_CMD__ADDR = BLINK_MCMD__ADDR;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_RGB_COLOR_CMD__FLAG = BLINK_MCMD__FLAG;

	/**
	 * The number of structural features of the '<em>Go To RGB Color Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_RGB_COLOR_CMD_FEATURE_COUNT = BLINK_MCMD_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link net.sf.smbt.commands.impl.FadeToRGBColorCmdImpl <em>Fade To RGB Color Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.commands.impl.FadeToRGBColorCmdImpl
	 * @see net.sf.smbt.commands.impl.CommandsPackageImpl#getFadeToRGBColorCmd()
	 * @generated
	 */
	int FADE_TO_RGB_COLOR_CMD = 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO_RGB_COLOR_CMD__PRIORITY = BLINK_MCMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO_RGB_COLOR_CMD__CMD_BYTE = BLINK_MCMD__CMD_BYTE;

	/**
	 * The feature id for the '<em><b>Cmd Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO_RGB_COLOR_CMD__CMD_CHAR = BLINK_MCMD__CMD_CHAR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO_RGB_COLOR_CMD__ARGUMENTS = BLINK_MCMD__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Ret Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO_RGB_COLOR_CMD__RET_VALUES = BLINK_MCMD__RET_VALUES;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO_RGB_COLOR_CMD__ADDR = BLINK_MCMD__ADDR;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO_RGB_COLOR_CMD__FLAG = BLINK_MCMD__FLAG;

	/**
	 * The number of structural features of the '<em>Fade To RGB Color Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO_RGB_COLOR_CMD_FEATURE_COUNT = BLINK_MCMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.commands.impl.FadeToHSBColorCmdImpl <em>Fade To HSB Color Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.commands.impl.FadeToHSBColorCmdImpl
	 * @see net.sf.smbt.commands.impl.CommandsPackageImpl#getFadeToHSBColorCmd()
	 * @generated
	 */
	int FADE_TO_HSB_COLOR_CMD = 3;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO_HSB_COLOR_CMD__PRIORITY = BLINK_MCMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO_HSB_COLOR_CMD__CMD_BYTE = BLINK_MCMD__CMD_BYTE;

	/**
	 * The feature id for the '<em><b>Cmd Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO_HSB_COLOR_CMD__CMD_CHAR = BLINK_MCMD__CMD_CHAR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO_HSB_COLOR_CMD__ARGUMENTS = BLINK_MCMD__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Ret Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO_HSB_COLOR_CMD__RET_VALUES = BLINK_MCMD__RET_VALUES;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO_HSB_COLOR_CMD__ADDR = BLINK_MCMD__ADDR;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO_HSB_COLOR_CMD__FLAG = BLINK_MCMD__FLAG;

	/**
	 * The number of structural features of the '<em>Fade To HSB Color Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO_HSB_COLOR_CMD_FEATURE_COUNT = BLINK_MCMD_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link net.sf.smbt.commands.impl.FadeToRandomRGBColorCmdImpl <em>Fade To Random RGB Color Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.commands.impl.FadeToRandomRGBColorCmdImpl
	 * @see net.sf.smbt.commands.impl.CommandsPackageImpl#getFadeToRandomRGBColorCmd()
	 * @generated
	 */
	int FADE_TO_RANDOM_RGB_COLOR_CMD = 4;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO_RANDOM_RGB_COLOR_CMD__PRIORITY = BLINK_MCMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO_RANDOM_RGB_COLOR_CMD__CMD_BYTE = BLINK_MCMD__CMD_BYTE;

	/**
	 * The feature id for the '<em><b>Cmd Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO_RANDOM_RGB_COLOR_CMD__CMD_CHAR = BLINK_MCMD__CMD_CHAR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO_RANDOM_RGB_COLOR_CMD__ARGUMENTS = BLINK_MCMD__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Ret Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO_RANDOM_RGB_COLOR_CMD__RET_VALUES = BLINK_MCMD__RET_VALUES;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO_RANDOM_RGB_COLOR_CMD__ADDR = BLINK_MCMD__ADDR;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO_RANDOM_RGB_COLOR_CMD__FLAG = BLINK_MCMD__FLAG;

	/**
	 * The number of structural features of the '<em>Fade To Random RGB Color Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO_RANDOM_RGB_COLOR_CMD_FEATURE_COUNT = BLINK_MCMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.commands.impl.FadeToRandomHSBColorCmdImpl <em>Fade To Random HSB Color Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.commands.impl.FadeToRandomHSBColorCmdImpl
	 * @see net.sf.smbt.commands.impl.CommandsPackageImpl#getFadeToRandomHSBColorCmd()
	 * @generated
	 */
	int FADE_TO_RANDOM_HSB_COLOR_CMD = 5;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO_RANDOM_HSB_COLOR_CMD__PRIORITY = BLINK_MCMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO_RANDOM_HSB_COLOR_CMD__CMD_BYTE = BLINK_MCMD__CMD_BYTE;

	/**
	 * The feature id for the '<em><b>Cmd Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO_RANDOM_HSB_COLOR_CMD__CMD_CHAR = BLINK_MCMD__CMD_CHAR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO_RANDOM_HSB_COLOR_CMD__ARGUMENTS = BLINK_MCMD__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Ret Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO_RANDOM_HSB_COLOR_CMD__RET_VALUES = BLINK_MCMD__RET_VALUES;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO_RANDOM_HSB_COLOR_CMD__ADDR = BLINK_MCMD__ADDR;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO_RANDOM_HSB_COLOR_CMD__FLAG = BLINK_MCMD__FLAG;

	/**
	 * The number of structural features of the '<em>Fade To Random HSB Color Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FADE_TO_RANDOM_HSB_COLOR_CMD_FEATURE_COUNT = BLINK_MCMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.commands.impl.PlayLightScriptCmdImpl <em>Play Light Script Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.commands.impl.PlayLightScriptCmdImpl
	 * @see net.sf.smbt.commands.impl.CommandsPackageImpl#getPlayLightScriptCmd()
	 * @generated
	 */
	int PLAY_LIGHT_SCRIPT_CMD = 6;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_LIGHT_SCRIPT_CMD__PRIORITY = BLINK_MCMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_LIGHT_SCRIPT_CMD__CMD_BYTE = BLINK_MCMD__CMD_BYTE;

	/**
	 * The feature id for the '<em><b>Cmd Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_LIGHT_SCRIPT_CMD__CMD_CHAR = BLINK_MCMD__CMD_CHAR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_LIGHT_SCRIPT_CMD__ARGUMENTS = BLINK_MCMD__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Ret Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_LIGHT_SCRIPT_CMD__RET_VALUES = BLINK_MCMD__RET_VALUES;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_LIGHT_SCRIPT_CMD__ADDR = BLINK_MCMD__ADDR;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_LIGHT_SCRIPT_CMD__FLAG = BLINK_MCMD__FLAG;

	/**
	 * The number of structural features of the '<em>Play Light Script Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_LIGHT_SCRIPT_CMD_FEATURE_COUNT = BLINK_MCMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.commands.impl.SetFadeSpeedCmdImpl <em>Set Fade Speed Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.commands.impl.SetFadeSpeedCmdImpl
	 * @see net.sf.smbt.commands.impl.CommandsPackageImpl#getSetFadeSpeedCmd()
	 * @generated
	 */
	int SET_FADE_SPEED_CMD = 7;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FADE_SPEED_CMD__PRIORITY = BLINK_MCMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FADE_SPEED_CMD__CMD_BYTE = BLINK_MCMD__CMD_BYTE;

	/**
	 * The feature id for the '<em><b>Cmd Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FADE_SPEED_CMD__CMD_CHAR = BLINK_MCMD__CMD_CHAR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FADE_SPEED_CMD__ARGUMENTS = BLINK_MCMD__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Ret Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FADE_SPEED_CMD__RET_VALUES = BLINK_MCMD__RET_VALUES;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FADE_SPEED_CMD__ADDR = BLINK_MCMD__ADDR;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FADE_SPEED_CMD__FLAG = BLINK_MCMD__FLAG;

	/**
	 * The number of structural features of the '<em>Set Fade Speed Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FADE_SPEED_CMD_FEATURE_COUNT = BLINK_MCMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.commands.impl.StopScriptCmdImpl <em>Stop Script Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.commands.impl.StopScriptCmdImpl
	 * @see net.sf.smbt.commands.impl.CommandsPackageImpl#getStopScriptCmd()
	 * @generated
	 */
	int STOP_SCRIPT_CMD = 8;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_SCRIPT_CMD__PRIORITY = BLINK_MCMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_SCRIPT_CMD__CMD_BYTE = BLINK_MCMD__CMD_BYTE;

	/**
	 * The feature id for the '<em><b>Cmd Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_SCRIPT_CMD__CMD_CHAR = BLINK_MCMD__CMD_CHAR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_SCRIPT_CMD__ARGUMENTS = BLINK_MCMD__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Ret Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_SCRIPT_CMD__RET_VALUES = BLINK_MCMD__RET_VALUES;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_SCRIPT_CMD__ADDR = BLINK_MCMD__ADDR;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_SCRIPT_CMD__FLAG = BLINK_MCMD__FLAG;

	/**
	 * The number of structural features of the '<em>Stop Script Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_SCRIPT_CMD_FEATURE_COUNT = BLINK_MCMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.commands.impl.SetTimeAdjustCmdImpl <em>Set Time Adjust Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.commands.impl.SetTimeAdjustCmdImpl
	 * @see net.sf.smbt.commands.impl.CommandsPackageImpl#getSetTimeAdjustCmd()
	 * @generated
	 */
	int SET_TIME_ADJUST_CMD = 9;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TIME_ADJUST_CMD__PRIORITY = BLINK_MCMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TIME_ADJUST_CMD__CMD_BYTE = BLINK_MCMD__CMD_BYTE;

	/**
	 * The feature id for the '<em><b>Cmd Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TIME_ADJUST_CMD__CMD_CHAR = BLINK_MCMD__CMD_CHAR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TIME_ADJUST_CMD__ARGUMENTS = BLINK_MCMD__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Ret Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TIME_ADJUST_CMD__RET_VALUES = BLINK_MCMD__RET_VALUES;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TIME_ADJUST_CMD__ADDR = BLINK_MCMD__ADDR;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TIME_ADJUST_CMD__FLAG = BLINK_MCMD__FLAG;

	/**
	 * The number of structural features of the '<em>Set Time Adjust Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TIME_ADJUST_CMD_FEATURE_COUNT = BLINK_MCMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.commands.impl.GetCurrentRGBColorCmdImpl <em>Get Current RGB Color Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.commands.impl.GetCurrentRGBColorCmdImpl
	 * @see net.sf.smbt.commands.impl.CommandsPackageImpl#getGetCurrentRGBColorCmd()
	 * @generated
	 */
	int GET_CURRENT_RGB_COLOR_CMD = 10;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CURRENT_RGB_COLOR_CMD__PRIORITY = BLINK_MCMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CURRENT_RGB_COLOR_CMD__CMD_BYTE = BLINK_MCMD__CMD_BYTE;

	/**
	 * The feature id for the '<em><b>Cmd Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CURRENT_RGB_COLOR_CMD__CMD_CHAR = BLINK_MCMD__CMD_CHAR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CURRENT_RGB_COLOR_CMD__ARGUMENTS = BLINK_MCMD__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Ret Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CURRENT_RGB_COLOR_CMD__RET_VALUES = BLINK_MCMD__RET_VALUES;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CURRENT_RGB_COLOR_CMD__ADDR = BLINK_MCMD__ADDR;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CURRENT_RGB_COLOR_CMD__FLAG = BLINK_MCMD__FLAG;

	/**
	 * The number of structural features of the '<em>Get Current RGB Color Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CURRENT_RGB_COLOR_CMD_FEATURE_COUNT = BLINK_MCMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.commands.impl.WriteScriptLineCmdImpl <em>Write Script Line Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.commands.impl.WriteScriptLineCmdImpl
	 * @see net.sf.smbt.commands.impl.CommandsPackageImpl#getWriteScriptLineCmd()
	 * @generated
	 */
	int WRITE_SCRIPT_LINE_CMD = 11;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_SCRIPT_LINE_CMD__PRIORITY = BLINK_MCMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_SCRIPT_LINE_CMD__CMD_BYTE = BLINK_MCMD__CMD_BYTE;

	/**
	 * The feature id for the '<em><b>Cmd Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_SCRIPT_LINE_CMD__CMD_CHAR = BLINK_MCMD__CMD_CHAR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_SCRIPT_LINE_CMD__ARGUMENTS = BLINK_MCMD__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Ret Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_SCRIPT_LINE_CMD__RET_VALUES = BLINK_MCMD__RET_VALUES;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_SCRIPT_LINE_CMD__ADDR = BLINK_MCMD__ADDR;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_SCRIPT_LINE_CMD__FLAG = BLINK_MCMD__FLAG;

	/**
	 * The number of structural features of the '<em>Write Script Line Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_SCRIPT_LINE_CMD_FEATURE_COUNT = BLINK_MCMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.commands.impl.ReadScriptLineCmdImpl <em>Read Script Line Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.commands.impl.ReadScriptLineCmdImpl
	 * @see net.sf.smbt.commands.impl.CommandsPackageImpl#getReadScriptLineCmd()
	 * @generated
	 */
	int READ_SCRIPT_LINE_CMD = 12;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SCRIPT_LINE_CMD__PRIORITY = BLINK_MCMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SCRIPT_LINE_CMD__CMD_BYTE = BLINK_MCMD__CMD_BYTE;

	/**
	 * The feature id for the '<em><b>Cmd Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SCRIPT_LINE_CMD__CMD_CHAR = BLINK_MCMD__CMD_CHAR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SCRIPT_LINE_CMD__ARGUMENTS = BLINK_MCMD__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Ret Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SCRIPT_LINE_CMD__RET_VALUES = BLINK_MCMD__RET_VALUES;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SCRIPT_LINE_CMD__ADDR = BLINK_MCMD__ADDR;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SCRIPT_LINE_CMD__FLAG = BLINK_MCMD__FLAG;

	/**
	 * The number of structural features of the '<em>Read Script Line Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_SCRIPT_LINE_CMD_FEATURE_COUNT = BLINK_MCMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.commands.impl.SetScriptLengthAndRepeatCmdImpl <em>Set Script Length And Repeat Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.commands.impl.SetScriptLengthAndRepeatCmdImpl
	 * @see net.sf.smbt.commands.impl.CommandsPackageImpl#getSetScriptLengthAndRepeatCmd()
	 * @generated
	 */
	int SET_SCRIPT_LENGTH_AND_REPEAT_CMD = 13;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SCRIPT_LENGTH_AND_REPEAT_CMD__PRIORITY = BLINK_MCMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SCRIPT_LENGTH_AND_REPEAT_CMD__CMD_BYTE = BLINK_MCMD__CMD_BYTE;

	/**
	 * The feature id for the '<em><b>Cmd Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SCRIPT_LENGTH_AND_REPEAT_CMD__CMD_CHAR = BLINK_MCMD__CMD_CHAR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SCRIPT_LENGTH_AND_REPEAT_CMD__ARGUMENTS = BLINK_MCMD__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Ret Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SCRIPT_LENGTH_AND_REPEAT_CMD__RET_VALUES = BLINK_MCMD__RET_VALUES;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SCRIPT_LENGTH_AND_REPEAT_CMD__ADDR = BLINK_MCMD__ADDR;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SCRIPT_LENGTH_AND_REPEAT_CMD__FLAG = BLINK_MCMD__FLAG;

	/**
	 * The number of structural features of the '<em>Set Script Length And Repeat Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SCRIPT_LENGTH_AND_REPEAT_CMD_FEATURE_COUNT = BLINK_MCMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.commands.impl.SetBlinkMAddrCmdImpl <em>Set Blink MAddr Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.commands.impl.SetBlinkMAddrCmdImpl
	 * @see net.sf.smbt.commands.impl.CommandsPackageImpl#getSetBlinkMAddrCmd()
	 * @generated
	 */
	int SET_BLINK_MADDR_CMD = 14;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BLINK_MADDR_CMD__PRIORITY = BLINK_MCMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BLINK_MADDR_CMD__CMD_BYTE = BLINK_MCMD__CMD_BYTE;

	/**
	 * The feature id for the '<em><b>Cmd Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BLINK_MADDR_CMD__CMD_CHAR = BLINK_MCMD__CMD_CHAR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BLINK_MADDR_CMD__ARGUMENTS = BLINK_MCMD__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Ret Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BLINK_MADDR_CMD__RET_VALUES = BLINK_MCMD__RET_VALUES;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BLINK_MADDR_CMD__ADDR = BLINK_MCMD__ADDR;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BLINK_MADDR_CMD__FLAG = BLINK_MCMD__FLAG;

	/**
	 * The number of structural features of the '<em>Set Blink MAddr Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_BLINK_MADDR_CMD_FEATURE_COUNT = BLINK_MCMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.commands.impl.GetBlinkMAddrCmdImpl <em>Get Blink MAddr Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.commands.impl.GetBlinkMAddrCmdImpl
	 * @see net.sf.smbt.commands.impl.CommandsPackageImpl#getGetBlinkMAddrCmd()
	 * @generated
	 */
	int GET_BLINK_MADDR_CMD = 15;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_BLINK_MADDR_CMD__PRIORITY = BLINK_MCMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_BLINK_MADDR_CMD__CMD_BYTE = BLINK_MCMD__CMD_BYTE;

	/**
	 * The feature id for the '<em><b>Cmd Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_BLINK_MADDR_CMD__CMD_CHAR = BLINK_MCMD__CMD_CHAR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_BLINK_MADDR_CMD__ARGUMENTS = BLINK_MCMD__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Ret Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_BLINK_MADDR_CMD__RET_VALUES = BLINK_MCMD__RET_VALUES;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_BLINK_MADDR_CMD__ADDR = BLINK_MCMD__ADDR;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_BLINK_MADDR_CMD__FLAG = BLINK_MCMD__FLAG;

	/**
	 * The number of structural features of the '<em>Get Blink MAddr Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_BLINK_MADDR_CMD_FEATURE_COUNT = BLINK_MCMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.commands.impl.GetBlinkMFirmwareVersionCmdImpl <em>Get Blink MFirmware Version Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.commands.impl.GetBlinkMFirmwareVersionCmdImpl
	 * @see net.sf.smbt.commands.impl.CommandsPackageImpl#getGetBlinkMFirmwareVersionCmd()
	 * @generated
	 */
	int GET_BLINK_MFIRMWARE_VERSION_CMD = 16;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_BLINK_MFIRMWARE_VERSION_CMD__PRIORITY = BLINK_MCMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_BLINK_MFIRMWARE_VERSION_CMD__CMD_BYTE = BLINK_MCMD__CMD_BYTE;

	/**
	 * The feature id for the '<em><b>Cmd Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_BLINK_MFIRMWARE_VERSION_CMD__CMD_CHAR = BLINK_MCMD__CMD_CHAR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_BLINK_MFIRMWARE_VERSION_CMD__ARGUMENTS = BLINK_MCMD__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Ret Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_BLINK_MFIRMWARE_VERSION_CMD__RET_VALUES = BLINK_MCMD__RET_VALUES;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_BLINK_MFIRMWARE_VERSION_CMD__ADDR = BLINK_MCMD__ADDR;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_BLINK_MFIRMWARE_VERSION_CMD__FLAG = BLINK_MCMD__FLAG;

	/**
	 * The number of structural features of the '<em>Get Blink MFirmware Version Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_BLINK_MFIRMWARE_VERSION_CMD_FEATURE_COUNT = BLINK_MCMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.commands.impl.SetStartupParametersCmdImpl <em>Set Startup Parameters Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.commands.impl.SetStartupParametersCmdImpl
	 * @see net.sf.smbt.commands.impl.CommandsPackageImpl#getSetStartupParametersCmd()
	 * @generated
	 */
	int SET_STARTUP_PARAMETERS_CMD = 17;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_STARTUP_PARAMETERS_CMD__PRIORITY = BLINK_MCMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Cmd Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_STARTUP_PARAMETERS_CMD__CMD_BYTE = BLINK_MCMD__CMD_BYTE;

	/**
	 * The feature id for the '<em><b>Cmd Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_STARTUP_PARAMETERS_CMD__CMD_CHAR = BLINK_MCMD__CMD_CHAR;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_STARTUP_PARAMETERS_CMD__ARGUMENTS = BLINK_MCMD__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Ret Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_STARTUP_PARAMETERS_CMD__RET_VALUES = BLINK_MCMD__RET_VALUES;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_STARTUP_PARAMETERS_CMD__ADDR = BLINK_MCMD__ADDR;

	/**
	 * The feature id for the '<em><b>Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_STARTUP_PARAMETERS_CMD__FLAG = BLINK_MCMD__FLAG;

	/**
	 * The number of structural features of the '<em>Set Startup Parameters Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_STARTUP_PARAMETERS_CMD_FEATURE_COUNT = BLINK_MCMD_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link net.sf.smbt.commands.FLAG <em>FLAG</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.commands.FLAG
	 * @see net.sf.smbt.commands.impl.CommandsPackageImpl#getFLAG()
	 * @generated
	 */
	int FLAG = 18;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.commands.BlinkMCmd <em>Blink MCmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blink MCmd</em>'.
	 * @see net.sf.smbt.commands.BlinkMCmd
	 * @generated
	 */
	EClass getBlinkMCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.commands.BlinkMCmd#getCmdByte <em>Cmd Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cmd Byte</em>'.
	 * @see net.sf.smbt.commands.BlinkMCmd#getCmdByte()
	 * @see #getBlinkMCmd()
	 * @generated
	 */
	EAttribute getBlinkMCmd_CmdByte();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.commands.BlinkMCmd#getCmdChar <em>Cmd Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cmd Char</em>'.
	 * @see net.sf.smbt.commands.BlinkMCmd#getCmdChar()
	 * @see #getBlinkMCmd()
	 * @generated
	 */
	EAttribute getBlinkMCmd_CmdChar();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.commands.BlinkMCmd#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arguments</em>'.
	 * @see net.sf.smbt.commands.BlinkMCmd#getArguments()
	 * @see #getBlinkMCmd()
	 * @generated
	 */
	EAttribute getBlinkMCmd_Arguments();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.commands.BlinkMCmd#getRetValues <em>Ret Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ret Values</em>'.
	 * @see net.sf.smbt.commands.BlinkMCmd#getRetValues()
	 * @see #getBlinkMCmd()
	 * @generated
	 */
	EAttribute getBlinkMCmd_RetValues();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.commands.BlinkMCmd#getAddr <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addr</em>'.
	 * @see net.sf.smbt.commands.BlinkMCmd#getAddr()
	 * @see #getBlinkMCmd()
	 * @generated
	 */
	EAttribute getBlinkMCmd_Addr();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.commands.BlinkMCmd#getFlag <em>Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flag</em>'.
	 * @see net.sf.smbt.commands.BlinkMCmd#getFlag()
	 * @see #getBlinkMCmd()
	 * @generated
	 */
	EAttribute getBlinkMCmd_Flag();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.commands.GoToRGBColorCmd <em>Go To RGB Color Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Go To RGB Color Cmd</em>'.
	 * @see net.sf.smbt.commands.GoToRGBColorCmd
	 * @generated
	 */
	EClass getGoToRGBColorCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.commands.FadeToRGBColorCmd <em>Fade To RGB Color Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fade To RGB Color Cmd</em>'.
	 * @see net.sf.smbt.commands.FadeToRGBColorCmd
	 * @generated
	 */
	EClass getFadeToRGBColorCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.commands.FadeToHSBColorCmd <em>Fade To HSB Color Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fade To HSB Color Cmd</em>'.
	 * @see net.sf.smbt.commands.FadeToHSBColorCmd
	 * @generated
	 */
	EClass getFadeToHSBColorCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.commands.FadeToRandomRGBColorCmd <em>Fade To Random RGB Color Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fade To Random RGB Color Cmd</em>'.
	 * @see net.sf.smbt.commands.FadeToRandomRGBColorCmd
	 * @generated
	 */
	EClass getFadeToRandomRGBColorCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.commands.FadeToRandomHSBColorCmd <em>Fade To Random HSB Color Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fade To Random HSB Color Cmd</em>'.
	 * @see net.sf.smbt.commands.FadeToRandomHSBColorCmd
	 * @generated
	 */
	EClass getFadeToRandomHSBColorCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.commands.PlayLightScriptCmd <em>Play Light Script Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Play Light Script Cmd</em>'.
	 * @see net.sf.smbt.commands.PlayLightScriptCmd
	 * @generated
	 */
	EClass getPlayLightScriptCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.commands.SetFadeSpeedCmd <em>Set Fade Speed Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Fade Speed Cmd</em>'.
	 * @see net.sf.smbt.commands.SetFadeSpeedCmd
	 * @generated
	 */
	EClass getSetFadeSpeedCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.commands.StopScriptCmd <em>Stop Script Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Script Cmd</em>'.
	 * @see net.sf.smbt.commands.StopScriptCmd
	 * @generated
	 */
	EClass getStopScriptCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.commands.SetTimeAdjustCmd <em>Set Time Adjust Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Time Adjust Cmd</em>'.
	 * @see net.sf.smbt.commands.SetTimeAdjustCmd
	 * @generated
	 */
	EClass getSetTimeAdjustCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.commands.GetCurrentRGBColorCmd <em>Get Current RGB Color Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Current RGB Color Cmd</em>'.
	 * @see net.sf.smbt.commands.GetCurrentRGBColorCmd
	 * @generated
	 */
	EClass getGetCurrentRGBColorCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.commands.WriteScriptLineCmd <em>Write Script Line Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Write Script Line Cmd</em>'.
	 * @see net.sf.smbt.commands.WriteScriptLineCmd
	 * @generated
	 */
	EClass getWriteScriptLineCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.commands.ReadScriptLineCmd <em>Read Script Line Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Script Line Cmd</em>'.
	 * @see net.sf.smbt.commands.ReadScriptLineCmd
	 * @generated
	 */
	EClass getReadScriptLineCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.commands.SetScriptLengthAndRepeatCmd <em>Set Script Length And Repeat Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Script Length And Repeat Cmd</em>'.
	 * @see net.sf.smbt.commands.SetScriptLengthAndRepeatCmd
	 * @generated
	 */
	EClass getSetScriptLengthAndRepeatCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.commands.SetBlinkMAddrCmd <em>Set Blink MAddr Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Blink MAddr Cmd</em>'.
	 * @see net.sf.smbt.commands.SetBlinkMAddrCmd
	 * @generated
	 */
	EClass getSetBlinkMAddrCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.commands.GetBlinkMAddrCmd <em>Get Blink MAddr Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Blink MAddr Cmd</em>'.
	 * @see net.sf.smbt.commands.GetBlinkMAddrCmd
	 * @generated
	 */
	EClass getGetBlinkMAddrCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.commands.GetBlinkMFirmwareVersionCmd <em>Get Blink MFirmware Version Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Blink MFirmware Version Cmd</em>'.
	 * @see net.sf.smbt.commands.GetBlinkMFirmwareVersionCmd
	 * @generated
	 */
	EClass getGetBlinkMFirmwareVersionCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.commands.SetStartupParametersCmd <em>Set Startup Parameters Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Startup Parameters Cmd</em>'.
	 * @see net.sf.smbt.commands.SetStartupParametersCmd
	 * @generated
	 */
	EClass getSetStartupParametersCmd();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.commands.FLAG <em>FLAG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>FLAG</em>'.
	 * @see net.sf.smbt.commands.FLAG
	 * @generated
	 */
	EEnum getFLAG();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommandsFactory getCommandsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.smbt.commands.impl.BlinkMCmdImpl <em>Blink MCmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.commands.impl.BlinkMCmdImpl
		 * @see net.sf.smbt.commands.impl.CommandsPackageImpl#getBlinkMCmd()
		 * @generated
		 */
		EClass BLINK_MCMD = eINSTANCE.getBlinkMCmd();

		/**
		 * The meta object literal for the '<em><b>Cmd Byte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLINK_MCMD__CMD_BYTE = eINSTANCE.getBlinkMCmd_CmdByte();

		/**
		 * The meta object literal for the '<em><b>Cmd Char</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLINK_MCMD__CMD_CHAR = eINSTANCE.getBlinkMCmd_CmdChar();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLINK_MCMD__ARGUMENTS = eINSTANCE.getBlinkMCmd_Arguments();

		/**
		 * The meta object literal for the '<em><b>Ret Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLINK_MCMD__RET_VALUES = eINSTANCE.getBlinkMCmd_RetValues();

		/**
		 * The meta object literal for the '<em><b>Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLINK_MCMD__ADDR = eINSTANCE.getBlinkMCmd_Addr();

		/**
		 * The meta object literal for the '<em><b>Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLINK_MCMD__FLAG = eINSTANCE.getBlinkMCmd_Flag();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.commands.impl.GoToRGBColorCmdImpl <em>Go To RGB Color Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.commands.impl.GoToRGBColorCmdImpl
		 * @see net.sf.smbt.commands.impl.CommandsPackageImpl#getGoToRGBColorCmd()
		 * @generated
		 */
		EClass GO_TO_RGB_COLOR_CMD = eINSTANCE.getGoToRGBColorCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.commands.impl.FadeToRGBColorCmdImpl <em>Fade To RGB Color Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.commands.impl.FadeToRGBColorCmdImpl
		 * @see net.sf.smbt.commands.impl.CommandsPackageImpl#getFadeToRGBColorCmd()
		 * @generated
		 */
		EClass FADE_TO_RGB_COLOR_CMD = eINSTANCE.getFadeToRGBColorCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.commands.impl.FadeToHSBColorCmdImpl <em>Fade To HSB Color Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.commands.impl.FadeToHSBColorCmdImpl
		 * @see net.sf.smbt.commands.impl.CommandsPackageImpl#getFadeToHSBColorCmd()
		 * @generated
		 */
		EClass FADE_TO_HSB_COLOR_CMD = eINSTANCE.getFadeToHSBColorCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.commands.impl.FadeToRandomRGBColorCmdImpl <em>Fade To Random RGB Color Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.commands.impl.FadeToRandomRGBColorCmdImpl
		 * @see net.sf.smbt.commands.impl.CommandsPackageImpl#getFadeToRandomRGBColorCmd()
		 * @generated
		 */
		EClass FADE_TO_RANDOM_RGB_COLOR_CMD = eINSTANCE.getFadeToRandomRGBColorCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.commands.impl.FadeToRandomHSBColorCmdImpl <em>Fade To Random HSB Color Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.commands.impl.FadeToRandomHSBColorCmdImpl
		 * @see net.sf.smbt.commands.impl.CommandsPackageImpl#getFadeToRandomHSBColorCmd()
		 * @generated
		 */
		EClass FADE_TO_RANDOM_HSB_COLOR_CMD = eINSTANCE.getFadeToRandomHSBColorCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.commands.impl.PlayLightScriptCmdImpl <em>Play Light Script Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.commands.impl.PlayLightScriptCmdImpl
		 * @see net.sf.smbt.commands.impl.CommandsPackageImpl#getPlayLightScriptCmd()
		 * @generated
		 */
		EClass PLAY_LIGHT_SCRIPT_CMD = eINSTANCE.getPlayLightScriptCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.commands.impl.SetFadeSpeedCmdImpl <em>Set Fade Speed Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.commands.impl.SetFadeSpeedCmdImpl
		 * @see net.sf.smbt.commands.impl.CommandsPackageImpl#getSetFadeSpeedCmd()
		 * @generated
		 */
		EClass SET_FADE_SPEED_CMD = eINSTANCE.getSetFadeSpeedCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.commands.impl.StopScriptCmdImpl <em>Stop Script Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.commands.impl.StopScriptCmdImpl
		 * @see net.sf.smbt.commands.impl.CommandsPackageImpl#getStopScriptCmd()
		 * @generated
		 */
		EClass STOP_SCRIPT_CMD = eINSTANCE.getStopScriptCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.commands.impl.SetTimeAdjustCmdImpl <em>Set Time Adjust Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.commands.impl.SetTimeAdjustCmdImpl
		 * @see net.sf.smbt.commands.impl.CommandsPackageImpl#getSetTimeAdjustCmd()
		 * @generated
		 */
		EClass SET_TIME_ADJUST_CMD = eINSTANCE.getSetTimeAdjustCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.commands.impl.GetCurrentRGBColorCmdImpl <em>Get Current RGB Color Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.commands.impl.GetCurrentRGBColorCmdImpl
		 * @see net.sf.smbt.commands.impl.CommandsPackageImpl#getGetCurrentRGBColorCmd()
		 * @generated
		 */
		EClass GET_CURRENT_RGB_COLOR_CMD = eINSTANCE.getGetCurrentRGBColorCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.commands.impl.WriteScriptLineCmdImpl <em>Write Script Line Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.commands.impl.WriteScriptLineCmdImpl
		 * @see net.sf.smbt.commands.impl.CommandsPackageImpl#getWriteScriptLineCmd()
		 * @generated
		 */
		EClass WRITE_SCRIPT_LINE_CMD = eINSTANCE.getWriteScriptLineCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.commands.impl.ReadScriptLineCmdImpl <em>Read Script Line Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.commands.impl.ReadScriptLineCmdImpl
		 * @see net.sf.smbt.commands.impl.CommandsPackageImpl#getReadScriptLineCmd()
		 * @generated
		 */
		EClass READ_SCRIPT_LINE_CMD = eINSTANCE.getReadScriptLineCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.commands.impl.SetScriptLengthAndRepeatCmdImpl <em>Set Script Length And Repeat Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.commands.impl.SetScriptLengthAndRepeatCmdImpl
		 * @see net.sf.smbt.commands.impl.CommandsPackageImpl#getSetScriptLengthAndRepeatCmd()
		 * @generated
		 */
		EClass SET_SCRIPT_LENGTH_AND_REPEAT_CMD = eINSTANCE.getSetScriptLengthAndRepeatCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.commands.impl.SetBlinkMAddrCmdImpl <em>Set Blink MAddr Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.commands.impl.SetBlinkMAddrCmdImpl
		 * @see net.sf.smbt.commands.impl.CommandsPackageImpl#getSetBlinkMAddrCmd()
		 * @generated
		 */
		EClass SET_BLINK_MADDR_CMD = eINSTANCE.getSetBlinkMAddrCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.commands.impl.GetBlinkMAddrCmdImpl <em>Get Blink MAddr Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.commands.impl.GetBlinkMAddrCmdImpl
		 * @see net.sf.smbt.commands.impl.CommandsPackageImpl#getGetBlinkMAddrCmd()
		 * @generated
		 */
		EClass GET_BLINK_MADDR_CMD = eINSTANCE.getGetBlinkMAddrCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.commands.impl.GetBlinkMFirmwareVersionCmdImpl <em>Get Blink MFirmware Version Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.commands.impl.GetBlinkMFirmwareVersionCmdImpl
		 * @see net.sf.smbt.commands.impl.CommandsPackageImpl#getGetBlinkMFirmwareVersionCmd()
		 * @generated
		 */
		EClass GET_BLINK_MFIRMWARE_VERSION_CMD = eINSTANCE.getGetBlinkMFirmwareVersionCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.commands.impl.SetStartupParametersCmdImpl <em>Set Startup Parameters Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.commands.impl.SetStartupParametersCmdImpl
		 * @see net.sf.smbt.commands.impl.CommandsPackageImpl#getSetStartupParametersCmd()
		 * @generated
		 */
		EClass SET_STARTUP_PARAMETERS_CMD = eINSTANCE.getSetStartupParametersCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.commands.FLAG <em>FLAG</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.commands.FLAG
		 * @see net.sf.smbt.commands.impl.CommandsPackageImpl#getFLAG()
		 * @generated
		 */
		EEnum FLAG = eINSTANCE.getFLAG();

	}

} //CommandsPackage
