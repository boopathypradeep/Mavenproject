package org.testngg;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
public class Implement {
@Test(groups="@retest")
private void tc01() {
System.out.println("method 1"); 
}
@Test(groups="@regresion")
private void tc02() {
System.out.println("method 2");
}
@Test(groups="@smoke")
private void tc03() {
System.out.println("method 3");
}@Test(groups="@sanity")
private void tc04() {
String s="Hello";
assertTrue(false);
System.out.println("method 4");
}@Test(groups="@regresion")
private void tc05() {
System.out.println("method 5");
}@Test(groups="@retest")
private void tc06() {
System.out.println("method 6");
}@Test(groups="@smoke")
private void tc07() {
System.out.println("method 7");
}











}
