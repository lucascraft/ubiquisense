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

import net.sf.smbt.ezmotion.EzmotionFactory;
import net.sf.smbt.ezmotion.Motion;
import net.sf.smbt.ezmotion.MotionAxis;
import net.sf.smbt.ezmotion.MotionCinematic;
import net.sf.smbt.ezmotion.MotionKind;
import net.sf.smbt.ezmotion.MotionValue;
import net.sf.smbt.motion.signal.UbqtSignalUtil;

public class Motion3DUtils {
	public final static Motion3DUtils INSTANCE = new Motion3DUtils();

	public void updateMotionValue(MotionAxis axis, MotionValue motionValue, double val) {
		switch(axis) {
			case XAXIS:
				motionValue.setX(val);
				break;
			case YAXIS:
				motionValue.setY(val);
				break;
			case ZAXIS:
				motionValue.setZ(val);
				break;
		}
	}
	
	public MotionValue computeInstantMotionValue(Motion... motion) {
		MotionValue motionValue = MotionUtils.INSTANCE.createMotionValue();
		int i = 0;
		for (Motion m : motion) {
			computeInstantMotionValue(motionValue, MotionAxis.get(i), m);
			i++;
		}
		return motionValue;
	}
	
	public MotionValue computeInstantMotionValue(Motion motion, MotionAxis axis) {
		MotionValue motionValue = MotionUtils.INSTANCE.createMotionValue();
		computeInstantMotionValue(motionValue, axis, motion);
		return motionValue;
	}
	
	private void computeInstantMotionValue(MotionValue value, MotionAxis axis, Motion motion) {
		switch (motion.getCinematic()) {
			case CUBIC:
				break;
			case QUADRATIC:
				break;
			case LOG:
				break;
			case RAMP:
				break;
			case SAW:
				updateMotionValue(
					axis, 
					value, 
					UbqtSignalUtil.INSTANCE.computeSawWav(motion.getFrequency(), motion.getTime(), motion.getSampleRate())
				);
				break;
			case TRI:
				updateMotionValue(
					axis, 
					value, 
					UbqtSignalUtil.INSTANCE.computeTriWav(motion.getFrequency(), motion.getTime(), motion.getSampleRate())
				);
				break;
			case COS:
				updateMotionValue(
					axis, 
					value, 
					UbqtSignalUtil.INSTANCE.computeCosWav(motion.getFrequency(), motion.getTime(), motion.getSampleRate())
				);
				break;
			case SIN:
				updateMotionValue(
					axis, 
					value, 
					UbqtSignalUtil.INSTANCE.computeSinWav(motion.getFrequency(), motion.getTime(), motion.getSampleRate())
				);
				break;
			case SQR:
				updateMotionValue(
					axis, 
					value, 
					UbqtSignalUtil.INSTANCE.computeSqrWav(motion.getFrequency(), motion.getTime(), motion.getSampleRate())
				);
				break;
			case HARMONIC:
				break;
			case LINEAR:
				break;
			case SQUARE:
				break;
			case IMPULSE:
				break;
			default:
				break;
		}
	}
	
	public Motion createMotion(float amplitude, MotionCinematic cinematic, float freq, MotionKind kind, int sampling) {
		Motion motion = EzmotionFactory.eINSTANCE.createMotion();
		motion.setAmplitude(amplitude);
		motion.setCinematic(cinematic);
		motion.setFrequency(freq);
		motion.setKind(kind);
		motion.setSampleRate(sampling);
		return motion;
	}
	
	public Motion createCyclicSinMotion(float amplitude, float freq) {
		return createMotion(amplitude, MotionCinematic.SIN, freq, MotionKind.CYCLIC, 5);
	}
	
	public Motion createCyclicCosMotion(float amplitude, float freq) {
		return createMotion(amplitude, MotionCinematic.COS, freq, MotionKind.CYCLIC, 5);
	}
	
	public Motion[] createCyclic2DRotateMotion(float amplitude, float freq) {
		return new Motion[] {
			createMotion(amplitude, MotionCinematic.COS, freq, MotionKind.CYCLIC, 5),
			createMotion(amplitude, MotionCinematic.SIN, freq, MotionKind.CYCLIC, 5)
		};
	}
}
