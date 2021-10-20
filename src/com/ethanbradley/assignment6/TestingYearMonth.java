package com.ethanbradley.assignment6;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TestingYearMonth {

	public static void main(String[] args) {
		
		   YearMonth yearMonth = YearMonth.parse("Feb-17", DateTimeFormatter.ofPattern("MMM-yy", Locale.US));
		    System.out.println(yearMonth.getMonth() + " " + yearMonth.getYear());
		
	}
}
