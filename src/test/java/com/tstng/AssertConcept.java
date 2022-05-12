package com.tstng;

import static org.testng.Assert.assertEquals;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertConcept extends BaseClass{
@Test
private void tc01() {
	launchBrowser();
	launchUrl("https://www.facebook.com/");
	WebElement element = locatingElement("id", "email");
enterText(element, "boopathy");
String attribute = element.getAttribute("value");
assertEquals("Boopathy", attribute);
WebElement element2 = locatingElement("id", "pass");
enterText(element2, "pradeep");
WebElement element3 = locatingElement("name", "login");
clickss(element3);
}
@Test
private void tco2() {
	launchBrowser();
	launchUrl("https://www.facebook.com/");
	WebElement element = locatingElement("id", "email");
enterText(element, "boopathy");
String attribute = element.getAttribute("value");
SoftAssert s=new SoftAssert();
s.assertEquals("Boopathy", attribute);
WebElement element2 = locatingElement("id", "pass");
enterText(element2, "pradeep");
WebElement element3 = locatingElement("name", "login");
clickss(element3);
}
}
