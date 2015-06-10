/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmotion;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezmotion.EzmotionFactory
 * @model kind="package"
 * @generated
 */
public interface EzmotionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ezmotion";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ezmotion/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ezmotion";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzmotionPackage eINSTANCE = net.sf.smbt.ezmotion.impl.EzmotionPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezmotion.impl.MotionImpl <em>Motion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezmotion.impl.MotionImpl
	 * @see net.sf.smbt.ezmotion.impl.EzmotionPackageImpl#getMotion()
	 * @generated
	 */
	int MOTION = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION__KIND = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION__ID = 1;

	/**
	 * The feature id for the '<em><b>Cinematic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION__CINEMATIC = 2;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION__DURATION = 3;

	/**
	 * The feature id for the '<em><b>Amplitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION__AMPLITUDE = 4;

	/**
	 * The feature id for the '<em><b>Sample Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION__SAMPLE_RATE = 5;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION__FREQUENCY = 6;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION__TIME = 7;

	/**
	 * The feature id for the '<em><b>Discretization</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION__DISCRETIZATION = 8;

	/**
	 * The feature id for the '<em><b>Axis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION__AXIS = 9;

	/**
	 * The number of structural features of the '<em>Motion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezmotion.impl.MotionValueImpl <em>Motion Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezmotion.impl.MotionValueImpl
	 * @see net.sf.smbt.ezmotion.impl.EzmotionPackageImpl#getMotionValue()
	 * @generated
	 */
	int MOTION_VALUE = 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_VALUE__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_VALUE__Y = 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_VALUE__Z = 2;

	/**
	 * The feature id for the '<em><b>XAccel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_VALUE__XACCEL = 3;

	/**
	 * The feature id for the '<em><b>YAccel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_VALUE__YACCEL = 4;

	/**
	 * The feature id for the '<em><b>ZAccel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_VALUE__ZACCEL = 5;

	/**
	 * The feature id for the '<em><b>XRot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_VALUE__XROT = 6;

	/**
	 * The feature id for the '<em><b>YRot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_VALUE__YROT = 7;

	/**
	 * The feature id for the '<em><b>ZRot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_VALUE__ZROT = 8;

	/**
	 * The number of structural features of the '<em>Motion Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_VALUE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezmotion.MotionKind <em>Motion Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezmotion.MotionKind
	 * @see net.sf.smbt.ezmotion.impl.EzmotionPackageImpl#getMotionKind()
	 * @generated
	 */
	int MOTION_KIND = 2;


	/**
	 * The meta object id for the '{@link net.sf.smbt.ezmotion.MotionCinematic <em>Motion Cinematic</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezmotion.MotionCinematic
	 * @see net.sf.smbt.ezmotion.impl.EzmotionPackageImpl#getMotionCinematic()
	 * @generated
	 */
	int MOTION_CINEMATIC = 3;


	/**
	 * The meta object id for the '{@link net.sf.smbt.ezmotion.MotionAxis <em>Motion Axis</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezmotion.MotionAxis
	 * @see net.sf.smbt.ezmotion.impl.EzmotionPackageImpl#getMotionAxis()
	 * @generated
	 */
	int MOTION_AXIS = 4;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezmotion.Motion <em>Motion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motion</em>'.
	 * @see net.sf.smbt.ezmotion.Motion
	 * @generated
	 */
	EClass getMotion();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmotion.Motion#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see net.sf.smbt.ezmotion.Motion#getKind()
	 * @see #getMotion()
	 * @generated
	 */
	EAttribute getMotion_Kind();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmotion.Motion#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see net.sf.smbt.ezmotion.Motion#getID()
	 * @see #getMotion()
	 * @generated
	 */
	EAttribute getMotion_ID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmotion.Motion#getCinematic <em>Cinematic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cinematic</em>'.
	 * @see net.sf.smbt.ezmotion.Motion#getCinematic()
	 * @see #getMotion()
	 * @generated
	 */
	EAttribute getMotion_Cinematic();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmotion.Motion#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see net.sf.smbt.ezmotion.Motion#getDuration()
	 * @see #getMotion()
	 * @generated
	 */
	EAttribute getMotion_Duration();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmotion.Motion#getAmplitude <em>Amplitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amplitude</em>'.
	 * @see net.sf.smbt.ezmotion.Motion#getAmplitude()
	 * @see #getMotion()
	 * @generated
	 */
	EAttribute getMotion_Amplitude();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmotion.Motion#getSampleRate <em>Sample Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sample Rate</em>'.
	 * @see net.sf.smbt.ezmotion.Motion#getSampleRate()
	 * @see #getMotion()
	 * @generated
	 */
	EAttribute getMotion_SampleRate();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmotion.Motion#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see net.sf.smbt.ezmotion.Motion#getFrequency()
	 * @see #getMotion()
	 * @generated
	 */
	EAttribute getMotion_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmotion.Motion#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see net.sf.smbt.ezmotion.Motion#getTime()
	 * @see #getMotion()
	 * @generated
	 */
	EAttribute getMotion_Time();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.ezmotion.Motion#getDiscretization <em>Discretization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Discretization</em>'.
	 * @see net.sf.smbt.ezmotion.Motion#getDiscretization()
	 * @see #getMotion()
	 * @generated
	 */
	EReference getMotion_Discretization();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmotion.Motion#getAxis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis</em>'.
	 * @see net.sf.smbt.ezmotion.Motion#getAxis()
	 * @see #getMotion()
	 * @generated
	 */
	EAttribute getMotion_Axis();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezmotion.MotionValue <em>Motion Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motion Value</em>'.
	 * @see net.sf.smbt.ezmotion.MotionValue
	 * @generated
	 */
	EClass getMotionValue();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmotion.MotionValue#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see net.sf.smbt.ezmotion.MotionValue#getX()
	 * @see #getMotionValue()
	 * @generated
	 */
	EAttribute getMotionValue_X();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmotion.MotionValue#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see net.sf.smbt.ezmotion.MotionValue#getY()
	 * @see #getMotionValue()
	 * @generated
	 */
	EAttribute getMotionValue_Y();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmotion.MotionValue#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see net.sf.smbt.ezmotion.MotionValue#getZ()
	 * @see #getMotionValue()
	 * @generated
	 */
	EAttribute getMotionValue_Z();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmotion.MotionValue#getXAccel <em>XAccel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XAccel</em>'.
	 * @see net.sf.smbt.ezmotion.MotionValue#getXAccel()
	 * @see #getMotionValue()
	 * @generated
	 */
	EAttribute getMotionValue_XAccel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmotion.MotionValue#getYAccel <em>YAccel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YAccel</em>'.
	 * @see net.sf.smbt.ezmotion.MotionValue#getYAccel()
	 * @see #getMotionValue()
	 * @generated
	 */
	EAttribute getMotionValue_YAccel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmotion.MotionValue#getZAccel <em>ZAccel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZAccel</em>'.
	 * @see net.sf.smbt.ezmotion.MotionValue#getZAccel()
	 * @see #getMotionValue()
	 * @generated
	 */
	EAttribute getMotionValue_ZAccel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmotion.MotionValue#getXRot <em>XRot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XRot</em>'.
	 * @see net.sf.smbt.ezmotion.MotionValue#getXRot()
	 * @see #getMotionValue()
	 * @generated
	 */
	EAttribute getMotionValue_XRot();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmotion.MotionValue#getYRot <em>YRot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YRot</em>'.
	 * @see net.sf.smbt.ezmotion.MotionValue#getYRot()
	 * @see #getMotionValue()
	 * @generated
	 */
	EAttribute getMotionValue_YRot();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmotion.MotionValue#getZRot <em>ZRot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZRot</em>'.
	 * @see net.sf.smbt.ezmotion.MotionValue#getZRot()
	 * @see #getMotionValue()
	 * @generated
	 */
	EAttribute getMotionValue_ZRot();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ezmotion.MotionKind <em>Motion Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Motion Kind</em>'.
	 * @see net.sf.smbt.ezmotion.MotionKind
	 * @generated
	 */
	EEnum getMotionKind();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ezmotion.MotionCinematic <em>Motion Cinematic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Motion Cinematic</em>'.
	 * @see net.sf.smbt.ezmotion.MotionCinematic
	 * @generated
	 */
	EEnum getMotionCinematic();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ezmotion.MotionAxis <em>Motion Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Motion Axis</em>'.
	 * @see net.sf.smbt.ezmotion.MotionAxis
	 * @generated
	 */
	EEnum getMotionAxis();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EzmotionFactory getEzmotionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezmotion.impl.MotionImpl <em>Motion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezmotion.impl.MotionImpl
		 * @see net.sf.smbt.ezmotion.impl.EzmotionPackageImpl#getMotion()
		 * @generated
		 */
		EClass MOTION = eINSTANCE.getMotion();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTION__KIND = eINSTANCE.getMotion_Kind();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTION__ID = eINSTANCE.getMotion_ID();

		/**
		 * The meta object literal for the '<em><b>Cinematic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTION__CINEMATIC = eINSTANCE.getMotion_Cinematic();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTION__DURATION = eINSTANCE.getMotion_Duration();

		/**
		 * The meta object literal for the '<em><b>Amplitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTION__AMPLITUDE = eINSTANCE.getMotion_Amplitude();

		/**
		 * The meta object literal for the '<em><b>Sample Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTION__SAMPLE_RATE = eINSTANCE.getMotion_SampleRate();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTION__FREQUENCY = eINSTANCE.getMotion_Frequency();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTION__TIME = eINSTANCE.getMotion_Time();

		/**
		 * The meta object literal for the '<em><b>Discretization</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTION__DISCRETIZATION = eINSTANCE.getMotion_Discretization();

		/**
		 * The meta object literal for the '<em><b>Axis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTION__AXIS = eINSTANCE.getMotion_Axis();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezmotion.impl.MotionValueImpl <em>Motion Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezmotion.impl.MotionValueImpl
		 * @see net.sf.smbt.ezmotion.impl.EzmotionPackageImpl#getMotionValue()
		 * @generated
		 */
		EClass MOTION_VALUE = eINSTANCE.getMotionValue();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTION_VALUE__X = eINSTANCE.getMotionValue_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTION_VALUE__Y = eINSTANCE.getMotionValue_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTION_VALUE__Z = eINSTANCE.getMotionValue_Z();

		/**
		 * The meta object literal for the '<em><b>XAccel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTION_VALUE__XACCEL = eINSTANCE.getMotionValue_XAccel();

		/**
		 * The meta object literal for the '<em><b>YAccel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTION_VALUE__YACCEL = eINSTANCE.getMotionValue_YAccel();

		/**
		 * The meta object literal for the '<em><b>ZAccel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTION_VALUE__ZACCEL = eINSTANCE.getMotionValue_ZAccel();

		/**
		 * The meta object literal for the '<em><b>XRot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTION_VALUE__XROT = eINSTANCE.getMotionValue_XRot();

		/**
		 * The meta object literal for the '<em><b>YRot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTION_VALUE__YROT = eINSTANCE.getMotionValue_YRot();

		/**
		 * The meta object literal for the '<em><b>ZRot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTION_VALUE__ZROT = eINSTANCE.getMotionValue_ZRot();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezmotion.MotionKind <em>Motion Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezmotion.MotionKind
		 * @see net.sf.smbt.ezmotion.impl.EzmotionPackageImpl#getMotionKind()
		 * @generated
		 */
		EEnum MOTION_KIND = eINSTANCE.getMotionKind();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezmotion.MotionCinematic <em>Motion Cinematic</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezmotion.MotionCinematic
		 * @see net.sf.smbt.ezmotion.impl.EzmotionPackageImpl#getMotionCinematic()
		 * @generated
		 */
		EEnum MOTION_CINEMATIC = eINSTANCE.getMotionCinematic();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezmotion.MotionAxis <em>Motion Axis</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezmotion.MotionAxis
		 * @see net.sf.smbt.ezmotion.impl.EzmotionPackageImpl#getMotionAxis()
		 * @generated
		 */
		EEnum MOTION_AXIS = eINSTANCE.getMotionAxis();

	}

} //EzmotionPackage
