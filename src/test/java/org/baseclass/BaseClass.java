package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.bytecode.Duplication;

public class BaseClass {
	public static WebDriver driver;

public void launchBrowser() {
WebDriverManager.chromedriver().setup();
driver= new ChromeDriver();
driver.manage().window().maximize();

}
public void launchUrl(String url) {
	driver.navigate().to(url);

}


public void enterText(WebElement element,String text) {
	element.sendKeys(text);

}
public void closeBrowser() {
driver.close();
}
public void confirmAlert() {
	Alert alert = driver.switchTo().alert();
alert.accept();
}

public String excelDatas(int rowno,int columnno ) throws FileNotFoundException, IOException {
Workbook w=new XSSFWorkbook(new FileInputStream(new File("C:\\Users\\HP\\eclipse-workspace\\MvnProjects\\src\\test\\java\\ExcelSheet\\testngHotelDatas.xlsx")));
return w.getSheet("Sheet1").getRow(rowno).getCell(columnno).getStringCellValue();

}
public String excelRead(int rowno, int columnno) throws IOException {
	File file=new File("C:\\Users\\HP\\eclipse-workspace\\MvnProjects\\src\\test\\java\\ExcelSheet\\Task manualtesting.xlsxs");
	FileInputStream stream=new FileInputStream(file);
	Workbook workbook=new XSSFWorkbook(stream);
	Sheet sheet = workbook.getSheet("Sheet1");
Row row = sheet.getRow(rowno);
Cell cell = row.getCell(columnno);
String string = cell.toString();
return string;
}

public void clickss(WebElement element) {
	element.click();

}
public void selectBy(WebElement element,String selectby, String value, int index) {
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

public void impilicitlyWaits() {
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

}

public void alert() {
Alert alert = driver.switchTo().alert();
alert.accept();

}
public WebElement locatingElement(String locator,String value) {
	WebElement element=null;
	switch (locator) {
	case "id":
	element = 	driver.findElement(By.id(value));
		break;
	case "name":
		element = 	driver.findElement(By.name(value));
			break;
	case "class":
		element = 	driver.findElement(By.className(value));
			break;
	case "xpath":
		element = 	driver.findElement(By.xpath(value));
			break;

	default:
		break;
	}
	return element;
}
public List<String> propertiesFiless() throws IOException {
	File file=new File("C:\\Users\\HP\\eclipse-workspace\\MvnProjects\\src\\test\\loginhotel.properties");
	FileReader reader=new FileReader(file);
	Properties properties=new Properties();
	properties.load(reader);
		String string = properties.get("username").toString();
	String string2 = properties.get("password").toString();
	String string3 = properties.get("url").toString();
List<String>li=new ArrayList<>();
li.add(string);
li.add(string2);
li.add(string3);
return li;

}


























}
