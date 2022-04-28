package org.testngg;

import org.apache.poi.hpsf.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SirClass {
	static WebDriver driver;
@BeforeClass
private void launchBrowser() {
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
		
}
@BeforeMethod
private void startTiming() {
Date date=new Date();
System.out.println(date);
}
@Test
@Parameters({"username","password"})
private void loginFunctionality(String s, String s1) {

WebElement element = driver.findElement(By.id("email"));
element.sendKeys(s);
WebElement element2 = driver.findElement(By.id("pass"));
element2.sendKeys(s1);
}
@AfterMethod
private void endTiming() {
	Date date=new Date();
	System.out.println(date);

}











}
