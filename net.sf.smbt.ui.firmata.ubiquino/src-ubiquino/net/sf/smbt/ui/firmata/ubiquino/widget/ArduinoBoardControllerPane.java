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

package net.sf.smbt.ui.firmata.ubiquino.widget;

import net.sf.smbt.firmata.ubiquino.Ubiquino;
import net.sf.smbt.ui.hmi.GUIToolkit;
import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class ArduinoBoardControllerPane extends Composite {
	private ArduinoBoardControllerWidget widget;
	private CmdPipe pipe;
	public CmdPipe getPipe() {
		return pipe;
	}
	public ArduinoBoardControllerWidget getWidget() {
		return widget;
	}
	public ArduinoBoardControllerPane(Composite parent, Ubiquino ubiquino) {
		this(parent, ubiquino, null);
	}
	public ArduinoBoardControllerPane(Composite parent, Ubiquino ubiquino, CmdPipe pipe) {
		super(parent, SWT.NONE);
		setBackground(GUIToolkit.BG);
		setLayout(GridLayoutFactory.fillDefaults().margins(0, 0).spacing(0, 0).extendedMargins(0, 0, 0, 0).create());
		setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		this.pipe = pipe;
		createContent(this, ubiquino, pipe);
	}
	
	private void createContent(final Composite parent, Ubiquino ubiquino, CmdPipe pipe) {
		widget = new ArduinoBoardControllerWidget(parent, ubiquino, pipe);
	}
	
	public void updatePipe(CmdPipe pipe) {
		if (widget != null && pipe != null) {
			this.pipe = pipe;
			widget.updatePipe(pipe);
		}
	}
	
	public void setInput(Object input) {
		//getViewer().setInput(input);
	}
	
	public void refresh(boolean ddo) {
		///getViewer().refresh(ddo);
	}
}
