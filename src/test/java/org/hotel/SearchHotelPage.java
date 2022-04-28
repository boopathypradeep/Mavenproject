package org.hotel;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchHotelPage {
	static WebDriver driver;
@Test
public void location() {

	    
	WebElement element = driver.findElement(By.id("location"));
	Select select=new Select(element);
	select.selectByVisibleText("Sydney"); 
	WebElement element2 = driver.findElement(By.id("hotels"));
	Select select2=new Select(element2);
	select2.selectByVisibleText("Hotel Sunshine");
	WebElement findElement = driver.findElement(By.id("room_type"));
	Select select3=new Select(findElement);
	select3.selectByVisibleText("Standard");
	WebElement element4 = driver.findElement(By.id("room_nos"));
	Select select4=new Select(element4);
	select4.selectByVisibleText("1 - One");
	WebElement findElement2 = driver.findElement(By.id("datepick_in"));
	findElement2.sendKeys("22-04=2022");
	WebElement findElement3 = driver.findElement(By.id("datepick_out"));
	findElement2.sendKeys("24-04=2022");
	WebElement findElement4 = driver.findElement(By.id("adult_room"));
	Select select5=new Select(findElement4);
	select.selectByVisibleText("1");
	WebElement findElement5 = driver.findElement(By.id("child_room"));
	Select select6=new Select(findElement5);
	select6.selectByVisibleText("2");
	WebElement btnClick = driver.findElement(By.xpath("//input[@id=\"Submit\"]"));
	btnClick.click();
}
}
