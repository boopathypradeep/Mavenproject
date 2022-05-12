package org.hotel;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
@FindBy(id="username")
private static WebElement txtUserName;
@FindBy(id="password")
private static WebElement txtPassword;
@FindBy(id="login")
private WebElement btnLogin;
public WebElement getBtnLogin() {
	return btnLogin;
}
public static WebElement getTxtUserName() {
	return txtUserName;
}
public static WebElement getTxtPassword() {
	return txtPassword;
}

}