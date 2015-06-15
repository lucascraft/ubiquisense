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

package net.sf.smbt.osc.tuio.utils;

import net.sf.reactivision.tuio.TuioContainer;
import net.sf.reactivision.tuio.TuioCursor;
import net.sf.reactivision.tuio.TuioObject;
import net.sf.smbt.osc.eztuio.EztuioPackage;
import net.sf.smbt.osc.eztuio.Tuio2DCur;
import net.sf.smbt.osc.eztuio.Tuio2DObj;
import net.sf.smbt.osc.eztuio.TuioBundle;
import net.sf.smbt.osc.eztuio2.Tuio2B3D;
import net.sf.smbt.osccmd.OscRcvCmd;
import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

import com.illposed.osc.OSCMessage;
import com.illposed.osc.OSCPacket;

/**
 * Translate osc messages to valuated {@link OscRcvCmd} instances.
 * 
 * @author lucas
 *
 */
public class Tuio20CmdUtils {
	/** SINGLETON */
	public final static Tuio20CmdUtils INSTANCE = new Tuio20CmdUtils();
	
	/**
	 * Creates and return a new {@link EztuioPackage} command coming from a given {@link TuioContainer} reference.
	 * 
	 * @param tuio either a {@link TuioObject} or a {@link TuioCursor} object
	 * @param literal a literal corresponding to the Tuio cmd exact {@link EClass} to be created and filled
	 * 
	 * @return newly created Tuio 1.1 command according to {@link EztuioPackage} definitions
	 */
	public Cmd createTuio20CmdFromEClassifierMsg(TuioContainer tuio, EClassifier literal, OSCMessage msg) {
		return null;
	}
	
	/**
	 * Dump of a Tuio2D command as its byte[] form.
	 * 
	 * @param cmd {@link Tuio2DCur} or {@link Tuio2DObj} command to dump as byte[]
	 * 
	 * @return a byte[] form of the {@link Tuio2DCur} or {@link Tuio2DObj} command 
	 */
	public byte[] dumpTuio20CmdFromEClassifierMsg(Cmd cmd) {
		if (cmd instanceof TuioBundle) {
			OSCPacket packet = createOSCPacketFromCmd(cmd);
			return packet == null ? new byte[0] : packet.getByteArray();
		} else if (cmd instanceof Tuio2B3D) {
			return ((Tuio2B3D)cmd).getMsg().getByteArray();
		}
		return new byte[0];
	}
	
	public OSCPacket createOSCPacketFromCmd(Cmd cmd) {
		return null;
	}

}
