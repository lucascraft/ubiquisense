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

package net.sf.smbt.ui.controls;

import net.sf.smbt.ui.widgets.vu.SevenSegmentsDisplay;
import net.sf.smbt.ui.widgets.vu.SixteenSegmentsDisplay;
import net.sf.smbt.ui.widgets.vu.UbiDbMeter;
import net.sf.smbt.ui.widgets.vu.UbiKnob;
import net.sf.smbt.ui.widgets.vu.UbiSlider;
import net.sf.smbt.ui.widgets.vu.UbiVuMeter;

import org.eclipse.swt.widgets.Composite;

public class UbiWidgetFactory {
	
	public final static UbiWidgetFactory INSTANCE = new UbiWidgetFactory();
	
	//
	// Emitting
	//
	
	public UbiSlider createUbiSlider(Composite parent, int style) {
		return new UbiSlider(parent, style);
	}

	public UbiKnob createUbiKnob(Composite parent, int style) {
		return new UbiKnob(parent, style);
	}

	public UbiVuMeter createUbiVuMeter(Composite parent, int style) {
		return new UbiVuMeter(parent, style);
	}
	
	public UbiDbMeter createUbiDbMeter(Composite parent, int style) {
		return new UbiDbMeter(parent, style);
	}
	
	public SevenSegmentsDisplay createUbiSevenSegmentsDisplay(Composite parent, int size, int style) {
		return new SevenSegmentsDisplay(parent, size, style);
	}
	
	public SixteenSegmentsDisplay createUbiSixteenSegmentsDisplay(Composite parent, int size, int style) {
		return new SixteenSegmentsDisplay(parent, size, style);
	}


	
	
}
