/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.firmata.ubiquino;

import net.sf.xqz.model.engine.EnginePackage;

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
 * @see net.sf.smbt.firmata.ubiquino.UbiquinoFactory
 * @model kind="package"
 * @generated
 */
public interface UbiquinoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ubiquino";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ubiquisense.com/ubiquino/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ubiquino";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UbiquinoPackage eINSTANCE = net.sf.smbt.firmata.ubiquino.impl.UbiquinoPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.firmata.ubiquino.impl.UbiquinoImpl <em>Ubiquino</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.firmata.ubiquino.impl.UbiquinoImpl
	 * @see net.sf.smbt.firmata.ubiquino.impl.UbiquinoPackageImpl#getUbiquino()
	 * @generated
	 */
	int UBIQUINO = 0;

	/**
	 * The feature id for the '<em><b>Engines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBIQUINO__ENGINES = EnginePackage.ICONNECTED_UNIT__ENGINES;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBIQUINO__DEFAULT = EnginePackage.ICONNECTED_UNIT__DEFAULT;

	/**
	 * The feature id for the '<em><b>Board</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBIQUINO__BOARD = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBIQUINO__CONFIG = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Last Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBIQUINO__LAST_ADDRESS = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ubiquino</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBIQUINO_FEATURE_COUNT = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.firmata.ubiquino.impl.UbiquinoConfigImpl <em>Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.firmata.ubiquino.impl.UbiquinoConfigImpl
	 * @see net.sf.smbt.firmata.ubiquino.impl.UbiquinoPackageImpl#getUbiquinoConfig()
	 * @generated
	 */
	int UBIQUINO_CONFIG = 1;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBIQUINO_CONFIG__PORTS = 0;

	/**
	 * The number of structural features of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBIQUINO_CONFIG_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.firmata.ubiquino.impl.PortConfigImpl <em>Port Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.firmata.ubiquino.impl.PortConfigImpl
	 * @see net.sf.smbt.firmata.ubiquino.impl.UbiquinoPackageImpl#getPortConfig()
	 * @generated
	 */
	int PORT_CONFIG = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONFIG__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONFIG__KIND = 1;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONFIG__ENABLED = 2;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONFIG__MODE = 3;

	/**
	 * The feature id for the '<em><b>Pwm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONFIG__PWM = 4;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONFIG__CHANNEL = 5;

	/**
	 * The number of structural features of the '<em>Port Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_CONFIG_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link net.sf.smbt.firmata.ubiquino.PortConfigKind <em>Port Config Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.firmata.ubiquino.PortConfigKind
	 * @see net.sf.smbt.firmata.ubiquino.impl.UbiquinoPackageImpl#getPortConfigKind()
	 * @generated
	 */
	int PORT_CONFIG_KIND = 3;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.firmata.ubiquino.Ubiquino <em>Ubiquino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubiquino</em>'.
	 * @see net.sf.smbt.firmata.ubiquino.Ubiquino
	 * @generated
	 */
	EClass getUbiquino();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.firmata.ubiquino.Ubiquino#getBoard <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Board</em>'.
	 * @see net.sf.smbt.firmata.ubiquino.Ubiquino#getBoard()
	 * @see #getUbiquino()
	 * @generated
	 */
	EReference getUbiquino_Board();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.firmata.ubiquino.Ubiquino#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config</em>'.
	 * @see net.sf.smbt.firmata.ubiquino.Ubiquino#getConfig()
	 * @see #getUbiquino()
	 * @generated
	 */
	EReference getUbiquino_Config();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.firmata.ubiquino.Ubiquino#getLastAddress <em>Last Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Last Address</em>'.
	 * @see net.sf.smbt.firmata.ubiquino.Ubiquino#getLastAddress()
	 * @see #getUbiquino()
	 * @generated
	 */
	EReference getUbiquino_LastAddress();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.firmata.ubiquino.UbiquinoConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config</em>'.
	 * @see net.sf.smbt.firmata.ubiquino.UbiquinoConfig
	 * @generated
	 */
	EClass getUbiquinoConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.firmata.ubiquino.UbiquinoConfig#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see net.sf.smbt.firmata.ubiquino.UbiquinoConfig#getPorts()
	 * @see #getUbiquinoConfig()
	 * @generated
	 */
	EReference getUbiquinoConfig_Ports();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.firmata.ubiquino.PortConfig <em>Port Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Config</em>'.
	 * @see net.sf.smbt.firmata.ubiquino.PortConfig
	 * @generated
	 */
	EClass getPortConfig();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.firmata.ubiquino.PortConfig#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see net.sf.smbt.firmata.ubiquino.PortConfig#getTarget()
	 * @see #getPortConfig()
	 * @generated
	 */
	EReference getPortConfig_Target();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.firmata.ubiquino.PortConfig#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see net.sf.smbt.firmata.ubiquino.PortConfig#getKind()
	 * @see #getPortConfig()
	 * @generated
	 */
	EAttribute getPortConfig_Kind();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.firmata.ubiquino.PortConfig#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see net.sf.smbt.firmata.ubiquino.PortConfig#isEnabled()
	 * @see #getPortConfig()
	 * @generated
	 */
	EAttribute getPortConfig_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.firmata.ubiquino.PortConfig#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see net.sf.smbt.firmata.ubiquino.PortConfig#getMode()
	 * @see #getPortConfig()
	 * @generated
	 */
	EAttribute getPortConfig_Mode();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.firmata.ubiquino.PortConfig#getPwm <em>Pwm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pwm</em>'.
	 * @see net.sf.smbt.firmata.ubiquino.PortConfig#getPwm()
	 * @see #getPortConfig()
	 * @generated
	 */
	EAttribute getPortConfig_Pwm();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.firmata.ubiquino.PortConfig#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel</em>'.
	 * @see net.sf.smbt.firmata.ubiquino.PortConfig#getChannel()
	 * @see #getPortConfig()
	 * @generated
	 */
	EAttribute getPortConfig_Channel();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.firmata.ubiquino.PortConfigKind <em>Port Config Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Port Config Kind</em>'.
	 * @see net.sf.smbt.firmata.ubiquino.PortConfigKind
	 * @generated
	 */
	EEnum getPortConfigKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UbiquinoFactory getUbiquinoFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.firmata.ubiquino.impl.UbiquinoImpl <em>Ubiquino</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.firmata.ubiquino.impl.UbiquinoImpl
		 * @see net.sf.smbt.firmata.ubiquino.impl.UbiquinoPackageImpl#getUbiquino()
		 * @generated
		 */
		EClass UBIQUINO = eINSTANCE.getUbiquino();

		/**
		 * The meta object literal for the '<em><b>Board</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBIQUINO__BOARD = eINSTANCE.getUbiquino_Board();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBIQUINO__CONFIG = eINSTANCE.getUbiquino_Config();

		/**
		 * The meta object literal for the '<em><b>Last Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBIQUINO__LAST_ADDRESS = eINSTANCE.getUbiquino_LastAddress();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.firmata.ubiquino.impl.UbiquinoConfigImpl <em>Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.firmata.ubiquino.impl.UbiquinoConfigImpl
		 * @see net.sf.smbt.firmata.ubiquino.impl.UbiquinoPackageImpl#getUbiquinoConfig()
		 * @generated
		 */
		EClass UBIQUINO_CONFIG = eINSTANCE.getUbiquinoConfig();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UBIQUINO_CONFIG__PORTS = eINSTANCE.getUbiquinoConfig_Ports();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.firmata.ubiquino.impl.PortConfigImpl <em>Port Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.firmata.ubiquino.impl.PortConfigImpl
		 * @see net.sf.smbt.firmata.ubiquino.impl.UbiquinoPackageImpl#getPortConfig()
		 * @generated
		 */
		EClass PORT_CONFIG = eINSTANCE.getPortConfig();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_CONFIG__TARGET = eINSTANCE.getPortConfig_Target();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_CONFIG__KIND = eINSTANCE.getPortConfig_Kind();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_CONFIG__ENABLED = eINSTANCE.getPortConfig_Enabled();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_CONFIG__MODE = eINSTANCE.getPortConfig_Mode();

		/**
		 * The meta object literal for the '<em><b>Pwm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_CONFIG__PWM = eINSTANCE.getPortConfig_Pwm();

		/**
		 * The meta object literal for the '<em><b>Channel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_CONFIG__CHANNEL = eINSTANCE.getPortConfig_Channel();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.firmata.ubiquino.PortConfigKind <em>Port Config Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.firmata.ubiquino.PortConfigKind
		 * @see net.sf.smbt.firmata.ubiquino.impl.UbiquinoPackageImpl#getPortConfigKind()
		 * @generated
		 */
		EEnum PORT_CONFIG_KIND = eINSTANCE.getPortConfigKind();

	}

} //UbiquinoPackage
