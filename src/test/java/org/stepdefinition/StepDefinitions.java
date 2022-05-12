package org.stepdefinition;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.hotel.BookAHotel;
import org.hotel.BookedItinery;
import org.hotel.CancelSelected;
import org.hotel.LoginPage;
import org.hotel.SearchHotelPage;
import org.hotel.SelectPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions extends BaseClass {
	@When("user enters the valid username in username field")
	public void user_enters_the_valid_username_in_username_field() throws IOException {
		LoginPage l=new LoginPage();
		WebElement txtUserName = l.getTxtUserName();
		BaseClass b=new BaseClass();
		b.enterText(txtUserName, excelRead("Datas", 1, 0));
		
	}

	@When("user enters the valid password in password field")
	public void user_enters_the_valid_password_in_password_field() throws IOException {
		LoginPage l=new LoginPage();
		WebElement txtPassword = l.getTxtPassword();
		BaseClass b=new BaseClass();
		b.enterText(txtPassword, excelRead("Datas", 1, 1));
	}

	@When("clicks the login button")
	public void clicks_the_login_button() {
		LoginPage l=new LoginPage();
		WebElement btnLogin = l.getBtnLogin();
		BaseClass b=new BaseClass();
		b.clickss(btnLogin);
	}

	@Then("error message should appear")
	public void error_message_should_appear() {
	    System.out.println("login page is successfully Validated");
	}
	@Given("user should be on the search page of adactin hotel application")
	public void user_should_be_on_the_search_page_of_adactin_hotel_application() {
		System.out.println("user is on the search page of adactin hotel");
	}

	@When("user selects the {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_selects_the(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
		SearchHotelPage s=new SearchHotelPage();
		WebElement location = s.getLocation();
		BaseClass b=new BaseClass();
		b.selectBy(location, "value", string, 0);
		WebElement hotels = s.getHotels();
		b.selectBy(hotels, "value", string2, 0);
		WebElement roomType = s.getRoomType();
		b.selectBy(roomType, "value", string3, 0);
		WebElement roomNos = s.getRoomNos();
		b.selectBy(roomNos, "value", string4, 0);
		WebElement checkIn = s.getCheckIn();
		b.enterText(checkIn, string5);
		WebElement checkOut = s.getCheckOut();
		b.enterText(checkOut, string6);
		WebElement adult = s.getAdult();
		b.selectBy(adult, "value", string7, 0);
		WebElement children = s.getChildren();
		b.selectBy(children, "value", string8, 0);
		
	}

	@When("user clicks on search button")
	public void user_clicks_on_search_button() {
		SearchHotelPage s=new SearchHotelPage();
		BaseClass b=new BaseClass();
		WebElement sumbit = s.getSumbit();
		b.clickss(sumbit);
	}

	@Then("user should be successfully search hotel")
	public void user_should_be_successfully_search_hotel() {
	    System.out.println("user successfully searched for the hotel");
	}
	@Given("user should be on the select hotel page of adactin hotel application")
	public void user_should_be_on_the_select_hotel_page_of_adactin_hotel_application() {
	    System.out.println("user is on the search hotel page");
	}

	@When("user clicks the select button")
	public void user_clicks_the_select_button() {
		SelectPage s=new SelectPage();
		WebElement radioBtn = s.getRadioBtn();
		BaseClass b=new BaseClass();
		b.clickss(radioBtn);
		
	}
	

	@When("user clicks the continue button")
	public void user_clicks_the_continue_button() {
		SelectPage s=new SelectPage();
		BaseClass b=new BaseClass();
		WebElement btnContinue = s.getBtnContinue();
		b.clickss(btnContinue);
	}

	@Then("user should be able to navigate book a hotel page")
	public void user_should_be_able_to_navigate_book_a_hotel_page() {
	   System.out.println("user has been successfully navigated to book a hotel page");
	}
	@Given("user should be on the book a hotel page")
	public void user_should_be_on_the_book_a_hotel_page() {
	   System.out.println("user is on the book a hotel page"); 
	}

	@When("user enters the first name")
	public void user_enters_the_first_name() throws IOException {
		BookAHotel b1 = new BookAHotel();
		WebElement firstName = b1.getFirstName();
		BaseClass b=new BaseClass();
		b.enterText(firstName, excelRead("Datas", 1, 2));
		
	}

	@When("user enters the last name")
	public void user_enters_the_last_name() throws IOException {
		BookAHotel b1 = new BookAHotel();
		WebElement lastName = b1.getLastName();
		BaseClass b=new BaseClass();
		b.enterText(lastName, excelRead("Datas", 1, 3));
	}

	@When("user enters the billing address")
	public void user_enters_the_billing_address() throws IOException {
		BookAHotel b1 = new BookAHotel();
		WebElement address = b1.getAddress();
		BaseClass b=new BaseClass();
		b.enterText(address, excelRead("Datas", 1, 4));
	}

	@When("user enters the credit card number")
	public void user_enters_the_credit_card_number() throws IOException {
		BookAHotel b1 = new BookAHotel();
	    WebElement creditCard = b1.getCreditCard();
	    BaseClass b=new BaseClass();
	    b.enterText(creditCard, excelRead("Datas", 1, 5));
	}

	@When("user enters the credit card type")
	public void user_enters_the_credit_card_type() throws IOException, InterruptedException {
		BookAHotel b1 = new BookAHotel();
		WebElement cardType = b1.getCardType();
		BaseClass b=new BaseClass();
		b.selectBy(cardType, "value", excelRead("Datas", 1, 6), 0);
		Thread.sleep(3000);
	}

	@When("user enters the expiry date")
	public void user_enters_the_expiry_date() throws IOException {
		BookAHotel b1 = new BookAHotel();
		WebElement expMonth = b1.getExpMonth();
		BaseClass b=new BaseClass();
		b.selectBy(expMonth, "index", "",4 );
		WebElement exYear = b1.getExYear();
		b.selectBy(exYear, "index", "", 3);
	}

	@When("user enters the cvv number")
	public void user_enters_the_cvv_number() throws IOException {
		BookAHotel b1 = new BookAHotel();
		WebElement ccvno = b1.getCcvno();
		BaseClass b=new BaseClass();
		b.enterText(ccvno, excelRead("Datas", 1, 9));
	}

	@When("user clicks the book now button")
	public void user_clicks_the_book_now_button() throws InterruptedException {
		BookAHotel b1 = new BookAHotel();
		WebElement btnBookNow = b1.getBtnBookNow();
		BaseClass b=new BaseClass();
		b.clickss(btnBookNow);
		b.impilicitlyWaits();
	}

	@Then("user should be successfully enter to booking confirmation page")
	public void user_should_be_successfully_enter_to_booking_confirmation_page() {
	   System.out.println("sucessfully completed booking confirmation");
	}
	@When("user clicks on the button my itinerary")
	public void user_clicks_on_the_button_my_itinerary() {
		CancelSelected c=new CancelSelected();
		WebElement btnMyItinerary = c.getBtnMyItinerary();
		BaseClass b=new BaseClass();
		b.clickss(btnMyItinerary);
	}

	@Then("booked itinerary page will be displayed")
	public void booked_itinerary_page_will_be_displayed() {
System.out.println("itinerary page is navigated");  
	}

	@When("user clicks order id button")
	public void user_clicks_order_id_button() {
		BookedItinery b1=new BookedItinery();
		WebElement btnOrderId = b1.getBtnOrderId();
		BaseClass b=new BaseClass();
		b.clickss(btnOrderId);
	}

	@When("user clicks cancel selected")
	public void user_clicks_cancel_selected() {
		BookedItinery b1=new BookedItinery();
		WebElement btnCancelAll = b1.getBtnCancelAll();
		BaseClass b=new BaseClass();
		b.clickss(btnCancelAll);
	}

	@When("user should click ok on alert")
	public void user_should_click_ok_on_alert() {
	   BaseClass b=new BaseClass();
	   b.alert();
	}

	@When("user should click search hotel button")
	public void user_should_click_search_hotel_button() {
		CancelSelected c=new CancelSelected();
		WebElement btnsearchHotel = c.getBtnsearchHotel();
		BaseClass b=new BaseClass();
		b.clickss(btnsearchHotel);
	}

	@Then("adactin hotel application is successfully validated")
	public void adactin_hotel_application_is_successfully_validated() {
	   System.out.println("applicationis successfully alidated");
	}





}
