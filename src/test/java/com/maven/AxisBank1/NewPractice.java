package com.maven.AxisBank1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

public class NewPractice {
public static void main(String[] args) throws FileNotFoundException, IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
	Workbook workbook=new XSSFWorkbook(new FileInputStream(new File("C:\\Users\\HP\\eclipse-workspace\\MvnProjects\\src\\test\\java\\ExcelSheet\\practice excel.xlsx")));
	List<WebElement> allOptions = new Select(driver.findElement(By.id("day"))).getOptions();
	Sheet sheet = workbook.getSheet("new datas");
	String text=null;
for (WebElement options : allOptions) {
	 text = options.getText();
	for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
					
					Row row = sheet.createRow(i);
				
				Cell cell = row.createCell(0);
				cell.setCellValue(text);
		System.out.println(text);
		FileOutputStream out=new FileOutputStream(new File("C:\\Users\\HP\\eclipse-workspace\\MvnProjects\\src\\test\\java\\ExcelSheet\\practice excel.xlsx"));
		workbook.write(out);		
		break;
		
	}
				
		
}		
			
		
	
	
	
	
	
	
	
	
}
}
