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

package net.sf.smbt.comm.utils.cmd;

import java.util.Arrays;

import net.sf.smbt.rawcomm.RawCmd;
import net.sf.smbt.rawcomm.RawcommFactory;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.engine.impl.AbstractFrameInterpreterImpl;

public class RawFrameInterpreter extends AbstractFrameInterpreterImpl {
	private byte[] buffer;

	public RawFrameInterpreter() {
		buffer = new byte[0];
	}
	
	@Override
	public synchronized Cmd byteArray2Cmd(byte[] stream) {
		char endOfExpr = '\n';
		RawCmd cmd = RawcommFactory.eINSTANCE.createRawCmd();
		int pos = Arrays.binarySearch(stream, (byte) endOfExpr);
		if (pos > 0) {
			int length = buffer.length;
			byte[] tmp = new byte[length + stream.length];
			System.arraycopy(buffer, 0, tmp, 0, length);
			System.arraycopy(stream, 0,	tmp, length, stream.length);
			cmd.setBytes(tmp);
			buffer = new byte[0];
		} else {
			cmd.setBytes(new byte[0]);
			int length = buffer.length;
			byte[] tmp = new byte[length + stream.length];
			if (length > 0) {
				System.arraycopy(buffer, 0, tmp, 0, length);
			}
			System.arraycopy(stream, 0,	tmp, length, stream.length);
			buffer = tmp;
		}
		return cmd;
	}
}
