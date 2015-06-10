/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsniff.impl;

import net.sf.smbt.ezmapping.EZMapping;
import net.sf.smbt.ezsniff.AbstractEZSniffElem;
import net.sf.smbt.ezsniff.EZSniffer;
import net.sf.smbt.ezsniff.EzsniffPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EZ Sniffer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsniff.impl.EZSnifferImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.smbt.ezsniff.impl.EZSnifferImpl#getHits <em>Hits</em>}</li>
 *   <li>{@link net.sf.smbt.ezsniff.impl.EZSnifferImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link net.sf.smbt.ezsniff.impl.EZSnifferImpl#getMappings <em>Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EZSnifferImpl extends MinimalEObjectImpl.Container implements EZSniffer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EZSnifferImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzsniffPackage.Literals.EZ_SNIFFER;
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
		return (String)eGet(EzsniffPackage.Literals.EZ_SNIFFER__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eSet(EzsniffPackage.Literals.EZ_SNIFFER__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AbstractEZSniffElem> getHits() {
		return (EList<AbstractEZSniffElem>)eGet(EzsniffPackage.Literals.EZ_SNIFFER__HITS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return (String)eGet(EzsniffPackage.Literals.EZ_SNIFFER__LABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		eSet(EzsniffPackage.Literals.EZ_SNIFFER__LABEL, newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EZMapping> getMappings() {
		return (EList<EZMapping>)eGet(EzsniffPackage.Literals.EZ_SNIFFER__MAPPINGS, true);
	}

} //EZSnifferImpl
