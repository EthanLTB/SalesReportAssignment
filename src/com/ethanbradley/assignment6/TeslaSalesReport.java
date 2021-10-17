package com.ethanbradley.assignment6;

import java.util.ArrayList;
import java.util.Comparator;


public class TeslaSalesReport {
	public static void main(String[] args) {

	//	ArrayList<String> model3Data = FileService.createArrayListFromFile("model3.csv");
//		ArrayList<String> modelSData = FileService.createArrayListFromFile("modelS.csv");
//		ArrayList<String> modelXData = FileService.createArrayListFromFile("modelX.csv");

     //	ArrayList<SalesEntry> model3Entries = SalesEntryService.createSalesEntryArray(model3Data);
//		ArrayList<SalesEntry> modelSEntries = SalesEntryService.createSalesEntryArray(modelSData);
//		ArrayList<SalesEntry> modelXEntries = SalesEntryService.createSalesEntryArray(modelXData);

//		System.out.println("Model 3 Yearly Sales Report");
//		System.out.println("--------------");
//		SalesEntryService.printSalesNumbersforSpecificYear(17, model3Entries);
//		SalesEntryService.printSalesNumbersforSpecificYear(18, model3Entries);
//		SalesEntryService.printSalesNumbersforSpecificYear(19, model3Entries);

SalesEntry sale = new SalesEntry();
sale.setDate("16-Feb");
	System.out.println(sale.getDate().toString());
		//model3Entries.stream().forEach(e -> System.out.println(e));
		
		
		
		
		
		
//		System.out.println("Model S Yearly Sales Report");
//		System.out.println("--------------");
//		SalesEntryService.printSalesNumbersforSpecificYear(16, modelSEntries);
//		SalesEntryService.printSalesNumbersforSpecificYear(17, modelSEntries);
//		SalesEntryService.printSalesNumbersforSpecificYear(18, modelSEntries);
//		SalesEntryService.printSalesNumbersforSpecificYear(19, modelSEntries);
//
//		System.out.println("Model X Yearly Sales Report");
//		System.out.println("--------------");
//		SalesEntryService.printSalesNumbersforSpecificYear(17, modelXEntries);
//		SalesEntryService.printSalesNumbersforSpecificYear(18, modelXEntries);
//		SalesEntryService.printSalesNumbersforSpecificYear(19, modelXEntries);

	}
}
