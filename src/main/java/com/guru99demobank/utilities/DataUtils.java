package com.guru99demobank.utilities;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;

import com.guru99demobank.constants.DirectoryPaths;

public class DataUtils {

	private static ExcelReader excelReader = new ExcelReader(DirectoryPaths.EXCEL_PATH);

	/**
	 * 
	 * @param m
	 * @return
	 */
	@DataProvider(name = "dp")
	public Object[][] getData(Class m) {
		String sheetName = m.getSimpleName();
		System.out.println(sheetName);
		int rows = excelReader.getRowCount(sheetName);
		int cols = excelReader.getColumnCount(sheetName);
		Object[][] data = new Object[rows - 1][1];
		Hashtable<String, String> table = null;
		for (int rowNum = 2; rowNum <= rows; rowNum++) {
			table = new Hashtable<String, String>();
			for (int colNum = 0; colNum < cols; colNum++) {
				table.put(excelReader.getCellData(sheetName, colNum, 1),
						excelReader.getCellData(sheetName, colNum, rowNum));
				data[rowNum - 2][0] = table;
			}
		}
		return data;
	}
}
