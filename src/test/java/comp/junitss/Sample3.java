package comp.junitss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.framework.Assert;

public class Sample3 {
	@Test
	public void tc01() {
System.out.println("Test 1");
	}
	@Test
	public void tc02() {
		String s="Test 2";
		System.out.println(s);
assertNotEquals("Test 2", s);
System.out.println("hello");
		

	}
	@Test
	public void tc03() {
		assertTrue(false);
		System.out.println("Test 3");
	}
	@Test
	public void tc04() {
		System.out.println("Test 4");

	}
@Test
public void tc05() {
	System.out.println("Test 5");

}

}
