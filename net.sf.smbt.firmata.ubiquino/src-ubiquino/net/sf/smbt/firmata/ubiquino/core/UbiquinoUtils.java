/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2008 - 2012, Lucas Bigeardel
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

package net.sf.smbt.firmata.ubiquino.core;

import java.io.IOException;
import java.util.HashMap;

import net.sf.smbt.arduino.utils.ArduinoBoardUtils;
import net.sf.smbt.arduino.utils.IPortListener;
import net.sf.smbt.firmata.ubiquino.PortConfig;
import net.sf.smbt.firmata.ubiquino.PortConfigKind;
import net.sf.smbt.firmata.ubiquino.Ubiquino;
import net.sf.smbt.firmata.ubiquino.UbiquinoConfig;
import net.sf.smbt.firmata.ubiquino.UbiquinoFactory;
import net.sf.smbt.firmata.ubiquino.UbiquinoPackage;
import net.sf.smbt.firmata.utils.FirmataCmdUtils;
import net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID;
import net.sf.smbt.mdl.arduino.ARDUINO_FIRMWARE_MODE;
import net.sf.smbt.mdl.arduino.ARDUINO_REPORT_MODE;
import net.sf.smbt.mdl.arduino.AnalogPort;
import net.sf.smbt.mdl.arduino.Arduino;
import net.sf.smbt.mdl.arduino.ArduinoFactory;
import net.sf.smbt.mdl.arduino.ArduinoPackage;
import net.sf.smbt.mdl.arduino.DigitalPort;
import net.sf.smbt.mdl.arduino.PIN_MAPPING;
import net.sf.smbt.mdl.arduino.PIN_MODE;
import net.sf.smbt.mdl.arduino.PWM_MODE;
import net.sf.smbt.mdl.arduino.Port;
import net.sf.smbt.midi.ezmidi.DSLMidiMessage;
import net.sf.smbt.midi.ezmidi.NoteON;
import net.sf.smbt.midi.ezmidi.SysexMessage;
import net.sf.smbt.protocol.ezfirmata.FirmataProtocolVersionCmd;
import net.sf.smbt.xcp.XcpPackage;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.cmd.CompoundCmd;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.Qx;
import net.sf.xqz.model.temporal.TemporalPackage;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.part.FileEditorInput;

public class UbiquinoUtils {
	
	public final static UbiquinoUtils INSTANCE = new UbiquinoUtils();
	
	//
	//
	// Ubiquino / Firmata / Sysex Event handling
	//
	//
	
	public PortConfig createPortCfg(PortConfigKind cfgKind, int pinNumber, int channel) {
		Port p = cfgKind==PortConfigKind.ANALOGIC?ArduinoFactory.eINSTANCE.createAnalogPort():ArduinoFactory.eINSTANCE.createDigitalPort();
		PIN_MAPPING pinMapping = PIN_MAPPING.UNKNOWN;
		if (cfgKind==PortConfigKind.ANALOGIC) {
			pinMapping = UbiquinoUtils.INSTANCE.getMappingFromKindAndNumber(true, pinNumber);
		} else if (cfgKind==PortConfigKind.DIGITAL) {
			pinMapping = UbiquinoUtils.INSTANCE.getMappingFromKindAndNumber(false, pinNumber);
		}
		p.setMap(pinMapping);
		p.setReport(ARDUINO_REPORT_MODE.DEACTIVATE);					
		
		PortConfig pCfg = UbiquinoFactory.eINSTANCE.createPortConfig();
		pCfg.setEnabled(true);
		pCfg.setKind(cfgKind);
		pCfg.setMode(cfgKind==PortConfigKind.ANALOGIC?PIN_MODE.ANALOG:PIN_MODE.INPUT);
		pCfg.setPwm(PWM_MODE.NONE);
		pCfg.setTarget(p);
		pCfg.setChannel(channel);
		
		return pCfg;
	}

	public Ubiquino updateArduinoBoard(Ubiquino ubiquino, ARDUINO_BOARD_UID boardID, ARDUINO_FIRMWARE_MODE firmataMode, CmdPipe engine) {
		
		Arduino arduinoBoard	= ubiquino.getBoard();
		UbiquinoConfig config 	= ubiquino.getConfig();
		
		if (arduinoBoard != null) {
			arduinoBoard.setFirmataMode(firmataMode);
			arduinoBoard.setKind(boardID);
			if (engine != null) {
				for (DigitalPort dp : arduinoBoard.getDigitalPorts()) {
					arduinoBoard.getPortsToListen().add(new PortListener(dp, engine.getTx()));
					arduinoBoard.reportDigitalPin(ARDUINO_REPORT_MODE.ACTIVATE, dp.getMap());
					
					PortConfig pCfg = UbiquinoFactory.eINSTANCE.createPortConfig();
					
					Port port = ArduinoFactory.eINSTANCE.createPort();
					port.setMap(dp.getMap());
					port.setReport(dp.getReport());
					
					pCfg.setTarget(port);
					pCfg.setKind(PortConfigKind.DIGITAL);
					
					config.getPorts().add(pCfg);
				}
				
				for (AnalogPort ap : arduinoBoard.getAnalogPorts()) {
					arduinoBoard.getPortsToListen().add(new PortListener(ap, engine.getTx()));
					arduinoBoard.reportAnalogPin(ARDUINO_REPORT_MODE.ACTIVATE, ap.getMap());

					PortConfig pCfg = UbiquinoFactory.eINSTANCE.createPortConfig();

					Port port = ArduinoFactory.eINSTANCE.createPort();
					port.setMap(ap.getMap());
					port.setReport(ap.getReport());
					
					pCfg.setTarget(port);

					pCfg.setKind(PortConfigKind.ANALOGIC);
					
					config.getPorts().add(pCfg);
				}
			}
		} else {
			throw new UnsupportedOperationException("Arduino board not supported !!!");
		}
		return ubiquino;
	}
	
	public PIN_MAPPING getMappingFromKindAndNumber(boolean isOfAnalogKind, int number) {
		if (isOfAnalogKind) {
			switch(number) {
				case 0: return PIN_MAPPING.PIN_A0;
				case 1: return PIN_MAPPING.PIN_A1;
				case 2: return PIN_MAPPING.PIN_A2;
				case 3: return PIN_MAPPING.PIN_A3;
				case 4: return PIN_MAPPING.PIN_A4;
				case 5: return PIN_MAPPING.PIN_A5;
				case 6: return PIN_MAPPING.PIN_A6;
				case 7: return PIN_MAPPING.PIN_A7;
				case 8: return PIN_MAPPING.PIN_A8;
				case 9: return PIN_MAPPING.PIN_A9;
				case 10: return PIN_MAPPING.PIN_A10;
				case 11: return PIN_MAPPING.PIN_A11;
				case 12: return PIN_MAPPING.PIN_A12;
				case 13: return PIN_MAPPING.PIN_A13;
				case 14: return PIN_MAPPING.PIN_A14;
				case 15: return PIN_MAPPING.PIN_A15;
				case 16: return PIN_MAPPING.PIN_A16;
				case 17: return PIN_MAPPING.PIN_A17;
				case 18: return PIN_MAPPING.PIN_A18;
				case 19: return PIN_MAPPING.PIN_A19;
				case 20: return PIN_MAPPING.PIN_A20;
				case 21: return PIN_MAPPING.PIN_A21;
				case 22: return PIN_MAPPING.PIN_A22;
				case 23: return PIN_MAPPING.PIN_A23;
				case 24: return PIN_MAPPING.PIN_A24;
			}
		} else {
			switch(number) {
				case 2: return PIN_MAPPING.PIN_D2;
				case 3: return PIN_MAPPING.PIN_D3;
				case 4: return PIN_MAPPING.PIN_D4;
				case 5: return PIN_MAPPING.PIN_D5;
				case 6: return PIN_MAPPING.PIN_D6;
				case 7: return PIN_MAPPING.PIN_D7;
				case 8: return PIN_MAPPING.PIN_D8;
				case 9: return PIN_MAPPING.PIN_D9;
				case 10: return PIN_MAPPING.PIN_D10;
				case 11: return PIN_MAPPING.PIN_D11;
				case 12: return PIN_MAPPING.PIN_D12;
				case 13: return PIN_MAPPING.PIN_D13;
				case 14: return PIN_MAPPING.PIN_D14;
				case 15: return PIN_MAPPING.PIN_D15;
				case 16: return PIN_MAPPING.PIN_D16;
				case 17: return PIN_MAPPING.PIN_D17;
				case 18: return PIN_MAPPING.PIN_D18;
				case 19: return PIN_MAPPING.PIN_D19;
				case 20: return PIN_MAPPING.PIN_D20;
				case 21: return PIN_MAPPING.PIN_D21;
				case 22: return PIN_MAPPING.PIN_D22;
				case 23: return PIN_MAPPING.PIN_D23;
				case 24: return PIN_MAPPING.PIN_D24;
				case 25: return PIN_MAPPING.PIN_D25;
				case 26: return PIN_MAPPING.PIN_D26;
				case 27: return PIN_MAPPING.PIN_D27;
				case 28: return PIN_MAPPING.PIN_D28;
				case 29: return PIN_MAPPING.PIN_D29;
				case 30: return PIN_MAPPING.PIN_D30;
				case 31: return PIN_MAPPING.PIN_D31;
				case 32: return PIN_MAPPING.PIN_D32;
				case 33: return PIN_MAPPING.PIN_D33;
				case 34: return PIN_MAPPING.PIN_D34;
				case 35: return PIN_MAPPING.PIN_D35;
				case 36: return PIN_MAPPING.PIN_D36;
				case 37: return PIN_MAPPING.PIN_D37;
				case 38: return PIN_MAPPING.PIN_D38;
				case 39: return PIN_MAPPING.PIN_D39;
				case 40: return PIN_MAPPING.PIN_D40;
				case 41: return PIN_MAPPING.PIN_D41;
				case 42: return PIN_MAPPING.PIN_D42;
				case 43: return PIN_MAPPING.PIN_D43;
				case 44: return PIN_MAPPING.PIN_D44;
				case 45: return PIN_MAPPING.PIN_D45;
				case 46: return PIN_MAPPING.PIN_D46;
				case 47: return PIN_MAPPING.PIN_D47;
				case 48: return PIN_MAPPING.PIN_D48;
				case 49: return PIN_MAPPING.PIN_D49;
				case 50: return PIN_MAPPING.PIN_D50;
				case 51: return PIN_MAPPING.PIN_D51;
				case 52: return PIN_MAPPING.PIN_D52;
			}
		}
		return PIN_MAPPING.UNKNOWN;
	}
	
	public Ubiquino createArduinoBoard(ARDUINO_BOARD_UID boardID, ARDUINO_FIRMWARE_MODE firmataMode) {
		Ubiquino ubiquino = UbiquinoFactory.eINSTANCE.createUbiquino();
		
		Arduino arduinoBoard = ArduinoBoardUtils.INSTANCE.getSupportedArduinoDevices().get(boardID);
		arduinoBoard.setKind(boardID);
		ubiquino.setBoard(arduinoBoard);
		
		UbiquinoConfig config = UbiquinoFactory.eINSTANCE.createUbiquinoConfig();
		ubiquino.setConfig(config);
		
		if (arduinoBoard != null) {
			arduinoBoard.setFirmataMode(firmataMode);
		} 

		return EcoreUtil.copy(ubiquino);
	}
	
	
	public Ubiquino createVoidArduinoBoard(ARDUINO_FIRMWARE_MODE firmataMode) {
		Ubiquino ubiquino = UbiquinoFactory.eINSTANCE.createUbiquino();
		
		Arduino arduinoBoard = ArduinoBoardUtils.INSTANCE.getSupportedArduinoDevices().get(ARDUINO_BOARD_UID.PLACEHOLDER_VOID_BOARD);
		arduinoBoard.setKind(ARDUINO_BOARD_UID.PLACEHOLDER_VOID_BOARD);
		ubiquino.setBoard(arduinoBoard);
		
		UbiquinoConfig config = UbiquinoFactory.eINSTANCE.createUbiquinoConfig();
		ubiquino.setConfig(config);
		
		if (arduinoBoard != null) {
			arduinoBoard.setFirmataMode(firmataMode);
		} 

		return EcoreUtil.copy(ubiquino);
	}
	
	/*
	 * 
	 */
	private class PortListener implements IPortListener {
		Port _port;
		Qx _qx;
		
		public PortListener(Port _p, Qx _q) {
			_port = _p;
			_qx = _q;
		}
		
		@Override
		public PIN_MAPPING getMonitoredPort() {
			return _port.getMap();
		}
		
		@Override
		public void handleDigitalOutputMessage(DigitalPort port, int oldValue, int newValue) {
			if (port == _port) {
				if (oldValue == newValue) {
					return; // Stupid ...
				}
				if (port.eContainer() != null && port.eContainer() instanceof Arduino) {
					Arduino board = (Arduino) port.eContainer();
					if (board.isSynchronizing() && port.getMap().equals(board.getLockedPin())) {
						return; // Bounce the event while device input synch is on its way
					}
					ARDUINO_FIRMWARE_MODE mode = board.getFirmataMode();
					if ( mode.equals(ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V23_I2C)
							|| mode.equals(ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V22_I2C)
							|| mode.equals(ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V21_I2C)
							|| mode.equals(ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V20_I2C)
					) { 
						throw new UnsupportedOperationException("FIRMATA I2C MODE NOT IMPLEMENTED YET");
//						_qx.postCommand(
//							FirmataCmdUtils.INSTANCE.createFIRMATA_DIGITAL_IO_MSG_CMD(port.getMap().getValue(), newValue)
//						);
					} else if (mode.equals(ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V23)
							|| mode.equals(ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V22)
							|| mode.equals(ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V21)
							|| mode.equals(ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V20)
					) {
						DSLMidiMessage msg = FirmataCmdUtils.INSTANCE.createDigitalIO(
								port.getMap().getValue(), 
								newValue);
						_qx.postCommand(msg);
					} else if (mode.equals(ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V23_SERVO)
							|| mode.equals(ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V22_SERVO)
							|| mode.equals(ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V21_SERVO)
							|| mode.equals(ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V20_SERVO)
					) {
						throw new UnsupportedOperationException("FIRMATA SERVO MODE NOT IMPLEMENTED YET");
//						_qx.postCommand(
//							FirmataCmdUtils.INSTANCE.createFIRMATA_DIGITAL_IO_MSG_CMD(port.getMap().getValue(), newValue)
//						);
					} else {
						throw new UnsupportedOperationException("The board is not configured for Firmata support : set firmataMode first before being able to snd/rcv firmata sysex messages");
					}
				}
			}
		}
		@Override
		public void handleAnalogicOutputMessage(AnalogPort port, float oldValue, float newValue) {
			if (oldValue == newValue) {
				return; // Stupid ...
			}
			if (port == _port) {
				if (port.eContainer() != null && port.eContainer() instanceof Arduino) {
					Arduino board = (Arduino) port.eContainer();
					if (board.isSynchronizing() && port.getMap().equals(board.getLockedPin())) {
						return; // Bounce the event while device input synch is on its way. Eg: avoid infinite loop
					}
					ARDUINO_FIRMWARE_MODE mode = board.getFirmataMode();
					if (   mode.equals(ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V23_I2C)
						|| mode.equals(ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V22_I2C)
						|| mode.equals(ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V21_I2C)
						|| mode.equals(ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V20_I2C)
					) { 
						throw new UnsupportedOperationException("FIRMATA I2C MODE NOT IMPLEMENTED YET");
//						_qx.postCommand(
//							FirmataCmdUtils.INSTANCE.createFIRMATA_ANALOG_IO_MSG_CMD(port.getMap().getValue(), newValue)
//						);
					} else if (mode.equals(ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V23)
							|| mode.equals(ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V22)
							|| mode.equals(ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V21)
							|| mode.equals(ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V20)
					) {
						DSLMidiMessage msg = FirmataCmdUtils.INSTANCE.createAnalogIO(port.getMap().getValue(), newValue);
						_qx.postCommand(msg);
					} else if (mode.equals(ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V23_SERVO)
							|| mode.equals(ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V22_SERVO)
							|| mode.equals(ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V21_SERVO)
							|| mode.equals(ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V20_SERVO)
					) {
						throw new UnsupportedOperationException("FIRMATA SERVO MODE NOT IMPLEMENTED YET");
//						_qx.postCommand(
//							FirmataCmdUtils.INSTANCE.createFIRMATA_ANALOG_IO_MSG_CMD(port.getMap().getValue(), newValue)
//						);
					} else {
						throw new UnsupportedOperationException("The board is not configured for Firmata support : set firmataMode first before being able to snd/rcv firmata sysex messages");
					}
				}
			}
		}
		
		@Override
		public void handleDigitalInputMessage(DigitalPort port, int oldValue, int newValue) {
			if (port == _port) {
				if (port.eContainer() != null && port.eContainer() instanceof Arduino) {
					Arduino board = ((Arduino)port.eContainer());
					synchronized(board) {
						board.setSynchronizing(true);
						board.setLockedPin(port.getMap());
						if (oldValue != newValue) {
							port.setValue(newValue);
						}
					}
				}
			}
		}
		
		@Override
		public void handleAnalogicInputMessage(AnalogPort port, float oldValue, float newValue) {
			if (port == _port) {
				if (port.eContainer() != null && port.eContainer() instanceof Arduino) {
					Arduino board = ((Arduino)port.eContainer());
					synchronized(board) {
						board.setSynchronizing(true);
						board.setLockedPin(port.getMap());
						if (oldValue != newValue) {
							port.setValue(newValue);
						}
					}
				}
			}
		}
		
		@Override
		public void handleDigitalPortModeChange(DigitalPort port, float oldValue, float newValue) {
			
		}
	}

	//
	// Think compound
	//
	public void handleUbiquinoSysexCmdEvent(Arduino board, Cmd cmd) {
		if (cmd instanceof CompoundCmd) {
			for (Cmd c : ((CompoundCmd)cmd).getChildren()) {
				if (c instanceof Cmd) {
					handleUbiquinoSysexCmdEvent(board, c);
				}
			}
		} else {
			processUbiquinoSysexMessage(board, cmd);
		}
	}
	
	
	public void processUbiquinoSysexMessage(Arduino board, Cmd cmd) {
		//
		// Lets only consider Analog and Digital I/O messages first
		//
		if (board==null) return;
		
		if (cmd instanceof NoteON) {
			NoteON noteON = (NoteON) cmd;
			if (noteON.getCmd() == Integer.decode("0x90")) {
				int channel = noteON.getChannel();
				DigitalPort port = board.getDigitalPortFromChannel(channel);
				if (port != null) {
					int value = noteON.getByte1()<<7 | noteON.getByte2();
					if (Platform.inDebugMode()) {
						System.out.println("Ubiquinotils::DIGITAL " + channel + " : " + value);
					}
	
					board.setSynchronizing(true);
					board.setLockedPin(port.getMap());
					port.setValue(value);
					board.setSynchronizing(false);
				}
			} else if (noteON.getCmd() == Integer.decode("0xe0")) {
				int channel = noteON.getChannel();
				AnalogPort port = board.getAnalogicPortFromChannel(channel);
				if (port != null) {
					int v = noteON.getByte1()<<7 | noteON.getByte2();
					
					float value = new Float(v);
					
					if (Platform.inDebugMode()) {
						System.out.println("Ubiquinotils::ANALOG " + channel + " : " + value);
					}
					
					board.setSynchronizing(true);
					board.setLockedPin(port.getMap());
					port.setValue(value);
					board.setSynchronizing(false);
				}
			} 
		} else if (cmd instanceof SysexMessage) {
			SysexMessage sysex = (SysexMessage) cmd;
			if (sysex.getCmd() == Integer.decode("0x6c")) {
				System.out.println("[0x6c] : Firmata capabilities response");
				@SuppressWarnings("unused")
				byte[] data = sysex.getMessage();
			} else if (sysex.getCmd() == Integer.decode("0x6e")) {
				System.out.println("[0x6e] : Firmata pin state mapping");
			} else if (cmd instanceof FirmataProtocolVersionCmd){
				FirmataProtocolVersionCmd verCmd = (FirmataProtocolVersionCmd) cmd;
				int major = verCmd.getByte1();
				int minor = verCmd.getByte2();
				
				if (major == 2 && minor == 0) {
					board.setFirmataMode(ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V20);
				} else if (major == 2 && minor == 1) {
					board.setFirmataMode(ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V21);
				} else if (major == 2 && minor == 2) {
					board.setFirmataMode(ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V22);
				} else if (major == 2 && minor == 3) {
					board.setFirmataMode(ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V23);
				} else {
					// default as of UNO board
					board.setFirmataMode(ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V23);
				}
			} else if (sysex.getCmd() == Integer.decode("0x73")) {
				// Pin mode response
				System.out.println("[0x73] :Pin Mode response");
			}
		}
	}
	
	//
	//
	// URI Resource load/save
	//
	//

	public void save(IEditorInput uriInput, Ubiquino project) {
		if (project != null) {
			if (uriInput instanceof FileEditorInput) {
				IFile file = ((FileEditorInput)uriInput).getFile();
				ResourceSetImpl resourceSetImpl = new ResourceSetImpl();
				try {
					URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
					Resource resource = resourceSetImpl.createResource(uri);
					resource.getContents().add(project);
					resource.save(new HashMap<Object, Object>());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	@SuppressWarnings("unused")
	public Ubiquino load(IEditorInput uriInput) {
		TemporalPackage		p0	= TemporalPackage.eINSTANCE;
		ArduinoPackage		p1	= ArduinoPackage.eINSTANCE;
		UbiquinoPackage		p2	= UbiquinoPackage.eINSTANCE;
		XcpPackage			p3	= XcpPackage.eINSTANCE;
		
		if (uriInput instanceof FileEditorInput) {
			IFile file = ((FileEditorInput)uriInput).getFile();
			ResourceSetImpl resourceSetImpl = new ResourceSetImpl();
			try {
				URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
				Resource resource = resourceSetImpl.getResource(uri, true);
				resource.load(new HashMap<Object, Object>());
				return (Ubiquino) resource.getContents().get(0);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}
