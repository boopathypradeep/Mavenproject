package org.tasks2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import groovyjarjarantlr4.v4.parse.ANTLRParser.element_return;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		}
	public void maximize() {
driver.manage().window().maximize();	

	} 
	public void launchUrl(String url) {
		driver.get(url);

	}
	public void locatingElement(String locatorName, String locator ) {
		switch (locatorName) {
		case "xpath":
		WebElement element=	driver.findElement(By.id(locator));
			break;
		case "id":
			WebElement element2=	driver.findElement(By.id(locator));
				break;
		case "name":
			WebElement element3=	driver.findElement(By.id(locator));
				break;
		default:
			break;
		}
	
	}
	public void enterText(WebElement element, String data) {
element.sendKeys(data);	
	}
	public void btnClick(WebElement element) {
element.click();		
	} 
	public void SelectByValuess(WebElement element, String value) {
Select select=new Select(element); 
select.selectByValue(value);

}
	public void SelectByIndexss(WebElement element, int index) {
Select select=new Select(element); 
select.selectByIndex(index);
	}
	public void SelectByVisibleTextss(WebElement element, String text) {
Select select=new Select(element); 
select.selectByValue(text);
	}	
public boolean enabled(WebElement element) {
return element.isEnabled();

}
	public void switchTOLastWindow() {
		String handle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String win : windowHandles) {
			if (!(handle.equals(win))) {
				driver.switchTo().window(win);
				
			}
		}

	}
	
	public String getTextss(WebElement element) {
		return element.getText();

	}
	
	public void print(String value) {
	System.out.println(value);
	}
	
	
	public void implicitlyWait(long time, TimeUnit unit) {
		driver.manage().timeouts().implicitlyWait(time, unit);

	}
	public void navigateBack() {
driver.navigate().back();

	}
	
	public void clear(WebElement element) {
		element.clear();

	}
	
	
	
	
	

}
