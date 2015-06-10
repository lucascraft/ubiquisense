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
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public class UbiButton extends UbiWidget2 {
	boolean toggle;
	boolean selected;
	
	private List<UbiSelectionListener> listeners;

	public UbiButton(Composite parent) {
		super(parent, SWT.NONE);
		listeners = new ArrayList<UbiSelectionListener>();
		selected = false;
		addMouseListener(
			new MouseListener() {
				@Override
				public void mouseUp(MouseEvent e) {}
				@Override
				public void mouseDown(MouseEvent e) {
					fireSelection();
					selected = !selected;
					redraw();
				}
				@Override
				public void mouseDoubleClick(MouseEvent e) {}
			}
		);
		addPaintListener(new PaintListener() {
			@Override
			public void paintControl(PaintEvent e) {
				Image img = getImage();
				if (img != null) {
					GC gc = e.gc;
					if (selected) {
						ImageData fullImageData = img.getImageData();
						int width	= fullImageData.width;
					    int height 	= fullImageData.height;
					    byte[] alphaData = new byte[height * width];
					    for(int y=0;y<height;y++){
					        byte[] alphaRow = new byte[width];
					        for(int x=0;x<width;x++){
					            alphaRow[x] = (byte) ((255 * y) /height);
					        }
					        System.arraycopy(alphaRow,0,alphaData,y*width,width);
					    }
					    fullImageData.alphaData = alphaData;
 					    img = new Image(Display.getDefault(), fullImageData);					
					 }
					Rectangle rect	= getClientArea();
					Rectangle size = img.getBounds();
					gc.drawImage(img, rect.x / 2 - size.x / 2, rect.y / 2 - size.y / 2);
				}
			}
		});
	}
	public boolean getSelection() {
		return selected;
	}
	public void setSelection(boolean status) {
		selected = status;
	}
	private void fireSelection() {
		for (UbiSelectionListener l : listeners) {
			l.handle();
		}
	}
	public void addSelectionListener(UbiSelectionListener listener) {
		listeners.add(listener);
	}
	public void removeSelectionListener(UbiSelectionListener listener) {
		listeners.remove(listener);
	}
}
