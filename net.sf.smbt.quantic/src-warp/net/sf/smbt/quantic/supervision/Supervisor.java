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

package net.sf.smbt.quantic.supervision;

import net.sf.smbt.comm.ezxtopology.AbstractTopologyItem;
import net.sf.smbt.comm.ezxtopology.EzxtopologyFactory;
import net.sf.smbt.comm.ezxtopology.TopologyCache;
import net.sf.smbt.comm.ezxtopology.TopologyNode;
import net.sf.smbt.xcp.XCPDevice;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

public class Supervisor extends Job implements IXCPDeviceLifecycleListener {
	private TopologyCache cache;
	public Supervisor(TopologyCache cache) {
		super("WARP HUB SUPERVISOR"); // silly ?
		this.cache = cache;
	}
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		//checkToplogy();
		//schedule(9000); // every 9 sec	
		return Status.OK_STATUS;
	}
	
	@Override
	public void onDeviceAdd(XCPDevice device, long time) {
		boolean absent = true;
		for (AbstractTopologyItem node : cache.getNodes()) {
			if (node instanceof TopologyNode) {
				XCPDevice nodeDevice = ((TopologyNode)node).getDevice();
				if (nodeDevice instanceof XCPDevice) {
					if (nodeDevice.getAddr().equals(device.getAddr())) {
						absent = false;
					} else {
						// Exists or conflict !!!
					}
				}
			}
		}
		
		if (absent) {
			TopologyNode node = EzxtopologyFactory.eINSTANCE.createTopologyNode();
			node.setDevice(device);
			cache.getNodes().add(node);
		} else {
			// check + update + reconcilliation if needed ?
		}
	}
	
	@Override
	public void onDeviceRemove(XCPDevice device, long time) {
		
	}
	
	@Override
	public void onDeviceUpdate(XCPDevice device, long time) {
		
	}
	
	/**
	 * this class has responsability to check Device/configuration status and to
	 * behave accordingly to its supervision role.
	 * 
	 * It can disable/enable/renew/remove/suspend/create connections
	 * 
	 * It can trigger a reconciliation or other scan if necessary on a device 
	 * or a group of devices.
	 */
	void checkToplogy() {
	//	for (ServiceInfo info : DnsSdUtil.INSTANCE.getJmDns().list("_ezmojo._udp.local.")) {
	//		if (info instanceof ServiceInfo) {
				//DnsSdUtil.INSTANCE.checkForDistantPipes(info);
	//		}
	//	}

		//QuanticMojo.INSTANCE.
		//FIXME : LB to handle that in a cleve way
	}
}
