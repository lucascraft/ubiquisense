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
import net.sf.smbt.ui.widgets.common.ImageUtils;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;

public class SevenSegmentsDisplay extends UbiWidget {
	
	//private Font lcdFont;
	
	public final static int[] values = new int[] {
		/* */0x0000, /*!*/0x3001, /*"*/0x2020, /*#*/0x07A4,
		/*$*/0x5BA4, /*%*/0x13DA, /*&*/0x4D68, /*'*/0x0010,
		/*(*/0x0018, /*)*/0x0042, /***/0x01FE, /*+*/0x01A4,
		/*,*/0x0002, /*-*/0x0180, /*.*/0x0001, /*/*/0x0012,
		/*0*/0x7E12, /*1*/0x3010, /*2*/0x6D80, /*3*/0x7880,
		/*4*/0x3380, /*5*/0x4B08, /*6*/0x5F80, /*7*/0x7200,
		/*8*/0x7F80, /*9*/0x7380, /*:*/0x0024, /*;*/0x0022,
		/*<*/0x0118, /*=*/0x0980, /*>*/0x00C2, /*?*/0x6085,
		/*@*/0x6E90, /*A*/0x7780, /*B*/0x78A4, /*C*/0x4E00,
		/*D*/0x7824, /*E*/0x4F00, /*F*/0x4700, /*G*/0x5E80,
		/*H*/0x3780, /*I*/0x4824, /*J*/0x3C00, /*K*/0x0718,
		/*L*/0x0E00, /*M*/0x3650, /*N*/0x3648, /*O*/0x7E00,
		/*P*/0x6780, /*Q*/0x7E08, /*R*/0x6788, /*S*/0x5B80,
		/*T*/0x4024, /*U*/0x3E00, /*V*/0x0612, /*W*/0x360A,
		/*X*/0x005A, /*Y*/0x2384, /*Z*/0x4812, /*[*/0x3098,
		/*\*/0x0048, /*]*/0x0742, /*^*/0x0240, /*_*/0x0800,
		/*`*/0x0040, /*a*/0x0D44, /*b*/0x0F04, /*c*/0x0D00,
		/*d*/0x0D24, /*e*/0x0D02, /*f*/0x40A4, /*g*/0x4B24,
		/*h*/0x0704, /*i*/0x0004, /*j*/0x0422, /*k*/0x003C,
		/*l*/0x0024, /*m*/0x1584, /*n*/0x0504, /*o*/0x1D80,
		/*p*/0x4720, /*q*/0x4324, /*r*/0x0500, /*s*/0x4B04,
		/*t*/0x01A4, /*u*/0x0C04, /*v*/0x0402, /*w*/0x140A,
		/*x*/0x005A, /*y*/0x0054, /*z*/0x0902, /*{*/0x4942,
		/*|*/0x0600, /*}*/0x4898, /*~*/0x0050, /*¦*/0x7FFE
	};
	

	public final static int VAL_NONE 			= values[0];
	public final static int VAL_EXCL 			= values[1];
	public final static int VAL_DBL_QUOT 		= values[2];
	public final static int VAL_DASH			= values[3];
	public final static int VAL_DOLLAR 			= values[4];
	public final static int VAL_PERCENT 		= values[5];
	public final static int VAL_AND 			= values[6];
	public final static int VAL_SMPL_QUOT 		= values[7];
	public final static int VAL_LEFT_PAR 		= values[8];
	public final static int VAL_RIGHT_PAR		= values[9];
	public final static int VAL_STAR 			= values[10];
	public final static int VAL_PLUS 			= values[11];
	public final static int VAL_COMMA 			= values[12];
	public final static int VAL_MINUS 			= values[13];
	public final static int VAL_POINT			= values[14];
	public final static int VAL_SLASH			= values[15];
	public final static int VAL_0				= values[16];
	public final static int VAL_1				= values[17];
	public final static int VAL_2				= values[18];
	public final static int VAL_3				= values[19];
	public final static int VAL_4				= values[20];
	public final static int VAL_5				= values[21];
	public final static int VAL_6				= values[22];
	public final static int VAL_7				= values[23];
	public final static int VAL_8				= values[24];
	public final static int VAL_9				= values[25];
	public final static int VAL_TWO_POINT		= values[26];
	public final static int VAL_POINT_COMMA		= values[27];
	public final static int VAL_LESSER			= values[28];
	public final static int VAL_EQ				= values[29];
	public final static int VAL_GREATER			= values[30];
	public final static int VAL_INTER			= values[31];
	public final static int VAL_AROBASE			= values[32];
	public final static int VAL_A				= values[33];
	public final static int VAL_B				= values[34];
	public final static int VAL_C				= values[35];
	public final static int VAL_D				= values[36];
	public final static int VAL_E				= values[37];
	public final static int VAL_F				= values[38];
	public final static int VAL_G				= values[39];
	public final static int VAL_H				= values[40];
	public final static int VAL_I				= values[41];
	public final static int VAL_J				= values[42];
	public final static int VAL_K				= values[43];
	public final static int VAL_L				= values[44];
	public final static int VAL_M				= values[45];
	public final static int VAL_N				= values[46];
	public final static int VAL_O				= values[47];
	public final static int VAL_P				= values[48];
	public final static int VAL_Q				= values[49];
	public final static int VAL_R				= values[50];
	public final static int VAL_S				= values[51];
	public final static int VAL_T				= values[52];
	public final static int VAL_U				= values[53];
	public final static int VAL_V				= values[54];
	public final static int VAL_W				= values[55];
	public final static int VAL_X				= values[56];
	public final static int VAL_Y				= values[57];
	public final static int VAL_Z				= values[58];
	public final static int VAL_LEFT_SQR_BRAC	= values[59];
	public final static int VAL_ANTI_SLASH		= values[60];
	public final static int VAL_RIGTH_SQR_BRAC	= values[61];
	public final static int VAL_EXP				= values[62];
	public final static int VAL_UNDERSC			= values[63];
	public final static int VAL_MAJ_A			= values[64];
	public final static int VAL_MAJ_B			= values[65];
	public final static int VAL_MAJ_C			= values[66];
	public final static int VAL_MAJ_D			= values[67];
	public final static int VAL_MAJ_E			= values[68];
	public final static int VAL_MAJ_F			= values[69];
	public final static int VAL_MAJ_G			= values[70];
	public final static int VAL_MAJ_H			= values[71];
	public final static int VAL_MAJ_I			= values[72];
	public final static int VAL_MAJ_J			= values[73];
	public final static int VAL_MAJ_K			= values[74];
	public final static int VAL_MAJ_L			= values[75];
	public final static int VAL_MAJ_M			= values[76];
	public final static int VAL_MAJ_N			= values[77];
	public final static int VAL_MAJ_O			= values[78];
	public final static int VAL_MAJ_P			= values[79];
	public final static int VAL_MAJ_Q			= values[80];
	public final static int VAL_MAJ_R			= values[81];
	public final static int VAL_MAJ_S			= values[82];
	public final static int VAL_MAJ_T			= values[83];
	public final static int VAL_MAJ_U			= values[84];
	public final static int VAL_MAJ_V			= values[85];
	public final static int VAL_MAJ_W			= values[86];
	public final static int VAL_MAJ_X			= values[87];
	public final static int VAL_MAJ_Y			= values[88];
	public final static int VAL_MAJ_Z			= values[89];
	public final static int VAL_LEFT_BRAC		= values[90];
	public final static int VAL_OR				= values[91];
	public final static int VAL_RIGHT_BRAC		= values[92];
	public final static int VAL_TILDE			= values[93];
	public final static int VAL_PIPE			= values[94];
	
	public final static String STR_NONE 			= "0_0";
	public final static String STR_EXCL 			= "1_0";
	public final static String STR_DBL_QUOT 		= "2_0";
	public final static String STR_DASH				= "3_0";
	public final static String STR_DOLLAR 			= "4_0";
	public final static String STR_PERCENT 			= "5_0";
	public final static String STR_AND 				= "6_0";
	public final static String STR_SMPL_QUOT 		= "7_0";
	public final static String STR_LEFT_PAR 		= "8_0";
	public final static String STR_RIGHT_PAR		= "9_0";
	public final static String STR_STAR 			= "10_0";
	public final static String STR_PLUS 			= "11_0";
	public final static String STR_COMMA 			= "12_0";
	public final static String STR_MINUS 			= "13_0";
	public final static String STR_POINT			= "14_0";
	public final static String STR_SLASH			= "15_0";
	public final static String STR_0				= "0_1";
	public final static String STR_1				= "1_1";
	public final static String STR_2				= "2_1";
	public final static String STR_3				= "3_1";
	public final static String STR_4				= "4_1";
	public final static String STR_5				= "5_1";
	public final static String STR_6				= "6_1";
	public final static String STR_7				= "7_1";
	public final static String STR_8				= "8_1";
	public final static String STR_9				= "9_1";
	public final static String STR_TWO_POINT		= "10_1";
	public final static String STR_POINT_COMMA		= "11_1";
	public final static String STR_LESSER			= "12_1";
	public final static String STR_EQ				= "13_1";
	public final static String STR_GREATER			= "14_1";
	public final static String STR_INTER			= "15_1";
	public final static String STR_AROBASE			= "0_4";
	public final static String STR_A				= "1_4";
	public final static String STR_B				= "2_4";
	public final static String STR_C				= "3_4";
	public final static String STR_D				= "4_4";
	public final static String STR_E				= "5_4";
	public final static String STR_F				= "6_4";
	public final static String STR_G				= "7_4";
	public final static String STR_H				= "8_4";
	public final static String STR_I				= "9_4";
	public final static String STR_J				= "10_4";
	public final static String STR_K				= "11_4";
	public final static String STR_L				= "12_4";
	public final static String STR_M				= "13_4";
	public final static String STR_N				= "14_4";
	public final static String STR_O				= "15_4";
	public final static String STR_P				= "0_3";
	public final static String STR_Q				= "1_3";
	public final static String STR_R				= "2_3";
	public final static String STR_S				= "3_3";
	public final static String STR_T				= "4_3";
	public final static String STR_U				= "5_3";
	public final static String STR_V				= "6_3";
	public final static String STR_W				= "7_3";
	public final static String STR_X				= "8_3";
	public final static String STR_Y				= "9_3";
	public final static String STR_Z				= "10_3";
	public final static String STR_LEFT_SQR_BRAC	= "11_3";
	public final static String STR_ANTI_SLASH		= "12_3";
	public final static String STR_RIGTH_SQR_BRAC	= "13_3";
	public final static String STR_EXP				= "14_3";
	public final static String STR_UNDERSC			= "15_3";
	public final static String STR_MAJ_A			= "1_2";
	public final static String STR_MAJ_B			= "2_2";
	public final static String STR_MAJ_C			= "3_2";
	public final static String STR_MAJ_D			= "4_2";
	public final static String STR_MAJ_E			= "5_2";
	public final static String STR_MAJ_F			= "6_2";
	public final static String STR_MAJ_G			= "7_2";
	public final static String STR_MAJ_H			= "8_2";
	public final static String STR_MAJ_I			= "9_2";
	public final static String STR_MAJ_J			= "10_2";
	public final static String STR_MAJ_K			= "11_2";
	public final static String STR_MAJ_L			= "12_2";
	public final static String STR_MAJ_M			= "13_2";
	public final static String STR_MAJ_N			= "14_2";
	public final static String STR_MAJ_O			= "15_2";
	public final static String STR_MAJ_P			= "0_3";
	public final static String STR_MAJ_Q			= "1_3";
	public final static String STR_MAJ_R			= "2_3";
	public final static String STR_MAJ_S			= "3_3";
	public final static String STR_MAJ_T			= "4_3";
	public final static String STR_MAJ_U			= "5_3";
	public final static String STR_MAJ_V			= "6_3";
	public final static String STR_MAJ_W			= "7_3";
	public final static String STR_MAJ_X			= "8_3";
	public final static String STR_MAJ_Y			= "9_3";
	public final static String STR_MAJ_Z			= "10_3";
	public final static String STR_LEFT_BRAC		= "11_3";
	public final static String STR_OR				= "10_1";
	public final static String STR_RIGHT_BRAC		= "13_3";
	public final static String STR_TILDE			= "13_4";
	public final static String STR_PIPE				= "13_5";
	

	private Map<Character, Integer> assciiTo16Segments;
	private Map<Character, String> assciiTo16SegmentsSuffix;
	
	public Map<Character, String> getAssciiTo16SegmentsSuffixMap() {
		return assciiTo16SegmentsSuffix;
	}

	private int nbDigits;
	private String text;
	private Image[] digitsImages;
	private Map<Character, String> digitsSuffixMap;
	public SevenSegmentsDisplay(Composite parent, int size, int style) {
		super(parent, style);

		assciiTo16Segments = new HashMap<Character, Integer>();
		assciiTo16Segments.put(new Character(' '), VAL_NONE);
		assciiTo16Segments.put(new Character('!'), VAL_EXCL);
		assciiTo16Segments.put(new Character('"'), VAL_DBL_QUOT);
		assciiTo16Segments.put(new Character('#'), VAL_DASH);
		assciiTo16Segments.put(new Character('$'), VAL_DOLLAR);
		assciiTo16Segments.put(new Character('%'), VAL_PERCENT);
		assciiTo16Segments.put(new Character('&'), VAL_AND);
		//assciiTo16Segments.put(new Character('\''), VAL_SMPL_QUOT);
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
		//assciiTo16Segments.put(new Character('\''), VAL_SMPL_QUOT);
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
		
		assciiTo16SegmentsSuffix = new HashMap<Character, String>();
		assciiTo16SegmentsSuffix.put(new Character(' '), STR_NONE);
		assciiTo16SegmentsSuffix.put(new Character('!'), STR_EXCL);
		assciiTo16SegmentsSuffix.put(new Character('"'), STR_DBL_QUOT);
		assciiTo16SegmentsSuffix.put(new Character('#'), STR_DASH);
		assciiTo16SegmentsSuffix.put(new Character('$'), STR_DOLLAR);
		assciiTo16SegmentsSuffix.put(new Character('%'), STR_PERCENT);
		assciiTo16SegmentsSuffix.put(new Character('&'), STR_AND);
		//assciiTo16SegmentsSuffix.put(new Character('\''), STR_SMPL_QUOT);
		assciiTo16SegmentsSuffix.put(new Character('('), STR_LEFT_PAR);
		assciiTo16SegmentsSuffix.put(new Character(')'), STR_RIGHT_PAR);
		assciiTo16SegmentsSuffix.put(new Character('*'), STR_STAR);
		assciiTo16SegmentsSuffix.put(new Character('+'), STR_PLUS);
		assciiTo16SegmentsSuffix.put(new Character(','), STR_COMMA);
		assciiTo16SegmentsSuffix.put(new Character('-'), STR_MINUS);
		assciiTo16SegmentsSuffix.put(new Character('.'), STR_POINT);
		assciiTo16SegmentsSuffix.put(new Character('/'), STR_SLASH);
		assciiTo16SegmentsSuffix.put(new Character('0'), STR_0);
		assciiTo16SegmentsSuffix.put(new Character('1'), STR_1);
		assciiTo16SegmentsSuffix.put(new Character('2'), STR_2);
		assciiTo16SegmentsSuffix.put(new Character('3'), STR_3);
		assciiTo16SegmentsSuffix.put(new Character('4'), STR_4);
		assciiTo16SegmentsSuffix.put(new Character('5'), STR_5);
		assciiTo16SegmentsSuffix.put(new Character('6'), STR_6);
		assciiTo16SegmentsSuffix.put(new Character('7'), STR_7);
		assciiTo16SegmentsSuffix.put(new Character('8'), STR_8);
		assciiTo16SegmentsSuffix.put(new Character('9'), STR_9);
		assciiTo16SegmentsSuffix.put(new Character(':'), STR_TWO_POINT);
		assciiTo16SegmentsSuffix.put(new Character(';'), STR_POINT_COMMA);
		assciiTo16SegmentsSuffix.put(new Character('<'), STR_LESSER);
		assciiTo16SegmentsSuffix.put(new Character('='), STR_EQ);
		assciiTo16SegmentsSuffix.put(new Character('>'), STR_GREATER);
		assciiTo16SegmentsSuffix.put(new Character('?'), STR_INTER);
		assciiTo16SegmentsSuffix.put(new Character('@'), STR_AROBASE);
		assciiTo16SegmentsSuffix.put(new Character('A'), STR_MAJ_A);
		assciiTo16SegmentsSuffix.put(new Character('B'), STR_MAJ_B);
		assciiTo16SegmentsSuffix.put(new Character('C'), STR_MAJ_C);
		assciiTo16SegmentsSuffix.put(new Character('D'), STR_MAJ_D);
		assciiTo16SegmentsSuffix.put(new Character('E'), STR_MAJ_E);
		assciiTo16SegmentsSuffix.put(new Character('F'), STR_MAJ_F);
		assciiTo16SegmentsSuffix.put(new Character('G'), STR_MAJ_G);
		assciiTo16SegmentsSuffix.put(new Character('H'), STR_MAJ_H);
		assciiTo16SegmentsSuffix.put(new Character('I'), STR_MAJ_I);
		assciiTo16SegmentsSuffix.put(new Character('J'), STR_MAJ_J);
		assciiTo16SegmentsSuffix.put(new Character('K'), STR_MAJ_K);
		assciiTo16SegmentsSuffix.put(new Character('L'), STR_MAJ_L);
		assciiTo16SegmentsSuffix.put(new Character('M'), STR_MAJ_M);
		assciiTo16SegmentsSuffix.put(new Character('N'), STR_MAJ_N);
		assciiTo16SegmentsSuffix.put(new Character('O'), STR_MAJ_O);
		assciiTo16SegmentsSuffix.put(new Character('P'), STR_MAJ_P);
		assciiTo16SegmentsSuffix.put(new Character('Q'), STR_MAJ_Q);
		assciiTo16SegmentsSuffix.put(new Character('R'), STR_MAJ_R);
		assciiTo16SegmentsSuffix.put(new Character('S'), STR_MAJ_S);
		assciiTo16SegmentsSuffix.put(new Character('T'), STR_MAJ_T);
		assciiTo16SegmentsSuffix.put(new Character('U'), STR_MAJ_U);
		assciiTo16SegmentsSuffix.put(new Character('V'), STR_MAJ_V);
		assciiTo16SegmentsSuffix.put(new Character('W'), STR_MAJ_W);
		assciiTo16SegmentsSuffix.put(new Character('X'), STR_MAJ_X);
		assciiTo16SegmentsSuffix.put(new Character('Y'), STR_MAJ_Y);
		assciiTo16SegmentsSuffix.put(new Character('Z'), STR_MAJ_Z);
		assciiTo16SegmentsSuffix.put(new Character('['), STR_LEFT_SQR_BRAC);
		assciiTo16SegmentsSuffix.put(new Character('\\'), STR_ANTI_SLASH);
		assciiTo16SegmentsSuffix.put(new Character(']'), STR_RIGTH_SQR_BRAC);
		assciiTo16SegmentsSuffix.put(new Character('^'), STR_EXP);
		assciiTo16SegmentsSuffix.put(new Character('_'), STR_UNDERSC);
		//assciiTo16SegmentsSuffix.put(new Character('‘'), STR_SMPL_QUOT);
		assciiTo16SegmentsSuffix.put(new Character('a'), STR_A);
		assciiTo16SegmentsSuffix.put(new Character('b'), STR_B);
		assciiTo16SegmentsSuffix.put(new Character('c'), STR_C);
		assciiTo16SegmentsSuffix.put(new Character('d'), STR_D);
		assciiTo16SegmentsSuffix.put(new Character('e'), STR_E);
		assciiTo16SegmentsSuffix.put(new Character('f'), STR_F);
		assciiTo16SegmentsSuffix.put(new Character('g'), STR_G);
		assciiTo16SegmentsSuffix.put(new Character('h'), STR_H);
		assciiTo16SegmentsSuffix.put(new Character('i'), STR_I);
		assciiTo16SegmentsSuffix.put(new Character('j'), STR_J);
		assciiTo16SegmentsSuffix.put(new Character('k'), STR_K);
		assciiTo16SegmentsSuffix.put(new Character('l'), STR_L);
		assciiTo16SegmentsSuffix.put(new Character('m'), STR_M);
		assciiTo16SegmentsSuffix.put(new Character('n'), STR_N);
		assciiTo16SegmentsSuffix.put(new Character('o'), STR_O);
		assciiTo16SegmentsSuffix.put(new Character('p'), STR_P);
		assciiTo16SegmentsSuffix.put(new Character('q'), STR_Q);
		assciiTo16SegmentsSuffix.put(new Character('r'), STR_R);
		assciiTo16SegmentsSuffix.put(new Character('s'), STR_S);
		assciiTo16SegmentsSuffix.put(new Character('t'), STR_T);
		assciiTo16SegmentsSuffix.put(new Character('u'), STR_U);
		assciiTo16SegmentsSuffix.put(new Character('v'), STR_V);
		assciiTo16SegmentsSuffix.put(new Character('w'), STR_W);
		assciiTo16SegmentsSuffix.put(new Character('x'), STR_X);
		assciiTo16SegmentsSuffix.put(new Character('y'), STR_Y);
		assciiTo16SegmentsSuffix.put(new Character('z'), STR_Z);
		assciiTo16SegmentsSuffix.put(new Character('{'), STR_LEFT_BRAC);
		assciiTo16SegmentsSuffix.put(new Character('|'), STR_OR);
		assciiTo16SegmentsSuffix.put(new Character('}'), STR_RIGHT_BRAC);
		assciiTo16SegmentsSuffix.put(new Character('~'), STR_TILDE);
		assciiTo16SegmentsSuffix.put(new Character('|'), STR_OR);

		setBackground(ColorsUtil.BG);
		setForeground(ColorConstants.lightGreen);
		
		nbDigits = size;
		digitsSuffixMap = getAssciiTo16SegmentsSuffixMap();
		digitsImages = new Image[size];
		
		addPaintListener(
			new PaintListener() {
				@Override
				public void paintControl(PaintEvent e) {
					int w = getClientArea().width/nbDigits;
					for (int i= 0; i < nbDigits; i++) {
						if (w > digitsImages[i].getBounds().width) {
							w = digitsImages[i].getBounds().width;
						}
						if (text.length() <= nbDigits) {
							e.gc.drawImage(digitsImages[i], e.x + w*i, e.y);
						}
					}
				}
			}
		);
		setText("00000");
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String txt) {
		this.text = String.format("%0"+nbDigits+"d", Integer.parseInt(txt));
		if (text.length() <= nbDigits) {
			for (int i= 0; i < text.length(); i++) {
				Character c = new Character(text.charAt(i));
				if (digitsSuffixMap.containsKey(c)) {
					digitsImages[i] = ImageUtils.INSTANCE.getSixteenDigitImage(digitsSuffixMap.get(c));
				}
			}
		}
		redraw();
	}
}
