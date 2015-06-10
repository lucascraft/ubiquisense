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

package net.sf.smbt.osc.ezmojo.cmd;

import net.sf.smbt.ezmojo.EZMojoCmd;
import net.sf.smbt.ezmojo.EzMojoInfoCmd;
import net.sf.smbt.osc.ezmojo.utils.EzMojoCmdUtils;
import net.sf.smbt.osccmd.OscCmd;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.engine.impl.AbstractCmdInterpreterImpl;

public class MojoCmdInterpreter extends AbstractCmdInterpreterImpl {
	public final static MojoCmdInterpreter INSTANCE = new MojoCmdInterpreter();
	@Override
	public synchronized byte[] cmd2ByteArray(final Cmd cmd) {
		if (cmd instanceof EZMojoCmd || cmd instanceof EzMojoInfoCmd || cmd instanceof OscCmd) {
			return EzMojoCmdUtils.INSTANCE.dumpEzMojoCmd(cmd);
		}
		return new byte[0];
	}
}
