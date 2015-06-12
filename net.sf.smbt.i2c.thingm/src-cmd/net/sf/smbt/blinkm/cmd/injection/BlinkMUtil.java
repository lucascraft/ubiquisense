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

package net.sf.smbt.blinkm.cmd.injection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.smbt.blinkm.cmd.BlinkMCmdInterpreter;
import net.sf.smbt.commands.BlinkMCmd;
import net.sf.smbt.commands.CommandsFactory;
import net.sf.smbt.commands.CommandsPackage;
import net.sf.smbt.commands.FLAG;
import net.sf.smbt.commands.FadeToRGBColorCmd;
import net.sf.smbt.commands.GetBlinkMAddrCmd;
import net.sf.smbt.commands.GetCurrentRGBColorCmd;
import net.sf.smbt.commands.GoToRGBColorCmd;
import net.sf.smbt.commands.PlayLightScriptCmd;
import net.sf.smbt.commands.SetBlinkMAddrCmd;
import net.sf.smbt.commands.SetFadeSpeedCmd;
import net.sf.smbt.commands.SetScriptLengthAndRepeatCmd;
import net.sf.smbt.commands.StopScriptCmd;
import net.sf.smbt.commands.WriteScriptLineCmd;
import net.sf.xqz.engine.cmd.utils.CmdUtil;
import net.sf.xqz.engine.cmd.utils.ICmdUtil;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.cmd.CmdFactory;
import net.sf.xqz.model.cmd.CompoundCmd;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

public class BlinkMUtil  {
	public static final BlinkMUtil INSTANCE = new BlinkMUtil();
	
    private static List<EClass> blinkmCmdLiteralCollection;
    private static Map<Byte, EClass> blinkmCmdMap;
    private BlinkMCmdInterpreter interpreter;
    private ICmdUtil cmdUtil;

	static {
		
        // BlinkM command literals
        blinkmCmdLiteralCollection = new ArrayList<EClass>();
        blinkmCmdLiteralCollection.add(CommandsPackage.Literals.FADE_TO_HSB_COLOR_CMD);
        blinkmCmdLiteralCollection.add(CommandsPackage.Literals.FADE_TO_RANDOM_HSB_COLOR_CMD);
        blinkmCmdLiteralCollection.add(CommandsPackage.Literals.FADE_TO_RANDOM_RGB_COLOR_CMD);
        blinkmCmdLiteralCollection.add(CommandsPackage.Literals.FADE_TO_RGB_COLOR_CMD);
        blinkmCmdLiteralCollection.add(CommandsPackage.Literals.GET_BLINK_MADDR_CMD);
        blinkmCmdLiteralCollection.add(CommandsPackage.Literals.GET_BLINK_MFIRMWARE_VERSION_CMD);
        blinkmCmdLiteralCollection.add(CommandsPackage.Literals.GET_CURRENT_RGB_COLOR_CMD);
        blinkmCmdLiteralCollection.add(CommandsPackage.Literals.GO_TO_RGB_COLOR_CMD);
        blinkmCmdLiteralCollection.add(CommandsPackage.Literals.PLAY_LIGHT_SCRIPT_CMD);
        blinkmCmdLiteralCollection.add(CommandsPackage.Literals.READ_SCRIPT_LINE_CMD);
        blinkmCmdLiteralCollection.add(CommandsPackage.Literals.SET_BLINK_MADDR_CMD);
        blinkmCmdLiteralCollection.add(CommandsPackage.Literals.SET_FADE_SPEED_CMD);
        blinkmCmdLiteralCollection.add(CommandsPackage.Literals.SET_SCRIPT_LENGTH_AND_REPEAT_CMD);
        blinkmCmdLiteralCollection.add(CommandsPackage.Literals.SET_STARTUP_PARAMETERS_CMD);
        blinkmCmdLiteralCollection.add(CommandsPackage.Literals.SET_TIME_ADJUST_CMD);
        blinkmCmdLiteralCollection.add(CommandsPackage.Literals.STOP_SCRIPT_CMD);
        blinkmCmdLiteralCollection.add(CommandsPackage.Literals.WRITE_SCRIPT_LINE_CMD);
        
        // BlinkM id/command mapping
        blinkmCmdMap = new HashMap<Byte, EClass>();
        for (EClass eClass : blinkmCmdLiteralCollection) {
        	EObject cmd = CommandsFactory.eINSTANCE.create(eClass);
        	if (cmd instanceof BlinkMCmd) {
	        	blinkmCmdMap.put(
	        		((BlinkMCmd)cmd).getCmdByte(), 
	        		eClass
	        	);
        	}
        }
	}
    
	public BlinkMUtil() {
		cmdUtil = CmdUtil.INSTANCE;
		
        //
        // BlinkM command interpreter
        //
        
        interpreter = new BlinkMCmdInterpreter();
 	}
	
	//
	// BlinkM commands utilities
	//

	public Map<Byte, EClass> getBlinkmCmdMap() {
		return blinkmCmdMap;
	}

	public BlinkMCmdInterpreter getInterpreter() {
		return interpreter;
	}

	/** Go to RGB Color **/
	public GoToRGBColorCmd createGoToRGBColorCmd(String addr, int red, int green, int blue) {
		GoToRGBColorCmd goToRGBColorCmd = CmdUtil.INSTANCE.stampCmd(CommandsFactory.eINSTANCE.createGoToRGBColorCmd());
		
		goToRGBColorCmd.setAddr(Byte.decode(addr));
		goToRGBColorCmd.getArguments()[0] = (byte) red;
		goToRGBColorCmd.getArguments()[1] = (byte) green;
		goToRGBColorCmd.getArguments()[2] = (byte) blue;
		
		return goToRGBColorCmd;
	}
	
	
	/** Set BlinkM Addr **/
	public SetBlinkMAddrCmd createSetBlinkMAddrCmd(String addr) {
		SetBlinkMAddrCmd setBlinkMAddr = cmdUtil.stampCmd(CommandsFactory.eINSTANCE.createSetBlinkMAddrCmd());
		
		setBlinkMAddr.setAddr(Byte.decode("0x00"));
		setBlinkMAddr.getArguments()[0] = Byte.decode(addr);
		setBlinkMAddr.getArguments()[1] = Integer.decode("0xd0").byteValue();
		setBlinkMAddr.getArguments()[2] = Integer.decode("0x0d").byteValue();
		setBlinkMAddr.getArguments()[3] = Byte.decode(addr);
		
		return setBlinkMAddr;
	}

	
	/** Fade to RGB color **/
	public FadeToRGBColorCmd createFadeToRGBColorCmd(String addr, int red, int green, int blue) {
		FadeToRGBColorCmd fadeToRGBColorCmd = cmdUtil.stampCmd(CommandsFactory.eINSTANCE.createFadeToRGBColorCmd());
		
		fadeToRGBColorCmd.setAddr(Byte.decode(addr));
		fadeToRGBColorCmd.getArguments()[0] = (byte) red;
		fadeToRGBColorCmd.getArguments()[1] = (byte) green;
		fadeToRGBColorCmd.getArguments()[2] = (byte) blue;
		
		return fadeToRGBColorCmd;
	}
	
	/** Fading speed **/
	public SetFadeSpeedCmd createSetFadeSpeedCmd(String addr, byte speed) {
		SetFadeSpeedCmd setFadeSpeedCmd = cmdUtil.stampCmd(CommandsFactory.eINSTANCE.createSetFadeSpeedCmd());
		
		setFadeSpeedCmd.setAddr(Byte.decode(addr));
		setFadeSpeedCmd.getArguments()[0] = speed;
		
		return setFadeSpeedCmd;
	}
	
	/** Prepare for preview */
	public CompoundCmd createPrepareForPreviewCompoundCmd(String addr, byte fadeSpeed) {
		CompoundCmd compoundCmd = cmdUtil.stampCmd(CmdFactory.eINSTANCE.createCompoundCmd());
		
		compoundCmd.getChildren().add(createStopScriptCmd(addr));
		compoundCmd.getChildren().add(createSetFadeSpeedCmd(addr, fadeSpeed));
		
		return compoundCmd;
	}
	
	/** Get current RGB color */
	public GetCurrentRGBColorCmd createGetCurrentRGBColorCmd(String addr) {
		GetCurrentRGBColorCmd getCurrentRGBColorCmd = cmdUtil.stampCmd(CommandsFactory.eINSTANCE.createGetCurrentRGBColorCmd());
		
		getCurrentRGBColorCmd.setAddr(Byte.decode(addr));
		
		return getCurrentRGBColorCmd;
	}

	/** Stop Script **/
	public StopScriptCmd createStopScriptCmd(String... addr) {
//		if (addr != null) {
//			if (addr.length <= 1) {
				StopScriptCmd stopScriptCmd = cmdUtil.stampCmd(CommandsFactory.eINSTANCE.createStopScriptCmd());
				stopScriptCmd.setAddr(Byte.decode(addr[0]));
//			} else {
//				for (String a : addr) {
//					StopScriptCmd stopScriptCmd = stampCmd(CommandsFactory.eINSTANCE.createStopScriptCmd());
//					stopScriptCmd.setAddr(Byte.decode(a));
//					CmdFactory.eINSTANCE.createCompoundCmd().getChildren().add(
//							stopScriptCmd
//					);
//				}
//			}
//		}
		
		return stopScriptCmd;
	}

	/** Play Light Script **/
	public PlayLightScriptCmd createPlayLightScriptCmd(String addr, int scriptID, int reps, int pos) {
		PlayLightScriptCmd playLightScript = cmdUtil.stampCmd(CommandsFactory.eINSTANCE.createPlayLightScriptCmd());
		
		playLightScript.setAddr(Byte.decode(addr));
		playLightScript.getArguments()[0] = (byte) scriptID;
		playLightScript.getArguments()[1] = (byte) reps;
		playLightScript.getArguments()[2] = (byte) pos;
		
		return playLightScript;
	}
	
	/** Write Light Script **/
	public WriteScriptLineCmd createWriteScriptCmd(String addr, int scriptID, int line, int duration, byte cmd, byte arg1, byte arg2, byte arg3) {
		WriteScriptLineCmd writeScriptLine = cmdUtil.stampCmd(CommandsFactory.eINSTANCE.createWriteScriptLineCmd());
		
		writeScriptLine.setAddr(Byte.decode(addr));
		writeScriptLine.getArguments()[0] = (byte) scriptID; // 0 only !!!
		writeScriptLine.getArguments()[1] = (byte) line; // 0-49
		writeScriptLine.getArguments()[2] = (byte) duration;
		writeScriptLine.getArguments()[3] = cmd;
		writeScriptLine.getArguments()[4] = arg1;
		writeScriptLine.getArguments()[5] = arg2;
		writeScriptLine.getArguments()[6] = arg3;
		
		return writeScriptLine;
	}
	/** Write Light Script **/
	public SetScriptLengthAndRepeatCmd createSetScriptLengthAndRepeatCmd(String addr, int scriptID, int length, int repeatTimes) {
		SetScriptLengthAndRepeatCmd writeScriptLine = cmdUtil.stampCmd(CommandsFactory.eINSTANCE.createSetScriptLengthAndRepeatCmd());
		
		writeScriptLine.setAddr(Byte.decode(addr));
		writeScriptLine.getArguments()[0] = (byte) scriptID; // 0 only !!!
		writeScriptLine.getArguments()[1] = (byte) length; 
		writeScriptLine.getArguments()[2] = (byte) repeatTimes;
		
		return writeScriptLine;
	}
	
	
	//
	// General Command utilities
	//
	
    public Cmd generateRamdomBlinkMCmd() {
    	EClass cmdEClass = blinkmCmdLiteralCollection.get(cmdUtil.getSomeInt(blinkmCmdLiteralCollection.size()));
    	
    	Cmd cmd = (Cmd) CommandsFactory.eINSTANCE.create(cmdEClass);
        cmd.setPriority(cmdUtil.getRandomPRIORITY());
        
        return cmdUtil.stampCmd(cmd);
    }
    
	public <T extends BlinkMCmd> T setupBlinkMCommand(
		T cmd, 
		FLAG flag, 
		byte cmdByte, 
		byte cmdChar, 
		byte[] args, 
		byte[] retVals
	) {
		cmd.setFlag(flag);
		cmd.setCmdByte(cmdByte);
		cmd.setCmdChar(cmdChar);
		cmd.setArguments(args == null ? new byte[0] : args);
		cmd.setRetValues(retVals == null ? new byte[0] : retVals);
		return cmd;
	}
	
	public Cmd toCmd(byte[] frame) {
		EClass cmdEClass = BlinkMUtil.INSTANCE.getBlinkmCmdMap().get(frame[3]);

		BlinkMCmd cmd = (BlinkMCmd) CommandsFactory.eINSTANCE.create(cmdEClass);
		
		// TODO: LB to check if modified frame addr is shifted or not
		cmd.setAddr((byte)(cmd.getAddr() >> 1));
		
		int idx = 5;
		for (@SuppressWarnings("unused") byte b : cmd.getArguments()) {
			cmd.getArguments()[idx-5] = frame[idx];
			idx++;
		}
		for (@SuppressWarnings("unused") byte b : cmd.getRetValues()) {
			cmd.getRetValues()[idx - 5 - cmd.getArguments().length] = frame[idx];
			idx++;
		}
		
		return cmd;
	}
	
	public byte[] toByteArray(BlinkMCmd cmd) { 
		byte fAddr = new Byte(cmd.getAddr());
		switch(cmd.getFlag()) {
			case READ:
				fAddr = (byte)((cmd.getAddr() << 1) | 0x01);
				break;
			case WRITE:
			case NONE:
			case READWRITE:
			default:
				fAddr = (byte)(cmd.getAddr() << 1);
				break;
		}

		
		try {
			byte[] frame = new byte[
			                        1 + // 0x01
			                        1 + // addr
			                        1 + // command length
			                        1 + // 0x00
			                        1 + // cmd char
			                        cmd.getArguments().length +
			                        cmd.getRetValues().length
			                        ];
			frame[0] = Byte.decode("0x01");
			frame[1] = fAddr;
			frame[2] = Byte.decode( "" + (1 + cmd.getArguments().length + cmd.getRetValues().length));
			frame[3] = Byte.decode("0x00");
			frame[4] = cmd.getCmdByte();
			int idx = 5;
			for (byte b : process8to7BitsAddrIfNeeded(cmd)) {
				frame[idx] = b;
				idx++;
			}
			for (byte b : process7to8BitsAddrIfNeeded(cmd)) {
				frame[idx] = b;
				idx++;
			}
			
			//if (Platform.inDebugMode()) {				
				System.err.println(getLogicFrameInfo(cmd));
				System.out.println(getPhysicFrameInfo(cmd));
			//}
			
			return frame;
		} catch (Throwable t) {
			t.printStackTrace();
			return new byte[0];
		}
	}
	
	private byte[] process8to7BitsAddrIfNeeded(BlinkMCmd cmd) {
		byte[] args = cmd.getArguments();
		if (cmd instanceof SetBlinkMAddrCmd) {
			args = cmd.getArguments().clone();
			args[0] = (byte) (args[0] << 1);
			args[3] = (byte) (args[3] << 1);
		}
		return args;
	}
	
	private byte[] process7to8BitsAddrIfNeeded(BlinkMCmd cmd) {
		byte[] rets = cmd.getRetValues();
		if (cmd instanceof GetBlinkMAddrCmd) {
			rets = cmd.getArguments().clone();
			rets[0] = (byte) (rets[0] >> 1);
		}
		return rets;
	}
	
	public String valueOf(byte num) {
		String hex = Integer.toHexString((int) num & 0xFF);
		return "0x" + (hex.length() == 1 ? "0" : "") + hex;
	}
	
    public String getLogicFrameInfo(BlinkMCmd cmd) {
       	String textualized = " LOGIC ";
       	textualized += "['0x01']";
       	textualized += "['" + valueOf(cmd.getAddr()) + "']";
    	textualized += "['" + (1 + cmd.getArguments().length + cmd.getRetValues().length) + "']";
       	textualized += "['0x00']";
    	textualized += "['" + (char) cmd.getCmdChar() + "']";
		for (byte b : cmd.getArguments()) {
			textualized += "['" + valueOf(b) + "']";
		}
		for (byte b : cmd.getRetValues()) {
			textualized += "['" + valueOf(b) + "']";
		}
    	return textualized;
    }

    public String getPhysicFrameInfo(BlinkMCmd cmd) {
       	String textualized = "PHYSIC ";
       	textualized += "['0x01']";
       	textualized += "['" + valueOf(cmd.getAddr()) + "']";
    	textualized += "['" + (1 + cmd.getArguments().length + cmd.getRetValues().length) + "']";
       	textualized += "['0x00']";
    	textualized += "['" + (char) cmd.getCmdChar() + "']";
		for (byte b : process8to7BitsAddrIfNeeded(cmd)) {
			textualized += "['" + valueOf(b) + "']";
		}
		for (byte b : process7to8BitsAddrIfNeeded(cmd)) {
			textualized += "['" + valueOf(b) + "']";
		}
    	return textualized;
    }
    
    public String dumpStreamAsHex(byte[] stream) {
       	String textualized = "";
       	for (byte b : stream) {
       		textualized += '[' + valueOf(b) + ']';
       	}
    	return textualized;
    }
    
}