/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2012 - 2013, Lucas Bigeardel
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

package net.sf.smbt.ui.pachube.dialogs;

import net.sf.smbt.ezcosm.CosmProject;
import net.sf.smbt.ui.pachube.controller.CosmCellLabelProvider;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.eeml.xsd._0._5.EnvironmentType;

public class TriggersManagementDialog extends SelectionDialog {
	private EnvironmentType envType;
	@SuppressWarnings("unused")
	private CosmProject project;
	
	private ListViewer msgListViewer;
	public TriggersManagementDialog(Shell parentShell, CosmProject cosmProj, EnvironmentType env) {
		super(parentShell);
		envType = env;
		project = cosmProj;
	}

	
	@Override
	protected Point getInitialSize() {
		Point size = super.getInitialSize();
		size.x = 400;
		return size;
	}

	
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);

	    createMessageArea(composite);
	        
	    //createFactorArea(composite);
	    // Label for owner field
		Label msgLabel = new Label(composite, SWT.NONE);
		msgLabel.setText("Osc Messages : ");

		// Owner text field
			
		msgListViewer = new ListViewer(composite, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		msgListViewer.getList().setLayoutData(GridDataFactory.fillDefaults().minSize(200, 50).hint(200, 50).grab(true, true).create());
		msgListViewer.getList().setFont(parent.getFont());
		    
		// Set the label provider		
		msgListViewer.setLabelProvider(new CosmCellLabelProvider());

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
		    
		msgListViewer.setInput(envType.getData());
		msgListViewer.refresh();

		Composite buttonBar2 = new Composite(composite, SWT.NONE);
		buttonBar2.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
		buttonBar2.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		   
		Button addMsgButton = new Button(buttonBar2, SWT.PUSH);
		addMsgButton.setText("+");
		addMsgButton.addSelectionListener(
			new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {widgetSelected(e);}
			}
		);
		addMsgButton.setLayoutData(GridDataFactory.swtDefaults().align(SWT.BEGINNING, SWT.CENTER).create());

		   
		Button deleteMsgButton = new Button(buttonBar2, SWT.PUSH);
		deleteMsgButton.setText("-");
		deleteMsgButton.addSelectionListener(
			new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					ISelection sel = msgListViewer.getSelection();
					if (sel instanceof IStructuredSelection) {
						/*
			            	OscCmd t = (OscCmd)((IStructuredSelection)sel).getFirstElement();
							if (t instanceof OscCmd) {
								((EZEvent)t.eContainer()).getOsc().remove(t);
								msgListViewer.refresh(true);
							}
						*/
					}
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {widgetSelected(e);}}
		);
		deleteMsgButton.setLayoutData(GridDataFactory.swtDefaults().align(SWT.END, SWT.CENTER).create());

	    composite.layout(true);
	    composite.pack(true);
	        
	    return composite;
	}
}
