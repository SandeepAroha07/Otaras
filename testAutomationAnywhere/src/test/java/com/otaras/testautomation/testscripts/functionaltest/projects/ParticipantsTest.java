package com.otaras.testautomation.testscripts.functionaltest.projects;
//package com.companyname.testautomation.testscripts.functionaltest.projects;
//
//import java.util.concurrent.TimeUnit;
//
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.Platform;
//import org.openqa.selenium.StaleElementReferenceException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.support.events.EventFiringWebDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.ITestResult;
//import org.testng.Reporter;
//import org.testng.TestNG;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Factory;
//import org.testng.annotations.Listeners;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.MediaEntityBuilder;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.markuputils.ExtentColor;
//import com.aventstack.extentreports.markuputils.Markup;
//import com.aventstack.extentreports.markuputils.MarkupHelper;
//import com.codoid.products.fillo.Recordset;
//import com.companyname.testautomation.aut.buildprojectbusinessmodules.core.Pages;
//import com.companyname.testautomation.aut.testdatarec.TestDataRec;
//import com.companyname.testautomation.common.Common;
//import com.companyname.testautomation.common.DBTestResultUpdate;
//import com.companyname.testautomation.common.ExtentManager;
//import com.companyname.testautomation.common.GuiValidation;
//import com.companyname.testautomation.common.InitializeDriver;
//import com.companyname.testautomation.common.ReadTestConfig;
//import com.companyname.testautomation.common.ReadTestData;
//import com.companyname.testautomation.common.ResultLog;
//import com.companyname.testautomation.common.webDriverEventListener;
//import com.companyname.testautomation.objectrepository.OR;
//import com.companyname.testautomation.common.BrowserUtil;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.net.InetAddress;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.*;
//import java.lang.reflect.Method;
//
//@Listeners(com.companyname.testautomation.common.TestListener.class)
//public class ParticipantsTest {
//	  	private WebDriver driver;
//	  	private EventFiringWebDriver driverEvent;
//  		private webDriverEventListener eventListener;
//  		private ExtentReports extentReport;
//  		private ExtentTest testReport;
//
//  		private String sBrowser="";
//    	String sBrowserFromTestData="";
//    	long startTime;
//    	
//	    Map<Object, Object> map;
//	    private String sTestID="";
//    	static Recordset recordsetTestData;
//    	static ArrayList<String> arrayListTestDataColumns;
//    	
//    	Pages pages;
//    	ResultLog ResultLog;
//    	DBTestResultUpdate DBTestResultUpdate;
//    	InitializeDriver initializeDriver;
//    	String sDriverType=ReadTestConfig.Get("DRIVER.TYPE");
//    	GuiValidation GuiValidation;
//
//    	String testBrowserXML="";
//    	String className = this.getClass().getSimpleName();
//    	BrowserUtil BrowserUtil;
//		static String testDataName="participants";
//    	//static Map<Object, Object> tempTranColumns;
//    	
//	    @Factory (dataProvider="dataProviderMethod")
//	    public ParticipantsTest(Map<Object, Object> map){
//	    	this.map=map;
//	        this.sTestID=map.get("testID").toString();
//	        this.sBrowserFromTestData=map.get("TestBrowser").toString();
//	    }
//
//	    @DataProvider//(parallel=true)
//	    public static Object[][] dataProviderMethod() throws Exception {
////	      	ReadTestData.captureLoginEnvirnmentTestData();
////	      	TestDataRec.TESTDATANAME="participants";
////		  	arrayListTestDataColumns=ReadTestData.readTestDataTableColumns("participants");
////			ReadTestData.mapTestDataTableColumns(arrayListTestDataColumns);
////			//tempTranColumns=TestDataRec.TESTTRANSACTIONDATAMAP;
////	      	recordsetTestData=ReadTestData.readTestData(TestDataRec.TESTDATANAME);
////	        int lastRowNum=TestDataRec.TEST_SCENARIOS_COUNT;
////	        Object[][] obj = new Object[lastRowNum][1];
////	      	obj=ReadTestData.mapAllTestData(recordsetTestData);
////	      	return obj;
//	      	
//	    	 HashMap<String, String> tableColumnNames=new HashMap<>();
//		      	ReadTestData.captureLoginEnvirnmentTestData();
//		      	//TestDataRec.TESTDATANAME="deal";
//			  	arrayListTestDataColumns=ReadTestData.readTestDataTableColumns(testDataName);
//			  	tableColumnNames=ReadTestData.mapTestDataTableColumns(arrayListTestDataColumns);
//		      	recordsetTestData=ReadTestData.readTestData(testDataName);
//		      	//TestDataRec.TEST_SCENARIOS_COUNT=recordsetTestData.getCount();
//		      	//testScenariosCount=recordsetTestData.getCount();
//		        int lastRowNum=recordsetTestData.getCount();//TestDataRec.TEST_SCENARIOS_COUNT;
//		        Object[][] obj = new Object[lastRowNum][1];
//		        TestDataRec.TESTDATACOLUMNSMAP=tableColumnNames;
//		      	obj=ReadTestData.mapAllTestData(recordsetTestData);
//		      	return obj;      	
//	    }
//
//	    		
//	    @Test
//	    public void testCase1() throws InterruptedException, Exception{
//	    	
//	    	
//	    	ResultLog.ReportTestEvent("INFO", "Execution Started Time: "+startTime);
//	        System.out.println("Test 1");  
//	       // System.out.println("URL fromlogin hash map - -"+TestDataRec.TESTDATALOGINMAP.get("url")); 
//	        
//	        //TestDataRec.TESTTRANSACTIONDATAMAP=null;
//	       // TestDataRec.TESTTRANSACTIONDATAMAP=map;
//	        System.out.println("Test Data Used: " + map);
//	        //pages.InvokeApplicationPage.launchApplicationNEW();
//	        //testReport.log(Status.INFO, "<table><tr><th>DeviceName</th></tr><tr><td>OnePlus</td></tr></table");
////	        ResultLog.ReportTestEvent("INFO", "Page Name: "+TestDataRec.TESTTRANSACTIONDATAMAP.get("pageName").toString());
////	        ResultLog.ReportTestEvent("INFO", "WebElement Name: "+TestDataRec.TESTTRANSACTIONDATAMAP.get("webelementName").toString());
////	        ResultLog.ReportTestEvent("INFO", "Element ID: "+TestDataRec.TESTTRANSACTIONDATAMAP.get("elementValue").toString());
//	        ResultLog.ReportTestEvent("INFO", "Test Browser: "+testBrowserXML);
//	        ResultLog.ReportTestEvent("INFO", "Test Data: "+map);
////	        
//	        
//	        recordsetTestData=ReadTestData.readTestData(testDataName, sTestID, map.get("testTransactionID").toString());
//	        int sTransactionsCount=recordsetTestData.getCount();
//	        Object[][] objtemp = new Object[sTransactionsCount][1];
//	        objtemp=ReadTestData.mapAllTestData(recordsetTestData);
//	        
//	     
//	        
//	        
//	        try{
//	        	
////	        	driver.get("http://automationpractice.com/index.php");
////				//driver.get(TestDataRec.TESTDATALOGINMAP.get("url"));
////			  	  Thread.sleep(1000);
////			  	  driver.findElement(By.xpath("//a[@class='login']")).click();
////			  	 Thread.sleep(1000);
//	        	pages.InvokeApplicationPage.launchApplication();
//				 pages.InvokeApplicationPage.WaitForPage(pages.MainPage);
//				  pages.MainPage.clickLoginIcon();
//				pages.MainPage.WaitForPage(pages.LoginPage);
//
//
////				  pages.LoginPage.enterPassword();
////				  pages.LoginPage.enterUsername();
////				  pages.LoginPage.clickSignIn();
//				  pages.LoginPage.loginToApplication();
//				pages.LoginPage.WaitForPage(pages.HomePage);
////				  try{
//				  pages.MenuPage.clickUserDashboardMenu();
//				  pages.MenuPage.clickProjectsSubMenu();
//				  pages.MenuPage.WaitForPage(pages.DashboardPage);
//				  
//				  driver.navigate().refresh();
//				  pages.MenuPage.WaitForPage(pages.DashboardPage);
//				  pages.DashboardPage.selectTransaction();
//				  pages.DashboardPage.WaitForPage(pages.DetailsPage);
//				  pages.DashboardPage.clickParticipantsTab();
//				  pages.DashboardPage.WaitForPage(pages.ParticipantsPage);
//				  pages.ParticipantsPage.clickAdd();
//				  ResultLog.takeScreenShot();
//				  
//				   String sColumnName="";
//				   ResultLog.ReportTestEvent("INFO", "Total Test Records"+sTransactionsCount);
//			        for (int i = 0; i < sTransactionsCount; i++) {
//			        	Map<Object, Object> datamap = new HashMap<>();
//			        	datamap=(Map<Object, Object>) objtemp[i][0];
//			        	 ResultLog.ReportTestEvent("INFO", "Transaction Test Data: "+datamap);
//			        		    Set set = map.entrySet();
//			        		    Iterator iterator = set.iterator();
//			        		 while(iterator.hasNext()) {
//			        	         Map.Entry mentry = (Map.Entry)iterator.next();
//			        	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
//			        	         try{
//			        	         System.out.println(mentry.getValue());
////			        	         sColumnName=mentry.getValue().toString();
//			        	         System.out.print(datamap.get(mentry.getKey()));
//			        	         }catch(Exception e){
//			        	        	 System.out.print("Data read exception:"+e);
//			        	        	 ResultLog.ReportTestEvent("FATAL", "i value:"+i+" -- Column Name "+sColumnName+" - Data read exception"+e);
//			        	         }
//			        		 }
//			         }
//				  
//				  
////				  pages.DashboardPage.clickNewTransaction();
////				  
////				  
////				  BrowserUtil=new BrowserUtil(driver, testReport);
////				  BrowserUtil.SwitchToBrowserSecondTab();
////			
////				  pages.DashboardPage.WaitForPage(pages.NewTransactionPage);
////				  pages.NewTransactionPage.selectIssuer();
////				  pages.NewTransactionPage.getTransactionName();
////				  pages.NewTransactionPage.selectTransactionType();
////				  pages.NewTransactionPage.enterOtherTransactionType();
////				  pages.NewTransactionPage.selectPurposeofRFP();
////				  pages.NewTransactionPage.selectAssignedTo();
////				  pages.NewTransactionPage.selectState();
////				  pages.NewTransactionPage.selectCounty();
////				  pages.NewTransactionPage.selectPrimarySector();
////				  pages.NewTransactionPage.selectSecondarySector();
////				  
////
////				  
//////				  WebElement wb = driver.findElement(By.xpath("//input[@name='rfpTranDateHired']"));
//////				  JavascriptExecutor jse = (JavascriptExecutor)driver;
//////				  jse.executeScript("arguments[0].click();", wb);
//////				  jse.executeScript("arguments[0].value='10102000';", wb);
////				  //jse.executeScript("document.getElementByXpath('//input[@name='rfpTranDateHired']').value='10102000';");
////				  
////				  //driver.findElement(By.xpath("/html/body/div/div/div/div/div[1]/div/section/div/div/div[4]/div[1]/div/input")).sendKeys("10102000");
////				  
////				  pages.NewTransactionPage.enterDateHired();
////				  pages.NewTransactionPage.enterStartDate();
////				  pages.NewTransactionPage.enterExpectedEndDate();
////				  pages.NewTransactionPage.selectRelatedTransactionsAction();
////				  pages.NewTransactionPage.enterNotes();
////				  ResultLog.ReportTestEvent("INFO", "Screenshot before performing action on transaction");
////				  ResultLog.takeScreenShot();
////				  pages.NewTransactionPage.performAction();
////				  ResultLog.ReportTestEvent("INFO", "Screenshot after performing action on transaction");
////				  
////				  pages.MenuPage.clickUserDashboardMenu();
////				  pages.MenuPage.clickProjectsSubMenu();
////				  pages.MenuPage.WaitForPage(pages.DashboardPage);
////				  pages.DashboardPage.selectTransaction();
////				  pages.DashboardPage.WaitForPage(pages.ExistTransactionPage);
////				  ResultLog.takeScreenShot();
//				  
////				  ADD OR
////				  ADD code to create transaction
////				  check on - adding object to hashmap
//				  
//				  
////				  try{
////					  WebElement el = driver.findElement( By.cssSelector( "div.navbar-item:nth-child(2) > a:nth-child(1)" ) );
////					     Actions builder = new Actions(driver);
////					     builder.moveToElement( el ).click( el );
////					     builder.perform();
////				  }catch(Exception e){}
//				  
////				  }catch(Exception e){
////				  //driver.findElement(By.xpath("//div/div/div/div/div[1]/nav/div[2]/div[2]/div[1]/div[2]")).click();
////					  driver.findElement(By.xpath("/html/body/div/div/div/div/div[1]/nav/div[2]/div[2]/div[1]/div[2]")).click();
////				  }
////				  //driver.switchTo().frame(driver.findElement(By.name("iframeWithElement")));
////				  
////				//  Thread.sleep(10000);
//////				  WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'New')]"));
//////				  JavascriptExecutor executor = (JavascriptExecutor)driver;
//////				  executor.executeScript("arguments[0].click();", ele);
////				  try{
////				  List<WebElement> sMenuList = driver.findElements(By.xpath("//a[@class='navbar-link']"));
////					 for (int i = 0; i<sMenuList.size();i++)
////				    {
////						 System.out.println("Menu Text:"+sMenuList.get(i).getText());
////						 if(sMenuList.get(i).getText().equalsIgnoreCase("new"))
////							{
////							 //sMenuList.get(i).sendKeys(Keys.PAGE_UP);	
////							 Thread.sleep(200);
////							 sMenuList.get(i).click();
////							 sMenuList.get(i).sendKeys(Keys.RETURN);
////								break;
////							}
////			    }			  }catch (Exception e){}
//////					  try{
//////					  pages.MenuPage.clickNewMenu();
//////					  }catch (Exception e1){
//////						driver.findElement(By.xpath("//*[@id='navMenuDocumentation']/div[1]/div[2]/a")).click();
//////						System.out.println("Exception Found");
//////					  }
//////				  }
////				  
////				  //Thread.sleep(200);
////				  WebElement element = driver.findElement(By.id("//div/div/div/div/div[1]/nav/div[2]/div[2]/div[1]/div[2]"));
////				  JavascriptExecutor executor = (JavascriptExecutor)driver;
////				  executor.executeScript("arguments[0].click();", element);
////				  Thread.sleep(5000);
////				  pages.MenuPage.clickNewMenu();
////				  pages.MenuPage.clickEntitySubMenu();
////				  pages.MenuPage.WaitForPage(pages.CreateEntitySelectionPage);
////				  pages.CreateEntitySelectionPage.SelectClient();
////				  //Thread.sleep(1000);
////				  //driver.navigate().refresh();
////				  pages.CreateEntitySelectionPage.WaitForPage(pages.ClientFirmPage);
////				 // pages.ClientFirmPage.selectFirmType();
//////				  try {
//////					    WebElement button = driver.findElement(By.xpath("//input[@name='issuerFlags']"));
//////					            button.click();
//////					}
//////					catch(org.openqa.selenium.StaleElementReferenceException ex)
//////					{
//////					    WebElement button = driver.findElement(By.xpath("//input[@name='issuerFlags']"));
//////					            button.click();
//////					}
////				  //ResultLog.takeScreenShot();
////				  //Thread.sleep(500);
////				 //pages.ClientFirmPage.ClientFirm.click();
////				 
////				  pages.ClientFirmPage.SelectFirmName();
////				  //Thread.sleep(1000);
////				  ResultLog.takeScreenShot();
////		        
////				  pages.HomePage.clickSignIn();
////				  ResultLog.takeScreenShot();
////				  
////				  if (sTestID.toString().equalsIgnoreCase("sampleTest004"))
////				    	throw new NullPointerException("Manually throws execption");
////				  
////				  if (sTestID.toString().equalsIgnoreCase("sampleTest003"))
////				    	driver.findElement(By.xpath("iii")).click();
////				  
////				  pages.HomePage.WaitForPage(pages.LoginPage);
////				  pages.LoginPage.enter_newCustemailAddres();
////				  pages.LoginPage.enter_password();
////				  pages.LoginPage.clickHome();
////				  pages.LoginPage.WaitForPage(pages.HomePage);
////				  pages.HomePage.clickSignIn();
////				  pages.LoginPage.clickHome();
////				  pages.LoginPage.WaitForPage(pages.HomePage);
//				  
////				  if(sTestID.equalsIgnoreCase("TID_UI_0006"))
////					  throw new NullPointerException("Manually throws execption");
//				  
//				  //GuiValidation.UITestValidation(map);
//	        
//					  if (testReport.getStatus().toString().equalsIgnoreCase("fail"))
//						  ResultLog.ReportTestEvent("FAIL", "TEST STATUS: "+ testReport.getStatus().toString());
//					  else
//						  ResultLog.ReportTestEvent("PASS", "TEST STATUS: "+ testReport.getStatus().toString());
//				  ResultLog.ReportTestEvent("INFO", "TEST ID: "+Thread.currentThread().getId()+ " TEST EXECUTION COMPLETE");
////				  if (Thread.activeCount()==1)
////				  {
//					  DBTestResultUpdate.UpdateTransactionIDInDB(testDataName,sTestID, "dealID","kumar");
//					  DBTestResultUpdate.UpdateTestResultInDB(testDataName, sTestID);
////				  }
//				  driver.quit();
//	        }
//			  catch (Exception e)
//			  {
//				  
//				  ResultLog.takeScreenShot();
//				  ResultLog.ReportTestEvent("FATAL","Entered Test 'Exception' Block-:"+" ******** Exception Found - Test Scenario Execution Incomplete ********");
//				  ResultLog.ReportTestEvent("FATAL", "TEST FAILED - EXCEPTION: "+e);
//				  ResultLog.ReportTestEvent("INFO", "TEST EXECUTION INCOMPLETE");
//				  DBTestResultUpdate.UpdateTransactionIDInDB(testDataName,sTestID, "dealID","kumar-e");
//				  DBTestResultUpdate.UpdateTestResultExceptionInDB(testDataName, sTestID);
//				  driver.quit();
//				  throw new NullPointerException("******** Exception Found - Test Scenrario Execution Incomplete ********");
//			  }
//	    }
//	    
//		 
//		   @BeforeClass
//		    @Parameters({ "testBrowserXML" })
//		    public void beforeClass(String testBrowserXML) throws Exception {
//			 //  public void beforeClass() throws Exception {
//		    	startTime = System.currentTimeMillis();
//		        long id = Thread.currentThread().getId();
//		 
//		        
//		        if (testBrowserXML.equalsIgnoreCase("skip")||testBrowserXML.equalsIgnoreCase("")||testBrowserXML.equalsIgnoreCase("param-val-not-found"))
//		        	testBrowserXML=sBrowserFromTestData;
////		        else if (testBrowserXML.equalsIgnoreCase(""))
////		        	testBrowserXML=sBrowserFromTestData;
//		        
//		        TestNG testng = new TestNG();
//		        testng.setVerbose(2);
////		        testng.setTestClasses(new Class[] { TestTest.class });
////		        testng.run();
//		        extentReport=ExtentManager.CreateExtentReportExtent();
//		  	  	testReport=ExtentManager.CreateExtentReportTest(extentReport,testBrowserXML,className+"_"+sTestID);
//		  	  	initializeDriver=new InitializeDriver();
//		  	  	if (sDriverType.equalsIgnoreCase("remotedriver"))
//		  	  		driver=initializeDriver.initRemoteWebDriver(testBrowserXML);
//		  	  	else if (sDriverType.equalsIgnoreCase("webdriver"))
//		  	  		driver=initializeDriver.initWebDriver(testBrowserXML);
//		  	  	
//		  		//if (!ReadTestConfig.Get("COMMANDLINE.EXECUTION").toString().trim().equalsIgnoreCase("yes")){
//		  			driverEvent = new EventFiringWebDriver(driver);
//				  eventListener = new webDriverEventListener(testReport);
//				  driverEvent.register(eventListener);
//				  this.driver=driverEvent;//}
//		  	
//		  	//Thread.sleep(2000);
//		  	  		pages=new Pages(driver,testReport);
//		  	  		ResultLog=new ResultLog(driver,testReport);
//		  	  		DBTestResultUpdate=new DBTestResultUpdate(driver,testReport);
//		  	  		GuiValidation=new GuiValidation(driver,testReport);
//		  	  		DBTestResultUpdate=new DBTestResultUpdate(driver,testReport);
//		  	  	//GuiValidation.ResultLog=null;
//		  	  		GuiValidation.ResultLog=ResultLog;
//		  	  		GuiValidation.pages=pages;
//			        ResultLog.ReportTestEvent("INFO", "Test Browser: "+testBrowserXML);
//			        ResultLog.ReportTestEvent("INFO", "Test ID: "+sTestID);
////		        driverEvent = new EventFiringWebDriver(driver);
////				  eventListener = new webDriverEventListener(testReport);
//////				  //testListener=new TestListener(testReport);
////				  driverEvent.register(eventListener);
////				  this.driver=driverEvent;
////				  driverEvent.get("http://www.store.demoqa.com");
//		    }
//	    
//
//	 
//	    @AfterClass
//	    public void afterClass() throws Exception {
//	    	long stopTime = System.currentTimeMillis();
//	        long elapsedTime = stopTime - startTime;
//	        long seconds = TimeUnit.MILLISECONDS.toSeconds(elapsedTime);
//	//        DBTestResultUpdate.UpdateTransactionIDInDB("participants",sTestID, "dealID","");
////	        elapsedTime=(elapsedTime/1000)%60;
//	        System.out.println(elapsedTime);
//	        TestDataRec.TESTEXECUTIONTIME=seconds;
//	        ResultLog.ReportTestEvent("INFO","Test Execution Tme in Sec: "+seconds+ "  -------------------- Execution Time in mins:  "+TimeUnit.MILLISECONDS.toMinutes(elapsedTime));
//	        long id = Thread.currentThread().getId();
//	        System.out.println("After test-method  " + sTestID
//	                + ". Thread id is: " + id);
//	        extentReport.flush();
//	        //DBTestResultUpdate.UpdateTransactionIDInDB("participants",sTestID, "dealID",TestDataRec.TESTTRANSACTIONDATAMAP.get("TranID").toString());
//	    }
//	 
//	    @AfterTest
//	    public void afterTest() {
//	        long id = Thread.currentThread().getId();
//	        System.out.println("After test  " + sTestID + ". Thread id is: " + id);
//	    }
//		 
//}
