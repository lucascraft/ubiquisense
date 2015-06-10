/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2013, Lucas Bigeardel
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

package net.sf.smbt.ui.video;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public class VideoComposite extends Composite {
    private Browser browser;
    private String htmlContent;
    
	public VideoComposite(Composite parent, int style, String url, int width, int height) {
		super(parent, style);
        
        GridLayoutFactory.fillDefaults().margins(0, 0).spacing(0, 0).applyTo(this);
        GridDataFactory.fillDefaults().grab(true, true).applyTo(this);

        browser = new Browser(this, SWT.NONE);
        GridDataFactory.fillDefaults().grab(true, true).applyTo(browser);

        if (htmlContent != null) {
            browser.setText(htmlContent);
        } else {
            browser.setUrl(url == null ? "http://localhost" : url);
        }
 	}
	
	public void setHTMLContent(final String htmlContent) {
	    this.htmlContent = htmlContent;
	    browser.setText(htmlContent);
	}
	
	public void setVideo(String url) {
		VideoMetadata videoMetadata	= new VideoMetadata("Demo Video", "demo", 720, 500);
		VideoHelper videoHelper 	= new VideoHelper(Display.getDefault());
		String html 				= videoHelper.createHtmlFromURL(videoMetadata, url);
		browser.setText(html);
	}
}
