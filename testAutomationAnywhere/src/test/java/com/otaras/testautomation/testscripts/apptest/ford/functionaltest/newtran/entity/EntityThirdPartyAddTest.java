package com.otaras.testautomation.testscripts.apptest.ford.functionaltest.newtran.entity;

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
public class EntityThirdPartyAddTest {
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
    	
    	//public String  tranKeyValue;

    	static String testDataName="newEntity_thirdParty";
    	
	    @Factory (dataProvider="dataProviderMethod")
	    public EntityThirdPartyAddTest(Map<Object, Object> map){
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
	        	  pages.AddThirdPartyPage.testData=map;                 
	        	
	
	  	          ResultLog.ReportTestEvent("INFO", "LAUNCH APPLICATION");   
		        	  //pages.InvokeApplicationPage.launchApplication();
					  //pages.InvokeApplicationPage.WaitForPage(pages.MainPage);
					 // pages.MainPage.clickLoginIcon();
					  //pages.MainPage.WaitForPage(pages.LoginPage);

				  ResultLog.ReportTestEvent("INFO", "LOGIN TO APPLICATION AND NAVIGATE TO ADD DEBT PAGE"); 
					 // pages.LoginPage.loginToApplication();
					 // pages.LoginPage.WaitForPage(pages.HomePage);
					 // pages.MenuPage.clickNewMenu();
					//  pages.MenuPage.clickEntitySubMenu();
					//  pages.MenuPage.WaitForPage(pages.EntitySelectionPage);
				  pages.CommonBusinessComponentPage.pages=pages;
				  pages.CommonBusinessComponentPage.LoginToApplication();
				  	pages.CommonBusinessComponentPage.SelectEntityMenu();
					  
					  //pages.EntitySelectionPage.clickElementByLabel("Client");
					  pages.EntitySelectionPage.clickClientOrProspect(map.get("entityClientProspect").toString());
					  pages.MenuPage.WaitForPage(pages.AddThirdPartyPage);
				
				  ResultLog.ReportTestEvent("INFO", "ADD DEBT"); 
				  //String tranKeyValue=pages.AddThirdPartyPage.enterNewUserClientData(map);
				  String tranKeyValue=pages.AddThirdPartyPage.enterAdminNewThirdPartyData(map);
				  //driver.findElement(By.xpath("//div[@class='control']/*[contains(text(),'"+"Save Third Party"+"')]/parent::div")).click();
				  pages.AddThirdPartyPage.Click("//div[@class='control']/*[contains(text(),'"+"Save Third Party"+"')]/parent::div");
				  //driver.findElement(By.xpath("//div[@class='control']/*[contains(text(),'"+"Save Third Party"+"')]/parent::div")).click();
				  String documentID="";
//				  if (map.get("actionStatus").toString().equalsIgnoreCase("error"))
//				  {
//					  if (pages.AddThirdPartyPage.ExistsCheck(driver.findElement(By.xpath("//*[@class='text-error']|//*[@class='has-text-danger']|//*[@class='is-small text-error has-text-danger ']")))==true)
//					  {
//						  ResultLog.ReportTestEvent("PASS", "Inline error message found for invalid data");  
//						  //pages.AddThirdPartyPage.enterInput(OR.AdminAhddThirdPartyPage_TaxID,"676776678");
//						  //driver.findElement(By.xpath("//div[@class='control']/*[contains(text(),'"+"Save Third Party"+"')]/parent::div")).click();
//					  }
//					  else
//						  ResultLog.ReportTestEvent("FAIL", "No validation performed");  
//				  }else{
				  
				 // pages.CommonBusinessComponentPage .waitForElementExists(OR.SuccessMessage_Greencolor);
					pages.CommonBusinessComponentPage.waitForElementExists("//div/*[contains(text(),'"+"Business Contact Information"+"')]");
				  
					ResultLog.ReportTestEvent("INFO", "Enter Business Address Data"); 
					  //pages.AddClientPage.clickButton(OR.AddClientPage_BusinessContactInformationLbl);
					  driver.findElement(By.xpath("//*[contains(text(),'"+OR.AddClientPage_BusinessContactInformationLbl+"')]/parent::div/div/div/button[contains(text(),'"+"Add"+"')]")).click();
					  
					  //recordsetTestData=ReadTestData.readTestDataBySpecifiedColumnName("businessAddress", "key", map.get("businessAddress").toString());
					  //pages.AddClientPage.enterMaster_BusinessAddressData("businessAddress", "key", map.get("businessAddress").toString());
					  pages.CommonBusinessComponentPage.enterMaster_BusinessAddressData("businessAddress", "key", map.get("businessAddress").toString());
					//  pages.CommonBusinessComponentPage.enterInput(OR.BusinessAddressPage_AddressName,tranKeyValue);
					  driver.findElement(By.xpath("//div[@class='control']/*[contains(text(),'"+"Save Contact Info"+"')]/parent::div")).click();
					 // driver.findElement(By.xpath("//div[@class='control']/*[contains(text(),'"+"Save Contact Info"+"')]/parent::div")).sendKeys(Keys.ENTER);
					  
					  //Thread.sleep(200);
					  //driver.findElement(By.xpath("//div[@class='control']/*[contains(text(),'"+"Save Contact Info"+"')]/parent::div")).click();
					  //driver.findElement(By.xpath("//section/article[2]/div[2]/div[2]/span[2]/div[3]/div/button")).click();
					//*[@id="main"]/section/article[2]/div[2]/div[2]/span[2]/div[3]/div/button
					  //pages.CommonBusinessComponentPage.Click("//div[@class='control']/*[contains(text(),'"+"Save Contact Info"+"')]/parent::div");
					  
					  //pages.CommonBusinessComponentPage.waitForElementExists(OR.SuccessMessage_Greencolor);
					  pages.CommonBusinessComponentPage.waitForElementExists("//div/*[contains(text(),'"+"Business Contact Information"+"')]");
				  
				  
				  
//				  pages.CommonBusinessComponentPage.enterInput(OR.AdminAddThirdPartyPage_TaxID,tranKeyValue);
//					  //driver.findElement(By.xpath("//*[contains(text(),'"+"Business Address"+"')]")).click();
//					  ResultLog.ReportTestEvent("INFO", "Screenshot before performing action on transaction - Add DEBT");
//					  ResultLog.takeScreenShot();
//					  //Thread.sleep(200);
//					 
//				ResultLog.ReportTestEvent("INFO", "Enter Business Address Data"); 
//					  pages.AddThirdPartyPage.clickButton(OR.AddClientPage_BusinessAddressLbl);
//					  
//					  
//					  //recordsetTestData=ReadTestData.readTestDataBySpecifiedColumnName("businessAddress", "key", map.get("businessAddress").toString());
//					  //pages.AddClientPage.enterMaster_BusinessAddressData("businessAddress", "key", map.get("businessAddress").toString());
//					  pages.CommonBusinessComponentPage.enterMaster_BusinessAddressData("businessAddress", "key", map.get("businessAddress").toString());
//					  
//					  
//						//pages.CommonBusinessComponentPage.clearInputValue("Address Name");
//						pages.CommonBusinessComponentPage.enterInput(OR.BusinessAddressPage_AddressName,tranKeyValue);
					  
//					  pages.AddClientPage.clickButton("Link Cusip");
//					  pages.AddClientPage.enterMaster_LinkCusipData("linkCusip", "key", map.get("linkCusip").toString());
					  
					  //pages.AddClientPage.clickButton("Link Borrowers / Obligors");
					  //pages.AddClientPage.enterMaster_LinkBorrowersData("linkBorrowers", "key", map.get("linkBorrowers").toString());
					  
					  
				  
		//		  ResultLog.ReportTestEvent("INFO", "ADD DEBT PAGE - PERFORM TEST ACTION - "+map.get("action").toString());
		//			  pages.CommonBusinessComponentPage.performAction(map.get("action").toString());
					  //pages.AddDerivativePage.WaitForPage(pages.ComplianceChecksPage);
					  //pages.ComplianceChecksPage.clickButton("Save");
					  //Thread.sleep(00);
					  //ResultLog.takeScreenShot();
					  //pages.AddDebtPage.Exists(driver.findElement(By.xpath("//*[contains(text(),'"+map.get("actionStatus").toString()+"')]")));
					  //pages.AddThirdPartyPage.verifySpecifiedElementExistsByLabel(map.get("actionStatus").toString());
					  //ResultLog.log(Status.INFO, "Google Page opened"+ResultLog.addScreenCaptureFromPath(captureScreen()));
					  pages.AddThirdPartyPage.WaitForPage(pages.MasterEntityClientsPropsectsPage);
					  
					  //working line - pages.AddDebtPage.WaitForPage(pages.ActivityDashboardPage);
					  ResultLog.ReportTestEvent("INFO", "Screenshot after performing action on transaction");
					  ResultLog.takeScreenShot();
				  
				  ResultLog.ReportTestEvent("INFO", "CLICK MUNIVISOR HOME ICON");
					  pages.HomePage.clickMunivisorHomeIcon();
					  pages.HomePage.WaitForPage(pages.ActivityDashboardPage);
					  //ResultLog.takeScreenShot();
					  
					 // if(!ReadTestConfig.Get("SKIP.DB.VALIDATION").equalsIgnoreCase("yes")){
				  
				  ResultLog.ReportTestEvent("INFO", "##### VERIFY TRANSACTION DATA (USER DATA ENTERED IN UI) WITH DATABASE VALUES #####");
					  ResultLog.ReportTestEvent("INFO", "<< GET DOCUMENT FROM DB >>");
					  
					  String tbl_name="entities";
		        	  String col_name ="firmName";//"taxId"; //"addresses.addressName";  //"addressName" ;//"dealIssueTranName";
		        	  //String  srch_string = "TXDEALE80FA6B0A36E11E8";
		        	  //String  tranKeyValue = pages.AddClientPage.NameKeyToQueryDB();
		        	 // tranKeyValue=map.get("taxID").toString()+tranKeyValue;
		        	  
					  MongoDBUtil mongodbutil=new MongoDBUtil();
		        	  //Document Trandocument= mongodbutil.getDocument(tbl_name,col_name, tranKeyValue);
					  Document Trandocument= mongodbutil.getDocumentFromDB(tbl_name,col_name, tranKeyValue);
		        	  System.out.println("Document ID "+Trandocument.get("_id"));
		        	  documentID=Trandocument.get("_id").toString();
		        	  //String documentTranId=Trandocument.get("actTranUniqIdentifier").toString();
		        	  
		        	 //Document Trandocument1= mongodbutil.getDocumentObject("entityusers","_id", "5b68917b716ea31ccc9d9cbf");
		        	 // MongoDBUtil mongodbutil1=new MongoDBUtil();
//		        	  Document subDocs = (Document) Trandocument.get("dealIssueTranRelatedTo");
//		        	  int sSize=subDocs.size();
		        	  
//		        	  System.out.println("Attribute from document is "+Trandocument.get("dealIssueTranAssignedTo"));
//		        	 
//		        	  
//		        	  String dealIssueTranAssignedTo=Trandocument.get("dealIssueTranAssignedTo").toString().replace("[", "").replace("]", "").trim();
//		        	  Document TrandocumentObj= mongodbutil.getDocumentObject("entityusers","_id", dealIssueTranAssignedTo);
		        	  
		        	  System.out.println("Attribute from document is "+Trandocument.get(col_name));
		        	  ResultLog.ReportTestEvent("INFO", "TRAN DOCUMENT CREATED#: "+Trandocument);
		        	  ResultLog.ReportTestEvent("INFO", "<< VERIFY DATA PASSED FROM UI WITH DATABASE >>");
		        	  pages.AddDerivativePage.verifyDatabase(map, Trandocument);
		        	  
		        	  driver.get(TestDataRec.TESTDATALOGINMAP.get("url")+"/thirdparties/"+documentID+"/entity");
					  pages.ActivityDashboardPage.WaitForPage(pages.MasterEntityThirdPartyPage);
					  
				 // }
					  ResultLog.takeScreenShot();
	        	
				  ResultLog.ReportTestEvent("INFO", "REPORT TEST EXECUTION STATUS");
					  if (testReport.getStatus().toString().equalsIgnoreCase("fail"))
						  ResultLog.ReportTestEvent("FAIL", "TEST STATUS: "+ testReport.getStatus().toString());
					  else
						  ResultLog.ReportTestEvent("PASS", "TEST STATUS: "+ testReport.getStatus().toString());
					  ResultLog.ReportTestEvent("INFO", "TEST ID: "+Thread.currentThread().getId()+ " TEST EXECUTION COMPLETE");
				  
				  ResultLog.ReportTestEvent("INFO", "UPDATE DB FOR EXECUTION STATUS");
					  //DBTestResultUpdate.UpdateTransactionIDInDB(testDataName,sTestID, "dealId",documentTranId);
					  DBTestResultUpdate.UpdateTransactionIDInDB(testDataName,sTestID, "documentId",documentID);
					  DBTestResultUpdate.UpdateTestResultInDB(testDataName, sTestID);
					  System.out.println("##################TEST STATUS: ################## "+ testReport.getStatus().toString().toUpperCase()+"   Tran ID: "+documentID);
					  ResultLog.ReportTestEvent("PASS", "##################TEST STATUS: ################## "+ testReport.getStatus().toString().toUpperCase()+"   Tran ID: "+documentID);
					  
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
					  ResultLog.ReportTestEvent("FATAL", "##################TEST STATUS: ##################"+ "Test FAILED");
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
