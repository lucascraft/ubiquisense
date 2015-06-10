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

package net.sf.smbt.mappings.firmata;

import net.sf.smbt.osc.exchange.oscarduino.OscUbiquinoUtils;
import net.sf.smbt.osc.utils.OscCmdUtils;
import net.sf.smbt.osccmd.OscCmd;
import net.sf.smbt.protocol.ezfirmata.FirmataAnalogIOMsgCmd;
import net.sf.smbt.protocol.ezfirmata.FirmataCmd;
import net.sf.smbt.protocol.ezfirmata.FirmataDigitalIOMsgCmd;
import net.sf.smbt.protocol.ezfirmata.FirmataReportAnalogPinCmd;
import net.sf.smbt.protocol.ezfirmata.FirmataReportDigitalPinCmd;

public class Firmata2OscMapping {
	public final static Firmata2OscMapping INSTANCE = new Firmata2OscMapping();
	
	public OscCmd firmata2osc(FirmataCmd cmd) {
		/*  */ if (cmd instanceof FirmataReportAnalogPinCmd) {
			OscCmdUtils.INSTANCE.createOscCmd(OscUbiquinoUtils.OSC_FIRMATA_ANALOG_SET);
			((FirmataDigitalIOMsgCmd)cmd).getAddr();
			((FirmataDigitalIOMsgCmd)cmd).getByte1();
			((FirmataDigitalIOMsgCmd)cmd).getByte2();
			((FirmataDigitalIOMsgCmd)cmd).getChannel();
		} else if (cmd instanceof FirmataReportDigitalPinCmd) {
			OscCmdUtils.INSTANCE.createOscCmd(OscUbiquinoUtils.OSC_FIRMATA_DIGITAL_SET);
			((FirmataDigitalIOMsgCmd)cmd).getAddr();
			((FirmataDigitalIOMsgCmd)cmd).getByte1();
			((FirmataDigitalIOMsgCmd)cmd).getByte2();
			((FirmataDigitalIOMsgCmd)cmd).getChannel();
		} else if (cmd instanceof FirmataAnalogIOMsgCmd) {
			OscCmdUtils.INSTANCE.createOscCmd(OscUbiquinoUtils.OSC_FIRMATA_ANALOG_GET);
			((FirmataDigitalIOMsgCmd)cmd).getAddr();
			((FirmataDigitalIOMsgCmd)cmd).getByte1();
			((FirmataDigitalIOMsgCmd)cmd).getByte2();
			((FirmataDigitalIOMsgCmd)cmd).getChannel();
		} else if (cmd instanceof FirmataDigitalIOMsgCmd) {
			OscCmdUtils.INSTANCE.createOscCmd(OscUbiquinoUtils.OSC_FIRMATA_DIGITAL_GET);
			((FirmataDigitalIOMsgCmd)cmd).getAddr();
			((FirmataDigitalIOMsgCmd)cmd).getByte1();
			((FirmataDigitalIOMsgCmd)cmd).getByte2();
			((FirmataDigitalIOMsgCmd)cmd).getChannel();
		}
		return null;
	}
}
