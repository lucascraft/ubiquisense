/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2012, Lucas Bigeardel
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

package net.sf.smbt.ui.widgets.common;

public class QuadFilterUtils {
	
	public final static QuadFilterUtils INSTANCE = new QuadFilterUtils();
	
	public enum QuadFilterComputationType {
		LowPassFilter,
		HighPassFilter,
		BassPassFilterConst,
		BassPassFilter,
		Notch,
		APassFilter,
		peakingEQ,
		lowShelf,
		highShelf,
	}
	
	public enum AlphaCase {
		S,
		Q,
		BW
	}
	
	public class QuadFilterParameter {
		public double b0, b1, b2, a0, a1, a2;
		
		public QuadFilterParameter(double b0, double b1, double b2, double a0, double a1, double a2) {
			this.b0 = b0;
			this.b1 = b1;
			this.b2 = b2;
			this.a0 = a0;
			this.a1 = a1;
			this.a2 = a2;
		}
		
		public QuadFilterParameter() {
			this(0, 0, 0, 0, 0, 0);
		}
	}	
	
	/**
	 * Normalize input gain
	 * 
	 * @param dBgain Db
	 * 
	 * @return normalized
	 */
	public double computeDbGain(int dBgain) {
		 return Math.sqrt( 10 ^ ( dBgain / 20 ) );
	}
	
	/**
	 * Compute angle
	 * 
	 * @param samplingRate sampling rate
	 * @param f0 center frequency
	 * 
	 * @return angle
	 */
	public double computeW0(int samplingRate, int f0) {
		return 2 * Math.PI * f0 / samplingRate;	
	}
	
	/**
	 * Computing alpha  
	 * 
	 * @param type Q |ÊBW |ÊS 
	 * @param w0 windows
	 * @param Q quantization
	 * @param BW bandwidth
	 * @param A amplitude
	 * @param S shelf
	 * 
	 * @return alpha
	 */
	public double computeAlpha(AlphaCase type, double w0, double Q, int BW, double A, double S) {
		double alpha = 0;
		switch (type) {
		case Q:
			alpha = Math.sin(w0) / (2 * Q);
			break;
		case BW:
			alpha = Math.sin(w0) * Math.sinh( Math.log(2) / 2 * BW * w0 / Math.sin(w0) );
			break;
		case S:
			alpha = Math.sin(w0) / 2 * Math.sqrt( (A + 1 / A) * (1/S - 1) + 2 );
			break;
		}
		return alpha;
	}
	
	/**
	 * Quadratic filter parameter computation
	 * 
	 * @param type QuadFilterComputationType among
	 * 
	 * <ul>
	 * <li>		LowPassFilter
	 * <li>		HighPassFilter
	 * <li>		BassPassFilterConst
	 * <li>		BassPassFilter
	 * <li>		Notch
	 * <li>		APassFilter
	 * <li>		peakingEQ
	 * <li>		lowShelf
	 * <li>		highShelf
	 * </ul>
	 * 
	 * @return newly computed Quadratic Filter
	 */
	public QuadFilterParameter compute(QuadFilterComputationType type, int samplingRate, int f0, int dBgain, double Q) {
		
		QuadFilterParameter param = new QuadFilterParameter();
		
		double S 		= 1; // ???
		double A		= computeDbGain(dBgain);
		double w0		= computeW0(samplingRate, f0);
		double alpha 	= 0;
		
		switch (type) {
			case APassFilter:
				alpha 		= computeAlpha(AlphaCase.Q, w0, Q, 0, A, S);

				param.b0 	=   1 - alpha;
	            param.b1 	=  -2*Math.cos(w0);
	            param.b2 	=   1 + alpha;
	            param.a0 	=   1 + alpha;
	            param.a1 	=  -2*Math.cos(w0);
	            param.a2	=   1 - alpha;
				break;
			case BassPassFilter:
				alpha 		= computeAlpha(AlphaCase.Q, w0, Q, 0, A, S);

				param.b0	=   Math.sin(w0)/2; //  =   Q*alpha;
		        param.b1	=   0;
		        param.b2	=  -Math.sin(w0)/2;  // =  -Q*alpha;
		        param.a0	=   1 + alpha;
		        param.a1	=  -2*Math.cos(w0);
		        param.a2	=   1 - alpha;
				break;
			case BassPassFilterConst:
				alpha 		= computeAlpha(AlphaCase.Q, w0, Q, 0, A, S);

				param.b0	=   alpha;
				param.b1	=   0;
				param.b2	=  -alpha;
				param.a0	=   1 + alpha;
				param.a1	=  -2*Math.cos(w0);
				param.a2	=   1 - alpha;
				break;
			case HighPassFilter:
				alpha 		= computeAlpha(AlphaCase.Q, w0, Q, 0, A, S);

				param.b0 =  (1 + Math.cos(w0))/2;
				param.b1 = -(1 + Math.cos(w0));
				param.b2 =  (1 + Math.cos(w0))/2;
				param.a0 =   1 + alpha;
				param.a1 =  -2*Math.cos(w0);
				param.a2 =   1 - alpha;

				break;
			case highShelf:
				alpha 		= computeAlpha(AlphaCase.Q, w0, Q, 0, A, S);
				
				param.b0 	=    A*( (A+1) + (A-1)*Math.cos(w0) + 2*Math.sqrt(A)*alpha );
				param.b1 	= -2*A*( (A-1) + (A+1)*Math.cos(w0)                   );
				param.b2 	=    A*( (A+1) + (A-1)*Math.cos(w0) - 2*Math.sqrt(A)*alpha );
				param.a0 	=        (A+1) - (A-1)*Math.cos(w0) + 2*Math.sqrt(A)*alpha;
				param.a1 	=    2*( (A-1) - (A+1)*Math.cos(w0)                   );
				param.a2 	=        (A+1) - (A-1)*Math.cos(w0) - 2*Math.sqrt(A)*alpha;
				break;
			case LowPassFilter:
				alpha 		=	computeAlpha(AlphaCase.Q, w0, Q, 0, A, S);

	            param.b0 =  (1 - Math.cos(w0))/2;
	            param.b1 =   1 - Math.cos(w0);
	            param.b2 =  (1 - Math.cos(w0))/2;
	            param.a0 =   1 + alpha;
	            param.a1 =  -2*Math.cos(w0);
	            param.a2 =   1 - alpha;

				break;
			case lowShelf:
				alpha 		=	computeAlpha(AlphaCase.Q, w0, Q, 0, A, S);

	            param.b0	=    A*( (A+1) - (A-1) * Math.cos(w0) + 2*Math.sqrt(A)*alpha );
	            param.b1	=  2*A*( (A-1) - (A+1) * Math.cos(w0)                   );
	            param.b2	=    A*( (A+1) - (A-1) * Math.cos(w0) - 2*Math.sqrt(A)*alpha );
	            param.a0	=        (A+1) + (A-1) * Math.cos(w0) + 2*Math.sqrt(A)*alpha;
	            param.a1	=   -2*( (A-1) + (A+1) * Math.cos(w0)                   );
	            param.a2	=        (A+1) + (A-1) * Math.cos(w0) - 2*Math.sqrt(A)*alpha;
				break;
			case Notch:
				alpha 		=	computeAlpha(AlphaCase.Q, w0, Q, 0, A, S);

				param.b0 =   1;
				param.b1 =  -2*Math.cos(w0);
				param.b2 =   1;
				param.a0 =   1 + alpha;
				param.a1 =  -2*Math.cos(w0);
				param.a2 =   1 - alpha;
				break;
			case peakingEQ:
				alpha 		= computeAlpha(AlphaCase.Q, w0, Q, 0, A, S);
				
				param.b0 	=   1 + alpha*A;
				param.b1 	=  -2*Math.cos(w0);
				param.b2 	=   1 - alpha*A;
				param.a0 	=   1 + alpha/A;
				param.a1 	=  -2*Math.cos(w0);
				param.a2 	=   1 - alpha/A;
				break;
		}
		return param;
	}
	
	/**
	 * Gain computation from given ratio
	 * 
	 * @param gRatio 0f..1f
	 * @param gMin min gain
	 * @param gMax max gain
	 * 
	 * @return newly computed gain
	 */
	public double getGainFromRatio(double gRatio, double gMin, double gMax) {
		int sign = gRatio < 0.5 ? 1 : -1;
		double rGain = sign * (gMin + (gMax - gMin) * gMax * gRatio);
		for (double f=0;f<12;f+=0.01) {
			double x = 20 * Math.log10(rGain / 12);
			if (x > rGain) {
				return x;
			}
		}
		return 0;
	}
	
	/**
	 * Frequency computation from given ratio
	 * 
	 * @param fRatio 0f..1f
	 * @param fMin min frequency
	 * @param fMax max frequency
	 * 
	 * @return newly computed ratio
	 */
	public double getFreqFromRatio(double fRatio, double fMin, double fMax) {
		double fAmp  = fMax - fMin;	
		for (double f=fMin;f<fMax;f+=10) {
			double x = ((Math.log10(f) - fMin) / fAmp); 
			if (x > fRatio) {
				for (double f2=f-10;f2<f;f+=0.01) {
					x = ((Math.log10(f) - fMin) / fAmp); 
					if (x > fRatio) {
						return x;
					}
				}
			}
		}
		return 0;
	}
}
