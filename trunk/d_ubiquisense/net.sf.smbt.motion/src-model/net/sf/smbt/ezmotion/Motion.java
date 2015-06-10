/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmotion;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Motion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezmotion.Motion#getKind <em>Kind</em>}</li>
 *   <li>{@link net.sf.smbt.ezmotion.Motion#getID <em>ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezmotion.Motion#getCinematic <em>Cinematic</em>}</li>
 *   <li>{@link net.sf.smbt.ezmotion.Motion#getDuration <em>Duration</em>}</li>
 *   <li>{@link net.sf.smbt.ezmotion.Motion#getAmplitude <em>Amplitude</em>}</li>
 *   <li>{@link net.sf.smbt.ezmotion.Motion#getSampleRate <em>Sample Rate</em>}</li>
 *   <li>{@link net.sf.smbt.ezmotion.Motion#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link net.sf.smbt.ezmotion.Motion#getTime <em>Time</em>}</li>
 *   <li>{@link net.sf.smbt.ezmotion.Motion#getDiscretization <em>Discretization</em>}</li>
 *   <li>{@link net.sf.smbt.ezmotion.Motion#getAxis <em>Axis</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezmotion.EzmotionPackage#getMotion()
 * @model
 * @generated
 */
public interface Motion extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.ezmotion.MotionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see net.sf.smbt.ezmotion.MotionKind
	 * @see #setKind(MotionKind)
	 * @see net.sf.smbt.ezmotion.EzmotionPackage#getMotion_Kind()
	 * @model
	 * @generated
	 */
	MotionKind getKind();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmotion.Motion#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see net.sf.smbt.ezmotion.MotionKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(MotionKind value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see net.sf.smbt.ezmotion.EzmotionPackage#getMotion_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmotion.Motion#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Cinematic</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.ezmotion.MotionCinematic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cinematic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cinematic</em>' attribute.
	 * @see net.sf.smbt.ezmotion.MotionCinematic
	 * @see #setCinematic(MotionCinematic)
	 * @see net.sf.smbt.ezmotion.EzmotionPackage#getMotion_Cinematic()
	 * @model
	 * @generated
	 */
	MotionCinematic getCinematic();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmotion.Motion#getCinematic <em>Cinematic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cinematic</em>' attribute.
	 * @see net.sf.smbt.ezmotion.MotionCinematic
	 * @see #getCinematic()
	 * @generated
	 */
	void setCinematic(MotionCinematic value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(long)
	 * @see net.sf.smbt.ezmotion.EzmotionPackage#getMotion_Duration()
	 * @model
	 * @generated
	 */
	long getDuration();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmotion.Motion#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(long value);

	/**
	 * Returns the value of the '<em><b>Amplitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amplitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amplitude</em>' attribute.
	 * @see #setAmplitude(float)
	 * @see net.sf.smbt.ezmotion.EzmotionPackage#getMotion_Amplitude()
	 * @model
	 * @generated
	 */
	float getAmplitude();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmotion.Motion#getAmplitude <em>Amplitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amplitude</em>' attribute.
	 * @see #getAmplitude()
	 * @generated
	 */
	void setAmplitude(float value);

	/**
	 * Returns the value of the '<em><b>Sample Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample Rate</em>' attribute.
	 * @see #setSampleRate(int)
	 * @see net.sf.smbt.ezmotion.EzmotionPackage#getMotion_SampleRate()
	 * @model
	 * @generated
	 */
	int getSampleRate();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmotion.Motion#getSampleRate <em>Sample Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample Rate</em>' attribute.
	 * @see #getSampleRate()
	 * @generated
	 */
	void setSampleRate(int value);

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #setFrequency(float)
	 * @see net.sf.smbt.ezmotion.EzmotionPackage#getMotion_Frequency()
	 * @model
	 * @generated
	 */
	float getFrequency();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmotion.Motion#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(float value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(long)
	 * @see net.sf.smbt.ezmotion.EzmotionPackage#getMotion_Time()
	 * @model
	 * @generated
	 */
	long getTime();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmotion.Motion#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(long value);

	/**
	 * Returns the value of the '<em><b>Discretization</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.ezmotion.MotionValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discretization</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discretization</em>' reference list.
	 * @see net.sf.smbt.ezmotion.EzmotionPackage#getMotion_Discretization()
	 * @model
	 * @generated
	 */
	EList<MotionValue> getDiscretization();

	/**
	 * Returns the value of the '<em><b>Axis</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.ezmotion.MotionAxis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis</em>' attribute.
	 * @see net.sf.smbt.ezmotion.MotionAxis
	 * @see #setAxis(MotionAxis)
	 * @see net.sf.smbt.ezmotion.EzmotionPackage#getMotion_Axis()
	 * @model
	 * @generated
	 */
	MotionAxis getAxis();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmotion.Motion#getAxis <em>Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis</em>' attribute.
	 * @see net.sf.smbt.ezmotion.MotionAxis
	 * @see #getAxis()
	 * @generated
	 */
	void setAxis(MotionAxis value);

} // Motion
