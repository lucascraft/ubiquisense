/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.model.ezdmx;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DMX Fade Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.dmx.model.ezdmx.DMXFadeCmd#getChannel <em>Channel</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.ezdmx.DMXFadeCmd#getValue <em>Value</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.ezdmx.DMXFadeCmd#getPeriod <em>Period</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.dmx.model.ezdmx.EzdmxPackage#getDMXFadeCmd()
 * @model
 * @generated
 */
public interface DMXFadeCmd extends DMXSndCmd {
	/**
	 * Returns the value of the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel</em>' attribute.
	 * @see #setChannel(int)
	 * @see net.sf.smbt.dmx.model.ezdmx.EzdmxPackage#getDMXFadeCmd_Channel()
	 * @model
	 * @generated
	 */
	int getChannel();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.model.ezdmx.DMXFadeCmd#getChannel <em>Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel</em>' attribute.
	 * @see #getChannel()
	 * @generated
	 */
	void setChannel(int value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see net.sf.smbt.dmx.model.ezdmx.EzdmxPackage#getDMXFadeCmd_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.model.ezdmx.DMXFadeCmd#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(float)
	 * @see net.sf.smbt.dmx.model.ezdmx.EzdmxPackage#getDMXFadeCmd_Period()
	 * @model
	 * @generated
	 */
	float getPeriod();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.model.ezdmx.DMXFadeCmd#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(float value);

} // DMXFadeCmd
