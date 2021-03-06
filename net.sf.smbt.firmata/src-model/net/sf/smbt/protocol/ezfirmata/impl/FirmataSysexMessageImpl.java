/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.protocol.ezfirmata.impl;

import net.sf.smbt.midi.ezmidi.impl.SysexMessageImpl;
import net.sf.smbt.protocol.ezfirmata.EzfirmataPackage;
import net.sf.smbt.protocol.ezfirmata.FirmataSysexMessage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Firmata Sysex Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FirmataSysexMessageImpl extends SysexMessageImpl implements FirmataSysexMessage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FirmataSysexMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzfirmataPackage.Literals.FIRMATA_SYSEX_MESSAGE;
	}

} //FirmataSysexMessageImpl
