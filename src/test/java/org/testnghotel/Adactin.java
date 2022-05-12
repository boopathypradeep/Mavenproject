package org.testnghotel;

import org.baseclass.BaseClass;
import org.hotel.LoginPage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Adactin extends BaseClass {
@BeforeClass
private void browser() {
	launchBrowser();
	launchUrl("https://adactinhotelapp.com/");

}
@Test
private void tc01() {

	LoginPage l=new LoginPage();
	BaseClass b=new BaseClass();
	WebElement txtUserName = l.getTxtUserName();
	b.enterText(txtUserName, "BoopathyPradeep");
WebElement txtPassword = l.getTxtPassword();
b.enterText(txtPassword, "Boopathy@9");
WebElement btnLogin = l.getBtnLogin();
b.clickss(btnLogin);
}

}
