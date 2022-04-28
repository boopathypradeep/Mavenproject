package org.testngg;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Sample {
	@Test
	private void tc01() {
		System.out.println("test 1");

	}

	@Test
private void tc02(String s,String s2) {
System.out.println(s);
System.out.println(s2);
}
@Test
private void tc03() {
System.out.println("test 3");

}
@Test
private void tc04() {
System.out.println("test4");
}
@Test
private void tc05() {
System.out.println("test 5");

}

}
