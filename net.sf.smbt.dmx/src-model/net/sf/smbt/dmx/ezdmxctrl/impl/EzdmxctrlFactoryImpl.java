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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class EzdmxctrlFactoryImpl extends EFactoryImpl implements EzdmxctrlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EzdmxctrlFactory init() {
		try {
			EzdmxctrlFactory theEzdmxctrlFactory = (EzdmxctrlFactory)EPackage.Registry.INSTANCE.getEFactory("http://ezdmxctrl/1.0"); 
			if (theEzdmxctrlFactory != null) {
				return theEzdmxctrlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EzdmxctrlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzdmxctrlFactoryImpl() {
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
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL: return createDMXUniverseCtrl();
			case EzdmxctrlPackage.DMX_CHANNEL: return createDMXChannel();
			case EzdmxctrlPackage.DMX_FIXTURE: return createDMXFixture();
			case EzdmxctrlPackage.DMX_PROJECT: return createDMXProject();
			case EzdmxctrlPackage.DMX_SCENE: return createDMXScene();
			case EzdmxctrlPackage.DMX_FX: return createDMXFx();
			case EzdmxctrlPackage.DMX_BUS: return createDMXBus();
			case EzdmxctrlPackage.DMX_LIBRARY: return createDMXLibrary();
			case EzdmxctrlPackage.CHANNEL_VALUES: return createChannelValues();
			case EzdmxctrlPackage.DMX_FIXTURE_SET: return createDMXFixtureSet();
			case EzdmxctrlPackage.DMX_FIXTURE_VALUATIONS: return createDMXFixtureValuations();
			case EzdmxctrlPackage.DMX_CUE_SEQUENCE: return createDMXCueSequence();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EzdmxctrlPackage.DM_XFIXTURE_MOTION:
				return createDMXfixtureMotionFromString(eDataType, initialValue);
			case EzdmxctrlPackage.DMX_FIXTURE_BEHAVIOR:
				return createDMXFixtureBehaviorFromString(eDataType, initialValue);
			case EzdmxctrlPackage.CHANNEL_KIND:
				return createChannelKindFromString(eDataType, initialValue);
			case EzdmxctrlPackage.COLOUR_KIND:
				return createColourKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EzdmxctrlPackage.DM_XFIXTURE_MOTION:
				return convertDMXfixtureMotionToString(eDataType, instanceValue);
			case EzdmxctrlPackage.DMX_FIXTURE_BEHAVIOR:
				return convertDMXFixtureBehaviorToString(eDataType, instanceValue);
			case EzdmxctrlPackage.CHANNEL_KIND:
				return convertChannelKindToString(eDataType, instanceValue);
			case EzdmxctrlPackage.COLOUR_KIND:
				return convertColourKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMXUniverseCtrl createDMXUniverseCtrl() {
		DMXUniverseCtrlImpl dmxUniverseCtrl = new DMXUniverseCtrlImpl();
		return dmxUniverseCtrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMXChannel createDMXChannel() {
		DMXChannelImpl dmxChannel = new DMXChannelImpl();
		return dmxChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMXFixture createDMXFixture() {
		DMXFixtureImpl dmxFixture = new DMXFixtureImpl();
		return dmxFixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMXProject createDMXProject() {
		DMXProjectImpl dmxProject = new DMXProjectImpl();
		return dmxProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMXScene createDMXScene() {
		DMXSceneImpl dmxScene = new DMXSceneImpl();
		return dmxScene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMXFx createDMXFx() {
		DMXFxImpl dmxFx = new DMXFxImpl();
		return dmxFx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMXBus createDMXBus() {
		DMXBusImpl dmxBus = new DMXBusImpl();
		return dmxBus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMXLibrary createDMXLibrary() {
		DMXLibraryImpl dmxLibrary = new DMXLibraryImpl();
		return dmxLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelValues createChannelValues() {
		ChannelValuesImpl channelValues = new ChannelValuesImpl();
		return channelValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMXFixtureSet createDMXFixtureSet() {
		DMXFixtureSetImpl dmxFixtureSet = new DMXFixtureSetImpl();
		return dmxFixtureSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMXFixtureValuations createDMXFixtureValuations() {
		DMXFixtureValuationsImpl dmxFixtureValuations = new DMXFixtureValuationsImpl();
		return dmxFixtureValuations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMXCueSequence createDMXCueSequence() {
		DMXCueSequenceImpl dmxCueSequence = new DMXCueSequenceImpl();
		return dmxCueSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMXfixtureMotion createDMXfixtureMotionFromString(EDataType eDataType, String initialValue) {
		DMXfixtureMotion result = DMXfixtureMotion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDMXfixtureMotionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMXFixtureBehavior createDMXFixtureBehaviorFromString(EDataType eDataType, String initialValue) {
		DMXFixtureBehavior result = DMXFixtureBehavior.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDMXFixtureBehaviorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelKind createChannelKindFromString(EDataType eDataType, String initialValue) {
		ChannelKind result = ChannelKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChannelKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColourKind createColourKindFromString(EDataType eDataType, String initialValue) {
		ColourKind result = ColourKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColourKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzdmxctrlPackage getEzdmxctrlPackage() {
		return (EzdmxctrlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EzdmxctrlPackage getPackage() {
		return EzdmxctrlPackage.eINSTANCE;
	}

} //EzdmxctrlFactoryImpl
