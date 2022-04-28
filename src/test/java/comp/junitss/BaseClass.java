package comp.junitss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	 
	public void dropDown(String selectby,WebElement element,String text,int index ) {
		
		switch (selectby) {
		case "value":
			Select select=new Select(element);
		select.selectByValue(text);
			
			break;
		case "visibletext":
			Select select1=new Select(element);
		select1.selectByValue(text);
		case "index":
			Select select2=new Select(element);
		select2.selectByIndex(index);
		default:
			break;
		}

	}
	
	
}
