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

package net.sf.smbt.ui.widgets.common;

import net.sf.smbt.ui.pachube.gmap.LatLng;

public class GeoUtils {
	public enum Dist {
		KM,
		MILES
	}
	public static double distFromInKM(double lat1, double lng1, double lat2, double lng2) {
		return distFrom(lat1, lng1, lat2, lng2, Dist.KM);
	}
	public static double distFromInMiles(double lat1, double lng1, double lat2, double lng2) {
		return distFrom(lat1, lng1, lat2, lng2, Dist.MILES);
	}
	public static double distFrom(double lat1, double lng1, double lat2, double lng2, Dist d) {
	    double earthRadiusKm	= 6378.13; // km
	    double earthRadiusMiles = 3958.75; // miles
	    double dLat = Math.toRadians(lat2-lat1);
	    double dLng = Math.toRadians(lng2-lng1);
	    double sindLat = Math.sin(dLat / 2);
	    double sindLng = Math.sin(dLng / 2);
	    double a = Math.pow(sindLat, 2) + Math.pow(sindLng, 2) * Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2));
	    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
	    double dist = (d == Dist.KM) ? (earthRadiusKm * c) : (earthRadiusMiles * c);
	    return dist;
	}
	public static LatLng stringToLatLng( final String input ) {
	    LatLng result = null;
	    if( input != null ) {
	      String temp[] = input.split( "," );
	      if( temp.length == 2 ) {
	        try {
	          double lat = Double.parseDouble( temp[ 0 ] );
	          double lon = Double.parseDouble( temp[ 1 ] );
	          result = new LatLng( lat, lon );
	        } catch ( NumberFormatException ex ) {
	        }
	      }
	    }
	    return result;
	}
}
