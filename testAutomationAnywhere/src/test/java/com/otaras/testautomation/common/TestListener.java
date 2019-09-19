package com.otaras.testautomation.common;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class TestListener implements ITestListener,ISuiteListener, IInvokedMethodListener{

	public ExtentTest testReport;
	private ExtentReports extent;
	public String InfoFontColorPrefix="<span ><font color='purple';font-size:10%; line-height:20px>";
	public String InfoFontColorSuffix="</font></span>";
	public String ErrorFontColorPrefix="<span><font color='red';font-size:16px; line-height:20px>";
	public String ErrorFontColorSuffix="</font></span>";
	
//	public TestListener(ExtentTest testReport) {
//		  this.testReport=testReport;
//
//	  }
	
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("on test method " +  getTestMethodName(result) + " start");
		 System.out.println("The name of the testcase Skipped is :"+result.getName());
		//  testReport.log(Status.INFO, InfoFontColorPrefix+"Anil Kumar"+InfoFontColorSuffix);
		 
//		 testReport.log(Status.INFO,InfoFontColorPrefix+"on test method " +  getTestMethodName(result) + " start" +InfoFontColorSuffix);
//		 testReport.log(Status.INFO,InfoFontColorPrefix+"The name of the testcase Skipped is :"+result.getName() +InfoFontColorSuffix);
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("on test method " + getTestMethodName(result) + " success");
	//	testReport.log(Status.INFO,InfoFontColorPrefix+"on test method " + getTestMethodName(result) + " success" +InfoFontColorSuffix);
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("on test method " + result +  getTestMethodName(result) + " failure");
	//	testReport.log(Status.INFO,InfoFontColorPrefix+"on test method " + result +  getTestMethodName(result) + " failure" +InfoFontColorSuffix);
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("test method " + getTestMethodName(result) + " skipped");
	//	testReport.log(Status.INFO,InfoFontColorPrefix+"test method " + getTestMethodName(result) + " skipped" +InfoFontColorSuffix);
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("test failed but within success % " + getTestMethodName(result));
	//	testReport.log(Status.INFO,InfoFontColorPrefix+"test failed but within success % " + getTestMethodName(result) +InfoFontColorSuffix);
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("on start of test " + context.getName());
	//	testReport.log(Status.INFO,InfoFontColorPrefix+"on start of test " + context.getName() +InfoFontColorSuffix);
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("on finish of test " + context.getName());
	//	testReport.log(Status.INFO,InfoFontColorPrefix+"on finish of test " + context.getName() +InfoFontColorSuffix);
	}

	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		
	}

	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		
	}
 
	private static String getTestMethodName(ITestResult result) {
		return result.getMethod().getConstructorOrMethod().getName();
	}
	
	
	private void printTestResults(ITestResult result) {

		Reporter.log("Test Method resides in " + result.getTestClass().getName(), true);
		//testReport.log(Status.INFO,InfoFontColorPrefix+"Test Method resides in " + result.getTestClass().getName() +InfoFontColorSuffix);
		if (result.getParameters().length != 0) {

			String params = null;

			for (Object parameter : result.getParameters()) {

				params += parameter.toString() + ",";

			}

			Reporter.log("Test Method had the following parameters : " + params, true);
			//testReport.log(Status.INFO,InfoFontColorPrefix+"Test Method had the following parameters : " + params +InfoFontColorSuffix);
		}

		String status = null;

		switch (result.getStatus()) {

		case ITestResult.SUCCESS:

			status = "Pass";

			break;

		case ITestResult.FAILURE:

			status = "Failed";

			break;

		case ITestResult.SKIP:

			status = "Skipped";

		}

		Reporter.log("Test Status: " + status, true);
		//testReport.log(Status.INFO,InfoFontColorPrefix+"Test Status: " + status +InfoFontColorSuffix);
	}
	
}
