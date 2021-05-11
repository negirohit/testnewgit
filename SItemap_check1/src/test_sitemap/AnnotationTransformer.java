package test_sitemap;


import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;



public class AnnotationTransformer implements IAnnotationTransformer {
	 
	
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
	}
	



}