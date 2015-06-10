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

package net.sf.smbt.ui.firmata.ubiquino.widget;

import net.sf.smbt.firmata.ubiquino.Ubiquino;
import net.sf.smbt.mdl.arduino.Arduino;
import net.sf.smbt.ui.hmi.GUIToolkit;
import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class ArduinoBoardControllerContainer extends Composite {
	private Arduino board;
	private ArduinoBoardControllerPane pane;

	public ArduinoBoardControllerPane getPane() {
		return pane;
	}
	public ArduinoBoardControllerContainer(Composite parent, Ubiquino ubiquino, CmdPipe pipe) {
		super(parent, SWT.NONE);
		board = ubiquino.getBoard();
		setBackground(GUIToolkit.BG);
		pane = new ArduinoBoardControllerPane(this, ubiquino, pipe);
	}
	public void updatePipe(CmdPipe pipe) {
		pane.updatePipe(pipe);
	}
	public void refresh(boolean d) {
		pane.refresh(d);
		pane.layout(true);
	}
	
	public void setInput(Object input) {
		pane.setInput(input);
	}
	
	public Arduino getBoard() {
		return board;
	}
}
