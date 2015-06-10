/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezubiquino.impl;

import net.sf.smbt.ezubiquino.*;
import net.sf.smbt.ezubiquino.EzubiquinoFactory;
import net.sf.smbt.ezubiquino.EzubiquinoPackage;
import net.sf.smbt.ezubiquino.OscUbiquinoCmd;
import net.sf.smbt.ezubiquino.UbiquinoKind;

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
public class EzubiquinoFactoryImpl extends EFactoryImpl implements EzubiquinoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EzubiquinoFactory init() {
		try {
			EzubiquinoFactory theEzubiquinoFactory = (EzubiquinoFactory)EPackage.Registry.INSTANCE.getEFactory("http://ezubiquino/1.0"); 
			if (theEzubiquinoFactory != null) {
				return theEzubiquinoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EzubiquinoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzubiquinoFactoryImpl() {
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
			case EzubiquinoPackage.OSC_UBIQUINO_CMD: return createOscUbiquinoCmd();
			case EzubiquinoPackage.OSC_FIRMATA_CMD: return createOscFirmataCmd();
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
			case EzubiquinoPackage.UBIQUINO_KIND:
				return createUbiquinoKindFromString(eDataType, initialValue);
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
			case EzubiquinoPackage.UBIQUINO_KIND:
				return convertUbiquinoKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscUbiquinoCmd createOscUbiquinoCmd() {
		OscUbiquinoCmdImpl oscUbiquinoCmd = new OscUbiquinoCmdImpl();
		return oscUbiquinoCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscFirmataCmd createOscFirmataCmd() {
		OscFirmataCmdImpl oscFirmataCmd = new OscFirmataCmdImpl();
		return oscFirmataCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbiquinoKind createUbiquinoKindFromString(EDataType eDataType, String initialValue) {
		UbiquinoKind result = UbiquinoKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUbiquinoKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzubiquinoPackage getEzubiquinoPackage() {
		return (EzubiquinoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EzubiquinoPackage getPackage() {
		return EzubiquinoPackage.eINSTANCE;
	}

} //EzubiquinoFactoryImpl
