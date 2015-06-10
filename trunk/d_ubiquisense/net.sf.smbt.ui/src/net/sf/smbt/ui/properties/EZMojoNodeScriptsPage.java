/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2012, Lucas Bigeardel
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

package net.sf.smbt.ui.properties;

import java.util.UUID;

import net.sf.smbt.ezmojo.EZEvent;
import net.sf.smbt.ezmojo.EZMojoKind;
import net.sf.smbt.ezmojo.EZMojoNode;
import net.sf.smbt.ezmojo.EZMojoTarget;
import net.sf.smbt.ezmojo.EZScript;
import net.sf.smbt.ezmojo.EzmojoFactory;
import net.sf.smbt.osc.ezmojo.utils.EZMojoTargetUtils;
import net.sf.smbt.osccmd.OscCmd;
import net.sf.smbt.ui.Activator;
import net.sf.smbt.ui.dialogs.CommPipeSelectionDialog;
import net.sf.smbt.ui.hmi.GUIToolkit;
import net.sf.smbt.ui.wizards.CommPipeConfigWizardDialog;
import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.dialogs.PropertyPage;

public class EZMojoNodeScriptsPage extends PropertyPage {

	private static final String SCRIPT_TITLE	= "Script :";
	private static final String EVENTS_TITLE	= "Events :";
	@SuppressWarnings("unused")
	private static final String DETAILS_TITLE	= "Details :";
	
	private TreeViewer scriptsListViewer, eventsListViewer;
	
	private Button deleteScriptButton, addScriptButton, deleteEventButton, addEventButton;

	private class TreeArrayContentProvider extends ArrayContentProvider implements ITreeContentProvider {
		public Object[] getChildren(Object parentElement) {
			return new Object[0];
		}
		public Object getParent(Object element) {
			return null;
		}
		public boolean hasChildren(Object element) {
			return false;
		}
	}
	
	private ListViewer targetListViewer, msgListViewer;
	protected Control createDetailsSection(Composite parent) {
		
		Composite container = GUIToolkit.INSTANCE.createComposite(parent);
		container.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).equalWidth(false).create());
		container.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		
		// Label for owner field
		Label ownerLabel = new Label(container, SWT.NONE);
		ownerLabel.setText("Forward Targets : ");

		// Owner text field
		
		targetListViewer = new ListViewer(container, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
	    targetListViewer.getList().setLayoutData(GridDataFactory.fillDefaults().minSize(200, 50).hint(200, 50).grab(true, true).create());
	    targetListViewer.getList().setFont(parent.getFont());
	    
	    // Set the label provider		
	    targetListViewer.setLabelProvider(new LabelProvider() {
	        public String getText(Object element) {
	            // Return the features's label.
	            if (element instanceof EZMojoTarget) {
	            	return ((EZMojoTarget) element).toString(); //$NON-NLS-1$
	            }
	            return "???";
	         }
	        @Override
	        public Image getImage(Object element) {
	            if (element instanceof EZMojoTarget) {
	            	return Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/ezcmd/forward.png").createImage();
	            }
	        	return super.getImage(element);
	        }
	    });

	    // Set the content provider
	    ArrayContentProvider cp = new ArrayContentProvider();
	    targetListViewer.setContentProvider(cp);
	    
	        // Add a selection change listener
	    targetListViewer.addSelectionChangedListener(new ISelectionChangedListener() {
	        public void selectionChanged(SelectionChangedEvent event) {
	                // Update OK button enablement
	            ISelection sel = targetListViewer.getSelection();
	            if (sel instanceof IStructuredSelection) {
	            	//updateTargetDetails((EZMojoTarget)((IStructuredSelection)sel).getFirstElement());
	            }
	        }
	    });

	        // Add double-click listener
	   targetListViewer.addDoubleClickListener(new IDoubleClickListener() {
	        public void doubleClick(DoubleClickEvent event) {
	        	//okPressed();
	        }
	    });
	   targetListViewer.refresh();

	   Composite buttonBar = new Composite(container, SWT.NONE);
	   buttonBar.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
	   buttonBar.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
	   
	   Button addTargetButton = new Button(buttonBar, SWT.PUSH);
	   addTargetButton.setText("+");
	   addTargetButton.addSelectionListener(
			   new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					CommPipeSelectionDialog dlg = new CommPipeSelectionDialog();
					if (dlg.open() == Window.OK) {
						Object[] r = dlg.getResult();
						if (r!=null && r.length>0) {
							CmdPipe pipe = (CmdPipe) r[0];
							EZMojoTarget t = EZMojoTargetUtils.INSTANCE.createEzTarget(pipe, EZMojoKind.FORWARD);
							if (t instanceof EZMojoTarget) {
							    StructuredSelection elem = (StructuredSelection) eventsListViewer.getSelection();
							    if (elem.getFirstElement() instanceof EZEvent) {
							    	EZEvent evt = (EZEvent) elem.getFirstElement();
							    	evt.getTargets().add(t);
									targetListViewer.refresh(true);
								}
							}
						} else {
							CommPipeConfigWizardDialog pipeConfigWizardDialog = new CommPipeConfigWizardDialog();
							int status = pipeConfigWizardDialog.open();
							if (status == Window.OK) {
								CmdPipe pipe = pipeConfigWizardDialog.getSelection();
								EZMojoTarget t = EZMojoTargetUtils.INSTANCE.createEzTarget(pipe, EZMojoKind.FORWARD);
								if (t instanceof EZMojoTarget) {
								    StructuredSelection elem = (StructuredSelection) eventsListViewer.getSelection();
								    if (elem.getFirstElement() instanceof EZEvent) {
								    	EZEvent evt = (EZEvent) elem.getFirstElement();
								    	evt.getTargets().add(t);
										targetListViewer.refresh(true);
									}
								}
							}

						}
					}
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			}
	   );
	   addTargetButton.setLayoutData(GridDataFactory.swtDefaults().align(SWT.BEGINNING, SWT.CENTER).create());

	   
	   Button deleteTargetButton = new Button(buttonBar, SWT.PUSH);
	   deleteTargetButton.setText("-");
	   deleteTargetButton.addSelectionListener(
			   new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
		            ISelection sel = targetListViewer.getSelection();
		            if (sel instanceof IStructuredSelection) {
						EZMojoTarget t = (EZMojoTarget)((IStructuredSelection)sel).getFirstElement();
						if (t instanceof EZMojoTarget) {
							((EZEvent)t.eContainer()).getTargets().remove(t);
							targetListViewer.refresh(true);
						}
					}
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			}
	   );
	   deleteTargetButton.setLayoutData(GridDataFactory.swtDefaults().align(SWT.END, SWT.CENTER).create());
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
		// Label for owner field
		Label msgLabel = new Label(container, SWT.NONE);
		msgLabel.setText("Osc Messages : ");

		// Owner text field
		
		msgListViewer = new ListViewer(container, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		msgListViewer.getList().setLayoutData(GridDataFactory.fillDefaults().minSize(200, 50).hint(200, 50).grab(true, true).create());
		msgListViewer.getList().setFont(parent.getFont());
	    
	    // Set the label provider		
		msgListViewer.setLabelProvider(new LabelProvider() {
	        public String getText(Object element) {
	            // Return the features's label.
	            if (element instanceof EZMojoTarget) {
	            	return ((EZMojoTarget) element).toString(); //$NON-NLS-1$
	            }
	            return "???";
	         }
	        @Override
	        public Image getImage(Object element) {
	            if (element instanceof EZMojoTarget) {
	            	return Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/ezcmd/forward.png").createImage();
	            }
	        	return super.getImage(element);
	        }
	    });

	    // Set the content provider
	    ArrayContentProvider cp2 = new ArrayContentProvider();
	    msgListViewer.setContentProvider(cp2);
	    
	        // Add a selection change listener
	    msgListViewer.addSelectionChangedListener(new ISelectionChangedListener() {
	        public void selectionChanged(SelectionChangedEvent event) {
	                // Update OK button enablement
	            ISelection sel = msgListViewer.getSelection();
	            if (sel instanceof IStructuredSelection) {
	            	//updateTargetDetails((EZMojoTarget)((IStructuredSelection)sel).getFirstElement());
	            }
	        }
	    });

	        // Add double-click listener
	    msgListViewer.addDoubleClickListener(new IDoubleClickListener() {
	        public void doubleClick(DoubleClickEvent event) {
	        	//okPressed();
	        }
	    });
	    msgListViewer.refresh();

	   Composite buttonBar2 = new Composite(container, SWT.NONE);
	   buttonBar2.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
	   buttonBar2.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
	   
	   Button addMsgButton = new Button(buttonBar2, SWT.PUSH);
	   addMsgButton.setText("+");
	   addMsgButton.addSelectionListener(
			   new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			}
	   );
	   addMsgButton.setLayoutData(GridDataFactory.swtDefaults().align(SWT.BEGINNING, SWT.CENTER).create());

	   
	   Button deleteMsgButton = new Button(buttonBar2, SWT.PUSH);
	   deleteMsgButton.setText("-");
	   deleteMsgButton.addSelectionListener(
			   new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
		            ISelection sel = targetListViewer.getSelection();
		            if (sel instanceof IStructuredSelection) {
		            	OscCmd t = (OscCmd)((IStructuredSelection)sel).getFirstElement();
						if (t instanceof OscCmd) {
							((EZEvent)t.eContainer()).getOsc().remove(t);
							targetListViewer.refresh(true);
						}
					}
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			}
	   );
	   deleteTargetButton.setLayoutData(GridDataFactory.swtDefaults().align(SWT.END, SWT.CENTER).create());

	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   container.layout(true);
	   container.pack(true);

		
		
		
		
		return parent;
	}
	
	protected Control createEventsSection(Composite parent) {
		Label eventsLabel = new Label(parent, SWT.NONE);
		eventsLabel.setText(EVENTS_TITLE);
		eventsLabel.setForeground(ColorConstants.gray);

		eventsListViewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		eventsListViewer.getTree().setLayoutData(
	    	GridDataFactory.fillDefaults().
	    		minSize(200, 50).hint(200, 50).
	    			grab(true, true).create()
	    );
		eventsListViewer.getTree().setFont(parent.getFont());
		eventsListViewer.getTree().setForeground(ColorConstants.gray);
		eventsListViewer.getTree().setBackground(GUIToolkit.BG);
	    
	    // Set the label provider		
		eventsListViewer.setLabelProvider(new LabelProvider() {
	        @Override
	        public Image getImage(Object element) {
	            if (element instanceof EZEvent) {
	            	return Activator.imageDescriptorFromPlugin(
	            		Activator.PLUGIN_ID, 
	            		"icons/new/clapperboard.png"
	            	).createImage();
	            }
	        	return super.getImage(element);
	        }
	    });

	    // Set the content provider
		TreeArrayContentProvider cp = new TreeArrayContentProvider();
	    eventsListViewer.setContentProvider(cp);
	    
	    ISelection sel = scriptsListViewer.getSelection();
	    if (sel instanceof IStructuredSelection) {
	    	StructuredSelection ssel = (StructuredSelection) sel;
	    	if (!ssel.isEmpty()) {
	    		Object obj = ssel.getFirstElement();
	    		if (obj instanceof EZScript) {
	    			EZScript script = (EZScript) obj;
	    		    eventsListViewer.setInput(script.getEvents());
	    		    if (!script.getEvents().isEmpty()) {
	    		    	eventsListViewer.setSelection(
	    			    	new StructuredSelection(script.getEvents().get(0)), 
	    			    	true
	    			    );
	    		    }
	    		}
	    	}
	    }
	        
	    // Add a selection change listener
	    eventsListViewer.addSelectionChangedListener(new ISelectionChangedListener() {
	        public void selectionChanged(SelectionChangedEvent event) {
	            // Update OK button enablement
	            ISelection sel = eventsListViewer.getSelection();
	            if (sel instanceof IStructuredSelection) {
	            	StructuredSelection ssel =  (StructuredSelection) sel;
	            	if (!ssel.isEmpty()) {
	            		updateEZEventsDetails((EZEvent)ssel.getFirstElement());
	            	}
	            }
	        }
	    });

	   // Add double-click listener
	    eventsListViewer.addDoubleClickListener(new IDoubleClickListener() {
	        public void doubleClick(DoubleClickEvent event) {
	        	//okPressed();
	        }
	    });
	    eventsListViewer.refresh();

	   Composite buttonBar = new Composite(parent, SWT.NONE);
	   buttonBar.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
	   buttonBar.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
	   
	   addEventButton = new Button(buttonBar, SWT.PUSH);
	   addEventButton.setText("+");
	   addEventButton.addSelectionListener(
			   new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					EZEvent event = EzmojoFactory.eINSTANCE.createEZEvent();
		            ISelection sel = eventsListViewer.getSelection();
		            if (sel instanceof IStructuredSelection) {
		            	IStructuredSelection ssel = (IStructuredSelection) sel;
		            	if (!ssel.isEmpty()) {
			            	EZEvent s1 = (EZEvent) ssel.getFirstElement();
							if (s1 instanceof EZEvent) {
								ISelection scriptSelection = scriptsListViewer.getSelection();
								if (scriptSelection instanceof StructuredSelection) {
									StructuredSelection ssel2 = (StructuredSelection) scriptSelection;
									if (!ssel2.isEmpty()) {
										EZScript elem = (EZScript) ssel2.getFirstElement();
										if (elem instanceof EZScript) {
									    	int idx = ((EZScript) elem).getEvents().indexOf(s1);
									    	if (idx >= 0 && idx<((EZScript) elem).getEvents().size()) {
									    		((EZScript) elem).getEvents().add(idx, event);
									    	} else {
									    		((EZScript) elem).getEvents().add(event);
									    	}
										}
									}
								}
							}
						} else {
							ISelection scriptSelection = scriptsListViewer.getSelection();
							if (scriptSelection instanceof StructuredSelection) {
								EZScript elem = (EZScript) ((StructuredSelection)scriptSelection).getFirstElement();
							    if (elem instanceof EZScript) {
							    	EZScript node = (EZScript) elem;
								    node.getEvents().add(event);
								    eventsListViewer.setInput(node.getEvents());
								    if (!node.getEvents().isEmpty()) {
								    	eventsListViewer.setSelection(
									    	new StructuredSelection(event), 
									    	true
									    );
								    }
							    }
							}
						}
		            }
		            eventsListViewer.refresh(true);
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			}
	   );
	   addEventButton.setLayoutData(GridDataFactory.swtDefaults().align(SWT.BEGINNING, SWT.CENTER).create());
	   
	   deleteEventButton = new Button(buttonBar, SWT.PUSH);
	   deleteEventButton.setText("-");
	   deleteEventButton.addSelectionListener(
			   new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
		            ISelection sel = eventsListViewer.getSelection();
		            if (sel instanceof IStructuredSelection) {
		            	IStructuredSelection ssel = (IStructuredSelection) sel;
		            	if (!ssel.isEmpty()) {
			            	EZEvent s1 = (EZEvent)ssel.getFirstElement();
							if (s1 instanceof EZEvent) {
								ISelection scriptSelection = scriptsListViewer.getSelection();
								if (scriptSelection instanceof StructuredSelection) {
									EZScript elem = (EZScript) ((StructuredSelection)scriptSelection).getFirstElement();
								    if (elem instanceof EZScript) {
								    	EZScript node = (EZScript) elem;
									    EZEvent last = null;
									    for (EZEvent s2 : node.getEvents()) {
									    	if (EcoreUtil.equals(s1, s2)) {
											    node.getEvents().remove(s1);
									    		break;
									    	} else {
									    		last = s2;
									    	}
									    }
									    node.getEvents().remove(s1);
									    if (last != null) {
									    	eventsListViewer.setSelection(new StructuredSelection(last));
									    } else if (!node.getEvents().isEmpty()) {
									    	eventsListViewer.setSelection(new StructuredSelection(node.getEvents().get(0)));
									    }
									}
								}
							}
						}
		            }
		            eventsListViewer.refresh(true);
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			}
	   );
	   deleteEventButton.setLayoutData(GridDataFactory.swtDefaults().align(SWT.END, SWT.CENTER).create());
	   
	   return parent;
	}

	/**
	 * @see PreferencePage#createContents(Composite)
	 */
	protected Control createScriptSection(Composite parent) {
		Label scriptsLabel = new Label(parent, SWT.NONE);
		scriptsLabel.setText(SCRIPT_TITLE);
		scriptsLabel.setForeground(ColorConstants.gray);

		scriptsListViewer = new TreeViewer(parent, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
	    scriptsListViewer.getTree().setLayoutData(
	    	GridDataFactory.fillDefaults().
	    		minSize(200, 50).hint(200, 50).
	    			grab(true, true).create()
	    );
	    scriptsListViewer.getTree().setFont(parent.getFont());
	    scriptsListViewer.getTree().setForeground(ColorConstants.gray);
	    scriptsListViewer.getTree().setBackground(GUIToolkit.BG);
	    
	    // Set the label provider		
	    scriptsListViewer.setLabelProvider(new LabelProvider() {
	        @Override
	        public Image getImage(Object element) {
	            if (element instanceof EZMojoTarget) {
	            	return Activator.imageDescriptorFromPlugin(
	            		Activator.PLUGIN_ID, 
	            		"icons/new/clapperboard.png"
	            	).createImage();
	            }
	        	return super.getImage(element);
	        }
	        
	        @Override
	        public String getText(Object element) {
	        	if (element instanceof EZScript) {
	        		return element instanceof EZScript ?  ((EZScript)element).getLabel() : "????";
	        	}
	        	return super.getText(element);
	        }
	    });

	    // Set the content provider
	    TreeArrayContentProvider cp = new TreeArrayContentProvider();
	    scriptsListViewer.setContentProvider(cp);
	    
	    Object elem = getElement().getAdapter(EZMojoNode.class);
	    if (elem instanceof EZMojoNode) {
		    EZMojoNode node = (EZMojoNode) elem;
		    scriptsListViewer.setInput(node.getScripts());
		    if (!node.getScripts().isEmpty()) {
			    scriptsListViewer.setSelection(
			    	new StructuredSelection(node.getScripts().get(0)), 
			    	true
			    );
		    }
	    }
	        
	    // Add a selection change listener
	    scriptsListViewer.addSelectionChangedListener(new ISelectionChangedListener() {
	        public void selectionChanged(SelectionChangedEvent event) {
	            ISelection sel = scriptsListViewer.getSelection();
	            if (sel instanceof IStructuredSelection) {
	            	Object obj = ((StructuredSelection)sel).getFirstElement();
	            	if (obj instanceof EZScript) {
	            		updateEZScriptDetails((EZScript)obj);
	            	}
	            }
	        }
	    });

	   // Add double-click listener
	   scriptsListViewer.addDoubleClickListener(new IDoubleClickListener() {
	        public void doubleClick(DoubleClickEvent event) {
	        	//okPressed();
	        }
	    });
	   scriptsListViewer.refresh();

	   Composite buttonBar = new Composite(parent, SWT.NONE);
	   buttonBar.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
	   buttonBar.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
	   
	   addScriptButton = new Button(buttonBar, SWT.PUSH);
	   addScriptButton.setText("+");
	   addScriptButton.addSelectionListener(
			   new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					EZScript script = EzmojoFactory.eINSTANCE.createEZScript();
					script.setLabel(UUID.randomUUID().toString());
					
		            ISelection sel = scriptsListViewer.getSelection();
		            if (sel instanceof IStructuredSelection) {
		            	IStructuredSelection ssel = (IStructuredSelection) sel;
		            	if (!ssel.isEmpty()) {
			            	EZScript s1 = (EZScript) ssel.getFirstElement();
							if (s1 instanceof EZScript) {
								Object elem = getElement().getAdapter(EZMojoNode.class);
							    if (elem instanceof EZMojoNode) {
							    	int idx = ((EZMojoNode) elem).getScripts().indexOf(s1);
							    	if (idx >= 0 && idx<((EZMojoNode) elem).getScripts().size()) {
							    		((EZMojoNode) elem).getScripts().add(idx, script);
							    	} else {
							    		((EZMojoNode) elem).getScripts().add(s1);
							    	}
								}
							}
						} else {
						    Object elem = getElement().getAdapter(EZMojoNode.class);
						    if (elem instanceof EZMojoNode) {
							    EZMojoNode node = (EZMojoNode) elem;
							    node.getScripts().add(script);
							    scriptsListViewer.setInput(node.getScripts());
							    if (!node.getScripts().isEmpty()) {
								    scriptsListViewer.setSelection(
								    	new StructuredSelection(script), 
								    	true
								    );
							    }
						    }
						}
		            }
		            scriptsListViewer.refresh(true);
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			}
	   );
	   addScriptButton.setLayoutData(GridDataFactory.swtDefaults().align(SWT.BEGINNING, SWT.CENTER).create());
	   
	   deleteScriptButton = new Button(buttonBar, SWT.PUSH);
	   deleteScriptButton.setText("-");
	   deleteScriptButton.addSelectionListener(
			   new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
		            ISelection sel = scriptsListViewer.getSelection();
		            if (sel instanceof IStructuredSelection) {
		            	IStructuredSelection ssel = (IStructuredSelection) sel;
		            	if (!ssel.isEmpty()) {
			            	EZScript s1 = (EZScript)ssel.getFirstElement();
							if (s1 instanceof EZScript) {
								Object elem = getElement().getAdapter(EZMojoNode.class);
							    if (elem instanceof EZMojoNode) {
								    EZMojoNode node = (EZMojoNode) elem;
								    EZScript last = null;
								    for (EZScript s2 : node.getScripts()) {
								    	if (EcoreUtil.equals(s1, s2)) {
										    node.getScripts().remove(s1);
								    		break;
								    	} else {
								    		last = s2;
								    	}
								    }
								    node.getScripts().remove(s1);
								    if (last != null) {
								    	scriptsListViewer.setSelection(new StructuredSelection(last));
								    } else if (!node.getScripts().isEmpty()) {
								    	scriptsListViewer.setSelection(new StructuredSelection(node.getScripts().get(0)));
								    }
								}
							}
						}
		            }
		            scriptsListViewer.refresh(true);
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			}
	   );
	   deleteScriptButton.setLayoutData(GridDataFactory.swtDefaults().align(SWT.END, SWT.CENTER).create());
	   
	   if (eventsListViewer != null && eventsListViewer.getTree() != null && eventsListViewer.getTree().getItems() != null && eventsListViewer.getTree().getItems().length <= 0) {
		   deleteScriptButton.setEnabled(false);
	   }
	   
	   return parent;
	}
	
	private void updateEZScriptDetails(EZScript script) {
		if (script != null) {
			eventsListViewer.setInput(script.getEvents());
			eventsListViewer.refresh(true);
			if (!script.getEvents().isEmpty()) {
				eventsListViewer.setSelection(new StructuredSelection(script.getEvents().get(0)));
			}
		}
	}
	
	private void updateEZEventsDetails(EZEvent event) {
		if (event != null) {
			targetListViewer.setInput(event.getTargets());
		}
	}
	
	public boolean performOk() {
		return true;
	}
	
	private void addFirstSection(Composite parent) {
		createScriptSection(parent);
	}

	private void addSecondSection(Composite parent) {
		createEventsSection(parent);
	}
	
	private void addDetailsSection(Composite parent) {
		createDetailsSection(parent);
	}

	/**
	 * @see PreferencePage#createContents(Composite)
	 */
	protected Control createContents(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		composite.setLayout(layout);
		GridData data = new GridData(GridData.FILL);
		data.grabExcessHorizontalSpace = true;
		composite.setLayoutData(data);
		
		Composite left = GUIToolkit.INSTANCE.createComposite(composite);
		left.setLayout(GridLayoutFactory.fillDefaults().create());
		left.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		
		addFirstSection(left);

		Composite right = GUIToolkit.INSTANCE.createComposite(composite);
		right.setLayout(GridLayoutFactory.fillDefaults().create());
		right.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		
		addSecondSection(right);

		Composite details = GUIToolkit.INSTANCE.createComposite(composite);
		details.setLayout(GridLayoutFactory.fillDefaults().create());
		details.setLayoutData(GridDataFactory.fillDefaults().span(2,1).grab(true, true).create());

		addDetailsSection(details);
		
		return composite;
	}
}