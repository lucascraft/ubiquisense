/**
 * <copyright>
 * </copyright>
 *
 * $Id: BlinkMCmdImpl.java,v 1.2 2009/01/20 07:06:03 lucascraft Exp $
 */
package net.sf.smbt.commands.impl;

import net.sf.smbt.blinkm.cmd.injection.BlinkMUtil;
import net.sf.smbt.commands.BlinkMCmd;
import net.sf.smbt.commands.CommandsPackage;
import net.sf.smbt.commands.FLAG;
import net.sf.xqz.engine.cmd.utils.CmdUtil;
import net.sf.xqz.model.cmd.impl.CmdImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Blink MCmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.commands.impl.BlinkMCmdImpl#getCmdByte <em>Cmd Byte</em>}</li>
 *   <li>{@link net.sf.smbt.commands.impl.BlinkMCmdImpl#getCmdChar <em>Cmd Char</em>}</li>
 *   <li>{@link net.sf.smbt.commands.impl.BlinkMCmdImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link net.sf.smbt.commands.impl.BlinkMCmdImpl#getRetValues <em>Ret Values</em>}</li>
 *   <li>{@link net.sf.smbt.commands.impl.BlinkMCmdImpl#getAddr <em>Addr</em>}</li>
 *   <li>{@link net.sf.smbt.commands.impl.BlinkMCmdImpl#getFlag <em>Flag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlinkMCmdImpl extends CmdImpl implements BlinkMCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlinkMCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommandsPackage.Literals.BLINK_MCMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getCmdByte() {
		return (Byte)eGet(CommandsPackage.Literals.BLINK_MCMD__CMD_BYTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCmdByte(byte newCmdByte) {
		eSet(CommandsPackage.Literals.BLINK_MCMD__CMD_BYTE, newCmdByte);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getCmdChar() {
		return (Byte)eGet(CommandsPackage.Literals.BLINK_MCMD__CMD_CHAR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCmdChar(byte newCmdChar) {
		eSet(CommandsPackage.Literals.BLINK_MCMD__CMD_CHAR, newCmdChar);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getArguments() {
		return (byte[])eGet(CommandsPackage.Literals.BLINK_MCMD__ARGUMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArguments(byte[] newArguments) {
		eSet(CommandsPackage.Literals.BLINK_MCMD__ARGUMENTS, newArguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getRetValues() {
		return (byte[])eGet(CommandsPackage.Literals.BLINK_MCMD__RET_VALUES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetValues(byte[] newRetValues) {
		eSet(CommandsPackage.Literals.BLINK_MCMD__RET_VALUES, newRetValues);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getAddr() {
		return (Byte)eGet(CommandsPackage.Literals.BLINK_MCMD__ADDR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddr(byte newAddr) {
		eSet(CommandsPackage.Literals.BLINK_MCMD__ADDR, newAddr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FLAG getFlag() {
		return (FLAG)eGet(CommandsPackage.Literals.BLINK_MCMD__FLAG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlag(FLAG newFlag) {
		eSet(CommandsPackage.Literals.BLINK_MCMD__FLAG, newFlag);
	}
	
	@Override
	public String toString() {
		return BlinkMUtil.INSTANCE.getPhysicFrameInfo(this);
	}


} //BlinkMCmdImpl
