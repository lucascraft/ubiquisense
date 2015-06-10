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

import java.util.List;

import net.sf.smbt.ezmotion.Motion;
import net.sf.smbt.ezmotion.MotionKind;

/**
 * Describes an engine w/ dynamic motion capabilities eg: able to temporally compute motion values given a 
 * motion definition such as those defined in {@link MotionKind}
 * 
 * @author Lucas Bigeardel
 *
 */
public interface IMotionEngine {
	/**
	 * Initializes the motion engine
	 */
	void init();
	
	/**
	 * Increments motion engine w/ a step and stimulates registered {@link IMotionReceiver} clients
	 */
	void tick();
	
	/**
	 * Starts the motion engine
	 */
	void start();
	
	/**
	 * Stops the motion engine 
	 */
	void stop();
	
	/**
	 * Registers a motion receiver 
	 */
	List<IMotionReceiver> getMotionReceiver();
	
	/**
	 * Registers a motion receiver 
	 */
	void registerMotionReceiver(IMotionReceiver motionReceiver);
	
	/**
	 * Registers a motion receiver 
	 */
	void unregisterMotionReceiver(IMotionReceiver motionReceiver);
	
	void addMotion(Motion motion);
	
	void addMotions(Motion... motions);
	
	void removeMotion(Motion motion);
	
	void removeMotions(Motion... motions);

	void clearMotions();
	
	
}
