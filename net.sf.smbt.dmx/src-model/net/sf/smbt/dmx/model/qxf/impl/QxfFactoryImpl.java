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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QxfFactoryImpl extends EFactoryImpl implements QxfFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QxfFactory init() {
		try {
			QxfFactory theQxfFactory = (QxfFactory)EPackage.Registry.INSTANCE.getEFactory("http:///net.sf.smbt.dmx/model/qxf.xsd"); 
			if (theQxfFactory != null) {
				return theQxfFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QxfFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QxfFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QxfPackage.BULB: return createBulb();
			case QxfPackage.CAPABILITY: return createCapability();
			case QxfPackage.CHANNEL: return createChannel();
			case QxfPackage.COLOUR: return createColour();
			case QxfPackage.CREATOR: return createCreator();
			case QxfPackage.DIMENSIONS: return createDimensions();
			case QxfPackage.FIXTURE_DEFINITION: return createFixtureDefinition();
			case QxfPackage.FOCUS: return createFocus();
			case QxfPackage.GROUP: return createGroup();
			case QxfPackage.LENS: return createLens();
			case QxfPackage.MODE: return createMode();
			case QxfPackage.MODE_CHANNEL: return createModeChannel();
			case QxfPackage.PHYSICAL: return createPhysical();
			case QxfPackage.TECHNICAL: return createTechnical();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bulb createBulb() {
		BulbImpl bulb = new BulbImpl();
		return bulb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability createCapability() {
		CapabilityImpl capability = new CapabilityImpl();
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel createChannel() {
		ChannelImpl channel = new ChannelImpl();
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Colour createColour() {
		ColourImpl colour = new ColourImpl();
		return colour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Creator createCreator() {
		CreatorImpl creator = new CreatorImpl();
		return creator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimensions createDimensions() {
		DimensionsImpl dimensions = new DimensionsImpl();
		return dimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixtureDefinition createFixtureDefinition() {
		FixtureDefinitionImpl fixtureDefinition = new FixtureDefinitionImpl();
		return fixtureDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Focus createFocus() {
		FocusImpl focus = new FocusImpl();
		return focus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lens createLens() {
		LensImpl lens = new LensImpl();
		return lens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode createMode() {
		ModeImpl mode = new ModeImpl();
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeChannel createModeChannel() {
		ModeChannelImpl modeChannel = new ModeChannelImpl();
		return modeChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Physical createPhysical() {
		PhysicalImpl physical = new PhysicalImpl();
		return physical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Technical createTechnical() {
		TechnicalImpl technical = new TechnicalImpl();
		return technical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QxfPackage getQxfPackage() {
		return (QxfPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QxfPackage getPackage() {
		return QxfPackage.eINSTANCE;
	}

} //QxfFactoryImpl
