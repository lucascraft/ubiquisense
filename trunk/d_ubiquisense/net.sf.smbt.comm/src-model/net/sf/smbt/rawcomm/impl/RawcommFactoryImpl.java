/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.rawcomm.impl;

import net.sf.smbt.rawcomm.*;

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
public class RawcommFactoryImpl extends EFactoryImpl implements RawcommFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RawcommFactory init() {
		try {
			RawcommFactory theRawcommFactory = (RawcommFactory)EPackage.Registry.INSTANCE.getEFactory("http://rawcomm/1.0"); 
			if (theRawcommFactory != null) {
				return theRawcommFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RawcommFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RawcommFactoryImpl() {
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
			case RawcommPackage.RAW_CMD: return createRawCmd();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RawCmd createRawCmd() {
		RawCmdImpl rawCmd = new RawCmdImpl();
		return rawCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RawcommPackage getRawcommPackage() {
		return (RawcommPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RawcommPackage getPackage() {
		return RawcommPackage.eINSTANCE;
	}

} //RawcommFactoryImpl
