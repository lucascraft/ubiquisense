/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmojo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ez Mojo Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezmojo.EzMojoService#getServiceID <em>Service ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.EzMojoService#isExcluded <em>Excluded</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEzMojoService()
 * @model
 * @generated
 */
public interface EzMojoService extends EObject {
	/**
	 * Returns the value of the '<em><b>Service ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service ID</em>' attribute.
	 * @see #setServiceID(String)
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEzMojoService_ServiceID()
	 * @model
	 * @generated
	 */
	String getServiceID();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmojo.EzMojoService#getServiceID <em>Service ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service ID</em>' attribute.
	 * @see #getServiceID()
	 * @generated
	 */
	void setServiceID(String value);

	/**
	 * Returns the value of the '<em><b>Excluded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Excluded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excluded</em>' attribute.
	 * @see #setExcluded(boolean)
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEzMojoService_Excluded()
	 * @model
	 * @generated
	 */
	boolean isExcluded();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmojo.EzMojoService#isExcluded <em>Excluded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Excluded</em>' attribute.
	 * @see #isExcluded()
	 * @generated
	 */
	void setExcluded(boolean value);

} // EzMojoService
