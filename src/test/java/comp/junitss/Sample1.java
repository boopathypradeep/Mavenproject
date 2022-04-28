package comp.junitss;

import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

public class Sample1 {
	@Test
	public void tc01() {
System.out.println("Test 1");
	}
	@Test
	public void tc02() {
		System.out.println("Test 2");

	}
	@Ignore
	@Test
	public void tc03() {
		System.out.println("Test 3");
	}
	@Test
	public void tc04() {
		assertTrue(false);
		System.out.println("Test 4");

	}
@Test
public void tc05() {
	System.out.println("Test 5");

}

}
