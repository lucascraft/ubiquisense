/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.eztuio2.impl;

import net.sf.smbt.osc.eztuio2.Eztuio2Package;
import net.sf.smbt.osc.eztuio2.Tuio2FRM;
import net.sf.smbt.osccmd.impl.OscCmdImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tuio2 FRM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2FRMImpl#getF_id <em>Fid</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2FRMImpl#getTime <em>Time</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2FRMImpl#getApp <em>App</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2FRMImpl#getAddr <em>Addr</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2FRMImpl#getDim <em>Dim</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Tuio2FRMImpl extends OscCmdImpl implements Tuio2FRM {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tuio2FRMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eztuio2Package.Literals.TUIO2_FRM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getF_id() {
		return (String)eGet(Eztuio2Package.Literals.TUIO2_FRM__FID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF_id(String newF_id) {
		eSet(Eztuio2Package.Literals.TUIO2_FRM__FID, newF_id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTime() {
		return (Long)eGet(Eztuio2Package.Literals.TUIO2_FRM__TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(long newTime) {
		eSet(Eztuio2Package.Literals.TUIO2_FRM__TIME, newTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApp() {
		return (String)eGet(Eztuio2Package.Literals.TUIO2_FRM__APP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApp(String newApp) {
		eSet(Eztuio2Package.Literals.TUIO2_FRM__APP, newApp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddr() {
		return (String)eGet(Eztuio2Package.Literals.TUIO2_FRM__ADDR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddr(String newAddr) {
		eSet(Eztuio2Package.Literals.TUIO2_FRM__ADDR, newAddr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDim() {
		return (Integer)eGet(Eztuio2Package.Literals.TUIO2_FRM__DIM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDim(int newDim) {
		eSet(Eztuio2Package.Literals.TUIO2_FRM__DIM, newDim);
	}

} //Tuio2FRMImpl
