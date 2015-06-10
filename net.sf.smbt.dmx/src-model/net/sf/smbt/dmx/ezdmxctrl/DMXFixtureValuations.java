/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.ezdmxctrl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DMX Fixture Valuations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.DMXFixtureValuations#getUniverse <em>Universe</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXFixtureValuations()
 * @model
 * @generated
 */
public interface DMXFixtureValuations extends EObject {
	/**
	 * Returns the value of the '<em><b>Universe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Universe</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Universe</em>' reference.
	 * @see #setUniverse(DMXUniverseCtrl)
	 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXFixtureValuations_Universe()
	 * @model
	 * @generated
	 */
	DMXUniverseCtrl getUniverse();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.ezdmxctrl.DMXFixtureValuations#getUniverse <em>Universe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Universe</em>' reference.
	 * @see #getUniverse()
	 * @generated
	 */
	void setUniverse(DMXUniverseCtrl value);

} // DMXFixtureValuations
