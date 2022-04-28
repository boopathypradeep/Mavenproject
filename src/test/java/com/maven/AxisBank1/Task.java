package com.maven.AxisBank1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\HP\\eclipse-workspace\\AxisBank1\\src\\test\\java\\ExcelSheet\\Framework Task.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Datas");
		Row row = sheet.getRow(5);
		Cell cell = row.getCell(2);
		System.out.println(cell);
		int count = row.getPhysicalNumberOfCells();
		System.out.println(count);
		int rowCounts = sheet.getPhysicalNumberOfRows();
		System.out.println(rowCounts);
		for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
			Cell cell2 = row.getCell(i);
			System.out.println(cell2);
			for (int j = 0; j < sheet.getPhysicalNumberOfRows(); j++) {
				Row row2 = sheet.getRow(j);
		for (int k = 0; k < row2.getPhysicalNumberOfCells(); k++) {
			Cell cell3 = row2.getCell(k);
			System.out.println(cell3);
			
		}
			}
			
			
			
			
			
			
			
			
			
			
		}
		
	}

}
