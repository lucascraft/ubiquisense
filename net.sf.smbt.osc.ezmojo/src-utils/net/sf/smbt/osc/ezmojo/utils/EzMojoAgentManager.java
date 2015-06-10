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

package net.sf.smbt.osc.ezmojo.utils;

import java.util.HashMap;
import java.util.Map;

import net.sf.smbt.ezmojo.EzmojoFactory;

public class EzMojoAgentManager {
	public final static EzMojoAgentManager INSTANCE = new EzMojoAgentManager();
	
	protected EzMojoAgentManager() {
		//new MidiDnsSDAgent();
	}
	
	private Map<String, EzAgent> agentsMap = new HashMap<String, EzAgent>();
	
	private String localAgent;
	
	public EzAgent getLocalAgent() {
		return agentsMap.get(localAgent);
	}

	public Map<String, EzAgent> getAgentsMap() {
		return agentsMap;
	}
	
	public void setLocalAgent(EzAgent localAgent) {
		this.localAgent = localAgent.getAddr()+"_"+localAgent.getPort();
		agentsMap.put(localAgent.getAddr()+"_"+localAgent.getPort(), localAgent);
	}
	
	public EzAgent createEzAgent(String addr, int port) {
		EzAgent agent = new EzMojoAgent(addr,port);
		return setAgent(agent);
	}
	
	public EzAgent getAgent(String addr, int port) {
		return agentsMap.get(addr + "_" + port);
	}
	
	public EzAgent setAgent(EzAgent agent) {
		agentsMap.put(agent.getAddr() + "_" + agent.getPort(), agent);
		return agent;
	}
	
}
