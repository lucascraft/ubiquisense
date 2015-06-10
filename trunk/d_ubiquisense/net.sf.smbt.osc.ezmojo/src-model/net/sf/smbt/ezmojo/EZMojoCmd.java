/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmojo;

import net.sf.smbt.osccmd.OscCmd;
import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EZ Mojo Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezmojo.EZMojoCmd#getKind <em>Kind</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.EZMojoCmd#getOsc <em>Osc</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.EZMojoCmd#getTargets <em>Targets</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.EZMojoCmd#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoCmd()
 * @model
 * @generated
 */
public interface EZMojoCmd extends Cmd {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.ezmojo.EZMojoKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see net.sf.smbt.ezmojo.EZMojoKind
	 * @see #setKind(EZMojoKind)
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoCmd_Kind()
	 * @model
	 * @generated
	 */
	EZMojoKind getKind();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmojo.EZMojoCmd#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see net.sf.smbt.ezmojo.EZMojoKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(EZMojoKind value);

	/**
	 * Returns the value of the '<em><b>Osc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Osc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Osc</em>' reference.
	 * @see #setOsc(OscCmd)
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoCmd_Osc()
	 * @model
	 * @generated
	 */
	OscCmd getOsc();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmojo.EZMojoCmd#getOsc <em>Osc</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Osc</em>' reference.
	 * @see #getOsc()
	 * @generated
	 */
	void setOsc(OscCmd value);

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezmojo.EZMojoTarget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' containment reference list.
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoCmd_Targets()
	 * @model containment="true"
	 * @generated
	 */
	EList<EZMojoTarget> getTargets();

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(String)
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoCmd_Protocol()
	 * @model
	 * @generated
	 */
	String getProtocol();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmojo.EZMojoCmd#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(String value);

} // EZMojoCmd
