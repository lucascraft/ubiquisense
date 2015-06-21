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

package net.sf.smbt.quantic.warp;

import java.util.List;
import java.util.Map;

import net.sf.smbt.comm.ezxtopology.TopologyCache;
import net.sf.smbt.quantic.supervision.Supervisor;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.EngineApplication;
import net.sf.xqz.model.engine.EngineClient;
import net.sf.xqz.model.engine.IQxEventHandler;
import net.sf.xqz.model.engine.IXCmdInterpreter;
import net.sf.xqz.model.engine.IXFrameInterpreter;

public interface IWarpManager {
	
	/**
	 * Getter for {@link DnsSdUtil} agent
	 * 
	 * @return a {@link DnsSdUtil} agent reference
	 */
	//DnsSdUtil getAgent();
	
	/**
	 * Getter for {@link Supervisor} supervisor reference
	 * 
	 * @return {@link Supervisor} reference
	 */
	Supervisor getSupervisor();
	
	/**
	 * Getter for {@link TopologyCache} cache reference
	 * 
	 * @return topology cache
	 */
	TopologyCache getTopology();
	
	/**
	 * Returns a list of defined {@link CmdPipe} engines 
	 * 
	 * @return a list of defined {@link CmdPipe} engines
	 */
	List<CmdPipe> getPipes();
	
	/**
	 * Returns a uniquely defined engine 
	 * 
	 * @param engineID unique engine identifier
	 * 
	 * @return a uniquely registered command engine
	 */
	CmdPipe getPipe(String engineID);
	
	/**
	 * Returns a uniquely defined engine 
	 * 
	 * @param transportID unique transport identifier (UDP, TCP, USB, Bluetooth, XBee, Ubiquitous)
	 * @param protocoleID unique protocol identifier (among those contributed to net.sf.smbt.comm.topology.protocol)
	 * @param address outgoing address
	 * 
	 * @return a uniquely registered command engine
	 */
	CmdPipe getCmdEngine2(String transportID, String protocoleID, String addr);
	
	/**
	 * Returns a uniquely defined engine 
	 * 
	 * @param transportID unique transport identifier (UDP, TCP, USB, Bluetooth, XBee, Ubiquitous)
	 * @param protocoleID unique protocol identifier (among those contributed to net.sf.smbt.comm.topology.protocol)
	 * @param address outgoing address
	 * @param port ingoing port
	 * 
	 * @return a uniquely registered command engine
	 */
	CmdPipe getPipe(String transportID, String protocoleID, String addr, int port);
	
	/**
	 * Returns a uniquely defined engine 
	 * 
	 * @param transportID unique transport identifier (UDP, TCP, USB, Bluetooth, XBee, Ubiquitous)
	 * @param protocoleID unique protocol identifier (among those contributed to net.sf.smbt.comm.topology.protocol)
	 * @param address outgoing address
	 * @param port ingoing port
	 * 
	 * @return a uniquely registered command engine
	 */
	CmdPipe getPipe(String transportID, String protocoleID, String addr, Integer port);
	
	/**
	 * Returns a uniquely defined engine 
	 * 
	 * @param transportID unique transport identifier (UDP, TCP, USB, Bluetooth, XBee, Ubiquitous)
	 * @param protocoleID unique protocol identifier (among those contributed to net.sf.smbt.comm.topology.protocol)
	 * @param address outgoing address
	 * @param ports ingoing ports
	 * @param speed USB baud rate
	 * 
	 * @return a uniquely registered command engine
	 */
	CmdPipe getPipe(String transportID, String protocoleID, String addr, int[] ports, int speed);
	
	/**
	 * Returns a uniquely defined engine 
	 * 
	 * @param transportID unique transport identifier (UDP, TCP, USB, Bluetooth, XBee, Ubiquitous)
	 * @param protocoleID unique protocol identifier (among those contributed to net.sf.smbt.comm.topology.protocol)
	 * @param address outgoing address
	 * @param ports ingoing ports
	 * @param speed USB baud rate
	 * 
	 * @return a uniquely registered command engine
	 */
	CmdPipe getPipe2(String transportID, String protocoleID, String addr, List<Integer> ports, int speed);
	
	/**
	 * Returns a uniquely defined engine 
	 * 
	 * @param transportID unique transport identifier (UDP, TCP, USB, Bluetooth, XBee, Ubiquitous)
	 * @param protocoleID unique protocol identifier (among those contributed to net.sf.smbt.comm.topology.protocol)
	 * @param port engine ingoing port
	 * 
	 * @return a uniquely registered command engine
	 */
	CmdPipe getCmdPipe(String transportID, String protocoleID, int port);
	
	/**
	 * Returns a uniquely defined engine 
	 * 
	 * @param transportID unique transport identifier (UDP, TCP, USB, Bluetooth, XBee, Ubiquitous)
	 * @param address outgoing address
	 * @param ports ingoing ports
	 * 
	 * @return a uniquely registered command engine
	 */
	public CmdPipe getPipe(String transportID, String address, int[] ports);

	/**
	 * Returns a uniquely defined engine 
	 * 
	 * @param transportID unique transport identifier (UDP, TCP, USB, Bluetooth, XBee, Ubiquitous)
	 * @param address outgoing address
	 * @param ports ingoing ports
	 * 
	 * @return a uniquely registered command engine
	 */
	public CmdPipe getPipe2(String transportID, String address, List<Integer> ports);

	/**
	 * Returns a uniquely defined engine 
	 * 
	 * @param transportID unique transport identifier (UDP, TCP, USB, Bluetooth, XBee, Ubiquitous)
	 * @param ports ingoing ports
	 * 
	 * @return a uniquely registered command engine
	 */
	public CmdPipe getPipe(String transportID, int[] ports);

	/**
	 * Returns defined engines from their given transport type
	 * 
	 * @param transportID unique transport identifier (UDP, TCP, USB, Bluetooth, XBee, Ubiquitous)
	 * 
	 * @return command engines, void list otherwise
	 */
	public List<CmdPipe> getEnginesByTransport(String transportID);

	/**
	 * Returns defined engines from their given comm type
	 * 
	 * @param commID unique communication identifier (osc, wiimote, DMX, Midi, ...)
	 * 
	 * @return command engines, void list otherwise
	 */
	public List<CmdPipe> getEnginesByCommunication(String commID);

	/**
	 * Returns defined engines from their given comm type
	 * 
	 * @param transportID unique transport identifier (UDP, TCP, USB, Bluetooth, XBee, Ubiquitous)
	 * @param commID unique communication identifier (osc, wiimote, DMX, Midi, ...)
	 * 
	 * @return command engines, void list otherwise
	 */
	public List<CmdPipe> getEnginesByTansportAndCommunication(String transportID, String commID);

	/**
	 * Returns a uniquely defined engine 
	 * 
	 * @param transportID unique transport identifier (UDP, TCP, USB, Bluetooth, XBee, Ubiquitous)
	 * @param ports ingoing ports
	 * 
	 * @return a uniquely registered command engine
	 */
	public CmdPipe getPipe2(String transportID, List<Integer> ports);

	/**
	 * Returns a list of contributed {@link EngineClient} clients
	 * 
	 * @return registered {@link EngineClient} engine clients
	 */
	List<EngineClient> getEngineClients();
	
	/**
	 * Returns an {@link EngineClient} from a contributed clientID 
	 * 
	 * @param clientID engine client unique ID
	 * 
	 * @return an {@link EngineClient} from its clientID
	 */
	EngineClient getEngineClient(String clientID);
	
	/**
	 * Returns a list of contributed {@link EngineApplication} applications
	 * 
	 * @return a list of contributed {@link EngineApplication} applications
	 */
	List<EngineApplication> getEngineApplications();
	
	/**
	 * Return the registered application
	 * 
	 * @param applicationID {@link EngineApplication} unique ID
	 * 
	 * @return the uniquely defined {@link EngineApplication} application 
	 */
	EngineApplication getEngineApplication(String applicationID);
	
	/**
	 * Getter for a map of {@link IQxEventHandler} event handlers
	 * 
	 * @return a map of {@link IQxEventHandler} event handlers
	 */
	Map<String, IQxEventHandler> getQxEventHandlers();
	
	/**
	 * Return a {@link IQxEventHandler} handler reference
	 * 
	 * @param evtHandlerID  Event handler unique identifier
	 * 
	 * @return a contributed {@link IQxEventHandler} handler reference
	 */
	IQxEventHandler getQxEventHandler(String evtHandlerID);
	
	/**
	 * Getter for a map of {@link IXCmdInterpreter} command interpreters
	 * 
	 * @return a map of {@link IXCmdInterpreter} command interpreters
	 */
	Map<String, IXCmdInterpreter> getQxCommandInterpreters();
	
	/**
	 * Getter for a contributed {@link IXCmdInterpreter} interpreter
	 * 
	 * @param cmdInterpreterID Command Interpreter unique identifier
	 * 
	 * @return a contributed {@link IXCmdInterpreter} interpreter
	 */
	IXCmdInterpreter getQxCommandInterpreters(String cmdInterpreterID);
	
	/**
	 * Returns a list of contributed {@link IXFrameInterpreter} interpreters
     * 
	 * @return a list of contributed {@link IXFrameInterpreter} interpreters
	 */
	Map<String, IXFrameInterpreter> getQxFrameInterpreters();
	
	/**
	 * Returns a contributed {@link IXFrameInterpreter} interpreter
	 * 
	 * @param frameInterpreterID frame interpreter unique identifier
	 * 
	 * @return a contributed {@link IXFrameInterpreter} interpreter
	 */
	IXFrameInterpreter getQxFrameInterpreter(String frameInterpreterID);
	
	
}
