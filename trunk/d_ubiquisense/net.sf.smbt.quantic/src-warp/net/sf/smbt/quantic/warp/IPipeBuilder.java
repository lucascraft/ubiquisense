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

import net.sf.xqz.model.engine.CmdPipe;

public interface IPipeBuilder {
	/**
	 * Generic quantic pipe builder 
	 * 
	 * @param comm connection kind (TCP, UDP, HTTP, USB, BLUETOOTH, XBEE)
	 * @param protocolID
	 * @param pipeID unique quantic pipe identifier 
	 * @param portConfig a device for USB (COM1, /dev/tty.usb..., ...), XBEE (serial port), TCP/UDP ("localhost:1234", ...), MIDI, BLUETOOTH
	 * @param acceptedPorts incoming ports
	 * @param speed USB and XBEE only
	 * @param options USB and XBEE only
	 * 
	 * @return a newly created command enine as a quantic pipe
	 */
	public CmdPipe openPipe(String comm, String protocolID, String pipeID, String portConfig, int[] acceptedPorts, int speed, Map<Object, Object> options);
	
	/**
	 * Generic quantic pipe builder 
	 * 
	 * @param protocolID
	 * @param pipeID unique quantic pipe identifier 
	 * @param portConfig a device for USB (COM1, /dev/tty.usb..., ...)
	 * @param speed USB serial port baudrate
	 * 
	 * @return a newly created USB command enine as a quantic pipe
	 */
	public CmdPipe openUsbPipe(String protocolID, String pipeID, String portConfig, int speed);
	
	/**
	 * Generic quantic pipe builder 
	 * 
	 * @param protocolID
	 * @param pipeID unique quantic pipe identifier 
	 * @param portConfig a device for XBEE (serial port)
	 * @param speed XBEE serial port baudrate
	 * 
	 * @return a newly created XBEE command engine as a quantic pipe
	 */
	public CmdPipe openXBeePipe(String protocolID, String pipeID, String portConfig, int speed);
	
	/**
	 * Generic quantic pipe builder 
	 * 
	 * @param protocolID
	 * @param pipeID unique quantic pipe identifier 
	 * @param portConfig UDP inet addr as a string ("localhost:1234")
	 * @param acceptedPort accepted serial port
	 * 
	 * @return a newly created UDP command engine as a quantic pipe
	 */
	public CmdPipe openUdpPipe(String protocolID, String pipeID, String portConfig, int acceptedPort);
	
	/**
	 * Generic quantic pipe builder 
	 * 
	 * @param protocolID
	 * @param pipeID unique quantic pipe identifier 
	 * @param portConfig UDP inet addr as a string ("localhost:1234")
	 * @param acceptedPorts accepted serial ports
	 * 
	 * @return a newly created UDP command engine as a quantic pipe
	 */
	public CmdPipe openUdpPipe(String protocolID, String pipeID, String portConfig, int[] acceptedPorts);
	
	/**
	 * Generic quantic pipe builder 
	 * 
	 * @param protocolID
	 * @param pipeID unique quantic pipe identifier 
	 * @param portConfig TCP inet addr as a string ("localhost:1234")
	 * @param acceptedPorts accepted serial ports
	 * 
	 * @return a newly created TCP command engine as a quantic pipe
	 */
	public CmdPipe openTcpPipe(String protocolID, String pipeID, String portConfig, int[] acceptedPorts);
	
	/**
	 * Generic quantic pipe builder 
	 * 
	 * @param protocolID
	 * @param pipeID unique quantic pipe identifier 
	 * @param portConfig TCP inet addr as a string ("localhost:1234")
	 * @param acceptedPort accepted serial port
	 * 
	 * @return a newly created TCP command engine as a quantic pipe
	 */
	public CmdPipe openTcpPipe(String protocolID, String pipeID, String portConfig, int acceptedPort);
	
	/**
	 * Generic quantic pipe builder 
	 * 
	 * @param protocolID
	 * @param pipeID unique quantic pipe identifier 
	 * @param portConfig HTTP inet addr as a string ("localhost:1234")
	 * @param acceptedPorts accepted serial ports
	 * 
	 * @return a newly created HTTP command engine as a quantic pipe
	 */
	public CmdPipe openHttpPipe(String protocolID, String pipeID, String portConfig, int[] acceptedPorts);
	
	/**
	 * Generic quantic pipe builder 
	 * 
	 * @param protocolID
	 * @param pipeID unique quantic pipe identifier 
	 * @param portConfig HTTP inet addr as a string ("localhost:1234")
	 * @param acceptedPorts accepted serial ports
	 * 
	 * @return a newly created HTTP command engine as a quantic pipe
	 */
	public CmdPipe createHttpPipe(String protocolID, String pipeID, String portConfig, int[] acceptedPorts);
	
	/**
	 * Generic quantic pipe builder 
	 * 
	 * @param protocolID
	 * @param pipeID unique quantic pipe identifier 
	 * @param portConfig HTTP inet addr as a string ("localhost:1234")
	 * @param acceptedPort accepted serial port
	 * 
	 * @return a newly created HTTP command engine as a quantic pipe
	 */
	public CmdPipe openHttpPipe(String protocolID, String pipeID, String portConfig, int acceptedPort);
	
	/**
	 * Generic quantic pipe builder 
	 * 
	 * @param protocolID
	 * @param pipeID unique quantic pipe identifier 
	 * @param portConfig HTTP inet addr as a string ("localhost:1234")
	 * @param acceptedPort accepted serial port
	 * 
	 * @return a newly created HTTP command engine as a quantic pipe
	 */
	public CmdPipe createHttpPipe(String protocolID, String pipeID, String portConfig, int acceptedPort);
	
	/**
	 * Generic quantic pipe builder 
	 * 
	 * @param protocolID
	 * @param pipeID unique quantic pipe identifier 
	 * @param portConfig BLUETOOTH ("localhost:1234", ...)
	 * @param acceptedPorts accepted serial ports
	 * 
	 * @return a newly created BLUETOOTH command engine as a quantic pipe
	 */
	public CmdPipe openBluetoothPipe(String protocolID, String pipeID, String portConfig, int speed);
	
	/**
	 * Generic quantic pipe builder 
	 * 
	 * @param protocolID
	 * @param pipeID unique quantic pipe identifier 
	 * @param portConfig XBEE serial port baudrate
	 * 
	 * @return a newly created XBEE command engine as a quantic pipe
	 */
	public CmdPipe openXBeePipe(String protocolID, String pipeID, String portConfig);
	
	/**
	 * Generic quantic pipe builder 
	 * 
	 * @param protocolID
	 * @param pipeID unique quantic pipe identifier 
	 * @param portConfig UDP inet addr as a string ("localhost:1234")
	 * 
	 * @return a newly created UDP command engine as a quantic pipe
	 */
	public CmdPipe openUdpPipe(String protocolID, String pipeID, String portConfig);
	
	/**
	 * Generic quantic pipe builder 
	 * 
	 * @param protocolID
	 * @param pipeID unique quantic pipe identifier 
	 * @param portConfig TCP inet addr as a string ("localhost:1234")
	 * 
	 * @return a newly created TCP command engine as a quantic pipe
	 */
	public CmdPipe openTcpPipe(String protocolID, String pipeID, String portConfig);
	
	/**
	 * Generic quantic pipe builder 
	 * 
	 * @param protocolID
	 * @param pipeID unique quantic pipe identifier 
	 * @param portConfig HTTP inet addr as a string ("localhost:1234")
	 * 
	 * @return a newly created HTTP command engine as a quantic pipe
	 */
	public CmdPipe openHttpPipe(String protocolID, String pipeID, String portConfig);
	
	/**
	 * Generic quantic pipe builder 
	 * 
	 * @param protocolID
	 * @param pipeID unique quantic pipe identifier 
	 * @param portConfig HTTP inet addr as a string ("localhost:1234")
	 * 
	 * @return a newly created HTTP command engine as a quantic pipe
	 */
	public CmdPipe createHttpPipe(String protocolID, String pipeID, String portConfig);
	
	
	
	//
	// Unamed Quantic Pipes (should be identified thanks to portConfig)
	//


	/**
	 * Generic quantic pipe builder w/ generated pseudo random ID (&lt;protocol&gt;Pipe_&lt;UUID&gt;_&lt;portId&gt;)
	 * 
	 * @param protocolID
	 * @param portConfig a device for USB (COM1, /dev/tty.usb..., ...)
	 * @param speed USB serial port baudrate
	 * 
	 * @return a newly created USB command enine as a quantic pipe
	 */
	public CmdPipe openUsbPipe(String protocolID, String portConfig, int speed);
	
	/**
	 * Generic quantic pipe builder w/ generated pseudo random ID (&lt;protocol&gt;Pipe_&lt;UUID&gt;_&lt;portId&gt;)
	 * 
	 * @param protocolID
	 * @param portConfig a device for XBEE (serial port)
	 * @param speed XBEE serial port baudrate
	 * 
	 * @return a newly created XBEE command engine as a quantic pipe
	 */
	public CmdPipe openXBeePipe(String protocolID, String portConfig, int speed);
	
	/**
	 * Generic quantic pipe builder w/ generated pseudo random ID (&lt;protocol&gt;Pipe_&lt;UUID&gt;_&lt;portId&gt;)
	 * 
	 * @param protocolID
	 * @param portConfig UDP inet addr as a string ("localhost:1234")
	 * @param acceptedPort accepted serial port
	 * 
	 * @return a newly created UDP command engine as a quantic pipe
	 */
	public CmdPipe openUdpPipe(String protocolID, String portConfig, int acceptedPort);
	
	/**
	 * Generic quantic pipe builder w/ generated pseudo random ID (&lt;protocol&gt;Pipe_&lt;UUID&gt;_&lt;portId&gt;)
	 * 
	 * @param protocolID
	 * @param portConfig UDP inet addr as a string ("localhost:1234")
	 * @param acceptedPorts accepted serial ports
	 * 
	 * @return a newly created UDP command engine as a quantic pipe
	 */
	public CmdPipe openUdpPipe(String protocolID, String portConfig, int[] acceptedPorts);
	
	/**
	 * Generic quantic pipe builder w/ generated pseudo random ID (&lt;protocol&gt;Pipe_&lt;UUID&gt;_&lt;portId&gt;)
	 * 
	 * @param protocolID
	 * @param portConfig TCP inet addr as a string ("localhost:1234")
	 * @param acceptedPorts accepted serial ports
	 * 
	 * @return a newly created TCP command engine as a quantic pipe
	 */
	public CmdPipe openTcpPipe(String protocolID, String portConfig, int[] acceptedPorts);
	
	/**
	 * Generic quantic pipe builder w/ generated pseudo random ID (&lt;protocol&gt;Pipe_&lt;UUID&gt;_&lt;portId&gt;)
	 * 
	 * @param protocolID
	 * @param portConfig TCP inet addr as a string ("localhost:1234")
	 * @param acceptedPort accepted serial port
	 * 
	 * @return a newly created TCP command engine as a quantic pipe
	 */
	public CmdPipe openTcpPipe(String protocolID, String portConfig, int acceptedPort);
	
	/**
	 * Generic quantic pipe builder w/ generated pseudo random ID (&lt;protocol&gt;Pipe_&lt;UUID&gt;_&lt;portId&gt;)
	 * 
	 * @param protocolID
	 * @param portConfig HTTP inet addr as a string ("localhost:1234")
	 * @param acceptedPorts accepted serial ports
	 * 
	 * @return a newly created HTTP command engine as a quantic pipe
	 */
	public CmdPipe openHttpPipe(String protocolID, String portConfig, int[] acceptedPorts);
	
	/**
	 * Generic quantic pipe builder w/ generated pseudo random ID (&lt;protocol&gt;Pipe_&lt;UUID&gt;_&lt;portId&gt;)
	 * 
	 * @param protocolID
	 * @param portConfig HTTP inet addr as a string ("localhost:1234")
	 * @param acceptedPorts accepted serial ports
	 * 
	 * @return a newly created HTTP command engine as a quantic pipe
	 */
	public CmdPipe createHttpPipe(String protocolID, String portConfig, int[] acceptedPorts);
	
	/**
	 * Generic quantic pipe builder w/ generated pseudo random ID (&lt;protocol&gt;Pipe_&lt;UUID&gt;_&lt;portId&gt;)
	 * 
	 * @param protocolID
	 * @param portConfig HTTP inet addr as a string ("localhost:1234")
	 * @param acceptedPort accepted serial port
	 * 
	 * @return a newly created HTTP command engine as a quantic pipe
	 */
	public CmdPipe openHttpPipe(String protocolID, String portConfig, int acceptedPort);
	
	/**
	 * Generic quantic pipe builder w/ generated pseudo random ID (&lt;protocol&gt;Pipe_&lt;UUID&gt;_&lt;portId&gt;)
	 * 
	 * @param protocolID
	 * @param portConfig HTTP inet addr as a string ("localhost:1234")
	 * @param acceptedPort accepted serial port
	 * 
	 * @return a newly created HTTP command engine as a quantic pipe
	 */
	public CmdPipe createHttpPipe(String protocolID, String portConfig, int acceptedPort);
	
	/**
	 * Generic quantic pipe builder w/ generated pseudo random ID (&lt;protocol&gt;Pipe_&lt;UUID&gt;_&lt;portId&gt;)
	 * 
	 * @param protocolID 
	 * @param portConfig BLUETOOTH ("localhost:1234", ...)
	 * @param speed bauds rate
	 * 
	 * @return a newly created BLUETOOTH command engine as a quantic pipe
	 */
	public CmdPipe openBluetoothPipe(String protocolID, String portConfig, int speed);
	
	/**
	 * Generic quantic pipe builder w/ generated pseudo random ID (&lt;protocol&gt;Pipe_&lt;UUID&gt;_&lt;portId&gt;)
	 * 
	 * @param protocolID
	 * @param portConfig BLUETOOTH ("localhost:1234", ...)
	 * 
	 * @return a newly created BLUETOOTH command engine as a quantic pipe
	 */
	public CmdPipe openBluetoothPipe(String protocolID, String portConfig);
	
	/**
	 * Generic quantic pipe builder w/ generated pseudo random ID (&lt;protocol&gt;Pipe_&lt;UUID&gt;_&lt;portId&gt;)
	 * 
	 * @param protocolID
	 * @param portConfig XBEE serial port baudrate
	 * 
	 * @return a newly created XBEE command engine as a quantic pipe
	 */
	public CmdPipe openXBeePipe(String protocolID, String portConfig);
	
	/**
	 * Generic quantic pipe builder w/ generated pseudo random ID (&lt;protocol&gt;Pipe_&lt;UUID&gt;_&lt;portId&gt;)
	 * 
	 * @param protocolID
	 * @param portConfig UDP inet addr as a string ("localhost:1234")
	 * 
	 * @return a newly created UDP command engine as a quantic pipe
	 */
	public CmdPipe openUdpPipe(String protocolID, String portConfig);
	
	/**
	 * Generic quantic pipe builder w/ generated pseudo random ID (&lt;protocol&gt;Pipe_&lt;UUID&gt;_&lt;portId&gt;)
	 * 
	 * @param protocolID
	 * @param portConfig UDP inet port as a integer (1234)
	 * 
	 * @return a newly created UDP command engine as a quantic pipe
	 */
	public CmdPipe openUdpPipe(String protocolID, int port);
	
	/**
	 * Generic quantic pipe builder w/ generated pseudo random ID (&lt;protocol&gt;Pipe_&lt;UUID&gt;_&lt;portId&gt;)
	 * 
	 * @param protocolID
	 * @param portConfig UDP inet ports as a integers (1234, 3333)
	 * 
	 * @return a newly created UDP command engine as a quantic pipe
	 */
	public CmdPipe openUdpPipe(String protocolID, int[] ports);
	
	/**
	 * Generic quantic pipe builder w/ generated pseudo random ID (&lt;protocol&gt;Pipe_&lt;UUID&gt;_&lt;portId&gt;)
	 * 
	 * @param protocolID
	 * @param portConfig TCP inet addr as a string ("localhost:1234")
	 * 
	 * @return a newly created TCP command engine as a quantic pipe
	 */
	public CmdPipe openTcpPipe(String protocolID, String portConfig);
	
	
	/**
	 * Generic quantic pipe builder w/ generated pseudo random ID (&lt;protocol&gt;Pipe_&lt;UUID&gt;_&lt;portId&gt;)
	 * 
	 * @param protocolID
	 * @param portConfig TCP inet port as a integer (1234)
	 * 
	 * @return a newly created TCP command engine as a quantic pipe
	 */
	public CmdPipe openTcpPipe(String protocolID, int port);
	
	/**
	 * Generic quantic pipe builder w/ generated pseudo random ID (&lt;protocol&gt;Pipe_&lt;UUID&gt;_&lt;portId&gt;)
	 * 
	 * @param protocolID
	 * @param portConfig TCP inet ports as a integers (1234, 3333)
	 * 
	 * @return a newly created TCP command engine as a quantic pipe
	 */
	public CmdPipe openTcpPipe(String protocolID, int[] ports);
	
	/**
	 * Generic quantic pipe builder w/ generated pseudo random ID (&lt;protocol&gt;Pipe_&lt;UUID&gt;_&lt;portId&gt;)
	 * 
	 * @param protocolID
	 * @param portConfig HTTP inet addr as a string ("localhost:1234")
	 * 
	 * @return a newly created HTTP command engine as a quantic pipe
	 */
	public CmdPipe openHttpPipe(String protocolID, String portConfig);

	/**
	 * Generic quantic pipe builder w/ generated pseudo random ID (&lt;protocol&gt;Pipe_&lt;UUID&gt;_&lt;portId&gt;)
	 * 
	 * @param protocolID
	 * @param portConfig HTTP inet addr as a string ("localhost:1234")
	 * 
	 * @return a newly created HTTP command engine as a quantic pipe
	 */
	public CmdPipe createHttpPipe(String protocolID, String portConfig);

	/**
	 * Close {@link CmdPipe} from given pipe ID
	 * 
	 * @param pipeID a given unique pipe ID
	 */
	public void closePipe(String pipeID, boolean force);
	
	/**
	 * Close {@link CmdPipe} from given pipe ID
	 * 
	 * @param pipe a given unique pipe
	 */
	public void closePipe(CmdPipe pipe, boolean force);
	
	/**
	 * Close {@link CmdPipe} from given configurations
	 * 
	 * @param transportID transport protocol among : UDP, TCP, XBEE, USB, HTTP, UBQT
	 * 
	 * @param portConfig pipeID a given unique pipe ID
	 */
	public void closePipe(String transportID, String portConfig, boolean force);
	
	/**
	 * Close {@link CmdPipe} from given configurations
 
	 * @param transportID transport protocol among : UDP, TCP, XBEE, USB, HTTP, UBQT
	 * @param portConfig pipeID a given unique pipe ID
	 * @param ports incoming ports configuration
	 */
	public void closePipe(String transportID, String portConfig, int[] ports, boolean force);
	
	/**
	 * Close {@link CmdPipe} from given configurations
 
	 * @param transportID transport protocol among : UDP, TCP, XBEE, USB, HTTP, UBQT
	 * @param portConfig pipeID a given unique pipe ID
	 * @param ports incoming ports configuration
	 */
	public void closePipe(String transportID, String portConfig, List<Integer> ports, boolean force);
}

