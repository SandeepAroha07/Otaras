package com.otaras.testautomation.common;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.otaras.testautomation.aut.testdatarec.TestDataRec;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InitializeDriver {

	
	private RemoteWebDriver remotedriver;
	private WebDriver webdriver;
	
	
//	   public WebDriver initializeDriver(String browser) throws Exception
//	   {
//		  
//		   
//		   return(driver);
//	   }
	
    public WebDriver initRemoteWebDriver(String browser) throws Exception
		 {
    	
    	
    	//String sDriverType=ReadTestConfig.Get("DRIVER.TYPE");
    	
    	// if (sDriverType.equalsIgnoreCase("remotedriver")){
    	//Initialize DesiredCapabilities null.
			  DesiredCapabilities cap = null;
			  String sHeadlessFlag="";
			  sHeadlessFlag=checkIfHeadlessTestConfigured();
			  if (sHeadlessFlag==null)
				  sHeadlessFlag="";
			  ChromeOptions options=new ChromeOptions();
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
				  
		  			if (ReadTestConfig.Get("TEST.HEADLESS").equalsIgnoreCase("yes")||sHeadlessFlag.equalsIgnoreCase("yes")){
			  			options.addArguments("headless");
			  			options.addArguments("--no-sandbox");
			  			options.addArguments("--window-size=1325,744");
			  			options.merge(cap);}
		  			
				  } else if (browser.equals("ieedge")) {
					  cap = DesiredCapabilities.edge();
					  cap.setBrowserName("MicrosoftEdge");
				  } else if (browser.equals("ie")) {
				   //Set IE browser capabilities for windows platform.
					  
					//  System.setProperty("webdriver.ie.driver", "C:\\AUTOMATION\\testAutomationAnywhere\\seleniumGrid\\IEDriverServer.exe");
					  cap = DesiredCapabilities.internetExplorer();
//					  cap.setCapability("requireWindowFocus", true);  
					  //cap.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, false);
					  cap.setCapability("ie.ensureCleanSession", true);
					  cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
					  //cap.setVersion("11.0");
					  //cap.setBrowserName("internet explorer");
					  //cap.setPlatform(Platform.WINDOWS);
					  //cap.setCapability(InternetExplorerDriver.FORCE_CREATE_PROCESS, true);
					 // webDriver = new InternetExplorerDriver(capabilities);
					  
//					  System.setProperty("webdriver.ie.driver", "C:\\AUTOMATION\\testAutomationAnywhere\\seleniumGrid\\IEDriverServer.exe");
//					  cap=DesiredCapabilities.internetExplorer();
//					  //System.setProperty("webdriver.ie.driver", "C:\\AUTOMATION\\testAutomationAnywhere\\seleniumGrid\\IEDriverServer.exe");
//					  //cap.setCapability("nativeEvents", false);
//					  //cap.setCapability("ignoreZoomSetting", true);
//					  cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
//					  cap.setPlatform(Platform.WINDOWS);
					  
					  
//					  System.setProperty("webdriver.ie.driver", "C:\\AUTOMATION\\testAutomationAnywhere\\seleniumGrid\\IEDriverServer.exe");
//					  	WebDriverManager.iedriver().setup();
//					  	cap = DesiredCapabilities.internetExplorer();
//					  	cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);							
						//driver = new InternetExplorerDriver(cap);
						//driver.manage().window().maximize();
					  //WebDriverManager.iedriver().setup();
						//System.setProperty("webdriver.ie.driver", "C:\\AUTOMATION\\testAutomationAnywhere\\seleniumGrid\\IEDriverServer.exe");
//						cap=DesiredCapabilities.internetExplorer();
//						cap.setCapability("ignoreZoomSetting", true);
//						cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
//						cap.setPlatform(Platform.WINDOWS);
//						driver= new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capability);		
//						driver.manage().window().maximize();
//				      	break;
						
						
//					  
//				   cap = DesiredCapabilities.internetExplorer();
//				   cap.setBrowserName("internet explorer");
//				   cap.setPlatform(Platform.WINDOWS);
				  }
			 RemoteWebDriver remotedriver;
			 if (ReadTestConfig.Get("TEST.HEADLESS").equalsIgnoreCase("yes")||sHeadlessFlag.equalsIgnoreCase("yes"))
				 remotedriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
			 else
			  remotedriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
    	// }
//    	 else if (sDriverType.equalsIgnoreCase("webdriver"))
//		{
//			
//		}
    	 
    	 
    	 
			  remotedriver.manage().window().maximize();
			  remotedriver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			 return(remotedriver);
		}
	
    public String checkIfHeadlessTestConfigured() throws Exception
	 {
	  String mvnParam = "";
	  mvnParam=System.getProperty("headlessflag");//System.getProperty("fileName");
      System.out.println("Reading Maven Command Line Argument : " + mvnParam);
     // Object testReport;
	//testReport.log(Status.INFO,"Reading Maven Command Line Argument : " + mvnParam);
	//driver.get("http://automationpractice.com/index.php");
	//driver.get(TestDataRec.TESTDATALOGINMAP.get("url"));
  	//  Thread.sleep(1000);
  	  //driver.findElement(By.xpath("//a[@class='login']")).click();  
  	//driver.findElement(By.xpath(OR.homePage_signIn)).click(); 
    //Thread.sleep(1000);
//TestDataRec.TESTDATALOGINMAP.get("url");
      if(!(mvnParam==null))
      if(mvnParam.equalsIgnoreCase("")){
    	  mvnParam="";
      }
      else if (mvnParam.equalsIgnoreCase("no"))
    	  mvnParam="no";
      else if (mvnParam.equalsIgnoreCase("yes"))
    	  mvnParam="yes";
      else
    	  mvnParam="";
      return(mvnParam);
	 }
    
    public WebDriver initWebDriver(String browser) throws Exception
 		 {
    	int objWaitTime= Integer.parseInt(ReadTestConfig.Get("OBJECT.WAITTIME"));
    	String sHeadlessFlag="";
    	sHeadlessFlag=checkIfHeadlessTestConfigured();
		  if (sHeadlessFlag==null)
			  sHeadlessFlag="";
  	  if (browser.equalsIgnoreCase("firefox"))
	  {
	  	//System.setProperty("webdriver.gecko.driver", sFilename+"\\geckodriver.exe");
	  	WebDriverManager.firefoxdriver().setup();
		DesiredCapabilities caps = DesiredCapabilities.firefox();
		caps.setPlatform(Platform.WINDOWS);
		caps.setCapability("marionette", true);
		webdriver = new FirefoxDriver(caps);
		webdriver.manage().window().maximize();
		webdriver.manage().timeouts().implicitlyWait(objWaitTime, TimeUnit.SECONDS);
	  }
	  else if (browser.equalsIgnoreCase("chrome")){
	  
	  		if (ReadTestConfig.Get("TEST.CHROME.RESPONSIVE").equalsIgnoreCase("yes"))
	  		{
			  	WebDriverManager.chromedriver().setup();
		  		
		  		HashMap<String, String> mobileEmulation = new HashMap<String, String>();  //uncomment for browser responsive testing
				//mobileEmulation.put("deviceName", "Nexus 6"); //uncomment for browser responsive testing
		  		mobileEmulation.put("deviceName", "iPad Pro"); //uncomment for browser responsive testing
				HashMap<String, Object> chromeOptions = new HashMap<String, Object>(); //uncomment for browser responsive testing
				chromeOptions.put("mobileEmulation", mobileEmulation); //uncomment for browser responsive testing
				DesiredCapabilities caps = DesiredCapabilities.chrome();
				caps.setCapability(ChromeOptions.CAPABILITY, chromeOptions); //uncomment for browser responsive testing
				webdriver = new ChromeDriver(caps);
				webdriver.manage().window().maximize();
				//driver.get("https://www.google.com/");
	  		}
	  		else
	  		{
	  			WebDriverManager.chromedriver().setup();
	  			DesiredCapabilities caps = DesiredCapabilities.chrome();
	  			//capabilities.setCapability("chrome.switches", Arrays.asList("--incognito"));
	  			ChromeOptions options=new ChromeOptions();
	  			if (ReadTestConfig.Get("TEST.HEADLESS").equalsIgnoreCase("yes")||sHeadlessFlag.equalsIgnoreCase("yes")){
		  			options.addArguments("headless");
		  			options.addArguments("--no-sandbox");
		  			options.addArguments("--window-size=1325,744");
		  			options.merge(caps);}
	  			//this.webdriver = new ChromeDriver(caps);
	  			this.webdriver = new ChromeDriver(options);
	  			webdriver.manage().window().maximize();
	  			webdriver.manage().timeouts().implicitlyWait(objWaitTime, TimeUnit.SECONDS);
	  		}
	  }
	  else if (browser.equalsIgnoreCase("ie")){
		  	WebDriverManager.iedriver().setup();
		  	DesiredCapabilities dcie = DesiredCapabilities.internetExplorer();
			dcie.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);							
			webdriver = new InternetExplorerDriver(dcie);
			webdriver.manage().window().maximize();
			webdriver.manage().timeouts().implicitlyWait(objWaitTime, TimeUnit.SECONDS);
	  }
	  else if (browser.equalsIgnoreCase("ieedge")){
		  	WebDriverManager.edgedriver().setup();
		  	DesiredCapabilities dcie = DesiredCapabilities.internetExplorer();
			dcie.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);							
			webdriver = new InternetExplorerDriver(dcie);
			webdriver.manage().window().maximize();
			webdriver.manage().timeouts().implicitlyWait(objWaitTime, TimeUnit.SECONDS);
	  }
  	 return(webdriver);
 		 }
    
	
	
  public WebDriver initializeDriver() throws Exception {
	  
	  //String sBrowerName=ReadTestConfig.Get("browser.name");
	  String sBrowerName=TestDataRec.TESTBROWSERNAME;
	  String sDriverType=ReadTestConfig.Get("DRIVER.TYPE");
	  
	  if (sDriverType.equalsIgnoreCase("webdriver"))
	  {
		  if (sBrowerName.equalsIgnoreCase("firefox"))
		  {
		  	//System.setProperty("webdriver.gecko.driver", sFilename+"\\geckodriver.exe");
		  	WebDriverManager.firefoxdriver().setup();
			DesiredCapabilities caps = DesiredCapabilities.firefox();
			caps.setPlatform(Platform.WINDOWS);
			caps.setCapability("marionette", true);
			webdriver = new FirefoxDriver(caps);
			webdriver.manage().window().maximize();
		  }
		  else if (sBrowerName.equalsIgnoreCase("chrome")){
		  
		  		WebDriverManager.chromedriver().setup();
	//	  		HashMap<String, String> mobileEmulation = new HashMap<String, String>();  //uncomment for browser responsive testing
	//			mobileEmulation.put("deviceName", "Nexus 6"); //uncomment for browser responsive testing
	//			HashMap<String, Object> chromeOptions = new HashMap<String, Object>(); //uncomment for browser responsive testing
	//			chromeOptions.put("mobileEmulation", mobileEmulation); //uncomment for browser responsive testing
				DesiredCapabilities caps = DesiredCapabilities.chrome();
	//			caps.setCapability(ChromeOptions.CAPABILITY, chromeOptions); //uncomment for browser responsive testing
				this.webdriver = new ChromeDriver(caps);
				webdriver.manage().window().maximize();
		  }
		  else if (sBrowerName.equalsIgnoreCase("ie")){
			  	WebDriverManager.iedriver().setup();
			  	DesiredCapabilities dcie = DesiredCapabilities.internetExplorer();
				dcie.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);							
				webdriver = new InternetExplorerDriver(dcie);
				webdriver.manage().window().maximize();
		  }
	  
	  
			//driver = new ChromeDriver(caps);
			
	  }else if (sDriverType.equalsIgnoreCase("remotedriver"))
	  {
		  if (sBrowerName.equalsIgnoreCase("chrome")){
//			  System.setProperty("webdriver.chrome.driver", "C:\\SeleniumGrid\\NEW\\BrowserDrivers"+"\\chromedriver.exe");
			    
			  //Anil added this code to overcome chomre driver and browser version - uncomment below one line once browser version update to 74 version
			  //System.setProperty("webdriver.chrome.driver", "C:/mywork/seleniumgit/munivisorautomatedtestSelenium/testAutomationAnywhere/seleniumGrid/chromedriver.exe");	
			  
			    DesiredCapabilities capability = new DesiredCapabilities().chrome();
				  
			      capability.setBrowserName("chrome");
			      capability.setPlatform(Platform.WINDOWS);
			      remotedriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
			    
			    
//			 									
//				HashMap<String, Object> pref = new HashMap<String, Object>();
//				DesiredCapabilities cap = DesiredCapabilities.chrome();
//				ChromeOptions optionsC = new ChromeOptions();
//				optionsC.setExperimentalOption("prefs", pref);
//				cap.setCapability(ChromeOptions.CAPABILITY, optionsC);
//				optionsC.addArguments("--test-type");
//				optionsC.addArguments("start-maximized");				        
//				driver= new RemoteWebDriver(new URL("http://localhost:7777/wd/hub"),cap);	
		  
		  }else  if (sBrowerName.equalsIgnoreCase("firefox")){
			 // System.setProperty("webdriver.gecko.driver", "C:\\SeleniumGrid\\NEW\\BrowserDrivers"+"\\geckodriver.exe");
			  DesiredCapabilities capability = new DesiredCapabilities().firefox();

		    capability.setBrowserName("firefox");
		    capability.setPlatform(Platform.WINDOWS);
		    remotedriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
		}				
		else if(sBrowerName.equalsIgnoreCase("ie")){
			  
//			  InternetExplorerDriverService ieService =  InternetExplorerDriverService.createDefaultService();
//					     ieService.l.LoggingLevel = InternetExplorerDriverLogLevel.Debug;
//					     ieService.LogFile = "c:\\TEMP\\DriverServerLogFile.txt";
			  System.setProperty("webdriver.ie.driver", "C:\\SeleniumGrid\\NEW\\BrowserDrivers"+"\\IEDriverServer.exe");
			  DesiredCapabilities capability = new DesiredCapabilities().internetExplorer();

		    capability.setBrowserName("internet explorer");
		    capability.setPlatform(Platform.WINDOWS);
		    capability.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		    capability.setCapability("ignoreZoomSetting", true);
		    capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		    //capability.setCapability("ignoreProtectedModeSettings", true);
		    //capability.setCapability("requireWindowFocus", true);
		    remotedriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
		}
	  }
	  return(remotedriver);
  }
}







//https://chercher.tech/java/custom-web-elements-selenium-webdriver#no-of-columns
////OPERA
//System.setProperty("webdriver.chrome.driver", "C:/Users/user/Downloads/operadriver-0.1.0-win32/operadriver-0.1.0-win32.exe");
//WebDriver driver = new ChromeDriver();
//
//// MS Edge
//System.setProperty("webdriver.edge.driver", "MicrosoftWebDriver.exe path till .exe");
//WebDriver driver = new EdgeDriver();

