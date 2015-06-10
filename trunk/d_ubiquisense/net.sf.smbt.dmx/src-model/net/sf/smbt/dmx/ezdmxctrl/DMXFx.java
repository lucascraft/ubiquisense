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
 * A representation of the model object '<em><b>DMX Fx</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.DMXFx#getManager <em>Manager</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.DMXFx#getMotion <em>Motion</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.DMXFx#getBehavior <em>Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXFx()
 * @model
 * @generated
 */
public interface DMXFx extends EObject {
	/**
	 * Returns the value of the '<em><b>Manager</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link net.sf.smbt.dmx.ezdmxctrl.DMXLibrary#getFx <em>Fx</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager</em>' container reference.
	 * @see #setManager(DMXLibrary)
	 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXFx_Manager()
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXLibrary#getFx
	 * @model opposite="fx" transient="false"
	 * @generated
	 */
	DMXLibrary getManager();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.ezdmxctrl.DMXFx#getManager <em>Manager</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager</em>' container reference.
	 * @see #getManager()
	 * @generated
	 */
	void setManager(DMXLibrary value);

	/**
	 * Returns the value of the '<em><b>Motion</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.dmx.ezdmxctrl.DMXfixtureMotion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motion</em>' attribute.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXfixtureMotion
	 * @see #setMotion(DMXfixtureMotion)
	 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXFx_Motion()
	 * @model
	 * @generated
	 */
	DMXfixtureMotion getMotion();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.ezdmxctrl.DMXFx#getMotion <em>Motion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Motion</em>' attribute.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXfixtureMotion
	 * @see #getMotion()
	 * @generated
	 */
	void setMotion(DMXfixtureMotion value);

	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.dmx.ezdmxctrl.DMXFixtureBehavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' attribute.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXFixtureBehavior
	 * @see #setBehavior(DMXFixtureBehavior)
	 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXFx_Behavior()
	 * @model
	 * @generated
	 */
	DMXFixtureBehavior getBehavior();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.ezdmxctrl.DMXFx#getBehavior <em>Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' attribute.
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXFixtureBehavior
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(DMXFixtureBehavior value);

} // DMXFx
