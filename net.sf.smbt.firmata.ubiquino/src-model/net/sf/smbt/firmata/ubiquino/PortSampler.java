/**
 */
package net.sf.smbt.firmata.ubiquino;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Sampler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.firmata.ubiquino.PortSampler#getSamples <em>Samples</em>}</li>
 *   <li>{@link net.sf.smbt.firmata.ubiquino.PortSampler#getSampleRate <em>Sample Rate</em>}</li>
 *   <li>{@link net.sf.smbt.firmata.ubiquino.PortSampler#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.firmata.ubiquino.UbiquinoPackage#getPortSampler()
 * @model
 * @generated
 */
public interface PortSampler extends EObject {
	/**
	 * Returns the value of the '<em><b>Samples</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Samples</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Samples</em>' attribute list.
	 * @see net.sf.smbt.firmata.ubiquino.UbiquinoPackage#getPortSampler_Samples()
	 * @model
	 * @generated
	 */
	EList<Integer> getSamples();

	/**
	 * Returns the value of the '<em><b>Sample Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sample Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sample Rate</em>' attribute.
	 * @see #setSampleRate(int)
	 * @see net.sf.smbt.firmata.ubiquino.UbiquinoPackage#getPortSampler_SampleRate()
	 * @model
	 * @generated
	 */
	int getSampleRate();

	/**
	 * Sets the value of the '{@link net.sf.smbt.firmata.ubiquino.PortSampler#getSampleRate <em>Sample Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sample Rate</em>' attribute.
	 * @see #getSampleRate()
	 * @generated
	 */
	void setSampleRate(int value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(long)
	 * @see net.sf.smbt.firmata.ubiquino.UbiquinoPackage#getPortSampler_Size()
	 * @model
	 * @generated
	 */
	long getSize();

	/**
	 * Sets the value of the '{@link net.sf.smbt.firmata.ubiquino.PortSampler#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(long value);

} // PortSampler
