package org.junithotel;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;



public class Implementation extends BaseClass1 {

@BeforeClass
public static void beforeclasses() {
launchBrowser();
launchUrl("https://adactinhotelapp.com/");
maximize();
}
@Test
public void TC01() throws IOException {
	implicitlyWaitss();
	locatingElement("id", "username");
	String excelRead = excelRead("New Datas", 1, 0);
enterText(excelRead); 
}	
	@Test
	public void tc02() throws IOException {
		implicitlyWaitss();
		locatingElement("id", "password");
		String excelRead = excelRead("New Datas", 1, 1);
		enterText(excelRead);
		locatingElement("id", "login");
		clickss();
	}
	@Test
	public void tc03() throws IOException {
		locatingElement("id", "location");
		String excelRead = excelRead("New Datas", 1, 2);
	selectBy("value",excelRead ,0 );
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	


}
