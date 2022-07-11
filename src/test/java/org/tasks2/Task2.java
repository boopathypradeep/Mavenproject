package org.tasks2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Task2 extends BaseClass{
	@BeforeClass
	public void launchBrowser() {
	 BaseClass b=new BaseClass();
	 b.launchBrowser();
	 maximize();
	 launchUrl("https://app-dev.wishup.co/login?redirect=%2F");
implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(dataProvider="datas")
	public void login(String userName, String passWord) {
	Pom p=new Pom();
	WebElement userName2 = p.getUserName();
BaseClass b=new BaseClass();
b.enterText(userName2, userName);
WebElement passWord2 = p.getPassWord();
b.enterText(passWord2, passWord);
WebElement btnSumbit = p.getBtnSumbit();
btnClick(btnSumbit);
b.navigateBack();
	WebElement userName3 = p.getUserName();
	clear(userName3);
WebElement passWord3 = p.getPassWord();
clear(passWord3); 
	
	
	}
@DataProvider(name="datas")
public Object[][] sampleDatas() {
return new Object[][] {
	{"wishup_testuser1@gmail.com","testpw1"},////valid username and valid password 
	{"wishup_testuser2@gmail.com","testw2"},//valid username and invalid password 
	{"wishup_testuser@gmail.com","testpw1"},//invalid username and valid password
	{"wishup_testuser@gmail.com","testpw"},//invalid username without numerics and invalid password
	{"wishup_testuser1gmail.com","testpw1"},//invalid username without @symbol and valid password
	{"1@gmail.com","testpw1"}//invalid username with no aphabets and valid password
	
};
}
	
	
}
