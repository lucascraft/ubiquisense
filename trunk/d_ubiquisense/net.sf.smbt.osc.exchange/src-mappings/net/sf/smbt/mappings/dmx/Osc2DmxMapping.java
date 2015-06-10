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
import net.sf.smbt.dmx.utils.OpenDmxCmdUtils;
import net.sf.smbt.osc.exchange.oscdmx.OscDmxUtils;

import com.illposed.osc.OSCMessage;

public class Osc2DmxMapping {
	public final static Osc2DmxMapping INSTANCE = new Osc2DmxMapping();

	public OpenDMXCmd osc2dmx(OSCMessage msg) {
		if (msg instanceof OSCMessage) {
			if (msg.getAddress().equals(OscDmxUtils.OSC_DMX_FADE_RGB)) {
				return OpenDmxCmdUtils.INSTANCE.createOpenDMXFadeRGBCmd(
					(Integer) msg.getArguments()[0], 
					(Integer) msg.getArguments()[1],
					(Integer) msg.getArguments()[2],
					(Integer) msg.getArguments()[3]
				);
			} else if (msg.getAddress().equals(OscDmxUtils.OSC_DMX_FADE_RGB_WITH_STROBE)) {
				return OpenDmxCmdUtils.INSTANCE.createOpenDMXFadeRGBWithStrobeCmd(
					(Integer) msg.getArguments()[0], 
					(Integer) msg.getArguments()[1],
					(Integer) msg.getArguments()[2],
					(Integer) msg.getArguments()[3],
					(Integer) msg.getArguments()[4]
				);
			} else if (msg.getAddress().equals(OscDmxUtils.OSC_DMX_FADE_RGB_FULL)) {
				return OpenDmxCmdUtils.INSTANCE.createOpenDMXFadeRGBFullCmd(
					(Integer) msg.getArguments()[0], 
					(Integer) msg.getArguments()[1],
					(Integer) msg.getArguments()[2],
					(Integer) msg.getArguments()[3],
					(Integer) msg.getArguments()[4],
					(Integer) msg.getArguments()[5],
					(Integer) msg.getArguments()[6]
				);
			}
		}
		return null;
	}
}
