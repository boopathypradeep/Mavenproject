package comp.junitss;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import comp.pom.LoginPage;

public class ExcelSheet extends Aa{
	public ExcelSheet() {
PageFactory.initElements(driver, this);
	}
@BeforeClass
public static void launchBrowser() {
	getDriver();
	loadUrl("http://adactinhotelapp.com/");
	maximize();
}
@Test
public void launchHotel() throws IOException {
	LoginPage login=new LoginPage();
	
getData("Adactin", 0, 0);
}

}
