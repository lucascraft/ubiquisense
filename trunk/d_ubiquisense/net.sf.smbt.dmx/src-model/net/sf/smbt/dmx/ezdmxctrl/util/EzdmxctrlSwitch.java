/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.ezdmxctrl.util;

import net.sf.smbt.dmx.ezdmxctrl.ChannelValues;
import net.sf.smbt.dmx.ezdmxctrl.DMXBus;
import net.sf.smbt.dmx.ezdmxctrl.DMXChannel;
import net.sf.smbt.dmx.ezdmxctrl.DMXCueSequence;
import net.sf.smbt.dmx.ezdmxctrl.DMXFixture;
import net.sf.smbt.dmx.ezdmxctrl.DMXFixtureSet;
import net.sf.smbt.dmx.ezdmxctrl.DMXFixtureValuations;
import net.sf.smbt.dmx.ezdmxctrl.DMXFx;
import net.sf.smbt.dmx.ezdmxctrl.DMXLibrary;
import net.sf.smbt.dmx.ezdmxctrl.DMXProject;
import net.sf.smbt.dmx.ezdmxctrl.DMXScene;
import net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl;
import net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage;
import net.sf.xqz.model.engine.IConnectedUnit;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage
 * @generated
 */
public class EzdmxctrlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EzdmxctrlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzdmxctrlSwitch() {
		if (modelPackage == null) {
			modelPackage = EzdmxctrlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL: {
				DMXUniverseCtrl dmxUniverseCtrl = (DMXUniverseCtrl)theEObject;
				T result = caseDMXUniverseCtrl(dmxUniverseCtrl);
				if (result == null) result = caseIConnectedUnit(dmxUniverseCtrl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdmxctrlPackage.DMX_CHANNEL: {
				DMXChannel dmxChannel = (DMXChannel)theEObject;
				T result = caseDMXChannel(dmxChannel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdmxctrlPackage.DMX_FIXTURE: {
				DMXFixture dmxFixture = (DMXFixture)theEObject;
				T result = caseDMXFixture(dmxFixture);
				if (result == null) result = caseDMXFixtureValuations(dmxFixture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdmxctrlPackage.DMX_PROJECT: {
				DMXProject dmxProject = (DMXProject)theEObject;
				T result = caseDMXProject(dmxProject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdmxctrlPackage.DMX_SCENE: {
				DMXScene dmxScene = (DMXScene)theEObject;
				T result = caseDMXScene(dmxScene);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdmxctrlPackage.DMX_FX: {
				DMXFx dmxFx = (DMXFx)theEObject;
				T result = caseDMXFx(dmxFx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdmxctrlPackage.DMX_BUS: {
				DMXBus dmxBus = (DMXBus)theEObject;
				T result = caseDMXBus(dmxBus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdmxctrlPackage.DMX_LIBRARY: {
				DMXLibrary dmxLibrary = (DMXLibrary)theEObject;
				T result = caseDMXLibrary(dmxLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdmxctrlPackage.CHANNEL_VALUES: {
				ChannelValues channelValues = (ChannelValues)theEObject;
				T result = caseChannelValues(channelValues);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdmxctrlPackage.DMX_FIXTURE_SET: {
				DMXFixtureSet dmxFixtureSet = (DMXFixtureSet)theEObject;
				T result = caseDMXFixtureSet(dmxFixtureSet);
				if (result == null) result = caseDMXFixtureValuations(dmxFixtureSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdmxctrlPackage.DMX_FIXTURE_VALUATIONS: {
				DMXFixtureValuations dmxFixtureValuations = (DMXFixtureValuations)theEObject;
				T result = caseDMXFixtureValuations(dmxFixtureValuations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzdmxctrlPackage.DMX_CUE_SEQUENCE: {
				DMXCueSequence dmxCueSequence = (DMXCueSequence)theEObject;
				T result = caseDMXCueSequence(dmxCueSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DMX Universe Ctrl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DMX Universe Ctrl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDMXUniverseCtrl(DMXUniverseCtrl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DMX Channel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DMX Channel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDMXChannel(DMXChannel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DMX Fixture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DMX Fixture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDMXFixture(DMXFixture object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DMX Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DMX Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDMXProject(DMXProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DMX Scene</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DMX Scene</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDMXScene(DMXScene object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DMX Fx</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DMX Fx</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDMXFx(DMXFx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DMX Bus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DMX Bus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDMXBus(DMXBus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DMX Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DMX Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDMXLibrary(DMXLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannelValues(ChannelValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DMX Fixture Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DMX Fixture Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDMXFixtureSet(DMXFixtureSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DMX Fixture Valuations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DMX Fixture Valuations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDMXFixtureValuations(DMXFixtureValuations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DMX Cue Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DMX Cue Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDMXCueSequence(DMXCueSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IConnected Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IConnected Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIConnectedUnit(IConnectedUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EzdmxctrlSwitch
