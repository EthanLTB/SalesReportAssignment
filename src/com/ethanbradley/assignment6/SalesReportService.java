package com.ethanbradley.assignment6;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class SalesReportService {

	public static void printSalesReport(ArrayList<SalesEntry> dataToSort, String model) {

		Map<Object, List<SalesEntry>> groupedByYear = dataToSort.stream()
				.collect(Collectors.groupingBy(entry -> entry.getDate().getYear()));

		Set<Entry<Object, List<SalesEntry>>> dataEntrySet = groupedByYear.entrySet();

		System.out.println(model + " Yearly Sales Report");
		System.out.println("-------------------");

		dataEntrySet.stream().forEach(entry -> System.out.println(
				entry.getKey() + " -> " + entry.getValue().stream().mapToInt(e -> e.getSalesThisMonth()).sum()));

		System.out.println(" ");

		SalesEntry maxEntry = Collections.max(dataToSort, Comparator.comparingInt(e -> e.getSalesThisMonth()));
		SalesEntry minEntry = Collections.min(dataToSort, Comparator.comparingInt(e -> e.getSalesThisMonth()));

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM", Locale.US);

		System.out.println("The best month for " + model + " was: " + maxEntry.getDate().format(formatter));
		System.out.println("The worst month for " + model + " was: " + minEntry.getDate().format(formatter));

		System.out.println(" ");
	}
}
