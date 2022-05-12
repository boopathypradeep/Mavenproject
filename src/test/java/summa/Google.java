package summa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement element3 = driver.findElement(By.xpath("//input[@title=\"Search\"]"));
	element3.sendKeys("yamaha");
	Thread.sleep(3000);

	List<WebElement> element = driver.findElements(By.xpath("//li[@role=\"presentation\"]//descendant::span"));
for (int i = 0; i <element.size(); i++) {
	WebElement element2 = element.get(i);
	String attribute = element2.getText();
	System.out.println(element2);
	
}










}
}

