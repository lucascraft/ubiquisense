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

package net.sf.smbt.ui.wizards;

import gnu.io.CommPortIdentifier;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

public class UBQCommPipeConnectionWizardPage extends WizardPage {
	/**
	 * List height in characters.
	 */
	private final static int LIST_HEIGHT = 10;

	/**
	 * List width in characters.
	 */
	private final static int LIST_WIDTH = 20;

	protected ListViewer listViewer;
	protected List<CommPortIdentifier> availableCommPortIdentifiers;
	public UBQCommPipeConnectionWizardPage() {
		super("USB");
		availableCommPortIdentifiers = new ArrayList<CommPortIdentifier>();
	    setTitle("Select USB port connected with Arduino");
	    setMessage("Select USB port connected with Arduino");
	    
	    Enumeration<?> portIdentifiers = CommPortIdentifier.getPortIdentifiers();
	    while(portIdentifiers.hasMoreElements()) {
	    	Object elem = portIdentifiers.nextElement();
	    	if (elem instanceof CommPortIdentifier) {
	    		availableCommPortIdentifiers.add((CommPortIdentifier)elem);
	    	}
	    }
	}
	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(GridLayoutFactory.fillDefaults().create());
		composite.setLayoutData(GridDataFactory.fillDefaults().create());
		
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

	    // Set the content provider
	    ArrayContentProvider cp = new ArrayContentProvider();
	    listViewer.setContentProvider(cp);
	    listViewer.setInput(availableCommPortIdentifiers);
	    
	    listViewer.addSelectionChangedListener(
	    	new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					if (event.getSelection() instanceof IStructuredSelection) {
/*
						((CommPipeConnectionSelectionWizard)getWizard()).cfg.setUsbComm(
							(CommPortIdentifier)((IStructuredSelection)event.getSelection()).getFirstElement()
						);
*/
					}
				}
			}
	    );
	    
	    listViewer.setSelection(
	    	new StructuredSelection(availableCommPortIdentifiers.get(0))
	    );

		setControl(composite);
	}
}
