/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.protocol.ezfirmata.impl;

import net.sf.smbt.midi.ezmidi.impl.SysexMessageImpl;
import net.sf.smbt.protocol.ezfirmata.EzfirmataPackage;
import net.sf.smbt.protocol.ezfirmata.SysexStart;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sysex Start</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SysexStartImpl extends SysexMessageImpl implements SysexStart {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SysexStartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzfirmataPackage.Literals.SYSEX_START;
	}

} //SysexStartImpl
