/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.ezdmxctrl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage
 * @generated
 */
public interface EzdmxctrlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzdmxctrlFactory eINSTANCE = net.sf.smbt.dmx.ezdmxctrl.impl.EzdmxctrlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>DMX Universe Ctrl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DMX Universe Ctrl</em>'.
	 * @generated
	 */
	DMXUniverseCtrl createDMXUniverseCtrl();

	/**
	 * Returns a new object of class '<em>DMX Channel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DMX Channel</em>'.
	 * @generated
	 */
	DMXChannel createDMXChannel();

	/**
	 * Returns a new object of class '<em>DMX Fixture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DMX Fixture</em>'.
	 * @generated
	 */
	DMXFixture createDMXFixture();

	/**
	 * Returns a new object of class '<em>DMX Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DMX Project</em>'.
	 * @generated
	 */
	DMXProject createDMXProject();

	/**
	 * Returns a new object of class '<em>DMX Scene</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DMX Scene</em>'.
	 * @generated
	 */
	DMXScene createDMXScene();

	/**
	 * Returns a new object of class '<em>DMX Fx</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DMX Fx</em>'.
	 * @generated
	 */
	DMXFx createDMXFx();

	/**
	 * Returns a new object of class '<em>DMX Bus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DMX Bus</em>'.
	 * @generated
	 */
	DMXBus createDMXBus();

	/**
	 * Returns a new object of class '<em>DMX Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DMX Library</em>'.
	 * @generated
	 */
	DMXLibrary createDMXLibrary();

	/**
	 * Returns a new object of class '<em>Channel Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Channel Values</em>'.
	 * @generated
	 */
	ChannelValues createChannelValues();

	/**
	 * Returns a new object of class '<em>DMX Fixture Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DMX Fixture Set</em>'.
	 * @generated
	 */
	DMXFixtureSet createDMXFixtureSet();

	/**
	 * Returns a new object of class '<em>DMX Fixture Valuations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DMX Fixture Valuations</em>'.
	 * @generated
	 */
	DMXFixtureValuations createDMXFixtureValuations();

	/**
	 * Returns a new object of class '<em>DMX Cue Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DMX Cue Sequence</em>'.
	 * @generated
	 */
	DMXCueSequence createDMXCueSequence();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EzdmxctrlPackage getEzdmxctrlPackage();

} //EzdmxctrlFactory
