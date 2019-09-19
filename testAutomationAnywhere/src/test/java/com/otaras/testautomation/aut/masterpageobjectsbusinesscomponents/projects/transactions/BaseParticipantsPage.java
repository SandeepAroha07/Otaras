package com.otaras.testautomation.aut.masterpageobjectsbusinesscomponents.projects.transactions;
//package com.companyname.testautomation.aut.masterpageobjectsbusinesscomponents.projects.transactions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.testng.annotations.Test;
//
//import com.aventstack.extentreports.Status;
//import com.companyname.testautomation.aut.masterpageobjectsbusinesscomponents.BasePage;
//import com.companyname.testautomation.aut.testdatarec.TestDataRec;
//import com.companyname.testautomation.objectrepository.OR;
//
//public class BaseParticipantsPage  extends BasePage{
//
//	
//	   @FindBy(xpath = OR.ParticipantsPage_Add)	
//	    public WebElement Add;
//	   
//	   
//	   public boolean Exists(){
//	    	return super.Exists(Add); 	
//		}
//	   
//	   public void clickAdd() 
//	    {
//	    	try{
//	    		Add.click();
//	    		testReport.log(Status.PASS,SuccessFontColorPrefix+"Participants Page - clickAdd Successful - "+Add.toString()+SuccessFontColorSuffix);
//	    	}
//	    	catch (Exception e)
//	    	{
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Participants Page - clickAdd - unable to Click"+e+ErrorFontColorSuffix);
//	    		testReport.log(Status.FATAL,ErrorFontColorPrefix+"Error found at class: "+this.getClass().getName()+" Code line Number: "+new Exception().getStackTrace()[0].getLineNumber()+"!"+ErrorFontColorSuffix);
//	    		throw new NoSuchElementException ("clickAdd not clicked");
//	    	}
//	    }
//	
//	   
//}
