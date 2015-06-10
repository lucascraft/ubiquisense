/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.at.atcmdset.impl;

import net.sf.smbt.at.atcmdset.ATRetCmd;
import net.sf.smbt.at.atcmdset.AT_RET_CODES;
import net.sf.smbt.at.atcmdset.AT_STATUS;
import net.sf.smbt.at.atcmdset.AtcmdsetPackage;
import net.sf.xqz.model.cmd.impl.CmdImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AT Ret Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.at.atcmdset.impl.ATRetCmdImpl#getCode <em>Code</em>}</li>
 *   <li>{@link net.sf.smbt.at.atcmdset.impl.ATRetCmdImpl#getData <em>Data</em>}</li>
 *   <li>{@link net.sf.smbt.at.atcmdset.impl.ATRetCmdImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link net.sf.smbt.at.atcmdset.impl.ATRetCmdImpl#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ATRetCmdImpl extends CmdImpl implements ATRetCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATRetCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtcmdsetPackage.Literals.AT_RET_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AT_RET_CODES getCode() {
		return (AT_RET_CODES)eGet(AtcmdsetPackage.Literals.AT_RET_CMD__CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(AT_RET_CODES newCode) {
		eSet(AtcmdsetPackage.Literals.AT_RET_CMD__CODE, newCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getData() {
		return (byte[])eGet(AtcmdsetPackage.Literals.AT_RET_CMD__DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(byte[] newData) {
		eSet(AtcmdsetPackage.Literals.AT_RET_CMD__DATA, newData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessage() {
		return (String)eGet(AtcmdsetPackage.Literals.AT_RET_CMD__MESSAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(String newMessage) {
		eSet(AtcmdsetPackage.Literals.AT_RET_CMD__MESSAGE, newMessage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AT_STATUS getStatus() {
		return (AT_STATUS)eGet(AtcmdsetPackage.Literals.AT_RET_CMD__STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(AT_STATUS newStatus) {
		eSet(AtcmdsetPackage.Literals.AT_RET_CMD__STATUS, newStatus);
	}

} //ATRetCmdImpl
