/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osccmd.impl;

import net.sf.smbt.osccmd.OscCmd;
import net.sf.smbt.osccmd.OsccmdPackage;
import net.sf.xqz.engine.cmd.utils.CmdUtil;
import net.sf.xqz.model.cmd.impl.CmdImpl;

import org.eclipse.emf.ecore.EClass;

import com.illposed.osc.OSCPacket;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Osc Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.osccmd.impl.OscCmdImpl#getMsg <em>Msg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OscCmdImpl extends CmdImpl implements OscCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OscCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OsccmdPackage.Literals.OSC_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSCPacket getMsg() {
		return (OSCPacket)eGet(OsccmdPackage.Literals.OSC_CMD__MSG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMsg(OSCPacket newMsg) {
		eSet(OsccmdPackage.Literals.OSC_CMD__MSG, newMsg);
	}
	
	@Override
	public String toString() {
		return CmdUtil.INSTANCE.getFrameHexInfo(getMsg().getByteArray());
	}

} //OscCmdImpl
