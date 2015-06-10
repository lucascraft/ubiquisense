/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2008 - 2010, Lucas Bigeardel
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

package net.sf.smbt.ui.dialogs;

import gnu.io.CommPortIdentifier;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import net.sf.smbt.ezmojo.EZMojoKind;
import net.sf.smbt.ezmojo.EZMojoNode;
import net.sf.smbt.ezmojo.EZMojoRoot;
import net.sf.smbt.ezmojo.EZMojoTarget;
import net.sf.smbt.ezmojo.EZTUIOVar;
import net.sf.smbt.ezmojo.EZVar;
import net.sf.smbt.ezmojo.provider.EzmojoEditPlugin;
import net.sf.smbt.ezmotion.Motion;
import net.sf.smbt.osc.ezmojo.utils.EzAgent;
import net.sf.smbt.osc.ezmojo.utils.EzMojoAgentManager;
import net.sf.smbt.osc.ezmojo.utils.EzMojoExprUtils;
import net.sf.smbt.ui.Activator;
import net.sf.smbt.ui.console.controller.EzMojoCompseableAdapterFactory;
import net.sf.smbt.ui.console.controller.EzMojoContentProvider;
import net.sf.smbt.ui.hmi.GUIToolkit;
import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.bindings.keys.KeyStroke;
import org.eclipse.jface.bindings.keys.ParseException;
import org.eclipse.jface.fieldassist.ContentProposalAdapter;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.jface.fieldassist.SimpleContentProposalProvider;
import org.eclipse.jface.fieldassist.TextContentAdapter;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.dialogs.SelectionDialog;

public class LinkMessagesSelectionDialog extends SelectionDialog {
	private Float factor;
	
	/**
     * List height in characters.
     */
    private final static int LIST_HEIGHT = 10;
    
	/**
     * List width in characters.
     */
   private final static int LIST_WIDTH = 20;

    /**
     * List to display the resolutions.
     */
    private TreeViewer ezTreeViewer;

   	private ControlDecoration decFactor;
	private ContentProposalAdapter adapterFactor;
	private FieldDecoration infoFieldIndicator, errorFieldIndicator;
	
	private List<String> lastTenFactor;

    private Text factorText;

	public LinkMessagesSelectionDialog(Shell parentShell, String shellTitle, String shellMessage, float factor) {
		super(parentShell);
		
	    setTitle(shellTitle);
	    setMessage(shellMessage);
	
	    setFactor(factor);
	    
	    lastTenFactor = new ArrayList<String>();
	    lastTenFactor.add("1");
	    
	    setSelectionResult(new Object[0]);
	    
	}
	
    /**
     * Constructor w/ arguments
     *  
     * @param parentShell parent {@link Shell}
     * @param shellTitle {@link Shell} title
     * @param shellMessage {@link Shell} message
     */
	public LinkMessagesSelectionDialog(Shell parentShell, String shellTitle, String shellMessage) {
		this(parentShell, shellTitle, shellMessage, 1f);
	}
	
	public Float getFactor() {
		return factor;
	}
	public void setFactor(Float factor) {
		this.factor = factor;
	}
	
	private FilteredTree filterdTree = null;
	private boolean matchPattern(EZMojoNode node) {
		String text = null;
		if (node instanceof EZMojoNode) {
			text = node.getAddr();
		}
		return text != null ? text.contains(filterdTree.getFilterControl().getText()) : false;
	}

    /* (non-Javadoc)
     * Method declared on Dialog.
     */
	public TabFolder folder;
	@SuppressWarnings("unused")
    protected Control createDialogArea(Composite parent) {
        Composite composite = (Composite) super.createDialogArea(parent);

        createMessageArea(composite);
        
        folder = new TabFolder(composite, SWT.BOTTOM);
        
        folder.setLayout(GridLayoutFactory.fillDefaults().create());
        folder.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());

		TabItem cItem	= currentOscLinks	(folder, parent.getFont());
        TabItem mItem	= currentMidiLinks	(folder, parent.getFont());
        TabItem pcItem	= previousOscLinks	(folder, parent.getFont());
        TabItem pmItem	= previousMidiLinks	(folder, parent.getFont());
 
        createFactorArea(composite);
        
        composite.layout(true);
        composite.pack(true);
        
        return composite;
    }
    
    private void createFactorArea(Composite composite) {
        //
        // 
        //
        Label lbl = new Label(composite, SWT.READ_ONLY);
        lbl.setText("Factor : ");
        
        factorText = new Text(composite, SWT.BORDER);
        factorText.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
        
        factorText.setText("" + factor);
        
        factorText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				new FloatValidator().validate();
			}
		});
        
		// Create a control decoration to indicate an error.
		decFactor = new ControlDecoration(factorText, SWT.TOP | SWT.LEFT);
		infoFieldIndicator = FieldDecorationRegistry.getDefault().getFieldDecoration(FieldDecorationRegistry.DEC_CONTENT_PROPOSAL);
		errorFieldIndicator = FieldDecorationRegistry.getDefault().getFieldDecoration(FieldDecorationRegistry.DEC_ERROR);
		decFactor.setImage(infoFieldIndicator.getImage());
		decFactor.setDescriptionText(infoFieldIndicator.getDescription());
		
		KeyStroke keyStroke = null;
		try {
			keyStroke = KeyStroke.getInstance("Ctrl+Space");
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		
		// assume that myTextControl has already been created in some way
		adapterFactor = new ContentProposalAdapter(
			factorText, new TextContentAdapter(), 
			new SimpleContentProposalProvider(
				lastTenFactor.toArray(new String[0])
			),
			keyStroke, null);
		adapterFactor.setProposalAcceptanceStyle(ContentProposalAdapter.PROPOSAL_REPLACE);
    }
    
	@Override
	protected Point getInitialSize() {
		Point size = super.getInitialSize();
		size.x = 400;
		return size;
	}

    private TabItem currentOscLinks(TabFolder folder, Font font) {
    	TabItem tab = new TabItem(folder, SWT.BOTTOM);
        
        tab.setControl(createOSCSelectionComposite(folder));
        tab.setText("Osc");
       
        return tab;
    }

    private TabItem currentMidiLinks(TabFolder folder, Font font) {
    	TabItem tab = new TabItem(folder, SWT.BOTTOM);
        
        tab.setControl(createMidiSelectionComposite(folder));
        tab.setText("Midi");
       
        return tab;
    }
 
    private ListViewer pListViewer;
    private TabItem previousOscLinks(TabFolder folder, Font font) {
    	TabItem tab = new TabItem(folder, SWT.BOTTOM);
    	
        // Create list viewer	
    	pListViewer = new ListViewer(folder, SWT.SINGLE | SWT.H_SCROLL
                | SWT.V_SCROLL | SWT.BORDER);
        GridData data = new GridData(GridData.FILL_BOTH);
        data.heightHint = convertHeightInCharsToPixels(LIST_HEIGHT);
        data.widthHint = convertWidthInCharsToPixels(LIST_WIDTH);
        pListViewer.getList().setLayoutData(data);
        pListViewer.getList().setFont(font);
        // Set the label provider		
        pListViewer.setLabelProvider(new LabelProvider() {
            public String getText(Object element) {
                // Return the features's label.
            	if (element instanceof String) {
            		return element.toString(); //$NON-NLS-1$
            	}
            	return "???";
            }
        });

        // Set the content provider
        ArrayContentProvider cp = new ArrayContentProvider();
        pListViewer.setContentProvider(cp);
        pListViewer.setInput(loadMessagesSettings());

        // Set the initial selection
        pListViewer.setSelection(new StructuredSelection(getInitialElementSelections()), true);

        // Add a selection change listener
        pListViewer.addSelectionChangedListener(new ISelectionChangedListener() {
            public void selectionChanged(SelectionChangedEvent event) {
                // Update OK button enablement
                getOkButton().setEnabled(!event.getSelection().isEmpty());
            }
        });

        // Add double-click listener
        pListViewer.addDoubleClickListener(new IDoubleClickListener() {
            public void doubleClick(DoubleClickEvent event) {
                okPressed();
            }
        });
        
        tab.setControl(pListViewer.getControl());
        tab.setText("Old Osc");
       
        return tab;
    }
    
    private ListViewer pmListViewer;
    private TabItem previousMidiLinks(TabFolder folder, Font font) {
    	TabItem tab = new TabItem(folder, SWT.BOTTOM);
    	
        // Create list viewer	
    	pmListViewer = new ListViewer(folder, SWT.SINGLE | SWT.H_SCROLL
                | SWT.V_SCROLL | SWT.BORDER);
        GridData data = new GridData(GridData.FILL_BOTH);
        data.heightHint = convertHeightInCharsToPixels(LIST_HEIGHT);
        data.widthHint = convertWidthInCharsToPixels(LIST_WIDTH);
        pmListViewer.getList().setLayoutData(data);
        pmListViewer.getList().setFont(font);
        // Set the label provider		
        pmListViewer.setLabelProvider(new LabelProvider() {
            public String getText(Object element) {
                // Return the features's label.
            	if (element instanceof String) {
            		return element.toString(); //$NON-NLS-1$
            	}
            	return "???";
            }
        });

        // Set the content provider
        ArrayContentProvider cp = new ArrayContentProvider();
        pmListViewer.setContentProvider(cp);
        pmListViewer.setInput(loadMessagesSettings());

        // Set the initial selection
        pmListViewer.setSelection(new StructuredSelection(getInitialElementSelections()), true);

        // Add a selection change listener
        pmListViewer.addSelectionChangedListener(new ISelectionChangedListener() {
            public void selectionChanged(SelectionChangedEvent event) {
                // Update OK button enablement
                getOkButton().setEnabled(!event.getSelection().isEmpty());
            }
        });

        // Add double-click listener
        pmListViewer.addDoubleClickListener(new IDoubleClickListener() {
            public void doubleClick(DoubleClickEvent event) {
                okPressed();
            }
        });
        
        tab.setControl(pmListViewer.getControl());
        tab.setText("Old Midi");
       
        return tab;
    }

    public Object[] loadMessagesSettings() {
    	return new Object[0];
    }
    
    private Composite createMidiSelectionComposite(Composite composite) {
    	Composite midiContainer = GUIToolkit.INSTANCE.createComposite(composite);
    	midiContainer.setLayout(GridLayoutFactory.fillDefaults().create());
    	midiContainer.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
    	return midiContainer;
    }   
    
    private Composite createOSCSelectionComposite(Composite composite) {
		filterdTree = GUIToolkit.INSTANCE.createFilteredTree(
				composite, 
				SWT.MULTI | SWT.FULL_SELECTION,
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
				
	        //
	        // Create tree viewer
			//
	        ezTreeViewer  = filterdTree.getViewer();

	        GridData data = new GridData(GridData.FILL_BOTH);
	        data.heightHint = convertHeightInCharsToPixels(LIST_HEIGHT);
	        data.widthHint = convertWidthInCharsToPixels(LIST_WIDTH);
	        ezTreeViewer.getTree().setLayoutData(data);
	        ezTreeViewer.getTree().setFont(composite.getFont());
	        // Set the label provider		
	        
	        ezTreeViewer.getTree().addKeyListener(
	        	new KeyListener() {
					@Override
					public void keyReleased(KeyEvent e) {
						if ( (e.stateMask & SWT.CTRL) == SWT.CTRL) {
							if (e.keyCode == 'c') { // CTRL + C
								Object sel = ezTreeViewer.getSelection();
								if (sel instanceof IStructuredSelection) {
									Object obj = ((StructuredSelection)sel).getFirstElement();
									if (obj instanceof CommPortIdentifier) {
										Clipboard clipboard = new Clipboard(Display.getDefault());
							            String data = ((CommPortIdentifier)obj).getName();
							            clipboard.setContents(new Object[] { data }, new Transfer[] {    TextTransfer.getInstance() });
							            clipboard.dispose();
									}
								}
							}
						}
					}
					@Override
					public void keyPressed(KeyEvent e) {}
				}
	        );
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
				            Motion motion = tuioVar.getMotion();
				            lbl += "[" + motion.getCinematic().getLiteral() + " amp " + motion.getAmplitude() + ", freq " + motion.getFrequency() + "]"; //$NON-NLS-1$
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
							if (((EZTUIOVar)object).getMotion()==null) {
								return ExtendedImageRegistry.INSTANCE.getImage(
									EzmojoEditPlugin.INSTANCE.getImage("full/obj16/EZTUIOVar.png")
								);						
							}
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

	        ezTreeViewer.setLabelProvider(labelProvider);

	        // Set the content provider
	        EzMojoContentProvider cp = new EzMojoContentProvider();
	        ezTreeViewer.setContentProvider(cp);
	        
			EzAgent agent = EzMojoAgentManager.INSTANCE.getAgentsMap().values().iterator().next();
	        if (agent != null && agent.getEzMojo() != null) {
	        	ezTreeViewer.setInput(agent.getEzMojo());
	        }

	        // Set the initial selection
	        ezTreeViewer.setSelection(
	        	new StructuredSelection(
	                getInitialElementSelections()
	            ), 
	            true
	        );

	        //
	        // Add a selection change listener
	        //
	        ezTreeViewer.addSelectionChangedListener(
	        	new ISelectionChangedListener() {
	        		public void selectionChanged(SelectionChangedEvent event) {
	        			getOkButton().setEnabled(!event.getSelection().isEmpty());
	        		}
	        	}
	        );

	        //
	        // Add double-click listener
	        //
	        ezTreeViewer.addDoubleClickListener(new IDoubleClickListener() {
	            public void doubleClick(DoubleClickEvent event) {
	                okPressed();
	            }
	        });
	        
			
			return filterdTree;
    }
    
	public class FloatValidator{
	    public boolean validate(){
	      String ip = factorText.getText(); 
	      try {
	    	  factor = Float.parseFloat(ip);
	    	  
	      } catch (NumberFormatException nfe) {
	    	  factor = 1f;
	    	  decFactor.show();
	    	  decFactor.setImage(errorFieldIndicator.getImage());
	    	  return false;
	      }
	      decFactor.hide();
		  decFactor.setImage(infoFieldIndicator.getImage());
		  return true;
	    }
	}


    /* (non-Javadoc)
     * Method declared on Dialog.
     */
    @SuppressWarnings("unchecked")
	protected void okPressed() {
        IStructuredSelection selection = (IStructuredSelection) ezTreeViewer
                .getSelection();
        
        ArrayList<Object> lst = new ArrayList<Object>();
        lst.add(factor);
        lst.addAll(selection.toList());
        
        setResult(lst);
        super.okPressed();
    }
	
	@Override
	public void setInitialSelections(Object[] selectedElements) {
		super.setInitialSelections(selectedElements);
	}
	
}
