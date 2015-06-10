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

import net.sf.smbt.ui.widgets.common.ImageUtils;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.progress.UIJob;

public class DotMatrixDisplay extends Canvas {
	
	Object lock = new Object();
	
	class AnimationJob extends UIJob {
		public AnimationJob() {
			super("Matrix Animation Job");
		}
		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			synchronized (lock) {
				if (getCurrentID() != null && !getCurrentID().equals("")) {
					if (imageMap.containsKey(getCurrentID())) {
						List<LocatedImage> images = imageMap.get(getCurrentID());
						if (images != null && getCurrentImage() != null && images.contains(getCurrentImage())) {
							int index = images.indexOf(getCurrentImage());
							if (index == images.size() - 1) {
								setCurrentImage(images.get(0));
							} else {
								setCurrentImage(images.get(index+1));
							}
							redraw();
						}
					}
				} else {
					if (!imageMap.keySet().isEmpty()) {
						setCurrentID(imageMap.keySet().iterator().next());
						schedule();
					}
				}
			}
			schedule(125);
			return Status.OK_STATUS;
		}
	}
	
	public class LocatedImage {
		private Point point;
		private Image image;
		public Image getImage() {
			return image;
		}
		public Point getPoint() {
			return point;
		}
		public void setImage(Image image) {
			this.image = image;
		}
		public void setPoint(Point point) {
			this.point = point;
		}
		public LocatedImage(Point point, Image image) {
			this.point = point;
			this.image = image;
		}
	}
	
	private volatile LocatedImage currentImage;
	private String currentID;
	
	public void setCurrentID(String currentID) {
		this.currentID = currentID;
	}
	
	public String getCurrentID() {
		return currentID;
	}
	
	public void setCurrentImage(LocatedImage currentImage) {
		this.currentImage = currentImage;
	}
	
	public LocatedImage getCurrentImage() {
		return currentImage;
	}
	
	private Map<String, List<LocatedImage>> imageMap; 
	
	public void setImage(String id, List<LocatedImage> images) {
		imageMap.put(id, images);
	}
	
	public List<LocatedImage> getImages(String id) {
		return imageMap.get(id);
	}

	private AnimationJob uiJob;
	private Map<String, Image> imgDataPixelateMap;
	
	public DotMatrixDisplay(Composite parent) {
		super(parent, SWT.DOUBLE_BUFFERED);

		imgDataPixelateMap = new HashMap<String, Image>();
		imageMap 	= new HashMap<String, List<LocatedImage>>();
		uiJob		= new AnimationJob();
		addPaintListener(new PaintListener() {
			@Override
			public void paintControl(PaintEvent e) {
				paintMatrix(e);
			}
		});
	}
	
	public void animate() {
		uiJob.schedule();
	}
	
	public void stop() {
		uiJob.cancel();
	}
	
	public AnimationJob getUiJob() {
		return uiJob;
	}

	public void handleImage(String ID, Image... images) {
		for (Image img : images) {
			if (imageMap.keySet().contains(ID)) {
				if (imageMap.get(ID) != null) {
					boolean toInsert = false;
					for (LocatedImage image : imageMap.get(ID)) {
						if (image.getImage().equals(img)) {
							toInsert = true;
							break;
						}
					}
					if (toInsert) {
						imageMap.get(ID).add(new LocatedImage(new Point(0, 0), img));
					}
					if (getCurrentImage() == null) {
						setCurrentImage(imageMap.get(ID).get(0));
					}

				}
			} else {
				List<DotMatrixDisplay.LocatedImage> lst = new ArrayList<DotMatrixDisplay.LocatedImage>();
				lst.add(new LocatedImage(new Point(0, 0), img));
				imageMap.put(ID,  lst);
				if (getCurrentImage() == null) {
					setCurrentImage(lst.get(0));
				}
			}
		}
	}
	
	public void handleImage(String ID, ImageData... images) {
		for (ImageData img : images) {
			if (imageMap.keySet().contains(ID)) {
				if (imageMap.get(ID) != null) {
					boolean toInsert = false;
					for (LocatedImage image : imageMap.get(ID)) {
						if (!image.getImage().equals(img)) {
							toInsert = true;
							break;
						}
					}
					if (toInsert) {
						imageMap.get(ID).add(new LocatedImage(new Point(0, 0), new Image(Display.getDefault(), img)));
					}
					if (getCurrentImage() == null) {
						setCurrentImage(imageMap.get(ID).get(0));
					}

				}
			} else {
				List<DotMatrixDisplay.LocatedImage> lst = new ArrayList<DotMatrixDisplay.LocatedImage>();
				lst.add(new LocatedImage(new Point(0, 0), new Image(Display.getDefault(), img)));
				imageMap.put(ID,  lst);
				if (getCurrentImage() == null) {
					setCurrentImage(lst.get(0));
				}
			}
		}
	}

	
	public void handleImage(String pt, List<LocatedImage> images) {
		if (!imageMap.keySet().contains(pt)) {
			imageMap.put(pt, new ArrayList<DotMatrixDisplay.LocatedImage>());
		}			
		for (LocatedImage img : images) {
			if (imageMap.get(pt) != null && !imageMap.get(pt).contains(img)) {
				imageMap.get(pt).add(img);	
			}
		}
	}
	
	

	public Image getPixelizedImageData(Image img, int pix, Dimension margins) {
		String key = img.toString() + "_" + pix + "_" + margins.width + "-" + margins.height;
		if (imgDataPixelateMap.containsKey(key)) {
			return imgDataPixelateMap.get(key);
		} else {
			System.out.println("-> houla up, barb truc : " + key);
			return imgDataPixelateMap.put(key, new Image(Display.getDefault(), ImageUtils.INSTANCE.pixelateSwt2LCD(
						img, 
						4, 
						new Dimension(1, 1)
					)
				)
			);
		}
	}
	
	private synchronized void paintMatrix(PaintEvent e) {
		GC gc = e.gc;
		e.gc.setForeground(getForeground());
		e.gc.setBackground(getForeground());
		synchronized (lock) {
			if (currentImage != null) {
				Image img = getPixelizedImageData(
					currentImage.getImage(), 
					4, 
					new Dimension(1, 1)
				);
				if (img != null) {
					Point pt = currentImage.getPoint();
					gc.drawImage(img, pt.x, pt.y);
				}
			}
		}
	}
}
