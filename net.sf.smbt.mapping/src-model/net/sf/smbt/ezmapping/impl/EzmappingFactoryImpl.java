/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmapping.impl;

import net.sf.smbt.ezmapping.*;
import net.sf.smbt.ezmapping.AbstractEZMappingElem;
import net.sf.smbt.ezmapping.EZMapping;
import net.sf.smbt.ezmapping.EZMappingCategory;
import net.sf.smbt.ezmapping.EZMappingManager;
import net.sf.smbt.ezmapping.EzmappingFactory;
import net.sf.smbt.ezmapping.EzmappingPackage;

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
public class EzmappingFactoryImpl extends EFactoryImpl implements EzmappingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EzmappingFactory init() {
		try {
			EzmappingFactory theEzmappingFactory = (EzmappingFactory)EPackage.Registry.INSTANCE.getEFactory("http://ezmapping/1.0"); 
			if (theEzmappingFactory != null) {
				return theEzmappingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EzmappingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzmappingFactoryImpl() {
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
			case EzmappingPackage.EZ_MAPPING: return createEZMapping();
			case EzmappingPackage.EZ_MAPPING_MANAGER: return createEZMappingManager();
			case EzmappingPackage.EZ_MAPPING_CATEGORY: return createEZMappingCategory();
			case EzmappingPackage.ABSTRACT_EZ_MAPPING_ELEM: return createAbstractEZMappingElem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZMapping createEZMapping() {
		EZMappingImpl ezMapping = new EZMappingImpl();
		return ezMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZMappingManager createEZMappingManager() {
		EZMappingManagerImpl ezMappingManager = new EZMappingManagerImpl();
		return ezMappingManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZMappingCategory createEZMappingCategory() {
		EZMappingCategoryImpl ezMappingCategory = new EZMappingCategoryImpl();
		return ezMappingCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractEZMappingElem createAbstractEZMappingElem() {
		AbstractEZMappingElemImpl abstractEZMappingElem = new AbstractEZMappingElemImpl();
		return abstractEZMappingElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzmappingPackage getEzmappingPackage() {
		return (EzmappingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EzmappingPackage getPackage() {
		return EzmappingPackage.eINSTANCE;
	}

} //EzmappingFactoryImpl
