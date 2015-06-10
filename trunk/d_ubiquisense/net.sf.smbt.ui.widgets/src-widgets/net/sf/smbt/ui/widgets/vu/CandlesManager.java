package net.sf.smbt.ui.widgets.vu;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.eclipse.swt.graphics.Rectangle;

import net.sf.smbt.ui.widgets.utils.CandleStickData;
import net.sf.smbt.ui.widgets.utils.LinkedFinancialTimedValue;
import net.sf.smbt.ui.widgets.utils.SelfTimedRange;
import net.sf.smbt.ui.widgets.utils.TimeBounds;
import net.sf.smbt.ui.widgets.utils.TimeRange;

public class CandlesManager {
	
	public final static int DEFAUTLT_CANDLE_WIDTH = 4;
	
	private int candleWidth;
	
	protected SelfTimedRange<LinkedFinancialTimedValue> timedRange;
	private List<CandleStickData> candles = new ArrayList<CandleStickData>();

	public CandlesManager(SelfTimedRange<LinkedFinancialTimedValue> timedRange, int candleWidth) {
		this.timedRange = timedRange;
		this.candleWidth = candleWidth;
	}
	public CandlesManager(SelfTimedRange<LinkedFinancialTimedValue> timedRange) {
		this.timedRange = timedRange;
		this.candleWidth = DEFAUTLT_CANDLE_WIDTH;
	}
	public int getCandleWidth() {
		return candleWidth;
	}
	
	public List<CandleStickData> getCandles() {
		return candles;
	}
	
	public void setCandleWidth(int candleWidth) {
		this.candleWidth = candleWidth;
	}
	
	public void updateCandles(int w, int h, int hMargin, int vMargin) {
		candles.clear();
		int n = getNbCandles(w, h, hMargin, vMargin);
		Date first 		= timedRange.getOldestSamplingDate();
		Calendar cursorCal = GregorianCalendar.getInstance();
		cursorCal.setTime(first);
		int timeStep	= (int) timedRange.getScope() / n;
		for (int ic=0;ic<n;ic++) {
			TimeBounds tBound = TimeRange.getTimeBounds(cursorCal.getTime(), timeStep);
			candles.add(createCandle(tBound));
			cursorCal.add(Calendar.MILLISECOND, timeStep);
		}
	} 
	public int getNbCandles() {
		return candles.size();
	}
	public int getNbCandles(int w, int h, int hMargin, int vMargin) {
		Rectangle inside = new Rectangle(hMargin, vMargin, w - (2 * hMargin), h - (2 * vMargin));
		return inside.width / getCandleWidth();
	}
	private CandleStickData createCandle(TimeBounds range) {
		List<LinkedFinancialTimedValue> values = timedRange.getTimeValues(range.begins, range.ends);
		float low 		= Float.MAX_VALUE;
		float high 		= Float.MIN_VALUE;
		float close		= 0.0f;
		float open 		= Float.MIN_VALUE;
		float volume 	= 0.0f;
		float sum		= 0.0f;
		for (LinkedFinancialTimedValue v : values) {
			if (Float.MIN_VALUE == open) {
				open = v.getV();
			}
			low 	= low 	> v.getV() ? v.getV() 	: low;
			high 	= high 	< v.getV() ? v.getV() 	: high;
			close 	= v.getV();
			volume 	+= v.getVolume();
			sum 	+= v.getV();
		}
		return new CandleStickData(values, sum/values.size(), low, close, open, high, volume, range);
	}
}
