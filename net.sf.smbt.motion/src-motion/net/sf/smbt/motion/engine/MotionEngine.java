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

package net.sf.smbt.motion.engine;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import net.sf.smbt.ezmotion.Motion;
import net.sf.smbt.ezmotion.MotionValue;
import net.sf.xqz.engine.utils.AbstractTTLJob;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

/**
 * Describe nuts and bolts of the motion engine.
 * 
 * @author Lucas Bigeardel
 *
 */
public class MotionEngine extends AbstractTTLJob implements IMotionEngine {
	private List<Motion> motionsList;
	private long speed;
	private volatile List<IMotionReceiver> motionReceivers;
	
	public MotionEngine(long speed, Motion... motions) {
		super("MotionEngine_" + UUID.randomUUID());
		this.motionsList = new ArrayList<Motion>();
		for (Motion m : motions) {
			this.motionsList.add(m);
		}
		this.speed = speed;
		motionReceivers = new ArrayList<IMotionReceiver>();
		init();
	}
	
	public List<Motion> getMotions() {
		return motionsList;
	}
	
	@Override
	public void init() {
	}
	
	@Override
	public void tick() {
		long time = System.currentTimeMillis();
		for (Motion m : motionsList) {
			m.setTime(time);
		}
		
		MotionValue value = Motion3DUtils.INSTANCE.computeInstantMotionValue(motionsList.toArray(new Motion[0]));
		for (IMotionReceiver receiver : getMotionReceiver()) {
			receiver.getKicked(
				-1, 
				-1,
				-1, 
				-1, 
				value, 
				time
			);
		}
	}
	@Override
	public void start() {
	}
	@Override
	public void stop() {
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
//		Float freq = new Float((1f/motion.getFrequency())*1000f);
//		schedule(freq.longValue());
		if (speed<0) {
			schedule();
		} else {
			schedule(speed);
		}
		tick();
		return Status.OK_STATUS;
	}

	@Override
	public List<IMotionReceiver> getMotionReceiver() {
		return motionReceivers;
	}
	
	@Override
	public synchronized void registerMotionReceiver(IMotionReceiver motionReceiver) {
		motionReceivers.add(motionReceiver);
	}

	@Override
	public synchronized void unregisterMotionReceiver(IMotionReceiver motionReceiver) {
		motionReceivers.remove(motionReceiver);
	}

	@Override
	public void addMotion(Motion motion) {
		getMotions().add(motion);
	}

	@Override
	public void addMotions(Motion... motions) {
		for (Motion m : motions) {
			getMotions().add(m);
		}
	}

	@Override
	public void removeMotion(Motion motion) {
		getMotions().remove(motion);
	}

	@Override
	public void removeMotions(Motion... motions) {
		for (Motion m : motions) {
			getMotions().remove(m);
		}
	}

	@Override
	public void clearMotions() {
		getMotions().clear();
	}
}
