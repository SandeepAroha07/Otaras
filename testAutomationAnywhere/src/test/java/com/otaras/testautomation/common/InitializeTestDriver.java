package com.otaras.testautomation.common;

import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import com.otaras.testautomation.aut.testdatarec.TestDataRec;


public class InitializeTestDriver {
//	public void initializeDriverAndPages(){
//		  if ((exceptiontriggered.equalsIgnoreCase("")||exceptiontriggered.equalsIgnoreCase("yes")) && !ReadTestConfig.Get("TEST.LOGINEACHSCENARIO").equalsIgnoreCase("yes")){
//			  initializeDriver=new InitializeDriver();
//			  this.driver=initializeDriver.initializeDriver();
//			  driverEvent = new EventFiringWebDriver(driver);
//			  eventListener = new WebDriverEventListener(testReport);
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
//		  ResultLog.ReportTestEvent("INFO", "HELLO");
//		  ResultLog.takeScreenShot();
//		  eventListener.testReport=testReport;
//	}
	
	
	public static void SetTestBrowser()
	{
//		if (!TestDataRec.TESTDATAMAP.get("TestBrowser").equalsIgnoreCase(""))
//			TestDataRec.TESTBROWSERNAME=TestDataRec.TESTDATAMAP.get("TestBrowser");
		String sBrowserNameFromTestNg=TestDataRec.TESTDATAMAP.get("TestBrowser").trim();

////				TestDataRec.LastTestBrowser=TestDataRec.TESTBROWSERNAME;
	
		if (!TestDataRec.TESTBROWSERNAME.equalsIgnoreCase(""))
			TestDataRec.TESTBROWSERNAMEOFPREVIOUSTEST=TestDataRec.TESTBROWSERNAME;
		
		if (!sBrowserNameFromTestNg.equalsIgnoreCase("")){
			if(!sBrowserNameFromTestNg.equalsIgnoreCase("skip")){
				if(sBrowserNameFromTestNg.equalsIgnoreCase("chrome"))
					TestDataRec.TESTBROWSERNAME="chrome";
				else if(sBrowserNameFromTestNg.equalsIgnoreCase("firefox"))
					TestDataRec.TESTBROWSERNAME="firefox";
				else if(sBrowserNameFromTestNg.equalsIgnoreCase("ie"))
					TestDataRec.TESTBROWSERNAME="ie";
				else
					TestDataRec.TESTBROWSERNAME="chrome";
			}
			else if(sBrowserNameFromTestNg.equalsIgnoreCase("skip"))
				TestDataRec.TESTBROWSERNAME=TestDataRec.TESTDATAMAP.get("TestBrowser");
		}
		else if (sBrowserNameFromTestNg.equalsIgnoreCase(""))
			TestDataRec.TESTBROWSERNAME=TestDataRec.TESTDATAMAP.get("TestBrowser");
	}
	
	
}
