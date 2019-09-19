package com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.homebase;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.BasePage;
import com.otaras.testautomation.objectrepository.OR;

public class BaseHomePage  extends BasePage{

//    @FindBy(xpath = "//*[@id='search_query_topanil']")
//    public WebElement signIn1;
////    @FindBy(xpath = "//a[@rel='nofollow']")
////    public WebElement testElement1;
//    
//    @FindBy(xpath = OR.homePage_productSearchText)	
//    public WebElement productSearchText;
//    
//    @FindBy(xpath = OR.homePage_productSearchButton)	
//    public WebElement productSearchButton;
//
//    @FindBy(xpath = OR.homePage_signIn)	
//    //@FindBy(xpath = "//a[@class='login']")	
//    public WebElement signIn;
    
    @FindBy(xpath = OR.HomePage_SignOutIcon)	
    public WebElement SignOutIcon;
    @FindBy(xpath = OR.HomePage_MunivisorIcon)	
    public WebElement MunivisorIcon;
    
//    public boolean Exists(){
//    	//testElement.sendKeys("anil");
//	    return super.Exists(signIn); 
//	}
    
    public boolean Exists(){
	    return super.Exists(SignOutIcon); 
	}
    
//    public void clickSignIn() 
//    {
//    	try{
//    		//Thread.sleep(1000);
//    	signIn.click();
//    	testReport.log(Status.PASS,SuccessFontColorPrefix+"Home Page - clickSignIn Successful - "+signIn.toString()+SuccessFontColorSuffix);
//    	
//    	}catch (Exception e)
//    	{
//    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Home Page - clickSignIn failed - unable to Click"+signIn.toString()+e+ErrorFontColorSuffix);
//    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//    		throw new NoSuchElementException ("Element not clickable");
//    	}
//    	
//    }
    
    public void clickMunivisorHomeIcon() 
    {
    	try{
    		//Thread.sleep(1000);
    		Thread.sleep(6000);
    		Exists(MunivisorIcon);
    		MunivisorIcon.click();
    	testReport.log(Status.PASS,SuccessFontColorPrefix+"Home Page - clickSignIn Successful - "+MunivisorIcon.toString()+SuccessFontColorSuffix);
    	
    	}catch (Exception e)
    	{
    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Home Page - clickSignIn failed - unable to Click"+MunivisorIcon.toString()+e+ErrorFontColorSuffix);
    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
    		throw new NoSuchElementException ("Element not clickable");
    	}
    	
    }
    
}
