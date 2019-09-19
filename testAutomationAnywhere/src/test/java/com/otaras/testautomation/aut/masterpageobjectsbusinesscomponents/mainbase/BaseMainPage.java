package com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.mainbase;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.BasePage;
import com.otaras.testautomation.objectrepository.OR;

public class BaseMainPage  extends BasePage {
    @FindBy(xpath = OR.MainPage_LoginIcon)	
    public WebElement LoginIcon;
    
    public boolean Exists(){
    	//testElement.sendKeys("anil");
	    //return super.Exists(existemail); 
    	return super.Exists(LoginIcon); 
    	
	}
    
    
    public void clickLoginIcon() 
    {
    	try{
    		//this.waitAndClick(By.xpath(OR.MainPage_LoginIcon));
    		
//    		Capabilities cp = ((RemoteWebDriver) driver).getCapabilities();
//            if (cp.getBrowserName().equals("chrome")) {
//                try {
//                    ((JavascriptExecutor) driver).executeScript(
//                            "arguments[0].scrollIntoView(true);", webElement);
//                } catch (Exception e) {
//
//                }
//            }
//
//            webElement.click();
    		//Thread.sleep(100);
    		if (Exists(LoginIcon)==false)
    			throw new NoSuchElementException ("Element Not Found: "+LoginIcon.toString());
    		LoginIcon.click();
    	testReport.log(Status.PASS,SuccessFontColorPrefix+"Login Page - clickLoginIcon Successful - "+LoginIcon.toString()+SuccessFontColorSuffix);
    	
    	}
    	catch (Exception e)
    	{
    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Main Page - clickLoginIcon - unable to Click"+e+ErrorFontColorSuffix);
    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
    		throw new NoSuchElementException ("Element Not Found");
    	}
    }
    
}
