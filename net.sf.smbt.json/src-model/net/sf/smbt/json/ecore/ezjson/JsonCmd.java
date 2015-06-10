/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.json.ecore.ezjson;

import net.sf.xqz.model.cmd.Cmd;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Json Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.json.ecore.ezjson.JsonCmd#getJson <em>Json</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.json.ecore.ezjson.EzjsonPackage#getJsonCmd()
 * @model
 * @generated
 */
public interface JsonCmd extends Cmd {
	/**
	 * Returns the value of the '<em><b>Json</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Json</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Json</em>' attribute.
	 * @see #setJson(Object)
	 * @see net.sf.smbt.json.ecore.ezjson.EzjsonPackage#getJsonCmd_Json()
	 * @model
	 * @generated
	 */
	Object getJson();

	/**
	 * Sets the value of the '{@link net.sf.smbt.json.ecore.ezjson.JsonCmd#getJson <em>Json</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Json</em>' attribute.
	 * @see #getJson()
	 * @generated
	 */
	void setJson(Object value);

} // JsonCmd
