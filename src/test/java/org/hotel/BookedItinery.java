package org.hotel;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItinery extends BaseClass {
	public BookedItinery() {
		PageFactory.initElements(driver, this);
	}
	
@FindBy(id="check_all")
private WebElement btnOrderId;
@FindBy(name="cancelall")
private WebElement btnCancelAll;

public WebElement getBtnOrderId() {
	return btnOrderId;
}
public WebElement getBtnCancelAll() {
	return btnCancelAll;
}


}
