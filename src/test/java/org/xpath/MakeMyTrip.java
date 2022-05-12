package org.xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.makemytrip.com/flight/search?itinerary=DEL-BLR-01/05/2022&tripType=O&paxType=A-1_C-0_I-0&intl=false&cabinClass=E&ccde=IN&lang=eng&cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|RSA|529579609614");
	
	
}
}
