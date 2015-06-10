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

import java.util.ArrayList;
import java.util.List;

import net.sf.smbt.comm.extensions.protocol.ProtocolReactor;
import net.sf.smbt.comm.extensions.protocol.ProtocolWithSpecificTransportConfig;
import net.sf.smbt.comm.script.netConf.TRANSPORT_PROTOCOL;
import net.sf.smbt.ezmojo.EZMojoTarget;
import net.sf.smbt.ezmojo.EzmojoFactory;
import net.sf.smbt.ezmotion.Motion;

import com.illposed.osc.OSCMessage;

public class EzMojoExprUtils {
	public final static EzMojoExprUtils INSTANCE = new EzMojoExprUtils();
	public String dumpOSCMessage(OSCMessage message) {
		return message.toString();
	}
	
	/*
	public List<EzMojoTopologyNode> parseNetConfig(String[] addrTokens) {
		List<EzMojoTopologyNode> nodes = new ArrayList<EzMojoTopologyNode>();
		
		for (String ipTok : addrTokens) {
			String[] tokens = ipTok.split(":");
			if (tokens.length>1) {
				if(tokens[1].contains(",")) {
					String[] ports = tokens[1].split(",");
					int[] portsNumbers = new int[ports.length];
					int i = 0;
					for (String p : ports) {
						portsNumbers[i] = Integer.valueOf(p);
						i++;
					}
					nodes.add(
						new EzMojoTopologyNode(tokens[0], portsNumbers)
					);
				} else {
					nodes.add(
						new EzMojoTopologyNode(tokens[0], Integer.valueOf(tokens[1]))
					);
				}
			}
		}
		
		return nodes;
	}
	*/	
	
	public String getTextualValue(Object objVal) {
		if (objVal instanceof String) {
			return (String) objVal;
		} else if (objVal instanceof Long) {
			return Long.toString((Long)objVal);
		} else if (objVal instanceof Integer) {
			return Integer.toString((Integer)objVal);
		} else if (objVal instanceof Float) {
			return Float.toString((Float)objVal);
		} else if (objVal instanceof Boolean) {
			return Boolean.toString((Boolean)objVal);
		} else if (objVal instanceof Byte) {
			return Byte.toString((Byte)objVal);
		}
		return objVal == null ? "N/A" : objVal.toString();
	}
	
	public List<String> computeComplexKinematicExprFromMotionSelection(Object[] motions) {
		List<String> expressions = new ArrayList<String>();
				
		for (Object o : motions) {
			if (o instanceof Motion) {
				Motion m = (Motion) o;
				expressions.add(
					"i:" + m.getAxis().getValue() + " " +
					"i:" + m.getKind().getValue() + " " +
					"f:" + m.getFrequency() + " " +
					"i:" + m.getSampleRate() + " " +
					"f:" + m.getAmplitude() + " " +
					"i:" + m.getCinematic().getValue()
				);
			}
		}
		
		return expressions;
	}
	
	public OSCMessage parseOSCMessage(String msg) {
		String addr = msg.contains(" ")?msg.substring(0, msg.indexOf(" ")).trim():msg;
		String[] args = msg.contains(" ")?msg.substring(msg.indexOf(" "), msg.length()).trim().split(" "):new String[0];
		Object[] nargs = new Object[args.length];
		int i = 0;
		for (String arg : args) {
			arg = arg.trim();
			String val = arg.substring(2, arg.length());
			if (arg.startsWith("f:")) {
				nargs[i] = Float.valueOf(val);
			} else if (arg.startsWith("i:")) {
				nargs[i] = Integer.valueOf(val);
			} else if (arg.startsWith("l:")) {
				nargs[i] = Long.valueOf(val);
			} else if (arg.startsWith("b:")) {
				nargs[i] = Boolean.valueOf(val);
			}  else if (arg.startsWith("s:")) {
				nargs[i] = val;
			}
			i++;
		}
		
		return new OSCMessage(addr, nargs);
	}
	
	public List<String> parseEzTargetAddr2(String addr) {
		/*
		addr = addr.trim();
		TRANSPORT_PROTOCOL mode = null;
		if (addr.startsWith(TRANSPORT_PROTOCOL.UDP.getLiteral())) {
			mode = TRANSPORT_PROTOCOL.UDP;
		} else if (addr.startsWith(TRANSPORT_PROTOCOL.TCP.getLiteral())) {
			mode = TRANSPORT_PROTOCOL.TCP;
		} else if (addr.startsWith(TRANSPORT_PROTOCOL.USB.getLiteral())) {
			mode = TRANSPORT_PROTOCOL.USB;
		} else if (addr.startsWith(TRANSPORT_PROTOCOL.XBEE.getLiteral())) {
			mode = TRANSPORT_PROTOCOL.XBEE;
		} else if (addr.startsWith(TRANSPORT_PROTOCOL.BLUETOOTH.getLiteral())) {
			mode = TRANSPORT_PROTOCOL.BLUETOOTH;
		} 
		if (mode != null) {
			addr = addr.substring(mode.getLiteral().length()-1);
		} else {
			mode = TRANSPORT_PROTOCOL.UDP;
			System.out.println("Set default transport to " + mode.getLiteral() + " for target while protocol not defined");
		}
		
		EZMojoTarget target = EzmojoFactory.eINSTANCE.createEZMojoTarget();
		target.setTransport(mode);
		*/
		
		List<String> addrTokens = new ArrayList<String>();
		
		EZMojoTarget target = parseEzTargetAddr3(addr);
		
		addrTokens.add(target.getTransportID());
		addrTokens.add(target.getAddr());
		addrTokens.add(target.getProtocolID());
		/*
		if (target.getPorts().size() > 0) {
			addrTokens.add(""+target.getPorts().get(0));
		} else {
			addrTokens.add("");
		}
		*/
		if (target.getSpeed() > 0) {
			addrTokens.add(""+target.getSpeed());
		} else {
			addrTokens.add("-1");
		}
		
		
		return addrTokens;
	}

	
	public EZMojoTarget parseEzTargetAddr(String addr) {
		if (addr == null || addr.equals("")) {
			return null;
		}
		String _addr = new String(addr);
		
		EZMojoTarget target = EzmojoFactory.eINSTANCE.createEZMojoTarget();

		target.setTransportID(TRANSPORT_PROTOCOL.UDP.getLiteral());
		for (TRANSPORT_PROTOCOL transport : TRANSPORT_PROTOCOL.VALUES) {
			if (_addr.startsWith(transport.getLiteral())) {
				_addr = _addr.substring(transport.getLiteral().length());
				target.setTransportID(transport.getLiteral());
			}
		}
		
		String protocol = "osc";
		
		if (_addr.contains("$")) {
			String alias = protocol = _addr.substring(_addr.indexOf("$"));
			ProtocolWithSpecificTransportConfig p = ProtocolReactor.INSTANCE.getProtocolsWithSpecificTransportMap(alias);
			if (p != null) {
				protocol = p.getID();
			}
			addr = _addr.substring(0, _addr.indexOf("$"));
		}
		target.setProtocolID(protocol);
		

		List<Integer> ports = new ArrayList<Integer>();
		if (_addr.contains(":")) {
			String tk[] = _addr.split(":");
			
			String p[] = _addr.substring(_addr.indexOf(":")+1).split(",");
			if (p != null && p.length>0) {
				for (String port : p) {
					ports.add(Integer.parseInt(port.trim()));
				}
			}
			target.setAddr(tk[0]==null?"":tk[0]);
			target.getPorts().addAll(ports);
		} else {
			try {
				int port = Integer.parseInt(_addr);
				target.setAddr("");
				target.getPorts().add(port);
				return target;
			} catch (Exception e) {
				// TODO: handle exception
			}
			target.setAddr(_addr);
		}
		String speed = "-1";
		if (_addr.contains("@")) {
			speed = _addr.substring(_addr.indexOf("@"));
			_addr = _addr.substring(0, _addr.indexOf("@"));
		}
		target.setSpeed(Integer.parseInt(speed));
		return target;
	}

	public EZMojoTarget parseEzTargetAddr3(String addr) {
		if (addr == null || addr.equals("")) {
			return null;
		}
		String _addr = new String(addr);
		
		EZMojoTarget target = EzmojoFactory.eINSTANCE.createEZMojoTarget();

		target.setTransportID(TRANSPORT_PROTOCOL.UDP.getLiteral());
		for (TRANSPORT_PROTOCOL transport : TRANSPORT_PROTOCOL.VALUES) {
			if (_addr.startsWith(transport.getLiteral())) {
				_addr = _addr.substring(transport.getLiteral().length());
				target.setTransportID(transport.getLiteral());
			}
		}
		
		String protocol = "osc";
		
		if (_addr.contains("<") && _addr.contains(">")) {
			addr = _addr.substring(0, _addr.indexOf("<"));
			String alias = _addr.substring(_addr.indexOf("<")+1);
			alias = alias.substring(0, alias.indexOf(">"));
			ProtocolWithSpecificTransportConfig p = ProtocolReactor.INSTANCE.getProtocolsWithSpecificTransportMap(alias);
			if (p != null) {
				protocol = p.getID();
			}
			//_addr = addr;
		}
		target.setProtocolID(protocol);
		List<Integer> ports = new ArrayList<Integer>();

		if (_addr.contains("<")) {
			_addr = _addr.substring(0, _addr.indexOf("<"));
			target.setAddr(_addr);
		} 

			if (_addr.startsWith(":") ) {
				
				String p[] = _addr.substring(_addr.indexOf(":")+1).split(",");
				if (p != null && p.length>0) {
					for (String port : p) {
						ports.add(Integer.parseInt(port.trim()));
					}
				}
				target.setAddr("localhost");
				target.getPorts().addAll(ports);
			} else {
				try {
					int port = Integer.parseInt(_addr);
					target.setAddr("");
					target.getPorts().add(port);
					return target;
				} catch (Exception e) {
					// TODO: handle exception
				}
				target.setAddr(_addr);
			}
		
		String speed = "-1";
		if (_addr.contains("@")) {
			speed = _addr.substring(_addr.indexOf("@"));
			_addr = _addr.substring(0, _addr.indexOf("@"));
		}
		target.setSpeed(Integer.parseInt(speed));
		return target;
	}
	
	public List<String> parseFullEzTargetAddr(String _addr) {
		String addr = new String(_addr);
		
		List<String> lst = new ArrayList<String>();
		
		// if just a single port as input : udp://9001@osc
		try {
			Integer.parseInt(_addr);
			_addr = ":" + _addr;
		} catch (Exception e) {
			//
		}
		
		// udp://192.3.34.65:456
		// tcp://localhost
		// usb:///dev/tty.USB-A650to03@dmx
		
		String proto = "osc";
		
		if (addr.contains("#")) {
			//
			// udp:// is default
			//
			String tk = addr.substring(addr.indexOf("#")+1);
			
			proto = (tk == null ? proto : tk);
		}
		
		
		String transport = TRANSPORT_PROTOCOL.UDP.getLiteral();
		if (addr.contains("$")) {
			if (addr.contains("#")) {
				transport = addr.substring(addr.indexOf("$")+1, addr.indexOf("#"));
			} else {
				transport = addr.substring(addr.indexOf("$")+1);
				boolean valid = false;
				for (TRANSPORT_PROTOCOL tp : TRANSPORT_PROTOCOL.VALUES) {
					if (transport.equals(tp.getLiteral())) {
						valid = true;
					}
				}
				if (!valid) {
					for (TRANSPORT_PROTOCOL tp : TRANSPORT_PROTOCOL.VALUES) {
						if (addr.startsWith(tp.getLiteral())) {
							transport = tp.getLiteral();
							addr = addr.substring(transport.length());
							proto = addr.substring(addr.indexOf("$"));
							break;
						}
					}
				}
			}
			addr = addr.substring(0, addr.indexOf("$"));
		}
		
		String speed = "-1";
		if (addr.contains("@")) {
			speed = addr.substring(addr.indexOf("@"));
			addr = addr.substring(0, addr.indexOf("@"));
		}
		
		lst.add(transport);
		lst.add(addr);
		lst.add(proto);		
		lst.add(speed);
		
		return lst;
	}
}
