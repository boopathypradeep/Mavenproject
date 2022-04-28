package com.tstng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TST {
@BeforeClass
private void beforeClass() {
System.out.println("mthod1");
}
@BeforeMethod
private void beforeMethod() {
System.out.println("method2");
}
@AfterMethod
private void afterMethod() {
System.out.println("method3");
}
@Test
private void tc01() {
System.out.println("method 4");
}
@Test
private void tco3() {
System.out.println("method5");
}
@AfterClass
private void afterClass() {
System.out.println("afterclass");
}

}
