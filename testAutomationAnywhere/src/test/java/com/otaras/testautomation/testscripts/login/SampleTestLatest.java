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
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.DataProvider;
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
//
////http://toolsqa.com/selenium-webdriver/testng-parameters-data-provider/
////http://www.techbeamers.com/testng-parameters-and-dataprovider-annotations/
//
//
//// FOR GRID - TAKE A COPY OF SAMPELORIG and Initilaize pages/driver in test method by passing from dataprovider and argument to test method - check with developer how to pass driver instance from dataprovider to test
////https://stackoverflow.com/questions/17724073/driver-behavior-executing-parallel-testng-selenium-tests-with-dataprovider?rq=1
////https://stackoverflow.com/questions/45510335/how-to-perform-parallel-cross-browser-testing-with-selenium-grid-testng-data-pro
//
//
//public class SampleTestLatest {
//
//	private InitializeDriver initializeDriver;
//	private WebDriver driver;
//	private EventFiringWebDriver driverEvent;
//	private webDriverEventListener eventListener;
//	public static ExtentReports extentReport;
//	public ExtentTest testReport;
//	private ExtentTest childtestReport;
//	
//	private Pages pages;
//	private ResultLog ResultLog;
//	DBTestResultUpdate DBTestResultUpdate;
//	public String exceptiontriggered="";
//	public String sBrowserName="";
//	GuiValidation GuiValidation;
//	final boolean parallFlag=false;
//	//public String testBrowserXML="";
//	//private String sBrowerName="chrome";
//	 // https://automationtalks.com/2017/11/03/map-hashmap-testng-dataprovider/
//		//  https://testingtechhunt.wordpress.com/2016/05/23/passing-hashmap-in-data-provider-fetching-from-excel-sheet/
//			
//	
//	 //Used dataProvider parameter to get data from @DataProvider annotation method.
//	 //Can accept object array data(browser name, First Name and Last Name) from getNames method.
//	
//	 @Parameters({ "testBrowserXML" })
//	 @BeforeTest(alwaysRun = true)
//	 public void setup(String testBrowserXML) throws Exception
//	 {
//		  extentReport=ExtentManager.CreateExtentReportExtent();
//	//	  testReport=ExtentManager.CreateExtentReportTest(extentReport,testBrowserXML); 
////		  extentReport.setSystemInfo("Host Name", "SoftwareTestingMaterial");
////		  extentReport.setSystemInfo("Environment", "Automation Testing");
////		  extentReport.setSystemInfo("User Name", "Rajkumar SM");
//		  
//		  //https://www.softwaretestingmaterial.com/generate-extent-reports-version-3/
////		  ExtentManager.htmlReporter.config().setDocumentTitle("Title of the Report Comes here");
////		  htmlReporter.config().setReportName("Name of the Report Comes here");
////		  htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
////		  htmlReporter.config().setTheme(Theme.STANDARD);
//		  
//		  
//		  sBrowserName=testBrowserXML;
////		  if (exceptiontriggered.equalsIgnoreCase("yes")||exceptiontriggered.equalsIgnoreCase(""))
////		  {
//		  driver=initWebDriver(testBrowserXML);
//		  pages=new Pages(driver,testReport);
//		  pages.CommonBusinessComponentPage.pages=pages;
//		  ResultLog=new ResultLog(driver,testReport);
//		  DBTestResultUpdate=new DBTestResultUpdate(driver,testReport);
//		   GuiValidation=new GuiValidation(driver,testReport);
//		   GuiValidation.pages=pages;
//		   GuiValidation.ResultLog=ResultLog;
//		  // Thread.sleep(1000);
//		  // driver.get("http://automationpractice.com/index.php");
//		   //System.out.println("BROWSER INVOKED");
//		  // Thread.sleep(1000);
////		  ResultLog.ReportTestEvent("INFO", "TEST STARTED");
////		  ResultLog.ReportTestEvent("INFO", "DRIVER INITIALIZED");
////		  ResultLog.takeScreenShot();
//	//	  }
//		//  eventListener.testReport=testReport;
//		  
//		  //initializeDriver=new InitializeDriver();
//		  //InitializeTestDriver.SetTestBrowser(testBrowserFromXML);
//		  //this.driver=initializeDriver.initializeDriver();
////		  driverEvent = new EventFiringWebDriver(driver);
////		  eventListener = new WebDriverEventListener(testReport);
////		  //testListener=new TestListener(testReport);
////		  driverEvent.register(eventListener);
////		  this.driver=driverEvent;
//		
//		  
//		  
//	 }
//	
////	 Before test and after test only once if no issue/exception.
////	 Otherwise automatically goes to beforetest and aftertest
//
//	//@Parameters({ "testBrowserXML" })
//	 @Test(dataProvider = "data", alwaysRun=true)
//	 public void gmailLogin(Map<Object, Object> map)  {
//	  try{
//		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		  //extentReport=ExtentManager.CreateExtentReportExtent();
//		  testReport=ExtentManager.CreateExtentReportTest(extentReport,map.get("UserName")+sBrowserName); 
//		  //pages=new Pages(driver,testReport);
//		  //ResultLog.testReport=testReport;
//		  //pages.CommonBusinessComponentPage.testReport=testReport;
//		  //pages=new Pages(driver,testReport);
//		  //WORKING CODE COMMENTED AS I CHANGED testReport from static to non static in common java class - Common.testReport=testReport; - change to statis in common to work. But it will fail other places.
//		  ResultLog.ReportTestEvent("INFO", "Main Test -- "+ sBrowserName);
////		  childtestReport=testReport.createNode(map.get("UserName").toString());
////		  ResultLog.testReport=childtestReport;
//		
//	 
//			// test with snapshot
//		  testReport.addScreenCaptureFromPath("screenshot.png");
//		   String[][] data = new String[2][2];
//		    data[0][0] = "Field 1";
//		    data[0][1] = "Field 2";
//		    data[1][0] = "data1";
//		    data[1][1] = "data2";
//			  Markup m = MarkupHelper.createTable(data);
//			  testReport.info(m);
//
//		  //ReadTestData.captureLoginEnvirnmentTestData();
//		  //System.out.println(map.get("BrowserName"));
//		  //String BrowserName=TestDataRec.TESTDATAMAP.get("TestBrowser").trim();//TestDataRec.TESTDATALOGINMAP.get("url");
//		
//		  //driver.get(TestDataRec.TESTDATALOGINMAP.get("url"));
//		 // Thread.sleep(500);
//		  System.out.println("-------------Test case started ----------------");
//		    //System.out.println(map.get("testCaseID"));
//		    System.out.println(map.get("UserName"));
//		    
//		    System.out.println(map.get("Password"));
//		    System.out.println(map.get("DOB"));
//		  //  Thread.sleep(6000);
//		    //driver.get(TestDataRec.TESTDATALOGINMAP.get("url"));
////		    Thread.sleep(2000);
////		    driver.navigate().refresh();
//////			  Thread.sleep(1000);
////		  driver.findElement(By.xpath("//a[@class='login']")).click();
////		  
//////		  Thread.sleep(1000);
//////		  driver.navigate().refresh();
//////		  Thread.sleep(1000);
//////		  for (int i=0;i<=2;i++){
////		  try{
////		  driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys(map.get("UserName").toString()+sBrowserName);
////		  }catch(Exception e){
////			  ResultLog.ReportTestEvent("INFO","Exception: "+e);
////		  }
////	//  }
////		  Thread.sleep(2000);
////
////		  
////		  ResultLog.takeScreenShot();
//////		  Thread.sleep(10000);
//////		  driver.navigate().refresh();
////		  Thread.sleep(10000);
////		  try{
////		  driver.findElement(By.xpath("//img[@alt='My Store']")).click();
////		  }catch(Exception e){
////			  ResultLog.ReportTestEvent("INFO","Exception: "+e);
////		  }
////		   // pages.InvokeApplicationPage.launchApplication();
////		//    Thread.sleep(6000);
////		    ResultLog.takeScreenShot();
//		    pages.InvokeApplicationPage.launchApplication();
//		  //  driver.navigate().refresh();
//			  pages.InvokeApplicationPage.WaitForPage(pages.HomePage);
//			  
//			 // GuiValidation.UITestValidation();
//		  //  Thread.sleep(2000);
//		    //pages.InvokeApplicationPage.commonlaunchApplication();
//		//    Thread.sleep(4000);
////			  pages.InvokeApplicationPage.WaitForPage(pages.HomePage);
////			  Thread.sleep(4000);
//			//  driver.navigate().refresh();
//			 // Thread.sleep(6000);
//			  pages.HomePage.clickSignIn();
////			  try {
////				    WebElement button = driver.findElement(By.xpath("//a[@class='login']"));
////				            button.click();
////				}
////				catch(org.openqa.selenium.StaleElementReferenceException ex)
////				{
////				    WebElement button = driver.findElement(By.xpath("//a[@class='login']"));
////				            button.click();
////				}
//			  
////		    List<WebElement> buttons = driver.findElements(By.xpath("//a"));
////		    for (WebElement b : buttons) {
////		        if (b.getText().contains("Contact"))
////		        		{
////		           
////		            WebDriverWait wait = new WebDriverWait(this.driver, 2000);
////		    		wait.until(ExpectedConditions.elementToBeClickable(b)); 
////		    		 b.click();
////					  Thread.sleep(5000);
////		            break;
////		        }}
//			  
//		    
////		    int count = 0;
////		    boolean clicked = false;
////		    while (count < 4 || !clicked){
////		        try {
////		           WebElement yourSlipperyElement= driver.findElement(By.tagName("//a"));
////		           yourSlipperyElement.click(); 
////		           clicked = true;
////		         } catch (StaleElementReferenceException e){
////		           e.toString();
////		           System.out.println("Trying to recover from a stale element :" + e.getMessage());
////		           count = count+1;
////		         }     
////		    }
//			  
////			  driver.get("http://only-testing-blog.blogspot.in/2014/05/form.html");
////			  Thread.sleep(500);
////			  driver.findElement(By.name("FirstName")).sendKeys("Anil");
////			  Thread.sleep(500);
////			  driver.findElement(By.name("LastName")).sendKeys("Kumar");
//
//			//  driver.quit();
//		    
//		    //self.driver.execute_script("$(\"li:contains('Narendra')\").click()");
//			  //driver.navigate().refresh();
////			  Thread.sleep(1000);
//////			  ResultLog.takeScreenShot();
//			//  Thread.sleep(5000);
//			  pages.HomePage.WaitForPage(pages.LoginPage);
//			//  Thread.sleep(3000);
//			  pages.LoginPage.enter_newCustemailAddres();
////			  Thread.sleep(3000);
//			  pages.LoginPage.enter_password();
////			  Thread.sleep(3000);
//			    ResultLog.takeScreenShot();
//			  pages.LoginPage.clickHome();
//			  pages.LoginPage.WaitForPage(pages.HomePage);
//			  pages.HomePage.clickSignIn();
//		    
//			//  Thread.sleep(1000);
//		    //ResultLog.takeScreenShot();
//		    //driver.get("http://www.store.demoqa.com");
//		 //   Thread.sleep(500);
//		    ResultLog.ReportTestEvent("INFO","HELLO");
//			// log with snapshot
//			//  testReport.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
//		    ResultLog.ReportTestEvent("INFO", "Browser Launched - next step exception");
//		    ResultLog.takeScreenShot();
//		    Reporter.log("Test");
//		   // driver.findElement(By.xpath("Anil")).click();
//		    exceptiontriggered="no";
//		   // ResultLog.ReportTestEvent("PASS", MarkupHelper.createLabel("Test Case Status is passed", ExtentColor.GREEN));
//		    if (map.get("UserName").toString().equalsIgnoreCase("user2"))
//		    	throw new NullPointerException("Manually throws execption");
//		    Reporter.log("Test performed: "+map.get("UserName").toString());
//	  }catch(Exception e){
//		  System.out.println("Exception Found");
//		  ResultLog.ReportTestEvent("FATAL", "Test Failed: "+e);
//		  Reporter.log("Test performed: "+map.get("UserName").toString());
//		  //throw new NullPointerException("********Manually throws execption********");
//		 
//	  }
//	  extentReport.flush();
//		//extentReport.flush();
//	  //GOOD ONE
//	  //http://www.software-testing-tutorials-automation.com/2016/03/selenium-grid-2-using-dataprovider-to.html
//		  
//	  
//	  //Initialize browser driver as per data received from getNames().
////		  driver=initWebDriver(browser);
////
////	  //Initialize RemoteWebDriver on grid 2 node with browser capability.
////	
////	  //Open URL in requested browsers of node and execute test steps.
////	  driver.get("http://only-testing-blog.blogspot.in/2014/05/form.html");
////	  Thread.sleep(500);
////	  driver.findElement(By.name("FirstNames")).sendKeys(fName);
////	  Thread.sleep(500);
////	  driver.findElement(By.name("LastName")).sendKeys(lName);
//
//	//  driver.quit();
//	 }
//	 
//	 //VERY IMPORTANT
//	 //http://www.software-testing-tutorials-automation.com/2016/03/selenium-grid-2-using-dataprovider-to.html
//	//https://automationtalks.com/2017/11/03/map-hashmap-testng-dataprovider/
//	 //http://www.software-testing-tutorials-automation.com/2016/03/how-to-use-selenium-grid-2-to-run.html
//	 //Created @DataProvider annotation method to supply data(browser name, First Name and Last Name) for test
//	 @DataProvider(name = "data",parallel=parallFlag)
//	  public Object[][] dataSupplier() throws Exception {
//		 //return data;
//			ArrayList<String> arrayListTestDataColumns;
//			Recordset recordsetTestData;
//			ReadTestData.captureLoginEnvirnmentTestData();
//			
//			TestDataRec.TESTDATANAME="objectrepository";
//		  	//ReadTestData.captureLoginEnvirnmentTestData();
//		  	arrayListTestDataColumns=ReadTestData.readTestDataTableColumns("objectrepository");
//			ReadTestData.mapTestDataTableColumns(arrayListTestDataColumns);
//			recordsetTestData=ReadTestData.readTestData(TestDataRec.TESTDATANAME);
//			 ReadTestData.mapTestData(recordsetTestData);
//			 
//			 //https://automationtalks.com/2017/11/03/map-hashmap-testng-dataprovider/
//			 File file = new File("C://apps//AnilK.xlsx");
//			    FileInputStream fis = new FileInputStream(file);
//
//			    XSSFWorkbook wb = new XSSFWorkbook(fis);
//			    XSSFSheet sheet = wb.getSheetAt(0);
//			    wb.close();
//			    int lastRowNum = sheet.getLastRowNum() ;
//			    int lastCellNum = sheet.getRow(0).getLastCellNum();
//			    Object[][] obj = new Object[lastRowNum][1];
//
//			    for (int i = 0; i < lastRowNum; i++) {
//			      Map<Object, Object> datamap = new HashMap<>();
//			      for (int j = 0; j < lastCellNum; j++) {
//			        datamap.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i+1).getCell(j).toString());
//			      }
//			      obj[i][0] = datamap;
//
//			    }
//			 
//			    return  obj;
//			 
//			 
////			 Object[][] obj = new Object[lastRowNum][1];
////			 for (int i = 0; i < lastRowNum; i++) {
////			      Map<Object, Object> datamap = new HashMap<>();
////			      for (int j = 0; j < lastCellNum; j++) {
////			        //datamap.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i+1).getCell(j).toString());
////			    	  datamap.put("Anil","Anil");
////			      }
////			      obj[i][0] = datamap;
////
////			    }
////			    return  obj;
//	 }
//	
//	 
//	 @AfterMethod
//	 public void getResult(ITestResult result){
//	 if(result.getStatus() == ITestResult.FAILURE){
//	 //logger.log(Status.FAIL, "Test Case Failed is "+result.getName());
//	 //MarkupHelper is used to display the output in different colors
//		 testReport.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
//		 testReport.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
//	 }else if(result.getStatus() == ITestResult.SKIP){
//	 //logger.log(Status.SKIP, "Test Case Skipped is "+result.getName());
//		 testReport.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE)); 
//	 }
//	 }
//	 
//	 
//	 
//	 
//	 @AfterTest
//	 public void afterTest() {
//	  // Close the browser
//		//ResultLog.ReportTestEvent("INFO", "TEST ENDED - "+"testBrowserXML");
//		extentReport.flush();
//		//if (exceptiontriggered.equalsIgnoreCase("yes")||exceptiontriggered.equalsIgnoreCase(""))
//			driver.quit();
////	  String verificationErrorString = verificationErrors.toString();
////	  if (!"".equals(verificationErrorString)) {
////	   fail(verificationErrorString);
////	  }
//	 }
//	 
//	
//	 
//	 
//	 
////	 @DataProvider(parallel=true)
////	 public Object[][] getNames(){
////	  Object data[][] = new Object[3][3];
////	  data[0][0] = "firefox";
////	  data[0][1] = "FirstName1";
////	  data[0][2] = "LastName1";
////	  
////	  data[1][0] = "chrome";
////	  data[1][1] = "FirstName2";
////	  data[1][2] = "LastName2";
////	  
////	  data[2][0] = "iexplore";
////	  data[2][1] = "FirstName3";
////	  data[2][2] = "LastName3";  
////	  
////	  return data;
////	 } 
//	 
//	 public WebDriver initWebDriver(String browser) throws Exception
//	 {
//		 //Initialize DesiredCapabilities null.
//		  DesiredCapabilities cap = null;
//
//		 if (browser.equals("firefox")) {
//			   //Set firefox browser capabilities for windows platform.
//			   cap = DesiredCapabilities.firefox();
//			   cap.setBrowserName("firefox");
//			   cap.setPlatform(Platform.WINDOWS);
//			  } else if (browser.equals("chrome")) {
//			   //Set chrome browser capabilities for windows platform.
//			   cap = DesiredCapabilities.chrome();
//			   cap.setBrowserName("chrome");
//			   cap.setPlatform(Platform.WINDOWS);
//			  } else if (browser.equals("iexplore")) {
//			   //Set IE browser capabilities for windows platform.
//				  	WebDriverManager.iedriver().setup();
//				  	DesiredCapabilities dcie = DesiredCapabilities.internetExplorer();
//					dcie.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);							
//					driver = new InternetExplorerDriver(dcie);
//					driver.manage().window().maximize();
////				  
////				  
////			   cap = DesiredCapabilities.internetExplorer();
////			   cap.setBrowserName("internet explorer");
////			   cap.setPlatform(Platform.WINDOWS);
//			  }
//		  
//		  RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
//		  driver.manage().window().maximize();
//		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		 return(driver);
//	 }
//	
// 
////	  @DataProvider(name = "Authentication", parallel=true)
////	 
////	  public static Object[][] credentials() {
////	 
////	        return new Object[][] { { "testuser_1", "Test@123" }, { "testuser_1", "Test@123" }};
////	 
////	  }
////	 
////	  // Here we are calling the Data Provider object with its Name
////	 
////	  @Test(dataProvider = "Authentication")
////	 
////	  public void test(String sUsername, String sPassword) throws Exception {
////	 
////		  if (sBrowerName.equalsIgnoreCase("chrome")){
//////			  System.setProperty("webdriver.chrome.driver", "C:\\SeleniumGrid\\NEW\\BrowserDrivers"+"\\chromedriver.exe");
////			    
////			    DesiredCapabilities capability = new DesiredCapabilities().chrome();
////				  
////			      capability.setBrowserName("chrome");
////			      capability.setPlatform(Platform.WINDOWS);
////			      driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);	  
////		  }else  if (sBrowerName.equalsIgnoreCase("firefox")){
////			  DesiredCapabilities capability = new DesiredCapabilities().firefox();
////		    capability.setBrowserName("firefox");
////		    capability.setPlatform(Platform.WINDOWS);
////		    driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
////		}			
////	 
////	      driver.get("http://www.store.demoqa.com");
////	 
////	      driver.findElement(By.xpath(".//*[@id='account']/a")).click();
////	 
////	      driver.findElement(By.id("log")).sendKeys(sUsername);
////	 
////	      driver.findElement(By.id("pwd")).sendKeys(sPassword);
////	 
////	      driver.findElement(By.id("login")).click();
////	 
////	      //driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
////	 
////	      driver.quit();
////	 
////	  }
//
//}
