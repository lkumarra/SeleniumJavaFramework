package com.guru99demobank.utilities;

import java.lang.reflect.Method;
import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import com.guru99demobank.constants.DirectoryPaths;
public class DataUtils {

	private static ExcelReader excelReader = new ExcelReader(DirectoryPaths.EXCEL_PATH);

	/**
	 * Dataprovider.
	 * 
	 * @param clazz class name.
	 * @return Data.
	 */
	@DataProvider(name = "dp", parallel = true)
	public Object[][] getData(@SuppressWarnings("rawtypes") Class clazz, Method method) {
		return getExcelData(clazz.getSimpleName(), method.getName());
	}

	public static Object[][] getExcelData(String sheetName, String testCase) {
		int rows = excelReader.getRowCount(sheetName);
		System.out.println("Total rows are : " + rows);
		String testName = testCase;
		// Find the test case start row
		int testCaseRowNum = 1;
		for (testCaseRowNum = 1; testCaseRowNum <= rows; testCaseRowNum++) {
			String testCaseName = excelReader.getCellData(sheetName, 0, testCaseRowNum);
			if (testCaseName.equalsIgnoreCase(testName))
				break;
		}
		System.out.println("Test case starts from row num: " + testCaseRowNum);
		// Checking total rows in test case
		int dataStartRowNum = testCaseRowNum + 2;
		int testRows = 0;
		while (!excelReader.getCellData(sheetName, 0, dataStartRowNum + testRows).equals("")) {
			testRows++;
		}
		System.out.println("Total rows of data are : " + testRows);
		// Checking total cols in test case
		int colStartColNum = testCaseRowNum + 1;
		int testCols = 0;
		while (!excelReader.getCellData(sheetName, testCols, colStartColNum).equals("")) {
			testCols++;
		}
		System.out.println("Total cols are : " + testCols);
		// Printing data
		Object[][] data = new Object[testRows][1];
		int i = 0;
		for (int rNum = dataStartRowNum; rNum < (dataStartRowNum + testRows); rNum++) {
			Hashtable<String, String> table = new Hashtable<String, String>();
			for (int cNum = 0; cNum < testCols; cNum++) {
				// System.out.println(excel.getCellData(Constants.DATA_SHEET,
				// cNum, rNum));
				String testData = excelReader.getCellData(sheetName, cNum, rNum);
				String colName = excelReader.getCellData(sheetName, cNum, colStartColNum);
				table.put(colName, testData);
			}
			data[i][0] = table;
			i++;
		}
		return data;
	}

}
