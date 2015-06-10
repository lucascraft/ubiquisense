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

package net.sf.smbt.osc.exchange.thingm;

import java.awt.Color;

import net.sf.smbt.blinkm.cmd.injection.BlinkMUtil;
import net.sf.smbt.commands.BlinkMCmd;
import net.sf.smbt.commands.FadeToHSBColorCmd;
import net.sf.smbt.commands.FadeToRGBColorCmd;
import net.sf.smbt.commands.GoToRGBColorCmd;
import net.sf.smbt.osc.utils.OscCmdUtils;
import net.sf.smbt.osccmd.OscCmd;

import com.illposed.osc.OSCMessage;
import com.illposed.osc.OSCPacket;

/**
 * The idea behind is to be able to get an OSC expression of a thingM command
 * and vice versa.
 * 
 * It implies embedding OSC library on the Arduino side.
 * 
 * <p>
 * <h3>example :</h3>
 * <br>
 * "[/OptionalHeader]>/[address]/[command], [types]/[arguments]"
 * </p>
 * 
 * <p>
 * /ez/thingm/fade2hsb, ...
 * /ez/thingm/fade2hsb4random, ...
 * /ez/thingm/fade2rgb, ...
 * /ez/thingm/fade2rgb4random, ...
 * /ez/thingm/getaddress ,
 * /ez/thingm/getfirmwarever, ...
 * /ez/thingm/getrgbcolor, ...
 * /ez/thingm/go2rgb, ...
 * /ez/thingm/playscript, ...
 * /ez/thingm/readscript, ...
 * /ez/thingm/setaddress, ...
 * /ez/thingm/setfadespeed, ...
 * /ez/thingm/setlengthrepeatcommand, ...
 * /ez/thingm/setstartupparameters, ...
 * /ez/thingm/settimeadjust, ...
 * /ez/thingm/stopscript, ...
 * /ez/thingm/writescript, ...
 * 
 * </p>
 * 
 * @author lucas bigeardel
 *
 */
public class ThingMOscUtils {
	public final static ThingMOscUtils INSTANCE = new ThingMOscUtils();
	
	
	public final static String EZ_THINGM_PREFIX						= "/ez/thingm/";
	public final static String EZ_THINGM_FADE2HSB_OSC_ADDR			= "fade2hsb";
	public final static String EZ_THINGM_FADE2HSB_OSC_CMD			= EZ_THINGM_PREFIX + EZ_THINGM_FADE2HSB_OSC_ADDR;
	public final static String EZ_THINGM_FADE2HSB_RANDOM_OSC_ADDR	= "fade2hsb4random";
	public final static String EZ_THINGM_FADE2HSB_RANDOM_OSC_CMD	= EZ_THINGM_PREFIX + EZ_THINGM_FADE2HSB_RANDOM_OSC_ADDR;
	public final static String EZ_THINGM_FADE2RGB_OSC_ADDR			= "fade2rgb";
	public final static String EZ_THINGM_FADE2RGB_OSC_CMD			= EZ_THINGM_PREFIX + EZ_THINGM_FADE2RGB_OSC_ADDR;
	public final static String EZ_THINGM_FADE2RGB_RANDOM_OSC_ADDR	= "fade2rgb4random";
	public final static String EZ_THINGM_FADE2RGB_RANDOM_OSC_CMD	= EZ_THINGM_PREFIX + EZ_THINGM_FADE2RGB_RANDOM_OSC_ADDR;
	public final static String EZ_THINGM_GET_ADDRESS_OSC_ADDR		= "getaddress";
	public final static String EZ_THINGM_GET_ADDRESS_OSC_CMD		= EZ_THINGM_PREFIX + EZ_THINGM_GET_ADDRESS_OSC_ADDR;
	public final static String EZ_THINGM_GET_FIRMWARE_VER_OSC_ADDR	= "getfirmwarever";
	public final static String EZ_THINGM_GET_FIRMWARE_VER_OSC_CMD	= EZ_THINGM_PREFIX + EZ_THINGM_GET_FIRMWARE_VER_OSC_ADDR;
	public final static String EZ_THINGM_GET_RGB_OSC_ADDR			= "getrgb";
	public final static String EZ_THINGM_GET_RGB_OSC_CMD			= EZ_THINGM_PREFIX + EZ_THINGM_GET_RGB_OSC_ADDR;
	public final static String EZ_THINGM_GO_TO_RGB_OSC_ADDR			= "go2rgb";
	public final static String EZ_THINGM_GO_TO_RGB_OSC_CMD			= EZ_THINGM_PREFIX + EZ_THINGM_GO_TO_RGB_OSC_ADDR;
	public final static String EZ_THINGM_PLAY_SCRIPT_OSC_ADDR		= "playscript";
	public final static String EZ_THINGM_PLAY_SCRIPT_OSC_CMD		= EZ_THINGM_PREFIX + EZ_THINGM_PLAY_SCRIPT_OSC_ADDR;
	public final static String EZ_THINGM_READ_SCRIPT_OSC_ADDR		= "readscript";
	public final static String EZ_THINGM_READ_SCRIPT_OSC_CMD		= EZ_THINGM_PREFIX + EZ_THINGM_READ_SCRIPT_OSC_ADDR;
	public final static String EZ_THINGM_SETADDRESS_OSC_ADDR		= "setaddress";
	public final static String EZ_THINGM_SETADDRESS_OSC_CMD			= EZ_THINGM_PREFIX + EZ_THINGM_SETADDRESS_OSC_ADDR;
	public final static String EZ_THINGM_SET_FADE_SPEED_OSC_ADDR	= "setfadespeed";
	public final static String EZ_THINGM_SET_FADE_SPEED_OSC_CMD	= EZ_THINGM_PREFIX + EZ_THINGM_SET_FADE_SPEED_OSC_ADDR;
	public final static String EZ_THINGM_SET_LENGTH_REPEAT_OSC_ADDR = "setlengthrepeatcommand";
	public final static String EZ_THINGM_SET_LENGTH_REPEAT_OSC_CMD = EZ_THINGM_PREFIX + EZ_THINGM_SET_LENGTH_REPEAT_OSC_ADDR;
	public final static String EZ_THINGM_SETSTARTUP_PARAMS_OSC_ADDR = "setstartupparameters";
	public final static String EZ_THINGM_SETSTARTUP_PARAMS_OSC_CMD = EZ_THINGM_PREFIX + EZ_THINGM_SETSTARTUP_PARAMS_OSC_ADDR;
	public final static String EZ_THINGM_SET_TIME_ADJUST_OSC_ADDR	= "settimeadjust";
	public final static String EZ_THINGM_SET_TIME_ADJUST_OSC_CMD	= EZ_THINGM_PREFIX + EZ_THINGM_SET_TIME_ADJUST_OSC_ADDR;
	public final static String EZ_THINGM_STOP_SCRIPT_OSC_ADDR		= "stopscript";
	public final static String EZ_THINGM_STOP_SCRIPT_OSC_CMD		= EZ_THINGM_PREFIX + EZ_THINGM_STOP_SCRIPT_OSC_ADDR;
	public final static String EZ_THINGM_WRITE_SCRIPT_OSC_ADDR		= "writescript";
	public final static String EZ_THINGM_WRITE_SCRIPT_OSC_CMD		= EZ_THINGM_PREFIX + EZ_THINGM_WRITE_SCRIPT_OSC_ADDR;

	public final static String[] commands = new String[] {
		EZ_THINGM_FADE2HSB_OSC_CMD, 
		EZ_THINGM_FADE2HSB_RANDOM_OSC_CMD, 
		EZ_THINGM_FADE2RGB_OSC_CMD, 
		EZ_THINGM_FADE2RGB_RANDOM_OSC_CMD,
		EZ_THINGM_GET_ADDRESS_OSC_CMD, 
		EZ_THINGM_GET_FIRMWARE_VER_OSC_CMD, 
		EZ_THINGM_GET_RGB_OSC_CMD, 
		EZ_THINGM_GO_TO_RGB_OSC_CMD, 
		EZ_THINGM_PLAY_SCRIPT_OSC_CMD, 
		EZ_THINGM_READ_SCRIPT_OSC_CMD, 
		EZ_THINGM_SETADDRESS_OSC_CMD, 
		EZ_THINGM_SET_FADE_SPEED_OSC_CMD,
		EZ_THINGM_SET_LENGTH_REPEAT_OSC_CMD, 
		EZ_THINGM_SETSTARTUP_PARAMS_OSC_CMD, 
		EZ_THINGM_SET_TIME_ADJUST_OSC_CMD, 
		EZ_THINGM_STOP_SCRIPT_OSC_CMD,
		EZ_THINGM_WRITE_SCRIPT_OSC_CMD
	};
	
	public BlinkMCmd osc2thingm(OSCPacket packet) {
		if (packet instanceof OSCMessage) {
			return createBlinkMCmdFromOsc((OscCmd) OscCmdUtils.INSTANCE.createOscCmd(packet));
		}
		return null;
	}
	
	public BlinkMCmd createBlinkMCmdFromOsc(OscCmd cmd) {
		if (cmd != null && cmd.getMsg() instanceof OSCMessage) {
			OSCMessage msg = (OSCMessage) cmd.getMsg();
			if (msg != null && msg.getArguments() != null) {
				String addr = ((OSCMessage)cmd.getMsg()).getAddress();
				if (addr != null && !addr.equals("")) {
					if (addr.equals(EZ_THINGM_FADE2HSB_OSC_CMD)) {
						if (msg.getArguments().length == 4) {
							String hexAddr = msg.getArguments()[0] instanceof String ? (String) msg.getArguments()[0] : "0x00";
							Float h = msg.getArguments()[1] instanceof Float ? (Float) msg.getArguments()[1] : 1f;
							Float s = msg.getArguments()[2] instanceof Float ? (Float) msg.getArguments()[2] : 1f;
							Float b = msg.getArguments()[3] instanceof Float ? (Float) msg.getArguments()[3] : 1f;
							int rgbEncode = Color.HSBtoRGB(h, s, b);
							Color c = new Color(rgbEncode);
							return BlinkMUtil.INSTANCE.createFadeToRGBColorCmd(hexAddr, c.getRed(), c.getGreen(), c.getBlue());
						}
					} else if (addr.equals(EZ_THINGM_STOP_SCRIPT_OSC_CMD)) {
						if (msg.getArguments().length == 1) {
							String hexAddr = msg.getArguments()[0] instanceof String ? (String) msg.getArguments()[0] : "0x00";
							return BlinkMUtil.INSTANCE.createStopScriptCmd(hexAddr);
						}
					} else if (addr.equals(EZ_THINGM_FADE2HSB_RANDOM_OSC_CMD)) {
						throw new UnsupportedOperationException(EZ_THINGM_FADE2HSB_RANDOM_OSC_CMD + " unsuppported yet");
					} else if (addr.equals(EZ_THINGM_FADE2RGB_OSC_CMD)) {
						if (msg.getArguments().length == 4) {
							String hexAddr = msg.getArguments()[0] instanceof String ? (String) msg.getArguments()[0] : "0x00";
							Integer r = msg.getArguments()[1] instanceof Integer ? (Integer) msg.getArguments()[1] : 255;
							Integer g = msg.getArguments()[2] instanceof Integer ? (Integer) msg.getArguments()[2] : 255;
							Integer b = msg.getArguments()[3] instanceof Integer ? (Integer) msg.getArguments()[3] : 255;
							return BlinkMUtil.INSTANCE.createFadeToRGBColorCmd(hexAddr, r, g, b);
						}
					} else if (addr.equals(EZ_THINGM_FADE2RGB_RANDOM_OSC_CMD)) {
						throw new UnsupportedOperationException(EZ_THINGM_FADE2RGB_RANDOM_OSC_CMD + " unsuppported yet");
					} else if (addr.equals(EZ_THINGM_GET_ADDRESS_OSC_CMD)) {
						throw new UnsupportedOperationException(EZ_THINGM_GET_ADDRESS_OSC_CMD + " unsuppported yet");
					} else if (addr.equals(EZ_THINGM_GET_FIRMWARE_VER_OSC_CMD)) {
						throw new UnsupportedOperationException(EZ_THINGM_GET_FIRMWARE_VER_OSC_CMD + " unsuppported yet");
					} else if (addr.equals(EZ_THINGM_GET_RGB_OSC_CMD)) {
						if (msg.getArguments().length == 1) {
							String hexAddr = msg.getArguments()[0] instanceof String ? (String) msg.getArguments()[0] : "0x00";
							return BlinkMUtil.INSTANCE.createGetCurrentRGBColorCmd(hexAddr);
						}
					} else if (addr.equals(EZ_THINGM_GO_TO_RGB_OSC_CMD)) {
						if (msg.getArguments().length == 4) {
							String hexAddr = msg.getArguments()[0] instanceof String ? (String) msg.getArguments()[0] : "0x00";
							Integer r = msg.getArguments()[1] instanceof Integer ? (Integer) msg.getArguments()[1] : 255;
							Integer g = msg.getArguments()[2] instanceof Integer ? (Integer) msg.getArguments()[2] : 255;
							Integer b = msg.getArguments()[3] instanceof Integer ? (Integer) msg.getArguments()[3] : 255;
							return BlinkMUtil.INSTANCE.createGoToRGBColorCmd(hexAddr, r, g, b);
						}
					} else if (addr.equals(EZ_THINGM_PLAY_SCRIPT_OSC_CMD)) {
						throw new UnsupportedOperationException(EZ_THINGM_PLAY_SCRIPT_OSC_CMD + " unsuppported yet");
					} else if (addr.equals(EZ_THINGM_READ_SCRIPT_OSC_CMD)) {
						throw new UnsupportedOperationException(EZ_THINGM_READ_SCRIPT_OSC_CMD + " unsuppported yet");
					} else if (addr.equals(EZ_THINGM_SET_FADE_SPEED_OSC_CMD)) {
						throw new UnsupportedOperationException(EZ_THINGM_SET_FADE_SPEED_OSC_CMD + " unsuppported yet");
					} else if (addr.equals(EZ_THINGM_SET_LENGTH_REPEAT_OSC_CMD)) {
						throw new UnsupportedOperationException(EZ_THINGM_SET_LENGTH_REPEAT_OSC_CMD + " unsuppported yet");
					} else if (addr.equals(EZ_THINGM_SET_TIME_ADJUST_OSC_CMD)) {
						throw new UnsupportedOperationException(EZ_THINGM_SET_TIME_ADJUST_OSC_CMD + " unsuppported yet");
					} else if (addr.equals(EZ_THINGM_SETADDRESS_OSC_CMD)) {
						throw new UnsupportedOperationException(EZ_THINGM_SETADDRESS_OSC_CMD + " unsuppported yet");
					} else if (addr.equals(EZ_THINGM_SETSTARTUP_PARAMS_OSC_CMD)) {
						throw new UnsupportedOperationException(EZ_THINGM_SETSTARTUP_PARAMS_OSC_CMD + " unsuppported yet");
					} else if (addr.equals(EZ_THINGM_STOP_SCRIPT_OSC_CMD)) {
						throw new UnsupportedOperationException(EZ_THINGM_STOP_SCRIPT_OSC_CMD + " unsuppported yet");
					} else if (addr.equals(EZ_THINGM_WRITE_SCRIPT_OSC_CMD)) {
						throw new UnsupportedOperationException(EZ_THINGM_WRITE_SCRIPT_OSC_CMD + " unsuppported yet");
					}
				}
			}
		}
		return null;
	}
	
	public OscCmd thingm2osc(BlinkMCmd cmd) {
		if (cmd != null) {
			return dumpCmdAsEZ(cmd);
		}
		return null;
	}
	
	public OSCPacket thingm2oscMsg(BlinkMCmd cmd) {
		if (cmd != null) {
			return dumpCmdAsEZ(cmd).getMsg();
		}
		return null;
	}
	
    public OscCmd dumpCmdAsEZ(BlinkMCmd c) {
    	if (c instanceof FadeToRGBColorCmd) {
    		return OscCmdUtils.INSTANCE.createOscCmd(
        		EZ_THINGM_FADE2RGB_OSC_CMD,
        		(int) c.getAddr() & 0xFF, 
        		(int) c.getArguments()[0] & 0xFF,
        		(int) c.getArguments()[1] & 0xFF,
        		(int) c.getArguments()[2] & 0xFF
    		);
    	} else if (c instanceof GoToRGBColorCmd) {
    		return OscCmdUtils.INSTANCE.createOscCmd(
        		EZ_THINGM_GO_TO_RGB_OSC_CMD,
        		(int) c.getAddr() & 0xFF, 
        		(int) c.getArguments()[0] & 0xFF,
        		(int) c.getArguments()[1] & 0xFF,
        		(int) c.getArguments()[2] & 0xFF
    		);
    	}  else if (c instanceof FadeToHSBColorCmd) {
    		return OscCmdUtils.INSTANCE.createOscCmd(
    			EZ_THINGM_FADE2HSB_OSC_CMD,
        		(int) c.getAddr() & 0xFF, 
        		(int) c.getArguments()[0] & 0xFF,
        		(int) c.getArguments()[1] & 0xFF,
        		(int) c.getArguments()[2] & 0xFF
    		);
    	} 
    	return null;
    }
}
