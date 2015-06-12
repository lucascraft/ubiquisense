/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.thingmcfg;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see net.sf.smbt.thingmcfg.ThingmcfgFactory
 * @model kind="package"
 * @generated
 */
public interface ThingmcfgPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "thingmcfg";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://thingmcfg/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "thingmcfg";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ThingmcfgPackage eINSTANCE = net.sf.smbt.thingmcfg.impl.ThingmcfgPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.thingmcfg.impl.ThingMCfgImpl <em>Thing MCfg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.thingmcfg.impl.ThingMCfgImpl
	 * @see net.sf.smbt.thingmcfg.impl.ThingmcfgPackageImpl#getThingMCfg()
	 * @generated
	 */
	int THING_MCFG = 0;

	/**
	 * The feature id for the '<em><b>Port Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_MCFG__PORT_ADDR = 0;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_MCFG__SPEED = 1;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_MCFG__DEVICE = 2;

	/**
	 * The number of structural features of the '<em>Thing MCfg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_MCFG_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.thingmcfg.ThingMDevice <em>Thing MDevice</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.thingmcfg.ThingMDevice
	 * @see net.sf.smbt.thingmcfg.impl.ThingmcfgPackageImpl#getThingMDevice()
	 * @generated
	 */
	int THING_MDEVICE = 1;


	/**
	 * The meta object id for the '<em>Comm Port Identifier</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gnu.io.CommPortIdentifier
	 * @see net.sf.smbt.thingmcfg.impl.ThingmcfgPackageImpl#getCommPortIdentifier()
	 * @generated
	 */
	int COMM_PORT_IDENTIFIER = 2;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.thingmcfg.ThingMCfg <em>Thing MCfg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thing MCfg</em>'.
	 * @see net.sf.smbt.thingmcfg.ThingMCfg
	 * @generated
	 */
	EClass getThingMCfg();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.thingmcfg.ThingMCfg#getPortAddr <em>Port Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Addr</em>'.
	 * @see net.sf.smbt.thingmcfg.ThingMCfg#getPortAddr()
	 * @see #getThingMCfg()
	 * @generated
	 */
	EAttribute getThingMCfg_PortAddr();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.thingmcfg.ThingMCfg#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see net.sf.smbt.thingmcfg.ThingMCfg#getSpeed()
	 * @see #getThingMCfg()
	 * @generated
	 */
	EAttribute getThingMCfg_Speed();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.thingmcfg.ThingMCfg#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device</em>'.
	 * @see net.sf.smbt.thingmcfg.ThingMCfg#getDevice()
	 * @see #getThingMCfg()
	 * @generated
	 */
	EAttribute getThingMCfg_Device();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.thingmcfg.ThingMDevice <em>Thing MDevice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Thing MDevice</em>'.
	 * @see net.sf.smbt.thingmcfg.ThingMDevice
	 * @generated
	 */
	EEnum getThingMDevice();

	/**
	 * Returns the meta object for data type '{@link gnu.io.CommPortIdentifier <em>Comm Port Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Comm Port Identifier</em>'.
	 * @see gnu.io.CommPortIdentifier
	 * @model instanceClass="gnu.io.CommPortIdentifier"
	 * @generated
	 */
	EDataType getCommPortIdentifier();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ThingmcfgFactory getThingmcfgFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.thingmcfg.impl.ThingMCfgImpl <em>Thing MCfg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.thingmcfg.impl.ThingMCfgImpl
		 * @see net.sf.smbt.thingmcfg.impl.ThingmcfgPackageImpl#getThingMCfg()
		 * @generated
		 */
		EClass THING_MCFG = eINSTANCE.getThingMCfg();

		/**
		 * The meta object literal for the '<em><b>Port Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING_MCFG__PORT_ADDR = eINSTANCE.getThingMCfg_PortAddr();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING_MCFG__SPEED = eINSTANCE.getThingMCfg_Speed();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING_MCFG__DEVICE = eINSTANCE.getThingMCfg_Device();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.thingmcfg.ThingMDevice <em>Thing MDevice</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.thingmcfg.ThingMDevice
		 * @see net.sf.smbt.thingmcfg.impl.ThingmcfgPackageImpl#getThingMDevice()
		 * @generated
		 */
		EEnum THING_MDEVICE = eINSTANCE.getThingMDevice();

		/**
		 * The meta object literal for the '<em>Comm Port Identifier</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gnu.io.CommPortIdentifier
		 * @see net.sf.smbt.thingmcfg.impl.ThingmcfgPackageImpl#getCommPortIdentifier()
		 * @generated
		 */
		EDataType COMM_PORT_IDENTIFIER = eINSTANCE.getCommPortIdentifier();

	}

} //ThingmcfgPackage
