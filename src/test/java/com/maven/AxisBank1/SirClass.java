package com.maven.AxisBank1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SirClass {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\HP\\eclipse-workspace\\AxisBank1\\src\\test\\java\\ExcelSheet\\class.xlsx");
		
		Workbook workbook=new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("New Datas");
		Row row = sheet.createRow(11);
		Cell cell = row.createCell(0);
		cell.setCellValue("lkjfdsdf");
		FileOutputStream out=new FileOutputStream(file);
		workbook.write(out);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
