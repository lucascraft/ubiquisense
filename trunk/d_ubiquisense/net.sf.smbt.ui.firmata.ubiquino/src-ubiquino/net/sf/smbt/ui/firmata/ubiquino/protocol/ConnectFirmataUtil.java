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
import net.sf.smbt.firmata.ubiquino.PortConfig;
import net.sf.smbt.firmata.ubiquino.PortConfigKind;
import net.sf.smbt.firmata.ubiquino.Ubiquino;
import net.sf.smbt.firmata.ubiquino.core.UbiquinoUtils;
import net.sf.smbt.firmata.ubiquino.ui.Activator;
import net.sf.smbt.firmata.utils.FirmataCmdUtils;
import net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID;
import net.sf.smbt.mdl.arduino.ARDUINO_FIRMWARE_MODE;
import net.sf.smbt.mdl.arduino.AnalogPort;
import net.sf.smbt.mdl.arduino.Arduino;
import net.sf.smbt.mdl.arduino.DigitalPort;
import net.sf.smbt.midi.ezmidi.DSLMidiMessage;
import net.sf.smbt.protocol.ezfirmata.FirmataPinStateResponse;
import net.sf.smbt.quantic.services.XCPAddressUtils;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.smbt.ui.arduino.wizards.ArduinoConfigWizardDialog;
import net.sf.smbt.ui.firmata.ubiquino.editor.UbiquinoEditor;
import net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.ArduinoConfig;
import net.sf.smbt.xcp.XCPAddress;
import net.sf.xqz.engine.cmd.utils.CmdUtil;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.cmd.CompoundCmd;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.EVENT_KIND;
import net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
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
						
						arduinoPipe.getRx().setTtl(1000);
						arduinoPipe.getRx().setThreshold(5000);

						arduinoPipe.getTx().setTtl(1000);
						arduinoPipe.getTx().setThreshold(5000);
						
						if (arduinoPipe != null) {
							XCPAddress addr = XCPAddressUtils.INSTANCE.createEzTarget(arduinoPipe);
							ubiquinoEditor.getUbiquino().setLastAddress(addr);
							//ubiquinoEditor.getUbiquino().setDefault(arduinoPipe);
							
							//
							// Query capabilities which response should trigger GUI create driven by ports/resolution
							//
							
							if (addr != null) {
								//CmdPipe pipe = XCPAddressUtils.INSTANCE.getCmdPipe(addr, true);
								if (arduinoPipe instanceof CmdPipe) {
									arduinoPipe.addQxEventHandler(
											new AbstractQxEventHandlerImpl() {
												public void handleQxEvent(final net.sf.xqz.model.engine.Event event) {
													if (event.getKind().equals(EVENT_KIND.RX_DONE)) {
														if (event.getCmd() instanceof CompoundCmd) {
															for (Cmd cmd : ((CompoundCmd)event.getCmd()).getChildren()) {
																processCmd(cmd, ubiquinoEditor, arduinoPipe);
															}
														} else {
															processCmd(event.getCmd(), ubiquinoEditor, arduinoPipe);
														}
													}
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
	}
	private void updateBoard(UbiquinoEditor ubiquinoEditor, FirmataPinStateResponse response) {			
		Arduino board = ubiquinoEditor.getUbiquino().getBoard();
	
		PortConfigKind cfgKind = PortConfigKind.UNKNOWN;
		if (response.getModel()==2) {
		cfgKind = PortConfigKind.ANALOGIC;
		} else if (response.getModel()==1) {
		cfgKind = PortConfigKind.DIGITAL;
		}
		PortConfig p = UbiquinoUtils.INSTANCE.createPortCfg(cfgKind, response.getPin(), response.getChannel());
		if (cfgKind==PortConfigKind.ANALOGIC) {
		board.getAnalogPorts().add((AnalogPort)p.getTarget());
		} else if (cfgKind==PortConfigKind.DIGITAL) {
		board.getDigitalPorts().add((DigitalPort)p.getTarget());
		}
		ubiquinoEditor.getUbiquino().getConfig().getPorts().add(p);
		
	}
	public void processCmd(Cmd cmd, UbiquinoEditor ubiquinoEditor, final CmdPipe arduinoPipe) {
		if (cmd instanceof DSLMidiMessage) {
			DSLMidiMessage sysex  = (DSLMidiMessage) cmd;
			String kind = ubiquinoEditor.getKind((byte)sysex.getCmd());
			if ("0x6a".equals(kind)) {
				System.out.println("Analog mapping response");
				int pin = 0;
				for (int i=2;i<sysex.getMessage().length-3;i++) {
					byte mapping = sysex.getMessage()[i];
					if (mapping != 0x7f) {
						
						
						for (PortConfig p : ubiquinoEditor.getUbiquino().getConfig().getPorts()) {
							if (p.getTarget().getMap().getValue() == pin) {
								System.out.println("pin " + pin + " <--> channel : " + CmdUtil.INSTANCE.getFrameHexInfo(new byte[]{mapping}));
								p.setChannel(mapping);
								p.getTarget().setChannel(mapping);
							}
						}
					}
					pin++;
				}
				
			} else if ("0x6e".equals(kind)) {
				byte[] bytes = sysex.getMessage();
	
				FirmataPinStateResponse response = FirmataCmdUtils.INSTANCE.createPinStateResponse(bytes);
				
				if (Platform.inDebugMode()) {
					System.out.println("------> RCV : Port " + response.getPin() + ", channel : " + response.getChannel() + ", mode : " + response.getModel() + ", value : " + (int)response.getValue() + " ==> " + CmdUtil.INSTANCE.getFrameHexInfo(response.getMessage()));
				}
				
				updateBoard(ubiquinoEditor, response);
				
				arduinoPipe.send(FirmataCmdUtils.INSTANCE.createAnalogMappingQuery());
	
			} else if ("0x6c".equals(kind)) {
				byte[] capabilties = sysex.getMessage();
								
				if (Platform.inDebugMode()) {
					System.out.println("Capabilities Frame : " + CmdUtil.INSTANCE.getFrameHexInfo(capabilties));
				}
				
				//
				// Init from capabilities response
				//
				long[]  supported_modes = new long[128];
				if (capabilties != null && capabilties.length>0) {
																					
					int pin, i, n;
					for (pin=0; pin < 128; pin++) {
						supported_modes[pin] = 0;
					}
					for (i=2, n=0, pin=0; i<capabilties.length; i++) {
						if (capabilties[i] == 127) {
							pin++;
							n = 0;
							continue;
						}
						if (n == 0) {
							// first byte is supported mode
							supported_modes[pin] |= (1<<capabilties[i]);
							System.out.println(i+ " --> Pin #"+pin + " : ");
						}
						n = n ^ 1;
					}
																						
					byte[] message = new byte[512];
					int len = 0;
					// send a state query for for every pin with any modes
					for (pin=0; pin < 128; pin++) {
						if (supported_modes[pin] != 0) {
							// 0x6D																		
							//if (Platform.inDebugMode()) {
								System.out.println("Query pin #" + pin + " current state");
							//}
							message[len++] = (byte) 0xf0;
							message[len++] = (byte) 0x6d;
							message[len++] = (byte) pin;
							message[len++] = (byte) 0xF7;
						}																		
					}
	
					//
					// !!! Update here arduino model from queried capabilities !!!
					//
					arduinoPipe.send(message);
					
					new FirmataConnectionJob(ubiquinoEditor).schedule(2000);
				}
			} else if ("0xf9".equals(kind)) {
				int major = Integer.valueOf(sysex.getByte1());
				int minor = Integer.valueOf(sysex.getByte2());
																				
				System.out.println("Firmata ver. " + major +"." + minor);
				
				Ubiquino newUbiquino = UbiquinoUtils.INSTANCE.createArduinoBoard(
					ARDUINO_BOARD_UID.PLACEHOLDER_VOID_BOARD,
					getFirmwareMode(major, minor)
				);
						
				ubiquinoEditor.getUbiquino().setBoard(newUbiquino.getBoard());
				
				new UIJob("Firmata capabilities query job") {
					@Override
					public IStatus runInUIThread(IProgressMonitor monitor) {
						System.out.println("Query board for Firmata capabilities");
						arduinoPipe.send(FirmataCmdUtils.INSTANCE.createCapabiltiesQuery());					
						return Status.OK_STATUS;
					}
				}.schedule(50L);
			} else {
				
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
	
	public static String bytesToStringUTFCustom(byte[] bytes) {
		char[] buffer = new char[bytes.length >> 1];
		for(int i = 0; i < buffer.length; i++) {
			int bpos = i << 1;
			char c = (char)((bytes[bpos] & 0x7F) | ((bytes[bpos] & 0x7F) << 7));
			buffer[i] = c;
		}
		return new String(buffer);
	}
	
	public ARDUINO_FIRMWARE_MODE getFirmwareMode(int major, int minor) {
		ARDUINO_FIRMWARE_MODE firmwareMode = ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V23;
		if (major == 1 && minor == 0) {
			firmwareMode = ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V10;
		} else if (major == 1 && minor == 1) {
			firmwareMode = ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V11;
		} else if (major == 2 && minor == 0) {
			firmwareMode = ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V20;
		} else if (major == 2 && minor == 1) {
			firmwareMode = ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V21;
		} else if (major == 2 && minor == 2) {
			firmwareMode = ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V22;
		} else if (major == 2 && minor == 3) {
			firmwareMode = ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V23;
		}
		return firmwareMode;
	}

	
}
