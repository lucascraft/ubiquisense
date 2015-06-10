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

package net.sf.smbt.quantic.warp;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

import net.sf.smbt.osccmd.OscCmd;
import net.sf.xqz.model.engine.Event;
import net.sf.xqz.model.engine.IQxEventHandler;
import net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl;

import com.illposed.osc.OSCBundle;
import com.illposed.osc.OSCMessage;
import com.illposed.osc.OSCPacket;

public class PubSubEvtHandler extends AbstractQxEventHandlerImpl {
	private ConcurrentHashMap<String, ConcurrentHashMap<String, ConcurrentLinkedQueue<AbstractQxEventHandlerImpl>>> subscribers;
	
	public PubSubEvtHandler() {
		subscribers = new ConcurrentHashMap<String, ConcurrentHashMap<String, ConcurrentLinkedQueue<AbstractQxEventHandlerImpl>>>();
	}
	
	@Override
	public synchronized void handleQxEvent(Event event) {
		if (event.getCmd() instanceof OscCmd) {
			 handle(((OscCmd)event.getCmd()).getMsg(), event);
		}
	}
	
	private synchronized void handle(OSCPacket packet, Event event) {
		if (packet instanceof OSCMessage) {
			check((OSCMessage)packet, event);
		} else if (packet instanceof OSCBundle) {
			for (OSCPacket p : ((OSCBundle)packet).getPackets()) {
				handle(p, event);
			}
		}
	}
	
	private synchronized void check(OSCMessage msg, Event event) {
		if (subscribers.containsKey("osc")) {
			String topic = msg.getAddress();
			if (topic != null && topic.startsWith("/") && subscribers.get("osc").containsKey(topic)) {
				notify(event, subscribers.get("osc").get(topic));
			}
		}
	}
	
	private synchronized void notify(Event event, ConcurrentLinkedQueue<AbstractQxEventHandlerImpl> subscribers) {
		for (IQxEventHandler h : subscribers) {
			h.handleQxEvent(event);
		}
	}
	
	public synchronized void subscribe(String topic, AbstractQxEventHandlerImpl handler) {
		for (String protocol : subscribers.keySet()) {
			if (!subscribers.get(protocol).containsKey(topic)) {
				subscribers.get(protocol).put(topic, new ConcurrentLinkedQueue<AbstractQxEventHandlerImpl>());
			}
			ConcurrentLinkedQueue<AbstractQxEventHandlerImpl> qx = subscribers.get(protocol).get(topic);
			if (!qx.contains(handler)) {
				qx.add(handler);
			}
		}
	}
	
	public synchronized void subscribe(String protocol, String topic, AbstractQxEventHandlerImpl handler) {
		if(!subscribers.containsKey(protocol)) {
			subscribers.put(protocol, new ConcurrentHashMap<String, ConcurrentLinkedQueue<AbstractQxEventHandlerImpl>>());
		}
		if (!subscribers.get(protocol).containsKey(topic)) {
			subscribers.get(protocol).put(topic, new ConcurrentLinkedQueue<AbstractQxEventHandlerImpl>());
		}
		ConcurrentLinkedQueue<AbstractQxEventHandlerImpl> qx = subscribers.get(protocol).get(topic);
		if (!qx.contains(handler)) {
			qx.add(handler);
		}
	}
	
	public synchronized void unsubscribe(String topic, AbstractQxEventHandlerImpl handler) {
		for (String protocol : subscribers.keySet()) {
			if (subscribers.get(protocol).containsKey(topic)) {
				subscribers.get(protocol).get(topic).remove(handler);
			}
		}
	}
	
	public synchronized void unsubscribe(String protocol, String topic, AbstractQxEventHandlerImpl handler) {
		if (subscribers.contains(protocol)) {
			if (subscribers.get(protocol).containsKey(topic)) {
				subscribers.get(protocol).get(topic).remove(handler);
			}
		}
	}
	
	public synchronized void unsubscribe(String protocol, String topic) {
		if (subscribers.contains(protocol)) {
			if (subscribers.get(protocol).containsKey(topic)) {
				subscribers.get(protocol).get(topic).clear();
			}
		}
	}
	
	public synchronized void unsubscribe(String topic) {
		for (String protocol : subscribers.keySet()) {
			if (subscribers.get(protocol).containsKey(topic)) {
				subscribers.get(protocol).get(topic).clear();
			}
		}
	}
	
	public synchronized void unsubscribe(AbstractQxEventHandlerImpl handler) {
		for (String protocol : subscribers.keySet()) {
			for (String topic : subscribers.get(protocol).keySet()) {
				if (subscribers.get(protocol).get(topic).contains(handler)) {
					subscribers.get(protocol).get(topic).remove(handler);
				}
			}
		}
	}
}
