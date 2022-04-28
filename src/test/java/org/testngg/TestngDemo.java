package org.testngg;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngDemo {
@BeforeClass
private void beforeClass() {
	System.out.println("before class");

}
@AfterClass
private void afterClass() {
System.out.println("afterclass");

}
@AfterMethod
private void afterMethod() {
	System.out.println("after method");

}

@BeforeMethod
private void beforeMethod() {
System.out.println("before method");

}

@Test
private void test01() {
	System.out.println("test01");

}

@Test
private void test02() {
	System.out.println("test02");

}










}
