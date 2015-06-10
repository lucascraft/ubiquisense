/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2008 - 2015, Lucas Bigeardel
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

package net.sf.smbt.ui.hmi;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import net.sf.smbt.dmx.model.ezdmx.OpenDMXCmd;
import net.sf.smbt.mappings.dmx.Dmx2OscMapping;
import net.sf.smbt.mappings.midi.Midi2OscMapping;
import net.sf.smbt.midi.ezmidi.DSLMidiMessage;
import net.sf.smbt.osccmd.OscCmd;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.smbt.ui.Activator;
import net.sf.smbt.ui.console.dnd.CmdPipeDragAdapter;
import net.sf.smbt.ui.console.dnd.CmdPipeTransfert;
import net.sf.smbt.ui.console.dnd.EZTargetDropAdapter;
import net.sf.smbt.ui.console.dnd.EZTargetTransfert;
import net.sf.smbt.ui.wizards.CommPipeConfigWizardDialog;
import net.sf.xqz.model.engine.AbstractQxEventHandler;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.EngineApplication;
import net.sf.xqz.model.engine.Event;
import net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DragSourceListener;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.progress.UIJob;


public class TopologyGraphWidget extends Composite {
	//private GraphViewer graphViewer;
	private TreeViewer pipeTreeViewer, dnsSdTreeViewer;
	private FilteredTree filteredPipeTree, filteredDnsSdTree;
	private boolean mustRelayout;
	private static Image pipeImage, pipePlayImage, pipeStopImage, startDumpImage, stopDumpImage;
	private Action startDumpAction, stopDumpAction, deletePipeAction, doubleClickAction, deactivatePipeAction, activatePipeAction, addPipeAction;
	
	public final static String VOID_UTF8_STRING = new String("".getBytes(Charset.availableCharsets().get("UTF-8")), Charset.availableCharsets().get("UTF-8"));

	private static String PLAY_PIPE = new String("".getBytes(Charset.availableCharsets().get("UTF-8")), Charset.availableCharsets().get("UTF-8"));
	private static String STOP_PIPE = new String("".getBytes(Charset.availableCharsets().get("UTF-8")), Charset.availableCharsets().get("UTF-8"));

	public Action getDeactivatePipeAction() {
		return deactivatePipeAction;
	}
	
	
	public Action getStartDumpPipeAction() {
		return startDumpAction;
	}
	public Action getStopDumpPipeAction() {
		return stopDumpAction;
	}
	public Action getDeletePipeAction() {
		return deletePipeAction;
	}
	public Action getActivatePipeAction() {
		return activatePipeAction;
	}
	public Action getAddPipeAction() {
		return addPipeAction;
	}
	static Object topology = new Object();

	public TreeViewer getPipeTreeViewer() {
		return pipeTreeViewer;
	}
	
	private AbstractQxEventHandler midiDumpHandler;
	private AbstractQxEventHandler dmxDumpHandler;
	private AbstractQxEventHandler oscDumpHandler;

	public TopologyGraphWidget(Composite parent, int style) {
		super(parent, style);
		setLayout(new FillLayout());
		createContent(this);
		
		midiDumpHandler = new AbstractQxEventHandlerImpl() {
			public synchronized void handleQxEvent(Event event) {
				if (event.getCmd() instanceof DSLMidiMessage) {
					OscCmd cmd = Midi2OscMapping.INSTANCE.midi2osc((DSLMidiMessage)event.getCmd());
					QuanticMojo.INSTANCE.acceptLocalAgentCmd(cmd);
				}
			}
		};
		dmxDumpHandler = new AbstractQxEventHandlerImpl() {
			public synchronized void handleQxEvent(Event event) {
				if (event.getCmd() instanceof DSLMidiMessage) {
					OscCmd cmd = Dmx2OscMapping.INSTANCE.dmx2osc((OpenDMXCmd)event.getCmd());
					QuanticMojo.INSTANCE.acceptLocalAgentCmd(cmd);
				}
			}
		};
		oscDumpHandler = new AbstractQxEventHandlerImpl() {
			@Override
			public synchronized void handleQxEvent(Event event) {
				if (event.getCmd() instanceof OscCmd) {
					QuanticMojo.INSTANCE.acceptLocalAgentCmd((OscCmd)event.getCmd());
				}
			}
		};
			
		pipeImage = Activator.imageDescriptorFromPlugin("net.sf.xqz.engine.edit", "/icons/full/obj16/CmdPipe.gif").createImage();
		pipePlayImage = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/new/plug-play.png").createImage();
		pipeStopImage = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/new/plug_stop.png").createImage();
		startDumpImage = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/apps/utilities-system-monitor.png").createImage();
		stopDumpImage = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/new/flag_white.png").createImage();
		
		mustRelayout = false;
		/*
		graphViewer.getControl().addControlListener(new ControlListener() {
			public void controlMoved(ControlEvent e) {
				mustRelayout = true;
			}
			public void controlResized(ControlEvent e) {
				mustRelayout = true;
			}
		});
		*/
		UIJob j = new UbiJob(UUID.randomUUID().toString()) {
			int lastNodesNb = 0;
			@Override
			public IStatus runInUIThread(IProgressMonitor monitor) {
				//graphViewer.refresh();
				int nbPipes = QuanticMojo.INSTANCE.getPipes().size();
				if (lastNodesNb != nbPipes) {
					lastNodesNb = nbPipes;
					//graphViewer.applyLayout();
				}
				if (mustRelayout) {
					//graphViewer.applyLayout();
					mustRelayout = false;
				}
				if (!pipeTreeViewer.getControl().isDisposed()) {
					pipeTreeViewer.refresh(true);
				}
				if (!dnsSdTreeViewer.getControl().isDisposed()) {
					dnsSdTreeViewer.refresh(true);
				}
				schedule(1000);
				return Status.OK_STATUS;
			}
		};
		j.setSystem(true);
		j.schedule(500);
		
		hookContextMenu();
		hookDoubleClickAction();
	}
	
	private void hookDoubleClickAction() {
		pipeTreeViewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});
	}
	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(pipeTreeViewer.getControl());
		pipeTreeViewer.getControl().setMenu(menu);
		pipeTreeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				ISelection sel = event.getSelection();
				if (sel instanceof IStructuredSelection) {
					boolean allActivated	= true;
					boolean allDeactivated	= true;
					boolean ok = true;
					for (Object o : ((IStructuredSelection)sel).toArray()) {
						if (!(o instanceof CmdPipe)) {
							ok = false;
						} else if (((CmdPipe)o).isActivated()){
							allDeactivated = false;
						} else if (!((CmdPipe)o).isActivated()){
							allActivated = false;
						}
					}
					deletePipeAction.setEnabled(ok);
					deactivatePipeAction.setEnabled(allActivated);
					activatePipeAction.setEnabled(allDeactivated);
					addPipeAction.setEnabled(true);
				}
			}
		});
		pipeTreeViewer.setSelection(new StructuredSelection());
	}
	
	private void fillContextMenu(IMenuManager manager) {
		ISelection sel = pipeTreeViewer.getSelection();
		if (sel instanceof IStructuredSelection) {
			boolean allActivated	= true;
			boolean allDeactivated	= true;
			boolean ok = true;
			for (Object o : ((IStructuredSelection)sel).toArray()) {
				if (!(o instanceof CmdPipe)) {
					ok = false;
				} else if (((CmdPipe)o).isActivated()){
					allDeactivated = false;
				} else if (!((CmdPipe)o).isActivated()){
					allActivated = false;
				}
			}
			deletePipeAction.setEnabled(ok);
			deactivatePipeAction.setEnabled(allActivated);
			activatePipeAction.setEnabled(allDeactivated);
			addPipeAction.setEnabled(true);
			if (ok) {
				manager.add(deletePipeAction);
				if (allActivated) {
					manager.add(deactivatePipeAction);
				}
				if (allDeactivated) {
					manager.add(activatePipeAction);
				}
			} else {
				deletePipeAction.setEnabled(false);
			}
			manager.add(addPipeAction);
			manager.add(startDumpAction);
			manager.add(stopDumpAction);

			// drillDownAdapter.addNavigationActions(manager);
			// Other plug-ins can contribute there actions here
			manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
		}
	}
	
	/*
	static class MyContentProvider implements IGraphContentProvider {
		public Object getSource(Object rel) {
			return rel.equals(topology)?null:rel;
		}
		public Object getDestination(Object rel) {
			return topology;
		}
		public Object[] getElements(Object input) {
			List<Object> nodes = new ArrayList<Object>();
			for (EngineApplication app : QuanticMojo.INSTANCE.getEngineApplications()) {
				for (CmdPipe p : app.getEngine()) {
					if (!p.getPorts().contains(4443) && !p.getPorts().contains(4445)) {
						nodes.add(p);
					}
				}
			}
			nodes.add(topology);
			return nodes.toArray();
		}
		public double getWeight(Object connection) {
			return 0;
		}
		public void dispose() {}
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {}
	}

	static class MyLabelProvider extends LabelProvider {
		public Image getImage(Object element) {
			if (element instanceof CmdPipe) {
				CmdPipe pipe = (CmdPipe) element;
				return pipe.isActivated() ? pipePlayImage : pipeStopImage;
			}
			return pipeImage; //image;
		}
		public String getText(Object element) {
			if (element instanceof CmdPipe) {
				CmdPipe pipe = (CmdPipe) element;
				return (pipe.isActivated() ? PLAY_PIPE : STOP_PIPE) + pipe.getName() ;
			}
			return "";
		}

	}
	*/

	void createContent(Composite container) {
		container.setBackground(GUIToolkit.BG);
		//SashForm sash = new SashForm(container, SWT.VERTICAL | SWT.LEFT_TO_RIGHT);
		
		TabFolder folder = new TabFolder(container, SWT.BOTTOM);
		folder.setBackground(GUIToolkit.BG);
		folder.setForeground(GUIToolkit.FG);
		
		
		
		
		TabItem pipeTabItem = new TabItem(folder, SWT.NONE);
		filteredPipeTree  = new FilteredTree(folder, SWT.FULL_SELECTION | SWT.MULTI, new PatternFilter(), true);
		filteredPipeTree.setLayout(GridLayoutFactory.fillDefaults().create());
		filteredPipeTree.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		filteredPipeTree.setBackground(GUIToolkit.BG);
		filteredPipeTree.setForeground(GUIToolkit.FG);
		pipeTreeViewer = filteredPipeTree.getViewer();
		pipeTreeViewer.getTree().setLayout(GridLayoutFactory.fillDefaults().create());
		pipeTreeViewer.getTree().setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		pipeTreeViewer.getTree().setBackground(GUIToolkit.BG);
		pipeTreeViewer.getTree().setForeground(GUIToolkit.FG);
		pipeTreeViewer.getControl().setBackground(GUIToolkit.BG);
		pipeTreeViewer.getControl().setForeground(GUIToolkit.FG);
		pipeTreeViewer.setContentProvider(new EngineAppContentProvider());
		
		AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(new XQZCompseableAdapterFactory()) {
			@Override
			public Image getImage(Object object) {
				if (object instanceof CmdPipe) {
					if (object instanceof CmdPipe) {
						CmdPipe pipe = (CmdPipe) object;
						return pipe.isActivated() ? pipePlayImage : pipeStopImage;
					}				}
				return super.getImage(object);
			}
			@Override
			public String getText(Object object) {
				if (object instanceof CmdPipe) {
					CmdPipe pipe = (CmdPipe) object;
					return (pipe.isActivated() ? PLAY_PIPE : STOP_PIPE) + pipe.getName() ;
				}				
				return super.getText(object);
			}
		};
		
		
		class PipeLabelProvider extends CellLabelProvider implements IColorProvider, ILabelProvider {
			AdapterFactoryLabelProvider labelProvider;
			public PipeLabelProvider(AdapterFactoryLabelProvider labelProvider) {
				this.labelProvider = labelProvider;
			}
			@Override
			public Color getForeground(Object element) {
				if (element instanceof CmdPipe) {
					CmdPipe pipe = (CmdPipe) element;
					if(!pipe.isActivated()) {
						return ColorConstants.red;
					} else if (pipe.isLocked()) {
						return ColorConstants.orange;
					} 
				}
				return ColorConstants.lightGreen;
			}
			@Override
			public Color getBackground(Object element) {
				return GUIToolkit.BG;
			}
			@Override
			public void update(ViewerCell cell) {
				Object obj = cell.getElement();
				cell.setImage(labelProvider.getImage(obj));
				cell.setText(labelProvider.getText(obj));
				cell.setForeground(getForeground(obj));
				cell.setBackground(getBackground(obj));
			}
			@Override
			public Image getImage(Object element) {
				
				return labelProvider != null ? labelProvider.getImage(element) : null;
			}
			@Override
			public String getText(Object element) {
				return labelProvider != null ? labelProvider.getText(element) : null;
			}
		}
		
		pipeTreeViewer.setLabelProvider(new PipeLabelProvider(labelProvider));
		pipeTreeViewer.setInput("*** VOID ***");
		
		//
		// DND support
		//
		
		Transfer[] dragTransferTypes = new Transfer[] { CmdPipeTransfert.INSTANCE,  EZTargetTransfert.INSTANCE};
		DragSourceListener dragListener = new CmdPipeDragAdapter(pipeTreeViewer);
		pipeTreeViewer.addDragSupport(
			DND.DROP_MOVE | DND.DROP_COPY, 
			dragTransferTypes, 
			dragListener
		);
		
		Transfer[] dropTransferTypes = new Transfer[] { EZTargetTransfert.INSTANCE, CmdPipeTransfert.INSTANCE };

		pipeTreeViewer.addDropSupport(
			DND.DROP_MOVE, 
			dropTransferTypes,
			new EZTargetDropAdapter(pipeTreeViewer)
		);	

		pipeTabItem.setControl(filteredPipeTree);
		pipeTabItem.setText("Pipes");
		
		pipeTabItem.setImage(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/new/plug(2).png").createImage());
		
		/*
		TabItem graphTabItem = new TabItem(folder, SWT.NONE);

		graphViewer = new GraphViewer(folder, SWT.NONE);
		
		graphViewer.setContentProvider(new MyContentProvider());
		graphViewer.setLabelProvider(new MyLabelProvider());
		graphViewer.setLayoutAlgorithm(new SpringLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING));
		graphViewer.setInput(QuanticMojo.INSTANCE.getPipes());
		graphViewer.getControl().setBackground(GUIToolkit.BG);

		graphTabItem.setControl(graphViewer.getControl());
		graphTabItem.setText("Graph");
		graphTabItem.setImage(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/new/topology1.gif").createImage());
		*/
		
		TabItem dnsSdTabItem = new TabItem(folder, SWT.NONE);
		filteredDnsSdTree  = GUIToolkit.INSTANCE.createFilteredTree(folder, SWT.NONE, new PatternFilter(), true);
		filteredDnsSdTree.setLayout(GridLayoutFactory.fillDefaults().create());
		filteredDnsSdTree.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		dnsSdTreeViewer = filteredDnsSdTree.getViewer();
		dnsSdTreeViewer.getTree().setLayout(GridLayoutFactory.fillDefaults().create());
		dnsSdTreeViewer.getTree().setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		dnsSdTreeViewer.getTree().setBackground(GUIToolkit.BG);
		dnsSdTreeViewer.setContentProvider(new DnsSdServicesContentProvider());
		dnsSdTreeViewer.setLabelProvider(new LabelProvider());
		dnsSdTreeViewer.setInput("*** VOID ***");
		dnsSdTabItem.setControl(filteredDnsSdTree);
		dnsSdTabItem.setText("DNS-SD");
		dnsSdTabItem.setImage(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/ubiquisense.png").createImage());

		
//		TabItem topologyTabItem = new TabItem(folder, SWT.NONE);
//		filteredTopologyTree  = GUIToolkit.INSTANCE.createFilteredTree(folder, SWT.NONE, new PatternFilter(), true);
//		filteredTopologyTree.setLayout(GridLayoutFactory.fillDefaults().create());
//		filteredTopologyTree.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
//		topologyTreeViewer = filteredDnsSdTree.getViewer();
//		topologyTreeViewer.getTree().setLayout(GridLayoutFactory.fillDefaults().create());
//		topologyTreeViewer.getTree().setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
//		topologyTreeViewer.setContentProvider(new ServicesTopologyContentProvider());
//		topologyTreeViewer.setLabelProvider(new LabelProvider());
//		topologyTreeViewer.setInput("*** VOID ***");
//		topologyTabItem.setControl(filteredTopologyTree);
//		topologyTabItem.setText("Topology");
		
		
		deletePipeAction = new Action(
				"delete", 
				Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/new/plug_minus.png")
			) {
				public void run() {
					ISelection sel = pipeTreeViewer.getSelection();
					for (Object o : ((IStructuredSelection)sel).toArray()) {
						if (o instanceof CmdPipe) {
							try {
								QuanticMojo.INSTANCE.closePipe((CmdPipe)o, true);
							} catch (Throwable t) {
								t.printStackTrace();
							}
						}
					}
				};
			};

			doubleClickAction = new Action("toggle") {
				public void run() {
					ISelection sel = pipeTreeViewer.getSelection();
					for (Object o : ((IStructuredSelection)sel).toArray()) {
						if (o instanceof CmdPipe) {
							try {
								if(((CmdPipe)o).isActivated()) {
									((CmdPipe)o).deactivateAll();
								} else {
									((CmdPipe)o).activateAll();
								}
							} catch (Throwable t) {
								t.printStackTrace();
							}
						}
					}
				};
			};
		
				
		deactivatePipeAction = new Action(
			"deactivate",
			Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/actions/media-playback-stop-red.png")
		) {
			public void run() {
				ISelection sel = pipeTreeViewer.getSelection();
				for (Object o : ((IStructuredSelection)sel).toArray()) {
					if (o instanceof CmdPipe) {
						((CmdPipe)o).deactivateAll();
					}
				}
			};
		};
		
		activatePipeAction = new Action(
				"activate",
				Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/actions/media-playback-start-green.png")
			) {
				public void run() {
					ISelection sel = pipeTreeViewer.getSelection();
					for (Object o : ((IStructuredSelection)sel).toArray()) {
						if (o instanceof CmdPipe) {
							((CmdPipe)o).activateAll();
						}
					}
				};
			};
			
		startDumpAction = new Action(
				"start dump",
				Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/apps/utilities-system-monitor.png")
			) {
				public void run() {
					ISelection sel = pipeTreeViewer.getSelection();
					for (Object o : ((IStructuredSelection)sel).toArray()) {
						if (o instanceof CmdPipe) {
							CmdPipe pipe = (CmdPipe) o;
							String protocol = pipe.getCommunicationProtocol();
							
							if ("midi".equals(protocol)) {
								pipe.addQxEventHandler(midiDumpHandler);
							} else if ("dmx".equals(protocol)) {
								pipe.addQxEventHandler(dmxDumpHandler);
							}  else if ("osc".equals(protocol)) {
								pipe.addQxEventHandler(oscDumpHandler);
							}
						}
					}
				};
			};
			
		stopDumpAction = new Action(
				"stop dump",
				Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/new/flag_white.png")
			) {
				public void run() {
					ISelection sel = pipeTreeViewer.getSelection();
					for (Object o : ((IStructuredSelection)sel).toArray()) {
						if (o instanceof CmdPipe) {
							CmdPipe pipe = (CmdPipe) o;
							pipe.removeQxEventHandler(midiDumpHandler);
							pipe.removeQxEventHandler(dmxDumpHandler);
							pipe.removeQxEventHandler(oscDumpHandler);
						}
					}
				};
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
						"raw", 
						"dmx", 
						"firmata", 
						"thingm", 
						"tuio"
					}
				).open();
			};
		};
		
		//sash.setWeights(new int[]{1, 1});
	}

}
