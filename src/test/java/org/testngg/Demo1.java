package org.testngg;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Demo1 {
@Test
private void tc01() {
	System.out.println("test 1");

}
@Parameters({"username","password"})
@Test
private void tc02(String s,String s1) {
	System.out.println(s);
System.out.println();
}
@Test
private void tc03() {
	System.out.println("test 3");

}
@Test
private void tc04() {
	System.out.println("test 4");

}
@Test
private void tc05() {
	System.out.println("test 5");

}


















}
