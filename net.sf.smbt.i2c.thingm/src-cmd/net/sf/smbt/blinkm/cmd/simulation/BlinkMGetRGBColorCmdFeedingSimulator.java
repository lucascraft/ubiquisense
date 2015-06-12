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

package net.sf.smbt.blinkm.cmd.simulation;

import net.sf.smbt.blinkm.cmd.injection.BlinkMUtil;
import net.sf.xqz.engine.utils.AbstractTTLCmdFeedingSimulatorJob;
import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

public class BlinkMGetRGBColorCmdFeedingSimulator extends AbstractTTLCmdFeedingSimulatorJob {
    public BlinkMGetRGBColorCmdFeedingSimulator(long TTL) {
        super(TTL);
    }
    
    @Override
    protected IStatus run(IProgressMonitor monitor) {
    	Cmd cmd = BlinkMUtil.INSTANCE.createGetCurrentRGBColorCmd(
    		"0x01"
    	);
    	
    	cmdEngine.getTx().postCommand(cmd); 
         
 /*     
		if (Platform.inDebugMode()) {
            System.out.println("Simulated Cmd " + CmdUtil.INSTANCE.getCmdInfo(cmd) + " on " + cmdEngine.getTx().toString());
        }
 */       
    	schedule(500);
        return Status.OK_STATUS;
    }
}
