package com.ethanbradley.assignment6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileService {

	public static ArrayList<SalesEntry> createArrayListFromFile(String fileName) {
		BufferedReader fileReader = null;

		ArrayList<SalesEntry> arrayListName = new ArrayList<SalesEntry>();

		try {
			fileReader = new BufferedReader(new FileReader(fileName));
			@SuppressWarnings("unused")
			String headerline = fileReader.readLine();
			String line = fileReader.readLine();

			while (line != null) {
				arrayListName.add(SalesEntryService.createSalesEntry(line));
				line = fileReader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return arrayListName;
	}
}
