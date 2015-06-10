/**
 */
package net.sf.smbt.ezcosm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eeml.xsd._0._5.DataType;
import org.eeml.xsd._0._5.EemlType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cosm Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezcosm.CosmProject#getEeml <em>Eeml</em>}</li>
 *   <li>{@link net.sf.smbt.ezcosm.CosmProject#getLastCoordinate <em>Last Coordinate</em>}</li>
 *   <li>{@link net.sf.smbt.ezcosm.CosmProject#isHideFrozen <em>Hide Frozen</em>}</li>
 *   <li>{@link net.sf.smbt.ezcosm.CosmProject#getLastDatastream <em>Last Datastream</em>}</li>
 *   <li>{@link net.sf.smbt.ezcosm.CosmProject#getTriggers <em>Triggers</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezcosm.EzcosmPackage#getCosmProject()
 * @model
 * @generated
 */
public interface CosmProject extends EObject {
	/**
	 * Returns the value of the '<em><b>Eeml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eeml</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eeml</em>' containment reference.
	 * @see #setEeml(EemlType)
	 * @see net.sf.smbt.ezcosm.EzcosmPackage#getCosmProject_Eeml()
	 * @model containment="true"
	 * @generated
	 */
	EemlType getEeml();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezcosm.CosmProject#getEeml <em>Eeml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eeml</em>' containment reference.
	 * @see #getEeml()
	 * @generated
	 */
	void setEeml(EemlType value);

	/**
	 * Returns the value of the '<em><b>Last Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Coordinate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Coordinate</em>' containment reference.
	 * @see #setLastCoordinate(Coordinates)
	 * @see net.sf.smbt.ezcosm.EzcosmPackage#getCosmProject_LastCoordinate()
	 * @model containment="true"
	 * @generated
	 */
	Coordinates getLastCoordinate();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezcosm.CosmProject#getLastCoordinate <em>Last Coordinate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Coordinate</em>' containment reference.
	 * @see #getLastCoordinate()
	 * @generated
	 */
	void setLastCoordinate(Coordinates value);

	/**
	 * Returns the value of the '<em><b>Hide Frozen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hide Frozen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hide Frozen</em>' attribute.
	 * @see #setHideFrozen(boolean)
	 * @see net.sf.smbt.ezcosm.EzcosmPackage#getCosmProject_HideFrozen()
	 * @model
	 * @generated
	 */
	boolean isHideFrozen();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezcosm.CosmProject#isHideFrozen <em>Hide Frozen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hide Frozen</em>' attribute.
	 * @see #isHideFrozen()
	 * @generated
	 */
	void setHideFrozen(boolean value);

	/**
	 * Returns the value of the '<em><b>Last Datastream</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Datastream</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Datastream</em>' reference.
	 * @see #setLastDatastream(DataType)
	 * @see net.sf.smbt.ezcosm.EzcosmPackage#getCosmProject_LastDatastream()
	 * @model
	 * @generated
	 */
	DataType getLastDatastream();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezcosm.CosmProject#getLastDatastream <em>Last Datastream</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Datastream</em>' reference.
	 * @see #getLastDatastream()
	 * @generated
	 */
	void setLastDatastream(DataType value);

	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezcosm.Trigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' containment reference list.
	 * @see net.sf.smbt.ezcosm.EzcosmPackage#getCosmProject_Triggers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trigger> getTriggers();

} // CosmProject
