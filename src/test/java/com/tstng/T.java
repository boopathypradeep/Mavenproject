package com.tstng;

import java.util.Date;

import org.bouncycastle.est.CACertsResponse;
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

public class T {
	static WebDriver driver;
	@BeforeClass
private void beforeClass() {
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
}
@BeforeMethod
private void beforeMethod() {
Date date = new Date();
System.out.println(date);
}

@Test
@Parameters("username")
private void tc01(String s){
	WebElement w1 = driver.findElement(By.id("email"));
	w1.sendKeys(s);
}

@Test
@Parameters("password")
private void tc02(String s1) {
WebElement w2 = driver.findElement(By.id("pass"));
w2.sendKeys(s1);
}

@AfterMethod
private void afterMethod() {
Date date = new Date();
System.out.println(date);
}








}
