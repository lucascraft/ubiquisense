/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezoscdmx.impl;

import net.sf.smbt.dmx.model.ezdmx.EzdmxPackage;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXCmd;
import net.sf.smbt.ezoscdmx.EzoscdmxPackage;
import net.sf.smbt.ezoscdmx.OscDmxCmd;
import net.sf.smbt.osccmd.impl.OscCmdImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Osc Dmx Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezoscdmx.impl.OscDmxCmdImpl#getStart <em>Start</em>}</li>
 *   <li>{@link net.sf.smbt.ezoscdmx.impl.OscDmxCmdImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link net.sf.smbt.ezoscdmx.impl.OscDmxCmdImpl#getData <em>Data</em>}</li>
 *   <li>{@link net.sf.smbt.ezoscdmx.impl.OscDmxCmdImpl#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OscDmxCmdImpl extends OscCmdImpl implements OscDmxCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OscDmxCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzoscdmxPackage.Literals.OSC_DMX_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getStart() {
		return (Byte)eGet(EzdmxPackage.Literals.OPEN_DMX_CMD__START, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(byte newStart) {
		eSet(EzdmxPackage.Literals.OPEN_DMX_CMD__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getLabel() {
		return (Byte)eGet(EzdmxPackage.Literals.OPEN_DMX_CMD__LABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(byte newLabel) {
		eSet(EzdmxPackage.Literals.OPEN_DMX_CMD__LABEL, newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getData() {
		return (byte[])eGet(EzdmxPackage.Literals.OPEN_DMX_CMD__DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(byte[] newData) {
		eSet(EzdmxPackage.Literals.OPEN_DMX_CMD__DATA, newData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getEnd() {
		return (Byte)eGet(EzdmxPackage.Literals.OPEN_DMX_CMD__END, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(byte newEnd) {
		eSet(EzdmxPackage.Literals.OPEN_DMX_CMD__END, newEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == OpenDMXCmd.class) {
			switch (derivedFeatureID) {
				case EzoscdmxPackage.OSC_DMX_CMD__START: return EzdmxPackage.OPEN_DMX_CMD__START;
				case EzoscdmxPackage.OSC_DMX_CMD__LABEL: return EzdmxPackage.OPEN_DMX_CMD__LABEL;
				case EzoscdmxPackage.OSC_DMX_CMD__DATA: return EzdmxPackage.OPEN_DMX_CMD__DATA;
				case EzoscdmxPackage.OSC_DMX_CMD__END: return EzdmxPackage.OPEN_DMX_CMD__END;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == OpenDMXCmd.class) {
			switch (baseFeatureID) {
				case EzdmxPackage.OPEN_DMX_CMD__START: return EzoscdmxPackage.OSC_DMX_CMD__START;
				case EzdmxPackage.OPEN_DMX_CMD__LABEL: return EzoscdmxPackage.OSC_DMX_CMD__LABEL;
				case EzdmxPackage.OPEN_DMX_CMD__DATA: return EzoscdmxPackage.OSC_DMX_CMD__DATA;
				case EzdmxPackage.OPEN_DMX_CMD__END: return EzoscdmxPackage.OSC_DMX_CMD__END;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //OscDmxCmdImpl
