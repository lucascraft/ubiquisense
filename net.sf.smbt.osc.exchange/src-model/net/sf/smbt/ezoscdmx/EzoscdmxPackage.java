/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezoscdmx;

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
 * @see net.sf.smbt.ezoscdmx.EzoscdmxFactory
 * @model kind="package"
 * @generated
 */
public interface EzoscdmxPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ezoscdmx";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ezoscdmx/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ezoscdmx";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzoscdmxPackage eINSTANCE = net.sf.smbt.ezoscdmx.impl.EzoscdmxPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezoscdmx.impl.OscDmxCmdImpl <em>Osc Dmx Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezoscdmx.impl.OscDmxCmdImpl
	 * @see net.sf.smbt.ezoscdmx.impl.EzoscdmxPackageImpl#getOscDmxCmd()
	 * @generated
	 */
	int OSC_DMX_CMD = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_DMX_CMD__PRIORITY = OsccmdPackage.OSC_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_DMX_CMD__STAMP = OsccmdPackage.OSC_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_DMX_CMD__MSG = OsccmdPackage.OSC_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_DMX_CMD__START = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_DMX_CMD__LABEL = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_DMX_CMD__DATA = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_DMX_CMD__END = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Osc Dmx Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_DMX_CMD_FEATURE_COUNT = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezoscdmx.impl.OscDmxFadeToRGBImpl <em>Osc Dmx Fade To RGB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezoscdmx.impl.OscDmxFadeToRGBImpl
	 * @see net.sf.smbt.ezoscdmx.impl.EzoscdmxPackageImpl#getOscDmxFadeToRGB()
	 * @generated
	 */
	int OSC_DMX_FADE_TO_RGB = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_DMX_FADE_TO_RGB__PRIORITY = OSC_DMX_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_DMX_FADE_TO_RGB__STAMP = OSC_DMX_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_DMX_FADE_TO_RGB__MSG = OSC_DMX_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_DMX_FADE_TO_RGB__START = OSC_DMX_CMD__START;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_DMX_FADE_TO_RGB__LABEL = OSC_DMX_CMD__LABEL;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_DMX_FADE_TO_RGB__DATA = OSC_DMX_CMD__DATA;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_DMX_FADE_TO_RGB__END = OSC_DMX_CMD__END;

	/**
	 * The number of structural features of the '<em>Osc Dmx Fade To RGB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_DMX_FADE_TO_RGB_FEATURE_COUNT = OSC_DMX_CMD_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezoscdmx.OscDmxFadeToRGB <em>Osc Dmx Fade To RGB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Osc Dmx Fade To RGB</em>'.
	 * @see net.sf.smbt.ezoscdmx.OscDmxFadeToRGB
	 * @generated
	 */
	EClass getOscDmxFadeToRGB();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezoscdmx.OscDmxCmd <em>Osc Dmx Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Osc Dmx Cmd</em>'.
	 * @see net.sf.smbt.ezoscdmx.OscDmxCmd
	 * @generated
	 */
	EClass getOscDmxCmd();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EzoscdmxFactory getEzoscdmxFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.ezoscdmx.impl.OscDmxFadeToRGBImpl <em>Osc Dmx Fade To RGB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezoscdmx.impl.OscDmxFadeToRGBImpl
		 * @see net.sf.smbt.ezoscdmx.impl.EzoscdmxPackageImpl#getOscDmxFadeToRGB()
		 * @generated
		 */
		EClass OSC_DMX_FADE_TO_RGB = eINSTANCE.getOscDmxFadeToRGB();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezoscdmx.impl.OscDmxCmdImpl <em>Osc Dmx Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezoscdmx.impl.OscDmxCmdImpl
		 * @see net.sf.smbt.ezoscdmx.impl.EzoscdmxPackageImpl#getOscDmxCmd()
		 * @generated
		 */
		EClass OSC_DMX_CMD = eINSTANCE.getOscDmxCmd();

	}

} //EzoscdmxPackage
