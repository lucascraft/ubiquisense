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

package net.sf.smbt.osc.tuio11.cmd;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.ArrayList;
import java.util.List;

import net.sf.smbt.comm.io.UdpChannel;
import net.sf.smbt.osc.eztuio.Tuio2DCur;
import net.sf.smbt.osc.eztuio.Tuio2DObj;
import net.sf.smbt.osc.eztuio.TuioBundle;
import net.sf.smbt.osc.tuio.utils.Tuio11CmdUtils;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.engine.EVENT_KIND;
import net.sf.xqz.model.engine.Event;
import net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl;

import com.illposed.osc.OSCPacket;

public class Tuio11EventHandler extends AbstractQxEventHandlerImpl {
	public void handleQxEvent(Event event) {
		if (event.getKind().equals(EVENT_KIND.RX_DONE)) {
			Object obj = event.getQx().getEngine().getPort().getChannel();
			if (obj instanceof UdpChannel) {
				DatagramSocket socket = ((UdpChannel)obj).getSocket();
				DatagramPacket packet = new DatagramPacket(new byte[15360], 15360);
				if (event.getCmd() instanceof Tuio2DCur) {
					packet.setData(
						((Tuio2DCur)event.getCmd()).getMsg().getByteArray()
					);
				} else if (event.getCmd() instanceof Tuio2DObj) {
					packet.setData(
						((Tuio2DObj)event.getCmd()).getMsg().getByteArray()
					);
				} else if (event.getCmd() instanceof TuioBundle) {
					for (OSCPacket p : processTuioBundle((TuioBundle)event.getCmd())) {
						if (socket != null && socket.isBound()) {
							packet.setData(p.getByteArray());
							try {
								socket.send(packet);
							} catch (IOException ioe) {
								ioe.printStackTrace();
							}
						}
					}
					return;
				} else {
					return;
				}
				try {
					if (socket != null && socket.isBound()) {
						socket.send(packet);
					}
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
			}
		}
	}
	
	private List<OSCPacket> processTuioBundle(TuioBundle bundle) {
		return processTuioBundle(bundle, new ArrayList<OSCPacket>());
	}
	
	private List<OSCPacket> processTuioBundle(TuioBundle bundle, List<OSCPacket> packets) {
		for (Cmd c : bundle.getChildren()) {
			if (c instanceof Tuio2DObj || c instanceof Tuio2DCur) {
				packets.add(Tuio11CmdUtils.INSTANCE.createOSCPacketFromCmd(c));
			} else { // TuioBunle 
				packets.addAll(processTuioBundle((TuioBundle)c, new ArrayList<OSCPacket>()));
			}
		}
		return packets;
	}
}
