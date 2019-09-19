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
//public class paralleltestSkeleton {
//
//	  String testName = "";
//	  private WebDriver driver;
//	  private String sBrowser="";
//	  
//	  private String param = "";
//	  public paralleltestSkeleton(String param) {
//	        this.param = param;
//	    }
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
//	    @BeforeClass
//	    @Parameters({ "testBrowserXML" })
//	    public void beforeClass(String testBrowserXML) throws Exception {
//	        long id = Thread.currentThread().getId();
//	        System.out.println("Before test-class " + testName + ". Thread id is: "
//	                + id);
//	        driver=initWebDriver(testBrowserXML);
//	    }
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
//	    @Test
//	    public void testMethod() {
//	        System.out.println("testMethod parameter value is: " + param);
//		      driver.get("http://www.store.demoqa.com");
//	   	 
//   	      driver.findElement(By.xpath(".//*[@id='account']/a")).click();
//   	 
//	   	      driver.findElement(By.id("log")).sendKeys("Anil");
//	   	 
//	   	      driver.findElement(By.id("pwd")).sendKeys("Kumar");
//	   	   driver.quit();
//	    }
//	 
//	    @AfterClass
//	    public void afterClass() {
//	        long id = Thread.currentThread().getId();
//	        System.out.println("After test-method  " + testName
//	                + ". Thread id is: " + id);
//	    }
//	 
//	    @AfterTest
//	    public void afterTest() {
//	        long id = Thread.currentThread().getId();
//	        System.out.println("After test  " + testName + ". Thread id is: " + id);
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
//		 public Object[][] getNames(){
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
//		 public class SimpleTestFactory
//		 {
//		     @Factory
//		     public Object[] factoryMethod() {
//		         return new Object[] {
//		                                 new paralleltestSkeleton("one"),
//		                                 new paralleltestSkeleton("two")
//		                             };
//		     }
//		 }
//		 
//}
