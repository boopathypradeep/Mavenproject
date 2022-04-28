package comp.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BaseClass {
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
@FindBy(id="location")
private WebElement location;
@FindBy(id="hotels")
private WebElement hotels;
@FindBy(id="room_type")
private WebElement roomType;
@FindAll({@FindBy(id="room_nos"),
@FindBy(xpath="//select[@name=\"room_nos\"]")})
private WebElement roomNo;
@FindBy(id="datepick_in")
private WebElement checkin;
@FindBy(id="datepick_out")
private WebElement checkout;
@FindBy(id="adult_room")
private WebElement adult;
@FindBy(id="child_room")
private WebElement child;
@FindBy(id="Submit")
private WebElement submit;
public WebElement getLocation() {
	return location;
}
public WebElement getHotels() {
	return hotels;
}
public WebElement getRoomType() {
	return roomType;
}
public WebElement getRoomNo() {
	return roomNo;
}
public WebElement getCheckin() {
	return checkin;
}
public WebElement getCheckout() {
	return checkout;
}
public WebElement getAdult() {
	return adult;
}
public WebElement getChild() {
	return child;
}
public WebElement getSubmit() {
	return submit;
}













}
