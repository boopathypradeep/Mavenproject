package summa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamicXpath {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://adactinhotelapp.com/SearchHotel.php");
	driver.findElement(By.id("username")).sendKeys("BoopathyPradeep");
	driver.findElement(By.id("password")).sendKeys("Boopathy@9");
	driver.findElement(By.id("login")).click();
	List<WebElement> findElements = driver.findElements(By.xpath("//table[@class=\"login\"]//descendant::select[@class=\"search_combobox\"]//option"));
	for (int i = 0; i <=findElements.size(); i++) {
		WebElement elements = findElements.get(i);
		String attribute = elements.getAttribute("value");
		System.out.println(attribute);
	}
	
	
	
	
	
}
}
