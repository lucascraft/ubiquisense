/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.OscMeta#getVersion <em>Version</em>}</li>
 *   <li>{@link net.sf.smbt.osc.OscMeta#getFraming <em>Framing</em>}</li>
 *   <li>{@link net.sf.smbt.osc.OscMeta#getUri <em>Uri</em>}</li>
 *   <li>{@link net.sf.smbt.osc.OscMeta#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.osc.OscPackage#getOscMeta()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface OscMeta extends EObject {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.osc.OscType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see net.sf.smbt.osc.OscType
	 * @see #setVersion(OscType)
	 * @see net.sf.smbt.osc.OscPackage#getOscMeta_Version()
	 * @model
	 * @generated
	 */
	OscType getVersion();

	/**
	 * Sets the value of the '{@link net.sf.smbt.osc.OscMeta#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see net.sf.smbt.osc.OscType
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(OscType value);

	/**
	 * Returns the value of the '<em><b>Framing</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.osc.OscFraming}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Framing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Framing</em>' attribute.
	 * @see net.sf.smbt.osc.OscFraming
	 * @see #setFraming(OscFraming)
	 * @see net.sf.smbt.osc.OscPackage#getOscMeta_Framing()
	 * @model
	 * @generated
	 */
	OscFraming getFraming();

	/**
	 * Sets the value of the '{@link net.sf.smbt.osc.OscMeta#getFraming <em>Framing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Framing</em>' attribute.
	 * @see net.sf.smbt.osc.OscFraming
	 * @see #getFraming()
	 * @generated
	 */
	void setFraming(OscFraming value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see net.sf.smbt.osc.OscPackage#getOscMeta_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link net.sf.smbt.osc.OscMeta#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' attribute list.
	 * The list contents are of type {@link net.sf.smbt.osc.OscType}.
	 * The literals are from the enumeration {@link net.sf.smbt.osc.OscType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' attribute list.
	 * @see net.sf.smbt.osc.OscType
	 * @see net.sf.smbt.osc.OscPackage#getOscMeta_Types()
	 * @model
	 * @generated
	 */
	EList<OscType> getTypes();

} // OscMeta
