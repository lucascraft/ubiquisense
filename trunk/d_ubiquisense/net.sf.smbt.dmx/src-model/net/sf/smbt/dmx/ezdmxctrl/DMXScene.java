/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.ezdmxctrl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DMX Scene</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.DMXScene#getManager <em>Manager</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.DMXScene#getFixtures <em>Fixtures</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.DMXScene#getFx <em>Fx</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.DMXScene#getBus <em>Bus</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXScene()
 * @model
 * @generated
 */
public interface DMXScene extends EObject {
	/**
	 * Returns the value of the '<em><b>Manager</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link net.sf.smbt.dmx.ezdmxctrl.DMXProject#getScenes <em>Scenes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager</em>' container reference.
	 * @see #setManager(DMXProject)
	 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXScene_Manager()
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXProject#getScenes
	 * @model opposite="scenes" transient="false"
	 * @generated
	 */
	DMXProject getManager();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.ezdmxctrl.DMXScene#getManager <em>Manager</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager</em>' container reference.
	 * @see #getManager()
	 * @generated
	 */
	void setManager(DMXProject value);

	/**
	 * Returns the value of the '<em><b>Fixtures</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.dmx.ezdmxctrl.DMXFixture}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixtures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixtures</em>' reference list.
	 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXScene_Fixtures()
	 * @model
	 * @generated
	 */
	EList<DMXFixture> getFixtures();

	/**
	 * Returns the value of the '<em><b>Fx</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.dmx.ezdmxctrl.DMXFx}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fx</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fx</em>' reference list.
	 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXScene_Fx()
	 * @model
	 * @generated
	 */
	EList<DMXFx> getFx();

	/**
	 * Returns the value of the '<em><b>Bus</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.dmx.ezdmxctrl.DMXBus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus</em>' containment reference list.
	 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXScene_Bus()
	 * @model containment="true"
	 * @generated
	 */
	EList<DMXBus> getBus();

} // DMXScene
