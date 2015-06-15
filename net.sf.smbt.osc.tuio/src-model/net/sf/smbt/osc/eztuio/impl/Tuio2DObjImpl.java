/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.eztuio.impl;

import net.sf.reactivision.tuio.TuioObject;
import net.sf.smbt.osc.eztuio.EztuioPackage;
import net.sf.smbt.osc.eztuio.STATE;
import net.sf.smbt.osc.eztuio.Tuio2DObj;
import net.sf.smbt.osccmd.impl.OscRcvCmdImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tuio2 DObj</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.eztuio.impl.Tuio2DObjImpl#getS_id <em>Sid</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio.impl.Tuio2DObjImpl#getF_id <em>Fid</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio.impl.Tuio2DObjImpl#getXpos <em>Xpos</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio.impl.Tuio2DObjImpl#getYpos <em>Ypos</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio.impl.Tuio2DObjImpl#getAngle <em>Angle</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio.impl.Tuio2DObjImpl#getXspeed <em>Xspeed</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio.impl.Tuio2DObjImpl#getYspeed <em>Yspeed</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio.impl.Tuio2DObjImpl#getRspeed <em>Rspeed</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio.impl.Tuio2DObjImpl#getMaccel <em>Maccel</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio.impl.Tuio2DObjImpl#getRaccel <em>Raccel</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio.impl.Tuio2DObjImpl#getTuioObject <em>Tuio Object</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio.impl.Tuio2DObjImpl#getUpdateTime <em>Update Time</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio.impl.Tuio2DObjImpl#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Tuio2DObjImpl extends OscRcvCmdImpl implements Tuio2DObj {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tuio2DObjImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EztuioPackage.Literals.TUIO2_DOBJ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getS_id() {
		return (Long)eGet(EztuioPackage.Literals.TUIO2_DOBJ__SID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setS_id(long newS_id) {
		eSet(EztuioPackage.Literals.TUIO2_DOBJ__SID, newS_id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getF_id() {
		return (Integer)eGet(EztuioPackage.Literals.TUIO2_DOBJ__FID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setF_id(int newF_id) {
		eSet(EztuioPackage.Literals.TUIO2_DOBJ__FID, newF_id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getXpos() {
		return (Float)eGet(EztuioPackage.Literals.TUIO2_DOBJ__XPOS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXpos(float newXpos) {
		eSet(EztuioPackage.Literals.TUIO2_DOBJ__XPOS, newXpos);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getYpos() {
		return (Float)eGet(EztuioPackage.Literals.TUIO2_DOBJ__YPOS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYpos(float newYpos) {
		eSet(EztuioPackage.Literals.TUIO2_DOBJ__YPOS, newYpos);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAngle() {
		return (Float)eGet(EztuioPackage.Literals.TUIO2_DOBJ__ANGLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngle(float newAngle) {
		eSet(EztuioPackage.Literals.TUIO2_DOBJ__ANGLE, newAngle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getXspeed() {
		return (Float)eGet(EztuioPackage.Literals.TUIO2_DOBJ__XSPEED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXspeed(float newXspeed) {
		eSet(EztuioPackage.Literals.TUIO2_DOBJ__XSPEED, newXspeed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getYspeed() {
		return (Float)eGet(EztuioPackage.Literals.TUIO2_DOBJ__YSPEED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYspeed(float newYspeed) {
		eSet(EztuioPackage.Literals.TUIO2_DOBJ__YSPEED, newYspeed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRspeed() {
		return (Float)eGet(EztuioPackage.Literals.TUIO2_DOBJ__RSPEED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRspeed(float newRspeed) {
		eSet(EztuioPackage.Literals.TUIO2_DOBJ__RSPEED, newRspeed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaccel() {
		return (Float)eGet(EztuioPackage.Literals.TUIO2_DOBJ__MACCEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaccel(float newMaccel) {
		eSet(EztuioPackage.Literals.TUIO2_DOBJ__MACCEL, newMaccel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRaccel() {
		return (Float)eGet(EztuioPackage.Literals.TUIO2_DOBJ__RACCEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRaccel(float newRaccel) {
		eSet(EztuioPackage.Literals.TUIO2_DOBJ__RACCEL, newRaccel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuioObject getTuioObject() {
		return (TuioObject)eGet(EztuioPackage.Literals.TUIO2_DOBJ__TUIO_OBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTuioObject(TuioObject newTuioObject) {
		eSet(EztuioPackage.Literals.TUIO2_DOBJ__TUIO_OBJECT, newTuioObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getUpdateTime() {
		return (Long)eGet(EztuioPackage.Literals.TUIO2_DOBJ__UPDATE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateTime(long newUpdateTime) {
		eSet(EztuioPackage.Literals.TUIO2_DOBJ__UPDATE_TIME, newUpdateTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STATE getState() {
		return (STATE)eGet(EztuioPackage.Literals.TUIO2_DOBJ__STATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(STATE newState) {
		eSet(EztuioPackage.Literals.TUIO2_DOBJ__STATE, newState);
	}

} //Tuio2DObjImpl
