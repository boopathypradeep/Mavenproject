package org.datatablestepdef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdef {
	 static WebDriver driver;
	@Given("user is on the login page of the facebook on chrome browser")
	public void user_is_on_the_login_page_of_the_facebook_on_chrome_browser() {
	    WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	     driver.get("https://www.facebook.com/");
	}

	@When("user enters the valid username and valid password")
	public void user_enters_the_valid_username_and_valid_password(io.cucumber.datatable.DataTable dataTable) {
	    
	List<String> asList = dataTable.asList();
	driver.findElement(By.id("email")).sendKeys(asList.get(0));
	   driver.findElement(By.id("pass")).sendKeys(asList.get(1));
	}

	@When("user clicks enter button")
	public void user_clicks_enter_button() {
	   
	}

	@Then("user should enter the login application successfully")
	public void user_should_enter_the_login_application_successfully() {
	    
	}

}
