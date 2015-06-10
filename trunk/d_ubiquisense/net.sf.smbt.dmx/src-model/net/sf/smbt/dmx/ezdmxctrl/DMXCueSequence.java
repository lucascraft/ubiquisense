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
 * A representation of the model object '<em><b>DMX Cue Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.DMXCueSequence#getPrev <em>Prev</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.DMXCueSequence#getNext <em>Next</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.DMXCueSequence#getStart <em>Start</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.DMXCueSequence#getDuration <em>Duration</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.DMXCueSequence#getSpeed <em>Speed</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.DMXCueSequence#isLoop <em>Loop</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.DMXCueSequence#getTimes <em>Times</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXCueSequence()
 * @model
 * @generated
 */
public interface DMXCueSequence extends EObject {
	/**
	 * Returns the value of the '<em><b>Prev</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prev</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prev</em>' reference.
	 * @see #setPrev(DMXFixtureValuations)
	 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXCueSequence_Prev()
	 * @model
	 * @generated
	 */
	DMXFixtureValuations getPrev();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.ezdmxctrl.DMXCueSequence#getPrev <em>Prev</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prev</em>' reference.
	 * @see #getPrev()
	 * @generated
	 */
	void setPrev(DMXFixtureValuations value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(DMXFixtureValuations)
	 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXCueSequence_Next()
	 * @model
	 * @generated
	 */
	DMXFixtureValuations getNext();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.ezdmxctrl.DMXCueSequence#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(DMXFixtureValuations value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(long)
	 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXCueSequence_Start()
	 * @model
	 * @generated
	 */
	long getStart();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.ezdmxctrl.DMXCueSequence#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(long value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(long)
	 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXCueSequence_Duration()
	 * @model
	 * @generated
	 */
	long getDuration();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.ezdmxctrl.DMXCueSequence#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(long value);

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(long)
	 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXCueSequence_Speed()
	 * @model
	 * @generated
	 */
	long getSpeed();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.ezdmxctrl.DMXCueSequence#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(long value);

	/**
	 * Returns the value of the '<em><b>Loop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop</em>' attribute.
	 * @see #setLoop(boolean)
	 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXCueSequence_Loop()
	 * @model
	 * @generated
	 */
	boolean isLoop();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.ezdmxctrl.DMXCueSequence#isLoop <em>Loop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop</em>' attribute.
	 * @see #isLoop()
	 * @generated
	 */
	void setLoop(boolean value);

	/**
	 * Returns the value of the '<em><b>Times</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Times</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Times</em>' attribute.
	 * @see #setTimes(int)
	 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXCueSequence_Times()
	 * @model
	 * @generated
	 */
	int getTimes();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.ezdmxctrl.DMXCueSequence#getTimes <em>Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Times</em>' attribute.
	 * @see #getTimes()
	 * @generated
	 */
	void setTimes(int value);

} // DMXCueSequence
