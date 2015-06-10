/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmapping.impl;

import net.sf.smbt.ezmapping.AbstractEZMappingElem;
import net.sf.smbt.ezmapping.EZMappingManager;
import net.sf.smbt.ezmapping.EzmappingPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EZ Mapping Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezmapping.impl.EZMappingManagerImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.smbt.ezmapping.impl.EZMappingManagerImpl#getMappings <em>Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EZMappingManagerImpl extends MinimalEObjectImpl.Container implements EZMappingManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EZMappingManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzmappingPackage.Literals.EZ_MAPPING_MANAGER;
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
		return (String)eGet(EzmappingPackage.Literals.EZ_MAPPING_MANAGER__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eSet(EzmappingPackage.Literals.EZ_MAPPING_MANAGER__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AbstractEZMappingElem> getMappings() {
		return (EList<AbstractEZMappingElem>)eGet(EzmappingPackage.Literals.EZ_MAPPING_MANAGER__MAPPINGS, true);
	}

} //EZMappingManagerImpl
