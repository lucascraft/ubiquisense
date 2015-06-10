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

package net.sf.smbt.mappings.dmx;

import net.sf.smbt.dmx.model.ezdmx.OpenDMXCmd;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXFade;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeFull;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXFadeWithStrobe;
import net.sf.smbt.dmx.utils.OpenDmxCmdUtils;
import net.sf.smbt.osc.utils.OscCmdUtils;
import net.sf.smbt.osccmd.OscCmd;

import com.illposed.osc.OSCMessage;

public class Dmx2OscMapping {
	public final static Dmx2OscMapping INSTANCE = new Dmx2OscMapping();
	
	public OscCmd dmx2osc(OpenDMXCmd dmxCmd) {
		if (dmxCmd instanceof OpenDMXFade) {
			OpenDMXFade fadeCmd = (OpenDMXFade) dmxCmd;
			return OscCmdUtils.INSTANCE.createOscCmd(
				"/ez/dmx/fade", 
				fadeCmd.getChannel(), 
				fadeCmd.getR(), 
				fadeCmd.getG(), 
				fadeCmd.getB()
			);
		} else if (dmxCmd instanceof OpenDMXFadeWithStrobe) {
			OpenDMXFadeWithStrobe fadeCmd = (OpenDMXFadeWithStrobe) dmxCmd;
			return OscCmdUtils.INSTANCE.createOscCmd(
				"/ez/dmx/fadestrobe", 
				fadeCmd.getChannel(), 
				fadeCmd.getR(), 
				fadeCmd.getG(), 
				fadeCmd.getB(),
				fadeCmd.getStrobe()
			);
		} else if (dmxCmd instanceof OpenDMXFadeWithStrobe) {
			OpenDMXFadeFull fadeCmd = (OpenDMXFadeFull) dmxCmd;
			return OscCmdUtils.INSTANCE.createOscCmd(
				"/ez/dmx/fadefull", 
				fadeCmd.getR(), 
				fadeCmd.getG(), 
				fadeCmd.getB(),
				fadeCmd.getFullColor(),
				fadeCmd.getStrobe(),
				fadeCmd.getModi(),
				fadeCmd.getExt()
			);
		}
		return null;
	}
	
	public OpenDMXCmd osc2dmx(OscCmd cmd) {
		if (cmd != null && cmd.getMsg() != null) {
			if (cmd.getMsg() instanceof OSCMessage) {
				OSCMessage msg = (OSCMessage) cmd.getMsg();
				String addr = msg.getAddress();
				if (addr != null && addr != "") {
					if (addr.startsWith("/ez/dmx/fade")) {
						if (msg.getArguments() != null && msg.getArguments().length == 4) {
							Integer channel = (Integer) msg.getArguments()[0];
							Integer rValue	= (Integer) msg.getArguments()[1];
							Integer gValue	= (Integer) msg.getArguments()[2];
							Integer bValue	= (Integer) msg.getArguments()[3];
							return OpenDmxCmdUtils.INSTANCE.createOpenDMXFadeRGBCmd(channel, rValue, gValue, bValue);
						}
					} else if (addr.startsWith("/ez/dmx/fadestrobe")) {
						if (msg.getArguments() != null && msg.getArguments().length == 5) {
							Integer channel = (Integer) msg.getArguments()[0];
							Integer rValue	= (Integer) msg.getArguments()[1];
							Integer gValue	= (Integer) msg.getArguments()[2];
							Integer bValue	= (Integer) msg.getArguments()[3];
							Integer strobe	= (Integer) msg.getArguments()[4];
							return OpenDmxCmdUtils.INSTANCE.createOpenDMXFadeRGBWithStrobeCmd(channel, rValue, gValue, bValue, strobe);
						}
					} else if (addr.startsWith("/ez/dmx/fadefull")) {
						if (msg.getArguments() != null && msg.getArguments().length == 7) {
							Integer rValue 		= (Integer) msg.getArguments()[0];
							Integer gValue		= (Integer) msg.getArguments()[1];
							Integer bValue		= (Integer) msg.getArguments()[2];
							Integer fullColor	= (Integer) msg.getArguments()[3];
							Integer strobe		= (Integer) msg.getArguments()[4];
							Integer modi		= (Integer) msg.getArguments()[5];
							Integer ext			= (Integer) msg.getArguments()[6];
							return OpenDmxCmdUtils.INSTANCE.createOpenDMXFadeRGBFullCmd(rValue, gValue, bValue, fullColor, strobe, modi, ext);
						}
					}
				}
			}
		}
		return null;
	}
}
