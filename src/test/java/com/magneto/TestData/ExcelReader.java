package com.magneto.TestData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;


public class ExcelReader
{

//public static long PAGE_LOAD_TIMEOUT = 20;
//public static long IMPLICIT_WAIT = 20;

public static String TESTDATA_SHEET_PATH = "/Users/bhuban/Documents/sunanda_workspace/com.magneto/Book2.xlsx";//path of ur excel file

static Workbook book;
static Sheet sheet;
//static JavascriptExecutor js;


public static Object[][] getTestData(String sheetName) {
FileInputStream file = null;
try {
file = new FileInputStream(TESTDATA_SHEET_PATH);//read the data from external file with is saved in testData_sheet_path
} catch (FileNotFoundException e) {
e.printStackTrace();
}
try {
book = WorkbookFactory.create(file);
} 

 catch (IOException e) {
e.printStackTrace();
}
sheet = book.getSheet(sheetName);
Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
System.out.println(sheet.getLastRowNum());
// sheet.getRow(0).getLastCellNum());
for (int i = 0; i < sheet.getLastRowNum(); i++)
{
for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) 
{
data[i][k] = sheet.getRow(i + 1).getCell(k).toString();//in a excel file we have workbook->sheets->row and columns
System.out.println(data[i][k]);
}
}
return data;
}
}
