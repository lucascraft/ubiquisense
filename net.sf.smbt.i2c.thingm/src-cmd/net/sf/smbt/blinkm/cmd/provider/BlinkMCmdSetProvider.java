/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2008 - 2010, Lucas Bigeardel
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

package net.sf.smbt.blinkm.cmd.provider;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.smbt.commands.CommandsPackage;
import net.sf.xqz.engine.ext.service.AbstractCmdSetProvider;

import org.eclipse.emf.ecore.EClassifier;

public class BlinkMCmdSetProvider extends AbstractCmdSetProvider {
	public BlinkMCmdSetProvider() {
	}

	@Override
	public String getPartNumber() {
		return "v20081101";
	}
	
	@Override
	public String getProtocol() {
		return "i2c";
	}
	
	@Override
	public String getVendor() {
		return "ThingM";
	}
	
	@Override
	public String getVersionNumber() {
		return "1.0";
	}
	
	@Override
	public String getUri() {
		return CommandsPackage.eNS_URI;
	}
	@Override
	public Map<String, List<EClassifier>> getCommandSets() {
		Map<String, List<EClassifier>> commandSets = new HashMap<String, List<EClassifier>>();
		
		commandSets.put(
			"ThingM BlinkM, MaxM, MiniM 1.0 Commands", 
			Arrays.asList(
				new EClassifier[] {
					CommandsPackage.Literals.FADE_TO_HSB_COLOR_CMD,
					CommandsPackage.Literals.FADE_TO_RANDOM_HSB_COLOR_CMD,
					CommandsPackage.Literals.FADE_TO_RANDOM_RGB_COLOR_CMD,
					CommandsPackage.Literals.FADE_TO_RGB_COLOR_CMD,
					CommandsPackage.Literals.GET_BLINK_MADDR_CMD,
					CommandsPackage.Literals.GET_BLINK_MFIRMWARE_VERSION_CMD,
					CommandsPackage.Literals.GET_CURRENT_RGB_COLOR_CMD,
					CommandsPackage.Literals.GO_TO_RGB_COLOR_CMD,
					CommandsPackage.Literals.PLAY_LIGHT_SCRIPT_CMD,
					CommandsPackage.Literals.READ_SCRIPT_LINE_CMD,
					CommandsPackage.Literals.SET_BLINK_MADDR_CMD,
					CommandsPackage.Literals.SET_FADE_SPEED_CMD,
					CommandsPackage.Literals.SET_SCRIPT_LENGTH_AND_REPEAT_CMD,
					CommandsPackage.Literals.SET_STARTUP_PARAMETERS_CMD,
					CommandsPackage.Literals.SET_TIME_ADJUST_CMD,
					CommandsPackage.Literals.STOP_SCRIPT_CMD,
					CommandsPackage.Literals.WRITE_SCRIPT_LINE_CMD
				}
			)
		);
		
		return commandSets;
	}
}
