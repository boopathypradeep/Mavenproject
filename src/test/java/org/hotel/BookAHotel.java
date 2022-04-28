package org.hotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import comp.pom.BaseClass;

public class BookAHotel extends BaseClass {
	public BookAHotel() {
PageFactory.initElements(driver, this);
	}
@FindBy(id="first_name")
private WebElement firstName;
@FindBy(id="last_name")
private WebElement lastName;
@FindBy(id="address")
private WebElement address;
@FindBy(id="cc_num")
private WebElement creditCard;
@FindBy(id="cc_type")
private WebElement cardType;
@FindBy(id="cc_exp_month")
private WebElement expMonth;
@FindBy(id="cc_exp_year")
private WebElement expyear;
@FindBy(id="cc_cvv")
private WebElement cvvNo;
@FindBy(id="cancel")
private WebElement cancel;
public WebElement getFirstName() {
	return firstName;
}
public WebElement getLastName() {
	return lastName;
}
public WebElement getAddress() {
	return address;
}
public WebElement getCreditCard() {
	return creditCard;
}
public WebElement getCardType() {
	return cardType;
}
public WebElement getExpMonth() {
	return expMonth;
}
public WebElement getExpyear() {
	return expyear;
}
public WebElement getCvvNo() {
	return cvvNo;
}
public WebElement getCancel() {
	return cancel;
}




}
