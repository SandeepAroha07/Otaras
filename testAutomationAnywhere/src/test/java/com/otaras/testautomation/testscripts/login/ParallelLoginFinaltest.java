package com.otaras.testautomation.testscripts.login;
//package com.companyname.testautomation.testscripts.login;
//
//import java.util.concurrent.TimeUnit;
//
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Platform;
//import org.openqa.selenium.StaleElementReferenceException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.ie.InternetExplorerDriver;
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
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.*;
//import java.lang.reflect.Method;
//
////https://howtodoinjava.com/testng/testng-executing-parallel-tests/
//
//// AFTER ONE TEST DATA RUN, DRIVER HAS TO BE REINSTANTIATED. MOSTLY NEED TO REINSTANTIATE THROUGH dataprovider. Hence getting staleexception error. Need to see how to pass driver.
//// SECOND ROUND FAILS
////https://stackoverflow.com/questions/45510335/how-to-perform-parallel-cross-browser-testing-with-selenium-grid-testng-data-pro
////https://howtodoinjava.com/testng/testng-executing-parallel-tests/
////https://stackoverflow.com/questions/17724073/driver-behavior-executing-parallel-testng-selenium-tests-with-dataprovider?rq=1%201
//
//
////V-IMP
////https://stackoverflow.com/questions/2952170/testng-factories-and-dataproviders
//// Also https://groups.google.com/forum/#!msg/testng-users/n2vDf8gQj6w/AVpOEaQzEAAJ
//public class ParallelLoginFinaltest {
//
//	  //String testName = "";
//	  private WebDriver driver;
//	  private String sBrowser="";
//	  
//	  private String param="";
//	  private int param1;
//	  private String sName="";
//	  
////	  protected String host, username, password;
////	  protected HashMap<String, Object[][]> dataSet;
//	  
//	  private Collection<String> values;
//	    private String testName;
//	  
//	  
//	    private String campoDni;
//	    private String firstName;
//	    private String lastName;
//	    
//	    Map<Object, Object> map;
//	    private String sTestID="";
//    	static Recordset recordsetTestData;
//    	static ArrayList<String> arrayListTestDataColumns;
//    	
//    	private EventFiringWebDriver driverEvent;
//    	private webDriverEventListener eventListener;
//    	private ExtentReports extentReport;
//    	private ExtentTest testReport;
//    	private Pages pages;
//    	String sBrowserFromTestData="";
//    	ResultLog ResultLog;
//    	DBTestResultUpdate DBTestResultUpdate;
//    	private InitializeDriver initializeDriver;
//    	String sDriverType=ReadTestConfig.Get("DRIVER.TYPE");
//    	GuiValidation GuiValidation;
//    	long startTime;
//    	
//	    @Factory (dataProvider="dataProviderMethod")
//	    public ParallelLoginFinaltest(Map<Object, Object> map){
//	    	//TestDataRec.TESTTRANSACTIONDATAMAP=null;
//	    	this.map=map;
//	        this.sTestID=map.get("testID").toString();
//	        this.sBrowserFromTestData=map.get("TestBrowser").toString();
//	        //TestDataRec.TESTTRANSACTIONDATAMAP=map;
//	        
//
//	        
////	        this.firstName = firstName;
////	        this.lastName = lastName;
////	        System.out.println("data number"+campoDni);
//	    }
//
//	    @DataProvider
//	    public static Object[][] dataProviderMethod() throws Exception {
////	    	String sFname1="Bill";
////	    	String sLname1="Gates";
////	    	String sFname2="Stack";
////	    	String sLname2="Overflow";
//	      	ReadTestData.captureLoginEnvirnmentTestData();
//	      	
//	      	TestDataRec.TESTDATANAME="objectrepository";
//		  	arrayListTestDataColumns=ReadTestData.readTestDataTableColumns("objectrepository");
//			ReadTestData.mapTestDataTableColumns(arrayListTestDataColumns);
//	      	recordsetTestData=ReadTestData.readTestData(TestDataRec.TESTDATANAME);
//	         int lastRowNum=TestDataRec.TEST_SCENARIOS_COUNT;
//	         Object[][] obj = new Object[lastRowNum][1];
//	      	obj=ReadTestData.mapAllTestData(recordsetTestData);
//	      	
//	      	return obj;
////	      	 File file = new File("C://apps//AnilK.xlsx");
////			    FileInputStream fis = new FileInputStream(file);
////
////			    XSSFWorkbook wb = new XSSFWorkbook(fis);
////			    XSSFSheet sheet = wb.getSheetAt(0);
////			    wb.close();
////			    int lastRowNum = sheet.getLastRowNum() ;
////			    int lastCellNum = sheet.getRow(0).getLastCellNum();
////			    Object[][] obj = new Object[lastRowNum][1];
////
////			    for (int i = 0; i < lastRowNum; i++) {
////			      Map<Object, Object> datamap = new HashMap<>();
////			      for (int j = 0; j < lastCellNum; j++) {
////			        datamap.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i+1).getCell(j).toString());
////			      }
////			      obj[i][0] = datamap;
////
////			    }
////			return obj;
//	        //return new Object[][] { {"000007", sFname1, sLname1}, {"000008", sFname2, sLname2} };
//	    }
////	    
////	    Get Test ID in scope and store in data provider.
////	    In test method, using test id - get all remaining data and use in test.
////	    https://stackoverflow.com/questions/22915267/testng-using-factory-and-dataprovider
////	    	https://groups.google.com/forum/#!msg/testng-users/n2vDf8gQj6w/AVpOEaQzEAAJ
//	    		
//	    @Test
//	    public void testCase1() throws InterruptedException, Exception{
//	    	
//
//	    	ResultLog.ReportTestEvent("INFO", "Execution Started Time: "+startTime);
//	        System.out.println("Test 1");  
//	        System.out.println("URL fromlogin hash map - -"+TestDataRec.TESTDATALOGINMAP.get("url")); 
//	        TestDataRec.TESTTRANSACTIONDATAMAP=null;
//	        TestDataRec.TESTTRANSACTIONDATAMAP=map;
//	        //System.out.println("testMethod parameter value is: " + map);
//	        System.out.println("Test Data Used: " + TestDataRec.TESTTRANSACTIONDATAMAP);
//	        //pages.InvokeApplicationPage.launchApplicationNEW();
//	        //testReport.log(Status.INFO, "<table><tr><th>DeviceName</th></tr><tr><td>OnePlus</td></tr></table");
//	        ResultLog.ReportTestEvent("INFO", "Page Name: "+TestDataRec.TESTTRANSACTIONDATAMAP.get("pageName").toString());
//	        ResultLog.ReportTestEvent("INFO", "WebElement Name: "+TestDataRec.TESTTRANSACTIONDATAMAP.get("webelementName").toString());
//	        ResultLog.ReportTestEvent("INFO", "Element ID: "+TestDataRec.TESTTRANSACTIONDATAMAP.get("elementValue").toString());
//	        ResultLog.ReportTestEvent("INFO", "Test Data: "+TestDataRec.TESTTRANSACTIONDATAMAP);
//	        
//	        //driver.get("http://www.store.demoqa.com");
//	   	 
////	        driver.findElement(By.xpath(".//*[@id='account']/a")).click();
//// 	 
////	   	      driver.findElement(By.id("log")).sendKeys(sTestID+map.get("pageName").toString());
////	   	      Thread.sleep(500);
////	   	      driver.findElement(By.id("pwd")).sendKeys(map.get("pageName").toString());
//	        
//	        try{
//	        pages.InvokeApplicationPage.launchApplication();
//			  pages.InvokeApplicationPage.WaitForPage(pages.HomePage);
//	        
//	        //pages.InvokeApplicationPage.commonlaunchApplication();
//			 // pages.InvokeApplicationPage.WaitForPage(pages.HomePage);
//			  pages.HomePage.clickSignIn();
//			  ResultLog.takeScreenShot();
//			  
//			  if (sTestID.toString().equalsIgnoreCase("sampleTest004"))
//			    	throw new NullPointerException("Manually throws execption");
//			  
//			  if (sTestID.toString().equalsIgnoreCase("sampleTest003"))
//			    	driver.findElement(By.xpath("iii")).click();
//			  
//			  pages.HomePage.WaitForPage(pages.LoginPage);
//			  pages.LoginPage.enter_newCustemailAddres();
//			  pages.LoginPage.enter_password();
//			  pages.LoginPage.clickHome();
//			  pages.LoginPage.WaitForPage(pages.HomePage);
//			  pages.HomePage.clickSignIn();
//			  pages.LoginPage.clickHome();
//			  pages.LoginPage.WaitForPage(pages.HomePage);
//			  GuiValidation.SampleUITestValidation();
//	        
//	   	   //Thread.sleep(500);
//	   	   ResultLog.ReportTestEvent("PASS", "Test Passed");
//	   	ResultLog.ReportTestEvent("INFO", "TEST EXECUTION COMPLETE");
//	   	//extentReport.flush();
//	   	   driver.quit();
//	        }
//			  catch (Exception e)
//			  {
//				
//				  //ResultLog.PostTestStatus(e);
//				  ResultLog.ReportTestEvent("FATAL","Entered Test 'Exception' Block");
//				  //extentReport.flush();
//				  ResultLog.ReportTestEvent("FATAL", "Test Failed: "+e);
//				  ResultLog.ReportTestEvent("INFO", "TEST EXECUTION COMPLETE");
//				  driver.quit();
//				throw new NullPointerException("********Manually throws execption********");
//				  //testBrowserXML="";
//				  //TestDataRec.TESTBROWSERNAME="";
//			  }
//	    }
//	    
//		 
//		   @BeforeClass
//		    @Parameters({ "testBrowserXML" })
//		    public void beforeClass(String testBrowserXML) throws Exception {
//		    	startTime = System.currentTimeMillis();
//		        long id = Thread.currentThread().getId();
//		        System.out.println("Before test-class " + testName + ". Thread id is: "
//		                + id);
//		        if (testBrowserXML.equalsIgnoreCase("skip"))
//		        	testBrowserXML=sBrowserFromTestData;
//		        //Thread.sleep(100);
//		        extentReport=ExtentManager.CreateExtentReportExtent();
//		  	  testReport=ExtentManager.CreateExtentReportTest(extentReport,testBrowserXML,sTestID);
//		      //  driver=initWebDriver(testBrowserXML);
//		  	initializeDriver=new InitializeDriver();
//		  	if (sDriverType.equalsIgnoreCase("remotedriver"))
//		  		driver=initializeDriver.initRemoteWebDriver(testBrowserXML);
//		  	else if (sDriverType.equalsIgnoreCase("webdriver"))
//		  		driver=initializeDriver.initWebDriver(testBrowserXML);
//		        pages=new Pages(driver,testReport);
//		        ResultLog=new ResultLog(driver,testReport);
//				  DBTestResultUpdate=new DBTestResultUpdate(driver,testReport);
//				  GuiValidation=new GuiValidation(driver,testReport);
//				  GuiValidation.ResultLog=ResultLog;
//			        ResultLog.ReportTestEvent("INFO", "Test Browser: "+testBrowserXML);
//			        ResultLog.ReportTestEvent("INFO", "Test ID: "+sTestID);
////		        driverEvent = new EventFiringWebDriver(driver);
////				  eventListener = new WebDriverEventListener(driver,testReport);
////				  //testListener=new TestListener(testReport);
////				  driverEvent.register(eventListener);
////				  //this.driver=driverEvent;
////				  driverEvent.get("http://www.store.demoqa.com");
//		    }
//	    
////	    //https://groups.google.com/forum/#!msg/testng-users/n2vDf8gQj6w/AVpOEaQzEAAJ
////	    @Test (dataProvider = "insideDp")
////	    public void testMethod(String eachValue) throws InterruptedException {
////	        Reporter.log(testName + " has its value was " + eachValue, true);
////	        
////	        System.out.println("testMethod parameter value is: " + param);
////		      driver.get("http://www.store.demoqa.com");
////	   	 
//// 	      driver.findElement(By.xpath(".//*[@id='account']/a")).click();
//// 	 
////	   	      driver.findElement(By.id("log")).sendKeys(eachValue);
////	   	      Thread.sleep(500);
////	   	      driver.findElement(By.id("pwd")).sendKeys(eachValue);
////	   	   Thread.sleep(500);
////	   	   driver.quit();
////	    }
////
////	    @DataProvider (name = "insideDp")
////	    public Object[][] getMoreData() {
////	        Object[][] testData = new Object[values.size()][1];
////	        int i = 0;
////	        for (String eachValue : values) {
////	            testData[i++][0] = eachValue;
////	        }
////	        return testData;
////	    }
////
////	    @Factory (dataProvider = "dp")
////	    public ParallelLoginFinaltest(String testName, Collection<String> values) {
////	        this.values = values;
////	        this.testName = testName;
////	    }
////
////	    @DataProvider (name = "dp")
////	    public static Object[][] getData() {
////	        Map<String, String> object1 = new HashMap<>();
////	        object1.put("height", "5.5 ft");
////	        object1.put("weight", "45 kgs");
////
////	        Map<String, String> object2 = new HashMap<>();
////	        object2.put("age", "2");
////	        object2.put("weight", "45 kgs");
////
////	        Map<String, String> object3 = new HashMap<>();
////	        object3.put("color", "brown");
////	        object3.put("orientation", "portrait");
////
////	        return new Object[][] {
////	            {"object1", object1.values()},
////	            {"object2", object2.values()},
////	            {"object3", object3.values()}
////	        };
////	    }
//	  
//	    
//	    @DataProvider(name = "data")
//		  public Object[][] dataSupplier() throws Exception {
//			 //return data;
//				ArrayList<String> arrayListTestDataColumns;
//				Recordset recordsetTestData;
//				ReadTestData.captureLoginEnvirnmentTestData();
//				
//				TestDataRec.TESTDATANAME="objectrepository";
//			  	//ReadTestData.captureLoginEnvirnmentTestData();
//			  	arrayListTestDataColumns=ReadTestData.readTestDataTableColumns("objectrepository");
//				ReadTestData.mapTestDataTableColumns(arrayListTestDataColumns);
//				recordsetTestData=ReadTestData.readTestData(TestDataRec.TESTDATANAME);
//				 ReadTestData.mapTestData(recordsetTestData);
//				 
//				 //https://automationtalks.com/2017/11/03/map-hashmap-testng-dataprovider/
//				 File file = new File("C://apps//AnilK.xlsx");
//				    FileInputStream fis = new FileInputStream(file);
//
//				    XSSFWorkbook wb = new XSSFWorkbook(fis);
//				    XSSFSheet sheet = wb.getSheetAt(0);
//				    wb.close();
//				    int lastRowNum = sheet.getLastRowNum() ;
//				    int lastCellNum = sheet.getRow(0).getLastCellNum();
//				    Object[][] obj = new Object[lastRowNum][1];
//
//				    for (int i = 0; i < lastRowNum; i++) {
//				      Map<Object, Object> datamap = new HashMap<>();
//				      for (int j = 0; j < lastCellNum; j++) {
//				        datamap.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i+1).getCell(j).toString());
//				      }
//				      obj[i][0] = datamap;
//
//				    }
//				 
//				    return  obj;
//				 
//				 
////				 Object[][] obj = new Object[lastRowNum][1];
////				 for (int i = 0; i < lastRowNum; i++) {
////				      Map<Object, Object> datamap = new HashMap<>();
////				      for (int j = 0; j < lastCellNum; j++) {
////				        //datamap.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i+1).getCell(j).toString());
////				    	  datamap.put("Anil","Anil");
////				      }
////				      obj[i][0] = datamap;
//	//
////				    }
////				    return  obj;
//		 }
//	  
////	  public ParallelLoginFinaltest(String host, String username, String password, HashMap<String, Object[][]> dataSet) {
////		    this.host = host;
////		    this.username = username;
////		    this.password = password;
////		    this.dataSet = dataSet;
////		  }
////	  
////	  @DataProvider(name="dataSet")
////	  public Object[][] dataSet() {
////		  Object data[][] = new Object[2][3];
////		  data[0][0] = "firefox";
////		  data[0][1] = "FirstName1";
////		  data[0][2] = "LastName1";
////		  
////		  data[1][0] = "chrome";
////		  data[1][1] = "FirstName2";
////		  data[1][2] = "LastName2";
////		  return data;
////	    //return dataSet.get(m.getName());
////	  }
////	  
////	  @Test(dataProvider="dataSet")
////	  public void searchRoster(String searchTerm, String playerName) {
////	    System.out.println("Searching for " + searchTerm);
////	    System.out.println("I found " + playerName + " in the search results!");
////	  }
//	  
//	  //https://howtodoinjava.com/testng/testng-factory-annotation-tutorial/
//	  
////		 @Factory(dataProvider = "dataMethod")
////		    public ParallelLoginFinaltest(int param1, String sName) {
////		        this.param1 = param1;
////		        this.sName=sName;
////		    }
////		 
////		 @DataProvider
////		    public static Object[][] dataMethod() {
////		        return new Object[][] { { 0,"Anil" }, { 1,"Kumar" } };
////		    }
////		 
//		 
////		 data[0][0] = "firefox";
////		  data[0][1] = "FirstName1";
////		  data[0][2] = "LastName1";
//	
////		 
////		 @Test
////		    public void testMethodOne() throws InterruptedException {
////		        int opValue = param1 + 1;
////		        System.out.println("Test method one output: " + opValue);
////		        
////		        System.out.println("testMethod parameter value is: " + param);
////			      driver.get("http://www.store.demoqa.com");
////		   	 
////	   	      driver.findElement(By.xpath(".//*[@id='account']/a")).click();
////	   	 
////		   	      driver.findElement(By.id("log")).sendKeys(""+opValue+""+sName);
////		   	      Thread.sleep(500);
////		   	      driver.findElement(By.id("pwd")).sendKeys(sName);
////		   	   Thread.sleep(500);
////		   	   driver.quit();
////		        
////		        
////		    }
//		 
//		 
//	  
////	  public ParallelLoginFinaltest(Map<Object, Object> map) {
////	        this.param = param;
////	    }
//
////	    @BeforeTest(alwaysRun = true)
//////	    @Parameters({ "test-name","testBrowserXML" })
////	    public void beforeTest(String testName) throws Exception {
////	        this.testName = testName;
////	        long id = Thread.currentThread().getId();
////	        System.out.println("Before test " + testName + ". Thread id is: " + id);
////	      //  driver=initWebDriver(testBrowserXML);
////	        
////	    }
//	 
//	 
//	 
//	    
////	    @Test(dataProvider = "getNames")
////		 public void testMethodOne(String browser, String fName, String lName) throws Exception {
////	    //public void testMethodOne() {
////	        long id = Thread.currentThread().getId();
////	        System.out.println("Sample test-method " + testName
////	                + ". Thread id is: " + id);
////	        //this.beforeTest();
////		      driver.get("http://www.store.demoqa.com");
////	   	 
////	   	      driver.findElement(By.xpath(".//*[@id='account']/a")).click();
////	   	 
////	   	      driver.findElement(By.id("log")).sendKeys("Anil");
////	   	 
////	   	      driver.findElement(By.id("pwd")).sendKeys("Kumar");
////	   	 
////	   	      driver.findElement(By.id("login")).click();
////	   	      //driver.navigate().refresh();
////	   	      driver.quit();
////	    }
//	    
////	    @Test
////	    public void testMethod() throws InterruptedException {
////	        System.out.println("testMethod parameter value is: " + param);
////		      driver.get("http://www.store.demoqa.com");
////	   	 
////   	      driver.findElement(By.xpath(".//*[@id='account']/a")).click();
////   	 
////	   	      driver.findElement(By.id("log")).sendKeys(param);
////	   	      Thread.sleep(500);
////	   	      driver.findElement(By.id("pwd")).sendKeys("Kumar");
////	   	   driver.quit();
////	    }
//	 
//	    @AfterClass
//	    public void afterClass() {
//	    	long stopTime = System.currentTimeMillis();
//	        long elapsedTime = stopTime - startTime;
//	        long seconds = TimeUnit.MILLISECONDS.toSeconds(elapsedTime);
////	        elapsedTime=(elapsedTime/1000)%60;
//	        System.out.println(elapsedTime);
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
//	        //driver.quit();
//	    }
//
//	    public WebDriver initWebDriver(String browser) throws Exception
//		 {
//			 //Initialize DesiredCapabilities null.
//			  DesiredCapabilities cap = null;
//
//			 if (browser.equals("firefox")) {
//				   //Set firefox browser capabilities for windows platform.
//				   cap = DesiredCapabilities.firefox();
//				   cap.setBrowserName("firefox");
//				   cap.setPlatform(Platform.WINDOWS);
//				  } else if (browser.equals("chrome")) {
//				   //Set chrome browser capabilities for windows platform.
//				   cap = DesiredCapabilities.chrome();
//				   cap.setBrowserName("chrome");
//				   cap.setPlatform(Platform.WINDOWS);
//				  } else if (browser.equals("iexplore")) {
//				   //Set IE browser capabilities for windows platform.
//					  	WebDriverManager.iedriver().setup();
//					  	DesiredCapabilities dcie = DesiredCapabilities.internetExplorer();
//						dcie.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);							
//						driver = new InternetExplorerDriver(dcie);
//						driver.manage().window().maximize();
////					  
////					  
////				   cap = DesiredCapabilities.internetExplorer();
////				   cap.setBrowserName("internet explorer");
////				   cap.setPlatform(Platform.WINDOWS);
//				  }
//			  
//			  RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
//			  driver.manage().window().maximize();
//			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			 return(driver);
//		 }
//	    
//	    
//	    
//		 //Created @DataProvider annotation method to supply data(browser name, First Name and Last Name) for test
//		 @DataProvider(parallel=true)
//		 //@Factory
//		 public Object[][] getNames1(){
//		  Object data[][] = new Object[2][3];
//		  data[0][0] = "firefox";
//		  data[0][1] = "FirstName1";
//		  data[0][2] = "LastName1";
//		  
//		  data[1][0] = "chrome";
//		  data[1][1] = "FirstName2";
//		  data[1][2] = "LastName2";
//		  
////		  data[2][0] = "chrome";
////		  data[2][1] = "FirstName4";
////		  data[2][2] = "LastName4";  
//		  
////		  data[3][0] = "iexplore";
////		  data[3][1] = "FirstName3";
////		  data[3][2] = "LastName3";  
//		  
//		  return data;
//		  //driver=initWebDriver();
//		 } 
//		 
//		 
//	
//	    
////		 
////		 public class SimpleTestFactory
////		 {
////		     @Factory
////		     public Object[] factoryMethod() {
////		         return new Object[] {
////		                                 new paralleltestSkeleton("one"),
////		                                 new paralleltestSkeleton("two")
////		                             };
////		     }
////		 }
//		 
////		 public class SimpleTestFactory
////		 {
////		     
//////		     public Object[] factoryMethod() {
//////		         return new Object[] {
//////		                                 new ParallelLoginFinaltest("one"),
//////		                                 new ParallelLoginFinaltest("two"),
//////		                                 new ParallelLoginFinaltest("three")
//////		                             };
//////		     }
////		     
//////			 @Factory
//////		     public Object[][] getNames(){
//////				  Object data[][] = new Object[2][3];
//////				  data[0][0] = "firefox";
//////				  data[0][1] = "FirstName1";
//////				  data[0][2] = "LastName1";
//////				  
//////				  data[1][0] = "chrome";
//////				  data[1][1] = "FirstName2";
//////				  data[1][2] = "LastName2";
//////				  
////////				  data[2][0] = "chrome";
////////				  data[2][1] = "FirstName4";
////////				  data[2][2] = "LastName4";  
//////				  
////////				  data[3][0] = "iexplore";
////////				  data[3][1] = "FirstName3";
////////				  data[3][2] = "LastName3";  
////				  
////				  
////				  @Factory
////				    public Object[] factoryMethod() {
////				        return new Object[] { new ParallelLoginFinaltest(0), new ParallelLoginFinaltest(1) };
////				    }
////				  
////				  
//////				  return data{
//////					  	new ParallelLoginFinaltest(data[0][0],data[0][1],data[0][2])
//////				  	};
//////				  //driver=initWebDriver();
//////				 } 
////		     
////		 }
//		 
//}
