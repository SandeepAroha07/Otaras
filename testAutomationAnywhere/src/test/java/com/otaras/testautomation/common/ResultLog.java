package com.otaras.testautomation.common;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.BasePage;
import com.otaras.testautomation.aut.testdatarec.TestDataRec;



public class ResultLog extends BasePage{

//	private WebDriver driver;
//	private ExtentTest testReport;
	
	public ResultLog(WebDriver driver,ExtentTest testReport)
	{
		 this.driver=driver;
		 this.testReport=testReport;
		 
		 //PageFactory.initElements(new fieldDecorator(driver,test), this);
		// PageFactory.initElements(driver, this);
	}
	
	
	public void ReportTestEvent(String sStatus, String sDec)
	{

		if (sStatus.equalsIgnoreCase("pass")){
			//test.log(Status.PASS, "<span style='font-weight:bold;'><font color='#8b0000';font-size:18px; line-height:35px>"+sDec+"</font></span>");
			testReport.log(Status.PASS, SuccessFontColorPrefix+sDec+SuccessFontColorSuffix);
		}
		if (sStatus.equalsIgnoreCase("fail")){
			testReport.log(Status.FAIL, ErrorFontColorPrefix+sDec+ErrorFontColorSuffix);
		}
		if ((sStatus.equalsIgnoreCase("info")) || (sStatus.equalsIgnoreCase(""))){
			testReport.log(Status.INFO, INFOFontColorPrefix+sDec+INFOFontColorSuffix);
		}
		if ((sStatus.equalsIgnoreCase("fatal")) ){
			testReport.log(Status.FATAL, FatalFontColorPrefix+sDec+FatalFontColorSuffix);
		}
	}
	
	public void ReportTestEvent(String sStatus, Markup sDec)
	{

		if (sStatus.equalsIgnoreCase("pass")){
			//test.log(Status.PASS, "<span style='font-weight:bold;'><font color='#8b0000';font-size:18px; line-height:35px>"+sDec+"</font></span>");
			testReport.log(Status.PASS, SuccessFontColorPrefix+sDec+SuccessFontColorSuffix);
		}
		if (sStatus.equalsIgnoreCase("fail")){
			testReport.log(Status.FAIL, ErrorFontColorPrefix+sDec+ErrorFontColorSuffix);
		}
		if ((sStatus.equalsIgnoreCase("info")) || (sStatus.equalsIgnoreCase(""))){
			testReport.log(Status.INFO, INFOFontColorPrefix+sDec+INFOFontColorSuffix);
		}
		if ((sStatus.equalsIgnoreCase("fatal")) ){
			testReport.log(Status.FATAL, FatalFontColorPrefix+sDec+FatalFontColorSuffix);
		}
	}
	
	public void PostTestStatus()
	{
		String testScenarioName="";//RecTestStatus.TestScriptID.toString();
		Status testingStatus=testReport.getStatus();
		String testFinalStatus="";
		

		testFinalStatus=testingStatus.toString();
		System.out.println("EXTENT REPORT STATUS: "+testingStatus);
			
			testReport.log(Status.INFO, "TEST EXECUTION COMPLETED: "+testScenarioName);
			if (testFinalStatus.equalsIgnoreCase("pass"))
				testReport.log(Status.PASS, "TEST EXECUTION COMPLETED: "+testScenarioName);
			else if  (testFinalStatus.equalsIgnoreCase("error"))
				testReport.log(Status.ERROR, "TEST SCENARIO VERIFICATION FAILED: "+testScenarioName);	
			else if  (testFinalStatus.equalsIgnoreCase("fail"))
				testReport.log(Status.FAIL, "TEST SCENARIO FAILED: "+testScenarioName);
			else if  (testFinalStatus.equalsIgnoreCase("fatal"))
				testReport.log(Status.FATAL, "TEST SCENARIO HARD FAILED (EXCEPTION) "+testScenarioName);
			else if  (testFinalStatus.equalsIgnoreCase(""))
				testReport.log(Status.FAIL, "TEST SCENARIO HARD FAILED (EXCEPTION) "+testScenarioName);

			endStartTime();
			testExecutionTime();
	}
	
	public void PostTestStatus(Exception e)
	{
		String testScenarioName="";//RecTestStatus.TestScriptID.toString();
		Status testingStatus=testReport.getStatus();
		String testFinalStatus="";
		

		testFinalStatus=testingStatus.toString();
		System.out.println("EXTENT REPORT STATUS: "+testingStatus);
			
			testReport.log(Status.INFO, "TEST EXECUTION COMPLETED: "+testScenarioName);
			if (testFinalStatus.equalsIgnoreCase("pass"))
				testReport.log(Status.PASS, "TEST EXECUTION COMPLETED: "+testScenarioName);
			else if  (testFinalStatus.equalsIgnoreCase("error"))
				testReport.log(Status.ERROR, "TEST SCENARIO VERIFICATION FAILED: "+testScenarioName);	
			else if  (testFinalStatus.equalsIgnoreCase("fail"))
				testReport.log(Status.FAIL, "TEST SCENARIO FAILED: "+testScenarioName);
			else if  (testFinalStatus.equalsIgnoreCase("fatal"))
				testReport.log(Status.FATAL, "TEST SCENARIO HARD FAILED (EXCEPTION) "+testScenarioName);
			else if  (testFinalStatus.equalsIgnoreCase(""))
				testReport.log(Status.FAIL, "TEST SCENARIO HARD FAILED (EXCEPTION) "+testScenarioName);

			ReportTestEvent("FATAL", ErrorFontColorPrefix+"Moved To Driver Exception Exception - "+e+ErrorFontColorSuffix);
			ReportTestEvent("FATAL",ErrorFontColorPrefix+"Moved To Driver Exception Exception - Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
			
			
			endStartTime();
			testExecutionTime();
	}
	
	
	public void logTestLoginDetails() throws Exception
	{
		testStartTime(); 
		testDetails();
		ReportTestEvent("INFO", "Test URL:: "+TestDataRec.TESTDATALOGINMAP.get("url"));
		  ReportTestEvent("INFO", "Test Environment:: "+ReadTestConfig.GetProperty("TEST.ENVIRONMENT"));
		  ReportTestEvent("INFO", "Test Login User Name:: "+ReadTestConfig.GetProperty("TEST.USERLOGINNAME"));
		
	}

	public void logUITestDetails() throws Exception
	{
		  ReportTestEvent("INFO", "Test Page Name::"+TestDataRec.TESTDATAMAP.get("pageName"));
		  ReportTestEvent("INFO", "Test Element::"+TestDataRec.TESTDATAMAP.get("webelementName"));
		  ReportTestEvent("INFO", "Test Element::"+TestDataRec.TESTDATAMAP.get("elementValue"));
		
	}
	

	
	
	public void testStartTime()
	{
		 
//		TestDataRec.TESTSTARTTIME=System.nanoTime();
//		ReportTestEvent("INFO", "Test Start Time:: "+TestDataRec.TESTSTARTTIME); 
		
	}
	public void endStartTime()
	{
		 
//		TestDataRec.TESTSTARTTIME=System.nanoTime();
//		ReportTestEvent("INFO", "Test End Time:: "+TestDataRec.TESTENDTIME); 
		
	}
	public void testExecutionTime()
	{
		 
//		TestDataRec.TESEXECUTIONTIME=TestDataRec.TESTENDTIME-TestDataRec.TESTSTARTTIME;
//		ReportTestEvent("INFO", "Test Execution Time:: "+TestDataRec.TESEXECUTIONTIME); 
		
	}
	
	
	public void testDetails() throws Exception
	{
//	DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
//	Date date = new Date();
//	System.out.println(dateFormat.format(date)); 
//	
//	TestDataRec.TESTEXECUTEDDATETIME=date.toString();
//	TestDataRec.TESTEXECUTEDBY=System.getProperty("user.name");
//	TestDataRec.TESTMACHINE=InetAddress.getLocalHost().getHostName();
//	TestDataRec.TESTCYCLENAME=ReadTestConfig.GetProperty("TEST.CYCLENAME");
//	
//	
//	ReportTestEvent("INFO","Test Execution By:: "+TestDataRec.TESTEXECUTEDBY); 
//	ReportTestEvent("INFO","Test Execution Machine:: "+TestDataRec.TESTMACHINE); 
//	ReportTestEvent("INFO","Test Execution Cycle:: "+TestDataRec.TESTCYCLENAME); 
	}
}
