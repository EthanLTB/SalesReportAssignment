package com.ethanbradley.assignment6;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class SalesEntry {
	private YearMonth date;;
	private int salesThisMonth;
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("y-MMM");

	public YearMonth getDate() {
		return date;
	}

	public String getFormattedDate() {
		return date.format(formatter).replace(".", "");
	}

	public void setDate(YearMonth date) {
		this.date = date;
	}

	public int getSalesThisMonth() {
		return salesThisMonth;
	}

	public void setSalesThisMonth(int salesThisMonth) {
		this.salesThisMonth = salesThisMonth;
	}

	public String toString() {
		return this.getFormattedDate() + " " + this.getSalesThisMonth();
	}

}
