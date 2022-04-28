package com.maven.AxisBank1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SirClassJunit {
	@BeforeClass
	public static void beforeClass1() {
System.out.println("Before Class");
	}
	@AfterClass
	public static void afterClass1() {
	System.out.println("afterclass");
	}
	@Before
	public void before11() {
System.out.println("Before");
	}
	@After
	public void after1() {
	System.out.println("After");
	}

@Test
public void test1() {
System.out.println("Test");
}
@Test
public void test2() {
System.out.println("Test 1");
}



}
