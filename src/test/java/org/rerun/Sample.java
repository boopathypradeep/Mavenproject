package org.rerun;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample extends Sample2 {
	public static WebDriver driver;
	
	@Test(dataProvider="sampleDatas",dataProviderClass=Sample2.class)
	private void page1(String username, String password) {
		
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys(username);
			driver.findElement(By.id("pass")).sendKeys(password);
			driver.findElement(By.name("login")).click();
		
}

//	@DataProvider(name="sampleDatas")
//	private Object[][] datas() throws  IOException {
//	return	new Object[][] {
//		{readExcel(1, 0),readExcel(1, 1)},
//		{readExcel(2, 0),readExcel(2, 1)},
//		{readExcel(3, 0),readExcel(3, 1)}
//			
//		};
//
//	}
//	
	
	
}
