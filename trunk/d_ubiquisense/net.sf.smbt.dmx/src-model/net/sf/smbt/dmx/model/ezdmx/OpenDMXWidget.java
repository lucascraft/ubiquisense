/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.model.ezdmx;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open DMX Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXWidget#getUid <em>Uid</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.dmx.model.ezdmx.EzdmxPackage#getOpenDMXWidget()
 * @model
 * @generated
 */
public interface OpenDMXWidget extends EObject {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #setUid(byte[])
	 * @see net.sf.smbt.dmx.model.ezdmx.EzdmxPackage#getOpenDMXWidget_Uid()
	 * @model
	 * @generated
	 */
	byte[] getUid();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXWidget#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(byte[] value);

} // OpenDMXWidget
