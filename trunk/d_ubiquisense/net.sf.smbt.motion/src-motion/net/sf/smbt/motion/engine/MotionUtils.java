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

import net.sf.smbt.ezmotion.EzmotionFactory;
import net.sf.smbt.ezmotion.Motion;
import net.sf.smbt.ezmotion.MotionAxis;
import net.sf.smbt.ezmotion.MotionCinematic;
import net.sf.smbt.ezmotion.MotionKind;
import net.sf.smbt.ezmotion.MotionValue;

public class MotionUtils {
	public final static MotionUtils INSTANCE = new MotionUtils();

	public Motion createMotion(float amplitude, MotionCinematic cinematic, float freq, MotionKind kind, int sampling, MotionAxis axis) {
		Motion motion = EzmotionFactory.eINSTANCE.createMotion();
		motion.setAmplitude(amplitude);
		motion.setCinematic(cinematic);
		motion.setFrequency(freq);
		motion.setKind(kind);
		motion.setSampleRate(sampling);
		motion.setAxis(axis);
	
		return motion;
	}
	
	public Motion createMotionFromCinematicKind(MotionCinematic kind, float amplitude, float freq) {
		switch(kind) {
			case COS:
				return MotionUtils.INSTANCE.createCyclicCosMotion(amplitude, freq);
			case SIN:
				return MotionUtils.INSTANCE.createCyclicSinMotion(amplitude, freq);
			case SAW:
				return MotionUtils.INSTANCE.createCyclicSawMotion(amplitude, freq);
			case SQR:
				return MotionUtils.INSTANCE.createCyclicSqrMotion(amplitude, freq);
			case TRI:
			case NONE:
			default:
				return null;
		}
	}

	
	public Motion createMotion(float amplitude, MotionCinematic cinematic, float freq, MotionKind kind, int sampling) {
		return createMotion(amplitude, cinematic, freq, kind, sampling, null);
	}
	
	public MotionValue createMotionValue() {
		MotionValue motionValue = EzmotionFactory.eINSTANCE.createMotionValue();
		motionValue.setX(Float.NaN);
		motionValue.setY(Float.NaN);
		motionValue.setZ(Float.NaN);
		motionValue.setXAccel(Float.NaN);
		motionValue.setYAccel(Float.NaN);
		motionValue.setZAccel(Float.NaN);
		motionValue.setXRot(Float.NaN);
		motionValue.setYRot(Float.NaN);
		motionValue.setZRot(Float.NaN);
		return motionValue;
	}

	public Motion createCyclicSinMotion(float amplitude, float freq) {
		return createMotion(amplitude, MotionCinematic.SIN, freq, MotionKind.CYCLIC, 5);
	}
	
	public Motion createCyclicCosMotion(float amplitude, float freq) {
		return createMotion(amplitude, MotionCinematic.COS, freq, MotionKind.CYCLIC, 5);
	}
	
	public Motion createCyclicSqrMotion(float amplitude, float freq) {
		return createMotion(amplitude, MotionCinematic.SQR, freq, MotionKind.CYCLIC, 5);
	}

	public Motion createCyclicSawMotion(float amplitude, float freq) {
		return createMotion(amplitude, MotionCinematic.SAW, freq, MotionKind.CYCLIC, 5);
	}

	
	/**
	 * 1 axis motions
	 * 
	 * @return a list of 1D basic motions (sin, cos, saw, sqr, ...)
	 */
	public List<Motion> createBasicMotions() {
		float amplitude = 1.0f; 
		float freq      = 2.0f;
		List<Motion> motions = new ArrayList<Motion>();
		
		motions.add(createCyclicCosMotion(amplitude, freq));
		motions.add(createCyclicSinMotion(amplitude, freq));
		motions.add(createCyclicSqrMotion(amplitude, freq));
		motions.add(createCyclicSawMotion(amplitude, freq));
		
		return motions;
	}
}
