package com.maven.AxisBank1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewClass {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("Hello");
	driver.findElement(By.id("pass")).sendKeys("hai");
	driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
}
}
