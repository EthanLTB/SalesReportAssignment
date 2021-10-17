package com.ethanbradley.assignment6;

import java.time.YearMonth;

public class SalesEntry {
	private YearMonth date;;
	private int salesThisMonth;

	public YearMonth getDate() {
		return date;
	}

	public void setDate(YearMonth date) {
		;
		this.date = date;
	}

	public int getSalesThisMonth() {
		return salesThisMonth;
	}

	public void setSalesThisMonth(int salesThisMonth) {
		this.salesThisMonth = salesThisMonth;
	}

}
