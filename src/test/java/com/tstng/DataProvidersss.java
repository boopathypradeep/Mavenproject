package com.tstng;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidersss extends BaseClass {
@BeforeClass
public void beforeClass() {
	launchBrowser();
	launchUrl("https://www.facebook.com/");
impilicitlyWaits();
}
@Test(dataProvider="datas")
private void login(String username, String password) {
	
	WebElement element = locatingElement("id", "email");
	enterText(element, username);
	WebElement element2 = locatingElement("id", "pass");
	enterText(element2, password);
	WebElement element3 = locatingElement("name", "login");
clickss(element3);

}
//@DataProvider(name="datas")
//private Object[][] datas() {
//	return new Object[][]{
//		{"ram sarath","12345"},
//		{"boopathy","4567890"},
//		{"gnanaprakash","56789076"}
//	};
//}
@DataProvider
private Object[][] datas() throws FileNotFoundException, IOException {
	return new Object[][] {
		{excelDatas(0, 0),excelDatas(0, 1)},
		{excelDatas(1, 0),excelDatas(1, 1)},
		
	};

}
@AfterTest
private void quitBrowser() {
	closeBrowser();

}
















}
