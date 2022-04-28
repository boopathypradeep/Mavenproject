package comp.junitss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass11 {
	WebDriver driver;
	WebElement element;
	public void getDrivers() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\SeleniumInstallation\\src\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
	}
	public void launchUrl(String url) {
driver.get(url);
	}
public void enterText(String data) {
element.sendKeys(data);
}
public void btnClick() {
element.click();
}
public WebElement locatingElement(String locator, String value) {
	switch (locator) {
	case "xpath":
		element=driver.findElement(By.xpath(value));
		break;
	case "id":
		element=driver.findElement(By.id(value));
		break;
	case "name":
		element=driver.findElement(By.name(value));
		break;
	case "classname":
		element=driver.findElement(By.className(value));
		break;
	case "linkedtext":
		element=driver.findElement(By.linkText(value));
		break;
	case "partiallinkedtext":
		element=driver.findElement(By.partialLinkText(value));
		break;
	case "cssselector":
		element=driver.findElement(By.cssSelector(value));
		break;
	case "tagname":
		element=driver.findElement(By.tagName(value));
		break;

	default:
		break;
	}
	return element;
}
private void getTexts() {
String text = element.getText();
System.out.println(text); 
}
private void getAttributes(String attribute) {
String txt = element.getAttribute(attribute);
System.out.println(txt);
}
}
