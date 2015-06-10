/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2010, Lucas Bigeardel
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

package net.sf.smbt.pachube.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTests {
	public final static DateTests INSTANCE = new DateTests();

	public SimpleDateFormat ISO_8601_DATE_FORMAT;

	public DateTests() {
		ISO_8601_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSSSSS'Z'");
		ISO_8601_DATE_FORMAT.setLenient(true);
	}
	
	
	public Date parseDate(SimpleDateFormat sdf, String dateAsText) {
		try {
			return sdf.parse(dateAsText);
		} catch (ParseException e) {
			//e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		String[] dates = new String[]{
			"2012-08-06T09:21:25.727107Z",
			"2011-05-27T17:11:15.271816Z"
		};
		for (String d : dates) {
			Date dt = DateTests.INSTANCE.parseDate(INSTANCE.ISO_8601_DATE_FORMAT, d);
			if (dt == null) {
				System.err.println(d + " --> " + INSTANCE.ISO_8601_DATE_FORMAT.toString());
			} else {
				System.out.println(d + " --> " + INSTANCE.ISO_8601_DATE_FORMAT.toString());
			}
		}
	}
}
