package org.tasks2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom extends BaseClass {
	public Pom() {
		PageFactory.initElements(driver, this); 
	}
	@FindBy(xpath="//input[@placeholder=\"enter your email here\"]")
private WebElement userName;
	@FindBy(xpath="//input[@placeholder=\"enter your password here\"]")
private WebElement passWord;
	@FindBy(xpath="//input[@type=\"submit\"]")
private WebElement btnSumbit;
	public WebElement getUserName() {
		return userName;
	}
	public void setUserName(WebElement userName) {
		this.userName = userName;
	}
	public WebElement getPassWord() {
		return passWord;
	}
	public void setPassWord(WebElement passWord) {
		this.passWord = passWord;
	}
	public WebElement getBtnSumbit() {
		return btnSumbit;
	}
	public void setBtnSumbit(WebElement btnSumbit) {
		this.btnSumbit = btnSumbit;
	}





}
