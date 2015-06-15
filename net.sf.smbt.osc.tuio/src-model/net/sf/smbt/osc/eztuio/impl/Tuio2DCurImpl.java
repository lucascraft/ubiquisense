/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.eztuio.impl;

import net.sf.reactivision.tuio.TuioCursor;
import net.sf.smbt.osc.eztuio.EztuioPackage;
import net.sf.smbt.osc.eztuio.STATE;
import net.sf.smbt.osc.eztuio.Tuio2DCur;
import net.sf.smbt.osccmd.impl.OscRcvCmdImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tuio2 DCur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.eztuio.impl.Tuio2DCurImpl#getS_id <em>Sid</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio.impl.Tuio2DCurImpl#getXpos <em>Xpos</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio.impl.Tuio2DCurImpl#getYpos <em>Ypos</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio.impl.Tuio2DCurImpl#getXspeed <em>Xspeed</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio.impl.Tuio2DCurImpl#getYspeed <em>Yspeed</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio.impl.Tuio2DCurImpl#getMaccel <em>Maccel</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio.impl.Tuio2DCurImpl#getTuioCursor <em>Tuio Cursor</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio.impl.Tuio2DCurImpl#getUpdateTime <em>Update Time</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio.impl.Tuio2DCurImpl#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Tuio2DCurImpl extends OscRcvCmdImpl implements Tuio2DCur {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tuio2DCurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EztuioPackage.Literals.TUIO2_DCUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getS_id() {
		return (Long)eGet(EztuioPackage.Literals.TUIO2_DCUR__SID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setS_id(long newS_id) {
		eSet(EztuioPackage.Literals.TUIO2_DCUR__SID, newS_id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getXpos() {
		return (Float)eGet(EztuioPackage.Literals.TUIO2_DCUR__XPOS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXpos(float newXpos) {
		eSet(EztuioPackage.Literals.TUIO2_DCUR__XPOS, newXpos);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getYpos() {
		return (Float)eGet(EztuioPackage.Literals.TUIO2_DCUR__YPOS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYpos(float newYpos) {
		eSet(EztuioPackage.Literals.TUIO2_DCUR__YPOS, newYpos);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getXspeed() {
		return (Float)eGet(EztuioPackage.Literals.TUIO2_DCUR__XSPEED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXspeed(float newXspeed) {
		eSet(EztuioPackage.Literals.TUIO2_DCUR__XSPEED, newXspeed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getYspeed() {
		return (Float)eGet(EztuioPackage.Literals.TUIO2_DCUR__YSPEED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYspeed(float newYspeed) {
		eSet(EztuioPackage.Literals.TUIO2_DCUR__YSPEED, newYspeed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaccel() {
		return (Float)eGet(EztuioPackage.Literals.TUIO2_DCUR__MACCEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaccel(float newMaccel) {
		eSet(EztuioPackage.Literals.TUIO2_DCUR__MACCEL, newMaccel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuioCursor getTuioCursor() {
		return (TuioCursor)eGet(EztuioPackage.Literals.TUIO2_DCUR__TUIO_CURSOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTuioCursor(TuioCursor newTuioCursor) {
		eSet(EztuioPackage.Literals.TUIO2_DCUR__TUIO_CURSOR, newTuioCursor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getUpdateTime() {
		return (Long)eGet(EztuioPackage.Literals.TUIO2_DCUR__UPDATE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateTime(long newUpdateTime) {
		eSet(EztuioPackage.Literals.TUIO2_DCUR__UPDATE_TIME, newUpdateTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STATE getState() {
		return (STATE)eGet(EztuioPackage.Literals.TUIO2_DCUR__STATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(STATE newState) {
		eSet(EztuioPackage.Literals.TUIO2_DCUR__STATE, newState);
	}

} //Tuio2DCurImpl
