/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.eztuio2.impl;

import net.sf.smbt.osc.eztuio2.Eztuio2Package;
import net.sf.smbt.osc.eztuio2.Tuio2RAW;
import net.sf.smbt.osccmd.impl.OscCmdImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tuio2 RAW</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2RAWImpl#getS_id <em>Sid</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2RAWImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2RAWImpl#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Tuio2RAWImpl extends OscCmdImpl implements Tuio2RAW {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tuio2RAWImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eztuio2Package.Literals.TUIO2_RAW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getS_id() {
		return (String)eGet(Eztuio2Package.Literals.TUIO2_RAW__SID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setS_id(String newS_id) {
		eSet(Eztuio2Package.Literals.TUIO2_RAW__SID, newS_id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return (Integer)eGet(Eztuio2Package.Literals.TUIO2_RAW__WIDTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		eSet(Eztuio2Package.Literals.TUIO2_RAW__WIDTH, newWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getData() {
		return (byte[])eGet(Eztuio2Package.Literals.TUIO2_RAW__DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(byte[] newData) {
		eSet(Eztuio2Package.Literals.TUIO2_RAW__DATA, newData);
	}

} //Tuio2RAWImpl
