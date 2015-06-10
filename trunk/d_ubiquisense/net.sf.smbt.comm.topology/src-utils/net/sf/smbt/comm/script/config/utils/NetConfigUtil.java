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

package net.sf.smbt.comm.script.config.utils;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.bluetooth.L2CAPConnection;
import javax.microedition.io.Connector;

import net.sf.smbt.btcomm.BluetoothPort;
import net.sf.smbt.btcomm.BtcommPackage;
import net.sf.smbt.btcomm.L2CAPInJob;
import net.sf.smbt.comm.CommPackage;
import net.sf.smbt.comm.TcpPort;
import net.sf.smbt.comm.UbiPort;
import net.sf.smbt.comm.UdpPort;
import net.sf.smbt.comm.UsbPort;
import net.sf.smbt.comm.bluetooth.io.BTCommunicator;
import net.sf.smbt.comm.bluetooth.io.L2CAPInputJob;
import net.sf.smbt.comm.http.io.BasicHttpCommunicator;
import net.sf.smbt.comm.http.io.HttpCommunicator;
import net.sf.smbt.comm.io.TcpChannel;
import net.sf.smbt.comm.io.TcpInputPortJob;
import net.sf.smbt.comm.io.UdpChannel;
import net.sf.smbt.comm.io.UdpInputPortJob;
import net.sf.smbt.comm.script.netConf.NetBind;
import net.sf.smbt.comm.script.netConf.NetCfg;
import net.sf.smbt.comm.script.netConf.NetDecoder;
import net.sf.smbt.comm.script.netConf.NetInterpreter;
import net.sf.smbt.comm.script.netConf.NetListener;
import net.sf.smbt.comm.script.netConf.NetOrchestrorScope;
import net.sf.smbt.comm.script.netConf.TRANSPORT_PROTOCOL;
import net.sf.smbt.comm.utils.rxtx.ISerialCommunicator;
import net.sf.smbt.comm.utils.rxtx.RXTXSerialUtil;
import net.sf.smbt.comm.xbee.io.XBeeCommunicator;
import net.sf.smbt.httpcomm.HttpCommPort;
import net.sf.smbt.httpcomm.HttpcommPackage;
import net.sf.smbt.midi.utils.MidiCommunicator;
import net.sf.smbt.xbeecomm.XbeePort;
import net.sf.smbt.xbeecomm.XbeecommPackage;
import net.sf.xqz.engine.cmd.clients.QxMonitorJob;
import net.sf.xqz.engine.interpret.cmd.NullXCmdInterpreter;
import net.sf.xqz.engine.interpret.cmd.NullXFrameInterpreter;
import net.sf.xqz.engine.queues.QxEventAdapterImpl;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.EngineApplication;
import net.sf.xqz.model.engine.EngineClient;
import net.sf.xqz.model.engine.EngineFactory;
import net.sf.xqz.model.engine.IChannel;
import net.sf.xqz.model.engine.IQxEventHandler;
import net.sf.xqz.model.engine.IXCmdInterpreter;
import net.sf.xqz.model.engine.IXFrameInterpreter;
import net.sf.xqz.model.engine.InputJob;
import net.sf.xqz.model.engine.Port;
import net.sf.xqz.model.temporal.Orchestror;
import net.sf.xqz.script.utils.OrchestrorUtil;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;

/* 
 * - load
 * - save
 * - communication setups (UDP/TCP/HTTP/USB/XBee/Bluetooth)
 * 
 * - frame interpreter ext point management
 * - cmd interpreter ext point management
 * - cmd listener ext point management
 * 
 * @author lucas
 *
 */

public class NetConfigUtil {

	public final static NetConfigUtil INSTANCE = new NetConfigUtil();

	private Map<NetCfg, List<Orchestror>> netCfgRegistry;

	private Map<String, IXCmdInterpreter> cmdInterpretersMap;
	private Map<String, IXFrameInterpreter> frameInterpretersMap;
	private Map<String, IQxEventHandler> eventHandlersMap;

	private Map<Integer, TcpInputPortJob> tcpInputJobs;
	private Map<Integer, UdpInputPortJob> udpInputJobs;
	private Map<String, L2CAPInputJob> l2capInputJobs;

	public NetConfigUtil() {
		netCfgRegistry = new HashMap<NetCfg, List<Orchestror>>();
		cmdInterpretersMap = new HashMap<String, IXCmdInterpreter>();
		frameInterpretersMap = new HashMap<String, IXFrameInterpreter>();
		eventHandlersMap = new HashMap<String, IQxEventHandler>();
		tcpInputJobs = new HashMap<Integer, TcpInputPortJob>();
		udpInputJobs = new HashMap<Integer, UdpInputPortJob>();
		l2capInputJobs = new HashMap<String, L2CAPInputJob>();
	}

	public Map<String, IXCmdInterpreter> getCmdInterpreters() {
		return cmdInterpretersMap;
	}

	public Map<String, IQxEventHandler> getEventHandlers() {
		return eventHandlersMap;
	}

	public Map<NetCfg, List<Orchestror>> getNetCfgRegistry() {
		return netCfgRegistry;
	}

	/*
	 * public EObject getModel3(String pathname) throws IOException { return
	 * getModel2(URI.createURI(pathname)); } public EObject getModel2(URI uri)
	 * throws IOException { XtextResourceSet set =
	 * injector.getInstance(XtextResourceSet.class);
	 * set.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE); return
	 * set.getResource(uri, true).getContents().get(0); }
	 */
	public synchronized CmdPipe getCmdEngineByCmdIDFromOrchestrors(
			final List<Orchestror> orchestrors, final String engineID) {
		for (Orchestror orchestror : orchestrors) {
			if (orchestror != null && orchestror.getApplication() != null) {
				for (CmdPipe engine : orchestror.getApplication().getEngine()) {
					if (engine instanceof CmdPipe) {
						if (engine.getId().equals(engineID)) {
							return engine;
						}
					}
				}
			}
		}
		return null;
	}

	public synchronized CmdPipe getCmdEngineByCmdID(
			final List<CmdPipe> engines, final String engineID) {
		for (CmdPipe engine : engines) {
			if (engine.getId().equals(engineID)) {
				return engine;
			}
		}
		return null; // oops should really have nicer a link phase
	}

	public synchronized CmdPipe getCmdEngineByCmdIDFromApp(
			final EngineApplication engineApp, final String engineID) {
		if (engineApp != null) {
			for (CmdPipe engine : engineApp.getEngine()) {
				if (engine.getId().equals(engineID)) {
					return engine;
				}
			}
		}
		return null; // oops should really have nicer link phase
	}

	public IXCmdInterpreter resolveCmdInterpreterInOSGiContext(
			String cmdInterpreterID) {
		if (cmdInterpretersMap.keySet().contains(cmdInterpreterID)) {
			return cmdInterpretersMap.get(cmdInterpreterID);
		} else {
			IExtensionRegistry registry = Platform.getExtensionRegistry();
			IExtensionPoint point = registry
					.getExtensionPoint("net.sf.xqz.engine.cmdInterpreter");
			if (point == null)
				return null;
			IExtension[] extensions = point.getExtensions();
			for (int i = 0; i < extensions.length; i++) {
				for (IConfigurationElement elem : extensions[i]
						.getConfigurationElements()) {
					String ID = elem.getAttribute("ID");
					if (ID.equals(cmdInterpreterID)) {
						try {
							IXCmdInterpreter xCmdInterpreter = (IXCmdInterpreter) elem
									.createExecutableExtension("interpreter");
							cmdInterpretersMap.put(cmdInterpreterID,
									xCmdInterpreter);
							xCmdInterpreter.setID(ID);
							return xCmdInterpreter;
						} catch (CoreException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
		return null;
	}

	public IXCmdInterpreter resolveCmdInterpreterInOSGiContext(
			NetInterpreter interpreter) {
		if (interpreter != null) {
			return resolveCmdInterpreterInOSGiContext(interpreter.getClazz());
		}
		return null;
	}

	public IXFrameInterpreter resolveFrameInterpreterInOSGiContext(
			String frameInterpreterID) {
		if (frameInterpretersMap.keySet().contains(frameInterpreterID)) {
			return frameInterpretersMap.get(frameInterpreterID);
		} else {
			IExtensionRegistry registry = Platform.getExtensionRegistry();
			IExtensionPoint point = registry
					.getExtensionPoint("net.sf.xqz.engine.frameInterpreter");
			if (point == null)
				return null;
			IExtension[] extensions = point.getExtensions();
			for (int i = 0; i < extensions.length; i++) {
				for (IConfigurationElement elem : extensions[i]
						.getConfigurationElements()) {
					String ID = elem.getAttribute("ID");
					if (ID.equals(frameInterpreterID)) {
						try {
							IXFrameInterpreter frameInterpreter = (IXFrameInterpreter) elem
									.createExecutableExtension("interpreter");
							frameInterpretersMap.put(frameInterpreterID,
									frameInterpreter);
							frameInterpreter.setID(ID);
							return frameInterpreter;
						} catch (CoreException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
		return null;
	}

	public IXFrameInterpreter resolveFrameInterpreterInOSGiContext(
			NetDecoder decoder) {
		if (decoder != null) {
			return resolveFrameInterpreterInOSGiContext(decoder.getClazz());
		}
		return null;
	}

	public IQxEventHandler resolveListenerInOSGiContext(String listenerID) {
		if (eventHandlersMap.keySet().contains(listenerID)) {
			return eventHandlersMap.get(listenerID);
		} else {
			IExtensionRegistry registry = Platform.getExtensionRegistry();
			IExtensionPoint point = registry
					.getExtensionPoint("net.sf.xqz.engine.cmdHandler");
			if (point == null)
				return null;
			IExtension[] extensions = point.getExtensions();
			for (int i = 0; i < extensions.length; i++) {
				for (IConfigurationElement elem : extensions[i]
						.getConfigurationElements()) {
					String ID = elem.getAttribute("ID");
					if (ID.equals(listenerID)) {
						try {
							IQxEventHandler handler = (IQxEventHandler) elem
									.createExecutableExtension("handler");
							handler.setID(ID);
							eventHandlersMap.put(listenerID, handler);
							return handler;
						} catch (CoreException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}
		return null;
	}

	public IQxEventHandler resolveListenerInOSGiContext(NetListener listener) {
		return resolveListenerInOSGiContext(listener.getClazz());
	}

	public IQxEventHandler resolveListenerInRuntimeContext(NetListener listener) {
		return new DemoCmdHandler();
	}

	/**
	 * Open ports according to a given configuration.
	 * 
	 * - USB - TCP - UDP - HTTP - XBee - Bluetooth - Ubiquitous (later ...)
	 * 
	 * with respective address:port scheme
	 * 
	 * @param bind
	 *            binding definition according to NetConf DSL
	 * @param engine
	 *            {@link CmdPipe} reference
	 * 
	 * @return the newly resolved/bind address w/ given protocol
	 */
	public Port resolvePort(final NetBind bind, final CmdPipe engine,
			Map<Object, Object> options, boolean locked) {
		if (bind == null || engine == null) {
			return null;
		}
		List<Integer> acceptedPortsList = bind.getPort().getPorts();
		int[] acceptedPorts = acceptedPortsList == null ? null
				: new int[acceptedPortsList.size()];
		int idx = 0;
		for (Integer port : acceptedPortsList) {
			acceptedPorts[idx] = port;
			idx++;
		}
		return resolvePort(bind.getPort().getKind().getLiteral(), bind
				.getPort().getPortID(), acceptedPorts, bind.getPort()
				.getSpeed(), engine, options, locked);
	}

	/**
	 * Open ports according to a given configuration.
	 * 
	 * - USB - TCP - UDP - HTTP - XBee - Bluetooth - Ubiquitous (later ...)
	 * 
	 * with respective address:port scheme
	 * 
	 * @param kind
	 * @param portID
	 * @param acceptedPorts
	 * @param speed
	 * @param engine
	 *            {@link CmdPipe} reference
	 * 
	 * @return the newly resolved/bind address w/ given protocol
	 */
	public Port resolvePort(String kind, String portID, int[] acceptedPorts,
			int speed, final CmdPipe engine, Map<Object, Object> options,
			boolean locked) {

		switch (TRANSPORT_PROTOCOL.get(kind)) {
		case HTTP:
			if (Platform.inDebugMode()) {
				System.out.println("Connect to HTTP URL : " + portID);
			}
			HttpCommPort httpPort = (HttpCommPort) EcoreUtil
					.create(HttpcommPackage.Literals.HTTP_COMM_PORT);
			HttpCommunicator c = new BasicHttpCommunicator();
			c.setPortID(portID);
			c.setAcceptedPorts(acceptedPorts);
			httpPort.setChannel(c);
			httpPort.setEngine(engine);
			return httpPort;
		case BLUETOOTH:
			if (Platform.inDebugMode()) {
				System.out.println("Connect to  BT Device w/ L2CAP " + portID);
			}
			BluetoothPort btPort = (BluetoothPort) EcoreUtil
					.create(BtcommPackage.Literals.BLUETOOTH_PORT);
			String addrOut = "btl2cap://" + portID
					+ ":11;authenticate=false;encrypt=false;master=false";
			String addrIn = "btl2cap://" + portID
					+ ":13;authenticate=false;encrypt=false;master=false";
			try {
				L2CAPConnection outgoing = (L2CAPConnection) Connector.open(
						addrOut, Connector.WRITE, true);
				L2CAPConnection incoming = (L2CAPConnection) Connector.open(
						addrIn, Connector.READ, true);
				L2CAPInJob in = (L2CAPInJob) EcoreUtil
						.create(BtcommPackage.Literals.L2CAP_IN_JOB);
				if (!l2capInputJobs.containsKey(portID)) {
					L2CAPInputJob btInputJob = new L2CAPInputJob(engine,
							incoming, portID);
					l2capInputJobs.put(portID, btInputJob);
					in.setJob(btInputJob);
					btInputJob.schedule();
				} else {
					in.setJob(l2capInputJobs.get(portID));
				}
				in.setId("BT_L2CAP_input_" + portID);
				btPort.getInputJobs().add(in);

				btPort.setChannel(new BTCommunicator(incoming, outgoing));
			} catch (IOException ioe) {
				ioe.printStackTrace();
			} catch (InterruptedException ite) {
				ite.printStackTrace();
			}
			btPort.setEngine(engine);
			return btPort;
		case MIDI:
			UbiPort ubiPort = (UbiPort) EcoreUtil
					.create(CommPackage.Literals.UBI_PORT);
			ubiPort.setChannel(new MidiCommunicator(engine));
			ubiPort.setEngine(engine);
			return ubiPort;
		case XBEE:
			XBeeCommunicator comm = new XBeeCommunicator(engine, portID, speed);
			XbeePort xbeePort = (XbeePort) EcoreUtil
					.create(XbeecommPackage.Literals.XBEE_PORT);
			xbeePort.setChannel(comm);
			xbeePort.setEngine(engine);
			return xbeePort;
		case USB:
			if (RXTXSerialUtil.INSTANCE.isAlreadyOpen(portID)) {
				return null;
			}
			UsbPort usbPort = (UsbPort) EcoreUtil
					.create(CommPackage.Literals.USB_PORT);
			if (speed > 0) {
				ISerialCommunicator serialCommunicator = RXTXSerialUtil.INSTANCE
						.openPort(usbPort, portID, speed, options);
				if (serialCommunicator == null
						|| serialCommunicator.getSerialPort() == null) {
					return null;
				}
				usbPort.setEngine(engine);
				usbPort.setChannel(serialCommunicator);
				return usbPort;
			}
			return null;
		case TCP:
			TcpPort ipPort = (TcpPort) EcoreUtil
					.create(CommPackage.Literals.TCP_PORT);
			String[] parts = portID.split(":");
			String tag = parts == null ? "_incoming_" : "_" + parts[0] + "_";
			if (acceptedPorts != null) {
				for (int inPort : acceptedPorts) {
					if (!tcpInputJobs.containsKey(new Integer(inPort))) {
						TcpInputPortJob tcpInputPortJob = new TcpInputPortJob(
								inPort);
						tcpInputPortJob.schedule();
						tcpInputJobs.put(new Integer(inPort), tcpInputPortJob);
					}
					tcpInputJobs.get(new Integer(inPort)).addRx(engine.getRx());

					InputJob inputJob = EngineFactory.eINSTANCE
							.createInputJob();
					inputJob.setId("TCP" + tag + inPort);
					inputJob.setJob(tcpInputJobs.get(new Integer(inPort)));

					ipPort.getInputJobs().add(inputJob);
					if (Platform.inDebugMode()) {
						System.out.println("Listen to " + inPort + " port");
					}
				}
			}
			if (parts != null && parts.length > 0 && !parts[0].equals("")) {
				InetAddress address = null;
				try {
					address = InetAddress.getByName(parts[0]);
				} catch (UnknownHostException e) {
					e.printStackTrace();
				}
				int port = Integer.valueOf(parts[1]);
				IChannel channel = new TcpChannel(address, port);
				ipPort.setChannel(channel);
				channel.debug();
			}
			ipPort.setEngine(engine);
			return ipPort;
		case UDP:
			UdpPort udpPort = (UdpPort) EcoreUtil
					.create(CommPackage.Literals.UDP_PORT);
			String[] parts2 = portID.split(":");
			String tag2 = parts2 == null ? "_incoming_" : "_" + parts2[0] + "_";
			if (acceptedPorts != null) {
				for (int inPort : acceptedPorts) {
					if (!udpInputJobs.containsKey(new Integer(inPort))) {
						UdpInputPortJob udpInputPortJob = new UdpInputPortJob(inPort);
						udpInputPortJob.schedule();
						udpInputJobs.put(new Integer(inPort), udpInputPortJob);
					}
					udpInputJobs.get(new Integer(inPort)).addRx(engine.getRx());

					InputJob inputJob = EngineFactory.eINSTANCE
							.createInputJob();
					inputJob.setId("UDP" + tag2 + inPort);
					inputJob.setJob(udpInputJobs.get(new Integer(inPort)));

					udpPort.getInputJobs().add(inputJob);
					if (Platform.inDebugMode()) {
						System.out.println("Listen to " + inPort + " port");
					}
				}
			}
			if (!portID.contains(":") && acceptedPorts.length > 0) {
				udpPort.setChannel(new UdpChannel(parts2[0], Integer
						.valueOf(acceptedPorts[0])));
			} else if (parts2 != null && parts2.length > 1
					&& !parts2[0].equals("")) {
				udpPort.setChannel(new UdpChannel(parts2[0], Integer
						.valueOf(parts2[1])));
			}
			if (udpPort.getChannel() != null) {
				udpPort.getChannel().debug();
			}
			udpPort.setEngine(engine);
			return udpPort;
		default: {
			throw new UnsupportedOperationException(
				"Transport Protocol should be one of : [UDP, TCP, HTTP, XBEE, USB, BLUETOOTH, MIDI] !");
			}
		}
	}

	public synchronized void closePipe(CmdPipe... pipes) {
		for (CmdPipe pipe : pipes) {
			if (!pipe.isLocked()) {
				try {
					Port port = pipe.getPort();
					if (port != null) {
						if (pipe.getTransportProtocol().equals(
								TRANSPORT_PROTOCOL.UDP.getLiteral())) { // UDP
							for (InputJob jUdp : port.getInputJobs()) {
								udpInputJobs.remove(((UdpInputPortJob) jUdp
										.getJob()).getPortID());
							}
						} else if (pipe.getTransportProtocol().equals(
								TRANSPORT_PROTOCOL.TCP.getLiteral())) { // TCP
							for (InputJob jTcp : port.getInputJobs()) {
								tcpInputJobs.remove(((TcpInputPortJob) jTcp
										.getJob()).getPortID());
							}
						} else if (pipe.getTransportProtocol().equals(
								TRANSPORT_PROTOCOL.BLUETOOTH.getLiteral())) { // Bluetooth
							for (final InputJob jL2Cap : port.getInputJobs()) {
								if (jL2Cap != null
										&& (jL2Cap.getJob() instanceof L2CAPInputJob)) {
									L2CAPInputJob btInputJob = (L2CAPInputJob) jL2Cap
											.getJob();
									l2capInputJobs.remove(btInputJob
											.getPortId());
									jL2Cap.close();
								}
							}
						} else if (pipe.getTransportProtocol().equals(
								TRANSPORT_PROTOCOL.HTTP.getLiteral())) { // HTTP
							// NONE
						} else if (pipe.getTransportProtocol().equals(
								TRANSPORT_PROTOCOL.XBEE.getLiteral())) { // USB
																			// over
																			// Serial
							// NONE
						} else if (pipe.getTransportProtocol().equals(
								TRANSPORT_PROTOCOL.USB.getLiteral())) {
							RXTXSerialUtil.INSTANCE.closePort(pipe.getAddr());
						}
					}
					port.finalize();

					List<Orchestror> orchestrors = OrchestrorUtil.INSTANCE
							.getOrchestrorRegistry();
					EngineApplication app = pipe.getApplication();
					List<Orchestror> toBeRemoved = new ArrayList<Orchestror>();
					for (Orchestror o : orchestrors) {
						if (o instanceof Orchestror
								&& o.getApplication() != null
								&& o.getApplication().equals(app)) {
							Object r = pipe.getClient().getRunner();
							if (r instanceof QxMonitorJob) {
								((QxMonitorJob) r).cancel();
							}
							o.setApplication(null);
							toBeRemoved.add(o);
						}
					}
					for (Orchestror or : toBeRemoved) {
						orchestrors.remove(or);
					}
				} catch (Throwable t) {
					t.printStackTrace();
				}
			}
		}
	}

	/*
	 * build a map from netconf resource and its associated orchestrors
	 */
	private Map<NetCfg, List<Orchestror>> buildNetCfg(NetCfg cfg, boolean locked) {
		Map<NetCfg, List<Orchestror>> cfgOrchestrorsMap = new HashMap<NetCfg, List<Orchestror>>();
		List<Orchestror> orchestrors = new ArrayList<Orchestror>();
		for (NetOrchestrorScope scope : cfg.getOrchestrorScopes()) {
			Orchestror orchestror = OrchestrorUtil.INSTANCE
					.buildOrchestror(scope.getDslOrchestror());
			for (NetBind b : scope.getBinds()) {
				CmdPipe engine = getCmdEngineByCmdID(orchestror
						.getApplication().getEngine(), b.getEngine().getName());
				if (engine != null) {
					if (Platform.isRunning()) {
						IXCmdInterpreter interpreter = resolveCmdInterpreterInOSGiContext(b
								.getInterpreter());
						engine.setOutputInterpreter(interpreter);
					} else {
						engine.setOutputInterpreter(new NullXCmdInterpreter());
					}
					if (Platform.isRunning()) {
						IXFrameInterpreter decoder = resolveFrameInterpreterInOSGiContext(b
								.getDecoder());
						engine.setInputInterpreter(decoder);
					} else {
						engine.setInputInterpreter(new NullXFrameInterpreter());
					}
					Port port = resolvePort(b, engine,
							new HashMap<Object, Object>(), locked);
					if (port != null) {
						engine.setPort(port);
						port.setEngine(engine);
					}
					for (NetListener l : b.getListeners()) {
						IQxEventHandler eventHandler = null;

						if (Platform.isRunning()) {
							eventHandler = resolveListenerInOSGiContext(l);
						} else {
							eventHandler = resolveListenerInRuntimeContext(l);
						}
						if (engine instanceof CmdPipe) {
							for (Adapter adapter : ((CmdPipe) engine)
									.eAdapters()) {
								if (adapter instanceof QxEventAdapterImpl) {
									if (!((QxEventAdapterImpl) adapter)
											.getEvtHandlers().contains(
													eventHandler)) {
										((QxEventAdapterImpl) adapter)
												.getEvtHandlers().add(
														eventHandler);
									}
								}
							}
						}
					}
				}
				orchestrors.add(orchestror);
			}
		}
		cfgOrchestrorsMap.put(cfg, orchestrors);
		netCfgRegistry.put(cfg, orchestrors);

		//
		//
		//
		for (Orchestror orchestror : orchestrors) {
			if (!OrchestrorUtil.INSTANCE.getOrchestrorRegistry().contains(
					orchestror)) {
				OrchestrorUtil.INSTANCE.getOrchestrorRegistry().add(orchestror);
			}
		}

		return cfgOrchestrorsMap;
	}

	public Map<NetCfg, List<Orchestror>> loadNetCfg(String pathname) {
		// try {
		// return buildNetCfg((NetCfg) getModel3(pathname));
		// } catch (FileNotFoundException e) {
		// e.printStackTrace();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		return null;
	}

	public Map<NetCfg, List<Orchestror>> loadNetCfg(URI uri) {
		// try {
		// return buildNetCfg((NetCfg) getModel2(uri));
		// } catch (FileNotFoundException e) {
		// e.printStackTrace();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		return null;
	}

	public static void main(String[] args) {
		// try {
		// netCfgUtil.buildNetCfg(
		// netCfgUtil.loadNetCfg(new
		// File("data/n.netconf").getCanonicalPath()).keySet().iterator().next(),
		// true
		// );
		// } catch (FileNotFoundException e) {
		// e.printStackTrace();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
	}

	public synchronized CmdPipe getCmdEngineByID(
			final List<Orchestror> orchestrors, final String engineID) {
		List<CmdPipe> engines = new ArrayList<CmdPipe>();
		for (Orchestror orchestror : orchestrors) {
			engines.addAll(orchestror.getApplication().getEngine());
		}
		return getCmdEngineByCmdID(engines, engineID);
	}

	public EngineClient getEngineClientByIDFromApp(EngineApplication engineApp,
			String clientID) {
		if (clientID != null && !clientID.equals("")) {
			for (List<Orchestror> orchestrors : netCfgRegistry.values()) {
				for (Orchestror o : orchestrors) {
					if (o.getApplication() != null) {
						for (EngineClient c : o.getApplication().getClients()) {
							if (c.getId().equals(clientID)) {
								return c;
							}
						}
					}
				}
			}
		}
		return null;
	}

	public Map<String, IQxEventHandler> getQxEventHandlers() {
		return eventHandlersMap;
	}

	public IQxEventHandler getQxEventHandler(String evtHandlerID) {
		return eventHandlersMap.get(evtHandlerID);
	}

	public Map<String, IXCmdInterpreter> getCommandInterpreters() {
		return cmdInterpretersMap;
	}

	public IXCmdInterpreter getCommandInterpreter(String cmdInterpreterID) {
		return cmdInterpretersMap.get(cmdInterpreterID);
	}

	public Map<String, IXFrameInterpreter> getFrameInterpreters() {
		return frameInterpretersMap;
	}

	public IXFrameInterpreter getFrameInterpreter(String frameInterpreterID) {
		return frameInterpretersMap.get(frameInterpreterID);
	}
}
