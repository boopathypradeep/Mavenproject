package com.maven.AxisBank1;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
private List<String> method1(List<String> l) {
	File file =new File("C:\\Users\\HP\\eclipse-workspace\\AxisBank1\\src\\test\\java\\ExcelSheet\\class.xlsx");
	Workbook workbook=new XSSFWorkbook();
	Sheet sheet = workbook.createSheet("New Datas");
	
	for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
		Row row = sheet.createRow(i);
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			Cell cell = row.createCell(j);
		cell.setCellValue(l);
		}
		
	}
	
return l;

}

public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	WebElement element = driver.findElement(By.id("Skills"));
	Select select=new Select(element);
	List<WebElement> l = select.getOptions();
	for (int i = 0; i < l.size(); i++) {
	WebElement element2 = l.get(i);
		String text = element2.getText();
		System.out.println(l); 
	}


	File file =new File("C:\\Users\\HP\\eclipse-workspace\\AxisBank1\\src\\test\\java\\ExcelSheet\\class.xlsx");
	Workbook workbook=new XSSFWorkbook();
	Sheet sheet = workbook.createSheet("New Datas");
	
	for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
		Row row = sheet.createRow(i);
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
			Cell cell = row.createCell(j);
			System.out.println(l);

		}
		
	}
	























}}
