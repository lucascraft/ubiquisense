/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2010 - 2012, Lucas Bigeardel
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

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.Vector;

import net.sf.smbt.comm.extensions.protocol.ProtocolReactor;
import net.sf.smbt.comm.extensions.protocol.ProtocolWithSpecificTransportConfig;
import net.sf.smbt.comm.script.netConf.TRANSPORT_PROTOCOL;
import net.sf.smbt.comm.topology.utils.GenericQxEventHandler;
import net.sf.smbt.ezmojo.EZMojoAgentCmd;
import net.sf.smbt.ezmojo.EZMojoCmd;
import net.sf.smbt.ezmojo.EZMojoKind;
import net.sf.smbt.ezmojo.EZMojoNode;
import net.sf.smbt.ezmojo.EZMojoRoot;
import net.sf.smbt.ezmojo.EZMojoTarget;
import net.sf.smbt.ezmojo.EZVar;
import net.sf.smbt.ezmojo.EzMojoInfoCmd;
import net.sf.smbt.ezmojo.EzmojoFactory;
import net.sf.smbt.ezmojo.EzmojoPackage;
import net.sf.smbt.ezmojo.MotionEvalCtx;
import net.sf.smbt.ezmojo.MotionEvalStrategy;
import net.sf.smbt.ezmojo.util.EzmojoSwitch;
import net.sf.smbt.ezmotion.Motion;
import net.sf.smbt.ezmotion.MotionAxis;
import net.sf.smbt.ezmotion.MotionCinematic;
import net.sf.smbt.ezmotion.MotionKind;
import net.sf.smbt.ezmotion.MotionValue;
import net.sf.smbt.mapping.engine.AbstractMapEngine;
import net.sf.smbt.mapping.services.MappingUtils;
import net.sf.smbt.motion.engine.IMotionReceiver;
import net.sf.smbt.motion.engine.MotionEngine;
import net.sf.smbt.motion.engine.MotionUtils;
import net.sf.smbt.osc.ezmojo.cmd.MojoEventHandler;
import net.sf.smbt.osc.utils.OscCmdUtils;
import net.sf.smbt.osccmd.OscCmd;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.cmd.CompoundCmd;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.EVENT_KIND;
import net.sf.xqz.model.engine.Event;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.illposed.osc.OSCBundle;
import com.illposed.osc.OSCMessage;
import com.illposed.osc.OSCPacket;
import com.illposed.osc.utility.OSCByteArrayToJavaConverter;

public class EzMojoCmdUtils {
	public final static EzMojoCmdUtils INSTANCE = new EzMojoCmdUtils();
	private OSCByteArrayToJavaConverter converter;
	
	public EzMojoCmdUtils() {
		converter = new OSCByteArrayToJavaConverter();
	}
	
	/**
	 * Handling byte[] stream which is not correlated to {@link EZMojoRoot} textual form
	 * 
	 * @param frame a byte[] frame as dumped by EzMojo compatible entities
	 * 
	 * @return a {@link EZMojoAgentCmd}, {@link EZMojoCmd} or {@link EzMojoInfoCmd} resulting of the
	 * frame mangling.
	 */
	public Cmd handleEzMojoFrame(byte[] frame) {
		if (EzMojoAgentCmdUtils.INSTANCE.isAgentCommandFromFrame(frame)) {
			return EzMojoAgentCmdUtils.INSTANCE.handleEzMojoAgentFrame(frame);
		}
		return handleEzMojoFrame(null, frame);
	}
	
	public List<EZMojoNode> handleEzMojoCmd(EZMojoRoot ezMojo, EZMojoCmd cmd) {
		if (cmd != null) {
			switch (cmd.getKind()) {
				case BIND:
					// Hype : 1* way sync ?
					break;
				case UNSET:
					return handleUNSET(ezMojo, cmd);
				case UNLISTEN:
					handleUNLISTEN(ezMojo, cmd);
					break;
				case LISTEN: // basically raising a BANG event whenever some address being listen is modified
					handleLISTEN(ezMojo, cmd);
					break;
				case GET:
					return handleGET(ezMojo, cmd);
				case LEGACY_SET:
				case SET:
					 handleSET(ezMojo, cmd);
				case QUERY:
					return handleQUERY(ezMojo, cmd);
				case SERVICE:
					// dump a sub domain as a service : introspect and expose w/ types and not values
					break;
				case FORWARD:
					handleFORWARD(ezMojo, cmd);
					break;
				case UNFORWARD:
					handleUNFORWARD(ezMojo, cmd);
					break;
				case SELECT:
					break;
				case CLOCK:
					break;
				case BANG:
					handleBANG(ezMojo, cmd);
					break;
				case PLAY:
					handlePLAY(ezMojo, cmd);
					break;
				case MAP:
					break;
				case UNMAP:
					break;
				case MNEMONIC:
					break;
				case TOGGLE:
					handleTOGGLE(ezMojo, cmd);
					break;
				case FUNCTION:
					break;
				case KINEMATICS:
					handleKINEMATICS(ezMojo, cmd);
					break;
				case TRIGGER:
					break;
				case COMMAND:
					return handleEzMojoAgentCmd(ezMojo, (EZMojoAgentCmd) cmd);
			}
		}
		return null;
	}
	
	public void syncTargets(EZMojoRoot mojo, List<EZMojoTarget> targets) {
		List<EZMojoTarget> targetsToBeInserted = new ArrayList<EZMojoTarget>();
		for (EZMojoTarget target : targets) {
			boolean toInsert = true;
			for (EZMojoTarget existing : mojo.getTargets()) {
				if (existing.getAddr().equals(target.getAddr())) {
					if (!existing.getAlias().equals(target.getAlias())) {
						existing.setAddr(target.getAddr());
						toInsert = false;
						break;
					}
				}
			}
			if (toInsert) {
				targetsToBeInserted.add(target);
			}
		}
		mojo.getTargets().addAll(targetsToBeInserted);
	}
	
	public CmdPipe hookEzTarget(final EZMojoRoot mojo, final String _transport, final String _addr, final String _comm, final String _speed) {
		if (_transport instanceof String && _addr instanceof String && _comm instanceof String && _speed instanceof String) {
			EZMojoTarget t = EzMojoExprUtils.INSTANCE.parseEzTargetAddr(_addr);
			if (t == null) return null;
			
			t.setProtocolID(_comm);
			t.setTransportID(TRANSPORT_PROTOCOL.get(_transport).getLiteral());
			int s = Integer.parseInt(_speed);
			t.setSpeed(s!=t.getSpeed()?s:t.getSpeed());
			CmdPipe pipe = QuanticMojo.INSTANCE.openPipe(
				t.getTransportID(), 
				t.getProtocolID(), 
				UUID.randomUUID().toString(), 
				t.getAddr(), 
				t.getPorts().isEmpty()?(new int[]{}):(new int[]{t.getPorts().get(0)}),
				t.getSpeed(),
				new HashMap<Object, Object>()
			);
			if (!mojo.getEngines().contains(pipe)) {
				mojo.getEngines().add(pipe);
			}
			if (!isTargetForwardAlreadyHere(mojo.getTargets(),t)) {
				mojo.getTargets().add(t);
			}
			pipe.addQxEventHandler(new MojoEventHandler() {
				@Override
				public void handleQxEvent(Event evt) {
					if (evt.getCmd() instanceof Cmd) {
						if (evt.getKind().equals(EVENT_KIND.RX_DONE)) {
							//
							//
							// multi protocol support ????????????
							//
//							//
//							OSCPacket packet = ((OscCmd)evt.getCmd()).getMsg();
//								
//							if (packet instanceof OSCMessage) {
//								String addr = ((OSCMessage)packet).getAddress();
//								System.out.println(addr);
//							}
//							
							handleOscCmd(mojo, evt.getCmd());
						}
					}
				}
			});
			return pipe;
		}
		return null;
	}
	
	private boolean unhookEzTarget(
		final EZMojoRoot mojo, 
		final String _transport, 
		final String _addr, 
		final String _comm, 
		final String _speed
	) {
		boolean alreadyHooked = false;
		if (_transport instanceof String && _addr instanceof String && _comm instanceof String && _speed instanceof String) {
			EZMojoTarget t = EzMojoExprUtils.INSTANCE.parseEzTargetAddr(_addr);
			if (t == null) return false;
			t.setProtocolID(_comm);
			t.setTransportID(TRANSPORT_PROTOCOL.get(_transport).getLiteral());
			int s = Integer.parseInt(_speed);
			t.setSpeed(s!=t.getSpeed()?s:t.getSpeed());
			CmdPipe pipe = null;
			for (EZMojoTarget target : mojo.getTargets()) {
				if (target.getAddr().equals("") || target.getAddr().equals(t.getAddr())) {
					if (target.getPorts().size() > 1 && t.getPorts().contains(target.getPorts().get(0))) {
						pipe = QuanticMojo.INSTANCE.getPipe2(
							t.getTransportID(), 
							t.getProtocolID(), 
							t.getAddr(), 
							t.getPorts(),
							t.getSpeed()
						);
						alreadyHooked = (pipe != null);
						break;
					}
				}
			}
			if (alreadyHooked) {
				mojo.getEngines().remove(pipe);
				mojo.getTargets().remove(t);
			}
			if (_addr.contains(":")) {
				String[] tokens = _addr.split(":");
				if (tokens.length>1) {
					String port = tokens[1];
					int p = Integer.parseInt(port);
					QuanticMojo.INSTANCE.closePipe(_transport, tokens[0], new int[]{p}, true);
				}
			} else {
				QuanticMojo.INSTANCE.closePipe(_transport, _addr, true);
			}
		}
		return alreadyHooked;
	}
	
	private void handleOscCmd(final EZMojoRoot mojo, Cmd cmd) {
		try {
			if (mojo != null) {
				if (cmd instanceof CompoundCmd) {
					for (Cmd c : ((CompoundCmd)cmd).getChildren()) {
						handleOscCmd(mojo, c);
					}
				} else if (cmd instanceof OscCmd) {
					mojo.accept(
						(EZMojoCmd) createEZMojoCmd(
							mojo.getRoot(), 
							EZMojoKind.LEGACY_SET, 
							((OscCmd)cmd).getMsg()
						)
					);
				}
			}
		} catch (Exception e) {
			System.out.println("Problem in EzMojo OSC command ");
			e.printStackTrace();
		}
	}

	private CmdPipe handleReset(final EZMojoRoot mojo, final EZMojoCmd cmd, boolean deleteConnections) {
		if (cmd instanceof EZMojoCmd) {
			if (cmd instanceof EZMojoAgentCmd) {
				if (deleteConnections) {
					for (EZMojoTarget t : mojo.getTargets()) {
						
						QuanticMojo.INSTANCE.closePipe(
							t.getTransportID(), 
							t.getAddr() + ( t.getPort() > 0 ? ":" : "" + t.getPort()), 
							t.getPorts(), 
							true
						);
					}
				}
				mojo.getRoot().getElements().clear();
			}
		}
		return null;
	}
	
	private CmdPipe hookPort(final EZMojoRoot mojo, final EZMojoCmd cmd, boolean hook) {
		if (cmd instanceof EZMojoCmd) {
			if (cmd.getOsc() != null) {
				if (cmd.getOsc().getMsg() instanceof OSCMessage) {
					if (((OSCMessage)cmd.getOsc().getMsg()).getArguments().length>3) {
						String transport = (String)((OSCMessage)cmd.getOsc().getMsg()).getArguments()[1];
						String addr = (String)((OSCMessage)cmd.getOsc().getMsg()).getArguments()[2];
						String comm = (String)((OSCMessage)cmd.getOsc().getMsg()).getArguments()[3];
						String speed = "-1";
						if (((OSCMessage)cmd.getOsc().getMsg()).getArguments().length>4) {
							speed = (String)((OSCMessage)cmd.getOsc().getMsg()).getArguments()[4];
						}
						if (hook) {
							return hookEzTarget(mojo, transport, addr, comm, speed);
						} else {
							unhookEzTarget(mojo, transport, addr, comm, speed);
							return null;
						}
					}
				}
			}
		}
		return null;
	}

	private void setFeedback(EZMojoRoot mojo, EZMojoCmd cmd) {
		if (cmd instanceof EZMojoCmd) {
			if (cmd.getOsc() != null) {
				if (cmd.getOsc().getMsg() instanceof OSCMessage) {
					if (((OSCMessage)cmd.getOsc().getMsg()).getArguments().length>0) {
						Object obj = ((OSCMessage)cmd.getOsc().getMsg()).getArguments()[0];
						if (obj instanceof String) {
							String val = (String) obj;
							val = val.toUpperCase();
							if (val.equalsIgnoreCase("ON")) {
								mojo.setFeedback(true);
							} else if (val.equalsIgnoreCase("OFF")) {
								mojo.setFeedback(false);
							} else {
								// ERROR
							}
						}
					}
				}
			}
		}
	}
	
	public List<EZMojoNode> handleEzMojoAgentCmd(EZMojoRoot mojo, EZMojoAgentCmd cmd) {
		switch(cmd.getCmd()) {
			case ALIAS:
				syncTargets(mojo, cmd.getTargets());
				break;
			case BIND:
				break;
			case CLOSE:
				break;
			case DEPLOY:
				break;
			case HELP:
				// Console responsability
				break;
			case LIST:
				// Console responsability
				break;
			case FEEDBACK:
				setFeedback(mojo, cmd);
				break;
			case HOOK:
				hookPort(mojo, cmd, true);
				break;
			case UNHOOK:
				hookPort(mojo, cmd, false);
				break;
			case PROTOCOL:
				// Console responsability
				break;
			case CLEAR:
				// Console responsability
				break;
			case REMOVE:
				break;
			case RESET:
				handleReset(mojo, cmd, true);
				break;
			case STATUS:
				break;
			case WTF:
				break;
		}
		return new ArrayList<EZMojoNode>();
	}
	
	public List<EZMojoNode> handleSERVICE(EZMojoRoot ezMojo, EZMojoCmd cmd) {
		List<EZMojoNode> nodes = new ArrayList<EZMojoNode>();
//		for (EZMojoNode node : handleGET(ezMojo, cmd)) {
//			node.getService()
//		}
		return nodes;
	}
	
	public List<EZMojoNode> handleSET(EZMojoRoot ezMojo, EZMojoCmd cmd) {
		OSCPacket packetToSet = cmd.getOsc().getMsg();
		if (packetToSet instanceof OSCMessage) {
			/*return*/ Arrays.asList(new EZMojoNode[] { 
				setMojo(ezMojo.getSelected(), (OSCMessage)packetToSet) 
			});
		} else if (packetToSet instanceof OSCBundle) {
			//List<EZMojoNode> nodes = new ArrayList<EZMojoNode>();
			for (OSCMessage m : getOSCMessagesFromOSCPacket(packetToSet)) {
				/*nodes.add(*/
				setMojo(ezMojo.getSelected(), m)
				/*)*/;
			}
			//return nodes;
		}
		return Arrays.asList(new EZMojoNode[] {});
	}
	
	public boolean doEZ(EZMojoNode node, List<EZMojoTarget> targets) {
		if (!node.getAddr().startsWith("/ez/") || node.isToggle()) { return false; }
		String proto = node.getAddr().substring(4);
		String token2 = proto.contains("/") ? proto.substring(0, proto.indexOf("/")) : proto;
		if (!isAgentCommand(token2)) {
			AbstractMapEngine engine = MappingUtils.INSTANCE.getMappingEngineFromName(token2);
			if (engine instanceof AbstractMapEngine) {
				String alias = token2;
				if (alias != null) {
					for (EZMojoTarget t : targets) {
						ProtocolWithSpecificTransportConfig tCfg = ProtocolReactor.INSTANCE.getProtocolsWithSpecificTransportMap(t.getProtocolID());
						if (alias.equals(tCfg.getAlias()) || alias.equals(t.getProtocolID())) {
							CmdPipe pipe = EZMojoTargetUtils.INSTANCE.getCmdPipe(t, true);
							if (pipe != null) {
								pipe.addQxEventHandler(engine.getQxHandler());
								pipe.send(
									engine.ez2cmd(
										createOscMsg(node)
									)
								);
							}
						}
					}
					return true;
				}
			}
		}
		return false;
	}

	public void handleEZ(EZMojoNode node, OSCMessage msg) {
		
		if (!msg.getAddress().startsWith("/ez/")) { return; }
		
		String proto = msg.getAddress().substring("/ez/".length());
		
		String token2 = "";
		if (proto.contains("/"))  {
			token2 = proto.substring(0, proto.indexOf("/"));
		} else {
			token2 = proto;
		}
		
		if (isAgentCommand(token2)) {
			String leadingArgs = "";
			if (msg.getArguments() != null && msg.getArguments().length > 0) {
				for (Object o : msg.getArguments()) {
					if (o != null) {
						leadingArgs += o.toString() + " ";
					}
				}
			}
			EZMojoAgentCmd cmd = EzMojoAgentCmdUtils.INSTANCE.createAgentCmdFromString("%" + token2 + " " + leadingArgs);
			CmdPipe ezMojoAgentEngine = QuanticMojo.INSTANCE.getCmdEngine2(
				TRANSPORT_PROTOCOL.UDP.getLiteral(),
				"ezmojo", 
				"localhost:4445"
			);
			if (ezMojoAgentEngine instanceof CmdPipe) {
				ezMojoAgentEngine.setLocked(true);
				ezMojoAgentEngine.send(cmd);
			}
		}
	}
	
	private boolean isAgentCommand(String commandToken) {
		if (commandToken != null && !commandToken.equals("")) {
			/*  */ if (commandToken.equals("hook")) {
				return true;
			} else if (commandToken.equals("unhook")) {
				return true;
			} else if (commandToken.equals("protocol")) {
				return true;
			} else if (commandToken.equals("help")) {
				return true;
			} else if (commandToken.equals("clear")) {
				return true;
			} else if (commandToken.equals("open")) {
				return true;
			} else if (commandToken.equals("close")) {
				return true;
			} else if (commandToken.equals("forward")) {
				return true;
			} else if (commandToken.equals("unforward")) {
				return true;
			}
		}
		return false;
	}
	
	public List<EZMojoNode> handleUNSET(EZMojoRoot ezMojo, EZMojoCmd cmd) {
		if (ezMojo != null && ezMojo.getRoot() != null) {
			if (cmd != null) {
				OscCmd osc = cmd.getOsc();
				if (osc != null) {
					if (osc.getMsg() instanceof OSCBundle) {
						for (OSCMessage m : getOSCMessagesFromOSCPacket(osc.getMsg())) {
							EZMojoNode n = null;
							do {
								n = findMojo(ezMojo.getRoot(), m.getAddress());
								if (n != null) {
									n.getElements().clear();
									if (n.eContainer() instanceof EZMojoNode) {
										((EZMojoNode)n.eContainer()).getElements().remove(n);
									}
								}
							} while(n != null);
						}
					} else {
						EZMojoNode n = null;
						do { 
							n = findMojo(ezMojo.getRoot(), ((OSCMessage)osc.getMsg()).getAddress());
							if (n != null) {
								n.getElements().clear();
								if (n.eContainer() instanceof EZMojoNode) {
									((EZMojoNode)n.eContainer()).getElements().remove(n);
								}
							}
						} while(n != null);
					}
				}
			}
		}
		return Arrays.asList(new EZMojoNode[] {});
	}
	
	public List<EZMojoNode> handleQUERY(EZMojoRoot ezMojo, EZMojoCmd cmd) {
		// FIXME : LB to read specification twice to get OSC based querying operational
		return Arrays.asList(new EZMojoNode[] {});
	}
	
	public List<EZMojoNode> handleGET(EZMojoRoot ezMojo, EZMojoCmd cmd) {
		OSCPacket packetToGet = cmd.getOsc().getMsg();
		if (packetToGet instanceof OSCMessage) {
			if (ezMojo != null) {
				return Arrays.asList(
					new EZMojoNode[] { 
						findMojo(ezMojo.getSelected(), 
						((OSCMessage)packetToGet).getAddress()) 
					}
				);
			}
		} else if (packetToGet instanceof OSCBundle) {
			List<EZMojoNode> nodes = new ArrayList<EZMojoNode>();
			for (OSCMessage m : getOSCMessagesFromOSCPacket(packetToGet)) {
				EZMojoNode node = findMojo(ezMojo.getSelected(), m.getAddress());
				nodes.add(node);
			}
			return nodes;
		}
		return Arrays.asList(new EZMojoNode[] {});
	}

	public void handleKINEMATICS(EZMojoRoot ezMojo, EZMojoCmd cmd) {
		if (cmd.getOsc() instanceof OscCmd) {
			if (cmd.getOsc().getMsg() instanceof OSCPacket) {
				EZMojoNode node = findMojo(ezMojo.getSelected(), ((OSCMessage)cmd.getOsc().getMsg()).getAddress());
				if (node != null) {
					setKinematicsMotionConfig(node, cmd.getOsc());
				}
			}
		}
	}
	
	public void handleBANG(EZMojoRoot ezMojo, EZMojoCmd cmd) {
		if (cmd.getOsc() instanceof OscCmd) {
			if (cmd.getOsc().getMsg() instanceof OSCPacket) {
				EZMojoNode node = findMojo(ezMojo.getSelected(), ((OSCMessage)cmd.getOsc().getMsg()).getAddress());
				if (node != null) {
					setMojo(
						ezMojo.getSelected(), 
						EzMojoCmdUtils.INSTANCE.getOscMessageFromEzMojoNode(node)
					);
				}
			}
		}
	}
	
	public void handlePLAY(EZMojoRoot ezMojo, EZMojoCmd cmd) {
		if (cmd.getOsc() instanceof OscCmd) {
			if (cmd.getOsc().getMsg() instanceof OSCPacket) {
				EZMojoNode node = findMojo(ezMojo.getSelected(), ((OSCMessage)cmd.getOsc().getMsg()).getAddress());
				if (node != null) {
					if (node.getClock() instanceof MotionEngine) {
						if (node.getClock().isRunning()) {
							node.getClock().cancel();
						} else {
							node.getClock().schedule();
						}
					}
				}
			}
		}
	}
	
	public void handleTOGGLE(EZMojoRoot ezMojo, EZMojoCmd cmd) {
		if (cmd.getOsc() instanceof OscCmd) {
			if (cmd.getOsc().getMsg() instanceof OSCPacket) {
				EZMojoNode node = findMojo(ezMojo.getSelected(), ((OSCMessage)cmd.getOsc().getMsg()).getAddress());
				toggle(node, !node.isToggle());
			}
		}
	}
	
	private void toggle(EZMojoNode node, boolean toggle) {
		if (node != null) {
			node.setToggle(toggle);
			for (EZMojoNode n : node.getElements()) {
				toggle(n, toggle);
			}
		}
	}
	
	public void handleLISTEN(EZMojoRoot ezMojo, EZMojoCmd cmd) {
		OSCPacket packetToGet = cmd.getOsc().getMsg();
		if (packetToGet instanceof OSCMessage) {
			if (ezMojo != null) {
				EZMojoNode node = findMojo(ezMojo.getSelected(), ((OSCMessage)packetToGet).getAddress());
				for (EZMojoTarget t : cmd.getTargets()) {
					addMojoListener(node, cmd.getOsc());
				}
			}
		} else if (packetToGet instanceof OSCBundle) {
			List<EZMojoNode> nodes = new ArrayList<EZMojoNode>();
			for (OSCMessage m : getOSCMessagesFromOSCPacket(packetToGet)) {
				EZMojoNode node = findMojo(ezMojo.getSelected(), m.getAddress());
				for (EZMojoTarget t : cmd.getTargets()) {
					addMojoListener(node, cmd.getOsc());
				}
			}
		}
	}
	
	public void handleUNLISTEN(EZMojoRoot ezMojo, EZMojoCmd cmd) {
		OSCPacket packetToGet = cmd.getOsc().getMsg();
		if (packetToGet instanceof OSCMessage) {
			if (ezMojo != null) {
				EZMojoNode node = findMojo(ezMojo.getSelected(), ((OSCMessage)packetToGet).getAddress());
				for (EZMojoTarget t : cmd.getTargets()) {
					removeMojoListener(node, cmd.getOsc());
				}
			}
		} else if (packetToGet instanceof OSCBundle) {
			List<EZMojoNode> nodes = new ArrayList<EZMojoNode>();
			for (OSCMessage m : getOSCMessagesFromOSCPacket(packetToGet)) {
				EZMojoNode node = findMojo(ezMojo.getSelected(), m.getAddress());
				for (EZMojoTarget t : cmd.getTargets()) {
					removeMojoListener(node, cmd.getOsc());
				}
			}
		}
	}
	
	private EZMojoRoot getTopMojo(EZMojoNode node) {
		if (node != null && node.eContainer() instanceof EZMojoNode) {
			return getTopMojo((EZMojoNode)node.eContainer());
		}
		return node.eContainer() instanceof EZMojoRoot ? (EZMojoRoot) node.eContainer() : null;
	}
	
	public List<EZMojoNode> handleFORWARD(EZMojoRoot ezMojo, EZMojoCmd cmd) {
/*
		OSCPacket packetToGet = cmd.getOsc().getMsg();
		if (packetToGet instanceof OSCMessage) {
			if (ezMojo != null) {
				EZMojoNode node = findMojo(ezMojo.getSelected(), ((OSCMessage)packetToGet).getAddress());
				
				
				hookEzTarget(ezMojo, "", "", "", "");
				//node.
				
				return Arrays.asList(new EZMojoNode[] {});
			}
		} else if (packetToGet instanceof OSCBundle) {
			List<EZMojoNode> nodes = new ArrayList<EZMojoNode>();
			for (OSCMessage m : getOSCMessagesFromOSCPacket(packetToGet)) {
				EZMojoNode node = findMojo(ezMojo.getSelected(), m.getAddress());
				nodes.add(node);
			}
			return nodes;
		}
*/
		return Arrays.asList(new EZMojoNode[] {});
	}
	
	/*
	public List<EZMojoNode> handleUNFORWARD(EZMojoRoot ezMojo, EZMojoCmd cmd) {
		OSCPacket packetToGet = cmd.getOsc().getMsg();
		if (packetToGet instanceof OSCMessage) {
			if (ezMojo != null) {
				return Arrays.asList(new EZMojoNode[] { findMojo(ezMojo.getSelected(), ((OSCMessage)packetToGet).getAddress()) });
			}
		} else if (packetToGet instanceof OSCBundle) {
			List<EZMojoNode> nodes = new ArrayList<EZMojoNode>();
			for (OSCMessage m : getOSCMessagesFromOSCPacket(packetToGet)) {
				EZMojoNode node = findMojo(ezMojo.getSelected(), m.getAddress());
				nodes.add(node);
			}
			return nodes;
		}
		return Arrays.asList(new EZMojoNode[] {});
	}
	*/

	/**
	   Here should be the place for a solid EzMojo command syntax analyzer.
	   Information to be extracted from :
	    - protocol
	   - address scheme list (alias or addr:port stuff list)
	   - command as per ezmojo specification (see : http://code.google.com/a/eclipselabs.org/p/ubqt/wiki/EzMojo)
	   - solve the LISTEN/FORWARD/BIND addr problem by finding an smart syntax tricks to avoid to collide w/ cmd targets
	*/
	public Cmd handleEzMojoFrame(EZMojoRoot mojo, byte[] frame) {
		
		if (frame.length>1) {
			char c = new String(frame).charAt(0);
			if (c == '%' ) {   // info
				return EzMojoAgentCmdUtils.INSTANCE.handleEzMojoAgentFrame(frame);
			} else if (c == '_' ) {   // info
				byte[] txt = new byte[frame.length];
				System.arraycopy(frame, 1, txt, 0, frame.length-1);
				String info = new String(frame, Charset.forName("UTF-8"));
				EzMojoInfoCmd cmd = EzmojoFactory.eINSTANCE.createEzMojoInfoCmd();
				cmd.setText(info);
				return cmd;
			} else if (c == '/' ) {   // set. "//" operator to be supported at some point 
				byte[] packetFrame = new byte[frame.length+1];
				System.arraycopy(frame, 0, packetFrame, 0, frame.length);
				OSCPacket packet = converter.convert(packetFrame, packetFrame.length);
				return createEZMojoCmd(mojo==null?null:mojo.getSelected(), EZMojoKind.LEGACY_SET, packet);
			} else {
				byte[] osc = new byte[frame.length];
				System.arraycopy(frame, 1, osc, 0, frame.length-1);
				OSCPacket packet = converter.convert(osc, osc.length);
				/*  */ if (c == ':') {   // get
					return createEZMojoCmd(mojo==null?null:mojo.getSelected(), EZMojoKind.GET, packet);
				} else if (c == '#') {   // unlisten
					return createEZMojoCmd(mojo==null?null:mojo.getSelected(), EZMojoKind.UNLISTEN, packet);
				} else if (c == '!') {   // listen
					return createEZMojoCmd(mojo==null?null:mojo.getSelected(), EZMojoKind.LISTEN, packet);
				} else if (c == '+' ) {   // set
					return createEZMojoCmd(mojo==null?null:mojo.getSelected(), EZMojoKind.SET, packet);
				} else if (c == '-') {   // remove
					return createEZMojoCmd(mojo==null?null:mojo.getSelected(), EZMojoKind.UNSET, packet);
				} else if (c == '$') {   // service
					return createEZMojoCmd(mojo==null?null:mojo.getSelected(), EZMojoKind.SERVICE, packet); // special case where services/(osc)* must be treated as bundles by knowin both serviceID length and osc bundle length
				} else if (c == '?') {   // query 
					return createEZMojoCmd(mojo==null?null:mojo.getSelected(), EZMojoKind.QUERY, packet);
				} else if (c == '>') {   // forward 
					return createEZMojoCmd(mojo==null?null:mojo.getSelected(), EZMojoKind.FORWARD, packet);
				} else if (c == '<') {   // unforward
					return createEZMojoCmd(mojo==null?null:mojo.getSelected(), EZMojoKind.UNFORWARD, packet);
				} else if (c == '=') {   // bind
					return createEZMojoCmd(mojo==null?null:mojo.getSelected(), EZMojoKind.BIND, packet);
				} else if (c == '.') {   // select
					return createEZMojoCmd(mojo==null?null:mojo.getSelected(), EZMojoKind.SELECT, packet);
				} else if (c == '@') {   // select
					return createEZMojoCmd(mojo==null?null:mojo.getSelected(), EZMojoKind.BANG, packet);
				} else if (c == '&') {   // select
					return createEZMojoCmd(mojo==null?null:mojo.getSelected(), EZMojoKind.CLOCK, packet);
				} else if (c == '(') {   // select
					return createEZMojoCmd(mojo==null?null:mojo.getSelected(), EZMojoKind.FUNCTION, packet);
				} else if (c == ')') {   // select
					return createEZMojoCmd(mojo==null?null:mojo.getSelected(), EZMojoKind.TOGGLE, packet);
				} else if (c == 'k') {   // select
					return createEZMojoCmd(mojo==null?null:mojo.getSelected(), EZMojoKind.KINEMATICS, packet);
				} else if (c == 'u') {   // select
					return createEZMojoCmd(mojo==null?null:mojo.getSelected(), EZMojoKind.UNMAP, packet);
				} else if (c == 'm') {   // select
					return createEZMojoCmd(mojo==null?null:mojo.getSelected(), EZMojoKind.MAP, packet);
				} else if (c == 't') {   // select
					return createEZMojoCmd(mojo==null?null:mojo.getSelected(), EZMojoKind.TRIGGER, packet);
				} else if (c == 'p') {   // select
					return createEZMojoCmd(mojo==null?null:mojo.getSelected(), EZMojoKind.PLAY, packet);
				}
			}
		}
		return null;
	}
	
	public byte[] dumpEzMojoCmd(Cmd cmd) {
		if (cmd instanceof EzMojoInfoCmd) {
			return _dumpEzMojoInfoCmd((EzMojoInfoCmd)cmd);
		} else if (cmd instanceof EZMojoAgentCmd) {
			return _dumpEzMojoAgentCmd((EZMojoAgentCmd)cmd);
		} else if (cmd instanceof EZMojoCmd) {
			return _dumpEzMojoCmd((EZMojoCmd)cmd);
		}
		return new byte[0];
	}

	private byte[] _dumpEzMojoInfoCmd(EzMojoInfoCmd cmd) {
		if (cmd instanceof EzMojoInfoCmd) {
			return cmd.getText().getBytes();
		}
		return new byte[0];
	}
	
	private byte[] _dumpEzMojoAgentCmd(EZMojoAgentCmd cmd) {
		OSCMessage osc = new OSCMessage("");
		byte[] key = new byte[1];
		switch (cmd.getKind()) {
			case COMMAND:
				key = "%".getBytes();
				break;
			default:
				return new byte[0];
		}
		osc.addArgument(cmd.getCmd().getLiteral().substring(1));

		switch(cmd.getCmd()) {
			case ALIAS:
				computeALIASArgs(osc,cmd);
				break;
			case HOOK:
			case UNHOOK:
				computeHOOKZArgs(osc,cmd);
				break;
			}
		byte[] msg = osc.getByteArray() == null ? new byte[0] : osc.getByteArray();
		byte[] frame = new byte[1 + msg.length];
		frame[0] = key[0];
		System.arraycopy(msg, 0, frame, 1, frame.length-1);
		return frame;
	}
	
//	private void _computeAgentCommand(OscCmd cmd) {
//		
//		if (cmd instanceof OSCMessage) {
//			case ALIAS:
//				computeALIASArgs(osc,cmd);
//				break;
//			case HOOK:
//			case UNHOOK:
//				computeHOOKZArgs(osc,cmd);
//				break;
//		}
//
//	}

	private void computeHOOKZArgs(OSCMessage osc, EZMojoAgentCmd cmd) {
		List<Object> arg = Arrays.asList(((OSCMessage)cmd.getOsc().getMsg()).getArguments());
		for (int i=1; i<arg.size(); i++) {
			osc.addArgument(arg.get(i));
		}
	}
	
	private void computeALIASArgs(OSCMessage osc, EZMojoAgentCmd cmd) {
		for (EZMojoTarget t : cmd.getTargets()) {
			osc.addArgument(t.getAlias());
			osc.addArgument(t.getAddr());
			for (int p : t.getPorts()) {
				osc.addArgument(new Integer(p));
			}
		}
	}
	
	private byte[] _dumpEzMojoCmd(EZMojoCmd cmd) {
		byte[] key = new byte[1];
		key[0] = cmd.getKind().getLiteral().getBytes()[0];
		byte[] msg = cmd.getOsc().getMsg().getByteArray();
		byte[] frame = new byte[1 + msg.length];
		frame[0] = key[0];
		System.arraycopy(msg, 0, frame, 1, msg.length);
		return frame;
	}

	public Cmd createEZMojoCmd(String protocol, List<EZMojoTarget> targets, EZMojoKind kind, OSCPacket packet) {
		return createEZMojoCmd(null, kind, packet);
	}

	public Cmd createEZMojoCmd(EZMojoNode ezMojo, EZMojoKind kind, OSCPacket packet) {
		return createEZMojoCmd(ezMojo, kind, (OscCmd) OscCmdUtils.INSTANCE.createOscCmd(packet));
	}
	
	

	public Cmd createEZMojoCmd(EZMojoNode ezMojo, EZMojoKind kind, OscCmd oscCmd) {
		switch (kind) {
			case BIND:
				// Hype : 1* way sync ?
				break;
			case UNSET:
				if (oscCmd instanceof Cmd) {
					EZMojoCmd getCmd = EzmojoFactory.eINSTANCE.createEZMojoCmd();
					getCmd.setKind(kind);
					getCmd.setOsc(oscCmd);
					return (Cmd) getCmd;
				}
				break;
			case UNLISTEN:
				EZMojoCmd unlistenCmd = EzmojoFactory.eINSTANCE.createEZMojoCmd();
				unlistenCmd.setKind(kind);
				unlistenCmd.setOsc(oscCmd);
				removeMojoListener(ezMojo, oscCmd);
				break;
			case LISTEN: // a local listener is basically insane ... how being able to lookup current addr/alias ... JmDns ???
				EZMojoCmd listenCmd = EzmojoFactory.eINSTANCE.createEZMojoCmd();
				listenCmd.setKind(kind);
				listenCmd.setOsc(oscCmd);
				addMojoListener(ezMojo, oscCmd);
				break;
			case GET:
				if (oscCmd instanceof Cmd) {
					EZMojoCmd getCmd = EzmojoFactory.eINSTANCE.createEZMojoCmd();
					getCmd.setKind(kind);
					getCmd.setOsc(oscCmd);
					return (Cmd) getCmd;
				} /* else if (packet instanceof OSCBundle) {
					CompoundCmd compound = CmdFactory.eINSTANCE.createCompoundCmd();
					for (OSCMessage m : getOSCMessagesFromOSCPacket(packet)) {
						EZMojoCmd c = EzmojoFactory.eINSTANCE.createEZMojoCmd();
						c.setKind(kind);
						c.setOsc((OscCmd)OscCmdUtils.INSTANCE.createOscCmd(m));
						compound.getChildren().add((Cmd)c);
						return (Cmd) compound;
					}
				} */
				break;
			case LEGACY_SET:
			case SET:
				if (oscCmd instanceof Cmd) {
					EZMojoCmd setCmd = EzmojoFactory.eINSTANCE.createEZMojoCmd();
					setCmd.setKind(kind);
					setMojo(ezMojo, oscCmd.getMsg());
					setCmd.setOsc(oscCmd);
					return (Cmd) setCmd;
				} /* else if (packet instanceof OSCBundle) {
					CompoundCmd compound = CmdFactory.eINSTANCE.createCompoundCmd();
					for (OSCMessage m : getOSCMessagesFromOSCPacket(packet)) {
						setMojo(ezMojo, m);
						EZMojoCmd cmd = EzmojoFactory.eINSTANCE.createEZMojoCmd();
						cmd.setKind(kind);
						cmd.setOsc(OscCmdUtils.INSTANCE.createOscCmd(m));
						compound.getChildren().add((Cmd)cmd);
						return (Cmd) compound;
					}
				}*/
				break;
			case QUERY:
				break;
			case SERVICE:
				break;
			case FORWARD: // forward should basically be be local to somewhere else. However a distant forward to another distant location is valid
				// The way around, eg: forward form distant to local is ... a LISTENER ... 
				if (oscCmd instanceof Cmd) {
					EZMojoCmd fwdCmd = EzmojoFactory.eINSTANCE.createEZMojoCmd();
					fwdCmd.setKind(kind);
					Map<String, EzAgent> agentsMap = EzMojoAgentManager.INSTANCE.getAgentsMap();
					EZMojoRoot mojo = agentsMap.values().iterator().next().getEzMojo();
					mojo.accept(((OSCMessage)oscCmd.getMsg()).getAddress());
					EZMojoNode node = findMojo(mojo.getRoot(), ((OSCMessage)oscCmd.getMsg()).getAddress());
					if (node != null) {
						//addMojoForward(mojo, oscCmd);
					}
					fwdCmd.setOsc(oscCmd);
					return (Cmd) fwdCmd;
				} 
				break;
			case UNFORWARD:
				if (oscCmd instanceof Cmd) {
					EZMojoCmd fwdCmd = EzmojoFactory.eINSTANCE.createEZMojoCmd();
					fwdCmd.setKind(kind);
					List<EZMojoNode> nodes = setMojo(ezMojo, oscCmd.getMsg());
					if (!nodes.isEmpty()) {
						removeMojoForward(nodes.get(0), oscCmd);
					}
					fwdCmd.setOsc(oscCmd);
					return (Cmd) fwdCmd;
				} 
				break;
			case SELECT:
				break;
			case BANG:
				break;
			case PLAY:
				if (oscCmd instanceof Cmd) {
					EZMojoCmd kinoCmd = EzmojoFactory.eINSTANCE.createEZMojoCmd();
					kinoCmd.setKind(kind);
					kinoCmd.setOsc(oscCmd);
					handlePlayStop(ezMojo, kinoCmd);
					return (Cmd) kinoCmd;
				}
			break;
			case MNEMONIC:
				break;
			case MAP:
				break;
			case UNMAP:
				break;
			case FUNCTION:
				break;
			case TOGGLE:
				if (oscCmd instanceof Cmd) {
					EZMojoCmd kinoCmd = EzmojoFactory.eINSTANCE.createEZMojoCmd();
					kinoCmd.setKind(kind);
					kinoCmd.setOsc(oscCmd);
					handleToggle(ezMojo, oscCmd);
					return (Cmd) kinoCmd;
				}
				break;
			case CLOCK:
				break;
			case KINEMATICS:
				if (oscCmd instanceof Cmd) {
					EZMojoCmd kinoCmd = EzmojoFactory.eINSTANCE.createEZMojoCmd();
					kinoCmd.setKind(kind);
					kinoCmd.setOsc(oscCmd);
					setKinematicsMotionConfig(ezMojo, kinoCmd);
					return (Cmd) kinoCmd;
				}
				break;
			case TRIGGER:
				break;
		}
		return null;
	}
	
	public Cmd createEZMojoCmd(EZMojoKind kind, OscCmd oscCmd) {
		switch (kind) {
			case BIND:
				// Hype : 1* way sync ?
				break;
			case UNSET:
				// LATER
				break;
			case UNLISTEN:
				EZMojoCmd unlistenCmd = EzmojoFactory.eINSTANCE.createEZMojoCmd();
				unlistenCmd.setKind(kind);
				unlistenCmd.setOsc(oscCmd);
				break;
			case LISTEN: // a local listener is basically insane ... how being able to lookup current addr/alias ... JmDns ???
				EZMojoCmd listenCmd = EzmojoFactory.eINSTANCE.createEZMojoCmd();
				listenCmd.setKind(kind);
				listenCmd.setOsc(oscCmd);
				break;
			case GET:
				if (oscCmd instanceof Cmd) {
					EZMojoCmd getCmd = EzmojoFactory.eINSTANCE.createEZMojoCmd();
					getCmd.setKind(kind);
					getCmd.setOsc(oscCmd);
					return (Cmd) getCmd;
				} /* else if (packet instanceof OSCBundle) {
					CompoundCmd compound = CmdFactory.eINSTANCE.createCompoundCmd();
					for (OSCMessage m : getOSCMessagesFromOSCPacket(packet)) {
						EZMojoCmd c = EzmojoFactory.eINSTANCE.createEZMojoCmd();
						c.setKind(kind);
						c.setOsc((OscCmd)OscCmdUtils.INSTANCE.createOscCmd(m));
						compound.getChildren().add((Cmd)c);
						return (Cmd) compound;
					}
				} */
				break;
			case LEGACY_SET:
			case SET:
				if (oscCmd instanceof Cmd) {
					EZMojoCmd setCmd = EzmojoFactory.eINSTANCE.createEZMojoCmd();
					setCmd.setKind(kind);
					setCmd.setOsc(oscCmd);
					return (Cmd) setCmd;
				} /* else if (packet instanceof OSCBundle) {
					CompoundCmd compound = CmdFactory.eINSTANCE.createCompoundCmd();
					for (OSCMessage m : getOSCMessagesFromOSCPacket(packet)) {
						setMojo(ezMojo, m);
						EZMojoCmd cmd = EzmojoFactory.eINSTANCE.createEZMojoCmd();
						cmd.setKind(kind);
						cmd.setOsc(OscCmdUtils.INSTANCE.createOscCmd(m));
						compound.getChildren().add((Cmd)cmd);
						return (Cmd) compound;
					}
				}*/
				break;
			case QUERY:
				break;
			case SERVICE:
				break;
			case FORWARD: // forward should basically be local to somewhere else. However a distant forward to another distant location is valid
				// The way around, eg: forward form distant to local is ... a LISTENER ... 
				if (oscCmd instanceof Cmd) {
					EZMojoCmd fwdCmd = EzmojoFactory.eINSTANCE.createEZMojoCmd();
					fwdCmd.setKind(kind);
					List<EZMojoNode> nodes = setMojo(null, oscCmd.getMsg());
					if (!nodes.isEmpty()) {
					//	addMojoForward(null, oscCmd);
					}
					fwdCmd.setOsc(oscCmd);
					return (Cmd) fwdCmd;
				} 
				break;
			case UNFORWARD:
				if (oscCmd instanceof Cmd) {
					EZMojoCmd fwdCmd = EzmojoFactory.eINSTANCE.createEZMojoCmd();
					fwdCmd.setKind(kind);
					List<EZMojoNode> nodes = setMojo(null, oscCmd.getMsg());
					if (!nodes.isEmpty()) {
						removeMojoForward(nodes.get(0), oscCmd);
					}
					fwdCmd.setOsc(oscCmd);
					return (Cmd) fwdCmd;
				} 
				break;
			case SELECT:
				break;
			case BANG:
				break;
			case PLAY:
				if (oscCmd instanceof Cmd) {
					EZMojoCmd kinoCmd = EzmojoFactory.eINSTANCE.createEZMojoCmd();
					kinoCmd.setKind(kind);
					kinoCmd.setOsc(oscCmd);
					return (Cmd) kinoCmd;
				}
			break;
			case MNEMONIC:
				break;
			case MAP:
				break;
			case UNMAP:
				break;
			case FUNCTION:
				break;
			case TOGGLE:
				if (oscCmd instanceof Cmd) {
					EZMojoCmd kinoCmd = EzmojoFactory.eINSTANCE.createEZMojoCmd();
					kinoCmd.setKind(kind);
					kinoCmd.setOsc(oscCmd);
					return (Cmd) kinoCmd;
				}
				break;
			case CLOCK:
				break;
			case KINEMATICS:
				if (oscCmd instanceof Cmd) {
					EZMojoCmd kinoCmd = EzmojoFactory.eINSTANCE.createEZMojoCmd();
					kinoCmd.setKind(kind);
					kinoCmd.setOsc(oscCmd);
					return (Cmd) kinoCmd;
				}
				break;
			case TRIGGER:
				break;
		}
		return null;
	}
	
	public String getOscAddr(EZMojoNode node) {
		EZMojoNode n = node;
		String addr = "";
		while (n != null && n.eContainer() instanceof EZMojoNode) {
			addr = n.getToken() + "/" + addr;
			n = (EZMojoNode) n.eContainer();
		}
		return "/" + (addr = addr.length()==0?addr : addr.substring(0, addr.length()-1));
	}
	
	public OSCMessage getOscMessageFromEzMojoNode(EZMojoNode node) {
		EZMojoNode n = node;
		String addr = "";
		while (n != null && n.eContainer() instanceof EZMojoNode) {
			addr = n.getToken() + "/" + addr;
			n = (EZMojoNode) n.eContainer();
		}
		addr = addr.length()==0?addr:addr.substring(0, addr.length()-1);
		OSCMessage message = new OSCMessage(addr);
		for (EZVar v: node.getVars()) {
			message.addArgument(v.getValue());
		}
		message.setAddress(addr.startsWith("/")?addr:"/"+addr);
		return message;
	}
	
	public List<OSCMessage> getOSCMessagesFromEzMojoNode(EZMojoNode node) {
		final List<OSCMessage> messages = new ArrayList<OSCMessage>();
		EzmojoSwitch<EZMojoNode> ezmojoSwitch = new EzmojoSwitch<EZMojoNode>(){
			@Override
			public EZMojoNode caseEZMojoNode(EZMojoNode object) {
				if (object.getElements().isEmpty()) {
					messages.add(getOscMessageFromEzMojoNode(object));
				} else {
					for (EZMojoNode n : object.getElements()) {
						caseEZMojoNode(n);
					}
				}
				return super.caseEZMojoNode(object);
			}
		};
		if (node != null) {
			messages.add(getOscMessageFromEzMojoNode(node));
			synchronized (node.getElements()) {
				for (EZMojoNode n : node.getElements()) {
					ezmojoSwitch.doSwitch(n);
				}
			}
		}
		return messages;
	}
	
	public String dumpOSCMessage(OSCMessage message) {
		return message.toString();
	}
	
	public List<OSCMessage> getOSCMessagesFromOSCPacket(OSCPacket packet) {
		List<OSCMessage> messages = new ArrayList<OSCMessage>();
		if (packet instanceof OSCMessage) {
			messages.add((OSCMessage)packet);
		} else if (packet instanceof OSCBundle) {
			updateOSCMessagesFromOSCPacket(messages, packet);
		}
		return messages;
	}

	public void updateOSCMessagesFromOSCPacket(List<OSCMessage> messages, OSCPacket packet) {
		if (packet instanceof OSCMessage) {
			messages.add((OSCMessage)packet);
		} else if (packet instanceof OSCBundle) {
			for (OSCPacket p : ((OSCBundle)packet).getPackets()) {
				updateOSCMessagesFromOSCPacket(messages, p);
			}
		}
	}

 	public void updateMojo(EZMojoNode root, OSCPacket packet) {
		List<OSCMessage> messages = getOSCMessagesFromOSCPacket(packet);
		for (OSCMessage m : messages) {
			EZMojoNode node = findMojo(root, m.getAddress());
			if (node != null) {
				synchronizeMojo(node, m);
			}
		}
	}
 	
 	public void synchronizeMojo(EZMojoNode node, OSCMessage cmd) {
 		synchronizeMojo(node, cmd.getArguments());
 	}
 	
 	public void synchronizeMojo(EZMojoNode node, Object... args) {
 		if (node != null) {
	 		if (node.getVars().size()==args.length) { // nb args compatible
	 			int i = 0;
	 	 		for (EZVar v : node.getVars()) {
	 	 			v.setValue(args[i]);
	 	 			i++;
	 	 		}
	 		} else if (args.length < node.getVars().size()) {
	 			for (int i=0; i<args.length-1;i++) {
	 				node.getVars().get(i).setValue(args[i]);
	 			}
	 		} else if (args.length > node.getVars().size()) {
	 			for (int i=0; i<node.getVars().size()-1;i++) {
	 				node.getVars().get(i).setValue(args[i]);
	 			}
	 			for (int j=node.getVars().size(); j<args.length; j++) {
	 				node.getVars().add(createVarFromObj(j, args[j]));
	 			}
	 		}
 		}
 	}
	
	private class EZMojoVarListener extends AdapterImpl {
		private CmdPipe pipe;
		public EZMojoVarListener(CmdPipe pipe) {
			this.pipe = pipe;
		}
		@Override
		public void notifyChanged(Notification msg) {
			if (msg.getFeature().equals(EzmojoPackage.eINSTANCE.getEZVar_Value())) {
				EZMojoNode node = (EZMojoNode) ((EZVar)msg.getNotifier()).eContainer();
				pipe.send(
					OscCmdUtils.INSTANCE.createOscCmd(
						getOscMessageFromEzMojoNode(node)
					)				
				);
			}
		}	
		public CmdPipe getPipe() {
			return pipe;
		}
	}
	
	public List<EZMojoVarListener> findAdaptersByCmdPipeIfAny(EZVar var, CmdPipe pipe) {
		List<EZMojoVarListener> listeners = new ArrayList<EzMojoCmdUtils.EZMojoVarListener>();
		if (var != null) {
			for (Adapter a : var.eAdapters()) {
				if (a instanceof EZMojoVarListener) {
					CmdPipe p = ((EZMojoVarListener)a).getPipe();
					if (p instanceof CmdPipe) {
						if (p.getId().equals(pipe.getId())) {
							listeners.add((EZMojoVarListener) a);
						}
					}
				}
			}
		}
		return listeners;
	}
	
	private void addMojoListener(EZMojoNode node, OscCmd cmd) {
		if (cmd instanceof OscCmd && cmd.getMsg() instanceof OSCMessage) {
			String addr = ((OSCMessage)cmd.getMsg()).getAddress();
			if (addr != null && !addr.equals("")) {
				if (((OSCMessage)cmd.getMsg()).getArguments() != null) {
					if (((OSCMessage)cmd.getMsg()).getArguments().length>2) {
						Object objAddr = ((OSCMessage)cmd.getMsg()).getArguments()[1];
						Object objPort = ((OSCMessage)cmd.getMsg()).getArguments()[2];
						hookEzTarget(getTopMojo(node), "", (String)objAddr, (String)objPort, "-1");
					} else if (((OSCMessage)cmd.getMsg()).getArguments().length>1) {
						Object objPort = ((OSCMessage)cmd.getMsg()).getArguments()[2];
						hookEzTarget(getTopMojo(node), "", "", (String)objPort, "-1");
					} else {
						// IMPOSSIBLE ?
					}
				}
			}
		}
	}
	
	private void removeMojoListener(EZMojoNode node, OscCmd cmd) {
		
	}
	
	class ForwardQxAdapterImpl extends GenericQxEventHandler {
		@Override
		public synchronized void handleQxEvent(Event event) {
			super.handleQxEvent(event);
		}
	}
	
	/*
	public List<EZMojoNode> handleFORWARD(EZMojoRoot mojo, EZMojoCmd mCmd) {
		if (mCmd instanceof EZMojoCmd) {
			if (mCmd.getOsc() instanceof OscCmd) {
				if (mojo instanceof EZMojoRoot) {
					addMojoForward(mojo, (OscCmd) mCmd.getOsc());
				}
			}
		}
		return Arrays.asList(new EZMojoNode[] {});
	}
	 */
	
	public List<EZMojoNode> handleUNFORWARD(EZMojoRoot ezMojo, EZMojoCmd cmd) {
		// FIXME : LB to read specification twice to get OSC based querying operational
		return Arrays.asList(new EZMojoNode[] {});
	}

	public boolean containsEzTarget(List<EZMojoTarget> targets, EZMojoTarget target) {
		for (EZMojoTarget t : targets) {
			if (EcoreUtil.equals(t, target)) {
				return true;
			}
		}
		return false;
	}
	public boolean isConnected(EZMojoTarget target) {
		return EZMojoTargetUtils.INSTANCE.getCmdPipe(target, false) instanceof CmdPipe;
	}
	
	public boolean isTargetForwardAlreadyHere(EZMojoNode node, EZMojoTarget target) {
		if (node != null && target !=null) {
			for (EZMojoTarget t : node.getForwards()) {
				if (EcoreUtil.equals(t, target)) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean isTargetForwardAlreadyHere(List<EZMojoTarget> targets, EZMojoTarget target) {
		if (targets != null && targets !=null) {
			for (EZMojoTarget t : targets) {
				if (EcoreUtil.equals(t, target)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean isTargetListenAlreadyHere(EZMojoNode node, EZMojoTarget target) {
		if (node != null && target !=null) {
			for (EZMojoTarget t : node.getListeners()) {
				if (t.equals(target)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public void addMojoForward(final EZMojoNode node, CmdPipe pipe) {
		EZMojoTarget targetToUse = EZMojoTargetUtils.INSTANCE.createEzTarget(pipe, EZMojoKind.FORWARD);
		if (!isTargetForwardAlreadyHere(node, targetToUse)) {
			node.getForwards().add(targetToUse);
		}
	}
	
	private void removeMojoForward(EZMojoNode node, OscCmd cmd) {}
	
	class EzMojoNodeMotionReceiver implements IMotionReceiver {
		private EZMojoNode node;
		private OscCmd oscCmd;
		public EzMojoNodeMotionReceiver(final EZMojoNode node, final Cmd oscCmd) {
			this.node = node;
			this.oscCmd = (OscCmd)oscCmd;
		}
		@Override
		public IStatus getKicked(int step, int min, int max, int incr, final MotionValue val, long time) {
			System.out.println("[" + val.getX() + "][" + val.getY() + "][" + val.getZ() + "]");
			MotionEvalCtx ctx = EzmojoFactory.eINSTANCE.createMotionEvalCtx();
			ctx.setKicked(val);
			ctx.getCtx().addAll(node.getMotions());
			ctx.setNode(node);
			ctx.setCmd(oscCmd);
			ctx.setStrategy(MotionEvalStrategy.ADDITIVE);
			node.bang(ctx);
			return Status.OK_STATUS;
		}
	}
	
	private void handlePlayStop(final EZMojoNode node, final Cmd oscCmd) {
		if (node != null) {
			if (oscCmd instanceof OscCmd) {
				OSCPacket packet = ((OscCmd)oscCmd).getMsg();
				for (OSCMessage message : getOSCMessagesFromOSCPacket(packet)) {
					EZMojoNode n = findMojo(node, message.getAddress());
					if (n != null) {
						if (n.getClock() != null) {
							if (n.getClock().isRunning()) {
								n.getClock().cancel();
							} else {
								n.getClock().schedule();
							}
						}
					}
				}
			}
		}
	}

	private void handleToggle(final EZMojoNode node, final Cmd oscCmd) {
		if (node != null) {
			if (oscCmd instanceof OscCmd) {
				OSCPacket packet = ((OscCmd)oscCmd).getMsg();
				for (OSCMessage message : getOSCMessagesFromOSCPacket(packet)) {
					EZMojoNode n = findMojo(node, message.getAddress());
					if (n != null) {
						if (n.isToggle()) {
							n.setToggle(false);
						} else {
							n.setToggle(true);
						}
					}
					for (EZMojoNode child : n.getElements()) {
						handleToggle(child, oscCmd);
					}
				}
			}
		}
	}

	private void setKinematicsMotionConfig(final EZMojoNode node, final Cmd oscCmd) {
		if (node != null) {
			if (oscCmd instanceof OscCmd) {
				OSCPacket packet = ((OscCmd)oscCmd).getMsg();
				for (OSCMessage message : getOSCMessagesFromOSCPacket(packet)) {
					EZMojoNode n = findMojo(node, message.getAddress());
					if (n != null) {
						Motion motion = createMotionFromOSCMessage(message);
						n.getMotions().add(motion);
						if (n.getClock() == null) {
							n.setClock(new MotionEngine(new Float(motion.getFrequency()).longValue(), motion));
						} else {
							n.getClock().getMotions().add(motion);
						}
						n.getClock().getMotionReceiver().add(
							new EzMojoNodeMotionReceiver(n, oscCmd)
						);
						if (!n.isToggle()) {
							n.getClock().schedule(/* duration ???? */);
						}
					}
				}
			}
		}
	}

	public Motion createMotionFromOSCMessage(OSCMessage message) {
		Integer axis		= (Integer) message.getArguments()[0];  // axis
		Integer kind		= (Integer) message.getArguments()[1];  // kind
		Float freq			= (Float) message.getArguments()[2];    // freq
		Integer rate		= (Integer) message.getArguments()[3];  // rate
		Float amplitude		= (Float) message.getArguments()[4];    // amplitude
		Integer cinematic	= (Integer) message.getArguments()[5];  // cinematic
		
		return MotionUtils.INSTANCE.createMotion(
			amplitude, 
			MotionCinematic.get(cinematic), 
			freq, 
			MotionKind.get(kind), 
			rate, 
			MotionAxis.get(axis)
		);
	}
	
	/*
	private void addMojoListener(EZMojoNode node, String target, CmdPipe... pipe) {
		if (node != null) {
			EZMojoNode n = findMojo(node, target);
			for (final CmdPipe p : pipe) {
				for (EZVar v : n.getVars()) {
					if (findAdaptersByCmdPipeIfAny(v, p).isEmpty()) {
						v.eAdapters().add(
							new EZMojoVarListener(p)
						);
					}
				}
			}
		}
	}
	
	private void removeMojoListener(EZMojoNode node, String target, CmdPipe... pipe) {
		if (node != null) {
			EZMojoNode n = findMojo(node, target);
			for (final CmdPipe p : pipe) {
				List<EZMojoVarListener> listenersToRemove = new ArrayList<EzMojoCmdUtils.EZMojoVarListener>();
				for (EZVar v : n.getVars()) {
					for (EZMojoVarListener l : findAdaptersByCmdPipeIfAny(v, p)) {
						if ( l != null) {
							listenersToRemove.add(l);
						}
					}
					for (EZMojoVarListener l : listenersToRemove) {
						v.eAdapters().remove(l);
					}
				}
			}
		}
	}
	public void addMojoForward(EZMojoNode node, String target, CmdPipe... pipe) {
		if (node != null) {
			EZMojoNode n = findMojo(node, target);
			for (final CmdPipe p : pipe) {
				for (EZVar v : n.getVars()) {
					if (findAdaptersByCmdPipeIfAny(v, p).isEmpty()) {
						v.eAdapters().add(
							new EZMojoVarListener(p)
						);
					}
				}
			}
		}
	}
	*/
	
	public void removeMojoForward(EZMojoNode node, String target, CmdPipe... pipe) {
		if (node != null) {
			EZMojoNode n = findMojo(node, target);
			for (final CmdPipe p : pipe) {
				List<EZMojoVarListener> listenersToRemove = new ArrayList<EzMojoCmdUtils.EZMojoVarListener>();
				for (EZVar v : n.getVars()) {
					for (EZMojoVarListener l : findAdaptersByCmdPipeIfAny(v, p)) {
						if ( l != null) {
							listenersToRemove.add(l);
						}
					}
					for (EZMojoVarListener l : listenersToRemove) {
						v.eAdapters().remove(l);
					}
				}
			}
		}
	}
	
	public void removeMojoListener(EZMojoNode node, String addr) {
		if (node != null) {
			EZMojoNode n = findMojo(node, addr);
			List<EZMojoVarListener> listenersToRemove = new ArrayList<EzMojoCmdUtils.EZMojoVarListener>();
			for (EZVar v : n.getVars()) {
				for (Adapter l : v.eAdapters()) {
					if ( l instanceof EZMojoVarListener) {
						listenersToRemove.add((EZMojoVarListener)l);
					}
				}
				for (EZMojoVarListener l : listenersToRemove) {
					v.eAdapters().remove(l);
				}
			}
		}
	}
	
	/*
	public class EZMojoFindSwitch<T extends EZMojoNode> extends EzmojoSwitch<EZMojoNode> {
		private EZMojoNode result;
		private String addr;
		public EZMojoFindSwitch(String addr) {
			this.addr = addr;
		}
		@Override
		public EZMojoNode caseEZMojoNode(EZMojoNode object) {
			OSCMessage message = getOscMessageFromEzMojoNode(object);
			System.out.println(message.getAddress() + " = " + addr + " ?");
			if (message.getAddress().equals(addr)) {
				return result = object;
			}
			return super.caseEZMojoNode(object);
		}
		public EZMojoNode getResult() {
			return result;
		}
	}
	*/
	
	public EZMojoNode findMojo(List<EZMojoNode> nodes, String addr) {
		for (EZMojoNode n : nodes) {
			OSCMessage message = getOscMessageFromEzMojoNode(n);
			System.out.println(message.getAddress() + " = " + addr + " ?");
			if (message.getAddress().equals(addr)) {
				return n;
			} else {
				EZMojoNode node = findMojo(n.getElements(), addr);
				if (node != null) {
					return node;
				}
			}
		}
		return null;
	}
	
	public EZMojoNode findMojo(EZMojoNode node, String addr) {
		if (node == null) {
			node = createEzMojoNode("/");
		}
		return findMojo(Arrays.asList(node), addr);
	}
	
	public EZMojoNode getMojo(EZMojoNode node, String addr) {
		return findMojo(node, addr);
	}
	
	public EZMojoNode setMojoFromOSCString(EZMojoNode node, String msg) {
		return setMojo(node, EzMojoExprUtils.INSTANCE.parseOSCMessage(msg));
	}

	public EZMojoNode setMojo(EZMojoNode node, String addr, Object... values) {
		return setMojo(
			node, 
			new OSCMessage(
				addr, 
				values
			)
		);
	}
	
	private void touchNode(EZMojoNode n, long t) {
		n.setLastBang(t);
		n.setTouches(n.getTouches()+1);
	}
	
	public EZMojoNode setMojo(EZMojoNode node, OSCMessage message) {
		if (message.getAddress().startsWith("/ez/")) {
			handleEZ(node, message);
		}
		if (node == null) {
			node = createEzMojoNode("/");
		}
		node.setLastBang(System.currentTimeMillis());
		Vector<String> tokens = new Vector<String>();
		if (message.getAddress().length() > 0 && message.getAddress().contains("/")) {
			for (String t : message.getAddress().substring(1).split("/")) {
				tokens.add(t);
			}
		}
		EList<EZMojoTarget> fwdTargets = new BasicEList<EZMojoTarget>();
		fwdTargets.addAll(node.getForwards());
		return insertMojo(
			node.getElements(), 
			tokens, 
			message, 
			fwdTargets
		);
	}
	
	public List<EZMojoNode> setMojo(EZMojoNode node, OSCPacket... packets) {
		if (node == null) {
			node = createEzMojoNode("/");
		}
		List<EZMojoNode> nodes = new ArrayList<EZMojoNode>();
		for (OSCPacket p : packets) {
			nodes.addAll(setMojo(node, getOSCMessagesFromOSCPacket(p).toArray(new OSCMessage[0])));
		}
		return nodes;
	}
	
	public List<EZMojoNode> setMojo(EZMojoNode node, OSCMessage... messages) {
		if (node == null) {
			node = createEzMojoNode("/");
		}
		List<EZMojoNode> nodes = new ArrayList<EZMojoNode>();
		for (OSCMessage m : messages) {
			Vector<String> tokens = new Vector<String>();
			for (String t : m.getAddress().split("/")) {
				tokens.add(t);
			}
			nodes.add(insertMojo(node.getElements(), tokens, m, node.getForwards()));
		}
		return nodes;
	}
	
	public EZMojoNode insertMojo(List<EZMojoNode> elements, Vector<String> tokens, OSCMessage message, List<EZMojoTarget> cumulatedTargets) {
		return insertMojo(null, elements, tokens, message, cumulatedTargets);
	}
	
	private void accumulate(List<EZMojoTarget> lstToAccumulate, List<EZMojoTarget> lstAccumulated) {
		for (EZMojoTarget t2add : lstToAccumulate) {
			boolean toAdd = true;
			for (EZMojoTarget tHere : lstAccumulated ) {
				if (EcoreUtil.equals(t2add, tHere)) {
					toAdd = false;
					break;
				}
			}
			if (toAdd) {
				lstAccumulated.add(t2add);
			}
		}
	}
	
	public EZMojoNode insertMojo(
		EZMojoNode node, 
		List<EZMojoNode> elements, 
		Vector<String> tokens, 
		OSCMessage message, 
		List<EZMojoTarget> cumulatedTargets
	) {
		if (node !=null) {
			touchNode(node, System.currentTimeMillis());
	 		accumulate(node.getForwards(), cumulatedTargets);
	 	}
		if (tokens.size()>0) {
			String token = tokens.remove(0);
			for (EZMojoNode n : elements) {
		 		accumulate(n.getForwards(), cumulatedTargets);
				if (n.getToken().equals(token)) {
					node = n;
					touchNode(node, System.currentTimeMillis());
					break;
				}
			}
			if (node == null) {
				node = createEzMojoNode(token);
				touchNode(node, System.currentTimeMillis());
				elements.add(node);
				if (getTopMojo(node) != null) {
					if (!getTopMojo(node).getIndex().keySet().contains(message.getAddress())) {
						getTopMojo(node).getIndex().put(message.getAddress(), node);
					}
				}
			}
			if (tokens.size()==0) {
				synchronizeMojo(node, message.getArguments());
				forwards(node, cumulatedTargets);
				return node;
			}
			touchNode(node, System.currentTimeMillis());
			return insertMojo(node.getElements(), tokens, message, cumulatedTargets);
		} 
		return null;
	}
	
	private void forwards(EZMojoNode node, List<EZMojoTarget> targets) {
		if (!node.isToggle()) {
			OscCmd cmd = createOscMsg(node);
			if (targets != null) {
				doEZ(node, targets);
				for (EZMojoTarget t : targets) {
			 		CmdPipe p = EZMojoTargetUtils.INSTANCE.getCmdPipe(t, false);
			 		if (p != null) {
			 			p.send(cmd);
			 		}
				}
			}
		}
	}
	
	public OscCmd createOscMsg(EZMojoNode n) {
		if (!n.getVars().isEmpty()) {
			List<Object> arguments = new ArrayList<Object>();
			for (EZVar v : n.getVars()) {
				arguments.add(v.getValue());
			}
			return OscCmdUtils.INSTANCE.createOscSndCmd(n.getAddr(), arguments.toArray());
		} else {
			return OscCmdUtils.INSTANCE.createOscSndCmd(n.getAddr());
		}
	}
	
	public void handleNotifications(EZMojoNode node) {
		/* for (EZMojoListener target : node.getConnections()) {} */	
	}

	public EZMojoNode createEzMojoNode(String id) {
		return createEzMojoNode(id, Long.MAX_VALUE);
	}
	
	public EZMojoNode createEzMojoNode(String id, long ttl) {
		EZMojoNode elem = EzmojoFactory.eINSTANCE.createEZMojoNode();
		elem.setTtl(ttl);
		elem.setToken(id);
		return elem;
	}

	/**
	 * Insert args from OSC ones in the corresponding node
	 * @param node node which OSC addr represent it
	 * @param message {@link OSCMessage} to be translated into {@link EZMojoNode} dynamic context
	 */
	public void insertArgs(EZMojoNode node, OSCMessage message) {
		if (node != null) {
			int i = 0;
			for (Object o : message.getArguments()) {
				node.getVars().add(createVarFromObj(i, o));
				i++;
			}
		}
	}
	
	/**
	 * Creates an {@link EZVar} from given id and value
	 * 
	 * @param i actual positional index of the alue within the arguments
	 * @param obj value for the newly created argument
	 * 
	 * @return a newly created {@link EZVar}
	 */
	public EZVar createVarFromObj(int i, Object obj) {
		EZVar v = EzmojoFactory.eINSTANCE.createEZVar();
		v.setName(""+i);
		v.setValue(obj);
		return v;
	}
	
	public EZMojoCmd creatMojoCmdFromString(EZMojoNode node, String msg) {
		EZMojoCmd cmd = (EZMojoCmd) creatMojoCmdFromString(msg);
		return cmd;
	}
	
	/**
	 * Handling a {@link EZMojoRoot} command textual form from console
	 * 
	 * @param expr a written in the EzMojo console
	 * 
	 * @return a {@link EZMojoAgentCmd}, {@link EZMojoCmd} or {@link EzMojoInfoCmd} resulting of the
	 * expression analysis.
	 */
	public Cmd creatMojoCmdFromString(String msg) {
		msg  = msg.trim();
		if (msg != null && msg.length() > 0) {
			if (EzMojoAgentCmdUtils.INSTANCE.isAgentCommandFromText(msg)) {
				msg = msg.startsWith("%") ? msg : "%" + msg;
				return EzMojoAgentCmdUtils.INSTANCE.createAgentCmdFromString(msg);
			} else {
				EZMojoKind kind = EZMojoKind.get(msg.substring(0, 1));
				return createEZMojoCmd(
					"osc",
					new ArrayList<EZMojoTarget>(),
					kind,
					EzMojoExprUtils.INSTANCE.parseOSCMessage(kind.equals(EZMojoKind.LEGACY_SET) ? msg : msg.substring(1))
				);
			}
		}
		return null;
	}
}
