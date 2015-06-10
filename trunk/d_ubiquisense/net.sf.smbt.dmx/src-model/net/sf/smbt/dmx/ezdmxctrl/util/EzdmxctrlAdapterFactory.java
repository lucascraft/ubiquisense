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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage
 * @generated
 */
public class EzdmxctrlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EzdmxctrlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzdmxctrlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EzdmxctrlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EzdmxctrlSwitch<Adapter> modelSwitch =
		new EzdmxctrlSwitch<Adapter>() {
			@Override
			public Adapter caseDMXUniverseCtrl(DMXUniverseCtrl object) {
				return createDMXUniverseCtrlAdapter();
			}
			@Override
			public Adapter caseDMXChannel(DMXChannel object) {
				return createDMXChannelAdapter();
			}
			@Override
			public Adapter caseDMXFixture(DMXFixture object) {
				return createDMXFixtureAdapter();
			}
			@Override
			public Adapter caseDMXProject(DMXProject object) {
				return createDMXProjectAdapter();
			}
			@Override
			public Adapter caseDMXScene(DMXScene object) {
				return createDMXSceneAdapter();
			}
			@Override
			public Adapter caseDMXFx(DMXFx object) {
				return createDMXFxAdapter();
			}
			@Override
			public Adapter caseDMXBus(DMXBus object) {
				return createDMXBusAdapter();
			}
			@Override
			public Adapter caseDMXLibrary(DMXLibrary object) {
				return createDMXLibraryAdapter();
			}
			@Override
			public Adapter caseChannelValues(ChannelValues object) {
				return createChannelValuesAdapter();
			}
			@Override
			public Adapter caseDMXFixtureSet(DMXFixtureSet object) {
				return createDMXFixtureSetAdapter();
			}
			@Override
			public Adapter caseDMXFixtureValuations(DMXFixtureValuations object) {
				return createDMXFixtureValuationsAdapter();
			}
			@Override
			public Adapter caseDMXCueSequence(DMXCueSequence object) {
				return createDMXCueSequenceAdapter();
			}
			@Override
			public Adapter caseIConnectedUnit(IConnectedUnit object) {
				return createIConnectedUnitAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl <em>DMX Universe Ctrl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl
	 * @generated
	 */
	public Adapter createDMXUniverseCtrlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.dmx.ezdmxctrl.DMXChannel <em>DMX Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXChannel
	 * @generated
	 */
	public Adapter createDMXChannelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.dmx.ezdmxctrl.DMXFixture <em>DMX Fixture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXFixture
	 * @generated
	 */
	public Adapter createDMXFixtureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.dmx.ezdmxctrl.DMXProject <em>DMX Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXProject
	 * @generated
	 */
	public Adapter createDMXProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.dmx.ezdmxctrl.DMXScene <em>DMX Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXScene
	 * @generated
	 */
	public Adapter createDMXSceneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.dmx.ezdmxctrl.DMXFx <em>DMX Fx</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXFx
	 * @generated
	 */
	public Adapter createDMXFxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.dmx.ezdmxctrl.DMXBus <em>DMX Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXBus
	 * @generated
	 */
	public Adapter createDMXBusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.dmx.ezdmxctrl.DMXLibrary <em>DMX Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXLibrary
	 * @generated
	 */
	public Adapter createDMXLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.dmx.ezdmxctrl.ChannelValues <em>Channel Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.dmx.ezdmxctrl.ChannelValues
	 * @generated
	 */
	public Adapter createChannelValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.dmx.ezdmxctrl.DMXFixtureSet <em>DMX Fixture Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXFixtureSet
	 * @generated
	 */
	public Adapter createDMXFixtureSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.dmx.ezdmxctrl.DMXFixtureValuations <em>DMX Fixture Valuations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXFixtureValuations
	 * @generated
	 */
	public Adapter createDMXFixtureValuationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.dmx.ezdmxctrl.DMXCueSequence <em>DMX Cue Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXCueSequence
	 * @generated
	 */
	public Adapter createDMXCueSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.xqz.model.engine.IConnectedUnit <em>IConnected Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.xqz.model.engine.IConnectedUnit
	 * @generated
	 */
	public Adapter createIConnectedUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EzdmxctrlAdapterFactory
