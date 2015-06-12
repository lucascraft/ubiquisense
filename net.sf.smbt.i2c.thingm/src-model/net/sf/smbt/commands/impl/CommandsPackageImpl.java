/**
 * <copyright>
 * </copyright>
 *
 * $Id: CommandsPackageImpl.java,v 1.2 2009/01/20 07:06:03 lucascraft Exp $
 */
package net.sf.smbt.commands.impl;

import net.sf.smbt.commands.BlinkMCmd;
import net.sf.smbt.commands.CommandsFactory;
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
import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommandsPackageImpl extends EPackageImpl implements CommandsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blinkMCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goToRGBColorCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fadeToRGBColorCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fadeToHSBColorCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fadeToRandomRGBColorCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fadeToRandomHSBColorCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playLightScriptCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setFadeSpeedCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopScriptCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setTimeAdjustCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getCurrentRGBColorCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeScriptLineCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readScriptLineCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setScriptLengthAndRepeatCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setBlinkMAddrCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getBlinkMAddrCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getBlinkMFirmwareVersionCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setStartupParametersCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum flagEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.sf.smbt.commands.CommandsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommandsPackageImpl() {
		super(eNS_URI, CommandsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CommandsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommandsPackage init() {
		if (isInited) return (CommandsPackage)EPackage.Registry.INSTANCE.getEPackage(CommandsPackage.eNS_URI);

		// Obtain or create and register package
		CommandsPackageImpl theCommandsPackage = (CommandsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CommandsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CommandsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCommandsPackage.createPackageContents();

		// Initialize created meta-data
		theCommandsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommandsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommandsPackage.eNS_URI, theCommandsPackage);
		return theCommandsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlinkMCmd() {
		return blinkMCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlinkMCmd_CmdByte() {
		return (EAttribute)blinkMCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlinkMCmd_CmdChar() {
		return (EAttribute)blinkMCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlinkMCmd_Arguments() {
		return (EAttribute)blinkMCmdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlinkMCmd_RetValues() {
		return (EAttribute)blinkMCmdEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlinkMCmd_Addr() {
		return (EAttribute)blinkMCmdEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlinkMCmd_Flag() {
		return (EAttribute)blinkMCmdEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoToRGBColorCmd() {
		return goToRGBColorCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFadeToRGBColorCmd() {
		return fadeToRGBColorCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFadeToHSBColorCmd() {
		return fadeToHSBColorCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFadeToRandomRGBColorCmd() {
		return fadeToRandomRGBColorCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFadeToRandomHSBColorCmd() {
		return fadeToRandomHSBColorCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlayLightScriptCmd() {
		return playLightScriptCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetFadeSpeedCmd() {
		return setFadeSpeedCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStopScriptCmd() {
		return stopScriptCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetTimeAdjustCmd() {
		return setTimeAdjustCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetCurrentRGBColorCmd() {
		return getCurrentRGBColorCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteScriptLineCmd() {
		return writeScriptLineCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadScriptLineCmd() {
		return readScriptLineCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetScriptLengthAndRepeatCmd() {
		return setScriptLengthAndRepeatCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetBlinkMAddrCmd() {
		return setBlinkMAddrCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetBlinkMAddrCmd() {
		return getBlinkMAddrCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetBlinkMFirmwareVersionCmd() {
		return getBlinkMFirmwareVersionCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetStartupParametersCmd() {
		return setStartupParametersCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFLAG() {
		return flagEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandsFactory getCommandsFactory() {
		return (CommandsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		blinkMCmdEClass = createEClass(BLINK_MCMD);
		createEAttribute(blinkMCmdEClass, BLINK_MCMD__CMD_BYTE);
		createEAttribute(blinkMCmdEClass, BLINK_MCMD__CMD_CHAR);
		createEAttribute(blinkMCmdEClass, BLINK_MCMD__ARGUMENTS);
		createEAttribute(blinkMCmdEClass, BLINK_MCMD__RET_VALUES);
		createEAttribute(blinkMCmdEClass, BLINK_MCMD__ADDR);
		createEAttribute(blinkMCmdEClass, BLINK_MCMD__FLAG);

		goToRGBColorCmdEClass = createEClass(GO_TO_RGB_COLOR_CMD);

		fadeToRGBColorCmdEClass = createEClass(FADE_TO_RGB_COLOR_CMD);

		fadeToHSBColorCmdEClass = createEClass(FADE_TO_HSB_COLOR_CMD);

		fadeToRandomRGBColorCmdEClass = createEClass(FADE_TO_RANDOM_RGB_COLOR_CMD);

		fadeToRandomHSBColorCmdEClass = createEClass(FADE_TO_RANDOM_HSB_COLOR_CMD);

		playLightScriptCmdEClass = createEClass(PLAY_LIGHT_SCRIPT_CMD);

		setFadeSpeedCmdEClass = createEClass(SET_FADE_SPEED_CMD);

		stopScriptCmdEClass = createEClass(STOP_SCRIPT_CMD);

		setTimeAdjustCmdEClass = createEClass(SET_TIME_ADJUST_CMD);

		getCurrentRGBColorCmdEClass = createEClass(GET_CURRENT_RGB_COLOR_CMD);

		writeScriptLineCmdEClass = createEClass(WRITE_SCRIPT_LINE_CMD);

		readScriptLineCmdEClass = createEClass(READ_SCRIPT_LINE_CMD);

		setScriptLengthAndRepeatCmdEClass = createEClass(SET_SCRIPT_LENGTH_AND_REPEAT_CMD);

		setBlinkMAddrCmdEClass = createEClass(SET_BLINK_MADDR_CMD);

		getBlinkMAddrCmdEClass = createEClass(GET_BLINK_MADDR_CMD);

		getBlinkMFirmwareVersionCmdEClass = createEClass(GET_BLINK_MFIRMWARE_VERSION_CMD);

		setStartupParametersCmdEClass = createEClass(SET_STARTUP_PARAMETERS_CMD);

		// Create enums
		flagEEnum = createEEnum(FLAG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CmdPackage theCmdPackage = (CmdPackage)EPackage.Registry.INSTANCE.getEPackage(CmdPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		blinkMCmdEClass.getESuperTypes().add(theCmdPackage.getCmd());
		goToRGBColorCmdEClass.getESuperTypes().add(this.getBlinkMCmd());
		fadeToRGBColorCmdEClass.getESuperTypes().add(this.getBlinkMCmd());
		fadeToHSBColorCmdEClass.getESuperTypes().add(this.getBlinkMCmd());
		fadeToRandomRGBColorCmdEClass.getESuperTypes().add(this.getBlinkMCmd());
		fadeToRandomHSBColorCmdEClass.getESuperTypes().add(this.getBlinkMCmd());
		playLightScriptCmdEClass.getESuperTypes().add(this.getBlinkMCmd());
		setFadeSpeedCmdEClass.getESuperTypes().add(this.getBlinkMCmd());
		stopScriptCmdEClass.getESuperTypes().add(this.getBlinkMCmd());
		setTimeAdjustCmdEClass.getESuperTypes().add(this.getBlinkMCmd());
		getCurrentRGBColorCmdEClass.getESuperTypes().add(this.getBlinkMCmd());
		writeScriptLineCmdEClass.getESuperTypes().add(this.getBlinkMCmd());
		readScriptLineCmdEClass.getESuperTypes().add(this.getBlinkMCmd());
		setScriptLengthAndRepeatCmdEClass.getESuperTypes().add(this.getBlinkMCmd());
		setBlinkMAddrCmdEClass.getESuperTypes().add(this.getBlinkMCmd());
		getBlinkMAddrCmdEClass.getESuperTypes().add(this.getBlinkMCmd());
		getBlinkMFirmwareVersionCmdEClass.getESuperTypes().add(this.getBlinkMCmd());
		setStartupParametersCmdEClass.getESuperTypes().add(this.getBlinkMCmd());

		// Initialize classes and features; add operations and parameters
		initEClass(blinkMCmdEClass, BlinkMCmd.class, "BlinkMCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlinkMCmd_CmdByte(), ecorePackage.getEByte(), "cmdByte", null, 0, 1, BlinkMCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlinkMCmd_CmdChar(), ecorePackage.getEByte(), "cmdChar", null, 0, 1, BlinkMCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlinkMCmd_Arguments(), ecorePackage.getEByteArray(), "arguments", null, 0, 1, BlinkMCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlinkMCmd_RetValues(), ecorePackage.getEByteArray(), "retValues", null, 0, 1, BlinkMCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlinkMCmd_Addr(), ecorePackage.getEByte(), "addr", null, 0, 1, BlinkMCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlinkMCmd_Flag(), this.getFLAG(), "flag", null, 0, 1, BlinkMCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goToRGBColorCmdEClass, GoToRGBColorCmd.class, "GoToRGBColorCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fadeToRGBColorCmdEClass, FadeToRGBColorCmd.class, "FadeToRGBColorCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fadeToHSBColorCmdEClass, FadeToHSBColorCmd.class, "FadeToHSBColorCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fadeToRandomRGBColorCmdEClass, FadeToRandomRGBColorCmd.class, "FadeToRandomRGBColorCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fadeToRandomHSBColorCmdEClass, FadeToRandomHSBColorCmd.class, "FadeToRandomHSBColorCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(playLightScriptCmdEClass, PlayLightScriptCmd.class, "PlayLightScriptCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setFadeSpeedCmdEClass, SetFadeSpeedCmd.class, "SetFadeSpeedCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stopScriptCmdEClass, StopScriptCmd.class, "StopScriptCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setTimeAdjustCmdEClass, SetTimeAdjustCmd.class, "SetTimeAdjustCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(getCurrentRGBColorCmdEClass, GetCurrentRGBColorCmd.class, "GetCurrentRGBColorCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(writeScriptLineCmdEClass, WriteScriptLineCmd.class, "WriteScriptLineCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(readScriptLineCmdEClass, ReadScriptLineCmd.class, "ReadScriptLineCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setScriptLengthAndRepeatCmdEClass, SetScriptLengthAndRepeatCmd.class, "SetScriptLengthAndRepeatCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setBlinkMAddrCmdEClass, SetBlinkMAddrCmd.class, "SetBlinkMAddrCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(getBlinkMAddrCmdEClass, GetBlinkMAddrCmd.class, "GetBlinkMAddrCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(getBlinkMFirmwareVersionCmdEClass, GetBlinkMFirmwareVersionCmd.class, "GetBlinkMFirmwareVersionCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(setStartupParametersCmdEClass, SetStartupParametersCmd.class, "SetStartupParametersCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(flagEEnum, net.sf.smbt.commands.FLAG.class, "FLAG");
		addEEnumLiteral(flagEEnum, net.sf.smbt.commands.FLAG.READ);
		addEEnumLiteral(flagEEnum, net.sf.smbt.commands.FLAG.WRITE);
		addEEnumLiteral(flagEEnum, net.sf.smbt.commands.FLAG.READWRITE);
		addEEnumLiteral(flagEEnum, net.sf.smbt.commands.FLAG.NONE);

		// Create resource
		createResource(eNS_URI);
	}

} //CommandsPackageImpl
