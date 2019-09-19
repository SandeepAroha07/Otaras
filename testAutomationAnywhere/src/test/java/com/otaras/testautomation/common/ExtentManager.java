package com.otaras.testautomation.common;

import java.io.File;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.otaras.testautomation.aut.testdatarec.TestDataRec;


public class ExtentManager {
	private static ExtentReports extentReport;
	private static String extentReportLocation="ReportsConfig.xml";
	private static String filePath;
	private static ExtentHtmlReporter htmlReporter;
	private static ExtentTest testReport;
	
	public static ExtentReports GetExtent(){
		if (extentReport != null)
                    return extentReport; //avoid creating new instance of html file
		extentReport = new ExtentReports();		
		extentReport.attachReporter(getHtmlReporter());
		return extentReport;
	}
	
	public static ExtentReports GetExtentScreenshot(){
		if (extentReport != null)
                    return extentReport; //avoid creating new instance of html file
		extentReport = new ExtentReports();		
		extentReport.attachReporter(getHtmlReporterScreenshot());
		return extentReport;
	}
	
	private static ExtentHtmlReporter getHtmlReporter() {
		String sProjectName=ReadTestConfig.GetProperty("TESTPROJECT.NAME");
		
    	File classpathRoot = new File(System.getProperty("user.dir"));
    	File app = new File(classpathRoot.getAbsolutePath()+"//src//test//resources//testConfig//extentReport//", extentReportLocation);
      

    	File app1 = new File(classpathRoot.getPath()+"//", "src//test//resources//testReport//"+sProjectName+"//"+ ReadTestConfig.Get("TEST.APPNAME"));
    	//filePath=app1.toString()+"//"+ReadTestConfig.Get("TEST.CYCLENAME");
//   	 String mvnParam = "";
//		  mvnParam=System.getProperty("testcycle");//System.getProperty("fileName");
//	      System.out.println("Reading Maven Command Line Argument : " + mvnParam);
//	      testReport.log(Status.INFO,"Reading Maven Command Line Argument : " + mvnParam);
//	      if(!(mvnParam==null)){
//		      if(mvnParam.equalsIgnoreCase(""))
//		    	  mvnParam=ReadTestConfig.Get("TEST.CYCLENAME");
//	      }
//	      else
//	    	  mvnParam=ReadTestConfig.Get("TEST.CYCLENAME");
   	
   	filePath=app1.toString()+"//"+ReadTestConfig.Get("TEST.CYCLENAME");
	   //   filePath=app1.toString()+"//"+mvnParam;
		
        htmlReporter = new ExtentHtmlReporter(filePath);
//        htmlReporter.config().setReportName("Anil-Regression Testing");
//        htmlReporter.config().setTheme(Theme.STANDARD);
//        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
//        htmlReporter.config().setDocumentTitle("Anil Doc Title");
        
//        //ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
//        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
//        htmlReporter.config().setChartVisibilityOnOpen(true);
//        htmlReporter.config().setTheme(Theme.STANDARD);
//        //htmlReporter.config().setDocumentTitle(filePath);
//        htmlReporter.config().setEncoding("utf-8");
//        //htmlReporter.config().setReportName(filePath);
        
        
      htmlReporter.loadXMLConfig(app.toString());
		
    
        return htmlReporter;
	}
	
	private static ExtentHtmlReporter getHtmlReporterScreenshot() {
		String sProjectName=ReadTestConfig.GetProperty("TESTPROJECT.NAME");
		
    	File classpathRoot = new File(System.getProperty("user.dir"));
    	File app = new File(classpathRoot.getAbsolutePath()+"//src//test//resources//testConfig//extentReport//", extentReportLocation);
      

    	File app1 = new File(classpathRoot.getPath()+"//", "src//test//resources//testReport//"+sProjectName+"//"+ ReadTestConfig.Get("TEST.APPNAME"));
    	
//    	 String mvnParam = "";
//		  mvnParam=System.getProperty("testcycle");//System.getProperty("fileName");
//	      System.out.println("Reading Maven Command Line Argument : " + mvnParam);
//	      testReport.log(Status.INFO,"Reading Maven Command Line Argument : " + mvnParam);
//	      if(!(mvnParam==null)){
//		      if(mvnParam.equalsIgnoreCase(""))
//		    	  mvnParam=ReadTestConfig.Get("TEST.CYCLENAME");
//	      }
//	      else
//	    	  mvnParam=ReadTestConfig.Get("TEST.CYCLENAME");
    	
    	filePath=app1.toString()+"//"+ReadTestConfig.Get("TEST.CYCLENAME");
	      //filePath=app1.toString()+"//"+mvnParam;
    
		
        htmlReporter = new ExtentHtmlReporter(filePath);
//        htmlReporter.config().setReportName("Anil-Regression Testing");
//        htmlReporter.config().setTheme(Theme.STANDARD);
//        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
//        htmlReporter.config().setDocumentTitle("Anil Doc Title");
        
//        //ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
//        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
//        htmlReporter.config().setChartVisibilityOnOpen(true);
//        htmlReporter.config().setTheme(Theme.STANDARD);
//        //htmlReporter.config().setDocumentTitle(filePath);
//        htmlReporter.config().setEncoding("utf-8");
//        //htmlReporter.config().setReportName(filePath);
        
        
      htmlReporter.loadXMLConfig(app.toString());
		
    
        return htmlReporter;
	}
	
	public static ExtentTest createTest(String name, String description){
		//name="TestCase"+TestDataRec.TESTSCRIPTID; //work around to test the code - remove later. Pass test script id/name
		name="TestCase"+TestDataRec.TESTDATAMAP.get("testID")+TestDataRec.TESTBROWSERNAME;
		testReport = extentReport.createTest(name, description);
		return testReport;
	}
	
	public static ExtentReports CreateExtentReportExtent()
	{
		String sModuleName="";
		// * CREATE EXTENT REPORT
		extentReport = ExtentManager.GetExtent();
		return(extentReport);
	}
	
	public static ExtentReports CreateExtentReportExtentScreenshot()
	{
		String sModuleName="";
		// * CREATE EXTENT REPORT
		extentReport = ExtentManager.GetExtentScreenshot();
		return(extentReport);
	}
	
	public static ExtentTest CreateExtentReportTest(ExtentReports extent)
	{
		String sModuleName="";
		testReport=ExtentManager.createTest(sModuleName, "TEST RESULTS");
		return(testReport);
	}
	
	public static ExtentTest CreateExtentReportTest(ExtentReports extent, String browserName, String sTestID)
	{
		String sModuleName="";
		testReport=ExtentManager.createTestNew(sModuleName, "TEST RESULTS","_"+sTestID+"_"+browserName);
		return(testReport);
	}
	
	public static ExtentTest CreateExtentReportTestScreenCompare(ExtentReports extent, String browserName, String sTestID)
	{
		String sModuleName="";
		testReport=ExtentManager.createTestNewScreenCompare(sModuleName, "TEST RESULTS","_"+sTestID+"_"+browserName);
		return(testReport);
	}
	
	public static ExtentTest CreateExtentReportTest(ExtentReports extent, String browserName)
	{
		String sModuleName="";
		testReport=ExtentManager.createTest(sModuleName, "TEST RESULTS",browserName);
		return(testReport);
	}
	public static ExtentTest createTest(String name, String description, String browserName){
		//name="TestCase"+TestDataRec.TESTSCRIPTID; //work around to test the code - remove later. Pass test script id/name
		name="TestCase"+TestDataRec.TESTDATAMAP.get("testID")+browserName;
		testReport = extentReport.createTest(name, description);
		return testReport;
	}
	
	public static ExtentTest createTestNew(String name, String description, String sTestIDBrowserName){
		//name="TestCase"+TestDataRec.TESTSCRIPTID; //work around to test the code - remove later. Pass test script id/name
		name="TS"+sTestIDBrowserName;
		try{
			//int random = (int)(1000 * Math.random() + 500);
			//Thread.sleep(random * 1000);
		Thread.sleep(50);
			//randomDelay(300, 1000);
			Thread.sleep((long)(Math.random() * 1000));
		}catch(Exception e){}
		testReport = extentReport.createTest(name, description);
		return testReport;
	}
	
	public static ExtentTest createTestNewScreenCompare(String name, String description, String sTestIDBrowserName){
		//name="TestCase"+TestDataRec.TESTSCRIPTID; //work around to test the code - remove later. Pass test script id/name
		name="TS"+sTestIDBrowserName;
		testReport = extentReport.createTest(name, description);
		return testReport;
	}
	
	void randomDelay(float min, float max){
		int random = (int)(max * Math.random() + min);
		try {
			Thread.sleep(random * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
