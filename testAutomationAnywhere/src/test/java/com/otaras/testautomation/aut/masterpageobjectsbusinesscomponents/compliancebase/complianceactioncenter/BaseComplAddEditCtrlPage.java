package com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.compliancebase.complianceactioncenter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.BasePage;
import com.otaras.testautomation.common.ReadTestConfig;
import com.otaras.testautomation.common.uielement.TestWebElement;
import com.otaras.testautomation.objectrepository.OR;


public class BaseComplAddEditCtrlPage extends BasePage{
  

    
    //---------------------------------------

    @FindBy(xpath = OR.ComplianceAddEditControlPage_Type)	
    public WebElement Type;
  
    public boolean Exists(){
      	return super.Exists(Type); 
    	
	}
    
//    public void clickSpecifiedButton(String objName) 
//    {
//    	try{
//    		clickButton(objName);
//    	}
//    	catch (Exception e)
//    	{
//    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Compliance Checks and Email Notification Page - clickButton - unable to click"+e+ErrorFontColorSuffix);
//    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//    		throw new NoSuchElementException ("clickButton not clicked");
//    	}
//    }
 
//    public void clickSave() 
//    {
//    	try{
//    		//Thread.sleep(300);
//    		if (Exists(driver.findElement(By.cssSelector(".rw-input-reset")))==false)
//    			throw new NoSuchElementException ("Element Not Found: "+"Issuer");
////    		if (issuer.equalsIgnoreCase(""))
////    			issuer=testData.get("issuer").toString();
////    		testReport.log(Status.INFO,"Issuer To Select:"+issuer);
//    		Save.click();
//
//    	
//	}
//	catch (Exception e)
//	{
//		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Compliance Checks and Email Notification Page - clickSave - unable to click"+e+ErrorFontColorSuffix);
//		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//		throw new NoSuchElementException ("clickSave not clicked");
//	}
//}
//    
  
}
