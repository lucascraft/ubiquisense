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

package net.sf.smbt.midi.providers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.smbt.midi.ezmidi.EzmidiPackage;
import net.sf.xqz.engine.ext.service.AbstractCmdSetProvider;

import org.eclipse.emf.ecore.EClassifier;

public class MidiCmdSetProvider extends AbstractCmdSetProvider {
	public MidiCmdSetProvider() {
	}
	@Override
	public String getPartNumber() {
		return "N/A";
	} 
	@Override
	public String getProtocol() {
		return "Midi";
	}
	@Override
	public String getVendor() {
		return "Midi";
	}
	@Override
	public String getVersionNumber() {
		return "2.0";
	}
	@Override
	public String getUri() {
		return EzmidiPackage.eNS_URI;
	}
	
	@Override
	public Map<String, List<EClassifier>> getCommandSets() {
		Map<String, List<EClassifier>> commandSets = new HashMap<String, List<EClassifier>>();
		
		commandSets.put(
			"Midi Common Commands", 
			Arrays.asList(
				new EClassifier[] {
					EzmidiPackage.Literals.ACTIVE_SENSING,
					EzmidiPackage.Literals.CHANNEL_PRESSURE,
					EzmidiPackage.Literals.CONTINUE_SONG,
					EzmidiPackage.Literals.CONTROLLER_CHANGE,
					EzmidiPackage.Literals.DSL_MIDI_MESSAGE,
					EzmidiPackage.Literals.END_OF_EXCLUSIVE,
					EzmidiPackage.Literals.KEY_PRESSURE,
					EzmidiPackage.Literals.MIDI_TIME_CODE,
					EzmidiPackage.Literals.NOTE_OFF,
					EzmidiPackage.Literals.NOTE_ON,
					EzmidiPackage.Literals.PITCH_BEND,
					EzmidiPackage.Literals.POLY_PRESSURE,
					EzmidiPackage.Literals.PROGRAM_CHANGE,
					EzmidiPackage.Literals.SONG_POSITION,
					EzmidiPackage.Literals.SONG_SELECT,
					EzmidiPackage.Literals.START_SONG,
					EzmidiPackage.Literals.STOP_SONG,
				}
			)
		);
		commandSets.put(
			"Midi Sysex Commands", 
			Arrays.asList(
				new EClassifier[] {
					EzmidiPackage.Literals.SYSEX_GS_RESET,
					EzmidiPackage.Literals.SYSEX_MESSAGE,
					EzmidiPackage.Literals.SYSEX_PATCH_CHANGED
				}
			)
		);
		
		return commandSets;
	}
}
