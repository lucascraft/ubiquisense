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

package net.sf.smbt.mappings;

import net.sf.smbt.firmata.handlers.FirmataQxEventHandler;
import net.sf.smbt.mapping.engine.AbstractMapEngine;
import net.sf.smbt.mappings.firmata.Firmata2OscMapping;
import net.sf.smbt.mappings.firmata.Osc2FirmataMapping;
import net.sf.smbt.osccmd.OscCmd;
import net.sf.smbt.protocol.ezfirmata.FirmataCmd;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl;

import com.illposed.osc.OSCMessage;

public class FirmataMapping extends AbstractMapEngine {

	@Override
	public Cmd ez2cmd(Cmd leftCmd) {
		return Osc2FirmataMapping.INSTANCE.osc2firmata((OSCMessage)((OscCmd)leftCmd).getMsg());
	}

	@Override
	public Cmd cmd2ez(Cmd leftCmd) {
		return Firmata2OscMapping.INSTANCE.firmata2osc((FirmataCmd)leftCmd);
	}
	
	@Override
	public AbstractQxEventHandlerImpl getQxHandler() {
		return eventAdapter == null ? eventAdapter = new FirmataQxEventHandler() : eventAdapter;
	}
}
