package com.ethanbradley.assignment6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileService {

	public static ArrayList<String> createArrayListFromFile(String fileName) {
		BufferedReader fileReader = null;

		ArrayList<String> arrayListName = new ArrayList<String>();

		try {
			fileReader = new BufferedReader(new FileReader(fileName));
			String line = fileReader.readLine();
			while (line != null) {
				arrayListName.add(line);
				line = fileReader.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				fileReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return arrayListName;
	}
}
