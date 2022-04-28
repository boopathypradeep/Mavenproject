package org.junithotel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
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

public class BaseClass1 {
	static WebDriver driver;
	static WebElement element;
	public static void launchBrowser() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	}
	public static WebElement enterText( String text) {
		element.sendKeys(text);
		return element;
	 	}
	public void clickss() {
		element.click();
		}
		public void implicitlyWaitss() {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		}
	
	public static void launchUrl(String url) {
		driver.navigate().to("https://adactinhotelapp.com/");
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public  void locatingElement(String locator,  String value) {
		switch (locator) {
		case "id":
	 element=driver.findElement(By.id(value));
			break;
		case "name":
		 element=driver.findElement(By.name(value));
			break;
		case "xpath":
		element=driver.findElement(By.xpath(value));
			break;
		default:
			break;
		}
	

	}

	public String excelRead(String sheet, int rowno, int cellno) throws IOException {
		File file=new File("C:\\Users\\HP\\eclipse-workspace\\AxisBank1\\src\\test\\java\\ExcelSheet\\class.xlsx");
		FileInputStream stream=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(stream);
		Sheet sheet1 = workbook.getSheet(sheet);
		Row row = sheet1.getRow(rowno);
		Cell cell = row.getCell(cellno);
			String string = cell.toString();
			return string;
	}
public void selectBy(String selectby, String value,int index) {
	switch (selectby) {
	case "value":
		Select select=new Select(element);
		select.selectByValue(value);
		break;
	case "visibletext":
			Select select1=new Select(element);
			select1.selectByVisibleText(value);
			break;
	case "index":
		Select select2=new Select(element);
		select2.selectByIndex(index);
		break;
	default:
		break;
	}

}	

}
