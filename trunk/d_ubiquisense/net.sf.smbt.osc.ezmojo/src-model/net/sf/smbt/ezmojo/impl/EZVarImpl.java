/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmojo.impl;

import net.sf.smbt.ezmojo.EZVar;
import net.sf.smbt.ezmojo.EzVarKind;
import net.sf.smbt.ezmojo.EzmojoPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EZ Var</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZVarImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZVarImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZVarImpl#getValue <em>Value</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZVarImpl#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EZVarImpl extends MinimalEObjectImpl.Container implements EZVar {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EZVarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzmojoPackage.Literals.EZ_VAR;
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
	public String getName() {
		return (String)eGet(EzmojoPackage.Literals.EZ_VAR__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(EzmojoPackage.Literals.EZ_VAR__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETypedElement getType() {
		return (ETypedElement)eGet(EzmojoPackage.Literals.EZ_VAR__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ETypedElement newType) {
		eSet(EzmojoPackage.Literals.EZ_VAR__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getValue() {
		return (Object)eGet(EzmojoPackage.Literals.EZ_VAR__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Object newValue) {
		eSet(EzmojoPackage.Literals.EZ_VAR__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzVarKind getKind() {
		return (EzVarKind)eGet(EzmojoPackage.Literals.EZ_VAR__KIND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(EzVarKind newKind) {
		eSet(EzmojoPackage.Literals.EZ_VAR__KIND, newKind);
	}

} //EZVarImpl
