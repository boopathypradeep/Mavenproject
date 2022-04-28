package com.maven.AxisBank1;

import java.sql.Driver;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintoutJunit {
public static WebDriver driver;
	@BeforeClass
	public static void launchUrl() {
WebDriverManager.chromedriver().setup();
 driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
	}
	@Before
	public void endTime() {
Date date=new Date();
System.out.println(date);
	}
@After
	public void startTime() {
Date date=new Date();
System.out.println(date);

	}
@AfterClass
	public static void closeUrl() {
driver.close();
	}
//valid username and password
@Test
public void tc1() throws InterruptedException {
driver.get("https://www.facebook.com/");
WebElement element = driver.findElement(By.id("email"));
element.sendKeys("Greens");
WebElement element2 = driver.findElement(By.id("pass"));
element2.sendKeys("greens@123");
WebElement btnLogin = driver.findElement(By.name("login"));
btnLogin.click();
Thread.sleep(3000);
}
//Invalid username and password	
@Test
public void tc2() throws InterruptedException {
driver.get("https://www.facebook.com/");
WebElement element = driver.findElement(By.id("email"));
element.sendKeys("java");
WebElement element2 = driver.findElement(By.id("pass"));
element2.sendKeys("java@123");
WebElement btnLogin = driver.findElement(By.name("login"));
btnLogin.click();
Thread.sleep(3000);
}
@Test
public void tc3() throws InterruptedException {
	
		driver.get("https://www.facebook.com/");
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("sql");
		WebElement element2 = driver.findElement(By.id("pass"));
		element2.sendKeys("sql@123");
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
		Thread.sleep(3000);
		
}
@Ignore
	@Test
	public void tc4() throws InterruptedException {

		driver.get("https://www.facebook.com/");
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("Python");
		WebElement element2 = driver.findElement(By.id("pass"));
		element2.sendKeys("Python@123");
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
		Thread.sleep(3000);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
