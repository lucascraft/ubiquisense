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
public class EzdmxFactoryImpl extends EFactoryImpl implements EzdmxFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EzdmxFactory init() {
		try {
			EzdmxFactory theEzdmxFactory = (EzdmxFactory)EPackage.Registry.INSTANCE.getEFactory("http://ezdmx/1.0"); 
			if (theEzdmxFactory != null) {
				return theEzdmxFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EzdmxFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzdmxFactoryImpl() {
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
			case EzdmxPackage.OPEN_DMX_REPROGRAM_FIRMWARE_REQUEST_CMD: return createOpenDMXReprogramFirmwareRequestCmd();
			case EzdmxPackage.OPEN_DMX_PROGRAM_FLASH_PAGE_REQUEST_CMD: return createOpenDMXProgramFlashPageRequestCmd();
			case EzdmxPackage.OPEN_DMX_PROGRAM_FLASH_PAGE_REPLY: return createOpenDMXProgramFlashPageReply();
			case EzdmxPackage.OPEN_DMX_GET_WIDGET_PARAM_REQUEST_CMD: return createOpenDMXGetWidgetParamRequestCmd();
			case EzdmxPackage.OPEN_DMX_GET_WIDGET_PARAMS_REPLY_CMD: return createOpenDMXGetWidgetParamsReplyCmd();
			case EzdmxPackage.OPEN_DMX_SET_WIDGET_PARAMS_REQUEST_CMD: return createOpenDMXSetWidgetParamsRequestCmd();
			case EzdmxPackage.OPEN_DMX_RECEIVED_PACKETS_CMD: return createOpenDMXReceivedPacketsCmd();
			case EzdmxPackage.OPEN_DMX_OUTPUT_ONLY_SEND_DMX_PACKETS_REQUEST_CMD: return createOpenDMXOutputOnlySendDMXPacketsRequestCmd();
			case EzdmxPackage.OPEN_DMX_SEND_RDM_PACKET_CMD: return createOpenDMXSendRDMPacketCmd();
			case EzdmxPackage.OPEN_DMX_RECEIVE_DMX_CMD: return createOpenDMXReceiveDMXCmd();
			case EzdmxPackage.OPEN_DMX_CHANGE_OF_STATE_PACKET_CMD: return createOpenDMXChangeOfStatePacketCmd();
			case EzdmxPackage.OPEN_DMX_GET_WIDGET_SERIAL_NUMBER_REQUEST_CMD: return createOpenDMXGetWidgetSerialNumberRequestCmd();
			case EzdmxPackage.OPEN_DMX_GET_WIDGET_SERIAL_NUMBER_REPLY_CMD: return createOpenDMXGetWidgetSerialNumberReplyCmd();
			case EzdmxPackage.OPEN_DMX_SEND_RDM_DISCOVERY_REQUEST_CMD: return createOpenDMXSendRDMDiscoveryRequestCmd();
			case EzdmxPackage.OPEN_DMX_WIDGET: return createOpenDMXWidget();
			case EzdmxPackage.OPEN_DMX_FADE: return createOpenDMXFade();
			case EzdmxPackage.OPEN_DMX_FADE_WITH_STROBE: return createOpenDMXFadeWithStrobe();
			case EzdmxPackage.OPEN_DMX_FADE_FULL: return createOpenDMXFadeFull();
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
			case EzdmxPackage.OPEN_DMX_FIRMWARE:
				return createOpenDMXFirmwareFromString(eDataType, initialValue);
			case EzdmxPackage.OPEN_DMX_STATES:
				return createOpenDMXStatesFromString(eDataType, initialValue);
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
			case EzdmxPackage.OPEN_DMX_FIRMWARE:
				return convertOpenDMXFirmwareToString(eDataType, instanceValue);
			case EzdmxPackage.OPEN_DMX_STATES:
				return convertOpenDMXStatesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenDMXReprogramFirmwareRequestCmd createOpenDMXReprogramFirmwareRequestCmd() {
		OpenDMXReprogramFirmwareRequestCmdImpl openDMXReprogramFirmwareRequestCmd = new OpenDMXReprogramFirmwareRequestCmdImpl();
		return openDMXReprogramFirmwareRequestCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenDMXProgramFlashPageRequestCmd createOpenDMXProgramFlashPageRequestCmd() {
		OpenDMXProgramFlashPageRequestCmdImpl openDMXProgramFlashPageRequestCmd = new OpenDMXProgramFlashPageRequestCmdImpl();
		return openDMXProgramFlashPageRequestCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenDMXProgramFlashPageReply createOpenDMXProgramFlashPageReply() {
		OpenDMXProgramFlashPageReplyImpl openDMXProgramFlashPageReply = new OpenDMXProgramFlashPageReplyImpl();
		return openDMXProgramFlashPageReply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenDMXGetWidgetParamRequestCmd createOpenDMXGetWidgetParamRequestCmd() {
		OpenDMXGetWidgetParamRequestCmdImpl openDMXGetWidgetParamRequestCmd = new OpenDMXGetWidgetParamRequestCmdImpl();
		return openDMXGetWidgetParamRequestCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenDMXGetWidgetParamsReplyCmd createOpenDMXGetWidgetParamsReplyCmd() {
		OpenDMXGetWidgetParamsReplyCmdImpl openDMXGetWidgetParamsReplyCmd = new OpenDMXGetWidgetParamsReplyCmdImpl();
		return openDMXGetWidgetParamsReplyCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenDMXSetWidgetParamsRequestCmd createOpenDMXSetWidgetParamsRequestCmd() {
		OpenDMXSetWidgetParamsRequestCmdImpl openDMXSetWidgetParamsRequestCmd = new OpenDMXSetWidgetParamsRequestCmdImpl();
		return openDMXSetWidgetParamsRequestCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenDMXReceivedPacketsCmd createOpenDMXReceivedPacketsCmd() {
		OpenDMXReceivedPacketsCmdImpl openDMXReceivedPacketsCmd = new OpenDMXReceivedPacketsCmdImpl();
		return openDMXReceivedPacketsCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenDMXOutputOnlySendDMXPacketsRequestCmd createOpenDMXOutputOnlySendDMXPacketsRequestCmd() {
		OpenDMXOutputOnlySendDMXPacketsRequestCmdImpl openDMXOutputOnlySendDMXPacketsRequestCmd = new OpenDMXOutputOnlySendDMXPacketsRequestCmdImpl();
		return openDMXOutputOnlySendDMXPacketsRequestCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenDMXSendRDMPacketCmd createOpenDMXSendRDMPacketCmd() {
		OpenDMXSendRDMPacketCmdImpl openDMXSendRDMPacketCmd = new OpenDMXSendRDMPacketCmdImpl();
		return openDMXSendRDMPacketCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenDMXReceiveDMXCmd createOpenDMXReceiveDMXCmd() {
		OpenDMXReceiveDMXCmdImpl openDMXReceiveDMXCmd = new OpenDMXReceiveDMXCmdImpl();
		return openDMXReceiveDMXCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenDMXChangeOfStatePacketCmd createOpenDMXChangeOfStatePacketCmd() {
		OpenDMXChangeOfStatePacketCmdImpl openDMXChangeOfStatePacketCmd = new OpenDMXChangeOfStatePacketCmdImpl();
		return openDMXChangeOfStatePacketCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenDMXGetWidgetSerialNumberRequestCmd createOpenDMXGetWidgetSerialNumberRequestCmd() {
		OpenDMXGetWidgetSerialNumberRequestCmdImpl openDMXGetWidgetSerialNumberRequestCmd = new OpenDMXGetWidgetSerialNumberRequestCmdImpl();
		return openDMXGetWidgetSerialNumberRequestCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenDMXGetWidgetSerialNumberReplyCmd createOpenDMXGetWidgetSerialNumberReplyCmd() {
		OpenDMXGetWidgetSerialNumberReplyCmdImpl openDMXGetWidgetSerialNumberReplyCmd = new OpenDMXGetWidgetSerialNumberReplyCmdImpl();
		return openDMXGetWidgetSerialNumberReplyCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenDMXSendRDMDiscoveryRequestCmd createOpenDMXSendRDMDiscoveryRequestCmd() {
		OpenDMXSendRDMDiscoveryRequestCmdImpl openDMXSendRDMDiscoveryRequestCmd = new OpenDMXSendRDMDiscoveryRequestCmdImpl();
		return openDMXSendRDMDiscoveryRequestCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenDMXWidget createOpenDMXWidget() {
		OpenDMXWidgetImpl openDMXWidget = new OpenDMXWidgetImpl();
		return openDMXWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenDMXFade createOpenDMXFade() {
		OpenDMXFadeImpl openDMXFade = new OpenDMXFadeImpl();
		return openDMXFade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenDMXFadeWithStrobe createOpenDMXFadeWithStrobe() {
		OpenDMXFadeWithStrobeImpl openDMXFadeWithStrobe = new OpenDMXFadeWithStrobeImpl();
		return openDMXFadeWithStrobe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenDMXFadeFull createOpenDMXFadeFull() {
		OpenDMXFadeFullImpl openDMXFadeFull = new OpenDMXFadeFullImpl();
		return openDMXFadeFull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenDMXFirmware createOpenDMXFirmwareFromString(EDataType eDataType, String initialValue) {
		OpenDMXFirmware result = OpenDMXFirmware.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOpenDMXFirmwareToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenDMXStates createOpenDMXStatesFromString(EDataType eDataType, String initialValue) {
		OpenDMXStates result = OpenDMXStates.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOpenDMXStatesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzdmxPackage getEzdmxPackage() {
		return (EzdmxPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EzdmxPackage getPackage() {
		return EzdmxPackage.eINSTANCE;
	}

} //EzdmxFactoryImpl
