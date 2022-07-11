
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://demo.guru99.com/test/drag_drop.html");
Thread.sleep(3000);
WebElement source = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
WebElement destination = driver.findElement(By.xpath("//ol[@id=\"amt7\"]"));
Actions actions=new Actions(driver);
actions.clickAndHold(source).moveToElement(destination).release().perform();
TakesScreenshot ts=(TakesScreenshot) driver;
File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
//FileUtils.copyFile(screenshotAs, new File("C:\\Users\\HP\\Pictures\\screen.png"));
FileHandler.copy(screenshotAs, new File("C:\\\\Users\\\\HP\\\\Pictures\\\\filehandler.png"));




	}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	


