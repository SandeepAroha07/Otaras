package com.otaras.testautomation.testscripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.otaras.testautomation.common.InitializeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GridLoginTest {
	public WebDriver driver;
  @Test(singleThreaded=true)
@Parameters("testBrowserXML")
	public void myTestMethod(String testBrowserXML) throws Exception {
  //public void f() {
	  
		//System.setProperty("webdriver.chrome.driver", sFilename+"\\chromedriver.exe");
//	  WebDriverManager.chromedriver().setup();
//	  WebDriverManager.firefoxdriver().setup();
//	  WebDriverManager.operadriver().setup();
//	  WebDriverManager.phantomjs().setup();
//	  WebDriverManager.edgedriver().setup();
//	  WebDriverManager.iedriver().setup();
	 
	  
//	  // UNCOMMENT AND READ BELOW
//	  System.setProperty('WebDriver.chrome.driver', 'D:\\SeleniumSoftwaresReq\\chromedriver.exe');
//	  or add path in grid
//	  
//	  Selenium Version: 3.4.0 (Java bindings)
//	  Browser: Firefox
//	  Browser Version: 53.0
//	  GeckoDriver Version: 0.16.1
//	  
//	  DesiredCapabilities desiredCapabilities = DesiredCapabilities.firefox();
//	  desiredCapabilities.setVersion("53.0");
//	  FirefoxDriver firefoxDriver = new FirefoxDriver(desiredCapabilities)
//			  --or --
//
//			  RemoteWebDriver remoteWebDriver = new RemoteWebDriver(hubUrl, desiredCapabilities);
//	  
//	  https://github.com/SeleniumHQ/selenium/wiki/Grid2
//		  https://stackoverflow.com/questions/33329794/selenium-maven-project
//			  // READ ENDS HERE
			  
  if (testBrowserXML.equalsIgnoreCase("chrome")){
//	  HashMap<String, Object> pref = new HashMap<String, Object>();
	 // System.setProperty("webdriver.chrome.driver", "C:\\SeleniumGrid\\NEW\\BrowserDrivers"+"\\chromedriver.exe");
	  DesiredCapabilities capability = new DesiredCapabilities().chrome();
	  
      capability.setBrowserName("chrome");
      capability.setPlatform(Platform.WINDOWS);
      driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
	  
	  
//		DesiredCapabilities cap = DesiredCapabilities.chrome();
//		 System.setProperty("webdriver.chrome.driver", "C:\\SeleniumGrid\\NEW\\BrowserDrivers"+"\\chromedriver.exe");
//	//	ChromeOptions optionsC = new ChromeOptions();
////		optionsC.setExperimentalOption("prefs", pref);
////		cap.setCapability(ChromeOptions.CAPABILITY, optionsC);
////		optionsC.addArguments("--test-type");
//		//optionsC.addArguments("start-maximized");		
//		//cap.setBrowserName(DesiredCapabilities.chrome().getBrowserName()); 
//		//cap.setPlatform(org.openqa.selenium.Platform.VISTA);
//		cap.setVersion("67.0");
//		driver= new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);	
      int i=0;	
      while (i<5){
		driver.get("https://www.zenmonics.com/");
		System.out.println("chrome:"+i);
		i=i+1;
      	}
  }else  if (testBrowserXML.equalsIgnoreCase("firefox")){
	 // System.setProperty("webdriver.gecko.driver", "C:\\SeleniumGrid\\NEW\\BrowserDrivers"+"\\geckodriver.exe");
	  DesiredCapabilities capability = new DesiredCapabilities().firefox();

      capability.setBrowserName("firefox");
      capability.setPlatform(Platform.WINDOWS);
      driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
	  
//	  // WebDriverManager.firefoxdriver().setup();
//	   //System.setProperty("webdriver.gecko.driver", sFilename+"\\geckodriver.exe");
//	  
//				DesiredCapabilities capsff = DesiredCapabilities.firefox();
//				System.setProperty("webdriver.gecko.driver", "C:\\SeleniumGrid\\NEW\\BrowserDrivers"+"\\geckodriver.exe");
//				//capsff.setBrowserName(DesiredCapabilities.firefox().getBrowserName()); 
//				//capsff.setPlatform("WINDOWS");
//				capsff.setVersion("57.0");
////				capsff.setPlatform(Platform.WINDOWS);
////				capsff.setCapability("marionette", true);
//				//capsff.setPlatform(org.openqa.selenium.Platform.VISTA);
//				driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capsff);
//				driver.manage().window().maximize();
      int i=0;	
      while (i<5){
				driver.get("https://www.zenmonics.com/");
				System.out.println("firefox:"+i);
				i=i+1;
      }
  }				
  else if(testBrowserXML.equalsIgnoreCase("ie")){
	  
//	  InternetExplorerDriverService ieService =  InternetExplorerDriverService.createDefaultService();
//			     ieService.l.LoggingLevel = InternetExplorerDriverLogLevel.Debug;
//			     ieService.LogFile = "c:\\TEMP\\DriverServerLogFile.txt";
	  System.setProperty("webdriver.ie.driver", "C:\\SeleniumGrid\\NEW\\BrowserDrivers"+"\\IEDriverServer.exe");
	  DesiredCapabilities capability = new DesiredCapabilities().internetExplorer();

      capability.setBrowserName("internet explorer");
      capability.setPlatform(Platform.WINDOWS);
      capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
      capability.setCapability("ignoreZoomSetting", true);
      capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
      //capability.setCapability("ignoreProtectedModeSettings", true);
      //capability.setCapability("requireWindowFocus", true);
      driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
	  
	  //RemoteDriverManager.iedriver().setup();
	 // WebDriverManager.iedriver().setup();
				//System.setProperty("webdriver.ie.driver", sFilename+"\\IEDriverServer.exe");
	  			
//				DesiredCapabilities dcie = DesiredCapabilities.internetExplorer();
//				//System.setProperty("webdriver.ie.driver", "C:\\SeleniumGrid\\NEW\\BrowserDrivers"+"\\IEDriverServer.exe");
//				dcie.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);	
//				//dcie.setBrowserName(DesiredCapabilities.internetExplorer().getBrowserName()); 
//				//capability.setPlatform("WINDOWS");
//				dcie.setVersion("11");
////				capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
////				 capabilities.setCapability("acceptInsecureCerts", true);
////				 capabilities.setCapability("acceptSslCerts",true);
////				 capabilities.setAcceptInsecureCerts(true);
////				 capabilities.acceptInsecureCerts();
//				//dcie.setPlatform(org.openqa.selenium.Platform.VISTA);
//				driver= new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dcie);	
//				driver.manage().window().maximize();
				driver.get("https://www.zenmonics.com/");
  }
  }
}
