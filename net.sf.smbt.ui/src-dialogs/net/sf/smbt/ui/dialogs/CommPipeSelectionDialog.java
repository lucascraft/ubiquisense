/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2008 - 2012, Lucas Bigeardel
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.sf.smbt.comm.extensions.protocol.ProtocolReactor;
import net.sf.smbt.comm.script.netConf.TRANSPORT_PROTOCOL;
import net.sf.smbt.ezmojo.EZMojoKind;
import net.sf.smbt.ezmojo.EZMojoTarget;
import net.sf.smbt.osc.ezmojo.utils.EZMojoTargetUtils;
import net.sf.smbt.osc.ezmojo.utils.EzMojoExprUtils;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.smbt.ui.Activator;
import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.IDialogSettings;
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
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.ui.dialogs.SelectionDialog;

public class CommPipeSelectionDialog extends SelectionDialog {
	private List<CmdPipe> availableCmdPipes;
	private List<EZMojoTarget> pipeConfigs;
	private TabFolder folder;
	@SuppressWarnings("unused")
	private TabItem existingTab, previousTab;
	
	private SelectionListener addPipeButtonSelectionListener;
	
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
    private ListViewer listViewer, pListViewer;
    
    @SuppressWarnings("unused")
	private TRANSPORT_PROTOCOL[] protocols;
    
    @SuppressWarnings("unused")
	private String[] comms;
    
    private boolean addPipeButtonAvailable;
    @SuppressWarnings("unused")
	private boolean originalPipesOnly;
    
	public CommPipeSelectionDialog(CmdPipe... pipes) {
		this(Display.getDefault().getActiveShell(), "Open Pipe Selection Dialog", "Open Pipe Selection Dialog", false, true);
		availableCmdPipes.addAll(Arrays.asList(pipes));
	}
	
	public CommPipeSelectionDialog(CmdPipe pipe, boolean addPipeButtonAvailable) {
		this(Display.getDefault().getActiveShell(), "Open Pipe 	Selection Dialog", "Open Pipe Selection Dialog", addPipeButtonAvailable, true);
		List<CmdPipe> pipes = new ArrayList<CmdPipe>();
		pipes.add(pipe);
		availableCmdPipes.addAll(pipes);
	}
	
	public CommPipeSelectionDialog(List<CmdPipe> pipes, boolean addPipeButtonAvailable) {
		this(Display.getDefault().getActiveShell(), "Open Pipe Selection Dialog", "Open Pipe Selection Dialog", addPipeButtonAvailable, true);
		availableCmdPipes.addAll(pipes);
	}
	
	public CommPipeSelectionDialog(TRANSPORT_PROTOCOL... protocols) {
		this(Display.getDefault().getActiveShell(), "Open Pipe Selection Dialog", "Open Pipe Selection Dialog", true, false);
		this.protocols = protocols;
		comms = ProtocolReactor.INSTANCE.getProtocolIDS();
	}
	
	public CommPipeSelectionDialog() {
		this(Display.getDefault().getActiveShell(), "Open Pipe Selection Dialog", "Open Pipe Selection Dialog", true, false);
		protocols = TRANSPORT_PROTOCOL.values();
		comms = ProtocolReactor.INSTANCE.getProtocolIDS();
	}
	
	public CommPipeSelectionDialog(String[] comms, boolean addPipeButtonAvailable) {
		this(Display.getDefault().getActiveShell(), "Open Pipe Selection Dialog", "Open Pipe Selection Dialog", addPipeButtonAvailable, false);
		protocols = TRANSPORT_PROTOCOL.values();
		this.comms = comms;
	}
	
	public CommPipeSelectionDialog(String... comms) {
		this(Display.getDefault().getActiveShell(), "Open Pipe Selection Dialog", "Open Pipe Selection Dialog", true, false);
		protocols = TRANSPORT_PROTOCOL.values();
		this.comms = comms;
	}

/*
	public CommPipeSelectionDialog(String comm) {
		this(Display.getDefault().getActiveShell(), "Open Pipe Selection Dialog", "Open Pipe Selection Dialog", true, false);
		protocols = TRANSPORT_PROTOCOL.values();
		this.comms = new String[] { comm };
	}
*/
	
	public CommPipeSelectionDialog(TRANSPORT_PROTOCOL[] protocols, String[] comms, boolean addPipeButtonAvailable) {
		this(Display.getDefault().getActiveShell(), "Open Pipe Selection Dialog", "Open Pipe Selection Dialog", addPipeButtonAvailable, false);
		this.protocols = protocols;
		this.comms = comms;
	}
	
	public CommPipeSelectionDialog(TRANSPORT_PROTOCOL[] protocols, String[] comms) {
		this(Display.getDefault().getActiveShell(), "Open Pipe Selection Dialog", "Open Pipe Selection Dialog", true, false);
		this.protocols = protocols;
		this.comms = comms;
	}
    
    /**
     * Constructor w/ arguments
     *  
     * @param parentShell parent {@link Shell}
     * @param shellTitle {@link Shell} title
     * @param shellMessage {@link Shell} message
     */
	public CommPipeSelectionDialog(Shell parentShell, String shellTitle, String shellMessage, boolean addPipeButtonAvailable, boolean originalPipesOnly) {
		super(parentShell);
		pipeConfigs = new ArrayList<EZMojoTarget>();
		this.addPipeButtonAvailable = addPipeButtonAvailable;
		this.originalPipesOnly = originalPipesOnly;
		availableCmdPipes = new ArrayList<CmdPipe>();
	    setTitle(shellTitle);
	    setMessage(shellMessage);
	    
	    setDefaultImage(
	    	Activator.imageDescriptorFromPlugin(
	    		Activator.PLUGIN_ID, 
	    		"icons/ubiquisense.png"
	    	).createImage()
	    );
	    
       	addPipeButtonSelectionListener = new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				okPressedWithNullResult();
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		};

	    if (!originalPipesOnly) {
		    for(CmdPipe pipe : QuanticMojo.INSTANCE.getPipes()) {
		    	availableCmdPipes.add(pipe);
		    }
	    }
	    
	    setSelectionResult(availableCmdPipes.toArray());
	    
	}

	@Override
	protected Point getInitialSize() {
		Point size = super.getInitialSize();
		size.x = 300;
		return size;
	}
	
	
    /* (non-Javadoc)
     * Method declared on Dialog.
     */
    protected Control createDialogArea(Composite parent) {
        Composite composite = (Composite) super.createDialogArea(parent);
        composite.setLayout(GridLayoutFactory.fillDefaults().create());
        composite.setLayoutData(GridDataFactory.fillDefaults().hint(200, 350).grab(true, true).create());

        
        // Create label
        createMessageArea(composite);
        
        folder = new TabFolder(composite, SWT.BOTTOM);
        
        folder.setLayout(GridLayoutFactory.fillDefaults().create());
        folder.setLayoutData(GridDataFactory.fillDefaults().hint(200, 350).grab(true, true).create());

        existingTab = existingPipes(folder, parent.getFont());
        previousTab = previousPipes(folder, parent.getFont());
        
        if (addPipeButtonAvailable) {
	        Composite buttonBar = new Composite(composite, SWT.NONE);
	        buttonBar.setLayout(GridLayoutFactory.fillDefaults().create());
	        buttonBar.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
	        
	        Button createCommPipeButton = new Button(buttonBar, SWT.PUSH);
	        createCommPipeButton.setImage(
	        	Activator.imageDescriptorFromPlugin(
	        		Activator.PLUGIN_ID, 
	        		"icons/new/plug_plus.png"
	        	).createImage()
	        );
	        
	        createCommPipeButton.addSelectionListener(
	        	addPipeButtonSelectionListener
	        );
        }
        for (int i=folder.getItemCount();i>0; i--) {
        	folder.setSelection(i);
        }
        folder.setSelection(existingTab);
        return composite;
    }
    
    private TabItem previousPipes(TabFolder folder, Font font) {
    	TabItem tab = new TabItem(folder, SWT.BOTTOM);
    	
        // Create list viewer	
    	pListViewer = new ListViewer(
    		folder, 
    		SWT.SINGLE | 
    		SWT.H_SCROLL | 
    		SWT.V_SCROLL | 
    		SWT.BORDER
    	);
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
        pListViewer.setInput(loadPipesSettings());

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
        tab.setText("Previous");
       
        return tab;
    }
	
	public final static String PIPES_SECTION_DIALOG_SETTINGS_ID	= "net.sf.smbt.ui.dialogs";
	public final static String PIPES_CONFIGS_ID					= "net.sf.smbt.ui.dialogs.pipes";
	
	private void storeConsolePageSettings() {
		IDialogSettings settings = Activator.getDefault().getDialogSettings();
		IDialogSettings consolePageDialogSettings;
		if ((consolePageDialogSettings	= settings.getSection		(PIPES_SECTION_DIALOG_SETTINGS_ID)) == null) {
			consolePageDialogSettings	= settings.addNewSection	(PIPES_SECTION_DIALOG_SETTINGS_ID);
		}
		
		List<EZMojoTarget> targetsToStore = new ArrayList<EZMojoTarget>();
		
		for (EZMojoTarget oldPipe : pipeConfigs) {
			for (CmdPipe curPipe : availableCmdPipes) {
				EZMojoTarget t = EZMojoTargetUtils.INSTANCE.createEzTarget(curPipe, EZMojoKind.NONE);
				if (!EcoreUtil.equals(t, oldPipe)) {
					targetsToStore.add(t);
				}
			}
			if (!targetsToStore.contains(oldPipe)) {
				targetsToStore.add(oldPipe);
			}
		}
		
		List<String> arrayToStore = new ArrayList<String>();
		for (EZMojoTarget t : targetsToStore) {
			arrayToStore.add(t.toString2());
		}
		
		consolePageDialogSettings.put(PIPES_CONFIGS_ID, arrayToStore.toArray(new String[0]));
	}
	private List<EZMojoTarget> loadPipesSettings() {
		IDialogSettings settings = Activator.getDefault().getDialogSettings();
		IDialogSettings consolePageDialogSettings;
		if ((consolePageDialogSettings = settings.getSection(PIPES_SECTION_DIALOG_SETTINGS_ID))==null) {
			consolePageDialogSettings = settings.addNewSection(PIPES_SECTION_DIALOG_SETTINGS_ID);
		}
		String[] exprArray = consolePageDialogSettings.getArray(PIPES_CONFIGS_ID);
		if (exprArray != null) {
			for (String expr : exprArray) {
				pipeConfigs.add(
					EzMojoExprUtils.INSTANCE.parseEzTargetAddr3(expr)
				);
			}
			//
		}
		return pipeConfigs;
	}
	
    private TabItem existingPipes(TabFolder folder, Font font) {
    	TabItem tab = new TabItem(folder, SWT.BOTTOM);
    	
        // Create list viewer	
        listViewer = new ListViewer(folder, SWT.SINGLE | SWT.H_SCROLL
                | SWT.V_SCROLL | SWT.BORDER);
        GridData data = new GridData(GridData.FILL_BOTH);
        data.heightHint	= convertHeightInCharsToPixels(LIST_HEIGHT);
        data.widthHint	= convertWidthInCharsToPixels(LIST_WIDTH);
        listViewer.getList().setLayoutData(data);
        listViewer.getList().setFont(font);
        // Set the label provider		
        listViewer.setLabelProvider(new LabelProvider() {
            public String getText(Object element) {
                // Return the features's label.
            	if (element instanceof CmdPipe) {
            		return element == null ? "" : ((CmdPipe) element).getName(); //$NON-NLS-1$
            	}
            	return "???";
            }
        });

        // Set the content provider
        ArrayContentProvider cp = new ArrayContentProvider();
        listViewer.setContentProvider(cp);
        listViewer.setInput(availableCmdPipes == null ? new ArrayList<CmdPipe>() : availableCmdPipes);

        // Set the initial selection
        listViewer.setSelection(new StructuredSelection(getInitialElementSelections()), true);

        // Add a selection change listener
        listViewer.addSelectionChangedListener(new ISelectionChangedListener() {
            public void selectionChanged(SelectionChangedEvent event) {
                // Update OK button enablement
                getOkButton().setEnabled(!event.getSelection().isEmpty());
            }
        });

        // Add double-click listener
        listViewer.addDoubleClickListener(new IDoubleClickListener() {
            public void doubleClick(DoubleClickEvent event) {
                okPressed();
            }
        });
        
        tab.setControl(listViewer.getControl());
        tab.setText("Live");
        
        return tab;
    }

    /* (non-Javadoc)
     * Method declared on Dialog.
     */
    protected void okPressedWithNullResult() {
    	storeConsolePageSettings();
	    setResult(null);
        super.okPressed();
    }

    /* (non-Javadoc)
     * Method declared on Dialog.
     */
    protected void okPressed() {
    	storeConsolePageSettings();
    	TabItem[] items = folder.getSelection();
    	if (items != null && items.length > 0) {
	    	setResult(
	    		items[0] == existingTab ? 
	    			((IStructuredSelection) listViewer.getSelection()).toList() : 
	    				((IStructuredSelection) pListViewer.getSelection()).toList()
	    	);
    	}
        super.okPressed();
    }
}
