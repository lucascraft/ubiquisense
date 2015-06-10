/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmotion.impl;

import net.sf.smbt.ezmotion.EzmotionFactory;
import net.sf.smbt.ezmotion.EzmotionPackage;
import net.sf.smbt.ezmotion.Motion;
import net.sf.smbt.ezmotion.MotionAxis;
import net.sf.smbt.ezmotion.MotionCinematic;
import net.sf.smbt.ezmotion.MotionKind;
import net.sf.smbt.ezmotion.MotionValue;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzmotionFactoryImpl extends EFactoryImpl implements EzmotionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EzmotionFactory init() {
		try {
			EzmotionFactory theEzmotionFactory = (EzmotionFactory)EPackage.Registry.INSTANCE.getEFactory("http://ezmotion/1.0"); 
			if (theEzmotionFactory != null) {
				return theEzmotionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EzmotionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzmotionFactoryImpl() {
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
			case EzmotionPackage.MOTION: return createMotion();
			case EzmotionPackage.MOTION_VALUE: return createMotionValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EzmotionPackage.MOTION_KIND:
				return createMotionKindFromString(eDataType, initialValue);
			case EzmotionPackage.MOTION_CINEMATIC:
				return createMotionCinematicFromString(eDataType, initialValue);
			case EzmotionPackage.MOTION_AXIS:
				return createMotionAxisFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EzmotionPackage.MOTION_KIND:
				return convertMotionKindToString(eDataType, instanceValue);
			case EzmotionPackage.MOTION_CINEMATIC:
				return convertMotionCinematicToString(eDataType, instanceValue);
			case EzmotionPackage.MOTION_AXIS:
				return convertMotionAxisToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Motion createMotion() {
		MotionImpl motion = new MotionImpl();
		return motion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotionValue createMotionValue() {
		MotionValueImpl motionValue = new MotionValueImpl();
		return motionValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotionKind createMotionKindFromString(EDataType eDataType, String initialValue) {
		MotionKind result = MotionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMotionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotionCinematic createMotionCinematicFromString(EDataType eDataType, String initialValue) {
		MotionCinematic result = MotionCinematic.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMotionCinematicToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotionAxis createMotionAxisFromString(EDataType eDataType, String initialValue) {
		MotionAxis result = MotionAxis.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMotionAxisToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzmotionPackage getEzmotionPackage() {
		return (EzmotionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EzmotionPackage getPackage() {
		return EzmotionPackage.eINSTANCE;
	}

} //EzmotionFactoryImpl
