package org.testnghotel;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.hotel.SearchHotelPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SearchHotelss extends BaseClass {
	@Test
	private void searchPage() throws IOException {
		SearchHotelPage s=new SearchHotelPage();
		WebElement location = s.getLocation();
BaseClass b=new BaseClass();
b.selectBy(location, "value", excelRead(1, 0), 0);

		
		
		
		
		
		
		
	}

}
