/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2011, Lucas Bigeardel
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

package net.sf.smbt.comm.bluetooth.io;

import java.io.IOException;

import javax.bluetooth.L2CAPConnection;

import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

public class L2CAPInputJob extends Job {
	private L2CAPConnection incoming;
	private CmdPipe btPipe;
	private String portId;
	
	public L2CAPInputJob(CmdPipe pipe, L2CAPConnection connection, String btAddr) throws IOException, InterruptedException {
		super("bt input " + btAddr);
		setPriority(INTERACTIVE);
		setSystem(true);
		incoming	= connection;
		btPipe		= pipe;
		portId = btAddr;
	}
	
	public String getPortId() {
		return portId;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		try {
			if (incoming != null) {
				byte[] buf = new byte[incoming.getReceiveMTU()];
				if (buf !=null && buf.length>0) {
					incoming.receive(buf);		// L2CAP chunk receive
					if (btPipe != null) {
						btPipe.receive(buf);	// UBQT processing for the newly received frame
					}
				}
			}
		} catch (IOException ex) {
			ex.printStackTrace();
			done(ASYNC_FINISH);
		}
		schedule();
		return Status.OK_STATUS;
	}

}
