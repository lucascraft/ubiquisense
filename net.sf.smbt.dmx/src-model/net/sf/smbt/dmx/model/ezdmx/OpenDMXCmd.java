/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.model.ezdmx;

import net.sf.xqz.model.cmd.Cmd;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open DMX Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXCmd#getStart <em>Start</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXCmd#getLabel <em>Label</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXCmd#getData <em>Data</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXCmd#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.dmx.model.ezdmx.EzdmxPackage#getOpenDMXCmd()
 * @model abstract="true"
 * @generated
 */
public interface OpenDMXCmd extends Cmd {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(byte)
	 * @see net.sf.smbt.dmx.model.ezdmx.EzdmxPackage#getOpenDMXCmd_Start()
	 * @model
	 * @generated
	 */
	byte getStart();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXCmd#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(byte value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(byte)
	 * @see net.sf.smbt.dmx.model.ezdmx.EzdmxPackage#getOpenDMXCmd_Label()
	 * @model
	 * @generated
	 */
	byte getLabel();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXCmd#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(byte value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(byte[])
	 * @see net.sf.smbt.dmx.model.ezdmx.EzdmxPackage#getOpenDMXCmd_Data()
	 * @model
	 * @generated
	 */
	byte[] getData();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXCmd#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(byte[] value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(byte)
	 * @see net.sf.smbt.dmx.model.ezdmx.EzdmxPackage#getOpenDMXCmd_End()
	 * @model
	 * @generated
	 */
	byte getEnd();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXCmd#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(byte value);

} // OpenDMXCmd
