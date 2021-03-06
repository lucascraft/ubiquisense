/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2011 - 2012, Lucas Bigeardel
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

import java.util.HashMap;
import java.util.UUID;

import net.sf.smbt.comm.script.netConf.TRANSPORT_PROTOCOL;
import net.sf.smbt.ezmojo.EZMojoKind;
import net.sf.smbt.ezmojo.EZMojoTarget;
import net.sf.smbt.ezmojo.EzmojoFactory;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.xqz.model.engine.CmdPipe;

public class EZMojoTargetUtils {

	public final static EZMojoTargetUtils INSTANCE = new EZMojoTargetUtils();
	
	public EZMojoTarget createEzTarget(CmdPipe pipe, EZMojoKind kind) {
		EZMojoTarget target = EzmojoFactory.eINSTANCE.createEZMojoTarget();
		target.setAddr(pipe.getAddr());
		target.setProtocolID(pipe.getCommunicationProtocol());
		target.setTransportID(TRANSPORT_PROTOCOL.get(pipe.getTransportProtocol()).getLiteral());
		target.getPorts().addAll(pipe.getPorts());
		target.setKind(kind);
		target.setSpeed(pipe.getSpeed());
		return target;
	}
	
	
	public CmdPipe getCmdPipe(EZMojoTarget target, boolean createIfMissing) {
		CmdPipe pipe = null;
		try {
			int[] ports = new int[0];
			if (!target.getPorts().isEmpty()) {
				ports = new int[target.getPorts().size()];
				int i = 0;
				for (Integer p : target.getPorts()) {
					ports[i] = p.intValue();
					i++;
				}
			}
			pipe = QuanticMojo.INSTANCE.getPipe(
					target.getTransportID(), 
					target.getProtocolID(), 
					target.getAddr(), 
					ports,
					target.getSpeed()
				);
			if (createIfMissing && pipe == null) {
				pipe = QuanticMojo.INSTANCE.openPipe(
					target.getTransportID(), 
					target.getProtocolID(), 
					UUID.randomUUID().toString(), 
					target.getAddr(), 
					ports, 
					target.getSpeed(),
					new HashMap<Object, Object>()
				);
			} 
		} catch (Throwable t) {
			t.printStackTrace();
		}
		return pipe;
	}
	
}
