/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package rgbargs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see rgbargs.RgbargsFactory
 * @model kind="package"
 * @generated
 */
public interface RgbargsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rgbargs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://rgbargs/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rgbargs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RgbargsPackage eINSTANCE = rgbargs.impl.RgbargsPackageImpl.init();

	/**
	 * The meta object id for the '{@link rgbargs.impl.RGBStepNDelayArgsImpl <em>RGB Step NDelay Args</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rgbargs.impl.RGBStepNDelayArgsImpl
	 * @see rgbargs.impl.RgbargsPackageImpl#getRGBStepNDelayArgs()
	 * @generated
	 */
	int RGB_STEP_NDELAY_ARGS = 0;

	/**
	 * The feature id for the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_STEP_NDELAY_ARGS__R = 0;

	/**
	 * The feature id for the '<em><b>G</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_STEP_NDELAY_ARGS__G = 1;

	/**
	 * The feature id for the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_STEP_NDELAY_ARGS__B = 2;

	/**
	 * The feature id for the '<em><b>RMotion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_STEP_NDELAY_ARGS__RMOTION = 3;

	/**
	 * The feature id for the '<em><b>GMotion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_STEP_NDELAY_ARGS__GMOTION = 4;

	/**
	 * The feature id for the '<em><b>BMotion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_STEP_NDELAY_ARGS__BMOTION = 5;

	/**
	 * The feature id for the '<em><b>Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_STEP_NDELAY_ARGS__INCREMENT = 6;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_STEP_NDELAY_ARGS__DELAY = 7;

	/**
	 * The feature id for the '<em><b>Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_STEP_NDELAY_ARGS__RUNNING = 8;

	/**
	 * The number of structural features of the '<em>RGB Step NDelay Args</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RGB_STEP_NDELAY_ARGS_FEATURE_COUNT = 9;


	/**
	 * Returns the meta object for class '{@link rgbargs.RGBStepNDelayArgs <em>RGB Step NDelay Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RGB Step NDelay Args</em>'.
	 * @see rgbargs.RGBStepNDelayArgs
	 * @generated
	 */
	EClass getRGBStepNDelayArgs();

	/**
	 * Returns the meta object for the attribute '{@link rgbargs.RGBStepNDelayArgs#getR <em>R</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>R</em>'.
	 * @see rgbargs.RGBStepNDelayArgs#getR()
	 * @see #getRGBStepNDelayArgs()
	 * @generated
	 */
	EAttribute getRGBStepNDelayArgs_R();

	/**
	 * Returns the meta object for the attribute '{@link rgbargs.RGBStepNDelayArgs#getG <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>G</em>'.
	 * @see rgbargs.RGBStepNDelayArgs#getG()
	 * @see #getRGBStepNDelayArgs()
	 * @generated
	 */
	EAttribute getRGBStepNDelayArgs_G();

	/**
	 * Returns the meta object for the attribute '{@link rgbargs.RGBStepNDelayArgs#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>B</em>'.
	 * @see rgbargs.RGBStepNDelayArgs#getB()
	 * @see #getRGBStepNDelayArgs()
	 * @generated
	 */
	EAttribute getRGBStepNDelayArgs_B();

	/**
	 * Returns the meta object for the attribute '{@link rgbargs.RGBStepNDelayArgs#isRMotion <em>RMotion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RMotion</em>'.
	 * @see rgbargs.RGBStepNDelayArgs#isRMotion()
	 * @see #getRGBStepNDelayArgs()
	 * @generated
	 */
	EAttribute getRGBStepNDelayArgs_RMotion();

	/**
	 * Returns the meta object for the attribute '{@link rgbargs.RGBStepNDelayArgs#isGMotion <em>GMotion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>GMotion</em>'.
	 * @see rgbargs.RGBStepNDelayArgs#isGMotion()
	 * @see #getRGBStepNDelayArgs()
	 * @generated
	 */
	EAttribute getRGBStepNDelayArgs_GMotion();

	/**
	 * Returns the meta object for the attribute '{@link rgbargs.RGBStepNDelayArgs#isBMotion <em>BMotion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BMotion</em>'.
	 * @see rgbargs.RGBStepNDelayArgs#isBMotion()
	 * @see #getRGBStepNDelayArgs()
	 * @generated
	 */
	EAttribute getRGBStepNDelayArgs_BMotion();

	/**
	 * Returns the meta object for the attribute '{@link rgbargs.RGBStepNDelayArgs#getIncrement <em>Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Increment</em>'.
	 * @see rgbargs.RGBStepNDelayArgs#getIncrement()
	 * @see #getRGBStepNDelayArgs()
	 * @generated
	 */
	EAttribute getRGBStepNDelayArgs_Increment();

	/**
	 * Returns the meta object for the attribute '{@link rgbargs.RGBStepNDelayArgs#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see rgbargs.RGBStepNDelayArgs#getDelay()
	 * @see #getRGBStepNDelayArgs()
	 * @generated
	 */
	EAttribute getRGBStepNDelayArgs_Delay();

	/**
	 * Returns the meta object for the attribute '{@link rgbargs.RGBStepNDelayArgs#isRunning <em>Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Running</em>'.
	 * @see rgbargs.RGBStepNDelayArgs#isRunning()
	 * @see #getRGBStepNDelayArgs()
	 * @generated
	 */
	EAttribute getRGBStepNDelayArgs_Running();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RgbargsFactory getRgbargsFactory();

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
		 * The meta object literal for the '{@link rgbargs.impl.RGBStepNDelayArgsImpl <em>RGB Step NDelay Args</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rgbargs.impl.RGBStepNDelayArgsImpl
		 * @see rgbargs.impl.RgbargsPackageImpl#getRGBStepNDelayArgs()
		 * @generated
		 */
		EClass RGB_STEP_NDELAY_ARGS = eINSTANCE.getRGBStepNDelayArgs();

		/**
		 * The meta object literal for the '<em><b>R</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGB_STEP_NDELAY_ARGS__R = eINSTANCE.getRGBStepNDelayArgs_R();

		/**
		 * The meta object literal for the '<em><b>G</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGB_STEP_NDELAY_ARGS__G = eINSTANCE.getRGBStepNDelayArgs_G();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGB_STEP_NDELAY_ARGS__B = eINSTANCE.getRGBStepNDelayArgs_B();

		/**
		 * The meta object literal for the '<em><b>RMotion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGB_STEP_NDELAY_ARGS__RMOTION = eINSTANCE.getRGBStepNDelayArgs_RMotion();

		/**
		 * The meta object literal for the '<em><b>GMotion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGB_STEP_NDELAY_ARGS__GMOTION = eINSTANCE.getRGBStepNDelayArgs_GMotion();

		/**
		 * The meta object literal for the '<em><b>BMotion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGB_STEP_NDELAY_ARGS__BMOTION = eINSTANCE.getRGBStepNDelayArgs_BMotion();

		/**
		 * The meta object literal for the '<em><b>Increment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGB_STEP_NDELAY_ARGS__INCREMENT = eINSTANCE.getRGBStepNDelayArgs_Increment();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGB_STEP_NDELAY_ARGS__DELAY = eINSTANCE.getRGBStepNDelayArgs_Delay();

		/**
		 * The meta object literal for the '<em><b>Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RGB_STEP_NDELAY_ARGS__RUNNING = eINSTANCE.getRGBStepNDelayArgs_Running();

	}

} //RgbargsPackage
