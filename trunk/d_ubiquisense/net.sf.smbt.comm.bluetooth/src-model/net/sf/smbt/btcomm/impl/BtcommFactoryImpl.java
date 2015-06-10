/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.btcomm.impl;

import net.sf.smbt.btcomm.*;

import org.eclipse.emf.ecore.EClass;
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
public class BtcommFactoryImpl extends EFactoryImpl implements BtcommFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BtcommFactory init() {
		try {
			BtcommFactory theBtcommFactory = (BtcommFactory)EPackage.Registry.INSTANCE.getEFactory("http://btcomm/1.0"); 
			if (theBtcommFactory != null) {
				return theBtcommFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BtcommFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtcommFactoryImpl() {
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
			case BtcommPackage.BLUETOOTH_PORT: return createBluetoothPort();
			case BtcommPackage.L2CAP_IN_JOB: return createL2CAPInJob();
			case BtcommPackage.L2CA_POUT_JOB: return createL2CAPoutJob();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BluetoothPort createBluetoothPort() {
		BluetoothPortImpl bluetoothPort = new BluetoothPortImpl();
		return bluetoothPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public L2CAPInJob createL2CAPInJob() {
		L2CAPInJobImpl l2CAPInJob = new L2CAPInJobImpl();
		return l2CAPInJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public L2CAPoutJob createL2CAPoutJob() {
		L2CAPoutJobImpl l2CAPoutJob = new L2CAPoutJobImpl();
		return l2CAPoutJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtcommPackage getBtcommPackage() {
		return (BtcommPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BtcommPackage getPackage() {
		return BtcommPackage.eINSTANCE;
	}

} //BtcommFactoryImpl
