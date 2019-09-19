package com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.commonbusinesscodebase;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.BasePage;
import com.otaras.testautomation.common.ReadTestData;
import com.otaras.testautomation.objectrepository.OR;

public class BaseCommonBusinessComponentPage extends BasePage{


	
    public void enterMaster_BusinessAddressData(String sTabName, String sColumnName, String sColumnValue) throws Exception 
    {
    	HashMap<String, String> MasterTestDataMap=new HashMap<>();
    	ReadTestData readtestdata=new ReadTestData();
    	MasterTestDataMap=readtestdata.getMasterData(sTabName, sColumnName, sColumnValue);
    	
    	Exists(driver.findElement(By.xpath(OR.BusinessAddressPage_AddressName)));
    	
    	
    	
    //	enterInput(OR.BusinessAddressPage_AddressName,MasterTestDataMap.get("addressName").toString());
    	if (MasterTestDataMap.get("addressName").toString().equalsIgnoreCase("no"))
    		driver.findElement(By.xpath(OR.BusinessAddressPage_IsPrimary)).click();
    		
    	enterInput(OR.BusinessAddressPage_Website,MasterTestDataMap.get("website").toString());
    	enterInput(OR.BusinessAddressPage_OfficePhone,MasterTestDataMap.get("officePhone1").toString());
    	enterInput(OR.BusinessAddressPage_OfficeFax,MasterTestDataMap.get("officeFax1").toString());
    	
    	enterInput(OR.BusinessAddressPage_Email,MasterTestDataMap.get("officeEmail1").toString());
    	enterInput(OR.BusinessAddressPage_AddressLine1,MasterTestDataMap.get("addressLine1").toString());
    	//selectCombobox(OR.BusinessAddressPage_Country,MasterTestDataMap.get("country").toString());
    	
    	
    	WebElement wb2=driver.findElement(By.xpath(OR.BusinessAddressPage_State));
		Actions builder1=new Actions(driver);
		Action seriesofactions1=builder1
		        .moveToElement(wb2)
			   // .click()
				.pause(2000)
				.sendKeys(wb2,MasterTestDataMap.get("city").toString())
				.sendKeys(Keys.ARROW_DOWN)
				.pause(1500)
				.click()
				.pause(1500)
//				.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'"+"Concord Mills"+"')]")))
//				.pause(900)
				.click()
				.sendKeys(Keys.ARROW_DOWN)
				.pause(1500)
				.sendKeys(Keys.ARROW_DOWN)
				.pause(1500)
				.sendKeys(Keys.ENTER)
				.pause(1500)
			    .build();
	    	    seriesofactions1.perform();
	    		Thread.sleep(2000);
    	
	    		
	    		
//	    		wb2=driver.findElement(By.xpath("//*[contains(text(),'"+"Concord Mills"+"')]"));
//	    		 builder1=new Actions(driver);
//	    		 seriesofactions1=builder1
////	    		        .moveToElement(wb2)
////	    			   // .click()
////	    				.pause(900)
////	    				.sendKeys(wb2,"Concord")
////	    				.sendKeys(Keys.ARROW_DOWN)
////	    				.pause(900)
////	    				.click()
//	    				.pause(900)
//	    				.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'"+"Concord Mills"+"')]")))
//	    				.pause(900)
//	    				.click()
//	    				.sendKeys(Keys.ARROW_DOWN)
//	    				.pause(900)
//	    				.sendKeys(Keys.ARROW_DOWN)
//	    				//.click()
//	    			    .build();
//	    	    	    seriesofactions1.perform();
//	    	    		Thread.sleep(2000);
	    		
	    		
    	//enterInput(OR.BusinessAddressPage_State,"Concord, North Carolina, United States");//MasterTestDataMap.get("state").toString()
    	//selectCombobox(OR.BusinessAddressPage_City,MasterTestDataMap.get("city").toString());
    	enterInput(OR.BusinessAddressPage_Zipcode,MasterTestDataMap.get("zipcode").toString());
    }
    
    
    public void performAction(String action) 
    {
    	WebElement Save=driver.findElement(By.xpath("(//*[contains(text(),'"+"Save"+"')]/parent::div)[2]|//*[contains(text(),'"+"Save"+"')]/parent::div"));
    	WebElement Cancel=driver.findElement(By.xpath("//*[contains(text(),'"+"Cancel"+"')]/parent::div"));
    	try{
    		if (Exists(Save)==false)
    			throw new NoSuchElementException ("Element Not Found: "+Save.toString());
    		if (action.equalsIgnoreCase("save"))
    			Save.click();
    		else if (action.equalsIgnoreCase("cancel"))
    			Cancel.click();
    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects New Transaction Page - Action Performed: "+action+" Successful - "+"Save: "+Save.toString()+SuccessFontColorSuffix);
    	}
    	catch (Exception e)
    	{
    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Transaction Page - performAction - unable to click"+e+ErrorFontColorSuffix);
    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
    		throw new NoSuchElementException ("performAction not entered");
    	}
    }
    
    public void performAction2(String action) 
    {
    	WebElement Save=driver.findElement(By.xpath("(//*[contains(text(),'"+"Save"+"')]/parent::div)[2]"));
    	WebElement Cancel=driver.findElement(By.xpath("//*[contains(text(),'"+"Cancel"+"')]/parent::div"));
    	try{
    		if (Exists(Save)==false)
    			throw new NoSuchElementException ("Element Not Found: "+Save.toString());
    		if (action.equalsIgnoreCase("save"))
    			Save.click();
    		else if (action.equalsIgnoreCase("cancel"))
    			Cancel.click();
    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects New Transaction Page - Action Performed: "+action+" Successful - "+"Save: "+Save.toString()+SuccessFontColorSuffix);
    	}
    	catch (Exception e)
    	{
    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Transaction Page - performAction - unable to click"+e+ErrorFontColorSuffix);
    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
    		throw new NoSuchElementException ("performAction not entered");
    	}
    }
    
    public void performAction1(String action) 
    {
    	WebElement Save=driver.findElement(By.xpath("//*[contains(text(),'"+"Save"+"')]/parent::div"));
    	//WebElement Cancel=driver.findElement(By.xpath("//*[contains(text(),'"+"Cancel"+"')]/parent::div"));
    	try{
    		if (Exists(Save)==false)
    			throw new NoSuchElementException ("Element Not Found: "+Save.toString());
    		if (action.equalsIgnoreCase("save"))
    			Save.click();
//    		else if (action.equalsIgnoreCase("cancel"))
//    			Cancel.click();
    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Projects New Transaction Page - Action Performed: "+action+" Successful - "+"Save: "+Save.toString()+SuccessFontColorSuffix);
    	}
    	catch (Exception e)
    	{
    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Projects New Transaction Page - performAction - unable to click"+e+ErrorFontColorSuffix);
    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
    		throw new NoSuchElementException ("performAction not entered");
    	}
    }
    
}
