/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.ezdmxctrl;

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
 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlFactory
 * @model kind="package"
 * @generated
 */
public interface EzdmxctrlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ezdmxctrl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ezdmxctrl/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ezdmxctrl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzdmxctrlPackage eINSTANCE = net.sf.smbt.dmx.ezdmxctrl.impl.EzdmxctrlPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXUniverseCtrlImpl <em>DMX Universe Ctrl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.ezdmxctrl.impl.DMXUniverseCtrlImpl
	 * @see net.sf.smbt.dmx.ezdmxctrl.impl.EzdmxctrlPackageImpl#getDMXUniverseCtrl()
	 * @generated
	 */
	int DMX_UNIVERSE_CTRL = 0;

	/**
	 * The feature id for the '<em><b>Engines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_UNIVERSE_CTRL__ENGINES = EnginePackage.ICONNECTED_UNIT__ENGINES;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_UNIVERSE_CTRL__DEFAULT = EnginePackage.ICONNECTED_UNIT__DEFAULT;

	/**
	 * The feature id for the '<em><b>Ver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_UNIVERSE_CTRL__VER = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Channels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_UNIVERSE_CTRL__CHANNELS = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fixtures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_UNIVERSE_CTRL__FIXTURES = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_UNIVERSE_CTRL__ID = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Addr Range Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_UNIVERSE_CTRL__ADDR_RANGE_MIN = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Addr Range Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_UNIVERSE_CTRL__ADDR_RANGE_MAX = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_UNIVERSE_CTRL__MANAGER = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_UNIVERSE_CTRL__CUES = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_UNIVERSE_CTRL__STEPS = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>DMX Universe Ctrl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_UNIVERSE_CTRL_FEATURE_COUNT = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXChannelImpl <em>DMX Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.ezdmxctrl.impl.DMXChannelImpl
	 * @see net.sf.smbt.dmx.ezdmxctrl.impl.EzdmxctrlPackageImpl#getDMXChannel()
	 * @generated
	 */
	int DMX_CHANNEL = 1;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_CHANNEL__VALUES = 0;

	/**
	 * The number of structural features of the '<em>DMX Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_CHANNEL_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXFixtureValuationsImpl <em>DMX Fixture Valuations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.ezdmxctrl.impl.DMXFixtureValuationsImpl
	 * @see net.sf.smbt.dmx.ezdmxctrl.impl.EzdmxctrlPackageImpl#getDMXFixtureValuations()
	 * @generated
	 */
	int DMX_FIXTURE_VALUATIONS = 10;

	/**
	 * The feature id for the '<em><b>Universe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FIXTURE_VALUATIONS__UNIVERSE = 0;

	/**
	 * The number of structural features of the '<em>DMX Fixture Valuations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FIXTURE_VALUATIONS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXFixtureImpl <em>DMX Fixture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.ezdmxctrl.impl.DMXFixtureImpl
	 * @see net.sf.smbt.dmx.ezdmxctrl.impl.EzdmxctrlPackageImpl#getDMXFixture()
	 * @generated
	 */
	int DMX_FIXTURE = 2;

	/**
	 * The feature id for the '<em><b>Universe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FIXTURE__UNIVERSE = DMX_FIXTURE_VALUATIONS__UNIVERSE;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FIXTURE__PARAMS = DMX_FIXTURE_VALUATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FIXTURE__DEFINITION = DMX_FIXTURE_VALUATIONS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FIXTURE__VENDOR = DMX_FIXTURE_VALUATIONS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FIXTURE__VALUES = DMX_FIXTURE_VALUATIONS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>DMX Fixture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FIXTURE_FEATURE_COUNT = DMX_FIXTURE_VALUATIONS_FEATURE_COUNT + 4;


	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXProjectImpl <em>DMX Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.ezdmxctrl.impl.DMXProjectImpl
	 * @see net.sf.smbt.dmx.ezdmxctrl.impl.EzdmxctrlPackageImpl#getDMXProject()
	 * @generated
	 */
	int DMX_PROJECT = 3;

	/**
	 * The feature id for the '<em><b>Universes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_PROJECT__UNIVERSES = 0;

	/**
	 * The feature id for the '<em><b>Scenes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_PROJECT__SCENES = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_PROJECT__ID = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_PROJECT__NAME = 3;

	/**
	 * The feature id for the '<em><b>Library</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_PROJECT__LIBRARY = 4;

	/**
	 * The feature id for the '<em><b>Fixture Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_PROJECT__FIXTURE_DEFINITIONS = 5;

	/**
	 * The feature id for the '<em><b>Last Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_PROJECT__LAST_ADDRESS = 6;

	/**
	 * The feature id for the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_PROJECT__SELECTION = 7;

	/**
	 * The number of structural features of the '<em>DMX Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_PROJECT_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXSceneImpl <em>DMX Scene</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.ezdmxctrl.impl.DMXSceneImpl
	 * @see net.sf.smbt.dmx.ezdmxctrl.impl.EzdmxctrlPackageImpl#getDMXScene()
	 * @generated
	 */
	int DMX_SCENE = 4;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_SCENE__MANAGER = 0;

	/**
	 * The feature id for the '<em><b>Fixtures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_SCENE__FIXTURES = 1;

	/**
	 * The feature id for the '<em><b>Fx</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_SCENE__FX = 2;

	/**
	 * The feature id for the '<em><b>Bus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_SCENE__BUS = 3;

	/**
	 * The number of structural features of the '<em>DMX Scene</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_SCENE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXFxImpl <em>DMX Fx</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.ezdmxctrl.impl.DMXFxImpl
	 * @see net.sf.smbt.dmx.ezdmxctrl.impl.EzdmxctrlPackageImpl#getDMXFx()
	 * @generated
	 */
	int DMX_FX = 5;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FX__MANAGER = 0;

	/**
	 * The feature id for the '<em><b>Motion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FX__MOTION = 1;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FX__BEHAVIOR = 2;

	/**
	 * The number of structural features of the '<em>DMX Fx</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FX_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXBusImpl <em>DMX Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.ezdmxctrl.impl.DMXBusImpl
	 * @see net.sf.smbt.dmx.ezdmxctrl.impl.EzdmxctrlPackageImpl#getDMXBus()
	 * @generated
	 */
	int DMX_BUS = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_BUS__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_BUS__NAME = 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_BUS__TIME = 2;

	/**
	 * The number of structural features of the '<em>DMX Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_BUS_FEATURE_COUNT = 3;


	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXLibraryImpl <em>DMX Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.ezdmxctrl.impl.DMXLibraryImpl
	 * @see net.sf.smbt.dmx.ezdmxctrl.impl.EzdmxctrlPackageImpl#getDMXLibrary()
	 * @generated
	 */
	int DMX_LIBRARY = 7;

	/**
	 * The feature id for the '<em><b>Fixtures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_LIBRARY__FIXTURES = 0;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_LIBRARY__PROJECTS = 1;

	/**
	 * The feature id for the '<em><b>Fx</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_LIBRARY__FX = 2;

	/**
	 * The number of structural features of the '<em>DMX Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_LIBRARY_FEATURE_COUNT = 3;


	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.ezdmxctrl.impl.ChannelValuesImpl <em>Channel Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.ezdmxctrl.impl.ChannelValuesImpl
	 * @see net.sf.smbt.dmx.ezdmxctrl.impl.EzdmxctrlPackageImpl#getChannelValues()
	 * @generated
	 */
	int CHANNEL_VALUES = 8;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_VALUES__CHANNEL = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_VALUES__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Fx</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_VALUES__FX = 2;

	/**
	 * The number of structural features of the '<em>Channel Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_VALUES_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXFixtureSetImpl <em>DMX Fixture Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.ezdmxctrl.impl.DMXFixtureSetImpl
	 * @see net.sf.smbt.dmx.ezdmxctrl.impl.EzdmxctrlPackageImpl#getDMXFixtureSet()
	 * @generated
	 */
	int DMX_FIXTURE_SET = 9;

	/**
	 * The feature id for the '<em><b>Universe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FIXTURE_SET__UNIVERSE = DMX_FIXTURE_VALUATIONS__UNIVERSE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FIXTURE_SET__CHILDREN = DMX_FIXTURE_VALUATIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FIXTURE_SET__LABEL = DMX_FIXTURE_VALUATIONS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DMX Fixture Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_FIXTURE_SET_FEATURE_COUNT = DMX_FIXTURE_VALUATIONS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXCueSequenceImpl <em>DMX Cue Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.ezdmxctrl.impl.DMXCueSequenceImpl
	 * @see net.sf.smbt.dmx.ezdmxctrl.impl.EzdmxctrlPackageImpl#getDMXCueSequence()
	 * @generated
	 */
	int DMX_CUE_SEQUENCE = 11;

	/**
	 * The feature id for the '<em><b>Prev</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_CUE_SEQUENCE__PREV = 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_CUE_SEQUENCE__NEXT = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_CUE_SEQUENCE__START = 2;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_CUE_SEQUENCE__DURATION = 3;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_CUE_SEQUENCE__SPEED = 4;

	/**
	 * The feature id for the '<em><b>Loop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_CUE_SEQUENCE__LOOP = 5;

	/**
	 * The feature id for the '<em><b>Times</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_CUE_SEQUENCE__TIMES = 6;

	/**
	 * The number of structural features of the '<em>DMX Cue Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMX_CUE_SEQUENCE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.ezdmxctrl.DMXfixtureMotion <em>DM Xfixture Motion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXfixtureMotion
	 * @see net.sf.smbt.dmx.ezdmxctrl.impl.EzdmxctrlPackageImpl#getDMXfixtureMotion()
	 * @generated
	 */
	int DM_XFIXTURE_MOTION = 12;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.ezdmxctrl.DMXFixtureBehavior <em>DMX Fixture Behavior</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXFixtureBehavior
	 * @see net.sf.smbt.dmx.ezdmxctrl.impl.EzdmxctrlPackageImpl#getDMXFixtureBehavior()
	 * @generated
	 */
	int DMX_FIXTURE_BEHAVIOR = 13;


	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.ezdmxctrl.ChannelKind <em>Channel Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.ezdmxctrl.ChannelKind
	 * @see net.sf.smbt.dmx.ezdmxctrl.impl.EzdmxctrlPackageImpl#getChannelKind()
	 * @generated
	 */
	int CHANNEL_KIND = 14;

	/**
	 * The meta object id for the '{@link net.sf.smbt.dmx.ezdmxctrl.ColourKind <em>Colour Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.dmx.ezdmxctrl.ColourKind
	 * @see net.sf.smbt.dmx.ezdmxctrl.impl.EzdmxctrlPackageImpl#getColourKind()
	 * @generated
	 */
	int COLOUR_KIND = 15;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl <em>DMX Universe Ctrl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DMX Universe Ctrl</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl
	 * @generated
	 */
	EClass getDMXUniverseCtrl();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl#getVer <em>Ver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ver</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl#getVer()
	 * @see #getDMXUniverseCtrl()
	 * @generated
	 */
	EAttribute getDMXUniverseCtrl_Ver();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Channels</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl#getChannels()
	 * @see #getDMXUniverseCtrl()
	 * @generated
	 */
	EReference getDMXUniverseCtrl_Channels();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl#getFixtures <em>Fixtures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fixtures</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl#getFixtures()
	 * @see #getDMXUniverseCtrl()
	 * @generated
	 */
	EReference getDMXUniverseCtrl_Fixtures();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl#getId()
	 * @see #getDMXUniverseCtrl()
	 * @generated
	 */
	EAttribute getDMXUniverseCtrl_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl#getAddrRangeMin <em>Addr Range Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addr Range Min</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl#getAddrRangeMin()
	 * @see #getDMXUniverseCtrl()
	 * @generated
	 */
	EAttribute getDMXUniverseCtrl_AddrRangeMin();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl#getAddrRangeMax <em>Addr Range Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addr Range Max</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl#getAddrRangeMax()
	 * @see #getDMXUniverseCtrl()
	 * @generated
	 */
	EAttribute getDMXUniverseCtrl_AddrRangeMax();

	/**
	 * Returns the meta object for the container reference '{@link net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Manager</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl#getManager()
	 * @see #getDMXUniverseCtrl()
	 * @generated
	 */
	EReference getDMXUniverseCtrl_Manager();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl#getCues <em>Cues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cues</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl#getCues()
	 * @see #getDMXUniverseCtrl()
	 * @generated
	 */
	EReference getDMXUniverseCtrl_Cues();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl#getSteps()
	 * @see #getDMXUniverseCtrl()
	 * @generated
	 */
	EReference getDMXUniverseCtrl_Steps();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.ezdmxctrl.DMXChannel <em>DMX Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DMX Channel</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXChannel
	 * @generated
	 */
	EClass getDMXChannel();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.smbt.dmx.ezdmxctrl.DMXChannel#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXChannel#getValues()
	 * @see #getDMXChannel()
	 * @generated
	 */
	EAttribute getDMXChannel_Values();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.ezdmxctrl.DMXFixture <em>DMX Fixture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DMX Fixture</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXFixture
	 * @generated
	 */
	EClass getDMXFixture();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.dmx.ezdmxctrl.DMXFixture#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXFixture#getParams()
	 * @see #getDMXFixture()
	 * @generated
	 */
	EReference getDMXFixture_Params();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.dmx.ezdmxctrl.DMXFixture#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXFixture#getDefinition()
	 * @see #getDMXFixture()
	 * @generated
	 */
	EReference getDMXFixture_Definition();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.ezdmxctrl.DMXFixture#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXFixture#getVendor()
	 * @see #getDMXFixture()
	 * @generated
	 */
	EAttribute getDMXFixture_Vendor();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.dmx.ezdmxctrl.DMXFixture#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXFixture#getValues()
	 * @see #getDMXFixture()
	 * @generated
	 */
	EReference getDMXFixture_Values();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.ezdmxctrl.DMXProject <em>DMX Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DMX Project</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXProject
	 * @generated
	 */
	EClass getDMXProject();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.dmx.ezdmxctrl.DMXProject#getUniverses <em>Universes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Universes</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXProject#getUniverses()
	 * @see #getDMXProject()
	 * @generated
	 */
	EReference getDMXProject_Universes();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.dmx.ezdmxctrl.DMXProject#getScenes <em>Scenes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenes</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXProject#getScenes()
	 * @see #getDMXProject()
	 * @generated
	 */
	EReference getDMXProject_Scenes();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.ezdmxctrl.DMXProject#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXProject#getId()
	 * @see #getDMXProject()
	 * @generated
	 */
	EAttribute getDMXProject_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.ezdmxctrl.DMXProject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXProject#getName()
	 * @see #getDMXProject()
	 * @generated
	 */
	EAttribute getDMXProject_Name();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.dmx.ezdmxctrl.DMXProject#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Library</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXProject#getLibrary()
	 * @see #getDMXProject()
	 * @generated
	 */
	EReference getDMXProject_Library();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.dmx.ezdmxctrl.DMXProject#getFixtureDefinitions <em>Fixture Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fixture Definitions</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXProject#getFixtureDefinitions()
	 * @see #getDMXProject()
	 * @generated
	 */
	EReference getDMXProject_FixtureDefinitions();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.dmx.ezdmxctrl.DMXProject#getLastAddress <em>Last Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Last Address</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXProject#getLastAddress()
	 * @see #getDMXProject()
	 * @generated
	 */
	EReference getDMXProject_LastAddress();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.dmx.ezdmxctrl.DMXProject#getSelection <em>Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selection</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXProject#getSelection()
	 * @see #getDMXProject()
	 * @generated
	 */
	EReference getDMXProject_Selection();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.ezdmxctrl.DMXScene <em>DMX Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DMX Scene</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXScene
	 * @generated
	 */
	EClass getDMXScene();

	/**
	 * Returns the meta object for the container reference '{@link net.sf.smbt.dmx.ezdmxctrl.DMXScene#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Manager</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXScene#getManager()
	 * @see #getDMXScene()
	 * @generated
	 */
	EReference getDMXScene_Manager();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.dmx.ezdmxctrl.DMXScene#getFixtures <em>Fixtures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fixtures</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXScene#getFixtures()
	 * @see #getDMXScene()
	 * @generated
	 */
	EReference getDMXScene_Fixtures();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.dmx.ezdmxctrl.DMXScene#getFx <em>Fx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fx</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXScene#getFx()
	 * @see #getDMXScene()
	 * @generated
	 */
	EReference getDMXScene_Fx();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.dmx.ezdmxctrl.DMXScene#getBus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXScene#getBus()
	 * @see #getDMXScene()
	 * @generated
	 */
	EReference getDMXScene_Bus();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.ezdmxctrl.DMXFx <em>DMX Fx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DMX Fx</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXFx
	 * @generated
	 */
	EClass getDMXFx();

	/**
	 * Returns the meta object for the container reference '{@link net.sf.smbt.dmx.ezdmxctrl.DMXFx#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Manager</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXFx#getManager()
	 * @see #getDMXFx()
	 * @generated
	 */
	EReference getDMXFx_Manager();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.ezdmxctrl.DMXFx#getMotion <em>Motion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Motion</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXFx#getMotion()
	 * @see #getDMXFx()
	 * @generated
	 */
	EAttribute getDMXFx_Motion();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.ezdmxctrl.DMXFx#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behavior</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXFx#getBehavior()
	 * @see #getDMXFx()
	 * @generated
	 */
	EAttribute getDMXFx_Behavior();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.ezdmxctrl.DMXBus <em>DMX Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DMX Bus</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXBus
	 * @generated
	 */
	EClass getDMXBus();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.ezdmxctrl.DMXBus#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXBus#getId()
	 * @see #getDMXBus()
	 * @generated
	 */
	EAttribute getDMXBus_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.ezdmxctrl.DMXBus#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXBus#getName()
	 * @see #getDMXBus()
	 * @generated
	 */
	EAttribute getDMXBus_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.ezdmxctrl.DMXBus#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXBus#getTime()
	 * @see #getDMXBus()
	 * @generated
	 */
	EAttribute getDMXBus_Time();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.ezdmxctrl.DMXLibrary <em>DMX Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DMX Library</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXLibrary
	 * @generated
	 */
	EClass getDMXLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.dmx.ezdmxctrl.DMXLibrary#getFixtures <em>Fixtures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fixtures</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXLibrary#getFixtures()
	 * @see #getDMXLibrary()
	 * @generated
	 */
	EReference getDMXLibrary_Fixtures();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.dmx.ezdmxctrl.DMXLibrary#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Projects</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXLibrary#getProjects()
	 * @see #getDMXLibrary()
	 * @generated
	 */
	EReference getDMXLibrary_Projects();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.dmx.ezdmxctrl.DMXLibrary#getFx <em>Fx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fx</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXLibrary#getFx()
	 * @see #getDMXLibrary()
	 * @generated
	 */
	EReference getDMXLibrary_Fx();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.ezdmxctrl.ChannelValues <em>Channel Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel Values</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.ChannelValues
	 * @generated
	 */
	EClass getChannelValues();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.dmx.ezdmxctrl.ChannelValues#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Channel</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.ChannelValues#getChannel()
	 * @see #getChannelValues()
	 * @generated
	 */
	EReference getChannelValues_Channel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.ezdmxctrl.ChannelValues#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.ChannelValues#getValue()
	 * @see #getChannelValues()
	 * @generated
	 */
	EAttribute getChannelValues_Value();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.dmx.ezdmxctrl.ChannelValues#getFx <em>Fx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fx</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.ChannelValues#getFx()
	 * @see #getChannelValues()
	 * @generated
	 */
	EReference getChannelValues_Fx();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.ezdmxctrl.DMXFixtureSet <em>DMX Fixture Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DMX Fixture Set</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXFixtureSet
	 * @generated
	 */
	EClass getDMXFixtureSet();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.dmx.ezdmxctrl.DMXFixtureSet#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXFixtureSet#getChildren()
	 * @see #getDMXFixtureSet()
	 * @generated
	 */
	EReference getDMXFixtureSet_Children();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.ezdmxctrl.DMXFixtureSet#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXFixtureSet#getLabel()
	 * @see #getDMXFixtureSet()
	 * @generated
	 */
	EAttribute getDMXFixtureSet_Label();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.ezdmxctrl.DMXFixtureValuations <em>DMX Fixture Valuations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DMX Fixture Valuations</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXFixtureValuations
	 * @generated
	 */
	EClass getDMXFixtureValuations();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.dmx.ezdmxctrl.DMXFixtureValuations#getUniverse <em>Universe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Universe</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXFixtureValuations#getUniverse()
	 * @see #getDMXFixtureValuations()
	 * @generated
	 */
	EReference getDMXFixtureValuations_Universe();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.dmx.ezdmxctrl.DMXCueSequence <em>DMX Cue Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DMX Cue Sequence</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXCueSequence
	 * @generated
	 */
	EClass getDMXCueSequence();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.dmx.ezdmxctrl.DMXCueSequence#getPrev <em>Prev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prev</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXCueSequence#getPrev()
	 * @see #getDMXCueSequence()
	 * @generated
	 */
	EReference getDMXCueSequence_Prev();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.dmx.ezdmxctrl.DMXCueSequence#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXCueSequence#getNext()
	 * @see #getDMXCueSequence()
	 * @generated
	 */
	EReference getDMXCueSequence_Next();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.ezdmxctrl.DMXCueSequence#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXCueSequence#getStart()
	 * @see #getDMXCueSequence()
	 * @generated
	 */
	EAttribute getDMXCueSequence_Start();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.ezdmxctrl.DMXCueSequence#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXCueSequence#getDuration()
	 * @see #getDMXCueSequence()
	 * @generated
	 */
	EAttribute getDMXCueSequence_Duration();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.ezdmxctrl.DMXCueSequence#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXCueSequence#getSpeed()
	 * @see #getDMXCueSequence()
	 * @generated
	 */
	EAttribute getDMXCueSequence_Speed();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.ezdmxctrl.DMXCueSequence#isLoop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loop</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXCueSequence#isLoop()
	 * @see #getDMXCueSequence()
	 * @generated
	 */
	EAttribute getDMXCueSequence_Loop();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.dmx.ezdmxctrl.DMXCueSequence#getTimes <em>Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Times</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXCueSequence#getTimes()
	 * @see #getDMXCueSequence()
	 * @generated
	 */
	EAttribute getDMXCueSequence_Times();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.dmx.ezdmxctrl.DMXfixtureMotion <em>DM Xfixture Motion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DM Xfixture Motion</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXfixtureMotion
	 * @generated
	 */
	EEnum getDMXfixtureMotion();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.dmx.ezdmxctrl.DMXFixtureBehavior <em>DMX Fixture Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DMX Fixture Behavior</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXFixtureBehavior
	 * @generated
	 */
	EEnum getDMXFixtureBehavior();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.dmx.ezdmxctrl.ChannelKind <em>Channel Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Channel Kind</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.ChannelKind
	 * @generated
	 */
	EEnum getChannelKind();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.dmx.ezdmxctrl.ColourKind <em>Colour Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Colour Kind</em>'.
	 * @see net.sf.smbt.dmx.ezdmxctrl.ColourKind
	 * @generated
	 */
	EEnum getColourKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EzdmxctrlFactory getEzdmxctrlFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXUniverseCtrlImpl <em>DMX Universe Ctrl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.ezdmxctrl.impl.DMXUniverseCtrlImpl
		 * @see net.sf.smbt.dmx.ezdmxctrl.impl.EzdmxctrlPackageImpl#getDMXUniverseCtrl()
		 * @generated
		 */
		EClass DMX_UNIVERSE_CTRL = eINSTANCE.getDMXUniverseCtrl();

		/**
		 * The meta object literal for the '<em><b>Ver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_UNIVERSE_CTRL__VER = eINSTANCE.getDMXUniverseCtrl_Ver();

		/**
		 * The meta object literal for the '<em><b>Channels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_UNIVERSE_CTRL__CHANNELS = eINSTANCE.getDMXUniverseCtrl_Channels();

		/**
		 * The meta object literal for the '<em><b>Fixtures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_UNIVERSE_CTRL__FIXTURES = eINSTANCE.getDMXUniverseCtrl_Fixtures();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_UNIVERSE_CTRL__ID = eINSTANCE.getDMXUniverseCtrl_Id();

		/**
		 * The meta object literal for the '<em><b>Addr Range Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_UNIVERSE_CTRL__ADDR_RANGE_MIN = eINSTANCE.getDMXUniverseCtrl_AddrRangeMin();

		/**
		 * The meta object literal for the '<em><b>Addr Range Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_UNIVERSE_CTRL__ADDR_RANGE_MAX = eINSTANCE.getDMXUniverseCtrl_AddrRangeMax();

		/**
		 * The meta object literal for the '<em><b>Manager</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_UNIVERSE_CTRL__MANAGER = eINSTANCE.getDMXUniverseCtrl_Manager();

		/**
		 * The meta object literal for the '<em><b>Cues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_UNIVERSE_CTRL__CUES = eINSTANCE.getDMXUniverseCtrl_Cues();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_UNIVERSE_CTRL__STEPS = eINSTANCE.getDMXUniverseCtrl_Steps();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXChannelImpl <em>DMX Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.ezdmxctrl.impl.DMXChannelImpl
		 * @see net.sf.smbt.dmx.ezdmxctrl.impl.EzdmxctrlPackageImpl#getDMXChannel()
		 * @generated
		 */
		EClass DMX_CHANNEL = eINSTANCE.getDMXChannel();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_CHANNEL__VALUES = eINSTANCE.getDMXChannel_Values();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXFixtureImpl <em>DMX Fixture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.ezdmxctrl.impl.DMXFixtureImpl
		 * @see net.sf.smbt.dmx.ezdmxctrl.impl.EzdmxctrlPackageImpl#getDMXFixture()
		 * @generated
		 */
		EClass DMX_FIXTURE = eINSTANCE.getDMXFixture();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_FIXTURE__PARAMS = eINSTANCE.getDMXFixture_Params();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_FIXTURE__DEFINITION = eINSTANCE.getDMXFixture_Definition();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_FIXTURE__VENDOR = eINSTANCE.getDMXFixture_Vendor();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_FIXTURE__VALUES = eINSTANCE.getDMXFixture_Values();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXProjectImpl <em>DMX Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.ezdmxctrl.impl.DMXProjectImpl
		 * @see net.sf.smbt.dmx.ezdmxctrl.impl.EzdmxctrlPackageImpl#getDMXProject()
		 * @generated
		 */
		EClass DMX_PROJECT = eINSTANCE.getDMXProject();

		/**
		 * The meta object literal for the '<em><b>Universes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_PROJECT__UNIVERSES = eINSTANCE.getDMXProject_Universes();

		/**
		 * The meta object literal for the '<em><b>Scenes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_PROJECT__SCENES = eINSTANCE.getDMXProject_Scenes();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_PROJECT__ID = eINSTANCE.getDMXProject_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_PROJECT__NAME = eINSTANCE.getDMXProject_Name();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_PROJECT__LIBRARY = eINSTANCE.getDMXProject_Library();

		/**
		 * The meta object literal for the '<em><b>Fixture Definitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_PROJECT__FIXTURE_DEFINITIONS = eINSTANCE.getDMXProject_FixtureDefinitions();

		/**
		 * The meta object literal for the '<em><b>Last Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_PROJECT__LAST_ADDRESS = eINSTANCE.getDMXProject_LastAddress();

		/**
		 * The meta object literal for the '<em><b>Selection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_PROJECT__SELECTION = eINSTANCE.getDMXProject_Selection();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXSceneImpl <em>DMX Scene</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.ezdmxctrl.impl.DMXSceneImpl
		 * @see net.sf.smbt.dmx.ezdmxctrl.impl.EzdmxctrlPackageImpl#getDMXScene()
		 * @generated
		 */
		EClass DMX_SCENE = eINSTANCE.getDMXScene();

		/**
		 * The meta object literal for the '<em><b>Manager</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_SCENE__MANAGER = eINSTANCE.getDMXScene_Manager();

		/**
		 * The meta object literal for the '<em><b>Fixtures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_SCENE__FIXTURES = eINSTANCE.getDMXScene_Fixtures();

		/**
		 * The meta object literal for the '<em><b>Fx</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_SCENE__FX = eINSTANCE.getDMXScene_Fx();

		/**
		 * The meta object literal for the '<em><b>Bus</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_SCENE__BUS = eINSTANCE.getDMXScene_Bus();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXFxImpl <em>DMX Fx</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.ezdmxctrl.impl.DMXFxImpl
		 * @see net.sf.smbt.dmx.ezdmxctrl.impl.EzdmxctrlPackageImpl#getDMXFx()
		 * @generated
		 */
		EClass DMX_FX = eINSTANCE.getDMXFx();

		/**
		 * The meta object literal for the '<em><b>Manager</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_FX__MANAGER = eINSTANCE.getDMXFx_Manager();

		/**
		 * The meta object literal for the '<em><b>Motion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_FX__MOTION = eINSTANCE.getDMXFx_Motion();

		/**
		 * The meta object literal for the '<em><b>Behavior</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_FX__BEHAVIOR = eINSTANCE.getDMXFx_Behavior();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXBusImpl <em>DMX Bus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.ezdmxctrl.impl.DMXBusImpl
		 * @see net.sf.smbt.dmx.ezdmxctrl.impl.EzdmxctrlPackageImpl#getDMXBus()
		 * @generated
		 */
		EClass DMX_BUS = eINSTANCE.getDMXBus();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_BUS__ID = eINSTANCE.getDMXBus_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_BUS__NAME = eINSTANCE.getDMXBus_Name();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_BUS__TIME = eINSTANCE.getDMXBus_Time();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXLibraryImpl <em>DMX Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.ezdmxctrl.impl.DMXLibraryImpl
		 * @see net.sf.smbt.dmx.ezdmxctrl.impl.EzdmxctrlPackageImpl#getDMXLibrary()
		 * @generated
		 */
		EClass DMX_LIBRARY = eINSTANCE.getDMXLibrary();

		/**
		 * The meta object literal for the '<em><b>Fixtures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_LIBRARY__FIXTURES = eINSTANCE.getDMXLibrary_Fixtures();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_LIBRARY__PROJECTS = eINSTANCE.getDMXLibrary_Projects();

		/**
		 * The meta object literal for the '<em><b>Fx</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_LIBRARY__FX = eINSTANCE.getDMXLibrary_Fx();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.ezdmxctrl.impl.ChannelValuesImpl <em>Channel Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.ezdmxctrl.impl.ChannelValuesImpl
		 * @see net.sf.smbt.dmx.ezdmxctrl.impl.EzdmxctrlPackageImpl#getChannelValues()
		 * @generated
		 */
		EClass CHANNEL_VALUES = eINSTANCE.getChannelValues();

		/**
		 * The meta object literal for the '<em><b>Channel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL_VALUES__CHANNEL = eINSTANCE.getChannelValues_Channel();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_VALUES__VALUE = eINSTANCE.getChannelValues_Value();

		/**
		 * The meta object literal for the '<em><b>Fx</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL_VALUES__FX = eINSTANCE.getChannelValues_Fx();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXFixtureSetImpl <em>DMX Fixture Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.ezdmxctrl.impl.DMXFixtureSetImpl
		 * @see net.sf.smbt.dmx.ezdmxctrl.impl.EzdmxctrlPackageImpl#getDMXFixtureSet()
		 * @generated
		 */
		EClass DMX_FIXTURE_SET = eINSTANCE.getDMXFixtureSet();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_FIXTURE_SET__CHILDREN = eINSTANCE.getDMXFixtureSet_Children();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_FIXTURE_SET__LABEL = eINSTANCE.getDMXFixtureSet_Label();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXFixtureValuationsImpl <em>DMX Fixture Valuations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.ezdmxctrl.impl.DMXFixtureValuationsImpl
		 * @see net.sf.smbt.dmx.ezdmxctrl.impl.EzdmxctrlPackageImpl#getDMXFixtureValuations()
		 * @generated
		 */
		EClass DMX_FIXTURE_VALUATIONS = eINSTANCE.getDMXFixtureValuations();

		/**
		 * The meta object literal for the '<em><b>Universe</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_FIXTURE_VALUATIONS__UNIVERSE = eINSTANCE.getDMXFixtureValuations_Universe();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXCueSequenceImpl <em>DMX Cue Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.ezdmxctrl.impl.DMXCueSequenceImpl
		 * @see net.sf.smbt.dmx.ezdmxctrl.impl.EzdmxctrlPackageImpl#getDMXCueSequence()
		 * @generated
		 */
		EClass DMX_CUE_SEQUENCE = eINSTANCE.getDMXCueSequence();

		/**
		 * The meta object literal for the '<em><b>Prev</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_CUE_SEQUENCE__PREV = eINSTANCE.getDMXCueSequence_Prev();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMX_CUE_SEQUENCE__NEXT = eINSTANCE.getDMXCueSequence_Next();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_CUE_SEQUENCE__START = eINSTANCE.getDMXCueSequence_Start();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_CUE_SEQUENCE__DURATION = eINSTANCE.getDMXCueSequence_Duration();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_CUE_SEQUENCE__SPEED = eINSTANCE.getDMXCueSequence_Speed();

		/**
		 * The meta object literal for the '<em><b>Loop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_CUE_SEQUENCE__LOOP = eINSTANCE.getDMXCueSequence_Loop();

		/**
		 * The meta object literal for the '<em><b>Times</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMX_CUE_SEQUENCE__TIMES = eINSTANCE.getDMXCueSequence_Times();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.ezdmxctrl.DMXfixtureMotion <em>DM Xfixture Motion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.ezdmxctrl.DMXfixtureMotion
		 * @see net.sf.smbt.dmx.ezdmxctrl.impl.EzdmxctrlPackageImpl#getDMXfixtureMotion()
		 * @generated
		 */
		EEnum DM_XFIXTURE_MOTION = eINSTANCE.getDMXfixtureMotion();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.ezdmxctrl.DMXFixtureBehavior <em>DMX Fixture Behavior</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.ezdmxctrl.DMXFixtureBehavior
		 * @see net.sf.smbt.dmx.ezdmxctrl.impl.EzdmxctrlPackageImpl#getDMXFixtureBehavior()
		 * @generated
		 */
		EEnum DMX_FIXTURE_BEHAVIOR = eINSTANCE.getDMXFixtureBehavior();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.ezdmxctrl.ChannelKind <em>Channel Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.ezdmxctrl.ChannelKind
		 * @see net.sf.smbt.dmx.ezdmxctrl.impl.EzdmxctrlPackageImpl#getChannelKind()
		 * @generated
		 */
		EEnum CHANNEL_KIND = eINSTANCE.getChannelKind();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.dmx.ezdmxctrl.ColourKind <em>Colour Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.dmx.ezdmxctrl.ColourKind
		 * @see net.sf.smbt.dmx.ezdmxctrl.impl.EzdmxctrlPackageImpl#getColourKind()
		 * @generated
		 */
		EEnum COLOUR_KIND = eINSTANCE.getColourKind();

	}

} //EzdmxctrlPackage
