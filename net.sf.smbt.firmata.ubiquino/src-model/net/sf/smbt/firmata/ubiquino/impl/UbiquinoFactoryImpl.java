/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.firmata.ubiquino.impl;

import net.sf.smbt.firmata.ubiquino.*;
import net.sf.smbt.firmata.ubiquino.PortConfig;
import net.sf.smbt.firmata.ubiquino.PortConfigKind;
import net.sf.smbt.firmata.ubiquino.Ubiquino;
import net.sf.smbt.firmata.ubiquino.UbiquinoConfig;
import net.sf.smbt.firmata.ubiquino.UbiquinoFactory;
import net.sf.smbt.firmata.ubiquino.UbiquinoPackage;

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
public class UbiquinoFactoryImpl extends EFactoryImpl implements UbiquinoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UbiquinoFactory init() {
		try {
			UbiquinoFactory theUbiquinoFactory = (UbiquinoFactory)EPackage.Registry.INSTANCE.getEFactory(UbiquinoPackage.eNS_URI);
			if (theUbiquinoFactory != null) {
				return theUbiquinoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UbiquinoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbiquinoFactoryImpl() {
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
			case UbiquinoPackage.UBIQUINO: return createUbiquino();
			case UbiquinoPackage.UBIQUINO_CONFIG: return createUbiquinoConfig();
			case UbiquinoPackage.PORT_CONFIG: return createPortConfig();
			case UbiquinoPackage.PORT_SAMPLER: return createPortSampler();
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
			case UbiquinoPackage.PORT_CONFIG_KIND:
				return createPortConfigKindFromString(eDataType, initialValue);
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
			case UbiquinoPackage.PORT_CONFIG_KIND:
				return convertPortConfigKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ubiquino createUbiquino() {
		UbiquinoImpl ubiquino = new UbiquinoImpl();
		return ubiquino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbiquinoConfig createUbiquinoConfig() {
		UbiquinoConfigImpl ubiquinoConfig = new UbiquinoConfigImpl();
		return ubiquinoConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortConfig createPortConfig() {
		PortConfigImpl portConfig = new PortConfigImpl();
		return portConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortSampler createPortSampler() {
		PortSamplerImpl portSampler = new PortSamplerImpl();
		return portSampler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortConfigKind createPortConfigKindFromString(EDataType eDataType, String initialValue) {
		PortConfigKind result = PortConfigKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPortConfigKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbiquinoPackage getUbiquinoPackage() {
		return (UbiquinoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UbiquinoPackage getPackage() {
		return UbiquinoPackage.eINSTANCE;
	}

} //UbiquinoFactoryImpl
