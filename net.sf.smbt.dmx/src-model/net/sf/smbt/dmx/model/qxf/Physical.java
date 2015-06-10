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
 * A representation of the model object '<em><b>Physical</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.Physical#getBulb <em>Bulb</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.Physical#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.Physical#getLens <em>Lens</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.Physical#getFocus <em>Focus</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.Physical#getTechnical <em>Technical</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#getPhysical()
 * @model extendedMetaData="name='Physical' kind='elementOnly'"
 * @generated
 */
public interface Physical extends EObject {
	/**
	 * Returns the value of the '<em><b>Bulb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bulb</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bulb</em>' containment reference.
	 * @see #setBulb(Bulb)
	 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#getPhysical_Bulb()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bulb'"
	 * @generated
	 */
	Bulb getBulb();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.model.qxf.Physical#getBulb <em>Bulb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bulb</em>' containment reference.
	 * @see #getBulb()
	 * @generated
	 */
	void setBulb(Bulb value);

	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimensions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' containment reference.
	 * @see #setDimensions(Dimensions)
	 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#getPhysical_Dimensions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Dimensions'"
	 * @generated
	 */
	Dimensions getDimensions();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.model.qxf.Physical#getDimensions <em>Dimensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimensions</em>' containment reference.
	 * @see #getDimensions()
	 * @generated
	 */
	void setDimensions(Dimensions value);

	/**
	 * Returns the value of the '<em><b>Lens</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lens</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lens</em>' containment reference.
	 * @see #setLens(Lens)
	 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#getPhysical_Lens()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Lens'"
	 * @generated
	 */
	Lens getLens();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.model.qxf.Physical#getLens <em>Lens</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lens</em>' containment reference.
	 * @see #getLens()
	 * @generated
	 */
	void setLens(Lens value);

	/**
	 * Returns the value of the '<em><b>Focus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Focus</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Focus</em>' containment reference.
	 * @see #setFocus(Focus)
	 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#getPhysical_Focus()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Focus'"
	 * @generated
	 */
	Focus getFocus();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.model.qxf.Physical#getFocus <em>Focus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focus</em>' containment reference.
	 * @see #getFocus()
	 * @generated
	 */
	void setFocus(Focus value);

	/**
	 * Returns the value of the '<em><b>Technical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Technical</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technical</em>' containment reference.
	 * @see #setTechnical(Technical)
	 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#getPhysical_Technical()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Technical'"
	 * @generated
	 */
	Technical getTechnical();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.model.qxf.Physical#getTechnical <em>Technical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technical</em>' containment reference.
	 * @see #getTechnical()
	 * @generated
	 */
	void setTechnical(Technical value);

} // Physical
