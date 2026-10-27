package org.dataexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataExcel {
	
	public static void main(String[] args) throws IOException {
		
	File file = new File("C:\\Users\\Yuvaraj T\\eclipse-workspace\\DataFromExcel\\src\\test\\resources\\TestData\\data.xlsx");
	
	FileInputStream stream = new FileInputStream(file) ;
	
	Workbook book =new XSSFWorkbook(stream);
	
	Sheet sheet = book.getSheet("sheet2");
	
	
	Row row = sheet.getRow(2);
	
	Cell cell = row.getCell(1);
	
	
	String stringCellValue = cell.getStringCellValue();
	System.out.println(stringCellValue);
		
		
	}

}
