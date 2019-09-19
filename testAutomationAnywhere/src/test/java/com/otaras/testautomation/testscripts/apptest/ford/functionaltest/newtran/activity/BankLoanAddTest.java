package com.otaras.testautomation.testscripts.apptest.ford.functionaltest.newtran.activity;

import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.bson.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.codoid.products.fillo.Recordset;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.otaras.testautomation.aut.buildprojectbusinessmodules.ford.Pages;
import com.otaras.testautomation.aut.testdatarec.TestDataRec;
import com.otaras.testautomation.common.BrowserUtil;
import com.otaras.testautomation.common.Common;
import com.otaras.testautomation.common.DBTestResultUpdate;
import com.otaras.testautomation.common.ExtentManager;
import com.otaras.testautomation.common.GuiValidation;
import com.otaras.testautomation.common.InitializeDriver;
import com.otaras.testautomation.common.MongoDBUtil;
import com.otaras.testautomation.common.ReadTestConfig;
import com.otaras.testautomation.common.ReadTestData;
import com.otaras.testautomation.common.ResultLog;
import com.otaras.testautomation.common.webDriverEventListener;
import com.otaras.testautomation.objectrepository.OR;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.lang.reflect.Method;


@Listeners(com.otaras.testautomation.common.TestListener.class)
public class BankLoanAddTest {
	  	private WebDriver driver;
	  	private EventFiringWebDriver driverEvent;
  		private webDriverEventListener eventListener;
  		private ExtentReports extentReport;
  		private ExtentTest testReport;

  		private String sBrowser="";
    	String sBrowserFromTestData="";
    	long startTime;
    	
    	Map<Object, Object> map;
	    private String sTestID="";
    	static Recordset recordsetTestData;
    	static ArrayList<String> arrayListTestDataColumns;
    	
    	Pages pages;
    	ResultLog ResultLog;
    	DBTestResultUpdate DBTestResultUpdate;
    	InitializeDriver initializeDriver;
    	String sDriverType=ReadTestConfig.Get("DRIVER.TYPE");
    	GuiValidation GuiValidation;

    	String testBrowserXML="";
    	String className = this.getClass().getSimpleName();
    	BrowserUtil BrowserUtil;

    	static String testDataName="debt_bankloan_add";
    	
	    @Factory (dataProvider="dataProviderMethod")
	    public BankLoanAddTest(Map<Object, Object> map){
	    	this.map=map;
	        this.sTestID=map.get("testID").toString();
	        this.sBrowserFromTestData=map.get("TestBrowser").toString();
	    }

	    @DataProvider//(parallel=true)
	    public static Object[][] dataProviderMethod() throws Exception { 
	    	HashMap<String, String> tableColumnNames=new HashMap<>();
	      	ReadTestData.captureLoginEnvirnmentTestData();
		  	arrayListTestDataColumns=ReadTestData.readTestDataTableColumns(testDataName);
		  	tableColumnNames=ReadTestData.mapTestDataTableColumns(arrayListTestDataColumns);
	      	recordsetTestData=ReadTestData.readTestData(testDataName);
	        int lastRowNum=recordsetTestData.getCount();//TestDataRec.TEST_SCENARIOS_COUNT;
	        Object[][] obj = new Object[lastRowNum][1];
	        TestDataRec.TESTDATACOLUMNSMAP=tableColumnNames;
	      	obj=ReadTestData.mapAllTestData(recordsetTestData);
	      	return obj;
	    }

	    		
	    @Test
	    public void testCase() throws InterruptedException, Exception{
	    	ResultLog.ReportTestEvent("INFO", "TEST EXECUTION STARTED"); 
		    	ResultLog.ReportTestEvent("INFO", "Execution Started Time: "+startTime);
		        System.out.println("Test 1");  
		        System.out.println("Test Data Used: " + map);
		        ResultLog.ReportTestEvent("INFO", "Column Names: "+TestDataRec.TESTDATACOLUMNSMAP);
		        ResultLog.ReportTestEvent("INFO", "Test Data: "+map);    
	        
	        try{
	        	  pages.AddDebtPage.testData=map;
	
	  	          ResultLog.ReportTestEvent("INFO", "LAUNCH APPLICATION");   
//		        	  pages.InvokeApplicationPage.launchApplication();
//					  pages.InvokeApplicationPage.WaitForPage(pages.MainPage);
//					  pages.MainPage.clickLoginIcon();
					  

				  ResultLog.ReportTestEvent("INFO", "LOGIN TO APPLICATION AND NAVIGATE TO ADD DEBT PAGE"); 
				  
					  pages.CommonBusinessComponentPage.pages=pages;
					  pages.CommonBusinessComponentPage.LoginToApplication();
					  pages.CommonBusinessComponentPage.SelectProjectsMenu();
					  
//					  pages.LoginPage.loginToApplication();
//					  pages.LoginPage.WaitForPage(pages.HomePage);
//					  pages.MenuPage.clickNewMenu();
//					  pages.MenuPage.clickActivitySubMenu();
//					  pages.MenuPage.WaitForPage(pages.NewActivitySelectionPage);
					  //pages.NewActivitySelectionPage.clickDebt();
					  pages.NewActivitySelectionPage.Click(OR.NewActivitySelection_Debt);
					  pages.MenuPage.WaitForPage(pages.AddDebtPage);
				
				  ResultLog.ReportTestEvent("INFO", "ADD DEBT"); 
					  pages.AddDebtPage.addDebt_BondIssue(map);
					  pages.AddDebtPage.verifyBankLoanDataEntered(map);

					  ResultLog.ReportTestEvent("INFO", "Screenshot before performing action on transaction - Add DEBT");
					  ResultLog.takeScreenShot();
					  //Thread.sleep(200);
				  
				  ResultLog.ReportTestEvent("INFO", "ADD DEBT PAGE - PERFORM TEST ACTION - "+map.get("action").toString());
					  pages.CommonBusinessComponentPage.performAction(map.get("action").toString());
					  //working line - pages.AddDebtPage.WaitForPage(pages.ActivityDashboardPage);
					  pages.CommonBusinessComponentPage.WaitForPage(pages.ComplianceChecksPage);
					  pages.ComplianceChecksPage.clickButton("Save");
					  
					  pages.ComplianceChecksPage.WaitForPage(pages.ProjectsDashboardPage);
					  String  tranKeyValue = pages.AddDebtPage.tranIssueNameKeyValue();
					  pages.ProjectsDashboardPage.Exists(pages.ProjectsDashboardPage.SearchField);
					  pages.ProjectsDashboardPage.SearchField.sendKeys(tranKeyValue);
					  //Thread.sleep(1000);
					  pages.ProjectsDashboardPage.waitForElementExists("//a/*[contains(text(),'"+tranKeyValue+"')]");
					  //pages.ProjectsDashboardPage.Exists(driver.findElement(By.xpath("//a/mark[contains(text(),'"+tranKeyValue+"')]")));
					  pages.ProjectsDashboardPage.clickElementExists("//a/*[contains(text(),'"+tranKeyValue+"')]");
					  //pages.ProjectsDashboardPage.clickElement(driver.findElement(By.xpath("//a/*[contains(text(),'"+tranKeyValue+"')]")));
					  //driver.findElement(By.xpath("//a/mark[contains(text(),'"+tranKeyValue+"')]")).click();
					  pages.ProjectsDashboardPage.WaitForPage(pages.DebtSummaryPage);
					  ResultLog.takeScreenShot();
					  
					  
					  
//					//working code-anil commented-defectlogged			  pages.AddDebtPage.verifySpecifiedElementExistsByLabel(map.get("actionStatus").toString());
//					  pages.ComplianceChecksPage.WaitForPage(pages.ActivityDashboardPage);
//					  ResultLog.ReportTestEvent("INFO", "Screenshot after performing action on transaction");
//					  ResultLog.takeScreenShot();
//				  
//				  ResultLog.ReportTestEvent("INFO", "CLICK MUNIVISOR HOME ICON");
//					  pages.HomePage.clickMunivisorHomeIcon();
//					  pages.HomePage.WaitForPage(pages.ActivityDashboardPage);
//					  ResultLog.takeScreenShot();
				  
				  ResultLog.ReportTestEvent("INFO", "##### VERIFY TRANSACTION DATA (USER DATA ENTERED IN UI) WITH DATABASE VALUES #####");
					  ResultLog.ReportTestEvent("INFO", "<< GET DOCUMENT FROM DB >>");
					  String tbl_name="tranbankloans";
		        	  String col_name = "actTranIssueName";
		        	  //String  srch_string = "TXDEALE80FA6B0A36E11E8";
		        	  //String  tranKeyValue = pages.AddDebtPage.tranIssueNameKeyValue();
					  MongoDBUtil mongodbutil=new MongoDBUtil();
		        	  //Document Trandocument= mongodbutil.getDocument(tbl_name,col_name, tranKeyValue);
		        	  Document Trandocument= mongodbutil.getDocumentFromDB(tbl_name,col_name, tranKeyValue);

		        	  System.out.println("Document ID "+Trandocument.get("_id"));
		        	  String documentID=Trandocument.get("_id").toString();
		        	  String documentTranId=Trandocument.get("actTranUniqIdentifier").toString();
		        	  
		        	  
		        	  System.out.println("Attribute from document is "+Trandocument.get(col_name));
		        	  ResultLog.ReportTestEvent("INFO", "TRAN DOCUMENT CREATED#: "+Trandocument);
		        	  ResultLog.ReportTestEvent("INFO", "<< VERIFY DATA PASSED FROM UI WITH DATABASE >>");
		        	  pages.AddDebtPage.verifyDatabaseBankLoan(map, Trandocument);
	        	
				  ResultLog.ReportTestEvent("INFO", "REPORT TEST EXECUTION STATUS");
					  if (testReport.getStatus().toString().equalsIgnoreCase("fail"))
						  ResultLog.ReportTestEvent("FAIL", "TEST STATUS: "+ testReport.getStatus().toString());
					  else
						  ResultLog.ReportTestEvent("PASS", "TEST STATUS: "+ testReport.getStatus().toString());
					  ResultLog.ReportTestEvent("INFO", "TEST ID: "+Thread.currentThread().getId()+ " TEST EXECUTION COMPLETE");
				  
				  ResultLog.ReportTestEvent("INFO", "UPDATE DB FOR EXECUTION STATUS");
				  DBTestResultUpdate.UpdateTransactionIDInDB(testDataName,sTestID, "dealId",documentTranId);
				  DBTestResultUpdate.UpdateTransactionIDInDB(testDataName,sTestID, "documentId",documentID);
				  System.out.println("##################TEST STATUS: ################## "+ testReport.getStatus().toString().toUpperCase());
				  ResultLog.ReportTestEvent("PASS", "##################TEST STATUS: ################## "+ testReport.getStatus().toString().toUpperCase()+"   Tran ID: "+documentTranId);
				  // DBTestResultUpdate.UpdateTransactionIDInDB(testDataName,sTestID, "dealID",documentTranId);
					  //DBTestResultUpdate.UpdateTestResultInDB(testDataName, sTestID);
					  System.out.println(testReport.getStatus().toString());
				  
				  ResultLog.ReportTestEvent("INFO", "CLOSE BROWSER");
				  	driver.quit();
	        }
			  catch (Exception e)
			  {
				  ResultLog.ReportTestEvent("INFO", "EXCEPTION BLOCK");
					  ResultLog.takeScreenShot();
					  ResultLog.ReportTestEvent("FATAL","Entered Test 'Exception' Block-:"+" ******** Exception Found - Test Scenario Execution Incomplete ********");
					  ResultLog.ReportTestEvent("FATAL", "TEST FAILED - EXCEPTION: "+e.getMessage());
					  ResultLog.ReportTestEvent("INFO", "TEST EXECUTION INCOMPLETE");
					  System.out.println("##################TEST STATUS: ##################"+ "Test FAILED");
					  ResultLog.ReportTestEvent("FATAL", "##################TEST STATUS: ################## "+ "Test FAILED");
					  DBTestResultUpdate.UpdateTransactionIDInDB(testDataName,sTestID, "dealID","Anil-e");
					  DBTestResultUpdate.UpdateTestResultExceptionInDB(testDataName, sTestID);
					  driver.quit();
					  throw new NullPointerException("******** Exception Found - Test Scenrario Execution Incomplete ********");
			  }
	    }
	    
		 
		   @BeforeClass
		    @Parameters({ "testBrowserXML" })
		    public void beforeClass(String testBrowserXML) throws Exception {
			 //  public void beforeClass() throws Exception {
		    	startTime = System.currentTimeMillis();
		        long id = Thread.currentThread().getId();
		 
		        
		        if (testBrowserXML.equalsIgnoreCase("skip")||testBrowserXML.equalsIgnoreCase("")||testBrowserXML.equalsIgnoreCase("param-val-not-found"))
		        	testBrowserXML=sBrowserFromTestData;
		        extentReport=ExtentManager.CreateExtentReportExtent();
		  	  	testReport=ExtentManager.CreateExtentReportTest(extentReport,testBrowserXML,className+"_"+sTestID);
		  	  	initializeDriver=new InitializeDriver();
		  	  String mvnDriverParam = "";
		  	  mvnDriverParam=System.getProperty("drivername");//System.getProperty("fileName");
		      System.out.println("Reading Maven Command Line Argument - Driver: " + mvnDriverParam);
		      if(!(mvnDriverParam==null))
		      if(!mvnDriverParam.equalsIgnoreCase(""))
		    	  sDriverType=mvnDriverParam;
		  	  	if (sDriverType.equalsIgnoreCase("remotedriver"))
		  	  		driver=initializeDriver.initRemoteWebDriver(testBrowserXML);
		  	  	else if (sDriverType.equalsIgnoreCase("webdriver"))
		  	  		driver=initializeDriver.initWebDriver(testBrowserXML);
		  	  	
		  	  //	if (!ReadTestConfig.Get("COMMANDLINE.EXECUTION").toString().trim().equalsIgnoreCase("yes")){
		        driverEvent = new EventFiringWebDriver(driver);
				  eventListener = new webDriverEventListener(testReport);
				  driverEvent.register(eventListener);
				  this.driver=driverEvent;//}
		  	  	
		  	  		pages=new Pages(driver,testReport);
		  	  		ResultLog=new ResultLog(driver,testReport);
		  	  		DBTestResultUpdate=new DBTestResultUpdate(driver,testReport);
		  	  		GuiValidation=new GuiValidation(driver,testReport);
		  	  		DBTestResultUpdate=new DBTestResultUpdate(driver,testReport);
		  	  	//GuiValidation.ResultLog=null;
		  	  		//GuiValidation.ResultLog=ResultLog;
		  	  		//GuiValidation.pages=pages;
			        ResultLog.ReportTestEvent("INFO", "Test Browser: "+testBrowserXML);
			        ResultLog.ReportTestEvent("INFO", "Test ID: "+sTestID);
		    }
	    

	 
	    @AfterClass
	    public void afterClass() throws Exception {
	    	long stopTime = System.currentTimeMillis();
	        long elapsedTime = stopTime - startTime;
	        long seconds = TimeUnit.MILLISECONDS.toSeconds(elapsedTime);
	       // DBTestResultUpdate.UpdateTestResultInDB("deal", sTestID);
	       // DBTestResultUpdate.UpdateTransactionIDInDBDelete("deal",sTestID, "dealID","anil");
//	        elapsedTime=(elapsedTime/1000)%60;
	        System.out.println(elapsedTime);
	        TestDataRec.TESTEXECUTIONTIME=seconds;
	        ResultLog.ReportTestEvent("INFO","Test Execution Tme in Sec: "+seconds+ "  -------------------- Execution Time in mins:  "+TimeUnit.MILLISECONDS.toMinutes(elapsedTime));
	        long id = Thread.currentThread().getId();
	        System.out.println("After test-method  " + sTestID
	                + ". Thread id is: " + id);
	        extentReport.flush();
	    }
	 
	    @AfterTest
	    public void afterTest() {
	        long id = Thread.currentThread().getId();
	        System.out.println("After test  " + sTestID + ". Thread id is: " + id);
	    }	
		 
}
