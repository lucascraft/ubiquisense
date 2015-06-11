/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2015, Lucas Bigeardel
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

package net.sf.smbt.ui.firmata.ubiquino.protocol;

import gnu.io.CommPortIdentifier;
import net.sf.smbt.firmata.ubiquino.Ubiquino;
import net.sf.smbt.firmata.ubiquino.core.IFirmataInitDoneListener;
import net.sf.smbt.firmata.ubiquino.core.UbiquinoUtils;
import net.sf.smbt.firmata.ubiquino.ui.Activator;
import net.sf.smbt.quantic.services.XCPAddressUtils;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.smbt.ui.arduino.wizards.ArduinoConfigWizardDialog;
import net.sf.smbt.ui.firmata.ubiquino.editor.UbiquinoEditor;
import net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.ArduinoConfig;
import net.sf.smbt.xcp.XCPAddress;
import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.progress.UIJob;

public class ConnectFirmataUtil {

	public static ConnectFirmataUtil INSTANCE = new ConnectFirmataUtil();
	
	private boolean checkIfArduinoConnectionAlreadyExistAndAskForReplace(CommPortIdentifier io, UbiquinoEditor ubiquinoEditor) {
		if (ubiquinoEditor != null && ubiquinoEditor.getUbiquino() != null) {
			return true;
		} else {
			MessageDialog dlg = new MessageDialog(
				Display.getDefault().getActiveShell(),
				"Arduino connection question",
				Activator.getImageDescriptor("icons/arduino.png").createImage(),
				"Arduino connection already active !\nWould you want to replace it ?",
				MessageDialog.QUESTION_WITH_CANCEL,
				new String[] { 
					"Yes", 
					"No", 
					"Cancel" 
				},
				0
			);
			return dlg.open() == 0;
		}
	}
	
	public void invokeWizard(final UbiquinoEditor ubiquinoEditor) {
		ArduinoConfigWizardDialog arduinoConfigWizardDialog = new ArduinoConfigWizardDialog();
		int status = arduinoConfigWizardDialog.open();
		if (status == Window.OK) {
			ArduinoConfig cfg = arduinoConfigWizardDialog.getArduinoConfiguration();
			if (cfg != null) {
				CommPortIdentifier obj = cfg.getUsbComm();
				if (obj instanceof CommPortIdentifier) {
					if (checkIfArduinoConnectionAlreadyExistAndAskForReplace(obj, ubiquinoEditor)) {
						final CmdPipe arduinoPipe = QuanticMojo.INSTANCE.openUsbPipe(
							"firmata", 
							((CommPortIdentifier)obj).getName(), 
							cfg.getUsbSpeed()
						);
												
						if (arduinoPipe != null) {
							XCPAddress addr = XCPAddressUtils.INSTANCE.createEzTarget(arduinoPipe);
							ubiquinoEditor.getUbiquino().setLastAddress(addr);
							//ubiquinoEditor.getUbiquino().setDefault(arduinoPipe);
							
							//
							// Query capabilities which response should trigger GUI create driven by ports/resolution
							//
							
							if (addr != null) {
								//CmdPipe pipe = XCPAddressUtils.INSTANCE.getCmdPipe(addr, true);
								UbiquinoUtils.INSTANCE.initFirmata(
									ubiquinoEditor.getUbiquino(), 
									arduinoPipe, 
									new IFirmataInitDoneListener() {
									@Override
										public void handleInitFirmataDone(Ubiquino ubiquino, CmdPipe arduinoPipe) {
											new FirmataConnectionJob(ubiquinoEditor).schedule(2000);
										}
									}
								);
								
								ubiquinoEditor.updateUbiquinoUI(arduinoPipe);
								arduinoPipe.setLocked(true);
							}
						}
					}
				}		
			}
		}
	}
	
	public class FirmataConnectionJob extends UIJob {
		UbiquinoEditor ubiquinoEditor;
		public FirmataConnectionJob(UbiquinoEditor ue) {
			super("Initializing Firmata UI");
			setPriority(INTERACTIVE);
			setUser(true);
			setSystem(false);
			ubiquinoEditor = ue;
		}
		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			ubiquinoEditor.createUbiquinoUI();
			return Status.OK_STATUS;
		}
	}
}
