/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmojo.impl;

import net.sf.smbt.ezmojo.EZMojoCmd;
import net.sf.smbt.ezmojo.EZMojoKind;
import net.sf.smbt.ezmojo.EZMojoTarget;
import net.sf.smbt.ezmojo.EzmojoPackage;
import net.sf.smbt.osccmd.OscCmd;
import net.sf.xqz.model.cmd.impl.CmdImpl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EZ Mojo Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZMojoCmdImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZMojoCmdImpl#getOsc <em>Osc</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZMojoCmdImpl#getTargets <em>Targets</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZMojoCmdImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EZMojoCmdImpl extends CmdImpl implements EZMojoCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EZMojoCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzmojoPackage.Literals.EZ_MOJO_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZMojoKind getKind() {
		return (EZMojoKind)eGet(EzmojoPackage.Literals.EZ_MOJO_CMD__KIND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(EZMojoKind newKind) {
		eSet(EzmojoPackage.Literals.EZ_MOJO_CMD__KIND, newKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscCmd getOsc() {
		return (OscCmd)eGet(EzmojoPackage.Literals.EZ_MOJO_CMD__OSC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsc(OscCmd newOsc) {
		eSet(EzmojoPackage.Literals.EZ_MOJO_CMD__OSC, newOsc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EZMojoTarget> getTargets() {
		return (EList<EZMojoTarget>)eGet(EzmojoPackage.Literals.EZ_MOJO_CMD__TARGETS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProtocol() {
		return (String)eGet(EzmojoPackage.Literals.EZ_MOJO_CMD__PROTOCOL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(String newProtocol) {
		eSet(EzmojoPackage.Literals.EZ_MOJO_CMD__PROTOCOL, newProtocol);
	}

} //EZMojoCmdImpl
