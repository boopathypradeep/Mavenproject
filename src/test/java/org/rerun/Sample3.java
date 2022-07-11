package org.rerun;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample3 {

	@Test
	private void page1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Point p=new Point(150, 150);
		driver.manage().window().setPosition(p);

	}
	
	@Test
	private void page2() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Point p=new Point(200, 200);
		driver.manage().window().setPosition(p);
	}
@Test
private void page3() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Point p=new Point(250, 250);
	driver.manage().window().setPosition(p);

}
	
	
	
	
}
