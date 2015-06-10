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

package net.sf.smbt.ui.widgets.dialogs;

import net.sf.smbt.ui.colors.UbiWheelColorPicker;
import net.sf.smbt.ui.widgets.common.ColorsUtil;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.SelectionDialog;

public class UbiColorPickerDialog extends SelectionDialog {
	private UbiWheelColorPicker colorWheel;
	public UbiColorPickerDialog(Shell parentShell) {
		super(parentShell);
		setShellStyle(SWT.CLOSE);
		setTitle("Color Selection");
	    setSelectionResult(new Object[] { new RGB(255, 255, 255) });
	}
	
    protected Control createDialogArea(Composite parent) {
    	parent.setBackground(ColorsUtil.BG);

        Composite composite = (Composite) super.createDialogArea(parent);
        composite.setBackground(ColorsUtil.BG);
        composite.setLayout(GridLayoutFactory.fillDefaults().create());
        composite.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.TOP).grab(true, true).create());
        
        // Create label
        createMessageArea(composite);
		colorWheel = new UbiWheelColorPicker(composite);
		colorWheel.setLayout(GridLayoutFactory.fillDefaults().create());
		colorWheel.setLayoutData(GridDataFactory.fillDefaults().hint(200, 250).minSize(200, 250).align(SWT.CENTER, SWT.TOP).grab(false, true).create());
		colorWheel.setBackground(ColorsUtil.BG);
		
		
		Label filler = new Label(composite, SWT.NONE);
		filler.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.BOTTOM).hint(SWT.DEFAULT, 30).grab(true, true).create());
		
		parent.layout(true);
		parent.pack(true);
		
		return composite;
	}
	
	public RGB getRGB() {
		return colorWheel.getRGB();
	}
	
	@Override
	public Object[] getResult() {
		return new Object[]{colorWheel.getRGB()};
	}
}
