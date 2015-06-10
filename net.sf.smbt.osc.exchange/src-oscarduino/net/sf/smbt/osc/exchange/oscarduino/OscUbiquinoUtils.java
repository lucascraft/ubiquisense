/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2010 - 2012, Lucas Bigeardel
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

package net.sf.smbt.osc.exchange.oscarduino;

import net.sf.smbt.ezubiquino.EzubiquinoFactory;
import net.sf.smbt.ezubiquino.OscUbiquinoCmd;
import net.sf.smbt.ezubiquino.UbiquinoKind;

import com.illposed.osc.OSCMessage;


public class OscUbiquinoUtils {
	public final static OscUbiquinoUtils INSTANCE = new OscUbiquinoUtils();

	public final static String OSC_FIRMATA_DIGITAL_GET			= "/ez/firmata/digital/get";
	public final static String OSC_FIRMATA_DIGITAL_SET			= "/ez/firmata/digital/set";
	public final static String OSC_FIRMATA_ANALOG_GET			= "/ez/firmata/analog/get";
	public final static String OSC_FIRMATA_ANALOG_SET			= "/ez/firmata/analog/set";
	public final static String OSC_FIRMATA_I2C_DIGITAL_GET		= "/ez/firmata/i2c/digital/get";
	public final static String OSC_FIRMATA_I2C_DIGITAL_SET 		= "/ez/firmata/i2c/digital/set";
	public final static String OSC_FIRMATA_I2C_ANALOG_GET		= "/ez/firmata/i2c/analog/get";
	public final static String OSC_FIRMATA_I2C_ANALOG_SET		= "/ez/firmata/i2c/analog/set";
	public final static String OSC_FIRMATA_SERVO_DIGITAL_GET 	= "/ez/firmata/servo/digital/get";
	public final static String OSC_FIRMATA_SERVO_DIGITAL_SET 	= "/ez/firmata/servo/digital/set";
	public final static String OSC_FIRMATA_SERVO_ANALOG_GET 	= "/ez/firmata/servo/analog/get";
	public final static String OSC_FIRMATA_SERVO_ANALOG_SET 	= "/ez/firmata/servo/analog/set";

	public OscUbiquinoCmd createUbiquinoDigitalCmd(UbiquinoKind kind, boolean in, int val) {
		OscUbiquinoCmd cmd = EzubiquinoFactory.eINSTANCE.createOscUbiquinoCmd();
		cmd.setKind(kind);
		switch (kind) {
			case FIRMATA:
				cmd.setMsg(new OSCMessage(in ? OSC_FIRMATA_DIGITAL_GET : OSC_FIRMATA_DIGITAL_SET, new Object[] { new Integer(val)}));
				break;
			case FIRMATA_I2C:
				cmd.setMsg(new OSCMessage(in ? OSC_FIRMATA_I2C_DIGITAL_GET : OSC_FIRMATA_I2C_DIGITAL_SET, new Object[] { new Integer(val)}));
				break;
			case FIRMATA_SERVO:
				cmd.setMsg(new OSCMessage(in ? OSC_FIRMATA_DIGITAL_GET : OSC_FIRMATA_DIGITAL_SET, new Object[] { new Integer(val)}));
				break;
		}
		return cmd;
	}

	public OscUbiquinoCmd createUbiquinoAnalogCmd(UbiquinoKind kind, boolean in, float val) {
		OscUbiquinoCmd cmd = EzubiquinoFactory.eINSTANCE.createOscUbiquinoCmd();
		cmd.setKind(kind);
		switch (kind) {
			case FIRMATA:
				cmd.setMsg(new OSCMessage(in ? OSC_FIRMATA_ANALOG_GET : OSC_FIRMATA_ANALOG_SET, new Object[] { new Float(val)}));
				break;
			case FIRMATA_I2C:
				cmd.setMsg(new OSCMessage(in ? OSC_FIRMATA_I2C_ANALOG_GET : OSC_FIRMATA_I2C_ANALOG_SET, new Object[] { new Float(val)}));
				break;
			case FIRMATA_SERVO:
				cmd.setMsg(new OSCMessage(in ? OSC_FIRMATA_ANALOG_GET : OSC_FIRMATA_ANALOG_SET, new Object[] { new Float(val)}));
				break;
		}
		return cmd;
	}
}
