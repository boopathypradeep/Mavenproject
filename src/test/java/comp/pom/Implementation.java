package comp.pom;

import org.openqa.selenium.WebElement;

public class Implementation extends Aa {
	public static void main(String[] args) throws InterruptedException {
	Aa b=new Aa();
	b.getDriver();
	b.loadUrl("https://www.facebook.com/");
	PomClass p=new PomClass();
	WebElement txtUserName = p.getTxtUserName();
b.enterText(txtUserName, "hello");
WebElement txtPassword = p.getTxtPassword();
b.enterText(txtPassword, "dfghj");

WebElement btnLogin = p.getBtnLogin();
b.click(btnLogin);


}
}