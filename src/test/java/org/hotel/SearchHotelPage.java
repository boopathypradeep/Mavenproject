gpackage org.hotel;

import org.baseclass.BaseClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchHotelPage extends BaseClass {
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
@FindBy(id="location")
private WebElement location;
@FindBy(id="hotels")
private WebElement hotels;
@FindBy(id="room_type")
private WebElement roomType;
@FindBy(id="room_nos")
private WebElement roomNos;
@FindBy(id="datepick_in")
private WebElement checkIn;
@FindBy(id="datepick_out")
private WebElement checkOut;
@FindBy(id="adult_room")
private WebElement adult;
@FindBy(id="child_room")
private WebElement children;
@FindBy(id="Submit")
private WebElement sumbit;
public WebElement getLocation() {
	return location;
}
public WebElement getHotels() {
	return hotels;
}
public WebElement getRoomType() {
	return roomType;
}
public WebElement getRoomNos() {
	return roomNos;
}
public WebElement getCheckIn() {
	return checkIn;
}
public WebElement getCheckOut() {
	return checkOut;
}
public WebElement getAdult() {
	return adult;
}
public WebElement getChildren() {
	return children;
}
public WebElement getSumbit() {
	return sumbit;
}


}
