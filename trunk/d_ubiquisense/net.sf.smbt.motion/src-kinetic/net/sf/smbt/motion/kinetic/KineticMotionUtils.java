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

package net.sf.smbt.motion.kinetic;

/**
 * A very likely loop motion(s) to be applied to whatever listening object w/ type/range compatibility
 * 
 * @author lucas
 *
 */
public class KineticMotionUtils implements IKineticsDiscretezer {
	
	public final static KineticMotionUtils INSTANCE = new KineticMotionUtils();

	@Override
	public void discretizeAccellerationInIncrementalSteps(float accel, float duration, float minBound, float maxBound) {
		
	}
	
	public void getDiscretizedWav() {
		
	}
	
	//
	// 
	//
	
	public float[] bezier(int x0, int y0, int x1, int y1, int x2, int y2, int x3, int y3, int count) {
		// The parametric equations for a Bezier curve for x[t] and y[t] where  0 <= t <=1 are:
		// x[t] = x0+3(x1-x0)t+3(x0+x2-2x1)t^2+(x3-x0+3x1-3x2)t^3
		// y[t] = y0+3(y1-y0)t+3(y0+y2-2y1)t^2+(y3-y0+3y1-3y2)t^3
		double a0 = x0;
		double a1 = 3*(x1 - x0);
		double a2 = 3*(x0 + x2 - 2*x1);
		double a3 = x3 - x0 + 3*x1 - 3*x2;
		double b0 = y0;
		double b1 = 3*(y1 - y0);
		double b2 = 3*(y0 + y2 - 2*y1);
		double b3 = y3 - y0 + 3*y1 - 3*y2;

		float[] polygon = new float[2*count + 2];
		for (int i = 0; i <= count; i++) {
			double t = (double)i / (double)count;
			polygon[2*i] = (int)(a0 + a1*t + a2*t*t + a3*t*t*t);
			polygon[2*i + 1] = (int)(b0 + b1*t + b2*t*t + b3*t*t*t);
		}
		return polygon;
	}

	

	// Code adapted from Paul Bourke:
	// http://local.wasp.uwa.edu.au/~pbourke/geometry/sphereline/raysphere.c
	public boolean circleLineIntersect(double x1, double y1, double x2, double y2, double cx, double cy, double cr ) {
	  double dx = x2 - x1;
	  double dy = y2 - y1;
	  double a = dx * dx + dy * dy;
	  double b = 2 * (dx * (x1 - cx) + dy * (y1 - cy));
	  double c = cx * cx + cy * cy;
	  c += x1 * x1 + y1 * y1;
	  c -= 2 * (cx * x1 + cy * y1);
	  c -= cr * cr;
	  double bb4ac = b * b - 4 * a * c;
	 
	  if (bb4ac < 0) {  // Not intersecting
	    return false;
	  }
	  else {
	     
	    double mu = (-b + Math.sqrt( b*b - 4*a*c )) / (2*a);
	    double ix1 = x1 + mu*(dx);
	    double iy1 = y1 + mu*(dy);
	    mu = (-b - Math.sqrt(b*b - 4*a*c )) / (2*a);
	    double ix2 = x1 + mu*(dx);
	    double iy2 = y1 + mu*(dy);
	 
	    // The intersection points
	    //ellipse(ix1, iy1, 10, 10);
	    //ellipse(ix2, iy2, 10, 10);
	     
	    double testX;
	    double testY;
	    // Figure out which point is closer to the circle
	    if (dist(x1, y1, cx, cy) < dist(x2, y2, cx, cy)) {
	      testX = x2;
	      testY = y2;
	    } else {
	      testX = x1;
	      testY = y1;
	    }
	     
	    if (dist(testX, testY, ix1, iy1) < dist(x1, y1, x2, y2) || dist(testX, testY, ix2, iy2) < dist(x1, y1, x2, y2)) {
	      return true;
	    } else {
	      return false;
	    }
	  }
	}
	  
	public double dist(double x1, double y1, double x2, double y2) {
	  return Math.sqrt (Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	}
}
