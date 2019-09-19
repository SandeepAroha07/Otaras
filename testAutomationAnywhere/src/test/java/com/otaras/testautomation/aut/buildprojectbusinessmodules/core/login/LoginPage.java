package com.otaras.testautomation.aut.buildprojectbusinessmodules.core.login;
//package com.companyname.testautomation.aut.buildprojectbusinessmodules.core.login;
//
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.Test;
//
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import com.companyname.testautomation.aut.buildprojectbusinessmodules.core.Pages;
//import com.companyname.testautomation.aut.masterpageobjectsbusinesscomponents.login.*;
//import com.companyname.testautomation.common.uielement.TestWebElement;
//import com.companyname.testautomation.common.uielement.fieldDecorator;
//import com.companyname.testautomation.objectrepository.OR;
//import com.companyname.testautomation.objectrepository.projectspecificor.ORclientA;
//
//
//public class LoginPage extends BaseLoginPage
//{
//	//private WebDriver driver;
//	//private ExtentTest testReport;
//	//Pages pages;
//	
//	public LoginPage(WebDriver driver,ExtentTest testReport)
//	{
//		 this.driver=driver;
//		 this.testReport=testReport;
//		 
//		 PageFactory.initElements(new fieldDecorator(driver,testReport), this);
//		 //PageFactory.initElements(driver, this);
//	}
//	
////	public LoginPage(Pages pages)
////	{
////		this.pages=pages;
////		pages.InvokeApplicationPage.launchApplication();
////	}
//	
////	String x=ORclientA.customloginPage_newCustemailAddress;
////	String y=ORclientA.homePage_signIn;
//	
//   // @FindBy(xpath = ORclientA.homePage_signIn)
//    //@CacheLookup
//    public WebElement newCustemailAddres1;
//    //public TestWebElement newCustemailAddres;
//    
//    
//    @FindBy(xpath = "//input[@id='email_create']")
//    public WebElement newCustemailAddres;
//    public void enter_newCustemailAddres() 
//    {
//    	try{
//    	//existemail.sendKeys("Test");;
//    		//Thread.sleep(1000);
//    	newCustemailAddres.sendKeys("Test");
//    	//Thread.sleep(1000);
//    	testReport.log(Status.PASS,SuccessFontColorPrefix+"Home Page - enter_newCustemailAddres Successful - "+newCustemailAddres.toString()+SuccessFontColorSuffix);
//    	}catch (Exception e)
//    	{
//    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Login Page - enter_newCustemailAddres failed - unable to Enter"+newCustemailAddres.toString()+e+ErrorFontColorSuffix);
//    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//    		throw new NoSuchElementException ("Element not editable");
//    	}
//    }
//	
//    
//    
//    
//    
//}
