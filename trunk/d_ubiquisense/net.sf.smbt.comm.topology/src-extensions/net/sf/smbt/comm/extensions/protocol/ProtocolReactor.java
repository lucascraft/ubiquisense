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
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.smbt.comm.script.config.utils.NetConfigUtil;
import net.sf.xqz.engine.utils.ICommunicatorReactor;
import net.sf.xqz.model.engine.IQxEventHandler;
import net.sf.xqz.model.engine.IXCmdInterpreter;
import net.sf.xqz.model.engine.IXFrameInterpreter;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

public class ProtocolReactor {
	private Map<String, ProtocolWithSpecificTransportConfig> protocolWithSpecificTransportMap;
	private NetConfigUtil netCfgUtil;
	
	public final static ProtocolReactor INSTANCE = new ProtocolReactor();
	
	public ProtocolReactor() {
		netCfgUtil = NetConfigUtil.INSTANCE;
		protocolWithSpecificTransportMap = new HashMap<String, ProtocolWithSpecificTransportConfig>();
	}

	public Collection<ProtocolWithSpecificTransportConfig> getProtocolsWithSpecificTransport() {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IExtensionPoint point = registry.getExtensionPoint("net.sf.smbt.comm.topology.protocol");
		if (point == null) return null;
		IExtension[] extensions = point.getExtensions();
		for (int i = 0; i < extensions.length; i++) {
			for (IConfigurationElement elem : extensions[i].getConfigurationElements()) {
				String ID = elem.getAttribute("ID");
				ID = ID.trim();
				ProtocolWithSpecificTransportConfig protocol = createProtocolWithSpecificTransportConfig(elem);
				if (!protocolWithSpecificTransportMap.containsKey(ID)) {
					protocolWithSpecificTransportMap.put(ID, protocol);
				}
				protocol.setID(ID);
			}
		}
		return protocolWithSpecificTransportMap.values();
	}
	/**
	 * Accessor for a Protocol configuration from its protocol ID
	 * 
	 * @param protocolID contributed protocol ID
	 * 
	 * @return a contributed Protocol configuration from its ID
	 */
	public ProtocolWithSpecificTransportConfig getProtocolsWithSpecificTransportMap(String protocolID) {
		if (protocolWithSpecificTransportMap.containsKey(protocolID)) {
			return protocolWithSpecificTransportMap.get(protocolID);
		} else {
			IExtensionRegistry registry = Platform.getExtensionRegistry();
			IExtensionPoint point = registry.getExtensionPoint("net.sf.smbt.comm.topology.protocol");
			if (point == null) return null;
			IExtension[] extensions = point.getExtensions();
			for (int i = 0; i < extensions.length; i++) {
				for (IConfigurationElement elem : extensions[i].getConfigurationElements()) {
					String ID = elem.getAttribute("ID");
					String alias = elem.getAttribute("alias");
					if (ID.equals(protocolID) || alias.equals(protocolID)) {
						ProtocolWithSpecificTransportConfig protocol = createProtocolWithSpecificTransportConfig(elem);
						if (!protocolWithSpecificTransportMap.containsKey(ID)) {
							protocolWithSpecificTransportMap.put(ID, protocol);
						}
						protocol.setID(ID);
						return protocol;
					}
				}
			}
		}
		return null;
	}

	/**
	 * Return contributed Protocol configurations map with IDs as keys
	 * 
	 * @return contributed Protocol configurations hash map with IDs as keys
	 */
	public Map<String, ProtocolWithSpecificTransportConfig> getProtocolsWithSpecificTransportMap() {
		return protocolWithSpecificTransportMap;
	}
	
	/**
	 * Remove protocol in extension management lifecycle steps
	 * 
	 * @param ext extension point contribution to be removed
	 */
	public void addProtocol(IExtension ext) {
//		String ID = getProtocolID(ext);
//		if (!"".equals(ID)) {
//			protocolWithSpecificTransportMap.put(
//				ID, 
//				createProtocolWithSpecificTransportConfig(ext)
//			);
//		}
	}
	
	/**
	 * Remove protocol in extension management lifecycle steps
	 * 
	 * @param ext extension point contribution to be removed
	 */
	public void removeProtocol(IExtension ext) {
//		String ID = getProtocolID(ext);
//		if (!"".equals(ID)) {
//			protocolWithSpecificTransportMap.remove(ID);
//		}
	}
	
	/*
	 * Create a Protocol from contributed valuations
	 */
	private ProtocolWithSpecificTransportConfig createProtocolWithSpecificTransportConfig(IConfigurationElement elem) {
		ProtocolWithSpecificTransportConfig protocol = new ProtocolWithSpecificTransportConfig();
		if (sanityCheckOK(elem)) {
			protocol.setID(elem.getAttribute("ID"));
			protocol.setDesc(elem.getAttribute("desc"));
			protocol.setAlias(elem.getAttribute("alias"));
			protocol.setCmdInterpreterID(elem.getAttribute("cmdInterpreterID"));
			protocol.setCmdInterpreter(getCmdInterpreter(protocol.getCmdInterpreterID()));
			protocol.setFrameInterpreterID(elem.getAttribute("frameInterpreter"));
			protocol.setFrameInterpreter(getFrameInterpreter(protocol.getFrameInterpreterID()));
			protocol.setEventHandlerID(elem.getAttribute("eventHandler"));
			protocol.setEventHandler(getEventHandler(protocol.getEventHandlerID()));
			protocol.setSupportedTransports(Arrays.asList(elem.getAttribute("transports").split(",")));
			
			for (String comm : new String[]{"HTTP", "USB", "TCP", "UDP", "XBEE", "BT", "MIDI"}) {
				if (protocol.getSupportedTransports().contains(comm)) {
					try {
						ICommunicatorReactor channelInstance = (ICommunicatorReactor) elem.createExecutableExtension("custom"+comm);
						protocol.getSpecificChannelsMap().put(comm, channelInstance.createChannel(protocol.getID()));
					} catch (CoreException e) {
						// just optional
					}
				}
			}
		}
		return protocol;
	}
	
	public String[] getProtocolIDS() {
		Collection<ProtocolWithSpecificTransportConfig> cfgList = getProtocolsWithSpecificTransport();
		String[] IDs = new String[cfgList.size()];
		int i = 0;
		for (ProtocolWithSpecificTransportConfig cfg : cfgList) {
			IDs[i] = cfg.getID();
			i++;
		}
		return IDs;
	}

	/**
	 * Creates a Protocol configuration from an extension point contributions
	 * (command interpreter, frame interpreter, event handler).
	 * 
	 * @param extension net.sf.smbt.comm.rpotocol extension point contribution
	 * 
	 * @return a list of contributed Protocol configurations
	 */
	public List<ProtocolWithSpecificTransportConfig> createProtocolWithSpecificTransportConfig(IExtension extension) {
		List<ProtocolWithSpecificTransportConfig> protocolList = new ArrayList<ProtocolWithSpecificTransportConfig>();
		for (IConfigurationElement elem : extension.getConfigurationElements()) {
			try {
				protocolList.add(
					createProtocolWithSpecificTransportConfig(elem)
				);
			} catch (Throwable t) {
				// hugly
			}
		}
		return protocolList;
	}
	
	/*
	 * Plain old intrinsic sanity check
	 */
	private boolean sanityCheckOK(IConfigurationElement elem) {
		assert elem != null;
		assert elem.getAttribute("alias")				!= null;
		assert !elem.getAttribute("alias")				.equals("");
		assert elem.getAttribute("desc")				!= null;
		assert elem.getAttribute("ID")					!= null;
		assert !elem.getAttribute("ID")					.equals("");
		assert elem.getAttribute("instance")			!= null;
		assert !elem.getAttribute("instance")			.equals("");
		assert elem.getAttribute("transports")			!= null;
		assert !elem.getAttribute("transports")			.equals("");
		assert elem.getAttribute("cmdInterpreterID")	!= null;
		assert elem.getAttribute("frameInterpreter") 	!= null;
		assert elem.getAttribute("eventHandler") 		!= null;
		
		String transports = elem.getAttribute("transports");
		
		assert transports != null;
		assert Arrays.asList(transports.split(",")).size() > 0;
		
		return true;
	}
	
	//
	// FIXME: don't forget AppEngineUtils
	//

	/**
	 * Get command interpreter from its contributed identifier
	 *  
	 * @param cmdIntepreterID contributed command interpreter ID to net.sf.xqz.engine.cmdInterpreter ext point
	 * 
	 * @return a newly created {@link IXCmdInterpreter} interpreter
	 */
	public IXCmdInterpreter getCmdInterpreter(String cmdIntepreterID) {
		IXCmdInterpreter cmdInterpreter = null;
		for (ProtocolWithSpecificTransportConfig cfg : protocolWithSpecificTransportMap.values()) {
			if (cfg.getCmdInterpreterID() != null && cfg.getCmdInterpreterID().equals(cmdIntepreterID)) {
				cmdInterpreter = netCfgUtil.getCommandInterpreter(cmdIntepreterID);	
				if (cmdInterpreter != null) {
					return cmdInterpreter;
				}
			}
		}
		if (cmdInterpreter == null) {
			cmdInterpreter = netCfgUtil.resolveCmdInterpreterInOSGiContext(cmdIntepreterID);	
			if (cmdInterpreter != null) {
				return cmdInterpreter;
			}
		}		
		return null;
	}
	
	/**
	 * Get frame interpreter from its contributed identifier
	 *  
	 * @param frameIntepreterID contributed frame interpreter ID to net.sf.xqz.engine.frameInterpreter ext point
	 * 
	 * @return a newly created {@link IXFrameInterpreter} interpreter
	 */
	public IXFrameInterpreter getFrameInterpreter(String frameIntepreterID) {
		IXFrameInterpreter frameInterpreter = null;
		for (ProtocolWithSpecificTransportConfig cfg : protocolWithSpecificTransportMap.values()) {
			if (cfg.getFrameInterpreterID() != null && cfg.getFrameInterpreterID().equals(frameIntepreterID)) {
				frameInterpreter = netCfgUtil.getFrameInterpreter(frameIntepreterID);	
				if (frameInterpreter != null) {
					return frameInterpreter;
				} 
			}
		}
		if (frameInterpreter == null) {
			frameInterpreter = netCfgUtil.resolveFrameInterpreterInOSGiContext(frameIntepreterID);	
			if (frameInterpreter != null) {
				return frameInterpreter;
			}
		}
		return null;
	}
	
	/**
	 * Get event handler from its contributed identifier
	 *  
	 * @param eventHandlerID contributed from interpreter ID to net.sf.xqz.engine.qxEventHandler ext point
	 * 
	 * @return a newly created {@link IQxEventHandler} handler
	 */
	public IQxEventHandler getEventHandler(String eventHandlerID) {
		IQxEventHandler evtHandler = null;
		for (ProtocolWithSpecificTransportConfig cfg : protocolWithSpecificTransportMap.values()) {
			if (cfg.getEventHandlerID() != null && cfg.getEventHandlerID().equals(eventHandlerID)) {
				evtHandler = netCfgUtil.getQxEventHandler(eventHandlerID);	
				if (evtHandler != null) {
					return evtHandler;
				}
			}
		}
		if (evtHandler == null) {
			evtHandler = netCfgUtil.resolveListenerInOSGiContext(eventHandlerID);	
			if (evtHandler != null) {
				return evtHandler;
			}
		}
		return null;
	}
}
