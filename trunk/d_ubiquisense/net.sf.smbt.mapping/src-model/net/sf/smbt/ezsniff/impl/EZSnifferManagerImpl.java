/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsniff.impl;

import net.sf.smbt.ezsniff.EZSniffer;
import net.sf.smbt.ezsniff.EZSnifferManager;
import net.sf.smbt.ezsniff.EzsniffPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EZ Sniffer Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsniff.impl.EZSnifferManagerImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.smbt.ezsniff.impl.EZSnifferManagerImpl#getSniffers <em>Sniffers</em>}</li>
 *   <li>{@link net.sf.smbt.ezsniff.impl.EZSnifferManagerImpl#getCache <em>Cache</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EZSnifferManagerImpl extends MinimalEObjectImpl.Container implements EZSnifferManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EZSnifferManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzsniffPackage.Literals.EZ_SNIFFER_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return (String)eGet(EzsniffPackage.Literals.EZ_SNIFFER_MANAGER__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eSet(EzsniffPackage.Literals.EZ_SNIFFER_MANAGER__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EZSniffer> getSniffers() {
		return (EList<EZSniffer>)eGet(EzsniffPackage.Literals.EZ_SNIFFER_MANAGER__SNIFFERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EClassifier> getCache() {
		return (EList<EClassifier>)eGet(EzsniffPackage.Literals.EZ_SNIFFER_MANAGER__CACHE, true);
	}

} //EZSnifferManagerImpl
