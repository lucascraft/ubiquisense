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

import java.util.Random;
import java.util.UUID;

import net.sf.smbt.blinkm.cmd.injection.BlinkMUtil;
import net.sf.xqz.engine.cmd.utils.CmdUtil;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.Qx;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

public class QxBlinkMEmmiterSimulator extends Job {
    private CmdPipe cmdEngine;
    private Random randomizer;
    
    public QxBlinkMEmmiterSimulator(CmdPipe engine) {
        super(UUID.randomUUID().toString());
        cmdEngine = engine;
        randomizer = new Random();
    }
    @Override
    protected IStatus run(IProgressMonitor monitor) {
        long someLong = randomizer.nextInt(500);
        Qx qx = someLong % 2 == 0 ? cmdEngine.getTx() : cmdEngine.getRx();
        Cmd cmd = BlinkMUtil.INSTANCE.generateRamdomBlinkMCmd();
        qx.postCommand(cmd); 
        if (Platform.inDebugMode()) {
        	System.out.println("Simulated Cmd " + CmdUtil.INSTANCE.getCmdInfo(cmd) + " on " + qx.toString());
        }
        schedule(someLong);
        return Status.OK_STATUS;
    }
}
