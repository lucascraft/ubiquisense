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

import java.util.List;

import net.sf.smbt.ezmojo.EZCmdKind;
import net.sf.smbt.ezmojo.EZMojoAgentCmd;
import net.sf.smbt.ezmojo.EZMojoKind;
import net.sf.smbt.ezmojo.EZMojoNode;
import net.sf.smbt.ezmojo.EZMojoTarget;
import net.sf.smbt.ezmojo.EzMojoInfoCmd;
import net.sf.smbt.ezmojo.EzmojoFactory;
import net.sf.smbt.osc.utils.OscCmdUtils;
import net.sf.smbt.osccmd.OscCmd;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.smbt.xcp.XCPDevice;
import net.sf.smbt.xcp.utils.XCPUtils;
import net.sf.xqz.model.engine.CmdPipe;

import com.illposed.osc.OSCMessage;
import com.illposed.osc.utility.OSCByteArrayToJavaConverter;

public class EzMojoAgentCmdUtils {
	
	public final static EzMojoAgentCmdUtils INSTANCE = new EzMojoAgentCmdUtils();
	
	private OSCByteArrayToJavaConverter converter;
	
	public EzMojoAgentCmdUtils() {
		converter = new OSCByteArrayToJavaConverter();
	}

	public EZMojoAgentCmd handleEzMojoAgentFrame(byte[] frame) {
		if (frame != null && frame.length>0) {
			if (frame[0] == '%') {
				byte[] msg = new byte[frame.length-1];
				System.arraycopy(frame, 1, msg, 0, frame.length-1);

				OSCMessage osc = (OSCMessage) converter.convert(msg, msg.length);
				EZMojoAgentCmd cmd = null;
				if (osc.getArguments().length>0) {
					if (osc.getArguments()[0] instanceof String) {
						if (((String)osc.getArguments()[0]).contains(EZCmdKind.ALIAS.getLiteral().substring(1))) {
							cmd = createALIAS(osc);
						} else if (((String)osc.getArguments()[0]).equals(EZCmdKind.CLEAR.getLiteral().substring(1))) {
							cmd = createEzCLEAR();
						} else if (((String)osc.getArguments()[0]).equals(EZCmdKind.FEEDBACK.getLiteral().substring(1))) {
							cmd = createFEEDBACK(osc);
						} else if (((String)osc.getArguments()[0]).equals(EZCmdKind.PROTOCOL.getLiteral().substring(1))) {
							cmd = createEzPROTOCOL();
						} else if (((String)osc.getArguments()[0]).equals(EZCmdKind.RESET.getLiteral().substring(1))) {
							cmd = createEzRESET(
								(osc.getArguments() != null && osc.getArguments().length > 0 && osc.getArguments()[0] instanceof String) ? 
								(String) osc.getArguments()[0] : 
								"true"
							);
						}  else if (((String)osc.getArguments()[0]).equals(EZCmdKind.UNHOOK.getLiteral().substring(1))) {
							cmd = createEzUNHOOK(osc);
						} else if (((String)osc.getArguments()[0]).equals(EZCmdKind.HOOK.getLiteral().substring(1))) {
							cmd = createEzHOOK(osc);
						} else if (((String)osc.getArguments()[0]).equals(EZCmdKind.LIST.getLiteral().substring(1))) {
							cmd = createEzLIST();
						}
					}
				}
				return cmd;
			}
		}
		return null;
	}
		
    public EZMojoAgentCmd createALIAS(OSCMessage osc) {
    	String streamText = "alias";
		if (osc.getArguments().length>0) {
			for (int i = 1; i<osc.getArguments().length; i++) {
				Object arg = osc.getArguments()[i];
				if (arg instanceof String) {
					streamText += " " + (String) arg;
				} else if (arg instanceof Integer) {
					streamText += ":" + (Integer) arg;
					if (!(i == osc.getArguments().length)) {
						streamText += ", ";
					}
				}
			}
			return createEzALIAS(streamText);
		}
		return null;
    }
	
    public EZMojoAgentCmd createFEEDBACK(OSCMessage osc) {
    	String streamText = "feedback";
		if (osc.getArguments().length>0 && osc.getArguments()[0] instanceof String) {
			streamText += " " + osc.getArguments()[0];
			return createEzFEEDBACK(streamText);
		}
		return null;
    }
	
    public EZMojoAgentCmd createEzHOOK(OSCMessage osc) {
    	String streamText = "hook";
		if (osc.getArguments().length>2 && osc.getArguments()[1] instanceof String && osc.getArguments()[2] instanceof String && osc.getArguments()[3] instanceof String) {
			String protocol = osc.getArguments().length>5?(String)osc.getArguments()[4]:"";
			int speed = osc.getArguments().length>5?Integer.parseInt((String)osc.getArguments()[5]):-1;
			streamText += " " + osc.getArguments()[1]+ osc.getArguments()[2]+ (speed>0?"@"+speed:"") + "$" + osc.getArguments()[3]+ (!protocol.equals("")?"#"+protocol:"");
			return createEzHOOK(streamText);
		}
		return null;
    }
	
    public EZMojoAgentCmd createEzUNHOOK(OSCMessage osc) {
    	String streamText = "unhook";
		if (osc.getArguments().length>2 && osc.getArguments()[1] instanceof String && osc.getArguments()[2] instanceof String && osc.getArguments()[3] instanceof String) {
			String protocol = osc.getArguments().length>5?(String)osc.getArguments()[4]:"";
			int speed = osc.getArguments().length>5?Integer.parseInt((String)osc.getArguments()[5]):-1;
			streamText += " " + osc.getArguments()[1]+ osc.getArguments()[2]+ (speed>0?"@"+speed:"") + "$" + osc.getArguments()[3]+ (!protocol.equals("")?"#"+protocol:"");
			return createEzUNHOOK(streamText);
		}
		return null;
    }
    
	public boolean isAgentCommandFromText(String streamText) {
		streamText = streamText.startsWith("%") ? streamText : "%" + streamText;
		return (	
			streamText.startsWith(EZCmdKind.BIND.getLiteral()) || 
			streamText.startsWith(EZCmdKind.CLOSE.getLiteral()) ||
			streamText.startsWith(EZCmdKind.DEPLOY.getLiteral()) ||
			streamText.startsWith(EZCmdKind.LIST.getLiteral()) ||
			streamText.startsWith(EZCmdKind.REMOVE.getLiteral()) ||
			streamText.startsWith(EZCmdKind.RESET.getLiteral()) ||
			streamText.startsWith(EZCmdKind.STATUS.getLiteral()) ||
			streamText.startsWith(EZCmdKind.WTF.getLiteral()) ||
			streamText.startsWith(EZCmdKind.ALIAS.getLiteral()) ||
			streamText.startsWith(EZCmdKind.HELP.getLiteral()) ||
			streamText.startsWith(EZCmdKind.CLEAR.getLiteral()) ||
			streamText.startsWith(EZCmdKind.UNHOOK.getLiteral()) ||
			streamText.startsWith(EZCmdKind.HOOK.getLiteral()) ||
			streamText.startsWith(EZCmdKind.FEEDBACK.getLiteral()) ||
			streamText.startsWith(EZCmdKind.PROTOCOL.getLiteral())
		);
	}
	
	public boolean isAgentCommandFromFrame(byte[] frame) {
		if (new String(frame).contains("%")) {
			byte[] msg = new byte[frame.length-1];
			System.arraycopy(frame, 1, msg, 0, frame.length-1);
			OSCMessage osc = (OSCMessage) converter.convert(msg, msg.length);
			if (osc.getArguments().length > 0) {
				String streamText = (String) osc.getArguments()[0];
				streamText = streamText.startsWith("%") ? streamText : "%" + streamText;
				return (	
					streamText.startsWith(EZCmdKind.ALIAS.getLiteral()) ||
					streamText.startsWith(EZCmdKind.BIND.getLiteral()) || 
					streamText.startsWith(EZCmdKind.CLOSE.getLiteral()) ||
					streamText.startsWith(EZCmdKind.CLEAR.getLiteral()) ||
					streamText.startsWith(EZCmdKind.DEPLOY.getLiteral()) ||
					streamText.startsWith(EZCmdKind.FEEDBACK.getLiteral()) ||
					streamText.startsWith(EZCmdKind.HELP.getLiteral()) ||
					streamText.startsWith(EZCmdKind.HOOK.getLiteral()) ||
					streamText.startsWith(EZCmdKind.LIST.getLiteral()) ||
					streamText.startsWith(EZCmdKind.PROTOCOL.getLiteral()) ||
					streamText.startsWith(EZCmdKind.REMOVE.getLiteral()) ||
					streamText.startsWith(EZCmdKind.RESET.getLiteral()) ||
					streamText.startsWith(EZCmdKind.STATUS.getLiteral()) ||
					streamText.startsWith(EZCmdKind.UNHOOK.getLiteral()) ||
					streamText.startsWith(EZCmdKind.WTF.getLiteral())
				);
			}
		}
		return false;
	}
	
	
	public EZMojoAgentCmd createAgentCmdFromString(String streamText) {
		streamText = streamText.trim();
		if (streamText.startsWith(EZCmdKind.BIND.getLiteral())) {
			return createEzBIND(streamText);
		} else if (streamText.startsWith(EZCmdKind.CLOSE.getLiteral())) {
			return createEzCLOSE(streamText);
		} else if (streamText.startsWith(EZCmdKind.DEPLOY.getLiteral())) {
			return createEzDEPLOY(streamText);
		} else if (streamText.startsWith(EZCmdKind.LIST.getLiteral())) {
			return createEzLIST(streamText);
		} else if (streamText.startsWith(EZCmdKind.REMOVE.getLiteral())) {
			return createEzREMOVE(streamText);
		} else if (streamText.startsWith(EZCmdKind.RESET.getLiteral())) {
			return createEzRESET(streamText);
		} else if (streamText.startsWith(EZCmdKind.STATUS.getLiteral())) {
			return createEzSTATUS(streamText);
		} else if (streamText.startsWith(EZCmdKind.WTF.getLiteral())) {
			return createEzWTF(streamText);
		} else if (streamText.startsWith(EZCmdKind.HELP.getLiteral())) {
			return createEzHELP(streamText);
		} else if (streamText.startsWith(EZCmdKind.FEEDBACK.getLiteral())) {
			return createEzFEEDBACK(streamText);
		} else if (streamText.startsWith(EZCmdKind.CLEAR.getLiteral())) {
			return createEzCLEAR();
		} else if (streamText.startsWith(EZCmdKind.ALIAS.getLiteral())) {
			return createEzALIAS(streamText);
		} else if (streamText.startsWith(EZCmdKind.PROTOCOL.getLiteral())) {
			return createEzPROTOCOL();
		} else if (streamText.startsWith(EZCmdKind.HOOK.getLiteral())) {
			return createEzHOOK(streamText);
		} else if (streamText.startsWith(EZCmdKind.UNHOOK.getLiteral())) {
			return createEzUNHOOK(streamText);
		}
		return null;
	}
	
	public EZMojoAgentCmd createEzBIND(String streamText) {
		EZMojoAgentCmd cmd = EzmojoFactory.eINSTANCE.createEZMojoAgentCmd();
		cmd.setCmd(EZCmdKind.BIND);
		cmd.setKind(EZMojoKind.COMMAND);
		//cmd.setText();
		return cmd;
	}
	
	public EZMojoAgentCmd createEzLIST() {
		EZMojoAgentCmd cmd = EzmojoFactory.eINSTANCE.createEZMojoAgentCmd();
		cmd.setCmd(EZCmdKind.LIST);
		cmd.setKind(EZMojoKind.COMMAND);
		return cmd;
	}
	
	public EZMojoAgentCmd createEzCLEAR() {
		EZMojoAgentCmd cmd = EzmojoFactory.eINSTANCE.createEZMojoAgentCmd();
		cmd.setCmd(EZCmdKind.CLEAR);
		cmd.setKind(EZMojoKind.COMMAND);
		return cmd;
	}
	
	public EZMojoAgentCmd createEzFEEDBACK(String streamText) {
		EZMojoAgentCmd cmd = EzmojoFactory.eINSTANCE.createEZMojoAgentCmd();
		cmd.setCmd(EZCmdKind.FEEDBACK);
		cmd.setKind(EZMojoKind.COMMAND);
		cmd.setOsc(OscCmdUtils.INSTANCE.createOscCmd("", streamText.split(" ")[1]));
		//cmd.setText();
		return cmd;
	}
	
	public EZMojoAgentCmd createEzCLOSE(String streamText) {
		EZMojoAgentCmd cmd = EzmojoFactory.eINSTANCE.createEZMojoAgentCmd();
		cmd.setCmd(EZCmdKind.CLOSE);
		cmd.setKind(EZMojoKind.COMMAND);
		//cmd.setText();
		return cmd;
	}
	
	public EZMojoAgentCmd createEzDEPLOY(String streamText) {
		EZMojoAgentCmd cmd = EzmojoFactory.eINSTANCE.createEZMojoAgentCmd();
		cmd.setCmd(EZCmdKind.DEPLOY);
		cmd.setKind(EZMojoKind.COMMAND);
		//cmd.setText();
		return cmd;
	}
	
	public EZMojoAgentCmd createEzLIST(String streamText) {
		EZMojoAgentCmd cmd = EzmojoFactory.eINSTANCE.createEZMojoAgentCmd();
		cmd.setCmd(EZCmdKind.LIST);
		cmd.setKind(EZMojoKind.COMMAND);
		//cmd.setText();
		return cmd;
	}
	
	public EzMojoInfoCmd createEzINFO(List<EZMojoNode> nodes) {
		String feedback = "";
		for (EZMojoNode node : nodes) {
			for (OSCMessage msg : EzMojoCmdUtils.INSTANCE.getOSCMessagesFromEzMojoNode(node)) {
				feedback += msg.getAddress() + "\n";
			}
		}
		return createEzINFO(feedback);
	}
	
	public EzMojoInfoCmd createEzINFO(String info) {
		EzMojoInfoCmd cmd = EzmojoFactory.eINSTANCE.createEzMojoInfoCmd();
		cmd.setText("_" + info);
		return cmd;
	}
	
	public EZMojoAgentCmd createEzWTF(String streamText) {
		EZMojoAgentCmd cmd = EzmojoFactory.eINSTANCE.createEZMojoAgentCmd();
		cmd.setCmd(EZCmdKind.WTF);
		cmd.setKind(EZMojoKind.COMMAND);
		cmd.setText(streamText);
		return cmd;
	}
	
	public EZMojoAgentCmd createEzREMOVE(String streamText) {
		EZMojoAgentCmd cmd = EzmojoFactory.eINSTANCE.createEZMojoAgentCmd();
		cmd.setCmd(EZCmdKind.REMOVE);
		cmd.setKind(EZMojoKind.COMMAND);
		cmd.setText(streamText);
		return cmd;
	}
	
	public EZMojoAgentCmd createEzRESET(String streamText) {
		EZMojoAgentCmd cmd = EzmojoFactory.eINSTANCE.createEZMojoAgentCmd();
		cmd.setCmd(EZCmdKind.RESET);
		cmd.setKind(EZMojoKind.COMMAND);
		//cmd.setText();
		return cmd;
	}
	
	public EZMojoAgentCmd createEzHELP(String streamText) {
		EZMojoAgentCmd cmd = EzmojoFactory.eINSTANCE.createEZMojoAgentCmd();
		cmd.setCmd(EZCmdKind.HELP);
		cmd.setKind(EZMojoKind.COMMAND);
		//cmd.setText();
		return cmd;
	}
	
	public EZMojoAgentCmd createEzALIAS(String streamText) {
		EZMojoAgentCmd cmd = EzmojoFactory.eINSTANCE.createEZMojoAgentCmd();
		cmd.setCmd(EZCmdKind.ALIAS);
		cmd.setKind(EZMojoKind.COMMAND);
		
		String alias = "";
		String tokens[] = streamText.split(" ");
		if (tokens.length != 3) {
			// error
		} else {
			alias = tokens[1];
			if (tokens[2] != null && tokens[2].length()>0) {
				String[] ipports = tokens[2].split(",");
				for (int i=0; i<ipports.length; i++) {
					String t = ipports[i];
					EZMojoTarget target = EzmojoFactory.eINSTANCE.createEZMojoTarget();
					target.setKind(EZMojoKind.COMMAND);
					target.setAlias(alias);
					if (t != null && t.contains(":")) {
						String[] parts = t.split(":");
						target.setAddr(parts[0]);
						target.getPorts().add(Integer.parseInt(parts[1]));
					} else {
						target.setAddr(t);
					}
					cmd.getTargets().add(target);
				}
			}
		}
		return cmd;
	}
	
	public EZMojoAgentCmd createEzPROTOCOL() {
		EZMojoAgentCmd cmd = EzmojoFactory.eINSTANCE.createEZMojoAgentCmd();
		cmd.setCmd(EZCmdKind.PROTOCOL);
		cmd.setKind(EZMojoKind.COMMAND);
		//cmd.setText();
		return cmd;
	}
	
	public EZMojoAgentCmd createEzHOOK(String transport, String addr, String protocol, String speed ) {
		if (transport != null && addr != null && speed != null && protocol != null) {
			EZMojoAgentCmd cmd = EzmojoFactory.eINSTANCE.createEZMojoAgentCmd();
			cmd.setCmd(EZCmdKind.HOOK);
			cmd.setKind(EZMojoKind.COMMAND);
			cmd.setOsc((OscCmd)OscCmdUtils.INSTANCE.createOscCmd("", "hook", transport, addr, protocol, speed));
			return cmd;
		}
		return null;
	}

	public EZMojoAgentCmd createEzHOOK(String streamText) {
		List<String> addr = (streamText.contains("#") || streamText.contains("$")) ? 
				EzMojoExprUtils.INSTANCE.parseFullEzTargetAddr(streamText.split(" ")[1]) :
					EzMojoExprUtils.INSTANCE.parseEzTargetAddr2(streamText.split(" ")[1]);
		if (addr.size() > 2) {
			EZMojoAgentCmd cmd = EzmojoFactory.eINSTANCE.createEZMojoAgentCmd();
			cmd.setCmd(EZCmdKind.HOOK);
			cmd.setKind(EZMojoKind.COMMAND);
			cmd.setOsc((OscCmd)OscCmdUtils.INSTANCE.createOscCmd("", "hook", addr.get(0), addr.get(1), addr.get(2), addr.get(3)));
			return cmd;
		}
		return null;
	}
	
	public EZMojoAgentCmd createEzUNHOOK(String streamText) {
		List<String> addr = (streamText.contains("#") || streamText.contains("$")) ? 
				EzMojoExprUtils.INSTANCE.parseFullEzTargetAddr(streamText.split(" ")[1]) :
					EzMojoExprUtils.INSTANCE.parseEzTargetAddr2(streamText.split(" ")[1]);
		if (addr.size() > 2) {
			EZMojoAgentCmd cmd = EzmojoFactory.eINSTANCE.createEZMojoAgentCmd();
			cmd.setCmd(EZCmdKind.UNHOOK);
			cmd.setKind(EZMojoKind.COMMAND);
			cmd.setOsc((OscCmd)OscCmdUtils.INSTANCE.createOscCmd("", "unhook", addr.get(0), addr.get(1), addr.get(2)));
			return cmd;
		}
		return null;
	}
	
	public EZMojoAgentCmd createEzSTATUS(String streamText) {
		return null;
	}

	public void refreshPipesFromScannedAliveAgents(EzMojoAgent agent) {
		List<XCPDevice> devices = XCPUtils.INSTANCE.getDevicesRegistry().getDevicesFromType("ezmojo");
		for (CmdPipe p : agent.getEzMojo().getEngines()) {
			for (XCPDevice d : devices) {
				boolean insert = true;
				if (p.getAddr().equals(d.getAddr().getName())) {
					for (Integer i : p.getPorts()) {
						if (d.getAddr().getPort() == i) {
							insert = false;
							break;
						}
					}
				}
				if (insert) {
					CmdPipe pipe = QuanticMojo.INSTANCE.openUdpPipe(
						"ezmojo", 
						d.getAddr().getName(), 
						d.getAddr().getPort()
					);
					pipe.setLocked(true);
					agent.getEzMojo().getEngines().add(
						pipe
					);
				}
			}
		}
	}
}
