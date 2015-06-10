/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezubiquino;

import net.sf.smbt.osccmd.OsccmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see net.sf.smbt.ezubiquino.EzubiquinoFactory
 * @model kind="package"
 * @generated
 */
public interface EzubiquinoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ezubiquino";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ezubiquino/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ezubiquino";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzubiquinoPackage eINSTANCE = net.sf.smbt.ezubiquino.impl.EzubiquinoPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezubiquino.impl.OscUbiquinoCmdImpl <em>Osc Ubiquino Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezubiquino.impl.OscUbiquinoCmdImpl
	 * @see net.sf.smbt.ezubiquino.impl.EzubiquinoPackageImpl#getOscUbiquinoCmd()
	 * @generated
	 */
	int OSC_UBIQUINO_CMD = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_UBIQUINO_CMD__PRIORITY = OsccmdPackage.OSC_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_UBIQUINO_CMD__STAMP = OsccmdPackage.OSC_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_UBIQUINO_CMD__MSG = OsccmdPackage.OSC_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_UBIQUINO_CMD__KIND = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Osc Ubiquino Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_UBIQUINO_CMD_FEATURE_COUNT = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezubiquino.impl.OscFirmataCmdImpl <em>Osc Firmata Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezubiquino.impl.OscFirmataCmdImpl
	 * @see net.sf.smbt.ezubiquino.impl.EzubiquinoPackageImpl#getOscFirmataCmd()
	 * @generated
	 */
	int OSC_FIRMATA_CMD = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_FIRMATA_CMD__PRIORITY = OsccmdPackage.OSC_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_FIRMATA_CMD__STAMP = OsccmdPackage.OSC_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_FIRMATA_CMD__MSG = OsccmdPackage.OSC_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_FIRMATA_CMD__KIND = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Osc Firmata Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_FIRMATA_CMD_FEATURE_COUNT = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezubiquino.UbiquinoKind <em>Ubiquino Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezubiquino.UbiquinoKind
	 * @see net.sf.smbt.ezubiquino.impl.EzubiquinoPackageImpl#getUbiquinoKind()
	 * @generated
	 */
	int UBIQUINO_KIND = 2;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezubiquino.OscUbiquinoCmd <em>Osc Ubiquino Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Osc Ubiquino Cmd</em>'.
	 * @see net.sf.smbt.ezubiquino.OscUbiquinoCmd
	 * @generated
	 */
	EClass getOscUbiquinoCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezubiquino.OscUbiquinoCmd#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see net.sf.smbt.ezubiquino.OscUbiquinoCmd#getKind()
	 * @see #getOscUbiquinoCmd()
	 * @generated
	 */
	EAttribute getOscUbiquinoCmd_Kind();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezubiquino.OscFirmataCmd <em>Osc Firmata Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Osc Firmata Cmd</em>'.
	 * @see net.sf.smbt.ezubiquino.OscFirmataCmd
	 * @generated
	 */
	EClass getOscFirmataCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezubiquino.OscFirmataCmd#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see net.sf.smbt.ezubiquino.OscFirmataCmd#getKind()
	 * @see #getOscFirmataCmd()
	 * @generated
	 */
	EAttribute getOscFirmataCmd_Kind();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ezubiquino.UbiquinoKind <em>Ubiquino Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ubiquino Kind</em>'.
	 * @see net.sf.smbt.ezubiquino.UbiquinoKind
	 * @generated
	 */
	EEnum getUbiquinoKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EzubiquinoFactory getEzubiquinoFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.ezubiquino.impl.OscUbiquinoCmdImpl <em>Osc Ubiquino Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezubiquino.impl.OscUbiquinoCmdImpl
		 * @see net.sf.smbt.ezubiquino.impl.EzubiquinoPackageImpl#getOscUbiquinoCmd()
		 * @generated
		 */
		EClass OSC_UBIQUINO_CMD = eINSTANCE.getOscUbiquinoCmd();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSC_UBIQUINO_CMD__KIND = eINSTANCE.getOscUbiquinoCmd_Kind();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezubiquino.impl.OscFirmataCmdImpl <em>Osc Firmata Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezubiquino.impl.OscFirmataCmdImpl
		 * @see net.sf.smbt.ezubiquino.impl.EzubiquinoPackageImpl#getOscFirmataCmd()
		 * @generated
		 */
		EClass OSC_FIRMATA_CMD = eINSTANCE.getOscFirmataCmd();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSC_FIRMATA_CMD__KIND = eINSTANCE.getOscFirmataCmd_Kind();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezubiquino.UbiquinoKind <em>Ubiquino Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezubiquino.UbiquinoKind
		 * @see net.sf.smbt.ezubiquino.impl.EzubiquinoPackageImpl#getUbiquinoKind()
		 * @generated
		 */
		EEnum UBIQUINO_KIND = eINSTANCE.getUbiquinoKind();

	}

} //EzubiquinoPackage
