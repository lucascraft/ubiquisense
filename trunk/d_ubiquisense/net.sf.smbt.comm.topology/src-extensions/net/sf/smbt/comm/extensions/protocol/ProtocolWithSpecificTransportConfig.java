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

package net.sf.smbt.comm.extensions.protocol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.xqz.model.engine.IChannel;
import net.sf.xqz.model.engine.IQxEventHandler;
import net.sf.xqz.model.engine.IXCmdInterpreter;
import net.sf.xqz.model.engine.IXFrameInterpreter;

public class ProtocolWithSpecificTransportConfig {
	
	private String ID;
	private String desc;
	private String alias;
	
	private List<String> supportedTransports;
	
	private String cmdInterpreterID;
	private IXCmdInterpreter cmdInterpreter;
	
	private String frameInterpreterID;
	private IXFrameInterpreter frameInterpreter;
	
	private String eventHandlerID;
	private IQxEventHandler eventHandler;
	
	private int instanceNumber;
	
	private Map<String, IChannel> specificChannelsMap;
	
	public ProtocolWithSpecificTransportConfig() {
		supportedTransports = new ArrayList<String>();
		specificChannelsMap = new HashMap<String, IChannel>();
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public List<String> getSupportedTransports() {
		return supportedTransports;
	}

	public void setSupportedTransports(List<String> supportedTransports) {
		this.supportedTransports = supportedTransports;
	}

	public String getCmdInterpreterID() {
		return cmdInterpreterID;
	}

	public void setCmdInterpreterID(String cmdInterpreterID) {
		this.cmdInterpreterID = cmdInterpreterID;
	}

	public String getFrameInterpreterID() {
		return frameInterpreterID;
	}

	public void setFrameInterpreterID(String frameInterpreterID) {
		this.frameInterpreterID = frameInterpreterID;
	}

	public String getEventHandlerID() {
		return eventHandlerID;
	}

	public void setEventHandlerID(String eventHandlerID) {
		this.eventHandlerID = eventHandlerID;
	}

	public int getInstanceNumber() {
		return instanceNumber;
	}

	public void setInstanceNumber(int instanceNumber) {
		this.instanceNumber = instanceNumber;
	}
	
	public IXCmdInterpreter getCmdInterpreter() {
		return cmdInterpreter;
	}
	
	public void setCmdInterpreter(IXCmdInterpreter cmdInterpreter) {
		this.cmdInterpreter = cmdInterpreter;
	}
	
	public IQxEventHandler getEventHandler() {
		return eventHandler;
	}
	
	public void setEventHandler(IQxEventHandler eventHandler) {
		this.eventHandler = eventHandler;
	}
	
	public IXFrameInterpreter getFrameInterpreter() {
		return frameInterpreter;
	}
	
	public void setFrameInterpreter(IXFrameInterpreter frameInterpreter) {
		this.frameInterpreter = frameInterpreter;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Map<String, IChannel> getSpecificChannelsMap() {
		return specificChannelsMap;
	}
}
