package org.hotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import comp.pom.BaseClass;

public class CancelBooking extends BaseClass {
	public CancelBooking() {
		PageFactory.initElements(driver, this);
	}
@FindBy(id="radiobutton_0")
private WebElement radioBtn;
@FindBy(id="cancel")
private WebElement cancel;
public WebElement getRadioBtn() {
	return radioBtn;
}
public WebElement getCancel() {
	return cancel;
}



}
