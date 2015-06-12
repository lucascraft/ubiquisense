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
import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

public class BlinkMPulsatileSetHSBColorCmdFeedingSimulator extends AbstractTTLCmdFeedingSimulatorJob {
    int i = 1;
    
    String[] addresses = new String[] { 
    	"0x01", 
    	"0x02", 
    	"0x03", 
    	"0x04"
    };
    
    private Boolean firstTime = true;
    
    public BlinkMPulsatileSetHSBColorCmdFeedingSimulator(long TTL) {
        this(null, TTL);
    }
    
    public BlinkMPulsatileSetHSBColorCmdFeedingSimulator(CmdPipe engine, long TTL) {
        super(engine, TTL);
    }
  
    public BlinkMPulsatileSetHSBColorCmdFeedingSimulator(CmdPipe engine) {
    	super(engine);
    }
    
    @Override
    protected IStatus run(IProgressMonitor monitor) {
    	if (firstTime) {
    		firstTime = false;
            cmdEngine.getTx().postCommand(
            	BlinkMUtil.INSTANCE.createStopScriptCmd("0x01")
            ); 
            cmdEngine.getTx().postCommand(
            	BlinkMUtil.INSTANCE.createStopScriptCmd("0x02")
            ); 
            cmdEngine.getTx().postCommand(
            	BlinkMUtil.INSTANCE.createStopScriptCmd("0x03")
            ); 
            cmdEngine.getTx().postCommand(
            	BlinkMUtil.INSTANCE.createStopScriptCmd("0x04")
            ); 
    	}
/**
    	List<HSB> red2green2redPulse = HSBUtil.INSTANCE.pulse(5, ColorUtils.INSTANCE.getRed(), ColorUtils.INSTANCE.getGreen());
    	
    	CircularIterator<HSB> forever = new CircularIterator<HSB>(red2green2redPulse);
    	while(forever.hasNext()) {
    		HSB hsb = forever.next();
    		System.err.println("HSB : " + hsb.getHue() + "," + hsb.getSaturation() + "," + hsb.getBrightness());

//	    	cmd = BlinkMUtil.INSTANCE.create(
//	    			"0x04", 
//	    			
//	    			//addresses[(i+1)%4], 
//	    	);
//	    	EngineUtil.INSTANCE.safeSendCmd(cmdEngine.getTx(), cmd); 
//	        schedule(200);
    	}**/
        return Status.OK_STATUS;
    }
}
