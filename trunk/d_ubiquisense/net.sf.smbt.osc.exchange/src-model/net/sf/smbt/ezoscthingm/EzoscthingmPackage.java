/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezoscthingm;

import net.sf.smbt.osccmd.OsccmdPackage;

import org.eclipse.emf.ecore.EClass;
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
 * @see net.sf.smbt.ezoscthingm.EzoscthingmFactory
 * @model kind="package"
 * @generated
 */
public interface EzoscthingmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ezoscthingm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ezoscthingm/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ezoscthingm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzoscthingmPackage eINSTANCE = net.sf.smbt.ezoscthingm.impl.EzoscthingmPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezoscthingm.impl.ThingMOscCmdImpl <em>Thing MOsc Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezoscthingm.impl.ThingMOscCmdImpl
	 * @see net.sf.smbt.ezoscthingm.impl.EzoscthingmPackageImpl#getThingMOscCmd()
	 * @generated
	 */
	int THING_MOSC_CMD = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_MOSC_CMD__PRIORITY = OsccmdPackage.OSC_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_MOSC_CMD__STAMP = OsccmdPackage.OSC_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_MOSC_CMD__MSG = OsccmdPackage.OSC_CMD__MSG;

	/**
	 * The number of structural features of the '<em>Thing MOsc Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_MOSC_CMD_FEATURE_COUNT = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezoscthingm.ThingMOscCmd <em>Thing MOsc Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thing MOsc Cmd</em>'.
	 * @see net.sf.smbt.ezoscthingm.ThingMOscCmd
	 * @generated
	 */
	EClass getThingMOscCmd();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EzoscthingmFactory getEzoscthingmFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.ezoscthingm.impl.ThingMOscCmdImpl <em>Thing MOsc Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezoscthingm.impl.ThingMOscCmdImpl
		 * @see net.sf.smbt.ezoscthingm.impl.EzoscthingmPackageImpl#getThingMOscCmd()
		 * @generated
		 */
		EClass THING_MOSC_CMD = eINSTANCE.getThingMOscCmd();

	}

} //EzoscthingmPackage
