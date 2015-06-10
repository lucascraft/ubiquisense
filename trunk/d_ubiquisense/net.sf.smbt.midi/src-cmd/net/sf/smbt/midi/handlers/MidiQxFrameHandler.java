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

package net.sf.smbt.midi.handlers;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.ShortMessage;

import net.sf.smbt.midi.ezmidi.DSLMidiMessage;
import net.sf.smbt.midi.utils.MidiCmdUtils;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.engine.impl.AbstractFrameInterpreterImpl;

/**
 * Transforms an incoming byte[]�stream into its MDD Midi representation
 * 
 * @author lucas
 *
 */
public class MidiQxFrameHandler extends AbstractFrameInterpreterImpl {
	private ShortMessage message;
	public MidiQxFrameHandler() {
		message = new ShortMessage();
	}
	@Override
	public synchronized Cmd byteArray2Cmd(final byte[] stream) {
		if (stream != null && stream.length>0) {
			try {
				if ( stream != null) {
					if (stream.length==3) {
						return MidiCmdUtils.INSTANCE.createMidiMessage(
							(int)stream[0], 
							stream[1], 
							stream[2]
						);
					} else if(stream.length>3) {
						message.setMessage(new Byte(stream[0]).intValue(), new Byte(stream[2]).intValue(), new Byte(stream[3]).intValue());
						DSLMidiMessage msg = MidiCmdUtils.INSTANCE.createMidiMessage(message);
						return msg;
					} else {
					}
				}
			} catch (InvalidMidiDataException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}
