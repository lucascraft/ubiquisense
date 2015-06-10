/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.ezdmxctrl;

import net.sf.smbt.dmx.model.qxf.FixtureDefinition;
import net.sf.smbt.xcp.XCPAddress;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DMX Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.DMXProject#getUniverses <em>Universes</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.DMXProject#getScenes <em>Scenes</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.DMXProject#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.DMXProject#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.DMXProject#getLibrary <em>Library</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.DMXProject#getFixtureDefinitions <em>Fixture Definitions</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.DMXProject#getLastAddress <em>Last Address</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.DMXProject#getSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXProject()
 * @model
 * @generated
 */
public interface DMXProject extends EObject {
	/**
	 * Returns the value of the '<em><b>Universes</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl}.
	 * It is bidirectional and its opposite is '{@link net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Universes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Universes</em>' containment reference list.
	 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXProject_Universes()
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl#getManager
	 * @model opposite="manager" containment="true"
	 * @generated
	 */
	EList<DMXUniverseCtrl> getUniverses();

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
	 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXProject_Scenes()
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXScene#getManager
	 * @model opposite="manager" containment="true"
	 * @generated
	 */
	EList<DMXScene> getScenes();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXProject_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.ezdmxctrl.DMXProject#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXProject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.ezdmxctrl.DMXProject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Library</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' containment reference.
	 * @see #setLibrary(DMXLibrary)
	 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXProject_Library()
	 * @model containment="true"
	 * @generated
	 */
	DMXLibrary getLibrary();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.ezdmxctrl.DMXProject#getLibrary <em>Library</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' containment reference.
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(DMXLibrary value);

	/**
	 * Returns the value of the '<em><b>Fixture Definitions</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.dmx.model.qxf.FixtureDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixture Definitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixture Definitions</em>' reference list.
	 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXProject_FixtureDefinitions()
	 * @model
	 * @generated
	 */
	EList<FixtureDefinition> getFixtureDefinitions();

	/**
	 * Returns the value of the '<em><b>Last Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Address</em>' containment reference.
	 * @see #setLastAddress(XCPAddress)
	 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXProject_LastAddress()
	 * @model containment="true"
	 * @generated
	 */
	XCPAddress getLastAddress();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.ezdmxctrl.DMXProject#getLastAddress <em>Last Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Address</em>' containment reference.
	 * @see #getLastAddress()
	 * @generated
	 */
	void setLastAddress(XCPAddress value);

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' reference.
	 * @see #setSelection(EObject)
	 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXProject_Selection()
	 * @model
	 * @generated
	 */
	EObject getSelection();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.ezdmxctrl.DMXProject#getSelection <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' reference.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(EObject value);

} // DMXProject
