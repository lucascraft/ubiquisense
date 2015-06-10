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

package net.sf.smbt.ui.widgets.vu;

import java.util.HashMap;
import java.util.Map;

import net.sf.smbt.ui.widgets.common.ColorsUtil;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public class SixteenSegmentsDisplay extends UbiWidget {
	
	public final static int[] values = new int[] {
		/* */ 0x0000, /*!*/ 0x000C, /*"*/ 0x0204, /*#*/ 0x5A03,
		/*$*/ 0x5AF9, /*%*/ 0x6F99, /*&*/ 0x8B52, /*'*/ 0x0200,
		/*(*/ 0x8400, /*)*/ 0x2100, /***/ 0xFF00, /*+*/ 0x5A00,
		/*,*/ 0x4000, /*-*/ 0x1800, /*.*/ 0x4000, /*/*/ 0x2400,
		/*0*/ 0x24FF, /*1*/ 0x040C, /*2*/ 0x18F6, /*3*/ 0x10FC,
		/*4*/ 0x180D, /*5*/ 0x18F9, /*6*/ 0x18FB, /*7*/ 0x003C,
		/*8*/ 0x18FF, /*9*/ 0x18FD, /*:*/ 0x4200, /*;*/ 0x2200,
		/*<*/ 0x8C00, /*=*/ 0x18C0, /*>*/ 0x3100, /*?*/ 0x5034,
		/*@*/ 0x14F7, /*A*/ 0x183F, /*B*/ 0x52FC, /*C*/ 0x00F3,
		/*D*/ 0x42FC, /*E*/ 0x08F3, /*F*/ 0x0833, /*G*/ 0x107B,
		/*H*/ 0x180F, /*I*/ 0x42F0, /*J*/ 0x00CE, /*K*/ 0x8C03,
		/*L*/ 0x00C3, /*M*/ 0x050F, /*N*/ 0x810F, /*O*/ 0x00FF,
		/*P*/ 0x1837, /*Q*/ 0x80FF, /*R*/ 0x9837, /*S*/ 0x18F9,
		/*T*/ 0x4230, /*U*/ 0x00CF, /*V*/ 0x2403, /*W*/ 0xA00F,
		/*X*/ 0xA500, /*Y*/ 0x5805, /*Z*/ 0x24F0, /*[*/ 0x42A0,
		/*\*/ 0x8100, /*]*/ 0x4250, /*^*/ 0xA000, /*_*/ 0x00C0,
		/*`*/ 0x0100, /*a*/ 0x4942, /*b*/ 0x4843, /*c*/ 0x0842,
		/*d*/ 0x4A42, /*e*/ 0x28C2, /*f*/ 0x5A20, /*g*/ 0x4A51,
		/*h*/ 0x4803, /*i*/ 0x4000, /*j*/ 0x4242, /*k*/ 0xC600,
		/*l*/ 0x4200, /*m*/ 0x580A, /*n*/ 0x4802, /*o*/ 0x4842,
		/*p*/ 0x0A13, /*q*/ 0x4A11, /*r*/ 0x0802, /*s*/ 0x4851,
		/*t*/ 0x5A00, /*u*/ 0x4042, /*v*/ 0x2002, /*w*/ 0xA00A,
		/*x*/ 0xA500, /*y*/ 0x4500, /*z*/ 0x2840, /*{*/ 0x4AA0,
		/*|*/ 0x0003, /*}*/ 0x5250, /*~*/ 0x0500, /*|*/ 0x4200
	};
	

	public final static int VAL_NONE 				= values[0];
	public final static int VAL_EXCL 				= values[1];
	public final static int VAL_DBL_QUOT 			= values[2];
	public final static int VAL_DASH				= values[3];
	public final static int VAL_DOLLAR 				= values[4];
	public final static int VAL_PERCENT 			= values[5];
	public final static int VAL_AND 				= values[6];
	public final static int VAL_SMPL_QUOT 			= values[7];
	public final static int VAL_LEFT_PAR 			= values[8];
	public final static int VAL_RIGHT_PAR			= values[9];
	public final static int VAL_STAR 				= values[10];
	public final static int VAL_PLUS 				= values[11];
	public final static int VAL_COMMA 				= values[12];
	public final static int VAL_MINUS 				= values[13];
	public final static int VAL_POINT				= values[14];
	public final static int VAL_SLASH				= values[15];
	public final static int VAL_0					= values[16];
	public final static int VAL_1					= values[17];
	public final static int VAL_2					= values[18];
	public final static int VAL_3					= values[19];
	public final static int VAL_4					= values[20];
	public final static int VAL_5					= values[21];
	public final static int VAL_6					= values[22];
	public final static int VAL_7					= values[23];
	public final static int VAL_8					= values[24];
	public final static int VAL_9					= values[25];
	public final static int VAL_TWO_POINT			= values[26];
	public final static int VAL_POINT_COMMA			= values[27];
	public final static int VAL_LESSER				= values[28];
	public final static int VAL_EQ					= values[29];
	public final static int VAL_GREATER				= values[30];
	public final static int VAL_INTER				= values[31];
	public final static int VAL_AROBASE				= values[32];
	public final static int VAL_MAJ_A				= values[33];
	public final static int VAL_MAJ_B				= values[34];
	public final static int VAL_MAJ_C				= values[35];
	public final static int VAL_MAJ_D				= values[36];
	public final static int VAL_MAJ_E				= values[37];
	public final static int VAL_MAJ_F				= values[38];
	public final static int VAL_MAJ_G				= values[39];
	public final static int VAL_MAJ_H				= values[40];
	public final static int VAL_MAJ_I				= values[41];
	public final static int VAL_MAJ_J				= values[42];
	public final static int VAL_MAJ_K				= values[43];
	public final static int VAL_MAJ_L				= values[44];
	public final static int VAL_MAJ_M				= values[45];
	public final static int VAL_MAJ_N				= values[46];
	public final static int VAL_MAJ_O				= values[47];
	public final static int VAL_MAJ_P				= values[48];
	public final static int VAL_MAJ_Q				= values[49];
	public final static int VAL_MAJ_R				= values[50];
	public final static int VAL_MAJ_S				= values[51];
	public final static int VAL_MAJ_T				= values[52];
	public final static int VAL_MAJ_U				= values[53];
	public final static int VAL_MAJ_V				= values[54];
	public final static int VAL_MAJ_W				= values[55];
	public final static int VAL_MAJ_X				= values[56];
	public final static int VAL_MAJ_Y				= values[57];
	public final static int VAL_MAJ_Z				= values[58];
	public final static int VAL_LEFT_SQR_BRAC		= values[59];
	public final static int VAL_ANTI_SLASH			= values[60];
	public final static int VAL_RIGTH_SQR_BRAC		= values[61];
	public final static int VAL_EXP					= values[62];
	public final static int VAL_UNDERSC				= values[63];
	public final static int VAL_BACK_QUOTE			= values[64];
	public final static int VAL_A					= values[65];
	public final static int VAL_B					= values[66];
	public final static int VAL_C					= values[67];
	public final static int VAL_D					= values[68];
	public final static int VAL_E					= values[69];
	public final static int VAL_F					= values[70];
	public final static int VAL_G					= values[71];
	public final static int VAL_H					= values[72];
	public final static int VAL_I					= values[73];
	public final static int VAL_J					= values[74];
	public final static int VAL_K					= values[75];
	public final static int VAL_L					= values[76];
	public final static int VAL_M					= values[77];
	public final static int VAL_N					= values[78];
	public final static int VAL_O					= values[79];
	public final static int VAL_P					= values[80];
	public final static int VAL_Q					= values[81];
	public final static int VAL_R					= values[82];
	public final static int VAL_S					= values[83];
	public final static int VAL_T					= values[84];
	public final static int VAL_U					= values[85];
	public final static int VAL_V					= values[86];
	public final static int VAL_W					= values[87];
	public final static int VAL_X					= values[88];
	public final static int VAL_Y					= values[89];
	public final static int VAL_Z					= values[90];
	public final static int VAL_LEFT_BRAC			= values[91];
	public final static int VAL_OR					= values[92];
	public final static int VAL_RIGHT_BRAC			= values[93];
	public final static int VAL_TILDE				= values[94];
	public final static int VAL_PIPE				= values[95];
	

	private Map<Character, Integer> assciiTo16Segments;
	private Map<Character, String> assciiTo16SegmentsSuffix;
	
	private Map<Integer, int[]> segPathMap;
	
	public Map<Character, String> getAssciiTo16SegmentsSuffixMap() {
		return assciiTo16SegmentsSuffix;
	}

	private int nbDigits;
	private String text;
	public SixteenSegmentsDisplay(Composite parent, int size, int style) {
		super(parent, style);

		assciiTo16Segments = new HashMap<Character, Integer>();
		assciiTo16Segments.put(new Character(' '), VAL_NONE);
		assciiTo16Segments.put(new Character('!'), VAL_EXCL);
		assciiTo16Segments.put(new Character('"'), VAL_DBL_QUOT);
		assciiTo16Segments.put(new Character('#'), VAL_DASH);
		assciiTo16Segments.put(new Character('$'), VAL_DOLLAR);
		assciiTo16Segments.put(new Character('%'), VAL_PERCENT);
		assciiTo16Segments.put(new Character('&'), VAL_AND);
		assciiTo16Segments.put(new Character('\''), VAL_SMPL_QUOT);
		assciiTo16Segments.put(new Character('('), VAL_LEFT_PAR);
		assciiTo16Segments.put(new Character(')'), VAL_RIGHT_PAR);
		assciiTo16Segments.put(new Character('*'), VAL_STAR);
		assciiTo16Segments.put(new Character('+'), VAL_PLUS);
		assciiTo16Segments.put(new Character(','), VAL_COMMA);
		assciiTo16Segments.put(new Character('-'), VAL_MINUS);
		assciiTo16Segments.put(new Character('.'), VAL_POINT);
		assciiTo16Segments.put(new Character('/'), VAL_SLASH);
		assciiTo16Segments.put(new Character('0'), VAL_0);
		assciiTo16Segments.put(new Character('1'), VAL_1);
		assciiTo16Segments.put(new Character('2'), VAL_2);
		assciiTo16Segments.put(new Character('3'), VAL_3);
		assciiTo16Segments.put(new Character('4'), VAL_4);
		assciiTo16Segments.put(new Character('5'), VAL_5);
		assciiTo16Segments.put(new Character('6'), VAL_6);
		assciiTo16Segments.put(new Character('7'), VAL_7);
		assciiTo16Segments.put(new Character('8'), VAL_8);
		assciiTo16Segments.put(new Character('9'), VAL_9);
		assciiTo16Segments.put(new Character(':'), VAL_TWO_POINT);
		assciiTo16Segments.put(new Character(';'), VAL_POINT_COMMA);
		assciiTo16Segments.put(new Character('<'), VAL_LESSER);
		assciiTo16Segments.put(new Character('='), VAL_EQ);
		assciiTo16Segments.put(new Character('>'), VAL_GREATER);
		assciiTo16Segments.put(new Character('?'), VAL_INTER);
		assciiTo16Segments.put(new Character('@'), VAL_AROBASE);
		assciiTo16Segments.put(new Character('A'), VAL_MAJ_A);
		assciiTo16Segments.put(new Character('B'), VAL_MAJ_B);
		assciiTo16Segments.put(new Character('C'), VAL_MAJ_C);
		assciiTo16Segments.put(new Character('D'), VAL_MAJ_D);
		assciiTo16Segments.put(new Character('E'), VAL_MAJ_E);
		assciiTo16Segments.put(new Character('F'), VAL_MAJ_F);
		assciiTo16Segments.put(new Character('G'), VAL_MAJ_G);
		assciiTo16Segments.put(new Character('H'), VAL_MAJ_H);
		assciiTo16Segments.put(new Character('I'), VAL_MAJ_I);
		assciiTo16Segments.put(new Character('J'), VAL_MAJ_J);
		assciiTo16Segments.put(new Character('K'), VAL_MAJ_K);
		assciiTo16Segments.put(new Character('L'), VAL_MAJ_L);
		assciiTo16Segments.put(new Character('M'), VAL_MAJ_M);
		assciiTo16Segments.put(new Character('N'), VAL_MAJ_N);
		assciiTo16Segments.put(new Character('O'), VAL_MAJ_O);
		assciiTo16Segments.put(new Character('P'), VAL_MAJ_P);
		assciiTo16Segments.put(new Character('Q'), VAL_MAJ_Q);
		assciiTo16Segments.put(new Character('R'), VAL_MAJ_R);
		assciiTo16Segments.put(new Character('S'), VAL_MAJ_S);
		assciiTo16Segments.put(new Character('T'), VAL_MAJ_T);
		assciiTo16Segments.put(new Character('U'), VAL_MAJ_U);
		assciiTo16Segments.put(new Character('V'), VAL_MAJ_V);
		assciiTo16Segments.put(new Character('W'), VAL_MAJ_W);
		assciiTo16Segments.put(new Character('X'), VAL_MAJ_X);
		assciiTo16Segments.put(new Character('Y'), VAL_MAJ_Y);
		assciiTo16Segments.put(new Character('Z'), VAL_MAJ_Z);
		assciiTo16Segments.put(new Character('['), VAL_LEFT_SQR_BRAC);
		assciiTo16Segments.put(new Character('\\'), VAL_ANTI_SLASH);
		assciiTo16Segments.put(new Character(']'), VAL_RIGTH_SQR_BRAC);
		assciiTo16Segments.put(new Character('^'), VAL_EXP);
		assciiTo16Segments.put(new Character('_'), VAL_UNDERSC);
		assciiTo16Segments.put(new Character('\''), VAL_SMPL_QUOT);
		assciiTo16Segments.put(new Character('a'), VAL_A);
		assciiTo16Segments.put(new Character('b'), VAL_B);
		assciiTo16Segments.put(new Character('c'), VAL_C);
		assciiTo16Segments.put(new Character('d'), VAL_D);
		assciiTo16Segments.put(new Character('e'), VAL_E);
		assciiTo16Segments.put(new Character('f'), VAL_F);
		assciiTo16Segments.put(new Character('g'), VAL_G);
		assciiTo16Segments.put(new Character('h'), VAL_H);
		assciiTo16Segments.put(new Character('i'), VAL_I);
		assciiTo16Segments.put(new Character('j'), VAL_J);
		assciiTo16Segments.put(new Character('k'), VAL_K);
		assciiTo16Segments.put(new Character('l'), VAL_L);
		assciiTo16Segments.put(new Character('m'), VAL_M);
		assciiTo16Segments.put(new Character('n'), VAL_N);
		assciiTo16Segments.put(new Character('o'), VAL_O);
		assciiTo16Segments.put(new Character('p'), VAL_P);
		assciiTo16Segments.put(new Character('q'), VAL_Q);
		assciiTo16Segments.put(new Character('r'), VAL_R);
		assciiTo16Segments.put(new Character('s'), VAL_S);
		assciiTo16Segments.put(new Character('t'), VAL_T);
		assciiTo16Segments.put(new Character('u'), VAL_U);
		assciiTo16Segments.put(new Character('v'), VAL_V);
		assciiTo16Segments.put(new Character('w'), VAL_W);
		assciiTo16Segments.put(new Character('x'), VAL_X);
		assciiTo16Segments.put(new Character('y'), VAL_Y);
		assciiTo16Segments.put(new Character('z'), VAL_Z);
		assciiTo16Segments.put(new Character('{'), VAL_LEFT_BRAC);
		assciiTo16Segments.put(new Character('|'), VAL_OR);
		assciiTo16Segments.put(new Character('}'), VAL_RIGHT_BRAC);
		assciiTo16Segments.put(new Character('~'), VAL_TILDE);
		assciiTo16Segments.put(new Character('|'), VAL_OR);
		
		
		/* 245 x 345 */
		
		segPathMap = new HashMap<Integer, int[]>();

		segPathMap.put(1,  new int[] { 58,	36,  68,  30,  84,  48,  68,  144, 50,  157, 40,  146 });
		segPathMap.put(2,  new int[] { 34,	182, 50,  170, 62,  184, 44,  282, 20,  302, 12,  296 });
		segPathMap.put(3,  new int[] { 202, 48,  224, 30,  230, 36,  212, 144, 196, 160, 184, 146 });
		segPathMap.put(4,  new int[] { 178, 182, 194, 170, 206, 182, 188, 292, 178, 300, 162, 282 });
		segPathMap.put(5,  new int[] { 74, 	24,  82,  16,  130, 18,  140, 30,  122, 44,  92,  44  });
		segPathMap.put(6,  new int[] { 152, 30,  170, 18,  214, 18,  220, 24,  194, 44,  164, 44  });
		segPathMap.put(7,  new int[] { 24, 	308, 50,  286, 82,  284, 94,  298, 76,  314, 30,  314 });
		segPathMap.put(8,  new int[] { 106, 300, 122, 284, 156, 284, 174, 306, 164, 314, 118, 314 });
		segPathMap.put(9,  new int[] { 82, 	82,  88,  52,  112, 78,  120, 158, 104, 148           });
		segPathMap.put(10, new int[] { 128, 48,  146, 36,  156, 48,  148, 106, 124, 154, 120, 108 });
		segPathMap.put(11, new int[] { 162, 78,  196, 54,  190, 86,  150, 146, 128, 158           });
		segPathMap.put(12, new int[] { 58, 	164, 74,  152, 100, 152, 118, 164, 94,  178, 68,  178 });
		segPathMap.put(13, new int[] { 128, 164, 152, 150, 178, 148, 190, 162, 172, 178, 146, 176 });
		segPathMap.put(14, new int[] { 94, 	182, 118, 170, 84,  248, 50,  276, 54,  244           });
		segPathMap.put(15, new int[] { 122, 174, 128, 220, 118, 280, 100, 294, 90,  282, 98,  224 });
		segPathMap.put(16, new int[] { 126, 170, 142, 178, 164, 246, 160, 278, 132, 250           });

		setBackground(ColorsUtil.BG);
		setForeground(ColorConstants.lightGreen);
		
		nbDigits = size;
		
		addPaintListener(
			new PaintListener() {
				@Override
				public void paintControl(PaintEvent e) {
					for (int i= 0; i < nbDigits; i++) {
						if (text.length() > i) {
							e.gc.drawImage(drawAscii(text.charAt(i), 22, 33), e.x + 20*i, e.y);
						}
					}
				}
			}
		);
		
		setText("");
	}
	
	public String getText() {
		return text;
	}
	
	private static int[] vals = new int[] {
		1, 	  2,    4,     8, 
		16,   32,   64,    128, 
		256,  512,  1024,  2048, 
		4096, 8192, 16384, 32768
	};
	
	private Color bgColor = new Color(Display.getDefault(), new RGB(90, 90, 90));
	private Image drawAscii(char c, int w, int h) {
		Display display = Display.getDefault();
		Image buffer = new Image(display, 245, 345);
		GC gc = new GC(buffer);
		gc.setBackground(ColorsUtil.BG);
		gc.setForeground(ColorsUtil.BG);
		gc.fillRectangle(0, 0, 245, 345);
		if (assciiTo16Segments.containsKey(c)) {
			Integer segmentsCode = assciiTo16Segments.get(c);
			for (int i=0;i<16;i++) {
				int seg = vals[i];
				gc.setBackground(bgColor);
				gc.setForeground(bgColor);
				if ((segmentsCode & seg) != 0) {
					gc.setBackground(getForeground());
					gc.setForeground(getForeground());
				}
				gc.fillPolygon(segPathMap.get(i+1));
			}
		}
		Image scaled = new Image(display, w, h);
		
		GC gc2 = new GC(scaled);
		gc2.setAntialias(SWT.ON);
		gc2.setInterpolation(SWT.HIGH);
		gc2.drawImage(
			buffer, 
			0, 
			0, 
			buffer.getBounds().width, 
			buffer.getBounds().height, 
			0, 
			0, 
			w, 
			h
		);
		gc2.dispose();
		
		buffer.dispose();
		
		ImageData data = scaled.getImageData();
		data.transparentPixel = 0;
		gc.dispose();
		
		return scaled;
	}
	
	public void setText(String txt) {
		this.text = txt;
		redraw();
	}
}
