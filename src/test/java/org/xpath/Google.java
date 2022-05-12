package org.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	 driver.findElement(By.xpath("//input[@aria-label=\"Search\"]")).sendKeys("yamaha");
	 List<WebElement> elements = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//child::ul/descendant::li[2]//child::div[@class=\"wM6W7d\"]//child::span"));
	 for (int i = 0; i <elements.size(); i++) {
		 WebElement webElement = elements.get(i);
		String text = webElement.getAttribute("span");
		System.out.println(text);
	}
}
}
