package com.ethanbradley.assignment6;

import java.util.ArrayList;

public class TeslaSalesReport {
	public static void main(String[] args) {

		ArrayList<SalesEntry> model3Data = FileService.createArrayListFromFile("model3.csv");
		ArrayList<SalesEntry> modelSData = FileService.createArrayListFromFile("modelS.csv");
		ArrayList<SalesEntry> modelXData = FileService.createArrayListFromFile("modelX.csv");

		SalesReportService.printSalesReport(model3Data, "Model 3");
		SalesReportService.printSalesReport(modelSData, "Model S");
		SalesReportService.printSalesReport(modelXData, "Model X");
	}

}
