package org.hotel;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class BookAHotel extends BaseClass {
	public BookAHotel() {
PageFactory.initElements(driver, this);
	}
@FindBy(id="first_name")
private static WebElement firstName;
@FindBy(id="last_name")
private static WebElement lastName;
@FindBy(id="address")
private static WebElement address;
@FindBy(id="cc_num")
private static WebElement creditCard;
@FindBy(id="cc_type")
private static WebElement cardType;
@FindBy(xpath="//select[@name=\"cc_exp_month\"][@id=\"cc_exp_month\"]")
private WebElement expMonth;
@FindBy(id="cc_exp_year")
private WebElement exYear;
@FindBy(id="cc_cvv")
private WebElement ccvno;
@FindBy(id="book_now")
private WebElement btnBookNow;
public WebElement getBtnBookNow() {
	return btnBookNow;
}
public WebElement getExpMonth() {
	return expMonth;
}
public WebElement getExYear() {
	return exYear;
}
public WebElement getCcvno() {
	return ccvno;
}
public static WebElement getFirstName() {
	return firstName;
}
public static WebElement getLastName() {
	return lastName;
}
public static WebElement getAddress() {
	return address;
}
public static WebElement getCreditCard() {
	return creditCard;
}
public static WebElement getCardType() {
	return cardType;
}





}
