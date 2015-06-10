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

import gnu.io.CommPortIdentifier;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import net.sf.smbt.ui.Activator;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.SelectionDialog;

public class USBPortSelectionDialog extends SelectionDialog {
	private List<CommPortIdentifier> availableCommPortIdentifiers;
	
	private Clipboard clipboard;
	
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
    private ListViewer listViewer;
    private Image copyImage;
    private Button copyButton;

    /**
     * Constructor w/ arguments
     *  
     * @param parentShell parent {@link Shell}
     * @param shellTitle {@link Shell} title
     * @param shellMessage {@link Shell} message
     */
	public USBPortSelectionDialog(Shell parentShell, String shellTitle, String shellMessage) {
		super(parentShell);
		clipboard = new Clipboard(parentShell.getDisplay());
		
		availableCommPortIdentifiers = new ArrayList<CommPortIdentifier>();
	    setTitle(shellTitle);
	    setMessage(shellMessage);
	
	    Enumeration<?> portIdentifiers = CommPortIdentifier.getPortIdentifiers();
	    while(portIdentifiers.hasMoreElements()) {
	    	Object elem = portIdentifiers.nextElement();
	    	if (elem instanceof CommPortIdentifier) {
	    		availableCommPortIdentifiers.add((CommPortIdentifier)elem);
	    	}
	    }
	    
	    copyImage = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/new/copy.png").createImage();
	    
	    
	    setSelectionResult(availableCommPortIdentifiers.toArray());
	}
	
    /* (non-Javadoc)
     * Method declared on Dialog.
     */
    protected Control createDialogArea(Composite parent) {
        Composite composite = (Composite) super.createDialogArea(parent);

        // Create label
        createMessageArea(composite);
        
        // Create list viewer	
        listViewer = new ListViewer(composite, SWT.SINGLE | SWT.H_SCROLL
                | SWT.V_SCROLL | SWT.BORDER);
        
        GridData data = new GridData(GridData.FILL_BOTH);
        data.heightHint = convertHeightInCharsToPixels(LIST_HEIGHT);
        data.widthHint = convertWidthInCharsToPixels(LIST_WIDTH);
        
        listViewer.getList().setLayoutData(data);
        listViewer.getList().setFont(parent.getFont());
        
        // Set the label provider		
        listViewer.setLabelProvider(new LabelProvider() {
            public String getText(Object element) {
                // Return the features's label.
                return element == null ? "" : ((CommPortIdentifier)element).getName(); //$NON-NLS-1$
            }
        });
        
        listViewer.getList().addKeyListener(
        	new KeyListener() {
				@Override
				public void keyReleased(KeyEvent e) {
					if ( 	
							(e.stateMask & SWT.CTRL) == SWT.CTRL ||
							(e.stateMask & SWT.ALT) == SWT.ALT ||	
							(e.stateMask & SWT.COMMAND) == SWT.COMMAND
					) {
						if (e.keyCode == 'c') { // CTRL + C
							Object sel = listViewer.getSelection();
							if (sel instanceof IStructuredSelection) {
								Object obj = ((StructuredSelection)sel).getFirstElement();
								if (obj instanceof CommPortIdentifier) {
									Clipboard clipboard = new Clipboard(Display.getDefault());
						            String data = ((CommPortIdentifier)obj).getName();
						            clipboard.setContents(new Object[] { data }, new Transfer[] { TextTransfer.getInstance() });
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

        // Set the content provider
        ArrayContentProvider cp = new ArrayContentProvider();
        listViewer.setContentProvider(cp);
        listViewer.setInput(availableCommPortIdentifiers);

        // Set the initial selection
        listViewer.setSelection(new StructuredSelection(
                getInitialElementSelections()), true);

        // Add a selection change listener
        listViewer.addSelectionChangedListener(new ISelectionChangedListener() {
            public void selectionChanged(SelectionChangedEvent event) {
                // Update OK button enablement
                getOkButton().setEnabled(!event.getSelection().isEmpty());
                copyButton.setEnabled(true);
            }
        });

        // Add double-click listener
        listViewer.addDoubleClickListener(new IDoubleClickListener() {
            public void doubleClick(DoubleClickEvent event) {
                okPressed();
            }
        });
        
        copyButton = new Button(composite, SWT.PUSH);
        copyButton.setLayoutData(GridDataFactory.swtDefaults().align(SWT.BEGINNING, SWT.CENTER).create());
        copyButton.setImage(copyImage);
        copyButton.setEnabled(false);
        
        copyButton.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ISelection selection = listViewer.getSelection();
				if (selection instanceof StructuredSelection) {
					StructuredSelection ssel = (StructuredSelection) selection;
					Object data = ssel.getFirstElement();
					if (data instanceof CommPortIdentifier) {
						CommPortIdentifier identifier = ((CommPortIdentifier) data);
						String id = identifier.getName();
						if (id instanceof String) {
							clipboard.setContents(new Object[] { id },
								new Transfer[] { TextTransfer.getInstance() });
						}
					}
				}
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});
        
        return composite;
    }

    /* (non-Javadoc)
     * Method declared on Dialog.
     */
    protected void okPressed() {
        IStructuredSelection selection = (IStructuredSelection) listViewer
                .getSelection();
        setResult(selection.toList());
        super.okPressed();
    }
	
	@Override
	public void setInitialSelections(Object[] selectedElements) {
		super.setInitialSelections(selectedElements);
	}
	
	@Override
	public Object[] getResult() {
		return availableCommPortIdentifiers.toArray();
	}
	
	@Override
	public boolean close() {
		clipboard.dispose();
		return super.close();
	}
}
