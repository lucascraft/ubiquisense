/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.ezdmxctrl.impl;

import net.sf.smbt.dmx.ezdmxctrl.ChannelKind;
import net.sf.smbt.dmx.ezdmxctrl.ChannelValues;
import net.sf.smbt.dmx.ezdmxctrl.ColourKind;
import net.sf.smbt.dmx.ezdmxctrl.DMXBus;
import net.sf.smbt.dmx.ezdmxctrl.DMXChannel;
import net.sf.smbt.dmx.ezdmxctrl.DMXCueSequence;
import net.sf.smbt.dmx.ezdmxctrl.DMXFixture;
import net.sf.smbt.dmx.ezdmxctrl.DMXFixtureBehavior;
import net.sf.smbt.dmx.ezdmxctrl.DMXFixtureSet;
import net.sf.smbt.dmx.ezdmxctrl.DMXFixtureValuations;
import net.sf.smbt.dmx.ezdmxctrl.DMXFx;
import net.sf.smbt.dmx.ezdmxctrl.DMXLibrary;
import net.sf.smbt.dmx.ezdmxctrl.DMXProject;
import net.sf.smbt.dmx.ezdmxctrl.DMXScene;
import net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl;
import net.sf.smbt.dmx.ezdmxctrl.DMXfixtureMotion;
import net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlFactory;
import net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage;
import net.sf.smbt.dmx.model.qxf.QxfPackage;
import net.sf.smbt.osccmd.OsccmdPackage;
import net.sf.smbt.xcp.XcpPackage;
import net.sf.xqz.model.engine.EnginePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzdmxctrlPackageImpl extends EPackageImpl implements EzdmxctrlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxUniverseCtrlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxChannelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxFixtureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxSceneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxFxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxBusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxFixtureSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxFixtureValuationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmxCueSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dmXfixtureMotionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dmxFixtureBehaviorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum channelKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colourKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EzdmxctrlPackageImpl() {
		super(eNS_URI, EzdmxctrlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EzdmxctrlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EzdmxctrlPackage init() {
		if (isInited) return (EzdmxctrlPackage)EPackage.Registry.INSTANCE.getEPackage(EzdmxctrlPackage.eNS_URI);

		// Obtain or create and register package
		EzdmxctrlPackageImpl theEzdmxctrlPackage = (EzdmxctrlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EzdmxctrlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EzdmxctrlPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OsccmdPackage.eINSTANCE.eClass();
		XcpPackage.eINSTANCE.eClass();
		QxfPackage.eINSTANCE.eClass();
		EnginePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEzdmxctrlPackage.createPackageContents();

		// Initialize created meta-data
		theEzdmxctrlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEzdmxctrlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EzdmxctrlPackage.eNS_URI, theEzdmxctrlPackage);
		return theEzdmxctrlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDMXUniverseCtrl() {
		return dmxUniverseCtrlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDMXUniverseCtrl_Ver() {
		return (EAttribute)dmxUniverseCtrlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMXUniverseCtrl_Channels() {
		return (EReference)dmxUniverseCtrlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMXUniverseCtrl_Fixtures() {
		return (EReference)dmxUniverseCtrlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDMXUniverseCtrl_Id() {
		return (EAttribute)dmxUniverseCtrlEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDMXUniverseCtrl_AddrRangeMin() {
		return (EAttribute)dmxUniverseCtrlEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDMXUniverseCtrl_AddrRangeMax() {
		return (EAttribute)dmxUniverseCtrlEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMXUniverseCtrl_Manager() {
		return (EReference)dmxUniverseCtrlEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMXUniverseCtrl_Cues() {
		return (EReference)dmxUniverseCtrlEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMXUniverseCtrl_Steps() {
		return (EReference)dmxUniverseCtrlEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDMXChannel() {
		return dmxChannelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDMXChannel_Values() {
		return (EAttribute)dmxChannelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDMXFixture() {
		return dmxFixtureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMXFixture_Params() {
		return (EReference)dmxFixtureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMXFixture_Definition() {
		return (EReference)dmxFixtureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDMXFixture_Vendor() {
		return (EAttribute)dmxFixtureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMXFixture_Values() {
		return (EReference)dmxFixtureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDMXProject() {
		return dmxProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMXProject_Universes() {
		return (EReference)dmxProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMXProject_Scenes() {
		return (EReference)dmxProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDMXProject_Id() {
		return (EAttribute)dmxProjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDMXProject_Name() {
		return (EAttribute)dmxProjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMXProject_Library() {
		return (EReference)dmxProjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMXProject_FixtureDefinitions() {
		return (EReference)dmxProjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMXProject_LastAddress() {
		return (EReference)dmxProjectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMXProject_Selection() {
		return (EReference)dmxProjectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDMXScene() {
		return dmxSceneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMXScene_Manager() {
		return (EReference)dmxSceneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMXScene_Fixtures() {
		return (EReference)dmxSceneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMXScene_Fx() {
		return (EReference)dmxSceneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMXScene_Bus() {
		return (EReference)dmxSceneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDMXFx() {
		return dmxFxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMXFx_Manager() {
		return (EReference)dmxFxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDMXFx_Motion() {
		return (EAttribute)dmxFxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDMXFx_Behavior() {
		return (EAttribute)dmxFxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDMXBus() {
		return dmxBusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDMXBus_Id() {
		return (EAttribute)dmxBusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDMXBus_Name() {
		return (EAttribute)dmxBusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDMXBus_Time() {
		return (EAttribute)dmxBusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDMXLibrary() {
		return dmxLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMXLibrary_Fixtures() {
		return (EReference)dmxLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMXLibrary_Projects() {
		return (EReference)dmxLibraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMXLibrary_Fx() {
		return (EReference)dmxLibraryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannelValues() {
		return channelValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannelValues_Channel() {
		return (EReference)channelValuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelValues_Value() {
		return (EAttribute)channelValuesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannelValues_Fx() {
		return (EReference)channelValuesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDMXFixtureSet() {
		return dmxFixtureSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMXFixtureSet_Children() {
		return (EReference)dmxFixtureSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDMXFixtureSet_Label() {
		return (EAttribute)dmxFixtureSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDMXFixtureValuations() {
		return dmxFixtureValuationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMXFixtureValuations_Universe() {
		return (EReference)dmxFixtureValuationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDMXCueSequence() {
		return dmxCueSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMXCueSequence_Prev() {
		return (EReference)dmxCueSequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDMXCueSequence_Next() {
		return (EReference)dmxCueSequenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDMXCueSequence_Start() {
		return (EAttribute)dmxCueSequenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDMXCueSequence_Duration() {
		return (EAttribute)dmxCueSequenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDMXCueSequence_Speed() {
		return (EAttribute)dmxCueSequenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDMXCueSequence_Loop() {
		return (EAttribute)dmxCueSequenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDMXCueSequence_Times() {
		return (EAttribute)dmxCueSequenceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDMXfixtureMotion() {
		return dmXfixtureMotionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDMXFixtureBehavior() {
		return dmxFixtureBehaviorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getChannelKind() {
		return channelKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColourKind() {
		return colourKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzdmxctrlFactory getEzdmxctrlFactory() {
		return (EzdmxctrlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dmxUniverseCtrlEClass = createEClass(DMX_UNIVERSE_CTRL);
		createEAttribute(dmxUniverseCtrlEClass, DMX_UNIVERSE_CTRL__VER);
		createEReference(dmxUniverseCtrlEClass, DMX_UNIVERSE_CTRL__CHANNELS);
		createEReference(dmxUniverseCtrlEClass, DMX_UNIVERSE_CTRL__FIXTURES);
		createEAttribute(dmxUniverseCtrlEClass, DMX_UNIVERSE_CTRL__ID);
		createEAttribute(dmxUniverseCtrlEClass, DMX_UNIVERSE_CTRL__ADDR_RANGE_MIN);
		createEAttribute(dmxUniverseCtrlEClass, DMX_UNIVERSE_CTRL__ADDR_RANGE_MAX);
		createEReference(dmxUniverseCtrlEClass, DMX_UNIVERSE_CTRL__MANAGER);
		createEReference(dmxUniverseCtrlEClass, DMX_UNIVERSE_CTRL__CUES);
		createEReference(dmxUniverseCtrlEClass, DMX_UNIVERSE_CTRL__STEPS);

		dmxChannelEClass = createEClass(DMX_CHANNEL);
		createEAttribute(dmxChannelEClass, DMX_CHANNEL__VALUES);

		dmxFixtureEClass = createEClass(DMX_FIXTURE);
		createEReference(dmxFixtureEClass, DMX_FIXTURE__PARAMS);
		createEReference(dmxFixtureEClass, DMX_FIXTURE__DEFINITION);
		createEAttribute(dmxFixtureEClass, DMX_FIXTURE__VENDOR);
		createEReference(dmxFixtureEClass, DMX_FIXTURE__VALUES);

		dmxProjectEClass = createEClass(DMX_PROJECT);
		createEReference(dmxProjectEClass, DMX_PROJECT__UNIVERSES);
		createEReference(dmxProjectEClass, DMX_PROJECT__SCENES);
		createEAttribute(dmxProjectEClass, DMX_PROJECT__ID);
		createEAttribute(dmxProjectEClass, DMX_PROJECT__NAME);
		createEReference(dmxProjectEClass, DMX_PROJECT__LIBRARY);
		createEReference(dmxProjectEClass, DMX_PROJECT__FIXTURE_DEFINITIONS);
		createEReference(dmxProjectEClass, DMX_PROJECT__LAST_ADDRESS);
		createEReference(dmxProjectEClass, DMX_PROJECT__SELECTION);

		dmxSceneEClass = createEClass(DMX_SCENE);
		createEReference(dmxSceneEClass, DMX_SCENE__MANAGER);
		createEReference(dmxSceneEClass, DMX_SCENE__FIXTURES);
		createEReference(dmxSceneEClass, DMX_SCENE__FX);
		createEReference(dmxSceneEClass, DMX_SCENE__BUS);

		dmxFxEClass = createEClass(DMX_FX);
		createEReference(dmxFxEClass, DMX_FX__MANAGER);
		createEAttribute(dmxFxEClass, DMX_FX__MOTION);
		createEAttribute(dmxFxEClass, DMX_FX__BEHAVIOR);

		dmxBusEClass = createEClass(DMX_BUS);
		createEAttribute(dmxBusEClass, DMX_BUS__ID);
		createEAttribute(dmxBusEClass, DMX_BUS__NAME);
		createEAttribute(dmxBusEClass, DMX_BUS__TIME);

		dmxLibraryEClass = createEClass(DMX_LIBRARY);
		createEReference(dmxLibraryEClass, DMX_LIBRARY__FIXTURES);
		createEReference(dmxLibraryEClass, DMX_LIBRARY__PROJECTS);
		createEReference(dmxLibraryEClass, DMX_LIBRARY__FX);

		channelValuesEClass = createEClass(CHANNEL_VALUES);
		createEReference(channelValuesEClass, CHANNEL_VALUES__CHANNEL);
		createEAttribute(channelValuesEClass, CHANNEL_VALUES__VALUE);
		createEReference(channelValuesEClass, CHANNEL_VALUES__FX);

		dmxFixtureSetEClass = createEClass(DMX_FIXTURE_SET);
		createEReference(dmxFixtureSetEClass, DMX_FIXTURE_SET__CHILDREN);
		createEAttribute(dmxFixtureSetEClass, DMX_FIXTURE_SET__LABEL);

		dmxFixtureValuationsEClass = createEClass(DMX_FIXTURE_VALUATIONS);
		createEReference(dmxFixtureValuationsEClass, DMX_FIXTURE_VALUATIONS__UNIVERSE);

		dmxCueSequenceEClass = createEClass(DMX_CUE_SEQUENCE);
		createEReference(dmxCueSequenceEClass, DMX_CUE_SEQUENCE__PREV);
		createEReference(dmxCueSequenceEClass, DMX_CUE_SEQUENCE__NEXT);
		createEAttribute(dmxCueSequenceEClass, DMX_CUE_SEQUENCE__START);
		createEAttribute(dmxCueSequenceEClass, DMX_CUE_SEQUENCE__DURATION);
		createEAttribute(dmxCueSequenceEClass, DMX_CUE_SEQUENCE__SPEED);
		createEAttribute(dmxCueSequenceEClass, DMX_CUE_SEQUENCE__LOOP);
		createEAttribute(dmxCueSequenceEClass, DMX_CUE_SEQUENCE__TIMES);

		// Create enums
		dmXfixtureMotionEEnum = createEEnum(DM_XFIXTURE_MOTION);
		dmxFixtureBehaviorEEnum = createEEnum(DMX_FIXTURE_BEHAVIOR);
		channelKindEEnum = createEEnum(CHANNEL_KIND);
		colourKindEEnum = createEEnum(COLOUR_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EnginePackage theEnginePackage = (EnginePackage)EPackage.Registry.INSTANCE.getEPackage(EnginePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		OsccmdPackage theOsccmdPackage = (OsccmdPackage)EPackage.Registry.INSTANCE.getEPackage(OsccmdPackage.eNS_URI);
		QxfPackage theQxfPackage = (QxfPackage)EPackage.Registry.INSTANCE.getEPackage(QxfPackage.eNS_URI);
		XcpPackage theXcpPackage = (XcpPackage)EPackage.Registry.INSTANCE.getEPackage(XcpPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dmxUniverseCtrlEClass.getESuperTypes().add(theEnginePackage.getIConnectedUnit());
		dmxFixtureEClass.getESuperTypes().add(this.getDMXFixtureValuations());
		dmxFixtureSetEClass.getESuperTypes().add(this.getDMXFixtureValuations());

		// Initialize classes and features; add operations and parameters
		initEClass(dmxUniverseCtrlEClass, DMXUniverseCtrl.class, "DMXUniverseCtrl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDMXUniverseCtrl_Ver(), theEcorePackage.getEString(), "ver", null, 0, 1, DMXUniverseCtrl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDMXUniverseCtrl_Channels(), this.getDMXChannel(), null, "channels", null, 0, -1, DMXUniverseCtrl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDMXUniverseCtrl_Fixtures(), this.getDMXFixtureValuations(), null, "fixtures", null, 0, -1, DMXUniverseCtrl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMXUniverseCtrl_Id(), ecorePackage.getEInt(), "id", null, 0, 1, DMXUniverseCtrl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMXUniverseCtrl_AddrRangeMin(), theEcorePackage.getEInt(), "addrRangeMin", null, 0, 1, DMXUniverseCtrl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMXUniverseCtrl_AddrRangeMax(), theEcorePackage.getEInt(), "addrRangeMax", null, 0, 1, DMXUniverseCtrl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDMXUniverseCtrl_Manager(), this.getDMXProject(), this.getDMXProject_Universes(), "manager", null, 0, 1, DMXUniverseCtrl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDMXUniverseCtrl_Cues(), this.getDMXFixtureValuations(), null, "cues", null, 0, -1, DMXUniverseCtrl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDMXUniverseCtrl_Steps(), this.getDMXCueSequence(), null, "steps", null, 0, -1, DMXUniverseCtrl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxChannelEClass, DMXChannel.class, "DMXChannel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDMXChannel_Values(), theEcorePackage.getEInt(), "values", null, 0, -1, DMXChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxFixtureEClass, DMXFixture.class, "DMXFixture", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDMXFixture_Params(), theOsccmdPackage.getOscCmd(), null, "params", null, 0, -1, DMXFixture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDMXFixture_Definition(), theQxfPackage.getFixtureDefinition(), null, "definition", null, 0, 1, DMXFixture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMXFixture_Vendor(), theEcorePackage.getEString(), "vendor", null, 0, 1, DMXFixture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDMXFixture_Values(), this.getChannelValues(), null, "values", null, 0, -1, DMXFixture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxProjectEClass, DMXProject.class, "DMXProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDMXProject_Universes(), this.getDMXUniverseCtrl(), this.getDMXUniverseCtrl_Manager(), "universes", null, 0, -1, DMXProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDMXProject_Scenes(), this.getDMXScene(), this.getDMXScene_Manager(), "scenes", null, 0, -1, DMXProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMXProject_Id(), theEcorePackage.getEString(), "id", null, 0, 1, DMXProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMXProject_Name(), theEcorePackage.getEString(), "name", null, 0, 1, DMXProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDMXProject_Library(), this.getDMXLibrary(), null, "library", null, 0, 1, DMXProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDMXProject_FixtureDefinitions(), theQxfPackage.getFixtureDefinition(), null, "fixtureDefinitions", null, 0, -1, DMXProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDMXProject_LastAddress(), theXcpPackage.getXCPAddress(), null, "lastAddress", null, 0, 1, DMXProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDMXProject_Selection(), theEcorePackage.getEObject(), null, "selection", null, 0, 1, DMXProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxSceneEClass, DMXScene.class, "DMXScene", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDMXScene_Manager(), this.getDMXProject(), this.getDMXProject_Scenes(), "manager", null, 0, 1, DMXScene.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDMXScene_Fixtures(), this.getDMXFixture(), null, "fixtures", null, 0, -1, DMXScene.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDMXScene_Fx(), this.getDMXFx(), null, "fx", null, 0, -1, DMXScene.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDMXScene_Bus(), this.getDMXBus(), null, "bus", null, 0, -1, DMXScene.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxFxEClass, DMXFx.class, "DMXFx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDMXFx_Manager(), this.getDMXLibrary(), this.getDMXLibrary_Fx(), "manager", null, 0, 1, DMXFx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMXFx_Motion(), this.getDMXfixtureMotion(), "motion", null, 0, 1, DMXFx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMXFx_Behavior(), this.getDMXFixtureBehavior(), "behavior", null, 0, 1, DMXFx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxBusEClass, DMXBus.class, "DMXBus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDMXBus_Id(), theEcorePackage.getEString(), "id", null, 0, 1, DMXBus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMXBus_Name(), theEcorePackage.getEString(), "name", null, 0, 1, DMXBus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMXBus_Time(), theEcorePackage.getELong(), "time", null, 0, 1, DMXBus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxLibraryEClass, DMXLibrary.class, "DMXLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDMXLibrary_Fixtures(), theQxfPackage.getFixtureDefinition(), null, "fixtures", null, 0, -1, DMXLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDMXLibrary_Projects(), this.getDMXProject(), null, "projects", null, 0, -1, DMXLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDMXLibrary_Fx(), this.getDMXFx(), this.getDMXFx_Manager(), "fx", null, 0, -1, DMXLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelValuesEClass, ChannelValues.class, "ChannelValues", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChannelValues_Channel(), theQxfPackage.getChannel(), null, "channel", null, 0, 1, ChannelValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannelValues_Value(), theEcorePackage.getEInt(), "value", null, 0, 1, ChannelValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannelValues_Fx(), this.getDMXFx(), null, "fx", null, 0, -1, ChannelValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxFixtureSetEClass, DMXFixtureSet.class, "DMXFixtureSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDMXFixtureSet_Children(), this.getDMXFixtureValuations(), null, "children", null, 0, -1, DMXFixtureSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMXFixtureSet_Label(), theEcorePackage.getEString(), "label", null, 0, 1, DMXFixtureSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxFixtureValuationsEClass, DMXFixtureValuations.class, "DMXFixtureValuations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDMXFixtureValuations_Universe(), this.getDMXUniverseCtrl(), null, "universe", null, 0, 1, DMXFixtureValuations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dmxCueSequenceEClass, DMXCueSequence.class, "DMXCueSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDMXCueSequence_Prev(), this.getDMXFixtureValuations(), null, "prev", null, 0, 1, DMXCueSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDMXCueSequence_Next(), this.getDMXFixtureValuations(), null, "next", null, 0, 1, DMXCueSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMXCueSequence_Start(), theEcorePackage.getELong(), "start", null, 0, 1, DMXCueSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMXCueSequence_Duration(), theEcorePackage.getELong(), "duration", null, 0, 1, DMXCueSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMXCueSequence_Speed(), theEcorePackage.getELong(), "speed", null, 0, 1, DMXCueSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMXCueSequence_Loop(), theEcorePackage.getEBoolean(), "loop", null, 0, 1, DMXCueSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDMXCueSequence_Times(), theEcorePackage.getEInt(), "times", null, 0, 1, DMXCueSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dmXfixtureMotionEEnum, DMXfixtureMotion.class, "DMXfixtureMotion");
		addEEnumLiteral(dmXfixtureMotionEEnum, DMXfixtureMotion.CIRCLE);
		addEEnumLiteral(dmXfixtureMotionEEnum, DMXfixtureMotion.EIGHT);
		addEEnumLiteral(dmXfixtureMotionEEnum, DMXfixtureMotion.LISSAJOUX);
		addEEnumLiteral(dmXfixtureMotionEEnum, DMXfixtureMotion.STAR);
		addEEnumLiteral(dmXfixtureMotionEEnum, DMXfixtureMotion.RAMP_UP);
		addEEnumLiteral(dmXfixtureMotionEEnum, DMXfixtureMotion.RAMP_DOWN);

		initEEnum(dmxFixtureBehaviorEEnum, DMXFixtureBehavior.class, "DMXFixtureBehavior");
		addEEnumLiteral(dmxFixtureBehaviorEEnum, DMXFixtureBehavior.LOOP);
		addEEnumLiteral(dmxFixtureBehaviorEEnum, DMXFixtureBehavior.ONCE);
		addEEnumLiteral(dmxFixtureBehaviorEEnum, DMXFixtureBehavior.PING_PONG);

		initEEnum(channelKindEEnum, ChannelKind.class, "ChannelKind");
		addEEnumLiteral(channelKindEEnum, ChannelKind.COLOUR);
		addEEnumLiteral(channelKindEEnum, ChannelKind.GOBO);
		addEEnumLiteral(channelKindEEnum, ChannelKind.MAINTENANCE);
		addEEnumLiteral(channelKindEEnum, ChannelKind.FX);
		addEEnumLiteral(channelKindEEnum, ChannelKind.SPEED);
		addEEnumLiteral(channelKindEEnum, ChannelKind.BEAM);
		addEEnumLiteral(channelKindEEnum, ChannelKind.INTENSITY);
		addEEnumLiteral(channelKindEEnum, ChannelKind.SHUTTER);
		addEEnumLiteral(channelKindEEnum, ChannelKind.TILT);
		addEEnumLiteral(channelKindEEnum, ChannelKind.PAN);
		addEEnumLiteral(channelKindEEnum, ChannelKind.PRISM);
		addEEnumLiteral(channelKindEEnum, ChannelKind.NOTHING);

		initEEnum(colourKindEEnum, ColourKind.class, "ColourKind");
		addEEnumLiteral(colourKindEEnum, ColourKind.RED);
		addEEnumLiteral(colourKindEEnum, ColourKind.GREEN);
		addEEnumLiteral(colourKindEEnum, ColourKind.BLUE);
		addEEnumLiteral(colourKindEEnum, ColourKind.CYAN);
		addEEnumLiteral(colourKindEEnum, ColourKind.MAGENTA);
		addEEnumLiteral(colourKindEEnum, ColourKind.YELLOW);

		// Create resource
		createResource(eNS_URI);
	}

} //EzdmxctrlPackageImpl
