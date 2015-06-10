/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmojo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EZ Mojo Agent Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezmojo.EZMojoAgentCmd#getCmd <em>Cmd</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.EZMojoAgentCmd#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoAgentCmd()
 * @model
 * @generated
 */
public interface EZMojoAgentCmd extends EZMojoCmd {
	/**
	 * Returns the value of the '<em><b>Cmd</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.ezmojo.EZCmdKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cmd</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmd</em>' attribute.
	 * @see net.sf.smbt.ezmojo.EZCmdKind
	 * @see #setCmd(EZCmdKind)
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoAgentCmd_Cmd()
	 * @model
	 * @generated
	 */
	EZCmdKind getCmd();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmojo.EZMojoAgentCmd#getCmd <em>Cmd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmd</em>' attribute.
	 * @see net.sf.smbt.ezmojo.EZCmdKind
	 * @see #getCmd()
	 * @generated
	 */
	void setCmd(EZCmdKind value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoAgentCmd_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmojo.EZMojoAgentCmd#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // EZMojoAgentCmd
