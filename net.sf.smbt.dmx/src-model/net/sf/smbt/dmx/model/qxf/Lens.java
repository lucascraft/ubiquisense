/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.model.qxf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lens</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.Lens#getDegreesMax <em>Degrees Max</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.Lens#getDegreesMin <em>Degrees Min</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.Lens#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#getLens()
 * @model extendedMetaData="name='Lens' kind='empty'"
 * @generated
 */
public interface Lens extends EObject {
	/**
	 * Returns the value of the '<em><b>Degrees Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Degrees Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degrees Max</em>' attribute.
	 * @see #setDegreesMax(String)
	 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#getLens_DegreesMax()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='DegreesMax'"
	 * @generated
	 */
	String getDegreesMax();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.model.qxf.Lens#getDegreesMax <em>Degrees Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degrees Max</em>' attribute.
	 * @see #getDegreesMax()
	 * @generated
	 */
	void setDegreesMax(String value);

	/**
	 * Returns the value of the '<em><b>Degrees Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Degrees Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degrees Min</em>' attribute.
	 * @see #setDegreesMin(String)
	 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#getLens_DegreesMin()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='DegreesMin'"
	 * @generated
	 */
	String getDegreesMin();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.model.qxf.Lens#getDegreesMin <em>Degrees Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degrees Min</em>' attribute.
	 * @see #getDegreesMin()
	 * @generated
	 */
	void setDegreesMin(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#getLens_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.model.qxf.Lens#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Lens
