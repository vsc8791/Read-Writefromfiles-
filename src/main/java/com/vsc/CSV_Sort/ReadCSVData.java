package com.vsc.CSV_Sort;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.opencsv.*;

public class ReadCSVData {
	private static final String CSV_FILE_PATH = "C:\\Users\\vaibhav.chauhan\\Downloads\\result.csv";

	public static void main(String[] args) {

		System.out.println("Read Data Line by Line With Header \n");
		readDataLineByLine(CSV_FILE_PATH);
		System.out.println("_______________________________________________");

	}

	public static void readDataLineByLine(String file) {

		try {

			// Create an object of filereader class
			// with CSV file as a parameter.
			FileReader filereader = new FileReader(file);

			// create csvReader object passing
			// filereader as parameter
			CSVReader csvReader = new CSVReader(filereader);
			String[] nextRecord;

			// we are going to read data line by line
			List<String> list = new ArrayList<String>();
			while ((nextRecord = csvReader.readNext()) != null) {
				for (String cell : nextRecord) {
					System.out.print(cell + "\t");
					list.add(cell);

				}
				Collections.sort(list);

				System.out.println();
			}
			System.out.println("Smallest Number=" + list.get(0));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}