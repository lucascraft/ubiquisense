/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.model.qxf.impl;

import net.sf.smbt.dmx.model.qxf.Bulb;
import net.sf.smbt.dmx.model.qxf.Capability;
import net.sf.smbt.dmx.model.qxf.Channel;
import net.sf.smbt.dmx.model.qxf.Colour;
import net.sf.smbt.dmx.model.qxf.Creator;
import net.sf.smbt.dmx.model.qxf.Dimensions;
import net.sf.smbt.dmx.model.qxf.FixtureDefinition;
import net.sf.smbt.dmx.model.qxf.Focus;
import net.sf.smbt.dmx.model.qxf.Group;
import net.sf.smbt.dmx.model.qxf.Lens;
import net.sf.smbt.dmx.model.qxf.Mode;
import net.sf.smbt.dmx.model.qxf.ModeChannel;
import net.sf.smbt.dmx.model.qxf.Physical;
import net.sf.smbt.dmx.model.qxf.QxfFactory;
import net.sf.smbt.dmx.model.qxf.QxfPackage;
import net.sf.smbt.dmx.model.qxf.Technical;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QxfPackageImpl extends EPackageImpl implements QxfPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bulbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colourEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixtureDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass focusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lensEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeChannelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technicalEClass = null;

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
	 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QxfPackageImpl() {
		super(eNS_URI, QxfFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QxfPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QxfPackage init() {
		if (isInited) return (QxfPackage)EPackage.Registry.INSTANCE.getEPackage(QxfPackage.eNS_URI);

		// Obtain or create and register package
		QxfPackageImpl theQxfPackage = (QxfPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QxfPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QxfPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theQxfPackage.createPackageContents();

		// Initialize created meta-data
		theQxfPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQxfPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QxfPackage.eNS_URI, theQxfPackage);
		return theQxfPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBulb() {
		return bulbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBulb_ColourTemperature() {
		return (EAttribute)bulbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBulb_Lumens() {
		return (EAttribute)bulbEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBulb_Type() {
		return (EAttribute)bulbEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapability() {
		return capabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapability_Value() {
		return (EAttribute)capabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapability_Max() {
		return (EAttribute)capabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapability_Min() {
		return (EAttribute)capabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannel() {
		return channelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannel_Group() {
		return (EReference)channelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannel_Colour() {
		return (EReference)channelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChannel_Capability() {
		return (EReference)channelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannel_Name() {
		return (EAttribute)channelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannel_Number() {
		return (EAttribute)channelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColour() {
		return colourEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColour_Value() {
		return (EAttribute)colourEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColour_Name() {
		return (EAttribute)colourEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreator() {
		return creatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreator_Author() {
		return (EAttribute)creatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreator_Name() {
		return (EAttribute)creatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreator_Version() {
		return (EAttribute)creatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimensions() {
		return dimensionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensions_Depth() {
		return (EAttribute)dimensionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensions_Height() {
		return (EAttribute)dimensionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensions_Weight() {
		return (EAttribute)dimensionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensions_Width() {
		return (EAttribute)dimensionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixtureDefinition() {
		return fixtureDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFixtureDefinition_Creator() {
		return (EReference)fixtureDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixtureDefinition_Manufacturer() {
		return (EAttribute)fixtureDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixtureDefinition_Model() {
		return (EAttribute)fixtureDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixtureDefinition_Type() {
		return (EAttribute)fixtureDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFixtureDefinition_Channel() {
		return (EReference)fixtureDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFixtureDefinition_Mode() {
		return (EReference)fixtureDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFocus() {
		return focusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFocus_PanMax() {
		return (EAttribute)focusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFocus_TiltMax() {
		return (EAttribute)focusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFocus_Type() {
		return (EAttribute)focusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_Value() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_Byte() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLens() {
		return lensEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLens_DegreesMax() {
		return (EAttribute)lensEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLens_DegreesMin() {
		return (EAttribute)lensEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLens_Name() {
		return (EAttribute)lensEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMode() {
		return modeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMode_Physical() {
		return (EReference)modeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMode_Channel() {
		return (EReference)modeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMode_Name() {
		return (EAttribute)modeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeChannel() {
		return modeChannelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModeChannel_Value() {
		return (EAttribute)modeChannelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModeChannel_Number() {
		return (EAttribute)modeChannelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysical() {
		return physicalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysical_Bulb() {
		return (EReference)physicalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysical_Dimensions() {
		return (EReference)physicalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysical_Lens() {
		return (EReference)physicalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysical_Focus() {
		return (EReference)physicalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysical_Technical() {
		return (EReference)physicalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechnical() {
		return technicalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechnical_DmxConnector() {
		return (EAttribute)technicalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechnical_PowerConsumption() {
		return (EAttribute)technicalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QxfFactory getQxfFactory() {
		return (QxfFactory)getEFactoryInstance();
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
		bulbEClass = createEClass(BULB);
		createEAttribute(bulbEClass, BULB__COLOUR_TEMPERATURE);
		createEAttribute(bulbEClass, BULB__LUMENS);
		createEAttribute(bulbEClass, BULB__TYPE);

		capabilityEClass = createEClass(CAPABILITY);
		createEAttribute(capabilityEClass, CAPABILITY__VALUE);
		createEAttribute(capabilityEClass, CAPABILITY__MAX);
		createEAttribute(capabilityEClass, CAPABILITY__MIN);

		channelEClass = createEClass(CHANNEL);
		createEReference(channelEClass, CHANNEL__GROUP);
		createEReference(channelEClass, CHANNEL__COLOUR);
		createEReference(channelEClass, CHANNEL__CAPABILITY);
		createEAttribute(channelEClass, CHANNEL__NAME);
		createEAttribute(channelEClass, CHANNEL__NUMBER);

		colourEClass = createEClass(COLOUR);
		createEAttribute(colourEClass, COLOUR__VALUE);
		createEAttribute(colourEClass, COLOUR__NAME);

		creatorEClass = createEClass(CREATOR);
		createEAttribute(creatorEClass, CREATOR__NAME);
		createEAttribute(creatorEClass, CREATOR__VERSION);
		createEAttribute(creatorEClass, CREATOR__AUTHOR);

		dimensionsEClass = createEClass(DIMENSIONS);
		createEAttribute(dimensionsEClass, DIMENSIONS__DEPTH);
		createEAttribute(dimensionsEClass, DIMENSIONS__HEIGHT);
		createEAttribute(dimensionsEClass, DIMENSIONS__WEIGHT);
		createEAttribute(dimensionsEClass, DIMENSIONS__WIDTH);

		fixtureDefinitionEClass = createEClass(FIXTURE_DEFINITION);
		createEReference(fixtureDefinitionEClass, FIXTURE_DEFINITION__CREATOR);
		createEAttribute(fixtureDefinitionEClass, FIXTURE_DEFINITION__MANUFACTURER);
		createEAttribute(fixtureDefinitionEClass, FIXTURE_DEFINITION__MODEL);
		createEAttribute(fixtureDefinitionEClass, FIXTURE_DEFINITION__TYPE);
		createEReference(fixtureDefinitionEClass, FIXTURE_DEFINITION__CHANNEL);
		createEReference(fixtureDefinitionEClass, FIXTURE_DEFINITION__MODE);

		focusEClass = createEClass(FOCUS);
		createEAttribute(focusEClass, FOCUS__PAN_MAX);
		createEAttribute(focusEClass, FOCUS__TILT_MAX);
		createEAttribute(focusEClass, FOCUS__TYPE);

		groupEClass = createEClass(GROUP);
		createEAttribute(groupEClass, GROUP__VALUE);
		createEAttribute(groupEClass, GROUP__BYTE);

		lensEClass = createEClass(LENS);
		createEAttribute(lensEClass, LENS__DEGREES_MAX);
		createEAttribute(lensEClass, LENS__DEGREES_MIN);
		createEAttribute(lensEClass, LENS__NAME);

		modeEClass = createEClass(MODE);
		createEReference(modeEClass, MODE__PHYSICAL);
		createEReference(modeEClass, MODE__CHANNEL);
		createEAttribute(modeEClass, MODE__NAME);

		modeChannelEClass = createEClass(MODE_CHANNEL);
		createEAttribute(modeChannelEClass, MODE_CHANNEL__VALUE);
		createEAttribute(modeChannelEClass, MODE_CHANNEL__NUMBER);

		physicalEClass = createEClass(PHYSICAL);
		createEReference(physicalEClass, PHYSICAL__BULB);
		createEReference(physicalEClass, PHYSICAL__DIMENSIONS);
		createEReference(physicalEClass, PHYSICAL__LENS);
		createEReference(physicalEClass, PHYSICAL__FOCUS);
		createEReference(physicalEClass, PHYSICAL__TECHNICAL);

		technicalEClass = createEClass(TECHNICAL);
		createEAttribute(technicalEClass, TECHNICAL__DMX_CONNECTOR);
		createEAttribute(technicalEClass, TECHNICAL__POWER_CONSUMPTION);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(bulbEClass, Bulb.class, "Bulb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBulb_ColourTemperature(), theXMLTypePackage.getString(), "colourTemperature", null, 0, 1, Bulb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBulb_Lumens(), theXMLTypePackage.getString(), "lumens", null, 0, 1, Bulb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBulb_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, Bulb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityEClass, Capability.class, "Capability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCapability_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapability_Max(), theXMLTypePackage.getString(), "max", null, 0, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapability_Min(), theXMLTypePackage.getString(), "min", null, 0, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelEClass, Channel.class, "Channel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChannel_Group(), this.getGroup(), null, "group", null, 1, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannel_Colour(), this.getColour(), null, "colour", null, 1, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannel_Capability(), this.getCapability(), null, "capability", null, 1, -1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannel_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannel_Number(), theXMLTypePackage.getInteger(), "number", null, 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colourEClass, Colour.class, "Colour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColour_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, Colour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColour_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Colour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(creatorEClass, Creator.class, "Creator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreator_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Creator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreator_Version(), theXMLTypePackage.getString(), "version", null, 1, 1, Creator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreator_Author(), theXMLTypePackage.getString(), "author", null, 1, 1, Creator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dimensionsEClass, Dimensions.class, "Dimensions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDimensions_Depth(), theXMLTypePackage.getString(), "depth", null, 0, 1, Dimensions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimensions_Height(), theXMLTypePackage.getString(), "height", null, 0, 1, Dimensions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimensions_Weight(), theXMLTypePackage.getString(), "weight", null, 0, 1, Dimensions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimensions_Width(), theXMLTypePackage.getString(), "width", null, 0, 1, Dimensions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fixtureDefinitionEClass, FixtureDefinition.class, "FixtureDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFixtureDefinition_Creator(), this.getCreator(), null, "creator", null, 1, 1, FixtureDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixtureDefinition_Manufacturer(), theXMLTypePackage.getString(), "manufacturer", null, 1, 1, FixtureDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixtureDefinition_Model(), theXMLTypePackage.getString(), "model", null, 1, 1, FixtureDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixtureDefinition_Type(), theXMLTypePackage.getString(), "type", null, 1, 1, FixtureDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixtureDefinition_Channel(), this.getChannel(), null, "channel", null, 1, -1, FixtureDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFixtureDefinition_Mode(), this.getMode(), null, "mode", null, 1, -1, FixtureDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(focusEClass, Focus.class, "Focus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFocus_PanMax(), theXMLTypePackage.getString(), "panMax", null, 0, 1, Focus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFocus_TiltMax(), theXMLTypePackage.getString(), "tiltMax", null, 0, 1, Focus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFocus_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, Focus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroup_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_Byte(), theXMLTypePackage.getInteger(), "byte", null, 1, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lensEClass, Lens.class, "Lens", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLens_DegreesMax(), theXMLTypePackage.getString(), "degreesMax", null, 0, 1, Lens.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLens_DegreesMin(), theXMLTypePackage.getString(), "degreesMin", null, 0, 1, Lens.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLens_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Lens.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modeEClass, Mode.class, "Mode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMode_Physical(), this.getPhysical(), null, "physical", null, 1, 1, Mode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMode_Channel(), this.getModeChannel(), null, "channel", null, 1, -1, Mode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMode_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Mode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modeChannelEClass, ModeChannel.class, "ModeChannel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModeChannel_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, ModeChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModeChannel_Number(), theXMLTypePackage.getString(), "number", null, 0, 1, ModeChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalEClass, Physical.class, "Physical", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysical_Bulb(), this.getBulb(), null, "bulb", null, 1, 1, Physical.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysical_Dimensions(), this.getDimensions(), null, "dimensions", null, 1, 1, Physical.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysical_Lens(), this.getLens(), null, "lens", null, 1, 1, Physical.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysical_Focus(), this.getFocus(), null, "focus", null, 1, 1, Physical.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysical_Technical(), this.getTechnical(), null, "technical", null, 1, 1, Physical.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(technicalEClass, Technical.class, "Technical", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTechnical_DmxConnector(), theXMLTypePackage.getString(), "dmxConnector", null, 0, 1, Technical.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTechnical_PowerConsumption(), theXMLTypePackage.getString(), "powerConsumption", null, 0, 1, Technical.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (bulbEClass, 
		   source, 
		   new String[] {
			 "name", "Bulb",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getBulb_ColourTemperature(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ColourTemperature"
		   });		
		addAnnotation
		  (getBulb_Lumens(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Lumens"
		   });		
		addAnnotation
		  (getBulb_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type"
		   });		
		addAnnotation
		  (capabilityEClass, 
		   source, 
		   new String[] {
			 "name", "Capability",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getCapability_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getCapability_Max(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Max"
		   });		
		addAnnotation
		  (getCapability_Min(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Min"
		   });		
		addAnnotation
		  (channelEClass, 
		   source, 
		   new String[] {
			 "name", "Channel",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getChannel_Group(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Group"
		   });		
		addAnnotation
		  (getChannel_Colour(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Colour"
		   });		
		addAnnotation
		  (getChannel_Capability(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Capability"
		   });		
		addAnnotation
		  (getChannel_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name"
		   });		
		addAnnotation
		  (getChannel_Number(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Number"
		   });		
		addAnnotation
		  (colourEClass, 
		   source, 
		   new String[] {
			 "name", "Colour",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getColour_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getColour_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name"
		   });		
		addAnnotation
		  (creatorEClass, 
		   source, 
		   new String[] {
			 "name", "Creator",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCreator_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Name"
		   });		
		addAnnotation
		  (getCreator_Version(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Version"
		   });		
		addAnnotation
		  (getCreator_Author(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Author"
		   });		
		addAnnotation
		  (dimensionsEClass, 
		   source, 
		   new String[] {
			 "name", "Dimensions",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getDimensions_Depth(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Depth"
		   });		
		addAnnotation
		  (getDimensions_Height(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Height"
		   });		
		addAnnotation
		  (getDimensions_Weight(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Weight"
		   });		
		addAnnotation
		  (getDimensions_Width(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Width"
		   });		
		addAnnotation
		  (fixtureDefinitionEClass, 
		   source, 
		   new String[] {
			 "name", "FixtureDefinition",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFixtureDefinition_Creator(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Creator"
		   });		
		addAnnotation
		  (getFixtureDefinition_Manufacturer(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Manufacturer"
		   });		
		addAnnotation
		  (getFixtureDefinition_Model(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Model"
		   });		
		addAnnotation
		  (getFixtureDefinition_Type(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Type"
		   });		
		addAnnotation
		  (getFixtureDefinition_Channel(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Channel"
		   });		
		addAnnotation
		  (getFixtureDefinition_Mode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Mode"
		   });		
		addAnnotation
		  (focusEClass, 
		   source, 
		   new String[] {
			 "name", "Focus",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getFocus_PanMax(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "PanMax"
		   });		
		addAnnotation
		  (getFocus_TiltMax(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "TiltMax"
		   });		
		addAnnotation
		  (getFocus_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type"
		   });		
		addAnnotation
		  (groupEClass, 
		   source, 
		   new String[] {
			 "name", "Group",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getGroup_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getGroup_Byte(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Byte"
		   });		
		addAnnotation
		  (lensEClass, 
		   source, 
		   new String[] {
			 "name", "Lens",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getLens_DegreesMax(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DegreesMax"
		   });		
		addAnnotation
		  (getLens_DegreesMin(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DegreesMin"
		   });		
		addAnnotation
		  (getLens_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name"
		   });		
		addAnnotation
		  (modeEClass, 
		   source, 
		   new String[] {
			 "name", "Mode",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMode_Physical(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Physical"
		   });		
		addAnnotation
		  (getMode_Channel(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Channel"
		   });		
		addAnnotation
		  (getMode_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name"
		   });		
		addAnnotation
		  (modeChannelEClass, 
		   source, 
		   new String[] {
			 "name", "ModeChannel",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getModeChannel_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getModeChannel_Number(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Number"
		   });		
		addAnnotation
		  (physicalEClass, 
		   source, 
		   new String[] {
			 "name", "Physical",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPhysical_Bulb(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Bulb"
		   });		
		addAnnotation
		  (getPhysical_Dimensions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Dimensions"
		   });		
		addAnnotation
		  (getPhysical_Lens(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Lens"
		   });		
		addAnnotation
		  (getPhysical_Focus(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Focus"
		   });		
		addAnnotation
		  (getPhysical_Technical(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Technical"
		   });		
		addAnnotation
		  (technicalEClass, 
		   source, 
		   new String[] {
			 "name", "Technical",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getTechnical_DmxConnector(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DmxConnector"
		   });		
		addAnnotation
		  (getTechnical_PowerConsumption(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "PowerConsumption"
		   });
	}

} //QxfPackageImpl
