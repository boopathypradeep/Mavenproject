package org.junithotel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinhotelLoginPage  extends BaseClass1{
	static WebDriver driver;
	@BeforeClass
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
	
	}
	@Ignore	
	@Before
	public void startTime() throws IOException, InterruptedException {
		Thread.sleep(3000);
Date date=new Date();
System.out.println(date);
TakesScreenshot ss=(TakesScreenshot) driver;
File screenshotAs = ss.getScreenshotAs(OutputType.FILE);
FileUtils.copyFileToDirectory(screenshotAs, new File("C:\\Users\\HP\\Pictures\\Java SS\\ss1.png"));

	}
@Ignore
@After
public void endTime() throws IOException, InterruptedException {
	Thread.sleep(3000);
	Date date=new Date();
	System.out.println(date);
	TakesScreenshot ss=(TakesScreenshot) driver;
	File screenshotAs = ss.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFileToDirectory(screenshotAs, new File("C:\\Users\\HP\\Pictures\\Java SS\\ss2.png"));
	
}

	
	@Test
	public void test1() throws InterruptedException {
		WebElement element = driver.findElement(By.id("username"));
		String excelRead = excelRead("New Datas", 0, 0);
		element.sendKeys(excelRead);
		WebElement element2 = driver.findElement(By.id("password"));
		element2.sendKeys("Boopathy@9");
		WebElement element3 = driver.findElement(By.id("login"));
		element3.click();
		Thread.sleep(3000);
		
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

