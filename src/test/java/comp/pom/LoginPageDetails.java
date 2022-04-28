package comp.pom;

import org.hotel.BookAHotel;
import org.hotel.CancelBooking;
import org.hotel.SelectPage;
import org.openqa.selenium.WebElement;

public class LoginPageDetails extends BaseClass {
	public static void main(String[] args) {
		BaseClass b=new BaseClass();
		b.launchBrowser();
		b.launchUrl("http://adactinhotelapp.com/");
		LoginPage l=new LoginPage();
		WebElement txUsername = l.getTxUsername();
		b.enterText(txUsername, "BoopathyPradeep");
	WebElement txtPassword = l.getTxtPassword();
	b.enterText(txtPassword, "Boopathy@9");
	WebElement btnLogin = l.getBtnLogin();
	b.btnClick(btnLogin);
	SearchPage s=new SearchPage();
	WebElement location = s.getLocation();
	b.SelectByVisibleTextss(location, "Melbourne");
	WebElement hotels = s.getHotels();
	b.SelectByVisibleTextss(hotels, "Hotel Sunshine");
	WebElement roomType = s.getRoomType();
	b.SelectByValuess(roomType, "Deluxe");
	WebElement roomNo = s.getRoomNo();
	b.SelectByIndexss(roomNo, 3);
	WebElement checkin = s.getCheckin();
	b.enterText(checkin, "20/04/2022");
	WebElement checkout = s.getCheckout();
	b.enterText(checkout, "22/04/2022");
	WebElement adult = s.getAdult();
	b.SelectByIndexss(adult, 3);
	WebElement child = s.getChild();
	b.SelectByIndexss(child, 3);
	WebElement submit = s.getSubmit();
	b.btnClick(submit);
	SelectPage s1=new SelectPage();
	WebElement radioBtn = s1.getRadioBtn();
	b.btnClick(radioBtn);
	WebElement btnContinue = s1.getBtnContinue();
	b.btnClick(btnContinue);
	BookAHotel b1=new BookAHotel();
	WebElement firstName = b1.getFirstName();
	b.enterText(firstName, "Boopathy");
	WebElement lastName = b1.getLastName();
	b.enterText(lastName, "Pradeep");
	WebElement address = b1.getAddress();
	b.enterText(address, "Kondappanaickenpatty");
	WebElement creditCard = b1.getCreditCard();
	b.enterText(creditCard, "234567890");
	WebElement cardType = b1.getCardType();
	b.SelectByIndexss(cardType, 4);
	WebElement expMonth = b1.getExpMonth();
	b.SelectByIndexss(expMonth, 5);
	WebElement expyear = b1.getExpyear();
	b.SelectByIndexss(expyear, 6);
	WebElement cvvNo = b1.getCvvNo();
	b.enterText(cvvNo, "343");
	WebElement cancel = b1.getCancel();
	b.btnClick(cancel);
	CancelBooking c=new CancelBooking();
	WebElement radioBtn2 = c.getRadioBtn();
	b.btnClick(radioBtn2);
	WebElement cancel2 = c.getCancel();
	b.btnClick(cancel2);
	
	
	
	
	
	
	
	
	
	}

}
