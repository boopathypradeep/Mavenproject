package org.hotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmationPage {
@FindBy(id="my_itinerary")
private WebElement itinerary;

public WebElement getItinerary() {
	return itinerary;
}


}
