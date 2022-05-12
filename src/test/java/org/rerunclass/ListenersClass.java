package org.rerunclass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class ListenersClass implements IAnnotationTransformer{

	@Override
	public void transform(ITestAnnotation annotations, Class arg1, Constructor arg2, Method arg3) {
	IRetryAnalyzer result = annotations.getRetryAnalyzer();
	if (result==null) {
		annotations.setRetryAnalyzer(FailedTestCase.class);
	}	
	}

}
