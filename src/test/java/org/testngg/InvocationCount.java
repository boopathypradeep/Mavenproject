package org.testngg;

import org.testng.annotations.Test;

public class InvocationCount {
@Test(priority=5,invocationCount=5)
private void tc01() {
System.out.println("method1");
}
@Test(priority=3)
private void tc02() {
System.out.println("method2");
}
@Test(priority=-3,enabled=false)
private void tc03() {
System.out.println("method3");
}
@Test(priority=4)
private void tc04() {
System.out.println("method4");
}
}
