package com.ethanbradley.assignment6;

import java.util.ArrayList;

public class SalesEntryService {
	public static SalesEntry createSalesEntry(String[] arr) {
		SalesEntry entry = new SalesEntry();
		entry.setDate(arr[0]);
		entry.setSalesThisMonth(arr[1]);
		return entry;
	}
	
	public static ArrayList<SalesEntry> createSalesEntryArray(ArrayList<String> arr){
		ArrayList<SalesEntry> entries = new ArrayList<SalesEntry>();
		for (int i = 0; i < arr.size(); i++) {
			entries.add(SalesEntryService.createSalesEntry((((String) arr.toArray()[i]).split(","))));
		}
		return entries;

	}
	
	public static void printSalesNumbersforSpecificYear(int year, ArrayList<SalesEntry> arr) {
		int sum = arr.stream()
                .filter(entry -> entry.getDate().contains(year +"-"))
                .mapToInt(entry -> Integer.parseInt(entry.getSalesThisMonth()))
                .sum();
		if(sum != 0) {
System.out.println("20" + year +"->" + sum);
	}
	}
}
