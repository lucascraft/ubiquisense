/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezpachube;

import net.sf.smbt.comm.httpcmd.HttpcmdPackage;

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
 * @see net.sf.smbt.ezpachube.EzpachubeFactory
 * @model kind="package"
 * @generated
 */
public interface EzpachubePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ezpachube";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ezpachube/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ezpachube";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzpachubePackage eINSTANCE = net.sf.smbt.ezpachube.impl.EzpachubePackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezpachube.impl.CosmCmdImpl <em>Cosm Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezpachube.impl.CosmCmdImpl
	 * @see net.sf.smbt.ezpachube.impl.EzpachubePackageImpl#getCosmCmd()
	 * @generated
	 */
	int COSM_CMD = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSM_CMD__PRIORITY = HttpcmdPackage.HTTP_COMM_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSM_CMD__STAMP = HttpcmdPackage.HTTP_COMM_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSM_CMD__PROPERTIES = HttpcmdPackage.HTTP_COMM_CMD__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSM_CMD__METHOD = HttpcmdPackage.HTTP_COMM_CMD__METHOD;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSM_CMD__COMMAND = HttpcmdPackage.HTTP_COMM_CMD__COMMAND;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSM_CMD__STATUS = HttpcmdPackage.HTTP_COMM_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSM_CMD__ACCESS = HttpcmdPackage.HTTP_COMM_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Json</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSM_CMD__JSON = HttpcmdPackage.HTTP_COMM_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSM_CMD__VERSION = HttpcmdPackage.HTTP_COMM_CMD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Feed Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSM_CMD__FEED_KIND = HttpcmdPackage.HTTP_COMM_CMD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Feed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSM_CMD__FEED = HttpcmdPackage.HTTP_COMM_CMD_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Eeml</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSM_CMD__EEML = HttpcmdPackage.HTTP_COMM_CMD_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Datastream</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSM_CMD__DATASTREAM = HttpcmdPackage.HTTP_COMM_CMD_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Cosm Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COSM_CMD_FEATURE_COUNT = HttpcmdPackage.HTTP_COMM_CMD_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezpachube.PACHUBE_ACCESS <em>PACHUBE ACCESS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezpachube.PACHUBE_ACCESS
	 * @see net.sf.smbt.ezpachube.impl.EzpachubePackageImpl#getPACHUBE_ACCESS()
	 * @generated
	 */
	int PACHUBE_ACCESS = 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezpachube.PACHUBE_HTTP_STATUS <em>PACHUBE HTTP STATUS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezpachube.PACHUBE_HTTP_STATUS
	 * @see net.sf.smbt.ezpachube.impl.EzpachubePackageImpl#getPACHUBE_HTTP_STATUS()
	 * @generated
	 */
	int PACHUBE_HTTP_STATUS = 2;


	/**
	 * The meta object id for the '{@link net.sf.smbt.ezpachube.IntervalKind <em>Interval Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezpachube.IntervalKind
	 * @see net.sf.smbt.ezpachube.impl.EzpachubePackageImpl#getIntervalKind()
	 * @generated
	 */
	int INTERVAL_KIND = 3;


	/**
	 * The meta object id for the '{@link net.sf.smbt.ezpachube.FeedKind <em>Feed Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezpachube.FeedKind
	 * @see net.sf.smbt.ezpachube.impl.EzpachubePackageImpl#getFeedKind()
	 * @generated
	 */
	int FEED_KIND = 4;


	/**
	 * The meta object id for the '{@link net.sf.smbt.ezpachube.Version <em>Version</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezpachube.Version
	 * @see net.sf.smbt.ezpachube.impl.EzpachubePackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 5;


	/**
	 * The meta object id for the '{@link net.sf.smbt.ezpachube.FeedAction <em>Feed Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezpachube.FeedAction
	 * @see net.sf.smbt.ezpachube.impl.EzpachubePackageImpl#getFeedAction()
	 * @generated
	 */
	int FEED_ACTION = 6;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezpachube.DatastreamAction <em>Datastream Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezpachube.DatastreamAction
	 * @see net.sf.smbt.ezpachube.impl.EzpachubePackageImpl#getDatastreamAction()
	 * @generated
	 */
	int DATASTREAM_ACTION = 7;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezpachube.CosmCmd <em>Cosm Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cosm Cmd</em>'.
	 * @see net.sf.smbt.ezpachube.CosmCmd
	 * @generated
	 */
	EClass getCosmCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezpachube.CosmCmd#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see net.sf.smbt.ezpachube.CosmCmd#getStatus()
	 * @see #getCosmCmd()
	 * @generated
	 */
	EAttribute getCosmCmd_Status();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezpachube.CosmCmd#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see net.sf.smbt.ezpachube.CosmCmd#getAccess()
	 * @see #getCosmCmd()
	 * @generated
	 */
	EAttribute getCosmCmd_Access();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezpachube.CosmCmd#getJson <em>Json</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Json</em>'.
	 * @see net.sf.smbt.ezpachube.CosmCmd#getJson()
	 * @see #getCosmCmd()
	 * @generated
	 */
	EAttribute getCosmCmd_Json();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezpachube.CosmCmd#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.sf.smbt.ezpachube.CosmCmd#getVersion()
	 * @see #getCosmCmd()
	 * @generated
	 */
	EAttribute getCosmCmd_Version();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezpachube.CosmCmd#getFeedKind <em>Feed Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feed Kind</em>'.
	 * @see net.sf.smbt.ezpachube.CosmCmd#getFeedKind()
	 * @see #getCosmCmd()
	 * @generated
	 */
	EAttribute getCosmCmd_FeedKind();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezpachube.CosmCmd#getFeed <em>Feed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feed</em>'.
	 * @see net.sf.smbt.ezpachube.CosmCmd#getFeed()
	 * @see #getCosmCmd()
	 * @generated
	 */
	EAttribute getCosmCmd_Feed();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ezpachube.CosmCmd#getEeml <em>Eeml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Eeml</em>'.
	 * @see net.sf.smbt.ezpachube.CosmCmd#getEeml()
	 * @see #getCosmCmd()
	 * @generated
	 */
	EReference getCosmCmd_Eeml();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezpachube.CosmCmd#getDatastream <em>Datastream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datastream</em>'.
	 * @see net.sf.smbt.ezpachube.CosmCmd#getDatastream()
	 * @see #getCosmCmd()
	 * @generated
	 */
	EAttribute getCosmCmd_Datastream();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ezpachube.PACHUBE_ACCESS <em>PACHUBE ACCESS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PACHUBE ACCESS</em>'.
	 * @see net.sf.smbt.ezpachube.PACHUBE_ACCESS
	 * @generated
	 */
	EEnum getPACHUBE_ACCESS();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ezpachube.PACHUBE_HTTP_STATUS <em>PACHUBE HTTP STATUS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PACHUBE HTTP STATUS</em>'.
	 * @see net.sf.smbt.ezpachube.PACHUBE_HTTP_STATUS
	 * @generated
	 */
	EEnum getPACHUBE_HTTP_STATUS();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ezpachube.IntervalKind <em>Interval Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Interval Kind</em>'.
	 * @see net.sf.smbt.ezpachube.IntervalKind
	 * @generated
	 */
	EEnum getIntervalKind();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ezpachube.FeedKind <em>Feed Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feed Kind</em>'.
	 * @see net.sf.smbt.ezpachube.FeedKind
	 * @generated
	 */
	EEnum getFeedKind();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ezpachube.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Version</em>'.
	 * @see net.sf.smbt.ezpachube.Version
	 * @generated
	 */
	EEnum getVersion();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ezpachube.FeedAction <em>Feed Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feed Action</em>'.
	 * @see net.sf.smbt.ezpachube.FeedAction
	 * @generated
	 */
	EEnum getFeedAction();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ezpachube.DatastreamAction <em>Datastream Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Datastream Action</em>'.
	 * @see net.sf.smbt.ezpachube.DatastreamAction
	 * @generated
	 */
	EEnum getDatastreamAction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EzpachubeFactory getEzpachubeFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.ezpachube.impl.CosmCmdImpl <em>Cosm Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezpachube.impl.CosmCmdImpl
		 * @see net.sf.smbt.ezpachube.impl.EzpachubePackageImpl#getCosmCmd()
		 * @generated
		 */
		EClass COSM_CMD = eINSTANCE.getCosmCmd();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COSM_CMD__STATUS = eINSTANCE.getCosmCmd_Status();

		/**
		 * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COSM_CMD__ACCESS = eINSTANCE.getCosmCmd_Access();

		/**
		 * The meta object literal for the '<em><b>Json</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COSM_CMD__JSON = eINSTANCE.getCosmCmd_Json();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COSM_CMD__VERSION = eINSTANCE.getCosmCmd_Version();

		/**
		 * The meta object literal for the '<em><b>Feed Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COSM_CMD__FEED_KIND = eINSTANCE.getCosmCmd_FeedKind();

		/**
		 * The meta object literal for the '<em><b>Feed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COSM_CMD__FEED = eINSTANCE.getCosmCmd_Feed();

		/**
		 * The meta object literal for the '<em><b>Eeml</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COSM_CMD__EEML = eINSTANCE.getCosmCmd_Eeml();

		/**
		 * The meta object literal for the '<em><b>Datastream</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COSM_CMD__DATASTREAM = eINSTANCE.getCosmCmd_Datastream();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezpachube.PACHUBE_ACCESS <em>PACHUBE ACCESS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezpachube.PACHUBE_ACCESS
		 * @see net.sf.smbt.ezpachube.impl.EzpachubePackageImpl#getPACHUBE_ACCESS()
		 * @generated
		 */
		EEnum PACHUBE_ACCESS = eINSTANCE.getPACHUBE_ACCESS();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezpachube.PACHUBE_HTTP_STATUS <em>PACHUBE HTTP STATUS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezpachube.PACHUBE_HTTP_STATUS
		 * @see net.sf.smbt.ezpachube.impl.EzpachubePackageImpl#getPACHUBE_HTTP_STATUS()
		 * @generated
		 */
		EEnum PACHUBE_HTTP_STATUS = eINSTANCE.getPACHUBE_HTTP_STATUS();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezpachube.IntervalKind <em>Interval Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezpachube.IntervalKind
		 * @see net.sf.smbt.ezpachube.impl.EzpachubePackageImpl#getIntervalKind()
		 * @generated
		 */
		EEnum INTERVAL_KIND = eINSTANCE.getIntervalKind();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezpachube.FeedKind <em>Feed Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezpachube.FeedKind
		 * @see net.sf.smbt.ezpachube.impl.EzpachubePackageImpl#getFeedKind()
		 * @generated
		 */
		EEnum FEED_KIND = eINSTANCE.getFeedKind();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezpachube.Version <em>Version</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezpachube.Version
		 * @see net.sf.smbt.ezpachube.impl.EzpachubePackageImpl#getVersion()
		 * @generated
		 */
		EEnum VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezpachube.FeedAction <em>Feed Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezpachube.FeedAction
		 * @see net.sf.smbt.ezpachube.impl.EzpachubePackageImpl#getFeedAction()
		 * @generated
		 */
		EEnum FEED_ACTION = eINSTANCE.getFeedAction();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezpachube.DatastreamAction <em>Datastream Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezpachube.DatastreamAction
		 * @see net.sf.smbt.ezpachube.impl.EzpachubePackageImpl#getDatastreamAction()
		 * @generated
		 */
		EEnum DATASTREAM_ACTION = eINSTANCE.getDatastreamAction();

	}

} //EzpachubePackage
