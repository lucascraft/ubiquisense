/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmotion.impl;

import net.sf.smbt.ezmotion.EzmotionPackage;
import net.sf.smbt.ezmotion.MotionValue;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Motion Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezmotion.impl.MotionValueImpl#getX <em>X</em>}</li>
 *   <li>{@link net.sf.smbt.ezmotion.impl.MotionValueImpl#getY <em>Y</em>}</li>
 *   <li>{@link net.sf.smbt.ezmotion.impl.MotionValueImpl#getZ <em>Z</em>}</li>
 *   <li>{@link net.sf.smbt.ezmotion.impl.MotionValueImpl#getXAccel <em>XAccel</em>}</li>
 *   <li>{@link net.sf.smbt.ezmotion.impl.MotionValueImpl#getYAccel <em>YAccel</em>}</li>
 *   <li>{@link net.sf.smbt.ezmotion.impl.MotionValueImpl#getZAccel <em>ZAccel</em>}</li>
 *   <li>{@link net.sf.smbt.ezmotion.impl.MotionValueImpl#getXRot <em>XRot</em>}</li>
 *   <li>{@link net.sf.smbt.ezmotion.impl.MotionValueImpl#getYRot <em>YRot</em>}</li>
 *   <li>{@link net.sf.smbt.ezmotion.impl.MotionValueImpl#getZRot <em>ZRot</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MotionValueImpl extends MinimalEObjectImpl.Container implements MotionValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MotionValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzmotionPackage.Literals.MOTION_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getX() {
		return (Double)eGet(EzmotionPackage.Literals.MOTION_VALUE__X, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(double newX) {
		eSet(EzmotionPackage.Literals.MOTION_VALUE__X, newX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getY() {
		return (Double)eGet(EzmotionPackage.Literals.MOTION_VALUE__Y, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(double newY) {
		eSet(EzmotionPackage.Literals.MOTION_VALUE__Y, newY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getZ() {
		return (Double)eGet(EzmotionPackage.Literals.MOTION_VALUE__Z, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ(double newZ) {
		eSet(EzmotionPackage.Literals.MOTION_VALUE__Z, newZ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getXAccel() {
		return (Float)eGet(EzmotionPackage.Literals.MOTION_VALUE__XACCEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXAccel(float newXAccel) {
		eSet(EzmotionPackage.Literals.MOTION_VALUE__XACCEL, newXAccel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getYAccel() {
		return (Float)eGet(EzmotionPackage.Literals.MOTION_VALUE__YACCEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYAccel(float newYAccel) {
		eSet(EzmotionPackage.Literals.MOTION_VALUE__YACCEL, newYAccel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getZAccel() {
		return (Float)eGet(EzmotionPackage.Literals.MOTION_VALUE__ZACCEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZAccel(float newZAccel) {
		eSet(EzmotionPackage.Literals.MOTION_VALUE__ZACCEL, newZAccel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getXRot() {
		return (Float)eGet(EzmotionPackage.Literals.MOTION_VALUE__XROT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXRot(float newXRot) {
		eSet(EzmotionPackage.Literals.MOTION_VALUE__XROT, newXRot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getYRot() {
		return (Float)eGet(EzmotionPackage.Literals.MOTION_VALUE__YROT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYRot(float newYRot) {
		eSet(EzmotionPackage.Literals.MOTION_VALUE__YROT, newYRot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getZRot() {
		return (Float)eGet(EzmotionPackage.Literals.MOTION_VALUE__ZROT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZRot(float newZRot) {
		eSet(EzmotionPackage.Literals.MOTION_VALUE__ZROT, newZRot);
	}

} //MotionValueImpl
