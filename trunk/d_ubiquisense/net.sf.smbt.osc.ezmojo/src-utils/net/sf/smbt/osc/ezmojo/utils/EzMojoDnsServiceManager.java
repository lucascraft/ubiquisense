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

import javax.jmdns.ServiceInfo;

import net.sf.smbt.quantic.services.ISmartDnsServiceManager;


public class EzMojoDnsServiceManager implements ISmartDnsServiceManager {

	private ServiceInfo serviceInfo;
	private EzAgent ezAgent;
	
	public EzMojoDnsServiceManager() {
        String text = "ProximiSense EzMojo Agent";
        Map<String, byte[]> properties = new HashMap<String, byte[]>();
        properties.put("srvname", text.getBytes());

		serviceInfo = ServiceInfo.create("_ezmojo._udp.local.", "ezmojo", 4444, 0, 0, true, properties);
	}
	
//	@Override
	public ServiceInfo getServiceInfo() {
		return serviceInfo;
	}
	
	@Override
	public void close() {
	}
	
	@Override
	public void connect() {
		ezAgent.init();
	}
	
	@Override
	public void disconnect() {
	};

	@Override
	public void init() {
		ezAgent = EzMojoAgentManager.INSTANCE.createEzAgent("localhost:4445", 4443);
		EzMojoAgentManager.INSTANCE.setLocalAgent(ezAgent);
	}
}
