package com.tstng;

import org.baseclass.BaseClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class PrlExecution extends BaseClass {
@Test
public void tc01() {
	launchBrowser();
	launchUrl("https://www.facebook.com/");
}
@Test
private void tc02() {
launchBrowser();
launchUrl("https://www.amazon.in/");
}
@Test
private void tc03() {
	launchBrowser();
	launchUrl("https://www.google.com/");

}

















}
