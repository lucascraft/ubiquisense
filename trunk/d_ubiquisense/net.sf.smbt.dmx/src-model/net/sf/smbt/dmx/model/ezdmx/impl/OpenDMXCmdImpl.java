/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.model.ezdmx.impl;

import net.sf.smbt.dmx.model.ezdmx.EzdmxPackage;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXCmd;
import net.sf.xqz.engine.cmd.utils.CmdUtil;
import net.sf.xqz.model.cmd.impl.CmdImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Open DMX Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXCmdImpl#getStart <em>Start</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXCmdImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXCmdImpl#getData <em>Data</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXCmdImpl#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class OpenDMXCmdImpl extends CmdImpl implements OpenDMXCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenDMXCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzdmxPackage.Literals.OPEN_DMX_CMD;
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
	
	@Override
	public String toString() {
		return CmdUtil.INSTANCE.getFrameHexInfo(getData());
	}

} //OpenDMXCmdImpl
