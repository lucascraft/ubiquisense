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

package net.sf.smbt.firmata.handlers;

import org.eclipse.core.runtime.Platform;

import net.sf.smbt.firmata.utils.FirmataCmdUtils;
import net.sf.smbt.midi.ezmidi.AbstractMidiCmd;
import net.sf.smbt.midi.ezmidi.SysexMessage;
import net.sf.smbt.protocol.ezfirmata.FirmataCmd;
import net.sf.xqz.engine.cmd.utils.CmdUtil;
import net.sf.xqz.model.cmd.ByteCmd;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.engine.impl.AbstractCmdInterpreterImpl;

public class FirmataCmdInterpreter extends AbstractCmdInterpreterImpl {
	@Override
	public synchronized byte[] cmd2ByteArray(final Cmd cmd) {
		if (Platform.inDebugMode() && cmd != null) {
			System.out.println("!!! FirmataCmdInterpreter to send cmd !!!");
			CmdUtil.INSTANCE.dumpCmdInfo(cmd);
		}
		if (cmd instanceof SysexMessage) {
			SysexMessage msg = (SysexMessage) cmd;
			return FirmataCmdUtils.INSTANCE.dumpSysexMessage(msg);
		} else if (cmd instanceof FirmataCmd || cmd instanceof AbstractMidiCmd) {
			byte[] bytes = FirmataCmdUtils.INSTANCE.dumpFirmataCustomMidiMessage((AbstractMidiCmd)cmd);
			if (Platform.inDebugMode() && bytes != null) {
				System.out.println("SND : " + CmdUtil.INSTANCE.getFrameHexInfo(bytes));
			}
			return bytes;
		} if (cmd instanceof ByteCmd) {
			byte[] bytes = ((ByteCmd)cmd).getMessage();
			return bytes;
		}
		return new byte[0]; 
	}
}
