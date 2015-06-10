/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmojo.impl;

import net.sf.smbt.ezmojo.EZCmdKind;
import net.sf.smbt.ezmojo.EZMojoAgentCmd;
import net.sf.smbt.ezmojo.EzmojoPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EZ Mojo Agent Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZMojoAgentCmdImpl#getCmd <em>Cmd</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZMojoAgentCmdImpl#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EZMojoAgentCmdImpl extends EZMojoCmdImpl implements EZMojoAgentCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EZMojoAgentCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzmojoPackage.Literals.EZ_MOJO_AGENT_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZCmdKind getCmd() {
		return (EZCmdKind)eGet(EzmojoPackage.Literals.EZ_MOJO_AGENT_CMD__CMD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCmd(EZCmdKind newCmd) {
		eSet(EzmojoPackage.Literals.EZ_MOJO_AGENT_CMD__CMD, newCmd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return (String)eGet(EzmojoPackage.Literals.EZ_MOJO_AGENT_CMD__TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		eSet(EzmojoPackage.Literals.EZ_MOJO_AGENT_CMD__TEXT, newText);
	}

} //EZMojoAgentCmdImpl
