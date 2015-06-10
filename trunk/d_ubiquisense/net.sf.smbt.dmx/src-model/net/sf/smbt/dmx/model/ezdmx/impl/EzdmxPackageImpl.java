/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.model.ezdmx.impl;

import net.sf.smbt.dmx.model.ezdmx.EzdmxFactory;
import net.sf.smbt.dmx.model.ezdmx.EzdmxPackage;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXChangeOfStatePacketCmd;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXCmd;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXFade;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeFull;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeWithStrobe;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXFirmware;
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
import net.sf.smbt.dmx.model.ezdmx.OpenDMXStates;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXWidget;
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
public class EzdmxPackageImpl extends EPackageImpl implements EzdmxPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openDMXCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openDMXReprogramFirmwareRequestCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openDMXProgramFlashPageRequestCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openDMXProgramFlashPageReplyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openDMXGetWidgetParamRequestCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openDMXGetWidgetParamsReplyCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openDMXSetWidgetParamsRequestCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openDMXReceivedPacketsCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openDMXOutputOnlySendDMXPacketsRequestCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openDMXSendRDMPacketCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openDMXReceiveDMXCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openDMXChangeOfStatePacketCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openDMXGetWidgetSerialNumberRequestCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openDMXGetWidgetSerialNumberReplyCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openDMXSendRDMDiscoveryRequestCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openDMXWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openDMXFadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openDMXFadeWithStrobeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openDMXFadeFullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum openDMXFirmwareEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum openDMXStatesEEnum = null;

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
	 * @see net.sf.smbt.dmx.model.ezdmx.EzdmxPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EzdmxPackageImpl() {
		super(eNS_URI, EzdmxFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EzdmxPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EzdmxPackage init() {
		if (isInited) return (EzdmxPackage)EPackage.Registry.INSTANCE.getEPackage(EzdmxPackage.eNS_URI);

		// Obtain or create and register package
		EzdmxPackageImpl theEzdmxPackage = (EzdmxPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EzdmxPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EzdmxPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEzdmxPackage.createPackageContents();

		// Initialize created meta-data
		theEzdmxPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEzdmxPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EzdmxPackage.eNS_URI, theEzdmxPackage);
		return theEzdmxPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenDMXCmd() {
		return openDMXCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenDMXCmd_Start() {
		return (EAttribute)openDMXCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenDMXCmd_Label() {
		return (EAttribute)openDMXCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenDMXCmd_Data() {
		return (EAttribute)openDMXCmdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenDMXCmd_End() {
		return (EAttribute)openDMXCmdEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenDMXReprogramFirmwareRequestCmd() {
		return openDMXReprogramFirmwareRequestCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenDMXProgramFlashPageRequestCmd() {
		return openDMXProgramFlashPageRequestCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenDMXProgramFlashPageReply() {
		return openDMXProgramFlashPageReplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenDMXGetWidgetParamRequestCmd() {
		return openDMXGetWidgetParamRequestCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenDMXGetWidgetParamsReplyCmd() {
		return openDMXGetWidgetParamsReplyCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenDMXSetWidgetParamsRequestCmd() {
		return openDMXSetWidgetParamsRequestCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenDMXReceivedPacketsCmd() {
		return openDMXReceivedPacketsCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenDMXOutputOnlySendDMXPacketsRequestCmd() {
		return openDMXOutputOnlySendDMXPacketsRequestCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenDMXSendRDMPacketCmd() {
		return openDMXSendRDMPacketCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenDMXReceiveDMXCmd() {
		return openDMXReceiveDMXCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenDMXChangeOfStatePacketCmd() {
		return openDMXChangeOfStatePacketCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenDMXGetWidgetSerialNumberRequestCmd() {
		return openDMXGetWidgetSerialNumberRequestCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenDMXGetWidgetSerialNumberReplyCmd() {
		return openDMXGetWidgetSerialNumberReplyCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenDMXSendRDMDiscoveryRequestCmd() {
		return openDMXSendRDMDiscoveryRequestCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenDMXWidget() {
		return openDMXWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenDMXWidget_Uid() {
		return (EAttribute)openDMXWidgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenDMXFade() {
		return openDMXFadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenDMXFade_Channel() {
		return (EAttribute)openDMXFadeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenDMXFade_R() {
		return (EAttribute)openDMXFadeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenDMXFade_G() {
		return (EAttribute)openDMXFadeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenDMXFade_B() {
		return (EAttribute)openDMXFadeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenDMXFadeWithStrobe() {
		return openDMXFadeWithStrobeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenDMXFadeWithStrobe_Channel() {
		return (EAttribute)openDMXFadeWithStrobeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenDMXFadeWithStrobe_R() {
		return (EAttribute)openDMXFadeWithStrobeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenDMXFadeWithStrobe_B() {
		return (EAttribute)openDMXFadeWithStrobeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenDMXFadeWithStrobe_G() {
		return (EAttribute)openDMXFadeWithStrobeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenDMXFadeWithStrobe_Strobe() {
		return (EAttribute)openDMXFadeWithStrobeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenDMXFadeFull() {
		return openDMXFadeFullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenDMXFadeFull_R() {
		return (EAttribute)openDMXFadeFullEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenDMXFadeFull_G() {
		return (EAttribute)openDMXFadeFullEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenDMXFadeFull_B() {
		return (EAttribute)openDMXFadeFullEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenDMXFadeFull_FullColor() {
		return (EAttribute)openDMXFadeFullEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenDMXFadeFull_Strobe() {
		return (EAttribute)openDMXFadeFullEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenDMXFadeFull_Modi() {
		return (EAttribute)openDMXFadeFullEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpenDMXFadeFull_Ext() {
		return (EAttribute)openDMXFadeFullEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOpenDMXFirmware() {
		return openDMXFirmwareEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOpenDMXStates() {
		return openDMXStatesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzdmxFactory getEzdmxFactory() {
		return (EzdmxFactory)getEFactoryInstance();
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
		openDMXCmdEClass = createEClass(OPEN_DMX_CMD);
		createEAttribute(openDMXCmdEClass, OPEN_DMX_CMD__START);
		createEAttribute(openDMXCmdEClass, OPEN_DMX_CMD__LABEL);
		createEAttribute(openDMXCmdEClass, OPEN_DMX_CMD__DATA);
		createEAttribute(openDMXCmdEClass, OPEN_DMX_CMD__END);

		openDMXReprogramFirmwareRequestCmdEClass = createEClass(OPEN_DMX_REPROGRAM_FIRMWARE_REQUEST_CMD);

		openDMXProgramFlashPageRequestCmdEClass = createEClass(OPEN_DMX_PROGRAM_FLASH_PAGE_REQUEST_CMD);

		openDMXProgramFlashPageReplyEClass = createEClass(OPEN_DMX_PROGRAM_FLASH_PAGE_REPLY);

		openDMXGetWidgetParamRequestCmdEClass = createEClass(OPEN_DMX_GET_WIDGET_PARAM_REQUEST_CMD);

		openDMXGetWidgetParamsReplyCmdEClass = createEClass(OPEN_DMX_GET_WIDGET_PARAMS_REPLY_CMD);

		openDMXSetWidgetParamsRequestCmdEClass = createEClass(OPEN_DMX_SET_WIDGET_PARAMS_REQUEST_CMD);

		openDMXReceivedPacketsCmdEClass = createEClass(OPEN_DMX_RECEIVED_PACKETS_CMD);

		openDMXOutputOnlySendDMXPacketsRequestCmdEClass = createEClass(OPEN_DMX_OUTPUT_ONLY_SEND_DMX_PACKETS_REQUEST_CMD);

		openDMXSendRDMPacketCmdEClass = createEClass(OPEN_DMX_SEND_RDM_PACKET_CMD);

		openDMXReceiveDMXCmdEClass = createEClass(OPEN_DMX_RECEIVE_DMX_CMD);

		openDMXChangeOfStatePacketCmdEClass = createEClass(OPEN_DMX_CHANGE_OF_STATE_PACKET_CMD);

		openDMXGetWidgetSerialNumberRequestCmdEClass = createEClass(OPEN_DMX_GET_WIDGET_SERIAL_NUMBER_REQUEST_CMD);

		openDMXGetWidgetSerialNumberReplyCmdEClass = createEClass(OPEN_DMX_GET_WIDGET_SERIAL_NUMBER_REPLY_CMD);

		openDMXSendRDMDiscoveryRequestCmdEClass = createEClass(OPEN_DMX_SEND_RDM_DISCOVERY_REQUEST_CMD);

		openDMXWidgetEClass = createEClass(OPEN_DMX_WIDGET);
		createEAttribute(openDMXWidgetEClass, OPEN_DMX_WIDGET__UID);

		openDMXFadeEClass = createEClass(OPEN_DMX_FADE);
		createEAttribute(openDMXFadeEClass, OPEN_DMX_FADE__CHANNEL);
		createEAttribute(openDMXFadeEClass, OPEN_DMX_FADE__R);
		createEAttribute(openDMXFadeEClass, OPEN_DMX_FADE__G);
		createEAttribute(openDMXFadeEClass, OPEN_DMX_FADE__B);

		openDMXFadeWithStrobeEClass = createEClass(OPEN_DMX_FADE_WITH_STROBE);
		createEAttribute(openDMXFadeWithStrobeEClass, OPEN_DMX_FADE_WITH_STROBE__CHANNEL);
		createEAttribute(openDMXFadeWithStrobeEClass, OPEN_DMX_FADE_WITH_STROBE__R);
		createEAttribute(openDMXFadeWithStrobeEClass, OPEN_DMX_FADE_WITH_STROBE__B);
		createEAttribute(openDMXFadeWithStrobeEClass, OPEN_DMX_FADE_WITH_STROBE__G);
		createEAttribute(openDMXFadeWithStrobeEClass, OPEN_DMX_FADE_WITH_STROBE__STROBE);

		openDMXFadeFullEClass = createEClass(OPEN_DMX_FADE_FULL);
		createEAttribute(openDMXFadeFullEClass, OPEN_DMX_FADE_FULL__R);
		createEAttribute(openDMXFadeFullEClass, OPEN_DMX_FADE_FULL__G);
		createEAttribute(openDMXFadeFullEClass, OPEN_DMX_FADE_FULL__B);
		createEAttribute(openDMXFadeFullEClass, OPEN_DMX_FADE_FULL__FULL_COLOR);
		createEAttribute(openDMXFadeFullEClass, OPEN_DMX_FADE_FULL__STROBE);
		createEAttribute(openDMXFadeFullEClass, OPEN_DMX_FADE_FULL__MODI);
		createEAttribute(openDMXFadeFullEClass, OPEN_DMX_FADE_FULL__EXT);

		// Create enums
		openDMXFirmwareEEnum = createEEnum(OPEN_DMX_FIRMWARE);
		openDMXStatesEEnum = createEEnum(OPEN_DMX_STATES);
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
		openDMXCmdEClass.getESuperTypes().add(theCmdPackage.getCmd());
		openDMXReprogramFirmwareRequestCmdEClass.getESuperTypes().add(this.getOpenDMXCmd());
		openDMXProgramFlashPageRequestCmdEClass.getESuperTypes().add(this.getOpenDMXCmd());
		openDMXProgramFlashPageReplyEClass.getESuperTypes().add(this.getOpenDMXCmd());
		openDMXGetWidgetParamRequestCmdEClass.getESuperTypes().add(this.getOpenDMXCmd());
		openDMXGetWidgetParamsReplyCmdEClass.getESuperTypes().add(this.getOpenDMXCmd());
		openDMXSetWidgetParamsRequestCmdEClass.getESuperTypes().add(this.getOpenDMXCmd());
		openDMXReceivedPacketsCmdEClass.getESuperTypes().add(this.getOpenDMXCmd());
		openDMXOutputOnlySendDMXPacketsRequestCmdEClass.getESuperTypes().add(this.getOpenDMXCmd());
		openDMXSendRDMPacketCmdEClass.getESuperTypes().add(this.getOpenDMXCmd());
		openDMXReceiveDMXCmdEClass.getESuperTypes().add(this.getOpenDMXCmd());
		openDMXChangeOfStatePacketCmdEClass.getESuperTypes().add(this.getOpenDMXCmd());
		openDMXGetWidgetSerialNumberRequestCmdEClass.getESuperTypes().add(this.getOpenDMXCmd());
		openDMXGetWidgetSerialNumberReplyCmdEClass.getESuperTypes().add(this.getOpenDMXCmd());
		openDMXSendRDMDiscoveryRequestCmdEClass.getESuperTypes().add(this.getOpenDMXCmd());
		openDMXFadeEClass.getESuperTypes().add(this.getOpenDMXCmd());
		openDMXFadeWithStrobeEClass.getESuperTypes().add(this.getOpenDMXCmd());
		openDMXFadeFullEClass.getESuperTypes().add(this.getOpenDMXCmd());

		// Initialize classes and features; add operations and parameters
		initEClass(openDMXCmdEClass, OpenDMXCmd.class, "OpenDMXCmd", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpenDMXCmd_Start(), ecorePackage.getEByte(), "start", null, 0, 1, OpenDMXCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenDMXCmd_Label(), ecorePackage.getEByte(), "label", null, 0, 1, OpenDMXCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenDMXCmd_Data(), ecorePackage.getEByteArray(), "data", null, 0, 1, OpenDMXCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenDMXCmd_End(), ecorePackage.getEByte(), "end", null, 0, 1, OpenDMXCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(openDMXReprogramFirmwareRequestCmdEClass, OpenDMXReprogramFirmwareRequestCmd.class, "OpenDMXReprogramFirmwareRequestCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(openDMXProgramFlashPageRequestCmdEClass, OpenDMXProgramFlashPageRequestCmd.class, "OpenDMXProgramFlashPageRequestCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(openDMXProgramFlashPageReplyEClass, OpenDMXProgramFlashPageReply.class, "OpenDMXProgramFlashPageReply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(openDMXGetWidgetParamRequestCmdEClass, OpenDMXGetWidgetParamRequestCmd.class, "OpenDMXGetWidgetParamRequestCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(openDMXGetWidgetParamsReplyCmdEClass, OpenDMXGetWidgetParamsReplyCmd.class, "OpenDMXGetWidgetParamsReplyCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(openDMXSetWidgetParamsRequestCmdEClass, OpenDMXSetWidgetParamsRequestCmd.class, "OpenDMXSetWidgetParamsRequestCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(openDMXReceivedPacketsCmdEClass, OpenDMXReceivedPacketsCmd.class, "OpenDMXReceivedPacketsCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(openDMXOutputOnlySendDMXPacketsRequestCmdEClass, OpenDMXOutputOnlySendDMXPacketsRequestCmd.class, "OpenDMXOutputOnlySendDMXPacketsRequestCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(openDMXSendRDMPacketCmdEClass, OpenDMXSendRDMPacketCmd.class, "OpenDMXSendRDMPacketCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(openDMXReceiveDMXCmdEClass, OpenDMXReceiveDMXCmd.class, "OpenDMXReceiveDMXCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(openDMXChangeOfStatePacketCmdEClass, OpenDMXChangeOfStatePacketCmd.class, "OpenDMXChangeOfStatePacketCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(openDMXGetWidgetSerialNumberRequestCmdEClass, OpenDMXGetWidgetSerialNumberRequestCmd.class, "OpenDMXGetWidgetSerialNumberRequestCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(openDMXGetWidgetSerialNumberReplyCmdEClass, OpenDMXGetWidgetSerialNumberReplyCmd.class, "OpenDMXGetWidgetSerialNumberReplyCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(openDMXSendRDMDiscoveryRequestCmdEClass, OpenDMXSendRDMDiscoveryRequestCmd.class, "OpenDMXSendRDMDiscoveryRequestCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(openDMXWidgetEClass, OpenDMXWidget.class, "OpenDMXWidget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpenDMXWidget_Uid(), ecorePackage.getEByteArray(), "uid", null, 0, 1, OpenDMXWidget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(openDMXFadeEClass, OpenDMXFade.class, "OpenDMXFade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpenDMXFade_Channel(), ecorePackage.getEInt(), "channel", null, 0, 1, OpenDMXFade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenDMXFade_R(), ecorePackage.getEInt(), "r", null, 0, 1, OpenDMXFade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenDMXFade_G(), ecorePackage.getEInt(), "g", null, 0, 1, OpenDMXFade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenDMXFade_B(), ecorePackage.getEInt(), "b", null, 0, 1, OpenDMXFade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(openDMXFadeWithStrobeEClass, OpenDMXFadeWithStrobe.class, "OpenDMXFadeWithStrobe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpenDMXFadeWithStrobe_Channel(), ecorePackage.getEInt(), "channel", null, 0, 1, OpenDMXFadeWithStrobe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenDMXFadeWithStrobe_R(), ecorePackage.getEInt(), "r", null, 0, 1, OpenDMXFadeWithStrobe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenDMXFadeWithStrobe_B(), ecorePackage.getEInt(), "b", null, 0, 1, OpenDMXFadeWithStrobe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenDMXFadeWithStrobe_G(), ecorePackage.getEInt(), "g", null, 0, 1, OpenDMXFadeWithStrobe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenDMXFadeWithStrobe_Strobe(), ecorePackage.getEInt(), "strobe", null, 0, 1, OpenDMXFadeWithStrobe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(openDMXFadeFullEClass, OpenDMXFadeFull.class, "OpenDMXFadeFull", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpenDMXFadeFull_R(), ecorePackage.getEInt(), "r", null, 0, 1, OpenDMXFadeFull.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenDMXFadeFull_G(), ecorePackage.getEInt(), "g", null, 0, 1, OpenDMXFadeFull.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenDMXFadeFull_B(), ecorePackage.getEInt(), "b", null, 0, 1, OpenDMXFadeFull.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenDMXFadeFull_FullColor(), ecorePackage.getEInt(), "fullColor", null, 0, 1, OpenDMXFadeFull.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenDMXFadeFull_Strobe(), ecorePackage.getEInt(), "strobe", null, 0, 1, OpenDMXFadeFull.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenDMXFadeFull_Modi(), ecorePackage.getEInt(), "modi", null, 0, 1, OpenDMXFadeFull.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpenDMXFadeFull_Ext(), ecorePackage.getEInt(), "ext", null, 0, 1, OpenDMXFadeFull.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(openDMXFirmwareEEnum, OpenDMXFirmware.class, "OpenDMXFirmware");
		addEEnumLiteral(openDMXFirmwareEEnum, OpenDMXFirmware.NORMAL);
		addEEnumLiteral(openDMXFirmwareEEnum, OpenDMXFirmware.RDM);
		addEEnumLiteral(openDMXFirmwareEEnum, OpenDMXFirmware.RDM_SNIFFER);

		initEEnum(openDMXStatesEEnum, OpenDMXStates.class, "OpenDMXStates");
		addEEnumLiteral(openDMXStatesEEnum, OpenDMXStates.DISC_MUTE);
		addEEnumLiteral(openDMXStatesEEnum, OpenDMXStates.DISC_UN_MUTE);
		addEEnumLiteral(openDMXStatesEEnum, OpenDMXStates.ACK_TIMER);
		addEEnumLiteral(openDMXStatesEEnum, OpenDMXStates.NONE);

		// Create resource
		createResource(eNS_URI);
	}

} //EzdmxPackageImpl
