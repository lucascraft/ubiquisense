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

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;

import net.sf.smbt.ui.widgets.Activator;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.osgi.framework.Bundle;

public class VideoHelper {
	
	public final static VideoHelper INSTANCE = new VideoHelper();
	
    private static final String SOURCE_TAG = "<source src=\"%s\" type='%s' />\n"; 
    private static final String HTML_TEMPLATE = "<html><head><title>[@title@]</title><link rel=\"stylesheet\" href=\"[@playerPath@]video-js.min.css\" ><script src=\"[@playerPath@]video.min.js\"></script><script>_V_.options.flash.swf=\"[@playerPath@]video-js.swf\";</script></head><body><div class=\"video-js-box\" style=\"width:[@width@]px; height:[@height@]px; margin:0 auto;\"><video id=\"video_demo\" class=\"video-js vjs-default-skin\" controls width=\"[@width@]\" height=\"[@height@]\" autoplay preload=\"auto\" data-setup=\"{}\">[@sources@]</video></div></body></html>"; 

    private static final int VIDEO_DIALOG_VERTICAL_PADDING		= 50;
    private static final int VIDEO_DIALOG_HORIZONTAL_PADDING	= 25;
    private final Display display;

    public VideoHelper() {
        this.display = Display.getDefault();
    }

    public VideoHelper(final Display display) {
        this.display = display;
    }

    public void playVideo(final VideoMetadata assignedVideo) {
        Assert.isNotNull(assignedVideo);
        VideoDialog videoDialog	= createVideoDialog(assignedVideo);
        String htmlForVideo 	= createHtmlForVideo(assignedVideo);
        videoDialog.setHTMLContent(htmlForVideo);
        videoDialog.open();
    }

    protected VideoDialog createVideoDialog(final VideoMetadata assignedVideo) {
        int dialogWidth = assignedVideo.getFrameWidth() + 2 * VIDEO_DIALOG_HORIZONTAL_PADDING;
        int dialogHeight = assignedVideo.getFrameHeight() + 2 * VIDEO_DIALOG_VERTICAL_PADDING;
        return new VideoDialog(new Shell(display), assignedVideo.getTitle(), dialogWidth, dialogHeight);
    }

    public String createHtmlFromURL(final VideoMetadata assignedVideo, String url) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("title", assignedVideo.getTitle()); 
        hashMap.put("width", Integer.toString(assignedVideo.getFrameWidth())); 
        hashMap.put("height", Integer.toString(assignedVideo.getFrameHeight())); 
        hashMap.put("sources", createSourcesHtml(url)); 
        hashMap.put("playerPath", getPlayerPath()); 
        hashMap.put("videoPath", url); 
        return createHtml(HTML_TEMPLATE, hashMap);
    }

    public String createHtmlForVideo(final VideoMetadata assignedVideo) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("title", assignedVideo.getTitle()); 
        hashMap.put("width", Integer.toString(assignedVideo.getFrameWidth())); 
        hashMap.put("height", Integer.toString(assignedVideo.getFrameHeight())); 
        hashMap.put("sources", createSourcesHtml(getUrl(), assignedVideo)); 
        hashMap.put("playerPath", getPlayerPath()); 
        hashMap.put("videoPath", getUrl()); 
        return createHtml(HTML_TEMPLATE, hashMap);
    }
    
	public String getPlayerPath() {
		Bundle bundle = Platform.getBundle(Activator.getDefault().getBundle().getSymbolicName());
		
		File f = null;
		try {
		    URL entryURL = bundle.getEntry("/res");
		    URL fileUrl = FileLocator.toFileURL(entryURL);
		    java.net.URI fileUri = FileLocator.resolve(fileUrl).toURI();
		        
		    System.out.println("---> " + fileUri.getRawPath());
		        
		    f = new File(fileUri);
		        
		    if (f != null) {
		        System.out.println("File : " + f.getCanonicalPath());
		        return f.getCanonicalPath() + "/";
		    }
		} catch(URISyntaxException e1) {
			e1.printStackTrace();
		} catch(IOException e2) {
			e2.printStackTrace();
		}
		return "";
	}
    
    private String getUrl() {
    	return getPlayerPath();
    }
    
    protected String createSourcesHtml(final String url) {
        StringBuilder sb = new StringBuilder();
                sb.append(String.format(SOURCE_TAG, url,
                		"video/mp4"));
        return sb.toString();
    }

    protected String createSourcesHtml(final String videoPath, final VideoMetadata assignedVideo) {
        StringBuilder sb = new StringBuilder();
                sb.append(String.format(SOURCE_TAG, videoPath + assignedVideo.getFilename()+".m4v",
                		"video/mp4"));
                sb.append(String.format(SOURCE_TAG, videoPath + assignedVideo.getFilename()+".webm",
                		"video/webm"));               
        return sb.toString();
    }

    protected String createHtml(String template, final HashMap<String, String> hashMap) {
        for (String key : hashMap.keySet()) {
            template = template.replace("[@" + key + "@]", hashMap.get(key)); 
        }
        return template;
    }
}
