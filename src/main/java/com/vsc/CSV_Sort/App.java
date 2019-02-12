package com.vsc.CSV_Sort;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

/**
 * Hello world!
 *
 */
public class App

{

	public void read() throws FileNotFoundException, IOException {


			HSSFWorkbook workbook = new HSSFWorkbook(
					new FileInputStream("C:\\Users\\vaibhav.chauhan\\Downloads\\result.csv"));
			HSSFSheet sheet = workbook.getSheetAt(0);
			System.out.println("1");
			Iterator<Row> rowIterator = sheet.iterator();
			System.out.println("2");
			while (rowIterator.hasNext()) {
				System.out.println("3");
				Row row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				List<Integer> list = new ArrayList<Integer>();
				System.out.println("4");
				while (cellIterator.hasNext()) {
					System.out.println("5");
					Cell cell = cellIterator.next();
					list.add((int) cell.getNumericCellValue());

				}
				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}

			}
			workbook.close();
		

	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		System.out.println("Hello World!");

		App app = new App();
		app.read();

	}
}
