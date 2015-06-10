/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.ezdmxctrl;

import net.sf.smbt.dmx.model.qxf.FixtureDefinition;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DMX Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.DMXManager#getFixtureDefinitions <em>Fixture Definitions</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.DMXManager#getUniverses <em>Universes</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.DMXManager#getScenes <em>Scenes</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.DMXManager#getFx <em>Fx</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXManager()
 * @model
 * @generated
 */
public interface DMXManager extends EObject {
	/**
	 * Returns the value of the '<em><b>Fixture Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.dmx.model.qxf.FixtureDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixture Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixture Definitions</em>' containment reference list.
	 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXManager_FixtureDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<FixtureDefinition> getFixtureDefinitions();

	/**
	 * Returns the value of the '<em><b>Universes</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Universes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Universes</em>' containment reference.
	 * @see #setUniverses(DMXUniverseCtrl)
	 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXManager_Universes()
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl#getManager
	 * @model opposite="manager" containment="true"
	 * @generated
	 */
	DMXUniverseCtrl getUniverses();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.ezdmxctrl.DMXManager#getUniverses <em>Universes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Universes</em>' containment reference.
	 * @see #getUniverses()
	 * @generated
	 */
	void setUniverses(DMXUniverseCtrl value);

	/**
	 * Returns the value of the '<em><b>Scenes</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.dmx.ezdmxctrl.DMXScene}.
	 * It is bidirectional and its opposite is '{@link net.sf.smbt.dmx.ezdmxctrl.DMXScene#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenes</em>' containment reference list.
	 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXManager_Scenes()
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXScene#getManager
	 * @model opposite="manager" containment="true"
	 * @generated
	 */
	EList<DMXScene> getScenes();

	/**
	 * Returns the value of the '<em><b>Fx</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.dmx.ezdmxctrl.DMXFx}.
	 * It is bidirectional and its opposite is '{@link net.sf.smbt.dmx.ezdmxctrl.DMXFx#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fx</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fx</em>' containment reference list.
	 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXManager_Fx()
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXFx#getManager
	 * @model opposite="manager" containment="true"
	 * @generated
	 */
	EList<DMXFx> getFx();

} // DMXManager
