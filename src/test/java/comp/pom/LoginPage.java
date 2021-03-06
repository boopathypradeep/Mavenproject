package comp.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import comp.junitss.Aa;

public class LoginPage extends BaseClass {
public LoginPage() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="username")
private WebElement txUsername;
@FindBy(id="password")
private WebElement txtPassword;
@FindBy(name="login") 
private WebElement btnLogin;
public WebElement getTxUsername() {
	return txUsername;
}
public WebElement getTxtPassword() {
	return txtPassword;
}
public WebElement getBtnLogin() {
	return btnLogin;
}




}
