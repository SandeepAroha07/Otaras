package com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.newentity.entity;
//package com.companyname.testautomation.aut.masterpageobjectsbusinesscomponents.newentity.entity;
//
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.testng.annotations.Test;
//
//import com.aventstack.extentreports.Status;
//import com.companyname.testautomation.aut.masterpageobjectsbusinesscomponents.BasePage;
//import com.companyname.testautomation.objectrepository.OR;
//
//public class BaseCreateEntitySelectionPage  extends BasePage{
//	  
//	   @FindBy(xpath = OR.CreateEntitySelectionPage_Client)	
//	    public WebElement Client;
//	   
//	   
//	
//	public boolean Exists(){
//	    	return super.Exists(Client); 	
//		}
//	
//
//
//
//public void SelectClient() 
//{
//	try{
//		Client.click();
//	testReport.log(Status.PASS,SuccessFontColorPrefix+"NewEntity- Client Page - SelectClient Successful - "+Client.toString()+SuccessFontColorSuffix);
//	
//	}
//	catch (Exception e)
//	{
//		testReport.log(Status.FATAL,ErrorFontColorPrefix+"NewEntity- Client Page - SelectClient - unable to Click"+e+ErrorFontColorSuffix);
//		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//		throw new NoSuchElementException ("URL not launched");
//	}
//}
//	
//}
