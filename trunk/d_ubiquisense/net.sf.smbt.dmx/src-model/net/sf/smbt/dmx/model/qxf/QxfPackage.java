/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.model.qxf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see net.sf.smbt.dmx.model.qxf.QxfFactory
 * @model kind="package"
 * @generated
 */
public interface QxfPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "qxf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///net.sf.smbt.dmx/model/qxf.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "qxf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QxfPackage eINSTANCE = net.sf.smbt.dmx.model.qxf.impl.QxfPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.model.qxf.impl.BulbImpl <em>Bulb</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.model.qxf.impl.BulbImpl
	 * @see net.sf.smbt.dmx.model.qxf.impl.QxfPackageImpl#getBulb()
	 * @generated
	 */
	int BULB = 0;

	/**
	 * The feature id for the '<em><b>Colour Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULB__COLOUR_TEMPERATURE = 0;

	/**
	 * The feature id for the '<em><b>Lumens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULB__LUMENS = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULB__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Bulb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BULB_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.model.qxf.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.model.qxf.impl.CapabilityImpl
	 * @see net.sf.smbt.dmx.model.qxf.impl.QxfPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__MAX = 1;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__MIN = 2;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.model.qxf.impl.ChannelImpl <em>Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.model.qxf.impl.ChannelImpl
	 * @see net.sf.smbt.dmx.model.qxf.impl.QxfPackageImpl#getChannel()
	 * @generated
	 */
	int CHANNEL = 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Colour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__COLOUR = 1;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__CAPABILITY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__NAME = 3;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__NUMBER = 4;

	/**
	 * The number of structural features of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.model.qxf.impl.ColourImpl <em>Colour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.model.qxf.impl.ColourImpl
	 * @see net.sf.smbt.dmx.model.qxf.impl.QxfPackageImpl#getColour()
	 * @generated
	 */
	int COLOUR = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOUR__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOUR__NAME = 1;

	/**
	 * The number of structural features of the '<em>Colour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOUR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.model.qxf.impl.CreatorImpl <em>Creator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.model.qxf.impl.CreatorImpl
	 * @see net.sf.smbt.dmx.model.qxf.impl.QxfPackageImpl#getCreator()
	 * @generated
	 */
	int CREATOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATOR__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATOR__AUTHOR = 2;

	/**
	 * The number of structural features of the '<em>Creator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATOR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.model.qxf.impl.DimensionsImpl <em>Dimensions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.model.qxf.impl.DimensionsImpl
	 * @see net.sf.smbt.dmx.model.qxf.impl.QxfPackageImpl#getDimensions()
	 * @generated
	 */
	int DIMENSIONS = 5;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONS__DEPTH = 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONS__HEIGHT = 1;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONS__WEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONS__WIDTH = 3;

	/**
	 * The number of structural features of the '<em>Dimensions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSIONS_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.model.qxf.impl.FixtureDefinitionImpl <em>Fixture Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.model.qxf.impl.FixtureDefinitionImpl
	 * @see net.sf.smbt.dmx.model.qxf.impl.QxfPackageImpl#getFixtureDefinition()
	 * @generated
	 */
	int FIXTURE_DEFINITION = 6;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE_DEFINITION__CREATOR = 0;

	/**
	 * The feature id for the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE_DEFINITION__MANUFACTURER = 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE_DEFINITION__MODEL = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE_DEFINITION__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE_DEFINITION__CHANNEL = 4;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE_DEFINITION__MODE = 5;

	/**
	 * The number of structural features of the '<em>Fixture Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXTURE_DEFINITION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.model.qxf.impl.FocusImpl <em>Focus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.model.qxf.impl.FocusImpl
	 * @see net.sf.smbt.dmx.model.qxf.impl.QxfPackageImpl#getFocus()
	 * @generated
	 */
	int FOCUS = 7;

	/**
	 * The feature id for the '<em><b>Pan Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOCUS__PAN_MAX = 0;

	/**
	 * The feature id for the '<em><b>Tilt Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOCUS__TILT_MAX = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOCUS__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Focus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOCUS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.model.qxf.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.model.qxf.impl.GroupImpl
	 * @see net.sf.smbt.dmx.model.qxf.impl.QxfPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__BYTE = 1;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.model.qxf.impl.LensImpl <em>Lens</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.model.qxf.impl.LensImpl
	 * @see net.sf.smbt.dmx.model.qxf.impl.QxfPackageImpl#getLens()
	 * @generated
	 */
	int LENS = 9;

	/**
	 * The feature id for the '<em><b>Degrees Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENS__DEGREES_MAX = 0;

	/**
	 * The feature id for the '<em><b>Degrees Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENS__DEGREES_MIN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENS__NAME = 2;

	/**
	 * The number of structural features of the '<em>Lens</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.model.qxf.impl.ModeImpl <em>Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.model.qxf.impl.ModeImpl
	 * @see net.sf.smbt.dmx.model.qxf.impl.QxfPackageImpl#getMode()
	 * @generated
	 */
	int MODE = 10;

	/**
	 * The feature id for the '<em><b>Physical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__PHYSICAL = 0;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__CHANNEL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.model.qxf.impl.ModeChannelImpl <em>Mode Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.model.qxf.impl.ModeChannelImpl
	 * @see net.sf.smbt.dmx.model.qxf.impl.QxfPackageImpl#getModeChannel()
	 * @generated
	 */
	int MODE_CHANNEL = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_CHANNEL__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_CHANNEL__NUMBER = 1;

	/**
	 * The number of structural features of the '<em>Mode Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_CHANNEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.model.qxf.impl.PhysicalImpl <em>Physical</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.model.qxf.impl.PhysicalImpl
	 * @see net.sf.smbt.dmx.model.qxf.impl.QxfPackageImpl#getPhysical()
	 * @generated
	 */
	int PHYSICAL = 12;

	/**
	 * The feature id for the '<em><b>Bulb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL__BULB = 0;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL__DIMENSIONS = 1;

	/**
	 * The feature id for the '<em><b>Lens</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL__LENS = 2;

	/**
	 * The feature id for the '<em><b>Focus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL__FOCUS = 3;

	/**
	 * The feature id for the '<em><b>Technical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL__TECHNICAL = 4;

	/**
	 * The number of structural features of the '<em>Physical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.model.qxf.impl.TechnicalImpl <em>Technical</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.model.qxf.impl.TechnicalImpl
	 * @see net.sf.smbt.dmx.model.qxf.impl.QxfPackageImpl#getTechnical()
	 * @generated
	 */
	int TECHNICAL = 13;

	/**
	 * The feature id for the '<em><b>Dmx Connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL__DMX_CONNECTOR = 0;

	/**
	 * The feature id for the '<em><b>Power Consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL__POWER_CONSUMPTION = 1;

	/**
	 * The number of structural features of the '<em>Technical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNICAL_FEATURE_COUNT = 2;

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.model.qxf.Bulb <em>Bulb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bulb</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Bulb
	 * @generated
	 */
	EClass getBulb();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.qxf.Bulb#getColourTemperature <em>Colour Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Colour Temperature</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Bulb#getColourTemperature()
	 * @see #getBulb()
	 * @generated
	 */
	EAttribute getBulb_ColourTemperature();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.qxf.Bulb#getLumens <em>Lumens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lumens</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Bulb#getLumens()
	 * @see #getBulb()
	 * @generated
	 */
	EAttribute getBulb_Lumens();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.qxf.Bulb#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Bulb#getType()
	 * @see #getBulb()
	 * @generated
	 */
	EAttribute getBulb_Type();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.model.qxf.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Capability
	 * @generated
	 */
	EClass getCapability();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.qxf.Capability#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Capability#getValue()
	 * @see #getCapability()
	 * @generated
	 */
	EAttribute getCapability_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.qxf.Capability#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Capability#getMax()
	 * @see #getCapability()
	 * @generated
	 */
	EAttribute getCapability_Max();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.qxf.Capability#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Capability#getMin()
	 * @see #getCapability()
	 * @generated
	 */
	EAttribute getCapability_Min();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.model.qxf.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Channel
	 * @generated
	 */
	EClass getChannel();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.dmx.model.qxf.Channel#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Channel#getGroup()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Group();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.dmx.model.qxf.Channel#getColour <em>Colour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Colour</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Channel#getColour()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Colour();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.dmx.model.qxf.Channel#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Capability</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Channel#getCapability()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Capability();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.qxf.Channel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Channel#getName()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.qxf.Channel#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Channel#getNumber()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_Number();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.model.qxf.Colour <em>Colour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colour</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Colour
	 * @generated
	 */
	EClass getColour();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.qxf.Colour#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Colour#getValue()
	 * @see #getColour()
	 * @generated
	 */
	EAttribute getColour_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.qxf.Colour#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Colour#getName()
	 * @see #getColour()
	 * @generated
	 */
	EAttribute getColour_Name();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.model.qxf.Creator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Creator</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Creator
	 * @generated
	 */
	EClass getCreator();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.qxf.Creator#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Creator#getAuthor()
	 * @see #getCreator()
	 * @generated
	 */
	EAttribute getCreator_Author();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.qxf.Creator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Creator#getName()
	 * @see #getCreator()
	 * @generated
	 */
	EAttribute getCreator_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.qxf.Creator#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Creator#getVersion()
	 * @see #getCreator()
	 * @generated
	 */
	EAttribute getCreator_Version();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.model.qxf.Dimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimensions</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Dimensions
	 * @generated
	 */
	EClass getDimensions();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.qxf.Dimensions#getDepth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Dimensions#getDepth()
	 * @see #getDimensions()
	 * @generated
	 */
	EAttribute getDimensions_Depth();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.qxf.Dimensions#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Dimensions#getHeight()
	 * @see #getDimensions()
	 * @generated
	 */
	EAttribute getDimensions_Height();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.qxf.Dimensions#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Dimensions#getWeight()
	 * @see #getDimensions()
	 * @generated
	 */
	EAttribute getDimensions_Weight();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.qxf.Dimensions#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Dimensions#getWidth()
	 * @see #getDimensions()
	 * @generated
	 */
	EAttribute getDimensions_Width();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.model.qxf.FixtureDefinition <em>Fixture Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixture Definition</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.FixtureDefinition
	 * @generated
	 */
	EClass getFixtureDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.dmx.model.qxf.FixtureDefinition#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Creator</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.FixtureDefinition#getCreator()
	 * @see #getFixtureDefinition()
	 * @generated
	 */
	EReference getFixtureDefinition_Creator();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.qxf.FixtureDefinition#getManufacturer <em>Manufacturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manufacturer</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.FixtureDefinition#getManufacturer()
	 * @see #getFixtureDefinition()
	 * @generated
	 */
	EAttribute getFixtureDefinition_Manufacturer();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.qxf.FixtureDefinition#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.FixtureDefinition#getModel()
	 * @see #getFixtureDefinition()
	 * @generated
	 */
	EAttribute getFixtureDefinition_Model();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.qxf.FixtureDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.FixtureDefinition#getType()
	 * @see #getFixtureDefinition()
	 * @generated
	 */
	EAttribute getFixtureDefinition_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.dmx.model.qxf.FixtureDefinition#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Channel</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.FixtureDefinition#getChannel()
	 * @see #getFixtureDefinition()
	 * @generated
	 */
	EReference getFixtureDefinition_Channel();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.dmx.model.qxf.FixtureDefinition#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mode</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.FixtureDefinition#getMode()
	 * @see #getFixtureDefinition()
	 * @generated
	 */
	EReference getFixtureDefinition_Mode();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.model.qxf.Focus <em>Focus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Focus</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Focus
	 * @generated
	 */
	EClass getFocus();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.qxf.Focus#getPanMax <em>Pan Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pan Max</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Focus#getPanMax()
	 * @see #getFocus()
	 * @generated
	 */
	EAttribute getFocus_PanMax();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.qxf.Focus#getTiltMax <em>Tilt Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tilt Max</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Focus#getTiltMax()
	 * @see #getFocus()
	 * @generated
	 */
	EAttribute getFocus_TiltMax();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.qxf.Focus#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Focus#getType()
	 * @see #getFocus()
	 * @generated
	 */
	EAttribute getFocus_Type();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.model.qxf.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.qxf.Group#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Group#getValue()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.qxf.Group#getByte <em>Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Group#getByte()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Byte();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.model.qxf.Lens <em>Lens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lens</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Lens
	 * @generated
	 */
	EClass getLens();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.qxf.Lens#getDegreesMax <em>Degrees Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Degrees Max</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Lens#getDegreesMax()
	 * @see #getLens()
	 * @generated
	 */
	EAttribute getLens_DegreesMax();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.qxf.Lens#getDegreesMin <em>Degrees Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Degrees Min</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Lens#getDegreesMin()
	 * @see #getLens()
	 * @generated
	 */
	EAttribute getLens_DegreesMin();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.qxf.Lens#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Lens#getName()
	 * @see #getLens()
	 * @generated
	 */
	EAttribute getLens_Name();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.model.qxf.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Mode
	 * @generated
	 */
	EClass getMode();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.dmx.model.qxf.Mode#getPhysical <em>Physical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Physical</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Mode#getPhysical()
	 * @see #getMode()
	 * @generated
	 */
	EReference getMode_Physical();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.dmx.model.qxf.Mode#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Channel</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Mode#getChannel()
	 * @see #getMode()
	 * @generated
	 */
	EReference getMode_Channel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.qxf.Mode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Mode#getName()
	 * @see #getMode()
	 * @generated
	 */
	EAttribute getMode_Name();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.model.qxf.ModeChannel <em>Mode Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode Channel</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.ModeChannel
	 * @generated
	 */
	EClass getModeChannel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.qxf.ModeChannel#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.ModeChannel#getValue()
	 * @see #getModeChannel()
	 * @generated
	 */
	EAttribute getModeChannel_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.qxf.ModeChannel#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.ModeChannel#getNumber()
	 * @see #getModeChannel()
	 * @generated
	 */
	EAttribute getModeChannel_Number();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.model.qxf.Physical <em>Physical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Physical
	 * @generated
	 */
	EClass getPhysical();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.dmx.model.qxf.Physical#getBulb <em>Bulb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bulb</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Physical#getBulb()
	 * @see #getPhysical()
	 * @generated
	 */
	EReference getPhysical_Bulb();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.dmx.model.qxf.Physical#getDimensions <em>Dimensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dimensions</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Physical#getDimensions()
	 * @see #getPhysical()
	 * @generated
	 */
	EReference getPhysical_Dimensions();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.dmx.model.qxf.Physical#getLens <em>Lens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lens</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Physical#getLens()
	 * @see #getPhysical()
	 * @generated
	 */
	EReference getPhysical_Lens();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.dmx.model.qxf.Physical#getFocus <em>Focus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Focus</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Physical#getFocus()
	 * @see #getPhysical()
	 * @generated
	 */
	EReference getPhysical_Focus();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.dmx.model.qxf.Physical#getTechnical <em>Technical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Technical</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Physical#getTechnical()
	 * @see #getPhysical()
	 * @generated
	 */
	EReference getPhysical_Technical();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.model.qxf.Technical <em>Technical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technical</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Technical
	 * @generated
	 */
	EClass getTechnical();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.qxf.Technical#getDmxConnector <em>Dmx Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dmx Connector</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Technical#getDmxConnector()
	 * @see #getTechnical()
	 * @generated
	 */
	EAttribute getTechnical_DmxConnector();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.model.qxf.Technical#getPowerConsumption <em>Power Consumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power Consumption</em>'.
	 * @see net.sf.smbt.dmx.model.qxf.Technical#getPowerConsumption()
	 * @see #getTechnical()
	 * @generated
	 */
	EAttribute getTechnical_PowerConsumption();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QxfFactory getQxfFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.dmx.model.qxf.impl.BulbImpl <em>Bulb</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.model.qxf.impl.BulbImpl
		 * @see net.sf.smbt.dmx.model.qxf.impl.QxfPackageImpl#getBulb()
		 * @generated
		 */
		EClass BULB = eINSTANCE.getBulb();

		/**
		 * The meta object literal for the '<em><b>Colour Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BULB__COLOUR_TEMPERATURE = eINSTANCE.getBulb_ColourTemperature();

		/**
		 * The meta object literal for the '<em><b>Lumens</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BULB__LUMENS = eINSTANCE.getBulb_Lumens();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BULB__TYPE = eINSTANCE.getBulb_Type();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.model.qxf.impl.CapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.model.qxf.impl.CapabilityImpl
		 * @see net.sf.smbt.dmx.model.qxf.impl.QxfPackageImpl#getCapability()
		 * @generated
		 */
		EClass CAPABILITY = eINSTANCE.getCapability();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY__VALUE = eINSTANCE.getCapability_Value();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY__MAX = eINSTANCE.getCapability_Max();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY__MIN = eINSTANCE.getCapability_Min();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.model.qxf.impl.ChannelImpl <em>Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.model.qxf.impl.ChannelImpl
		 * @see net.sf.smbt.dmx.model.qxf.impl.QxfPackageImpl#getChannel()
		 * @generated
		 */
		EClass CHANNEL = eINSTANCE.getChannel();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__GROUP = eINSTANCE.getChannel_Group();

		/**
		 * The meta object literal for the '<em><b>Colour</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__COLOUR = eINSTANCE.getChannel_Colour();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__CAPABILITY = eINSTANCE.getChannel_Capability();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__NAME = eINSTANCE.getChannel_Name();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__NUMBER = eINSTANCE.getChannel_Number();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.model.qxf.impl.ColourImpl <em>Colour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.model.qxf.impl.ColourImpl
		 * @see net.sf.smbt.dmx.model.qxf.impl.QxfPackageImpl#getColour()
		 * @generated
		 */
		EClass COLOUR = eINSTANCE.getColour();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOUR__VALUE = eINSTANCE.getColour_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOUR__NAME = eINSTANCE.getColour_Name();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.model.qxf.impl.CreatorImpl <em>Creator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.model.qxf.impl.CreatorImpl
		 * @see net.sf.smbt.dmx.model.qxf.impl.QxfPackageImpl#getCreator()
		 * @generated
		 */
		EClass CREATOR = eINSTANCE.getCreator();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATOR__AUTHOR = eINSTANCE.getCreator_Author();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATOR__NAME = eINSTANCE.getCreator_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATOR__VERSION = eINSTANCE.getCreator_Version();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.model.qxf.impl.DimensionsImpl <em>Dimensions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.model.qxf.impl.DimensionsImpl
		 * @see net.sf.smbt.dmx.model.qxf.impl.QxfPackageImpl#getDimensions()
		 * @generated
		 */
		EClass DIMENSIONS = eINSTANCE.getDimensions();

		/**
		 * The meta object literal for the '<em><b>Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSIONS__DEPTH = eINSTANCE.getDimensions_Depth();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSIONS__HEIGHT = eINSTANCE.getDimensions_Height();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSIONS__WEIGHT = eINSTANCE.getDimensions_Weight();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSIONS__WIDTH = eINSTANCE.getDimensions_Width();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.model.qxf.impl.FixtureDefinitionImpl <em>Fixture Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.model.qxf.impl.FixtureDefinitionImpl
		 * @see net.sf.smbt.dmx.model.qxf.impl.QxfPackageImpl#getFixtureDefinition()
		 * @generated
		 */
		EClass FIXTURE_DEFINITION = eINSTANCE.getFixtureDefinition();

		/**
		 * The meta object literal for the '<em><b>Creator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXTURE_DEFINITION__CREATOR = eINSTANCE.getFixtureDefinition_Creator();

		/**
		 * The meta object literal for the '<em><b>Manufacturer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXTURE_DEFINITION__MANUFACTURER = eINSTANCE.getFixtureDefinition_Manufacturer();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXTURE_DEFINITION__MODEL = eINSTANCE.getFixtureDefinition_Model();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXTURE_DEFINITION__TYPE = eINSTANCE.getFixtureDefinition_Type();

		/**
		 * The meta object literal for the '<em><b>Channel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXTURE_DEFINITION__CHANNEL = eINSTANCE.getFixtureDefinition_Channel();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIXTURE_DEFINITION__MODE = eINSTANCE.getFixtureDefinition_Mode();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.model.qxf.impl.FocusImpl <em>Focus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.model.qxf.impl.FocusImpl
		 * @see net.sf.smbt.dmx.model.qxf.impl.QxfPackageImpl#getFocus()
		 * @generated
		 */
		EClass FOCUS = eINSTANCE.getFocus();

		/**
		 * The meta object literal for the '<em><b>Pan Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOCUS__PAN_MAX = eINSTANCE.getFocus_PanMax();

		/**
		 * The meta object literal for the '<em><b>Tilt Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOCUS__TILT_MAX = eINSTANCE.getFocus_TiltMax();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOCUS__TYPE = eINSTANCE.getFocus_Type();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.model.qxf.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.model.qxf.impl.GroupImpl
		 * @see net.sf.smbt.dmx.model.qxf.impl.QxfPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__VALUE = eINSTANCE.getGroup_Value();

		/**
		 * The meta object literal for the '<em><b>Byte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__BYTE = eINSTANCE.getGroup_Byte();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.model.qxf.impl.LensImpl <em>Lens</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.model.qxf.impl.LensImpl
		 * @see net.sf.smbt.dmx.model.qxf.impl.QxfPackageImpl#getLens()
		 * @generated
		 */
		EClass LENS = eINSTANCE.getLens();

		/**
		 * The meta object literal for the '<em><b>Degrees Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LENS__DEGREES_MAX = eINSTANCE.getLens_DegreesMax();

		/**
		 * The meta object literal for the '<em><b>Degrees Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LENS__DEGREES_MIN = eINSTANCE.getLens_DegreesMin();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LENS__NAME = eINSTANCE.getLens_Name();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.model.qxf.impl.ModeImpl <em>Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.model.qxf.impl.ModeImpl
		 * @see net.sf.smbt.dmx.model.qxf.impl.QxfPackageImpl#getMode()
		 * @generated
		 */
		EClass MODE = eINSTANCE.getMode();

		/**
		 * The meta object literal for the '<em><b>Physical</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE__PHYSICAL = eINSTANCE.getMode_Physical();

		/**
		 * The meta object literal for the '<em><b>Channel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE__CHANNEL = eINSTANCE.getMode_Channel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODE__NAME = eINSTANCE.getMode_Name();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.model.qxf.impl.ModeChannelImpl <em>Mode Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.model.qxf.impl.ModeChannelImpl
		 * @see net.sf.smbt.dmx.model.qxf.impl.QxfPackageImpl#getModeChannel()
		 * @generated
		 */
		EClass MODE_CHANNEL = eINSTANCE.getModeChannel();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODE_CHANNEL__VALUE = eINSTANCE.getModeChannel_Value();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODE_CHANNEL__NUMBER = eINSTANCE.getModeChannel_Number();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.model.qxf.impl.PhysicalImpl <em>Physical</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.model.qxf.impl.PhysicalImpl
		 * @see net.sf.smbt.dmx.model.qxf.impl.QxfPackageImpl#getPhysical()
		 * @generated
		 */
		EClass PHYSICAL = eINSTANCE.getPhysical();

		/**
		 * The meta object literal for the '<em><b>Bulb</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL__BULB = eINSTANCE.getPhysical_Bulb();

		/**
		 * The meta object literal for the '<em><b>Dimensions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL__DIMENSIONS = eINSTANCE.getPhysical_Dimensions();

		/**
		 * The meta object literal for the '<em><b>Lens</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL__LENS = eINSTANCE.getPhysical_Lens();

		/**
		 * The meta object literal for the '<em><b>Focus</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL__FOCUS = eINSTANCE.getPhysical_Focus();

		/**
		 * The meta object literal for the '<em><b>Technical</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL__TECHNICAL = eINSTANCE.getPhysical_Technical();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.model.qxf.impl.TechnicalImpl <em>Technical</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.model.qxf.impl.TechnicalImpl
		 * @see net.sf.smbt.dmx.model.qxf.impl.QxfPackageImpl#getTechnical()
		 * @generated
		 */
		EClass TECHNICAL = eINSTANCE.getTechnical();

		/**
		 * The meta object literal for the '<em><b>Dmx Connector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNICAL__DMX_CONNECTOR = eINSTANCE.getTechnical_DmxConnector();

		/**
		 * The meta object literal for the '<em><b>Power Consumption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNICAL__POWER_CONSUMPTION = eINSTANCE.getTechnical_PowerConsumption();

	}

} //QxfPackage
