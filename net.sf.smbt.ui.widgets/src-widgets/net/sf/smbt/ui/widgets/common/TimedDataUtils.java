/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2015, Lucas Bigeardel
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

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;

import net.sf.smbt.ui.widgets.utils.SelfTimedRange;
import net.sf.smbt.ui.widgets.utils.TimeDuration;
import net.sf.smbt.ui.widgets.utils.TimedValue;

public class TimedDataUtils {
	
	public final static TimedDataUtils INSTANCE = new TimedDataUtils();
	
	public Collection<TimedValue> timeValuesList;
	private Random randomTime;
	private Random randomValue;
	private SimpleDateFormat ISO_8601_READABLE_DATE_FORMAT;

	
	public TimedDataUtils() {
		timeValuesList = new ArrayList<TimedValue>();
		randomTime = new Random(3600);
		randomValue = new Random(1000);
		ISO_8601_READABLE_DATE_FORMAT	= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss");
	}
	
	public SelfTimedRange<TimedValue> genRandomTimeValues() {
		
		
		Date startDate = new Date(System.currentTimeMillis());
		
		List<TimedValue> lstTV = new ArrayList<TimedValue>();
		long range = 0;
		for (int i=0;i<1000;i++) { // 1000 samples
			TimedValue v = new TimedValue(randomValue.nextFloat() * 1000, startDate);
			lstTV.add(v);
			long current = startDate.getTime();
			long step = Float.valueOf(randomTime.nextFloat() * 100000).longValue();
			range += step;
			current += step;
			startDate.setTime(current);
			
			System.out.println("[" + ISO_8601_READABLE_DATE_FORMAT.format(v.getD()) + ":" + v.getV() + "]");
		}
		
		SelfTimedRange<TimedValue> str = new SelfTimedRange<TimedValue>(range);

		for (TimedValue tv : lstTV) { 
			str.setTimedValue(tv);
		}
		
		System.out.println("From " + ISO_8601_READABLE_DATE_FORMAT.format(str.getFirstDate()));
		System.out.println("From " + ISO_8601_READABLE_DATE_FORMAT.format(str.getLastDate()));

		
		return str;
	}

}
