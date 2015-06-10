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

package net.sf.smbt.comm.io;

import net.sf.xqz.model.engine.IXFrameInterpreter;
import net.sf.xqz.model.engine.Rx;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

public class UdpInputPortJob extends AbstractInputJob {
	private volatile UdpRcvChannel channel;
	private int portID;

	public UdpInputPortJob(int port) {
		super("udp_" + port);
		this.portID = port;
		channel = new UdpRcvChannel(port);
	}
	public int getPortID() {
		return portID;
	}
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		synchronized(channel) {
			if (channel.connected()) {
				channel.receive(new byte[65535]);
				for (Rx rx : rxList) {
					synchronized (rx.getEngine().getInputInterpreter()) {
						IXFrameInterpreter frameInterpreter = rx.getEngine().getInputInterpreter();
						if (frameInterpreter != null) {
							try {
								rx.postCommand(
									frameInterpreter.byteArray2Cmd(channel.getData())
								);
							} catch (Throwable t) {
								t.printStackTrace();
							}
						} else {
							System.err.println("IXFrameInterpreter is null : impossible to process UDP input !!!");
						}
					}
				}
			}
		}
		schedule();
		return Status.OK_STATUS;
	}
	@Override
	public synchronized void close() {
		channel.close();
	}
}
