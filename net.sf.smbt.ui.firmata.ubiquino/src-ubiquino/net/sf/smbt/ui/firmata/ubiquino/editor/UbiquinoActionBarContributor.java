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

package net.sf.smbt.ui.firmata.ubiquino.editor;

import net.sf.smbt.firmata.ubiquino.ui.Activator;
import net.sf.smbt.ui.firmata.ubiquino.actions.ConnectArduinoAction;
import net.sf.smbt.ui.firmata.ubiquino.actions.DumpArduinoOSCAction;
import net.sf.smbt.ui.firmata.ubiquino.protocol.ConnectFirmataUtil;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.part.EditorActionBarContributor;


public class UbiquinoActionBarContributor extends EditorActionBarContributor {
	private ConnectArduinoAction connectArduinoAction;
	//private ResetFirmataArduinoInfoAction resetFirmataAction;
	private DumpArduinoOSCAction dumpFirmataAsOSCAction;
	private UbiquinoEditor ubiquinoEditor;

	public UbiquinoActionBarContributor() {
		//
		// Connect Arduino
		//
		connectArduinoAction = new ConnectArduinoAction(ConnectArduinoAction.ID, "Connect") {
			@Override
			public void runWithEvent(Event event) {
				run();
			}
			@Override
			public void run(IAction action) {
				run();
			}
			public void run() {
				ConnectFirmataUtil.INSTANCE.invokeWizard(ubiquinoEditor);
			}
		};	
		connectArduinoAction.setText("Connection To Arduino");
		connectArduinoAction.setToolTipText("Connection To Arduino");
		connectArduinoAction.setImageDescriptor(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.firmata.ubiquino", 
				"icons/arduino-add.png"
			)
		);
		
		//
		// Firmata reset
		//
		
	/*	
		resetFirmataAction = new ResetFirmataArduinoInfoAction(ResetFirmataArduinoInfoAction.ID, "Reset") {
			@Override
			public void runWithEvent(Event event) {
				run();
			}
			@Override
			public void run(IAction action) {
				run();
			}
			public void run() {
				CmdPipe pipe = ubiquinoEditor.getUbiquino().getDefault();
				if (pipe instanceof CmdPipe) {
					pipe.send(FirmataCmdUtils.INSTANCE.createCapabiltiesQuery());
					//pipe.send(FirmataCmdUtils.INSTANCE.createProtocolVersionQuery());
				}
				pipe.setLocked(true);			
			}
		};
		resetFirmataAction.setText("Reset Firmata Info From Arduino");
		resetFirmataAction.setToolTipText("Reset Firmata Info From Arduino");
		resetFirmataAction.setImageDescriptor(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.firmata.ubiquino", 
				"icons/arduino-refresh.png"
			)
		);
		*/
		//
		// OSC dump
		//
		dumpFirmataAsOSCAction = new DumpArduinoOSCAction(DumpArduinoOSCAction.ID, "Dump Firmata As OSC") {
			@Override
			public void runWithEvent(Event event) {
				run();
			}
			@Override
			public void run(IAction action) {
				run();
			}
			public void run() {
				setToggled(!isToggled());
				setUbiquino(ubiquinoEditor.getUbiquino());
				ubiquinoEditor.toggleOscFirmataDump(isToggled());
			}
		};	
		dumpFirmataAsOSCAction.setText("Dump Firmata As OSC");
		dumpFirmataAsOSCAction.setToolTipText("Dump Firmata As OSC");
		dumpFirmataAsOSCAction.setImageDescriptor(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.firmata.ubiquino", 
				"icons/dump.png"
			)
		);
	}
	
	@Override
	public void contributeToToolBar(IToolBarManager toolBarManager) {
		toolBarManager.add(new Separator());
		toolBarManager.add(connectArduinoAction);
		//toolBarManager.add(resetFirmataAction);
		toolBarManager.add(dumpFirmataAsOSCAction);
	}
	
	public void setActiveEditor(IEditorPart part) {
	    IActionBars actionBars = getActionBars();
	    if (actionBars != null && part instanceof UbiquinoEditor) {
	    	ubiquinoEditor = (UbiquinoEditor) part;
	        actionBars.setGlobalActionHandler(ConnectArduinoAction.ID, 	connectArduinoAction);
	        connectArduinoAction.setEnabled(true);
//	        actionBars.setGlobalActionHandler(ResetFirmataArduinoInfoAction.ID, resetFirmataAction);
//	        resetFirmataAction.setEnabled(true);
	        actionBars.setGlobalActionHandler(DumpArduinoOSCAction.ID, 	dumpFirmataAsOSCAction);
	        dumpFirmataAsOSCAction.setEnabled(true);
	    }
	}
	
	public void contributeToMenu(IMenuManager manager) {
		IMenuManager menu = new MenuManager("Ubiquino");
		manager.prependToGroup(IWorkbenchActionConstants.MB_ADDITIONS, menu);
		menu.add(connectArduinoAction);
//		menu.add(resetFirmataAction);
		menu.add(dumpFirmataAsOSCAction);
	}
}
