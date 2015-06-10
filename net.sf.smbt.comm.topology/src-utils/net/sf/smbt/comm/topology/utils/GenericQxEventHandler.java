/***********************************************************************************
 * Cross Queues - A Model driven I/O queues utilities framework 
 * 
 * Copyright (c) 2011, Lucas Bigeardel
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

package net.sf.smbt.comm.topology.utils;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Socket;

import net.sf.smbt.comm.bluetooth.io.BTCommunicator;
import net.sf.smbt.comm.http.io.HttpCommunicator;
import net.sf.smbt.comm.utils.rxtx.Serial;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.cmd.CompoundCmd;
import net.sf.xqz.model.engine.EVENT_KIND;
import net.sf.xqz.model.engine.Event;
import net.sf.xqz.model.engine.IChannel;
import net.sf.xqz.model.engine.IXCmdInterpreter;
import net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl;

import com.rapplogic.xbee.api.XBee;
import com.rapplogic.xbee.util.ByteUtils;

public abstract class GenericQxEventHandler extends AbstractQxEventHandlerImpl {
	@Override
	public synchronized void handleQxEvent(Event event) {
		if (event.getKind() == EVENT_KIND.TX_READY || event.getKind() == EVENT_KIND.TX_DONE) {
			handleQxEvent(event, event.getCmd());
		}
	}
	
	private synchronized void handleQxEvent(Event evt, Cmd c) {
		if (c instanceof CompoundCmd) {
			for (Cmd cc : ((CompoundCmd)c).getChildren()) {
				handleQxEvent(evt, cc);
			}
		}
		
		if (evt.getQx().getEngine().getPort() != null) {
			Object obj = evt.getQx().getEngine().getPort().getChannel();

			synchronized (evt.getQx().getEngine().getOutputInterpreter()) {

				IXCmdInterpreter outputInterpreter = evt.getQx().getEngine().getOutputInterpreter();

				if (outputInterpreter != null) {
					if (obj instanceof IChannel) {
						((IChannel)obj).send(outputInterpreter.cmd2ByteArray(evt.getCmd()));
					} else if (obj instanceof BTCommunicator) { // Bluetooth L2CAP
						((BTCommunicator) obj).send(outputInterpreter.cmd2ByteArray(evt.getCmd()));
					} else if (obj instanceof HttpCommunicator) { // HTTP
						((HttpCommunicator) obj).get(evt);
					} else if (obj instanceof DatagramSocket) { // UDP
						DatagramSocket socket = (DatagramSocket) obj;
						try {
							byte[] frame = outputInterpreter.cmd2ByteArray(evt.getCmd());
							DatagramPacket packet = new DatagramPacket(frame, frame.length);
							socket.send(packet);
						} catch (IOException e) {
							//e.printStackTrace();
						} catch (NullPointerException ee) {
							ee.printStackTrace();
						}
					} else if (obj instanceof Socket) { // TCP
						Socket socket = (Socket) obj;
						try {
							byte[] frame = outputInterpreter.cmd2ByteArray(evt.getCmd());
							if (socket.getOutputStream() != null) {
								socket.getOutputStream().write(frame);
							}
						} catch (IOException e) {
							e.printStackTrace();
						} catch (NullPointerException ee) {
							ee.printStackTrace();
						}
					} else if (obj instanceof XBee) { // XBee
						XBee xbee = (XBee) obj;
						byte	[] frame = outputInterpreter.cmd2ByteArray(evt.getCmd());
						int[] ints = ByteUtils.stringToIntArray(new String(frame));

						// XBeeAddress16 xBeeAddress16 = new XBeeAddress16();
						//
						// TxRequest16 txReq16 = new TxRequest16(xBeeAddress16,
						// ints);

						try {
							xbee.sendPacket(ints);
						} catch (IOException e) {
							e.printStackTrace();
						}
					} else if (obj instanceof Serial) { // Serial
						byte[] frame = outputInterpreter.cmd2ByteArray(evt.getCmd());
						if (frame != null && frame.length > 0) {
							((Serial) obj).write(frame);
						}
					}
				}
			}
		}
	}
}
