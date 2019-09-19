package com.otaras.testautomation.testscripts.login;
//package com.companyname.testautomation.testscripts.login;
//
//import org.testng.annotations.Test;
//import org.testng.annotations.Test;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.Set;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Platform;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.ie.InternetExplorerDriverService;
//import org.openqa.selenium.remote.CapabilityType;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.support.events.EventFiringWebDriver;
//import org.testng.annotations.Listeners;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.MediaEntityBuilder;
//import com.aventstack.extentreports.Status;
//import com.codoid.products.fillo.Recordset;
//import com.companyname.testautomation.aut.buildprojectbusinessmodules.core.Pages;
//import com.companyname.testautomation.aut.buildprojectbusinessmodules.core.commonbusinesscode.CommonBusinessComponentPage;
//import com.companyname.testautomation.aut.buildprojectbusinessmodules.core.login.LoginPage;
//import com.companyname.testautomation.aut.testdatarec.TestDataRec;
//import com.companyname.testautomation.common.DBTestResultUpdate;
//import com.companyname.testautomation.common.ExtentManager;
//import com.companyname.testautomation.common.InitializeDriver;
//import com.companyname.testautomation.common.InitializeTestDriver;
//import com.companyname.testautomation.common.ReadTestConfig;
//import com.companyname.testautomation.common.ReadTestData;
//import com.companyname.testautomation.common.ResultLog;
//import com.companyname.testautomation.common.TestListener;
//import com.companyname.testautomation.common.webDriverEventListener;
//import com.gargoylesoftware.htmlunit.Page;
//
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//@Listeners(com.companyname.testautomation.common.TestListener.class)
//public class LoginTestLatestBackup {
//	private WebDriver driver;
//	private InitializeDriver initializeDriver;
//	private EventFiringWebDriver driverEvent;
//	private webDriverEventListener eventListener;
//	private TestListener testListener;
//	private ExtentReports extentReport;
//	private ExtentTest testReport;
//	private Pages pages;
//	public String exceptiontriggered="";
//	
//
//	public ResultLog ResultLog;
//	DBTestResultUpdate DBTestResultUpdate;
//	
//	Recordset recordsetTestData;
//	ArrayList<String> arrayListTestDataColumns;
//	
//	public String ErrorFontColorPrefix="<span style='font-weight:bold;'><font color='red';font-size:16px; line-height:20px>";
//	public String ErrorFontColorSuffix="</font></span>";
//	
//  //@Test
////@Parameters("testBrowserXML")
//	//public void myTestMethod(String testBrowserXML) throws Exception {
//	
//	public void initializeDriverAndPages() throws Exception{
//		  if ((exceptiontriggered.equalsIgnoreCase("")||exceptiontriggered.equalsIgnoreCase("yes")) && !ReadTestConfig.Get("TEST.LOGINEACHSCENARIO").equalsIgnoreCase("yes")){
//			  initializeDriver=new InitializeDriver();
//			  InitializeTestDriver.SetTestBrowser();
//			  this.driver=initializeDriver.initializeDriver();
//			  driverEvent = new EventFiringWebDriver(driver);
//			  eventListener = new webDriverEventListener(testReport);
//			  //testListener=new TestListener(testReport);
//			  driverEvent.register(eventListener);
//			  this.driver=driverEvent;
//			
//			
//			  
//			  exceptiontriggered="no";
//		  }
//		  
//		  //else
//			  //pages.CommonBusinessComponentPage.testReport=testReport; 
//		  
//		  pages=new Pages(driver,testReport);
//		  pages.CommonBusinessComponentPage.pages=pages;
//		  ResultLog=new ResultLog(driver,testReport);
//		  DBTestResultUpdate=new DBTestResultUpdate(driver,testReport);
//		  ResultLog.ReportTestEvent("INFO", "TEST STARTED");
//		  ResultLog.takeScreenShot();
//		  eventListener.testReport=testReport;
//		  //testListener.testReport=testReport;
//	}
//	
//	
//	
//	  public void initializeTest() throws Exception {
//	
//		  
//	  extentReport=ExtentManager.CreateExtentReportExtent();
//	  testReport=ExtentManager.CreateExtentReportTest(extentReport);
//	  
//	  
////	  //String AppName=ReadTestConfig.Get("DRIVER.TYPE");
////	  
////	  if ((exceptiontriggered.equalsIgnoreCase("")||exceptiontriggered.equalsIgnoreCase("yes")) && !ReadTestConfig.Get("TEST.LOGINEACHSCENARIO").equalsIgnoreCase("yes")){
////		  initializeDriver=new InitializeDriver();
////		  this.driver=initializeDriver.initializeDriver();
////		  driverEvent = new EventFiringWebDriver(driver);
////		  eventListener = new WebDriverEventListener(testReport);
////		  driverEvent.register(eventListener);
////		  this.driver=driverEvent;
////		
////		
////		  
////		  exceptiontriggered="no";
////	  }
////	  
////	  //else
////		  //pages.CommonBusinessComponentPage.testReport=testReport; 
////	  
////	  pages=new Pages(driver,testReport);
////	  pages.CommonBusinessComponentPage.pages=pages;
////	  ResultLog=new ResultLog(driver,testReport);
////	  DBTestResultUpdate=new DBTestResultUpdate(driver,testReport);
////	  ResultLog.ReportTestEvent("INFO", "HELLO");
////	  ResultLog.takeScreenShot();
////	  eventListener.testReport=testReport;
//	  initializeDriverAndPages();
//  }
//  
//  @Test
//	//@Parameters("testBrowserXML")
//	//public void myTestMethod(String testBrowserXML) throws Throwable 
//	public void startTest() throws Throwable 
//	{
//	  	//int i=0;
//	  	TestDataRec.TESTDATANAME="objectrepository";
//	  	ReadTestData.captureLoginEnvirnmentTestData();
//	  	arrayListTestDataColumns=ReadTestData.readTestDataTableColumns("objectrepository");
//		ReadTestData.mapTestDataTableColumns(arrayListTestDataColumns);
//		recordsetTestData=ReadTestData.readTestData(TestDataRec.TESTDATANAME);
//		
//		
//		  while (TestDataRec.TEST_SCENARIOS_COUNT!=0)
//		  {
//			 
//			  try{
//			  ReadTestData.mapTestData(recordsetTestData);
//			  //TestDataRec.TESTSCRIPTID=TestDataRec.TESTDATAMAP.get("testID");
//			  initializeTest();
//			 // ResultLog.logTestLoginDetails();
//			//  ResultLog.logUITestDetails();
//			  
//			  pages.InvokeApplicationPage.launchApplication();
//			  pages.InvokeApplicationPage.WaitForPage(pages.HomePage);
//			
//			  String pageName="";
//			  String eInputValue="";
//			  String eExists="";
//			  String eStatus="";
//			  String eIsEditable="";
//			  String eDefaultValue="";
//			  String ePlaceHolder="";
//			  String eLength="";
//			  String eDropdownValuesPresent="";
//			  String eIsSelectable="";
//			  String eLabel="";
//			  String elementValue="";
//			  
//			  elementValue=TestDataRec.TESTDATAMAP.get("elementValue").trim();
//		
//			  //pages.InvokeApplicationPage.isElementPresent(By.id("idOfElement"));
//			  
//			  
//			  pageName=TestDataRec.TESTDATAMAP.get("pageName").trim();
//			  
//			  try{
//				  switch (pageName) 
//					{
//						case "loginpage":
//							pages.HomePage.clickSignIn();
//							pages.InvokeApplicationPage.WaitForPage(pages.LoginPage);
//							break;	
//					}
//			  }
//			  catch(Exception e)
//			  {
//				  ResultLog.ReportTestEvent("FATAL", "Exception: Page Name - "+TestDataRec.TESTDATAMAP.get("pageName")+"; Unable to Navigate to the test page - "+"; Page Name -  "+TestDataRec.TESTDATAMAP.get("pageName"));
//				  ResultLog.ReportTestEvent("FATAL",e.toString());
//			  }
//			  
//			  
//			  
//			  if (!eExists.equalsIgnoreCase("no"))
//			  {
//				  try
//				  {
//					  if (driver.findElement(By.xpath(elementValue)).isDisplayed())
//					  {
//							eExists=TestDataRec.TESTDATAMAP.get("eExists").trim();
//							try{
//								if (driver.findElement(By.xpath(elementValue)).isDisplayed())
//								{
//									ResultLog.ReportTestEvent("PASS","Test Step Passed "+TestDataRec.TESTDATAMAP.get("pageName")+"; Verification Method - "+"Element Exists"+"; Element Name -  "+TestDataRec.TESTDATAMAP.get("webelementName")+"; Element Value - "+TestDataRec.TESTDATAMAP.get("elementValue"));
//								}
//							}catch (Exception e)
//							{
//								ResultLog.ReportTestEvent("FATAL", "Exception: Page Name - "+TestDataRec.TESTDATAMAP.get("pageName")+"; Verification Method - "+"Element Exists"+"; Element Name -  "+TestDataRec.TESTDATAMAP.get("webelementName")+"; Element Value - "+TestDataRec.TESTDATAMAP.get("elementValue"));
//								ResultLog.ReportTestEvent("FATAL",e.toString());
//							}
//						  
//							
//							eStatus=TestDataRec.TESTDATAMAP.get("eStatus").trim();
//							try{
//								switch (eStatus) 
//								{
//									case "enbabled":
//										break;
//									case "disabled":
//										break;
//									default:
//										break;
//								}
//							}catch (Exception e)
//							{
//								ResultLog.ReportTestEvent("FATAL", "Exception: Page Name - "+TestDataRec.TESTDATAMAP.get("pageName")+"; Verification Method - "+"Element Status"+"; Element Name -  "+TestDataRec.TESTDATAMAP.get("webelementName")+"; Element Value - "+TestDataRec.TESTDATAMAP.get("elementValue"));
//								ResultLog.ReportTestEvent("FATAL",e.toString());
//							}
//							
//							eInputValue=TestDataRec.TESTDATAMAP.get("eInputValue").trim();
//							try{
//								switch (eInputValue) 
//								{
//									case "alphanumeric":
//										break;
//									case "numeric":
//										break;
//									case "email":
//										break;
//									default:
//										break;
//								}
//							}catch (Exception e)
//							{
//								ResultLog.ReportTestEvent("FATAL", "Exception: Page Name - "+TestDataRec.TESTDATAMAP.get("pageName")+"; Verification Method - "+"Element Accepting Input"+"; Element Name -  "+TestDataRec.TESTDATAMAP.get("webelementName")+"; Element Value - "+TestDataRec.TESTDATAMAP.get("elementValue"));
//								ResultLog.ReportTestEvent("FATAL",e.toString());
//							}
//							
//							eIsEditable=TestDataRec.TESTDATAMAP.get("eIsEditable").trim();
//							try{
//								switch (eIsEditable) 
//								{
//									case "yes":
//										break;
//									case "no":
//										break;
//									default:
//										break;
//								}
//							}catch (Exception e)
//							{
//								ResultLog.ReportTestEvent("FATAL", "Exception: Page Name - "+TestDataRec.TESTDATAMAP.get("pageName")+"; Verification Method - "+"Is Editable"+"; Element Name -  "+TestDataRec.TESTDATAMAP.get("webelementName")+"; Element Value - "+TestDataRec.TESTDATAMAP.get("elementValue"));
//								ResultLog.ReportTestEvent("FATAL",e.toString());
//							}
//							
//							eDefaultValue=TestDataRec.TESTDATAMAP.get("eDefaultValue").trim();
//							try{
//								switch (eDefaultValue) 
//								{
//									case "blank":
//										break;
//									default:
//										break;
//								}
//							}catch (Exception e)
//							{
//								ResultLog.ReportTestEvent("FATAL", "Exception: Page Name - "+TestDataRec.TESTDATAMAP.get("pageName")+"; Verification Method - "+"Default Value"+"; Element Name -  "+TestDataRec.TESTDATAMAP.get("webelementName")+"; Element Value - "+TestDataRec.TESTDATAMAP.get("elementValue"));
//								ResultLog.ReportTestEvent("FATAL",e.toString());
//							}
//							
//							ePlaceHolder=TestDataRec.TESTDATAMAP.get("ePlaceHolder").trim();
//							try{
//								if (!ePlaceHolder.equalsIgnoreCase(""))
//								{
//									
//								}
//							}catch (Exception e)
//							{
//								ResultLog.ReportTestEvent("FATAL", "Exception: Page Name - "+TestDataRec.TESTDATAMAP.get("pageName")+"; Verification Method - "+"Placeholder"+"; Element Name -  "+TestDataRec.TESTDATAMAP.get("webelementName")+"; Element Value - "+TestDataRec.TESTDATAMAP.get("elementValue"));
//								ResultLog.ReportTestEvent("FATAL",e.toString());
//							}
//							
//							eLength=TestDataRec.TESTDATAMAP.get("eLength").trim();
//							try{
//								if (!eLength.equalsIgnoreCase(""))
//								{
//									
//								}
//							}catch (Exception e)
//							{
//								ResultLog.ReportTestEvent("FATAL", "Exception: Page Name - "+TestDataRec.TESTDATAMAP.get("pageName")+"; Verification Method - "+"Length"+"; Element Name -  "+TestDataRec.TESTDATAMAP.get("webelementName")+"; Element Value - "+TestDataRec.TESTDATAMAP.get("elementValue"));
//								ResultLog.ReportTestEvent("FATAL",e.toString());
//							}
//							
//							eDropdownValuesPresent=TestDataRec.TESTDATAMAP.get("eDropdownValuesPresent").trim();
//							try{
//								if (!eDropdownValuesPresent.equalsIgnoreCase(""))
//								{
//									
//								}
//							}catch (Exception e)
//							{
//								ResultLog.ReportTestEvent("FATAL", "Exception: Page Name - "+TestDataRec.TESTDATAMAP.get("pageName")+"; Verification Method - "+"Dropdown Values Present"+"; Element Name -  "+TestDataRec.TESTDATAMAP.get("webelementName")+"; Element Value - "+TestDataRec.TESTDATAMAP.get("elementValue"));
//								ResultLog.ReportTestEvent("FATAL",e.toString());
//							}
//							
//							eIsSelectable=TestDataRec.TESTDATAMAP.get("eIsSelectable").trim();
//							try{
//								if (!eIsSelectable.equalsIgnoreCase(""))
//								{
//									
//								}
//							}catch (Exception e)
//							{
//								ResultLog.ReportTestEvent("FATAL", "Exception: Page Name - "+TestDataRec.TESTDATAMAP.get("pageName")+"; Verification Method - "+"Element Selectable"+"; Element Name -  "+TestDataRec.TESTDATAMAP.get("webelementName")+"; Element Value - "+TestDataRec.TESTDATAMAP.get("elementValue"));
//								ResultLog.ReportTestEvent("FATAL",e.toString());
//							}
//							
//							eLabel=TestDataRec.TESTDATAMAP.get("eLabel").trim();
//							try{
//								if (!eLabel.equalsIgnoreCase(""))
//								{
//									
//								}
//							}catch (Exception e)
//							{
//								ResultLog.ReportTestEvent("FATAL", "Exception: Page Name - "+TestDataRec.TESTDATAMAP.get("pageName")+"; Verification Method - "+"Element Label"+"; Element Name -  "+TestDataRec.TESTDATAMAP.get("webelementName")+"; Element Value - "+TestDataRec.TESTDATAMAP.get("elementValue"));
//								ResultLog.ReportTestEvent("FATAL",e.toString());
//							}
//					  	}
//				  	}catch (Exception e)
//				  	{
//				  		ResultLog.ReportTestEvent("FATAL", "Exception: Page Name - "+TestDataRec.TESTDATAMAP.get("pageName")+"; OBJECT NOT FOUND TO PERFORM UI VALIDATION - CHECK APPLICATION/TEST DATA SHEET - "+"Element Label"+"; Element Name -  "+TestDataRec.TESTDATAMAP.get("webelementName")+"; Element Value - "+TestDataRec.TESTDATAMAP.get("elementValue"));
//						ResultLog.ReportTestEvent("FATAL",e.toString());
//				  	}
//				 }
//				
//				
////			  // Get verification type
////			  // create xpath
////			  Switch input, button, label, 
////			  // check exists, length etc
//			  
//			  TestDataRec.TESTDATAMAP.get("pageName");
//			  TestDataRec.TESTDATAMAP.get("webelementName");
//			  TestDataRec.TESTDATAMAP.get("elementLocator");
//			  TestDataRec.TESTDATAMAP.get("elementValue");	
//			  TestDataRec.TESTDATAMAP.get("eType");
//			  TestDataRec.TESTDATAMAP.get("platform");
//			  TestDataRec.TESTDATAMAP.get("testPrecondition");
//			  TestDataRec.TESTDATAMAP.get("eInputValue");	
//			  
//			  
//			  TestDataRec.TESTDATAMAP.get("eLabel");
//			  TestDataRec.TESTDATAMAP.get("eStatus");
//			  TestDataRec.TESTDATAMAP.get("eDefaultValue");	
//			  TestDataRec.TESTDATAMAP.get("ePlaceHolder");
//			  TestDataRec.TESTDATAMAP.get("eLength");
//			  TestDataRec.TESTDATAMAP.get("eDropdownValuesPresent");
//			  TestDataRec.TESTDATAMAP.get("eIsEditable");	
//			  TestDataRec.TESTDATAMAP.get("eIsClickable");
//			  TestDataRec.TESTDATAMAP.get("eErrorMessage");				  
//			  
//			  
//			  if (TestDataRec.TEST_SCENARIOS_COUNT==10)
//				  throw new Exception ("Simulate Exception");
//			  
//					  
//			  pages.InvokeApplicationPage.commonlaunchApplication();
//			  pages.InvokeApplicationPage.WaitForPage(pages.HomePage);
//			  pages.HomePage.clickSignIn();
//			  ResultLog.takeScreenShot();
//			  pages.HomePage.WaitForPage(pages.LoginPage);
//			  pages.LoginPage.enter_newCustemailAddres();
//			  pages.LoginPage.enter_password();
//			  pages.LoginPage.clickHome();
//			  pages.LoginPage.WaitForPage(pages.HomePage);
//			  pages.HomePage.clickSignIn();
//			  
//			 // testReport.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("C:\\SVNstart\\testAutomationAnywhere\\src\\test\\resources\\testReport\\screenshots").build());
//			  
////			  pages.InvokeApplicationPage.commonlaunchApplication();
////			 
////			  pages.InvokeApplicationPage.commonlaunchApplication();
////			  
////			  extentReport.flush();
//			  
//			  //CommonBusinessComponentPage sCommon=new CommonBusinessComponentPage(pages);
//
//			  pages.InvokeApplicationPage.launchApplication();
//			  pages.CommonBusinessComponentPage.f();
//			  
////			  pages.InvokeApplicationPage.launchApplication();
//
//		
//			
////			strQueryXcl="select Login.columns from Login";
////			arrayColumnName=recordset.getFieldNames() //returns array of column names - read column name and create hash map.
//			
//			// GET TABLE NAMES AND CREATE COLUMNS MAPLIST
//			  
//
//			  pages.InvokeApplicationPage.launchApplication();
//			  
//			  
//			  String val=TestDataRec.TESTDATALOGINMAP.get("url");
//			  System.out.println("Key : "+val);
//
////			  Weblistener - add condition to log event or not
//////			  1. Test script ID
//////			  2. Wait for multiple pages
//////			  3. Small app for config tool
////			  4. UI Automation
//////			  5. Wait when no page navigation there
//
//
//			
////			// GET COMPLETE TEST DATA SET
////			arrayListTestDataColumns=null;
////			arrayListTestDataColumns=ReadTestData.readTestDataTableColumns("objectrepository");
////			ReadTestData.mapTestDataTableColumns(arrayListTestDataColumns);
////			recordsetTestData=ReadTestData.readTestData("objectrepository");
////			 
////			int j=0;
////			while(j!=3){
////				
////				
////				//pages.LoginPage.enterLoginName();
////				
////			ReadTestData.mapTestData(recordsetTestData);
////			j=j+1;
////			}
//			  
//			  
//			  
//			  
////			  if (i==2)
////				  throw new Exception ("Simulate Exception");
//			  
//			  ResultLog.PostTestStatus();
//			  }
//			  catch (Exception e)
//			  {
//				  exceptiontriggered="yes";
//				  ResultLog.PostTestStatus(e);
//				  driverQuit();
//			  }
//			  updateTestResult();
//			  //i=i+1;
//			  TestDataRec.TEST_SCENARIOS_COUNT=TestDataRec.TEST_SCENARIOS_COUNT-1;
//		  }
//		  driverQuit();  
//	 
//	}
//  
//  
//  
//  public void updateTestResult()
//  {
//	  extentReport.flush();
//	  testReport=null;
//  }
//  
//  
//  public void driverQuit()
//	{
//	  	extentReport.flush();
//		driverEvent.unregister(eventListener);
//		driver.quit();
//	}
//  
////  public void startExecutionTime()
////  {
////	  long startTime = System.nanoTime(); 
////  }
////  
////  public void endExecutionTime()
////  {
////	  long endTime   = System.nanoTime();
////	  long totalTime = endTime - startTime;
////	  System.out.println(totalTime);
// // }
//  
//  
//  
//}
//
//
//
//
//
//
////arrayListTestDataColumns=ReadTestData.readTestDataTableColumns("login");
////ReadTestData.mapLoginTestDataTableColumns(arrayListTestDataColumns);
////recordsetTestData=ReadTestData.readLoginTestData("login");
////ReadTestData.mapLoginTestData(recordsetTestData);
////
////arrayListTestDataColumns=ReadTestData.readTestDataTableColumns("environment");
////ReadTestData.mapLoginTestDataTableColumns(arrayListTestDataColumns);
////recordsetTestData=ReadTestData.readLoginTestData("environment");
////ReadTestData.mapLoginTestData(recordsetTestData);
//
//
////TestDataRec.TESTDATAMAP.put("First Name", "Anil");
////
////		HashMap<String, String> hmap = new HashMap<String, String>();
/////*Adding elements to HashMap*/
////  hmap.put("First Name", "Anil");
////  hmap.put("Last Name", "Kumar");
////  hmap.put("age", "1");
////  hmap.put("Address", "1234 Test Dr");
////  hmap.put("City", "charlotte");
////  
////  /* Display content using Iterator*/
////  Set set = hmap.entrySet();
////  Iterator iterator = set.iterator();
////  while(iterator.hasNext()) {
////     Map.Entry mentry = (Map.Entry)iterator.next();
////     System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
////     System.out.println(mentry.getValue());
////  }
////		
////		
////	driver.get("https://www.google.com/");
//////  pages=new Pages(driver,testReport);
//////  pages.LoginPage.enterLoginName();
//
//
//
//////*******************WORKING CODE - With booking datasheet **************************
//////http://www.convertcsv.com/csv-to-json.htm
////JsonReader jsonReader1 = new JsonReader(new FileReader("C:\\SVNstart\\TestData\\JSON\\booking.json"));
//////JsonReader jsonReader1 = new JsonReader(new FileReader("C:\\SVNstart\\TestData\\JSON\\test.json"));  
////jsonReader1.beginObject();
////
////    while (jsonReader1.hasNext()) {
////
////    String name1 = jsonReader1.nextName().trim();
////    System.out.println(name1);
////    if (name1.equals("Booking/Verification")) {
////           //  readApp(jsonReader);
////        	//jsonReader1.beginObject();
////    	jsonReader1.beginArray();
////		jsonReader1.beginObject();
////		int i=1;
////        	while (jsonReader1.hasNext()) {
////        		System.out.println("OBJECT : "+i);
////        		while  (jsonReader1.hasNext()) {
////        			
////        			String name = jsonReader1.nextName();
////        			if (name!=null)
////        				System.out.println(name);
////        			jsonReader1.hasNext();
////        			name = jsonReader1.nextString();
////        			if (name!=null)
////        				System.out.println(name);
////        		}
////        		jsonReader1.endObject();
////        		jsonReader1.beginObject();
////        		i=i+1;
////        	}
////        		
////    }  
////    
////    }
////  //*******************WORKING CODE **************************
