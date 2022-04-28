package org.stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinStepDef {
	static WebDriver driver;
	@Given("user is on login page of adactin login page in chrome browser")
	public void user_is_on_login_page_of_adactin_login_page_in_chrome_browser() {
	    WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	    driver.get("https://adactinhotelapp.com/");
	}

	@When("user enters valid {string} and valid {string}")
	public void user_enters_valid_and_valid(String string, String string2) {
	 WebElement element = driver.findElement(By.id("username"));  
	 element.sendKeys(string);

	 WebElement element1 = driver.findElement(By.id("password"));  
	 element1.sendKeys(string2);
	
	}

	@When("user should click login button")
	public void user_should_click_login_button() {
	    WebElement btnLogin = driver.findElement(By.id("login"));
	    btnLogin.click();
	}
	@When("user enters {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_enters(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	   WebElement element = driver.findElement(By.id("location"));
	   Select select=new Select(element);
	   select.selectByValue(string);
	   WebElement element1 = driver.findElement(By.id("hotels"));
	   Select select1=new Select(element1);
	   select1.selectByValue(string2);
	   WebElement element2 = driver.findElement(By.id("room_type"));
	   Select select2=new Select(element2);
	   select2.selectByValue(string3);
	   WebElement element3 = driver.findElement(By.id("room_nos"));
	   Select select3=new Select(element3);
	   select3.selectByValue(string4);
	   WebElement element4 = driver.findElement(By.id("datepick_in"));  
		 element4.sendKeys(string5);
		 WebElement element5 = driver.findElement(By.id("datepick_out"));  
		 element5.sendKeys(string6);
		   WebElement element6 = driver.findElement(By.id("adult_room"));
		   Select select4=new Select(element6);
		   select4.selectByValue(string7);
	   
		   WebElement element7 = driver.findElement(By.id("adult_room"));
		   Select select5=new Select(element7);
		   select5.selectByValue(string8);
	   
	}

	@When("user clicks search button")
	public void user_clicks_search_button() {
	    WebElement element = driver.findElement(By.id("Submit"));
	    element.click();
	}
	@When("user clicks on select button")
	public void user_clicks_on_select_button() {
	    WebElement element = driver.findElement(By.id("radiobutton_0"));
	    element.click();
	}

	@When("user should click continue")
	public void user_should_click_continue() {
		WebElement element = driver.findElement(By.id("continue"));
	    element.click(); 
	}
	@When("user should enters {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_enters(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	    WebElement element = driver.findElement(By.id("first_name"));
	    element.sendKeys(string);
	    WebElement element1 = driver.findElement(By.id("last_name"));
	    element1.sendKeys(string2);
	    WebElement element2 = driver.findElement(By.id("address"));
	    element2.sendKeys(string3);
	    WebElement element3 = driver.findElement(By.id("cc_num"));
	    element3.sendKeys(string4);
	    WebElement element4 = driver.findElement(By.id("cc_type"));
	  Select select=new Select(element4);
	  select.selectByValue(string5);
	    WebElement element5 = driver.findElement(By.id("cc_exp_month"));
		  Select select2=new Select(element5);
		  select2.selectByValue(string6);
		    WebElement element6 = driver.findElement(By.id("cc_exp_year"));
			  Select select3=new Select(element6);
			  select3.selectByValue(string7);
			   WebElement element7 = driver.findElement(By.id("cc_cvv"));
			    element7.sendKeys(string8);
	}

	@When("user should click booknow button")
	public void user_should_click_booknow_button() throws InterruptedException {
	    WebElement element = driver.findElement(By.id("book_now"));
	    element.click();
	   Thread.sleep(6000);
	}
	@When("user clicks my itinery button")
	public void user_clicks_my_itinery_button() {
		 WebElement element = driver.findElement(By.xpath("//input[@id=\"my_itinerary\"][@value=\"My Itinerary\"]"));
		 element.click();
	}
@When("user clicks order id")
public void user_clicks_order_id() {
	WebElement element = driver.findElement(By.name("check_all"));
	element.click();
}

@When("user clicks search hotel")
public void user_clicks_search_hotel() {
	WebElement element = driver.findElement(By.id("search_hotel"));
	element.click();
}

@Then("order id should be created")
public void order_id_should_be_created() {
  System.out.println("order id is create");
}


}
