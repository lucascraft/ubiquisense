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

package net.sf.smbt.blinkm.cmd;

import net.sf.smbt.blinkm.cmd.injection.BlinkMUtil;
import net.sf.smbt.commands.BlinkMCmd;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.engine.impl.AbstractCmdInterpreterImpl;

import org.eclipse.core.runtime.Platform;

public class BlinkMCmdInterpreter extends AbstractCmdInterpreterImpl {
	public BlinkMCmdInterpreter() {
	}

	public synchronized byte[] cmd2ByteArray(Cmd cmd) {
		if (cmd instanceof BlinkMCmd) {
			return BlinkMUtil.INSTANCE.toByteArray((BlinkMCmd) cmd);
		} else {
			return new byte[0];
		}
	}
	
	public synchronized int getCmdResultLength(Cmd cmd) {
		return cmd instanceof BlinkMCmd ? 
				((BlinkMCmd) cmd).getRetValues().length : 
					-1;
	}
	
	public synchronized void processResults(Cmd cmd, byte[] stream) {
		if (cmd instanceof BlinkMCmd) {
			BlinkMCmd blinkMCmd = (BlinkMCmd) cmd;
			if (Platform.inDebugMode()) {
				System.out.println(" Frame BEFORE : " + BlinkMUtil.INSTANCE.dumpStreamAsHex(stream));
			}
			byte[] retVal = new byte[blinkMCmd.getRetValues().length];
			System.arraycopy(stream, stream.length-retVal.length, retVal, 0, retVal.length);
			blinkMCmd.setRetValues(retVal);
			if (Platform.inDebugMode()) {
				System.out.println(" Frame  AFTER : " + BlinkMUtil.INSTANCE.dumpStreamAsHex(retVal));
			}
		}
	}
}
