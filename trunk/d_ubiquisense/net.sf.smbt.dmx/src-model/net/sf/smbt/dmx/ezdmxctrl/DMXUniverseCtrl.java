/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.ezdmxctrl;

import net.sf.xqz.model.engine.IConnectedUnit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DMX Universe Ctrl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl#getVer <em>Ver</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl#getChannels <em>Channels</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl#getFixtures <em>Fixtures</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl#getAddrRangeMin <em>Addr Range Min</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl#getAddrRangeMax <em>Addr Range Max</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl#getManager <em>Manager</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl#getCues <em>Cues</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl#getSteps <em>Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXUniverseCtrl()
 * @model
 * @generated
 */
public interface DMXUniverseCtrl extends IConnectedUnit {
	/**
	 * Returns the value of the '<em><b>Ver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ver</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ver</em>' attribute.
	 * @see #setVer(String)
	 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXUniverseCtrl_Ver()
	 * @model
	 * @generated
	 */
	String getVer();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl#getVer <em>Ver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ver</em>' attribute.
	 * @see #getVer()
	 * @generated
	 */
	void setVer(String value);

	/**
	 * Returns the value of the '<em><b>Channels</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.dmx.ezdmxctrl.DMXChannel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channels</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channels</em>' containment reference list.
	 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXUniverseCtrl_Channels()
	 * @model containment="true"
	 * @generated
	 */
	EList<DMXChannel> getChannels();

	/**
	 * Returns the value of the '<em><b>Fixtures</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.dmx.ezdmxctrl.DMXFixtureValuations}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixtures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixtures</em>' containment reference list.
	 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXUniverseCtrl_Fixtures()
	 * @model containment="true"
	 * @generated
	 */
	EList<DMXFixtureValuations> getFixtures();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXUniverseCtrl_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Addr Range Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addr Range Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addr Range Min</em>' attribute.
	 * @see #setAddrRangeMin(int)
	 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXUniverseCtrl_AddrRangeMin()
	 * @model
	 * @generated
	 */
	int getAddrRangeMin();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl#getAddrRangeMin <em>Addr Range Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addr Range Min</em>' attribute.
	 * @see #getAddrRangeMin()
	 * @generated
	 */
	void setAddrRangeMin(int value);

	/**
	 * Returns the value of the '<em><b>Addr Range Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addr Range Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addr Range Max</em>' attribute.
	 * @see #setAddrRangeMax(int)
	 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXUniverseCtrl_AddrRangeMax()
	 * @model
	 * @generated
	 */
	int getAddrRangeMax();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl#getAddrRangeMax <em>Addr Range Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addr Range Max</em>' attribute.
	 * @see #getAddrRangeMax()
	 * @generated
	 */
	void setAddrRangeMax(int value);

	/**
	 * Returns the value of the '<em><b>Manager</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link net.sf.smbt.dmx.ezdmxctrl.DMXProject#getUniverses <em>Universes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager</em>' container reference.
	 * @see #setManager(DMXProject)
	 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXUniverseCtrl_Manager()
	 * @see net.sf.smbt.dmx.ezdmxctrl.DMXProject#getUniverses
	 * @model opposite="universes" transient="false"
	 * @generated
	 */
	DMXProject getManager();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl#getManager <em>Manager</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager</em>' container reference.
	 * @see #getManager()
	 * @generated
	 */
	void setManager(DMXProject value);

	/**
	 * Returns the value of the '<em><b>Cues</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.dmx.ezdmxctrl.DMXFixtureValuations}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cues</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cues</em>' containment reference list.
	 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXUniverseCtrl_Cues()
	 * @model containment="true"
	 * @generated
	 */
	EList<DMXFixtureValuations> getCues();

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.dmx.ezdmxctrl.DMXCueSequence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXUniverseCtrl_Steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<DMXCueSequence> getSteps();

} // DMXUniverseCtrl
