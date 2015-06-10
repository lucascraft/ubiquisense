/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezoscmidi.impl;

import net.sf.smbt.ezoscmidi.EzoscmidiFactory;
import net.sf.smbt.ezoscmidi.EzoscmidiPackage;
import net.sf.smbt.ezoscmidi.OscMidiCmd;
import net.sf.smbt.ezoscmidi.OscMidiEndSysex;
import net.sf.smbt.ezoscmidi.OscMidiNoteOff;
import net.sf.smbt.ezoscmidi.OscMidiNoteOn;
import net.sf.smbt.ezoscmidi.OscMidiPolyPressure;
import net.sf.smbt.ezoscmidi.OscMidiSysEx;
import net.sf.smbt.midi.ezmidi.EzmidiPackage;
import net.sf.smbt.osccmd.OsccmdPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzoscmidiPackageImpl extends EPackageImpl implements EzoscmidiPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oscMidiNoteOnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oscMidiNoteOffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oscMidiSysExEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oscMidiPolyPressureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oscMidiEndSysexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oscMidiCmdEClass = null;

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
	 * @see net.sf.smbt.ezoscmidi.EzoscmidiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EzoscmidiPackageImpl() {
		super(eNS_URI, EzoscmidiFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EzoscmidiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EzoscmidiPackage init() {
		if (isInited) return (EzoscmidiPackage)EPackage.Registry.INSTANCE.getEPackage(EzoscmidiPackage.eNS_URI);

		// Obtain or create and register package
		EzoscmidiPackageImpl theEzoscmidiPackage = (EzoscmidiPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EzoscmidiPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EzoscmidiPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EzmidiPackage.eINSTANCE.eClass();
		OsccmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEzoscmidiPackage.createPackageContents();

		// Initialize created meta-data
		theEzoscmidiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEzoscmidiPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EzoscmidiPackage.eNS_URI, theEzoscmidiPackage);
		return theEzoscmidiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOscMidiNoteOn() {
		return oscMidiNoteOnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOscMidiNoteOff() {
		return oscMidiNoteOffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOscMidiSysEx() {
		return oscMidiSysExEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOscMidiPolyPressure() {
		return oscMidiPolyPressureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOscMidiEndSysex() {
		return oscMidiEndSysexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOscMidiCmd() {
		return oscMidiCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzoscmidiFactory getEzoscmidiFactory() {
		return (EzoscmidiFactory)getEFactoryInstance();
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
		oscMidiNoteOnEClass = createEClass(OSC_MIDI_NOTE_ON);

		oscMidiNoteOffEClass = createEClass(OSC_MIDI_NOTE_OFF);

		oscMidiSysExEClass = createEClass(OSC_MIDI_SYS_EX);

		oscMidiPolyPressureEClass = createEClass(OSC_MIDI_POLY_PRESSURE);

		oscMidiEndSysexEClass = createEClass(OSC_MIDI_END_SYSEX);

		oscMidiCmdEClass = createEClass(OSC_MIDI_CMD);
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
		OsccmdPackage theOsccmdPackage = (OsccmdPackage)EPackage.Registry.INSTANCE.getEPackage(OsccmdPackage.eNS_URI);
		EzmidiPackage theEzmidiPackage = (EzmidiPackage)EPackage.Registry.INSTANCE.getEPackage(EzmidiPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		oscMidiCmdEClass.getESuperTypes().add(theOsccmdPackage.getOscCmd());
		oscMidiCmdEClass.getESuperTypes().add(theEzmidiPackage.getAbstractMidiCmd());

		// Initialize classes and features; add operations and parameters
		initEClass(oscMidiNoteOnEClass, OscMidiNoteOn.class, "OscMidiNoteOn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oscMidiNoteOffEClass, OscMidiNoteOff.class, "OscMidiNoteOff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oscMidiSysExEClass, OscMidiSysEx.class, "OscMidiSysEx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oscMidiPolyPressureEClass, OscMidiPolyPressure.class, "OscMidiPolyPressure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oscMidiEndSysexEClass, OscMidiEndSysex.class, "OscMidiEndSysex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oscMidiCmdEClass, OscMidiCmd.class, "OscMidiCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EzoscmidiPackageImpl
