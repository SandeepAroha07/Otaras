package com.otaras.testautomation.testscripts.apptest.ford.functionaltest.tools.billing;

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
import com.otaras.testautomation.aut.buildprojectbusinessmodules.ford.commonbusinesscode.CommonBusinessComponentPage;
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
public class AddNewExpenseTest {
	  	private WebDriver driver;
	  	private EventFiringWebDriver driverEvent;
  		private webDriverEventListener eventListener;
  		private ExtentReports extentReport;
  		private ExtentTest testReport;

  		private String sBrowser="";
    	String sBrowserFromTestData="";
    	long startTime;
    	
    	LinkedHashMap<Object, Object> map;
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

    	static String testDataName="add_billing_newexpense";
    	
    	//String mvnParam="";
    	
	    @Factory (dataProvider="dataProviderMethod")
	    public AddNewExpenseTest(LinkedHashMap<Object, Object> map){
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
	        	  pages.AddTransactionPage.testData=map;                 
//	        	  CommonBusinessComponentPage CommonBusinessComponentPage=new CommonBusinessComponentPage(pages);
//	        	  CommonBusinessComponentPage.f();
//	        	  CommonBusinessComponentPage.f();
	  	          ResultLog.ReportTestEvent("INFO", "LAUNCH APPLICATION");   
		        	  //pages.InvokeApplicationPage.launchApplication();
					 // pages.MainPage.WaitForPage(pages.LoginPage);

				  ResultLog.ReportTestEvent("INFO", "LOGIN TO APPLICATION AND NAVIGATE TO ADD DEBT PAGE"); 
				  //CommonBusinessComponentPage CommonBusinessComponentPage=new CommonBusinessComponentPage(pages);
				  pages.CommonBusinessComponentPage.pages=pages;
				  pages.CommonBusinessComponentPage.LoginToApplication();
				  pages.CommonBusinessComponentPage.SelectToolsMenu();
				  	
				 
					  
				  	ResultLog.ReportTestEvent("INFO", "ADD EXPENSE DETAILS"); 	
				  	pages.ToolsDashboardPage.Click(OR.ToolsDashboardPage_AddNewExpenseDetails);
				  	pages.ToolsDashboardPage.WaitForPage(pages.ToolsExpenseDetailPage);
				  	pages.ToolsExpenseDetailPage.selectCombobox(OR.ToolsExpenseDetailPage_SelectIssuer, "");
				  	pages.ToolsExpenseDetailPage.selectCombobox(OR.ToolsExpenseDetailPage_TransactionIssueName, "xyz");
				  	pages.ToolsExpenseDetailPage.selectCombobox(OR.ToolsExpenseDetailPage_SelectFirmUser, "");
				  	
				  	ResultLog.ReportTestEvent("INFO", "ENTER EXPENSE DETAILS IN TABLE"); 	
				  	int j=driver.findElements(By.xpath("//tbody/tr")).size();
				  	if (j>0){
				  		pages.ToolsExpenseDetailPage.Click(OR.ToolsExpenseDetailPage_ExpenseAddIcon);
				  		j=j+1;
				  	}
				  	pages.ToolsExpenseDetailPage.selectDropdown("//tr["+j+"]/td[1]//select[@name='expenseType']", "xyz");
				  	pages.ToolsExpenseDetailPage.enterInput("//tr["+j+"]/td[2]//input[@name='expenseAmount']", "1"+j);
				  	pages.ToolsExpenseDetailPage.enterDateCustom("//tr["+j+"]/td[3]//input[@name='expenseDate']", "10/10/203"+j,"");
				  	pages.ToolsExpenseDetailPage.selectDropdown("//tr["+j+"]/td[4]//select[@name='expenseContextType']", "xyz");
					pages.ToolsExpenseDetailPage.enterInput("//tr["+j+"]/td[5]//input[@name='expenseDetail']", "Detail"+j);
					//try{
					pages.ToolsExpenseDetailPage.Click(OR.ToolsExpenseDetailPage_SaveDetails);
//					}catch(Exception e)
//					{
//						pages.ToolsExpenseDetailPage.Click(OR.ToolsExpenseDetailPage_SaveDetails);
//					}
					//pages.CommonBusinessComponentPage.performAction(map.get("action").toString());
					//pages.CommonBusinessComponentPage.performAction("Expense details updated successfully");
					//pages.AddClientPage.verifySpecifiedElementExistsByLabel(map.get("actionStatus").toString());
					//pages.ToolsExpenseDetailPage.verifySpecifiedElementExistsByLabel("Expense details updated successfully");
					pages.ToolsExpenseDetailPage.WaitForPage(pages.ToolsExpenseDetailPage);
					driver.findElement(By.xpath(OR.ToolsTimeTrackerPage_SelectIssuer)).sendKeys(Keys.PAGE_UP);
					pages.ToolsExpenseDetailPage.Click(OR.ToolsExpenseDetailPage_TimeTrackerTab);
					pages.ToolsExpenseDetailPage.WaitForPage(pages.ToolsTimeTrackerPage);
					
					ResultLog.ReportTestEvent("INFO", "ADD TIME TRACKER DETAILS"); 	
					pages.ToolsTimeTrackerPage.selectCombobox(OR.ToolsTimeTrackerPage_SelectIssuer, "abc");
					pages.ToolsTimeTrackerPage.selectCombobox(OR.ToolsTimeTrackerPage_TransactionIssueName,"abc");
					pages.ToolsTimeTrackerPage.selectCombobox(OR.ToolsTimeTrackerPage_SelectFirmUser,"abc");
					pages.ToolsTimeTrackerPage.selectDropdown(OR.ToolsTimeTrackerPage_RoleType, "xyz");
					

					j=driver.findElements(By.xpath("//tbody/tr")).size();
					
					
					
				  	if (j==1 && !driver.findElement(By.xpath("//tr["+1+"]/td[2]//input[@name='date']")).getAttribute("value").equalsIgnoreCase("")){
				  		pages.ToolsTimeTrackerPage.Click(OR.ToolsTimeTrackerPage_ExpenseAddIcon);
				  		j=j+1;
				  	}
				  	ResultLog.ReportTestEvent("INFO", "ADD TIME TRACKET TABLE DETAILS"); 	
//				  	pages.ToolsTimeTrackerPage.selectDropdown("//tr["+j+"]/td[1]//select[@name='roleType']", "xyz");
				  	pages.ToolsTimeTrackerPage.selectDropdown("//tr["+j+"]/td[1]//select[@name='roleType']", "abc");
				  	pages.ToolsTimeTrackerPage.enterDateCustom("//tr["+j+"]/td[2]//input[@name='date']", "10/10/202"+j,"");
				  	//pages.ToolsTimeTrackerPage.enterDateCustom("//tr["+j+"]/td[1]//input[@name='fromDate']", "10/10/202"+j,"");
				  	//pages.ToolsTimeTrackerPage.enterDateCustom("//tr["+j+"]/td[2]//input[@name='toDate']", "10/10/203"+j,"");
				  	pages.ToolsTimeTrackerPage.enterInput("//tr["+j+"]/td[3]//input[@name='hours']", "1"+j);
					pages.ToolsTimeTrackerPage.Click(OR.ToolsTimeTrackerPage_SaveDetails);
					pages.ToolsTimeTrackerPage.WaitForPage(pages.ToolsTimeTrackerPage);
					pages.ToolsTimeTrackerPage.Click(OR.ToolsContractPage_ContractTab);
					pages.ToolsTimeTrackerPage.WaitForPage(pages.ToolsContractPage);
					
					ResultLog.ReportTestEvent("INFO", "ADD CONTRACT"); 
					pages.ToolsContractPage.selectCombobox(OR.ToolsContractPage_Issuer, "abc");
					pages.ToolsContractPage.selectCombobox(OR.ToolsContractPage_TransactionIssueName,"abc");
					//pages.ToolsContractPage.selectCombobox(OR.ToolsContractPage_SelectFirmUser,"abc");
					
					

				  
//				  ResultLog.ReportTestEvent("INFO", "ADD DEBT PAGE - PERFORM TEST ACTION - "+map.get("action").toString());
//					  pages.CommonBusinessComponentPage.performAction(map.get("action").toString());
//					  pages.CommonBusinessComponentPage.WaitForPage(pages.ComplianceChecksPage);
//					  pages.ComplianceChecksPage.clickButton("Save");
//					  pages.ComplianceChecksPage.WaitForPage(pages.ProjectsDashboardPage);
//
//					  ResultLog.ReportTestEvent("INFO", "Screenshot after performing action on transaction");
//					  ResultLog.takeScreenShot();
//					  String  tranKeyValue = pages.AddTransactionPage.tranIssueNameKeyValue();
//					  pages.ProjectsDashboardPage.Exists(pages.ProjectsDashboardPage.SearchField);
//					  
//
//				  
//				  ResultLog.ReportTestEvent("INFO", "##### VERIFY TRANSACTION DATA (USER DATA ENTERED IN UI) WITH DATABASE VALUES #####");
//					  ResultLog.ReportTestEvent("INFO", "<< GET DOCUMENT FROM DB >>");
//					  String tbl_name=map.get("tbl_name").toString();
//		        	  String col_name =map.get("col_name").toString();
//		        	  
//					  MongoDBUtil mongodbutil=new MongoDBUtil();
//					  Document Trandocument= mongodbutil.getDocumentFromDB(tbl_name,col_name, tranKeyValue);
//		        	  System.out.println("Document ID "+Trandocument.get("_id"));
//		        	  String documentID=Trandocument.get("_id").toString();
//		        	  String documentTranId=Trandocument.get(map.get("documentTranId").toString()).toString();
//		        	  
//		        	  System.out.println("Attribute from document is "+Trandocument.get(col_name));
//		        	  ResultLog.ReportTestEvent("INFO", "TRAN DOCUMENT CREATED#: "+Trandocument);
//		        	  ResultLog.ReportTestEvent("INFO", "<< VERIFY DATA PASSED FROM UI WITH DATABASE >>");
//		        	  pages.AddDebtPage.verifyDatabase(map, Trandocument);
		        	  
		        	
		        	  // *************UNCOMMENT BELOW CODE - SEARCH CODE COMMENTED
		        	  
//					 	if (map.get("tranName").toString().equalsIgnoreCase("debt")||map.get("tranName").toString().equalsIgnoreCase("derivative"))
////					  		pages.NewActivitySelectionPage.selectDropdown(OR.DashboardPage_TranTypes, "Deals / Bank Loans / Derivatives");
//					 		System.out.println("");
//					 	else if (map.get("tranName").toString().equalsIgnoreCase("ma-rfp"))
//							pages.NewActivitySelectionPage.selectDropdown(OR.DashboardPage_TranTypes, "MARFPs");
//						else 
//							pages.NewActivitySelectionPage.selectDropdown(OR.DashboardPage_TranTypes, "RFPs / Others / Business Development");
// 
//					  //	pages.MenuPage.WaitForPage(pages.AddTransactionPage);
//					  pages.ProjectsDashboardPage.SearchField.sendKeys(tranKeyValue);
//
//					  //driver.findElement(By.xpath("//span[contains(text(),'"+"MA Request For Proposals"+"')]")).click();
//					  //driver.findElement(By.xpath("//span[contains(text(),'"+OR.DashboardPage_MARequestForProposalsLbl+"')]")).click();
//					  //driver.findElement(By.xpath(OR.DashboardPage_MARequestForProposalsLbl)).click();
//					  //driver.findElement(By.xpath("//span[contains(text(),'"+"Projects"+"')]")).click();
//					 // driver.findElement(By.xpath("//span[contains(text(),'"+OR.DashboardPage_ProjectsLbl+"')]")).click();
//					  
//					  pages.ProjectsDashboardPage.waitForElementExists("//a/*[contains(text(),'"+tranKeyValue+"')]");
//					  ResultLog.takeScreenShot();
//					  pages.ProjectsDashboardPage.clickElementExists("//a/*[contains(text(),'"+tranKeyValue+"')]");
//					  if (!map.get("tranName").toString().equalsIgnoreCase("business development"))
//						  pages.ProjectsDashboardPage.WaitForPage(pages.DebtSummaryPage);
					  
					  // ANIl - SEARCH CODE ENDS HERE - UNCOMMENT ABOVE
					  
					  
					  ResultLog.takeScreenShot();
	        	
				  ResultLog.ReportTestEvent("INFO", "REPORT TEST EXECUTION STATUS");
					  if (testReport.getStatus().toString().equalsIgnoreCase("fail"))
						  ResultLog.ReportTestEvent("FAIL", "TEST STATUS: "+ testReport.getStatus().toString());
					  else
						  ResultLog.ReportTestEvent("PASS", "TEST STATUS: "+ testReport.getStatus().toString());
					  ResultLog.ReportTestEvent("INFO", "TEST ID: "+Thread.currentThread().getId()+ " TEST EXECUTION COMPLETE");
				  
				  ResultLog.ReportTestEvent("INFO", "UPDATE DB FOR EXECUTION STATUS");
//					  DBTestResultUpdate.UpdateTransactionIDInDB(testDataName,sTestID, "dealId",documentTranId);
//					  DBTestResultUpdate.UpdateTransactionIDInDB(testDataName,sTestID, "documentId",documentID);
					  DBTestResultUpdate.UpdateTestResultInDB(testDataName, sTestID);
					  ResultLog.ReportTestEvent("PASS", "##################TEST STATUS: ################## "+ testReport.getStatus().toString().toUpperCase());
					  System.out.println("##################TEST STATUS: ################## "+ testReport.getStatus().toString().toUpperCase());
				  
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
					  System.out.println("##################TEST STATUS: ################## "+ "Test FAILED");
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
		 
//		        String fileName = System.getProperty("urla");//System.getProperty("fileName");
//		        mvnParam=fileName;
//		        System.out.println("Reading config file : " + fileName);
		        
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
		  	  		//ResultLog.ReportTestEvent("INFO", "Maven Command Line Parameter: "+fileName);
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
