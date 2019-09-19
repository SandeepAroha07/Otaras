package com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.newentity.entity;
//package com.companyname.testautomation.aut.masterpageobjectsbusinesscomponents.newentity.entity;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.testng.annotations.Test;
//
//import com.aventstack.extentreports.Status;
//import com.companyname.testautomation.aut.masterpageobjectsbusinesscomponents.BasePage;
//import com.companyname.testautomation.objectrepository.OR;
//
//public class BaseClientContactsPage  extends BasePage{
//	
//	
//	   @FindBy(css = OR.ClientContactsPage_ClientContactsTab)	
//	    public WebElement ClientContactsTab;
//	   @FindBy(xpath = OR.ClientContactsPage_FirstName)	
//	    public WebElement FirstName;
//	   
//	   public boolean Exists(){
//	    	return super.Exists(FirstName); 
//	    	
//		}
//	   
//	   
//	   
//		//driver.findElement(By.cssSelector(".inactive-tab > a:nth-child(1)")).click();
//		
//		
//	    public void clickClientContactsTab() 
//	    {
//	    	try{
//	    		ClientContactsTab.click();
//	    		//driver.findElement(By.cssSelector(".inactive-tab > a:nth-child(1)")).click();
//	    	testReport.log(Status.PASS,SuccessFontColorPrefix+"Client Client Contacts Page - clickClientContactsTab Successful - "+ClientContactsTab.toString()+SuccessFontColorSuffix);
//	    	
//	    	}
//	    	catch (Exception e)
//	    	{
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"New Client Contacts Page - SelectFirmName - unable to select combobox value"+e+ErrorFontColorSuffix);
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//	    		throw new NoSuchElementException ("URL not launched");
//	    	}
//	    }
//	   
//}
