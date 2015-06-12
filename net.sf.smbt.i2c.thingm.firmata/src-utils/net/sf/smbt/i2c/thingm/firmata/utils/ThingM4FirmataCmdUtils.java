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

package net.sf.smbt.i2c.thingm.firmata.utils;

import net.sf.smbt.blinkm.cmd.injection.BlinkMUtil;
import net.sf.smbt.commands.FadeToRGBColorCmd;
import net.sf.smbt.commands.StopScriptCmd;
import net.sf.smbt.firmata.utils.FirmataCmdUtils;
import net.sf.smbt.protocol.ezfirmata.FIRMATA_I2C_RW_MODE;
import net.sf.xqz.model.cmd.Cmd;


public class ThingM4FirmataCmdUtils {

	public static final ThingM4FirmataCmdUtils INSTANCE = new ThingM4FirmataCmdUtils();

    //
    //
    // I2C over Firmata utils
    //
    //
   
	public Cmd createThingM4FimataStopScriptCmd(String addr) {
		StopScriptCmd blinkmCmd = BlinkMUtil.INSTANCE.createStopScriptCmd(addr);
		return FirmataCmdUtils.INSTANCE.createI2C_7BITS_FIRMATA_CMD (
			addr, 
			blinkmCmd.getCmdByte(), 
			new int[]{}, 
			FIRMATA_I2C_RW_MODE.WRITE
		);
	}
	
	public Cmd createThingM4FimataFadeToRGBCmd(String addr, int r, int g, int b) {
		FadeToRGBColorCmd blinkmCmd = BlinkMUtil.INSTANCE.createFadeToRGBColorCmd(addr, r, g, b);
		return  FirmataCmdUtils.INSTANCE.createI2C_7BITS_FIRMATA_CMD (
			addr, 
			blinkmCmd.getCmdByte(), 
			new int[] {
				Byte.valueOf(blinkmCmd.getCmdByte()).intValue(),
				r,
				g,
				b
			},
			FIRMATA_I2C_RW_MODE.WRITE
		);
	}
}
