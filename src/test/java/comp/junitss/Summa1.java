package comp.junitss;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Summa1 {
	public static WebDriver driver;
	public static WebElement element;
		@BeforeClass
	public static void launchBrowser() throws InterruptedException {
WebDriverManager.chromedriver().setup();
 driver=new ChromeDriver();
driver.get("https://www.facebook.com/");

	}
		@Before
		public void timeBeforeTest() {
			
Date date=new Date();
System.out.println(date);
		}
		@After
		public void timeAfter() {
		Date date=new Date();
		System.out.println(date);

		}
		
		@AfterClass
		public static void closeBrowser() {
			driver.close();

		}
		@Test
		public void test1() throws InterruptedException {
			 element = driver.findElement(By.id("email"));
			 element.sendKeys("hello");
			 element = driver.findElement(By.id("pass"));
			 element.sendKeys("dfgjgjj");
			 element = driver.findElement(By.name("login"));
			 element.click();
			 Thread.sleep(3000);
		}
	@Test	
	
	public void test2() throws InterruptedException {
		
		 element = driver.findElement(By.id("email"));
		 element.sendKeys("edge");
		 element = driver.findElement(By.id("pass"));
		 element.sendKeys("dfghkjhd");
		 element = driver.findElement(By.name("login"));
		 element.click();
		 Thread.sleep(3000);
	}	
	@Test	
		
	public void test3() throws InterruptedException {
		 element = driver.findElement(By.id("email"));
		 element.sendKeys("Fellow");
		 element = driver.findElement(By.id("pass"));
		 element.sendKeys("ljfsdfgthn");
		 element = driver.findElement(By.name("login"));
		 element.click();
		 Thread.sleep(3000);
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
