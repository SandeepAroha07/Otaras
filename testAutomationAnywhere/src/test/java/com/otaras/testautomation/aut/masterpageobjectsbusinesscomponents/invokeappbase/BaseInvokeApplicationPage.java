package com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.invokeappbase;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.BasePage;
import com.otaras.testautomation.aut.testdatarec.TestDataRec;
import com.otaras.testautomation.objectrepository.OR;

public class BaseInvokeApplicationPage extends BasePage{
 
	public void launchApplication() 
	  {
		try{
			 
			  String mvnParam = "";
			  mvnParam=System.getProperty("url");//System.getProperty("fileName");
		      System.out.println("Reading Maven Command Line Argument : " + mvnParam);
		      testReport.log(Status.INFO,"Reading Maven Command Line Argument : " + mvnParam);
			//driver.get("http://automationpractice.com/index.php");
			//driver.get(TestDataRec.TESTDATALOGINMAP.get("url"));
		  	//  Thread.sleep(1000);
		  	  //driver.findElement(By.xpath("//a[@class='login']")).click();  
		  	//driver.findElement(By.xpath(OR.homePage_signIn)).click(); 
		    //Thread.sleep(1000);
		//TestDataRec.TESTDATALOGINMAP.get("url");
		      if(!(mvnParam==null))
		      if(!mvnParam.equalsIgnoreCase("")){
		    	  TestDataRec.TESTDATALOGINMAP.put("url",mvnParam);
		      testReport.log(Status.INFO,"UPDATED URL with maven data : " + TestDataRec.TESTDATALOGINMAP.get("url"));}
		driver.get(TestDataRec.TESTDATALOGINMAP.get("url")+"/signin");
		//driver.findElement(By.xpath(OR.MainPage_LoginIcon)).click();
		//Thread.sleep(1000);
		
		//driver.get(TestDataRec.TESTDATALOGINMAP.get("url"));
		testReport.log(Status.PASS,"URL launched: "+TestDataRec.TESTDATALOGINMAP.get("url")+ " launched");
	  }
	catch (Exception e)
	{
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"launchApplication Page - launchApplication failed - unable to Enter"+e+ErrorFontColorSuffix);
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
		throw new NoSuchElementException ("URL not launched");
	}
	
	  }
	
	public void launchApplicationNEW() 
	  {
		try{
		//TestDataRec.TESTDATALOGINMAP.get("url");
		driver.get("http://www.store.demoqa.com");
		//driver.get(TestDataRec.TESTDATALOGINMAP.get("url"));
		//testReport.log(Status.PASS,"URL launched: "+TestDataRec.TESTDATALOGINMAP.get("url")+ " launched");
	  }
	catch (Exception e)
	{
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"launchApplication Page - launchApplication failed - unable to Enter"+e+ErrorFontColorSuffix);
		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
		throw new NoSuchElementException ("URL not launched");
	}
	
	  }
	
	
	
}

