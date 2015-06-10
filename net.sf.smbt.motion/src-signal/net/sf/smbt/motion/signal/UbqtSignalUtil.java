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

package net.sf.smbt.motion.signal;

import org.eclipse.draw2d.geometry.Point;


/**
 * Utility providing signal computing regarding motions.
 * 
 * This util is dedicated to signal basic computations. 
 * 
 * @author lucas.bigeardel@gmail.com
 *
 */
public class UbqtSignalUtil {
	/**
	 * Singleton
	 */
	public final static UbqtSignalUtil INSTANCE = new UbqtSignalUtil();
	
	/**
	 * Cos wave formula for basic 1 length based range.
	 * 
	 * @param f given frequency in Hertz
	 * @param t the moment this formula has to be evaluated
	 * @param harmonics the number of harmonics to be added for precision purposes
	 * 
	 * @return the computed value
	 */
	public double computeCosWav(double f, long t, int harmonics) {
		return Math.cos((2 / Math.PI) * f * t);
	}
	
	/**
	 * Sin wave formula for basic 1 length based range.
	 * 
	 * @param f given frequency in Hertz
	 * @param t the moment this formula has to be evaluated
	 * @param harmonics the number of harmonics to be added for precision purposes
	 * 
	 * @return the computed value
	 */
	public double computeSinWav(double f, long t, int harmonics) {
		return Math.sin((2 / Math.PI) * f * t);
	}
	
	/**
	 * Triangle wave formula for basic 1 length based range.
	 * 
	 * @param f given frequency in Hertz
	 * @param t the moment this formula has to be evaluated
	 * @param harmonics the number of harmonics to be added for precision purposes
	 * 
	 * @return the computed value
	 */
	public double computeTriWav(double f, long t, int harmonics) {
		double ret = 0;
		for (int k=1; k<harmonics; k++) {
			ret += (-1^k) * (Math.sin((2*k + 1) * f * t) / (2*k + 1));
		}
		return ret;
	}
	
	/**
	 * Sawtooth wave formula for basic 1 length based range.
	 * 
	 * @param f given frequency in Hertz
	 * @param t the moment this formula has to be evaluated
	 * @param harmonics the number of harmonics to be added for precision purposes
	 * 
	 * @return the computed value
	 */
	public double computeSawWav(double f, long t, int harmonics) {
		double ret = 0;
		for (int k=1; k<harmonics; k++) {
			ret += Math.sin(2 * Math.PI * k * f * t);
		}
		return (2 / Math.PI) * ret;
	}

	/**
	 * Square wave formula for basic 1 length based range.
	 * 
	 * @param f given frequency in Hertz
	 * @param t the moment this formula has to be evaluated
	 * @param harmonics the number of harmonics to be added for precision purposes
	 * 
	 * @return the computed value
	 */
	public double computeSqrWav(double f, long t, int harmonics) {
		double ret = 0;
		for (int k=1; k<harmonics; k++) {
			ret += Math.sin((2*k - 1) * 2 * Math.PI  * f * t) / (2*k - 1);
		}
		return (4 / Math.PI) * ret;
	}
	
	
	public Point computeCircle(long t) {
		return new Point(Math.cos(t), Math.sin(t));
	}
	
	public Point computeHisteresis(long t) {
		return new Point(3 * Math.sin(5 * t), 3 * Math.cos(3 * t));
	}
	
	public Point computeFlower(long t) {
		return new Point(2 * Math.cos(t) + Math.cos(8 * t), 2 * Math.sin(t) + Math.sin(8 * t));
	}
	
	public Point computeStar(long t) {
		return new Point(new Double(Math.cos(t)).longValue()^5, new Double(Math.sin(t)).longValue()^5);
	}
	
	public Point computeLeminiscate(long t) {
		long x = t * (t^2 + 1) / (t^4 + 1);
		long y = t * (t^2 - 1) / (t^4 + 1);
		return new Point(x, y);
	}
}
