/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.model.ezdmx.impl;

import net.sf.smbt.dmx.model.ezdmx.EzdmxPackage;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeFull;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Open DMX Fade Full</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXFadeFullImpl#getR <em>R</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXFadeFullImpl#getG <em>G</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXFadeFullImpl#getB <em>B</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXFadeFullImpl#getFullColor <em>Full Color</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXFadeFullImpl#getStrobe <em>Strobe</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXFadeFullImpl#getModi <em>Modi</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXFadeFullImpl#getExt <em>Ext</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpenDMXFadeFullImpl extends OpenDMXCmdImpl implements OpenDMXFadeFull {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenDMXFadeFullImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzdmxPackage.Literals.OPEN_DMX_FADE_FULL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getR() {
		return (Integer)eGet(EzdmxPackage.Literals.OPEN_DMX_FADE_FULL__R, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR(int newR) {
		eSet(EzdmxPackage.Literals.OPEN_DMX_FADE_FULL__R, newR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getG() {
		return (Integer)eGet(EzdmxPackage.Literals.OPEN_DMX_FADE_FULL__G, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setG(int newG) {
		eSet(EzdmxPackage.Literals.OPEN_DMX_FADE_FULL__G, newG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getB() {
		return (Integer)eGet(EzdmxPackage.Literals.OPEN_DMX_FADE_FULL__B, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setB(int newB) {
		eSet(EzdmxPackage.Literals.OPEN_DMX_FADE_FULL__B, newB);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFullColor() {
		return (Integer)eGet(EzdmxPackage.Literals.OPEN_DMX_FADE_FULL__FULL_COLOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullColor(int newFullColor) {
		eSet(EzdmxPackage.Literals.OPEN_DMX_FADE_FULL__FULL_COLOR, newFullColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStrobe() {
		return (Integer)eGet(EzdmxPackage.Literals.OPEN_DMX_FADE_FULL__STROBE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrobe(int newStrobe) {
		eSet(EzdmxPackage.Literals.OPEN_DMX_FADE_FULL__STROBE, newStrobe);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getModi() {
		return (Integer)eGet(EzdmxPackage.Literals.OPEN_DMX_FADE_FULL__MODI, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModi(int newModi) {
		eSet(EzdmxPackage.Literals.OPEN_DMX_FADE_FULL__MODI, newModi);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExt() {
		return (Integer)eGet(EzdmxPackage.Literals.OPEN_DMX_FADE_FULL__EXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExt(int newExt) {
		eSet(EzdmxPackage.Literals.OPEN_DMX_FADE_FULL__EXT, newExt);
	}

} //OpenDMXFadeFullImpl
