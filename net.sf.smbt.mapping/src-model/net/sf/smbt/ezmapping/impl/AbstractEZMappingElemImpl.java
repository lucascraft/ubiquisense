/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmapping.impl;

import net.sf.smbt.ezmapping.AbstractEZMappingElem;
import net.sf.smbt.ezmapping.EzmappingPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract EZ Mapping Elem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezmapping.impl.AbstractEZMappingElemImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.smbt.ezmapping.impl.AbstractEZMappingElemImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractEZMappingElemImpl extends MinimalEObjectImpl.Container implements AbstractEZMappingElem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractEZMappingElemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzmappingPackage.Literals.ABSTRACT_EZ_MAPPING_ELEM;
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
		return (String)eGet(EzmappingPackage.Literals.ABSTRACT_EZ_MAPPING_ELEM__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eSet(EzmappingPackage.Literals.ABSTRACT_EZ_MAPPING_ELEM__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return (String)eGet(EzmappingPackage.Literals.ABSTRACT_EZ_MAPPING_ELEM__LABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		eSet(EzmappingPackage.Literals.ABSTRACT_EZ_MAPPING_ELEM__LABEL, newLabel);
	}

} //AbstractEZMappingElemImpl
