package comp.junitss;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({Sample1.class, Sample2.class, Sample3.class})

public class SuiteClass {
public static void main(String[] args) {
	Result r = JUnitCore.runClasses(Sample1.class, Sample2.class, Sample3.class);
	int runCount = r.getRunCount();
	System.out.println(runCount);
	int i = r.getIgnoreCount();
	System.out.println(i);
	int f = r.getFailureCount();
	System.out.println(f);
	List<Failure> failures = r.getFailures();
	for (Failure failure : failures) {
		System.out.println(failure);
		
	}
}
}
