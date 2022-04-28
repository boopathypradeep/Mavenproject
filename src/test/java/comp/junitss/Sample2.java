package comp.junitss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class Sample2 {
	@Test
	public void tc01() {
System.out.println("Test 1");
	}
	@Test
	public void tc02() {
		System.out.println("Test 2");
		String s= "Hello";
		System.out.println(s);
		assertFalse(false);
		System.out.println("hii");
		System.out.println("Bye");

	}
	@Test
	public void tc03() {
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
