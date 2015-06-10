/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package rgbargs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rgbargs.RGBStepNDelayArgs;
import rgbargs.RgbargsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RGB Step NDelay Args</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rgbargs.impl.RGBStepNDelayArgsImpl#getR <em>R</em>}</li>
 *   <li>{@link rgbargs.impl.RGBStepNDelayArgsImpl#getG <em>G</em>}</li>
 *   <li>{@link rgbargs.impl.RGBStepNDelayArgsImpl#getB <em>B</em>}</li>
 *   <li>{@link rgbargs.impl.RGBStepNDelayArgsImpl#isRMotion <em>RMotion</em>}</li>
 *   <li>{@link rgbargs.impl.RGBStepNDelayArgsImpl#isGMotion <em>GMotion</em>}</li>
 *   <li>{@link rgbargs.impl.RGBStepNDelayArgsImpl#isBMotion <em>BMotion</em>}</li>
 *   <li>{@link rgbargs.impl.RGBStepNDelayArgsImpl#getIncrement <em>Increment</em>}</li>
 *   <li>{@link rgbargs.impl.RGBStepNDelayArgsImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link rgbargs.impl.RGBStepNDelayArgsImpl#isRunning <em>Running</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RGBStepNDelayArgsImpl extends MinimalEObjectImpl.Container implements RGBStepNDelayArgs {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RGBStepNDelayArgsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RgbargsPackage.Literals.RGB_STEP_NDELAY_ARGS;
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
	public int getR() {
		return (Integer)eGet(RgbargsPackage.Literals.RGB_STEP_NDELAY_ARGS__R, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR(int newR) {
		eSet(RgbargsPackage.Literals.RGB_STEP_NDELAY_ARGS__R, newR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getG() {
		return (Integer)eGet(RgbargsPackage.Literals.RGB_STEP_NDELAY_ARGS__G, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setG(int newG) {
		eSet(RgbargsPackage.Literals.RGB_STEP_NDELAY_ARGS__G, newG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getB() {
		return (Integer)eGet(RgbargsPackage.Literals.RGB_STEP_NDELAY_ARGS__B, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setB(int newB) {
		eSet(RgbargsPackage.Literals.RGB_STEP_NDELAY_ARGS__B, newB);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRMotion() {
		return (Boolean)eGet(RgbargsPackage.Literals.RGB_STEP_NDELAY_ARGS__RMOTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRMotion(boolean newRMotion) {
		eSet(RgbargsPackage.Literals.RGB_STEP_NDELAY_ARGS__RMOTION, newRMotion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGMotion() {
		return (Boolean)eGet(RgbargsPackage.Literals.RGB_STEP_NDELAY_ARGS__GMOTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGMotion(boolean newGMotion) {
		eSet(RgbargsPackage.Literals.RGB_STEP_NDELAY_ARGS__GMOTION, newGMotion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBMotion() {
		return (Boolean)eGet(RgbargsPackage.Literals.RGB_STEP_NDELAY_ARGS__BMOTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBMotion(boolean newBMotion) {
		eSet(RgbargsPackage.Literals.RGB_STEP_NDELAY_ARGS__BMOTION, newBMotion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIncrement() {
		return (Double)eGet(RgbargsPackage.Literals.RGB_STEP_NDELAY_ARGS__INCREMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrement(double newIncrement) {
		eSet(RgbargsPackage.Literals.RGB_STEP_NDELAY_ARGS__INCREMENT, newIncrement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDelay() {
		return (Long)eGet(RgbargsPackage.Literals.RGB_STEP_NDELAY_ARGS__DELAY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelay(long newDelay) {
		eSet(RgbargsPackage.Literals.RGB_STEP_NDELAY_ARGS__DELAY, newDelay);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRunning() {
		return (Boolean)eGet(RgbargsPackage.Literals.RGB_STEP_NDELAY_ARGS__RUNNING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunning(boolean newRunning) {
		eSet(RgbargsPackage.Literals.RGB_STEP_NDELAY_ARGS__RUNNING, newRunning);
	}

} //RGBStepNDelayArgsImpl
