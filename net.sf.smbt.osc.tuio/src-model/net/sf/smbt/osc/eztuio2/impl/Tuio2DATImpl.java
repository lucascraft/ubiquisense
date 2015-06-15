/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.eztuio2.impl;

import net.sf.smbt.osc.eztuio2.Eztuio2Package;
import net.sf.smbt.osc.eztuio2.Tuio2DAT;
import net.sf.smbt.osccmd.impl.OscCmdImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tuio2 DAT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2DATImpl#getS_id <em>Sid</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2DATImpl#getMime <em>Mime</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2DATImpl#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Tuio2DATImpl extends OscCmdImpl implements Tuio2DAT {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tuio2DATImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eztuio2Package.Literals.TUIO2_DAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getS_id() {
		return (String)eGet(Eztuio2Package.Literals.TUIO2_DAT__SID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setS_id(String newS_id) {
		eSet(Eztuio2Package.Literals.TUIO2_DAT__SID, newS_id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMime() {
		return (String)eGet(Eztuio2Package.Literals.TUIO2_DAT__MIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMime(String newMime) {
		eSet(Eztuio2Package.Literals.TUIO2_DAT__MIME, newMime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getData() {
		return (byte[])eGet(Eztuio2Package.Literals.TUIO2_DAT__DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(byte[] newData) {
		eSet(Eztuio2Package.Literals.TUIO2_DAT__DATA, newData);
	}

} //Tuio2DATImpl
