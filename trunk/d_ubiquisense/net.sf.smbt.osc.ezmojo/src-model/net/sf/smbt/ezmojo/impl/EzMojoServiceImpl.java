/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmojo.impl;

import net.sf.smbt.ezmojo.EzMojoService;
import net.sf.smbt.ezmojo.EzmojoPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ez Mojo Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EzMojoServiceImpl#getServiceID <em>Service ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EzMojoServiceImpl#isExcluded <em>Excluded</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EzMojoServiceImpl extends MinimalEObjectImpl.Container implements EzMojoService {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EzMojoServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzmojoPackage.Literals.EZ_MOJO_SERVICE;
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
	public String getServiceID() {
		return (String)eGet(EzmojoPackage.Literals.EZ_MOJO_SERVICE__SERVICE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceID(String newServiceID) {
		eSet(EzmojoPackage.Literals.EZ_MOJO_SERVICE__SERVICE_ID, newServiceID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExcluded() {
		return (Boolean)eGet(EzmojoPackage.Literals.EZ_MOJO_SERVICE__EXCLUDED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcluded(boolean newExcluded) {
		eSet(EzmojoPackage.Literals.EZ_MOJO_SERVICE__EXCLUDED, newExcluded);
	}

} //EzMojoServiceImpl
