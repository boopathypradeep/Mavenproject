package org.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=iphone+13+pro&crid=2J7VHDIV5WD3E&sprefix=iphone+13+pro+%2Caps%2C242&ref=nb_sb_noss_2");
		 driver.manage().window().maximize();
	
		System.out.println(driver.findElement(By.xpath("//span[text()='Apple iPhone 13 Pro (128GB) - Sierra Blue']//ancestor::div[@class=\"a-section a-spacing-none s-padding-right-small s-title-instructions-style\"]//following::div[@class=\"sg-row\"]//child::span[@class=\"a-price-whole\"]")).getText());
		
	}

}
