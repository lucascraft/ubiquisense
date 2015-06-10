/**
 */
package net.sf.smbt.ezcosm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezcosm.EzcosmFactory
 * @model kind="package"
 * @generated
 */
public interface EzcosmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ezcosm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ezcosm/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ezcosm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzcosmPackage eINSTANCE = net.sf.smbt.ezcosm.impl.EzcosmPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezcosm.impl.CosmProjectImpl <em>Cosm Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezcosm.impl.CosmProjectImpl
	 * @see net.sf.smbt.ezcosm.impl.EzcosmPackageImpl#getCosmProject()
	 * @generated
	 */
	int COSM_PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Eeml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSM_PROJECT__EEML = 0;

	/**
	 * The feature id for the '<em><b>Last Coordinate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSM_PROJECT__LAST_COORDINATE = 1;

	/**
	 * The feature id for the '<em><b>Hide Frozen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSM_PROJECT__HIDE_FROZEN = 2;

	/**
	 * The feature id for the '<em><b>Last Datastream</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSM_PROJECT__LAST_DATASTREAM = 3;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSM_PROJECT__TRIGGERS = 4;

	/**
	 * The number of structural features of the '<em>Cosm Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSM_PROJECT_FEATURE_COUNT = 5;


	/**
	 * The meta object id for the '{@link net.sf.smbt.ezcosm.impl.CoordinatesImpl <em>Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezcosm.impl.CoordinatesImpl
	 * @see net.sf.smbt.ezcosm.impl.EzcosmPackageImpl#getCoordinates()
	 * @generated
	 */
	int COORDINATES = 1;

	/**
	 * The feature id for the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES__LAT = 0;

	/**
	 * The feature id for the '<em><b>Lon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES__LON = 1;

	/**
	 * The feature id for the '<em><b>Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES__ZOOM = 2;

	/**
	 * The number of structural features of the '<em>Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_FEATURE_COUNT = 3;


	/**
	 * The meta object id for the '{@link net.sf.smbt.ezcosm.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezcosm.impl.TriggerImpl
	 * @see net.sf.smbt.ezcosm.impl.EzcosmPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 2;

	/**
	 * The feature id for the '<em><b>Feed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__FEED = 0;

	/**
	 * The feature id for the '<em><b>Stream</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__STREAM = 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__KIND = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__VALUE = 4;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__URL = 5;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezcosm.TriggerKind <em>Trigger Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezcosm.TriggerKind
	 * @see net.sf.smbt.ezcosm.impl.EzcosmPackageImpl#getTriggerKind()
	 * @generated
	 */
	int TRIGGER_KIND = 3;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezcosm.CosmProject <em>Cosm Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cosm Project</em>'.
	 * @see net.sf.smbt.ezcosm.CosmProject
	 * @generated
	 */
	EClass getCosmProject();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.ezcosm.CosmProject#getEeml <em>Eeml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eeml</em>'.
	 * @see net.sf.smbt.ezcosm.CosmProject#getEeml()
	 * @see #getCosmProject()
	 * @generated
	 */
	EReference getCosmProject_Eeml();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.ezcosm.CosmProject#getLastCoordinate <em>Last Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Last Coordinate</em>'.
	 * @see net.sf.smbt.ezcosm.CosmProject#getLastCoordinate()
	 * @see #getCosmProject()
	 * @generated
	 */
	EReference getCosmProject_LastCoordinate();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezcosm.CosmProject#isHideFrozen <em>Hide Frozen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hide Frozen</em>'.
	 * @see net.sf.smbt.ezcosm.CosmProject#isHideFrozen()
	 * @see #getCosmProject()
	 * @generated
	 */
	EAttribute getCosmProject_HideFrozen();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ezcosm.CosmProject#getLastDatastream <em>Last Datastream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Last Datastream</em>'.
	 * @see net.sf.smbt.ezcosm.CosmProject#getLastDatastream()
	 * @see #getCosmProject()
	 * @generated
	 */
	EReference getCosmProject_LastDatastream();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezcosm.CosmProject#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggers</em>'.
	 * @see net.sf.smbt.ezcosm.CosmProject#getTriggers()
	 * @see #getCosmProject()
	 * @generated
	 */
	EReference getCosmProject_Triggers();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezcosm.Coordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinates</em>'.
	 * @see net.sf.smbt.ezcosm.Coordinates
	 * @generated
	 */
	EClass getCoordinates();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezcosm.Coordinates#getLat <em>Lat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat</em>'.
	 * @see net.sf.smbt.ezcosm.Coordinates#getLat()
	 * @see #getCoordinates()
	 * @generated
	 */
	EAttribute getCoordinates_Lat();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezcosm.Coordinates#getLon <em>Lon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lon</em>'.
	 * @see net.sf.smbt.ezcosm.Coordinates#getLon()
	 * @see #getCoordinates()
	 * @generated
	 */
	EAttribute getCoordinates_Lon();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezcosm.Coordinates#getZoom <em>Zoom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zoom</em>'.
	 * @see net.sf.smbt.ezcosm.Coordinates#getZoom()
	 * @see #getCoordinates()
	 * @generated
	 */
	EAttribute getCoordinates_Zoom();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezcosm.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see net.sf.smbt.ezcosm.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezcosm.Trigger#getFeed <em>Feed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feed</em>'.
	 * @see net.sf.smbt.ezcosm.Trigger#getFeed()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Feed();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezcosm.Trigger#getStream <em>Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stream</em>'.
	 * @see net.sf.smbt.ezcosm.Trigger#getStream()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Stream();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezcosm.Trigger#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see net.sf.smbt.ezcosm.Trigger#getKind()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Kind();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezcosm.Trigger#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.sf.smbt.ezcosm.Trigger#getType()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Type();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezcosm.Trigger#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.smbt.ezcosm.Trigger#getValue()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezcosm.Trigger#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see net.sf.smbt.ezcosm.Trigger#getUrl()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Url();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ezcosm.TriggerKind <em>Trigger Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trigger Kind</em>'.
	 * @see net.sf.smbt.ezcosm.TriggerKind
	 * @generated
	 */
	EEnum getTriggerKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EzcosmFactory getEzcosmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezcosm.impl.CosmProjectImpl <em>Cosm Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezcosm.impl.CosmProjectImpl
		 * @see net.sf.smbt.ezcosm.impl.EzcosmPackageImpl#getCosmProject()
		 * @generated
		 */
		EClass COSM_PROJECT = eINSTANCE.getCosmProject();

		/**
		 * The meta object literal for the '<em><b>Eeml</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COSM_PROJECT__EEML = eINSTANCE.getCosmProject_Eeml();

		/**
		 * The meta object literal for the '<em><b>Last Coordinate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COSM_PROJECT__LAST_COORDINATE = eINSTANCE.getCosmProject_LastCoordinate();

		/**
		 * The meta object literal for the '<em><b>Hide Frozen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COSM_PROJECT__HIDE_FROZEN = eINSTANCE.getCosmProject_HideFrozen();

		/**
		 * The meta object literal for the '<em><b>Last Datastream</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COSM_PROJECT__LAST_DATASTREAM = eINSTANCE.getCosmProject_LastDatastream();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COSM_PROJECT__TRIGGERS = eINSTANCE.getCosmProject_Triggers();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezcosm.impl.CoordinatesImpl <em>Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezcosm.impl.CoordinatesImpl
		 * @see net.sf.smbt.ezcosm.impl.EzcosmPackageImpl#getCoordinates()
		 * @generated
		 */
		EClass COORDINATES = eINSTANCE.getCoordinates();

		/**
		 * The meta object literal for the '<em><b>Lat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATES__LAT = eINSTANCE.getCoordinates_Lat();

		/**
		 * The meta object literal for the '<em><b>Lon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATES__LON = eINSTANCE.getCoordinates_Lon();

		/**
		 * The meta object literal for the '<em><b>Zoom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATES__ZOOM = eINSTANCE.getCoordinates_Zoom();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezcosm.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezcosm.impl.TriggerImpl
		 * @see net.sf.smbt.ezcosm.impl.EzcosmPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Feed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__FEED = eINSTANCE.getTrigger_Feed();

		/**
		 * The meta object literal for the '<em><b>Stream</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__STREAM = eINSTANCE.getTrigger_Stream();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__KIND = eINSTANCE.getTrigger_Kind();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__TYPE = eINSTANCE.getTrigger_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__VALUE = eINSTANCE.getTrigger_Value();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__URL = eINSTANCE.getTrigger_Url();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezcosm.TriggerKind <em>Trigger Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezcosm.TriggerKind
		 * @see net.sf.smbt.ezcosm.impl.EzcosmPackageImpl#getTriggerKind()
		 * @generated
		 */
		EEnum TRIGGER_KIND = eINSTANCE.getTriggerKind();

	}

} //EzcosmPackage
