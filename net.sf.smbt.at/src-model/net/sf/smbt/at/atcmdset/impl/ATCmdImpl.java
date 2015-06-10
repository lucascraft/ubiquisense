/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.at.atcmdset.impl;

import net.sf.smbt.at.atcmdset.ATCmd;
import net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES;
import net.sf.smbt.at.atcmdset.AtcmdsetPackage;
import net.sf.xqz.model.cmd.impl.CmdImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AT Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.at.atcmdset.impl.ATCmdImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link net.sf.smbt.at.atcmdset.impl.ATCmdImpl#getToken <em>Token</em>}</li>
 *   <li>{@link net.sf.smbt.at.atcmdset.impl.ATCmdImpl#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ATCmdImpl extends CmdImpl implements ATCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtcmdsetPackage.Literals.AT_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AT_COMMAND_TYPES getKind() {
		return (AT_COMMAND_TYPES)eGet(AtcmdsetPackage.Literals.AT_CMD__KIND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(AT_COMMAND_TYPES newKind) {
		eSet(AtcmdsetPackage.Literals.AT_CMD__KIND, newKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToken() {
		return (String)eGet(AtcmdsetPackage.Literals.AT_CMD__TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToken(String newToken) {
		eSet(AtcmdsetPackage.Literals.AT_CMD__TOKEN, newToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getData() {
		return (byte[])eGet(AtcmdsetPackage.Literals.AT_CMD__DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(byte[] newData) {
		eSet(AtcmdsetPackage.Literals.AT_CMD__DATA, newData);
	}

} //ATCmdImpl
