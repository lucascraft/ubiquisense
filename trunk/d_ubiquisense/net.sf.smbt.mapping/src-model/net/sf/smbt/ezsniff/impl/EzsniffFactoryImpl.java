/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsniff.impl;

import net.sf.smbt.ezsniff.EZSniffHit;
import net.sf.smbt.ezsniff.EZSniffProtocolGroup;
import net.sf.smbt.ezsniff.EZSniffer;
import net.sf.smbt.ezsniff.EZSnifferManager;
import net.sf.smbt.ezsniff.EzsniffFactory;
import net.sf.smbt.ezsniff.EzsniffPackage;

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
public class EzsniffFactoryImpl extends EFactoryImpl implements EzsniffFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EzsniffFactory init() {
		try {
			EzsniffFactory theEzsniffFactory = (EzsniffFactory)EPackage.Registry.INSTANCE.getEFactory("http://ezsniff/1.0"); 
			if (theEzsniffFactory != null) {
				return theEzsniffFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EzsniffFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzsniffFactoryImpl() {
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
			case EzsniffPackage.EZ_SNIFFER: return createEZSniffer();
			case EzsniffPackage.EZ_SNIFF_PROTOCOL_GROUP: return createEZSniffProtocolGroup();
			case EzsniffPackage.EZ_SNIFF_HIT: return createEZSniffHit();
			case EzsniffPackage.EZ_SNIFFER_MANAGER: return createEZSnifferManager();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZSniffer createEZSniffer() {
		EZSnifferImpl ezSniffer = new EZSnifferImpl();
		return ezSniffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZSniffProtocolGroup createEZSniffProtocolGroup() {
		EZSniffProtocolGroupImpl ezSniffProtocolGroup = new EZSniffProtocolGroupImpl();
		return ezSniffProtocolGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZSniffHit createEZSniffHit() {
		EZSniffHitImpl ezSniffHit = new EZSniffHitImpl();
		return ezSniffHit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZSnifferManager createEZSnifferManager() {
		EZSnifferManagerImpl ezSnifferManager = new EZSnifferManagerImpl();
		return ezSnifferManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzsniffPackage getEzsniffPackage() {
		return (EzsniffPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EzsniffPackage getPackage() {
		return EzsniffPackage.eINSTANCE;
	}

} //EzsniffFactoryImpl
