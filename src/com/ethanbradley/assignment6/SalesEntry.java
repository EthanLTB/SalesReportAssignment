package com.ethanbradley.assignment6;

public class SalesEntry {
	private String date;
	private String salesThisMonth;

	SalesEntry(String[] arr) {
		this.setDate(arr[0]);
		this.setSalesThisMonth(arr[1]);
	}

	public SalesEntry() {

	}

	public String toString() {
		return "sales entry: " + this.date + "   " + this.salesThisMonth;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getSalesThisMonth() {
		return salesThisMonth;
	}

	public void setSalesThisMonth(String salesThisMonth) {
		this.salesThisMonth = salesThisMonth;
	}

}
