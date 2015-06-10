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

package net.sf.smbt.comm.topology.cmd;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.cmd.XCmd;

public class JavaSerializeCmdUtil {
	
	public final static JavaSerializeCmdUtil INSTANCE = new JavaSerializeCmdUtil();
	
	private ByteArrayOutputStream stream;
	
	public JavaSerializeCmdUtil() {
		stream = new ByteArrayOutputStream(53536);
	}
	
	public synchronized Cmd byteArray2Cmd(byte[] stream) {
		return null;
	}
	
	public synchronized byte[] cmd2ByteArray(Cmd cmd) {
		if (cmd instanceof XCmd) {
			XCmd c = (XCmd) cmd;
			Object obj = c.getObj();
			if (obj instanceof Serializable) {
				ObjectOutputStream out = null;
				try {
					out = new ObjectOutputStream(stream);
					if (out != null) {
						out.writeObject(obj);
						out.close();		
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
				return stream.toByteArray();
			}
		}
		return new byte[0];
	}	
}
