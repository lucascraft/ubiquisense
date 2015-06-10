/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsniff.impl;

import net.sf.smbt.ezmapping.EZMapping;
import net.sf.smbt.ezsniff.EZSniffHit;
import net.sf.smbt.ezsniff.EzsniffPackage;
import net.sf.xqz.model.cmd.XCmd;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EZ Sniff Hit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsniff.impl.EZSniffHitImpl#getMappings <em>Mappings</em>}</li>
 *   <li>{@link net.sf.smbt.ezsniff.impl.EZSniffHitImpl#getSeek <em>Seek</em>}</li>
 *   <li>{@link net.sf.smbt.ezsniff.impl.EZSniffHitImpl#getHit <em>Hit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EZSniffHitImpl extends MinimalEObjectImpl.Container implements EZSniffHit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EZSniffHitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzsniffPackage.Literals.EZ_SNIFF_HIT;
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
	public EZMapping getMappings() {
		return (EZMapping)eGet(EzsniffPackage.Literals.ABSTRACT_EZ_SNIFF_ELEM__MAPPINGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappings(EZMapping newMappings) {
		eSet(EzsniffPackage.Literals.ABSTRACT_EZ_SNIFF_ELEM__MAPPINGS, newMappings);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier getSeek() {
		return (EClassifier)eGet(EzsniffPackage.Literals.EZ_SNIFF_HIT__SEEK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeek(EClassifier newSeek) {
		eSet(EzsniffPackage.Literals.EZ_SNIFF_HIT__SEEK, newSeek);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XCmd getHit() {
		return (XCmd)eGet(EzsniffPackage.Literals.EZ_SNIFF_HIT__HIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHit(XCmd newHit) {
		eSet(EzsniffPackage.Literals.EZ_SNIFF_HIT__HIT, newHit);
	}

} //EZSniffHitImpl
