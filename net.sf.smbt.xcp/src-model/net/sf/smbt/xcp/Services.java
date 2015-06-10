/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.xcp;

import org.eclipse.emf.ecore.EObject;

import com.illposed.osc.OSCPacket;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Services</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.xcp.Services#getOsc <em>Osc</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.xcp.XcpPackage#getServices()
 * @model
 * @generated
 */
public interface Services extends EObject {
	/**
	 * Returns the value of the '<em><b>Osc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Osc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Osc</em>' attribute.
	 * @see #setOsc(OSCPacket)
	 * @see net.sf.smbt.xcp.XcpPackage#getServices_Osc()
	 * @model dataType="net.sf.smbt.xcp.OSCPacket"
	 * @generated
	 */
	OSCPacket getOsc();

	/**
	 * Sets the value of the '{@link net.sf.smbt.xcp.Services#getOsc <em>Osc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Osc</em>' attribute.
	 * @see #getOsc()
	 * @generated
	 */
	void setOsc(OSCPacket value);

} // Services
