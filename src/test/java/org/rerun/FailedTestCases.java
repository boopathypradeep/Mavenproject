package org.rerun;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

import com.tstng.RetryTestCases;

public class FailedTestCases implements IAnnotationTransformer{

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		IRetryAnalyzer result = annotation.getRetryAnalyzer();
		if (result==null) {
			annotation.setRetryAnalyzer(RetryTestCases.class);
		}
		
	}

}
