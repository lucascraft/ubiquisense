/**
 */
package net.sf.smbt.ezcosm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezcosm.Coordinates#getLat <em>Lat</em>}</li>
 *   <li>{@link net.sf.smbt.ezcosm.Coordinates#getLon <em>Lon</em>}</li>
 *   <li>{@link net.sf.smbt.ezcosm.Coordinates#getZoom <em>Zoom</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezcosm.EzcosmPackage#getCoordinates()
 * @model
 * @generated
 */
public interface Coordinates extends EObject {
	/**
	 * Returns the value of the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat</em>' attribute.
	 * @see #setLat(double)
	 * @see net.sf.smbt.ezcosm.EzcosmPackage#getCoordinates_Lat()
	 * @model
	 * @generated
	 */
	double getLat();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezcosm.Coordinates#getLat <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lat</em>' attribute.
	 * @see #getLat()
	 * @generated
	 */
	void setLat(double value);

	/**
	 * Returns the value of the '<em><b>Lon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lon</em>' attribute.
	 * @see #setLon(double)
	 * @see net.sf.smbt.ezcosm.EzcosmPackage#getCoordinates_Lon()
	 * @model
	 * @generated
	 */
	double getLon();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezcosm.Coordinates#getLon <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lon</em>' attribute.
	 * @see #getLon()
	 * @generated
	 */
	void setLon(double value);

	/**
	 * Returns the value of the '<em><b>Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zoom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zoom</em>' attribute.
	 * @see #setZoom(int)
	 * @see net.sf.smbt.ezcosm.EzcosmPackage#getCoordinates_Zoom()
	 * @model
	 * @generated
	 */
	int getZoom();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezcosm.Coordinates#getZoom <em>Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zoom</em>' attribute.
	 * @see #getZoom()
	 * @generated
	 */
	void setZoom(int value);

} // Coordinates
