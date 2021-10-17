package com.ethanbradley.assignment6;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;


public class SalesEntry {
	private YearMonth date;;
	private int salesThisMonth;
	public YearMonth getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = YearMonth.parse(date, DateTimeFormatter.ofPattern("yy-MMM"));
	}
	public int getSalesThisMonth() {
		return salesThisMonth;
	}
	public void setSalesThisMonth(int salesThisMonth) {
		this.salesThisMonth = salesThisMonth;
	}

	

}
