/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmotion.impl;

import net.sf.smbt.ezmotion.EzmotionPackage;
import net.sf.smbt.ezmotion.Motion;
import net.sf.smbt.ezmotion.MotionAxis;
import net.sf.smbt.ezmotion.MotionCinematic;
import net.sf.smbt.ezmotion.MotionKind;
import net.sf.smbt.ezmotion.MotionValue;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Motion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezmotion.impl.MotionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link net.sf.smbt.ezmotion.impl.MotionImpl#getID <em>ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezmotion.impl.MotionImpl#getCinematic <em>Cinematic</em>}</li>
 *   <li>{@link net.sf.smbt.ezmotion.impl.MotionImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link net.sf.smbt.ezmotion.impl.MotionImpl#getAmplitude <em>Amplitude</em>}</li>
 *   <li>{@link net.sf.smbt.ezmotion.impl.MotionImpl#getSampleRate <em>Sample Rate</em>}</li>
 *   <li>{@link net.sf.smbt.ezmotion.impl.MotionImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link net.sf.smbt.ezmotion.impl.MotionImpl#getTime <em>Time</em>}</li>
 *   <li>{@link net.sf.smbt.ezmotion.impl.MotionImpl#getDiscretization <em>Discretization</em>}</li>
 *   <li>{@link net.sf.smbt.ezmotion.impl.MotionImpl#getAxis <em>Axis</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MotionImpl extends MinimalEObjectImpl.Container implements Motion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MotionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzmotionPackage.Literals.MOTION;
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
	public MotionKind getKind() {
		return (MotionKind)eGet(EzmotionPackage.Literals.MOTION__KIND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(MotionKind newKind) {
		eSet(EzmotionPackage.Literals.MOTION__KIND, newKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return (String)eGet(EzmotionPackage.Literals.MOTION__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		eSet(EzmotionPackage.Literals.MOTION__ID, newID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotionCinematic getCinematic() {
		return (MotionCinematic)eGet(EzmotionPackage.Literals.MOTION__CINEMATIC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCinematic(MotionCinematic newCinematic) {
		eSet(EzmotionPackage.Literals.MOTION__CINEMATIC, newCinematic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDuration() {
		return (Long)eGet(EzmotionPackage.Literals.MOTION__DURATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(long newDuration) {
		eSet(EzmotionPackage.Literals.MOTION__DURATION, newDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAmplitude() {
		return (Float)eGet(EzmotionPackage.Literals.MOTION__AMPLITUDE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmplitude(float newAmplitude) {
		eSet(EzmotionPackage.Literals.MOTION__AMPLITUDE, newAmplitude);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSampleRate() {
		return (Integer)eGet(EzmotionPackage.Literals.MOTION__SAMPLE_RATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSampleRate(int newSampleRate) {
		eSet(EzmotionPackage.Literals.MOTION__SAMPLE_RATE, newSampleRate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFrequency() {
		return (Float)eGet(EzmotionPackage.Literals.MOTION__FREQUENCY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency(float newFrequency) {
		eSet(EzmotionPackage.Literals.MOTION__FREQUENCY, newFrequency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTime() {
		return (Long)eGet(EzmotionPackage.Literals.MOTION__TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(long newTime) {
		eSet(EzmotionPackage.Literals.MOTION__TIME, newTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<MotionValue> getDiscretization() {
		return (EList<MotionValue>)eGet(EzmotionPackage.Literals.MOTION__DISCRETIZATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotionAxis getAxis() {
		return (MotionAxis)eGet(EzmotionPackage.Literals.MOTION__AXIS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxis(MotionAxis newAxis) {
		eSet(EzmotionPackage.Literals.MOTION__AXIS, newAxis);
	}

} //MotionImpl
