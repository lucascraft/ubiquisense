/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezoscthingm.impl;

import net.sf.smbt.ezoscthingm.*;

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
public class EzoscthingmFactoryImpl extends EFactoryImpl implements EzoscthingmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EzoscthingmFactory init() {
		try {
			EzoscthingmFactory theEzoscthingmFactory = (EzoscthingmFactory)EPackage.Registry.INSTANCE.getEFactory("http://ezoscthingm/1.0"); 
			if (theEzoscthingmFactory != null) {
				return theEzoscthingmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EzoscthingmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzoscthingmFactoryImpl() {
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
			case EzoscthingmPackage.THING_MOSC_CMD: return createThingMOscCmd();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThingMOscCmd createThingMOscCmd() {
		ThingMOscCmdImpl thingMOscCmd = new ThingMOscCmdImpl();
		return thingMOscCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzoscthingmPackage getEzoscthingmPackage() {
		return (EzoscthingmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EzoscthingmPackage getPackage() {
		return EzoscthingmPackage.eINSTANCE;
	}

} //EzoscthingmFactoryImpl
