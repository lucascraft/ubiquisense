/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2012, Lucas Bigeardel
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

package net.sf.smbt.ui.hmi;

import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class MidiContentProvider implements ITreeContentProvider {
	@Override
	public Object[] getChildren(Object parentElement) {
		return new Object[0];
	}
	
	public List<MidiDevice> getMidiDevices() {
		List<MidiDevice> devices = new ArrayList<MidiDevice>();

		for (MidiDevice.Info info : MidiSystem.getMidiDeviceInfo()) {
			String txt = 
				"Description : "	+ info.getDescription()		+ "\n" +
				"Vendor : "			+ info.getVendor()			+ "\n" +
				"Version : "		+ info.getVersion();
			
			if (Platform.inDebugMode()) {
				System.out.println("Device : " + info.getName()		+ "\n" + txt + "\n");
			}
			
			try {
				MidiDevice device = MidiSystem.getMidiDevice(info);
				if (!devices.contains(device)) {
					devices.add(device);
				}
			} catch (MidiUnavailableException e) {
				e.printStackTrace();
			}
		}

		return devices;
	}
	

	
	@Override
	public Object[] getElements(Object inputElement) {
		List<MidiDevice> devices = new ArrayList<MidiDevice>();
		for (MidiDevice device :  getMidiDevices()) {
    		boolean outDevice	= device.getMaxReceivers() >=0 && device.getMaxTransmitters() == -1;
    		if (outDevice) {
    			devices.add(device);
    		}
    		boolean inDevice	= device.getMaxTransmitters() >=0 && device.getMaxReceivers() == -1;
    		if (inDevice) {
    			devices.add(device);
    		}
		}
		return devices.toArray();
	}

	@Override
	public Object getParent(Object element) {
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		return false;
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		
	} 

	@Override
	public void dispose() {
		
	};
}
