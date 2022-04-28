package org.hotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import comp.pom.BaseClass;

public class SelectPage extends BaseClass{
	public SelectPage() {
		PageFactory.initElements(driver, this);
	}
@FindAll({@FindBy(name="radiobutton_0"),
	@FindBy(name="radiobutton_0")})
	private WebElement radioBtn;
	@FindBy(id="continue")
	private WebElement btnContinue;
	public WebElement getRadioBtn() {
		return radioBtn;
	}
	public WebElement getBtnContinue() {
		return btnContinue;
	}


	

}
