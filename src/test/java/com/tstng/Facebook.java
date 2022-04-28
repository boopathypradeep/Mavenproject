package com.tstng;

import java.util.Date;

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

public class Facebook {
	static WebDriver driver;

	@BeforeClass
	private void lauchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@BeforeMethod
	private void startTime() {
		Date date = new Date();
		System.out.println(date);

	}

	@AfterMethod
	private void endTime() {
		Date date = new Date();
		System.out.println(date);

	}

	@Parameters("username")
	@Test
	private void tc01(String s) {
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys(s);
	}

	@Parameters("password")
	@Test
	private void tc02(String s1) {
		WebElement element = driver.findElement(By.id("pass"));
		element.sendKeys(s1);
	}
@Test
private void tc03() {
WebElement element = driver.findElement(By.name("login"));
element.click();
}
}
