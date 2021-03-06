/*******************************************************************************
 * Copyright (c) 2010 EclipseSource and others. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   EclipseSource - initial API and implementation
 ******************************************************************************/
package net.sf.smbt.ui.pachube.gmap;


public interface MapListener {

  public void addressResolved();

  public void centerChanged();

  public void zoomChanged();
  
  public void markerSelected(String id);

}
