package com.otaras.testautomation.testscripts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.otaras.testautomation.common.reports.ComplexReportFactory;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import java.lang.reflect.Method;

public class BaseTest {
//	@BeforeMethod
//	public void beforeMethod(Method caller) {
//		ComplexReportFactory.getTest(caller.getName(), "This is a simple test from complex factory");
//	}
//
//	@AfterMethod
//	public void afterMethod(Method caller) {
//		ComplexReportFactory.closeTest(caller.getName());
//
//	}
//
//	/*
//	 * After suite will be responsible to close the report properly at the end
//	 * You an have another afterSuite as well in the derived class and this one
//	 * will be called in the end making it the last method to be called in test exe
//	 */
//	@AfterSuite
//	public void afterSuite() {
//		ComplexReportFactory.closeReport();
//	}
}
