/**
 * 
 */
package org.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import comp.pom.BaseClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef  {
	static WebDriver driver;
	@Before
	public void beforeScenario() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();

	}
	@After
	public void afterScenario() {
		driver.quit();

	}

	@Given("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
	
	   WebElement element = driver.findElement(By.id("email"));
	   element.sendKeys("boopathy pradeep");
	   WebElement element2 = driver.findElement(By.id("pass"));
	   element2.sendKeys("report");
	}

	@When("user clicks login button")
	public void user_clicks_login_button() {
	WebElement element = driver.findElement(By.name("login"));  
	element.click();
		}

	@Then("user should verify the successfull login of facebook")
	public void user_should_verify_the_successfull_login_of_facebook() {
	 System.out.println("successfull login of facebook");
	}	


}
