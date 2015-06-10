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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.dmx.model.ezdmx.EzdmxPackage
 * @generated
 */
public class EzdmxAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EzdmxPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzdmxAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EzdmxPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EzdmxSwitch<Adapter> modelSwitch =
		new EzdmxSwitch<Adapter>() {
			@Override
			public Adapter caseOpenDMXCmd(OpenDMXCmd object) {
				return createOpenDMXCmdAdapter();
			}
			@Override
			public Adapter caseOpenDMXReprogramFirmwareRequestCmd(OpenDMXReprogramFirmwareRequestCmd object) {
				return createOpenDMXReprogramFirmwareRequestCmdAdapter();
			}
			@Override
			public Adapter caseOpenDMXProgramFlashPageRequestCmd(OpenDMXProgramFlashPageRequestCmd object) {
				return createOpenDMXProgramFlashPageRequestCmdAdapter();
			}
			@Override
			public Adapter caseOpenDMXProgramFlashPageReply(OpenDMXProgramFlashPageReply object) {
				return createOpenDMXProgramFlashPageReplyAdapter();
			}
			@Override
			public Adapter caseOpenDMXGetWidgetParamRequestCmd(OpenDMXGetWidgetParamRequestCmd object) {
				return createOpenDMXGetWidgetParamRequestCmdAdapter();
			}
			@Override
			public Adapter caseOpenDMXGetWidgetParamsReplyCmd(OpenDMXGetWidgetParamsReplyCmd object) {
				return createOpenDMXGetWidgetParamsReplyCmdAdapter();
			}
			@Override
			public Adapter caseOpenDMXSetWidgetParamsRequestCmd(OpenDMXSetWidgetParamsRequestCmd object) {
				return createOpenDMXSetWidgetParamsRequestCmdAdapter();
			}
			@Override
			public Adapter caseOpenDMXReceivedPacketsCmd(OpenDMXReceivedPacketsCmd object) {
				return createOpenDMXReceivedPacketsCmdAdapter();
			}
			@Override
			public Adapter caseOpenDMXOutputOnlySendDMXPacketsRequestCmd(OpenDMXOutputOnlySendDMXPacketsRequestCmd object) {
				return createOpenDMXOutputOnlySendDMXPacketsRequestCmdAdapter();
			}
			@Override
			public Adapter caseOpenDMXSendRDMPacketCmd(OpenDMXSendRDMPacketCmd object) {
				return createOpenDMXSendRDMPacketCmdAdapter();
			}
			@Override
			public Adapter caseOpenDMXReceiveDMXCmd(OpenDMXReceiveDMXCmd object) {
				return createOpenDMXReceiveDMXCmdAdapter();
			}
			@Override
			public Adapter caseOpenDMXChangeOfStatePacketCmd(OpenDMXChangeOfStatePacketCmd object) {
				return createOpenDMXChangeOfStatePacketCmdAdapter();
			}
			@Override
			public Adapter caseOpenDMXGetWidgetSerialNumberRequestCmd(OpenDMXGetWidgetSerialNumberRequestCmd object) {
				return createOpenDMXGetWidgetSerialNumberRequestCmdAdapter();
			}
			@Override
			public Adapter caseOpenDMXGetWidgetSerialNumberReplyCmd(OpenDMXGetWidgetSerialNumberReplyCmd object) {
				return createOpenDMXGetWidgetSerialNumberReplyCmdAdapter();
			}
			@Override
			public Adapter caseOpenDMXSendRDMDiscoveryRequestCmd(OpenDMXSendRDMDiscoveryRequestCmd object) {
				return createOpenDMXSendRDMDiscoveryRequestCmdAdapter();
			}
			@Override
			public Adapter caseOpenDMXWidget(OpenDMXWidget object) {
				return createOpenDMXWidgetAdapter();
			}
			@Override
			public Adapter caseOpenDMXFade(OpenDMXFade object) {
				return createOpenDMXFadeAdapter();
			}
			@Override
			public Adapter caseOpenDMXFadeWithStrobe(OpenDMXFadeWithStrobe object) {
				return createOpenDMXFadeWithStrobeAdapter();
			}
			@Override
			public Adapter caseOpenDMXFadeFull(OpenDMXFadeFull object) {
				return createOpenDMXFadeFullAdapter();
			}
			@Override
			public Adapter caseCmd(Cmd object) {
				return createCmdAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXCmd <em>Open DMX Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXCmd
	 * @generated
	 */
	public Adapter createOpenDMXCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXReprogramFirmwareRequestCmd <em>Open DMX Reprogram Firmware Request Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXReprogramFirmwareRequestCmd
	 * @generated
	 */
	public Adapter createOpenDMXReprogramFirmwareRequestCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXProgramFlashPageRequestCmd <em>Open DMX Program Flash Page Request Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXProgramFlashPageRequestCmd
	 * @generated
	 */
	public Adapter createOpenDMXProgramFlashPageRequestCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXProgramFlashPageReply <em>Open DMX Program Flash Page Reply</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXProgramFlashPageReply
	 * @generated
	 */
	public Adapter createOpenDMXProgramFlashPageReplyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXGetWidgetParamRequestCmd <em>Open DMX Get Widget Param Request Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXGetWidgetParamRequestCmd
	 * @generated
	 */
	public Adapter createOpenDMXGetWidgetParamRequestCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXGetWidgetParamsReplyCmd <em>Open DMX Get Widget Params Reply Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXGetWidgetParamsReplyCmd
	 * @generated
	 */
	public Adapter createOpenDMXGetWidgetParamsReplyCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXSetWidgetParamsRequestCmd <em>Open DMX Set Widget Params Request Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXSetWidgetParamsRequestCmd
	 * @generated
	 */
	public Adapter createOpenDMXSetWidgetParamsRequestCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXReceivedPacketsCmd <em>Open DMX Received Packets Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXReceivedPacketsCmd
	 * @generated
	 */
	public Adapter createOpenDMXReceivedPacketsCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXOutputOnlySendDMXPacketsRequestCmd <em>Open DMX Output Only Send DMX Packets Request Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXOutputOnlySendDMXPacketsRequestCmd
	 * @generated
	 */
	public Adapter createOpenDMXOutputOnlySendDMXPacketsRequestCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXSendRDMPacketCmd <em>Open DMX Send RDM Packet Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXSendRDMPacketCmd
	 * @generated
	 */
	public Adapter createOpenDMXSendRDMPacketCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXReceiveDMXCmd <em>Open DMX Receive DMX Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXReceiveDMXCmd
	 * @generated
	 */
	public Adapter createOpenDMXReceiveDMXCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXChangeOfStatePacketCmd <em>Open DMX Change Of State Packet Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXChangeOfStatePacketCmd
	 * @generated
	 */
	public Adapter createOpenDMXChangeOfStatePacketCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXGetWidgetSerialNumberRequestCmd <em>Open DMX Get Widget Serial Number Request Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXGetWidgetSerialNumberRequestCmd
	 * @generated
	 */
	public Adapter createOpenDMXGetWidgetSerialNumberRequestCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXGetWidgetSerialNumberReplyCmd <em>Open DMX Get Widget Serial Number Reply Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXGetWidgetSerialNumberReplyCmd
	 * @generated
	 */
	public Adapter createOpenDMXGetWidgetSerialNumberReplyCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXSendRDMDiscoveryRequestCmd <em>Open DMX Send RDM Discovery Request Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXSendRDMDiscoveryRequestCmd
	 * @generated
	 */
	public Adapter createOpenDMXSendRDMDiscoveryRequestCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXWidget <em>Open DMX Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXWidget
	 * @generated
	 */
	public Adapter createOpenDMXWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXFade <em>Open DMX Fade</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXFade
	 * @generated
	 */
	public Adapter createOpenDMXFadeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeWithStrobe <em>Open DMX Fade With Strobe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeWithStrobe
	 * @generated
	 */
	public Adapter createOpenDMXFadeWithStrobeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeFull <em>Open DMX Fade Full</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeFull
	 * @generated
	 */
	public Adapter createOpenDMXFadeFullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.xqz.model.cmd.Cmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.xqz.model.cmd.Cmd
	 * @generated
	 */
	public Adapter createCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EzdmxAdapterFactory
