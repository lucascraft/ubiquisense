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

package net.sf.smbt.rcp.proximisense;

import org.eclipse.core.runtime.IProduct;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.about.InstallationPage;
import org.eclipse.ui.internal.WorkbenchMessages;

@SuppressWarnings("restriction")
public class UbiquisenseInstallationPage extends InstallationPage {

	public UbiquisenseInstallationPage() {
		
	}

	private IProduct product;

	private String productName;

	protected IProduct getProduct() {
		if (product == null)
			product = Platform.getProduct();
		return product;
	}

	public String getProductName() {
		if (productName == null) {
			if (getProduct() != null) {
				productName = getProduct().getName();
			}
			if (productName == null) {
				productName = WorkbenchMessages.AboutDialog_defaultProductName;
			}
		}
		return productName;
	}

	public void setProductName(String name) {
		productName = name;
	}


	protected Composite createOuterComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridData gd = new GridData(SWT.FILL, SWT.FILL, true, true);
		composite.setLayoutData(gd);
		GridLayout layout = new GridLayout();
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		composite.setLayout(layout);
		return composite;
	}
	public String getId() {
		return "net.sf.smbt.rcp.proximisense.page";
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(GridLayoutFactory.fillDefaults().create());
		container.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		container.setForeground(Display.getDefault().getSystemColor(SWT.COLOR_DARK_GRAY));
		container.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_DARK_GRAY));
		
		Label canvas = new Label(container, SWT.NONE);
		canvas.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.DEFAULT).grab(true, true).create());
		canvas.setImage(Activator.getImageDescriptor("ubqt.jpg").createImage());
		
		Label text = new Label(container, SWT.NONE);
		text.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.DEFAULT).grab(true, false).create());
		text.setText("Ubiquisense.\n\nAn Eclipse based ubiquitous computing framework.\n\nLucas Bigeardel 2007 - 2012 ©");
		
		setControl(container);
	}
}
