import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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

public class Task3 {

public static void main(String[] args) throws IOException {

	File file=new File("C:\\Users\\HP\\eclipse-workspace\\AxisBank1\\src\\test\\java\\ExcelSheet\\class1.xlsx");
	
	Workbook workbook=new XSSFWorkbook();
	Sheet sheet = workbook.createSheet("Datas");
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	WebElement element = driver.findElement(By.id("Skills")); 
Select select=new Select(element);
List<WebElement> options = select.getOptions();
	for (int i = 0; i < options.size(); i++) {
		WebElement webElement = options.get(i);
		String text = webElement.getText();
		System.out.println(text);
		Row rows = sheet.createRow(i);
		Cell cell = rows.createCell(0);
		cell.setCellValue(text);
	}
	
	FileOutputStream stream=new FileOutputStream(file);
	workbook.write(stream);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
