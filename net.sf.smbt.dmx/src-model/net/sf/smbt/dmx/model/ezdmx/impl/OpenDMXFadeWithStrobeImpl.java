/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.model.ezdmx.impl;

import net.sf.smbt.dmx.model.ezdmx.EzdmxPackage;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeWithStrobe;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Open DMX Fade With Strobe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXFadeWithStrobeImpl#getChannel <em>Channel</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXFadeWithStrobeImpl#getR <em>R</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXFadeWithStrobeImpl#getB <em>B</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXFadeWithStrobeImpl#getG <em>G</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXFadeWithStrobeImpl#getStrobe <em>Strobe</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpenDMXFadeWithStrobeImpl extends OpenDMXCmdImpl implements OpenDMXFadeWithStrobe {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenDMXFadeWithStrobeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzdmxPackage.Literals.OPEN_DMX_FADE_WITH_STROBE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getChannel() {
		return (Integer)eGet(EzdmxPackage.Literals.OPEN_DMX_FADE_WITH_STROBE__CHANNEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannel(int newChannel) {
		eSet(EzdmxPackage.Literals.OPEN_DMX_FADE_WITH_STROBE__CHANNEL, newChannel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getR() {
		return (Integer)eGet(EzdmxPackage.Literals.OPEN_DMX_FADE_WITH_STROBE__R, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR(int newR) {
		eSet(EzdmxPackage.Literals.OPEN_DMX_FADE_WITH_STROBE__R, newR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getB() {
		return (Integer)eGet(EzdmxPackage.Literals.OPEN_DMX_FADE_WITH_STROBE__B, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setB(int newB) {
		eSet(EzdmxPackage.Literals.OPEN_DMX_FADE_WITH_STROBE__B, newB);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getG() {
		return (Integer)eGet(EzdmxPackage.Literals.OPEN_DMX_FADE_WITH_STROBE__G, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setG(int newG) {
		eSet(EzdmxPackage.Literals.OPEN_DMX_FADE_WITH_STROBE__G, newG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStrobe() {
		return (Integer)eGet(EzdmxPackage.Literals.OPEN_DMX_FADE_WITH_STROBE__STROBE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrobe(int newStrobe) {
		eSet(EzdmxPackage.Literals.OPEN_DMX_FADE_WITH_STROBE__STROBE, newStrobe);
	}

} //OpenDMXFadeWithStrobeImpl
