package org.hotel;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelSelected extends BaseClass {
	public CancelSelected() {
		PageFactory.initElements(driver, this);
	}
@FindBy(id="my_itinerary")
private WebElement btnMyItinerary;
@FindBy(id="search_hotel")
private WebElement btnsearchHotel;
public WebElement getBtnMyItinerary() {
	return btnMyItinerary;
}
public WebElement getBtnsearchHotel() {
	return btnsearchHotel;
}

}
