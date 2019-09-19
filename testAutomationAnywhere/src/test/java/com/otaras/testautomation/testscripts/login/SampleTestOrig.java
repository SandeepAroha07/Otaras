package com.otaras.testautomation.testscripts.login;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.otaras.testautomation.common.InitializeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

//http://toolsqa.com/selenium-webdriver/testng-parameters-data-provider/
//http://www.techbeamers.com/testng-parameters-and-dataprovider-annotations/

public class SampleTestOrig {

	private InitializeDriver initializeDriver;
	private WebDriver driver;
	public String testBrowserXML="";
	private String sBrowerName="chrome";
	 // https://automationtalks.com/2017/11/03/map-hashmap-testng-dataprovider/
		//  https://testingtechhunt.wordpress.com/2016/05/23/passing-hashmap-in-data-provider-fetching-from-excel-sheet/
			
	
	 //Used dataProvider parameter to get data from @DataProvider annotation method.
	 //Can accept object array data(browser name, First Name and Last Name) from getNames method.
	 @Test(dataProvider = "getNames")
	 public void gmailLogin(String browser, String fName, String lName) throws MalformedURLException, InterruptedException {
	  
	  //Initialize DesiredCapabilities null.
	  DesiredCapabilities cap = null;

	  
	  //GOOD ONE
	  http://www.software-testing-tutorials-automation.com/2016/03/selenium-grid-2-using-dataprovider-to.html
		  
	  
	  //Initialize browser driver as per data received from getNames().
	  if (browser.equals("firefox")) {
	   //Set firefox browser capabilities for windows platform.
	   cap = DesiredCapabilities.firefox();
	   cap.setBrowserName("firefox");
	   cap.setPlatform(Platform.WINDOWS);
	  } else if (browser.equals("chrome")) {
	   //Set chrome browser capabilities for windows platform.
	   cap = DesiredCapabilities.chrome();
	   cap.setBrowserName("chrome");
	   cap.setPlatform(Platform.WINDOWS);
	  } else if (browser.equals("iexplore")) {
	   //Set IE browser capabilities for windows platform.
		  	WebDriverManager.iedriver().setup();
		  	DesiredCapabilities dcie = DesiredCapabilities.internetExplorer();
			dcie.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);							
			driver = new InternetExplorerDriver(dcie);
			driver.manage().window().maximize();
//		  
//		  
//	   cap = DesiredCapabilities.internetExplorer();
//	   cap.setBrowserName("internet explorer");
//	   cap.setPlatform(Platform.WINDOWS);
	  }

	  //Initialize RemoteWebDriver on grid 2 node with browser capability.
	  RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  //Open URL in requested browsers of node and execute test steps.
	  driver.get("http://only-testing-blog.blogspot.in/2014/05/form.html");
	  Thread.sleep(500);
	  driver.findElement(By.name("FirstName")).sendKeys(fName);
	  driver.findElement(By.name("LastName")).sendKeys(lName);

	  driver.quit();
	 }
	 
	 //Created @DataProvider annotation method to supply data(browser name, First Name and Last Name) for test
	 @DataProvider(parallel=true)
	 public Object[][] getNames(){
	  Object data[][] = new Object[4][3];
	  data[0][0] = "firefox";
	  data[0][1] = "FirstName1";
	  data[0][2] = "LastName1";
	  
	  data[1][0] = "chrome";
	  data[1][1] = "FirstName2";
	  data[1][2] = "LastName2";
	  
//	  data[2][0] = "chrome";
//	  data[2][1] = "FirstName4";
//	  data[2][2] = "LastName4";  
	  
	  data[3][0] = "iexplore";
	  data[3][1] = "FirstName3";
	  data[3][2] = "LastName3";  
	  
	  return data;
	 } 
	
 
//	  @DataProvider(name = "Authentication", parallel=true)
//	 
//	  public static Object[][] credentials() {
//	 
//	        return new Object[][] { { "testuser_1", "Test@123" }, { "testuser_1", "Test@123" }};
//	 
//	  }
//	 
//	  // Here we are calling the Data Provider object with its Name
//	 
//	  @Test(dataProvider = "Authentication")
//	 
//	  public void test(String sUsername, String sPassword) throws Exception {
//	 
//		  if (sBrowerName.equalsIgnoreCase("chrome")){
////			  System.setProperty("webdriver.chrome.driver", "C:\\SeleniumGrid\\NEW\\BrowserDrivers"+"\\chromedriver.exe");
//			    
//			    DesiredCapabilities capability = new DesiredCapabilities().chrome();
//				  
//			      capability.setBrowserName("chrome");
//			      capability.setPlatform(Platform.WINDOWS);
//			      driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);	  
//		  }else  if (sBrowerName.equalsIgnoreCase("firefox")){
//			  DesiredCapabilities capability = new DesiredCapabilities().firefox();
//		    capability.setBrowserName("firefox");
//		    capability.setPlatform(Platform.WINDOWS);
//		    driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
//		}			
//	 
//	      driver.get("http://www.store.demoqa.com");
//	 
//	      driver.findElement(By.xpath(".//*[@id='account']/a")).click();
//	 
//	      driver.findElement(By.id("log")).sendKeys(sUsername);
//	 
//	      driver.findElement(By.id("pwd")).sendKeys(sPassword);
//	 
//	      driver.findElement(By.id("login")).click();
//	 
//	      //driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
//	 
//	      driver.quit();
//	 
//	  }

}
