package org.dataDriven;

import org.sample.LibGlobal;

public class DatadrivenPractice extends LibGlobal {

	public static void main(String[] args) throws Exception {

		// createRow("abc", 0, 0, 0, "Java");
		// createCell("abc", 0, 0, 1, "Maven");
		// createCell("abc", 0, 0, 2, "Oracle");
		// createRow("abc", 0, 1, 0, "Selenium");
		// createCell("abc", 0, 1, 1, "QTP");
		// createCell("abc", 0, 1, 2, "Apache");
		// createRow("abc", 0, 2, 0, "Java");
		// createCell("abc", 0, 2, 1, "Maven");
		// createCell("abc", 0, 2, 2, "Oracle");
		// createRow("abc", 0, 3, 0, "Selenium");
		// createCell("abc", 0, 3, 1, "QTP");
		// createCell("abc", 0, 3, 2, "Apache");
		// ReplaceParticularCellValue("abc", 0, 0, 1, "Maven", "Rahul");

		System.out.println(excelRead("abc", "adactin", 0, 1));
	}

}