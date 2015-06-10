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

package net.sf.smbt.ui.builder;

import java.util.HashMap;
import java.util.Map;

import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.ResourceType;
import org.drools.io.Resource;
import org.drools.io.ResourceFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

public class DroolsBuilderUtils {
	public final static DroolsBuilderUtils INSTANCE = new DroolsBuilderUtils();
	
	private static final String MARKER_TYPE = "net.sf.smbt.ui.drlProblem";
	
	private Map<IFile, Resource> drlResourcesMap; 
	
	private KnowledgeBuilder kBuilder;

	public DroolsBuilderUtils() {
		kBuilder = null;//QuanticMojo.INSTANCE.getKnowledgeBuilder();
		drlResourcesMap = new HashMap<IFile, Resource>();
	}
	
	public void handleDroolsResourceOnChange(IFile file) {
		deleteMarkers(file);
		addDroolRuleIfNeeded(file);
	}
	
	private void addMarker(IFile file, String message, int lineNumber,
			int severity) {
		try {
			IMarker marker = file.createMarker(MARKER_TYPE);
			marker.setAttribute(IMarker.MESSAGE, message);
			marker.setAttribute(IMarker.SEVERITY, severity);
			if (lineNumber == -1) {
				lineNumber = 1;
			}
			marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
		} catch (CoreException e) {
		}
	}

	private void addDroolRuleIfNeeded(IFile file) {
		synchronized (kBuilder) {
			try {
				String fileName = file.getLocation().toFile().getCanonicalPath();
				Resource drlResource = ResourceFactory.newFileResource(fileName);
				
				if (!drlResourcesMap.containsKey(file)) {
					drlResourcesMap.put(file, drlResource);
					kBuilder.add(drlResource, ResourceType.DRL);
				} 
				
				if (kBuilder.hasErrors()) {
					java.util.Iterator<KnowledgeBuilderError> it =  kBuilder.getErrors().iterator();
					while (it.hasNext()) {
						KnowledgeBuilderError err = it.next();
						int line = err.getLines() != null && err.getLines().length > 0 ? err.getLines()[0] : -1;
						addMarker(file, err.getMessage(), line, err.getSeverity().ordinal());
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private void deleteMarkers(IFile file) {
		try {
			file.deleteMarkers(MARKER_TYPE, false, IResource.DEPTH_ZERO);
		} catch (CoreException ce) {
		}
	}
}