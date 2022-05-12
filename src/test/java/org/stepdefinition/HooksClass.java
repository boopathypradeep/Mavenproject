package org.stepdefinition;

import org.baseclass.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass {
@Before
public void beforeScenario() {
	launchBrowser();
launchUrl("https://adactinhotelapp.com/");
}
@After

public void screenShot(Scenario s) {
	if (s.isFailed()) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
		s.embed(screenshotAs, "s.png");
		
	}
	closeBrowser();

}
	
	
	
	
	
	
	
	
	
}
