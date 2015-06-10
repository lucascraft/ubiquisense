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

package net.sf.smbt.mappings.ubiquino;

import net.sf.smbt.firmata.utils.FirmataCmdUtils;
import net.sf.smbt.midi.ezmidi.DSLMidiMessage;
import net.sf.smbt.osc.exchange.oscarduino.OscUbiquinoUtils;

import com.illposed.osc.OSCMessage;

public class Osc2UbiquinoMapping {
	
	public final static Osc2UbiquinoMapping INSTANCE = new Osc2UbiquinoMapping();
	
	public DSLMidiMessage osc2ubiquino(OSCMessage msg) {
		if (msg.getArguments() != null && msg.getArguments().length <= 0) return null;
		
		Integer port = (Integer) msg.getArguments()[0];  // pin
		Integer mode = (Integer) msg.getArguments()[1];  // value
		
		if (msg.getAddress().startsWith(OscUbiquinoUtils.OSC_FIRMATA_ANALOG_GET)) {
			// just outgoing stuff for now
		} else if (msg.getAddress().startsWith(OscUbiquinoUtils.OSC_FIRMATA_DIGITAL_GET)) {
			// just outgoing stuff for now
		} else if (msg.getAddress().startsWith(OscUbiquinoUtils.OSC_FIRMATA_DIGITAL_SET)) { 
			return FirmataCmdUtils.INSTANCE.createDigitalIO(port, mode);
		} else if (msg.getAddress().startsWith(OscUbiquinoUtils.OSC_FIRMATA_ANALOG_SET)) {
			return FirmataCmdUtils.INSTANCE.createAnalogIO(port, mode);
		} /* else if (msg.getAddress().startsWith(OscArduinoUtils.OSC_UBIQUINO_I2C_ANALOG_IN)) { // ?????
		} else if (msg.getAddress().startsWith(OscArduinoUtils.OSC_UBIQUINO_I2C_ANALOG_OUT)) { // ?????
		} else if (msg.getAddress().startsWith(OscArduinoUtils.OSC_UBIQUINO_I2C_DIGITAL_IN)) { // ?????
		} else if (msg.getAddress().startsWith(OscArduinoUtils.OSC_UBIQUINO_I2C_DIGITAL_OUT)) { // ?????
		} else if (msg.getAddress().startsWith(OscArduinoUtils.OSC_UBIQUINO_SERVO_ANALOG_IN)) { // ?????
		} else if (msg.getAddress().startsWith(OscArduinoUtils.OSC_UBIQUINO_SERVO_ANALOG_OUT)) { // ?????
		} else if (msg.getAddress().startsWith(OscArduinoUtils.OSC_UBIQUINO_SERVO_DIGITAL_IN)) { // ?????
		} else if (msg.getAddress().startsWith(OscArduinoUtils.OSC_UBIQUINO_SERVO_DIGITAL_OUT)) { // ?????
		} */
		return null;
	}
}
