/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
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

import net.sf.smbt.comm.extensions.protocol.ProtocolReactor;
import net.sf.smbt.comm.extensions.protocol.ProtocolWithSpecificTransportConfig;
import net.sf.xqz.engine.utils.EngineUtil;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.EngineApplication;
import net.sf.xqz.model.engine.EngineFactory;
import net.sf.xqz.model.engine.IQxEventHandler;
import net.sf.xqz.model.engine.IXCmdInterpreter;
import net.sf.xqz.model.engine.IXFrameInterpreter;

public class TopologyUtils {
	//
	// Singleton
	//
	public final static TopologyUtils INSTANCE = new TopologyUtils();
	
	//
	// bluetooth
	//
	public final static String BUETOOTH_SERIAL_PROTOCOL_PREFIX = "btsp://";
	
	//
	// UDP
	//
	public final static String UDP_PROTOCOL_PREFIX = "udp://";
	
	//
	// UDP
	//
	public final static String TCP_PROTOCOL_PREFIX = "tcp://";
	
	//
	// ZigBee
	//
	public final static String ZIGBEE_SERIAL_PROTOCOL_PREFIX = "zbsp://";
	
	
	//
	// Platform dependent : GUICE could help a lot 
	//
	public final static String USB_ADDR_PREFIX = "rs232://"; // ????
	
	
	//
	//
	// DN-Dns services (let's say only local services are considered)
	//
	//
	public final static String DS_DNS_HOST_PART = "_localhost";
	
	//
	// Ubqt main Bonjour service name
	//
	public final static String DS_DNS_EZMOJO_SERVICE_NAME = "_ezmojo";
	
	//
	// Ubqt TCP local DNS service name
	//
	public final static String DS_DNS_EZMOJO_TCP_LOCAL_DNS_SERVICE_NAME = "_ezmojo._tcp.local.";
	
	//
	// Ubqt UDP local DNS service name
	//
	public final static String DS_DNS_EZMOJO_UDP_LOCAL_DNS_SERVICE_NAME = "_ezmojo._udp.local.";

	
	//
	// iTunes Bonjour service name
	//
	public final static String DS_DNS_APPLE_ITUNES_SERVICE_NAME = "_daap";
	
	
	//
	//
	// Utilities handling different possible engine/protocols infrastructures
	//
	//

}
