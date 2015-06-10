/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2012-2014, Lucas Bigeardel
 * 
 * The library is released under:
 * 
 * A) LGPL
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA 02110-1301 USA
 * 
 * B) EPL
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Lucas Bigeardel <lucas.bigeardel@gmail.com> - Initial API and implementation
 ***********************************************************************************/

package net.sf.smbt.ui.widgets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.smbt.comm.script.netConf.TRANSPORT_PROTOCOL;
import net.sf.smbt.ezmojo.EZMojoKind;
import net.sf.smbt.ezmojo.EZMojoNode;
import net.sf.smbt.ezmojo.EZMojoRoot;
import net.sf.smbt.ezmojo.EZMojoTarget;
import net.sf.smbt.ezmojo.EZTUIOVar;
import net.sf.smbt.ezmojo.EZVar;
import net.sf.smbt.ezmojo.provider.EzmojoEditPlugin;
import net.sf.smbt.mapping.engine.IMapEngine;
import net.sf.smbt.osc.ezmojo.utils.EzMojoAgentCmdUtils;
import net.sf.smbt.osc.ezmojo.utils.EzMojoAgentManager;
import net.sf.smbt.osc.ezmojo.utils.EzMojoCmdUtils;
import net.sf.smbt.osc.ezmojo.utils.EzMojoExprUtils;
import net.sf.smbt.osc.ezmojo.utils.EzMojoMappingManager;
import net.sf.smbt.osc.ezmojo.utils.EzMojoResourceUtils;
import net.sf.smbt.osc.utils.OscCmdUtils;
import net.sf.smbt.osccmd.OscCmd;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.smbt.ui.Activator;
import net.sf.smbt.ui.actions.ezmojo.ExportEzMojo;
import net.sf.smbt.ui.actions.ezmojo.ImportEzMojo;
import net.sf.smbt.ui.console.controller.EzMojoCompseableAdapterFactory;
import net.sf.smbt.ui.console.controller.EzMojoContentProvider;
import net.sf.smbt.ui.dialogs.CommPipeSelectionDialog;
import net.sf.smbt.ui.hmi.GUIToolkit;
import net.sf.smbt.ui.motion.dialog.KinematicsSelectionDialog;
import net.sf.smbt.ui.preferences.UbiConsolePreferenceConstants;
import net.sf.smbt.ui.services.EZViewActionManager;
import net.sf.smbt.ui.wizards.CommPipeConfigWizardDialog;
import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.ContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.dialogs.PropertyDialogAction;
import org.eclipse.ui.internal.ide.IDEWorkbenchMessages;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.progress.UIJob;

import com.illposed.osc.OSCMessage;

@SuppressWarnings("restriction")
public class EZView extends ViewPart{
	private TreeViewer ezTree;
	public EZUIJob uiJob;

	   
 private static long[] temporalThresholds = new long[] {25, 50, 100, 250, 500, 1000, 1500, 2500, 5000, 10000, 60000};
 
 private static RGB[] temporalBlur = new RGB[] { 
 	new RGB(245, 15, 15),
 	new RGB(235, 25, 25),
 	new RGB(220, 30, 30),
 	new RGB(220, 45, 45),
 	new RGB(220, 70, 70),
 	new RGB(225, 130, 130),
 	new RGB(230, 150, 150),
 	new RGB(235, 166, 166),
 	new RGB(240, 175, 175),
 	new RGB(245, 190, 190),
 	new RGB(255, 200, 200)
 };
 
 private static RGB targetOnColor = ColorConstants.lightGreen.getRGB();
 //private static RGB targetOffColor = ColorConstants.lightGray.getRGB();
 private static RGB ezVarOnColor = ColorConstants.lightGray.getRGB();
 //private static RGB ezVartOffColor = ColorConstants.gray.getRGB();
 
 public final static int NORMAL_REFRESH_RATE = 500; // 2 Hz
 public final static int FAST_REFRESH_RATE = 100; // 10 Hz Babe
 
 public static int refreshRate = NORMAL_REFRESH_RATE;

	private Action doubleClickAction;
	private Action liveNotificationAction, loadEzMojoRootAction, saveEzMojoRootAction;
	private boolean liveNotification;

    public EZMojoRoot getEzMojoRoot() {
    	if (ezTree != null && ezTree.getInput() instanceof EZMojoRoot) {
    		return (EZMojoRoot) ezTree.getInput();
    	}
    	return null;
    }
    public EZMojoNode getEzMojoTopNode() {
    	if (ezTree != null && ezTree.getInput() instanceof EZMojoRoot) {
    		EZMojoRoot root = (EZMojoRoot) ezTree.getInput();
    		EZMojoNode node = root.getRoot();
    		return node;
    	}
    	return null;
    }

    CmdPipe ezMojoPipe;
    
	public EZView() {
		EzMojoAgentManager.INSTANCE.getLocalAgent();
		colors = new HashMap<String, Color>();
		liveNotification = true;
		ezMojoPipe = QuanticMojo.INSTANCE.getAgentPipe();
	}
	
	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(addPipeAction);
		manager.add(liveNotificationAction);
//		manager.add(resetAction);
		manager.add(loadEzMojoRootAction);
		manager.add(saveEzMojoRootAction);
	}
	
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(addPipeAction);
		manager.add(liveNotificationAction);
//		manager.add(resetAction);
		manager.add(loadEzMojoRootAction);
		manager.add(saveEzMojoRootAction);

		ToolbarComboRcv tcIn = new ToolbarComboRcv("");
		ToolbarComboSnd tcOut = new ToolbarComboSnd("");
		
		manager.add(tcOut);
		manager.add(tcIn);
	}
	
	Map<String, Color> colors;
	Color getColor(int r, int g, int b) {
		String k = r+"_"+g+"_"+b;
		if (!colors.containsKey(k)) {
			return colors.put(k, new Color(Display.getDefault(), new RGB(r, g, b)));
		}
		return colors.get(k);
	}
	
	class MojoCellLabelProvider extends CellLabelProvider implements /* IFontProvider, */ IColorProvider, ILabelProvider {
		//StylerFactory stylerFactory;
		AdapterFactoryLabelProvider labelProvider;
		public MojoCellLabelProvider(AdapterFactoryLabelProvider labelProvider) {
			this.labelProvider = labelProvider;
			//stylerFactory = new StylerFactory();
		}
		@Override
		public Color getForeground(Object element) {
			if (element instanceof EZMojoNode) {
				if (((EZMojoNode)element).isToggle()) {
					return ColorConstants.orange;
				}
				long cTime = System.currentTimeMillis();
				long lastSeen = cTime - ((EZMojoNode)element).getLastBang();
				for (int idx = 0; idx <temporalThresholds.length; idx++) {
					if (lastSeen < temporalThresholds[idx]) {
						RGB rgb = temporalBlur[idx];
						return getColor(rgb.red, rgb.green, rgb.blue);
					}
				}
				RGB rgb = temporalBlur[temporalThresholds.length-1];
				return getColor(rgb.red, rgb.green, rgb.blue);
			} else if (element instanceof EZMojoTarget) {
				return getColor(targetOnColor.red, targetOnColor.green, targetOnColor.blue);
			} else if (element instanceof EZVar) {
				return getColor(ezVarOnColor.red, ezVarOnColor.green, ezVarOnColor.blue);
			}
			RGB rgb = temporalBlur[0];
			return getColor(rgb.red, rgb.green, rgb.blue);
		}
		@Override
		public Color getBackground(Object element) {
			return ColorConstants.white;
		}
		@Override
		public void update(ViewerCell cell) {
			Object obj = cell.getElement();
			cell.setImage(labelProvider.getImage(obj));
			cell.setText(labelProvider.getText(obj));
			if (liveNotification) {
				cell.setForeground(getForeground(obj));
			} else {
				cell.setForeground(ColorConstants.black);
			}
		}
		@Override
		public Image getImage(Object element) {
			return labelProvider != null ? labelProvider.getImage(element) : null;
		}
		@Override
		public String getText(Object element) {
			return labelProvider != null ? labelProvider.getText(element) : null;
		}
		
		/*
		@Override
		public StyledString getStyledText(Object element) {
			FontDescriptor desc = new FontDescriptor() {
				
				@Override
				public void destroyFont(Font previouslyCreatedFont) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public Font createFont(Device device) throws DeviceResourceException {
					// TODO Auto-generated method stub
					return null;
				}
			};
			Styler styler = stylerFactory.createStyler(, foregroundColorName, backgroundColorName)
			return new StyledString(element.toString());
		}
		@Override
		public Font getFont(Object element) {
			if (element instanceof EZMojoNode) {
				EZMojoNode node = (EZMojoNode) element;
				return node.isToggle() ? disabledFont : normalFont;
			}
			return normalFont;
		}
		*/
	}
	
	class EZUIJob extends UIJob {
		EZUIJob() {
			super("EzMojo UI");
			setSystem(true);
		}
		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			setPriority(INTERACTIVE);
			if (ezTree.getControl() != null && !ezTree.getControl().isDisposed() && ezTree.getControl().isVisible()) {
				ezTree.refresh(true);
			}
			schedule(refreshRate);
			return Status.OK_STATUS;
		}
	}

	class EzMojoNodeAction extends Action {
		EZMojoKind kind;
		public EzMojoNodeAction(EZMojoKind kind) {
			this.kind = kind;
		}
		@Override
		public void run() {
//			try {
				//String iAddr = new String(TopologyManager.INSTANCE.getJmDNS().getInterface().getAddress());
				EObject eObj = getSelectedEzMojoObj();
				switch (kind) {
					case KINEMATICS:
						handleKinematicsConfig(kind, eObj);
						break;
					case SET:
						break;
					case UNSET:
						handleUnset(kind, eObj);
						break;
					case PLAY:
						handlePlayPause(kind, eObj);
						break;
					case FORWARD:
						handleForward();
						break;
					case UNLISTEN:
						handleListen(kind, ""/*iAddr*/, eObj);
						break;
					case TOGGLE:
						handleToggle(eObj);
						break;
					case BANG:
						handleBang(eObj);
						break;
					case MNEMONIC:
					case CLOCK:
					case TRIGGER:
					case FUNCTION:
					case MAP:
					case UNMAP:
					case SELECT:
					case UNFORWARD:
					case LISTEN:
						break;
					default:
						break;
				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
		}
		
		@Override
		public void runWithEvent(org.eclipse.swt.widgets.Event event) {
			run();
		}
	}
	
	@SuppressWarnings("unused")
	private IAction playAction, listenAction, unlistenAction, addEzVarAction, removeEzVarAction,
		forwardAction, setAction, selectAction, bangAction, clockAction,
		unmapAction, unsetAction, mapAction, toggleAction, kinematicsConfigAction, scriptAction;
	
	private IAction resetAction, addPipeAction;
	private List<IAction> mappingsActions;

	private void makeActions() {
		liveNotificationAction = new Action("Live Notification", SWT.TOGGLE) {
			public void run() {
				liveNotification = isChecked();
			};
		};
		liveNotificationAction.setChecked(liveNotification);
		liveNotificationAction.setText("Live Notification");
		liveNotificationAction.setToolTipText("Force Live Notification Visual Feedback");
		liveNotificationAction.setImageDescriptor(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/new/red_light.png"));

		loadEzMojoRootAction = new ImportEzMojo() {
			public void run(IAction action) {
				super.run(action);
				if (root != null && ezTree != null && !ezTree.getControl().isDisposed()) {
					ezTree.setInput(root);
				}
			};
			public void run() {
				run(null);
			};
			public void runWithEvent(org.eclipse.swt.widgets.Event event) {
				run(null);
			};
		};
		loadEzMojoRootAction.setText("Load EzMojoRoot");
		loadEzMojoRootAction.setToolTipText("Load EzMojoRoot From File");
		loadEzMojoRootAction.setImageDescriptor(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/new/ezmojo-import.png"));

		saveEzMojoRootAction = new ExportEzMojo() {
			public void run(IAction action) {
				if (ezTree != null && !ezTree.getControl().isDisposed()) {
					Object obj = ezTree.getInput();
					if (obj instanceof EZMojoRoot) {
						root = (EZMojoRoot) obj;
					}
					super.run(action);
				}
			};
			public void run() {
				run(null);
			};
			public void runWithEvent(org.eclipse.swt.widgets.Event event) {
				run(null);
			};
		};
		saveEzMojoRootAction.setText("Save EzMojoRoot");
		saveEzMojoRootAction.setToolTipText("Save EzMojoRoot To File");
		saveEzMojoRootAction.setImageDescriptor(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/new/ezmojo-export.png"));

		doubleClickAction = new Action() {
			public void run() {
				ISelection selection = ezTree.getSelection();
				Object obj = ((IStructuredSelection)selection).getFirstElement();
				if (obj instanceof EZMojoNode) {
					handleEZMojoNodeDoubleClick((EZMojoNode) obj);
				} else if (obj instanceof EZVar) {
					handleEZVarDoubleClick((EZVar) obj);
				} else if (obj instanceof EZMojoTarget) {
					handleEZTargetDoubleClick((EZMojoTarget) obj);
				}
			}
		};
		
		addPipeAction = new Action(
				"create",
				Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/new/plug_plus.png")
			) {
				public void run() {
					new CommPipeConfigWizardDialog(
						new String[]{
							"osc", 
							"midi", 
							"dmx", 
							"firmata", 
							"thingm", 
							"tuio"
						}
					).open();
				};
			};

	}
	
	void handleEZMojoNodeDoubleClick(EZMojoNode node) {
		new PropertyDialogAction(getSite(), ezTree).run();
	}
	
	void handleEZVarDoubleClick(EZVar var) {
		new PropertyDialogAction(getSite(), ezTree).run();
	}
	
	void handleEZTargetDoubleClick(EZMojoTarget var) {
		new PropertyDialogAction(getSite(), ezTree).run();
	}
	
	private EObject getSelectedEzMojoObj() {
		Object obj = ezTree.getSelection();
		Object sel = ((TreeSelection)obj).getFirstElement();
		if (sel instanceof EZMojoRoot
			|| sel instanceof EZMojoNode
			|| sel instanceof EZVar) {
			return (EObject) sel;
		}
		return null;
	}
	
	private void hookDoubleClickAction() {
		ezTree.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});
	}
	
	private void hookPropertyListener() {
		getSite().setSelectionProvider(ezTree);
	}

	private TRANSPORT_PROTOCOL[] getValidTransports() {
		return new TRANSPORT_PROTOCOL[] { 
			TRANSPORT_PROTOCOL.TCP, 
			TRANSPORT_PROTOCOL.UDP, 
			TRANSPORT_PROTOCOL.USB 
		};
	}
	
	private void handleForward() {
		EObject eObj = getSelectedEzMojoObj();
		CommPipeSelectionDialog dlg = new CommPipeSelectionDialog(getValidTransports(), new String[] {"osc", "midi", "dmx", "firmata", "thingm"});
		if (dlg.open() == Window.OK) {
			if (eObj instanceof EZMojoNode) {
				Object[] results = dlg.getResult();
				if (results != null) {
					for (Object obj : results) {
						if (obj instanceof CmdPipe) {
							EzMojoCmdUtils.INSTANCE.addMojoForward((EZMojoNode) eObj, (CmdPipe) obj);
						}
					}
				} else {
					CommPipeConfigWizardDialog pipeConfigWizardDialog = new CommPipeConfigWizardDialog(getValidTransports(), new String[] {"osc", "midi", "dmx", "firmata", "thingm"});
					int status = pipeConfigWizardDialog.open();
					if (status == Window.OK) {
						CmdPipe pipe = pipeConfigWizardDialog.getSelection();
						if (pipe != null) {
							EzMojoCmdUtils.INSTANCE.addMojoForward((EZMojoNode) eObj, pipe);					
						}
					}
				}
			}
		}
	}
	
	private void handleListen(EZMojoKind kind, String iAddr, EObject eObj) {
		if (eObj instanceof EZMojoNode) {
			String cmd = kind.getLiteral() + ((EZMojoNode)eObj).getAddr();
			ezMojoPipe.send(
				EzMojoCmdUtils.INSTANCE.creatMojoCmdFromString(cmd)
			);
		}
	}
	
	private void handleUnset(EZMojoKind kind, EObject eObj) {
		if (eObj instanceof EZMojoNode) {
			String cmd = kind.getLiteral() + ((EZMojoNode)eObj).getAddr();
			ezMojoPipe.send(
				EzMojoCmdUtils.INSTANCE.creatMojoCmdFromString(cmd)
			);
		}
	}
	
	private void handleToggle(EObject eObj) {
		if (eObj instanceof EZMojoNode) {
			EZMojoNode node = (EZMojoNode)eObj;
			node.setToggle(!node.isToggle());
		}
	}
	
	private void handleBang(EObject eObj) {
		if (eObj instanceof EZMojoNode) {
			EZMojoNode node = (EZMojoNode)eObj;
			OSCMessage msg = EzMojoCmdUtils.INSTANCE.getOscMessageFromEzMojoNode(node);
			QuanticMojo.INSTANCE.acceptLocalAgentCmd(
				(OscCmd) OscCmdUtils.INSTANCE.createOscCmd(msg)
			);
		}
	}
	
	private void handlePlayPause(EZMojoKind kind, EObject eObj) {
		if (eObj instanceof EObject) {
			if (eObj instanceof EZMojoNode) {
				String cmd = kind.getLiteral() + ((EZMojoNode)eObj).getAddr();
				ezMojoPipe.send(
					EzMojoCmdUtils.INSTANCE.creatMojoCmdFromString(cmd)
				);
			}
		}
	}
	
	private void handleKinematicsConfig(EZMojoKind kind, EObject eObj) {
		if (eObj instanceof EObject) {
			if (eObj instanceof EZMojoNode) {
				KinematicsSelectionDialog kinematicsSelectionDialog = new KinematicsSelectionDialog(
					Display.getDefault().getActiveShell(), 
					"Kinematics Motion Selection", 
					"Select kinematic motions that will dynamically animate your EzMojo based sub domain"
				);
				int status = kinematicsSelectionDialog.open();
				if (status == Window.OK) {
					for (String complexKineticExpr : EzMojoExprUtils.INSTANCE.computeComplexKinematicExprFromMotionSelection(kinematicsSelectionDialog.getResult())) {
						String cmd = kind.getLiteral() + ((EZMojoNode)eObj).getAddr();
						cmd += " " + complexKineticExpr;
						ezMojoPipe.send(
							EzMojoCmdUtils.INSTANCE.creatMojoCmdFromString(cmd)
						);
					}
				}
			}
		}
	}
	
	private void createEzActions() {
		resetAction = new Action() {
			public void run() {
		           String[] buttons = new String[] { 
		        	   IDialogConstants.YES_LABEL,
		               IDialogConstants.NO_LABEL, 
		               IDialogConstants.CANCEL_LABEL
		            };
					MessageDialog d = new MessageDialog(
						Display.getDefault().getActiveShell(),
		                IDEWorkbenchMessages.Question,
		                null, 
		                "Do you really want to reset the mojo configuration ?", 
		                MessageDialog.QUESTION, 
		                buttons, 
		                0
		            );
		            switch (d.open()) {
		            case 0: // Yes
						ezMojoPipe.send(
							EzMojoAgentCmdUtils.INSTANCE.createEzRESET("reset")
						);
		                break;
		            case 1: // No
		                return;
		            case 2: // Cancel
		            default:
		                return;
		            }

			};
		};
		
		
		resetAction.setText("Reset");
		resetAction.setToolTipText("Reset Mojo Agent");
		resetAction.setImageDescriptor(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/new/flag_white.png"));
		
		playAction = new EzMojoNodeAction(EZMojoKind.PLAY);
		playAction.setText("Play/Stop");
		playAction.setToolTipText("Play/Stop selected kinematics");
		playAction.setImageDescriptor(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/ezcmd/EZTUIOVarPause.png"));
		
		listenAction = new EzMojoNodeAction(EZMojoKind.LISTEN);
		listenAction.setText("Listen");
		listenAction.setToolTipText("Listen To OSC Sub-Domain");
		listenAction.setImageDescriptor(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/ezcmd/listen.png"));
		
		unlistenAction = new EzMojoNodeAction(EZMojoKind.UNLISTEN);
		unlistenAction.setText("Unlisten");
		unlistenAction.setToolTipText("Unlisten To OSC Sub-Domain");
		unlistenAction.setImageDescriptor(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/ezcmd/unlisten.png"));
		
		forwardAction = new EzMojoNodeAction(EZMojoKind.FORWARD) {
			public void run() {
				handleForward();
			};
		};
		forwardAction.setText("Forward");
		forwardAction.setToolTipText("Forward OSC Sub-Domain Modifications");
		forwardAction.setImageDescriptor(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/ezcmd/forward.png"));
		
		/*
		unforwardAction = new EzMojoNodeAction(EZMojoKind.UNFORWARD) {
			@Override
			public void run() {
				handleUnforward();
			}
		};
		unforwardAction.setText("Unforward");
		unforwardAction.setToolTipText("Forward OSC Sub-Domain Modifications");
		unforwardAction.setImageDescriptor(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/ezcmd/unforward.png"));
		*/
		
		setAction = new EzMojoNodeAction(EZMojoKind.SET);
		setAction.setText("Set Values");
		setAction.setToolTipText("Set Values");
		setAction.setImageDescriptor(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/ezcmd/set.png"));
		
		unsetAction = new EzMojoNodeAction(EZMojoKind.UNSET);
		unsetAction.setText("Unset Values");
		unsetAction.setToolTipText("Unset Values");
		unsetAction.setImageDescriptor(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/ezcmd/unset.png"));

		selectAction = new EzMojoNodeAction(EZMojoKind.SELECT);
		selectAction.setText("Select As Root");
		selectAction.setToolTipText("Select as root so that all command start from this subdomain for address resolution");
		selectAction.setImageDescriptor(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/ezcmd/select.png"));
		
		kinematicsConfigAction = new EzMojoNodeAction(EZMojoKind.KINEMATICS);
		kinematicsConfigAction.setText("Kinematics Config");
		kinematicsConfigAction.setToolTipText("Set Dynamic Kinematics Configuration");
		kinematicsConfigAction.setImageDescriptor(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/ezcmd/kinematics.png"));

		clockAction = new EzMojoNodeAction(EZMojoKind.CLOCK);
		clockAction.setText("Clock");
		clockAction.setToolTipText("Clock pulse for bang trigger");
		clockAction.setImageDescriptor(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/ezcmd/clock.png"));

		mapAction =  new EzMojoNodeAction(EZMojoKind.MAP);
		mapAction.setText("Map To Other Protocol");
		mapAction.setToolTipText("Map To Other Protocol");
		mapAction.setImageDescriptor(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/ezcmd/map.png"));
		
		unmapAction = new EzMojoNodeAction(EZMojoKind.UNMAP);
		unmapAction.setText("Unmap To Other Protocol");
		unmapAction.setToolTipText("Unmap To Other Protocol");
		unmapAction.setImageDescriptor(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/ezcmd/map.png"));
		
		toggleAction = new EzMojoNodeAction(EZMojoKind.TOGGLE);
		toggleAction.setText("Toggle Sub-Domain");
		toggleAction.setToolTipText("Toggle Sub-Domain");
		toggleAction.setImageDescriptor(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/ezcmd/toggle.png"));
		
		addEzVarAction = new EzMojoNodeAction(EZMojoKind.TOGGLE);
		addEzVarAction.setText("Add Var (override)");
		addEzVarAction.setToolTipText("Toggle Sub-Domain");
		addEzVarAction.setImageDescriptor(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/ezcmd/addEZVar.png"));
		
		removeEzVarAction = new EzMojoNodeAction(EZMojoKind.TOGGLE);
		removeEzVarAction.setText("Hide/Remove Var (override)");
		removeEzVarAction.setToolTipText("Hide/Remove Var (override). Corresponds to remove an ovverriden var or to hide a tracked one.");
		removeEzVarAction.setImageDescriptor(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/ezcmd/removeEZVar.png"));

		bangAction = new EzMojoNodeAction(EZMojoKind.BANG);
		bangAction.setText("Bang");
		bangAction.setToolTipText("A bang force registred triggering/notificatoin");
		bangAction.setImageDescriptor(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/ezcmd/bang.png"));
		/*
		scriptAction = new Action() {
			@Override
			public void run() {
				super.run();
			}
		};
		scriptAction.setText("Script...");
		scriptAction.setImageDescriptor(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/ezcmd/bang.png"));
		scriptAction.setToolTipText("Scripting for trigger/notification");
		*/
		mappingsActions = new ArrayList<IAction>();
		
		Map<String, IMapEngine> mapEngines = EzMojoMappingManager.INSTANCE.mappingsRegistrations();
		for (IMapEngine engine : mapEngines.values()) {
			IAction action = new MappingAction(engine);
			action.setText("" + engine.getName());
			mappingsActions.add(action);
		}
	}
	
	class MappingAction extends Action {
		@SuppressWarnings("unused")
		private IMapEngine engine;
		public MappingAction(IMapEngine engine) {
			this.engine = engine;
		}
		@Override
		public void run() {
			super.run();
		}
		@Override
		public void runWithEvent(org.eclipse.swt.widgets.Event event) {
			super.runWithEvent(event);
		}
	}
	
	class MappingMenu extends ContributionItem {
	    @SuppressWarnings("unused")
		private IActionBarConfigurer actionBars;

	    private boolean dirty = true;
	    private IMenuListener menuListener;

	    public MappingMenu() {
		    menuListener = new IMenuListener() {
		        public void menuAboutToShow(IMenuManager manager) {
		            manager.markDirty();
		            dirty = true;
		        }
		    };
	    }
	    /* (non-Javadoc)
	     * @see org.eclipse.jface.action.IContributionItem#fill(org.eclipse.swt.widgets.Menu, int)
	     */
	    public void fill(Menu menu, int index) {
	        if (getParent() instanceof MenuManager) {
	        	((MenuManager) getParent()).removeMenuListener(menuListener);
	        	((MenuManager) getParent()).addMenuListener(menuListener);
	        }
	        if (!dirty) {
				return;
			}
	        fillMenu(menu);
	        dirty = false;
	    }

	    /**
	     * Fills the menu with Show View actions.
	     * @param menu The menu being filled.
	     */
	    private void fillMenu(Menu menu) {
	        //add build actions for the most recently used working sets
	        for (IAction mappingAction : mappingsActions) {
	        	mappingAction.setEnabled(true);
	            new ActionContributionItem(mappingAction).fill(menu, -1);
	        }
	    }
	
	    public boolean isDirty() {
	        return dirty;
	    }

	    /**
	     * Overridden to always return true and force dynamic menu building.
	     */
	    public boolean isDynamic() {
	        return true;
	    }
	}
	
	private EzMojoContentProvider ezProvider;

		private TreeViewer createEzTree(FilteredTree filterdTree) {
			ezTree = filterdTree.getViewer();
			ezProvider = new EzMojoContentProvider();
			final AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(
					new EzMojoCompseableAdapterFactory()
				) {
					public String getText(Object object) {
						if (object instanceof EZMojoRoot) {
							String txt = "";
							for (CmdPipe pipe : ((EZMojoRoot)object).getEngines()) {
								if (pipe != null) {
									txt += "[" + pipe.getId() + "]";
								}
							}
							return txt;
						} else if (object instanceof EZMojoNode) {
							return ((EZMojoNode)object).getToken();
						}  else if (object instanceof EZMojoTarget) {
							return ((EZMojoTarget)object).toString();
						} else if (object instanceof EZTUIOVar) {
							EZTUIOVar tuioVar = (EZTUIOVar) object;
							String lbl = "";
				           // Motion motion = tuioVar.getMotion();
				            //lbl += "[" + motion.getCinematic().getLiteral() + " amp " + motion.getAmplitude() + ", freq " + motion.getFrequency() + "]"; //$NON-NLS-1$
							return "motion : " + lbl;
						} else if (object instanceof EZVar) {
							return ""+EzMojoExprUtils.INSTANCE.getTextualValue(((EZVar)object).getValue());
						}
						return super.getText(object);
					};
					public org.eclipse.swt.graphics.Image getImage(Object object) {
						if (object instanceof EZMojoRoot) {
							return ExtendedImageRegistry.INSTANCE.getImage(
								EzmojoEditPlugin.INSTANCE.getImage("full/obj16/EZMojo.png")
							);
						} else if (object instanceof EZMojoNode) {
							return ExtendedImageRegistry.INSTANCE.getImage(
								EzmojoEditPlugin.INSTANCE.getImage("full/obj16/EZMojoNode.png")
							);
						} else if (object instanceof EZTUIOVar) {
							/*
							if (((EZTUIOVar)object).getMotion()==null) {
								return ExtendedImageRegistry.INSTANCE.getImage(
									EzmojoEditPlugin.INSTANCE.getImage("full/obj16/EZTUIOVar.png")
								);						
							}*/
							return ((EZMojoNode)((EZVar)object).eContainer()).isToggle() ? ExtendedImageRegistry.INSTANCE.getImage(
									EzmojoEditPlugin.INSTANCE.getImage("full/obj16/EZTUIOVarPause.png")
								) : ExtendedImageRegistry.INSTANCE.getImage(
									EzmojoEditPlugin.INSTANCE.getImage("full/obj16/EZTUIOVarOn.png")
							);
						} else if (object instanceof EZVar) {
							EZVar v = (EZVar) object;
							if (v.getValue() instanceof Boolean) {
								return Activator.imageDescriptorFromPlugin("net.sf.smbt.osc.ezmojo.edit", ("icons/EZVarBoolean.png")).createImage();
							} else if (v.getValue() instanceof Integer) {
								return Activator.imageDescriptorFromPlugin("net.sf.smbt.osc.ezmojo.edit", ("icons/EZVarInteger.png")).createImage();
							} else if (v.getValue() instanceof Float) {
								return Activator.imageDescriptorFromPlugin("net.sf.smbt.osc.ezmojo.edit", ("icons/EZVarFloat.png")).createImage();
							} else if (v.getValue() instanceof String) {
								return Activator.imageDescriptorFromPlugin("net.sf.smbt.osc.ezmojo.edit", ("icons/EZVarString.png")).createImage();
							} else if (v.getValue() instanceof Byte) {
								return Activator.imageDescriptorFromPlugin("net.sf.smbt.osc.ezmojo.edit", ("icons/EZVarByte.png")).createImage();
							} 
							return ExtendedImageRegistry.INSTANCE.getImage(
									EzmojoEditPlugin.INSTANCE.getImage("full/obj16/EZVar.png")
								);
							} else if (object instanceof EZMojoTarget) {
								try {
								if (((EZMojoTarget)object).getKind().equals(EZMojoKind.FORWARD) ) {
									return ExtendedImageRegistry.INSTANCE.getImage(
										Activator.getDefault().getImage("ezcmd/forward.png")
									);
								} else if (((EZMojoTarget)object).getKind().equals(EZMojoKind.UNFORWARD) ) {
									return ExtendedImageRegistry.INSTANCE.getImage(
										Activator.getDefault().getImage("ezcmd/unforward.png")
									);
								}
								} catch (IOException ioe) {
									ioe.printStackTrace();
								}
							}
						return super.getImage(object);
					};
				};
				

			ezTree.setContentProvider(ezProvider);
			ezTree.setLabelProvider(new MojoCellLabelProvider(labelProvider));
			ezTree.setInput(getSite());
			ezTree.getControl().setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());

			//
			// Drag and drop support
			//
			/*
			Transfer[] dndTransferTypes = new Transfer[] { EZTargetTransfert.INSTANCE, CmdPipeTransfert.INSTANCE };
			
			ezTree.addDragSupport(
				DND.DROP_MOVE, 
				dndTransferTypes, 
				new EZTargetDragAdapter(ezTree)
			);
			ezTree.addDropSupport(
				DND.DROP_MOVE, 
				dndTransferTypes, 
				new CmdPipeDropAdapter(ezTree)
			);
			*/
			ezTree.getControl().addKeyListener(
				new KeyListener() {
					@Override
					public void keyReleased(KeyEvent e) {}
					@Override
					public void keyPressed(KeyEvent e) {
						if (e.character == 't'|| e.character == SWT.SPACE) {
							e.doit = false;
							toggleAction.run();
						} else if (e.character == 'f') {
							e.doit = false;
							forwardAction.run();
						} else if (e.character == 'b') {
							e.doit = false;
							bangAction.run();
						} else if (e.character == 'p' || e.character == SWT.CR) {
							e.doit = false;
							doubleClickAction.run();
						}else if (e.character == 'd' || e.character == SWT.DEL) {
							e.doit = false;
							unsetAction.run();
						}
					}
				}
			);
			
			return ezTree;
		}

		private FilteredTree filterdTree = null;
		
		private boolean matchPattern(EZMojoNode node) {
			String text = null;
			if (node instanceof EZMojoNode) {
				text = node.getAddr();
			}
			return text != null ? text.contains(filterdTree.getFilterControl().getText()) : false;

		}
		
		private void hookContextMenu() {
			MenuManager menuMgr = new MenuManager("#PopupMenu");
			menuMgr.setRemoveAllWhenShown(true);
			menuMgr.addMenuListener(new IMenuListener() {
				public void menuAboutToShow(IMenuManager manager) {
					fillContextMenu(manager);
				}
			});
			Menu menu = menuMgr.createContextMenu(ezTree.getControl());
			ezTree.getControl().setMenu(menu);
			getSite().registerContextMenu("#PopupMenu", menuMgr, ezTree);
		}
		
		private void fillContextMenu(IMenuManager manager) {
			ISelection sel = ezTree.getSelection();
			if (sel instanceof IStructuredSelection) {
				Object o = ((IStructuredSelection)sel).getFirstElement();
				if (o instanceof EObject) {
					if (o instanceof EZMojoRoot) {
						addContributedActions(manager);

					} else if (o instanceof EZMojoNode) {
						//manager.add(playAction);
						manager.add(bangAction);
						//manager.add(listenAction);
						//manager.add(unlistenAction);
						manager.add(forwardAction);
						//manager.add(unforwardAction);
						//manager.add(setAction);
						manager.add(unsetAction);
						//manager.add(mapAction);
						//manager.add(unmapAction);
						manager.add(toggleAction);
						//manager.add(selectAction);
						//manager.add(clockAction);
						manager.add(kinematicsConfigAction);
						//manager.add(removeEzVarAction);
						//manager.add(addEzVarAction);
						//manager.add(new Separator());
						//manager.add(new MappingMenu());
						
						addContributedActions(manager);
						
					} else if (o instanceof EZVar) {
	/*					manager.add(playAction);
						manager.add(bangAction);
						manager.add(listenAction);
						manager.add(unlistenAction);
						manager.add(forwardAction);
						manager.add(unforwardAction);
						manager.add(setAction);
						manager.add(unsetAction);
						manager.add(mapAction);
						manager.add(unmapAction);
						manager.add(toggleAction);
						manager.add(selectAction);
						manager.add(clockAction);
						manager.add(kinematicsConfigAction);
						manager.add(removeEzVarAction);
						manager.add(addEzVarAction);
						manager.add(new Separator());
						manager.add(new MappingMenu());
						*/
					}
					
					// manager.add(editArduinoConfigurationAction);
					// drillDownAdapter.addNavigationActions(manager);
					// Other plug-ins can contribute there actions here
					manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));

				}
			}
		}

		private void addContributedActions(IMenuManager manager) {
			
			System.out.println("Read contributed actions and fill menu");
			
			Map<String, Action> actionMap = EZViewActionManager.INSTANCE.getContributedActions();
			for (String k : actionMap.keySet()) {
				Action a = actionMap.get(k);
				if (a instanceof Action) {
					Action action = (Action) a;
					if (action instanceof IWorkbenchWindowActionDelegate) {
						IWorkbenchWindowActionDelegate wwaActionDelegate = (IWorkbenchWindowActionDelegate) action;
						
						ISelection s = ezTree.getSelection();
						
						System.out.println("Check selection");

						if (s instanceof StructuredSelection) {
							StructuredSelection ssel = (StructuredSelection) s;
							if (ssel.getFirstElement() instanceof EZMojoNode) {
								EZMojoNode node = (EZMojoNode) ssel.getFirstElement();
								System.out.println("  update action w/ " + node.getAddr());
								
								System.out.println("Action : " + wwaActionDelegate.getClass().getCanonicalName());
								
								wwaActionDelegate.selectionChanged(action, s);
							}
						}
						manager.add(action);
					}
				}
			}
		}

		@Override
		public void createPartControl(Composite parent) {
			filterdTree = GUIToolkit.INSTANCE.createFilteredTree(
			    parent, 
				SWT.SINGLE | SWT.MULTI | SWT.FULL_SELECTION,
				new PatternFilter() {
					protected boolean isLeafMatch(Viewer viewer, Object element) {
						if (element instanceof EZMojoTarget) {
							if (((EZMojoTarget)element).eContainer() instanceof EZMojoNode) {
								return matchPattern((EZMojoNode)((EZMojoTarget)element).eContainer());
							}
						} else if (element instanceof EZVar) {
							if (((EZVar)element).eContainer() instanceof EZMojoNode) {
								return matchPattern((EZMojoNode)((EZVar)element).eContainer());
							}
						} else if (element instanceof EZMojoNode) {
							return matchPattern((EZMojoNode) element);
						} 
						return false;
					}
				},
				true
			);

			
			ezTree = createEzTree(filterdTree);
			
			final IPreferenceStore store = Activator.getDefault().getPreferenceStore();
			ezTree.getControl().addDisposeListener(new DisposeListener() {
				@Override
				public void widgetDisposed(DisposeEvent e) {
					boolean save = false;
					EZMojoRoot root = EzMojoResourceUtils.INSTANCE.createEmptyEZMojoRoot();
					if (ezProvider.getInput() != null && ezProvider.getInput().length > 0) {
						root = (EZMojoRoot)ezProvider.getInput()[0];
						save = store.getBoolean(UbiConsolePreferenceConstants.P_CONSOLE_SAVEPOINT_ENABLED_BOOLEAN);
						if (save) {
							root.getEngines().clear();
							root.getEngines().addAll(QuanticMojo.INSTANCE.getPipes());
							EzMojoResourceUtils.INSTANCE.dumpConsoleEzTree(root);
							//storeConsolePageSettings();
						} else {
							EzMojoResourceUtils.INSTANCE.storeEmptyConsoleEzTree();
						}
	//					QuanticMojo.INSTANCE.terminate();
					}
				}
			});
			
			
			
			hookContextMenu();

			//createColumns(ezTree.getTree().getColumns());
			
			
			
			
			uiJob = new EZUIJob();
			uiJob.schedule();
			
			/*
			
			selectionListener = new ISelectionListener() {
	            public void selectionChanged(IWorkbenchPart part, ISelection selection) {
	                SmbtConsolePage.this.selectionChanged(selection);
	            }};
			selectionService = getSite().getWorkbenchWindow().getSelectionService();
			selectionService.addPostSelectionListener(selectionListener);
			
			// get current selection
			selectionChanged(selectionService.getSelection());
			
			*/

			
			
			

			createEzActions();
			makeActions();
			
			hookDoubleClickAction();
			hookPropertyListener();

			contributeToActionBars();
			
			EZMojoRoot root = EzMojoResourceUtils.INSTANCE.createEmptyEZMojoRoot();
			
			try {
				EZMojoRoot r = EzMojoResourceUtils.INSTANCE.loadEzMojoFromPrefs();
				if (r != null) {
					root = r;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			ezTree.setInput(root);
			
		}

		@Override
		public void setFocus() {
			ezTree.getControl().setFocus();
		}
}
