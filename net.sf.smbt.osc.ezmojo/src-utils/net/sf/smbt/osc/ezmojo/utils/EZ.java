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
import net.sf.smbt.ezmojo.EZMojoNode;
import net.sf.smbt.ezmojo.EZMojoTarget;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.xqz.model.engine.CmdPipe;

public class EZ {

	public final static EZ INSTANCE = new EZ();
	
	public CmdPipe getCmdPipe(EZMojoTarget target) {
		return QuanticMojo.INSTANCE.getPipe2(
			target.getTransportID(), 
			target.getProtocolID(), 
			target.getAddr(), 
			target.getPorts(),
			target.getSpeed()
		);
	}
	
	public List<CmdPipe> getCompatibleCmdPipe(EZMojoNode node, String proto) {
		List<CmdPipe> pipes = new ArrayList<CmdPipe>(); 
		for (EZMojoTarget t : node.getForwards()) {
			String ID = t.getProtocolID();
			String alias = t.getAlias();
			boolean isCompatible = false;
			if (ID != null) {
				if (ID.equals(proto)) {
					isCompatible = true;
				} else if (alias!=null) {
					isCompatible = alias.equals(proto);
				} else {
					ProtocolWithSpecificTransportConfig cfg = ProtocolReactor.INSTANCE.getProtocolsWithSpecificTransportMap(ID);
					if (cfg != null && cfg.getAlias() != null) {
						if (cfg.getAlias().equalsIgnoreCase(proto)) {
							isCompatible = true;
						}
					}
				}
			}
			
			if (isCompatible) {
				CmdPipe p = QuanticMojo.INSTANCE.getPipe2(
					t.getTransportID(), 
					t.getProtocolID(), 
					t.getAddr(), 
					t.getPorts(),
					t.getSpeed()
				);
				if (!pipes.contains(p)) {
					pipes.add(p);
				}
			}
		}
		for (EZMojoTarget t : node.getListeners()) {
			String ID = t.getProtocolID();
			String alias = t.getAlias();
			boolean isCompatible = false;
			if (ID != null) {
				if (ID.equals(proto)) {
					isCompatible = true;
				}  else if (alias.equals(proto)){
					isCompatible = true;
				} else {
					ProtocolWithSpecificTransportConfig cfg = ProtocolReactor.INSTANCE.getProtocolsWithSpecificTransportMap(ID);
					if (cfg != null && cfg.getAlias() != null) {
						if (cfg.getAlias().equalsIgnoreCase(proto)) {
							isCompatible = true;
						}
					}
				}
			}
			
			if (isCompatible) {
				CmdPipe p = QuanticMojo.INSTANCE.getPipe2(
					t.getTransportID(), 
					t.getProtocolID(), 
					t.getAddr(), 
					t.getPorts(),
					t.getSpeed()
				);
				if (!pipes.contains(p)) {
					pipes.add(p);
				}
			}
		}
		return pipes;
	}
}
