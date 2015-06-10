/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.model.ezdmx;

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
 * @see net.sf.smbt.dmx.model.ezdmx.EzdmxFactory
 * @model kind="package"
 * @generated
 */
public interface EzdmxPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ezdmx";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ezdmx/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ezdmx";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzdmxPackage eINSTANCE = net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXCmdImpl <em>Open DMX Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXCmdImpl
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXCmd()
	 * @generated
	 */
	int OPEN_DMX_CMD = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_CMD__PRIORITY = CmdPackage.CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_CMD__STAMP = CmdPackage.CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_CMD__START = CmdPackage.CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_CMD__LABEL = CmdPackage.CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_CMD__DATA = CmdPackage.CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_CMD__END = CmdPackage.CMD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Open DMX Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_CMD_FEATURE_COUNT = CmdPackage.CMD_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXReprogramFirmwareRequestCmdImpl <em>Open DMX Reprogram Firmware Request Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXReprogramFirmwareRequestCmdImpl
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXReprogramFirmwareRequestCmd()
	 * @generated
	 */
	int OPEN_DMX_REPROGRAM_FIRMWARE_REQUEST_CMD = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_REPROGRAM_FIRMWARE_REQUEST_CMD__PRIORITY = OPEN_DMX_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_REPROGRAM_FIRMWARE_REQUEST_CMD__STAMP = OPEN_DMX_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_REPROGRAM_FIRMWARE_REQUEST_CMD__START = OPEN_DMX_CMD__START;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_REPROGRAM_FIRMWARE_REQUEST_CMD__LABEL = OPEN_DMX_CMD__LABEL;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_REPROGRAM_FIRMWARE_REQUEST_CMD__DATA = OPEN_DMX_CMD__DATA;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_REPROGRAM_FIRMWARE_REQUEST_CMD__END = OPEN_DMX_CMD__END;

	/**
	 * The number of structural features of the '<em>Open DMX Reprogram Firmware Request Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_REPROGRAM_FIRMWARE_REQUEST_CMD_FEATURE_COUNT = OPEN_DMX_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXProgramFlashPageRequestCmdImpl <em>Open DMX Program Flash Page Request Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXProgramFlashPageRequestCmdImpl
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXProgramFlashPageRequestCmd()
	 * @generated
	 */
	int OPEN_DMX_PROGRAM_FLASH_PAGE_REQUEST_CMD = 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_PROGRAM_FLASH_PAGE_REQUEST_CMD__PRIORITY = OPEN_DMX_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_PROGRAM_FLASH_PAGE_REQUEST_CMD__STAMP = OPEN_DMX_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_PROGRAM_FLASH_PAGE_REQUEST_CMD__START = OPEN_DMX_CMD__START;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_PROGRAM_FLASH_PAGE_REQUEST_CMD__LABEL = OPEN_DMX_CMD__LABEL;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_PROGRAM_FLASH_PAGE_REQUEST_CMD__DATA = OPEN_DMX_CMD__DATA;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_PROGRAM_FLASH_PAGE_REQUEST_CMD__END = OPEN_DMX_CMD__END;

	/**
	 * The number of structural features of the '<em>Open DMX Program Flash Page Request Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_PROGRAM_FLASH_PAGE_REQUEST_CMD_FEATURE_COUNT = OPEN_DMX_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXProgramFlashPageReplyImpl <em>Open DMX Program Flash Page Reply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXProgramFlashPageReplyImpl
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXProgramFlashPageReply()
	 * @generated
	 */
	int OPEN_DMX_PROGRAM_FLASH_PAGE_REPLY = 3;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_PROGRAM_FLASH_PAGE_REPLY__PRIORITY = OPEN_DMX_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_PROGRAM_FLASH_PAGE_REPLY__STAMP = OPEN_DMX_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_PROGRAM_FLASH_PAGE_REPLY__START = OPEN_DMX_CMD__START;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_PROGRAM_FLASH_PAGE_REPLY__LABEL = OPEN_DMX_CMD__LABEL;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_PROGRAM_FLASH_PAGE_REPLY__DATA = OPEN_DMX_CMD__DATA;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_PROGRAM_FLASH_PAGE_REPLY__END = OPEN_DMX_CMD__END;

	/**
	 * The number of structural features of the '<em>Open DMX Program Flash Page Reply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_PROGRAM_FLASH_PAGE_REPLY_FEATURE_COUNT = OPEN_DMX_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXGetWidgetParamRequestCmdImpl <em>Open DMX Get Widget Param Request Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXGetWidgetParamRequestCmdImpl
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXGetWidgetParamRequestCmd()
	 * @generated
	 */
	int OPEN_DMX_GET_WIDGET_PARAM_REQUEST_CMD = 4;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_GET_WIDGET_PARAM_REQUEST_CMD__PRIORITY = OPEN_DMX_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_GET_WIDGET_PARAM_REQUEST_CMD__STAMP = OPEN_DMX_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_GET_WIDGET_PARAM_REQUEST_CMD__START = OPEN_DMX_CMD__START;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_GET_WIDGET_PARAM_REQUEST_CMD__LABEL = OPEN_DMX_CMD__LABEL;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_GET_WIDGET_PARAM_REQUEST_CMD__DATA = OPEN_DMX_CMD__DATA;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_GET_WIDGET_PARAM_REQUEST_CMD__END = OPEN_DMX_CMD__END;

	/**
	 * The number of structural features of the '<em>Open DMX Get Widget Param Request Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_GET_WIDGET_PARAM_REQUEST_CMD_FEATURE_COUNT = OPEN_DMX_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXGetWidgetParamsReplyCmdImpl <em>Open DMX Get Widget Params Reply Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXGetWidgetParamsReplyCmdImpl
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXGetWidgetParamsReplyCmd()
	 * @generated
	 */
	int OPEN_DMX_GET_WIDGET_PARAMS_REPLY_CMD = 5;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_GET_WIDGET_PARAMS_REPLY_CMD__PRIORITY = OPEN_DMX_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_GET_WIDGET_PARAMS_REPLY_CMD__STAMP = OPEN_DMX_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_GET_WIDGET_PARAMS_REPLY_CMD__START = OPEN_DMX_CMD__START;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_GET_WIDGET_PARAMS_REPLY_CMD__LABEL = OPEN_DMX_CMD__LABEL;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_GET_WIDGET_PARAMS_REPLY_CMD__DATA = OPEN_DMX_CMD__DATA;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_GET_WIDGET_PARAMS_REPLY_CMD__END = OPEN_DMX_CMD__END;

	/**
	 * The number of structural features of the '<em>Open DMX Get Widget Params Reply Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_GET_WIDGET_PARAMS_REPLY_CMD_FEATURE_COUNT = OPEN_DMX_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXSetWidgetParamsRequestCmdImpl <em>Open DMX Set Widget Params Request Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXSetWidgetParamsRequestCmdImpl
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXSetWidgetParamsRequestCmd()
	 * @generated
	 */
	int OPEN_DMX_SET_WIDGET_PARAMS_REQUEST_CMD = 6;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_SET_WIDGET_PARAMS_REQUEST_CMD__PRIORITY = OPEN_DMX_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_SET_WIDGET_PARAMS_REQUEST_CMD__STAMP = OPEN_DMX_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_SET_WIDGET_PARAMS_REQUEST_CMD__START = OPEN_DMX_CMD__START;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_SET_WIDGET_PARAMS_REQUEST_CMD__LABEL = OPEN_DMX_CMD__LABEL;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_SET_WIDGET_PARAMS_REQUEST_CMD__DATA = OPEN_DMX_CMD__DATA;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_SET_WIDGET_PARAMS_REQUEST_CMD__END = OPEN_DMX_CMD__END;

	/**
	 * The number of structural features of the '<em>Open DMX Set Widget Params Request Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_SET_WIDGET_PARAMS_REQUEST_CMD_FEATURE_COUNT = OPEN_DMX_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXReceivedPacketsCmdImpl <em>Open DMX Received Packets Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXReceivedPacketsCmdImpl
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXReceivedPacketsCmd()
	 * @generated
	 */
	int OPEN_DMX_RECEIVED_PACKETS_CMD = 7;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_RECEIVED_PACKETS_CMD__PRIORITY = OPEN_DMX_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_RECEIVED_PACKETS_CMD__STAMP = OPEN_DMX_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_RECEIVED_PACKETS_CMD__START = OPEN_DMX_CMD__START;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_RECEIVED_PACKETS_CMD__LABEL = OPEN_DMX_CMD__LABEL;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_RECEIVED_PACKETS_CMD__DATA = OPEN_DMX_CMD__DATA;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_RECEIVED_PACKETS_CMD__END = OPEN_DMX_CMD__END;

	/**
	 * The number of structural features of the '<em>Open DMX Received Packets Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_RECEIVED_PACKETS_CMD_FEATURE_COUNT = OPEN_DMX_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXOutputOnlySendDMXPacketsRequestCmdImpl <em>Open DMX Output Only Send DMX Packets Request Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXOutputOnlySendDMXPacketsRequestCmdImpl
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXOutputOnlySendDMXPacketsRequestCmd()
	 * @generated
	 */
	int OPEN_DMX_OUTPUT_ONLY_SEND_DMX_PACKETS_REQUEST_CMD = 8;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_OUTPUT_ONLY_SEND_DMX_PACKETS_REQUEST_CMD__PRIORITY = OPEN_DMX_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_OUTPUT_ONLY_SEND_DMX_PACKETS_REQUEST_CMD__STAMP = OPEN_DMX_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_OUTPUT_ONLY_SEND_DMX_PACKETS_REQUEST_CMD__START = OPEN_DMX_CMD__START;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_OUTPUT_ONLY_SEND_DMX_PACKETS_REQUEST_CMD__LABEL = OPEN_DMX_CMD__LABEL;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_OUTPUT_ONLY_SEND_DMX_PACKETS_REQUEST_CMD__DATA = OPEN_DMX_CMD__DATA;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_OUTPUT_ONLY_SEND_DMX_PACKETS_REQUEST_CMD__END = OPEN_DMX_CMD__END;

	/**
	 * The number of structural features of the '<em>Open DMX Output Only Send DMX Packets Request Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_OUTPUT_ONLY_SEND_DMX_PACKETS_REQUEST_CMD_FEATURE_COUNT = OPEN_DMX_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXSendRDMPacketCmdImpl <em>Open DMX Send RDM Packet Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXSendRDMPacketCmdImpl
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXSendRDMPacketCmd()
	 * @generated
	 */
	int OPEN_DMX_SEND_RDM_PACKET_CMD = 9;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_SEND_RDM_PACKET_CMD__PRIORITY = OPEN_DMX_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_SEND_RDM_PACKET_CMD__STAMP = OPEN_DMX_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_SEND_RDM_PACKET_CMD__START = OPEN_DMX_CMD__START;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_SEND_RDM_PACKET_CMD__LABEL = OPEN_DMX_CMD__LABEL;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_SEND_RDM_PACKET_CMD__DATA = OPEN_DMX_CMD__DATA;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_SEND_RDM_PACKET_CMD__END = OPEN_DMX_CMD__END;

	/**
	 * The number of structural features of the '<em>Open DMX Send RDM Packet Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_SEND_RDM_PACKET_CMD_FEATURE_COUNT = OPEN_DMX_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXReceiveDMXCmdImpl <em>Open DMX Receive DMX Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXReceiveDMXCmdImpl
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXReceiveDMXCmd()
	 * @generated
	 */
	int OPEN_DMX_RECEIVE_DMX_CMD = 10;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_RECEIVE_DMX_CMD__PRIORITY = OPEN_DMX_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_RECEIVE_DMX_CMD__STAMP = OPEN_DMX_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_RECEIVE_DMX_CMD__START = OPEN_DMX_CMD__START;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_RECEIVE_DMX_CMD__LABEL = OPEN_DMX_CMD__LABEL;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_RECEIVE_DMX_CMD__DATA = OPEN_DMX_CMD__DATA;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_RECEIVE_DMX_CMD__END = OPEN_DMX_CMD__END;

	/**
	 * The number of structural features of the '<em>Open DMX Receive DMX Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_RECEIVE_DMX_CMD_FEATURE_COUNT = OPEN_DMX_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXChangeOfStatePacketCmdImpl <em>Open DMX Change Of State Packet Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXChangeOfStatePacketCmdImpl
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXChangeOfStatePacketCmd()
	 * @generated
	 */
	int OPEN_DMX_CHANGE_OF_STATE_PACKET_CMD = 11;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_CHANGE_OF_STATE_PACKET_CMD__PRIORITY = OPEN_DMX_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_CHANGE_OF_STATE_PACKET_CMD__STAMP = OPEN_DMX_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_CHANGE_OF_STATE_PACKET_CMD__START = OPEN_DMX_CMD__START;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_CHANGE_OF_STATE_PACKET_CMD__LABEL = OPEN_DMX_CMD__LABEL;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_CHANGE_OF_STATE_PACKET_CMD__DATA = OPEN_DMX_CMD__DATA;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_CHANGE_OF_STATE_PACKET_CMD__END = OPEN_DMX_CMD__END;

	/**
	 * The number of structural features of the '<em>Open DMX Change Of State Packet Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_CHANGE_OF_STATE_PACKET_CMD_FEATURE_COUNT = OPEN_DMX_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXGetWidgetSerialNumberRequestCmdImpl <em>Open DMX Get Widget Serial Number Request Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXGetWidgetSerialNumberRequestCmdImpl
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXGetWidgetSerialNumberRequestCmd()
	 * @generated
	 */
	int OPEN_DMX_GET_WIDGET_SERIAL_NUMBER_REQUEST_CMD = 12;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_GET_WIDGET_SERIAL_NUMBER_REQUEST_CMD__PRIORITY = OPEN_DMX_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_GET_WIDGET_SERIAL_NUMBER_REQUEST_CMD__STAMP = OPEN_DMX_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_GET_WIDGET_SERIAL_NUMBER_REQUEST_CMD__START = OPEN_DMX_CMD__START;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_GET_WIDGET_SERIAL_NUMBER_REQUEST_CMD__LABEL = OPEN_DMX_CMD__LABEL;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_GET_WIDGET_SERIAL_NUMBER_REQUEST_CMD__DATA = OPEN_DMX_CMD__DATA;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_GET_WIDGET_SERIAL_NUMBER_REQUEST_CMD__END = OPEN_DMX_CMD__END;

	/**
	 * The number of structural features of the '<em>Open DMX Get Widget Serial Number Request Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_GET_WIDGET_SERIAL_NUMBER_REQUEST_CMD_FEATURE_COUNT = OPEN_DMX_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXGetWidgetSerialNumberReplyCmdImpl <em>Open DMX Get Widget Serial Number Reply Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXGetWidgetSerialNumberReplyCmdImpl
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXGetWidgetSerialNumberReplyCmd()
	 * @generated
	 */
	int OPEN_DMX_GET_WIDGET_SERIAL_NUMBER_REPLY_CMD = 13;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_GET_WIDGET_SERIAL_NUMBER_REPLY_CMD__PRIORITY = OPEN_DMX_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_GET_WIDGET_SERIAL_NUMBER_REPLY_CMD__STAMP = OPEN_DMX_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_GET_WIDGET_SERIAL_NUMBER_REPLY_CMD__START = OPEN_DMX_CMD__START;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_GET_WIDGET_SERIAL_NUMBER_REPLY_CMD__LABEL = OPEN_DMX_CMD__LABEL;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_GET_WIDGET_SERIAL_NUMBER_REPLY_CMD__DATA = OPEN_DMX_CMD__DATA;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_GET_WIDGET_SERIAL_NUMBER_REPLY_CMD__END = OPEN_DMX_CMD__END;

	/**
	 * The number of structural features of the '<em>Open DMX Get Widget Serial Number Reply Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_GET_WIDGET_SERIAL_NUMBER_REPLY_CMD_FEATURE_COUNT = OPEN_DMX_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXSendRDMDiscoveryRequestCmdImpl <em>Open DMX Send RDM Discovery Request Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXSendRDMDiscoveryRequestCmdImpl
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXSendRDMDiscoveryRequestCmd()
	 * @generated
	 */
	int OPEN_DMX_SEND_RDM_DISCOVERY_REQUEST_CMD = 14;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_SEND_RDM_DISCOVERY_REQUEST_CMD__PRIORITY = OPEN_DMX_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_SEND_RDM_DISCOVERY_REQUEST_CMD__STAMP = OPEN_DMX_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_SEND_RDM_DISCOVERY_REQUEST_CMD__START = OPEN_DMX_CMD__START;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_SEND_RDM_DISCOVERY_REQUEST_CMD__LABEL = OPEN_DMX_CMD__LABEL;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_SEND_RDM_DISCOVERY_REQUEST_CMD__DATA = OPEN_DMX_CMD__DATA;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_SEND_RDM_DISCOVERY_REQUEST_CMD__END = OPEN_DMX_CMD__END;

	/**
	 * The number of structural features of the '<em>Open DMX Send RDM Discovery Request Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_SEND_RDM_DISCOVERY_REQUEST_CMD_FEATURE_COUNT = OPEN_DMX_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXWidgetImpl <em>Open DMX Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXWidgetImpl
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXWidget()
	 * @generated
	 */
	int OPEN_DMX_WIDGET = 15;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_WIDGET__UID = 0;

	/**
	 * The number of structural features of the '<em>Open DMX Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_WIDGET_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXFadeImpl <em>Open DMX Fade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXFadeImpl
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXFade()
	 * @generated
	 */
	int OPEN_DMX_FADE = 16;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_FADE__PRIORITY = OPEN_DMX_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_FADE__STAMP = OPEN_DMX_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_FADE__START = OPEN_DMX_CMD__START;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_FADE__LABEL = OPEN_DMX_CMD__LABEL;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_FADE__DATA = OPEN_DMX_CMD__DATA;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_FADE__END = OPEN_DMX_CMD__END;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_FADE__CHANNEL = OPEN_DMX_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_FADE__R = OPEN_DMX_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_FADE__G = OPEN_DMX_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_FADE__B = OPEN_DMX_CMD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Open DMX Fade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_FADE_FEATURE_COUNT = OPEN_DMX_CMD_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXFadeWithStrobeImpl <em>Open DMX Fade With Strobe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXFadeWithStrobeImpl
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXFadeWithStrobe()
	 * @generated
	 */
	int OPEN_DMX_FADE_WITH_STROBE = 17;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_FADE_WITH_STROBE__PRIORITY = OPEN_DMX_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_FADE_WITH_STROBE__STAMP = OPEN_DMX_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_FADE_WITH_STROBE__START = OPEN_DMX_CMD__START;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_FADE_WITH_STROBE__LABEL = OPEN_DMX_CMD__LABEL;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_FADE_WITH_STROBE__DATA = OPEN_DMX_CMD__DATA;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_FADE_WITH_STROBE__END = OPEN_DMX_CMD__END;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_FADE_WITH_STROBE__CHANNEL = OPEN_DMX_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_FADE_WITH_STROBE__R = OPEN_DMX_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_FADE_WITH_STROBE__B = OPEN_DMX_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_FADE_WITH_STROBE__G = OPEN_DMX_CMD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Strobe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_FADE_WITH_STROBE__STROBE = OPEN_DMX_CMD_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Open DMX Fade With Strobe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_FADE_WITH_STROBE_FEATURE_COUNT = OPEN_DMX_CMD_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXFadeFullImpl <em>Open DMX Fade Full</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXFadeFullImpl
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXFadeFull()
	 * @generated
	 */
	int OPEN_DMX_FADE_FULL = 18;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_FADE_FULL__PRIORITY = OPEN_DMX_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_FADE_FULL__STAMP = OPEN_DMX_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_FADE_FULL__START = OPEN_DMX_CMD__START;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_FADE_FULL__LABEL = OPEN_DMX_CMD__LABEL;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_FADE_FULL__DATA = OPEN_DMX_CMD__DATA;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_FADE_FULL__END = OPEN_DMX_CMD__END;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_FADE_FULL__R = OPEN_DMX_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_FADE_FULL__G = OPEN_DMX_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_FADE_FULL__B = OPEN_DMX_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Full Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_FADE_FULL__FULL_COLOR = OPEN_DMX_CMD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Strobe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_FADE_FULL__STROBE = OPEN_DMX_CMD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_FADE_FULL__MODI = OPEN_DMX_CMD_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_FADE_FULL__EXT = OPEN_DMX_CMD_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Open DMX Fade Full</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_DMX_FADE_FULL_FEATURE_COUNT = OPEN_DMX_CMD_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXFirmware <em>Open DMX Firmware</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXFirmware
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXFirmware()
	 * @generated
	 */
	int OPEN_DMX_FIRMWARE = 19;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXStates <em>Open DMX States</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXStates
	 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXStates()
	 * @generated
	 */
	int OPEN_DMX_STATES = 20;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXCmd <em>Open DMX Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open DMX Cmd</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXCmd
	 * @generated
	 */
	EClass getOpenDMXCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXCmd#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXCmd#getStart()
	 * @see #getOpenDMXCmd()
	 * @generated
	 */
	EAttribute getOpenDMXCmd_Start();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXCmd#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXCmd#getLabel()
	 * @see #getOpenDMXCmd()
	 * @generated
	 */
	EAttribute getOpenDMXCmd_Label();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXCmd#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXCmd#getData()
	 * @see #getOpenDMXCmd()
	 * @generated
	 */
	EAttribute getOpenDMXCmd_Data();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXCmd#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXCmd#getEnd()
	 * @see #getOpenDMXCmd()
	 * @generated
	 */
	EAttribute getOpenDMXCmd_End();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXReprogramFirmwareRequestCmd <em>Open DMX Reprogram Firmware Request Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open DMX Reprogram Firmware Request Cmd</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXReprogramFirmwareRequestCmd
	 * @generated
	 */
	EClass getOpenDMXReprogramFirmwareRequestCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXProgramFlashPageRequestCmd <em>Open DMX Program Flash Page Request Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open DMX Program Flash Page Request Cmd</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXProgramFlashPageRequestCmd
	 * @generated
	 */
	EClass getOpenDMXProgramFlashPageRequestCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXProgramFlashPageReply <em>Open DMX Program Flash Page Reply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open DMX Program Flash Page Reply</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXProgramFlashPageReply
	 * @generated
	 */
	EClass getOpenDMXProgramFlashPageReply();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXGetWidgetParamRequestCmd <em>Open DMX Get Widget Param Request Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open DMX Get Widget Param Request Cmd</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXGetWidgetParamRequestCmd
	 * @generated
	 */
	EClass getOpenDMXGetWidgetParamRequestCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXGetWidgetParamsReplyCmd <em>Open DMX Get Widget Params Reply Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open DMX Get Widget Params Reply Cmd</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXGetWidgetParamsReplyCmd
	 * @generated
	 */
	EClass getOpenDMXGetWidgetParamsReplyCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXSetWidgetParamsRequestCmd <em>Open DMX Set Widget Params Request Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open DMX Set Widget Params Request Cmd</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXSetWidgetParamsRequestCmd
	 * @generated
	 */
	EClass getOpenDMXSetWidgetParamsRequestCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXReceivedPacketsCmd <em>Open DMX Received Packets Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open DMX Received Packets Cmd</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXReceivedPacketsCmd
	 * @generated
	 */
	EClass getOpenDMXReceivedPacketsCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXOutputOnlySendDMXPacketsRequestCmd <em>Open DMX Output Only Send DMX Packets Request Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open DMX Output Only Send DMX Packets Request Cmd</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXOutputOnlySendDMXPacketsRequestCmd
	 * @generated
	 */
	EClass getOpenDMXOutputOnlySendDMXPacketsRequestCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXSendRDMPacketCmd <em>Open DMX Send RDM Packet Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open DMX Send RDM Packet Cmd</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXSendRDMPacketCmd
	 * @generated
	 */
	EClass getOpenDMXSendRDMPacketCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXReceiveDMXCmd <em>Open DMX Receive DMX Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open DMX Receive DMX Cmd</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXReceiveDMXCmd
	 * @generated
	 */
	EClass getOpenDMXReceiveDMXCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXChangeOfStatePacketCmd <em>Open DMX Change Of State Packet Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open DMX Change Of State Packet Cmd</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXChangeOfStatePacketCmd
	 * @generated
	 */
	EClass getOpenDMXChangeOfStatePacketCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXGetWidgetSerialNumberRequestCmd <em>Open DMX Get Widget Serial Number Request Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open DMX Get Widget Serial Number Request Cmd</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXGetWidgetSerialNumberRequestCmd
	 * @generated
	 */
	EClass getOpenDMXGetWidgetSerialNumberRequestCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXGetWidgetSerialNumberReplyCmd <em>Open DMX Get Widget Serial Number Reply Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open DMX Get Widget Serial Number Reply Cmd</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXGetWidgetSerialNumberReplyCmd
	 * @generated
	 */
	EClass getOpenDMXGetWidgetSerialNumberReplyCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXSendRDMDiscoveryRequestCmd <em>Open DMX Send RDM Discovery Request Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open DMX Send RDM Discovery Request Cmd</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXSendRDMDiscoveryRequestCmd
	 * @generated
	 */
	EClass getOpenDMXSendRDMDiscoveryRequestCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXWidget <em>Open DMX Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open DMX Widget</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXWidget
	 * @generated
	 */
	EClass getOpenDMXWidget();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXWidget#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXWidget#getUid()
	 * @see #getOpenDMXWidget()
	 * @generated
	 */
	EAttribute getOpenDMXWidget_Uid();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXFade <em>Open DMX Fade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open DMX Fade</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXFade
	 * @generated
	 */
	EClass getOpenDMXFade();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXFade#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXFade#getChannel()
	 * @see #getOpenDMXFade()
	 * @generated
	 */
	EAttribute getOpenDMXFade_Channel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXFade#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXFade#getR()
	 * @see #getOpenDMXFade()
	 * @generated
	 */
	EAttribute getOpenDMXFade_R();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXFade#getG <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXFade#getG()
	 * @see #getOpenDMXFade()
	 * @generated
	 */
	EAttribute getOpenDMXFade_G();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXFade#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXFade#getB()
	 * @see #getOpenDMXFade()
	 * @generated
	 */
	EAttribute getOpenDMXFade_B();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeWithStrobe <em>Open DMX Fade With Strobe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open DMX Fade With Strobe</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeWithStrobe
	 * @generated
	 */
	EClass getOpenDMXFadeWithStrobe();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeWithStrobe#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeWithStrobe#getChannel()
	 * @see #getOpenDMXFadeWithStrobe()
	 * @generated
	 */
	EAttribute getOpenDMXFadeWithStrobe_Channel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeWithStrobe#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeWithStrobe#getR()
	 * @see #getOpenDMXFadeWithStrobe()
	 * @generated
	 */
	EAttribute getOpenDMXFadeWithStrobe_R();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeWithStrobe#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeWithStrobe#getB()
	 * @see #getOpenDMXFadeWithStrobe()
	 * @generated
	 */
	EAttribute getOpenDMXFadeWithStrobe_B();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeWithStrobe#getG <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeWithStrobe#getG()
	 * @see #getOpenDMXFadeWithStrobe()
	 * @generated
	 */
	EAttribute getOpenDMXFadeWithStrobe_G();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeWithStrobe#getStrobe <em>Strobe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strobe</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeWithStrobe#getStrobe()
	 * @see #getOpenDMXFadeWithStrobe()
	 * @generated
	 */
	EAttribute getOpenDMXFadeWithStrobe_Strobe();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeFull <em>Open DMX Fade Full</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open DMX Fade Full</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeFull
	 * @generated
	 */
	EClass getOpenDMXFadeFull();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeFull#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeFull#getR()
	 * @see #getOpenDMXFadeFull()
	 * @generated
	 */
	EAttribute getOpenDMXFadeFull_R();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeFull#getG <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeFull#getG()
	 * @see #getOpenDMXFadeFull()
	 * @generated
	 */
	EAttribute getOpenDMXFadeFull_G();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeFull#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeFull#getB()
	 * @see #getOpenDMXFadeFull()
	 * @generated
	 */
	EAttribute getOpenDMXFadeFull_B();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeFull#getFullColor <em>Full Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Color</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeFull#getFullColor()
	 * @see #getOpenDMXFadeFull()
	 * @generated
	 */
	EAttribute getOpenDMXFadeFull_FullColor();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeFull#getStrobe <em>Strobe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strobe</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeFull#getStrobe()
	 * @see #getOpenDMXFadeFull()
	 * @generated
	 */
	EAttribute getOpenDMXFadeFull_Strobe();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeFull#getModi <em>Modi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modi</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeFull#getModi()
	 * @see #getOpenDMXFadeFull()
	 * @generated
	 */
	EAttribute getOpenDMXFadeFull_Modi();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeFull#getExt <em>Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ext</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeFull#getExt()
	 * @see #getOpenDMXFadeFull()
	 * @generated
	 */
	EAttribute getOpenDMXFadeFull_Ext();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXFirmware <em>Open DMX Firmware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Open DMX Firmware</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXFirmware
	 * @generated
	 */
	EEnum getOpenDMXFirmware();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXStates <em>Open DMX States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Open DMX States</em>'.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXStates
	 * @generated
	 */
	EEnum getOpenDMXStates();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EzdmxFactory getEzdmxFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXCmdImpl <em>Open DMX Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXCmdImpl
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXCmd()
		 * @generated
		 */
		EClass OPEN_DMX_CMD = eINSTANCE.getOpenDMXCmd();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_DMX_CMD__START = eINSTANCE.getOpenDMXCmd_Start();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_DMX_CMD__LABEL = eINSTANCE.getOpenDMXCmd_Label();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_DMX_CMD__DATA = eINSTANCE.getOpenDMXCmd_Data();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_DMX_CMD__END = eINSTANCE.getOpenDMXCmd_End();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXReprogramFirmwareRequestCmdImpl <em>Open DMX Reprogram Firmware Request Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXReprogramFirmwareRequestCmdImpl
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXReprogramFirmwareRequestCmd()
		 * @generated
		 */
		EClass OPEN_DMX_REPROGRAM_FIRMWARE_REQUEST_CMD = eINSTANCE.getOpenDMXReprogramFirmwareRequestCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXProgramFlashPageRequestCmdImpl <em>Open DMX Program Flash Page Request Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXProgramFlashPageRequestCmdImpl
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXProgramFlashPageRequestCmd()
		 * @generated
		 */
		EClass OPEN_DMX_PROGRAM_FLASH_PAGE_REQUEST_CMD = eINSTANCE.getOpenDMXProgramFlashPageRequestCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXProgramFlashPageReplyImpl <em>Open DMX Program Flash Page Reply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXProgramFlashPageReplyImpl
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXProgramFlashPageReply()
		 * @generated
		 */
		EClass OPEN_DMX_PROGRAM_FLASH_PAGE_REPLY = eINSTANCE.getOpenDMXProgramFlashPageReply();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXGetWidgetParamRequestCmdImpl <em>Open DMX Get Widget Param Request Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXGetWidgetParamRequestCmdImpl
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXGetWidgetParamRequestCmd()
		 * @generated
		 */
		EClass OPEN_DMX_GET_WIDGET_PARAM_REQUEST_CMD = eINSTANCE.getOpenDMXGetWidgetParamRequestCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXGetWidgetParamsReplyCmdImpl <em>Open DMX Get Widget Params Reply Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXGetWidgetParamsReplyCmdImpl
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXGetWidgetParamsReplyCmd()
		 * @generated
		 */
		EClass OPEN_DMX_GET_WIDGET_PARAMS_REPLY_CMD = eINSTANCE.getOpenDMXGetWidgetParamsReplyCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXSetWidgetParamsRequestCmdImpl <em>Open DMX Set Widget Params Request Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXSetWidgetParamsRequestCmdImpl
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXSetWidgetParamsRequestCmd()
		 * @generated
		 */
		EClass OPEN_DMX_SET_WIDGET_PARAMS_REQUEST_CMD = eINSTANCE.getOpenDMXSetWidgetParamsRequestCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXReceivedPacketsCmdImpl <em>Open DMX Received Packets Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXReceivedPacketsCmdImpl
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXReceivedPacketsCmd()
		 * @generated
		 */
		EClass OPEN_DMX_RECEIVED_PACKETS_CMD = eINSTANCE.getOpenDMXReceivedPacketsCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXOutputOnlySendDMXPacketsRequestCmdImpl <em>Open DMX Output Only Send DMX Packets Request Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXOutputOnlySendDMXPacketsRequestCmdImpl
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXOutputOnlySendDMXPacketsRequestCmd()
		 * @generated
		 */
		EClass OPEN_DMX_OUTPUT_ONLY_SEND_DMX_PACKETS_REQUEST_CMD = eINSTANCE.getOpenDMXOutputOnlySendDMXPacketsRequestCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXSendRDMPacketCmdImpl <em>Open DMX Send RDM Packet Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXSendRDMPacketCmdImpl
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXSendRDMPacketCmd()
		 * @generated
		 */
		EClass OPEN_DMX_SEND_RDM_PACKET_CMD = eINSTANCE.getOpenDMXSendRDMPacketCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXReceiveDMXCmdImpl <em>Open DMX Receive DMX Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXReceiveDMXCmdImpl
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXReceiveDMXCmd()
		 * @generated
		 */
		EClass OPEN_DMX_RECEIVE_DMX_CMD = eINSTANCE.getOpenDMXReceiveDMXCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXChangeOfStatePacketCmdImpl <em>Open DMX Change Of State Packet Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXChangeOfStatePacketCmdImpl
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXChangeOfStatePacketCmd()
		 * @generated
		 */
		EClass OPEN_DMX_CHANGE_OF_STATE_PACKET_CMD = eINSTANCE.getOpenDMXChangeOfStatePacketCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXGetWidgetSerialNumberRequestCmdImpl <em>Open DMX Get Widget Serial Number Request Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXGetWidgetSerialNumberRequestCmdImpl
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXGetWidgetSerialNumberRequestCmd()
		 * @generated
		 */
		EClass OPEN_DMX_GET_WIDGET_SERIAL_NUMBER_REQUEST_CMD = eINSTANCE.getOpenDMXGetWidgetSerialNumberRequestCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXGetWidgetSerialNumberReplyCmdImpl <em>Open DMX Get Widget Serial Number Reply Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXGetWidgetSerialNumberReplyCmdImpl
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXGetWidgetSerialNumberReplyCmd()
		 * @generated
		 */
		EClass OPEN_DMX_GET_WIDGET_SERIAL_NUMBER_REPLY_CMD = eINSTANCE.getOpenDMXGetWidgetSerialNumberReplyCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXSendRDMDiscoveryRequestCmdImpl <em>Open DMX Send RDM Discovery Request Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXSendRDMDiscoveryRequestCmdImpl
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXSendRDMDiscoveryRequestCmd()
		 * @generated
		 */
		EClass OPEN_DMX_SEND_RDM_DISCOVERY_REQUEST_CMD = eINSTANCE.getOpenDMXSendRDMDiscoveryRequestCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXWidgetImpl <em>Open DMX Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXWidgetImpl
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXWidget()
		 * @generated
		 */
		EClass OPEN_DMX_WIDGET = eINSTANCE.getOpenDMXWidget();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_DMX_WIDGET__UID = eINSTANCE.getOpenDMXWidget_Uid();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXFadeImpl <em>Open DMX Fade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXFadeImpl
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXFade()
		 * @generated
		 */
		EClass OPEN_DMX_FADE = eINSTANCE.getOpenDMXFade();

		/**
		 * The meta object literal for the '<em><b>Channel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_DMX_FADE__CHANNEL = eINSTANCE.getOpenDMXFade_Channel();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_DMX_FADE__R = eINSTANCE.getOpenDMXFade_R();

		/**
		 * The meta object literal for the '<em><b>G</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_DMX_FADE__G = eINSTANCE.getOpenDMXFade_G();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_DMX_FADE__B = eINSTANCE.getOpenDMXFade_B();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXFadeWithStrobeImpl <em>Open DMX Fade With Strobe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXFadeWithStrobeImpl
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXFadeWithStrobe()
		 * @generated
		 */
		EClass OPEN_DMX_FADE_WITH_STROBE = eINSTANCE.getOpenDMXFadeWithStrobe();

		/**
		 * The meta object literal for the '<em><b>Channel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_DMX_FADE_WITH_STROBE__CHANNEL = eINSTANCE.getOpenDMXFadeWithStrobe_Channel();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_DMX_FADE_WITH_STROBE__R = eINSTANCE.getOpenDMXFadeWithStrobe_R();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_DMX_FADE_WITH_STROBE__B = eINSTANCE.getOpenDMXFadeWithStrobe_B();

		/**
		 * The meta object literal for the '<em><b>G</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_DMX_FADE_WITH_STROBE__G = eINSTANCE.getOpenDMXFadeWithStrobe_G();

		/**
		 * The meta object literal for the '<em><b>Strobe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_DMX_FADE_WITH_STROBE__STROBE = eINSTANCE.getOpenDMXFadeWithStrobe_Strobe();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXFadeFullImpl <em>Open DMX Fade Full</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXFadeFullImpl
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXFadeFull()
		 * @generated
		 */
		EClass OPEN_DMX_FADE_FULL = eINSTANCE.getOpenDMXFadeFull();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_DMX_FADE_FULL__R = eINSTANCE.getOpenDMXFadeFull_R();

		/**
		 * The meta object literal for the '<em><b>G</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_DMX_FADE_FULL__G = eINSTANCE.getOpenDMXFadeFull_G();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_DMX_FADE_FULL__B = eINSTANCE.getOpenDMXFadeFull_B();

		/**
		 * The meta object literal for the '<em><b>Full Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_DMX_FADE_FULL__FULL_COLOR = eINSTANCE.getOpenDMXFadeFull_FullColor();

		/**
		 * The meta object literal for the '<em><b>Strobe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_DMX_FADE_FULL__STROBE = eINSTANCE.getOpenDMXFadeFull_Strobe();

		/**
		 * The meta object literal for the '<em><b>Modi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_DMX_FADE_FULL__MODI = eINSTANCE.getOpenDMXFadeFull_Modi();

		/**
		 * The meta object literal for the '<em><b>Ext</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPEN_DMX_FADE_FULL__EXT = eINSTANCE.getOpenDMXFadeFull_Ext();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXFirmware <em>Open DMX Firmware</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXFirmware
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXFirmware()
		 * @generated
		 */
		EEnum OPEN_DMX_FIRMWARE = eINSTANCE.getOpenDMXFirmware();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXStates <em>Open DMX States</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXStates
		 * @see net.sf.smbt.dmx.model.ezdmx.impl.EzdmxPackageImpl#getOpenDMXStates()
		 * @generated
		 */
		EEnum OPEN_DMX_STATES = eINSTANCE.getOpenDMXStates();

	}

} //EzdmxPackage
