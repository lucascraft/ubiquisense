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

package net.sf.smbt.ui.pachube.dialogs;

import net.sf.smbt.ezcosm.CosmProject;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.eeml.xsd._0._5.DataType;
import org.eeml.xsd._0._5.EnvironmentType;
import org.eeml.xsd._0._5._5Factory;

public class DataStreamConfigDialog extends SelectionDialog {
	@SuppressWarnings("unused")
	private EnvironmentType envType;
	@SuppressWarnings("unused")
	private CosmProject project;
	
	private Text idText;
	private Text tagText;
	private Text minText;
	private Text maxText;
	
	private String min, max;
	//private String tag;
	
	public DataStreamConfigDialog(Shell parentShell, CosmProject cosmProj, EnvironmentType env) {
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
	    
	    Composite container = new Composite(composite, SWT.NONE);
	    container.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
	    container.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
	    
	    //
	    // Id
	    //
	    Label idLabel = new Label(container, SWT.NONE);
	    idLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).create());
	    idLabel.setText("Id : ");
	    
	    idText = new Text(container, SWT.BORDER);
	    idText.setLayoutData(GridDataFactory.fillDefaults().minSize(200, 0).grab(true, false).create());
	    idText.setText("");
	    
	    //
	    // Tag
	    //
	    Label tagLabel = new Label(container, SWT.NONE);
	    tagLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).create());
	    tagLabel.setText("Tag : ");
	    
	    tagText = new Text(container, SWT.BORDER);
	    tagText.setLayoutData(GridDataFactory.fillDefaults().minSize(200, 0).grab(true, false).create());
	    tagText.setText("");
	    
	    //
	    // Min
	    //
	    Label minLabel = new Label(container, SWT.NONE);
	    minLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).create());
	    minLabel.setText("Min : ");
	    
	    minText = new Text(container, SWT.BORDER);
	    minText.setLayoutData(GridDataFactory.fillDefaults().minSize(200, 0).grab(true, false).create());
	    minText.setText("");
	    minText.addKeyListener(new KeyListener() {
			@Override
			public void keyReleased(KeyEvent e) {
				min = minText.getText();
			}
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
	    
	    //
	    // Max
	    //
	    Label maxLabel = new Label(container, SWT.NONE);
	    maxLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).create());
	    maxLabel.setText("Max : ");
	    
	    maxText = new Text(container, SWT.BORDER);
	    maxText.setLayoutData(GridDataFactory.fillDefaults().minSize(200, 0).grab(true, false).create());
	    maxText.setText("");
	    maxText.addKeyListener(new KeyListener() {
			@Override
			public void keyReleased(KeyEvent e) {
				max = maxText.getText();
			}
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
	    
	    return composite;
	}
	
	@Override
	public Object[] getResult() {
		DataType data = _5Factory.eINSTANCE.createDataType();
		data.setId("");
		data.setMinValue(min);
		data.setMaxValue(max);
		return new Object[] { data };
	}
}
