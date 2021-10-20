package com.ethanbradley.assignment6;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class SalesEntryService {

	public static SalesEntry createSalesEntry(String arr) {
		SalesEntry entry = new SalesEntry();
		String[] stringToTransform = arr.split(",");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy-MMM", Locale.US);
		String stringDate = stringToTransform[0];
		entry.setDate(YearMonth.parse(stringDate, formatter));

		entry.setSalesThisMonth(Integer.parseInt(stringToTransform[1]));
		return entry;
	}

}