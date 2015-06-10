/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.protocol.ezfirmata.util;

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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.protocol.ezfirmata.EzfirmataPackage
 * @generated
 */
public class EzfirmataAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EzfirmataPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzfirmataAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EzfirmataPackage.eINSTANCE;
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
	protected EzfirmataSwitch<Adapter> modelSwitch =
		new EzfirmataSwitch<Adapter>() {
			@Override
			public Adapter caseFirmataCmd(FirmataCmd object) {
				return createFirmataCmdAdapter();
			}
			@Override
			public Adapter caseFirmataReportDigitalPinCmd(FirmataReportDigitalPinCmd object) {
				return createFirmataReportDigitalPinCmdAdapter();
			}
			@Override
			public Adapter caseFirmataReportAnalogPinCmd(FirmataReportAnalogPinCmd object) {
				return createFirmataReportAnalogPinCmdAdapter();
			}
			@Override
			public Adapter caseFirmataSetPinModeCmd(FirmataSetPinModeCmd object) {
				return createFirmataSetPinModeCmdAdapter();
			}
			@Override
			public Adapter caseFirmataProtocolVersionCmd(FirmataProtocolVersionCmd object) {
				return createFirmataProtocolVersionCmdAdapter();
			}
			@Override
			public Adapter caseFirmataSystemResetCmd(FirmataSystemResetCmd object) {
				return createFirmataSystemResetCmdAdapter();
			}
			@Override
			public Adapter caseFirmataAnalogIOMsgCmd(FirmataAnalogIOMsgCmd object) {
				return createFirmataAnalogIOMsgCmdAdapter();
			}
			@Override
			public Adapter caseFirmataDigitalIOMsgCmd(FirmataDigitalIOMsgCmd object) {
				return createFirmataDigitalIOMsgCmdAdapter();
			}
			@Override
			public Adapter caseSysexStart(SysexStart object) {
				return createSysexStartAdapter();
			}
			@Override
			public Adapter caseSysexStop(SysexStop object) {
				return createSysexStopAdapter();
			}
			@Override
			public Adapter caseFirmataSysexMessage(FirmataSysexMessage object) {
				return createFirmataSysexMessageAdapter();
			}
			@Override
			public Adapter caseFirmataCapabilitiesCmd(FirmataCapabilitiesCmd object) {
				return createFirmataCapabilitiesCmdAdapter();
			}
			@Override
			public Adapter caseFirmataPinStateResponse(FirmataPinStateResponse object) {
				return createFirmataPinStateResponseAdapter();
			}
			@Override
			public Adapter caseCmd(Cmd object) {
				return createCmdAdapter();
			}
			@Override
			public Adapter caseAbstractMidiCmd(AbstractMidiCmd object) {
				return createAbstractMidiCmdAdapter();
			}
			@Override
			public Adapter caseDSLMidiMessage(DSLMidiMessage object) {
				return createDSLMidiMessageAdapter();
			}
			@Override
			public Adapter caseSysexMessage(SysexMessage object) {
				return createSysexMessageAdapter();
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
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.protocol.ezfirmata.FirmataCmd <em>Firmata Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.protocol.ezfirmata.FirmataCmd
	 * @generated
	 */
	public Adapter createFirmataCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.protocol.ezfirmata.FirmataReportDigitalPinCmd <em>Firmata Report Digital Pin Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.protocol.ezfirmata.FirmataReportDigitalPinCmd
	 * @generated
	 */
	public Adapter createFirmataReportDigitalPinCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.protocol.ezfirmata.FirmataReportAnalogPinCmd <em>Firmata Report Analog Pin Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.protocol.ezfirmata.FirmataReportAnalogPinCmd
	 * @generated
	 */
	public Adapter createFirmataReportAnalogPinCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.protocol.ezfirmata.FirmataSetPinModeCmd <em>Firmata Set Pin Mode Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.protocol.ezfirmata.FirmataSetPinModeCmd
	 * @generated
	 */
	public Adapter createFirmataSetPinModeCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.protocol.ezfirmata.FirmataProtocolVersionCmd <em>Firmata Protocol Version Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.protocol.ezfirmata.FirmataProtocolVersionCmd
	 * @generated
	 */
	public Adapter createFirmataProtocolVersionCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.protocol.ezfirmata.FirmataSystemResetCmd <em>Firmata System Reset Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.protocol.ezfirmata.FirmataSystemResetCmd
	 * @generated
	 */
	public Adapter createFirmataSystemResetCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.protocol.ezfirmata.FirmataAnalogIOMsgCmd <em>Firmata Analog IO Msg Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.protocol.ezfirmata.FirmataAnalogIOMsgCmd
	 * @generated
	 */
	public Adapter createFirmataAnalogIOMsgCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.protocol.ezfirmata.FirmataDigitalIOMsgCmd <em>Firmata Digital IO Msg Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.protocol.ezfirmata.FirmataDigitalIOMsgCmd
	 * @generated
	 */
	public Adapter createFirmataDigitalIOMsgCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.protocol.ezfirmata.SysexStart <em>Sysex Start</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.protocol.ezfirmata.SysexStart
	 * @generated
	 */
	public Adapter createSysexStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.protocol.ezfirmata.SysexStop <em>Sysex Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.protocol.ezfirmata.SysexStop
	 * @generated
	 */
	public Adapter createSysexStopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.protocol.ezfirmata.FirmataSysexMessage <em>Firmata Sysex Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.protocol.ezfirmata.FirmataSysexMessage
	 * @generated
	 */
	public Adapter createFirmataSysexMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.protocol.ezfirmata.FirmataCapabilitiesCmd <em>Firmata Capabilities Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.protocol.ezfirmata.FirmataCapabilitiesCmd
	 * @generated
	 */
	public Adapter createFirmataCapabilitiesCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.protocol.ezfirmata.FirmataPinStateResponse <em>Firmata Pin State Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.protocol.ezfirmata.FirmataPinStateResponse
	 * @generated
	 */
	public Adapter createFirmataPinStateResponseAdapter() {
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
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.midi.ezmidi.AbstractMidiCmd <em>Abstract Midi Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.midi.ezmidi.AbstractMidiCmd
	 * @generated
	 */
	public Adapter createAbstractMidiCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.midi.ezmidi.DSLMidiMessage <em>DSL Midi Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.midi.ezmidi.DSLMidiMessage
	 * @generated
	 */
	public Adapter createDSLMidiMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.midi.ezmidi.SysexMessage <em>Sysex Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.midi.ezmidi.SysexMessage
	 * @generated
	 */
	public Adapter createSysexMessageAdapter() {
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

} //EzfirmataAdapterFactory
