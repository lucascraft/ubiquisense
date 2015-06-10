/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.impl;

import gnu.io.CommPortIdentifier;
import net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.ArduinoConfig;
import net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.ArduinocfgFactory;
import net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.ArduinocfgPackage;

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
public class ArduinocfgFactoryImpl extends EFactoryImpl implements ArduinocfgFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArduinocfgFactory init() {
		try {
			ArduinocfgFactory theArduinocfgFactory = (ArduinocfgFactory)EPackage.Registry.INSTANCE.getEFactory("http://arduinocfg/1.0"); 
			if (theArduinocfgFactory != null) {
				return theArduinocfgFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArduinocfgFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinocfgFactoryImpl() {
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
			case ArduinocfgPackage.ARDUINO_CONFIG: return createArduinoConfig();
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
			case ArduinocfgPackage.COMM_PORT_IDENTIFIER:
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
			case ArduinocfgPackage.COMM_PORT_IDENTIFIER:
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
	public ArduinoConfig createArduinoConfig() {
		ArduinoConfigImpl arduinoConfig = new ArduinoConfigImpl();
		return arduinoConfig;
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
	public ArduinocfgPackage getArduinocfgPackage() {
		return (ArduinocfgPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArduinocfgPackage getPackage() {
		return ArduinocfgPackage.eINSTANCE;
	}

} //ArduinocfgFactoryImpl
