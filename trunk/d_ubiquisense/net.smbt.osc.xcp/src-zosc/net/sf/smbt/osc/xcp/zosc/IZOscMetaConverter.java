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

package net.sf.smbt.osc.xcp.zosc;

import net.sf.smbt.xcp.XCPDevice;

import com.illposed.osc.OSCPacket;

/**
 * The idea behind is to be able to Zeroconf discover a XCP device environnment 
 * and query them using Minuit OSC based. 
 * 
 * The result would be an OSC description of the device and its services.
 * 
 *  The services having finality to be controlled it is cool to get its structure
 *  in an OSC exploitable form.
 *  
 *  from this form it will be easy to have *both* :
 *  - controls/services description
 *  - OSC messages for query/update ready to go
 * 
 * @author lucas bigeardel
 *
 */
public interface IZOscMetaConverter {
	
	/**
	 * OSC dump of an {@link XCPDevice} representation
	 * 
	 * @param device a given {@link XCPDevice} to dump as its possibly nested {@link OSCPacket} representation
	 * 
	 * @return very likely nested {@link OSCPacket} representation
	 */
	OSCPacket xcp2osc(XCPDevice device);
	
	/**
	 * Building of a {@link XCPDevice} from its {@link OSCPacket} representation
	 * 
	 * @param packet a given {@link OSCPacket} getting used to build its {@link XCPDevice} representation
	 * @param type service type as in _ubqt._udp.local.
	 * @param name service name for display
	 * @param port as for the port to connect with a socket
	 * 
	 * @return very likely well structured {@link XCPDevice}
	 */
	XCPDevice osc2xcp(OSCPacket packet);
}
