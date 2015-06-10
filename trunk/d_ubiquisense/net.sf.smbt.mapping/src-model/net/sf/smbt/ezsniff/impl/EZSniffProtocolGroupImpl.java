/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsniff.impl;

import net.sf.smbt.ezmapping.EZMapping;
import net.sf.smbt.ezsniff.AbstractEZSniffElem;
import net.sf.smbt.ezsniff.EZSniffProtocolGroup;
import net.sf.smbt.ezsniff.EzsniffPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EZ Sniff Protocol Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsniff.impl.EZSniffProtocolGroupImpl#getMappings <em>Mappings</em>}</li>
 *   <li>{@link net.sf.smbt.ezsniff.impl.EZSniffProtocolGroupImpl#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EZSniffProtocolGroupImpl extends MinimalEObjectImpl.Container implements EZSniffProtocolGroup {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EZSniffProtocolGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzsniffPackage.Literals.EZ_SNIFF_PROTOCOL_GROUP;
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
	@SuppressWarnings("unchecked")
	public EList<AbstractEZSniffElem> getChildren() {
		return (EList<AbstractEZSniffElem>)eGet(EzsniffPackage.Literals.EZ_SNIFF_PROTOCOL_GROUP__CHILDREN, true);
	}

} //EZSniffProtocolGroupImpl
