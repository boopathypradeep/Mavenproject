package org.rerun;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Sample2 {
	@DataProvider(name="sampleDatas")
	private Object[][] datas() {
		return new Object[][] {
			{"boopathy","pradeep"},
			{"gnana","prakash"},
			{"raja","sekaran"}
		};

	}
	public String readExcel(int rowNo,int cellNo) throws FileNotFoundException, IOException {
		Workbook workbook=new XSSFWorkbook(new FileInputStream(new File("C:\\Users\\HP\\eclipse-workspace\\MvnProjects\\src\\test\\java\\org\\rerun\\excelsheets\\data provider.xlsx")));
Sheet sheet = workbook.getSheet("Sheet1");
Row row = sheet.getRow(rowNo);
Cell cell = row.getCell(cellNo);
return cell.toString();
	}
	

	
	
	
	
	
}
