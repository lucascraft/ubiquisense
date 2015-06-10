/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2013, Lucas Bigeardel
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
package net.sf.smbt.ui.pachube.wizards;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class CreateCosmFeedWizardPage extends WizardPage {
	
	private Text titleText;
	private Text descText;
	
	protected CreateCosmFeedWizardPage() {
		super("Feed");
		
		setMessage("Define feed characteristics");
		setDescription("Feed.");
		setTitle("Create Cosm Feed");
		
	}
	
	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(GridLayoutFactory.fillDefaults().numColumns(5).create());
		composite.setLayoutData(GridDataFactory.fillDefaults().create());
	    
		//
		// API Key
		//
		/*
		Label apiKeyLabel = new Label(composite, SWT.NONE);
		apiKeyLabel.setText("API Key : ");
		apiKeyLabel.setLayoutData(GridDataFactory.swtDefaults().align(SWT.END, SWT.CENTER).create());
		
		Text apiKeyText = new Text(composite, SWT.BORDER);
		apiKeyText.setText("");
		apiKeyText.setLayoutData(GridDataFactory.fillDefaults().span(4, 1).grab(true, false).grab(true, false).create());
		 */
		
		//
		// Title
		//
		Label titleLabel = new Label(composite, SWT.NONE);
		titleLabel.setText("Title : ");
		titleLabel.setLayoutData(GridDataFactory.swtDefaults().align(SWT.END, SWT.CENTER).create());

		titleText = new Text(composite, SWT.BORDER);
		titleText.setText("");
		titleText.setLayoutData(GridDataFactory.fillDefaults().span(4, 1).grab(true, false).grab(true, false).create());

		titleText.addKeyListener(new KeyListener() {
			@Override
			public void keyReleased(org.eclipse.swt.events.KeyEvent e) {
				((CreateCosmFeedWizard)getWizard()).getEnvType().setTitle(titleText.getText());
			}
			@Override
			public void keyPressed(org.eclipse.swt.events.KeyEvent e) {}
		});

		//
		// Description
		//
		Label descLabel = new Label(composite, SWT.NONE);
		descLabel.setText("Description : ");
		descLabel.setLayoutData(GridDataFactory.swtDefaults().align(SWT.END, SWT.CENTER).create());

		descText = new Text(composite, SWT.MULTI|SWT.BORDER);
		descText.setText("");
		descText.setLayoutData(GridDataFactory.fillDefaults().minSize(200, 50).span(4, 1).hint(200, 50).grab(true, false).create());

		descText.setSize(SWT.DEFAULT, 100);
		descText.addKeyListener(new KeyListener() {
			@Override
			public void keyReleased(org.eclipse.swt.events.KeyEvent e) {
				((CreateCosmFeedWizard)getWizard()).getEnvType().setDescription(descText.getText());
			}
			@Override
			public void keyPressed(org.eclipse.swt.events.KeyEvent e) {}
		});
		
		//
		// TODO : Tags (ListViewer ...)
		//
		
		

		setControl(composite);
		
		//PlatformUI.getWorkbench().getHelpSystem().setHelp(getControl(), "net.sf.smbt.doc.transport_protocol_context"); // NEW
	}
}
