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

package net.sf.smbt.motion.tests;

import junit.framework.TestCase;
import net.sf.smbt.ezmotion.EzmotionFactory;
import net.sf.smbt.ezmotion.Motion;
import net.sf.smbt.ezmotion.MotionCinematic;
import net.sf.smbt.ezmotion.MotionKind;
import net.sf.smbt.ezmotion.MotionValue;
import net.sf.smbt.motion.engine.IMotionReceiver;
import net.sf.smbt.motion.engine.MotionEngine;

import org.eclipse.core.runtime.IStatus;

public class SimpleWavesTestCase extends TestCase {

	public SimpleWavesTestCase() {
	}
	
	public void testSqrWave1() {
		Motion motion = EzmotionFactory.eINSTANCE.createMotion();
		motion.setAmplitude(10);
		motion.setCinematic(MotionCinematic.SQR);
		motion.setFrequency(2f);
		motion.setKind(MotionKind.CYCLIC);
		motion.setSampleRate(5);
		
		MotionEngine motionEngine = new MotionEngine(300, motion);
		
		motionEngine.getMotionReceiver().add(
			new IMotionReceiver() {
				@Override
				public IStatus getKicked(int step, int min, int max, int incr, MotionValue val, long time) {
					System.out.println(val.getX() + ", " + val.getY() + ", " + val.getZ());
					return org.eclipse.core.runtime.Status.OK_STATUS;
				}
			}
		);
		motionEngine.schedule(5000);
		
		while (motionEngine.isRunning());
	}
	
	public void testSinWave1() {
		Motion motion = EzmotionFactory.eINSTANCE.createMotion();
		motion.setAmplitude(10);
		motion.setCinematic(MotionCinematic.SIN);
		motion.setFrequency(2f);
		motion.setKind(MotionKind.CYCLIC);
		motion.setSampleRate(5);
		
		MotionEngine motionEngine = new MotionEngine(300, motion);
		
		motionEngine.getMotionReceiver().add(
			new IMotionReceiver() {
				@Override
				public IStatus getKicked(int step, int min, int max, int incr, MotionValue val,
						long time) {
					System.out.println(val);
					return org.eclipse.core.runtime.Status.OK_STATUS;
				}
			}
		);
		motionEngine.schedule(5000);
		
		while (motionEngine.isRunning());
	}
	
	public void testTriWave1() {
		Motion motion = EzmotionFactory.eINSTANCE.createMotion();
		motion.setAmplitude(10);
		motion.setCinematic(MotionCinematic.TRI);
		motion.setFrequency(2f);
		motion.setKind(MotionKind.CYCLIC);
		motion.setSampleRate(5);
		
		MotionEngine motionEngine = new MotionEngine(300, motion);
		
		motionEngine.getMotionReceiver().add(
			new IMotionReceiver() {
				@Override
				public IStatus getKicked(int step, int min, int max, int incr, MotionValue val, long time) {
					System.out.println(val.getX() + ", " + val.getY() + ", " + val.getZ());
					return org.eclipse.core.runtime.Status.OK_STATUS;
				}
			}
		);
		motionEngine.schedule(5000);
		
		while (motionEngine.isRunning());
	}
	
	public void testSawWave1() {
		Motion motion = EzmotionFactory.eINSTANCE.createMotion();
		motion.setAmplitude(10);
		motion.setCinematic(MotionCinematic.SAW);
		motion.setFrequency(2f);
		motion.setKind(MotionKind.CYCLIC);
		motion.setSampleRate(5);
		
		MotionEngine motionEngine = new MotionEngine(300, motion);
		
		motionEngine.getMotionReceiver().add(
			new IMotionReceiver() {
				@Override
				public IStatus getKicked(int step, int min, int max, int incr, MotionValue val,
						long time) {
					System.out.println(val.getX() + ", " + val.getY() + ", " + val.getZ());
					return org.eclipse.core.runtime.Status.OK_STATUS;
				}
			}
		);
		motionEngine.schedule(5000);
		
		while (motionEngine.isRunning());
	}
	
}
