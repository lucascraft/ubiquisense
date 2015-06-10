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

package net.sf.smbt.ui.controls;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;

public abstract class SmoothSelectionListener implements SelectionListener {
	class CmdHandlerJob extends Job {
		public CmdHandlerJob() {
			super(UUID.randomUUID().toString());
		}
		@Override
		protected IStatus run(IProgressMonitor monitor) {
			if (buffer.isEmpty()) {
				cancel();
			}
			handleBufferAccordingTogivenStrategy();
			return Status.OK_STATUS;
		}
	}
	public enum STRATEGY {
		GAUSSIAN,
		LINEAR,
		DELAYED,
		BOUNCE,
		NONE
	}
	private STRATEGY strategy;
	@SuppressWarnings("unused")
	private int factor;
	private List<Cmd> buffer;
	private CmdHandlerJob cmdHandlerJob;
	
	public SmoothSelectionListener() {
		this(STRATEGY.NONE);
	}
	
	public SmoothSelectionListener(STRATEGY strategy) {
		this(strategy, -1);
	}
	
	public SmoothSelectionListener(STRATEGY strategy, int factor) {
		this.strategy = strategy;
		this.factor = factor;
		buffer = new ArrayList<Cmd>();
		cmdHandlerJob = new CmdHandlerJob();
	}
	
	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
		cmdHandlerJob.schedule();
	}
	@Override
	public void widgetSelected(SelectionEvent e) {
		widgetDefaultSelected(e);
	}
	protected void handleBufferAccordingTogivenStrategy() {
		switch (strategy) {
			case BOUNCE:
				break;
			case DELAYED:
				break;
			case GAUSSIAN:
				break;
			case LINEAR:
				break;
			case NONE:
				doSend(getEngine(), buffer.iterator().next());
				break;
			default:
				break;
		}
	}
	abstract public CmdPipe getEngine();
	abstract public void doSend(CmdPipe engine, Cmd cmd);
}
