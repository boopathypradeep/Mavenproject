package org.testngg;

import org.testng.annotations.Test;

public class Implement3 {
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
System.out.println("method 2");
}@Test(groups="@sanity")
private void tc04() {
System.out.println("method 2");
}@Test(groups="@regresion")
private void tc05() {
System.out.println("method 2");
}@Test(groups="@retest")
private void tc06() {
System.out.println("method 2");
}@Test(groups="@smoke")
private void tc07() {
System.out.println("method 2");
}











}
