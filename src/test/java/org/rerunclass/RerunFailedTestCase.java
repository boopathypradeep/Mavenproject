package org.rerunclass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class RerunFailedTestCase {
@Test
private void tc01() {
System.out.println("Test 1");
}
@Test
private void tc02() {
	System.out.println("Test 2");

}
@Test
private void tc03() {
	String s="hello";
	assertEquals(s, "Hello");
System.out.println("Test 3");

}
}
