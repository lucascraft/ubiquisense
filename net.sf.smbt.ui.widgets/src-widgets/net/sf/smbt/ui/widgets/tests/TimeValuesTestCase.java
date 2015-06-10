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

package net.sf.smbt.ui.widgets.tests;

import java.util.Date;

import net.sf.smbt.ui.widgets.utils.SelfTimedRange;
import net.sf.smbt.ui.widgets.utils.TimeDuration;
import net.sf.smbt.ui.widgets.utils.TimedValue;
import net.sf.smbt.ui.widgets.utils.TimedValuesUtils;

public class TimeValuesTestCase { //extends TestCase {
	private Date now;

	public TimeValuesTestCase() {
		now = new Date();
	}
	
	@SuppressWarnings("unused")
	public void testTimedValueCreation() {
		TimedValue v1 = new TimedValue(0f, now);
		////Assert.assertNotNull("Timed value should have been non null, that's frankly very likely to be a big problem ... ;-)", v1);
		
		TimedValue v2 = TimedValuesUtils.INSTANCE.createTimedValue(0);
		//Assert.assertNotNull("Timed value should have been non null, that's frankly very likely to be a big problem ... ;-)", v2);

		TimedValue v3 = TimedValuesUtils.INSTANCE.createTimedValue(0, now);
		//Assert.assertNotNull("Timed value should have been non null, that's frankly very likely to be a big problem ... ;-)", v3);
	}

	@SuppressWarnings("unused")
	public void testSelfTimeRangeCreation() {
		SelfTimedRange<TimedValue> s1 = new SelfTimedRange<TimedValue>(TimeDuration.FOUR_HOURS.getDuration());
		//Assert.assertNotNull("Timed value should have been non null, that's frankly very likely to be a big problem ... ;-)", s1);

		Date d1 = s1.getTimeCursor();
		//Assert.assertNotNull("Time cursor should have been non null, that's frankly very likely to be a big problem ... ;-)", d1);
		
		s1.setTimeCursor(now);
		Date d2 = s1.getTimeCursor();
		//Assert.assertEquals("Dude, this is ridiculous to not be able to set a java ref ... ;-)", s1.getTimeCursor(), d2);
		
		s1.setTimedValue(TimedValuesUtils.INSTANCE.createTimedValue(0));
		//Assert.assertNotNull("Dude, this is ridiculous to not be able to set a java ref ... ;-)", s1.getTimeValues().isEmpty());
	}

}
