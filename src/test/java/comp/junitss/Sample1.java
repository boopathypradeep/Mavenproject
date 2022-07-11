package comp.junitss;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;


import org.junit.Ignore;
import org.junit.Test;

public class Sample1 {
	@Test
	public void tc01() {
System.out.println("Test 1");
	}
	@Test
	public void tc02() {
		String s="hello";
		assertEquals(s, "Hello");
		System.out.println("Test 2");

	}
	@Ignore
	@Test
	public void tc03() {
		System.out.println("Test 3");
	}
	@Test
	public void tc04() {
	
		System.out.println("Test 4");

	}


}
