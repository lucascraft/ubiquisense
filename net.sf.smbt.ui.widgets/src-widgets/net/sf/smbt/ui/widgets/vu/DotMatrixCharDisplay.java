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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.smbt.ui.widgets.leds.DotMatrixUtils;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;

public class DotMatrixCharDisplay extends Canvas {
	
	private Map<Integer, List<Character>> linesArrays;
	private int charsetID;

	public DotMatrixCharDisplay(Composite parent) {
		this(parent, DotMatrixUtils.DOT_MATRIX_CHAR_5X7_DIM);
	}
	public DotMatrixCharDisplay(Composite parent, int charsetID) {
		super(parent, SWT.NONE);
		
		this.charsetID = charsetID;
		
		linesArrays = new HashMap<Integer, List<Character>>();
		
		addPaintListener(new PaintListener() {
			@Override
			public void paintControl(PaintEvent e) {
				paintMatrix(e);
			}
		});
	}

	public void setText(String text) {
		setText(0, 0, text);
	}
	public void setText(int line, String text) {
		setText(line, 0, text);
	}
	public void setText(int line, int col, String text) {
		List<Character> chars = new ArrayList<Character>();
		if (text != null && !text.equals("")) {
			if (!linesArrays.containsKey(new Integer(line))) {
				linesArrays.put(new Integer(line), chars);
			}
			for (int i=0;(i<text.length());i++) {
				chars.add(new Character(text.charAt(i)));
			}
		}
		linesArrays.put(new Integer(line), chars);
		redraw();
	}
	
	private void paintMatrix(PaintEvent e) {
		GC gc = e.gc;
		
		e.gc.setForeground(getForeground());
		e.gc.setBackground(getForeground());
		
		int l = 0;
		for (List<Character> line : linesArrays.values()) {
			int c = 0;
			for (Character d : line) {
				DotMatrixUtils.INSTANCE.drawChar(2, 1, charsetID, l, c, gc, d);
				c++;
			}
			l++;
		}
	}
}
