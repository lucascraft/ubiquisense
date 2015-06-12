/**
 * <copyright>
 * </copyright>
 *
 * $Id: CommandsAdapterFactory.java,v 1.2 2009/01/20 07:06:03 lucascraft Exp $
 */
package net.sf.smbt.commands.util;

import net.sf.smbt.commands.*;
import net.sf.smbt.commands.BlinkMCmd;
import net.sf.smbt.commands.CommandsPackage;
import net.sf.smbt.commands.FadeToHSBColorCmd;
import net.sf.smbt.commands.FadeToRGBColorCmd;
import net.sf.smbt.commands.FadeToRandomHSBColorCmd;
import net.sf.smbt.commands.FadeToRandomRGBColorCmd;
import net.sf.smbt.commands.GetBlinkMAddrCmd;
import net.sf.smbt.commands.GetBlinkMFirmwareVersionCmd;
import net.sf.smbt.commands.GetCurrentRGBColorCmd;
import net.sf.smbt.commands.GoToRGBColorCmd;
import net.sf.smbt.commands.PlayLightScriptCmd;
import net.sf.smbt.commands.ReadScriptLineCmd;
import net.sf.smbt.commands.SetBlinkMAddrCmd;
import net.sf.smbt.commands.SetFadeSpeedCmd;
import net.sf.smbt.commands.SetScriptLengthAndRepeatCmd;
import net.sf.smbt.commands.SetStartupParametersCmd;
import net.sf.smbt.commands.SetTimeAdjustCmd;
import net.sf.smbt.commands.StopScriptCmd;
import net.sf.smbt.commands.WriteScriptLineCmd;
import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.commands.CommandsPackage
 * @generated
 */
public class CommandsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CommandsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CommandsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandsSwitch<Adapter> modelSwitch =
		new CommandsSwitch<Adapter>() {
			@Override
			public Adapter caseBlinkMCmd(BlinkMCmd object) {
				return createBlinkMCmdAdapter();
			}
			@Override
			public Adapter caseGoToRGBColorCmd(GoToRGBColorCmd object) {
				return createGoToRGBColorCmdAdapter();
			}
			@Override
			public Adapter caseFadeToRGBColorCmd(FadeToRGBColorCmd object) {
				return createFadeToRGBColorCmdAdapter();
			}
			@Override
			public Adapter caseFadeToHSBColorCmd(FadeToHSBColorCmd object) {
				return createFadeToHSBColorCmdAdapter();
			}
			@Override
			public Adapter caseFadeToRandomRGBColorCmd(FadeToRandomRGBColorCmd object) {
				return createFadeToRandomRGBColorCmdAdapter();
			}
			@Override
			public Adapter caseFadeToRandomHSBColorCmd(FadeToRandomHSBColorCmd object) {
				return createFadeToRandomHSBColorCmdAdapter();
			}
			@Override
			public Adapter casePlayLightScriptCmd(PlayLightScriptCmd object) {
				return createPlayLightScriptCmdAdapter();
			}
			@Override
			public Adapter caseSetFadeSpeedCmd(SetFadeSpeedCmd object) {
				return createSetFadeSpeedCmdAdapter();
			}
			@Override
			public Adapter caseStopScriptCmd(StopScriptCmd object) {
				return createStopScriptCmdAdapter();
			}
			@Override
			public Adapter caseSetTimeAdjustCmd(SetTimeAdjustCmd object) {
				return createSetTimeAdjustCmdAdapter();
			}
			@Override
			public Adapter caseGetCurrentRGBColorCmd(GetCurrentRGBColorCmd object) {
				return createGetCurrentRGBColorCmdAdapter();
			}
			@Override
			public Adapter caseWriteScriptLineCmd(WriteScriptLineCmd object) {
				return createWriteScriptLineCmdAdapter();
			}
			@Override
			public Adapter caseReadScriptLineCmd(ReadScriptLineCmd object) {
				return createReadScriptLineCmdAdapter();
			}
			@Override
			public Adapter caseSetScriptLengthAndRepeatCmd(SetScriptLengthAndRepeatCmd object) {
				return createSetScriptLengthAndRepeatCmdAdapter();
			}
			@Override
			public Adapter caseSetBlinkMAddrCmd(SetBlinkMAddrCmd object) {
				return createSetBlinkMAddrCmdAdapter();
			}
			@Override
			public Adapter caseGetBlinkMAddrCmd(GetBlinkMAddrCmd object) {
				return createGetBlinkMAddrCmdAdapter();
			}
			@Override
			public Adapter caseGetBlinkMFirmwareVersionCmd(GetBlinkMFirmwareVersionCmd object) {
				return createGetBlinkMFirmwareVersionCmdAdapter();
			}
			@Override
			public Adapter caseSetStartupParametersCmd(SetStartupParametersCmd object) {
				return createSetStartupParametersCmdAdapter();
			}
			@Override
			public Adapter caseCmd(Cmd object) {
				return createCmdAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.commands.BlinkMCmd <em>Blink MCmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.commands.BlinkMCmd
	 * @generated
	 */
	public Adapter createBlinkMCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.commands.GoToRGBColorCmd <em>Go To RGB Color Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.commands.GoToRGBColorCmd
	 * @generated
	 */
	public Adapter createGoToRGBColorCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.commands.FadeToRGBColorCmd <em>Fade To RGB Color Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.commands.FadeToRGBColorCmd
	 * @generated
	 */
	public Adapter createFadeToRGBColorCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.commands.FadeToHSBColorCmd <em>Fade To HSB Color Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.commands.FadeToHSBColorCmd
	 * @generated
	 */
	public Adapter createFadeToHSBColorCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.commands.FadeToRandomRGBColorCmd <em>Fade To Random RGB Color Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.commands.FadeToRandomRGBColorCmd
	 * @generated
	 */
	public Adapter createFadeToRandomRGBColorCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.commands.FadeToRandomHSBColorCmd <em>Fade To Random HSB Color Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.commands.FadeToRandomHSBColorCmd
	 * @generated
	 */
	public Adapter createFadeToRandomHSBColorCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.commands.PlayLightScriptCmd <em>Play Light Script Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.commands.PlayLightScriptCmd
	 * @generated
	 */
	public Adapter createPlayLightScriptCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.commands.SetFadeSpeedCmd <em>Set Fade Speed Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.commands.SetFadeSpeedCmd
	 * @generated
	 */
	public Adapter createSetFadeSpeedCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.commands.StopScriptCmd <em>Stop Script Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.commands.StopScriptCmd
	 * @generated
	 */
	public Adapter createStopScriptCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.commands.SetTimeAdjustCmd <em>Set Time Adjust Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.commands.SetTimeAdjustCmd
	 * @generated
	 */
	public Adapter createSetTimeAdjustCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.commands.GetCurrentRGBColorCmd <em>Get Current RGB Color Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.commands.GetCurrentRGBColorCmd
	 * @generated
	 */
	public Adapter createGetCurrentRGBColorCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.commands.WriteScriptLineCmd <em>Write Script Line Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.commands.WriteScriptLineCmd
	 * @generated
	 */
	public Adapter createWriteScriptLineCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.commands.ReadScriptLineCmd <em>Read Script Line Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.commands.ReadScriptLineCmd
	 * @generated
	 */
	public Adapter createReadScriptLineCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.commands.SetScriptLengthAndRepeatCmd <em>Set Script Length And Repeat Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.commands.SetScriptLengthAndRepeatCmd
	 * @generated
	 */
	public Adapter createSetScriptLengthAndRepeatCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.commands.SetBlinkMAddrCmd <em>Set Blink MAddr Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.commands.SetBlinkMAddrCmd
	 * @generated
	 */
	public Adapter createSetBlinkMAddrCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.commands.GetBlinkMAddrCmd <em>Get Blink MAddr Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.commands.GetBlinkMAddrCmd
	 * @generated
	 */
	public Adapter createGetBlinkMAddrCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.commands.GetBlinkMFirmwareVersionCmd <em>Get Blink MFirmware Version Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.commands.GetBlinkMFirmwareVersionCmd
	 * @generated
	 */
	public Adapter createGetBlinkMFirmwareVersionCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.commands.SetStartupParametersCmd <em>Set Startup Parameters Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.commands.SetStartupParametersCmd
	 * @generated
	 */
	public Adapter createSetStartupParametersCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.xqz.model.cmd.Cmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.xqz.model.cmd.Cmd
	 * @generated
	 */
	public Adapter createCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CommandsAdapterFactory
