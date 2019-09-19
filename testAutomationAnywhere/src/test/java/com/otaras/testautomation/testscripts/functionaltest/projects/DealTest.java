package com.otaras.testautomation.testscripts.functionaltest.projects;
//package com.companyname.testautomation.testscripts.functionaltest.projects;
//
//import java.util.concurrent.TimeUnit;
//
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.bson.Document;
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
//import com.mongodb.DB;
//import com.mongodb.DBCollection;
//import com.mongodb.MongoClient;
//import com.mongodb.MongoClientURI;
//import com.mongodb.MongoCredential;
//import com.mongodb.ServerAddress;
//import com.mongodb.client.FindIterable;
//import com.mongodb.client.MongoCollection;
//import com.mongodb.client.MongoDatabase;
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
//public class DealTest {
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
//    	//static int testScenariosCount=0;
//
//    		static String testDataName="deal";
//    	
////    	 public Map getData(){
////    		 //Map<Object, Object> testDataOrig
////    		 return (TestDataRec.TESTTRANSACTIONDATAMAP);
////    	 }
//    	
//    	
//	    @Factory (dataProvider="dataProviderMethod")
//	    public DealTest(Map<Object, Object> map){
//	    	this.map=map;
//	        this.sTestID=map.get("testID").toString();
//	        this.sBrowserFromTestData=map.get("TestBrowser").toString();
//	    }
//
//	    @DataProvider//(parallel=true)
//	    public static Object[][] dataProviderMethod() throws Exception {
//	    	 HashMap<String, String> tableColumnNames=new HashMap<>();
//	      	ReadTestData.captureLoginEnvirnmentTestData();
//	      	//TestDataRec.TESTDATANAME="deal";
//		  	arrayListTestDataColumns=ReadTestData.readTestDataTableColumns(testDataName);
//		  	tableColumnNames=ReadTestData.mapTestDataTableColumns(arrayListTestDataColumns);
//	      	recordsetTestData=ReadTestData.readTestData(testDataName);
//	      	//TestDataRec.TEST_SCENARIOS_COUNT=recordsetTestData.getCount();
//	      	//testScenariosCount=recordsetTestData.getCount();
//	        int lastRowNum=recordsetTestData.getCount();//TestDataRec.TEST_SCENARIOS_COUNT;
//	        Object[][] obj = new Object[lastRowNum][1];
//	        TestDataRec.TESTDATACOLUMNSMAP=tableColumnNames;
//	      	obj=ReadTestData.mapAllTestData(recordsetTestData);
//	      	return obj;
//	    }
//
//	    		
//	    @Test
//	    public void testCase1() throws InterruptedException, Exception{
//	    	ResultLog.ReportTestEvent("INFO", "Execution Started Time: "+startTime);
//	        System.out.println("Test 1");  
//	       // System.out.println("URL fromlogin hash map - -"+TestDataRec.TESTDATALOGINMAP.get("url")); 
//	        
//	    //    TestDataRec.TESTTRANSACTIONDATAMAP=null;
//	    //    TestDataRec.TESTTRANSACTIONDATAMAP=map;
//	        //System.out.println("Test Data Used: " + TestDataRec.TESTTRANSACTIONDATAMAP);
//	        System.out.println("Test Data Used: " + map);
//	        //pages.InvokeApplicationPage.launchApplicationNEW();
//	        //testReport.log(Status.INFO, "<table><tr><th>DeviceName</th></tr><tr><td>OnePlus</td></tr></table");
////	        ResultLog.ReportTestEvent("INFO", "Page Name: "+TestDataRec.TESTTRANSACTIONDATAMAP.get("pageName").toString());
////	        ResultLog.ReportTestEvent("INFO", "WebElement Name: "+TestDataRec.TESTTRANSACTIONDATAMAP.get("webelementName").toString());
////	        ResultLog.ReportTestEvent("INFO", "Element ID: "+TestDataRec.TESTTRANSACTIONDATAMAP.get("elementValue").toString());
//	        ResultLog.ReportTestEvent("INFO", "Column Names: "+TestDataRec.TESTDATACOLUMNSMAP);
//	        ResultLog.ReportTestEvent("INFO", "Test Data: "+map);
////	        
//	        
//	        try{
//
//
//	        	
////	        	// UNCOMMENT FROM HERE - DB VALIDATION
////	        	// https://www.tutorialspoint.com/mongodb/mongodb_java.htm
////	        	// Creating a Mongo client 
//	        	MongoClient mongo = new MongoClient(new MongoClientURI("mongodb://admin:admin123@ds115931.mlab.com:15931/munivisorqa1"));
//	        	//MongoClient mongo = new MongoClient( "ds115931.mlab.com" , 15931 ); 
////	         
////	            // Creating Credentials 
//	            MongoCredential credential; 
//	            credential = MongoCredential.createCredential("admin", "munivisorqa1", 
//	               "admin123".toCharArray()); 
//            System.out.println("Connected to the database successfully");  
////	            
//////	            libraryDependencies +="com.github.scullxbones" %% "akka-persistence-mongo-casbah" % "2.0.3"
//////
//////	            		libraryDependencies += "org.mongodb" %% "casbah" % "3.1.1"
////	            
//	            // Accessing the database 
//	            MongoDatabase database = mongo.getDatabase("munivisorqa1"); 
//	            System.out.println("Credentials ::"+ credential);   
//	            
//////	          //Creating a collection 
//////	            database.createCollection("entities"); 
//////	            System.out.println("Collection created successfully"); 
////	            
////	         // Retieving a collection
//	            MongoCollection<Document> collection = database.getCollection("entities"); 
//	            System.out.println("Collection myCollection selected successfully"); 
////	            
////	            //collection.find();
////	            String collections = database.getName();
////              
////	            //TOMORROW - UI Validations >> API - finalize, OR, edge, understand entitlements
////	            
////	         // Getting the iterable object 
//	            FindIterable<Document> iterDoc = collection.find(); 
//	            int i = 1; 
////
////	            // Getting the iterator 
//	            Iterator it = iterDoc.iterator(); 
//	          
//	            while (it.hasNext()) {  
//	               System.out.println(it.next());  
//	            i++; 
//	            }
////	         // UNCOMMENT ABOVE - DB VALIDATION
//	        	
//	        	
//	        	
//	        	
//	        	
////	        	MongoCredential journaldevAuth = MongoCredential.createPlainCredential("admin", "munivisorqa1", "admin123".toCharArray());
////	        	MongoCredential testAuth = MongoCredential.createPlainCredential("admin", "test", "admin123".toCharArray());
////	        	List<MongoCredential> auths = new ArrayList<MongoCredential>();
////	        	auths.add(journaldevAuth);
////	        	auths.add(testAuth);
////
////	        	ServerAddress serverAddress = new ServerAddress("ds115931.mlab.com", 15931);
////	        	MongoClient mongo = new MongoClient(serverAddress, auths);
////	        	
////	        	//MongoCollection<Document> coll = mongo.getCollection("myTestCollection");
////	        	mongo.getDatabase("munivisorqa1");
////	            //dbCollectionList = getCollectionList(mongoDatabase);
//	        	
////	        	MongoClient mongoClient = new MongoClient();
////	        	DB database = mongoClient.getDB("myMongoDb");
////	        	boolean auth = database.authenticate("admin", "admin123".toCharArray());
//	        	
////	        	MongoClient mongo = new MongoClient( "ds115931.mlab.com" , 15931 );
////	        	DB database = mongo.getDB("munivisorqa1");
////	        	
//////	        	DB db = mongo.getDB("munivisorqa1");
////	        	MongoCredential credential = MongoCredential.createCredential("admin", "munivisorqa1", "admin123");
////	        	MongoClient mongoClient = new MongoClient(new ServerAddress(), Arrays.asList(credential));
//	        	
//	        	pages.InvokeApplicationPage.launchApplication();
//				  pages.InvokeApplicationPage.WaitForPage(pages.MainPage);
//				  pages.MainPage.clickLoginIcon();
//				  pages.MainPage.WaitForPage(pages.LoginPage);
//
//
////				  pages.LoginPage.enterPassword();
////				  pages.LoginPage.enterUsername();
////				  pages.LoginPage.clickSignIn();
//				  pages.LoginPage.loginToApplication();
//				  pages.LoginPage.WaitForPage(pages.HomePage);
////				  try{
//				  pages.MenuPage.clickUserDashboardMenu();
//				  pages.MenuPage.clickProjectsSubMenu();
//				  pages.MenuPage.WaitForPage(pages.DashboardPage);
//				  pages.DashboardPage.clickNewTransaction();
//				  
//				  
//				  BrowserUtil=new BrowserUtil(driver, testReport);
//				  BrowserUtil.SwitchToBrowserSecondTab();
//			
//				  pages.DashboardPage.WaitForPage(pages.NewTransactionPage);
//				  String sTranName=pages.NewTransactionPage.getTransactionName();
//				  pages.NewTransactionPage.testDataOrig=map;
//				  pages.NewTransactionPage.enterDealDetails(map);
//				  ResultLog.ReportTestEvent("INFO", "Screenshot before performing action on transaction");
//				  ResultLog.takeScreenShot();
//				  pages.NewTransactionPage.performAction(map.get("action").toString());
//				  ResultLog.ReportTestEvent("INFO", "Screenshot after performing action on transaction");
//
//				  
////				  WebElement wb = driver.findElement(By.xpath("//input[@name='rfpTranDateHired']"));
////				  JavascriptExecutor jse = (JavascriptExecutor)driver;
////				  jse.executeScript("arguments[0].click();", wb);
////				  jse.executeScript("arguments[0].value='10102000';", wb);
//				  //jse.executeScript("document.getElementByXpath('//input[@name='rfpTranDateHired']').value='10102000';");
//				  
//				  //driver.findElement(By.xpath("/html/body/div/div/div/div/div[1]/div/section/div/div/div[4]/div[1]/div/input")).sendKeys("10102000");
//				  
//				 
//				
//				  
//				  pages.MenuPage.clickUserDashboardMenu();
//				  pages.MenuPage.clickProjectsSubMenu();
//				  pages.MenuPage.WaitForPage(pages.DashboardPage);
//				  pages.DashboardPage.selectTransaction();
//				  pages.DashboardPage.WaitForPage(pages.DetailsPage);
//				  ResultLog.takeScreenShot();
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
//				  pages.MenuPage.clickNewMenu();
//				  pages.MenuPage.clickEntitySubMenu();
//				  pages.MenuPage.WaitForPage(pages.CreateEntitySelectionPage);
//				  pages.CreateEntitySelectionPage.SelectClient();
//				  //Thread.sleep(1000);
//				  //driver.navigate().refresh();
//				  pages.CreateEntitySelectionPage.WaitForPage(pages.ClientFirmPage);
//				 // pages.ClientFirmPage.selectFirmType();
////				  try {
////					    WebElement button = driver.findElement(By.xpath("//input[@name='issuerFlags']"));
////					            button.click();
////					}
////					catch(org.openqa.selenium.StaleElementReferenceException ex)
////					{
////					    WebElement button = driver.findElement(By.xpath("//input[@name='issuerFlags']"));
////					            button.click();
////					}
//				  //ResultLog.takeScreenShot();
//				  //Thread.sleep(500);
//				 //pages.ClientFirmPage.ClientFirm.click();
//				 
//				  pages.ClientFirmPage.SelectFirmName();
//				  //Thread.sleep(1000);
//				  ResultLog.takeScreenShot();
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
//				  testReport.log(Status.FAIL, "");
//				  if (testReport.getStatus().toString().equalsIgnoreCase("fail"))
//					  ResultLog.ReportTestEvent("FAIL", "TEST STATUS: "+ testReport.getStatus().toString());
//				  else
//					  ResultLog.ReportTestEvent("PASS", "TEST STATUS: "+ testReport.getStatus().toString());
//				  ResultLog.ReportTestEvent("INFO", "TEST ID: "+Thread.currentThread().getId()+ " TEST EXECUTION COMPLETE");
////				  if (Thread.activeCount()==1)
////				  {
//					  DBTestResultUpdate.UpdateTransactionIDInDB(testDataName,sTestID, "dealID","anil");
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
//				  DBTestResultUpdate.UpdateTransactionIDInDB(testDataName,sTestID, "dealID","Anil-e");
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
//		        extentReport=ExtentManager.CreateExtentReportExtent();
//		  	  	testReport=ExtentManager.CreateExtentReportTest(extentReport,testBrowserXML,className+"_"+sTestID);
//		  	  	initializeDriver=new InitializeDriver();
//		  	  	if (sDriverType.equalsIgnoreCase("remotedriver"))
//		  	  		driver=initializeDriver.initRemoteWebDriver(testBrowserXML);
//		  	  	else if (sDriverType.equalsIgnoreCase("webdriver"))
//		  	  		driver=initializeDriver.initWebDriver(testBrowserXML);
//		  	  	
//		  	  //	if (!ReadTestConfig.Get("COMMANDLINE.EXECUTION").toString().trim().equalsIgnoreCase("yes")){
//		        driverEvent = new EventFiringWebDriver(driver);
//				  eventListener = new webDriverEventListener(testReport);
//				  driverEvent.register(eventListener);
//				  this.driver=driverEvent;//}
//		  	  	
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
//	       // DBTestResultUpdate.UpdateTestResultInDB("deal", sTestID);
//	       // DBTestResultUpdate.UpdateTransactionIDInDBDelete("deal",sTestID, "dealID","anil");
////	        elapsedTime=(elapsedTime/1000)%60;
//	        System.out.println(elapsedTime);
//	        TestDataRec.TESTEXECUTIONTIME=seconds;
//	        ResultLog.ReportTestEvent("INFO","Test Execution Tme in Sec: "+seconds+ "  -------------------- Execution Time in mins:  "+TimeUnit.MILLISECONDS.toMinutes(elapsedTime));
//	        long id = Thread.currentThread().getId();
//	        System.out.println("After test-method  " + sTestID
//	                + ". Thread id is: " + id);
//	        extentReport.flush();
//	    }
//	 
//	    @AfterTest
//	    public void afterTest() {
//	        long id = Thread.currentThread().getId();
//	        System.out.println("After test  " + sTestID + ". Thread id is: " + id);
//	    }
//		 
//}
