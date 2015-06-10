/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.protocol.ezfirmata.impl;

import net.sf.smbt.midi.ezmidi.impl.AbstractMidiCmdImpl;
import net.sf.smbt.protocol.ezfirmata.EzfirmataPackage;
import net.sf.smbt.protocol.ezfirmata.FirmataReportAnalogPinCmd;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Firmata Report Analog Pin Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FirmataReportAnalogPinCmdImpl extends AbstractMidiCmdImpl implements FirmataReportAnalogPinCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FirmataReportAnalogPinCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzfirmataPackage.Literals.FIRMATA_REPORT_ANALOG_PIN_CMD;
	}

} //FirmataReportAnalogPinCmdImpl
