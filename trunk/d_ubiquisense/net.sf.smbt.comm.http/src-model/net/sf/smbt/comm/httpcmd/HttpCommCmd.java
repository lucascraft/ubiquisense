/**
 */
package net.sf.smbt.comm.httpcmd;

import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Http Comm Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.comm.httpcmd.HttpCommCmd#getProperties <em>Properties</em>}</li>
 *   <li>{@link net.sf.smbt.comm.httpcmd.HttpCommCmd#getMethod <em>Method</em>}</li>
 *   <li>{@link net.sf.smbt.comm.httpcmd.HttpCommCmd#getCommand <em>Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.comm.httpcmd.HttpcmdPackage#getHttpCommCmd()
 * @model
 * @generated
 */
public interface HttpCommCmd extends Cmd {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.comm.httpcmd.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' reference list.
	 * @see net.sf.smbt.comm.httpcmd.HttpcmdPackage#getHttpCommCmd_Properties()
	 * @model
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.comm.httpcmd.HttpMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see net.sf.smbt.comm.httpcmd.HttpMethod
	 * @see #setMethod(HttpMethod)
	 * @see net.sf.smbt.comm.httpcmd.HttpcmdPackage#getHttpCommCmd_Method()
	 * @model
	 * @generated
	 */
	HttpMethod getMethod();

	/**
	 * Sets the value of the '{@link net.sf.smbt.comm.httpcmd.HttpCommCmd#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see net.sf.smbt.comm.httpcmd.HttpMethod
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(HttpMethod value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' attribute.
	 * @see #setCommand(String)
	 * @see net.sf.smbt.comm.httpcmd.HttpcmdPackage#getHttpCommCmd_Command()
	 * @model
	 * @generated
	 */
	String getCommand();

	/**
	 * Sets the value of the '{@link net.sf.smbt.comm.httpcmd.HttpCommCmd#getCommand <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' attribute.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(String value);

} // HttpCommCmd
