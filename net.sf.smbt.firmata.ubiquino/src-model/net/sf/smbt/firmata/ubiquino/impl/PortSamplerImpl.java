/**
 */
package net.sf.smbt.firmata.ubiquino.impl;

import java.util.Collection;

import net.sf.smbt.firmata.ubiquino.PortSampler;
import net.sf.smbt.firmata.ubiquino.UbiquinoPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Sampler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.firmata.ubiquino.impl.PortSamplerImpl#getSamples <em>Samples</em>}</li>
 *   <li>{@link net.sf.smbt.firmata.ubiquino.impl.PortSamplerImpl#getSampleRate <em>Sample Rate</em>}</li>
 *   <li>{@link net.sf.smbt.firmata.ubiquino.impl.PortSamplerImpl#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortSamplerImpl extends MinimalEObjectImpl.Container implements PortSampler {
	/**
	 * The cached value of the '{@link #getSamples() <em>Samples</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamples()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> samples;

	/**
	 * The default value of the '{@link #getSampleRate() <em>Sample Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleRate()
	 * @generated
	 * @ordered
	 */
	protected static final int SAMPLE_RATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSampleRate() <em>Sample Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSampleRate()
	 * @generated
	 * @ordered
	 */
	protected int sampleRate = SAMPLE_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final long SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected long size = SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortSamplerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UbiquinoPackage.Literals.PORT_SAMPLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getSamples() {
		if (samples == null) {
			samples = new EDataTypeUniqueEList<Integer>(Integer.class, this, UbiquinoPackage.PORT_SAMPLER__SAMPLES);
		}
		return samples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSampleRate() {
		return sampleRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSampleRate(int newSampleRate) {
		int oldSampleRate = sampleRate;
		sampleRate = newSampleRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbiquinoPackage.PORT_SAMPLER__SAMPLE_RATE, oldSampleRate, sampleRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(long newSize) {
		long oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbiquinoPackage.PORT_SAMPLER__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UbiquinoPackage.PORT_SAMPLER__SAMPLES:
				return getSamples();
			case UbiquinoPackage.PORT_SAMPLER__SAMPLE_RATE:
				return getSampleRate();
			case UbiquinoPackage.PORT_SAMPLER__SIZE:
				return getSize();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UbiquinoPackage.PORT_SAMPLER__SAMPLES:
				getSamples().clear();
				getSamples().addAll((Collection<? extends Integer>)newValue);
				return;
			case UbiquinoPackage.PORT_SAMPLER__SAMPLE_RATE:
				setSampleRate((Integer)newValue);
				return;
			case UbiquinoPackage.PORT_SAMPLER__SIZE:
				setSize((Long)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UbiquinoPackage.PORT_SAMPLER__SAMPLES:
				getSamples().clear();
				return;
			case UbiquinoPackage.PORT_SAMPLER__SAMPLE_RATE:
				setSampleRate(SAMPLE_RATE_EDEFAULT);
				return;
			case UbiquinoPackage.PORT_SAMPLER__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UbiquinoPackage.PORT_SAMPLER__SAMPLES:
				return samples != null && !samples.isEmpty();
			case UbiquinoPackage.PORT_SAMPLER__SAMPLE_RATE:
				return sampleRate != SAMPLE_RATE_EDEFAULT;
			case UbiquinoPackage.PORT_SAMPLER__SIZE:
				return size != SIZE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (samples: ");
		result.append(samples);
		result.append(", sampleRate: ");
		result.append(sampleRate);
		result.append(", size: ");
		result.append(size);
		result.append(')');
		return result.toString();
	}

} //PortSamplerImpl
