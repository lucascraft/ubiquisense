/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package rgbargs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rgbargs.RGBStepNDelayArgs;
import rgbargs.RgbargsFactory;
import rgbargs.RgbargsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RgbargsFactoryImpl extends EFactoryImpl implements RgbargsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RgbargsFactory init() {
		try {
			RgbargsFactory theRgbargsFactory = (RgbargsFactory)EPackage.Registry.INSTANCE.getEFactory("http://rgbargs/1.0"); 
			if (theRgbargsFactory != null) {
				return theRgbargsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RgbargsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RgbargsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RgbargsPackage.RGB_STEP_NDELAY_ARGS: return createRGBStepNDelayArgs();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RGBStepNDelayArgs createRGBStepNDelayArgs() {
		RGBStepNDelayArgsImpl rgbStepNDelayArgs = new RGBStepNDelayArgsImpl();
		return rgbStepNDelayArgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RgbargsPackage getRgbargsPackage() {
		return (RgbargsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RgbargsPackage getPackage() {
		return RgbargsPackage.eINSTANCE;
	}

} //RgbargsFactoryImpl
