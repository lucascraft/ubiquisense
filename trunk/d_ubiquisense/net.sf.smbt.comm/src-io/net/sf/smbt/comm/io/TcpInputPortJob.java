/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2010, Lucas Bigeardel
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

import net.sf.xqz.model.engine.IXFrameInterpreter;
import net.sf.xqz.model.engine.Rx;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;

/**
 * Handling TCP inputs
 * 
 * @author lucas
 *
 */
public class TcpInputPortJob extends AbstractInputJob {
	private ServerSocket serverSocket;
	private BufferedReader reader;
	private InputStream in;
	private Socket socket;
	private int portID;
	public TcpInputPortJob(int port) {
		super("tcp_" + port);
		this.portID = port;
		try {
			serverSocket = new ServerSocket(port);
			serverSocket.setSoTimeout(5000);
			socket = serverSocket.accept();
			in = socket.getInputStream();
			reader = new BufferedReader(new InputStreamReader(in));
		} catch (SocketTimeoutException e) {
			System.err.println("Server socket timemout on port " + port + " : please, initialize a connection to remove this message");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public int getPortID() {
		return portID;
	}
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		try {
			if (socket==null || !socket.isConnected()) {
				socket = serverSocket.accept();
				in = socket.getInputStream();
				reader = new BufferedReader(new InputStreamReader(in));
			}
			while (in.available()>0) {
				String line = reader.readLine();
				if (Platform.inDebugMode()) {
					System.out.println("TCP input from " + portID + " : " + line);
				}
				for (Rx rx : rxList) {
					synchronized (rx.getEngine().getInputInterpreter()) {
						IXFrameInterpreter frameInterpreter = rx.getEngine().getInputInterpreter();
						if (frameInterpreter != null) {
							rx.postCommand(
								frameInterpreter.byteArray2Cmd(line.getBytes())
							);
						} else {
							System.err.println("IXFrameInterpreter is null : impossible to process TCP input !!!");
						}
					}
				}
			}
		} catch (SocketTimeoutException e) {
			System.err.println("Server socket timemout on port " + portID + " : please, initialize a connection to remove this message");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (!serverSocket.isClosed()) {
			schedule();
		}
		return Status.OK_STATUS;
	}
	@Override
	public synchronized void close() {
		try {
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
	
