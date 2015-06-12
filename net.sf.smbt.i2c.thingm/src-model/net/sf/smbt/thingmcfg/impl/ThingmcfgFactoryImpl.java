/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.thingmcfg.impl;

import gnu.io.CommPortIdentifier;
import net.sf.smbt.thingmcfg.*;

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
public class ThingmcfgFactoryImpl extends EFactoryImpl implements ThingmcfgFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ThingmcfgFactory init() {
		try {
			ThingmcfgFactory theThingmcfgFactory = (ThingmcfgFactory)EPackage.Registry.INSTANCE.getEFactory("http://thingmcfg/1.0"); 
			if (theThingmcfgFactory != null) {
				return theThingmcfgFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ThingmcfgFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThingmcfgFactoryImpl() {
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
			case ThingmcfgPackage.THING_MCFG: return createThingMCfg();
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
			case ThingmcfgPackage.THING_MDEVICE:
				return createThingMDeviceFromString(eDataType, initialValue);
			case ThingmcfgPackage.COMM_PORT_IDENTIFIER:
				return createCommPortIdentifierFromString(eDataType, initialValue);
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
			case ThingmcfgPackage.THING_MDEVICE:
				return convertThingMDeviceToString(eDataType, instanceValue);
			case ThingmcfgPackage.COMM_PORT_IDENTIFIER:
				return convertCommPortIdentifierToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThingMCfg createThingMCfg() {
		ThingMCfgImpl thingMCfg = new ThingMCfgImpl();
		return thingMCfg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThingMDevice createThingMDeviceFromString(EDataType eDataType, String initialValue) {
		ThingMDevice result = ThingMDevice.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertThingMDeviceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommPortIdentifier createCommPortIdentifierFromString(EDataType eDataType, String initialValue) {
		return (CommPortIdentifier)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommPortIdentifierToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThingmcfgPackage getThingmcfgPackage() {
		return (ThingmcfgPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ThingmcfgPackage getPackage() {
		return ThingmcfgPackage.eINSTANCE;
	}

} //ThingmcfgFactoryImpl
